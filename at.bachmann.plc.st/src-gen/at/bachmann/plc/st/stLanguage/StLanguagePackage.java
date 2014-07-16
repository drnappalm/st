/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface StLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bachmann.at/plc/st/STLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StLanguagePackage eINSTANCE = at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.testImpl <em>test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.testImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#gettest()
   * @generated
   */
  int TEST = 0;

  /**
   * The feature id for the '<em><b>Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__TEST = 0;

  /**
   * The number of structural features of the '<em>test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.test <em>test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>test</em>'.
   * @see at.bachmann.plc.st.stLanguage.test
   * @generated
   */
  EClass gettest();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.test#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Test</em>'.
   * @see at.bachmann.plc.st.stLanguage.test#getTest()
   * @see #gettest()
   * @generated
   */
  EAttribute gettest_Test();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StLanguageFactory getStLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.testImpl <em>test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.testImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#gettest()
     * @generated
     */
    EClass TEST = eINSTANCE.gettest();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__TEST = eINSTANCE.gettest_Test();

  }

} //StLanguagePackage
