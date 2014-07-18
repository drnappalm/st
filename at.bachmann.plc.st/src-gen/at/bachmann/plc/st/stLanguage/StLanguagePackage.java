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
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ConstantImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNumeric_Literal()
   * @generated
   */
  int NUMERIC_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInt_Literal()
   * @generated
   */
  int INT_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = NUMERIC_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl <em>Unsigned Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUnsigned_Int()
   * @generated
   */
  int UNSIGNED_INT = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT__VALUE = INT_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Unsigned Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT_FEATURE_COUNT = INT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl <em>Signed Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSigned_Int()
   * @generated
   */
  int SIGNED_INT = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__VALUE = INT_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Signed Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT_FEATURE_COUNT = INT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getReal_Literal()
   * @generated
   */
  int REAL_LITERAL = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VALUE = NUMERIC_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl <em>Bit Str Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBit_Str_Literal()
   * @generated
   */
  int BIT_STR_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Bit Str Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl <em>Bool Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBool_Literal()
   * @generated
   */
  int BOOL_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Bool Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl <em>Char Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getChar_Literal()
   * @generated
   */
  int CHAR_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Char Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl <em>Time Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Literal()
   * @generated
   */
  int TIME_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Time Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.DurationImpl <em>Duration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.DurationImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDuration()
   * @generated
   */
  int DURATION = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Duration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl <em>Time Of Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Of_Day()
   * @generated
   */
  int TIME_OF_DAY = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Time Of Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.DaytimeImpl <em>Daytime</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.DaytimeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDaytime()
   * @generated
   */
  int DAYTIME = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAYTIME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Daytime</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAYTIME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.DateImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate()
   * @generated
   */
  int DATE = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl <em>Date And Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate_And_Time()
   * @generated
   */
  int DATE_AND_TIME = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Date And Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;


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
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see at.bachmann.plc.st.stLanguage.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Numeric_Literal <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Numeric_Literal
   * @generated
   */
  EClass getNumeric_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Int_Literal <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Int_Literal
   * @generated
   */
  EClass getInt_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Unsigned_Int <em>Unsigned Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsigned Int</em>'.
   * @see at.bachmann.plc.st.stLanguage.Unsigned_Int
   * @generated
   */
  EClass getUnsigned_Int();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Signed_Int <em>Signed Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Int</em>'.
   * @see at.bachmann.plc.st.stLanguage.Signed_Int
   * @generated
   */
  EClass getSigned_Int();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Real_Literal <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Real_Literal
   * @generated
   */
  EClass getReal_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Bit_Str_Literal <em>Bit Str Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Str Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Bit_Str_Literal
   * @generated
   */
  EClass getBit_Str_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Bool_Literal <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Bool_Literal
   * @generated
   */
  EClass getBool_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Char_Literal <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Char_Literal
   * @generated
   */
  EClass getChar_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Time_Literal <em>Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Time_Literal
   * @generated
   */
  EClass getTime_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration</em>'.
   * @see at.bachmann.plc.st.stLanguage.Duration
   * @generated
   */
  EClass getDuration();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Time_Of_Day <em>Time Of Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Of Day</em>'.
   * @see at.bachmann.plc.st.stLanguage.Time_Of_Day
   * @generated
   */
  EClass getTime_Of_Day();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Daytime <em>Daytime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daytime</em>'.
   * @see at.bachmann.plc.st.stLanguage.Daytime
   * @generated
   */
  EClass getDaytime();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Daytime#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Daytime#getValue()
   * @see #getDaytime()
   * @generated
   */
  EAttribute getDaytime_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see at.bachmann.plc.st.stLanguage.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Date_And_Time <em>Date And Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date And Time</em>'.
   * @see at.bachmann.plc.st.stLanguage.Date_And_Time
   * @generated
   */
  EClass getDate_And_Time();

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

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ConstantImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNumeric_Literal()
     * @generated
     */
    EClass NUMERIC_LITERAL = eINSTANCE.getNumeric_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInt_Literal()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getInt_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl <em>Unsigned Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUnsigned_Int()
     * @generated
     */
    EClass UNSIGNED_INT = eINSTANCE.getUnsigned_Int();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl <em>Signed Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSigned_Int()
     * @generated
     */
    EClass SIGNED_INT = eINSTANCE.getSigned_Int();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getReal_Literal()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getReal_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl <em>Bit Str Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBit_Str_Literal()
     * @generated
     */
    EClass BIT_STR_LITERAL = eINSTANCE.getBit_Str_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl <em>Bool Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBool_Literal()
     * @generated
     */
    EClass BOOL_LITERAL = eINSTANCE.getBool_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl <em>Char Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getChar_Literal()
     * @generated
     */
    EClass CHAR_LITERAL = eINSTANCE.getChar_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl <em>Time Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Literal()
     * @generated
     */
    EClass TIME_LITERAL = eINSTANCE.getTime_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.DurationImpl <em>Duration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.DurationImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDuration()
     * @generated
     */
    EClass DURATION = eINSTANCE.getDuration();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl <em>Time Of Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Of_Day()
     * @generated
     */
    EClass TIME_OF_DAY = eINSTANCE.getTime_Of_Day();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.DaytimeImpl <em>Daytime</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.DaytimeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDaytime()
     * @generated
     */
    EClass DAYTIME = eINSTANCE.getDaytime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAYTIME__VALUE = eINSTANCE.getDaytime_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.DateImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl <em>Date And Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate_And_Time()
     * @generated
     */
    EClass DATE_AND_TIME = eINSTANCE.getDate_And_Time();

  }

} //StLanguagePackage
