/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Expression;
import at.bachmann.plc.st.stLanguage.For_List;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.For_ListImpl#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.For_ListImpl#getUpBound <em>Up Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.For_ListImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class For_ListImpl extends MinimalEObjectImpl.Container implements For_List
{
  /**
   * The cached value of the '{@link #getLowBound() <em>Low Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowBound()
   * @generated
   * @ordered
   */
  protected Expression lowBound;

  /**
   * The cached value of the '{@link #getUpBound() <em>Up Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpBound()
   * @generated
   * @ordered
   */
  protected Expression upBound;

  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected Expression step;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected For_ListImpl()
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
    return StLanguagePackage.Literals.FOR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLowBound()
  {
    return lowBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowBound(Expression newLowBound, NotificationChain msgs)
  {
    Expression oldLowBound = lowBound;
    lowBound = newLowBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_LIST__LOW_BOUND, oldLowBound, newLowBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowBound(Expression newLowBound)
  {
    if (newLowBound != lowBound)
    {
      NotificationChain msgs = null;
      if (lowBound != null)
        msgs = ((InternalEObject)lowBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_LIST__LOW_BOUND, null, msgs);
      if (newLowBound != null)
        msgs = ((InternalEObject)newLowBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_LIST__LOW_BOUND, null, msgs);
      msgs = basicSetLowBound(newLowBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_LIST__LOW_BOUND, newLowBound, newLowBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getUpBound()
  {
    return upBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpBound(Expression newUpBound, NotificationChain msgs)
  {
    Expression oldUpBound = upBound;
    upBound = newUpBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_LIST__UP_BOUND, oldUpBound, newUpBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpBound(Expression newUpBound)
  {
    if (newUpBound != upBound)
    {
      NotificationChain msgs = null;
      if (upBound != null)
        msgs = ((InternalEObject)upBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_LIST__UP_BOUND, null, msgs);
      if (newUpBound != null)
        msgs = ((InternalEObject)newUpBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_LIST__UP_BOUND, null, msgs);
      msgs = basicSetUpBound(newUpBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_LIST__UP_BOUND, newUpBound, newUpBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStep(Expression newStep, NotificationChain msgs)
  {
    Expression oldStep = step;
    step = newStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_LIST__STEP, oldStep, newStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStep(Expression newStep)
  {
    if (newStep != step)
    {
      NotificationChain msgs = null;
      if (step != null)
        msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_LIST__STEP, null, msgs);
      if (newStep != null)
        msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_LIST__STEP, null, msgs);
      msgs = basicSetStep(newStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_LIST__STEP, newStep, newStep));
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
      case StLanguagePackage.FOR_LIST__LOW_BOUND:
        return basicSetLowBound(null, msgs);
      case StLanguagePackage.FOR_LIST__UP_BOUND:
        return basicSetUpBound(null, msgs);
      case StLanguagePackage.FOR_LIST__STEP:
        return basicSetStep(null, msgs);
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
      case StLanguagePackage.FOR_LIST__LOW_BOUND:
        return getLowBound();
      case StLanguagePackage.FOR_LIST__UP_BOUND:
        return getUpBound();
      case StLanguagePackage.FOR_LIST__STEP:
        return getStep();
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
      case StLanguagePackage.FOR_LIST__LOW_BOUND:
        setLowBound((Expression)newValue);
        return;
      case StLanguagePackage.FOR_LIST__UP_BOUND:
        setUpBound((Expression)newValue);
        return;
      case StLanguagePackage.FOR_LIST__STEP:
        setStep((Expression)newValue);
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
      case StLanguagePackage.FOR_LIST__LOW_BOUND:
        setLowBound((Expression)null);
        return;
      case StLanguagePackage.FOR_LIST__UP_BOUND:
        setUpBound((Expression)null);
        return;
      case StLanguagePackage.FOR_LIST__STEP:
        setStep((Expression)null);
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
      case StLanguagePackage.FOR_LIST__LOW_BOUND:
        return lowBound != null;
      case StLanguagePackage.FOR_LIST__UP_BOUND:
        return upBound != null;
      case StLanguagePackage.FOR_LIST__STEP:
        return step != null;
    }
    return super.eIsSet(featureID);
  }

} //For_ListImpl
