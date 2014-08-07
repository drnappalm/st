/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getMethod <em>Method</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getIos <em>Ios</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Prototype()
 * @model
 * @generated
 */
public interface Method_Prototype extends EObject
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(Method)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Prototype_Method()
   * @model containment="true"
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Prototype_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getReturnType <em>Return Type</em>}' attribute.
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMethod_Prototype_Ios()
   * @model containment="true"
   * @generated
   */
  EList<IO_Var_Decls> getIos();

} // Method_Prototype
