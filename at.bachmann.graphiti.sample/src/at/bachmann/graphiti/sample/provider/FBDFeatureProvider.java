package at.bachmann.graphiti.sample.provider;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.features.impl.DefaultUpdateDiagramFeature;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import at.bachmann.graphiti.sample.feature.ConnectionAddFeature;
import at.bachmann.graphiti.sample.feature.ConnectionCreateFeature;
import at.bachmann.graphiti.sample.feature.FBAddFeature;
import at.bachmann.graphiti.sample.feature.FBCreateFeature;
import at.bachmann.graphiti.sample.feature.FBCustomFeature;
import at.bachmann.graphiti.sample.feature.FBLayoutFeature;
import at.bachmann.graphiti.sample.feature.FBMoveShapeFeature;
import at.bachmann.graphiti.sample.feature.FBUpdateFeature;
import at.bachmann.graphiti.sample.feature.VariableAddFeature;
import at.bachmann.graphiti.sample.feature.VariableCreateFeature;
import at.bachmann.graphiti.sample.feature.VariableLayoutFeature;
import at.bachmann.graphiti.sample.feature.VariableMoveShapeFeature;
import at.bachmann.graphiti.sample.feature.VariableUpdateFeature;
import fb.FB;
import fb.Variable;

public class FBDFeatureProvider extends DefaultFeatureProvider implements IFeatureProvider {

	public FBDFeatureProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context.getNewObject() instanceof FB) {
			return new FBAddFeature(this);
		} else if (context.getNewObject() instanceof Variable) {
			return new VariableAddFeature(this);
		} else if (context.getNewObject() instanceof fb.Connection) {
			return new ConnectionAddFeature(this);
		} else {
			return super.getAddFeature(context);
		}
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new FBCreateFeature(this), new VariableCreateFeature(this) };
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		Object businessObject = getBusinessObjectForPictogramElement(context.getPictogramElement());

		if (businessObject == null) {
			return new DefaultUpdateDiagramFeature(this);
		} else if (businessObject instanceof FB) {
			return new FBUpdateFeature(this);
		} else if (businessObject instanceof Variable) {
			return new VariableUpdateFeature(this);
		} else {
			return null;
		}
	}

	/*
	 * >
	 * 
	 * 
	 * 
	 * 
	 * NO NEED TO OVERRIDE THE GETREMOVE AND GETDELETE FEATURES AS THEY GET
	 * HANDLED IN A CORRECT WAY FOR THE BASIC FUNCTIONALITY BY THE DEFAULT
	 * IMPLEMENTATION
	 * 
	 * 
	 * 
	 * 
	 * 
	 * <
	 */

	/*
	 * >
	 * 
	 * 
	 * 
	 * 
	 * NO NEED TO OVERRIDE THE GETRESIZE FEATURE AS IT GETS HANDLED IN A CORRECT
	 * WAY FOR THE BASIC FUNCTIONALITY BY THE DEFAULT IMPLEMENTATION
	 * 
	 * 
	 * 
	 * 
	 * 
	 * <
	 */

	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Object businessObject = getBusinessObjectForPictogramElement(context.getPictogramElement());

		if (businessObject instanceof FB) {
			return new FBMoveShapeFeature(this);
		} else if (businessObject instanceof Variable) {
			return new VariableMoveShapeFeature(this);
		} else {
			return null;
		}
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		Object businessObject = getBusinessObjectForPictogramElement(context.getPictogramElement());

		if (businessObject instanceof FB) {
			return new FBLayoutFeature(this);
		} else if (businessObject instanceof Variable) {
			return new VariableLayoutFeature(this);
		} else {
			return null;
		}
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] { new FBCustomFeature(this) };
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] { new ConnectionCreateFeature(this, "Connection", "Connection") };
	}

	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		return getCreateConnectionFeatures();
	}
}
