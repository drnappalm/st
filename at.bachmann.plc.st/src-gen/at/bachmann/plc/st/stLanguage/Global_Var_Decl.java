/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Decl()
 * @model
 * @generated
 */
public interface Global_Var_Decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Global_Var_Spec)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Decl_Type()
   * @model containment="true"
   * @generated
   */
  Global_Var_Spec getType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Global_Var_Spec value);

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' containment reference.
   * @see #setInitialization(Loc_Var_Spec_Init)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Decl_Initialization()
   * @model containment="true"
   * @generated
   */
  Loc_Var_Spec_Init getInitialization();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(Loc_Var_Spec_Init value);

} // Global_Var_Decl
