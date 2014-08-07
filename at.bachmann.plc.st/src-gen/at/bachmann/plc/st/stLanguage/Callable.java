/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Callable#getCallable <em>Callable</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Callable#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCallable()
 * @model
 * @generated
 */
public interface Callable extends EObject
{
  /**
   * Returns the value of the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Callable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callable</em>' reference.
   * @see #setCallable(Function)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCallable_Callable()
   * @model
   * @generated
   */
  Function getCallable();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Callable#getCallable <em>Callable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callable</em>' reference.
   * @see #getCallable()
   * @generated
   */
  void setCallable(Function value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Param_Assign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getCallable_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Param_Assign> getParameters();

} // Callable
