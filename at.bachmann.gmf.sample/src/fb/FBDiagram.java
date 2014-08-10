/**
 */
package fb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FB Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fb.FBDiagram#getFbs <em>Fbs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fb.FbPackage#getFBDiagram()
 * @model
 * @generated
 */
public interface FBDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Fbs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fbs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fbs</em>' containment reference.
	 * @see fb.FbPackage#getFBDiagram_Fbs()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	FB getFbs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addFB(FB fb);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeFB(FB fb);

} // FBDiagram
