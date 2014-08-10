/**
 */
package fb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fb.FbFactory
 * @model kind="package"
 * @generated
 */
public interface FbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bachmann.at/gmf/sample/fb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FbPackage eINSTANCE = fb.impl.FbPackageImpl.init();

	/**
	 * The meta object id for the '{@link fb.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fb.impl.VariableImpl
	 * @see fb.impl.FbPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DIRECTION = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fb.impl.FBImpl <em>FB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fb.impl.FBImpl
	 * @see fb.impl.FbPackageImpl#getFB()
	 * @generated
	 */
	int FB = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB__Y = 3;

	/**
	 * The feature id for the '<em><b>Fbs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB__FBS_TO = 4;

	/**
	 * The feature id for the '<em><b>Fbs From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB__FBS_FROM = 5;

	/**
	 * The number of structural features of the '<em>FB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB___ADD_VARIABLE__VARIABLE = 0;

	/**
	 * The operation id for the '<em>Remove Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB___REMOVE_VARIABLE__VARIABLE = 1;

	/**
	 * The operation id for the '<em>Add Fb To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB___ADD_FB_TO__FB = 2;

	/**
	 * The operation id for the '<em>Add Fb From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB___ADD_FB_FROM__FB = 3;

	/**
	 * The operation id for the '<em>Remove Fb To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB___REMOVE_FB_TO__FB = 4;

	/**
	 * The operation id for the '<em>Remove Fb From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB___REMOVE_FB_FROM__FB = 5;

	/**
	 * The number of operations of the '<em>FB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link fb.impl.FBDiagramImpl <em>FB Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fb.impl.FBDiagramImpl
	 * @see fb.impl.FbPackageImpl#getFBDiagram()
	 * @generated
	 */
	int FB_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Fbs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_DIAGRAM__FBS = 0;

	/**
	 * The number of structural features of the '<em>FB Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add FB</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_DIAGRAM___ADD_FB__FB = 0;

	/**
	 * The operation id for the '<em>Remove FB</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_DIAGRAM___REMOVE_FB__FB = 1;

	/**
	 * The number of operations of the '<em>FB Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_DIAGRAM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link fb.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fb.DataType
	 * @see fb.impl.FbPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 3;

	/**
	 * The meta object id for the '{@link fb.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fb.Direction
	 * @see fb.impl.FbPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 4;


	/**
	 * Returns the meta object for class '{@link fb.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fb.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fb.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fb.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fb.Variable#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see fb.Variable#getDataType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_DataType();

	/**
	 * Returns the meta object for the attribute '{@link fb.Variable#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see fb.Variable#getDirection()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Direction();

	/**
	 * Returns the meta object for class '{@link fb.FB <em>FB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB</em>'.
	 * @see fb.FB
	 * @generated
	 */
	EClass getFB();

	/**
	 * Returns the meta object for the attribute '{@link fb.FB#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fb.FB#getName()
	 * @see #getFB()
	 * @generated
	 */
	EAttribute getFB_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fb.FB#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see fb.FB#getVariables()
	 * @see #getFB()
	 * @generated
	 */
	EReference getFB_Variables();

	/**
	 * Returns the meta object for the attribute '{@link fb.FB#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fb.FB#getX()
	 * @see #getFB()
	 * @generated
	 */
	EAttribute getFB_X();

	/**
	 * Returns the meta object for the attribute '{@link fb.FB#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fb.FB#getY()
	 * @see #getFB()
	 * @generated
	 */
	EAttribute getFB_Y();

	/**
	 * Returns the meta object for the reference '{@link fb.FB#getFbsTo <em>Fbs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fbs To</em>'.
	 * @see fb.FB#getFbsTo()
	 * @see #getFB()
	 * @generated
	 */
	EReference getFB_FbsTo();

	/**
	 * Returns the meta object for the reference '{@link fb.FB#getFbsFrom <em>Fbs From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fbs From</em>'.
	 * @see fb.FB#getFbsFrom()
	 * @see #getFB()
	 * @generated
	 */
	EReference getFB_FbsFrom();

	/**
	 * Returns the meta object for the '{@link fb.FB#addVariable(fb.Variable) <em>Add Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Variable</em>' operation.
	 * @see fb.FB#addVariable(fb.Variable)
	 * @generated
	 */
	EOperation getFB__AddVariable__Variable();

	/**
	 * Returns the meta object for the '{@link fb.FB#removeVariable(fb.Variable) <em>Remove Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Variable</em>' operation.
	 * @see fb.FB#removeVariable(fb.Variable)
	 * @generated
	 */
	EOperation getFB__RemoveVariable__Variable();

	/**
	 * Returns the meta object for the '{@link fb.FB#addFbTo(fb.FB) <em>Add Fb To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Fb To</em>' operation.
	 * @see fb.FB#addFbTo(fb.FB)
	 * @generated
	 */
	EOperation getFB__AddFbTo__FB();

	/**
	 * Returns the meta object for the '{@link fb.FB#addFbFrom(fb.FB) <em>Add Fb From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Fb From</em>' operation.
	 * @see fb.FB#addFbFrom(fb.FB)
	 * @generated
	 */
	EOperation getFB__AddFbFrom__FB();

	/**
	 * Returns the meta object for the '{@link fb.FB#removeFbTo(fb.FB) <em>Remove Fb To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Fb To</em>' operation.
	 * @see fb.FB#removeFbTo(fb.FB)
	 * @generated
	 */
	EOperation getFB__RemoveFbTo__FB();

	/**
	 * Returns the meta object for the '{@link fb.FB#removeFbFrom(fb.FB) <em>Remove Fb From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Fb From</em>' operation.
	 * @see fb.FB#removeFbFrom(fb.FB)
	 * @generated
	 */
	EOperation getFB__RemoveFbFrom__FB();

	/**
	 * Returns the meta object for class '{@link fb.FBDiagram <em>FB Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Diagram</em>'.
	 * @see fb.FBDiagram
	 * @generated
	 */
	EClass getFBDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link fb.FBDiagram#getFbs <em>Fbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fbs</em>'.
	 * @see fb.FBDiagram#getFbs()
	 * @see #getFBDiagram()
	 * @generated
	 */
	EReference getFBDiagram_Fbs();

	/**
	 * Returns the meta object for the '{@link fb.FBDiagram#addFB(fb.FB) <em>Add FB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add FB</em>' operation.
	 * @see fb.FBDiagram#addFB(fb.FB)
	 * @generated
	 */
	EOperation getFBDiagram__AddFB__FB();

	/**
	 * Returns the meta object for the '{@link fb.FBDiagram#removeFB(fb.FB) <em>Remove FB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove FB</em>' operation.
	 * @see fb.FBDiagram#removeFB(fb.FB)
	 * @generated
	 */
	EOperation getFBDiagram__RemoveFB__FB();

	/**
	 * Returns the meta object for enum '{@link fb.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see fb.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link fb.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see fb.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FbFactory getFbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fb.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fb.impl.VariableImpl
		 * @see fb.impl.FbPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DATA_TYPE = eINSTANCE.getVariable_DataType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DIRECTION = eINSTANCE.getVariable_Direction();

		/**
		 * The meta object literal for the '{@link fb.impl.FBImpl <em>FB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fb.impl.FBImpl
		 * @see fb.impl.FbPackageImpl#getFB()
		 * @generated
		 */
		EClass FB = eINSTANCE.getFB();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FB__NAME = eINSTANCE.getFB_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB__VARIABLES = eINSTANCE.getFB_Variables();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FB__X = eINSTANCE.getFB_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FB__Y = eINSTANCE.getFB_Y();

		/**
		 * The meta object literal for the '<em><b>Fbs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB__FBS_TO = eINSTANCE.getFB_FbsTo();

		/**
		 * The meta object literal for the '<em><b>Fbs From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB__FBS_FROM = eINSTANCE.getFB_FbsFrom();

		/**
		 * The meta object literal for the '<em><b>Add Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB___ADD_VARIABLE__VARIABLE = eINSTANCE.getFB__AddVariable__Variable();

		/**
		 * The meta object literal for the '<em><b>Remove Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB___REMOVE_VARIABLE__VARIABLE = eINSTANCE.getFB__RemoveVariable__Variable();

		/**
		 * The meta object literal for the '<em><b>Add Fb To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB___ADD_FB_TO__FB = eINSTANCE.getFB__AddFbTo__FB();

		/**
		 * The meta object literal for the '<em><b>Add Fb From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB___ADD_FB_FROM__FB = eINSTANCE.getFB__AddFbFrom__FB();

		/**
		 * The meta object literal for the '<em><b>Remove Fb To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB___REMOVE_FB_TO__FB = eINSTANCE.getFB__RemoveFbTo__FB();

		/**
		 * The meta object literal for the '<em><b>Remove Fb From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB___REMOVE_FB_FROM__FB = eINSTANCE.getFB__RemoveFbFrom__FB();

		/**
		 * The meta object literal for the '{@link fb.impl.FBDiagramImpl <em>FB Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fb.impl.FBDiagramImpl
		 * @see fb.impl.FbPackageImpl#getFBDiagram()
		 * @generated
		 */
		EClass FB_DIAGRAM = eINSTANCE.getFBDiagram();

		/**
		 * The meta object literal for the '<em><b>Fbs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_DIAGRAM__FBS = eINSTANCE.getFBDiagram_Fbs();

		/**
		 * The meta object literal for the '<em><b>Add FB</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB_DIAGRAM___ADD_FB__FB = eINSTANCE.getFBDiagram__AddFB__FB();

		/**
		 * The meta object literal for the '<em><b>Remove FB</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FB_DIAGRAM___REMOVE_FB__FB = eINSTANCE.getFBDiagram__RemoveFB__FB();

		/**
		 * The meta object literal for the '{@link fb.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fb.DataType
		 * @see fb.impl.FbPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link fb.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fb.Direction
		 * @see fb.impl.FbPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //FbPackage
