package at.bachmann.graphiti.sample.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class FBDDiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {

	private IToolBehaviorProvider[] providers = null;

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

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (providers == null) {
			List<IToolBehaviorProvider> tmpProviders = new ArrayList<>();

			// tmpProviders.addAll(Arrays.asList(super.getAvailableToolBehaviorProviders()));
			tmpProviders.add(new ValidationDecoratorBehaviorProvider(this));
			providers = tmpProviders.toArray(new IToolBehaviorProvider[0]);
		}

		return providers;
	}
}
