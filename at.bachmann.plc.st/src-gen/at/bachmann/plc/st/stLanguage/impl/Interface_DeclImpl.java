/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Interface;
import at.bachmann.plc.st.stLanguage.Interface_Decl;
import at.bachmann.plc.st.stLanguage.Interface_Name_List;
import at.bachmann.plc.st.stLanguage.Method_Prototype;
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
 * An implementation of the model object '<em><b>Interface Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Interface_DeclImpl extends MinimalEObjectImpl.Container implements Interface_Decl
{
  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected Interface interface_;

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
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected Interface_Name_List extends_;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method_Prototype> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Interface_DeclImpl()
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
    return StLanguagePackage.Literals.INTERFACE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs)
  {
    Interface oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.INTERFACE_DECL__INTERFACE, oldInterface, newInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(Interface newInterface)
  {
    if (newInterface != interface_)
    {
      NotificationChain msgs = null;
      if (interface_ != null)
        msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.INTERFACE_DECL__INTERFACE, null, msgs);
      if (newInterface != null)
        msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.INTERFACE_DECL__INTERFACE, null, msgs);
      msgs = basicSetInterface(newInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.INTERFACE_DECL__INTERFACE, newInterface, newInterface));
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
      usings = new EObjectContainmentEList<Using_Directive>(Using_Directive.class, this, StLanguagePackage.INTERFACE_DECL__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_Name_List getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(Interface_Name_List newExtends, NotificationChain msgs)
  {
    Interface_Name_List oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.INTERFACE_DECL__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(Interface_Name_List newExtends)
  {
    if (newExtends != extends_)
    {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.INTERFACE_DECL__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.INTERFACE_DECL__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.INTERFACE_DECL__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method_Prototype> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method_Prototype>(Method_Prototype.class, this, StLanguagePackage.INTERFACE_DECL__METHODS);
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
      case StLanguagePackage.INTERFACE_DECL__INTERFACE:
        return basicSetInterface(null, msgs);
      case StLanguagePackage.INTERFACE_DECL__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.INTERFACE_DECL__EXTENDS:
        return basicSetExtends(null, msgs);
      case StLanguagePackage.INTERFACE_DECL__METHODS:
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
      case StLanguagePackage.INTERFACE_DECL__INTERFACE:
        return getInterface();
      case StLanguagePackage.INTERFACE_DECL__USINGS:
        return getUsings();
      case StLanguagePackage.INTERFACE_DECL__EXTENDS:
        return getExtends();
      case StLanguagePackage.INTERFACE_DECL__METHODS:
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
      case StLanguagePackage.INTERFACE_DECL__INTERFACE:
        setInterface((Interface)newValue);
        return;
      case StLanguagePackage.INTERFACE_DECL__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using_Directive>)newValue);
        return;
      case StLanguagePackage.INTERFACE_DECL__EXTENDS:
        setExtends((Interface_Name_List)newValue);
        return;
      case StLanguagePackage.INTERFACE_DECL__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method_Prototype>)newValue);
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
      case StLanguagePackage.INTERFACE_DECL__INTERFACE:
        setInterface((Interface)null);
        return;
      case StLanguagePackage.INTERFACE_DECL__USINGS:
        getUsings().clear();
        return;
      case StLanguagePackage.INTERFACE_DECL__EXTENDS:
        setExtends((Interface_Name_List)null);
        return;
      case StLanguagePackage.INTERFACE_DECL__METHODS:
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
      case StLanguagePackage.INTERFACE_DECL__INTERFACE:
        return interface_ != null;
      case StLanguagePackage.INTERFACE_DECL__USINGS:
        return usings != null && !usings.isEmpty();
      case StLanguagePackage.INTERFACE_DECL__EXTENDS:
        return extends_ != null;
      case StLanguagePackage.INTERFACE_DECL__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Interface_DeclImpl
