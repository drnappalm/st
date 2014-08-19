package at.bachmann.graphiti.sample.provider;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

import at.bachmann.graphiti.sample.decorator.FBBorderDecorator;
import at.bachmann.graphiti.sample.decorator.FBImageDecorator;
import fb.FB;

public class ValidationDecoratorBehaviorProvider extends DefaultToolBehaviorProvider implements IToolBehaviorProvider {
	public ValidationDecoratorBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
		Object businessObject = getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(pe);

		if (businessObject == null || !(businessObject instanceof FB))
			return new IDecorator[0];

		FB fb = (FB) businessObject;

		if (fb.getConnections().size() < 1) {
			return new IDecorator[] { new FBImageDecorator(), new FBBorderDecorator() };
		} else {
			return new IDecorator[0];
		}
	}
}
