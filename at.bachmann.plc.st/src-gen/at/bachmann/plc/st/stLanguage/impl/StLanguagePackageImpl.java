/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Bit_Str_Literal;
import at.bachmann.plc.st.stLanguage.Bool_Literal;
import at.bachmann.plc.st.stLanguage.Char_Literal;
import at.bachmann.plc.st.stLanguage.Constant;
import at.bachmann.plc.st.stLanguage.Date;
import at.bachmann.plc.st.stLanguage.Date_And_Time;
import at.bachmann.plc.st.stLanguage.Daytime;
import at.bachmann.plc.st.stLanguage.Duration;
import at.bachmann.plc.st.stLanguage.Int_Literal;
import at.bachmann.plc.st.stLanguage.Numeric_Literal;
import at.bachmann.plc.st.stLanguage.Real_Literal;
import at.bachmann.plc.st.stLanguage.Signed_Int;
import at.bachmann.plc.st.stLanguage.StLanguageFactory;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Time_Literal;
import at.bachmann.plc.st.stLanguage.Time_Of_Day;
import at.bachmann.plc.st.stLanguage.Unsigned_Int;
import at.bachmann.plc.st.stLanguage.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StLanguagePackageImpl extends EPackageImpl implements StLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numeric_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass int_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsigned_IntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signed_IntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass real_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bit_Str_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bool_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass char_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass time_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass durationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass time_Of_DayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daytimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass date_And_TimeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StLanguagePackageImpl()
  {
    super(eNS_URI, StLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link StLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StLanguagePackage init()
  {
    if (isInited) return (StLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(StLanguagePackage.eNS_URI);

    // Obtain or create and register package
    StLanguagePackageImpl theStLanguagePackage = (StLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theStLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theStLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StLanguagePackage.eNS_URI, theStLanguagePackage);
    return theStLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettest()
  {
    return testEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettest_Test()
  {
    return (EAttribute)testEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Value()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumeric_Literal()
  {
    return numeric_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInt_Literal()
  {
    return int_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnsigned_Int()
  {
    return unsigned_IntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSigned_Int()
  {
    return signed_IntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReal_Literal()
  {
    return real_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBit_Str_Literal()
  {
    return bit_Str_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBool_Literal()
  {
    return bool_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChar_Literal()
  {
    return char_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTime_Literal()
  {
    return time_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDuration()
  {
    return durationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTime_Of_Day()
  {
    return time_Of_DayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDaytime()
  {
    return daytimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaytime_Value()
  {
    return (EAttribute)daytimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate()
  {
    return dateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate_And_Time()
  {
    return date_And_TimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageFactory getStLanguageFactory()
  {
    return (StLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    testEClass = createEClass(TEST);
    createEAttribute(testEClass, TEST__TEST);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__VALUE);

    numeric_LiteralEClass = createEClass(NUMERIC_LITERAL);

    int_LiteralEClass = createEClass(INT_LITERAL);

    unsigned_IntEClass = createEClass(UNSIGNED_INT);

    signed_IntEClass = createEClass(SIGNED_INT);

    real_LiteralEClass = createEClass(REAL_LITERAL);

    bit_Str_LiteralEClass = createEClass(BIT_STR_LITERAL);

    bool_LiteralEClass = createEClass(BOOL_LITERAL);

    char_LiteralEClass = createEClass(CHAR_LITERAL);

    time_LiteralEClass = createEClass(TIME_LITERAL);

    durationEClass = createEClass(DURATION);

    time_Of_DayEClass = createEClass(TIME_OF_DAY);

    daytimeEClass = createEClass(DAYTIME);
    createEAttribute(daytimeEClass, DAYTIME__VALUE);

    dateEClass = createEClass(DATE);

    date_And_TimeEClass = createEClass(DATE_AND_TIME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    numeric_LiteralEClass.getESuperTypes().add(this.getConstant());
    int_LiteralEClass.getESuperTypes().add(this.getNumeric_Literal());
    unsigned_IntEClass.getESuperTypes().add(this.getInt_Literal());
    signed_IntEClass.getESuperTypes().add(this.getInt_Literal());
    real_LiteralEClass.getESuperTypes().add(this.getNumeric_Literal());
    bit_Str_LiteralEClass.getESuperTypes().add(this.getConstant());
    bool_LiteralEClass.getESuperTypes().add(this.getConstant());
    char_LiteralEClass.getESuperTypes().add(this.getConstant());
    time_LiteralEClass.getESuperTypes().add(this.getConstant());
    durationEClass.getESuperTypes().add(this.getTime_Literal());
    time_Of_DayEClass.getESuperTypes().add(this.getTime_Literal());
    dateEClass.getESuperTypes().add(this.getTime_Literal());
    date_And_TimeEClass.getESuperTypes().add(this.getTime_Literal());

    // Initialize classes and features; add operations and parameters
    initEClass(testEClass, test.class, "test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettest_Test(), ecorePackage.getEString(), "test", null, 0, 1, test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numeric_LiteralEClass, Numeric_Literal.class, "Numeric_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(int_LiteralEClass, Int_Literal.class, "Int_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unsigned_IntEClass, Unsigned_Int.class, "Unsigned_Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signed_IntEClass, Signed_Int.class, "Signed_Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(real_LiteralEClass, Real_Literal.class, "Real_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bit_Str_LiteralEClass, Bit_Str_Literal.class, "Bit_Str_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bool_LiteralEClass, Bool_Literal.class, "Bool_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(char_LiteralEClass, Char_Literal.class, "Char_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(time_LiteralEClass, Time_Literal.class, "Time_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(time_Of_DayEClass, Time_Of_Day.class, "Time_Of_Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(daytimeEClass, Daytime.class, "Daytime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDaytime_Value(), ecorePackage.getEString(), "value", null, 0, 1, Daytime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(date_And_TimeEClass, Date_And_Time.class, "Date_And_Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //StLanguagePackageImpl
