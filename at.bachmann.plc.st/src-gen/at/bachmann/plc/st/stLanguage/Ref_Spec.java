/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Ref_Spec#getRefTos <em>Ref Tos</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Ref_Spec#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getRef_Spec()
 * @model
 * @generated
 */
public interface Ref_Spec extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Tos</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Tos</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Tos</em>' attribute list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getRef_Spec_RefTos()
   * @model unique="false"
   * @generated
   */
  EList<String> getRefTos();

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getRef_Spec_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Ref_Spec#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

} // Ref_Spec
