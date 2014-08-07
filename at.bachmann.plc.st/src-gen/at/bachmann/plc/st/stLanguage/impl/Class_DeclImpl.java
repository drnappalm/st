/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Class_Decl;
import at.bachmann.plc.st.stLanguage.Func_Var_Decls;
import at.bachmann.plc.st.stLanguage.Interface_Name_List;
import at.bachmann.plc.st.stLanguage.Method_Decl;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Using_Directive;

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
 * An implementation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Class_DeclImpl extends MinimalEObjectImpl.Container implements Class_Decl
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
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected at.bachmann.plc.st.stLanguage.Class class_;

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
  protected at.bachmann.plc.st.stLanguage.Class extends_;

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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Func_Var_Decls> variables;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Class_DeclImpl()
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
    return StLanguagePackage.Literals.CLASS_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.CLASS_DECL__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.bachmann.plc.st.stLanguage.Class getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(at.bachmann.plc.st.stLanguage.Class newClass, NotificationChain msgs)
  {
    at.bachmann.plc.st.stLanguage.Class oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.CLASS_DECL__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(at.bachmann.plc.st.stLanguage.Class newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.CLASS_DECL__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.CLASS_DECL__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.CLASS_DECL__CLASS, newClass, newClass));
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
      usings = new EObjectContainmentEList<Using_Directive>(Using_Directive.class, this, StLanguagePackage.CLASS_DECL__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.bachmann.plc.st.stLanguage.Class getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (at.bachmann.plc.st.stLanguage.Class)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StLanguagePackage.CLASS_DECL__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.bachmann.plc.st.stLanguage.Class basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(at.bachmann.plc.st.stLanguage.Class newExtends)
  {
    at.bachmann.plc.st.stLanguage.Class oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.CLASS_DECL__EXTENDS, oldExtends, extends_));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.CLASS_DECL__IMPLEMENTS, oldImplements, newImplements);
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
        msgs = ((InternalEObject)implements_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.CLASS_DECL__IMPLEMENTS, null, msgs);
      if (newImplements != null)
        msgs = ((InternalEObject)newImplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.CLASS_DECL__IMPLEMENTS, null, msgs);
      msgs = basicSetImplements(newImplements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.CLASS_DECL__IMPLEMENTS, newImplements, newImplements));
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
      variables = new EObjectContainmentEList<Func_Var_Decls>(Func_Var_Decls.class, this, StLanguagePackage.CLASS_DECL__VARIABLES);
    }
    return variables;
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
      methods = new EObjectContainmentEList<Method_Decl>(Method_Decl.class, this, StLanguagePackage.CLASS_DECL__METHODS);
    }
    return methods;
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
      case StLanguagePackage.CLASS_DECL__CLASS:
        return basicSetClass(null, msgs);
      case StLanguagePackage.CLASS_DECL__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.CLASS_DECL__IMPLEMENTS:
        return basicSetImplements(null, msgs);
      case StLanguagePackage.CLASS_DECL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.CLASS_DECL__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case StLanguagePackage.CLASS_DECL__MODIFIER:
        return getModifier();
      case StLanguagePackage.CLASS_DECL__CLASS:
        return getClass_();
      case StLanguagePackage.CLASS_DECL__USINGS:
        return getUsings();
      case StLanguagePackage.CLASS_DECL__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case StLanguagePackage.CLASS_DECL__IMPLEMENTS:
        return getImplements();
      case StLanguagePackage.CLASS_DECL__VARIABLES:
        return getVariables();
      case StLanguagePackage.CLASS_DECL__METHODS:
        return getMethods();
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
      case StLanguagePackage.CLASS_DECL__MODIFIER:
        setModifier((String)newValue);
        return;
      case StLanguagePackage.CLASS_DECL__CLASS:
        setClass((at.bachmann.plc.st.stLanguage.Class)newValue);
        return;
      case StLanguagePackage.CLASS_DECL__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using_Directive>)newValue);
        return;
      case StLanguagePackage.CLASS_DECL__EXTENDS:
        setExtends((at.bachmann.plc.st.stLanguage.Class)newValue);
        return;
      case StLanguagePackage.CLASS_DECL__IMPLEMENTS:
        setImplements((Interface_Name_List)newValue);
        return;
      case StLanguagePackage.CLASS_DECL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Func_Var_Decls>)newValue);
        return;
      case StLanguagePackage.CLASS_DECL__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method_Decl>)newValue);
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
      case StLanguagePackage.CLASS_DECL__MODIFIER:
        setModifier(MODIFIER_EDEFAULT);
        return;
      case StLanguagePackage.CLASS_DECL__CLASS:
        setClass((at.bachmann.plc.st.stLanguage.Class)null);
        return;
      case StLanguagePackage.CLASS_DECL__USINGS:
        getUsings().clear();
        return;
      case StLanguagePackage.CLASS_DECL__EXTENDS:
        setExtends((at.bachmann.plc.st.stLanguage.Class)null);
        return;
      case StLanguagePackage.CLASS_DECL__IMPLEMENTS:
        setImplements((Interface_Name_List)null);
        return;
      case StLanguagePackage.CLASS_DECL__VARIABLES:
        getVariables().clear();
        return;
      case StLanguagePackage.CLASS_DECL__METHODS:
        getMethods().clear();
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
      case StLanguagePackage.CLASS_DECL__MODIFIER:
        return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
      case StLanguagePackage.CLASS_DECL__CLASS:
        return class_ != null;
      case StLanguagePackage.CLASS_DECL__USINGS:
        return usings != null && !usings.isEmpty();
      case StLanguagePackage.CLASS_DECL__EXTENDS:
        return extends_ != null;
      case StLanguagePackage.CLASS_DECL__IMPLEMENTS:
        return implements_ != null;
      case StLanguagePackage.CLASS_DECL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case StLanguagePackage.CLASS_DECL__METHODS:
        return methods != null && !methods.isEmpty();
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

} //Class_DeclImpl
