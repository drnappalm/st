/**
 */
package at.bachmann.plc.st.stLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decl_Init()
 * @model
 * @generated
 */
public interface Var_Decl_Init extends Input_Decl, Output_Decl, FB_Input_Decl, FB_Output_Decl
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(Variable_List)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decl_Init_Variables()
   * @model containment="true"
   * @generated
   */
  Variable_List getVariables();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(Variable_List value);

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' containment reference.
   * @see #setInitialization(Spec_Init)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decl_Init_Initialization()
   * @model containment="true"
   * @generated
   */
  Spec_Init getInitialization();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(Spec_Init value);

} // Var_Decl_Init
