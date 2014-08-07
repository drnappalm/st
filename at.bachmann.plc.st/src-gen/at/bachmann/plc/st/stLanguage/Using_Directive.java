/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Using_Directive#getImportURI <em>Import URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getUsing_Directive()
 * @model
 * @generated
 */
public interface Using_Directive extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getUsing_Directive_ImportURI()
   * @model unique="false"
   * @generated
   */
  EList<String> getImportURI();

} // Using_Directive
