package at.bachmann.plc.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import at.bachmann.plc.ui.views.VariablesView;

public class PlcPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.addView(IPageLayout.ID_PROJECT_EXPLORER, IPageLayout.LEFT, 0.25f, editorArea);
		layout.addView(VariablesView.VIEW_ID, IPageLayout.TOP, 0.15f, editorArea);
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.66f, editorArea);
		bottom.addPlaceholder(IPageLayout.ID_PROBLEM_VIEW);
		layout.addView(IPageLayout.ID_PROBLEM_VIEW, IPageLayout.BOTTOM, 0.20f, editorArea);
		layout.addActionSet("");
	}
}
