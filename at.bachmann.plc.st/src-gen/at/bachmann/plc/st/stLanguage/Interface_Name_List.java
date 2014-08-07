/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Name List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Interface_Name_List#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInterface_Name_List()
 * @model
 * @generated
 */
public interface Interface_Name_List extends EObject
{
  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getInterface_Name_List_Interfaces()
   * @model
   * @generated
   */
  EList<Interface> getInterfaces();

} // Interface_Name_List
