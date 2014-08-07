/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multibit Part Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getBitIndex <em>Bit Index</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMultibit_Part_Access()
 * @model
 * @generated
 */
public interface Multibit_Part_Access extends EObject
{
  /**
   * Returns the value of the '<em><b>Bit Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bit Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Index</em>' attribute.
   * @see #setBitIndex(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMultibit_Part_Access_BitIndex()
   * @model
   * @generated
   */
  String getBitIndex();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getBitIndex <em>Bit Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit Index</em>' attribute.
   * @see #getBitIndex()
   * @generated
   */
  void setBitIndex(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getMultibit_Part_Access_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

} // Multibit_Part_Access
