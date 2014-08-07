/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SByte Str Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getBound <em>Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getS_Byte_Str_Spec()
 * @model
 * @generated
 */
public interface S_Byte_Str_Spec extends EObject
{
  /**
   * Returns the value of the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound</em>' containment reference.
   * @see #setBound(Unsigned_Int)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getS_Byte_Str_Spec_Bound()
   * @model containment="true"
   * @generated
   */
  Unsigned_Int getBound();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getBound <em>Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound</em>' containment reference.
   * @see #getBound()
   * @generated
   */
  void setBound(Unsigned_Int value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getS_Byte_Str_Spec_InitialValue()
   * @model
   * @generated
   */
  String getInitialValue();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getInitialValue <em>Initial Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' attribute.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(String value);

} // S_Byte_Str_Spec
