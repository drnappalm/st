/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Var_Decls#isRetain <em>Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Var_Decls#isNonRetain <em>Non Retain</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Var_Decls#getAccess <em>Access</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Var_Decls#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decls()
 * @model
 * @generated
 */
public interface Var_Decls extends Func_Var_Decls
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decls_Retain()
   * @model
   * @generated
   */
  boolean isRetain();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Var_Decls#isRetain <em>Retain</em>}' attribute.
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decls_NonRetain()
   * @model
   * @generated
   */
  boolean isNonRetain();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Var_Decls#isNonRetain <em>Non Retain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Non Retain</em>' attribute.
   * @see #isNonRetain()
   * @generated
   */
  void setNonRetain(boolean value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decls_Access()
   * @model
   * @generated
   */
  String getAccess();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Var_Decls#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see #getAccess()
   * @generated
   */
  void setAccess(String value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVar_Decls_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getDeclarations();

} // Var_Decls
