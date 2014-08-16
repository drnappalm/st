package at.bachmann.graphiti.sample.feature;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import fb.FB;
import fb.FBDiagram;
import fb.Variable;
import fb.impl.FbFactoryImpl;

public class VariableCreateFeature extends AbstractCreateFeature implements
		ICreateFeature {

	private static AtomicInteger count = new AtomicInteger(1);

	public VariableCreateFeature(IFeatureProvider fp) {
		super(fp, "Diagram Variable", "Create a new Diagram Variable");
	}
    
	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		 
        // create EClass
        Variable newClass = FbFactoryImpl.eINSTANCE.createVariable();
        
        // Add model element to resource.
        // We add the model element to the resource of the diagram for
        // simplicity's sake. Normally, a customer would use its own
        // model persistence layer for storing the business model separately.
        getDiagram().eResource().getContents().add(newClass);
        newClass.setName("Variable" + count.getAndIncrement());
 
        // do the add
        addGraphicalRepresentation(context, newClass);
 
        // return newly created business object(s)
        return new Object[] { newClass };
	}

}
