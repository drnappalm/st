/**
 */
package at.bachmann.plc.st.stLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.For_Stmt#getVariable <em>Variable</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.For_Stmt#getBounds <em>Bounds</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.For_Stmt#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_Stmt()
 * @model
 * @generated
 */
public interface For_Stmt extends Iteration_Stmt
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_Stmt_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bounds</em>' containment reference.
   * @see #setBounds(For_List)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_Stmt_Bounds()
   * @model containment="true"
   * @generated
   */
  For_List getBounds();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getBounds <em>Bounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bounds</em>' containment reference.
   * @see #getBounds()
   * @generated
   */
  void setBounds(For_List value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference.
   * @see #setStatements(Stmt_List)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_Stmt_Statements()
   * @model containment="true"
   * @generated
   */
  Stmt_List getStatements();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getStatements <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' containment reference.
   * @see #getStatements()
   * @generated
   */
  void setStatements(Stmt_List value);

} // For_Stmt
