/**
 */
package at.bachmann.plc.st.stLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SByte Str Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getS_Byte_Str_Var_Decl()
 * @model
 * @generated
 */
public interface S_Byte_Str_Var_Decl extends Str_Var_Decl
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
   * @see #setInitialization(S_Byte_Str_Spec)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getS_Byte_Str_Var_Decl_Initialization()
   * @model containment="true"
   * @generated
   */
  S_Byte_Str_Spec getInitialization();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(S_Byte_Str_Spec value);

} // S_Byte_Str_Var_Decl
