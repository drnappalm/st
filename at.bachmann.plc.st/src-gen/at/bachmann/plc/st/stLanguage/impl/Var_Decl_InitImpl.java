/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Spec_Init;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Var_Decl_Init;
import at.bachmann.plc.st.stLanguage.Variable_List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Var_Decl_InitImpl extends Input_DeclImpl implements Var_Decl_Init
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected Variable_List variables;

  /**
   * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialization()
   * @generated
   * @ordered
   */
  protected Spec_Init initialization;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Var_Decl_InitImpl()
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
    return StLanguagePackage.Literals.VAR_DECL_INIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_List getVariables()
  {
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariables(Variable_List newVariables, NotificationChain msgs)
  {
    Variable_List oldVariables = variables;
    variables = newVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.VAR_DECL_INIT__VARIABLES, oldVariables, newVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariables(Variable_List newVariables)
  {
    if (newVariables != variables)
    {
      NotificationChain msgs = null;
      if (variables != null)
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.VAR_DECL_INIT__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.VAR_DECL_INIT__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.VAR_DECL_INIT__VARIABLES, newVariables, newVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spec_Init getInitialization()
  {
    return initialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialization(Spec_Init newInitialization, NotificationChain msgs)
  {
    Spec_Init oldInitialization = initialization;
    initialization = newInitialization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.VAR_DECL_INIT__INITIALIZATION, oldInitialization, newInitialization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialization(Spec_Init newInitialization)
  {
    if (newInitialization != initialization)
    {
      NotificationChain msgs = null;
      if (initialization != null)
        msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.VAR_DECL_INIT__INITIALIZATION, null, msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.VAR_DECL_INIT__INITIALIZATION, null, msgs);
      msgs = basicSetInitialization(newInitialization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.VAR_DECL_INIT__INITIALIZATION, newInitialization, newInitialization));
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
      case StLanguagePackage.VAR_DECL_INIT__VARIABLES:
        return basicSetVariables(null, msgs);
      case StLanguagePackage.VAR_DECL_INIT__INITIALIZATION:
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
      case StLanguagePackage.VAR_DECL_INIT__VARIABLES:
        return getVariables();
      case StLanguagePackage.VAR_DECL_INIT__INITIALIZATION:
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
      case StLanguagePackage.VAR_DECL_INIT__VARIABLES:
        setVariables((Variable_List)newValue);
        return;
      case StLanguagePackage.VAR_DECL_INIT__INITIALIZATION:
        setInitialization((Spec_Init)newValue);
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
      case StLanguagePackage.VAR_DECL_INIT__VARIABLES:
        setVariables((Variable_List)null);
        return;
      case StLanguagePackage.VAR_DECL_INIT__INITIALIZATION:
        setInitialization((Spec_Init)null);
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
      case StLanguagePackage.VAR_DECL_INIT__VARIABLES:
        return variables != null;
      case StLanguagePackage.VAR_DECL_INIT__INITIALIZATION:
        return initialization != null;
    }
    return super.eIsSet(featureID);
  }

} //Var_Decl_InitImpl
