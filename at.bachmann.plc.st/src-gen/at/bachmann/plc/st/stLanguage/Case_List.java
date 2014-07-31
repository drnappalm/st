/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Case_List#getCaseValues <em>Case Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_List()
 * @model
 * @generated
 */
public interface Case_List extends EObject
{
  /**
   * Returns the value of the '<em><b>Case Values</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Case_List_Elem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Values</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCase_List_CaseValues()
   * @model containment="true"
   * @generated
   */
  EList<Case_List_Elem> getCaseValues();

} // Case_List
