/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Func_Body;
import at.bachmann.plc.st.stLanguage.Func_Var_Decls;
import at.bachmann.plc.st.stLanguage.IO_Var_Decls;
import at.bachmann.plc.st.stLanguage.Method;
import at.bachmann.plc.st.stLanguage.Method_Decl;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Temp_Var_Decls;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getIos <em>Ios</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getTemps <em>Temps</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Method_DeclImpl extends MinimalEObjectImpl.Container implements Method_Decl
{
  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final String ACCESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected String access = ACCESS_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected static final boolean OVERRIDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected boolean override = OVERRIDE_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Method name;

  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIos() <em>Ios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIos()
   * @generated
   * @ordered
   */
  protected EList<IO_Var_Decls> ios;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Func_Var_Decls> variables;

  /**
   * The cached value of the '{@link #getTemps() <em>Temps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemps()
   * @generated
   * @ordered
   */
  protected EList<Temp_Var_Decls> temps;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Func_Body body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Method_DeclImpl()
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
    return StLanguagePackage.Literals.METHOD_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccess()
  {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(String newAccess)
  {
    String oldAccess = access;
    access = newAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__ACCESS, oldAccess, access));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOverride()
  {
    return override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverride(boolean newOverride)
  {
    boolean oldOverride = override;
    override = newOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__OVERRIDE, oldOverride, override));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Method newName, NotificationChain msgs)
  {
    Method oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Method newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.METHOD_DECL__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.METHOD_DECL__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(String newReturnType)
  {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IO_Var_Decls> getIos()
  {
    if (ios == null)
    {
      ios = new EObjectContainmentEList<IO_Var_Decls>(IO_Var_Decls.class, this, StLanguagePackage.METHOD_DECL__IOS);
    }
    return ios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Func_Var_Decls> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Func_Var_Decls>(Func_Var_Decls.class, this, StLanguagePackage.METHOD_DECL__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Temp_Var_Decls> getTemps()
  {
    if (temps == null)
    {
      temps = new EObjectContainmentEList<Temp_Var_Decls>(Temp_Var_Decls.class, this, StLanguagePackage.METHOD_DECL__TEMPS);
    }
    return temps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Func_Body getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Func_Body newBody, NotificationChain msgs)
  {
    Func_Body oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Func_Body newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.METHOD_DECL__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.METHOD_DECL__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.METHOD_DECL__BODY, newBody, newBody));
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
      case StLanguagePackage.METHOD_DECL__NAME:
        return basicSetName(null, msgs);
      case StLanguagePackage.METHOD_DECL__IOS:
        return ((InternalEList<?>)getIos()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.METHOD_DECL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.METHOD_DECL__TEMPS:
        return ((InternalEList<?>)getTemps()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.METHOD_DECL__BODY:
        return basicSetBody(null, msgs);
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
      case StLanguagePackage.METHOD_DECL__ACCESS:
        return getAccess();
      case StLanguagePackage.METHOD_DECL__TYPE:
        return getType();
      case StLanguagePackage.METHOD_DECL__OVERRIDE:
        return isOverride();
      case StLanguagePackage.METHOD_DECL__NAME:
        return getName();
      case StLanguagePackage.METHOD_DECL__RETURN_TYPE:
        return getReturnType();
      case StLanguagePackage.METHOD_DECL__IOS:
        return getIos();
      case StLanguagePackage.METHOD_DECL__VARIABLES:
        return getVariables();
      case StLanguagePackage.METHOD_DECL__TEMPS:
        return getTemps();
      case StLanguagePackage.METHOD_DECL__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StLanguagePackage.METHOD_DECL__ACCESS:
        setAccess((String)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__TYPE:
        setType((String)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__OVERRIDE:
        setOverride((Boolean)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__NAME:
        setName((Method)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__RETURN_TYPE:
        setReturnType((String)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__IOS:
        getIos().clear();
        getIos().addAll((Collection<? extends IO_Var_Decls>)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Func_Var_Decls>)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__TEMPS:
        getTemps().clear();
        getTemps().addAll((Collection<? extends Temp_Var_Decls>)newValue);
        return;
      case StLanguagePackage.METHOD_DECL__BODY:
        setBody((Func_Body)newValue);
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
      case StLanguagePackage.METHOD_DECL__ACCESS:
        setAccess(ACCESS_EDEFAULT);
        return;
      case StLanguagePackage.METHOD_DECL__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case StLanguagePackage.METHOD_DECL__OVERRIDE:
        setOverride(OVERRIDE_EDEFAULT);
        return;
      case StLanguagePackage.METHOD_DECL__NAME:
        setName((Method)null);
        return;
      case StLanguagePackage.METHOD_DECL__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case StLanguagePackage.METHOD_DECL__IOS:
        getIos().clear();
        return;
      case StLanguagePackage.METHOD_DECL__VARIABLES:
        getVariables().clear();
        return;
      case StLanguagePackage.METHOD_DECL__TEMPS:
        getTemps().clear();
        return;
      case StLanguagePackage.METHOD_DECL__BODY:
        setBody((Func_Body)null);
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
      case StLanguagePackage.METHOD_DECL__ACCESS:
        return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
      case StLanguagePackage.METHOD_DECL__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case StLanguagePackage.METHOD_DECL__OVERRIDE:
        return override != OVERRIDE_EDEFAULT;
      case StLanguagePackage.METHOD_DECL__NAME:
        return name != null;
      case StLanguagePackage.METHOD_DECL__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
      case StLanguagePackage.METHOD_DECL__IOS:
        return ios != null && !ios.isEmpty();
      case StLanguagePackage.METHOD_DECL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case StLanguagePackage.METHOD_DECL__TEMPS:
        return temps != null && !temps.isEmpty();
      case StLanguagePackage.METHOD_DECL__BODY:
        return body != null;
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
    result.append(" (access: ");
    result.append(access);
    result.append(", type: ");
    result.append(type);
    result.append(", override: ");
    result.append(override);
    result.append(", returnType: ");
    result.append(returnType);
    result.append(')');
    return result.toString();
  }

} //Method_DeclImpl
