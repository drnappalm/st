package at.bachmann.graphiti.sample.provider;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.platform.IDiagramBehavior;

public class FBDDiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {

	public FBDDiagramTypeProvider() {
		setFeatureProvider(new FBDFeatureProvider(this));
	}
	
	@Override
	public boolean isAutoUpdateAtReset() {
		return true;
	}
	
	@Override
	public boolean isAutoUpdateAtRuntimeWhenEditorIsSaved() {
		return true;
	}
	
	@Override
	public boolean isAutoUpdateAtRuntime() {
		return true;
	}
	
	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}
}
