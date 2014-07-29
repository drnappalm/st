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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StLanguagePackageImpl extends EPackageImpl implements StLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass poU_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numeric_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass int_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsigned_IntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signed_IntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass real_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bit_Str_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bool_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass char_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass time_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass durationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass time_Of_DayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daytimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass date_And_TimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass data_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass str_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spec_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_Spec_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_ValueEClass = null;

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
  private EClass variable_AddressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ref_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ref_ValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass null_RefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ref_AddrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ref_AssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ref_DerefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inline_VariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolic_VariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_AccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass named_VariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass direct_VariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass input_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass input_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_Decl_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass output_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass output_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass in_Out_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass in_Out_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loc_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass temp_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass external_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass external_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass global_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass global_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass global_Var_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loc_Var_Spec_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass located_AtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass str_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass s_Byte_Str_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass s_Byte_Str_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass d_Byte_Str_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass d_Byte_Str_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass func_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iO_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass func_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass func_BodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_IO_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_Input_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_Input_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_Output_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_Output_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_BodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass method_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass method_PrototypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_Name_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prog_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespace_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespace_ElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass using_DirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_AccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multibit_Part_AccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmt_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assign_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_Assign_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignment_AttemptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass param_AssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass named_ValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linked_ValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inRef_AssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selection_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iF_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseiF_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elsE_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_SelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_List_ElemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iteration_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exit_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass continue_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass while_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeat_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xor_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass and_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compare_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equ_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass add_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass power_ExprEClass = null;

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StLanguagePackageImpl()
  {
    super(eNS_URI, StLanguageFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link StLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StLanguagePackage init()
  {
    if (isInited) return (StLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(StLanguagePackage.eNS_URI);

    // Obtain or create and register package
    StLanguagePackageImpl theStLanguagePackage = (StLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theStLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theStLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StLanguagePackage.eNS_URI, theStLanguagePackage);
    return theStLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getST()
  {
    return stEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOU_Decl()
  {
    return poU_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOU_Decl_Usings()
  {
    return (EReference)poU_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOU_Decl_Pous()
  {
    return (EReference)poU_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Value()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumeric_Literal()
  {
    return numeric_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInt_Literal()
  {
    return int_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnsigned_Int()
  {
    return unsigned_IntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSigned_Int()
  {
    return signed_IntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReal_Literal()
  {
    return real_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBit_Str_Literal()
  {
    return bit_Str_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBool_Literal()
  {
    return bool_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChar_Literal()
  {
    return char_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTime_Literal()
  {
    return time_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDuration()
  {
    return durationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTime_Of_Day()
  {
    return time_Of_DayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDaytime()
  {
    return daytimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaytime_Value()
  {
    return (EAttribute)daytimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate()
  {
    return dateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate_And_Time()
  {
    return date_And_TimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getData_Type_Decl()
  {
    return data_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getData_Type_Decl_Types()
  {
    return (EReference)data_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Decl()
  {
    return struct_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStruct_Decl_Overlap()
  {
    return (EAttribute)struct_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Decl_Elements()
  {
    return (EReference)struct_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_Decl()
  {
    return type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Decl_Name()
  {
    return (EAttribute)type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Decl_Initialization()
  {
    return (EReference)type_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Decl_Location()
  {
    return (EReference)type_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Decl_Access()
  {
    return (EReference)type_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStr_Type_Decl()
  {
    return str_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStr_Type_Decl_Type()
  {
    return (EAttribute)str_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStr_Type_Decl_Initialization()
  {
    return (EAttribute)str_Type_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStr_Type_Decl_InitialValue()
  {
    return (EAttribute)str_Type_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpec_Init()
  {
    return spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpec_Init_Type()
  {
    return (EAttribute)spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpec_Init_InitialValue()
  {
    return (EReference)spec_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpec_Init_Range()
  {
    return (EReference)spec_InitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpec_Init_Variable()
  {
    return (EReference)spec_InitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubrange()
  {
    return subrangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubrange_LowBound()
  {
    return (EReference)subrangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubrange_UpBound()
  {
    return (EReference)subrangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum_Spec_Init()
  {
    return enum_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Spec_Init_Type()
  {
    return (EAttribute)enum_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Spec_Init_Value()
  {
    return (EReference)enum_Spec_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum_Value()
  {
    return enum_ValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Value_Variable()
  {
    return (EReference)enum_ValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_Address()
  {
    return variable_AddressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Address_Type()
  {
    return (EAttribute)variable_AddressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Address_Size()
  {
    return (EAttribute)variable_AddressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Address_BitIndexes()
  {
    return (EAttribute)variable_AddressEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Address_BitIndex()
  {
    return (EAttribute)variable_AddressEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef_Spec()
  {
    return ref_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRef_Spec_RefTos()
  {
    return (EAttribute)ref_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRef_Spec_Reference()
  {
    return (EAttribute)ref_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef_Value()
  {
    return ref_ValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNull_Ref()
  {
    return null_RefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef_Addr()
  {
    return ref_AddrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Addr_Variable()
  {
    return (EReference)ref_AddrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef_Assign()
  {
    return ref_AssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Assign_Value()
  {
    return (EReference)ref_AssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef_Deref()
  {
    return ref_DerefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInline_Variable()
  {
    return inline_VariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolic_Variable()
  {
    return symbolic_VariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar_Access()
  {
    return var_AccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Access_Variable()
  {
    return (EReference)var_AccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamed_Variable()
  {
    return named_VariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirect_Variable()
  {
    return direct_VariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirect_Variable_Variable()
  {
    return (EReference)direct_VariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput_Decls()
  {
    return input_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Decls_Retain()
  {
    return (EAttribute)input_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Decls_NonRetain()
  {
    return (EAttribute)input_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Decls_Declarations()
  {
    return (EReference)input_DeclsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput_Decl()
  {
    return input_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar_Decl_Init()
  {
    return var_Decl_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Decl_Init_Variables()
  {
    return (EReference)var_Decl_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Decl_Init_Initialization()
  {
    return (EReference)var_Decl_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_Var_Decl()
  {
    return interface_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Var_Decl_Variables()
  {
    return (EReference)interface_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Var_Decl_Initialization()
  {
    return (EReference)interface_Var_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_List()
  {
    return variable_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_List_Variables()
  {
    return (EReference)variable_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput_Decls()
  {
    return output_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Decls_Retain()
  {
    return (EAttribute)output_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Decls_NonRetain()
  {
    return (EAttribute)output_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Decls_Declarations()
  {
    return (EReference)output_DeclsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput_Decl()
  {
    return output_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIn_Out_Decls()
  {
    return in_Out_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIn_Out_Decls_Declarations()
  {
    return (EReference)in_Out_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIn_Out_Var_Decl()
  {
    return in_Out_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar_Decl()
  {
    return var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Decl_Variables()
  {
    return (EReference)var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Decl_Initialization()
  {
    return (EAttribute)var_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar_Decls()
  {
    return var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Decls_Retain()
  {
    return (EAttribute)var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Decls_NonRetain()
  {
    return (EAttribute)var_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Decls_Access()
  {
    return (EAttribute)var_DeclsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Decls_Declarations()
  {
    return (EReference)var_DeclsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoc_Var_Decl()
  {
    return loc_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoc_Var_Decl_Variable()
  {
    return (EAttribute)loc_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoc_Var_Decl_Location()
  {
    return (EReference)loc_Var_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoc_Var_Decl_Initialization()
  {
    return (EReference)loc_Var_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemp_Var_Decls()
  {
    return temp_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemp_Var_Decls_Declarations()
  {
    return (EReference)temp_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternal_Var_Decls()
  {
    return external_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternal_Var_Decls_Declarations()
  {
    return (EReference)external_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternal_Decl()
  {
    return external_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternal_Decl_Type()
  {
    return (EAttribute)external_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternal_Decl_Initialization()
  {
    return (EAttribute)external_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobal_Var_Decls()
  {
    return global_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobal_Var_Decls_Constant()
  {
    return (EAttribute)global_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobal_Var_Decls_Retain()
  {
    return (EAttribute)global_Var_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobal_Var_Decls_Declarations()
  {
    return (EReference)global_Var_DeclsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobal_Var_Decl()
  {
    return global_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobal_Var_Decl_Type()
  {
    return (EReference)global_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobal_Var_Decl_Initialization()
  {
    return (EReference)global_Var_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobal_Var_Spec()
  {
    return global_Var_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobal_Var_Spec_Names()
  {
    return (EAttribute)global_Var_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobal_Var_Spec_Location()
  {
    return (EReference)global_Var_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoc_Var_Spec_Init()
  {
    return loc_Var_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocated_At()
  {
    return located_AtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStr_Var_Decl()
  {
    return str_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStr_Var_Decl_Variables()
  {
    return (EReference)str_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getS_Byte_Str_Var_Decl()
  {
    return s_Byte_Str_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getS_Byte_Str_Var_Decl_Initialization()
  {
    return (EReference)s_Byte_Str_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getS_Byte_Str_Spec()
  {
    return s_Byte_Str_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getS_Byte_Str_Spec_Bound()
  {
    return (EReference)s_Byte_Str_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getS_Byte_Str_Spec_InitialValue()
  {
    return (EAttribute)s_Byte_Str_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getD_Byte_Str_Var_Decl()
  {
    return d_Byte_Str_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getD_Byte_Str_Var_Decl_Initialization()
  {
    return (EReference)d_Byte_Str_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getD_Byte_Str_Spec()
  {
    return d_Byte_Str_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getD_Byte_Str_Spec_Bound()
  {
    return (EReference)d_Byte_Str_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getD_Byte_Str_Spec_InitialValue()
  {
    return (EAttribute)d_Byte_Str_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunc_Decl()
  {
    return func_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunc_Decl_Name()
  {
    return (EReference)func_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunc_Decl_ReturnType()
  {
    return (EAttribute)func_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunc_Decl_Usings()
  {
    return (EReference)func_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunc_Decl_Ios()
  {
    return (EReference)func_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunc_Decl_Variables()
  {
    return (EReference)func_DeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunc_Decl_Temps()
  {
    return (EReference)func_DeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunc_Decl_Body()
  {
    return (EReference)func_DeclEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIO_Var_Decls()
  {
    return iO_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunc_Var_Decls()
  {
    return func_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunc_Var_Decls_Constant()
  {
    return (EAttribute)func_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunc_Body()
  {
    return func_BodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Decl()
  {
    return fB_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFB_Decl_Modifier()
  {
    return (EAttribute)fB_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Name()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Usings()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Extends()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Implements()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Ios()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Variables()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Temps()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Methods()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Body()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBlock()
  {
    return functionBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionBlock_Name()
  {
    return (EAttribute)functionBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_IO_Var_Decls()
  {
    return fB_IO_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Input_Decls()
  {
    return fB_Input_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFB_Input_Decls_Retain()
  {
    return (EAttribute)fB_Input_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFB_Input_Decls_NonRetain()
  {
    return (EAttribute)fB_Input_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Input_Decls_Variables()
  {
    return (EReference)fB_Input_DeclsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Input_Decl()
  {
    return fB_Input_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Output_Decls()
  {
    return fB_Output_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFB_Output_Decls_Retain()
  {
    return (EAttribute)fB_Output_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFB_Output_Decls_NonRetain()
  {
    return (EAttribute)fB_Output_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Output_Decls_Variables()
  {
    return (EReference)fB_Output_DeclsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Output_Decl()
  {
    return fB_Output_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Body()
  {
    return fB_BodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod_Decl()
  {
    return method_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Decl_Access()
  {
    return (EAttribute)method_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Decl_Type()
  {
    return (EAttribute)method_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Decl_Override()
  {
    return (EAttribute)method_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Decl_Name()
  {
    return (EReference)method_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Decl_ReturnType()
  {
    return (EAttribute)method_DeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Decl_Ios()
  {
    return (EReference)method_DeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Decl_Variables()
  {
    return (EReference)method_DeclEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Decl_Temps()
  {
    return (EReference)method_DeclEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Decl_Body()
  {
    return (EReference)method_DeclEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_Decl()
  {
    return class_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Decl_Modifier()
  {
    return (EAttribute)class_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Decl_Class()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Decl_Usings()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Decl_Extends()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Decl_Implements()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Decl_Variables()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Decl_Methods()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Name()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_Decl()
  {
    return interface_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Decl_Interface()
  {
    return (EReference)interface_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Decl_Usings()
  {
    return (EReference)interface_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Decl_Extends()
  {
    return (EReference)interface_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Decl_Methods()
  {
    return (EReference)interface_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface()
  {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Name()
  {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod_Prototype()
  {
    return method_PrototypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Prototype_Method()
  {
    return (EReference)method_PrototypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Prototype_ReturnType()
  {
    return (EAttribute)method_PrototypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Prototype_Ios()
  {
    return (EReference)method_PrototypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_Name_List()
  {
    return interface_Name_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Name_List_Interfaces()
  {
    return (EReference)interface_Name_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProg_Decl()
  {
    return prog_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Program()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Ios()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Variables()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Body()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProgram_Name()
  {
    return (EAttribute)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace_Decl()
  {
    return namespace_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_Decl_Internal()
  {
    return (EAttribute)namespace_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Decl_Name()
  {
    return (EReference)namespace_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Decl_Usings()
  {
    return (EReference)namespace_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Decl_Elements()
  {
    return (EReference)namespace_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace()
  {
    return namespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_Name()
  {
    return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace_Elements()
  {
    return namespace_ElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsing_Directive()
  {
    return using_DirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsing_Directive_Namespaces()
  {
    return (EAttribute)using_DirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Left()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Operator()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Right()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Expression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant_Expr()
  {
    return constant_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_Access()
  {
    return variable_AccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Access_Variable()
  {
    return (EReference)variable_AccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Access_Access()
  {
    return (EReference)variable_AccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultibit_Part_Access()
  {
    return multibit_Part_AccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultibit_Part_Access_BitIndex()
  {
    return (EAttribute)multibit_Part_AccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultibit_Part_Access_Size()
  {
    return (EAttribute)multibit_Part_AccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallable()
  {
    return callableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallable_Callable()
  {
    return (EReference)callableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallable_Parameters()
  {
    return (EReference)callableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStmt_List()
  {
    return stmt_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_List_Statements()
  {
    return (EReference)stmt_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStmt()
  {
    return stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStmt_Type()
  {
    return (EAttribute)stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssign_Stmt()
  {
    return assign_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssign_Stmt_Variable()
  {
    return (EReference)assign_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_Assign_Stmt()
  {
    return variable_Assign_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Assign_Stmt_Value()
  {
    return (EReference)variable_Assign_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment_Attempt()
  {
    return assignment_AttemptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Attempt_Value()
  {
    return (EReference)assignment_AttemptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParam_Assign()
  {
    return param_AssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParam_Assign_Variable()
  {
    return (EReference)param_AssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamed_Value()
  {
    return named_ValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamed_Value_Value()
  {
    return (EReference)named_ValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinked_Value()
  {
    return linked_ValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinked_Value_Negated()
  {
    return (EAttribute)linked_ValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinked_Value_Value()
  {
    return (EReference)linked_ValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInRef_Assign()
  {
    return inRef_AssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInRef_Assign_Value()
  {
    return (EReference)inRef_AssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelection_Stmt()
  {
    return selection_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelection_Stmt_Condition()
  {
    return (EReference)selection_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIF_Stmt()
  {
    return iF_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_Stmt_Statements()
  {
    return (EReference)iF_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_Stmt_Elseifs()
  {
    return (EReference)iF_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_Stmt_Else()
  {
    return (EReference)iF_StmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getELSEIF_Stmt()
  {
    return elseiF_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getELSEIF_Stmt_Condition()
  {
    return (EReference)elseiF_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getELSEIF_Stmt_Statements()
  {
    return (EReference)elseiF_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getELSE_Stmt()
  {
    return elsE_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getELSE_Stmt_Statements()
  {
    return (EReference)elsE_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase_Stmt()
  {
    return case_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Stmt_Cases()
  {
    return (EReference)case_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Stmt_DefaultStatements()
  {
    return (EReference)case_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase_Selection()
  {
    return case_SelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Selection_Values()
  {
    return (EReference)case_SelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Selection_Statements()
  {
    return (EReference)case_SelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase_List()
  {
    return case_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_List_CaseValues()
  {
    return (EReference)case_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase_List_Elem()
  {
    return case_List_ElemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIteration_Stmt()
  {
    return iteration_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExit_Stmt()
  {
    return exit_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContinue_Stmt()
  {
    return continue_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_Stmt()
  {
    return for_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Stmt_Variable()
  {
    return (EReference)for_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Stmt_Bounds()
  {
    return (EReference)for_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Stmt_Statements()
  {
    return (EReference)for_StmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_List()
  {
    return for_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_List_LowBound()
  {
    return (EReference)for_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_List_UpBound()
  {
    return (EReference)for_ListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_List_Step()
  {
    return (EReference)for_ListEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile_Stmt()
  {
    return while_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Stmt_Condition()
  {
    return (EReference)while_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Stmt_Statements()
  {
    return (EReference)while_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeat_Stmt()
  {
    return repeat_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeat_Stmt_Statements()
  {
    return (EReference)repeat_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeat_Stmt_Condition()
  {
    return (EReference)repeat_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXor_Expr()
  {
    return xor_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnd_Expr()
  {
    return and_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompare_Expr()
  {
    return compare_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqu_Expr()
  {
    return equ_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdd_Expr()
  {
    return add_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPower_Expr()
  {
    return power_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageFactory getStLanguageFactory()
  {
    return (StLanguageFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    stEClass = createEClass(ST);

    poU_DeclEClass = createEClass(POU_DECL);
    createEReference(poU_DeclEClass, POU_DECL__USINGS);
    createEReference(poU_DeclEClass, POU_DECL__POUS);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__VALUE);

    numeric_LiteralEClass = createEClass(NUMERIC_LITERAL);

    int_LiteralEClass = createEClass(INT_LITERAL);

    unsigned_IntEClass = createEClass(UNSIGNED_INT);

    signed_IntEClass = createEClass(SIGNED_INT);

    real_LiteralEClass = createEClass(REAL_LITERAL);

    bit_Str_LiteralEClass = createEClass(BIT_STR_LITERAL);

    bool_LiteralEClass = createEClass(BOOL_LITERAL);

    char_LiteralEClass = createEClass(CHAR_LITERAL);

    time_LiteralEClass = createEClass(TIME_LITERAL);

    durationEClass = createEClass(DURATION);

    time_Of_DayEClass = createEClass(TIME_OF_DAY);

    daytimeEClass = createEClass(DAYTIME);
    createEAttribute(daytimeEClass, DAYTIME__VALUE);

    dateEClass = createEClass(DATE);

    date_And_TimeEClass = createEClass(DATE_AND_TIME);

    data_Type_DeclEClass = createEClass(DATA_TYPE_DECL);
    createEReference(data_Type_DeclEClass, DATA_TYPE_DECL__TYPES);

    struct_DeclEClass = createEClass(STRUCT_DECL);
    createEAttribute(struct_DeclEClass, STRUCT_DECL__OVERLAP);
    createEReference(struct_DeclEClass, STRUCT_DECL__ELEMENTS);

    type_DeclEClass = createEClass(TYPE_DECL);
    createEAttribute(type_DeclEClass, TYPE_DECL__NAME);
    createEReference(type_DeclEClass, TYPE_DECL__INITIALIZATION);
    createEReference(type_DeclEClass, TYPE_DECL__LOCATION);
    createEReference(type_DeclEClass, TYPE_DECL__ACCESS);

    str_Type_DeclEClass = createEClass(STR_TYPE_DECL);
    createEAttribute(str_Type_DeclEClass, STR_TYPE_DECL__TYPE);
    createEAttribute(str_Type_DeclEClass, STR_TYPE_DECL__INITIALIZATION);
    createEAttribute(str_Type_DeclEClass, STR_TYPE_DECL__INITIAL_VALUE);

    spec_InitEClass = createEClass(SPEC_INIT);
    createEAttribute(spec_InitEClass, SPEC_INIT__TYPE);
    createEReference(spec_InitEClass, SPEC_INIT__INITIAL_VALUE);
    createEReference(spec_InitEClass, SPEC_INIT__RANGE);
    createEReference(spec_InitEClass, SPEC_INIT__VARIABLE);

    subrangeEClass = createEClass(SUBRANGE);
    createEReference(subrangeEClass, SUBRANGE__LOW_BOUND);
    createEReference(subrangeEClass, SUBRANGE__UP_BOUND);

    enum_Spec_InitEClass = createEClass(ENUM_SPEC_INIT);
    createEAttribute(enum_Spec_InitEClass, ENUM_SPEC_INIT__TYPE);
    createEReference(enum_Spec_InitEClass, ENUM_SPEC_INIT__VALUE);

    enum_ValueEClass = createEClass(ENUM_VALUE);
    createEReference(enum_ValueEClass, ENUM_VALUE__VARIABLE);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    variable_AddressEClass = createEClass(VARIABLE_ADDRESS);
    createEAttribute(variable_AddressEClass, VARIABLE_ADDRESS__TYPE);
    createEAttribute(variable_AddressEClass, VARIABLE_ADDRESS__SIZE);
    createEAttribute(variable_AddressEClass, VARIABLE_ADDRESS__BIT_INDEXES);
    createEAttribute(variable_AddressEClass, VARIABLE_ADDRESS__BIT_INDEX);

    ref_SpecEClass = createEClass(REF_SPEC);
    createEAttribute(ref_SpecEClass, REF_SPEC__REF_TOS);
    createEAttribute(ref_SpecEClass, REF_SPEC__REFERENCE);

    ref_ValueEClass = createEClass(REF_VALUE);

    null_RefEClass = createEClass(NULL_REF);

    ref_AddrEClass = createEClass(REF_ADDR);
    createEReference(ref_AddrEClass, REF_ADDR__VARIABLE);

    ref_AssignEClass = createEClass(REF_ASSIGN);
    createEReference(ref_AssignEClass, REF_ASSIGN__VALUE);

    ref_DerefEClass = createEClass(REF_DEREF);

    inline_VariableEClass = createEClass(INLINE_VARIABLE);

    symbolic_VariableEClass = createEClass(SYMBOLIC_VARIABLE);

    var_AccessEClass = createEClass(VAR_ACCESS);
    createEReference(var_AccessEClass, VAR_ACCESS__VARIABLE);

    named_VariableEClass = createEClass(NAMED_VARIABLE);

    direct_VariableEClass = createEClass(DIRECT_VARIABLE);
    createEReference(direct_VariableEClass, DIRECT_VARIABLE__VARIABLE);

    input_DeclsEClass = createEClass(INPUT_DECLS);
    createEAttribute(input_DeclsEClass, INPUT_DECLS__RETAIN);
    createEAttribute(input_DeclsEClass, INPUT_DECLS__NON_RETAIN);
    createEReference(input_DeclsEClass, INPUT_DECLS__DECLARATIONS);

    input_DeclEClass = createEClass(INPUT_DECL);

    var_Decl_InitEClass = createEClass(VAR_DECL_INIT);
    createEReference(var_Decl_InitEClass, VAR_DECL_INIT__VARIABLES);
    createEReference(var_Decl_InitEClass, VAR_DECL_INIT__INITIALIZATION);

    interface_Var_DeclEClass = createEClass(INTERFACE_VAR_DECL);
    createEReference(interface_Var_DeclEClass, INTERFACE_VAR_DECL__VARIABLES);
    createEReference(interface_Var_DeclEClass, INTERFACE_VAR_DECL__INITIALIZATION);

    variable_ListEClass = createEClass(VARIABLE_LIST);
    createEReference(variable_ListEClass, VARIABLE_LIST__VARIABLES);

    output_DeclsEClass = createEClass(OUTPUT_DECLS);
    createEAttribute(output_DeclsEClass, OUTPUT_DECLS__RETAIN);
    createEAttribute(output_DeclsEClass, OUTPUT_DECLS__NON_RETAIN);
    createEReference(output_DeclsEClass, OUTPUT_DECLS__DECLARATIONS);

    output_DeclEClass = createEClass(OUTPUT_DECL);

    in_Out_DeclsEClass = createEClass(IN_OUT_DECLS);
    createEReference(in_Out_DeclsEClass, IN_OUT_DECLS__DECLARATIONS);

    in_Out_Var_DeclEClass = createEClass(IN_OUT_VAR_DECL);

    var_DeclEClass = createEClass(VAR_DECL);
    createEReference(var_DeclEClass, VAR_DECL__VARIABLES);
    createEAttribute(var_DeclEClass, VAR_DECL__INITIALIZATION);

    var_DeclsEClass = createEClass(VAR_DECLS);
    createEAttribute(var_DeclsEClass, VAR_DECLS__RETAIN);
    createEAttribute(var_DeclsEClass, VAR_DECLS__NON_RETAIN);
    createEAttribute(var_DeclsEClass, VAR_DECLS__ACCESS);
    createEReference(var_DeclsEClass, VAR_DECLS__DECLARATIONS);

    loc_Var_DeclEClass = createEClass(LOC_VAR_DECL);
    createEAttribute(loc_Var_DeclEClass, LOC_VAR_DECL__VARIABLE);
    createEReference(loc_Var_DeclEClass, LOC_VAR_DECL__LOCATION);
    createEReference(loc_Var_DeclEClass, LOC_VAR_DECL__INITIALIZATION);

    temp_Var_DeclsEClass = createEClass(TEMP_VAR_DECLS);
    createEReference(temp_Var_DeclsEClass, TEMP_VAR_DECLS__DECLARATIONS);

    external_Var_DeclsEClass = createEClass(EXTERNAL_VAR_DECLS);
    createEReference(external_Var_DeclsEClass, EXTERNAL_VAR_DECLS__DECLARATIONS);

    external_DeclEClass = createEClass(EXTERNAL_DECL);
    createEAttribute(external_DeclEClass, EXTERNAL_DECL__TYPE);
    createEAttribute(external_DeclEClass, EXTERNAL_DECL__INITIALIZATION);

    global_Var_DeclsEClass = createEClass(GLOBAL_VAR_DECLS);
    createEAttribute(global_Var_DeclsEClass, GLOBAL_VAR_DECLS__CONSTANT);
    createEAttribute(global_Var_DeclsEClass, GLOBAL_VAR_DECLS__RETAIN);
    createEReference(global_Var_DeclsEClass, GLOBAL_VAR_DECLS__DECLARATIONS);

    global_Var_DeclEClass = createEClass(GLOBAL_VAR_DECL);
    createEReference(global_Var_DeclEClass, GLOBAL_VAR_DECL__TYPE);
    createEReference(global_Var_DeclEClass, GLOBAL_VAR_DECL__INITIALIZATION);

    global_Var_SpecEClass = createEClass(GLOBAL_VAR_SPEC);
    createEAttribute(global_Var_SpecEClass, GLOBAL_VAR_SPEC__NAMES);
    createEReference(global_Var_SpecEClass, GLOBAL_VAR_SPEC__LOCATION);

    loc_Var_Spec_InitEClass = createEClass(LOC_VAR_SPEC_INIT);

    located_AtEClass = createEClass(LOCATED_AT);

    str_Var_DeclEClass = createEClass(STR_VAR_DECL);
    createEReference(str_Var_DeclEClass, STR_VAR_DECL__VARIABLES);

    s_Byte_Str_Var_DeclEClass = createEClass(SBYTE_STR_VAR_DECL);
    createEReference(s_Byte_Str_Var_DeclEClass, SBYTE_STR_VAR_DECL__INITIALIZATION);

    s_Byte_Str_SpecEClass = createEClass(SBYTE_STR_SPEC);
    createEReference(s_Byte_Str_SpecEClass, SBYTE_STR_SPEC__BOUND);
    createEAttribute(s_Byte_Str_SpecEClass, SBYTE_STR_SPEC__INITIAL_VALUE);

    d_Byte_Str_Var_DeclEClass = createEClass(DBYTE_STR_VAR_DECL);
    createEReference(d_Byte_Str_Var_DeclEClass, DBYTE_STR_VAR_DECL__INITIALIZATION);

    d_Byte_Str_SpecEClass = createEClass(DBYTE_STR_SPEC);
    createEReference(d_Byte_Str_SpecEClass, DBYTE_STR_SPEC__BOUND);
    createEAttribute(d_Byte_Str_SpecEClass, DBYTE_STR_SPEC__INITIAL_VALUE);

    func_DeclEClass = createEClass(FUNC_DECL);
    createEReference(func_DeclEClass, FUNC_DECL__NAME);
    createEAttribute(func_DeclEClass, FUNC_DECL__RETURN_TYPE);
    createEReference(func_DeclEClass, FUNC_DECL__USINGS);
    createEReference(func_DeclEClass, FUNC_DECL__IOS);
    createEReference(func_DeclEClass, FUNC_DECL__VARIABLES);
    createEReference(func_DeclEClass, FUNC_DECL__TEMPS);
    createEReference(func_DeclEClass, FUNC_DECL__BODY);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);

    iO_Var_DeclsEClass = createEClass(IO_VAR_DECLS);

    func_Var_DeclsEClass = createEClass(FUNC_VAR_DECLS);
    createEAttribute(func_Var_DeclsEClass, FUNC_VAR_DECLS__CONSTANT);

    func_BodyEClass = createEClass(FUNC_BODY);

    fB_DeclEClass = createEClass(FB_DECL);
    createEAttribute(fB_DeclEClass, FB_DECL__MODIFIER);
    createEReference(fB_DeclEClass, FB_DECL__NAME);
    createEReference(fB_DeclEClass, FB_DECL__USINGS);
    createEReference(fB_DeclEClass, FB_DECL__EXTENDS);
    createEReference(fB_DeclEClass, FB_DECL__IMPLEMENTS);
    createEReference(fB_DeclEClass, FB_DECL__IOS);
    createEReference(fB_DeclEClass, FB_DECL__VARIABLES);
    createEReference(fB_DeclEClass, FB_DECL__TEMPS);
    createEReference(fB_DeclEClass, FB_DECL__METHODS);
    createEReference(fB_DeclEClass, FB_DECL__BODY);

    functionBlockEClass = createEClass(FUNCTION_BLOCK);
    createEAttribute(functionBlockEClass, FUNCTION_BLOCK__NAME);

    fB_IO_Var_DeclsEClass = createEClass(FB_IO_VAR_DECLS);

    fB_Input_DeclsEClass = createEClass(FB_INPUT_DECLS);
    createEAttribute(fB_Input_DeclsEClass, FB_INPUT_DECLS__RETAIN);
    createEAttribute(fB_Input_DeclsEClass, FB_INPUT_DECLS__NON_RETAIN);
    createEReference(fB_Input_DeclsEClass, FB_INPUT_DECLS__VARIABLES);

    fB_Input_DeclEClass = createEClass(FB_INPUT_DECL);

    fB_Output_DeclsEClass = createEClass(FB_OUTPUT_DECLS);
    createEAttribute(fB_Output_DeclsEClass, FB_OUTPUT_DECLS__RETAIN);
    createEAttribute(fB_Output_DeclsEClass, FB_OUTPUT_DECLS__NON_RETAIN);
    createEReference(fB_Output_DeclsEClass, FB_OUTPUT_DECLS__VARIABLES);

    fB_Output_DeclEClass = createEClass(FB_OUTPUT_DECL);

    fB_BodyEClass = createEClass(FB_BODY);

    method_DeclEClass = createEClass(METHOD_DECL);
    createEAttribute(method_DeclEClass, METHOD_DECL__ACCESS);
    createEAttribute(method_DeclEClass, METHOD_DECL__TYPE);
    createEAttribute(method_DeclEClass, METHOD_DECL__OVERRIDE);
    createEReference(method_DeclEClass, METHOD_DECL__NAME);
    createEAttribute(method_DeclEClass, METHOD_DECL__RETURN_TYPE);
    createEReference(method_DeclEClass, METHOD_DECL__IOS);
    createEReference(method_DeclEClass, METHOD_DECL__VARIABLES);
    createEReference(method_DeclEClass, METHOD_DECL__TEMPS);
    createEReference(method_DeclEClass, METHOD_DECL__BODY);

    class_DeclEClass = createEClass(CLASS_DECL);
    createEAttribute(class_DeclEClass, CLASS_DECL__MODIFIER);
    createEReference(class_DeclEClass, CLASS_DECL__CLASS);
    createEReference(class_DeclEClass, CLASS_DECL__USINGS);
    createEReference(class_DeclEClass, CLASS_DECL__EXTENDS);
    createEReference(class_DeclEClass, CLASS_DECL__IMPLEMENTS);
    createEReference(class_DeclEClass, CLASS_DECL__VARIABLES);
    createEReference(class_DeclEClass, CLASS_DECL__METHODS);

    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__NAME);

    interface_DeclEClass = createEClass(INTERFACE_DECL);
    createEReference(interface_DeclEClass, INTERFACE_DECL__INTERFACE);
    createEReference(interface_DeclEClass, INTERFACE_DECL__USINGS);
    createEReference(interface_DeclEClass, INTERFACE_DECL__EXTENDS);
    createEReference(interface_DeclEClass, INTERFACE_DECL__METHODS);

    interfaceEClass = createEClass(INTERFACE);
    createEAttribute(interfaceEClass, INTERFACE__NAME);

    method_PrototypeEClass = createEClass(METHOD_PROTOTYPE);
    createEReference(method_PrototypeEClass, METHOD_PROTOTYPE__METHOD);
    createEAttribute(method_PrototypeEClass, METHOD_PROTOTYPE__RETURN_TYPE);
    createEReference(method_PrototypeEClass, METHOD_PROTOTYPE__IOS);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__NAME);

    interface_Name_ListEClass = createEClass(INTERFACE_NAME_LIST);
    createEReference(interface_Name_ListEClass, INTERFACE_NAME_LIST__INTERFACES);

    prog_DeclEClass = createEClass(PROG_DECL);
    createEReference(prog_DeclEClass, PROG_DECL__PROGRAM);
    createEReference(prog_DeclEClass, PROG_DECL__IOS);
    createEReference(prog_DeclEClass, PROG_DECL__VARIABLES);
    createEReference(prog_DeclEClass, PROG_DECL__BODY);

    programEClass = createEClass(PROGRAM);
    createEAttribute(programEClass, PROGRAM__NAME);

    namespace_DeclEClass = createEClass(NAMESPACE_DECL);
    createEAttribute(namespace_DeclEClass, NAMESPACE_DECL__INTERNAL);
    createEReference(namespace_DeclEClass, NAMESPACE_DECL__NAME);
    createEReference(namespace_DeclEClass, NAMESPACE_DECL__USINGS);
    createEReference(namespace_DeclEClass, NAMESPACE_DECL__ELEMENTS);

    namespaceEClass = createEClass(NAMESPACE);
    createEAttribute(namespaceEClass, NAMESPACE__NAME);

    namespace_ElementsEClass = createEClass(NAMESPACE_ELEMENTS);

    using_DirectiveEClass = createEClass(USING_DIRECTIVE);
    createEAttribute(using_DirectiveEClass, USING_DIRECTIVE__NAMESPACES);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__LEFT);
    createEAttribute(expressionEClass, EXPRESSION__OPERATOR);
    createEReference(expressionEClass, EXPRESSION__RIGHT);
    createEReference(expressionEClass, EXPRESSION__EXPRESSION);

    constant_ExprEClass = createEClass(CONSTANT_EXPR);

    variable_AccessEClass = createEClass(VARIABLE_ACCESS);
    createEReference(variable_AccessEClass, VARIABLE_ACCESS__VARIABLE);
    createEReference(variable_AccessEClass, VARIABLE_ACCESS__ACCESS);

    multibit_Part_AccessEClass = createEClass(MULTIBIT_PART_ACCESS);
    createEAttribute(multibit_Part_AccessEClass, MULTIBIT_PART_ACCESS__BIT_INDEX);
    createEAttribute(multibit_Part_AccessEClass, MULTIBIT_PART_ACCESS__SIZE);

    callableEClass = createEClass(CALLABLE);
    createEReference(callableEClass, CALLABLE__CALLABLE);
    createEReference(callableEClass, CALLABLE__PARAMETERS);

    stmt_ListEClass = createEClass(STMT_LIST);
    createEReference(stmt_ListEClass, STMT_LIST__STATEMENTS);

    stmtEClass = createEClass(STMT);
    createEAttribute(stmtEClass, STMT__TYPE);

    assign_StmtEClass = createEClass(ASSIGN_STMT);
    createEReference(assign_StmtEClass, ASSIGN_STMT__VARIABLE);

    variable_Assign_StmtEClass = createEClass(VARIABLE_ASSIGN_STMT);
    createEReference(variable_Assign_StmtEClass, VARIABLE_ASSIGN_STMT__VALUE);

    assignment_AttemptEClass = createEClass(ASSIGNMENT_ATTEMPT);
    createEReference(assignment_AttemptEClass, ASSIGNMENT_ATTEMPT__VALUE);

    param_AssignEClass = createEClass(PARAM_ASSIGN);
    createEReference(param_AssignEClass, PARAM_ASSIGN__VARIABLE);

    named_ValueEClass = createEClass(NAMED_VALUE);
    createEReference(named_ValueEClass, NAMED_VALUE__VALUE);

    linked_ValueEClass = createEClass(LINKED_VALUE);
    createEAttribute(linked_ValueEClass, LINKED_VALUE__NEGATED);
    createEReference(linked_ValueEClass, LINKED_VALUE__VALUE);

    inRef_AssignEClass = createEClass(IN_REF_ASSIGN);
    createEReference(inRef_AssignEClass, IN_REF_ASSIGN__VALUE);

    selection_StmtEClass = createEClass(SELECTION_STMT);
    createEReference(selection_StmtEClass, SELECTION_STMT__CONDITION);

    iF_StmtEClass = createEClass(IF_STMT);
    createEReference(iF_StmtEClass, IF_STMT__STATEMENTS);
    createEReference(iF_StmtEClass, IF_STMT__ELSEIFS);
    createEReference(iF_StmtEClass, IF_STMT__ELSE);

    elseiF_StmtEClass = createEClass(ELSEIF_STMT);
    createEReference(elseiF_StmtEClass, ELSEIF_STMT__CONDITION);
    createEReference(elseiF_StmtEClass, ELSEIF_STMT__STATEMENTS);

    elsE_StmtEClass = createEClass(ELSE_STMT);
    createEReference(elsE_StmtEClass, ELSE_STMT__STATEMENTS);

    case_StmtEClass = createEClass(CASE_STMT);
    createEReference(case_StmtEClass, CASE_STMT__CASES);
    createEReference(case_StmtEClass, CASE_STMT__DEFAULT_STATEMENTS);

    case_SelectionEClass = createEClass(CASE_SELECTION);
    createEReference(case_SelectionEClass, CASE_SELECTION__VALUES);
    createEReference(case_SelectionEClass, CASE_SELECTION__STATEMENTS);

    case_ListEClass = createEClass(CASE_LIST);
    createEReference(case_ListEClass, CASE_LIST__CASE_VALUES);

    case_List_ElemEClass = createEClass(CASE_LIST_ELEM);

    iteration_StmtEClass = createEClass(ITERATION_STMT);

    exit_StmtEClass = createEClass(EXIT_STMT);

    continue_StmtEClass = createEClass(CONTINUE_STMT);

    for_StmtEClass = createEClass(FOR_STMT);
    createEReference(for_StmtEClass, FOR_STMT__VARIABLE);
    createEReference(for_StmtEClass, FOR_STMT__BOUNDS);
    createEReference(for_StmtEClass, FOR_STMT__STATEMENTS);

    for_ListEClass = createEClass(FOR_LIST);
    createEReference(for_ListEClass, FOR_LIST__LOW_BOUND);
    createEReference(for_ListEClass, FOR_LIST__UP_BOUND);
    createEReference(for_ListEClass, FOR_LIST__STEP);

    while_StmtEClass = createEClass(WHILE_STMT);
    createEReference(while_StmtEClass, WHILE_STMT__CONDITION);
    createEReference(while_StmtEClass, WHILE_STMT__STATEMENTS);

    repeat_StmtEClass = createEClass(REPEAT_STMT);
    createEReference(repeat_StmtEClass, REPEAT_STMT__STATEMENTS);
    createEReference(repeat_StmtEClass, REPEAT_STMT__CONDITION);

    xor_ExprEClass = createEClass(XOR_EXPR);

    and_ExprEClass = createEClass(AND_EXPR);

    compare_ExprEClass = createEClass(COMPARE_EXPR);

    equ_ExprEClass = createEClass(EQU_EXPR);

    add_ExprEClass = createEClass(ADD_EXPR);

    termEClass = createEClass(TERM);

    power_ExprEClass = createEClass(POWER_EXPR);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    poU_DeclEClass.getESuperTypes().add(this.getST());
    constantEClass.getESuperTypes().add(this.getExpression());
    numeric_LiteralEClass.getESuperTypes().add(this.getConstant());
    int_LiteralEClass.getESuperTypes().add(this.getNumeric_Literal());
    unsigned_IntEClass.getESuperTypes().add(this.getInt_Literal());
    signed_IntEClass.getESuperTypes().add(this.getInt_Literal());
    real_LiteralEClass.getESuperTypes().add(this.getNumeric_Literal());
    bit_Str_LiteralEClass.getESuperTypes().add(this.getConstant());
    bool_LiteralEClass.getESuperTypes().add(this.getConstant());
    char_LiteralEClass.getESuperTypes().add(this.getConstant());
    time_LiteralEClass.getESuperTypes().add(this.getConstant());
    durationEClass.getESuperTypes().add(this.getTime_Literal());
    time_Of_DayEClass.getESuperTypes().add(this.getTime_Literal());
    dateEClass.getESuperTypes().add(this.getTime_Literal());
    date_And_TimeEClass.getESuperTypes().add(this.getTime_Literal());
    data_Type_DeclEClass.getESuperTypes().add(this.getNamespace_Elements());
    spec_InitEClass.getESuperTypes().add(this.getLoc_Var_Spec_Init());
    subrangeEClass.getESuperTypes().add(this.getCase_List_Elem());
    null_RefEClass.getESuperTypes().add(this.getRef_Value());
    ref_AddrEClass.getESuperTypes().add(this.getRef_Value());
    ref_AssignEClass.getESuperTypes().add(this.getAssign_Stmt());
    ref_DerefEClass.getESuperTypes().add(this.getVar_Access());
    symbolic_VariableEClass.getESuperTypes().add(this.getInline_Variable());
    var_AccessEClass.getESuperTypes().add(this.getSymbolic_Variable());
    named_VariableEClass.getESuperTypes().add(this.getVar_Access());
    direct_VariableEClass.getESuperTypes().add(this.getInline_Variable());
    direct_VariableEClass.getESuperTypes().add(this.getLocated_At());
    input_DeclsEClass.getESuperTypes().add(this.getIO_Var_Decls());
    var_Decl_InitEClass.getESuperTypes().add(this.getInput_Decl());
    var_Decl_InitEClass.getESuperTypes().add(this.getOutput_Decl());
    var_Decl_InitEClass.getESuperTypes().add(this.getFB_Input_Decl());
    var_Decl_InitEClass.getESuperTypes().add(this.getFB_Output_Decl());
    output_DeclsEClass.getESuperTypes().add(this.getIO_Var_Decls());
    in_Out_DeclsEClass.getESuperTypes().add(this.getIO_Var_Decls());
    in_Out_DeclsEClass.getESuperTypes().add(this.getFB_IO_Var_Decls());
    var_DeclEClass.getESuperTypes().add(this.getIn_Out_Var_Decl());
    var_DeclsEClass.getESuperTypes().add(this.getFunc_Var_Decls());
    external_Var_DeclsEClass.getESuperTypes().add(this.getFunc_Var_Decls());
    s_Byte_Str_Var_DeclEClass.getESuperTypes().add(this.getStr_Var_Decl());
    d_Byte_Str_Var_DeclEClass.getESuperTypes().add(this.getStr_Var_Decl());
    func_DeclEClass.getESuperTypes().add(this.getNamespace_Elements());
    fB_DeclEClass.getESuperTypes().add(this.getNamespace_Elements());
    fB_Input_DeclsEClass.getESuperTypes().add(this.getFB_IO_Var_Decls());
    fB_Output_DeclsEClass.getESuperTypes().add(this.getFB_IO_Var_Decls());
    prog_DeclEClass.getESuperTypes().add(this.getST());
    expressionEClass.getESuperTypes().add(this.getConstant_Expr());
    constant_ExprEClass.getESuperTypes().add(this.getCase_List_Elem());
    stmt_ListEClass.getESuperTypes().add(this.getFunc_Body());
    stmt_ListEClass.getESuperTypes().add(this.getFB_Body());
    stmtEClass.getESuperTypes().add(this.getCallable());
    assign_StmtEClass.getESuperTypes().add(this.getStmt());
    variable_Assign_StmtEClass.getESuperTypes().add(this.getAssign_Stmt());
    assignment_AttemptEClass.getESuperTypes().add(this.getAssign_Stmt());
    named_ValueEClass.getESuperTypes().add(this.getParam_Assign());
    linked_ValueEClass.getESuperTypes().add(this.getParam_Assign());
    inRef_AssignEClass.getESuperTypes().add(this.getParam_Assign());
    selection_StmtEClass.getESuperTypes().add(this.getStmt());
    iF_StmtEClass.getESuperTypes().add(this.getSelection_Stmt());
    case_StmtEClass.getESuperTypes().add(this.getSelection_Stmt());
    iteration_StmtEClass.getESuperTypes().add(this.getStmt());
    exit_StmtEClass.getESuperTypes().add(this.getIteration_Stmt());
    continue_StmtEClass.getESuperTypes().add(this.getIteration_Stmt());
    for_StmtEClass.getESuperTypes().add(this.getIteration_Stmt());
    while_StmtEClass.getESuperTypes().add(this.getIteration_Stmt());
    repeat_StmtEClass.getESuperTypes().add(this.getIteration_Stmt());
    xor_ExprEClass.getESuperTypes().add(this.getExpression());
    and_ExprEClass.getESuperTypes().add(this.getExpression());
    compare_ExprEClass.getESuperTypes().add(this.getExpression());
    equ_ExprEClass.getESuperTypes().add(this.getExpression());
    add_ExprEClass.getESuperTypes().add(this.getExpression());
    termEClass.getESuperTypes().add(this.getExpression());
    power_ExprEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(stEClass, at.bachmann.plc.st.stLanguage.ST.class, "ST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(poU_DeclEClass, POU_Decl.class, "POU_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPOU_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, POU_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOU_Decl_Pous(), ecorePackage.getEObject(), null, "pous", null, 0, -1, POU_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numeric_LiteralEClass, Numeric_Literal.class, "Numeric_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(int_LiteralEClass, Int_Literal.class, "Int_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unsigned_IntEClass, Unsigned_Int.class, "Unsigned_Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signed_IntEClass, Signed_Int.class, "Signed_Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(real_LiteralEClass, Real_Literal.class, "Real_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bit_Str_LiteralEClass, Bit_Str_Literal.class, "Bit_Str_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bool_LiteralEClass, Bool_Literal.class, "Bool_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(char_LiteralEClass, Char_Literal.class, "Char_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(time_LiteralEClass, Time_Literal.class, "Time_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(time_Of_DayEClass, Time_Of_Day.class, "Time_Of_Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(daytimeEClass, Daytime.class, "Daytime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDaytime_Value(), ecorePackage.getEString(), "value", null, 0, 1, Daytime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(date_And_TimeEClass, Date_And_Time.class, "Date_And_Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(data_Type_DeclEClass, Data_Type_Decl.class, "Data_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getData_Type_Decl_Types(), this.getType_Decl(), null, "types", null, 0, -1, Data_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_DeclEClass, Struct_Decl.class, "Struct_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStruct_Decl_Overlap(), ecorePackage.getEBoolean(), "overlap", null, 0, 1, Struct_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Decl_Elements(), this.getType_Decl(), null, "elements", null, 0, -1, Struct_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_DeclEClass, Type_Decl.class, "Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Decl_Initialization(), ecorePackage.getEObject(), null, "initialization", null, 0, 1, Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Decl_Location(), this.getLocated_At(), null, "location", null, 0, 1, Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Decl_Access(), this.getMultibit_Part_Access(), null, "access", null, 0, 1, Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(str_Type_DeclEClass, Str_Type_Decl.class, "Str_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStr_Type_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, Str_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStr_Type_Decl_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, Str_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStr_Type_Decl_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, Str_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spec_InitEClass, Spec_Init.class, "Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpec_Init_Type(), ecorePackage.getEString(), "type", null, 0, 1, Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpec_Init_InitialValue(), ecorePackage.getEObject(), null, "initialValue", null, 0, 1, Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpec_Init_Range(), this.getSubrange(), null, "range", null, 0, 1, Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpec_Init_Variable(), this.getRef_Spec(), null, "variable", null, 0, 1, Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subrangeEClass, Subrange.class, "Subrange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubrange_LowBound(), this.getConstant_Expr(), null, "lowBound", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubrange_UpBound(), this.getConstant_Expr(), null, "upBound", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_Spec_InitEClass, Enum_Spec_Init.class, "Enum_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Spec_Init_Type(), ecorePackage.getEString(), "type", null, 0, 1, Enum_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnum_Spec_Init_Value(), this.getEnum_Value(), null, "value", null, 0, 1, Enum_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_ValueEClass, Enum_Value.class, "Enum_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnum_Value_Variable(), this.getVariable(), null, "variable", null, 0, 1, Enum_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_AddressEClass, Variable_Address.class, "Variable_Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Address_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Address_Size(), ecorePackage.getEString(), "size", null, 0, 1, Variable_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Address_BitIndexes(), ecorePackage.getEString(), "bitIndexes", null, 0, -1, Variable_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Address_BitIndex(), ecorePackage.getEString(), "bitIndex", null, 0, -1, Variable_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_SpecEClass, Ref_Spec.class, "Ref_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRef_Spec_RefTos(), ecorePackage.getEString(), "refTos", null, 0, -1, Ref_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRef_Spec_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Ref_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_ValueEClass, Ref_Value.class, "Ref_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(null_RefEClass, Null_Ref.class, "Null_Ref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ref_AddrEClass, Ref_Addr.class, "Ref_Addr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Addr_Variable(), this.getVariable(), null, "variable", null, 0, 1, Ref_Addr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_AssignEClass, Ref_Assign.class, "Ref_Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Assign_Value(), this.getVariable(), null, "value", null, 0, 1, Ref_Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_DerefEClass, Ref_Deref.class, "Ref_Deref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inline_VariableEClass, Inline_Variable.class, "Inline_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(symbolic_VariableEClass, Symbolic_Variable.class, "Symbolic_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(var_AccessEClass, Var_Access.class, "Var_Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVar_Access_Variable(), this.getVariable(), null, "variable", null, 0, 1, Var_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(named_VariableEClass, Named_Variable.class, "Named_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(direct_VariableEClass, Direct_Variable.class, "Direct_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirect_Variable_Variable(), this.getVariable_Address(), null, "variable", null, 0, 1, Direct_Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(input_DeclsEClass, Input_Decls.class, "Input_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_Decls_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_Decls_NonRetain(), ecorePackage.getEBoolean(), "nonRetain", null, 0, 1, Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Decls_Declarations(), this.getInput_Decl(), null, "declarations", null, 0, -1, Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(input_DeclEClass, Input_Decl.class, "Input_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(var_Decl_InitEClass, Var_Decl_Init.class, "Var_Decl_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVar_Decl_Init_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVar_Decl_Init_Initialization(), this.getSpec_Init(), null, "initialization", null, 0, 1, Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_Var_DeclEClass, Interface_Var_Decl.class, "Interface_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_Var_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Interface_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Var_Decl_Initialization(), this.getInterface(), null, "initialization", null, 0, 1, Interface_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_ListEClass, Variable_List.class, "Variable_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_List_Variables(), this.getVariable(), null, "variables", null, 0, -1, Variable_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(output_DeclsEClass, Output_Decls.class, "Output_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_Decls_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Decls_NonRetain(), ecorePackage.getEBoolean(), "nonRetain", null, 0, 1, Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_Decls_Declarations(), this.getOutput_Decl(), null, "declarations", null, 0, -1, Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(output_DeclEClass, Output_Decl.class, "Output_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(in_Out_DeclsEClass, In_Out_Decls.class, "In_Out_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIn_Out_Decls_Declarations(), this.getIn_Out_Var_Decl(), null, "declarations", null, 0, -1, In_Out_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(in_Out_Var_DeclEClass, In_Out_Var_Decl.class, "In_Out_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(var_DeclEClass, Var_Decl.class, "Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVar_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVar_Decl_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_DeclsEClass, Var_Decls.class, "Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Decls_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVar_Decls_NonRetain(), ecorePackage.getEBoolean(), "nonRetain", null, 0, 1, Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVar_Decls_Access(), ecorePackage.getEString(), "access", null, 0, 1, Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVar_Decls_Declarations(), ecorePackage.getEObject(), null, "declarations", null, 0, -1, Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_Var_DeclEClass, Loc_Var_Decl.class, "Loc_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoc_Var_Decl_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Loc_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoc_Var_Decl_Location(), this.getLocated_At(), null, "location", null, 0, 1, Loc_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoc_Var_Decl_Initialization(), this.getLoc_Var_Spec_Init(), null, "initialization", null, 0, 1, Loc_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(temp_Var_DeclsEClass, Temp_Var_Decls.class, "Temp_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemp_Var_Decls_Declarations(), ecorePackage.getEObject(), null, "declarations", null, 0, -1, Temp_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(external_Var_DeclsEClass, External_Var_Decls.class, "External_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternal_Var_Decls_Declarations(), this.getExternal_Decl(), null, "declarations", null, 0, -1, External_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(external_DeclEClass, External_Decl.class, "External_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternal_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, External_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternal_Decl_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, External_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(global_Var_DeclsEClass, Global_Var_Decls.class, "Global_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobal_Var_Decls_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, Global_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlobal_Var_Decls_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, Global_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobal_Var_Decls_Declarations(), this.getGlobal_Var_Decl(), null, "declarations", null, 0, -1, Global_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(global_Var_DeclEClass, Global_Var_Decl.class, "Global_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlobal_Var_Decl_Type(), this.getGlobal_Var_Spec(), null, "type", null, 0, 1, Global_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobal_Var_Decl_Initialization(), this.getLoc_Var_Spec_Init(), null, "initialization", null, 0, 1, Global_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(global_Var_SpecEClass, Global_Var_Spec.class, "Global_Var_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobal_Var_Spec_Names(), ecorePackage.getEString(), "names", null, 0, -1, Global_Var_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobal_Var_Spec_Location(), this.getLocated_At(), null, "location", null, 0, 1, Global_Var_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_Var_Spec_InitEClass, Loc_Var_Spec_Init.class, "Loc_Var_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(located_AtEClass, Located_At.class, "Located_At", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(str_Var_DeclEClass, Str_Var_Decl.class, "Str_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStr_Var_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Str_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(s_Byte_Str_Var_DeclEClass, S_Byte_Str_Var_Decl.class, "S_Byte_Str_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getS_Byte_Str_Var_Decl_Initialization(), this.getS_Byte_Str_Spec(), null, "initialization", null, 0, 1, S_Byte_Str_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(s_Byte_Str_SpecEClass, S_Byte_Str_Spec.class, "S_Byte_Str_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getS_Byte_Str_Spec_Bound(), this.getUnsigned_Int(), null, "bound", null, 0, 1, S_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getS_Byte_Str_Spec_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, S_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(d_Byte_Str_Var_DeclEClass, D_Byte_Str_Var_Decl.class, "D_Byte_Str_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getD_Byte_Str_Var_Decl_Initialization(), this.getD_Byte_Str_Spec(), null, "initialization", null, 0, 1, D_Byte_Str_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(d_Byte_Str_SpecEClass, D_Byte_Str_Spec.class, "D_Byte_Str_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getD_Byte_Str_Spec_Bound(), this.getUnsigned_Int(), null, "bound", null, 0, 1, D_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getD_Byte_Str_Spec_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, D_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(func_DeclEClass, Func_Decl.class, "Func_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunc_Decl_Name(), this.getFunction(), null, "name", null, 0, 1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunc_Decl_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Temps(), this.getTemp_Var_Decls(), null, "temps", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Body(), this.getFunc_Body(), null, "body", null, 0, 1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iO_Var_DeclsEClass, IO_Var_Decls.class, "IO_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(func_Var_DeclsEClass, Func_Var_Decls.class, "Func_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunc_Var_Decls_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, Func_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(func_BodyEClass, Func_Body.class, "Func_Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fB_DeclEClass, FB_Decl.class, "FB_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFB_Decl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Name(), this.getFunctionBlock(), null, "name", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Extends(), this.getFunctionBlock(), null, "extends", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Implements(), this.getInterface_Name_List(), null, "implements", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Ios(), this.getFB_IO_Var_Decls(), null, "ios", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Temps(), this.getTemp_Var_Decls(), null, "temps", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Methods(), this.getMethod_Decl(), null, "methods", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Body(), this.getFB_Body(), null, "body", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBlockEClass, FunctionBlock.class, "FunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_IO_Var_DeclsEClass, FB_IO_Var_Decls.class, "FB_IO_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fB_Input_DeclsEClass, FB_Input_Decls.class, "FB_Input_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFB_Input_Decls_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, FB_Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFB_Input_Decls_NonRetain(), ecorePackage.getEBoolean(), "nonRetain", null, 0, 1, FB_Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Input_Decls_Variables(), this.getFB_Input_Decl(), null, "variables", null, 0, -1, FB_Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_Input_DeclEClass, FB_Input_Decl.class, "FB_Input_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fB_Output_DeclsEClass, FB_Output_Decls.class, "FB_Output_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFB_Output_Decls_Retain(), ecorePackage.getEBoolean(), "retain", null, 0, 1, FB_Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFB_Output_Decls_NonRetain(), ecorePackage.getEBoolean(), "nonRetain", null, 0, 1, FB_Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Output_Decls_Variables(), this.getFB_Output_Decl(), null, "variables", null, 0, -1, FB_Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_Output_DeclEClass, FB_Output_Decl.class, "FB_Output_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fB_BodyEClass, FB_Body.class, "FB_Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(method_DeclEClass, Method_Decl.class, "Method_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Decl_Access(), ecorePackage.getEString(), "access", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Decl_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Name(), this.getMethod(), null, "name", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Decl_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Temps(), this.getTemp_Var_Decls(), null, "temps", null, 0, -1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Body(), this.getFunc_Body(), null, "body", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_DeclEClass, Class_Decl.class, "Class_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Decl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Class(), this.getClass_(), null, "class", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Extends(), this.getClass_(), null, "extends", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Implements(), this.getInterface_Name_List(), null, "implements", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Methods(), this.getMethod_Decl(), null, "methods", null, 0, -1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, at.bachmann.plc.st.stLanguage.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, at.bachmann.plc.st.stLanguage.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_DeclEClass, Interface_Decl.class, "Interface_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_Decl_Interface(), this.getInterface(), null, "interface", null, 0, 1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Decl_Extends(), this.getInterface_Name_List(), null, "extends", null, 0, 1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Decl_Methods(), this.getMethod_Prototype(), null, "methods", null, 0, -1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(method_PrototypeEClass, Method_Prototype.class, "Method_Prototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethod_Prototype_Method(), this.getMethod(), null, "method", null, 0, 1, Method_Prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Prototype_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method_Prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Prototype_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Method_Prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_Name_ListEClass, Interface_Name_List.class, "Interface_Name_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_Name_List_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, Interface_Name_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prog_DeclEClass, Prog_Decl.class, "Prog_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProg_Decl_Program(), this.getProgram(), null, "program", null, 0, 1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Body(), this.getFB_Body(), null, "body", null, 0, 1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespace_DeclEClass, Namespace_Decl.class, "Namespace_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_Decl_Internal(), ecorePackage.getEBoolean(), "internal", null, 0, 1, Namespace_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_Decl_Name(), this.getNamespace(), null, "name", null, 0, 1, Namespace_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, Namespace_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_Decl_Elements(), this.getNamespace_Elements(), null, "elements", null, 0, -1, Namespace_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespace_ElementsEClass, Namespace_Elements.class, "Namespace_Elements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(using_DirectiveEClass, Using_Directive.class, "Using_Directive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUsing_Directive_Namespaces(), ecorePackage.getEString(), "namespaces", null, 0, -1, Using_Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Left(), this.getExpression(), null, "left", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Right(), this.getExpression(), null, "right", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_ExprEClass, Constant_Expr.class, "Constant_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variable_AccessEClass, Variable_Access.class, "Variable_Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_Access_Variable(), this.getVariable(), null, "variable", null, 0, 1, Variable_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Access_Access(), this.getMultibit_Part_Access(), null, "access", null, 0, 1, Variable_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multibit_Part_AccessEClass, Multibit_Part_Access.class, "Multibit_Part_Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultibit_Part_Access_BitIndex(), ecorePackage.getEString(), "bitIndex", null, 0, 1, Multibit_Part_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultibit_Part_Access_Size(), ecorePackage.getEString(), "size", null, 0, 1, Multibit_Part_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callableEClass, Callable.class, "Callable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallable_Callable(), this.getFunction(), null, "callable", null, 0, 1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallable_Parameters(), this.getParam_Assign(), null, "parameters", null, 0, -1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmt_ListEClass, Stmt_List.class, "Stmt_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStmt_List_Statements(), this.getStmt(), null, "statements", null, 0, -1, Stmt_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmtEClass, Stmt.class, "Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStmt_Type(), ecorePackage.getEString(), "type", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assign_StmtEClass, Assign_Stmt.class, "Assign_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssign_Stmt_Variable(), this.getVariable(), null, "variable", null, 0, 1, Assign_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_Assign_StmtEClass, Variable_Assign_Stmt.class, "Variable_Assign_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_Assign_Stmt_Value(), this.getExpression(), null, "value", null, 0, 1, Variable_Assign_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignment_AttemptEClass, Assignment_Attempt.class, "Assignment_Attempt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Attempt_Value(), this.getVariable(), null, "value", null, 0, 1, Assignment_Attempt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(param_AssignEClass, Param_Assign.class, "Param_Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParam_Assign_Variable(), this.getVariable(), null, "variable", null, 0, 1, Param_Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(named_ValueEClass, Named_Value.class, "Named_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamed_Value_Value(), this.getExpression(), null, "value", null, 0, 1, Named_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linked_ValueEClass, Linked_Value.class, "Linked_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinked_Value_Negated(), ecorePackage.getEBoolean(), "negated", null, 0, 1, Linked_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinked_Value_Value(), this.getVariable(), null, "value", null, 0, 1, Linked_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inRef_AssignEClass, InRef_Assign.class, "InRef_Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInRef_Assign_Value(), this.getVariable(), null, "value", null, 0, 1, InRef_Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selection_StmtEClass, Selection_Stmt.class, "Selection_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelection_Stmt_Condition(), this.getExpression(), null, "condition", null, 0, 1, Selection_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iF_StmtEClass, IF_Stmt.class, "IF_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIF_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, IF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIF_Stmt_Elseifs(), this.getELSEIF_Stmt(), null, "elseifs", null, 0, -1, IF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIF_Stmt_Else(), this.getELSE_Stmt(), null, "else", null, 0, 1, IF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseiF_StmtEClass, ELSEIF_Stmt.class, "ELSEIF_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getELSEIF_Stmt_Condition(), this.getExpression(), null, "condition", null, 0, 1, ELSEIF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getELSEIF_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, ELSEIF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsE_StmtEClass, ELSE_Stmt.class, "ELSE_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getELSE_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, ELSE_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_StmtEClass, Case_Stmt.class, "Case_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_Stmt_Cases(), this.getCase_Selection(), null, "cases", null, 0, -1, Case_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_Stmt_DefaultStatements(), this.getStmt_List(), null, "defaultStatements", null, 0, 1, Case_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_SelectionEClass, Case_Selection.class, "Case_Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_Selection_Values(), this.getCase_List(), null, "values", null, 0, 1, Case_Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_Selection_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, Case_Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_ListEClass, Case_List.class, "Case_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_List_CaseValues(), this.getCase_List_Elem(), null, "caseValues", null, 0, -1, Case_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_List_ElemEClass, Case_List_Elem.class, "Case_List_Elem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iteration_StmtEClass, Iteration_Stmt.class, "Iteration_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exit_StmtEClass, Exit_Stmt.class, "Exit_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(continue_StmtEClass, Continue_Stmt.class, "Continue_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(for_StmtEClass, For_Stmt.class, "For_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFor_Stmt_Variable(), this.getVariable(), null, "variable", null, 0, 1, For_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Stmt_Bounds(), this.getFor_List(), null, "bounds", null, 0, 1, For_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, For_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_ListEClass, For_List.class, "For_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFor_List_LowBound(), this.getExpression(), null, "lowBound", null, 0, 1, For_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_List_UpBound(), this.getExpression(), null, "upBound", null, 0, 1, For_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_List_Step(), this.getExpression(), null, "step", null, 0, 1, For_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(while_StmtEClass, While_Stmt.class, "While_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhile_Stmt_Condition(), this.getExpression(), null, "condition", null, 0, 1, While_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhile_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, While_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeat_StmtEClass, Repeat_Stmt.class, "Repeat_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRepeat_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, Repeat_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeat_Stmt_Condition(), this.getExpression(), null, "condition", null, 0, 1, Repeat_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xor_ExprEClass, Xor_Expr.class, "Xor_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(and_ExprEClass, And_Expr.class, "And_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compare_ExprEClass, Compare_Expr.class, "Compare_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(equ_ExprEClass, Equ_Expr.class, "Equ_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(add_ExprEClass, Add_Expr.class, "Add_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(power_ExprEClass, Power_Expr.class, "Power_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //StLanguagePackageImpl
