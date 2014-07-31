/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Linked_Value#isNegated <em>Negated</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Linked_Value#getValue <em>Value</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Linked_Value#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getLinked_Value()
 * @model
 * @generated
 */
public interface Linked_Value extends EObject
{
  /**
   * Returns the value of the '<em><b>Negated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negated</em>' attribute.
   * @see #setNegated(boolean)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getLinked_Value_Negated()
   * @model
   * @generated
   */
  boolean isNegated();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Linked_Value#isNegated <em>Negated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negated</em>' attribute.
   * @see #isNegated()
   * @generated
   */
  void setNegated(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Variable)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getLinked_Value_Value()
   * @model
   * @generated
   */
  Variable getValue();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Linked_Value#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Variable value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getLinked_Value_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Linked_Value#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // Linked_Value
