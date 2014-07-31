/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Input_Decls#isRetain <em>Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Input_Decls#isNonRetain <em>Non Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Input_Decls#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInput_Decls()
 * @model
 * @generated
 */
public interface Input_Decls extends IO_Var_Decls
{
  /**
   * Returns the value of the '<em><b>Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retain</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retain</em>' attribute.
   * @see #setRetain(boolean)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInput_Decls_Retain()
   * @model
   * @generated
   */
  boolean isRetain();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Input_Decls#isRetain <em>Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retain</em>' attribute.
   * @see #isRetain()
   * @generated
   */
  void setRetain(boolean value);

  /**
   * Returns the value of the '<em><b>Non Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Non Retain</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Non Retain</em>' attribute.
   * @see #setNonRetain(boolean)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInput_Decls_NonRetain()
   * @model
   * @generated
   */
  boolean isNonRetain();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Input_Decls#isNonRetain <em>Non Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Non Retain</em>' attribute.
   * @see #isNonRetain()
   * @generated
   */
  void setNonRetain(boolean value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Input_Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInput_Decls_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Input_Decl> getDeclarations();

} // Input_Decls
