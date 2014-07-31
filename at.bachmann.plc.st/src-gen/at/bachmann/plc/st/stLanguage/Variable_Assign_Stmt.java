/**
 */
package at.bachmann.plc.st.stLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assign Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getVariable <em>Variable</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Assign_Stmt()
 * @model
 * @generated
 */
public interface Variable_Assign_Stmt extends Assign_Stmt
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
   * @see #setVariable(Variable)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Assign_Stmt_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Assign_Stmt_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // Variable_Assign_Stmt
