package at.bachmann.graphiti.sample.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import at.bachmann.graphiti.sample.Constants;
import fb.FB;
import fb.INVariable;
import fb.OUTVariable;
import fb.Variable;

public class VariableAddFeature extends AbstractAddShapeFeature {

	private static final IColorConstant E_CLASS_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant E_CLASS_FOREGROUND = new ColorConstant(98, 131, 167);
	private static final IColorConstant E_CLASS_BACKGROUND = new ColorConstant(187, 218, 247);

	public VariableAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if (context == null)
			return false;

		Object newObject = context.getNewObject();
		if (newObject == null)
			return false;

		ContainerShape target = context.getTargetContainer();
		if (target == null)
			return false;

		if (target instanceof Diagram) {
			return (newObject instanceof FB) || !((newObject instanceof INVariable) || (newObject instanceof OUTVariable));
		} else if (target instanceof FB) {
			return (newObject instanceof INVariable) || (newObject instanceof OUTVariable);
		}

		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Variable addedClass = (Variable) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);

		// define a default size for the shape
		int width = Constants.SHAPE_WIDTH;
		int height = Constants.SHAPE_HEIGTH_VARIABLE;
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle; // need to access it later

		// create and set graphics algorithm
		roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
		roundedRectangle.setForeground(manageColor(E_CLASS_FOREGROUND));
		roundedRectangle.setBackground(manageColor(E_CLASS_BACKGROUND));
		roundedRectangle.setLineWidth(2);
		/*
		 * WE DONT WANT TO ALLOW ADDING TO THE RIGHT:::JUST ALLOW A VERTICAL
		 * LAYOUT (more or less) so
		 */
		gaService.setLocationAndSize(roundedRectangle, 0, context.getY(), width, height);

		// if added Class has no resource we add it to the resource
		// of the diagram
		// in a real scenario the business model would have its own resource
		if (addedClass.eResource() == null) {
			getDiagram().eResource().getContents().add(addedClass);
		}
		// create link and wire it
		link(containerShape, addedClass);

		// SHAPE WITH TEXT
		// create shape for text
		Shape shape = peCreateService.createShape(containerShape, false);

		// create and set text graphics algorithm
		Text text = gaService.createText(shape, addedClass.getName());
		text.setForeground(manageColor(E_CLASS_TEXT_FOREGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);

		// vertical alignment has as default value "center"
		text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
		gaService.setLocationAndSize(text, 0, 0, width, 20);

		// create link and wire it
		link(shape, addedClass);

		// add a chopbox anchor to the shape
		BoxRelativeAnchor anchor = peCreateService.createBoxRelativeAnchor(containerShape);
		anchor.setRelativeWidth(0.55);
		anchor.setRelativeHeight(1.0);
		anchor.setReferencedGraphicsAlgorithm(roundedRectangle);

		RoundedRectangle anchorFigure = gaService.createRoundedRectangle(anchor, 4, 4);
		anchorFigure.setForeground(manageColor(E_CLASS_FOREGROUND));
		anchorFigure.setBackground(manageColor(E_CLASS_BACKGROUND));
		anchorFigure.setLineWidth(2);
		gaService.setLocationAndSize(anchorFigure, -10, -10, 10, 10);

		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	}
}
