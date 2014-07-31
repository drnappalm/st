/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Global_Var_Decl;
import at.bachmann.plc.st.stLanguage.Global_Var_Spec;
import at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Global_Var_DeclImpl extends MinimalEObjectImpl.Container implements Global_Var_Decl
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Global_Var_Spec type;

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
  protected Global_Var_DeclImpl()
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
    return StLanguagePackage.Literals.GLOBAL_VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global_Var_Spec getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Global_Var_Spec newType, NotificationChain msgs)
  {
    Global_Var_Spec oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.GLOBAL_VAR_DECL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Global_Var_Spec newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.GLOBAL_VAR_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.GLOBAL_VAR_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.GLOBAL_VAR_DECL__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION, oldInitialization, newInitialization);
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
        msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION, null, msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION, null, msgs);
      msgs = basicSetInitialization(newInitialization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION, newInitialization, newInitialization));
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
      case StLanguagePackage.GLOBAL_VAR_DECL__TYPE:
        return basicSetType(null, msgs);
      case StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION:
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
      case StLanguagePackage.GLOBAL_VAR_DECL__TYPE:
        return getType();
      case StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION:
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
      case StLanguagePackage.GLOBAL_VAR_DECL__TYPE:
        setType((Global_Var_Spec)newValue);
        return;
      case StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION:
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
      case StLanguagePackage.GLOBAL_VAR_DECL__TYPE:
        setType((Global_Var_Spec)null);
        return;
      case StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION:
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
      case StLanguagePackage.GLOBAL_VAR_DECL__TYPE:
        return type != null;
      case StLanguagePackage.GLOBAL_VAR_DECL__INITIALIZATION:
        return initialization != null;
    }
    return super.eIsSet(featureID);
  }

} //Global_Var_DeclImpl
