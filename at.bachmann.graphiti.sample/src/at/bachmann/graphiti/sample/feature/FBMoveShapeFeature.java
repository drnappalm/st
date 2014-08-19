package at.bachmann.graphiti.sample.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.impl.LocationContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

public class FBMoveShapeFeature extends DefaultMoveShapeFeature {

	public FBMoveShapeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		/*
		 * WE DONT WANT TO ALLOW ADDING TO THE RIGHT:::JUST ALLOW A VERTICAL
		 * LAYOUT (more or less)
		 */
		((LocationContext) context).setLocation(0, context.getY());

		return super.canMoveShape(context);
	}
}
