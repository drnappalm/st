/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Func_Decl#getFunction <em>Function</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Func_Decl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Func_Decl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Func_Decl#getIos <em>Ios</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Func_Decl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Func_Decl#getTemps <em>Temps</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Func_Decl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl()
 * @model
 * @generated
 */
public interface Func_Decl extends Namespace_Elements
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(Function)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl_Function()
   * @model containment="true"
   * @generated
   */
  Function getFunction();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Function value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Using_Directive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl_Usings()
   * @model containment="true"
   * @generated
   */
  EList<Using_Directive> getUsings();

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl_Ios()
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl_Variables()
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl_Temps()
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFunc_Decl_Body()
   * @model containment="true"
   * @generated
   */
  Func_Body getBody();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Func_Body value);

} // Func_Decl
