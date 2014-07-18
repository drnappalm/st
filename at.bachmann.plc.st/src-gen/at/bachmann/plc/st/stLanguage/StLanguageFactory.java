/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage
 * @generated
 */
public interface StLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StLanguageFactory eINSTANCE = at.bachmann.plc.st.stLanguage.impl.StLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>test</em>'.
   * @generated
   */
  test createtest();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal</em>'.
   * @generated
   */
  Numeric_Literal createNumeric_Literal();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  Int_Literal createInt_Literal();

  /**
   * Returns a new object of class '<em>Unsigned Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unsigned Int</em>'.
   * @generated
   */
  Unsigned_Int createUnsigned_Int();

  /**
   * Returns a new object of class '<em>Signed Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signed Int</em>'.
   * @generated
   */
  Signed_Int createSigned_Int();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  Real_Literal createReal_Literal();

  /**
   * Returns a new object of class '<em>Bit Str Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Str Literal</em>'.
   * @generated
   */
  Bit_Str_Literal createBit_Str_Literal();

  /**
   * Returns a new object of class '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Literal</em>'.
   * @generated
   */
  Bool_Literal createBool_Literal();

  /**
   * Returns a new object of class '<em>Char Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Char Literal</em>'.
   * @generated
   */
  Char_Literal createChar_Literal();

  /**
   * Returns a new object of class '<em>Time Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Literal</em>'.
   * @generated
   */
  Time_Literal createTime_Literal();

  /**
   * Returns a new object of class '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duration</em>'.
   * @generated
   */
  Duration createDuration();

  /**
   * Returns a new object of class '<em>Time Of Day</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Of Day</em>'.
   * @generated
   */
  Time_Of_Day createTime_Of_Day();

  /**
   * Returns a new object of class '<em>Daytime</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Daytime</em>'.
   * @generated
   */
  Daytime createDaytime();

  /**
   * Returns a new object of class '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date</em>'.
   * @generated
   */
  Date createDate();

  /**
   * Returns a new object of class '<em>Date And Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date And Time</em>'.
   * @generated
   */
  Date_And_Time createDate_And_Time();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StLanguagePackage getStLanguagePackage();

} //StLanguageFactory
