/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POU Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.POU_Decl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.POU_Decl#getPous <em>Pous</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getPOU_Decl()
 * @model
 * @generated
 */
public interface POU_Decl extends ST
{
  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Using_Directive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getPOU_Decl_Usings()
   * @model containment="true"
   * @generated
   */
  EList<Using_Directive> getUsings();

  /**
   * Returns the value of the '<em><b>Pous</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pous</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pous</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getPOU_Decl_Pous()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getPous();

} // POU_Decl
