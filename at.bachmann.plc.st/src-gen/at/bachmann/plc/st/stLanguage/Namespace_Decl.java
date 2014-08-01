/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#isInternal <em>Internal</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getNamespace_Decl()
 * @model
 * @generated
 */
public interface Namespace_Decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Internal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internal</em>' attribute.
   * @see #setInternal(boolean)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getNamespace_Decl_Internal()
   * @model
   * @generated
   */
  boolean isInternal();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#isInternal <em>Internal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Internal</em>' attribute.
   * @see #isInternal()
   * @generated
   */
  void setInternal(boolean value);

  /**
   * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' containment reference.
   * @see #setNamespace(Namespace)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getNamespace_Decl_Namespace()
   * @model containment="true"
   * @generated
   */
  Namespace getNamespace();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(Namespace value);

  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Using_Directive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getNamespace_Decl_Usings()
   * @model containment="true"
   * @generated
   */
  EList<Using_Directive> getUsings();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Namespace_Elements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getNamespace_Decl_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Namespace_Elements> getElements();

} // Namespace_Decl
