/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#isConstant <em>Constant</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#isRetain <em>Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Decls()
 * @model
 * @generated
 */
public interface Global_Var_Decls extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' attribute.
   * @see #setConstant(boolean)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Decls_Constant()
   * @model
   * @generated
   */
  boolean isConstant();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#isConstant <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' attribute.
   * @see #isConstant()
   * @generated
   */
  void setConstant(boolean value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Decls_Retain()
   * @model
   * @generated
   */
  boolean isRetain();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#isRetain <em>Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retain</em>' attribute.
   * @see #isRetain()
   * @generated
   */
  void setRetain(boolean value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Global_Var_Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Decls_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Global_Var_Decl> getDeclarations();

} // Global_Var_Decls
