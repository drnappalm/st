package fb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fb.diagram.edit.commands.INVariableCreateCommand;
import fb.diagram.edit.commands.OUTVariableCreateCommand;
import fb.diagram.providers.FbElementTypes;

/**
 * @generated
 */
public class FBVariablesCompartmentItemSemanticEditPolicy extends
		FbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FBVariablesCompartmentItemSemanticEditPolicy() {
		super(FbElementTypes.FB_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FbElementTypes.OUTVariable_3003 == req.getElementType()) {
			return getGEFWrapper(new OUTVariableCreateCommand(req));
		}
		if (FbElementTypes.INVariable_3002 == req.getElementType()) {
			return getGEFWrapper(new INVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
