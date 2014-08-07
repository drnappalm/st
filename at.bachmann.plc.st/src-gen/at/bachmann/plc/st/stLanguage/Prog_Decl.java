/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getProgram <em>Program</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getIos <em>Ios</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getProg_Decl()
 * @model
 * @generated
 */
public interface Prog_Decl extends ST
{
  /**
   * Returns the value of the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' containment reference.
   * @see #setProgram(Program)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getProg_Decl_Program()
   * @model containment="true"
   * @generated
   */
  Program getProgram();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getProgram <em>Program</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program</em>' containment reference.
   * @see #getProgram()
   * @generated
   */
  void setProgram(Program value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getProg_Decl_Ios()
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getProg_Decl_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Func_Var_Decls> getVariables();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(FB_Body)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getProg_Decl_Body()
   * @model containment="true"
   * @generated
   */
  FB_Body getBody();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(FB_Body value);

} // Prog_Decl
