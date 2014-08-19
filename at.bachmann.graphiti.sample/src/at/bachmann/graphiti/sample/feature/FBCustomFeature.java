package at.bachmann.graphiti.sample.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import fb.FB;

public class FBCustomFeature extends AbstractCustomFeature implements
		ICustomFeature {

	public FBCustomFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public void execute(ICustomContext context) {
		for (PictogramElement element : context.getPictogramElements()) {
			if (element instanceof ContainerShape) {
				element.getGraphicsAlgorithm().setWidth(
						element.getGraphicsAlgorithm().getWidth() * 2);
				layoutPictogramElement(element);
			}
		}
	}

	@Override
	public String getName() {
		return "Double Size";
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		Object businessObject = getBusinessObjectForPictogramElement(context
				.getInnerPictogramElement());

		return businessObject != null && businessObject instanceof FB;
	}

	@Override
	public String getImageId() {
		return "icons/size.png";
	}
}
