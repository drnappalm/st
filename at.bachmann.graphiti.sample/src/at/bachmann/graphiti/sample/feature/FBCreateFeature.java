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
import fb.impl.FbFactoryImpl;

public class FBCreateFeature extends AbstractCreateFeature implements
		ICreateFeature {

	private static AtomicInteger count = new AtomicInteger(1);

	public FBCreateFeature(IFeatureProvider fp) {
		super(fp, "FB", "Create a new FB");
	}
    
	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		 
        // create EClass
        FB newClass = FbFactoryImpl.eINSTANCE.createFB();
        
        // Add model element to resource.
        // We add the model element to the resource of the diagram for
        // simplicity's sake. Normally, a customer would use its own
        // model persistence layer for storing the business model separately.
        getDiagram().eResource().getContents().add(newClass);
        newClass.setName("FB" + count.getAndIncrement());
 
        // do the add
        addGraphicalRepresentation(context, newClass);
 
        // return newly created business object(s)
        return new Object[] { newClass };
	}

}
