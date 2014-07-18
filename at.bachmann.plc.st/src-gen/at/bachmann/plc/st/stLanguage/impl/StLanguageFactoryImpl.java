/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StLanguageFactoryImpl extends EFactoryImpl implements StLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StLanguageFactory init()
  {
    try
    {
      StLanguageFactory theStLanguageFactory = (StLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(StLanguagePackage.eNS_URI);
      if (theStLanguageFactory != null)
      {
        return theStLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case StLanguagePackage.TEST: return createtest();
      case StLanguagePackage.CONSTANT: return createConstant();
      case StLanguagePackage.NUMERIC_LITERAL: return createNumeric_Literal();
      case StLanguagePackage.INT_LITERAL: return createInt_Literal();
      case StLanguagePackage.UNSIGNED_INT: return createUnsigned_Int();
      case StLanguagePackage.SIGNED_INT: return createSigned_Int();
      case StLanguagePackage.REAL_LITERAL: return createReal_Literal();
      case StLanguagePackage.BIT_STR_LITERAL: return createBit_Str_Literal();
      case StLanguagePackage.BOOL_LITERAL: return createBool_Literal();
      case StLanguagePackage.CHAR_LITERAL: return createChar_Literal();
      case StLanguagePackage.TIME_LITERAL: return createTime_Literal();
      case StLanguagePackage.DURATION: return createDuration();
      case StLanguagePackage.TIME_OF_DAY: return createTime_Of_Day();
      case StLanguagePackage.DAYTIME: return createDaytime();
      case StLanguagePackage.DATE: return createDate();
      case StLanguagePackage.DATE_AND_TIME: return createDate_And_Time();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public test createtest()
  {
    testImpl test = new testImpl();
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeric_Literal createNumeric_Literal()
  {
    Numeric_LiteralImpl numeric_Literal = new Numeric_LiteralImpl();
    return numeric_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Int_Literal createInt_Literal()
  {
    Int_LiteralImpl int_Literal = new Int_LiteralImpl();
    return int_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unsigned_Int createUnsigned_Int()
  {
    Unsigned_IntImpl unsigned_Int = new Unsigned_IntImpl();
    return unsigned_Int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signed_Int createSigned_Int()
  {
    Signed_IntImpl signed_Int = new Signed_IntImpl();
    return signed_Int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Real_Literal createReal_Literal()
  {
    Real_LiteralImpl real_Literal = new Real_LiteralImpl();
    return real_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bit_Str_Literal createBit_Str_Literal()
  {
    Bit_Str_LiteralImpl bit_Str_Literal = new Bit_Str_LiteralImpl();
    return bit_Str_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool_Literal createBool_Literal()
  {
    Bool_LiteralImpl bool_Literal = new Bool_LiteralImpl();
    return bool_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Char_Literal createChar_Literal()
  {
    Char_LiteralImpl char_Literal = new Char_LiteralImpl();
    return char_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time_Literal createTime_Literal()
  {
    Time_LiteralImpl time_Literal = new Time_LiteralImpl();
    return time_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration createDuration()
  {
    DurationImpl duration = new DurationImpl();
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time_Of_Day createTime_Of_Day()
  {
    Time_Of_DayImpl time_Of_Day = new Time_Of_DayImpl();
    return time_Of_Day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Daytime createDaytime()
  {
    DaytimeImpl daytime = new DaytimeImpl();
    return daytime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date_And_Time createDate_And_Time()
  {
    Date_And_TimeImpl date_And_Time = new Date_And_TimeImpl();
    return date_And_Time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguagePackage getStLanguagePackage()
  {
    return (StLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StLanguagePackage getPackage()
  {
    return StLanguagePackage.eINSTANCE;
  }

} //StLanguageFactoryImpl
