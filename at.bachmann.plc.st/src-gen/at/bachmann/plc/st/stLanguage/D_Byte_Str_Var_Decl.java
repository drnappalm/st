/**
 */
package at.bachmann.plc.st.stLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DByte Str Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getD_Byte_Str_Var_Decl()
 * @model
 * @generated
 */
public interface D_Byte_Str_Var_Decl extends Str_Var_Decl
{
  /**
   * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' containment reference.
   * @see #setInitialization(D_Byte_Str_Spec)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getD_Byte_Str_Var_Decl_Initialization()
   * @model containment="true"
   * @generated
   */
  D_Byte_Str_Spec getInitialization();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(D_Byte_Str_Spec value);

} // D_Byte_Str_Var_Decl
