/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getCases <em>Cases</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getDefaultStatements <em>Default Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_Stmt()
 * @model
 * @generated
 */
public interface Case_Stmt extends Selection_Stmt
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Case_Selection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_Stmt_Cases()
   * @model containment="true"
   * @generated
   */
  EList<Case_Selection> getCases();

  /**
   * Returns the value of the '<em><b>Default Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Statements</em>' containment reference.
   * @see #setDefaultStatements(Stmt_List)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_Stmt_DefaultStatements()
   * @model containment="true"
   * @generated
   */
  Stmt_List getDefaultStatements();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getDefaultStatements <em>Default Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Statements</em>' containment reference.
   * @see #getDefaultStatements()
   * @generated
   */
  void setDefaultStatements(Stmt_List value);

} // Case_Stmt
