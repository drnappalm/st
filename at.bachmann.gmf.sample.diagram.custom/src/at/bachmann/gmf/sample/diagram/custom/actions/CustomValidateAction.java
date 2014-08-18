package at.bachmann.gmf.sample.diagram.custom.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import fb.diagram.part.ValidateAction;

public class CustomValidateAction extends ValidateAction implements
		IActionDelegate {

	public CustomValidateAction() {
		this(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage());
	}

	public CustomValidateAction(IWorkbenchPage page) {
		super(page);
	}

	@Override
	public void run(IAction action) {
		run();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// do nothing
	}

}
