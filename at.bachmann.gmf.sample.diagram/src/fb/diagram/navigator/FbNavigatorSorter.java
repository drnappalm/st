package fb.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import fb.diagram.part.FbVisualIDRegistry;

/**
 * @generated
 */
public class FbNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FbNavigatorItem) {
			FbNavigatorItem item = (FbNavigatorItem) element;
			return FbVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
