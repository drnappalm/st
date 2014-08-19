package at.bachmann.graphiti.sample.feature;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import at.bachmann.graphiti.sample.Constants;
import fb.FB;

public class FBLayoutFeature extends AbstractLayoutFeature implements
		ILayoutFeature {

	public FBLayoutFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		if (!(context.getPictogramElement() instanceof ContainerShape))
			return false;

		Object businessObject = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return businessObject != null && businessObject instanceof FB;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		boolean layouted = false;

		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

		containerGa.setX(0);
		/*
		 * DONT CHANGE THE HEIGHT
		 */
		if (containerGa.getHeight() != Constants.SHAPE_HEIGTH) {
			containerGa.setHeight(Constants.SHAPE_HEIGTH);
			layouted = true;
		}

		/*
		 * ONLY ALLOW QUANTIFIED CHANGES
		 */
		if (containerGa.getWidth() < Constants.SHAPE_WIDTH) {
			containerGa.setWidth(Constants.SHAPE_WIDTH);
			layouted = true;
		} else {
			int newVal = Math.round(containerGa.getWidth()
					/ Constants.SHAPE_WIDTH)
					* Constants.SHAPE_WIDTH;
			containerGa.setWidth(newVal);
			layouted = true;
		}

		int containerWidth = containerGa.getWidth();
		for (Shape shape : containerShape.getChildren()) {
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IGaService gaService = Graphiti.getGaService();
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			if (containerWidth != size.getWidth()) {
				if (graphicsAlgorithm instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(1);
					Point newSecondPoint = gaService.createPoint(
							containerWidth, secondPoint.getY());
					polyline.getPoints().set(1, newSecondPoint);
					layouted = true;
				} else {
					gaService.setWidth(graphicsAlgorithm, containerWidth);
					layouted = true;
				}
			}
		}

		return layouted;
	}
}
