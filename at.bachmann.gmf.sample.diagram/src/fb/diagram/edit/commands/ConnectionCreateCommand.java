package fb.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import fb.Connection;
import fb.FbFactory;
import fb.INVariable;
import fb.OUTVariable;
import fb.Variable;
import fb.diagram.edit.policies.FbBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConnectionCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated NOT
	 */
	private fb.FB container;

	/**
	 * @generated
	 */
	public ConnectionCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		boolean result = false;

		if (source == null && target == null) {
			result = false;
		}
		if (source != null && !isValidSource(source)) {
			result = false;
		}
		if (target != null && !isValidTarget(target)) {
			result = false;
		}
		if (source != null && target != null
				&& !areConnectionEndsOk(source, target)) {
			result = false;
		}
		if (getSource() == null) {
			result = true; // link creation is in progress; source is not
							// defined
							// yet
		}

		if (!result) {
			// target may be null here but it's possible to check constraint
			if (getContainer() == null) {
				if (isValidSource(source)) {
					if (target != null) {
						// invert the container
						container = deduceContainer(target, source);
					} else {
						result = false;
					}
				} else {
					result = false;
				}
			}
			result = FbBaseItemSemanticEditPolicy.getLinkConstraints()
					.canCreateConnection_4001(getContainer(), getSource(),
							getTarget());
		}

		return result;
	}

	// at least one should be a FB
	private boolean areConnectionEndsOk(EObject source, EObject target) {
		return source instanceof OUTVariable || target instanceof INVariable;
	}

	private boolean isValidSource(EObject source) {
		return (source != null)
				&& (source instanceof Variable || source instanceof OUTVariable);
	}

	private boolean isValidTarget(EObject target) {
		return (target != null)
				&& (target instanceof Variable || target instanceof INVariable);
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		Connection newElement = FbFactory.eINSTANCE.createConnection();
		getContainer().getConnections().add(newElement);
		newElement.setSource(getSource());
		newElement.setTarget(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(Connection newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE,
				getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET,
				getTarget());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected Variable getSource() {
		return (Variable) source;
	}

	/**
	 * @generated
	 */
	protected Variable getTarget() {
		return (Variable) target;
	}

	/**
	 * @generated
	 */
	public fb.FB getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance
	 * of container. Modify with appropriate logic.
	 * 
	 * @generated
	 */
	private static fb.FB deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof fb.FB) {
				return (fb.FB) element;
			}
		}
		return null;
	}

}
