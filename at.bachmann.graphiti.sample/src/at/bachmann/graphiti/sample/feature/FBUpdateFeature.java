package at.bachmann.graphiti.sample.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.DefaultUpdateDiagramFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import fb.FB;

public class FBUpdateFeature extends DefaultUpdateDiagramFeature implements
		IUpdateFeature {

	public FBUpdateFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canUpdate(IUpdateContext context) {
		return getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof FB;
	}
	
	@Override
	public IReason updateNeeded(IUpdateContext context) {
		FB businessObject = (FB) getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		// retrieve name from pictogram model
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (Shape shape : cs.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    pictogramName = text.getValue();
                }
            }
        }
        
		boolean outOfDate = pictogramName == null && businessObject.getName() != null || !pictogramName.equals(businessObject.getName());
		if (outOfDate) {
			return Reason.createTrueReason("The value is out of date. Please udpate the diagram");
		} else {
			return Reason.createFalseReason();
		}
	}
	
	@Override
	public boolean update(IUpdateContext context) {
		FB businessObject = (FB) getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		// retrieve name from pictogram model
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (Shape shape : cs.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    text.setValue(businessObject.getName());
                    return true;
                }
            }
        }
        
        return false;
	}
}
