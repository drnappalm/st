/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Add_Expr;
import at.bachmann.plc.st.stLanguage.And_Expr;
import at.bachmann.plc.st.stLanguage.Assign_Stmt;
import at.bachmann.plc.st.stLanguage.Assignment_Attempt;
import at.bachmann.plc.st.stLanguage.Bit_Str_Literal;
import at.bachmann.plc.st.stLanguage.Bool_Literal;
import at.bachmann.plc.st.stLanguage.Callable;
import at.bachmann.plc.st.stLanguage.Case_List;
import at.bachmann.plc.st.stLanguage.Case_List_Elem;
import at.bachmann.plc.st.stLanguage.Case_Selection;
import at.bachmann.plc.st.stLanguage.Case_Stmt;
import at.bachmann.plc.st.stLanguage.Char_Literal;
import at.bachmann.plc.st.stLanguage.Class_Decl;
import at.bachmann.plc.st.stLanguage.Compare_Expr;
import at.bachmann.plc.st.stLanguage.Constant;
import at.bachmann.plc.st.stLanguage.Constant_Expr;
import at.bachmann.plc.st.stLanguage.Continue_Stmt;
import at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec;
import at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.Data_Type_Decl;
import at.bachmann.plc.st.stLanguage.Date;
import at.bachmann.plc.st.stLanguage.Date_And_Time;
import at.bachmann.plc.st.stLanguage.Daytime;
import at.bachmann.plc.st.stLanguage.Direct_Variable;
import at.bachmann.plc.st.stLanguage.Duration;
import at.bachmann.plc.st.stLanguage.ELSEIF_Stmt;
import at.bachmann.plc.st.stLanguage.ELSE_Stmt;
import at.bachmann.plc.st.stLanguage.Enum_Spec_Init;
import at.bachmann.plc.st.stLanguage.Enum_Value;
import at.bachmann.plc.st.stLanguage.Equ_Expr;
import at.bachmann.plc.st.stLanguage.Exit_Stmt;
import at.bachmann.plc.st.stLanguage.Expression;
import at.bachmann.plc.st.stLanguage.External_Decl;
import at.bachmann.plc.st.stLanguage.External_Var_Decls;
import at.bachmann.plc.st.stLanguage.FB_Body;
import at.bachmann.plc.st.stLanguage.FB_Decl;
import at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls;
import at.bachmann.plc.st.stLanguage.FB_Input_Decl;
import at.bachmann.plc.st.stLanguage.FB_Input_Decls;
import at.bachmann.plc.st.stLanguage.FB_Output_Decl;
import at.bachmann.plc.st.stLanguage.FB_Output_Decls;
import at.bachmann.plc.st.stLanguage.For_List;
import at.bachmann.plc.st.stLanguage.For_Stmt;
import at.bachmann.plc.st.stLanguage.Func_Body;
import at.bachmann.plc.st.stLanguage.Func_Decl;
import at.bachmann.plc.st.stLanguage.Func_Var_Decls;
import at.bachmann.plc.st.stLanguage.Function;
import at.bachmann.plc.st.stLanguage.FunctionBlock;
import at.bachmann.plc.st.stLanguage.Global_Var_Decl;
import at.bachmann.plc.st.stLanguage.Global_Var_Decls;
import at.bachmann.plc.st.stLanguage.Global_Var_Spec;
import at.bachmann.plc.st.stLanguage.IF_Stmt;
import at.bachmann.plc.st.stLanguage.IO_Var_Decls;
import at.bachmann.plc.st.stLanguage.InRef_Assign;
import at.bachmann.plc.st.stLanguage.In_Out_Decls;
import at.bachmann.plc.st.stLanguage.In_Out_Var_Decl;
import at.bachmann.plc.st.stLanguage.Inline_Variable;
import at.bachmann.plc.st.stLanguage.Input_Decl;
import at.bachmann.plc.st.stLanguage.Input_Decls;
import at.bachmann.plc.st.stLanguage.Int_Literal;
import at.bachmann.plc.st.stLanguage.Interface;
import at.bachmann.plc.st.stLanguage.Interface_Decl;
import at.bachmann.plc.st.stLanguage.Interface_Name_List;
import at.bachmann.plc.st.stLanguage.Interface_Var_Decl;
import at.bachmann.plc.st.stLanguage.Iteration_Stmt;
import at.bachmann.plc.st.stLanguage.Linked_Value;
import at.bachmann.plc.st.stLanguage.Loc_Var_Decl;
import at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init;
import at.bachmann.plc.st.stLanguage.Located_At;
import at.bachmann.plc.st.stLanguage.Method;
import at.bachmann.plc.st.stLanguage.Method_Decl;
import at.bachmann.plc.st.stLanguage.Method_Prototype;
import at.bachmann.plc.st.stLanguage.Multibit_Part_Access;
import at.bachmann.plc.st.stLanguage.Named_Value;
import at.bachmann.plc.st.stLanguage.Named_Variable;
import at.bachmann.plc.st.stLanguage.Namespace;
import at.bachmann.plc.st.stLanguage.Namespace_Decl;
import at.bachmann.plc.st.stLanguage.Namespace_Elements;
import at.bachmann.plc.st.stLanguage.Null_Ref;
import at.bachmann.plc.st.stLanguage.Numeric_Literal;
import at.bachmann.plc.st.stLanguage.Output_Decl;
import at.bachmann.plc.st.stLanguage.Output_Decls;
import at.bachmann.plc.st.stLanguage.POU_Decl;
import at.bachmann.plc.st.stLanguage.Param_Assign;
import at.bachmann.plc.st.stLanguage.Power_Expr;
import at.bachmann.plc.st.stLanguage.Prog_Decl;
import at.bachmann.plc.st.stLanguage.Program;
import at.bachmann.plc.st.stLanguage.Real_Literal;
import at.bachmann.plc.st.stLanguage.Ref_Addr;
import at.bachmann.plc.st.stLanguage.Ref_Assign;
import at.bachmann.plc.st.stLanguage.Ref_Deref;
import at.bachmann.plc.st.stLanguage.Ref_Spec;
import at.bachmann.plc.st.stLanguage.Ref_Value;
import at.bachmann.plc.st.stLanguage.Repeat_Stmt;
import at.bachmann.plc.st.stLanguage.ST;
import at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec;
import at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.Selection_Stmt;
import at.bachmann.plc.st.stLanguage.Signed_Int;
import at.bachmann.plc.st.stLanguage.Spec_Init;
import at.bachmann.plc.st.stLanguage.StLanguageFactory;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Stmt;
import at.bachmann.plc.st.stLanguage.Stmt_List;
import at.bachmann.plc.st.stLanguage.Str_Type_Decl;
import at.bachmann.plc.st.stLanguage.Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.Struct_Decl;
import at.bachmann.plc.st.stLanguage.Subrange;
import at.bachmann.plc.st.stLanguage.Symbolic_Variable;
import at.bachmann.plc.st.stLanguage.Temp_Var_Decls;
import at.bachmann.plc.st.stLanguage.Term;
import at.bachmann.plc.st.stLanguage.Time_Literal;
import at.bachmann.plc.st.stLanguage.Time_Of_Day;
import at.bachmann.plc.st.stLanguage.Type_Decl;
import at.bachmann.plc.st.stLanguage.Unsigned_Int;
import at.bachmann.plc.st.stLanguage.Using_Directive;
import at.bachmann.plc.st.stLanguage.Var_Access;
import at.bachmann.plc.st.stLanguage.Var_Decl;
import at.bachmann.plc.st.stLanguage.Var_Decl_Init;
import at.bachmann.plc.st.stLanguage.Var_Decls;
import at.bachmann.plc.st.stLanguage.Variable;
import at.bachmann.plc.st.stLanguage.Variable_Access;
import at.bachmann.plc.st.stLanguage.Variable_Address;
import at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt;
import at.bachmann.plc.st.stLanguage.Variable_List;
import at.bachmann.plc.st.stLanguage.While_Stmt;
import at.bachmann.plc.st.stLanguage.Xor_Expr;

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
      case StLanguagePackage.ST: return createST();
      case StLanguagePackage.POU_DECL: return createPOU_Decl();
      case StLanguagePackage.CONSTANT: return createConstant();
      case StLanguagePackage.NUMERIC_LITERAL: return createNumeric_Literal();
      case StLanguagePackage.INT_LITERAL: return createInt_Literal();
      case StLanguagePackage.UNSIGNED_INT: return createUnsigned_Int();
      case StLanguagePackage.SIGNED_INT: return createSigned_Int();
      case StLanguagePackage.REAL_LITERAL: return createReal_Literal();
      case StLanguagePackage.BIT_STR_LITERAL: return createBit_Str_Literal();
      case StLanguagePackage.BOOL_LITERAL: return createBool_Literal();
      case StLanguagePackage.CHAR_LITERAL: return createChar_Literal();
      case StLanguagePackage.TIME_LITERAL: return createTime_Literal();
      case StLanguagePackage.DURATION: return createDuration();
      case StLanguagePackage.TIME_OF_DAY: return createTime_Of_Day();
      case StLanguagePackage.DAYTIME: return createDaytime();
      case StLanguagePackage.DATE: return createDate();
      case StLanguagePackage.DATE_AND_TIME: return createDate_And_Time();
      case StLanguagePackage.DATA_TYPE_DECL: return createData_Type_Decl();
      case StLanguagePackage.STRUCT_DECL: return createStruct_Decl();
      case StLanguagePackage.TYPE_DECL: return createType_Decl();
      case StLanguagePackage.STR_TYPE_DECL: return createStr_Type_Decl();
      case StLanguagePackage.SPEC_INIT: return createSpec_Init();
      case StLanguagePackage.SUBRANGE: return createSubrange();
      case StLanguagePackage.ENUM_SPEC_INIT: return createEnum_Spec_Init();
      case StLanguagePackage.ENUM_VALUE: return createEnum_Value();
      case StLanguagePackage.VARIABLE: return createVariable();
      case StLanguagePackage.VARIABLE_ADDRESS: return createVariable_Address();
      case StLanguagePackage.REF_SPEC: return createRef_Spec();
      case StLanguagePackage.REF_VALUE: return createRef_Value();
      case StLanguagePackage.NULL_REF: return createNull_Ref();
      case StLanguagePackage.REF_ADDR: return createRef_Addr();
      case StLanguagePackage.REF_ASSIGN: return createRef_Assign();
      case StLanguagePackage.REF_DEREF: return createRef_Deref();
      case StLanguagePackage.INLINE_VARIABLE: return createInline_Variable();
      case StLanguagePackage.SYMBOLIC_VARIABLE: return createSymbolic_Variable();
      case StLanguagePackage.VAR_ACCESS: return createVar_Access();
      case StLanguagePackage.NAMED_VARIABLE: return createNamed_Variable();
      case StLanguagePackage.DIRECT_VARIABLE: return createDirect_Variable();
      case StLanguagePackage.INPUT_DECLS: return createInput_Decls();
      case StLanguagePackage.INPUT_DECL: return createInput_Decl();
      case StLanguagePackage.VAR_DECL_INIT: return createVar_Decl_Init();
      case StLanguagePackage.INTERFACE_VAR_DECL: return createInterface_Var_Decl();
      case StLanguagePackage.VARIABLE_LIST: return createVariable_List();
      case StLanguagePackage.OUTPUT_DECLS: return createOutput_Decls();
      case StLanguagePackage.OUTPUT_DECL: return createOutput_Decl();
      case StLanguagePackage.IN_OUT_DECLS: return createIn_Out_Decls();
      case StLanguagePackage.IN_OUT_VAR_DECL: return createIn_Out_Var_Decl();
      case StLanguagePackage.VAR_DECL: return createVar_Decl();
      case StLanguagePackage.VAR_DECLS: return createVar_Decls();
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
      case StLanguagePackage.FUNC_DECL: return createFunc_Decl();
      case StLanguagePackage.FUNCTION: return createFunction();
      case StLanguagePackage.IO_VAR_DECLS: return createIO_Var_Decls();
      case StLanguagePackage.FUNC_VAR_DECLS: return createFunc_Var_Decls();
      case StLanguagePackage.FUNC_BODY: return createFunc_Body();
      case StLanguagePackage.FB_DECL: return createFB_Decl();
      case StLanguagePackage.FUNCTION_BLOCK: return createFunctionBlock();
      case StLanguagePackage.FB_IO_VAR_DECLS: return createFB_IO_Var_Decls();
      case StLanguagePackage.FB_INPUT_DECLS: return createFB_Input_Decls();
      case StLanguagePackage.FB_INPUT_DECL: return createFB_Input_Decl();
      case StLanguagePackage.FB_OUTPUT_DECLS: return createFB_Output_Decls();
      case StLanguagePackage.FB_OUTPUT_DECL: return createFB_Output_Decl();
      case StLanguagePackage.FB_BODY: return createFB_Body();
      case StLanguagePackage.METHOD_DECL: return createMethod_Decl();
      case StLanguagePackage.CLASS_DECL: return createClass_Decl();
      case StLanguagePackage.CLASS: return createClass();
      case StLanguagePackage.INTERFACE_DECL: return createInterface_Decl();
      case StLanguagePackage.INTERFACE: return createInterface();
      case StLanguagePackage.METHOD_PROTOTYPE: return createMethod_Prototype();
      case StLanguagePackage.METHOD: return createMethod();
      case StLanguagePackage.INTERFACE_NAME_LIST: return createInterface_Name_List();
      case StLanguagePackage.PROG_DECL: return createProg_Decl();
      case StLanguagePackage.PROGRAM: return createProgram();
      case StLanguagePackage.NAMESPACE_DECL: return createNamespace_Decl();
      case StLanguagePackage.NAMESPACE: return createNamespace();
      case StLanguagePackage.NAMESPACE_ELEMENTS: return createNamespace_Elements();
      case StLanguagePackage.USING_DIRECTIVE: return createUsing_Directive();
      case StLanguagePackage.EXPRESSION: return createExpression();
      case StLanguagePackage.CONSTANT_EXPR: return createConstant_Expr();
      case StLanguagePackage.VARIABLE_ACCESS: return createVariable_Access();
      case StLanguagePackage.MULTIBIT_PART_ACCESS: return createMultibit_Part_Access();
      case StLanguagePackage.CALLABLE: return createCallable();
      case StLanguagePackage.STMT_LIST: return createStmt_List();
      case StLanguagePackage.STMT: return createStmt();
      case StLanguagePackage.ASSIGN_STMT: return createAssign_Stmt();
      case StLanguagePackage.VARIABLE_ASSIGN_STMT: return createVariable_Assign_Stmt();
      case StLanguagePackage.ASSIGNMENT_ATTEMPT: return createAssignment_Attempt();
      case StLanguagePackage.PARAM_ASSIGN: return createParam_Assign();
      case StLanguagePackage.NAMED_VALUE: return createNamed_Value();
      case StLanguagePackage.LINKED_VALUE: return createLinked_Value();
      case StLanguagePackage.IN_REF_ASSIGN: return createInRef_Assign();
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
  public ST createST()
  {
    STImpl st = new STImpl();
    return st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POU_Decl createPOU_Decl()
  {
    POU_DeclImpl poU_Decl = new POU_DeclImpl();
    return poU_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeric_Literal createNumeric_Literal()
  {
    Numeric_LiteralImpl numeric_Literal = new Numeric_LiteralImpl();
    return numeric_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Int_Literal createInt_Literal()
  {
    Int_LiteralImpl int_Literal = new Int_LiteralImpl();
    return int_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unsigned_Int createUnsigned_Int()
  {
    Unsigned_IntImpl unsigned_Int = new Unsigned_IntImpl();
    return unsigned_Int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signed_Int createSigned_Int()
  {
    Signed_IntImpl signed_Int = new Signed_IntImpl();
    return signed_Int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Real_Literal createReal_Literal()
  {
    Real_LiteralImpl real_Literal = new Real_LiteralImpl();
    return real_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bit_Str_Literal createBit_Str_Literal()
  {
    Bit_Str_LiteralImpl bit_Str_Literal = new Bit_Str_LiteralImpl();
    return bit_Str_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool_Literal createBool_Literal()
  {
    Bool_LiteralImpl bool_Literal = new Bool_LiteralImpl();
    return bool_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Char_Literal createChar_Literal()
  {
    Char_LiteralImpl char_Literal = new Char_LiteralImpl();
    return char_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time_Literal createTime_Literal()
  {
    Time_LiteralImpl time_Literal = new Time_LiteralImpl();
    return time_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration createDuration()
  {
    DurationImpl duration = new DurationImpl();
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time_Of_Day createTime_Of_Day()
  {
    Time_Of_DayImpl time_Of_Day = new Time_Of_DayImpl();
    return time_Of_Day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Daytime createDaytime()
  {
    DaytimeImpl daytime = new DaytimeImpl();
    return daytime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date_And_Time createDate_And_Time()
  {
    Date_And_TimeImpl date_And_Time = new Date_And_TimeImpl();
    return date_And_Time;
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
  public Spec_Init createSpec_Init()
  {
    Spec_InitImpl spec_Init = new Spec_InitImpl();
    return spec_Init;
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
  public Variable_Address createVariable_Address()
  {
    Variable_AddressImpl variable_Address = new Variable_AddressImpl();
    return variable_Address;
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
  public Null_Ref createNull_Ref()
  {
    Null_RefImpl null_Ref = new Null_RefImpl();
    return null_Ref;
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
  public Inline_Variable createInline_Variable()
  {
    Inline_VariableImpl inline_Variable = new Inline_VariableImpl();
    return inline_Variable;
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
  public Named_Variable createNamed_Variable()
  {
    Named_VariableImpl named_Variable = new Named_VariableImpl();
    return named_Variable;
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
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
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
  public FunctionBlock createFunctionBlock()
  {
    FunctionBlockImpl functionBlock = new FunctionBlockImpl();
    return functionBlock;
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
  public at.bachmann.plc.st.stLanguage.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
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
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
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
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
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
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace_Decl createNamespace_Decl()
  {
    Namespace_DeclImpl namespace_Decl = new Namespace_DeclImpl();
    return namespace_Decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace_Elements createNamespace_Elements()
  {
    Namespace_ElementsImpl namespace_Elements = new Namespace_ElementsImpl();
    return namespace_Elements;
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
  public Callable createCallable()
  {
    CallableImpl callable = new CallableImpl();
    return callable;
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
  public InRef_Assign createInRef_Assign()
  {
    InRef_AssignImpl inRef_Assign = new InRef_AssignImpl();
    return inRef_Assign;
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
