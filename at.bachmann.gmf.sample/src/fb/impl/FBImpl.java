/**
 */
package fb.impl;

import fb.FB;
import fb.FbPackage;
import fb.Variable;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fb.impl.FBImpl#getName <em>Name</em>}</li>
 *   <li>{@link fb.impl.FBImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link fb.impl.FBImpl#getX <em>X</em>}</li>
 *   <li>{@link fb.impl.FBImpl#getY <em>Y</em>}</li>
 *   <li>{@link fb.impl.FBImpl#getFbsTo <em>Fbs To</em>}</li>
 *   <li>{@link fb.impl.FBImpl#getFbsFrom <em>Fbs From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FBImpl extends MinimalEObjectImpl.Container implements FB {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected Variable variables;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFbsTo() <em>Fbs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbsTo()
	 * @generated
	 * @ordered
	 */
	protected FB fbsTo;

	/**
	 * The cached value of the '{@link #getFbsFrom() <em>Fbs From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbsFrom()
	 * @generated
	 * @ordered
	 */
	protected FB fbsFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FbPackage.Literals.FB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbPackage.FB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariables() {
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariables(Variable newVariables, NotificationChain msgs) {
		Variable oldVariables = variables;
		variables = newVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FbPackage.FB__VARIABLES, oldVariables, newVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbPackage.FB__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbPackage.FB__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FB getFbsTo() {
		if (fbsTo != null && fbsTo.eIsProxy()) {
			InternalEObject oldFbsTo = (InternalEObject)fbsTo;
			fbsTo = (FB)eResolveProxy(oldFbsTo);
			if (fbsTo != oldFbsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FbPackage.FB__FBS_TO, oldFbsTo, fbsTo));
			}
		}
		return fbsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FB basicGetFbsTo() {
		return fbsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFbsTo(FB newFbsTo, NotificationChain msgs) {
		FB oldFbsTo = fbsTo;
		fbsTo = newFbsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FbPackage.FB__FBS_TO, oldFbsTo, newFbsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FB getFbsFrom() {
		if (fbsFrom != null && fbsFrom.eIsProxy()) {
			InternalEObject oldFbsFrom = (InternalEObject)fbsFrom;
			fbsFrom = (FB)eResolveProxy(oldFbsFrom);
			if (fbsFrom != oldFbsFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FbPackage.FB__FBS_FROM, oldFbsFrom, fbsFrom));
			}
		}
		return fbsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FB basicGetFbsFrom() {
		return fbsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFbsFrom(FB newFbsFrom, NotificationChain msgs) {
		FB oldFbsFrom = fbsFrom;
		fbsFrom = newFbsFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FbPackage.FB__FBS_FROM, oldFbsFrom, newFbsFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addVariable(Variable variable) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeVariable(Variable variable) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFbTo(FB fb) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFbFrom(FB fb) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFbTo(FB fb) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFbFrom(FB fb) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FbPackage.FB__FBS_TO:
				if (fbsTo != null)
					msgs = ((InternalEObject)fbsTo).eInverseRemove(this, FbPackage.FB__FBS_FROM, FB.class, msgs);
				return basicSetFbsTo((FB)otherEnd, msgs);
			case FbPackage.FB__FBS_FROM:
				if (fbsFrom != null)
					msgs = ((InternalEObject)fbsFrom).eInverseRemove(this, FbPackage.FB__FBS_TO, FB.class, msgs);
				return basicSetFbsFrom((FB)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FbPackage.FB__VARIABLES:
				return basicSetVariables(null, msgs);
			case FbPackage.FB__FBS_TO:
				return basicSetFbsTo(null, msgs);
			case FbPackage.FB__FBS_FROM:
				return basicSetFbsFrom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FbPackage.FB__NAME:
				return getName();
			case FbPackage.FB__VARIABLES:
				return getVariables();
			case FbPackage.FB__X:
				return getX();
			case FbPackage.FB__Y:
				return getY();
			case FbPackage.FB__FBS_TO:
				if (resolve) return getFbsTo();
				return basicGetFbsTo();
			case FbPackage.FB__FBS_FROM:
				if (resolve) return getFbsFrom();
				return basicGetFbsFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FbPackage.FB__NAME:
				setName((String)newValue);
				return;
			case FbPackage.FB__X:
				setX((Integer)newValue);
				return;
			case FbPackage.FB__Y:
				setY((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FbPackage.FB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FbPackage.FB__X:
				setX(X_EDEFAULT);
				return;
			case FbPackage.FB__Y:
				setY(Y_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FbPackage.FB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FbPackage.FB__VARIABLES:
				return variables != null;
			case FbPackage.FB__X:
				return x != X_EDEFAULT;
			case FbPackage.FB__Y:
				return y != Y_EDEFAULT;
			case FbPackage.FB__FBS_TO:
				return fbsTo != null;
			case FbPackage.FB__FBS_FROM:
				return fbsFrom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FbPackage.FB___ADD_VARIABLE__VARIABLE:
				addVariable((Variable)arguments.get(0));
				return null;
			case FbPackage.FB___REMOVE_VARIABLE__VARIABLE:
				removeVariable((Variable)arguments.get(0));
				return null;
			case FbPackage.FB___ADD_FB_TO__FB:
				addFbTo((FB)arguments.get(0));
				return null;
			case FbPackage.FB___ADD_FB_FROM__FB:
				addFbFrom((FB)arguments.get(0));
				return null;
			case FbPackage.FB___REMOVE_FB_TO__FB:
				removeFbTo((FB)arguments.get(0));
				return null;
			case FbPackage.FB___REMOVE_FB_FROM__FB:
				removeFbFrom((FB)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //FBImpl
