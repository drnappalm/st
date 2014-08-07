/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.FB_Input_Decl;
import at.bachmann.plc.st.stLanguage.FB_Input_Decls;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;

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
 * An implementation of the model object '<em><b>FB Input Decls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl#isRetain <em>Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl#isNonRetain <em>Non Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FB_Input_DeclsImpl extends FB_IO_Var_DeclsImpl implements FB_Input_Decls
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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<FB_Input_Decl> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FB_Input_DeclsImpl()
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
    return StLanguagePackage.Literals.FB_INPUT_DECLS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_INPUT_DECLS__RETAIN, oldRetain, retain));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FB_INPUT_DECLS__NON_RETAIN, oldNonRetain, nonRetain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FB_Input_Decl> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<FB_Input_Decl>(FB_Input_Decl.class, this, StLanguagePackage.FB_INPUT_DECLS__VARIABLES);
    }
    return variables;
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
      case StLanguagePackage.FB_INPUT_DECLS__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
      case StLanguagePackage.FB_INPUT_DECLS__RETAIN:
        return isRetain();
      case StLanguagePackage.FB_INPUT_DECLS__NON_RETAIN:
        return isNonRetain();
      case StLanguagePackage.FB_INPUT_DECLS__VARIABLES:
        return getVariables();
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
      case StLanguagePackage.FB_INPUT_DECLS__RETAIN:
        setRetain((Boolean)newValue);
        return;
      case StLanguagePackage.FB_INPUT_DECLS__NON_RETAIN:
        setNonRetain((Boolean)newValue);
        return;
      case StLanguagePackage.FB_INPUT_DECLS__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends FB_Input_Decl>)newValue);
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
      case StLanguagePackage.FB_INPUT_DECLS__RETAIN:
        setRetain(RETAIN_EDEFAULT);
        return;
      case StLanguagePackage.FB_INPUT_DECLS__NON_RETAIN:
        setNonRetain(NON_RETAIN_EDEFAULT);
        return;
      case StLanguagePackage.FB_INPUT_DECLS__VARIABLES:
        getVariables().clear();
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
      case StLanguagePackage.FB_INPUT_DECLS__RETAIN:
        return retain != RETAIN_EDEFAULT;
      case StLanguagePackage.FB_INPUT_DECLS__NON_RETAIN:
        return nonRetain != NON_RETAIN_EDEFAULT;
      case StLanguagePackage.FB_INPUT_DECLS__VARIABLES:
        return variables != null && !variables.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //FB_Input_DeclsImpl
