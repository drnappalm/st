/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StLanguageFactoryImpl extends EFactoryImpl implements StLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StLanguageFactory init()
  {
    try
    {
      StLanguageFactory theStLanguageFactory = (StLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(StLanguagePackage.eNS_URI);
      if (theStLanguageFactory != null)
      {
        return theStLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case StLanguagePackage.ST_PROGRAM: return createST_Program();
      case StLanguagePackage.DATA_TYPE_DECL: return createData_Type_Decl();
      case StLanguagePackage.STRUCT_DECL: return createStruct_Decl();
      case StLanguagePackage.TYPE_DECL: return createType_Decl();
      case StLanguagePackage.SIMPLE_TYPE_DECL: return createSimple_Type_Decl();
      case StLanguagePackage.SUBRANGE_TYPE_DECL: return createSubrange_Type_Decl();
      case StLanguagePackage.ENUM_TYPE_DECL: return createEnum_Type_Decl();
      case StLanguagePackage.ARRAY_TYPE_DECL: return createArray_Type_Decl();
      case StLanguagePackage.STRUCT_TYPE_DECL: return createStruct_Type_Decl();
      case StLanguagePackage.STRUCT_ELEM_DECL: return createStruct_Elem_Decl();
      case StLanguagePackage.STR_TYPE_DECL: return createStr_Type_Decl();
      case StLanguagePackage.SIMPLE_SPEC: return createSimple_Spec();
      case StLanguagePackage.SUBRANGE_SPEC: return createSubrange_Spec();
      case StLanguagePackage.ENUM_VALUE_SPEC: return createEnum_Value_Spec();
      case StLanguagePackage.ELEM_NAMED_SPEC: return createElem_Named_Spec();
      case StLanguagePackage.ARRAY_SPEC: return createArray_Spec();
      case StLanguagePackage.STRUCT_SPEC: return createStruct_Spec();
      case StLanguagePackage.SIMPLE_SPEC_INIT: return createSimple_Spec_Init();
      case StLanguagePackage.SUBRANGE_SPEC_INIT: return createSubrange_Spec_Init();
      case StLanguagePackage.SUBRANGE: return createSubrange();
      case StLanguagePackage.NAMED_SPEC_INIT: return createNamed_Spec_Init();
      case StLanguagePackage.ENUM_SPEC_INIT: return createEnum_Spec_Init();
      case StLanguagePackage.ENUM_VALUE: return createEnum_Value();
      case StLanguagePackage.ARRAY_SPEC_INIT: return createArray_Spec_Init();
      case StLanguagePackage.ARRAY_INIT: return createArray_Init();
      case StLanguagePackage.ARRAY_ELEM_INIT: return createArray_Elem_Init();
      case StLanguagePackage.ARRAY_ELEM_INIT_VALUE: return createArray_Elem_Init_Value();
      case StLanguagePackage.STRUCT_SPEC_INIT: return createStruct_Spec_Init();
      case StLanguagePackage.STRUCT_INIT: return createStruct_Init();
      case StLanguagePackage.STRUCT_ELEM_INIT: return createStruct_Elem_Init();
      case StLanguagePackage.DIRECT_VARIABLE: return createDirect_Variable();
      case StLanguagePackage.REF_TYPE_DECL: return createRef_Type_Decl();
      case StLanguagePackage.REF_SPEC_INIT: return createRef_Spec_Init();
      case StLanguagePackage.REF_SPEC: return createRef_Spec();
      case StLanguagePackage.REF_VALUE: return createRef_Value();
      case StLanguagePackage.REF_ADDR: return createRef_Addr();
      case StLanguagePackage.REF_ASSIGN: return createRef_Assign();
      case StLanguagePackage.REF_DEREF: return createRef_Deref();
      case StLanguagePackage.VARIABLE: return createVariable();
      case StLanguagePackage.SYMBOLIC_VARIABLE: return createSymbolic_Variable();
      case StLanguagePackage.VAR_ACCESS: return createVar_Access();
      case StLanguagePackage.MULTI_ELEM_VAR: return createMulti_Elem_Var();
      case StLanguagePackage.SUBSCRIPT_LIST: return createSubscript_List();
      case StLanguagePackage.SUBSCRIPT: return createSubscript();
      case StLanguagePackage.STRUCT_VARIABLE: return createStruct_Variable();
      case StLanguagePackage.STRUCT_ELEM_SELECT: return createStruct_Elem_Select();
      case StLanguagePackage.INPUT_DECLS: return createInput_Decls();
      case StLanguagePackage.INPUT_DECL: return createInput_Decl();
      case StLanguagePackage.EDGE_DECL: return createEdge_Decl();
      case StLanguagePackage.VAR_DECL_INIT: return createVar_Decl_Init();
      case StLanguagePackage.REF_VAR_DECL: return createRef_Var_Decl();
      case StLanguagePackage.INTERFACE_VAR_DECL: return createInterface_Var_Decl();
      case StLanguagePackage.VARIABLE_LIST: return createVariable_List();
      case StLanguagePackage.ARRAY_VAR_DECL_INIT: return createArray_Var_Decl_Init();
      case StLanguagePackage.ARRAY_CONFORMAND: return createArray_Conformand();
      case StLanguagePackage.ARRAY_CONFORM_DECL: return createArray_Conform_Decl();
      case StLanguagePackage.STRUCT_VAR_DECL_INIT: return createStruct_Var_Decl_Init();
      case StLanguagePackage.FB_DECL_NO_INIT: return createFB_Decl_No_Init();
      case StLanguagePackage.FB_DECL_INIT: return createFB_Decl_Init();
      case StLanguagePackage.OUTPUT_DECLS: return createOutput_Decls();
      case StLanguagePackage.OUTPUT_DECL: return createOutput_Decl();
      case StLanguagePackage.IN_OUT_DECLS: return createIn_Out_Decls();
      case StLanguagePackage.IN_OUT_VAR_DECL: return createIn_Out_Var_Decl();
      case StLanguagePackage.VAR_DECL: return createVar_Decl();
      case StLanguagePackage.ARRAY_VAR_DECL: return createArray_Var_Decl();
      case StLanguagePackage.STRUCT_VAR_DECL: return createStruct_Var_Decl();
      case StLanguagePackage.VAR_DECLS: return createVar_Decls();
      case StLanguagePackage.RETAIN_VAR_DECLS: return createRetain_Var_Decls();
      case StLanguagePackage.LOC_VAR_DECLS: return createLoc_Var_Decls();
      case StLanguagePackage.LOC_VAR_DECL: return createLoc_Var_Decl();
      case StLanguagePackage.TEMP_VAR_DECLS: return createTemp_Var_Decls();
      case StLanguagePackage.EXTERNAL_VAR_DECLS: return createExternal_Var_Decls();
      case StLanguagePackage.EXTERNAL_DECL: return createExternal_Decl();
      case StLanguagePackage.GLOBAL_VAR_DECLS: return createGlobal_Var_Decls();
      case StLanguagePackage.GLOBAL_VAR_DECL: return createGlobal_Var_Decl();
      case StLanguagePackage.GLOBAL_VAR_SPEC: return createGlobal_Var_Spec();
      case StLanguagePackage.LOC_VAR_SPEC_INIT: return createLoc_Var_Spec_Init();
      case StLanguagePackage.LOCATED_AT: return createLocated_At();
      case StLanguagePackage.STR_VAR_DECL: return createStr_Var_Decl();
      case StLanguagePackage.SBYTE_STR_VAR_DECL: return createS_Byte_Str_Var_Decl();
      case StLanguagePackage.SBYTE_STR_SPEC: return createS_Byte_Str_Spec();
      case StLanguagePackage.DBYTE_STR_VAR_DECL: return createD_Byte_Str_Var_Decl();
      case StLanguagePackage.DBYTE_STR_SPEC: return createD_Byte_Str_Spec();
      case StLanguagePackage.LOC_PARTLY_VAR_DECL: return createLoc_Partly_Var_Decl();
      case StLanguagePackage.LOC_PARTLY_VAR: return createLoc_Partly_Var();
      case StLanguagePackage.VAR_SPEC: return createVar_Spec();
      case StLanguagePackage.STRING_VAR_SPEC: return createStringVar_Spec();
      case StLanguagePackage.FUNC_DECL: return createFunc_Decl();
      case StLanguagePackage.IO_VAR_DECLS: return createIO_Var_Decls();
      case StLanguagePackage.FUNC_VAR_DECLS: return createFunc_Var_Decls();
      case StLanguagePackage.FUNC_BODY: return createFunc_Body();
      case StLanguagePackage.FB_DECL: return createFB_Decl();
      case StLanguagePackage.FB_IO_VAR_DECLS: return createFB_IO_Var_Decls();
      case StLanguagePackage.FB_INPUT_DECLS: return createFB_Input_Decls();
      case StLanguagePackage.FB_INPUT_DECL: return createFB_Input_Decl();
      case StLanguagePackage.FB_OUTPUT_DECLS: return createFB_Output_Decls();
      case StLanguagePackage.FB_OUTPUT_DECL: return createFB_Output_Decl();
      case StLanguagePackage.OTHER_VAR_DECLS: return createOther_Var_Decls();
      case StLanguagePackage.NO_RETAIN_VAR_DECLS: return createNo_Retain_Var_Decls();
      case StLanguagePackage.FB_BODY: return createFB_Body();
      case StLanguagePackage.METHOD_DECL: return createMethod_Decl();
      case StLanguagePackage.CLASS_DECL: return createClass_Decl();
      case StLanguagePackage.INTERFACE_DECL: return createInterface_Decl();
      case StLanguagePackage.METHOD_PROTOTYPE: return createMethod_Prototype();
      case StLanguagePackage.INTERFACE_SPEC_INIT: return createInterface_Spec_Init();
      case StLanguagePackage.INTERFACE_VALUE: return createInterface_Value();
      case StLanguagePackage.INTERFACE_NAME_LIST: return createInterface_Name_List();
      case StLanguagePackage.PROG_DECL: return createProg_Decl();
      case StLanguagePackage.PROG_ACCESS_DECLS: return createProg_Access_Decls();
      case StLanguagePackage.PROG_ACCESS_DECL: return createProg_Access_Decl();
      case StLanguagePackage.NAMESPACE_HNAME: return createNamespace_H_Name();
      case StLanguagePackage.USING_DIRECTIVE: return createUsing_Directive();
      case StLanguagePackage.EXPRESSION: return createExpression();
      case StLanguagePackage.CONSTANT_EXPR: return createConstant_Expr();
      case StLanguagePackage.VARIABLE_ACCESS: return createVariable_Access();
      case StLanguagePackage.MULTIBIT_PART_ACCESS: return createMultibit_Part_Access();
      case StLanguagePackage.SIZE_INFO: return createSize_Info();
      case StLanguagePackage.FUNC_CALL: return createFunc_Call();
      case StLanguagePackage.STMT_LIST: return createStmt_List();
      case StLanguagePackage.STMT: return createStmt();
      case StLanguagePackage.ASSIGN_STMT: return createAssign_Stmt();
      case StLanguagePackage.VARIABLE_ASSIGN_STMT: return createVariable_Assign_Stmt();
      case StLanguagePackage.ASSIGNMENT_ATTEMPT: return createAssignment_Attempt();
      case StLanguagePackage.INVOCATION: return createInvocation();
      case StLanguagePackage.PARAM_ASSIGN: return createParam_Assign();
      case StLanguagePackage.NAMED_VALUE: return createNamed_Value();
      case StLanguagePackage.LINKED_VALUE: return createLinked_Value();
      case StLanguagePackage.SELECTION_STMT: return createSelection_Stmt();
      case StLanguagePackage.IF_STMT: return createIF_Stmt();
      case StLanguagePackage.ELSEIF_STMT: return createELSEIF_Stmt();
      case StLanguagePackage.ELSE_STMT: return createELSE_Stmt();
      case StLanguagePackage.CASE_STMT: return createCase_Stmt();
      case StLanguagePackage.CASE_SELECTION: return createCase_Selection();
      case StLanguagePackage.CASE_LIST: return createCase_List();
      case StLanguagePackage.CASE_LIST_ELEM: return createCase_List_Elem();
      case StLanguagePackage.ITERATION_STMT: return createIteration_Stmt();
      case StLanguagePackage.EXIT_STMT: return createExit_Stmt();
      case StLanguagePackage.CONTINUE_STMT: return createContinue_Stmt();
      case StLanguagePackage.FOR_STMT: return createFor_Stmt();
      case StLanguagePackage.FOR_LIST: return createFor_List();
      case StLanguagePackage.WHILE_STMT: return createWhile_Stmt();
      case StLanguagePackage.REPEAT_STMT: return createRepeat_Stmt();
      case StLanguagePackage.XOR_EXPR: return createXor_Expr();
      case StLanguagePackage.AND_EXPR: return createAnd_Expr();
      case StLanguagePackage.COMPARE_EXPR: return createCompare_Expr();
      case StLanguagePackage.EQU_EXPR: return createEqu_Expr();
      case StLanguagePackage.ADD_EXPR: return createAdd_Expr();
      case StLanguagePackage.TERM: return createTerm();
      case StLanguagePackage.POWER_EXPR: return createPower_Expr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ST_Program createST_Program()
  {
    ST_ProgramImpl sT_Program = new ST_ProgramImpl();
    return sT_Program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data_Type_Decl createData_Type_Decl()
  {
    Data_Type_DeclImpl data_Type_Decl = new Data_Type_DeclImpl();
    return data_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Decl createStruct_Decl()
  {
    Struct_DeclImpl struct_Decl = new Struct_DeclImpl();
    return struct_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_Decl createType_Decl()
  {
    Type_DeclImpl type_Decl = new Type_DeclImpl();
    return type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simple_Type_Decl createSimple_Type_Decl()
  {
    Simple_Type_DeclImpl simple_Type_Decl = new Simple_Type_DeclImpl();
    return simple_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subrange_Type_Decl createSubrange_Type_Decl()
  {
    Subrange_Type_DeclImpl subrange_Type_Decl = new Subrange_Type_DeclImpl();
    return subrange_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_Type_Decl createEnum_Type_Decl()
  {
    Enum_Type_DeclImpl enum_Type_Decl = new Enum_Type_DeclImpl();
    return enum_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Type_Decl createArray_Type_Decl()
  {
    Array_Type_DeclImpl array_Type_Decl = new Array_Type_DeclImpl();
    return array_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Type_Decl createStruct_Type_Decl()
  {
    Struct_Type_DeclImpl struct_Type_Decl = new Struct_Type_DeclImpl();
    return struct_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Elem_Decl createStruct_Elem_Decl()
  {
    Struct_Elem_DeclImpl struct_Elem_Decl = new Struct_Elem_DeclImpl();
    return struct_Elem_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Str_Type_Decl createStr_Type_Decl()
  {
    Str_Type_DeclImpl str_Type_Decl = new Str_Type_DeclImpl();
    return str_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simple_Spec createSimple_Spec()
  {
    Simple_SpecImpl simple_Spec = new Simple_SpecImpl();
    return simple_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subrange_Spec createSubrange_Spec()
  {
    Subrange_SpecImpl subrange_Spec = new Subrange_SpecImpl();
    return subrange_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_Value_Spec createEnum_Value_Spec()
  {
    Enum_Value_SpecImpl enum_Value_Spec = new Enum_Value_SpecImpl();
    return enum_Value_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elem_Named_Spec createElem_Named_Spec()
  {
    Elem_Named_SpecImpl elem_Named_Spec = new Elem_Named_SpecImpl();
    return elem_Named_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Spec createArray_Spec()
  {
    Array_SpecImpl array_Spec = new Array_SpecImpl();
    return array_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Spec createStruct_Spec()
  {
    Struct_SpecImpl struct_Spec = new Struct_SpecImpl();
    return struct_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simple_Spec_Init createSimple_Spec_Init()
  {
    Simple_Spec_InitImpl simple_Spec_Init = new Simple_Spec_InitImpl();
    return simple_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subrange_Spec_Init createSubrange_Spec_Init()
  {
    Subrange_Spec_InitImpl subrange_Spec_Init = new Subrange_Spec_InitImpl();
    return subrange_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subrange createSubrange()
  {
    SubrangeImpl subrange = new SubrangeImpl();
    return subrange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named_Spec_Init createNamed_Spec_Init()
  {
    Named_Spec_InitImpl named_Spec_Init = new Named_Spec_InitImpl();
    return named_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_Spec_Init createEnum_Spec_Init()
  {
    Enum_Spec_InitImpl enum_Spec_Init = new Enum_Spec_InitImpl();
    return enum_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enum_Value createEnum_Value()
  {
    Enum_ValueImpl enum_Value = new Enum_ValueImpl();
    return enum_Value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Spec_Init createArray_Spec_Init()
  {
    Array_Spec_InitImpl array_Spec_Init = new Array_Spec_InitImpl();
    return array_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Init createArray_Init()
  {
    Array_InitImpl array_Init = new Array_InitImpl();
    return array_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Elem_Init createArray_Elem_Init()
  {
    Array_Elem_InitImpl array_Elem_Init = new Array_Elem_InitImpl();
    return array_Elem_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Elem_Init_Value createArray_Elem_Init_Value()
  {
    Array_Elem_Init_ValueImpl array_Elem_Init_Value = new Array_Elem_Init_ValueImpl();
    return array_Elem_Init_Value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Spec_Init createStruct_Spec_Init()
  {
    Struct_Spec_InitImpl struct_Spec_Init = new Struct_Spec_InitImpl();
    return struct_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Init createStruct_Init()
  {
    Struct_InitImpl struct_Init = new Struct_InitImpl();
    return struct_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Elem_Init createStruct_Elem_Init()
  {
    Struct_Elem_InitImpl struct_Elem_Init = new Struct_Elem_InitImpl();
    return struct_Elem_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direct_Variable createDirect_Variable()
  {
    Direct_VariableImpl direct_Variable = new Direct_VariableImpl();
    return direct_Variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Type_Decl createRef_Type_Decl()
  {
    Ref_Type_DeclImpl ref_Type_Decl = new Ref_Type_DeclImpl();
    return ref_Type_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Spec_Init createRef_Spec_Init()
  {
    Ref_Spec_InitImpl ref_Spec_Init = new Ref_Spec_InitImpl();
    return ref_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Spec createRef_Spec()
  {
    Ref_SpecImpl ref_Spec = new Ref_SpecImpl();
    return ref_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Value createRef_Value()
  {
    Ref_ValueImpl ref_Value = new Ref_ValueImpl();
    return ref_Value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Addr createRef_Addr()
  {
    Ref_AddrImpl ref_Addr = new Ref_AddrImpl();
    return ref_Addr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Assign createRef_Assign()
  {
    Ref_AssignImpl ref_Assign = new Ref_AssignImpl();
    return ref_Assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Deref createRef_Deref()
  {
    Ref_DerefImpl ref_Deref = new Ref_DerefImpl();
    return ref_Deref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbolic_Variable createSymbolic_Variable()
  {
    Symbolic_VariableImpl symbolic_Variable = new Symbolic_VariableImpl();
    return symbolic_Variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_Access createVar_Access()
  {
    Var_AccessImpl var_Access = new Var_AccessImpl();
    return var_Access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi_Elem_Var createMulti_Elem_Var()
  {
    Multi_Elem_VarImpl multi_Elem_Var = new Multi_Elem_VarImpl();
    return multi_Elem_Var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subscript_List createSubscript_List()
  {
    Subscript_ListImpl subscript_List = new Subscript_ListImpl();
    return subscript_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subscript createSubscript()
  {
    SubscriptImpl subscript = new SubscriptImpl();
    return subscript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Variable createStruct_Variable()
  {
    Struct_VariableImpl struct_Variable = new Struct_VariableImpl();
    return struct_Variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Elem_Select createStruct_Elem_Select()
  {
    Struct_Elem_SelectImpl struct_Elem_Select = new Struct_Elem_SelectImpl();
    return struct_Elem_Select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input_Decls createInput_Decls()
  {
    Input_DeclsImpl input_Decls = new Input_DeclsImpl();
    return input_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input_Decl createInput_Decl()
  {
    Input_DeclImpl input_Decl = new Input_DeclImpl();
    return input_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Edge_Decl createEdge_Decl()
  {
    Edge_DeclImpl edge_Decl = new Edge_DeclImpl();
    return edge_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_Decl_Init createVar_Decl_Init()
  {
    Var_Decl_InitImpl var_Decl_Init = new Var_Decl_InitImpl();
    return var_Decl_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref_Var_Decl createRef_Var_Decl()
  {
    Ref_Var_DeclImpl ref_Var_Decl = new Ref_Var_DeclImpl();
    return ref_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_Var_Decl createInterface_Var_Decl()
  {
    Interface_Var_DeclImpl interface_Var_Decl = new Interface_Var_DeclImpl();
    return interface_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_List createVariable_List()
  {
    Variable_ListImpl variable_List = new Variable_ListImpl();
    return variable_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Var_Decl_Init createArray_Var_Decl_Init()
  {
    Array_Var_Decl_InitImpl array_Var_Decl_Init = new Array_Var_Decl_InitImpl();
    return array_Var_Decl_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Conformand createArray_Conformand()
  {
    Array_ConformandImpl array_Conformand = new Array_ConformandImpl();
    return array_Conformand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Conform_Decl createArray_Conform_Decl()
  {
    Array_Conform_DeclImpl array_Conform_Decl = new Array_Conform_DeclImpl();
    return array_Conform_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Var_Decl_Init createStruct_Var_Decl_Init()
  {
    Struct_Var_Decl_InitImpl struct_Var_Decl_Init = new Struct_Var_Decl_InitImpl();
    return struct_Var_Decl_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Decl_No_Init createFB_Decl_No_Init()
  {
    FB_Decl_No_InitImpl fB_Decl_No_Init = new FB_Decl_No_InitImpl();
    return fB_Decl_No_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Decl_Init createFB_Decl_Init()
  {
    FB_Decl_InitImpl fB_Decl_Init = new FB_Decl_InitImpl();
    return fB_Decl_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output_Decls createOutput_Decls()
  {
    Output_DeclsImpl output_Decls = new Output_DeclsImpl();
    return output_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output_Decl createOutput_Decl()
  {
    Output_DeclImpl output_Decl = new Output_DeclImpl();
    return output_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public In_Out_Decls createIn_Out_Decls()
  {
    In_Out_DeclsImpl in_Out_Decls = new In_Out_DeclsImpl();
    return in_Out_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public In_Out_Var_Decl createIn_Out_Var_Decl()
  {
    In_Out_Var_DeclImpl in_Out_Var_Decl = new In_Out_Var_DeclImpl();
    return in_Out_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_Decl createVar_Decl()
  {
    Var_DeclImpl var_Decl = new Var_DeclImpl();
    return var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_Var_Decl createArray_Var_Decl()
  {
    Array_Var_DeclImpl array_Var_Decl = new Array_Var_DeclImpl();
    return array_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_Var_Decl createStruct_Var_Decl()
  {
    Struct_Var_DeclImpl struct_Var_Decl = new Struct_Var_DeclImpl();
    return struct_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_Decls createVar_Decls()
  {
    Var_DeclsImpl var_Decls = new Var_DeclsImpl();
    return var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Retain_Var_Decls createRetain_Var_Decls()
  {
    Retain_Var_DeclsImpl retain_Var_Decls = new Retain_Var_DeclsImpl();
    return retain_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loc_Var_Decls createLoc_Var_Decls()
  {
    Loc_Var_DeclsImpl loc_Var_Decls = new Loc_Var_DeclsImpl();
    return loc_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loc_Var_Decl createLoc_Var_Decl()
  {
    Loc_Var_DeclImpl loc_Var_Decl = new Loc_Var_DeclImpl();
    return loc_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Temp_Var_Decls createTemp_Var_Decls()
  {
    Temp_Var_DeclsImpl temp_Var_Decls = new Temp_Var_DeclsImpl();
    return temp_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public External_Var_Decls createExternal_Var_Decls()
  {
    External_Var_DeclsImpl external_Var_Decls = new External_Var_DeclsImpl();
    return external_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public External_Decl createExternal_Decl()
  {
    External_DeclImpl external_Decl = new External_DeclImpl();
    return external_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global_Var_Decls createGlobal_Var_Decls()
  {
    Global_Var_DeclsImpl global_Var_Decls = new Global_Var_DeclsImpl();
    return global_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global_Var_Decl createGlobal_Var_Decl()
  {
    Global_Var_DeclImpl global_Var_Decl = new Global_Var_DeclImpl();
    return global_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global_Var_Spec createGlobal_Var_Spec()
  {
    Global_Var_SpecImpl global_Var_Spec = new Global_Var_SpecImpl();
    return global_Var_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loc_Var_Spec_Init createLoc_Var_Spec_Init()
  {
    Loc_Var_Spec_InitImpl loc_Var_Spec_Init = new Loc_Var_Spec_InitImpl();
    return loc_Var_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Located_At createLocated_At()
  {
    Located_AtImpl located_At = new Located_AtImpl();
    return located_At;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Str_Var_Decl createStr_Var_Decl()
  {
    Str_Var_DeclImpl str_Var_Decl = new Str_Var_DeclImpl();
    return str_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S_Byte_Str_Var_Decl createS_Byte_Str_Var_Decl()
  {
    S_Byte_Str_Var_DeclImpl s_Byte_Str_Var_Decl = new S_Byte_Str_Var_DeclImpl();
    return s_Byte_Str_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S_Byte_Str_Spec createS_Byte_Str_Spec()
  {
    S_Byte_Str_SpecImpl s_Byte_Str_Spec = new S_Byte_Str_SpecImpl();
    return s_Byte_Str_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public D_Byte_Str_Var_Decl createD_Byte_Str_Var_Decl()
  {
    D_Byte_Str_Var_DeclImpl d_Byte_Str_Var_Decl = new D_Byte_Str_Var_DeclImpl();
    return d_Byte_Str_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public D_Byte_Str_Spec createD_Byte_Str_Spec()
  {
    D_Byte_Str_SpecImpl d_Byte_Str_Spec = new D_Byte_Str_SpecImpl();
    return d_Byte_Str_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loc_Partly_Var_Decl createLoc_Partly_Var_Decl()
  {
    Loc_Partly_Var_DeclImpl loc_Partly_Var_Decl = new Loc_Partly_Var_DeclImpl();
    return loc_Partly_Var_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loc_Partly_Var createLoc_Partly_Var()
  {
    Loc_Partly_VarImpl loc_Partly_Var = new Loc_Partly_VarImpl();
    return loc_Partly_Var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_Spec createVar_Spec()
  {
    Var_SpecImpl var_Spec = new Var_SpecImpl();
    return var_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringVar_Spec createStringVar_Spec()
  {
    StringVar_SpecImpl stringVar_Spec = new StringVar_SpecImpl();
    return stringVar_Spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Func_Decl createFunc_Decl()
  {
    Func_DeclImpl func_Decl = new Func_DeclImpl();
    return func_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IO_Var_Decls createIO_Var_Decls()
  {
    IO_Var_DeclsImpl iO_Var_Decls = new IO_Var_DeclsImpl();
    return iO_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Func_Var_Decls createFunc_Var_Decls()
  {
    Func_Var_DeclsImpl func_Var_Decls = new Func_Var_DeclsImpl();
    return func_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Func_Body createFunc_Body()
  {
    Func_BodyImpl func_Body = new Func_BodyImpl();
    return func_Body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Decl createFB_Decl()
  {
    FB_DeclImpl fB_Decl = new FB_DeclImpl();
    return fB_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_IO_Var_Decls createFB_IO_Var_Decls()
  {
    FB_IO_Var_DeclsImpl fB_IO_Var_Decls = new FB_IO_Var_DeclsImpl();
    return fB_IO_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Input_Decls createFB_Input_Decls()
  {
    FB_Input_DeclsImpl fB_Input_Decls = new FB_Input_DeclsImpl();
    return fB_Input_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Input_Decl createFB_Input_Decl()
  {
    FB_Input_DeclImpl fB_Input_Decl = new FB_Input_DeclImpl();
    return fB_Input_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Output_Decls createFB_Output_Decls()
  {
    FB_Output_DeclsImpl fB_Output_Decls = new FB_Output_DeclsImpl();
    return fB_Output_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Output_Decl createFB_Output_Decl()
  {
    FB_Output_DeclImpl fB_Output_Decl = new FB_Output_DeclImpl();
    return fB_Output_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Other_Var_Decls createOther_Var_Decls()
  {
    Other_Var_DeclsImpl other_Var_Decls = new Other_Var_DeclsImpl();
    return other_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public No_Retain_Var_Decls createNo_Retain_Var_Decls()
  {
    No_Retain_Var_DeclsImpl no_Retain_Var_Decls = new No_Retain_Var_DeclsImpl();
    return no_Retain_Var_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FB_Body createFB_Body()
  {
    FB_BodyImpl fB_Body = new FB_BodyImpl();
    return fB_Body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method_Decl createMethod_Decl()
  {
    Method_DeclImpl method_Decl = new Method_DeclImpl();
    return method_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_Decl createClass_Decl()
  {
    Class_DeclImpl class_Decl = new Class_DeclImpl();
    return class_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_Decl createInterface_Decl()
  {
    Interface_DeclImpl interface_Decl = new Interface_DeclImpl();
    return interface_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method_Prototype createMethod_Prototype()
  {
    Method_PrototypeImpl method_Prototype = new Method_PrototypeImpl();
    return method_Prototype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_Spec_Init createInterface_Spec_Init()
  {
    Interface_Spec_InitImpl interface_Spec_Init = new Interface_Spec_InitImpl();
    return interface_Spec_Init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_Value createInterface_Value()
  {
    Interface_ValueImpl interface_Value = new Interface_ValueImpl();
    return interface_Value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_Name_List createInterface_Name_List()
  {
    Interface_Name_ListImpl interface_Name_List = new Interface_Name_ListImpl();
    return interface_Name_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prog_Decl createProg_Decl()
  {
    Prog_DeclImpl prog_Decl = new Prog_DeclImpl();
    return prog_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prog_Access_Decls createProg_Access_Decls()
  {
    Prog_Access_DeclsImpl prog_Access_Decls = new Prog_Access_DeclsImpl();
    return prog_Access_Decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prog_Access_Decl createProg_Access_Decl()
  {
    Prog_Access_DeclImpl prog_Access_Decl = new Prog_Access_DeclImpl();
    return prog_Access_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace_H_Name createNamespace_H_Name()
  {
    Namespace_H_NameImpl namespace_H_Name = new Namespace_H_NameImpl();
    return namespace_H_Name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Using_Directive createUsing_Directive()
  {
    Using_DirectiveImpl using_Directive = new Using_DirectiveImpl();
    return using_Directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant_Expr createConstant_Expr()
  {
    Constant_ExprImpl constant_Expr = new Constant_ExprImpl();
    return constant_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_Access createVariable_Access()
  {
    Variable_AccessImpl variable_Access = new Variable_AccessImpl();
    return variable_Access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multibit_Part_Access createMultibit_Part_Access()
  {
    Multibit_Part_AccessImpl multibit_Part_Access = new Multibit_Part_AccessImpl();
    return multibit_Part_Access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size_Info createSize_Info()
  {
    Size_InfoImpl size_Info = new Size_InfoImpl();
    return size_Info;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Func_Call createFunc_Call()
  {
    Func_CallImpl func_Call = new Func_CallImpl();
    return func_Call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt_List createStmt_List()
  {
    Stmt_ListImpl stmt_List = new Stmt_ListImpl();
    return stmt_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt createStmt()
  {
    StmtImpl stmt = new StmtImpl();
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign_Stmt createAssign_Stmt()
  {
    Assign_StmtImpl assign_Stmt = new Assign_StmtImpl();
    return assign_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_Assign_Stmt createVariable_Assign_Stmt()
  {
    Variable_Assign_StmtImpl variable_Assign_Stmt = new Variable_Assign_StmtImpl();
    return variable_Assign_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment_Attempt createAssignment_Attempt()
  {
    Assignment_AttemptImpl assignment_Attempt = new Assignment_AttemptImpl();
    return assignment_Attempt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invocation createInvocation()
  {
    InvocationImpl invocation = new InvocationImpl();
    return invocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param_Assign createParam_Assign()
  {
    Param_AssignImpl param_Assign = new Param_AssignImpl();
    return param_Assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named_Value createNamed_Value()
  {
    Named_ValueImpl named_Value = new Named_ValueImpl();
    return named_Value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Linked_Value createLinked_Value()
  {
    Linked_ValueImpl linked_Value = new Linked_ValueImpl();
    return linked_Value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selection_Stmt createSelection_Stmt()
  {
    Selection_StmtImpl selection_Stmt = new Selection_StmtImpl();
    return selection_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IF_Stmt createIF_Stmt()
  {
    IF_StmtImpl iF_Stmt = new IF_StmtImpl();
    return iF_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ELSEIF_Stmt createELSEIF_Stmt()
  {
    ELSEIF_StmtImpl elseiF_Stmt = new ELSEIF_StmtImpl();
    return elseiF_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ELSE_Stmt createELSE_Stmt()
  {
    ELSE_StmtImpl elsE_Stmt = new ELSE_StmtImpl();
    return elsE_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case_Stmt createCase_Stmt()
  {
    Case_StmtImpl case_Stmt = new Case_StmtImpl();
    return case_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case_Selection createCase_Selection()
  {
    Case_SelectionImpl case_Selection = new Case_SelectionImpl();
    return case_Selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case_List createCase_List()
  {
    Case_ListImpl case_List = new Case_ListImpl();
    return case_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case_List_Elem createCase_List_Elem()
  {
    Case_List_ElemImpl case_List_Elem = new Case_List_ElemImpl();
    return case_List_Elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iteration_Stmt createIteration_Stmt()
  {
    Iteration_StmtImpl iteration_Stmt = new Iteration_StmtImpl();
    return iteration_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exit_Stmt createExit_Stmt()
  {
    Exit_StmtImpl exit_Stmt = new Exit_StmtImpl();
    return exit_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Continue_Stmt createContinue_Stmt()
  {
    Continue_StmtImpl continue_Stmt = new Continue_StmtImpl();
    return continue_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_Stmt createFor_Stmt()
  {
    For_StmtImpl for_Stmt = new For_StmtImpl();
    return for_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_List createFor_List()
  {
    For_ListImpl for_List = new For_ListImpl();
    return for_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While_Stmt createWhile_Stmt()
  {
    While_StmtImpl while_Stmt = new While_StmtImpl();
    return while_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repeat_Stmt createRepeat_Stmt()
  {
    Repeat_StmtImpl repeat_Stmt = new Repeat_StmtImpl();
    return repeat_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xor_Expr createXor_Expr()
  {
    Xor_ExprImpl xor_Expr = new Xor_ExprImpl();
    return xor_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And_Expr createAnd_Expr()
  {
    And_ExprImpl and_Expr = new And_ExprImpl();
    return and_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compare_Expr createCompare_Expr()
  {
    Compare_ExprImpl compare_Expr = new Compare_ExprImpl();
    return compare_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equ_Expr createEqu_Expr()
  {
    Equ_ExprImpl equ_Expr = new Equ_ExprImpl();
    return equ_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Add_Expr createAdd_Expr()
  {
    Add_ExprImpl add_Expr = new Add_ExprImpl();
    return add_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Power_Expr createPower_Expr()
  {
    Power_ExprImpl power_Expr = new Power_ExprImpl();
    return power_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguagePackage getStLanguagePackage()
  {
    return (StLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StLanguagePackage getPackage()
  {
    return StLanguagePackage.eINSTANCE;
  }

} //StLanguageFactoryImpl
