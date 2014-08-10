/**
 */
package fb.impl;

import fb.DataType;
import fb.Direction;
import fb.FBDiagram;
import fb.FbFactory;
import fb.FbPackage;
import fb.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FbPackageImpl extends EPackageImpl implements FbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fb.FbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FbPackageImpl() {
		super(eNS_URI, FbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FbPackage init() {
		if (isInited) return (FbPackage)EPackage.Registry.INSTANCE.getEPackage(FbPackage.eNS_URI);

		// Obtain or create and register package
		FbPackageImpl theFbPackage = (FbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FbPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFbPackage.createPackageContents();

		// Initialize created meta-data
		theFbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFbPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FbPackage.eNS_URI, theFbPackage);
		return theFbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_DataType() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Direction() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFB() {
		return fbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFB_Name() {
		return (EAttribute)fbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFB_Variables() {
		return (EReference)fbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFB_X() {
		return (EAttribute)fbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFB_Y() {
		return (EAttribute)fbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFB_FbsTo() {
		return (EReference)fbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFB_FbsFrom() {
		return (EReference)fbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFB__AddVariable__Variable() {
		return fbEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFB__RemoveVariable__Variable() {
		return fbEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFB__AddFbTo__FB() {
		return fbEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFB__AddFbFrom__FB() {
		return fbEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFB__RemoveFbTo__FB() {
		return fbEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFB__RemoveFbFrom__FB() {
		return fbEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFBDiagram() {
		return fbDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBDiagram_Fbs() {
		return (EReference)fbDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFBDiagram__AddFB__FB() {
		return fbDiagramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFBDiagram__RemoveFB__FB() {
		return fbDiagramEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbFactory getFbFactory() {
		return (FbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__DATA_TYPE);
		createEAttribute(variableEClass, VARIABLE__DIRECTION);

		fbEClass = createEClass(FB);
		createEAttribute(fbEClass, FB__NAME);
		createEReference(fbEClass, FB__VARIABLES);
		createEAttribute(fbEClass, FB__X);
		createEAttribute(fbEClass, FB__Y);
		createEReference(fbEClass, FB__FBS_TO);
		createEReference(fbEClass, FB__FBS_FROM);
		createEOperation(fbEClass, FB___ADD_VARIABLE__VARIABLE);
		createEOperation(fbEClass, FB___REMOVE_VARIABLE__VARIABLE);
		createEOperation(fbEClass, FB___ADD_FB_TO__FB);
		createEOperation(fbEClass, FB___ADD_FB_FROM__FB);
		createEOperation(fbEClass, FB___REMOVE_FB_TO__FB);
		createEOperation(fbEClass, FB___REMOVE_FB_FROM__FB);

		fbDiagramEClass = createEClass(FB_DIAGRAM);
		createEReference(fbDiagramEClass, FB_DIAGRAM__FBS);
		createEOperation(fbDiagramEClass, FB_DIAGRAM___ADD_FB__FB);
		createEOperation(fbDiagramEClass, FB_DIAGRAM___REMOVE_FB__FB);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		directionEEnum = createEEnum(DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_DataType(), this.getDataType(), "dataType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Direction(), this.getDirection(), "direction", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fbEClass, fb.FB.class, "FB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFB_Name(), ecorePackage.getEString(), "name", null, 0, 1, fb.FB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFB_Variables(), this.getVariable(), null, "variables", null, 0, 1, fb.FB.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFB_X(), ecorePackage.getEInt(), "x", null, 0, 1, fb.FB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFB_Y(), ecorePackage.getEInt(), "y", null, 0, 1, fb.FB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFB_FbsTo(), this.getFB(), this.getFB_FbsFrom(), "fbsTo", null, 0, 1, fb.FB.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFB_FbsFrom(), this.getFB(), this.getFB_FbsTo(), "fbsFrom", null, 0, 1, fb.FB.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFB__AddVariable__Variable(), null, "addVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFB__RemoveVariable__Variable(), null, "removeVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFB__AddFbTo__FB(), null, "addFbTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFB(), "fb", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFB__AddFbFrom__FB(), null, "addFbFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFB(), "fb", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFB__RemoveFbTo__FB(), null, "removeFbTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFB(), "fb", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFB__RemoveFbFrom__FB(), null, "removeFbFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFB(), "fb", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fbDiagramEClass, FBDiagram.class, "FBDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFBDiagram_Fbs(), this.getFB(), null, "fbs", null, 0, 1, FBDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFBDiagram__AddFB__FB(), null, "addFB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFB(), "fb", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFBDiagram__RemoveFB__FB(), null, "removeFB", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFB(), "fb", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INT);
		addEEnumLiteral(dataTypeEEnum, DataType.BYTE);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOL);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.INOUT);

		// Create resource
		createResource(eNS_URI);
	}

} //FbPackageImpl
