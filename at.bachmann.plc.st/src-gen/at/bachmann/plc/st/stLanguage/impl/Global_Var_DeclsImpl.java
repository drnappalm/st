/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Global_Var_Decl;
import at.bachmann.plc.st.stLanguage.Global_Var_Decls;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;

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
 * An implementation of the model object '<em><b>Global Var Decls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl#isRetain <em>Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Global_Var_DeclsImpl extends MinimalEObjectImpl.Container implements Global_Var_Decls
{
  /**
   * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstant()
   * @generated
   * @ordered
   */
  protected static final boolean CONSTANT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstant()
   * @generated
   * @ordered
   */
  protected boolean constant = CONSTANT_EDEFAULT;

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
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Global_Var_Decl> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Global_Var_DeclsImpl()
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
    return StLanguagePackage.Literals.GLOBAL_VAR_DECLS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(boolean newConstant)
  {
    boolean oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.GLOBAL_VAR_DECLS__CONSTANT, oldConstant, constant));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.GLOBAL_VAR_DECLS__RETAIN, oldRetain, retain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Global_Var_Decl> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Global_Var_Decl>(Global_Var_Decl.class, this, StLanguagePackage.GLOBAL_VAR_DECLS__DECLARATIONS);
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
      case StLanguagePackage.GLOBAL_VAR_DECLS__DECLARATIONS:
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
      case StLanguagePackage.GLOBAL_VAR_DECLS__CONSTANT:
        return isConstant();
      case StLanguagePackage.GLOBAL_VAR_DECLS__RETAIN:
        return isRetain();
      case StLanguagePackage.GLOBAL_VAR_DECLS__DECLARATIONS:
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
      case StLanguagePackage.GLOBAL_VAR_DECLS__CONSTANT:
        setConstant((Boolean)newValue);
        return;
      case StLanguagePackage.GLOBAL_VAR_DECLS__RETAIN:
        setRetain((Boolean)newValue);
        return;
      case StLanguagePackage.GLOBAL_VAR_DECLS__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Global_Var_Decl>)newValue);
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
      case StLanguagePackage.GLOBAL_VAR_DECLS__CONSTANT:
        setConstant(CONSTANT_EDEFAULT);
        return;
      case StLanguagePackage.GLOBAL_VAR_DECLS__RETAIN:
        setRetain(RETAIN_EDEFAULT);
        return;
      case StLanguagePackage.GLOBAL_VAR_DECLS__DECLARATIONS:
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
      case StLanguagePackage.GLOBAL_VAR_DECLS__CONSTANT:
        return constant != CONSTANT_EDEFAULT;
      case StLanguagePackage.GLOBAL_VAR_DECLS__RETAIN:
        return retain != RETAIN_EDEFAULT;
      case StLanguagePackage.GLOBAL_VAR_DECLS__DECLARATIONS:
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
    result.append(" (constant: ");
    result.append(constant);
    result.append(", retain: ");
    result.append(retain);
    result.append(')');
    return result.toString();
  }

} //Global_Var_DeclsImpl
