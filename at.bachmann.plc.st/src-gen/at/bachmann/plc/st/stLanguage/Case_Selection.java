/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Case_Selection#getValues <em>Values</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Case_Selection#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_Selection()
 * @model
 * @generated
 */
public interface Case_Selection extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(Case_List)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_Selection_Values()
   * @model containment="true"
   * @generated
   */
  Case_List getValues();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Case_Selection#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(Case_List value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_Selection_Statements()
   * @model containment="true"
   * @generated
   */
  Stmt_List getStatements();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Case_Selection#getStatements <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' containment reference.
   * @see #getStatements()
   * @generated
   */
  void setStatements(Stmt_List value);

} // Case_Selection
