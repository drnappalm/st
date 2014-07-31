/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Loc_Var_Decl;
import at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init;
import at.bachmann.plc.st.stLanguage.Located_At;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loc Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Loc_Var_DeclImpl extends MinimalEObjectImpl.Container implements Loc_Var_Decl
{
  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Located_At location;

  /**
   * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialization()
   * @generated
   * @ordered
   */
  protected Loc_Var_Spec_Init initialization;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Loc_Var_DeclImpl()
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
    return StLanguagePackage.Literals.LOC_VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(String newVariable)
  {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.LOC_VAR_DECL__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Located_At getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(Located_At newLocation, NotificationChain msgs)
  {
    Located_At oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.LOC_VAR_DECL__LOCATION, oldLocation, newLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(Located_At newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.LOC_VAR_DECL__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.LOC_VAR_DECL__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.LOC_VAR_DECL__LOCATION, newLocation, newLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loc_Var_Spec_Init getInitialization()
  {
    return initialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialization(Loc_Var_Spec_Init newInitialization, NotificationChain msgs)
  {
    Loc_Var_Spec_Init oldInitialization = initialization;
    initialization = newInitialization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.LOC_VAR_DECL__INITIALIZATION, oldInitialization, newInitialization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialization(Loc_Var_Spec_Init newInitialization)
  {
    if (newInitialization != initialization)
    {
      NotificationChain msgs = null;
      if (initialization != null)
        msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.LOC_VAR_DECL__INITIALIZATION, null, msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.LOC_VAR_DECL__INITIALIZATION, null, msgs);
      msgs = basicSetInitialization(newInitialization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.LOC_VAR_DECL__INITIALIZATION, newInitialization, newInitialization));
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
      case StLanguagePackage.LOC_VAR_DECL__LOCATION:
        return basicSetLocation(null, msgs);
      case StLanguagePackage.LOC_VAR_DECL__INITIALIZATION:
        return basicSetInitialization(null, msgs);
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
      case StLanguagePackage.LOC_VAR_DECL__VARIABLE:
        return getVariable();
      case StLanguagePackage.LOC_VAR_DECL__LOCATION:
        return getLocation();
      case StLanguagePackage.LOC_VAR_DECL__INITIALIZATION:
        return getInitialization();
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
      case StLanguagePackage.LOC_VAR_DECL__VARIABLE:
        setVariable((String)newValue);
        return;
      case StLanguagePackage.LOC_VAR_DECL__LOCATION:
        setLocation((Located_At)newValue);
        return;
      case StLanguagePackage.LOC_VAR_DECL__INITIALIZATION:
        setInitialization((Loc_Var_Spec_Init)newValue);
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
      case StLanguagePackage.LOC_VAR_DECL__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case StLanguagePackage.LOC_VAR_DECL__LOCATION:
        setLocation((Located_At)null);
        return;
      case StLanguagePackage.LOC_VAR_DECL__INITIALIZATION:
        setInitialization((Loc_Var_Spec_Init)null);
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
      case StLanguagePackage.LOC_VAR_DECL__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case StLanguagePackage.LOC_VAR_DECL__LOCATION:
        return location != null;
      case StLanguagePackage.LOC_VAR_DECL__INITIALIZATION:
        return initialization != null;
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
    result.append(" (variable: ");
    result.append(variable);
    result.append(')');
    return result.toString();
  }

} //Loc_Var_DeclImpl
