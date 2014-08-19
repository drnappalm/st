package at.bachmann.graphiti.sample.feature;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import fb.FB;
import fb.FbFactory;

public class ConnectionCreateFeature extends AbstractCreateConnectionFeature
		implements ICreateConnectionFeature {

	public ConnectionCreateFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		Object source = getBusinessObject(context.getSourceAnchor());
		Object target = getBusinessObject(context.getTargetAnchor());
		if (source != null && target != null && source != target) {
			return true;
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		// get EClasses which should be connected
		Object source = getBusinessObject(context.getSourceAnchor());
		Object target = getBusinessObject(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			fb.Connection connection = FbFactory.eINSTANCE.createConnection();
			if (source instanceof FB) {
				((FB) source).getConnections().add(connection);
			} else {
				((FB) target).getConnections().add(connection);
			}

			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(connection);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
		}

		return newConnection;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		if (getBusinessObject(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	private Object getBusinessObject(Anchor anchor) {
		if (anchor != null) {
			return getBusinessObjectForPictogramElement(anchor.getParent());
		}
		return null;
	}
}
