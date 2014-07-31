/**
 */
package at.bachmann.plc.st.stLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Direct_Variable#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getDirect_Variable()
 * @model
 * @generated
 */
public interface Direct_Variable extends Inline_Variable, Located_At
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable_Address)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getDirect_Variable_Variable()
   * @model
   * @generated
   */
  Variable_Address getVariable();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Direct_Variable#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable_Address value);

} // Direct_Variable
