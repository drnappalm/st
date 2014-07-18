/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.test;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.testImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class testImpl extends MinimalEObjectImpl.Container implements test
{
  /**
   * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected static final String TEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected String test = TEST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected testImpl()
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
    return StLanguagePackage.Literals.TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(String newTest)
  {
    String oldTest = test;
    test = newTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.TEST__TEST, oldTest, test));
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
      case StLanguagePackage.TEST__TEST:
        return getTest();
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
      case StLanguagePackage.TEST__TEST:
        setTest((String)newValue);
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
      case StLanguagePackage.TEST__TEST:
        setTest(TEST_EDEFAULT);
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
      case StLanguagePackage.TEST__TEST:
        return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
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
    result.append(" (test: ");
    result.append(test);
    result.append(')');
    return result.toString();
  }

} //testImpl
