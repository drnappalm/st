package fb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import fb.diagram.edit.parts.INVariableEditPart;
import fb.diagram.edit.parts.OUTVariableEditPart;
import fb.diagram.edit.parts.VariableEditPart;
import fb.diagram.providers.FbElementTypes;
import fb.diagram.providers.FbModelingAssistantProvider;

/**
 * @generated
 */
public class FbModelingAssistantProviderOfVariableEditPart extends
		FbModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((VariableEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(VariableEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FbElementTypes.Connection_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(VariableEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			VariableEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof VariableEditPart) {
			types.add(FbElementTypes.Connection_4001);
		}
		if (targetEditPart instanceof OUTVariableEditPart) {
			types.add(FbElementTypes.Connection_4001);
		}
		if (targetEditPart instanceof INVariableEditPart) {
			types.add(FbElementTypes.Connection_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((VariableEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(VariableEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FbElementTypes.Connection_4001) {
			types.add(FbElementTypes.Variable_2002);
			types.add(FbElementTypes.OUTVariable_3003);
			types.add(FbElementTypes.INVariable_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((VariableEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(VariableEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FbElementTypes.Connection_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((VariableEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(VariableEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FbElementTypes.Connection_4001) {
			types.add(FbElementTypes.Variable_2002);
			types.add(FbElementTypes.OUTVariable_3003);
			types.add(FbElementTypes.INVariable_3002);
		}
		return types;
	}

}
