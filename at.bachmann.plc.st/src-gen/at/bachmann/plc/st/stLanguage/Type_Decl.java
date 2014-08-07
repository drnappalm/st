/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Type_Decl#getName <em>Name</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Type_Decl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Type_Decl#getLocation <em>Location</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Type_Decl#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getType_Decl()
 * @model
 * @generated
 */
public interface Type_Decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getType_Decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' containment reference.
   * @see #setInitialization(EObject)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getType_Decl_Initialization()
   * @model containment="true"
   * @generated
   */
  EObject getInitialization();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(EObject value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(Located_At)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getType_Decl_Location()
   * @model containment="true"
   * @generated
   */
  Located_At getLocation();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Located_At value);

  /**
   * Returns the value of the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' containment reference.
   * @see #setAccess(Multibit_Part_Access)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getType_Decl_Access()
   * @model containment="true"
   * @generated
   */
  Multibit_Part_Access getAccess();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getAccess <em>Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' containment reference.
   * @see #getAccess()
   * @generated
   */
  void setAccess(Multibit_Part_Access value);

} // Type_Decl
