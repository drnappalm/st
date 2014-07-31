/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Struct_Decl#isOverlap <em>Overlap</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Struct_Decl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getStruct_Decl()
 * @model
 * @generated
 */
public interface Struct_Decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Overlap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overlap</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overlap</em>' attribute.
   * @see #setOverlap(boolean)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getStruct_Decl_Overlap()
   * @model
   * @generated
   */
  boolean isOverlap();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Struct_Decl#isOverlap <em>Overlap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overlap</em>' attribute.
   * @see #isOverlap()
   * @generated
   */
  void setOverlap(boolean value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Type_Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getStruct_Decl_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type_Decl> getElements();

} // Struct_Decl
