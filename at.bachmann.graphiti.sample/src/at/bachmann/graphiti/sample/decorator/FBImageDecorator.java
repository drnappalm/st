package at.bachmann.graphiti.sample.decorator;

import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.ImageDecorator;

public class FBImageDecorator extends ImageDecorator {

	public FBImageDecorator() {
		super(IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
		setMessage("This element must at least be part of one connection.");
	}

}
