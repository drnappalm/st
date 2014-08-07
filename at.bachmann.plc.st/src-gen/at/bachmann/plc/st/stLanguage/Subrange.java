/**
 */
package at.bachmann.plc.st.stLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Subrange#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Subrange#getUpBound <em>Up Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSubrange()
 * @model
 * @generated
 */
public interface Subrange extends Case_List_Elem
{
  /**
   * Returns the value of the '<em><b>Low Bound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low Bound</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low Bound</em>' reference.
   * @see #setLowBound(Constant_Expr)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSubrange_LowBound()
   * @model
   * @generated
   */
  Constant_Expr getLowBound();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Subrange#getLowBound <em>Low Bound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low Bound</em>' reference.
   * @see #getLowBound()
   * @generated
   */
  void setLowBound(Constant_Expr value);

  /**
   * Returns the value of the '<em><b>Up Bound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Up Bound</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Up Bound</em>' reference.
   * @see #setUpBound(Constant_Expr)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getSubrange_UpBound()
   * @model
   * @generated
   */
  Constant_Expr getUpBound();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Subrange#getUpBound <em>Up Bound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Up Bound</em>' reference.
   * @see #getUpBound()
   * @generated
   */
  void setUpBound(Constant_Expr value);

} // Subrange
