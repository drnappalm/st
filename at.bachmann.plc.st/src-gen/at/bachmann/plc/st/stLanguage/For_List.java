/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.For_List#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.For_List#getUpBound <em>Up Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.For_List#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_List()
 * @model
 * @generated
 */
public interface For_List extends EObject
{
  /**
   * Returns the value of the '<em><b>Low Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low Bound</em>' containment reference.
   * @see #setLowBound(Expression)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_List_LowBound()
   * @model containment="true"
   * @generated
   */
  Expression getLowBound();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.For_List#getLowBound <em>Low Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low Bound</em>' containment reference.
   * @see #getLowBound()
   * @generated
   */
  void setLowBound(Expression value);

  /**
   * Returns the value of the '<em><b>Up Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Up Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Up Bound</em>' containment reference.
   * @see #setUpBound(Expression)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_List_UpBound()
   * @model containment="true"
   * @generated
   */
  Expression getUpBound();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.For_List#getUpBound <em>Up Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Up Bound</em>' containment reference.
   * @see #getUpBound()
   * @generated
   */
  void setUpBound(Expression value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(Expression)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFor_List_Step()
   * @model containment="true"
   * @generated
   */
  Expression getStep();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.For_List#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(Expression value);

} // For_List
