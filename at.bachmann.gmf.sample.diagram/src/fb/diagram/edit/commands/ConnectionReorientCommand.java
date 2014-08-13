package fb.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import fb.Connection;
import fb.Variable;
import fb.diagram.edit.policies.FbBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Connection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Variable && newEnd instanceof Variable)) {
			return false;
		}
		Variable target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof fb.FB)) {
			return false;
		}
		fb.FB container = (fb.FB) getLink().eContainer();
		return FbBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Variable && newEnd instanceof Variable)) {
			return false;
		}
		Variable source = getLink().getSource();
		if (!(getLink().eContainer() instanceof fb.FB)) {
			return false;
		}
		fb.FB container = (fb.FB) getLink().eContainer();
		return FbBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Connection getLink() {
		return (Connection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Variable getOldSource() {
		return (Variable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Variable getNewSource() {
		return (Variable) newEnd;
	}

	/**
	 * @generated
	 */
	protected Variable getOldTarget() {
		return (Variable) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Variable getNewTarget() {
		return (Variable) newEnd;
	}
}
