/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Variable_Address#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Variable_Address#getSize <em>Size</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Variable_Address#getBitIndexes <em>Bit Indexes</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Variable_Address#getBitIndex <em>Bit Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Address()
 * @model
 * @generated
 */
public interface Variable_Address extends EObject
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Address_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Variable_Address#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Address_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Variable_Address#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

  /**
   * Returns the value of the '<em><b>Bit Indexes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bit Indexes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Indexes</em>' attribute list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Address_BitIndexes()
   * @model unique="false"
   * @generated
   */
  EList<String> getBitIndexes();

  /**
   * Returns the value of the '<em><b>Bit Index</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bit Index</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Index</em>' attribute list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getVariable_Address_BitIndex()
   * @model unique="false"
   * @generated
   */
  EList<String> getBitIndex();

} // Variable_Address
