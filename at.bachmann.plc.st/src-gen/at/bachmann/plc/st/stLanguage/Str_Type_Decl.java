/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Str Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getStr_Type_Decl()
 * @model
 * @generated
 */
public interface Str_Type_Decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getStr_Type_Decl_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' attribute.
   * @see #setInitialization(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getStr_Type_Decl_Initialization()
   * @model
   * @generated
   */
  String getInitialization();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialization <em>Initialization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' attribute.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(String value);

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' attribute.
   * @see #setInitialValue(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getStr_Type_Decl_InitialValue()
   * @model
   * @generated
   */
  String getInitialValue();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialValue <em>Initial Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' attribute.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(String value);

} // Str_Type_Decl
