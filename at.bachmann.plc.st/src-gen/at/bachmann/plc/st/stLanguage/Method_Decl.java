/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getAccess <em>Access</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#isOverride <em>Override</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getName <em>Name</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getIos <em>Ios</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getTemps <em>Temps</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Decl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl()
 * @model
 * @generated
 */
public interface Method_Decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see #setAccess(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Access()
   * @model
   * @generated
   */
  String getAccess();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see #getAccess()
   * @generated
   */
  void setAccess(String value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Override</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Override</em>' attribute.
   * @see #setOverride(boolean)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Override()
   * @model
   * @generated
   */
  boolean isOverride();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Decl#isOverride <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Override</em>' attribute.
   * @see #isOverride()
   * @generated
   */
  void setOverride(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Method)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Name()
   * @model containment="true"
   * @generated
   */
  Method getName();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Method value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see #setReturnType(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

  /**
   * Returns the value of the '<em><b>Ios</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.IO_Var_Decls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ios</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Ios()
   * @model containment="true"
   * @generated
   */
  EList<IO_Var_Decls> getIos();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Func_Var_Decls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Func_Var_Decls> getVariables();

  /**
   * Returns the value of the '<em><b>Temps</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Temp_Var_Decls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temps</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Temps()
   * @model containment="true"
   * @generated
   */
  EList<Temp_Var_Decls> getTemps();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Func_Body)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Decl_Body()
   * @model containment="true"
   * @generated
   */
  Func_Body getBody();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Func_Body value);

} // Method_Decl
