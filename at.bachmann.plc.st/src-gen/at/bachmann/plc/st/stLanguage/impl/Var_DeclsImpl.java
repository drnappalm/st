/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Var_Decls;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl#isRetain <em>Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl#isNonRetain <em>Non Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Var_DeclsImpl extends Func_Var_DeclsImpl implements Var_Decls
{
  /**
   * The default value of the '{@link #isRetain() <em>Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRetain()
   * @generated
   * @ordered
   */
  protected static final boolean RETAIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRetain() <em>Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRetain()
   * @generated
   * @ordered
   */
  protected boolean retain = RETAIN_EDEFAULT;

  /**
   * The default value of the '{@link #isNonRetain() <em>Non Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNonRetain()
   * @generated
   * @ordered
   */
  protected static final boolean NON_RETAIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNonRetain() <em>Non Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNonRetain()
   * @generated
   * @ordered
   */
  protected boolean nonRetain = NON_RETAIN_EDEFAULT;

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
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<EObject> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Var_DeclsImpl()
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
    return StLanguagePackage.Literals.VAR_DECLS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRetain()
  {
    return retain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRetain(boolean newRetain)
  {
    boolean oldRetain = retain;
    retain = newRetain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.VAR_DECLS__RETAIN, oldRetain, retain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNonRetain()
  {
    return nonRetain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNonRetain(boolean newNonRetain)
  {
    boolean oldNonRetain = nonRetain;
    nonRetain = newNonRetain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.VAR_DECLS__NON_RETAIN, oldNonRetain, nonRetain));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.VAR_DECLS__ACCESS, oldAccess, access));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<EObject>(EObject.class, this, StLanguagePackage.VAR_DECLS__DECLARATIONS);
    }
    return declarations;
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
      case StLanguagePackage.VAR_DECLS__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
      case StLanguagePackage.VAR_DECLS__RETAIN:
        return isRetain();
      case StLanguagePackage.VAR_DECLS__NON_RETAIN:
        return isNonRetain();
      case StLanguagePackage.VAR_DECLS__ACCESS:
        return getAccess();
      case StLanguagePackage.VAR_DECLS__DECLARATIONS:
        return getDeclarations();
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
      case StLanguagePackage.VAR_DECLS__RETAIN:
        setRetain((Boolean)newValue);
        return;
      case StLanguagePackage.VAR_DECLS__NON_RETAIN:
        setNonRetain((Boolean)newValue);
        return;
      case StLanguagePackage.VAR_DECLS__ACCESS:
        setAccess((String)newValue);
        return;
      case StLanguagePackage.VAR_DECLS__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends EObject>)newValue);
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
      case StLanguagePackage.VAR_DECLS__RETAIN:
        setRetain(RETAIN_EDEFAULT);
        return;
      case StLanguagePackage.VAR_DECLS__NON_RETAIN:
        setNonRetain(NON_RETAIN_EDEFAULT);
        return;
      case StLanguagePackage.VAR_DECLS__ACCESS:
        setAccess(ACCESS_EDEFAULT);
        return;
      case StLanguagePackage.VAR_DECLS__DECLARATIONS:
        getDeclarations().clear();
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
      case StLanguagePackage.VAR_DECLS__RETAIN:
        return retain != RETAIN_EDEFAULT;
      case StLanguagePackage.VAR_DECLS__NON_RETAIN:
        return nonRetain != NON_RETAIN_EDEFAULT;
      case StLanguagePackage.VAR_DECLS__ACCESS:
        return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
      case StLanguagePackage.VAR_DECLS__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
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
    result.append(" (retain: ");
    result.append(retain);
    result.append(", nonRetain: ");
    result.append(nonRetain);
    result.append(", access: ");
    result.append(access);
    result.append(')');
    return result.toString();
  }

} //Var_DeclsImpl
