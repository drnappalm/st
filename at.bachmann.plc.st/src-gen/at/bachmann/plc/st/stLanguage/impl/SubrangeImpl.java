/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Constant_Expr;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Subrange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.SubrangeImpl#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.SubrangeImpl#getUpBound <em>Up Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubrangeImpl extends Case_List_ElemImpl implements Subrange
{
  /**
   * The cached value of the '{@link #getLowBound() <em>Low Bound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowBound()
   * @generated
   * @ordered
   */
  protected Constant_Expr lowBound;

  /**
   * The cached value of the '{@link #getUpBound() <em>Up Bound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpBound()
   * @generated
   * @ordered
   */
  protected Constant_Expr upBound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubrangeImpl()
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
    return StLanguagePackage.Literals.SUBRANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant_Expr getLowBound()
  {
    if (lowBound != null && lowBound.eIsProxy())
    {
      InternalEObject oldLowBound = (InternalEObject)lowBound;
      lowBound = (Constant_Expr)eResolveProxy(oldLowBound);
      if (lowBound != oldLowBound)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StLanguagePackage.SUBRANGE__LOW_BOUND, oldLowBound, lowBound));
      }
    }
    return lowBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant_Expr basicGetLowBound()
  {
    return lowBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowBound(Constant_Expr newLowBound)
  {
    Constant_Expr oldLowBound = lowBound;
    lowBound = newLowBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.SUBRANGE__LOW_BOUND, oldLowBound, lowBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant_Expr getUpBound()
  {
    if (upBound != null && upBound.eIsProxy())
    {
      InternalEObject oldUpBound = (InternalEObject)upBound;
      upBound = (Constant_Expr)eResolveProxy(oldUpBound);
      if (upBound != oldUpBound)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StLanguagePackage.SUBRANGE__UP_BOUND, oldUpBound, upBound));
      }
    }
    return upBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant_Expr basicGetUpBound()
  {
    return upBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpBound(Constant_Expr newUpBound)
  {
    Constant_Expr oldUpBound = upBound;
    upBound = newUpBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.SUBRANGE__UP_BOUND, oldUpBound, upBound));
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
      case StLanguagePackage.SUBRANGE__LOW_BOUND:
        if (resolve) return getLowBound();
        return basicGetLowBound();
      case StLanguagePackage.SUBRANGE__UP_BOUND:
        if (resolve) return getUpBound();
        return basicGetUpBound();
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
      case StLanguagePackage.SUBRANGE__LOW_BOUND:
        setLowBound((Constant_Expr)newValue);
        return;
      case StLanguagePackage.SUBRANGE__UP_BOUND:
        setUpBound((Constant_Expr)newValue);
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
      case StLanguagePackage.SUBRANGE__LOW_BOUND:
        setLowBound((Constant_Expr)null);
        return;
      case StLanguagePackage.SUBRANGE__UP_BOUND:
        setUpBound((Constant_Expr)null);
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
      case StLanguagePackage.SUBRANGE__LOW_BOUND:
        return lowBound != null;
      case StLanguagePackage.SUBRANGE__UP_BOUND:
        return upBound != null;
    }
    return super.eIsSet(featureID);
  }

} //SubrangeImpl
