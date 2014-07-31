/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Unsigned_Int;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SByte Str Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class S_Byte_Str_SpecImpl extends MinimalEObjectImpl.Container implements S_Byte_Str_Spec
{
  /**
   * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound()
   * @generated
   * @ordered
   */
  protected Unsigned_Int bound;

  /**
   * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected static final String INITIAL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected String initialValue = INITIAL_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected S_Byte_Str_SpecImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StLanguagePackage.Literals.SBYTE_STR_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unsigned_Int getBound()
  {
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound(Unsigned_Int newBound, NotificationChain msgs)
  {
    Unsigned_Int oldBound = bound;
    bound = newBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.SBYTE_STR_SPEC__BOUND, oldBound, newBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBound(Unsigned_Int newBound)
  {
    if (newBound != bound)
    {
      NotificationChain msgs = null;
      if (bound != null)
        msgs = ((InternalEObject)bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.SBYTE_STR_SPEC__BOUND, null, msgs);
      if (newBound != null)
        msgs = ((InternalEObject)newBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.SBYTE_STR_SPEC__BOUND, null, msgs);
      msgs = basicSetBound(newBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.SBYTE_STR_SPEC__BOUND, newBound, newBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitialValue()
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialValue(String newInitialValue)
  {
    String oldInitialValue = initialValue;
    initialValue = newInitialValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.SBYTE_STR_SPEC__INITIAL_VALUE, oldInitialValue, initialValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StLanguagePackage.SBYTE_STR_SPEC__BOUND:
        return basicSetBound(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StLanguagePackage.SBYTE_STR_SPEC__BOUND:
        return getBound();
      case StLanguagePackage.SBYTE_STR_SPEC__INITIAL_VALUE:
        return getInitialValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StLanguagePackage.SBYTE_STR_SPEC__BOUND:
        setBound((Unsigned_Int)newValue);
        return;
      case StLanguagePackage.SBYTE_STR_SPEC__INITIAL_VALUE:
        setInitialValue((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StLanguagePackage.SBYTE_STR_SPEC__BOUND:
        setBound((Unsigned_Int)null);
        return;
      case StLanguagePackage.SBYTE_STR_SPEC__INITIAL_VALUE:
        setInitialValue(INITIAL_VALUE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StLanguagePackage.SBYTE_STR_SPEC__BOUND:
        return bound != null;
      case StLanguagePackage.SBYTE_STR_SPEC__INITIAL_VALUE:
        return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (initialValue: ");
    result.append(initialValue);
    result.append(')');
    return result.toString();
  }

} //S_Byte_Str_SpecImpl
