/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInterface_Var_Decl()
 * @model
 * @generated
 */
public interface Interface_Var_Decl extends EObject
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInterface_Var_Decl_Variables()
   * @model containment="true"
   * @generated
   */
  Variable_List getVariables();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(Variable_List value);

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' reference.
   * @see #setInitialization(Interface)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInterface_Var_Decl_Initialization()
   * @model
   * @generated
   */
  Interface getInitialization();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getInitialization <em>Initialization</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(Interface value);

} // Interface_Var_Decl
