/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Out Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.In_Out_Decls#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getIn_Out_Decls()
 * @model
 * @generated
 */
public interface In_Out_Decls extends IO_Var_Decls, FB_IO_Var_Decls
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.In_Out_Var_Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getIn_Out_Decls_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<In_Out_Var_Decl> getDeclarations();

} // In_Out_Decls
