/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec#getNames <em>Names</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Spec()
 * @model
 * @generated
 */
public interface Global_Var_Spec extends EObject
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Spec_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(Located_At)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getGlobal_Var_Spec_Location()
   * @model containment="true"
   * @generated
   */
  Located_At getLocation();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Located_At value);

} // Global_Var_Spec
