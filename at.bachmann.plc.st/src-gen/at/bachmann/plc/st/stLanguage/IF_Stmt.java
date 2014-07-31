/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IF Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getStatements <em>Statements</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getElseifs <em>Elseifs</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getIF_Stmt()
 * @model
 * @generated
 */
public interface IF_Stmt extends Selection_Stmt
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getIF_Stmt_Statements()
   * @model containment="true"
   * @generated
   */
  Stmt_List getStatements();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getStatements <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' containment reference.
   * @see #getStatements()
   * @generated
   */
  void setStatements(Stmt_List value);

  /**
   * Returns the value of the '<em><b>Elseifs</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseifs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseifs</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getIF_Stmt_Elseifs()
   * @model containment="true"
   * @generated
   */
  EList<ELSEIF_Stmt> getElseifs();

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(ELSE_Stmt)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getIF_Stmt_Else()
   * @model containment="true"
   * @generated
   */
  ELSE_Stmt getElse();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(ELSE_Stmt value);

} // IF_Stmt
