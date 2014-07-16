/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface StLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bachmann.at/plc/st/STLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StLanguagePackage eINSTANCE = at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ST_ProgramImpl <em>ST Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ST_ProgramImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getST_Program()
   * @generated
   */
  int ST_PROGRAM = 0;

  /**
   * The number of structural features of the '<em>ST Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ST_PROGRAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl <em>Data Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getData_Type_Decl()
   * @generated
   */
  int DATA_TYPE_DECL = 1;

  /**
   * The feature id for the '<em><b>Type Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL__TYPE_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Data Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_SpecImpl <em>Struct Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Spec()
   * @generated
   */
  int STRUCT_SPEC = 16;

  /**
   * The number of structural features of the '<em>Struct Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl <em>Struct Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Decl()
   * @generated
   */
  int STRUCT_DECL = 2;

  /**
   * The feature id for the '<em><b>Overlap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECL__OVERLAP = STRUCT_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECL__ELEMENTS = STRUCT_SPEC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Struct Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECL_FEATURE_COUNT = STRUCT_SPEC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getType_Decl()
   * @generated
   */
  int TYPE_DECL = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Simple_Type_DeclImpl <em>Simple Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Simple_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSimple_Type_Decl()
   * @generated
   */
  int SIMPLE_TYPE_DECL = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_DECL__TYPE = TYPE_DECL__TYPE;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_DECL__INITIALIZATION = TYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_DECL_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Subrange_Type_DeclImpl <em>Subrange Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Subrange_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange_Type_Decl()
   * @generated
   */
  int SUBRANGE_TYPE_DECL = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE_DECL__TYPE = TYPE_DECL__TYPE;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE_DECL__INITIALIZATION = TYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subrange Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE_DECL_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Type_DeclImpl <em>Enum Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Enum_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Type_Decl()
   * @generated
   */
  int ENUM_TYPE_DECL = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECL__TYPE = TYPE_DECL__TYPE;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECL__INITIALIZATION = TYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECL_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Type_DeclImpl <em>Array Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Type_Decl()
   * @generated
   */
  int ARRAY_TYPE_DECL = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DECL__TYPE = TYPE_DECL__TYPE;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DECL__INITIALIZATION = TYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DECL_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Type_DeclImpl <em>Struct Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Type_Decl()
   * @generated
   */
  int STRUCT_TYPE_DECL = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DECL__TYPE = TYPE_DECL__TYPE;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DECL__INITIALIZATION = TYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DECL_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Elem_DeclImpl <em>Struct Elem Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_Elem_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Elem_Decl()
   * @generated
   */
  int STRUCT_ELEM_DECL = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_DECL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_DECL__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_DECL__ACCESS = 2;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_DECL__INITIALIZATION = 3;

  /**
   * The number of structural features of the '<em>Struct Elem Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl <em>Str Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Type_Decl()
   * @generated
   */
  int STR_TYPE_DECL = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL__TYPE = TYPE_DECL__TYPE;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL__INITIALIZATION = TYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL__INITIAL_VALUE = TYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Str Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_SpecImpl <em>Var Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Spec()
   * @generated
   */
  int VAR_SPEC = 85;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_SPEC__TYPE = 0;

  /**
   * The number of structural features of the '<em>Var Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Simple_SpecImpl <em>Simple Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Simple_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSimple_Spec()
   * @generated
   */
  int SIMPLE_SPEC = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SPEC__TYPE = VAR_SPEC__TYPE;

  /**
   * The number of structural features of the '<em>Simple Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SPEC_FEATURE_COUNT = VAR_SPEC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Subrange_SpecImpl <em>Subrange Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Subrange_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange_Spec()
   * @generated
   */
  int SUBRANGE_SPEC = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_SPEC__TYPE = 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_SPEC__RANGE = 1;

  /**
   * The feature id for the '<em><b>Ref Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_SPEC__REF_RANGE = 2;

  /**
   * The number of structural features of the '<em>Subrange Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_SPEC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Value_SpecImpl <em>Enum Value Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Enum_Value_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Value_Spec()
   * @generated
   */
  int ENUM_VALUE_SPEC = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_SPEC__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_SPEC__INITIAL_VALUE = 1;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_SPEC__INITIALIZATION = 2;

  /**
   * The number of structural features of the '<em>Enum Value Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_SPEC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Elem_Named_SpecImpl <em>Elem Named Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Elem_Named_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getElem_Named_Spec()
   * @generated
   */
  int ELEM_NAMED_SPEC = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEM_NAMED_SPEC__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEM_NAMED_SPEC__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Elem Named Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEM_NAMED_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_SpecImpl <em>Array Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Spec()
   * @generated
   */
  int ARRAY_SPEC = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPEC__TYPE = VAR_SPEC__TYPE;

  /**
   * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPEC__RANGES = VAR_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPEC__REF_DATA_TYPE = VAR_SPEC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPEC_FEATURE_COUNT = VAR_SPEC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl <em>Loc Var Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Spec_Init()
   * @generated
   */
  int LOC_VAR_SPEC_INIT = 76;

  /**
   * The number of structural features of the '<em>Loc Var Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_SPEC_INIT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Simple_Spec_InitImpl <em>Simple Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Simple_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSimple_Spec_Init()
   * @generated
   */
  int SIMPLE_SPEC_INIT = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SPEC_INIT__TYPE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SPEC_INIT__INITIAL_VALUE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SPEC_INIT_FEATURE_COUNT = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Subrange_Spec_InitImpl <em>Subrange Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Subrange_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange_Spec_Init()
   * @generated
   */
  int SUBRANGE_SPEC_INIT = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_SPEC_INIT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_SPEC_INIT__INITIAL_VALUE = 1;

  /**
   * The number of structural features of the '<em>Subrange Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_SPEC_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl <em>Case List Elem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List_Elem()
   * @generated
   */
  int CASE_LIST_ELEM = 134;

  /**
   * The number of structural features of the '<em>Case List Elem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST_ELEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.SubrangeImpl <em>Subrange</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.SubrangeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange()
   * @generated
   */
  int SUBRANGE = 19;

  /**
   * The feature id for the '<em><b>Low Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__LOW_BOUND = CASE_LIST_ELEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Up Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__UP_BOUND = CASE_LIST_ELEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subrange</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_FEATURE_COUNT = CASE_LIST_ELEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_Spec_InitImpl <em>Named Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Named_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Spec_Init()
   * @generated
   */
  int NAMED_SPEC_INIT = 20;

  /**
   * The feature id for the '<em><b>Initial Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_SPEC_INIT__INITIAL_VALUES = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_SPEC_INIT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Named Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_SPEC_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl <em>Enum Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Spec_Init()
   * @generated
   */
  int ENUM_SPEC_INIT = 21;

  /**
   * The feature id for the '<em><b>Enum Item</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPEC_INIT__ENUM_ITEM = 0;

  /**
   * The feature id for the '<em><b>Ref Enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPEC_INIT__REF_ENUM = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPEC_INIT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Enum Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPEC_INIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Elem_Init_ValueImpl <em>Array Elem Init Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_Elem_Init_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Elem_Init_Value()
   * @generated
   */
  int ARRAY_ELEM_INIT_VALUE = 26;

  /**
   * The number of structural features of the '<em>Array Elem Init Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl <em>Enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Value()
   * @generated
   */
  int ENUM_VALUE = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__LEFT = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__OPERATOR = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__RIGHT = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__EXPRESSION = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__TYPE = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__VALUE = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Enum Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_FEATURE_COUNT = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Spec_InitImpl <em>Array Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Spec_Init()
   * @generated
   */
  int ARRAY_SPEC_INIT = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPEC_INIT__TYPE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPEC_INIT__INITIAL_VALUE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPEC_INIT_FEATURE_COUNT = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_InitImpl <em>Array Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Init()
   * @generated
   */
  int ARRAY_INIT = 24;

  /**
   * The feature id for the '<em><b>Initial Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INIT__INITIAL_VALUES = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INIT_FEATURE_COUNT = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Elem_InitImpl <em>Array Elem Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_Elem_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Elem_Init()
   * @generated
   */
  int ARRAY_ELEM_INIT = 25;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ELEM_INIT__INITIALIZATION = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ELEM_INIT__INITIAL_VALUE = 1;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ELEM_INIT__BOUND = 2;

  /**
   * The number of structural features of the '<em>Array Elem Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ELEM_INIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Spec_InitImpl <em>Struct Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Spec_Init()
   * @generated
   */
  int STRUCT_SPEC_INIT = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_SPEC_INIT__TYPE = STRUCT_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_SPEC_INIT__INITIAL_VALUE = STRUCT_SPEC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Struct Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_SPEC_INIT_FEATURE_COUNT = STRUCT_SPEC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_InitImpl <em>Struct Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Init()
   * @generated
   */
  int STRUCT_INIT = 28;

  /**
   * The feature id for the '<em><b>Element Inits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_INIT__ELEMENT_INITS = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_INIT_FEATURE_COUNT = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Elem_InitImpl <em>Struct Elem Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_Elem_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Elem_Init()
   * @generated
   */
  int STRUCT_ELEM_INIT = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_INIT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_INIT__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Struct Elem Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 38;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl <em>Direct Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDirect_Variable()
   * @generated
   */
  int DIRECT_VARIABLE = 30;

  /**
   * The feature id for the '<em><b>Location Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_VARIABLE__LOCATION_PREFIX = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_VARIABLE__SIZE_PREFIX = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bit Indexes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_VARIABLE__BIT_INDEXES = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Direct Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_Type_DeclImpl <em>Ref Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Type_Decl()
   * @generated
   */
  int REF_TYPE_DECL = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TYPE_DECL__TYPE = TYPE_DECL__TYPE;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TYPE_DECL__INITIALIZATION = TYPE_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TYPE_DECL_FEATURE_COUNT = TYPE_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_Spec_InitImpl <em>Ref Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Spec_Init()
   * @generated
   */
  int REF_SPEC_INIT = 32;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC_INIT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC_INIT__INITIAL_VALUE = 1;

  /**
   * The number of structural features of the '<em>Ref Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl <em>Ref Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Spec()
   * @generated
   */
  int REF_SPEC = 33;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC__REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Ref Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl <em>Ref Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Value()
   * @generated
   */
  int REF_VALUE = 34;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_VALUE__REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Ref Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl <em>Ref Addr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Addr()
   * @generated
   */
  int REF_ADDR = 35;

  /**
   * The feature id for the '<em><b>Referenced Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ADDR__REFERENCED_VAR = 0;

  /**
   * The feature id for the '<em><b>Referenced Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ADDR__REFERENCED_NAME = 1;

  /**
   * The number of structural features of the '<em>Ref Addr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ADDR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl <em>Assign Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssign_Stmt()
   * @generated
   */
  int ASSIGN_STMT = 120;

  /**
   * The number of structural features of the '<em>Assign Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl <em>Ref Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Assign()
   * @generated
   */
  int REF_ASSIGN = 36;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ASSIGN__TYPE = ASSIGN_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ASSIGN__INITIAL_VALUE = ASSIGN_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ASSIGN__INITIALIZATION = ASSIGN_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Ref Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ASSIGN_FEATURE_COUNT = ASSIGN_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl <em>Ref Deref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Deref()
   * @generated
   */
  int REF_DEREF = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_DEREF__NAME = 0;

  /**
   * The number of structural features of the '<em>Ref Deref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_DEREF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl <em>Symbolic Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSymbolic_Variable()
   * @generated
   */
  int SYMBOLIC_VARIABLE = 39;

  /**
   * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC_VARIABLE__QUALIFIERS = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC_VARIABLE__VARIABLE = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Symbolic Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_VariableImpl <em>Struct Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Variable()
   * @generated
   */
  int STRUCT_VARIABLE = 44;

  /**
   * The number of structural features of the '<em>Struct Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VARIABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Elem_SelectImpl <em>Struct Elem Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_Elem_SelectImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Elem_Select()
   * @generated
   */
  int STRUCT_ELEM_SELECT = 45;

  /**
   * The number of structural features of the '<em>Struct Elem Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEM_SELECT_FEATURE_COUNT = STRUCT_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl <em>Var Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Access()
   * @generated
   */
  int VAR_ACCESS = 40;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ACCESS__VARIABLE = STRUCT_ELEM_SELECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ACCESS__REFERENCE = STRUCT_ELEM_SELECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ACCESS_FEATURE_COUNT = STRUCT_ELEM_SELECT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Multi_Elem_VarImpl <em>Multi Elem Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Multi_Elem_VarImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMulti_Elem_Var()
   * @generated
   */
  int MULTI_ELEM_VAR = 41;

  /**
   * The feature id for the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ELEM_VAR__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ELEM_VAR__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Multi Elem Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ELEM_VAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Subscript_ListImpl <em>Subscript List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Subscript_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubscript_List()
   * @generated
   */
  int SUBSCRIPT_LIST = 42;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSCRIPT_LIST__ITEM = 0;

  /**
   * The number of structural features of the '<em>Subscript List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSCRIPT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.SubscriptImpl <em>Subscript</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.SubscriptImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubscript()
   * @generated
   */
  int SUBSCRIPT = 43;

  /**
   * The number of structural features of the '<em>Subscript</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSCRIPT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl <em>IO Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIO_Var_Decls()
   * @generated
   */
  int IO_VAR_DECLS = 88;

  /**
   * The number of structural features of the '<em>IO Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_VAR_DECLS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl <em>Input Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decls()
   * @generated
   */
  int INPUT_DECLS = 46;

  /**
   * The feature id for the '<em><b>Retain Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECLS__RETAIN_TYPE = IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECLS__INPUTS = IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Input Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECLS_FEATURE_COUNT = IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl <em>Input Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decl()
   * @generated
   */
  int INPUT_DECL = 47;

  /**
   * The number of structural features of the '<em>Input Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Edge_DeclImpl <em>Edge Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Edge_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEdge_Decl()
   * @generated
   */
  int EDGE_DECL = 48;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_DECL__VARIABLES = INPUT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Edge Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_DECL__EDGE_TYPE = INPUT_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Edge Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_DECL_FEATURE_COUNT = INPUT_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl <em>Var Decl Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl_Init()
   * @generated
   */
  int VAR_DECL_INIT = 49;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_INIT__VARIABLES = INPUT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_INIT__INITIALIZATION = INPUT_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Decl Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_INIT_FEATURE_COUNT = INPUT_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_Var_DeclImpl <em>Ref Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Var_Decl()
   * @generated
   */
  int REF_VAR_DECL = 50;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_VAR_DECL__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_VAR_DECL__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Ref Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl <em>Interface Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Var_Decl()
   * @generated
   */
  int INTERFACE_VAR_DECL = 51;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VAR_DECL__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VAR_DECL__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Interface Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl <em>Variable List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_List()
   * @generated
   */
  int VARIABLE_LIST = 52;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Variable List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Var_Decl_InitImpl <em>Array Var Decl Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_Var_Decl_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Var_Decl_Init()
   * @generated
   */
  int ARRAY_VAR_DECL_INIT = 53;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VAR_DECL_INIT__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VAR_DECL_INIT__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Array Var Decl Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VAR_DECL_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_ConformandImpl <em>Array Conformand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_ConformandImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Conformand()
   * @generated
   */
  int ARRAY_CONFORMAND = 54;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONFORMAND__DATA_TYPE = 0;

  /**
   * The number of structural features of the '<em>Array Conformand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONFORMAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Conform_DeclImpl <em>Array Conform Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_Conform_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Conform_Decl()
   * @generated
   */
  int ARRAY_CONFORM_DECL = 55;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONFORM_DECL__VARIABLES = INPUT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conformand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONFORM_DECL__CONFORMAND = INPUT_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Conform Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONFORM_DECL_FEATURE_COUNT = INPUT_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Var_Decl_InitImpl <em>Struct Var Decl Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_Var_Decl_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Var_Decl_Init()
   * @generated
   */
  int STRUCT_VAR_DECL_INIT = 56;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VAR_DECL_INIT__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VAR_DECL_INIT__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Struct Var Decl Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VAR_DECL_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl <em>In Out Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Var_Decl()
   * @generated
   */
  int IN_OUT_VAR_DECL = 62;

  /**
   * The number of structural features of the '<em>In Out Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_VAR_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Decl_No_InitImpl <em>FB Decl No Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Decl_No_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl_No_Init()
   * @generated
   */
  int FB_DECL_NO_INIT = 57;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_NO_INIT__NAMES = IN_OUT_VAR_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_NO_INIT__TYPE = IN_OUT_VAR_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>FB Decl No Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_NO_INIT_FEATURE_COUNT = IN_OUT_VAR_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Decl_InitImpl <em>FB Decl Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Decl_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl_Init()
   * @generated
   */
  int FB_DECL_INIT = 58;

  /**
   * The feature id for the '<em><b>Fb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_INIT__FB = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_INIT__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>FB Decl Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl <em>Output Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decls()
   * @generated
   */
  int OUTPUT_DECLS = 59;

  /**
   * The feature id for the '<em><b>Retain Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECLS__RETAIN_TYPE = IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECLS__OUTPUTS = IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Output Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECLS_FEATURE_COUNT = IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl <em>Output Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decl()
   * @generated
   */
  int OUTPUT_DECL = 60;

  /**
   * The number of structural features of the '<em>Output Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl <em>In Out Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Decls()
   * @generated
   */
  int IN_OUT_DECLS = 61;

  /**
   * The feature id for the '<em><b>Inouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_DECLS__INOUTS = IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Out Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_DECLS_FEATURE_COUNT = IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl()
   * @generated
   */
  int VAR_DECL = 63;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VARIABLES = IN_OUT_VAR_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__INITIALIZATION = IN_OUT_VAR_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = IN_OUT_VAR_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Var_DeclImpl <em>Array Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Array_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Var_Decl()
   * @generated
   */
  int ARRAY_VAR_DECL = 64;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VAR_DECL__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VAR_DECL__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Array Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Var_DeclImpl <em>Struct Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Var_Decl()
   * @generated
   */
  int STRUCT_VAR_DECL = 65;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VAR_DECL__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VAR_DECL__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Struct Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl <em>Func Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Var_Decls()
   * @generated
   */
  int FUNC_VAR_DECLS = 89;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_VAR_DECLS__CONSTANT = 0;

  /**
   * The number of structural features of the '<em>Func Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_VAR_DECLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl <em>Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decls()
   * @generated
   */
  int VAR_DECLS = 66;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__CONSTANT = FUNC_VAR_DECLS__CONSTANT;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__ACCESS = FUNC_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__VARIABLES = FUNC_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS_FEATURE_COUNT = FUNC_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Other_Var_DeclsImpl <em>Other Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Other_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOther_Var_Decls()
   * @generated
   */
  int OTHER_VAR_DECLS = 97;

  /**
   * The number of structural features of the '<em>Other Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_VAR_DECLS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Retain_Var_DeclsImpl <em>Retain Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Retain_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRetain_Var_Decls()
   * @generated
   */
  int RETAIN_VAR_DECLS = 67;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETAIN_VAR_DECLS__ACCESS = OTHER_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETAIN_VAR_DECLS__VARIABLES = OTHER_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Retain Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETAIN_VAR_DECLS_FEATURE_COUNT = OTHER_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclsImpl <em>Loc Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Decls()
   * @generated
   */
  int LOC_VAR_DECLS = 68;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECLS__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECLS__VARIABLES = 1;

  /**
   * The number of structural features of the '<em>Loc Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECLS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl <em>Loc Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Decl()
   * @generated
   */
  int LOC_VAR_DECL = 69;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL__INITIALIZATION = 2;

  /**
   * The number of structural features of the '<em>Loc Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl <em>Temp Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTemp_Var_Decls()
   * @generated
   */
  int TEMP_VAR_DECLS = 70;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMP_VAR_DECLS__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Temp Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMP_VAR_DECLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl <em>External Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Var_Decls()
   * @generated
   */
  int EXTERNAL_VAR_DECLS = 71;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VAR_DECLS__CONSTANT = FUNC_VAR_DECLS__CONSTANT;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VAR_DECLS__VARIABLES = FUNC_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VAR_DECLS_FEATURE_COUNT = FUNC_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.External_DeclImpl <em>External Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.External_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Decl()
   * @generated
   */
  int EXTERNAL_DECL = 72;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECL__INITIALIZATION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECL__TYPE = 2;

  /**
   * The number of structural features of the '<em>External Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl <em>Global Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decls()
   * @generated
   */
  int GLOBAL_VAR_DECLS = 73;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLS__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLS__VARIABLES = 1;

  /**
   * The number of structural features of the '<em>Global Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl <em>Global Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decl()
   * @generated
   */
  int GLOBAL_VAR_DECL = 74;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECL__INITIALIZATION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECL__TYPE = 2;

  /**
   * The number of structural features of the '<em>Global Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl <em>Global Var Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Spec()
   * @generated
   */
  int GLOBAL_VAR_SPEC = 75;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_SPEC__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_SPEC__LOCATION = 1;

  /**
   * The number of structural features of the '<em>Global Var Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Located_AtImpl <em>Located At</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Located_AtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLocated_At()
   * @generated
   */
  int LOCATED_AT = 77;

  /**
   * The number of structural features of the '<em>Located At</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATED_AT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl <em>Str Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Var_Decl()
   * @generated
   */
  int STR_VAR_DECL = 78;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_VAR_DECL__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Str Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_VAR_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl <em>SByte Str Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Var_Decl()
   * @generated
   */
  int SBYTE_STR_VAR_DECL = 79;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_VAR_DECL__VARIABLES = STR_VAR_DECL__VARIABLES;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_VAR_DECL__INITIALIZATION = STR_VAR_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SByte Str Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_VAR_DECL_FEATURE_COUNT = STR_VAR_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl <em>SByte Str Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Spec()
   * @generated
   */
  int SBYTE_STR_SPEC = 80;

  /**
   * The feature id for the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_SPEC__BOUND = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_SPEC__INITIAL_VALUE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SByte Str Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_SPEC_FEATURE_COUNT = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl <em>DByte Str Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Var_Decl()
   * @generated
   */
  int DBYTE_STR_VAR_DECL = 81;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_VAR_DECL__VARIABLES = STR_VAR_DECL__VARIABLES;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_VAR_DECL__INITIALIZATION = STR_VAR_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DByte Str Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_VAR_DECL_FEATURE_COUNT = STR_VAR_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl <em>DByte Str Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Spec()
   * @generated
   */
  int DBYTE_STR_SPEC = 82;

  /**
   * The feature id for the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_SPEC__BOUND = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_SPEC__INITIAL_VALUE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DByte Str Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_SPEC_FEATURE_COUNT = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Partly_Var_DeclImpl <em>Loc Partly Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Loc_Partly_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Partly_Var_Decl()
   * @generated
   */
  int LOC_PARTLY_VAR_DECL = 83;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_PARTLY_VAR_DECL__MODIFIER = OTHER_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_PARTLY_VAR_DECL__VARIABLES = OTHER_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loc Partly Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_PARTLY_VAR_DECL_FEATURE_COUNT = OTHER_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Partly_VarImpl <em>Loc Partly Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Loc_Partly_VarImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Partly_Var()
   * @generated
   */
  int LOC_PARTLY_VAR = 84;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_PARTLY_VAR__NAME = 0;

  /**
   * The feature id for the '<em><b>Location Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_PARTLY_VAR__LOCATION_PREFIX = 1;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_PARTLY_VAR__INITIALIZATION = 2;

  /**
   * The number of structural features of the '<em>Loc Partly Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_PARTLY_VAR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.StringVar_SpecImpl <em>String Var Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.StringVar_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStringVar_Spec()
   * @generated
   */
  int STRING_VAR_SPEC = 86;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR_SPEC__TYPE = VAR_SPEC__TYPE;

  /**
   * The feature id for the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR_SPEC__BOUND = VAR_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Var Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAR_SPEC_FEATURE_COUNT = VAR_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl <em>Func Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Decl()
   * @generated
   */
  int FUNC_DECL = 87;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__USINGS = 2;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__IOS = 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__VARIABLES = 4;

  /**
   * The feature id for the '<em><b>Temps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__TEMPS = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__BODY = 6;

  /**
   * The number of structural features of the '<em>Func Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl <em>Func Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Body()
   * @generated
   */
  int FUNC_BODY = 90;

  /**
   * The number of structural features of the '<em>Func Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl <em>FB Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl()
   * @generated
   */
  int FB_DECL = 91;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__NAME = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__USINGS = 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__EXTENDS = 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__IMPLEMENTS = 4;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__IOS = 5;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__VARIABLES = 6;

  /**
   * The feature id for the '<em><b>Temps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__TEMPS = 7;

  /**
   * The feature id for the '<em><b>Others</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__OTHERS = 8;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__METHODS = 9;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__BODY = 10;

  /**
   * The number of structural features of the '<em>FB Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl <em>FB IO Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_IO_Var_Decls()
   * @generated
   */
  int FB_IO_VAR_DECLS = 92;

  /**
   * The number of structural features of the '<em>FB IO Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_IO_VAR_DECLS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl <em>FB Input Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decls()
   * @generated
   */
  int FB_INPUT_DECLS = 93;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECLS__MODIFIER = FB_IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECLS__VARIABLES = FB_IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>FB Input Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECLS_FEATURE_COUNT = FB_IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl <em>FB Input Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decl()
   * @generated
   */
  int FB_INPUT_DECL = 94;

  /**
   * The number of structural features of the '<em>FB Input Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl <em>FB Output Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decls()
   * @generated
   */
  int FB_OUTPUT_DECLS = 95;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECLS__MODIFIER = FB_IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECLS__VARIABLES = FB_IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>FB Output Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECLS_FEATURE_COUNT = FB_IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl <em>FB Output Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decl()
   * @generated
   */
  int FB_OUTPUT_DECL = 96;

  /**
   * The number of structural features of the '<em>FB Output Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.No_Retain_Var_DeclsImpl <em>No Retain Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.No_Retain_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNo_Retain_Var_Decls()
   * @generated
   */
  int NO_RETAIN_VAR_DECLS = 98;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RETAIN_VAR_DECLS__ACCESS = OTHER_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RETAIN_VAR_DECLS__VARIABLES = OTHER_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>No Retain Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RETAIN_VAR_DECLS_FEATURE_COUNT = OTHER_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl <em>FB Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Body()
   * @generated
   */
  int FB_BODY = 99;

  /**
   * The number of structural features of the '<em>FB Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl <em>Method Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Decl()
   * @generated
   */
  int METHOD_DECL = 100;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__OVERRIDE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__NAME = 3;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__RETURN_TYPE = 4;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__IOS = 5;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__VARIABLES = 6;

  /**
   * The feature id for the '<em><b>Temps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__TEMPS = 7;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__BODY = 8;

  /**
   * The number of structural features of the '<em>Method Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl <em>Class Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getClass_Decl()
   * @generated
   */
  int CLASS_DECL = 101;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__NAME = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__USINGS = 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__EXTENDS = 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__IMPLEMENTS = 4;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__VARIABLES = 5;

  /**
   * The feature id for the '<em><b>Others</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__OTHERS = 6;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__METHODS = 7;

  /**
   * The number of structural features of the '<em>Class Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl <em>Interface Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Decl()
   * @generated
   */
  int INTERFACE_DECL = 102;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__USINGS = 1;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__EXTENDS = 2;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__METHODS = 3;

  /**
   * The number of structural features of the '<em>Interface Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl <em>Method Prototype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Prototype()
   * @generated
   */
  int METHOD_PROTOTYPE = 103;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE__IOS = 2;

  /**
   * The number of structural features of the '<em>Method Prototype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Spec_InitImpl <em>Interface Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Spec_Init()
   * @generated
   */
  int INTERFACE_SPEC_INIT = 104;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SPEC_INIT__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SPEC_INIT__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Interface Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SPEC_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_ValueImpl <em>Interface Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Value()
   * @generated
   */
  int INTERFACE_VALUE = 105;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VALUE__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VALUE__VARIABLE_NAME = 1;

  /**
   * The number of structural features of the '<em>Interface Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl <em>Interface Name List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Name_List()
   * @generated
   */
  int INTERFACE_NAME_LIST = 106;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_NAME_LIST__INTERFACES = 0;

  /**
   * The number of structural features of the '<em>Interface Name List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_NAME_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl <em>Prog Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Decl()
   * @generated
   */
  int PROG_DECL = 107;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__NAME = ST_PROGRAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__IOS = ST_PROGRAM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__VARIABLES = ST_PROGRAM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Temps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__TEMPS = ST_PROGRAM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Others</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__OTHERS = ST_PROGRAM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Locals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__LOCALS = ST_PROGRAM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Acesses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__ACESSES = ST_PROGRAM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__BODY = ST_PROGRAM_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Prog Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL_FEATURE_COUNT = ST_PROGRAM_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclsImpl <em>Prog Access Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Access_Decls()
   * @generated
   */
  int PROG_ACCESS_DECLS = 108;

  /**
   * The feature id for the '<em><b>Accesses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECLS__ACCESSES = 0;

  /**
   * The number of structural features of the '<em>Prog Access Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclImpl <em>Prog Access Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Access_Decl()
   * @generated
   */
  int PROG_ACCESS_DECL = 109;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECL__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECL__ACCESS = 2;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECL__DATA_TYPE = 3;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECL__DIRECTION = 4;

  /**
   * The number of structural features of the '<em>Prog Access Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_ACCESS_DECL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Namespace_H_NameImpl <em>Namespace HName</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Namespace_H_NameImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace_H_Name()
   * @generated
   */
  int NAMESPACE_HNAME = 110;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_HNAME__QUALIFIER = 0;

  /**
   * The number of structural features of the '<em>Namespace HName</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_HNAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl <em>Using Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUsing_Directive()
   * @generated
   */
  int USING_DIRECTIVE = 111;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_DIRECTIVE__NAMESPACES = 0;

  /**
   * The number of structural features of the '<em>Using Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_DIRECTIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ExpressionImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 112;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = SUBSCRIPT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR = SUBSCRIPT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = SUBSCRIPT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = SUBSCRIPT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = SUBSCRIPT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl <em>Constant Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant_Expr()
   * @generated
   */
  int CONSTANT_EXPR = 113;

  /**
   * The number of structural features of the '<em>Constant Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPR_FEATURE_COUNT = ARRAY_ELEM_INIT_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl <em>Variable Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Access()
   * @generated
   */
  int VARIABLE_ACCESS = 114;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__ACCESS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl <em>Multibit Part Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMultibit_Part_Access()
   * @generated
   */
  int MULTIBIT_PART_ACCESS = 115;

  /**
   * The feature id for the '<em><b>Access Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIBIT_PART_ACCESS__ACCESS_SIZE = 0;

  /**
   * The feature id for the '<em><b>Access Size Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIBIT_PART_ACCESS__ACCESS_SIZE_INFO = 1;

  /**
   * The number of structural features of the '<em>Multibit Part Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIBIT_PART_ACCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Size_InfoImpl <em>Size Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Size_InfoImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSize_Info()
   * @generated
   */
  int SIZE_INFO = 116;

  /**
   * The feature id for the '<em><b>Size Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_INFO__SIZE_PREFIX = 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_INFO__SIZE = 1;

  /**
   * The number of structural features of the '<em>Size Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_INFO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_CallImpl <em>Func Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Func_CallImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Call()
   * @generated
   */
  int FUNC_CALL = 117;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_CALL__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_CALL__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Func Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl <em>Stmt List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt_List()
   * @generated
   */
  int STMT_LIST = 118;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_LIST__STATEMENT = FUNC_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stmt List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_LIST_FEATURE_COUNT = FUNC_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt()
   * @generated
   */
  int STMT = 119;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl <em>Variable Assign Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Assign_Stmt()
   * @generated
   */
  int VARIABLE_ASSIGN_STMT = 121;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT__LEFT = ASSIGN_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT__RIGHT = ASSIGN_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Assign Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT_FEATURE_COUNT = ASSIGN_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl <em>Assignment Attempt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssignment_Attempt()
   * @generated
   */
  int ASSIGNMENT_ATTEMPT = 122;

  /**
   * The feature id for the '<em><b>Left Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT__LEFT_NAME = ASSIGN_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT__LEFT_REFERENCE = ASSIGN_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT__RIGHT_NAME = ASSIGN_STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT__RIGHT_REFERENCE = ASSIGN_STMT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assignment Attempt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT_FEATURE_COUNT = ASSIGN_STMT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.InvocationImpl <em>Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.InvocationImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInvocation()
   * @generated
   */
  int INVOCATION = 123;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__METHOD = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl <em>Param Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getParam_Assign()
   * @generated
   */
  int PARAM_ASSIGN = 124;

  /**
   * The number of structural features of the '<em>Param Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_ASSIGN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl <em>Named Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Value()
   * @generated
   */
  int NAMED_VALUE = 125;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VALUE__NAME = PARAM_ASSIGN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VALUE__VALUE = PARAM_ASSIGN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VALUE_FEATURE_COUNT = PARAM_ASSIGN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl <em>Linked Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLinked_Value()
   * @generated
   */
  int LINKED_VALUE = 126;

  /**
   * The feature id for the '<em><b>Negated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE__NEGATED = PARAM_ASSIGN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE__NAME = PARAM_ASSIGN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE__VALUE = PARAM_ASSIGN_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Linked Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE_FEATURE_COUNT = PARAM_ASSIGN_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl <em>Selection Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSelection_Stmt()
   * @generated
   */
  int SELECTION_STMT = 127;

  /**
   * The number of structural features of the '<em>Selection Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl <em>IF Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIF_Stmt()
   * @generated
   */
  int IF_STMT = 128;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__CONDITION = SELECTION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__STATEMENTS = SELECTION_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elseifs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__ELSEIFS = SELECTION_STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__ELSE = SELECTION_STMT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>IF Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_FEATURE_COUNT = SELECTION_STMT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl <em>ELSEIF Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSEIF_Stmt()
   * @generated
   */
  int ELSEIF_STMT = 129;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSEIF_STMT__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSEIF_STMT__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>ELSEIF Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSEIF_STMT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl <em>ELSE Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSE_Stmt()
   * @generated
   */
  int ELSE_STMT = 130;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_STMT__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>ELSE Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl <em>Case Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Stmt()
   * @generated
   */
  int CASE_STMT = 131;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__EXPRESSION = SELECTION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__CASES = SELECTION_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__DEFAULT_STATEMENTS = SELECTION_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Case Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT_FEATURE_COUNT = SELECTION_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl <em>Case Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Selection()
   * @generated
   */
  int CASE_SELECTION = 132;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SELECTION__VALUES = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SELECTION__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Case Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SELECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_ListImpl <em>Case List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List()
   * @generated
   */
  int CASE_LIST = 133;

  /**
   * The feature id for the '<em><b>Case Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST__CASE_VALUES = 0;

  /**
   * The number of structural features of the '<em>Case List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl <em>Iteration Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIteration_Stmt()
   * @generated
   */
  int ITERATION_STMT = 135;

  /**
   * The number of structural features of the '<em>Iteration Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl <em>Exit Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExit_Stmt()
   * @generated
   */
  int EXIT_STMT = 136;

  /**
   * The number of structural features of the '<em>Exit Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl <em>Continue Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getContinue_Stmt()
   * @generated
   */
  int CONTINUE_STMT = 137;

  /**
   * The number of structural features of the '<em>Continue Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.For_StmtImpl <em>For Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.For_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_Stmt()
   * @generated
   */
  int FOR_STMT = 138;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__VARIABLE = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__BOUNDS = ITERATION_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__STATEMENTS = ITERATION_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.For_ListImpl <em>For List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.For_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_List()
   * @generated
   */
  int FOR_LIST = 139;

  /**
   * The feature id for the '<em><b>Low Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST__LOW_BOUND = 0;

  /**
   * The feature id for the '<em><b>Up Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST__UP_BOUND = 1;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST__STEP = 2;

  /**
   * The number of structural features of the '<em>For List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.While_StmtImpl <em>While Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.While_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getWhile_Stmt()
   * @generated
   */
  int WHILE_STMT = 140;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__CONDITION = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__STATEMENTS = ITERATION_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl <em>Repeat Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRepeat_Stmt()
   * @generated
   */
  int REPEAT_STMT = 141;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__STATEMENTS = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__CONDITION = ITERATION_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Repeat Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl <em>Xor Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getXor_Expr()
   * @generated
   */
  int XOR_EXPR = 142;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Xor Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.And_ExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.And_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAnd_Expr()
   * @generated
   */
  int AND_EXPR = 143;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl <em>Compare Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCompare_Expr()
   * @generated
   */
  int COMPARE_EXPR = 144;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Compare Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl <em>Equ Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEqu_Expr()
   * @generated
   */
  int EQU_EXPR = 145;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Equ Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl <em>Add Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAdd_Expr()
   * @generated
   */
  int ADD_EXPR = 146;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Add Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.TermImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTerm()
   * @generated
   */
  int TERM = 147;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl <em>Power Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getPower_Expr()
   * @generated
   */
  int POWER_EXPR = 148;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Power Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.ST_Program <em>ST Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ST Program</em>'.
   * @see at.bachmann.plc.st.stLanguage.ST_Program
   * @generated
   */
  EClass getST_Program();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Data_Type_Decl <em>Data Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Data_Type_Decl
   * @generated
   */
  EClass getData_Type_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Data_Type_Decl#getTypeDeclarations <em>Type Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.Data_Type_Decl#getTypeDeclarations()
   * @see #getData_Type_Decl()
   * @generated
   */
  EReference getData_Type_Decl_TypeDeclarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Decl <em>Struct Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Decl
   * @generated
   */
  EClass getStruct_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Struct_Decl#isOverlap <em>Overlap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overlap</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Decl#isOverlap()
   * @see #getStruct_Decl()
   * @generated
   */
  EAttribute getStruct_Decl_Overlap();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Struct_Decl#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Decl#getElements()
   * @see #getStruct_Decl()
   * @generated
   */
  EReference getStruct_Decl_Elements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Type_Decl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl
   * @generated
   */
  EClass getType_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl#getType()
   * @see #getType_Decl()
   * @generated
   */
  EAttribute getType_Decl_Type();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Simple_Type_Decl <em>Simple Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Simple_Type_Decl
   * @generated
   */
  EClass getSimple_Type_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Simple_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Simple_Type_Decl#getInitialization()
   * @see #getSimple_Type_Decl()
   * @generated
   */
  EReference getSimple_Type_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Subrange_Type_Decl <em>Subrange Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Type_Decl
   * @generated
   */
  EClass getSubrange_Type_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Subrange_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Type_Decl#getInitialization()
   * @see #getSubrange_Type_Decl()
   * @generated
   */
  EReference getSubrange_Type_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Enum_Type_Decl <em>Enum Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Type_Decl
   * @generated
   */
  EClass getEnum_Type_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Enum_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Type_Decl#getInitialization()
   * @see #getEnum_Type_Decl()
   * @generated
   */
  EReference getEnum_Type_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Type_Decl <em>Array Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Type_Decl
   * @generated
   */
  EClass getArray_Type_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Type_Decl#getInitialization()
   * @see #getArray_Type_Decl()
   * @generated
   */
  EReference getArray_Type_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Type_Decl <em>Struct Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Type_Decl
   * @generated
   */
  EClass getStruct_Type_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Type_Decl#getInitialization()
   * @see #getStruct_Type_Decl()
   * @generated
   */
  EReference getStruct_Type_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Decl <em>Struct Elem Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Elem Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Decl
   * @generated
   */
  EClass getStruct_Elem_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getType()
   * @see #getStruct_Elem_Decl()
   * @generated
   */
  EAttribute getStruct_Elem_Decl_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getLocation()
   * @see #getStruct_Elem_Decl()
   * @generated
   */
  EReference getStruct_Elem_Decl_Location();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getAccess()
   * @see #getStruct_Elem_Decl()
   * @generated
   */
  EReference getStruct_Elem_Decl_Access();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Decl#getInitialization()
   * @see #getStruct_Elem_Decl()
   * @generated
   */
  EReference getStruct_Elem_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl <em>Str Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Str Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl
   * @generated
   */
  EClass getStr_Type_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialization()
   * @see #getStr_Type_Decl()
   * @generated
   */
  EAttribute getStr_Type_Decl_Initialization();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialValue()
   * @see #getStr_Type_Decl()
   * @generated
   */
  EAttribute getStr_Type_Decl_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Simple_Spec <em>Simple Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Simple_Spec
   * @generated
   */
  EClass getSimple_Spec();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec <em>Subrange Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec
   * @generated
   */
  EClass getSubrange_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec#getType()
   * @see #getSubrange_Spec()
   * @generated
   */
  EAttribute getSubrange_Spec_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec#getRange()
   * @see #getSubrange_Spec()
   * @generated
   */
  EReference getSubrange_Spec_Range();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec#getRefRange <em>Ref Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref Range</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec#getRefRange()
   * @see #getSubrange_Spec()
   * @generated
   */
  EAttribute getSubrange_Spec_RefRange();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Enum_Value_Spec <em>Enum Value Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Value Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value_Spec
   * @generated
   */
  EClass getEnum_Value_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Enum_Value_Spec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value_Spec#getType()
   * @see #getEnum_Value_Spec()
   * @generated
   */
  EAttribute getEnum_Value_Spec_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Enum_Value_Spec#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value_Spec#getInitialValue()
   * @see #getEnum_Value_Spec()
   * @generated
   */
  EAttribute getEnum_Value_Spec_InitialValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Enum_Value_Spec#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value_Spec#getInitialization()
   * @see #getEnum_Value_Spec()
   * @generated
   */
  EReference getEnum_Value_Spec_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Elem_Named_Spec <em>Elem Named Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elem Named Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Elem_Named_Spec
   * @generated
   */
  EClass getElem_Named_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Elem_Named_Spec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Elem_Named_Spec#getType()
   * @see #getElem_Named_Spec()
   * @generated
   */
  EAttribute getElem_Named_Spec_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Elem_Named_Spec#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Elem_Named_Spec#getInitialization()
   * @see #getElem_Named_Spec()
   * @generated
   */
  EReference getElem_Named_Spec_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Spec <em>Array Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec
   * @generated
   */
  EClass getArray_Spec();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Array_Spec#getRanges <em>Ranges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ranges</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec#getRanges()
   * @see #getArray_Spec()
   * @generated
   */
  EReference getArray_Spec_Ranges();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Array_Spec#getRefDataType <em>Ref Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref Data Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec#getRefDataType()
   * @see #getArray_Spec()
   * @generated
   */
  EAttribute getArray_Spec_RefDataType();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Spec <em>Struct Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Spec
   * @generated
   */
  EClass getStruct_Spec();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Simple_Spec_Init <em>Simple Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Simple_Spec_Init
   * @generated
   */
  EClass getSimple_Spec_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Simple_Spec_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Simple_Spec_Init#getType()
   * @see #getSimple_Spec_Init()
   * @generated
   */
  EReference getSimple_Spec_Init_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Simple_Spec_Init#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Simple_Spec_Init#getInitialValue()
   * @see #getSimple_Spec_Init()
   * @generated
   */
  EReference getSimple_Spec_Init_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec_Init <em>Subrange Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec_Init
   * @generated
   */
  EClass getSubrange_Spec_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec_Init#getType()
   * @see #getSubrange_Spec_Init()
   * @generated
   */
  EReference getSubrange_Spec_Init_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec_Init#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec_Init#getInitialValue()
   * @see #getSubrange_Spec_Init()
   * @generated
   */
  EAttribute getSubrange_Spec_Init_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Subrange <em>Subrange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange
   * @generated
   */
  EClass getSubrange();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Subrange#getLowBound <em>Low Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Low Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange#getLowBound()
   * @see #getSubrange()
   * @generated
   */
  EReference getSubrange_LowBound();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Subrange#getUpBound <em>Up Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Up Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange#getUpBound()
   * @see #getSubrange()
   * @generated
   */
  EReference getSubrange_UpBound();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Named_Spec_Init <em>Named Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Spec_Init
   * @generated
   */
  EClass getNamed_Spec_Init();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Named_Spec_Init#getInitialValues <em>Initial Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial Values</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Spec_Init#getInitialValues()
   * @see #getNamed_Spec_Init()
   * @generated
   */
  EReference getNamed_Spec_Init_InitialValues();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Named_Spec_Init#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Spec_Init#getValue()
   * @see #getNamed_Spec_Init()
   * @generated
   */
  EReference getNamed_Spec_Init_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init <em>Enum Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init
   * @generated
   */
  EClass getEnum_Spec_Init();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getEnumItem <em>Enum Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Enum Item</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getEnumItem()
   * @see #getEnum_Spec_Init()
   * @generated
   */
  EAttribute getEnum_Spec_Init_EnumItem();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getRefEnum <em>Ref Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref Enum</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getRefEnum()
   * @see #getEnum_Spec_Init()
   * @generated
   */
  EAttribute getEnum_Spec_Init_RefEnum();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getValue()
   * @see #getEnum_Spec_Init()
   * @generated
   */
  EReference getEnum_Spec_Init_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Enum_Value <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value
   * @generated
   */
  EClass getEnum_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Enum_Value#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value#getType()
   * @see #getEnum_Value()
   * @generated
   */
  EAttribute getEnum_Value_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Enum_Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value#getValue()
   * @see #getEnum_Value()
   * @generated
   */
  EAttribute getEnum_Value_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Spec_Init <em>Array Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec_Init
   * @generated
   */
  EClass getArray_Spec_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Spec_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec_Init#getType()
   * @see #getArray_Spec_Init()
   * @generated
   */
  EReference getArray_Spec_Init_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Spec_Init#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec_Init#getInitialValue()
   * @see #getArray_Spec_Init()
   * @generated
   */
  EReference getArray_Spec_Init_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Init <em>Array Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Init
   * @generated
   */
  EClass getArray_Init();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Array_Init#getInitialValues <em>Initial Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial Values</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Init#getInitialValues()
   * @see #getArray_Init()
   * @generated
   */
  EReference getArray_Init_InitialValues();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Elem_Init <em>Array Elem Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Elem Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Elem_Init
   * @generated
   */
  EClass getArray_Elem_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Elem_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Elem_Init#getInitialization()
   * @see #getArray_Elem_Init()
   * @generated
   */
  EReference getArray_Elem_Init_Initialization();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Array_Elem_Init#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Elem_Init#getInitialValue()
   * @see #getArray_Elem_Init()
   * @generated
   */
  EAttribute getArray_Elem_Init_InitialValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Elem_Init#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Elem_Init#getBound()
   * @see #getArray_Elem_Init()
   * @generated
   */
  EReference getArray_Elem_Init_Bound();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Elem_Init_Value <em>Array Elem Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Elem Init Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Elem_Init_Value
   * @generated
   */
  EClass getArray_Elem_Init_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Spec_Init <em>Struct Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Spec_Init
   * @generated
   */
  EClass getStruct_Spec_Init();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Struct_Spec_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Spec_Init#getType()
   * @see #getStruct_Spec_Init()
   * @generated
   */
  EAttribute getStruct_Spec_Init_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Spec_Init#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Spec_Init#getInitialValue()
   * @see #getStruct_Spec_Init()
   * @generated
   */
  EReference getStruct_Spec_Init_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Init <em>Struct Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Init
   * @generated
   */
  EClass getStruct_Init();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Struct_Init#getElementInits <em>Element Inits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element Inits</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Init#getElementInits()
   * @see #getStruct_Init()
   * @generated
   */
  EReference getStruct_Init_ElementInits();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Init <em>Struct Elem Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Elem Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Init
   * @generated
   */
  EClass getStruct_Elem_Init();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Init#getType()
   * @see #getStruct_Elem_Init()
   * @generated
   */
  EAttribute getStruct_Elem_Init_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Init#getInitialization()
   * @see #getStruct_Elem_Init()
   * @generated
   */
  EReference getStruct_Elem_Init_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Direct_Variable <em>Direct Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Direct_Variable
   * @generated
   */
  EClass getDirect_Variable();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Direct_Variable#getLocationPrefix <em>Location Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location Prefix</em>'.
   * @see at.bachmann.plc.st.stLanguage.Direct_Variable#getLocationPrefix()
   * @see #getDirect_Variable()
   * @generated
   */
  EAttribute getDirect_Variable_LocationPrefix();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Direct_Variable#getSizePrefix <em>Size Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size Prefix</em>'.
   * @see at.bachmann.plc.st.stLanguage.Direct_Variable#getSizePrefix()
   * @see #getDirect_Variable()
   * @generated
   */
  EAttribute getDirect_Variable_SizePrefix();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Direct_Variable#getBitIndexes <em>Bit Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Bit Indexes</em>'.
   * @see at.bachmann.plc.st.stLanguage.Direct_Variable#getBitIndexes()
   * @see #getDirect_Variable()
   * @generated
   */
  EAttribute getDirect_Variable_BitIndexes();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Type_Decl <em>Ref Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Type_Decl
   * @generated
   */
  EClass getRef_Type_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Type_Decl#getInitialization()
   * @see #getRef_Type_Decl()
   * @generated
   */
  EReference getRef_Type_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Spec_Init <em>Ref Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec_Init
   * @generated
   */
  EClass getRef_Spec_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Spec_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec_Init#getType()
   * @see #getRef_Spec_Init()
   * @generated
   */
  EReference getRef_Spec_Init_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Spec_Init#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec_Init#getInitialValue()
   * @see #getRef_Spec_Init()
   * @generated
   */
  EReference getRef_Spec_Init_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Spec <em>Ref Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec
   * @generated
   */
  EClass getRef_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Ref_Spec#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec#getReference()
   * @see #getRef_Spec()
   * @generated
   */
  EAttribute getRef_Spec_Reference();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Value <em>Ref Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Value
   * @generated
   */
  EClass getRef_Value();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Value#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Value#getReference()
   * @see #getRef_Value()
   * @generated
   */
  EReference getRef_Value_Reference();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Addr <em>Ref Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Addr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Addr
   * @generated
   */
  EClass getRef_Addr();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Addr#getReferencedVar <em>Referenced Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Referenced Var</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Addr#getReferencedVar()
   * @see #getRef_Addr()
   * @generated
   */
  EReference getRef_Addr_ReferencedVar();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Ref_Addr#getReferencedName <em>Referenced Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referenced Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Addr#getReferencedName()
   * @see #getRef_Addr()
   * @generated
   */
  EAttribute getRef_Addr_ReferencedName();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Assign <em>Ref Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Assign</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign
   * @generated
   */
  EClass getRef_Assign();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Ref_Assign#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign#getType()
   * @see #getRef_Assign()
   * @generated
   */
  EAttribute getRef_Assign_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Ref_Assign#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign#getInitialValue()
   * @see #getRef_Assign()
   * @generated
   */
  EAttribute getRef_Assign_InitialValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Assign#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign#getInitialization()
   * @see #getRef_Assign()
   * @generated
   */
  EReference getRef_Assign_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Deref <em>Ref Deref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Deref</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Deref
   * @generated
   */
  EClass getRef_Deref();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Ref_Deref#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Deref#getName()
   * @see #getRef_Deref()
   * @generated
   */
  EAttribute getRef_Deref_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Symbolic_Variable <em>Symbolic Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbolic Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Symbolic_Variable
   * @generated
   */
  EClass getSymbolic_Variable();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Symbolic_Variable#getQualifiers <em>Qualifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Qualifiers</em>'.
   * @see at.bachmann.plc.st.stLanguage.Symbolic_Variable#getQualifiers()
   * @see #getSymbolic_Variable()
   * @generated
   */
  EAttribute getSymbolic_Variable_Qualifiers();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Symbolic_Variable#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Symbolic_Variable#getVariable()
   * @see #getSymbolic_Variable()
   * @generated
   */
  EReference getSymbolic_Variable_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Access <em>Var Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Access
   * @generated
   */
  EClass getVar_Access();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Var_Access#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Access#getVariable()
   * @see #getVar_Access()
   * @generated
   */
  EAttribute getVar_Access_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Access#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Access#getReference()
   * @see #getVar_Access()
   * @generated
   */
  EReference getVar_Access_Reference();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Multi_Elem_Var <em>Multi Elem Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Elem Var</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multi_Elem_Var
   * @generated
   */
  EClass getMulti_Elem_Var();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Multi_Elem_Var#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multi_Elem_Var#getAccess()
   * @see #getMulti_Elem_Var()
   * @generated
   */
  EReference getMulti_Elem_Var_Access();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Multi_Elem_Var#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multi_Elem_Var#getElements()
   * @see #getMulti_Elem_Var()
   * @generated
   */
  EReference getMulti_Elem_Var_Elements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Subscript_List <em>Subscript List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subscript List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subscript_List
   * @generated
   */
  EClass getSubscript_List();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Subscript_List#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Item</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subscript_List#getItem()
   * @see #getSubscript_List()
   * @generated
   */
  EReference getSubscript_List_Item();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Subscript <em>Subscript</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subscript</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subscript
   * @generated
   */
  EClass getSubscript();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Variable <em>Struct Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Variable
   * @generated
   */
  EClass getStruct_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Select <em>Struct Elem Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Elem Select</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Select
   * @generated
   */
  EClass getStruct_Elem_Select();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Input_Decls <em>Input Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls
   * @generated
   */
  EClass getInput_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Input_Decls#getRetainType <em>Retain Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls#getRetainType()
   * @see #getInput_Decls()
   * @generated
   */
  EAttribute getInput_Decls_RetainType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Input_Decls#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls#getInputs()
   * @see #getInput_Decls()
   * @generated
   */
  EReference getInput_Decls_Inputs();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Input_Decl <em>Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decl
   * @generated
   */
  EClass getInput_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Edge_Decl <em>Edge Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Edge_Decl
   * @generated
   */
  EClass getEdge_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Edge_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Edge_Decl#getVariables()
   * @see #getEdge_Decl()
   * @generated
   */
  EReference getEdge_Decl_Variables();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Edge_Decl#getEdgeType <em>Edge Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Edge Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Edge_Decl#getEdgeType()
   * @see #getEdge_Decl()
   * @generated
   */
  EAttribute getEdge_Decl_EdgeType();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init <em>Var Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl_Init
   * @generated
   */
  EClass getVar_Decl_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl_Init#getVariables()
   * @see #getVar_Decl_Init()
   * @generated
   */
  EReference getVar_Decl_Init_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl_Init#getInitialization()
   * @see #getVar_Decl_Init()
   * @generated
   */
  EReference getVar_Decl_Init_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Var_Decl <em>Ref Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Var_Decl
   * @generated
   */
  EClass getRef_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Var_Decl#getVariables()
   * @see #getRef_Var_Decl()
   * @generated
   */
  EReference getRef_Var_Decl_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Ref_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Var_Decl#getInitialization()
   * @see #getRef_Var_Decl()
   * @generated
   */
  EReference getRef_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl <em>Interface Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Var_Decl
   * @generated
   */
  EClass getInterface_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getVariables()
   * @see #getInterface_Var_Decl()
   * @generated
   */
  EReference getInterface_Var_Decl_Variables();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getInitialization()
   * @see #getInterface_Var_Decl()
   * @generated
   */
  EAttribute getInterface_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable_List <em>Variable List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_List
   * @generated
   */
  EClass getVariable_List();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Variable_List#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_List#getVariables()
   * @see #getVariable_List()
   * @generated
   */
  EAttribute getVariable_List_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init <em>Array Var Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Var Decl Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init
   * @generated
   */
  EClass getArray_Var_Decl_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init#getVariables()
   * @see #getArray_Var_Decl_Init()
   * @generated
   */
  EReference getArray_Var_Decl_Init_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init#getInitialization()
   * @see #getArray_Var_Decl_Init()
   * @generated
   */
  EReference getArray_Var_Decl_Init_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Conformand <em>Array Conformand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Conformand</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Conformand
   * @generated
   */
  EClass getArray_Conformand();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Array_Conformand#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Conformand#getDataType()
   * @see #getArray_Conformand()
   * @generated
   */
  EAttribute getArray_Conformand_DataType();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Conform_Decl <em>Array Conform Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Conform Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Conform_Decl
   * @generated
   */
  EClass getArray_Conform_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Conform_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Conform_Decl#getVariables()
   * @see #getArray_Conform_Decl()
   * @generated
   */
  EReference getArray_Conform_Decl_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Conform_Decl#getConformand <em>Conformand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conformand</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Conform_Decl#getConformand()
   * @see #getArray_Conform_Decl()
   * @generated
   */
  EReference getArray_Conform_Decl_Conformand();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init <em>Struct Var Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Var Decl Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init
   * @generated
   */
  EClass getStruct_Var_Decl_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init#getVariables()
   * @see #getStruct_Var_Decl_Init()
   * @generated
   */
  EReference getStruct_Var_Decl_Init_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init#getInitialization()
   * @see #getStruct_Var_Decl_Init()
   * @generated
   */
  EReference getStruct_Var_Decl_Init_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Decl_No_Init <em>FB Decl No Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Decl No Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_No_Init
   * @generated
   */
  EClass getFB_Decl_No_Init();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.FB_Decl_No_Init#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_No_Init#getNames()
   * @see #getFB_Decl_No_Init()
   * @generated
   */
  EAttribute getFB_Decl_No_Init_Names();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Decl_No_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_No_Init#getType()
   * @see #getFB_Decl_No_Init()
   * @generated
   */
  EAttribute getFB_Decl_No_Init_Type();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Decl_Init <em>FB Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Decl Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_Init
   * @generated
   */
  EClass getFB_Decl_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl_Init#getFb <em>Fb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fb</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_Init#getFb()
   * @see #getFB_Decl_Init()
   * @generated
   */
  EReference getFB_Decl_Init_Fb();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_Init#getInitialization()
   * @see #getFB_Decl_Init()
   * @generated
   */
  EReference getFB_Decl_Init_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Output_Decls <em>Output Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls
   * @generated
   */
  EClass getOutput_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Output_Decls#getRetainType <em>Retain Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls#getRetainType()
   * @see #getOutput_Decls()
   * @generated
   */
  EAttribute getOutput_Decls_RetainType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Output_Decls#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls#getOutputs()
   * @see #getOutput_Decls()
   * @generated
   */
  EReference getOutput_Decls_Outputs();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Output_Decl <em>Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decl
   * @generated
   */
  EClass getOutput_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.In_Out_Decls <em>In Out Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Decls
   * @generated
   */
  EClass getIn_Out_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.In_Out_Decls#getInouts <em>Inouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inouts</em>'.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Decls#getInouts()
   * @see #getIn_Out_Decls()
   * @generated
   */
  EReference getIn_Out_Decls_Inouts();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.In_Out_Var_Decl <em>In Out Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Var_Decl
   * @generated
   */
  EClass getIn_Out_Var_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Decl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl
   * @generated
   */
  EClass getVar_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl#getVariables()
   * @see #getVar_Decl()
   * @generated
   */
  EReference getVar_Decl_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl#getInitialization()
   * @see #getVar_Decl()
   * @generated
   */
  EReference getVar_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl <em>Array Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl
   * @generated
   */
  EClass getArray_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl#getVariables()
   * @see #getArray_Var_Decl()
   * @generated
   */
  EReference getArray_Var_Decl_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl#getInitialization()
   * @see #getArray_Var_Decl()
   * @generated
   */
  EReference getArray_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl <em>Struct Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl
   * @generated
   */
  EClass getStruct_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl#getVariables()
   * @see #getStruct_Var_Decl()
   * @generated
   */
  EReference getStruct_Var_Decl_Variables();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl#getInitialization()
   * @see #getStruct_Var_Decl()
   * @generated
   */
  EAttribute getStruct_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Decls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls
   * @generated
   */
  EClass getVar_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Var_Decls#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls#getAccess()
   * @see #getVar_Decls()
   * @generated
   */
  EAttribute getVar_Decls_Access();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Var_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls#getVariables()
   * @see #getVar_Decls()
   * @generated
   */
  EReference getVar_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Retain_Var_Decls <em>Retain Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Retain Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Retain_Var_Decls
   * @generated
   */
  EClass getRetain_Var_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Retain_Var_Decls#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Retain_Var_Decls#getAccess()
   * @see #getRetain_Var_Decls()
   * @generated
   */
  EAttribute getRetain_Var_Decls_Access();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Retain_Var_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Retain_Var_Decls#getVariables()
   * @see #getRetain_Var_Decls()
   * @generated
   */
  EReference getRetain_Var_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decls <em>Loc Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decls
   * @generated
   */
  EClass getLoc_Var_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decls#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decls#getModifier()
   * @see #getLoc_Var_Decls()
   * @generated
   */
  EAttribute getLoc_Var_Decls_Modifier();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decls#getVariables()
   * @see #getLoc_Var_Decls()
   * @generated
   */
  EReference getLoc_Var_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl <em>Loc Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl
   * @generated
   */
  EClass getLoc_Var_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getName()
   * @see #getLoc_Var_Decl()
   * @generated
   */
  EAttribute getLoc_Var_Decl_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getLocation()
   * @see #getLoc_Var_Decl()
   * @generated
   */
  EReference getLoc_Var_Decl_Location();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getInitialization()
   * @see #getLoc_Var_Decl()
   * @generated
   */
  EReference getLoc_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Temp_Var_Decls <em>Temp Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Temp Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Temp_Var_Decls
   * @generated
   */
  EClass getTemp_Var_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Temp_Var_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Temp_Var_Decls#getVariables()
   * @see #getTemp_Var_Decls()
   * @generated
   */
  EReference getTemp_Var_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.External_Var_Decls <em>External Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Var_Decls
   * @generated
   */
  EClass getExternal_Var_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.External_Var_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Var_Decls#getVariables()
   * @see #getExternal_Var_Decls()
   * @generated
   */
  EReference getExternal_Var_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.External_Decl <em>External Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Decl
   * @generated
   */
  EClass getExternal_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.External_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Decl#getName()
   * @see #getExternal_Decl()
   * @generated
   */
  EAttribute getExternal_Decl_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.External_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Decl#getInitialization()
   * @see #getExternal_Decl()
   * @generated
   */
  EReference getExternal_Decl_Initialization();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.External_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Decl#getType()
   * @see #getExternal_Decl()
   * @generated
   */
  EAttribute getExternal_Decl_Type();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls <em>Global Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls
   * @generated
   */
  EClass getGlobal_Var_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls#getModifier()
   * @see #getGlobal_Var_Decls()
   * @generated
   */
  EAttribute getGlobal_Var_Decls_Modifier();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls#getVariables()
   * @see #getGlobal_Var_Decls()
   * @generated
   */
  EReference getGlobal_Var_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl <em>Global Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl
   * @generated
   */
  EClass getGlobal_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl#getName()
   * @see #getGlobal_Var_Decl()
   * @generated
   */
  EReference getGlobal_Var_Decl_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl#getInitialization()
   * @see #getGlobal_Var_Decl()
   * @generated
   */
  EReference getGlobal_Var_Decl_Initialization();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl#getType()
   * @see #getGlobal_Var_Decl()
   * @generated
   */
  EAttribute getGlobal_Var_Decl_Type();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec <em>Global Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Var Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Spec
   * @generated
   */
  EClass getGlobal_Var_Spec();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Spec#getVariables()
   * @see #getGlobal_Var_Spec()
   * @generated
   */
  EAttribute getGlobal_Var_Spec_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Spec#getLocation()
   * @see #getGlobal_Var_Spec()
   * @generated
   */
  EReference getGlobal_Var_Spec_Location();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init <em>Loc Var Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Var Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init
   * @generated
   */
  EClass getLoc_Var_Spec_Init();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Located_At <em>Located At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Located At</em>'.
   * @see at.bachmann.plc.st.stLanguage.Located_At
   * @generated
   */
  EClass getLocated_At();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Str_Var_Decl <em>Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Str Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Var_Decl
   * @generated
   */
  EClass getStr_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Str_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Var_Decl#getVariables()
   * @see #getStr_Var_Decl()
   * @generated
   */
  EReference getStr_Var_Decl_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl <em>SByte Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SByte Str Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl
   * @generated
   */
  EClass getS_Byte_Str_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl#getInitialization()
   * @see #getS_Byte_Str_Var_Decl()
   * @generated
   */
  EReference getS_Byte_Str_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec <em>SByte Str Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SByte Str Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec
   * @generated
   */
  EClass getS_Byte_Str_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getBound()
   * @see #getS_Byte_Str_Spec()
   * @generated
   */
  EAttribute getS_Byte_Str_Spec_Bound();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getInitialValue()
   * @see #getS_Byte_Str_Spec()
   * @generated
   */
  EAttribute getS_Byte_Str_Spec_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl <em>DByte Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DByte Str Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl
   * @generated
   */
  EClass getD_Byte_Str_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl#getInitialization()
   * @see #getD_Byte_Str_Var_Decl()
   * @generated
   */
  EReference getD_Byte_Str_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec <em>DByte Str Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DByte Str Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec
   * @generated
   */
  EClass getD_Byte_Str_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getBound()
   * @see #getD_Byte_Str_Spec()
   * @generated
   */
  EAttribute getD_Byte_Str_Spec_Bound();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getInitialValue()
   * @see #getD_Byte_Str_Spec()
   * @generated
   */
  EAttribute getD_Byte_Str_Spec_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl <em>Loc Partly Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Partly Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl
   * @generated
   */
  EClass getLoc_Partly_Var_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl#getModifier()
   * @see #getLoc_Partly_Var_Decl()
   * @generated
   */
  EAttribute getLoc_Partly_Var_Decl_Modifier();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl#getVariables()
   * @see #getLoc_Partly_Var_Decl()
   * @generated
   */
  EReference getLoc_Partly_Var_Decl_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var <em>Loc Partly Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Partly Var</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var
   * @generated
   */
  EClass getLoc_Partly_Var();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var#getName()
   * @see #getLoc_Partly_Var()
   * @generated
   */
  EAttribute getLoc_Partly_Var_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var#getLocationPrefix <em>Location Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location Prefix</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var#getLocationPrefix()
   * @see #getLoc_Partly_Var()
   * @generated
   */
  EAttribute getLoc_Partly_Var_LocationPrefix();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var#getInitialization()
   * @see #getLoc_Partly_Var()
   * @generated
   */
  EReference getLoc_Partly_Var_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Spec <em>Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Spec
   * @generated
   */
  EClass getVar_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Var_Spec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Spec#getType()
   * @see #getVar_Spec()
   * @generated
   */
  EAttribute getVar_Spec_Type();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.StringVar_Spec <em>String Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Var Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.StringVar_Spec
   * @generated
   */
  EClass getStringVar_Spec();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.StringVar_Spec#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.StringVar_Spec#getBound()
   * @see #getStringVar_Spec()
   * @generated
   */
  EAttribute getStringVar_Spec_Bound();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Func_Decl <em>Func Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl
   * @generated
   */
  EClass getFunc_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getName()
   * @see #getFunc_Decl()
   * @generated
   */
  EAttribute getFunc_Decl_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getReturnType()
   * @see #getFunc_Decl()
   * @generated
   */
  EAttribute getFunc_Decl_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getUsings()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getIos()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getVariables()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Temps</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getTemps()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Temps();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getBody()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.IO_Var_Decls <em>IO Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IO Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.IO_Var_Decls
   * @generated
   */
  EClass getIO_Var_Decls();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Func_Var_Decls <em>Func Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Var_Decls
   * @generated
   */
  EClass getFunc_Var_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Func_Var_Decls#isConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Var_Decls#isConstant()
   * @see #getFunc_Var_Decls()
   * @generated
   */
  EAttribute getFunc_Var_Decls_Constant();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Func_Body <em>Func Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Body
   * @generated
   */
  EClass getFunc_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Decl <em>FB Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl
   * @generated
   */
  EClass getFB_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getModifier()
   * @see #getFB_Decl()
   * @generated
   */
  EAttribute getFB_Decl_Modifier();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getName()
   * @see #getFB_Decl()
   * @generated
   */
  EAttribute getFB_Decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getUsings()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Usings();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extends</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getExtends()
   * @see #getFB_Decl()
   * @generated
   */
  EAttribute getFB_Decl_Extends();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implements</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getImplements()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getIos()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getVariables()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Temps</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getTemps()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Temps();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Others</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getOthers()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Others();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getMethods()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Methods();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getBody()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls <em>FB IO Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB IO Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls
   * @generated
   */
  EClass getFB_IO_Var_Decls();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls <em>FB Input Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Input Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls
   * @generated
   */
  EClass getFB_Input_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls#getModifier()
   * @see #getFB_Input_Decls()
   * @generated
   */
  EAttribute getFB_Input_Decls_Modifier();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls#getVariables()
   * @see #getFB_Input_Decls()
   * @generated
   */
  EReference getFB_Input_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decl <em>FB Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Input Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decl
   * @generated
   */
  EClass getFB_Input_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls <em>FB Output Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Output Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls
   * @generated
   */
  EClass getFB_Output_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls#getModifier()
   * @see #getFB_Output_Decls()
   * @generated
   */
  EAttribute getFB_Output_Decls_Modifier();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls#getVariables()
   * @see #getFB_Output_Decls()
   * @generated
   */
  EReference getFB_Output_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decl <em>FB Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Output Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decl
   * @generated
   */
  EClass getFB_Output_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Other_Var_Decls <em>Other Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Other_Var_Decls
   * @generated
   */
  EClass getOther_Var_Decls();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls <em>No Retain Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Retain Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls
   * @generated
   */
  EClass getNo_Retain_Var_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls#getAccess()
   * @see #getNo_Retain_Var_Decls()
   * @generated
   */
  EAttribute getNo_Retain_Var_Decls_Access();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls#getVariables()
   * @see #getNo_Retain_Var_Decls()
   * @generated
   */
  EReference getNo_Retain_Var_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Body <em>FB Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Body
   * @generated
   */
  EClass getFB_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Method_Decl <em>Method Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl
   * @generated
   */
  EClass getMethod_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getAccess()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_Access();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getType()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#isOverride()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_Override();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getName()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getReturnType()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getIos()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getVariables()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Temps</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getTemps()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Temps();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getBody()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Class_Decl <em>Class Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl
   * @generated
   */
  EClass getClass_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getModifier()
   * @see #getClass_Decl()
   * @generated
   */
  EAttribute getClass_Decl_Modifier();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getName()
   * @see #getClass_Decl()
   * @generated
   */
  EAttribute getClass_Decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getUsings()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Usings();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extends</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getExtends()
   * @see #getClass_Decl()
   * @generated
   */
  EAttribute getClass_Decl_Extends();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getImplements()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getVariables()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Others</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getOthers()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Others();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getMethods()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Methods();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Decl <em>Interface Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl
   * @generated
   */
  EClass getInterface_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getName()
   * @see #getInterface_Decl()
   * @generated
   */
  EAttribute getInterface_Decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getUsings()
   * @see #getInterface_Decl()
   * @generated
   */
  EReference getInterface_Decl_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getExtends()
   * @see #getInterface_Decl()
   * @generated
   */
  EReference getInterface_Decl_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getMethods()
   * @see #getInterface_Decl()
   * @generated
   */
  EReference getInterface_Decl_Methods();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Method_Prototype <em>Method Prototype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Prototype</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype
   * @generated
   */
  EClass getMethod_Prototype();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype#getName()
   * @see #getMethod_Prototype()
   * @generated
   */
  EAttribute getMethod_Prototype_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype#getReturnType()
   * @see #getMethod_Prototype()
   * @generated
   */
  EAttribute getMethod_Prototype_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype#getIos()
   * @see #getMethod_Prototype()
   * @generated
   */
  EReference getMethod_Prototype_Ios();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Spec_Init <em>Interface Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Spec_Init
   * @generated
   */
  EClass getInterface_Spec_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Interface_Spec_Init#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Spec_Init#getVariables()
   * @see #getInterface_Spec_Init()
   * @generated
   */
  EReference getInterface_Spec_Init_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Interface_Spec_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Spec_Init#getInitialization()
   * @see #getInterface_Spec_Init()
   * @generated
   */
  EReference getInterface_Spec_Init_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Value <em>Interface Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Value
   * @generated
   */
  EClass getInterface_Value();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Interface_Value#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Value#getVariable()
   * @see #getInterface_Value()
   * @generated
   */
  EReference getInterface_Value_Variable();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Interface_Value#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Value#getVariableName()
   * @see #getInterface_Value()
   * @generated
   */
  EAttribute getInterface_Value_VariableName();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Name_List <em>Interface Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Name List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Name_List
   * @generated
   */
  EClass getInterface_Name_List();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Interface_Name_List#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Name_List#getInterfaces()
   * @see #getInterface_Name_List()
   * @generated
   */
  EAttribute getInterface_Name_List_Interfaces();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Prog_Decl <em>Prog Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prog Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl
   * @generated
   */
  EClass getProg_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getName()
   * @see #getProg_Decl()
   * @generated
   */
  EAttribute getProg_Decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getIos()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getVariables()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Temps</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getTemps()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Temps();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Others</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getOthers()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Others();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getLocals <em>Locals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locals</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getLocals()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Locals();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getAcesses <em>Acesses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Acesses</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getAcesses()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Acesses();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getBody()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decls <em>Prog Access Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prog Access Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decls
   * @generated
   */
  EClass getProg_Access_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decls#getAccesses <em>Accesses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accesses</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decls#getAccesses()
   * @see #getProg_Access_Decls()
   * @generated
   */
  EReference getProg_Access_Decls_Accesses();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decl <em>Prog Access Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prog Access Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decl
   * @generated
   */
  EClass getProg_Access_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getName()
   * @see #getProg_Access_Decl()
   * @generated
   */
  EAttribute getProg_Access_Decl_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getVariable()
   * @see #getProg_Access_Decl()
   * @generated
   */
  EReference getProg_Access_Decl_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getAccess()
   * @see #getProg_Access_Decl()
   * @generated
   */
  EReference getProg_Access_Decl_Access();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getDataType()
   * @see #getProg_Access_Decl()
   * @generated
   */
  EAttribute getProg_Access_Decl_DataType();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decl#getDirection()
   * @see #getProg_Access_Decl()
   * @generated
   */
  EAttribute getProg_Access_Decl_Direction();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Namespace_H_Name <em>Namespace HName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace HName</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_H_Name
   * @generated
   */
  EClass getNamespace_H_Name();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Namespace_H_Name#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Qualifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_H_Name#getQualifier()
   * @see #getNamespace_H_Name()
   * @generated
   */
  EAttribute getNamespace_H_Name_Qualifier();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Using_Directive <em>Using Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using Directive</em>'.
   * @see at.bachmann.plc.st.stLanguage.Using_Directive
   * @generated
   */
  EClass getUsing_Directive();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Using_Directive#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespaces</em>'.
   * @see at.bachmann.plc.st.stLanguage.Using_Directive#getNamespaces()
   * @see #getUsing_Directive()
   * @generated
   */
  EReference getUsing_Directive_Namespaces();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Constant_Expr <em>Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Constant_Expr
   * @generated
   */
  EClass getConstant_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable_Access <em>Variable Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Access
   * @generated
   */
  EClass getVariable_Access();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Variable_Access#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Access#getVariable()
   * @see #getVariable_Access()
   * @generated
   */
  EReference getVariable_Access_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Variable_Access#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Access#getAccess()
   * @see #getVariable_Access()
   * @generated
   */
  EReference getVariable_Access_Access();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access <em>Multibit Part Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multibit Part Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multibit_Part_Access
   * @generated
   */
  EClass getMultibit_Part_Access();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getAccessSize <em>Access Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access Size</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getAccessSize()
   * @see #getMultibit_Part_Access()
   * @generated
   */
  EAttribute getMultibit_Part_Access_AccessSize();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getAccessSizeInfo <em>Access Size Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Size Info</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getAccessSizeInfo()
   * @see #getMultibit_Part_Access()
   * @generated
   */
  EReference getMultibit_Part_Access_AccessSizeInfo();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Size_Info <em>Size Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Info</em>'.
   * @see at.bachmann.plc.st.stLanguage.Size_Info
   * @generated
   */
  EClass getSize_Info();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Size_Info#getSizePrefix <em>Size Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size Prefix</em>'.
   * @see at.bachmann.plc.st.stLanguage.Size_Info#getSizePrefix()
   * @see #getSize_Info()
   * @generated
   */
  EAttribute getSize_Info_SizePrefix();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Size_Info#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see at.bachmann.plc.st.stLanguage.Size_Info#getSize()
   * @see #getSize_Info()
   * @generated
   */
  EAttribute getSize_Info_Size();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Func_Call <em>Func Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Call</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Call
   * @generated
   */
  EClass getFunc_Call();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Func_Call#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Call#getAccess()
   * @see #getFunc_Call()
   * @generated
   */
  EAttribute getFunc_Call_Access();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Call#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Call#getParameters()
   * @see #getFunc_Call()
   * @generated
   */
  EReference getFunc_Call_Parameters();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Stmt_List <em>Stmt List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Stmt_List
   * @generated
   */
  EClass getStmt_List();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Stmt_List#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see at.bachmann.plc.st.stLanguage.Stmt_List#getStatement()
   * @see #getStmt_List()
   * @generated
   */
  EReference getStmt_List_Statement();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Assign_Stmt <em>Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assign_Stmt
   * @generated
   */
  EClass getAssign_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt <em>Variable Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assign Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt
   * @generated
   */
  EClass getVariable_Assign_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getLeft()
   * @see #getVariable_Assign_Stmt()
   * @generated
   */
  EReference getVariable_Assign_Stmt_Left();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getRight()
   * @see #getVariable_Assign_Stmt()
   * @generated
   */
  EReference getVariable_Assign_Stmt_Right();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt <em>Assignment Attempt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Attempt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt
   * @generated
   */
  EClass getAssignment_Attempt();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt#getLeftName <em>Left Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt#getLeftName()
   * @see #getAssignment_Attempt()
   * @generated
   */
  EAttribute getAssignment_Attempt_LeftName();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt#getLeftReference <em>Left Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Reference</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt#getLeftReference()
   * @see #getAssignment_Attempt()
   * @generated
   */
  EReference getAssignment_Attempt_LeftReference();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt#getRightName <em>Right Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt#getRightName()
   * @see #getAssignment_Attempt()
   * @generated
   */
  EAttribute getAssignment_Attempt_RightName();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt#getRightReference <em>Right Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Reference</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt#getRightReference()
   * @see #getAssignment_Attempt()
   * @generated
   */
  EReference getAssignment_Attempt_RightReference();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Invocation <em>Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invocation</em>'.
   * @see at.bachmann.plc.st.stLanguage.Invocation
   * @generated
   */
  EClass getInvocation();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Invocation#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see at.bachmann.plc.st.stLanguage.Invocation#getMethod()
   * @see #getInvocation()
   * @generated
   */
  EAttribute getInvocation_Method();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Invocation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see at.bachmann.plc.st.stLanguage.Invocation#getParameters()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_Parameters();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Param_Assign <em>Param Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Assign</em>'.
   * @see at.bachmann.plc.st.stLanguage.Param_Assign
   * @generated
   */
  EClass getParam_Assign();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Named_Value <em>Named Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Value
   * @generated
   */
  EClass getNamed_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Named_Value#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Value#getName()
   * @see #getNamed_Value()
   * @generated
   */
  EAttribute getNamed_Value_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Named_Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Value#getValue()
   * @see #getNamed_Value()
   * @generated
   */
  EReference getNamed_Value_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Linked_Value <em>Linked Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linked Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value
   * @generated
   */
  EClass getLinked_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Linked_Value#isNegated <em>Negated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negated</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value#isNegated()
   * @see #getLinked_Value()
   * @generated
   */
  EAttribute getLinked_Value_Negated();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Linked_Value#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value#getName()
   * @see #getLinked_Value()
   * @generated
   */
  EAttribute getLinked_Value_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Linked_Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value#getValue()
   * @see #getLinked_Value()
   * @generated
   */
  EReference getLinked_Value_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Selection_Stmt <em>Selection Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Selection_Stmt
   * @generated
   */
  EClass getSelection_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.IF_Stmt <em>IF Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IF Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt
   * @generated
   */
  EClass getIF_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt#getCondition()
   * @see #getIF_Stmt()
   * @generated
   */
  EReference getIF_Stmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt#getStatements()
   * @see #getIF_Stmt()
   * @generated
   */
  EReference getIF_Stmt_Statements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getElseifs <em>Elseifs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseifs</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt#getElseifs()
   * @see #getIF_Stmt()
   * @generated
   */
  EReference getIF_Stmt_Elseifs();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt#getElse()
   * @see #getIF_Stmt()
   * @generated
   */
  EReference getIF_Stmt_Else();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt <em>ELSEIF Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ELSEIF Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSEIF_Stmt
   * @generated
   */
  EClass getELSEIF_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getCondition()
   * @see #getELSEIF_Stmt()
   * @generated
   */
  EReference getELSEIF_Stmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getStatements()
   * @see #getELSEIF_Stmt()
   * @generated
   */
  EReference getELSEIF_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.ELSE_Stmt <em>ELSE Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ELSE Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSE_Stmt
   * @generated
   */
  EClass getELSE_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.ELSE_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSE_Stmt#getStatements()
   * @see #getELSE_Stmt()
   * @generated
   */
  EReference getELSE_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_Stmt <em>Case Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt
   * @generated
   */
  EClass getCase_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt#getExpression()
   * @see #getCase_Stmt()
   * @generated
   */
  EReference getCase_Stmt_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt#getCases()
   * @see #getCase_Stmt()
   * @generated
   */
  EReference getCase_Stmt_Cases();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getDefaultStatements <em>Default Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt#getDefaultStatements()
   * @see #getCase_Stmt()
   * @generated
   */
  EReference getCase_Stmt_DefaultStatements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_Selection <em>Case Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Selection</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Selection
   * @generated
   */
  EClass getCase_Selection();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Case_Selection#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Selection#getValues()
   * @see #getCase_Selection()
   * @generated
   */
  EReference getCase_Selection_Values();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Case_Selection#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Selection#getStatements()
   * @see #getCase_Selection()
   * @generated
   */
  EReference getCase_Selection_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_List <em>Case List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_List
   * @generated
   */
  EClass getCase_List();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Case_List#getCaseValues <em>Case Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Values</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_List#getCaseValues()
   * @see #getCase_List()
   * @generated
   */
  EReference getCase_List_CaseValues();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_List_Elem <em>Case List Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case List Elem</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_List_Elem
   * @generated
   */
  EClass getCase_List_Elem();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Iteration_Stmt <em>Iteration Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Iteration_Stmt
   * @generated
   */
  EClass getIteration_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Exit_Stmt <em>Exit Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Exit_Stmt
   * @generated
   */
  EClass getExit_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Continue_Stmt <em>Continue Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continue Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Continue_Stmt
   * @generated
   */
  EClass getContinue_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.For_Stmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt
   * @generated
   */
  EClass getFor_Stmt();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt#getVariable()
   * @see #getFor_Stmt()
   * @generated
   */
  EAttribute getFor_Stmt_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getBounds <em>Bounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounds</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt#getBounds()
   * @see #getFor_Stmt()
   * @generated
   */
  EReference getFor_Stmt_Bounds();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt#getStatements()
   * @see #getFor_Stmt()
   * @generated
   */
  EReference getFor_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.For_List <em>For List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For List</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List
   * @generated
   */
  EClass getFor_List();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_List#getLowBound <em>Low Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Low Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List#getLowBound()
   * @see #getFor_List()
   * @generated
   */
  EReference getFor_List_LowBound();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_List#getUpBound <em>Up Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Up Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List#getUpBound()
   * @see #getFor_List()
   * @generated
   */
  EReference getFor_List_UpBound();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_List#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Step</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List#getStep()
   * @see #getFor_List()
   * @generated
   */
  EReference getFor_List_Step();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.While_Stmt <em>While Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.While_Stmt
   * @generated
   */
  EClass getWhile_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.While_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.While_Stmt#getCondition()
   * @see #getWhile_Stmt()
   * @generated
   */
  EReference getWhile_Stmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.While_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.While_Stmt#getStatements()
   * @see #getWhile_Stmt()
   * @generated
   */
  EReference getWhile_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Repeat_Stmt <em>Repeat Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Repeat_Stmt
   * @generated
   */
  EClass getRepeat_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Repeat_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Repeat_Stmt#getStatements()
   * @see #getRepeat_Stmt()
   * @generated
   */
  EReference getRepeat_Stmt_Statements();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Repeat_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.Repeat_Stmt#getCondition()
   * @see #getRepeat_Stmt()
   * @generated
   */
  EReference getRepeat_Stmt_Condition();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Xor_Expr <em>Xor Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Xor_Expr
   * @generated
   */
  EClass getXor_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.And_Expr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.And_Expr
   * @generated
   */
  EClass getAnd_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Compare_Expr <em>Compare Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Compare_Expr
   * @generated
   */
  EClass getCompare_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Equ_Expr <em>Equ Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equ Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Equ_Expr
   * @generated
   */
  EClass getEqu_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Add_Expr <em>Add Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Add_Expr
   * @generated
   */
  EClass getAdd_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see at.bachmann.plc.st.stLanguage.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Power_Expr <em>Power Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Power_Expr
   * @generated
   */
  EClass getPower_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StLanguageFactory getStLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ST_ProgramImpl <em>ST Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ST_ProgramImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getST_Program()
     * @generated
     */
    EClass ST_PROGRAM = eINSTANCE.getST_Program();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl <em>Data Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getData_Type_Decl()
     * @generated
     */
    EClass DATA_TYPE_DECL = eINSTANCE.getData_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Type Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_DECL__TYPE_DECLARATIONS = eINSTANCE.getData_Type_Decl_TypeDeclarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl <em>Struct Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Decl()
     * @generated
     */
    EClass STRUCT_DECL = eINSTANCE.getStruct_Decl();

    /**
     * The meta object literal for the '<em><b>Overlap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_DECL__OVERLAP = eINSTANCE.getStruct_Decl_Overlap();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECL__ELEMENTS = eINSTANCE.getStruct_Decl_Elements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl <em>Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getType_Decl()
     * @generated
     */
    EClass TYPE_DECL = eINSTANCE.getType_Decl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECL__TYPE = eINSTANCE.getType_Decl_Type();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Simple_Type_DeclImpl <em>Simple Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Simple_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSimple_Type_Decl()
     * @generated
     */
    EClass SIMPLE_TYPE_DECL = eINSTANCE.getSimple_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_TYPE_DECL__INITIALIZATION = eINSTANCE.getSimple_Type_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Subrange_Type_DeclImpl <em>Subrange Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Subrange_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange_Type_Decl()
     * @generated
     */
    EClass SUBRANGE_TYPE_DECL = eINSTANCE.getSubrange_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_TYPE_DECL__INITIALIZATION = eINSTANCE.getSubrange_Type_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Type_DeclImpl <em>Enum Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Enum_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Type_Decl()
     * @generated
     */
    EClass ENUM_TYPE_DECL = eINSTANCE.getEnum_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_DECL__INITIALIZATION = eINSTANCE.getEnum_Type_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Type_DeclImpl <em>Array Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Type_Decl()
     * @generated
     */
    EClass ARRAY_TYPE_DECL = eINSTANCE.getArray_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE_DECL__INITIALIZATION = eINSTANCE.getArray_Type_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Type_DeclImpl <em>Struct Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Type_Decl()
     * @generated
     */
    EClass STRUCT_TYPE_DECL = eINSTANCE.getStruct_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_TYPE_DECL__INITIALIZATION = eINSTANCE.getStruct_Type_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Elem_DeclImpl <em>Struct Elem Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_Elem_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Elem_Decl()
     * @generated
     */
    EClass STRUCT_ELEM_DECL = eINSTANCE.getStruct_Elem_Decl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_ELEM_DECL__TYPE = eINSTANCE.getStruct_Elem_Decl_Type();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ELEM_DECL__LOCATION = eINSTANCE.getStruct_Elem_Decl_Location();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ELEM_DECL__ACCESS = eINSTANCE.getStruct_Elem_Decl_Access();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ELEM_DECL__INITIALIZATION = eINSTANCE.getStruct_Elem_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl <em>Str Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Type_Decl()
     * @generated
     */
    EClass STR_TYPE_DECL = eINSTANCE.getStr_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STR_TYPE_DECL__INITIALIZATION = eINSTANCE.getStr_Type_Decl_Initialization();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STR_TYPE_DECL__INITIAL_VALUE = eINSTANCE.getStr_Type_Decl_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Simple_SpecImpl <em>Simple Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Simple_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSimple_Spec()
     * @generated
     */
    EClass SIMPLE_SPEC = eINSTANCE.getSimple_Spec();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Subrange_SpecImpl <em>Subrange Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Subrange_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange_Spec()
     * @generated
     */
    EClass SUBRANGE_SPEC = eINSTANCE.getSubrange_Spec();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE_SPEC__TYPE = eINSTANCE.getSubrange_Spec_Type();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_SPEC__RANGE = eINSTANCE.getSubrange_Spec_Range();

    /**
     * The meta object literal for the '<em><b>Ref Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE_SPEC__REF_RANGE = eINSTANCE.getSubrange_Spec_RefRange();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Value_SpecImpl <em>Enum Value Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Enum_Value_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Value_Spec()
     * @generated
     */
    EClass ENUM_VALUE_SPEC = eINSTANCE.getEnum_Value_Spec();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE_SPEC__TYPE = eINSTANCE.getEnum_Value_Spec_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE_SPEC__INITIAL_VALUE = eINSTANCE.getEnum_Value_Spec_InitialValue();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_VALUE_SPEC__INITIALIZATION = eINSTANCE.getEnum_Value_Spec_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Elem_Named_SpecImpl <em>Elem Named Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Elem_Named_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getElem_Named_Spec()
     * @generated
     */
    EClass ELEM_NAMED_SPEC = eINSTANCE.getElem_Named_Spec();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEM_NAMED_SPEC__TYPE = eINSTANCE.getElem_Named_Spec_Type();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEM_NAMED_SPEC__INITIALIZATION = eINSTANCE.getElem_Named_Spec_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_SpecImpl <em>Array Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Spec()
     * @generated
     */
    EClass ARRAY_SPEC = eINSTANCE.getArray_Spec();

    /**
     * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_SPEC__RANGES = eINSTANCE.getArray_Spec_Ranges();

    /**
     * The meta object literal for the '<em><b>Ref Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_SPEC__REF_DATA_TYPE = eINSTANCE.getArray_Spec_RefDataType();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_SpecImpl <em>Struct Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Spec()
     * @generated
     */
    EClass STRUCT_SPEC = eINSTANCE.getStruct_Spec();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Simple_Spec_InitImpl <em>Simple Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Simple_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSimple_Spec_Init()
     * @generated
     */
    EClass SIMPLE_SPEC_INIT = eINSTANCE.getSimple_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SPEC_INIT__TYPE = eINSTANCE.getSimple_Spec_Init_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SPEC_INIT__INITIAL_VALUE = eINSTANCE.getSimple_Spec_Init_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Subrange_Spec_InitImpl <em>Subrange Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Subrange_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange_Spec_Init()
     * @generated
     */
    EClass SUBRANGE_SPEC_INIT = eINSTANCE.getSubrange_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE_SPEC_INIT__TYPE = eINSTANCE.getSubrange_Spec_Init_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE_SPEC_INIT__INITIAL_VALUE = eINSTANCE.getSubrange_Spec_Init_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.SubrangeImpl <em>Subrange</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.SubrangeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange()
     * @generated
     */
    EClass SUBRANGE = eINSTANCE.getSubrange();

    /**
     * The meta object literal for the '<em><b>Low Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE__LOW_BOUND = eINSTANCE.getSubrange_LowBound();

    /**
     * The meta object literal for the '<em><b>Up Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE__UP_BOUND = eINSTANCE.getSubrange_UpBound();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_Spec_InitImpl <em>Named Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Named_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Spec_Init()
     * @generated
     */
    EClass NAMED_SPEC_INIT = eINSTANCE.getNamed_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Initial Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_SPEC_INIT__INITIAL_VALUES = eINSTANCE.getNamed_Spec_Init_InitialValues();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_SPEC_INIT__VALUE = eINSTANCE.getNamed_Spec_Init_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl <em>Enum Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Spec_Init()
     * @generated
     */
    EClass ENUM_SPEC_INIT = eINSTANCE.getEnum_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Enum Item</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_SPEC_INIT__ENUM_ITEM = eINSTANCE.getEnum_Spec_Init_EnumItem();

    /**
     * The meta object literal for the '<em><b>Ref Enum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_SPEC_INIT__REF_ENUM = eINSTANCE.getEnum_Spec_Init_RefEnum();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_SPEC_INIT__VALUE = eINSTANCE.getEnum_Spec_Init_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl <em>Enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Value()
     * @generated
     */
    EClass ENUM_VALUE = eINSTANCE.getEnum_Value();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE__TYPE = eINSTANCE.getEnum_Value_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnum_Value_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Spec_InitImpl <em>Array Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Spec_Init()
     * @generated
     */
    EClass ARRAY_SPEC_INIT = eINSTANCE.getArray_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_SPEC_INIT__TYPE = eINSTANCE.getArray_Spec_Init_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_SPEC_INIT__INITIAL_VALUE = eINSTANCE.getArray_Spec_Init_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_InitImpl <em>Array Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Init()
     * @generated
     */
    EClass ARRAY_INIT = eINSTANCE.getArray_Init();

    /**
     * The meta object literal for the '<em><b>Initial Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INIT__INITIAL_VALUES = eINSTANCE.getArray_Init_InitialValues();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Elem_InitImpl <em>Array Elem Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_Elem_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Elem_Init()
     * @generated
     */
    EClass ARRAY_ELEM_INIT = eINSTANCE.getArray_Elem_Init();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ELEM_INIT__INITIALIZATION = eINSTANCE.getArray_Elem_Init_Initialization();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_ELEM_INIT__INITIAL_VALUE = eINSTANCE.getArray_Elem_Init_InitialValue();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ELEM_INIT__BOUND = eINSTANCE.getArray_Elem_Init_Bound();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Elem_Init_ValueImpl <em>Array Elem Init Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_Elem_Init_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Elem_Init_Value()
     * @generated
     */
    EClass ARRAY_ELEM_INIT_VALUE = eINSTANCE.getArray_Elem_Init_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Spec_InitImpl <em>Struct Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Spec_Init()
     * @generated
     */
    EClass STRUCT_SPEC_INIT = eINSTANCE.getStruct_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_SPEC_INIT__TYPE = eINSTANCE.getStruct_Spec_Init_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_SPEC_INIT__INITIAL_VALUE = eINSTANCE.getStruct_Spec_Init_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_InitImpl <em>Struct Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Init()
     * @generated
     */
    EClass STRUCT_INIT = eINSTANCE.getStruct_Init();

    /**
     * The meta object literal for the '<em><b>Element Inits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_INIT__ELEMENT_INITS = eINSTANCE.getStruct_Init_ElementInits();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Elem_InitImpl <em>Struct Elem Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_Elem_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Elem_Init()
     * @generated
     */
    EClass STRUCT_ELEM_INIT = eINSTANCE.getStruct_Elem_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_ELEM_INIT__TYPE = eINSTANCE.getStruct_Elem_Init_Type();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ELEM_INIT__INITIALIZATION = eINSTANCE.getStruct_Elem_Init_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl <em>Direct Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDirect_Variable()
     * @generated
     */
    EClass DIRECT_VARIABLE = eINSTANCE.getDirect_Variable();

    /**
     * The meta object literal for the '<em><b>Location Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_VARIABLE__LOCATION_PREFIX = eINSTANCE.getDirect_Variable_LocationPrefix();

    /**
     * The meta object literal for the '<em><b>Size Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_VARIABLE__SIZE_PREFIX = eINSTANCE.getDirect_Variable_SizePrefix();

    /**
     * The meta object literal for the '<em><b>Bit Indexes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_VARIABLE__BIT_INDEXES = eINSTANCE.getDirect_Variable_BitIndexes();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_Type_DeclImpl <em>Ref Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Type_Decl()
     * @generated
     */
    EClass REF_TYPE_DECL = eINSTANCE.getRef_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_TYPE_DECL__INITIALIZATION = eINSTANCE.getRef_Type_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_Spec_InitImpl <em>Ref Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Spec_Init()
     * @generated
     */
    EClass REF_SPEC_INIT = eINSTANCE.getRef_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_SPEC_INIT__TYPE = eINSTANCE.getRef_Spec_Init_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_SPEC_INIT__INITIAL_VALUE = eINSTANCE.getRef_Spec_Init_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl <em>Ref Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Spec()
     * @generated
     */
    EClass REF_SPEC = eINSTANCE.getRef_Spec();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_SPEC__REFERENCE = eINSTANCE.getRef_Spec_Reference();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl <em>Ref Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Value()
     * @generated
     */
    EClass REF_VALUE = eINSTANCE.getRef_Value();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_VALUE__REFERENCE = eINSTANCE.getRef_Value_Reference();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl <em>Ref Addr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Addr()
     * @generated
     */
    EClass REF_ADDR = eINSTANCE.getRef_Addr();

    /**
     * The meta object literal for the '<em><b>Referenced Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ADDR__REFERENCED_VAR = eINSTANCE.getRef_Addr_ReferencedVar();

    /**
     * The meta object literal for the '<em><b>Referenced Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_ADDR__REFERENCED_NAME = eINSTANCE.getRef_Addr_ReferencedName();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl <em>Ref Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Assign()
     * @generated
     */
    EClass REF_ASSIGN = eINSTANCE.getRef_Assign();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_ASSIGN__TYPE = eINSTANCE.getRef_Assign_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_ASSIGN__INITIAL_VALUE = eINSTANCE.getRef_Assign_InitialValue();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ASSIGN__INITIALIZATION = eINSTANCE.getRef_Assign_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl <em>Ref Deref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Deref()
     * @generated
     */
    EClass REF_DEREF = eINSTANCE.getRef_Deref();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_DEREF__NAME = eINSTANCE.getRef_Deref_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl <em>Symbolic Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSymbolic_Variable()
     * @generated
     */
    EClass SYMBOLIC_VARIABLE = eINSTANCE.getSymbolic_Variable();

    /**
     * The meta object literal for the '<em><b>Qualifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOLIC_VARIABLE__QUALIFIERS = eINSTANCE.getSymbolic_Variable_Qualifiers();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOLIC_VARIABLE__VARIABLE = eINSTANCE.getSymbolic_Variable_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl <em>Var Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Access()
     * @generated
     */
    EClass VAR_ACCESS = eINSTANCE.getVar_Access();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_ACCESS__VARIABLE = eINSTANCE.getVar_Access_Variable();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_ACCESS__REFERENCE = eINSTANCE.getVar_Access_Reference();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Multi_Elem_VarImpl <em>Multi Elem Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Multi_Elem_VarImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMulti_Elem_Var()
     * @generated
     */
    EClass MULTI_ELEM_VAR = eINSTANCE.getMulti_Elem_Var();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_ELEM_VAR__ACCESS = eINSTANCE.getMulti_Elem_Var_Access();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_ELEM_VAR__ELEMENTS = eINSTANCE.getMulti_Elem_Var_Elements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Subscript_ListImpl <em>Subscript List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Subscript_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubscript_List()
     * @generated
     */
    EClass SUBSCRIPT_LIST = eINSTANCE.getSubscript_List();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSCRIPT_LIST__ITEM = eINSTANCE.getSubscript_List_Item();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.SubscriptImpl <em>Subscript</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.SubscriptImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubscript()
     * @generated
     */
    EClass SUBSCRIPT = eINSTANCE.getSubscript();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_VariableImpl <em>Struct Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Variable()
     * @generated
     */
    EClass STRUCT_VARIABLE = eINSTANCE.getStruct_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Elem_SelectImpl <em>Struct Elem Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_Elem_SelectImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Elem_Select()
     * @generated
     */
    EClass STRUCT_ELEM_SELECT = eINSTANCE.getStruct_Elem_Select();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl <em>Input Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decls()
     * @generated
     */
    EClass INPUT_DECLS = eINSTANCE.getInput_Decls();

    /**
     * The meta object literal for the '<em><b>Retain Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_DECLS__RETAIN_TYPE = eINSTANCE.getInput_Decls_RetainType();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_DECLS__INPUTS = eINSTANCE.getInput_Decls_Inputs();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl <em>Input Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decl()
     * @generated
     */
    EClass INPUT_DECL = eINSTANCE.getInput_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Edge_DeclImpl <em>Edge Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Edge_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEdge_Decl()
     * @generated
     */
    EClass EDGE_DECL = eINSTANCE.getEdge_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_DECL__VARIABLES = eINSTANCE.getEdge_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Edge Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_DECL__EDGE_TYPE = eINSTANCE.getEdge_Decl_EdgeType();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl <em>Var Decl Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl_Init()
     * @generated
     */
    EClass VAR_DECL_INIT = eINSTANCE.getVar_Decl_Init();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL_INIT__VARIABLES = eINSTANCE.getVar_Decl_Init_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL_INIT__INITIALIZATION = eINSTANCE.getVar_Decl_Init_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_Var_DeclImpl <em>Ref Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Var_Decl()
     * @generated
     */
    EClass REF_VAR_DECL = eINSTANCE.getRef_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_VAR_DECL__VARIABLES = eINSTANCE.getRef_Var_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_VAR_DECL__INITIALIZATION = eINSTANCE.getRef_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl <em>Interface Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Var_Decl()
     * @generated
     */
    EClass INTERFACE_VAR_DECL = eINSTANCE.getInterface_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_VAR_DECL__VARIABLES = eINSTANCE.getInterface_Var_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_VAR_DECL__INITIALIZATION = eINSTANCE.getInterface_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl <em>Variable List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_List()
     * @generated
     */
    EClass VARIABLE_LIST = eINSTANCE.getVariable_List();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_LIST__VARIABLES = eINSTANCE.getVariable_List_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Var_Decl_InitImpl <em>Array Var Decl Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_Var_Decl_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Var_Decl_Init()
     * @generated
     */
    EClass ARRAY_VAR_DECL_INIT = eINSTANCE.getArray_Var_Decl_Init();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_VAR_DECL_INIT__VARIABLES = eINSTANCE.getArray_Var_Decl_Init_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_VAR_DECL_INIT__INITIALIZATION = eINSTANCE.getArray_Var_Decl_Init_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_ConformandImpl <em>Array Conformand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_ConformandImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Conformand()
     * @generated
     */
    EClass ARRAY_CONFORMAND = eINSTANCE.getArray_Conformand();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_CONFORMAND__DATA_TYPE = eINSTANCE.getArray_Conformand_DataType();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Conform_DeclImpl <em>Array Conform Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_Conform_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Conform_Decl()
     * @generated
     */
    EClass ARRAY_CONFORM_DECL = eINSTANCE.getArray_Conform_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_CONFORM_DECL__VARIABLES = eINSTANCE.getArray_Conform_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Conformand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_CONFORM_DECL__CONFORMAND = eINSTANCE.getArray_Conform_Decl_Conformand();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Var_Decl_InitImpl <em>Struct Var Decl Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_Var_Decl_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Var_Decl_Init()
     * @generated
     */
    EClass STRUCT_VAR_DECL_INIT = eINSTANCE.getStruct_Var_Decl_Init();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_VAR_DECL_INIT__VARIABLES = eINSTANCE.getStruct_Var_Decl_Init_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_VAR_DECL_INIT__INITIALIZATION = eINSTANCE.getStruct_Var_Decl_Init_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Decl_No_InitImpl <em>FB Decl No Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Decl_No_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl_No_Init()
     * @generated
     */
    EClass FB_DECL_NO_INIT = eINSTANCE.getFB_Decl_No_Init();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_DECL_NO_INIT__NAMES = eINSTANCE.getFB_Decl_No_Init_Names();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_DECL_NO_INIT__TYPE = eINSTANCE.getFB_Decl_No_Init_Type();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Decl_InitImpl <em>FB Decl Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Decl_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl_Init()
     * @generated
     */
    EClass FB_DECL_INIT = eINSTANCE.getFB_Decl_Init();

    /**
     * The meta object literal for the '<em><b>Fb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL_INIT__FB = eINSTANCE.getFB_Decl_Init_Fb();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL_INIT__INITIALIZATION = eINSTANCE.getFB_Decl_Init_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl <em>Output Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decls()
     * @generated
     */
    EClass OUTPUT_DECLS = eINSTANCE.getOutput_Decls();

    /**
     * The meta object literal for the '<em><b>Retain Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_DECLS__RETAIN_TYPE = eINSTANCE.getOutput_Decls_RetainType();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DECLS__OUTPUTS = eINSTANCE.getOutput_Decls_Outputs();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl <em>Output Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decl()
     * @generated
     */
    EClass OUTPUT_DECL = eINSTANCE.getOutput_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl <em>In Out Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Decls()
     * @generated
     */
    EClass IN_OUT_DECLS = eINSTANCE.getIn_Out_Decls();

    /**
     * The meta object literal for the '<em><b>Inouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUT_DECLS__INOUTS = eINSTANCE.getIn_Out_Decls_Inouts();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl <em>In Out Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Var_Decl()
     * @generated
     */
    EClass IN_OUT_VAR_DECL = eINSTANCE.getIn_Out_Var_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVar_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__VARIABLES = eINSTANCE.getVar_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__INITIALIZATION = eINSTANCE.getVar_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Array_Var_DeclImpl <em>Array Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Array_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getArray_Var_Decl()
     * @generated
     */
    EClass ARRAY_VAR_DECL = eINSTANCE.getArray_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_VAR_DECL__VARIABLES = eINSTANCE.getArray_Var_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_VAR_DECL__INITIALIZATION = eINSTANCE.getArray_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_Var_DeclImpl <em>Struct Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Var_Decl()
     * @generated
     */
    EClass STRUCT_VAR_DECL = eINSTANCE.getStruct_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_VAR_DECL__VARIABLES = eINSTANCE.getStruct_Var_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_VAR_DECL__INITIALIZATION = eINSTANCE.getStruct_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl <em>Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decls()
     * @generated
     */
    EClass VAR_DECLS = eINSTANCE.getVar_Decls();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLS__ACCESS = eINSTANCE.getVar_Decls_Access();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLS__VARIABLES = eINSTANCE.getVar_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Retain_Var_DeclsImpl <em>Retain Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Retain_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRetain_Var_Decls()
     * @generated
     */
    EClass RETAIN_VAR_DECLS = eINSTANCE.getRetain_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETAIN_VAR_DECLS__ACCESS = eINSTANCE.getRetain_Var_Decls_Access();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETAIN_VAR_DECLS__VARIABLES = eINSTANCE.getRetain_Var_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclsImpl <em>Loc Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Decls()
     * @generated
     */
    EClass LOC_VAR_DECLS = eINSTANCE.getLoc_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOC_VAR_DECLS__MODIFIER = eINSTANCE.getLoc_Var_Decls_Modifier();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_VAR_DECLS__VARIABLES = eINSTANCE.getLoc_Var_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl <em>Loc Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Decl()
     * @generated
     */
    EClass LOC_VAR_DECL = eINSTANCE.getLoc_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOC_VAR_DECL__NAME = eINSTANCE.getLoc_Var_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_VAR_DECL__LOCATION = eINSTANCE.getLoc_Var_Decl_Location();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_VAR_DECL__INITIALIZATION = eINSTANCE.getLoc_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl <em>Temp Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTemp_Var_Decls()
     * @generated
     */
    EClass TEMP_VAR_DECLS = eINSTANCE.getTemp_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMP_VAR_DECLS__VARIABLES = eINSTANCE.getTemp_Var_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl <em>External Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Var_Decls()
     * @generated
     */
    EClass EXTERNAL_VAR_DECLS = eINSTANCE.getExternal_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_VAR_DECLS__VARIABLES = eINSTANCE.getExternal_Var_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.External_DeclImpl <em>External Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.External_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Decl()
     * @generated
     */
    EClass EXTERNAL_DECL = eINSTANCE.getExternal_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DECL__NAME = eINSTANCE.getExternal_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_DECL__INITIALIZATION = eINSTANCE.getExternal_Decl_Initialization();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DECL__TYPE = eINSTANCE.getExternal_Decl_Type();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl <em>Global Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decls()
     * @generated
     */
    EClass GLOBAL_VAR_DECLS = eINSTANCE.getGlobal_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_DECLS__MODIFIER = eINSTANCE.getGlobal_Var_Decls_Modifier();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_DECLS__VARIABLES = eINSTANCE.getGlobal_Var_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl <em>Global Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decl()
     * @generated
     */
    EClass GLOBAL_VAR_DECL = eINSTANCE.getGlobal_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_DECL__NAME = eINSTANCE.getGlobal_Var_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_DECL__INITIALIZATION = eINSTANCE.getGlobal_Var_Decl_Initialization();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_DECL__TYPE = eINSTANCE.getGlobal_Var_Decl_Type();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl <em>Global Var Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Spec()
     * @generated
     */
    EClass GLOBAL_VAR_SPEC = eINSTANCE.getGlobal_Var_Spec();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_SPEC__VARIABLES = eINSTANCE.getGlobal_Var_Spec_Variables();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_SPEC__LOCATION = eINSTANCE.getGlobal_Var_Spec_Location();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl <em>Loc Var Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Spec_Init()
     * @generated
     */
    EClass LOC_VAR_SPEC_INIT = eINSTANCE.getLoc_Var_Spec_Init();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Located_AtImpl <em>Located At</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Located_AtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLocated_At()
     * @generated
     */
    EClass LOCATED_AT = eINSTANCE.getLocated_At();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl <em>Str Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Var_Decl()
     * @generated
     */
    EClass STR_VAR_DECL = eINSTANCE.getStr_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STR_VAR_DECL__VARIABLES = eINSTANCE.getStr_Var_Decl_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl <em>SByte Str Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Var_Decl()
     * @generated
     */
    EClass SBYTE_STR_VAR_DECL = eINSTANCE.getS_Byte_Str_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SBYTE_STR_VAR_DECL__INITIALIZATION = eINSTANCE.getS_Byte_Str_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl <em>SByte Str Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Spec()
     * @generated
     */
    EClass SBYTE_STR_SPEC = eINSTANCE.getS_Byte_Str_Spec();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SBYTE_STR_SPEC__BOUND = eINSTANCE.getS_Byte_Str_Spec_Bound();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SBYTE_STR_SPEC__INITIAL_VALUE = eINSTANCE.getS_Byte_Str_Spec_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl <em>DByte Str Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Var_Decl()
     * @generated
     */
    EClass DBYTE_STR_VAR_DECL = eINSTANCE.getD_Byte_Str_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DBYTE_STR_VAR_DECL__INITIALIZATION = eINSTANCE.getD_Byte_Str_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl <em>DByte Str Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Spec()
     * @generated
     */
    EClass DBYTE_STR_SPEC = eINSTANCE.getD_Byte_Str_Spec();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DBYTE_STR_SPEC__BOUND = eINSTANCE.getD_Byte_Str_Spec_Bound();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DBYTE_STR_SPEC__INITIAL_VALUE = eINSTANCE.getD_Byte_Str_Spec_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Partly_Var_DeclImpl <em>Loc Partly Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Loc_Partly_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Partly_Var_Decl()
     * @generated
     */
    EClass LOC_PARTLY_VAR_DECL = eINSTANCE.getLoc_Partly_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOC_PARTLY_VAR_DECL__MODIFIER = eINSTANCE.getLoc_Partly_Var_Decl_Modifier();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_PARTLY_VAR_DECL__VARIABLES = eINSTANCE.getLoc_Partly_Var_Decl_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Partly_VarImpl <em>Loc Partly Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Loc_Partly_VarImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Partly_Var()
     * @generated
     */
    EClass LOC_PARTLY_VAR = eINSTANCE.getLoc_Partly_Var();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOC_PARTLY_VAR__NAME = eINSTANCE.getLoc_Partly_Var_Name();

    /**
     * The meta object literal for the '<em><b>Location Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOC_PARTLY_VAR__LOCATION_PREFIX = eINSTANCE.getLoc_Partly_Var_LocationPrefix();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_PARTLY_VAR__INITIALIZATION = eINSTANCE.getLoc_Partly_Var_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_SpecImpl <em>Var Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Spec()
     * @generated
     */
    EClass VAR_SPEC = eINSTANCE.getVar_Spec();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_SPEC__TYPE = eINSTANCE.getVar_Spec_Type();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.StringVar_SpecImpl <em>String Var Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.StringVar_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStringVar_Spec()
     * @generated
     */
    EClass STRING_VAR_SPEC = eINSTANCE.getStringVar_Spec();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VAR_SPEC__BOUND = eINSTANCE.getStringVar_Spec_Bound();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl <em>Func Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Decl()
     * @generated
     */
    EClass FUNC_DECL = eINSTANCE.getFunc_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_DECL__NAME = eINSTANCE.getFunc_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_DECL__RETURN_TYPE = eINSTANCE.getFunc_Decl_ReturnType();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__USINGS = eINSTANCE.getFunc_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__IOS = eINSTANCE.getFunc_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__VARIABLES = eINSTANCE.getFunc_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__TEMPS = eINSTANCE.getFunc_Decl_Temps();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__BODY = eINSTANCE.getFunc_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl <em>IO Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIO_Var_Decls()
     * @generated
     */
    EClass IO_VAR_DECLS = eINSTANCE.getIO_Var_Decls();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl <em>Func Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Var_Decls()
     * @generated
     */
    EClass FUNC_VAR_DECLS = eINSTANCE.getFunc_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_VAR_DECLS__CONSTANT = eINSTANCE.getFunc_Var_Decls_Constant();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl <em>Func Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Body()
     * @generated
     */
    EClass FUNC_BODY = eINSTANCE.getFunc_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl <em>FB Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl()
     * @generated
     */
    EClass FB_DECL = eINSTANCE.getFB_Decl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_DECL__MODIFIER = eINSTANCE.getFB_Decl_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_DECL__NAME = eINSTANCE.getFB_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__USINGS = eINSTANCE.getFB_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_DECL__EXTENDS = eINSTANCE.getFB_Decl_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__IMPLEMENTS = eINSTANCE.getFB_Decl_Implements();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__IOS = eINSTANCE.getFB_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__VARIABLES = eINSTANCE.getFB_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__TEMPS = eINSTANCE.getFB_Decl_Temps();

    /**
     * The meta object literal for the '<em><b>Others</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__OTHERS = eINSTANCE.getFB_Decl_Others();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__METHODS = eINSTANCE.getFB_Decl_Methods();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__BODY = eINSTANCE.getFB_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl <em>FB IO Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_IO_Var_Decls()
     * @generated
     */
    EClass FB_IO_VAR_DECLS = eINSTANCE.getFB_IO_Var_Decls();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl <em>FB Input Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decls()
     * @generated
     */
    EClass FB_INPUT_DECLS = eINSTANCE.getFB_Input_Decls();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_INPUT_DECLS__MODIFIER = eINSTANCE.getFB_Input_Decls_Modifier();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_INPUT_DECLS__VARIABLES = eINSTANCE.getFB_Input_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl <em>FB Input Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decl()
     * @generated
     */
    EClass FB_INPUT_DECL = eINSTANCE.getFB_Input_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl <em>FB Output Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decls()
     * @generated
     */
    EClass FB_OUTPUT_DECLS = eINSTANCE.getFB_Output_Decls();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_OUTPUT_DECLS__MODIFIER = eINSTANCE.getFB_Output_Decls_Modifier();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_OUTPUT_DECLS__VARIABLES = eINSTANCE.getFB_Output_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl <em>FB Output Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decl()
     * @generated
     */
    EClass FB_OUTPUT_DECL = eINSTANCE.getFB_Output_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Other_Var_DeclsImpl <em>Other Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Other_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOther_Var_Decls()
     * @generated
     */
    EClass OTHER_VAR_DECLS = eINSTANCE.getOther_Var_Decls();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.No_Retain_Var_DeclsImpl <em>No Retain Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.No_Retain_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNo_Retain_Var_Decls()
     * @generated
     */
    EClass NO_RETAIN_VAR_DECLS = eINSTANCE.getNo_Retain_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NO_RETAIN_VAR_DECLS__ACCESS = eINSTANCE.getNo_Retain_Var_Decls_Access();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_RETAIN_VAR_DECLS__VARIABLES = eINSTANCE.getNo_Retain_Var_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl <em>FB Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Body()
     * @generated
     */
    EClass FB_BODY = eINSTANCE.getFB_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl <em>Method Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Decl()
     * @generated
     */
    EClass METHOD_DECL = eINSTANCE.getMethod_Decl();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__ACCESS = eINSTANCE.getMethod_Decl_Access();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__TYPE = eINSTANCE.getMethod_Decl_Type();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__OVERRIDE = eINSTANCE.getMethod_Decl_Override();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__NAME = eINSTANCE.getMethod_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__RETURN_TYPE = eINSTANCE.getMethod_Decl_ReturnType();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__IOS = eINSTANCE.getMethod_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__VARIABLES = eINSTANCE.getMethod_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__TEMPS = eINSTANCE.getMethod_Decl_Temps();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__BODY = eINSTANCE.getMethod_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl <em>Class Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getClass_Decl()
     * @generated
     */
    EClass CLASS_DECL = eINSTANCE.getClass_Decl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECL__MODIFIER = eINSTANCE.getClass_Decl_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECL__NAME = eINSTANCE.getClass_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__USINGS = eINSTANCE.getClass_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECL__EXTENDS = eINSTANCE.getClass_Decl_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__IMPLEMENTS = eINSTANCE.getClass_Decl_Implements();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__VARIABLES = eINSTANCE.getClass_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Others</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__OTHERS = eINSTANCE.getClass_Decl_Others();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__METHODS = eINSTANCE.getClass_Decl_Methods();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl <em>Interface Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Decl()
     * @generated
     */
    EClass INTERFACE_DECL = eINSTANCE.getInterface_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECL__NAME = eINSTANCE.getInterface_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__USINGS = eINSTANCE.getInterface_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__EXTENDS = eINSTANCE.getInterface_Decl_Extends();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__METHODS = eINSTANCE.getInterface_Decl_Methods();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl <em>Method Prototype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Prototype()
     * @generated
     */
    EClass METHOD_PROTOTYPE = eINSTANCE.getMethod_Prototype();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_PROTOTYPE__NAME = eINSTANCE.getMethod_Prototype_Name();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_PROTOTYPE__RETURN_TYPE = eINSTANCE.getMethod_Prototype_ReturnType();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PROTOTYPE__IOS = eINSTANCE.getMethod_Prototype_Ios();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Spec_InitImpl <em>Interface Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Spec_Init()
     * @generated
     */
    EClass INTERFACE_SPEC_INIT = eINSTANCE.getInterface_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_SPEC_INIT__VARIABLES = eINSTANCE.getInterface_Spec_Init_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_SPEC_INIT__INITIALIZATION = eINSTANCE.getInterface_Spec_Init_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_ValueImpl <em>Interface Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Value()
     * @generated
     */
    EClass INTERFACE_VALUE = eINSTANCE.getInterface_Value();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_VALUE__VARIABLE = eINSTANCE.getInterface_Value_Variable();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_VALUE__VARIABLE_NAME = eINSTANCE.getInterface_Value_VariableName();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl <em>Interface Name List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Name_List()
     * @generated
     */
    EClass INTERFACE_NAME_LIST = eINSTANCE.getInterface_Name_List();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_NAME_LIST__INTERFACES = eINSTANCE.getInterface_Name_List_Interfaces();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl <em>Prog Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Decl()
     * @generated
     */
    EClass PROG_DECL = eINSTANCE.getProg_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROG_DECL__NAME = eINSTANCE.getProg_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__IOS = eINSTANCE.getProg_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__VARIABLES = eINSTANCE.getProg_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__TEMPS = eINSTANCE.getProg_Decl_Temps();

    /**
     * The meta object literal for the '<em><b>Others</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__OTHERS = eINSTANCE.getProg_Decl_Others();

    /**
     * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__LOCALS = eINSTANCE.getProg_Decl_Locals();

    /**
     * The meta object literal for the '<em><b>Acesses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__ACESSES = eINSTANCE.getProg_Decl_Acesses();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__BODY = eINSTANCE.getProg_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclsImpl <em>Prog Access Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Access_Decls()
     * @generated
     */
    EClass PROG_ACCESS_DECLS = eINSTANCE.getProg_Access_Decls();

    /**
     * The meta object literal for the '<em><b>Accesses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_ACCESS_DECLS__ACCESSES = eINSTANCE.getProg_Access_Decls_Accesses();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclImpl <em>Prog Access Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Prog_Access_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Access_Decl()
     * @generated
     */
    EClass PROG_ACCESS_DECL = eINSTANCE.getProg_Access_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROG_ACCESS_DECL__NAME = eINSTANCE.getProg_Access_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_ACCESS_DECL__VARIABLE = eINSTANCE.getProg_Access_Decl_Variable();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_ACCESS_DECL__ACCESS = eINSTANCE.getProg_Access_Decl_Access();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROG_ACCESS_DECL__DATA_TYPE = eINSTANCE.getProg_Access_Decl_DataType();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROG_ACCESS_DECL__DIRECTION = eINSTANCE.getProg_Access_Decl_Direction();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Namespace_H_NameImpl <em>Namespace HName</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Namespace_H_NameImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace_H_Name()
     * @generated
     */
    EClass NAMESPACE_HNAME = eINSTANCE.getNamespace_H_Name();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_HNAME__QUALIFIER = eINSTANCE.getNamespace_H_Name_Qualifier();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl <em>Using Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUsing_Directive()
     * @generated
     */
    EClass USING_DIRECTIVE = eINSTANCE.getUsing_Directive();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING_DIRECTIVE__NAMESPACES = eINSTANCE.getUsing_Directive_Namespaces();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ExpressionImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl <em>Constant Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant_Expr()
     * @generated
     */
    EClass CONSTANT_EXPR = eINSTANCE.getConstant_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl <em>Variable Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Access()
     * @generated
     */
    EClass VARIABLE_ACCESS = eINSTANCE.getVariable_Access();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ACCESS__VARIABLE = eINSTANCE.getVariable_Access_Variable();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ACCESS__ACCESS = eINSTANCE.getVariable_Access_Access();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl <em>Multibit Part Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMultibit_Part_Access()
     * @generated
     */
    EClass MULTIBIT_PART_ACCESS = eINSTANCE.getMultibit_Part_Access();

    /**
     * The meta object literal for the '<em><b>Access Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIBIT_PART_ACCESS__ACCESS_SIZE = eINSTANCE.getMultibit_Part_Access_AccessSize();

    /**
     * The meta object literal for the '<em><b>Access Size Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIBIT_PART_ACCESS__ACCESS_SIZE_INFO = eINSTANCE.getMultibit_Part_Access_AccessSizeInfo();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Size_InfoImpl <em>Size Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Size_InfoImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSize_Info()
     * @generated
     */
    EClass SIZE_INFO = eINSTANCE.getSize_Info();

    /**
     * The meta object literal for the '<em><b>Size Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_INFO__SIZE_PREFIX = eINSTANCE.getSize_Info_SizePrefix();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_INFO__SIZE = eINSTANCE.getSize_Info_Size();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_CallImpl <em>Func Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Func_CallImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Call()
     * @generated
     */
    EClass FUNC_CALL = eINSTANCE.getFunc_Call();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_CALL__ACCESS = eINSTANCE.getFunc_Call_Access();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_CALL__PARAMETERS = eINSTANCE.getFunc_Call_Parameters();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl <em>Stmt List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt_List()
     * @generated
     */
    EClass STMT_LIST = eINSTANCE.getStmt_List();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT_LIST__STATEMENT = eINSTANCE.getStmt_List_Statement();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl <em>Assign Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssign_Stmt()
     * @generated
     */
    EClass ASSIGN_STMT = eINSTANCE.getAssign_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl <em>Variable Assign Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Assign_Stmt()
     * @generated
     */
    EClass VARIABLE_ASSIGN_STMT = eINSTANCE.getVariable_Assign_Stmt();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGN_STMT__LEFT = eINSTANCE.getVariable_Assign_Stmt_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGN_STMT__RIGHT = eINSTANCE.getVariable_Assign_Stmt_Right();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl <em>Assignment Attempt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssignment_Attempt()
     * @generated
     */
    EClass ASSIGNMENT_ATTEMPT = eINSTANCE.getAssignment_Attempt();

    /**
     * The meta object literal for the '<em><b>Left Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_ATTEMPT__LEFT_NAME = eINSTANCE.getAssignment_Attempt_LeftName();

    /**
     * The meta object literal for the '<em><b>Left Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_ATTEMPT__LEFT_REFERENCE = eINSTANCE.getAssignment_Attempt_LeftReference();

    /**
     * The meta object literal for the '<em><b>Right Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_ATTEMPT__RIGHT_NAME = eINSTANCE.getAssignment_Attempt_RightName();

    /**
     * The meta object literal for the '<em><b>Right Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_ATTEMPT__RIGHT_REFERENCE = eINSTANCE.getAssignment_Attempt_RightReference();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.InvocationImpl <em>Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.InvocationImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInvocation()
     * @generated
     */
    EClass INVOCATION = eINSTANCE.getInvocation();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOCATION__METHOD = eINSTANCE.getInvocation_Method();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__PARAMETERS = eINSTANCE.getInvocation_Parameters();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl <em>Param Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getParam_Assign()
     * @generated
     */
    EClass PARAM_ASSIGN = eINSTANCE.getParam_Assign();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl <em>Named Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Value()
     * @generated
     */
    EClass NAMED_VALUE = eINSTANCE.getNamed_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_VALUE__NAME = eINSTANCE.getNamed_Value_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_VALUE__VALUE = eINSTANCE.getNamed_Value_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl <em>Linked Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLinked_Value()
     * @generated
     */
    EClass LINKED_VALUE = eINSTANCE.getLinked_Value();

    /**
     * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINKED_VALUE__NEGATED = eINSTANCE.getLinked_Value_Negated();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINKED_VALUE__NAME = eINSTANCE.getLinked_Value_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINKED_VALUE__VALUE = eINSTANCE.getLinked_Value_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl <em>Selection Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSelection_Stmt()
     * @generated
     */
    EClass SELECTION_STMT = eINSTANCE.getSelection_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl <em>IF Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIF_Stmt()
     * @generated
     */
    EClass IF_STMT = eINSTANCE.getIF_Stmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__CONDITION = eINSTANCE.getIF_Stmt_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__STATEMENTS = eINSTANCE.getIF_Stmt_Statements();

    /**
     * The meta object literal for the '<em><b>Elseifs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__ELSEIFS = eINSTANCE.getIF_Stmt_Elseifs();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__ELSE = eINSTANCE.getIF_Stmt_Else();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl <em>ELSEIF Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSEIF_Stmt()
     * @generated
     */
    EClass ELSEIF_STMT = eINSTANCE.getELSEIF_Stmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSEIF_STMT__CONDITION = eINSTANCE.getELSEIF_Stmt_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSEIF_STMT__STATEMENTS = eINSTANCE.getELSEIF_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl <em>ELSE Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSE_Stmt()
     * @generated
     */
    EClass ELSE_STMT = eINSTANCE.getELSE_Stmt();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_STMT__STATEMENTS = eINSTANCE.getELSE_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl <em>Case Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Stmt()
     * @generated
     */
    EClass CASE_STMT = eINSTANCE.getCase_Stmt();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STMT__EXPRESSION = eINSTANCE.getCase_Stmt_Expression();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STMT__CASES = eINSTANCE.getCase_Stmt_Cases();

    /**
     * The meta object literal for the '<em><b>Default Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STMT__DEFAULT_STATEMENTS = eINSTANCE.getCase_Stmt_DefaultStatements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl <em>Case Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Selection()
     * @generated
     */
    EClass CASE_SELECTION = eINSTANCE.getCase_Selection();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_SELECTION__VALUES = eINSTANCE.getCase_Selection_Values();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_SELECTION__STATEMENTS = eINSTANCE.getCase_Selection_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_ListImpl <em>Case List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List()
     * @generated
     */
    EClass CASE_LIST = eINSTANCE.getCase_List();

    /**
     * The meta object literal for the '<em><b>Case Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIST__CASE_VALUES = eINSTANCE.getCase_List_CaseValues();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl <em>Case List Elem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List_Elem()
     * @generated
     */
    EClass CASE_LIST_ELEM = eINSTANCE.getCase_List_Elem();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl <em>Iteration Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIteration_Stmt()
     * @generated
     */
    EClass ITERATION_STMT = eINSTANCE.getIteration_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl <em>Exit Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExit_Stmt()
     * @generated
     */
    EClass EXIT_STMT = eINSTANCE.getExit_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl <em>Continue Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getContinue_Stmt()
     * @generated
     */
    EClass CONTINUE_STMT = eINSTANCE.getContinue_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.For_StmtImpl <em>For Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.For_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_Stmt()
     * @generated
     */
    EClass FOR_STMT = eINSTANCE.getFor_Stmt();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STMT__VARIABLE = eINSTANCE.getFor_Stmt_Variable();

    /**
     * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__BOUNDS = eINSTANCE.getFor_Stmt_Bounds();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__STATEMENTS = eINSTANCE.getFor_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.For_ListImpl <em>For List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.For_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_List()
     * @generated
     */
    EClass FOR_LIST = eINSTANCE.getFor_List();

    /**
     * The meta object literal for the '<em><b>Low Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LIST__LOW_BOUND = eINSTANCE.getFor_List_LowBound();

    /**
     * The meta object literal for the '<em><b>Up Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LIST__UP_BOUND = eINSTANCE.getFor_List_UpBound();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LIST__STEP = eINSTANCE.getFor_List_Step();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.While_StmtImpl <em>While Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.While_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getWhile_Stmt()
     * @generated
     */
    EClass WHILE_STMT = eINSTANCE.getWhile_Stmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__CONDITION = eINSTANCE.getWhile_Stmt_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__STATEMENTS = eINSTANCE.getWhile_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl <em>Repeat Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRepeat_Stmt()
     * @generated
     */
    EClass REPEAT_STMT = eINSTANCE.getRepeat_Stmt();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STMT__STATEMENTS = eINSTANCE.getRepeat_Stmt_Statements();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STMT__CONDITION = eINSTANCE.getRepeat_Stmt_Condition();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl <em>Xor Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getXor_Expr()
     * @generated
     */
    EClass XOR_EXPR = eINSTANCE.getXor_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.And_ExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.And_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAnd_Expr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAnd_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl <em>Compare Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCompare_Expr()
     * @generated
     */
    EClass COMPARE_EXPR = eINSTANCE.getCompare_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl <em>Equ Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEqu_Expr()
     * @generated
     */
    EClass EQU_EXPR = eINSTANCE.getEqu_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl <em>Add Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAdd_Expr()
     * @generated
     */
    EClass ADD_EXPR = eINSTANCE.getAdd_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.TermImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl <em>Power Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getPower_Expr()
     * @generated
     */
    EClass POWER_EXPR = eINSTANCE.getPower_Expr();

  }

} //StLanguagePackage
