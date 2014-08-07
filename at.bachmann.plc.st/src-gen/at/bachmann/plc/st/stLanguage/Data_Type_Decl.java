/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Data_Type_Decl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getData_Type_Decl()
 * @model
 * @generated
 */
public interface Data_Type_Decl extends Namespace_Elements
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Type_Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getData_Type_Decl_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type_Decl> getTypes();

} // Data_Type_Decl
