/**
 */
package at.bachmann.plc.st.stLanguage.util;

import at.bachmann.plc.st.stLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage
 * @generated
 */
public class StLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case StLanguagePackage.TEST:
      {
        test test = (test)theEObject;
        T result = casetest(test);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.NUMERIC_LITERAL:
      {
        Numeric_Literal numeric_Literal = (Numeric_Literal)theEObject;
        T result = caseNumeric_Literal(numeric_Literal);
        if (result == null) result = caseConstant(numeric_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INT_LITERAL:
      {
        Int_Literal int_Literal = (Int_Literal)theEObject;
        T result = caseInt_Literal(int_Literal);
        if (result == null) result = caseNumeric_Literal(int_Literal);
        if (result == null) result = caseConstant(int_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.UNSIGNED_INT:
      {
        Unsigned_Int unsigned_Int = (Unsigned_Int)theEObject;
        T result = caseUnsigned_Int(unsigned_Int);
        if (result == null) result = caseInt_Literal(unsigned_Int);
        if (result == null) result = caseNumeric_Literal(unsigned_Int);
        if (result == null) result = caseConstant(unsigned_Int);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SIGNED_INT:
      {
        Signed_Int signed_Int = (Signed_Int)theEObject;
        T result = caseSigned_Int(signed_Int);
        if (result == null) result = caseInt_Literal(signed_Int);
        if (result == null) result = caseNumeric_Literal(signed_Int);
        if (result == null) result = caseConstant(signed_Int);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REAL_LITERAL:
      {
        Real_Literal real_Literal = (Real_Literal)theEObject;
        T result = caseReal_Literal(real_Literal);
        if (result == null) result = caseNumeric_Literal(real_Literal);
        if (result == null) result = caseConstant(real_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.BIT_STR_LITERAL:
      {
        Bit_Str_Literal bit_Str_Literal = (Bit_Str_Literal)theEObject;
        T result = caseBit_Str_Literal(bit_Str_Literal);
        if (result == null) result = caseConstant(bit_Str_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.BOOL_LITERAL:
      {
        Bool_Literal bool_Literal = (Bool_Literal)theEObject;
        T result = caseBool_Literal(bool_Literal);
        if (result == null) result = caseConstant(bool_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CHAR_LITERAL:
      {
        Char_Literal char_Literal = (Char_Literal)theEObject;
        T result = caseChar_Literal(char_Literal);
        if (result == null) result = caseConstant(char_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TIME_LITERAL:
      {
        Time_Literal time_Literal = (Time_Literal)theEObject;
        T result = caseTime_Literal(time_Literal);
        if (result == null) result = caseConstant(time_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DURATION:
      {
        Duration duration = (Duration)theEObject;
        T result = caseDuration(duration);
        if (result == null) result = caseTime_Literal(duration);
        if (result == null) result = caseConstant(duration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TIME_OF_DAY:
      {
        Time_Of_Day time_Of_Day = (Time_Of_Day)theEObject;
        T result = caseTime_Of_Day(time_Of_Day);
        if (result == null) result = caseTime_Literal(time_Of_Day);
        if (result == null) result = caseConstant(time_Of_Day);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DAYTIME:
      {
        Daytime daytime = (Daytime)theEObject;
        T result = caseDaytime(daytime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DATE:
      {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = caseTime_Literal(date);
        if (result == null) result = caseConstant(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DATE_AND_TIME:
      {
        Date_And_Time date_And_Time = (Date_And_Time)theEObject;
        T result = caseDate_And_Time(date_And_Time);
        if (result == null) result = caseTime_Literal(date_And_Time);
        if (result == null) result = caseConstant(date_And_Time);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetest(test object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumeric_Literal(Numeric_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInt_Literal(Int_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsigned_Int(Unsigned_Int object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigned_Int(Signed_Int object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReal_Literal(Real_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Str Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Str Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBit_Str_Literal(Bit_Str_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBool_Literal(Bool_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Char Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Char Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChar_Literal(Char_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTime_Literal(Time_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDuration(Duration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTime_Of_Day(Time_Of_Day object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Daytime</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Daytime</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaytime(Daytime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate(Date object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date And Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date And Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate_And_Time(Date_And_Time object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //StLanguageSwitch
