package at.bachmann.graphiti.sample.decorator;

import org.eclipse.graphiti.tb.BorderDecorator;
import org.eclipse.graphiti.util.IColorConstant;

public class FBBorderDecorator extends BorderDecorator {
	@Override
	public IColorConstant getBorderColor() {
		return IColorConstant.RED;
	}
}
