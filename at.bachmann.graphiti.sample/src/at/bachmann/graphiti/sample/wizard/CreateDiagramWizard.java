package at.bachmann.graphiti.sample.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import at.bachmann.gmf.sample.Activator;
import at.bachmann.graphiti.sample.FileService;

/**
 * The Class CreateDiagramWizard.
 */
public class CreateDiagramWizard extends BasicNewResourceWizard {

	private static final String PAGE_NAME_DIAGRAM_NAME = "Diagram name";
	private static final String WIZARD_WINDOW_TITLE = "New FB Diagram (graphiti)";

	private Diagram diagram;

	@Override
	public void addPages() {
		super.addPages();
		addPage(new FBNewDiagramNameWizardPage(PAGE_NAME_DIAGRAM_NAME));
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle(WIZARD_WINDOW_TITLE);
	}

	@Override
	public boolean performFinish() {
		final String diagramTypeId = "at.bachmann.graphiti.sample.diagramtype.fbd";

		FBNewDiagramNameWizardPage namePage = (FBNewDiagramNameWizardPage) getPage(PAGE_NAME_DIAGRAM_NAME);
		final String diagramName = namePage.getText();

		IProject project = null;
		IFolder diagramFolder = null;

		Object element = getSelection().getFirstElement();
		if (element instanceof IProject) {
			project = (IProject) element;
		} else if (element instanceof IFolder) {
			diagramFolder = (IFolder) element;
			project = diagramFolder.getProject();
		} else if (element instanceof IAdaptable) {
			project = (IProject) ((IAdaptable) element)
					.getAdapter(IProject.class);
		}

		if (project == null || !project.isAccessible()) {
			String error = "No project found";
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					error);
			ErrorDialog.openError(getShell(), error, null, status);
			return false;
		}

		Diagram diagram = Graphiti.getPeCreateService().createDiagram(
				diagramTypeId, diagramName, true);
		if (diagramFolder == null) {
			diagramFolder = project.getFolder("src/diagrams/"); //$NON-NLS-1$
		}

		String editorID = DiagramEditor.DIAGRAM_EDITOR_ID;
		String editorExtension = "gfbd"; //$NON-NLS-1$
		String diagramTypeProviderId = "at.bachmann.graphiti.sample.fbdiagrameditor";
		String namingConventionID = diagramTypeProviderId + ".editor"; //$NON-NLS-1$
		IEditorDescriptor specificEditor = PlatformUI.getWorkbench()
				.getEditorRegistry().findEditor(namingConventionID);

		// If there is a specific editor get the file extension
		if (specificEditor != null) {
			editorID = namingConventionID;
			IExtensionRegistry extensionRegistry = Platform
					.getExtensionRegistry();
			IExtensionPoint extensionPoint = extensionRegistry
					.getExtensionPoint("org.eclipse.ui.editors"); //$NON-NLS-1$
			IExtension[] extensions = extensionPoint.getExtensions();
			for (IExtension ext : extensions) {
				IConfigurationElement[] configurationElements = ext
						.getConfigurationElements();
				for (IConfigurationElement ce : configurationElements) {
					String id = ce.getAttribute("id"); //$NON-NLS-1$
					if (editorID.equals(id)) {
						String fileExt = ce.getAttribute("extensions"); //$NON-NLS-1$
						if (fileExt != null) {
							editorExtension = fileExt;
							break;
						}
					}

				}
			}
		}

		IFile diagramFile = diagramFolder.getFile(diagramName
				+ "." + editorExtension); //$NON-NLS-1$
		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath()
				.toString(), true);

		FileService.createEmfFileForDiagram(uri, diagram);
		String providerId = GraphitiUi.getExtensionManager()
				.getDiagramTypeProviderId(diagram.getDiagramTypeId());
		DiagramEditorInput editorInput = new DiagramEditorInput(
				EcoreUtil.getURI(diagram), providerId);

		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage().openEditor(editorInput, editorID);
		} catch (PartInitException e) {
			String error = "Error opening editor";
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					error, e);
			ErrorDialog.openError(getShell(), error, null, status);
			return false;
		}

		return true;
	}

	public Diagram getDiagram() {
		return diagram;
	}
}
