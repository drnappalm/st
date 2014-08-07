/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.FB_Body;
import at.bachmann.plc.st.stLanguage.FB_Decl;
import at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls;
import at.bachmann.plc.st.stLanguage.Func_Var_Decls;
import at.bachmann.plc.st.stLanguage.FunctionBlock;
import at.bachmann.plc.st.stLanguage.Interface_Name_List;
import at.bachmann.plc.st.stLanguage.Method_Decl;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Temp_Var_Decls;
import at.bachmann.plc.st.stLanguage.Using_Directive;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FB Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getFunctionblock <em>Functionblock</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getIos <em>Ios</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getTemps <em>Temps</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FB_DeclImpl extends Namespace_ElementsImpl implements FB_Decl
{
  /**
   * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected static final String MODIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected String modifier = MODIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunctionblock() <em>Functionblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionblock()
   * @generated
   * @ordered
   */
  protected FunctionBlock functionblock;

  /**
   * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsings()
   * @generated
   * @ordered
   */
  protected EList<Using_Directive> usings;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected FunctionBlock extends_;

  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected Interface_Name_List implements_;

  /**
   * The cached value of the '{@link #getIos() <em>Ios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIos()
   * @generated
   * @ordered
   */
  protected EList<FB_IO_Var_Decls> ios;

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
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method_Decl> methods;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected FB_Body body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FB_DeclImpl()
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
    return StLanguagePackage.Literals.FB_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(String newModifier)
  {
    String oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBlock getFunctionblock()
  {
    return functionblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionblock(FunctionBlock newFunctionblock, NotificationChain msgs)
  {
    FunctionBlock oldFunctionblock = functionblock;
    functionblock = newFunctionblock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__FUNCTIONBLOCK, oldFunctionblock, newFunctionblock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionblock(FunctionBlock newFunctionblock)
  {
    if (newFunctionblock != functionblock)
    {
      NotificationChain msgs = null;
      if (functionblock != null)
        msgs = ((InternalEObject)functionblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FB_DECL__FUNCTIONBLOCK, null, msgs);
      if (newFunctionblock != null)
        msgs = ((InternalEObject)newFunctionblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FB_DECL__FUNCTIONBLOCK, null, msgs);
      msgs = basicSetFunctionblock(newFunctionblock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__FUNCTIONBLOCK, newFunctionblock, newFunctionblock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Using_Directive> getUsings()
  {
    if (usings == null)
    {
      usings = new EObjectContainmentEList<Using_Directive>(Using_Directive.class, this, StLanguagePackage.FB_DECL__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBlock getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (FunctionBlock)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StLanguagePackage.FB_DECL__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBlock basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(FunctionBlock newExtends)
  {
    FunctionBlock oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_Name_List getImplements()
  {
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImplements(Interface_Name_List newImplements, NotificationChain msgs)
  {
    Interface_Name_List oldImplements = implements_;
    implements_ = newImplements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__IMPLEMENTS, oldImplements, newImplements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplements(Interface_Name_List newImplements)
  {
    if (newImplements != implements_)
    {
      NotificationChain msgs = null;
      if (implements_ != null)
        msgs = ((InternalEObject)implements_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FB_DECL__IMPLEMENTS, null, msgs);
      if (newImplements != null)
        msgs = ((InternalEObject)newImplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FB_DECL__IMPLEMENTS, null, msgs);
      msgs = basicSetImplements(newImplements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__IMPLEMENTS, newImplements, newImplements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FB_IO_Var_Decls> getIos()
  {
    if (ios == null)
    {
      ios = new EObjectContainmentEList<FB_IO_Var_Decls>(FB_IO_Var_Decls.class, this, StLanguagePackage.FB_DECL__IOS);
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
      variables = new EObjectContainmentEList<Func_Var_Decls>(Func_Var_Decls.class, this, StLanguagePackage.FB_DECL__VARIABLES);
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
      temps = new EObjectContainmentEList<Temp_Var_Decls>(Temp_Var_Decls.class, this, StLanguagePackage.FB_DECL__TEMPS);
    }
    return temps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method_Decl> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method_Decl>(Method_Decl.class, this, StLanguagePackage.FB_DECL__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Body getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(FB_Body newBody, NotificationChain msgs)
  {
    FB_Body oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(FB_Body newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FB_DECL__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FB_DECL__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_DECL__BODY, newBody, newBody));
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
      case StLanguagePackage.FB_DECL__FUNCTIONBLOCK:
        return basicSetFunctionblock(null, msgs);
      case StLanguagePackage.FB_DECL__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.FB_DECL__IMPLEMENTS:
        return basicSetImplements(null, msgs);
      case StLanguagePackage.FB_DECL__IOS:
        return ((InternalEList<?>)getIos()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.FB_DECL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.FB_DECL__TEMPS:
        return ((InternalEList<?>)getTemps()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.FB_DECL__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.FB_DECL__BODY:
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
      case StLanguagePackage.FB_DECL__MODIFIER:
        return getModifier();
      case StLanguagePackage.FB_DECL__FUNCTIONBLOCK:
        return getFunctionblock();
      case StLanguagePackage.FB_DECL__USINGS:
        return getUsings();
      case StLanguagePackage.FB_DECL__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case StLanguagePackage.FB_DECL__IMPLEMENTS:
        return getImplements();
      case StLanguagePackage.FB_DECL__IOS:
        return getIos();
      case StLanguagePackage.FB_DECL__VARIABLES:
        return getVariables();
      case StLanguagePackage.FB_DECL__TEMPS:
        return getTemps();
      case StLanguagePackage.FB_DECL__METHODS:
        return getMethods();
      case StLanguagePackage.FB_DECL__BODY:
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
      case StLanguagePackage.FB_DECL__MODIFIER:
        setModifier((String)newValue);
        return;
      case StLanguagePackage.FB_DECL__FUNCTIONBLOCK:
        setFunctionblock((FunctionBlock)newValue);
        return;
      case StLanguagePackage.FB_DECL__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using_Directive>)newValue);
        return;
      case StLanguagePackage.FB_DECL__EXTENDS:
        setExtends((FunctionBlock)newValue);
        return;
      case StLanguagePackage.FB_DECL__IMPLEMENTS:
        setImplements((Interface_Name_List)newValue);
        return;
      case StLanguagePackage.FB_DECL__IOS:
        getIos().clear();
        getIos().addAll((Collection<? extends FB_IO_Var_Decls>)newValue);
        return;
      case StLanguagePackage.FB_DECL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Func_Var_Decls>)newValue);
        return;
      case StLanguagePackage.FB_DECL__TEMPS:
        getTemps().clear();
        getTemps().addAll((Collection<? extends Temp_Var_Decls>)newValue);
        return;
      case StLanguagePackage.FB_DECL__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method_Decl>)newValue);
        return;
      case StLanguagePackage.FB_DECL__BODY:
        setBody((FB_Body)newValue);
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
      case StLanguagePackage.FB_DECL__MODIFIER:
        setModifier(MODIFIER_EDEFAULT);
        return;
      case StLanguagePackage.FB_DECL__FUNCTIONBLOCK:
        setFunctionblock((FunctionBlock)null);
        return;
      case StLanguagePackage.FB_DECL__USINGS:
        getUsings().clear();
        return;
      case StLanguagePackage.FB_DECL__EXTENDS:
        setExtends((FunctionBlock)null);
        return;
      case StLanguagePackage.FB_DECL__IMPLEMENTS:
        setImplements((Interface_Name_List)null);
        return;
      case StLanguagePackage.FB_DECL__IOS:
        getIos().clear();
        return;
      case StLanguagePackage.FB_DECL__VARIABLES:
        getVariables().clear();
        return;
      case StLanguagePackage.FB_DECL__TEMPS:
        getTemps().clear();
        return;
      case StLanguagePackage.FB_DECL__METHODS:
        getMethods().clear();
        return;
      case StLanguagePackage.FB_DECL__BODY:
        setBody((FB_Body)null);
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
      case StLanguagePackage.FB_DECL__MODIFIER:
        return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
      case StLanguagePackage.FB_DECL__FUNCTIONBLOCK:
        return functionblock != null;
      case StLanguagePackage.FB_DECL__USINGS:
        return usings != null && !usings.isEmpty();
      case StLanguagePackage.FB_DECL__EXTENDS:
        return extends_ != null;
      case StLanguagePackage.FB_DECL__IMPLEMENTS:
        return implements_ != null;
      case StLanguagePackage.FB_DECL__IOS:
        return ios != null && !ios.isEmpty();
      case StLanguagePackage.FB_DECL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case StLanguagePackage.FB_DECL__TEMPS:
        return temps != null && !temps.isEmpty();
      case StLanguagePackage.FB_DECL__METHODS:
        return methods != null && !methods.isEmpty();
      case StLanguagePackage.FB_DECL__BODY:
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
    result.append(" (modifier: ");
    result.append(modifier);
    result.append(')');
    return result.toString();
  }

} //FB_DeclImpl
