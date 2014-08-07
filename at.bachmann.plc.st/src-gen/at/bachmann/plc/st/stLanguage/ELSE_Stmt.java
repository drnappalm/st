/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELSE Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.ELSE_Stmt#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getELSE_Stmt()
 * @model
 * @generated
 */
public interface ELSE_Stmt extends EObject
{
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getELSE_Stmt_Statements()
   * @model containment="true"
   * @generated
   */
  Stmt_List getStatements();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.ELSE_Stmt#getStatements <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' containment reference.
   * @see #getStatements()
   * @generated
   */
  void setStatements(Stmt_List value);

} // ELSE_Stmt
