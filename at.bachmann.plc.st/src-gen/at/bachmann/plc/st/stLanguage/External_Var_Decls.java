/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Var Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.External_Var_Decls#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getExternal_Var_Decls()
 * @model
 * @generated
 */
public interface External_Var_Decls extends Func_Var_Decls
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.External_Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getExternal_Var_Decls_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<External_Decl> getDeclarations();

} // External_Var_Decls
