/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getEnum_Spec_Init()
 * @model
 * @generated
 */
public interface Enum_Spec_Init extends EObject
{
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getEnum_Spec_Init_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Enum_Value)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getEnum_Spec_Init_Value()
   * @model containment="true"
   * @generated
   */
  Enum_Value getValue();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Enum_Value value);

} // Enum_Spec_Init
