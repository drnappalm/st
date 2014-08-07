/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Namespace;
import at.bachmann.plc.st.stLanguage.Namespace_Decl;
import at.bachmann.plc.st.stLanguage.Namespace_Elements;
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
 * An implementation of the model object '<em><b>Namespace Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl#isInternal <em>Internal</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Namespace_DeclImpl extends MinimalEObjectImpl.Container implements Namespace_Decl
{
  /**
   * The default value of the '{@link #isInternal() <em>Internal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInternal()
   * @generated
   * @ordered
   */
  protected static final boolean INTERNAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInternal() <em>Internal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInternal()
   * @generated
   * @ordered
   */
  protected boolean internal = INTERNAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected Namespace namespace;

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
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Namespace_Elements> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Namespace_DeclImpl()
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
    return StLanguagePackage.Literals.NAMESPACE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInternal()
  {
    return internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInternal(boolean newInternal)
  {
    boolean oldInternal = internal;
    internal = newInternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.NAMESPACE_DECL__INTERNAL, oldInternal, internal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs)
  {
    Namespace oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.NAMESPACE_DECL__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(Namespace newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.NAMESPACE_DECL__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.NAMESPACE_DECL__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.NAMESPACE_DECL__NAMESPACE, newNamespace, newNamespace));
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
      usings = new EObjectContainmentEList<Using_Directive>(Using_Directive.class, this, StLanguagePackage.NAMESPACE_DECL__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Namespace_Elements> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Namespace_Elements>(Namespace_Elements.class, this, StLanguagePackage.NAMESPACE_DECL__ELEMENTS);
    }
    return elements;
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
      case StLanguagePackage.NAMESPACE_DECL__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case StLanguagePackage.NAMESPACE_DECL__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.NAMESPACE_DECL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case StLanguagePackage.NAMESPACE_DECL__INTERNAL:
        return isInternal();
      case StLanguagePackage.NAMESPACE_DECL__NAMESPACE:
        return getNamespace();
      case StLanguagePackage.NAMESPACE_DECL__USINGS:
        return getUsings();
      case StLanguagePackage.NAMESPACE_DECL__ELEMENTS:
        return getElements();
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
      case StLanguagePackage.NAMESPACE_DECL__INTERNAL:
        setInternal((Boolean)newValue);
        return;
      case StLanguagePackage.NAMESPACE_DECL__NAMESPACE:
        setNamespace((Namespace)newValue);
        return;
      case StLanguagePackage.NAMESPACE_DECL__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using_Directive>)newValue);
        return;
      case StLanguagePackage.NAMESPACE_DECL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Namespace_Elements>)newValue);
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
      case StLanguagePackage.NAMESPACE_DECL__INTERNAL:
        setInternal(INTERNAL_EDEFAULT);
        return;
      case StLanguagePackage.NAMESPACE_DECL__NAMESPACE:
        setNamespace((Namespace)null);
        return;
      case StLanguagePackage.NAMESPACE_DECL__USINGS:
        getUsings().clear();
        return;
      case StLanguagePackage.NAMESPACE_DECL__ELEMENTS:
        getElements().clear();
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
      case StLanguagePackage.NAMESPACE_DECL__INTERNAL:
        return internal != INTERNAL_EDEFAULT;
      case StLanguagePackage.NAMESPACE_DECL__NAMESPACE:
        return namespace != null;
      case StLanguagePackage.NAMESPACE_DECL__USINGS:
        return usings != null && !usings.isEmpty();
      case StLanguagePackage.NAMESPACE_DECL__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (internal: ");
    result.append(internal);
    result.append(')');
    return result.toString();
  }

} //Namespace_DeclImpl
