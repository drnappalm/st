package at.bachmann.graphiti.sample.provider;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IPrintFeature;
import org.eclipse.graphiti.features.ISaveImageFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.impl.AbstractFeatureProvider;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import fb.FB;
import fb.Variable;
import at.bachmann.graphiti.sample.feature.FBAddFeature;
import at.bachmann.graphiti.sample.feature.FBCreateFeature;
import at.bachmann.graphiti.sample.feature.VariableAddFeature;
import at.bachmann.graphiti.sample.feature.VariableCreateFeature;

public class FBDFeatureProvider extends DefaultFeatureProvider implements
		IFeatureProvider {

	public FBDFeatureProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if(context.getNewObject() instanceof FB) {
			return new FBAddFeature(this);
		} else if(context.getNewObject() instanceof Variable) {
			return new VariableAddFeature(this);
		} else {
			return super.getAddFeature(context);
		}
	}
	
	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new FBCreateFeature(this), new VariableCreateFeature(this) };
	}
}
