package at.bachmann.plc.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class VariablesView extends ViewPart {

	public static final String VIEW_ID = "at.bachmann.plc.ui.variablesView";

	public VariablesView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		CTabFolder tabControl = new CTabFolder(parent, SWT.BORDER);

		CTabItem tabPage = new CTabItem(tabControl, SWT.BORDER);
		tabPage.setText("Local Variables");

		tabPage = new CTabItem(tabControl, SWT.BORDER);
		tabPage.setText("Global Variables");
	}

	@Override
	public void setFocus() {
	}
}
