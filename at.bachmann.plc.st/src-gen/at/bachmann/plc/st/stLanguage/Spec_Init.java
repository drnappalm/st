/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Spec_Init#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Spec_Init#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Spec_Init#getRange <em>Range</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Spec_Init#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSpec_Init()
 * @model
 * @generated
 */
public interface Spec_Init extends Loc_Var_Spec_Init
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSpec_Init_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference.
   * @see #setInitialValue(EObject)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSpec_Init_InitialValue()
   * @model containment="true"
   * @generated
   */
  EObject getInitialValue();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getInitialValue <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' containment reference.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(EObject value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Subrange)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSpec_Init_Range()
   * @model containment="true"
   * @generated
   */
  Subrange getRange();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Subrange value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Ref_Spec)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSpec_Init_Variable()
   * @model containment="true"
   * @generated
   */
  Ref_Spec getVariable();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Ref_Spec value);

} // Spec_Init
