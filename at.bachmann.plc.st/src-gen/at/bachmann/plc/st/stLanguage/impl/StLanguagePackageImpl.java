/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Add_Expr;
import at.bachmann.plc.st.stLanguage.And_Expr;
import at.bachmann.plc.st.stLanguage.Array_Conform_Decl;
import at.bachmann.plc.st.stLanguage.Array_Conformand;
import at.bachmann.plc.st.stLanguage.Array_Elem_Init;
import at.bachmann.plc.st.stLanguage.Array_Elem_Init_Value;
import at.bachmann.plc.st.stLanguage.Array_Init;
import at.bachmann.plc.st.stLanguage.Array_Spec;
import at.bachmann.plc.st.stLanguage.Array_Spec_Init;
import at.bachmann.plc.st.stLanguage.Array_Type_Decl;
import at.bachmann.plc.st.stLanguage.Array_Var_Decl;
import at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init;
import at.bachmann.plc.st.stLanguage.Assign_Stmt;
import at.bachmann.plc.st.stLanguage.Assignment_Attempt;
import at.bachmann.plc.st.stLanguage.Case_List;
import at.bachmann.plc.st.stLanguage.Case_List_Elem;
import at.bachmann.plc.st.stLanguage.Case_Selection;
import at.bachmann.plc.st.stLanguage.Case_Stmt;
import at.bachmann.plc.st.stLanguage.Class_Decl;
import at.bachmann.plc.st.stLanguage.Compare_Expr;
import at.bachmann.plc.st.stLanguage.Constant_Expr;
import at.bachmann.plc.st.stLanguage.Continue_Stmt;
import at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec;
import at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.Data_Type_Decl;
import at.bachmann.plc.st.stLanguage.Direct_Variable;
import at.bachmann.plc.st.stLanguage.ELSEIF_Stmt;
import at.bachmann.plc.st.stLanguage.ELSE_Stmt;
import at.bachmann.plc.st.stLanguage.Edge_Decl;
import at.bachmann.plc.st.stLanguage.Elem_Named_Spec;
import at.bachmann.plc.st.stLanguage.Enum_Spec_Init;
import at.bachmann.plc.st.stLanguage.Enum_Type_Decl;
import at.bachmann.plc.st.stLanguage.Enum_Value;
import at.bachmann.plc.st.stLanguage.Enum_Value_Spec;
import at.bachmann.plc.st.stLanguage.Equ_Expr;
import at.bachmann.plc.st.stLanguage.Exit_Stmt;
import at.bachmann.plc.st.stLanguage.Expression;
import at.bachmann.plc.st.stLanguage.External_Decl;
import at.bachmann.plc.st.stLanguage.External_Var_Decls;
import at.bachmann.plc.st.stLanguage.FB_Body;
import at.bachmann.plc.st.stLanguage.FB_Decl;
import at.bachmann.plc.st.stLanguage.FB_Decl_Init;
import at.bachmann.plc.st.stLanguage.FB_Decl_No_Init;
import at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls;
import at.bachmann.plc.st.stLanguage.FB_Input_Decl;
import at.bachmann.plc.st.stLanguage.FB_Input_Decls;
import at.bachmann.plc.st.stLanguage.FB_Output_Decl;
import at.bachmann.plc.st.stLanguage.FB_Output_Decls;
import at.bachmann.plc.st.stLanguage.For_List;
import at.bachmann.plc.st.stLanguage.For_Stmt;
import at.bachmann.plc.st.stLanguage.Func_Body;
import at.bachmann.plc.st.stLanguage.Func_Call;
import at.bachmann.plc.st.stLanguage.Func_Decl;
import at.bachmann.plc.st.stLanguage.Func_Var_Decls;
import at.bachmann.plc.st.stLanguage.Global_Var_Decl;
import at.bachmann.plc.st.stLanguage.Global_Var_Decls;
import at.bachmann.plc.st.stLanguage.Global_Var_Spec;
import at.bachmann.plc.st.stLanguage.IF_Stmt;
import at.bachmann.plc.st.stLanguage.IO_Var_Decls;
import at.bachmann.plc.st.stLanguage.In_Out_Decls;
import at.bachmann.plc.st.stLanguage.In_Out_Var_Decl;
import at.bachmann.plc.st.stLanguage.Input_Decl;
import at.bachmann.plc.st.stLanguage.Input_Decls;
import at.bachmann.plc.st.stLanguage.Interface_Decl;
import at.bachmann.plc.st.stLanguage.Interface_Name_List;
import at.bachmann.plc.st.stLanguage.Interface_Spec_Init;
import at.bachmann.plc.st.stLanguage.Interface_Value;
import at.bachmann.plc.st.stLanguage.Interface_Var_Decl;
import at.bachmann.plc.st.stLanguage.Invocation;
import at.bachmann.plc.st.stLanguage.Iteration_Stmt;
import at.bachmann.plc.st.stLanguage.Linked_Value;
import at.bachmann.plc.st.stLanguage.Loc_Partly_Var;
import at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl;
import at.bachmann.plc.st.stLanguage.Loc_Var_Decl;
import at.bachmann.plc.st.stLanguage.Loc_Var_Decls;
import at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init;
import at.bachmann.plc.st.stLanguage.Located_At;
import at.bachmann.plc.st.stLanguage.Method_Decl;
import at.bachmann.plc.st.stLanguage.Method_Prototype;
import at.bachmann.plc.st.stLanguage.Multi_Elem_Var;
import at.bachmann.plc.st.stLanguage.Multibit_Part_Access;
import at.bachmann.plc.st.stLanguage.Named_Spec_Init;
import at.bachmann.plc.st.stLanguage.Named_Value;
import at.bachmann.plc.st.stLanguage.Namespace_H_Name;
import at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls;
import at.bachmann.plc.st.stLanguage.Other_Var_Decls;
import at.bachmann.plc.st.stLanguage.Output_Decl;
import at.bachmann.plc.st.stLanguage.Output_Decls;
import at.bachmann.plc.st.stLanguage.Param_Assign;
import at.bachmann.plc.st.stLanguage.Power_Expr;
import at.bachmann.plc.st.stLanguage.Prog_Access_Decl;
import at.bachmann.plc.st.stLanguage.Prog_Access_Decls;
import at.bachmann.plc.st.stLanguage.Prog_Decl;
import at.bachmann.plc.st.stLanguage.Ref_Addr;
import at.bachmann.plc.st.stLanguage.Ref_Assign;
import at.bachmann.plc.st.stLanguage.Ref_Deref;
import at.bachmann.plc.st.stLanguage.Ref_Spec;
import at.bachmann.plc.st.stLanguage.Ref_Spec_Init;
import at.bachmann.plc.st.stLanguage.Ref_Type_Decl;
import at.bachmann.plc.st.stLanguage.Ref_Value;
import at.bachmann.plc.st.stLanguage.Ref_Var_Decl;
import at.bachmann.plc.st.stLanguage.Repeat_Stmt;
import at.bachmann.plc.st.stLanguage.Retain_Var_Decls;
import at.bachmann.plc.st.stLanguage.ST_Program;
import at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec;
import at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.Selection_Stmt;
import at.bachmann.plc.st.stLanguage.Simple_Spec;
import at.bachmann.plc.st.stLanguage.Simple_Spec_Init;
import at.bachmann.plc.st.stLanguage.Simple_Type_Decl;
import at.bachmann.plc.st.stLanguage.Size_Info;
import at.bachmann.plc.st.stLanguage.StLanguageFactory;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Stmt;
import at.bachmann.plc.st.stLanguage.Stmt_List;
import at.bachmann.plc.st.stLanguage.Str_Type_Decl;
import at.bachmann.plc.st.stLanguage.Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.StringVar_Spec;
import at.bachmann.plc.st.stLanguage.Struct_Decl;
import at.bachmann.plc.st.stLanguage.Struct_Elem_Decl;
import at.bachmann.plc.st.stLanguage.Struct_Elem_Init;
import at.bachmann.plc.st.stLanguage.Struct_Elem_Select;
import at.bachmann.plc.st.stLanguage.Struct_Init;
import at.bachmann.plc.st.stLanguage.Struct_Spec;
import at.bachmann.plc.st.stLanguage.Struct_Spec_Init;
import at.bachmann.plc.st.stLanguage.Struct_Type_Decl;
import at.bachmann.plc.st.stLanguage.Struct_Var_Decl;
import at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init;
import at.bachmann.plc.st.stLanguage.Struct_Variable;
import at.bachmann.plc.st.stLanguage.Subrange;
import at.bachmann.plc.st.stLanguage.Subrange_Spec;
import at.bachmann.plc.st.stLanguage.Subrange_Spec_Init;
import at.bachmann.plc.st.stLanguage.Subrange_Type_Decl;
import at.bachmann.plc.st.stLanguage.Subscript;
import at.bachmann.plc.st.stLanguage.Subscript_List;
import at.bachmann.plc.st.stLanguage.Symbolic_Variable;
import at.bachmann.plc.st.stLanguage.Temp_Var_Decls;
import at.bachmann.plc.st.stLanguage.Term;
import at.bachmann.plc.st.stLanguage.Type_Decl;
import at.bachmann.plc.st.stLanguage.Using_Directive;
import at.bachmann.plc.st.stLanguage.Var_Access;
import at.bachmann.plc.st.stLanguage.Var_Decl;
import at.bachmann.plc.st.stLanguage.Var_Decl_Init;
import at.bachmann.plc.st.stLanguage.Var_Decls;
import at.bachmann.plc.st.stLanguage.Var_Spec;
import at.bachmann.plc.st.stLanguage.Variable;
import at.bachmann.plc.st.stLanguage.Variable_Access;
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
  private EClass sT_ProgramEClass = null;

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
  private EClass simple_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrange_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_Elem_DeclEClass = null;

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
  private EClass simple_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrange_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enum_Value_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elem_Named_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_Spec_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subrange_Spec_InitEClass = null;

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
  private EClass named_Spec_InitEClass = null;

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
  private EClass array_Spec_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_Elem_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_Elem_Init_ValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_Spec_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_Elem_InitEClass = null;

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
  private EClass ref_Type_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ref_Spec_InitEClass = null;

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
  private EClass variableEClass = null;

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
  private EClass multi_Elem_VarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subscript_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subscriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_VariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_Elem_SelectEClass = null;

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
  private EClass edge_DeclEClass = null;

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
  private EClass ref_Var_DeclEClass = null;

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
  private EClass array_Var_Decl_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_ConformandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_Conform_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_Var_Decl_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_Decl_No_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fB_Decl_InitEClass = null;

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
  private EClass array_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass struct_Var_DeclEClass = null;

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
  private EClass retain_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loc_Var_DeclsEClass = null;

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
  private EClass loc_Partly_Var_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loc_Partly_VarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_SpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringVar_SpecEClass = null;

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
  private EClass other_Var_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass no_Retain_Var_DeclsEClass = null;

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
  private EClass interface_DeclEClass = null;

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
  private EClass interface_Spec_InitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_ValueEClass = null;

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
  private EClass prog_Access_DeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prog_Access_DeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespace_H_NameEClass = null;

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
  private EClass size_InfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass func_CallEClass = null;

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
  private EClass invocationEClass = null;

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
  public EClass getST_Program()
  {
    return sT_ProgramEClass;
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
  public EReference getData_Type_Decl_TypeDeclarations()
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
  public EAttribute getType_Decl_Type()
  {
    return (EAttribute)type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimple_Type_Decl()
  {
    return simple_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Type_Decl_Initialization()
  {
    return (EReference)simple_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubrange_Type_Decl()
  {
    return subrange_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubrange_Type_Decl_Initialization()
  {
    return (EReference)subrange_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum_Type_Decl()
  {
    return enum_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Type_Decl_Initialization()
  {
    return (EReference)enum_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Type_Decl()
  {
    return array_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Type_Decl_Initialization()
  {
    return (EReference)array_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Type_Decl()
  {
    return struct_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Type_Decl_Initialization()
  {
    return (EReference)struct_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Elem_Decl()
  {
    return struct_Elem_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStruct_Elem_Decl_Type()
  {
    return (EAttribute)struct_Elem_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Elem_Decl_Location()
  {
    return (EReference)struct_Elem_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Elem_Decl_Access()
  {
    return (EReference)struct_Elem_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Elem_Decl_Initialization()
  {
    return (EReference)struct_Elem_DeclEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getStr_Type_Decl_Initialization()
  {
    return (EAttribute)str_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStr_Type_Decl_InitialValue()
  {
    return (EAttribute)str_Type_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimple_Spec()
  {
    return simple_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubrange_Spec()
  {
    return subrange_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubrange_Spec_Type()
  {
    return (EAttribute)subrange_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubrange_Spec_Range()
  {
    return (EReference)subrange_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubrange_Spec_RefRange()
  {
    return (EAttribute)subrange_SpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum_Value_Spec()
  {
    return enum_Value_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Value_Spec_Type()
  {
    return (EAttribute)enum_Value_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Value_Spec_InitialValue()
  {
    return (EAttribute)enum_Value_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Value_Spec_Initialization()
  {
    return (EReference)enum_Value_SpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElem_Named_Spec()
  {
    return elem_Named_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElem_Named_Spec_Type()
  {
    return (EAttribute)elem_Named_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElem_Named_Spec_Initialization()
  {
    return (EReference)elem_Named_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Spec()
  {
    return array_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Spec_Ranges()
  {
    return (EReference)array_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArray_Spec_RefDataType()
  {
    return (EAttribute)array_SpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Spec()
  {
    return struct_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimple_Spec_Init()
  {
    return simple_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Spec_Init_Type()
  {
    return (EReference)simple_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimple_Spec_Init_InitialValue()
  {
    return (EReference)simple_Spec_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubrange_Spec_Init()
  {
    return subrange_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubrange_Spec_Init_Type()
  {
    return (EReference)subrange_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubrange_Spec_Init_InitialValue()
  {
    return (EAttribute)subrange_Spec_InitEClass.getEStructuralFeatures().get(1);
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
  public EClass getNamed_Spec_Init()
  {
    return named_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamed_Spec_Init_InitialValues()
  {
    return (EReference)named_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamed_Spec_Init_Value()
  {
    return (EReference)named_Spec_InitEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getEnum_Spec_Init_EnumItem()
  {
    return (EAttribute)enum_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Spec_Init_RefEnum()
  {
    return (EAttribute)enum_Spec_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Spec_Init_Value()
  {
    return (EReference)enum_Spec_InitEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getEnum_Value_Type()
  {
    return (EAttribute)enum_ValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Value_Value()
  {
    return (EAttribute)enum_ValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Spec_Init()
  {
    return array_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Spec_Init_Type()
  {
    return (EReference)array_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Spec_Init_InitialValue()
  {
    return (EReference)array_Spec_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Init()
  {
    return array_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Init_InitialValues()
  {
    return (EReference)array_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Elem_Init()
  {
    return array_Elem_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Elem_Init_Initialization()
  {
    return (EReference)array_Elem_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArray_Elem_Init_InitialValue()
  {
    return (EAttribute)array_Elem_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Elem_Init_Bound()
  {
    return (EReference)array_Elem_InitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Elem_Init_Value()
  {
    return array_Elem_Init_ValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Spec_Init()
  {
    return struct_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStruct_Spec_Init_Type()
  {
    return (EAttribute)struct_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Spec_Init_InitialValue()
  {
    return (EReference)struct_Spec_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Init()
  {
    return struct_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Init_ElementInits()
  {
    return (EReference)struct_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Elem_Init()
  {
    return struct_Elem_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStruct_Elem_Init_Type()
  {
    return (EAttribute)struct_Elem_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Elem_Init_Initialization()
  {
    return (EReference)struct_Elem_InitEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDirect_Variable_LocationPrefix()
  {
    return (EAttribute)direct_VariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirect_Variable_SizePrefix()
  {
    return (EAttribute)direct_VariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirect_Variable_BitIndexes()
  {
    return (EAttribute)direct_VariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef_Type_Decl()
  {
    return ref_Type_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Type_Decl_Initialization()
  {
    return (EReference)ref_Type_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef_Spec_Init()
  {
    return ref_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Spec_Init_Type()
  {
    return (EReference)ref_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Spec_Init_InitialValue()
  {
    return (EReference)ref_Spec_InitEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getRef_Spec_Reference()
  {
    return (EAttribute)ref_SpecEClass.getEStructuralFeatures().get(0);
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
  public EReference getRef_Value_Reference()
  {
    return (EReference)ref_ValueEClass.getEStructuralFeatures().get(0);
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
  public EReference getRef_Addr_ReferencedVar()
  {
    return (EReference)ref_AddrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRef_Addr_ReferencedName()
  {
    return (EAttribute)ref_AddrEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getRef_Assign_Type()
  {
    return (EAttribute)ref_AssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRef_Assign_InitialValue()
  {
    return (EAttribute)ref_AssignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Assign_Initialization()
  {
    return (EReference)ref_AssignEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getRef_Deref_Name()
  {
    return (EAttribute)ref_DerefEClass.getEStructuralFeatures().get(0);
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
  public EClass getSymbolic_Variable()
  {
    return symbolic_VariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolic_Variable_Qualifiers()
  {
    return (EAttribute)symbolic_VariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolic_Variable_Variable()
  {
    return (EReference)symbolic_VariableEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getVar_Access_Variable()
  {
    return (EAttribute)var_AccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Access_Reference()
  {
    return (EReference)var_AccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulti_Elem_Var()
  {
    return multi_Elem_VarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Elem_Var_Access()
  {
    return (EReference)multi_Elem_VarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Elem_Var_Elements()
  {
    return (EReference)multi_Elem_VarEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubscript_List()
  {
    return subscript_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubscript_List_Item()
  {
    return (EReference)subscript_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubscript()
  {
    return subscriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Variable()
  {
    return struct_VariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Elem_Select()
  {
    return struct_Elem_SelectEClass;
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
  public EAttribute getInput_Decls_RetainType()
  {
    return (EAttribute)input_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Decls_Inputs()
  {
    return (EReference)input_DeclsEClass.getEStructuralFeatures().get(1);
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
  public EClass getEdge_Decl()
  {
    return edge_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdge_Decl_Variables()
  {
    return (EReference)edge_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdge_Decl_EdgeType()
  {
    return (EAttribute)edge_DeclEClass.getEStructuralFeatures().get(1);
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
  public EClass getRef_Var_Decl()
  {
    return ref_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Var_Decl_Variables()
  {
    return (EReference)ref_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRef_Var_Decl_Initialization()
  {
    return (EReference)ref_Var_DeclEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getInterface_Var_Decl_Initialization()
  {
    return (EAttribute)interface_Var_DeclEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getVariable_List_Variables()
  {
    return (EAttribute)variable_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Var_Decl_Init()
  {
    return array_Var_Decl_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Var_Decl_Init_Variables()
  {
    return (EReference)array_Var_Decl_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Var_Decl_Init_Initialization()
  {
    return (EReference)array_Var_Decl_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Conformand()
  {
    return array_ConformandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArray_Conformand_DataType()
  {
    return (EAttribute)array_ConformandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Conform_Decl()
  {
    return array_Conform_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Conform_Decl_Variables()
  {
    return (EReference)array_Conform_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Conform_Decl_Conformand()
  {
    return (EReference)array_Conform_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Var_Decl_Init()
  {
    return struct_Var_Decl_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Var_Decl_Init_Variables()
  {
    return (EReference)struct_Var_Decl_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Var_Decl_Init_Initialization()
  {
    return (EReference)struct_Var_Decl_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Decl_No_Init()
  {
    return fB_Decl_No_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFB_Decl_No_Init_Names()
  {
    return (EAttribute)fB_Decl_No_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFB_Decl_No_Init_Type()
  {
    return (EAttribute)fB_Decl_No_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFB_Decl_Init()
  {
    return fB_Decl_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Init_Fb()
  {
    return (EReference)fB_Decl_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Init_Initialization()
  {
    return (EReference)fB_Decl_InitEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getOutput_Decls_RetainType()
  {
    return (EAttribute)output_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Decls_Outputs()
  {
    return (EReference)output_DeclsEClass.getEStructuralFeatures().get(1);
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
  public EReference getIn_Out_Decls_Inouts()
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
  public EReference getVar_Decl_Initialization()
  {
    return (EReference)var_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_Var_Decl()
  {
    return array_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Var_Decl_Variables()
  {
    return (EReference)array_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Var_Decl_Initialization()
  {
    return (EReference)array_Var_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct_Var_Decl()
  {
    return struct_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Var_Decl_Variables()
  {
    return (EReference)struct_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStruct_Var_Decl_Initialization()
  {
    return (EAttribute)struct_Var_DeclEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getVar_Decls_Access()
  {
    return (EAttribute)var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Decls_Variables()
  {
    return (EReference)var_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRetain_Var_Decls()
  {
    return retain_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRetain_Var_Decls_Access()
  {
    return (EAttribute)retain_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRetain_Var_Decls_Variables()
  {
    return (EReference)retain_Var_DeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoc_Var_Decls()
  {
    return loc_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoc_Var_Decls_Modifier()
  {
    return (EAttribute)loc_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoc_Var_Decls_Variables()
  {
    return (EReference)loc_Var_DeclsEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getLoc_Var_Decl_Name()
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
  public EReference getTemp_Var_Decls_Variables()
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
  public EReference getExternal_Var_Decls_Variables()
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
  public EAttribute getExternal_Decl_Name()
  {
    return (EAttribute)external_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternal_Decl_Initialization()
  {
    return (EReference)external_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternal_Decl_Type()
  {
    return (EAttribute)external_DeclEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getGlobal_Var_Decls_Modifier()
  {
    return (EAttribute)global_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobal_Var_Decls_Variables()
  {
    return (EReference)global_Var_DeclsEClass.getEStructuralFeatures().get(1);
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
  public EReference getGlobal_Var_Decl_Name()
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
  public EAttribute getGlobal_Var_Decl_Type()
  {
    return (EAttribute)global_Var_DeclEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getGlobal_Var_Spec_Variables()
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
  public EAttribute getS_Byte_Str_Spec_Bound()
  {
    return (EAttribute)s_Byte_Str_SpecEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getD_Byte_Str_Spec_Bound()
  {
    return (EAttribute)d_Byte_Str_SpecEClass.getEStructuralFeatures().get(0);
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
  public EClass getLoc_Partly_Var_Decl()
  {
    return loc_Partly_Var_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoc_Partly_Var_Decl_Modifier()
  {
    return (EAttribute)loc_Partly_Var_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoc_Partly_Var_Decl_Variables()
  {
    return (EReference)loc_Partly_Var_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoc_Partly_Var()
  {
    return loc_Partly_VarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoc_Partly_Var_Name()
  {
    return (EAttribute)loc_Partly_VarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoc_Partly_Var_LocationPrefix()
  {
    return (EAttribute)loc_Partly_VarEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoc_Partly_Var_Initialization()
  {
    return (EReference)loc_Partly_VarEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar_Spec()
  {
    return var_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_Spec_Type()
  {
    return (EAttribute)var_SpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringVar_Spec()
  {
    return stringVar_SpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringVar_Spec_Bound()
  {
    return (EAttribute)stringVar_SpecEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getFunc_Decl_Name()
  {
    return (EAttribute)func_DeclEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getFB_Decl_Name()
  {
    return (EAttribute)fB_DeclEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getFB_Decl_Extends()
  {
    return (EAttribute)fB_DeclEClass.getEStructuralFeatures().get(3);
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
  public EReference getFB_Decl_Others()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Methods()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Decl_Body()
  {
    return (EReference)fB_DeclEClass.getEStructuralFeatures().get(10);
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
  public EAttribute getFB_Input_Decls_Modifier()
  {
    return (EAttribute)fB_Input_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Input_Decls_Variables()
  {
    return (EReference)fB_Input_DeclsEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getFB_Output_Decls_Modifier()
  {
    return (EAttribute)fB_Output_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFB_Output_Decls_Variables()
  {
    return (EReference)fB_Output_DeclsEClass.getEStructuralFeatures().get(1);
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
  public EClass getOther_Var_Decls()
  {
    return other_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNo_Retain_Var_Decls()
  {
    return no_Retain_Var_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNo_Retain_Var_Decls_Access()
  {
    return (EAttribute)no_Retain_Var_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNo_Retain_Var_Decls_Variables()
  {
    return (EReference)no_Retain_Var_DeclsEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getMethod_Decl_Name()
  {
    return (EAttribute)method_DeclEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getClass_Decl_Name()
  {
    return (EAttribute)class_DeclEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getClass_Decl_Extends()
  {
    return (EAttribute)class_DeclEClass.getEStructuralFeatures().get(3);
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
  public EReference getClass_Decl_Others()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Decl_Methods()
  {
    return (EReference)class_DeclEClass.getEStructuralFeatures().get(7);
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
  public EAttribute getInterface_Decl_Name()
  {
    return (EAttribute)interface_DeclEClass.getEStructuralFeatures().get(0);
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
  public EClass getMethod_Prototype()
  {
    return method_PrototypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Prototype_Name()
  {
    return (EAttribute)method_PrototypeEClass.getEStructuralFeatures().get(0);
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
  public EClass getInterface_Spec_Init()
  {
    return interface_Spec_InitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Spec_Init_Variables()
  {
    return (EReference)interface_Spec_InitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Spec_Init_Initialization()
  {
    return (EReference)interface_Spec_InitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_Value()
  {
    return interface_ValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Value_Variable()
  {
    return (EReference)interface_ValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Value_VariableName()
  {
    return (EAttribute)interface_ValueEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getInterface_Name_List_Interfaces()
  {
    return (EAttribute)interface_Name_ListEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getProg_Decl_Name()
  {
    return (EAttribute)prog_DeclEClass.getEStructuralFeatures().get(0);
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
  public EReference getProg_Decl_Temps()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Others()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Locals()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Acesses()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Decl_Body()
  {
    return (EReference)prog_DeclEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProg_Access_Decls()
  {
    return prog_Access_DeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Access_Decls_Accesses()
  {
    return (EReference)prog_Access_DeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProg_Access_Decl()
  {
    return prog_Access_DeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProg_Access_Decl_Name()
  {
    return (EAttribute)prog_Access_DeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Access_Decl_Variable()
  {
    return (EReference)prog_Access_DeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProg_Access_Decl_Access()
  {
    return (EReference)prog_Access_DeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProg_Access_Decl_DataType()
  {
    return (EAttribute)prog_Access_DeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProg_Access_Decl_Direction()
  {
    return (EAttribute)prog_Access_DeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace_H_Name()
  {
    return namespace_H_NameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_H_Name_Qualifier()
  {
    return (EAttribute)namespace_H_NameEClass.getEStructuralFeatures().get(0);
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
  public EReference getUsing_Directive_Namespaces()
  {
    return (EReference)using_DirectiveEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getMultibit_Part_Access_AccessSize()
  {
    return (EAttribute)multibit_Part_AccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultibit_Part_Access_AccessSizeInfo()
  {
    return (EReference)multibit_Part_AccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSize_Info()
  {
    return size_InfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Info_SizePrefix()
  {
    return (EAttribute)size_InfoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Info_Size()
  {
    return (EAttribute)size_InfoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunc_Call()
  {
    return func_CallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunc_Call_Access()
  {
    return (EAttribute)func_CallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunc_Call_Parameters()
  {
    return (EReference)func_CallEClass.getEStructuralFeatures().get(1);
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
  public EReference getStmt_List_Statement()
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
  public EClass getAssign_Stmt()
  {
    return assign_StmtEClass;
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
  public EReference getVariable_Assign_Stmt_Left()
  {
    return (EReference)variable_Assign_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Assign_Stmt_Right()
  {
    return (EReference)variable_Assign_StmtEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getAssignment_Attempt_LeftName()
  {
    return (EAttribute)assignment_AttemptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Attempt_LeftReference()
  {
    return (EReference)assignment_AttemptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Attempt_RightName()
  {
    return (EAttribute)assignment_AttemptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Attempt_RightReference()
  {
    return (EReference)assignment_AttemptEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvocation()
  {
    return invocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInvocation_Method()
  {
    return (EAttribute)invocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_Parameters()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(1);
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
  public EClass getNamed_Value()
  {
    return named_ValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamed_Value_Name()
  {
    return (EAttribute)named_ValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamed_Value_Value()
  {
    return (EReference)named_ValueEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getLinked_Value_Name()
  {
    return (EAttribute)linked_ValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinked_Value_Value()
  {
    return (EReference)linked_ValueEClass.getEStructuralFeatures().get(2);
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
  public EClass getIF_Stmt()
  {
    return iF_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_Stmt_Condition()
  {
    return (EReference)iF_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_Stmt_Statements()
  {
    return (EReference)iF_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_Stmt_Elseifs()
  {
    return (EReference)iF_StmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_Stmt_Else()
  {
    return (EReference)iF_StmtEClass.getEStructuralFeatures().get(3);
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
  public EReference getCase_Stmt_Expression()
  {
    return (EReference)case_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Stmt_Cases()
  {
    return (EReference)case_StmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Stmt_DefaultStatements()
  {
    return (EReference)case_StmtEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getFor_Stmt_Variable()
  {
    return (EAttribute)for_StmtEClass.getEStructuralFeatures().get(0);
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
    sT_ProgramEClass = createEClass(ST_PROGRAM);

    data_Type_DeclEClass = createEClass(DATA_TYPE_DECL);
    createEReference(data_Type_DeclEClass, DATA_TYPE_DECL__TYPE_DECLARATIONS);

    struct_DeclEClass = createEClass(STRUCT_DECL);
    createEAttribute(struct_DeclEClass, STRUCT_DECL__OVERLAP);
    createEReference(struct_DeclEClass, STRUCT_DECL__ELEMENTS);

    type_DeclEClass = createEClass(TYPE_DECL);
    createEAttribute(type_DeclEClass, TYPE_DECL__TYPE);

    simple_Type_DeclEClass = createEClass(SIMPLE_TYPE_DECL);
    createEReference(simple_Type_DeclEClass, SIMPLE_TYPE_DECL__INITIALIZATION);

    subrange_Type_DeclEClass = createEClass(SUBRANGE_TYPE_DECL);
    createEReference(subrange_Type_DeclEClass, SUBRANGE_TYPE_DECL__INITIALIZATION);

    enum_Type_DeclEClass = createEClass(ENUM_TYPE_DECL);
    createEReference(enum_Type_DeclEClass, ENUM_TYPE_DECL__INITIALIZATION);

    array_Type_DeclEClass = createEClass(ARRAY_TYPE_DECL);
    createEReference(array_Type_DeclEClass, ARRAY_TYPE_DECL__INITIALIZATION);

    struct_Type_DeclEClass = createEClass(STRUCT_TYPE_DECL);
    createEReference(struct_Type_DeclEClass, STRUCT_TYPE_DECL__INITIALIZATION);

    struct_Elem_DeclEClass = createEClass(STRUCT_ELEM_DECL);
    createEAttribute(struct_Elem_DeclEClass, STRUCT_ELEM_DECL__TYPE);
    createEReference(struct_Elem_DeclEClass, STRUCT_ELEM_DECL__LOCATION);
    createEReference(struct_Elem_DeclEClass, STRUCT_ELEM_DECL__ACCESS);
    createEReference(struct_Elem_DeclEClass, STRUCT_ELEM_DECL__INITIALIZATION);

    str_Type_DeclEClass = createEClass(STR_TYPE_DECL);
    createEAttribute(str_Type_DeclEClass, STR_TYPE_DECL__INITIALIZATION);
    createEAttribute(str_Type_DeclEClass, STR_TYPE_DECL__INITIAL_VALUE);

    simple_SpecEClass = createEClass(SIMPLE_SPEC);

    subrange_SpecEClass = createEClass(SUBRANGE_SPEC);
    createEAttribute(subrange_SpecEClass, SUBRANGE_SPEC__TYPE);
    createEReference(subrange_SpecEClass, SUBRANGE_SPEC__RANGE);
    createEAttribute(subrange_SpecEClass, SUBRANGE_SPEC__REF_RANGE);

    enum_Value_SpecEClass = createEClass(ENUM_VALUE_SPEC);
    createEAttribute(enum_Value_SpecEClass, ENUM_VALUE_SPEC__TYPE);
    createEAttribute(enum_Value_SpecEClass, ENUM_VALUE_SPEC__INITIAL_VALUE);
    createEReference(enum_Value_SpecEClass, ENUM_VALUE_SPEC__INITIALIZATION);

    elem_Named_SpecEClass = createEClass(ELEM_NAMED_SPEC);
    createEAttribute(elem_Named_SpecEClass, ELEM_NAMED_SPEC__TYPE);
    createEReference(elem_Named_SpecEClass, ELEM_NAMED_SPEC__INITIALIZATION);

    array_SpecEClass = createEClass(ARRAY_SPEC);
    createEReference(array_SpecEClass, ARRAY_SPEC__RANGES);
    createEAttribute(array_SpecEClass, ARRAY_SPEC__REF_DATA_TYPE);

    struct_SpecEClass = createEClass(STRUCT_SPEC);

    simple_Spec_InitEClass = createEClass(SIMPLE_SPEC_INIT);
    createEReference(simple_Spec_InitEClass, SIMPLE_SPEC_INIT__TYPE);
    createEReference(simple_Spec_InitEClass, SIMPLE_SPEC_INIT__INITIAL_VALUE);

    subrange_Spec_InitEClass = createEClass(SUBRANGE_SPEC_INIT);
    createEReference(subrange_Spec_InitEClass, SUBRANGE_SPEC_INIT__TYPE);
    createEAttribute(subrange_Spec_InitEClass, SUBRANGE_SPEC_INIT__INITIAL_VALUE);

    subrangeEClass = createEClass(SUBRANGE);
    createEReference(subrangeEClass, SUBRANGE__LOW_BOUND);
    createEReference(subrangeEClass, SUBRANGE__UP_BOUND);

    named_Spec_InitEClass = createEClass(NAMED_SPEC_INIT);
    createEReference(named_Spec_InitEClass, NAMED_SPEC_INIT__INITIAL_VALUES);
    createEReference(named_Spec_InitEClass, NAMED_SPEC_INIT__VALUE);

    enum_Spec_InitEClass = createEClass(ENUM_SPEC_INIT);
    createEAttribute(enum_Spec_InitEClass, ENUM_SPEC_INIT__ENUM_ITEM);
    createEAttribute(enum_Spec_InitEClass, ENUM_SPEC_INIT__REF_ENUM);
    createEReference(enum_Spec_InitEClass, ENUM_SPEC_INIT__VALUE);

    enum_ValueEClass = createEClass(ENUM_VALUE);
    createEAttribute(enum_ValueEClass, ENUM_VALUE__TYPE);
    createEAttribute(enum_ValueEClass, ENUM_VALUE__VALUE);

    array_Spec_InitEClass = createEClass(ARRAY_SPEC_INIT);
    createEReference(array_Spec_InitEClass, ARRAY_SPEC_INIT__TYPE);
    createEReference(array_Spec_InitEClass, ARRAY_SPEC_INIT__INITIAL_VALUE);

    array_InitEClass = createEClass(ARRAY_INIT);
    createEReference(array_InitEClass, ARRAY_INIT__INITIAL_VALUES);

    array_Elem_InitEClass = createEClass(ARRAY_ELEM_INIT);
    createEReference(array_Elem_InitEClass, ARRAY_ELEM_INIT__INITIALIZATION);
    createEAttribute(array_Elem_InitEClass, ARRAY_ELEM_INIT__INITIAL_VALUE);
    createEReference(array_Elem_InitEClass, ARRAY_ELEM_INIT__BOUND);

    array_Elem_Init_ValueEClass = createEClass(ARRAY_ELEM_INIT_VALUE);

    struct_Spec_InitEClass = createEClass(STRUCT_SPEC_INIT);
    createEAttribute(struct_Spec_InitEClass, STRUCT_SPEC_INIT__TYPE);
    createEReference(struct_Spec_InitEClass, STRUCT_SPEC_INIT__INITIAL_VALUE);

    struct_InitEClass = createEClass(STRUCT_INIT);
    createEReference(struct_InitEClass, STRUCT_INIT__ELEMENT_INITS);

    struct_Elem_InitEClass = createEClass(STRUCT_ELEM_INIT);
    createEAttribute(struct_Elem_InitEClass, STRUCT_ELEM_INIT__TYPE);
    createEReference(struct_Elem_InitEClass, STRUCT_ELEM_INIT__INITIALIZATION);

    direct_VariableEClass = createEClass(DIRECT_VARIABLE);
    createEAttribute(direct_VariableEClass, DIRECT_VARIABLE__LOCATION_PREFIX);
    createEAttribute(direct_VariableEClass, DIRECT_VARIABLE__SIZE_PREFIX);
    createEAttribute(direct_VariableEClass, DIRECT_VARIABLE__BIT_INDEXES);

    ref_Type_DeclEClass = createEClass(REF_TYPE_DECL);
    createEReference(ref_Type_DeclEClass, REF_TYPE_DECL__INITIALIZATION);

    ref_Spec_InitEClass = createEClass(REF_SPEC_INIT);
    createEReference(ref_Spec_InitEClass, REF_SPEC_INIT__TYPE);
    createEReference(ref_Spec_InitEClass, REF_SPEC_INIT__INITIAL_VALUE);

    ref_SpecEClass = createEClass(REF_SPEC);
    createEAttribute(ref_SpecEClass, REF_SPEC__REFERENCE);

    ref_ValueEClass = createEClass(REF_VALUE);
    createEReference(ref_ValueEClass, REF_VALUE__REFERENCE);

    ref_AddrEClass = createEClass(REF_ADDR);
    createEReference(ref_AddrEClass, REF_ADDR__REFERENCED_VAR);
    createEAttribute(ref_AddrEClass, REF_ADDR__REFERENCED_NAME);

    ref_AssignEClass = createEClass(REF_ASSIGN);
    createEAttribute(ref_AssignEClass, REF_ASSIGN__TYPE);
    createEAttribute(ref_AssignEClass, REF_ASSIGN__INITIAL_VALUE);
    createEReference(ref_AssignEClass, REF_ASSIGN__INITIALIZATION);

    ref_DerefEClass = createEClass(REF_DEREF);
    createEAttribute(ref_DerefEClass, REF_DEREF__NAME);

    variableEClass = createEClass(VARIABLE);

    symbolic_VariableEClass = createEClass(SYMBOLIC_VARIABLE);
    createEAttribute(symbolic_VariableEClass, SYMBOLIC_VARIABLE__QUALIFIERS);
    createEReference(symbolic_VariableEClass, SYMBOLIC_VARIABLE__VARIABLE);

    var_AccessEClass = createEClass(VAR_ACCESS);
    createEAttribute(var_AccessEClass, VAR_ACCESS__VARIABLE);
    createEReference(var_AccessEClass, VAR_ACCESS__REFERENCE);

    multi_Elem_VarEClass = createEClass(MULTI_ELEM_VAR);
    createEReference(multi_Elem_VarEClass, MULTI_ELEM_VAR__ACCESS);
    createEReference(multi_Elem_VarEClass, MULTI_ELEM_VAR__ELEMENTS);

    subscript_ListEClass = createEClass(SUBSCRIPT_LIST);
    createEReference(subscript_ListEClass, SUBSCRIPT_LIST__ITEM);

    subscriptEClass = createEClass(SUBSCRIPT);

    struct_VariableEClass = createEClass(STRUCT_VARIABLE);

    struct_Elem_SelectEClass = createEClass(STRUCT_ELEM_SELECT);

    input_DeclsEClass = createEClass(INPUT_DECLS);
    createEAttribute(input_DeclsEClass, INPUT_DECLS__RETAIN_TYPE);
    createEReference(input_DeclsEClass, INPUT_DECLS__INPUTS);

    input_DeclEClass = createEClass(INPUT_DECL);

    edge_DeclEClass = createEClass(EDGE_DECL);
    createEReference(edge_DeclEClass, EDGE_DECL__VARIABLES);
    createEAttribute(edge_DeclEClass, EDGE_DECL__EDGE_TYPE);

    var_Decl_InitEClass = createEClass(VAR_DECL_INIT);
    createEReference(var_Decl_InitEClass, VAR_DECL_INIT__VARIABLES);
    createEReference(var_Decl_InitEClass, VAR_DECL_INIT__INITIALIZATION);

    ref_Var_DeclEClass = createEClass(REF_VAR_DECL);
    createEReference(ref_Var_DeclEClass, REF_VAR_DECL__VARIABLES);
    createEReference(ref_Var_DeclEClass, REF_VAR_DECL__INITIALIZATION);

    interface_Var_DeclEClass = createEClass(INTERFACE_VAR_DECL);
    createEReference(interface_Var_DeclEClass, INTERFACE_VAR_DECL__VARIABLES);
    createEAttribute(interface_Var_DeclEClass, INTERFACE_VAR_DECL__INITIALIZATION);

    variable_ListEClass = createEClass(VARIABLE_LIST);
    createEAttribute(variable_ListEClass, VARIABLE_LIST__VARIABLES);

    array_Var_Decl_InitEClass = createEClass(ARRAY_VAR_DECL_INIT);
    createEReference(array_Var_Decl_InitEClass, ARRAY_VAR_DECL_INIT__VARIABLES);
    createEReference(array_Var_Decl_InitEClass, ARRAY_VAR_DECL_INIT__INITIALIZATION);

    array_ConformandEClass = createEClass(ARRAY_CONFORMAND);
    createEAttribute(array_ConformandEClass, ARRAY_CONFORMAND__DATA_TYPE);

    array_Conform_DeclEClass = createEClass(ARRAY_CONFORM_DECL);
    createEReference(array_Conform_DeclEClass, ARRAY_CONFORM_DECL__VARIABLES);
    createEReference(array_Conform_DeclEClass, ARRAY_CONFORM_DECL__CONFORMAND);

    struct_Var_Decl_InitEClass = createEClass(STRUCT_VAR_DECL_INIT);
    createEReference(struct_Var_Decl_InitEClass, STRUCT_VAR_DECL_INIT__VARIABLES);
    createEReference(struct_Var_Decl_InitEClass, STRUCT_VAR_DECL_INIT__INITIALIZATION);

    fB_Decl_No_InitEClass = createEClass(FB_DECL_NO_INIT);
    createEAttribute(fB_Decl_No_InitEClass, FB_DECL_NO_INIT__NAMES);
    createEAttribute(fB_Decl_No_InitEClass, FB_DECL_NO_INIT__TYPE);

    fB_Decl_InitEClass = createEClass(FB_DECL_INIT);
    createEReference(fB_Decl_InitEClass, FB_DECL_INIT__FB);
    createEReference(fB_Decl_InitEClass, FB_DECL_INIT__INITIALIZATION);

    output_DeclsEClass = createEClass(OUTPUT_DECLS);
    createEAttribute(output_DeclsEClass, OUTPUT_DECLS__RETAIN_TYPE);
    createEReference(output_DeclsEClass, OUTPUT_DECLS__OUTPUTS);

    output_DeclEClass = createEClass(OUTPUT_DECL);

    in_Out_DeclsEClass = createEClass(IN_OUT_DECLS);
    createEReference(in_Out_DeclsEClass, IN_OUT_DECLS__INOUTS);

    in_Out_Var_DeclEClass = createEClass(IN_OUT_VAR_DECL);

    var_DeclEClass = createEClass(VAR_DECL);
    createEReference(var_DeclEClass, VAR_DECL__VARIABLES);
    createEReference(var_DeclEClass, VAR_DECL__INITIALIZATION);

    array_Var_DeclEClass = createEClass(ARRAY_VAR_DECL);
    createEReference(array_Var_DeclEClass, ARRAY_VAR_DECL__VARIABLES);
    createEReference(array_Var_DeclEClass, ARRAY_VAR_DECL__INITIALIZATION);

    struct_Var_DeclEClass = createEClass(STRUCT_VAR_DECL);
    createEReference(struct_Var_DeclEClass, STRUCT_VAR_DECL__VARIABLES);
    createEAttribute(struct_Var_DeclEClass, STRUCT_VAR_DECL__INITIALIZATION);

    var_DeclsEClass = createEClass(VAR_DECLS);
    createEAttribute(var_DeclsEClass, VAR_DECLS__ACCESS);
    createEReference(var_DeclsEClass, VAR_DECLS__VARIABLES);

    retain_Var_DeclsEClass = createEClass(RETAIN_VAR_DECLS);
    createEAttribute(retain_Var_DeclsEClass, RETAIN_VAR_DECLS__ACCESS);
    createEReference(retain_Var_DeclsEClass, RETAIN_VAR_DECLS__VARIABLES);

    loc_Var_DeclsEClass = createEClass(LOC_VAR_DECLS);
    createEAttribute(loc_Var_DeclsEClass, LOC_VAR_DECLS__MODIFIER);
    createEReference(loc_Var_DeclsEClass, LOC_VAR_DECLS__VARIABLES);

    loc_Var_DeclEClass = createEClass(LOC_VAR_DECL);
    createEAttribute(loc_Var_DeclEClass, LOC_VAR_DECL__NAME);
    createEReference(loc_Var_DeclEClass, LOC_VAR_DECL__LOCATION);
    createEReference(loc_Var_DeclEClass, LOC_VAR_DECL__INITIALIZATION);

    temp_Var_DeclsEClass = createEClass(TEMP_VAR_DECLS);
    createEReference(temp_Var_DeclsEClass, TEMP_VAR_DECLS__VARIABLES);

    external_Var_DeclsEClass = createEClass(EXTERNAL_VAR_DECLS);
    createEReference(external_Var_DeclsEClass, EXTERNAL_VAR_DECLS__VARIABLES);

    external_DeclEClass = createEClass(EXTERNAL_DECL);
    createEAttribute(external_DeclEClass, EXTERNAL_DECL__NAME);
    createEReference(external_DeclEClass, EXTERNAL_DECL__INITIALIZATION);
    createEAttribute(external_DeclEClass, EXTERNAL_DECL__TYPE);

    global_Var_DeclsEClass = createEClass(GLOBAL_VAR_DECLS);
    createEAttribute(global_Var_DeclsEClass, GLOBAL_VAR_DECLS__MODIFIER);
    createEReference(global_Var_DeclsEClass, GLOBAL_VAR_DECLS__VARIABLES);

    global_Var_DeclEClass = createEClass(GLOBAL_VAR_DECL);
    createEReference(global_Var_DeclEClass, GLOBAL_VAR_DECL__NAME);
    createEReference(global_Var_DeclEClass, GLOBAL_VAR_DECL__INITIALIZATION);
    createEAttribute(global_Var_DeclEClass, GLOBAL_VAR_DECL__TYPE);

    global_Var_SpecEClass = createEClass(GLOBAL_VAR_SPEC);
    createEAttribute(global_Var_SpecEClass, GLOBAL_VAR_SPEC__VARIABLES);
    createEReference(global_Var_SpecEClass, GLOBAL_VAR_SPEC__LOCATION);

    loc_Var_Spec_InitEClass = createEClass(LOC_VAR_SPEC_INIT);

    located_AtEClass = createEClass(LOCATED_AT);

    str_Var_DeclEClass = createEClass(STR_VAR_DECL);
    createEReference(str_Var_DeclEClass, STR_VAR_DECL__VARIABLES);

    s_Byte_Str_Var_DeclEClass = createEClass(SBYTE_STR_VAR_DECL);
    createEReference(s_Byte_Str_Var_DeclEClass, SBYTE_STR_VAR_DECL__INITIALIZATION);

    s_Byte_Str_SpecEClass = createEClass(SBYTE_STR_SPEC);
    createEAttribute(s_Byte_Str_SpecEClass, SBYTE_STR_SPEC__BOUND);
    createEAttribute(s_Byte_Str_SpecEClass, SBYTE_STR_SPEC__INITIAL_VALUE);

    d_Byte_Str_Var_DeclEClass = createEClass(DBYTE_STR_VAR_DECL);
    createEReference(d_Byte_Str_Var_DeclEClass, DBYTE_STR_VAR_DECL__INITIALIZATION);

    d_Byte_Str_SpecEClass = createEClass(DBYTE_STR_SPEC);
    createEAttribute(d_Byte_Str_SpecEClass, DBYTE_STR_SPEC__BOUND);
    createEAttribute(d_Byte_Str_SpecEClass, DBYTE_STR_SPEC__INITIAL_VALUE);

    loc_Partly_Var_DeclEClass = createEClass(LOC_PARTLY_VAR_DECL);
    createEAttribute(loc_Partly_Var_DeclEClass, LOC_PARTLY_VAR_DECL__MODIFIER);
    createEReference(loc_Partly_Var_DeclEClass, LOC_PARTLY_VAR_DECL__VARIABLES);

    loc_Partly_VarEClass = createEClass(LOC_PARTLY_VAR);
    createEAttribute(loc_Partly_VarEClass, LOC_PARTLY_VAR__NAME);
    createEAttribute(loc_Partly_VarEClass, LOC_PARTLY_VAR__LOCATION_PREFIX);
    createEReference(loc_Partly_VarEClass, LOC_PARTLY_VAR__INITIALIZATION);

    var_SpecEClass = createEClass(VAR_SPEC);
    createEAttribute(var_SpecEClass, VAR_SPEC__TYPE);

    stringVar_SpecEClass = createEClass(STRING_VAR_SPEC);
    createEAttribute(stringVar_SpecEClass, STRING_VAR_SPEC__BOUND);

    func_DeclEClass = createEClass(FUNC_DECL);
    createEAttribute(func_DeclEClass, FUNC_DECL__NAME);
    createEAttribute(func_DeclEClass, FUNC_DECL__RETURN_TYPE);
    createEReference(func_DeclEClass, FUNC_DECL__USINGS);
    createEReference(func_DeclEClass, FUNC_DECL__IOS);
    createEReference(func_DeclEClass, FUNC_DECL__VARIABLES);
    createEReference(func_DeclEClass, FUNC_DECL__TEMPS);
    createEReference(func_DeclEClass, FUNC_DECL__BODY);

    iO_Var_DeclsEClass = createEClass(IO_VAR_DECLS);

    func_Var_DeclsEClass = createEClass(FUNC_VAR_DECLS);
    createEAttribute(func_Var_DeclsEClass, FUNC_VAR_DECLS__CONSTANT);

    func_BodyEClass = createEClass(FUNC_BODY);

    fB_DeclEClass = createEClass(FB_DECL);
    createEAttribute(fB_DeclEClass, FB_DECL__MODIFIER);
    createEAttribute(fB_DeclEClass, FB_DECL__NAME);
    createEReference(fB_DeclEClass, FB_DECL__USINGS);
    createEAttribute(fB_DeclEClass, FB_DECL__EXTENDS);
    createEReference(fB_DeclEClass, FB_DECL__IMPLEMENTS);
    createEReference(fB_DeclEClass, FB_DECL__IOS);
    createEReference(fB_DeclEClass, FB_DECL__VARIABLES);
    createEReference(fB_DeclEClass, FB_DECL__TEMPS);
    createEReference(fB_DeclEClass, FB_DECL__OTHERS);
    createEReference(fB_DeclEClass, FB_DECL__METHODS);
    createEReference(fB_DeclEClass, FB_DECL__BODY);

    fB_IO_Var_DeclsEClass = createEClass(FB_IO_VAR_DECLS);

    fB_Input_DeclsEClass = createEClass(FB_INPUT_DECLS);
    createEAttribute(fB_Input_DeclsEClass, FB_INPUT_DECLS__MODIFIER);
    createEReference(fB_Input_DeclsEClass, FB_INPUT_DECLS__VARIABLES);

    fB_Input_DeclEClass = createEClass(FB_INPUT_DECL);

    fB_Output_DeclsEClass = createEClass(FB_OUTPUT_DECLS);
    createEAttribute(fB_Output_DeclsEClass, FB_OUTPUT_DECLS__MODIFIER);
    createEReference(fB_Output_DeclsEClass, FB_OUTPUT_DECLS__VARIABLES);

    fB_Output_DeclEClass = createEClass(FB_OUTPUT_DECL);

    other_Var_DeclsEClass = createEClass(OTHER_VAR_DECLS);

    no_Retain_Var_DeclsEClass = createEClass(NO_RETAIN_VAR_DECLS);
    createEAttribute(no_Retain_Var_DeclsEClass, NO_RETAIN_VAR_DECLS__ACCESS);
    createEReference(no_Retain_Var_DeclsEClass, NO_RETAIN_VAR_DECLS__VARIABLES);

    fB_BodyEClass = createEClass(FB_BODY);

    method_DeclEClass = createEClass(METHOD_DECL);
    createEAttribute(method_DeclEClass, METHOD_DECL__ACCESS);
    createEAttribute(method_DeclEClass, METHOD_DECL__TYPE);
    createEAttribute(method_DeclEClass, METHOD_DECL__OVERRIDE);
    createEAttribute(method_DeclEClass, METHOD_DECL__NAME);
    createEAttribute(method_DeclEClass, METHOD_DECL__RETURN_TYPE);
    createEReference(method_DeclEClass, METHOD_DECL__IOS);
    createEReference(method_DeclEClass, METHOD_DECL__VARIABLES);
    createEReference(method_DeclEClass, METHOD_DECL__TEMPS);
    createEReference(method_DeclEClass, METHOD_DECL__BODY);

    class_DeclEClass = createEClass(CLASS_DECL);
    createEAttribute(class_DeclEClass, CLASS_DECL__MODIFIER);
    createEAttribute(class_DeclEClass, CLASS_DECL__NAME);
    createEReference(class_DeclEClass, CLASS_DECL__USINGS);
    createEAttribute(class_DeclEClass, CLASS_DECL__EXTENDS);
    createEReference(class_DeclEClass, CLASS_DECL__IMPLEMENTS);
    createEReference(class_DeclEClass, CLASS_DECL__VARIABLES);
    createEReference(class_DeclEClass, CLASS_DECL__OTHERS);
    createEReference(class_DeclEClass, CLASS_DECL__METHODS);

    interface_DeclEClass = createEClass(INTERFACE_DECL);
    createEAttribute(interface_DeclEClass, INTERFACE_DECL__NAME);
    createEReference(interface_DeclEClass, INTERFACE_DECL__USINGS);
    createEReference(interface_DeclEClass, INTERFACE_DECL__EXTENDS);
    createEReference(interface_DeclEClass, INTERFACE_DECL__METHODS);

    method_PrototypeEClass = createEClass(METHOD_PROTOTYPE);
    createEAttribute(method_PrototypeEClass, METHOD_PROTOTYPE__NAME);
    createEAttribute(method_PrototypeEClass, METHOD_PROTOTYPE__RETURN_TYPE);
    createEReference(method_PrototypeEClass, METHOD_PROTOTYPE__IOS);

    interface_Spec_InitEClass = createEClass(INTERFACE_SPEC_INIT);
    createEReference(interface_Spec_InitEClass, INTERFACE_SPEC_INIT__VARIABLES);
    createEReference(interface_Spec_InitEClass, INTERFACE_SPEC_INIT__INITIALIZATION);

    interface_ValueEClass = createEClass(INTERFACE_VALUE);
    createEReference(interface_ValueEClass, INTERFACE_VALUE__VARIABLE);
    createEAttribute(interface_ValueEClass, INTERFACE_VALUE__VARIABLE_NAME);

    interface_Name_ListEClass = createEClass(INTERFACE_NAME_LIST);
    createEAttribute(interface_Name_ListEClass, INTERFACE_NAME_LIST__INTERFACES);

    prog_DeclEClass = createEClass(PROG_DECL);
    createEAttribute(prog_DeclEClass, PROG_DECL__NAME);
    createEReference(prog_DeclEClass, PROG_DECL__IOS);
    createEReference(prog_DeclEClass, PROG_DECL__VARIABLES);
    createEReference(prog_DeclEClass, PROG_DECL__TEMPS);
    createEReference(prog_DeclEClass, PROG_DECL__OTHERS);
    createEReference(prog_DeclEClass, PROG_DECL__LOCALS);
    createEReference(prog_DeclEClass, PROG_DECL__ACESSES);
    createEReference(prog_DeclEClass, PROG_DECL__BODY);

    prog_Access_DeclsEClass = createEClass(PROG_ACCESS_DECLS);
    createEReference(prog_Access_DeclsEClass, PROG_ACCESS_DECLS__ACCESSES);

    prog_Access_DeclEClass = createEClass(PROG_ACCESS_DECL);
    createEAttribute(prog_Access_DeclEClass, PROG_ACCESS_DECL__NAME);
    createEReference(prog_Access_DeclEClass, PROG_ACCESS_DECL__VARIABLE);
    createEReference(prog_Access_DeclEClass, PROG_ACCESS_DECL__ACCESS);
    createEAttribute(prog_Access_DeclEClass, PROG_ACCESS_DECL__DATA_TYPE);
    createEAttribute(prog_Access_DeclEClass, PROG_ACCESS_DECL__DIRECTION);

    namespace_H_NameEClass = createEClass(NAMESPACE_HNAME);
    createEAttribute(namespace_H_NameEClass, NAMESPACE_HNAME__QUALIFIER);

    using_DirectiveEClass = createEClass(USING_DIRECTIVE);
    createEReference(using_DirectiveEClass, USING_DIRECTIVE__NAMESPACES);

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
    createEAttribute(multibit_Part_AccessEClass, MULTIBIT_PART_ACCESS__ACCESS_SIZE);
    createEReference(multibit_Part_AccessEClass, MULTIBIT_PART_ACCESS__ACCESS_SIZE_INFO);

    size_InfoEClass = createEClass(SIZE_INFO);
    createEAttribute(size_InfoEClass, SIZE_INFO__SIZE_PREFIX);
    createEAttribute(size_InfoEClass, SIZE_INFO__SIZE);

    func_CallEClass = createEClass(FUNC_CALL);
    createEAttribute(func_CallEClass, FUNC_CALL__ACCESS);
    createEReference(func_CallEClass, FUNC_CALL__PARAMETERS);

    stmt_ListEClass = createEClass(STMT_LIST);
    createEReference(stmt_ListEClass, STMT_LIST__STATEMENT);

    stmtEClass = createEClass(STMT);

    assign_StmtEClass = createEClass(ASSIGN_STMT);

    variable_Assign_StmtEClass = createEClass(VARIABLE_ASSIGN_STMT);
    createEReference(variable_Assign_StmtEClass, VARIABLE_ASSIGN_STMT__LEFT);
    createEReference(variable_Assign_StmtEClass, VARIABLE_ASSIGN_STMT__RIGHT);

    assignment_AttemptEClass = createEClass(ASSIGNMENT_ATTEMPT);
    createEAttribute(assignment_AttemptEClass, ASSIGNMENT_ATTEMPT__LEFT_NAME);
    createEReference(assignment_AttemptEClass, ASSIGNMENT_ATTEMPT__LEFT_REFERENCE);
    createEAttribute(assignment_AttemptEClass, ASSIGNMENT_ATTEMPT__RIGHT_NAME);
    createEReference(assignment_AttemptEClass, ASSIGNMENT_ATTEMPT__RIGHT_REFERENCE);

    invocationEClass = createEClass(INVOCATION);
    createEAttribute(invocationEClass, INVOCATION__METHOD);
    createEReference(invocationEClass, INVOCATION__PARAMETERS);

    param_AssignEClass = createEClass(PARAM_ASSIGN);

    named_ValueEClass = createEClass(NAMED_VALUE);
    createEAttribute(named_ValueEClass, NAMED_VALUE__NAME);
    createEReference(named_ValueEClass, NAMED_VALUE__VALUE);

    linked_ValueEClass = createEClass(LINKED_VALUE);
    createEAttribute(linked_ValueEClass, LINKED_VALUE__NEGATED);
    createEAttribute(linked_ValueEClass, LINKED_VALUE__NAME);
    createEReference(linked_ValueEClass, LINKED_VALUE__VALUE);

    selection_StmtEClass = createEClass(SELECTION_STMT);

    iF_StmtEClass = createEClass(IF_STMT);
    createEReference(iF_StmtEClass, IF_STMT__CONDITION);
    createEReference(iF_StmtEClass, IF_STMT__STATEMENTS);
    createEReference(iF_StmtEClass, IF_STMT__ELSEIFS);
    createEReference(iF_StmtEClass, IF_STMT__ELSE);

    elseiF_StmtEClass = createEClass(ELSEIF_STMT);
    createEReference(elseiF_StmtEClass, ELSEIF_STMT__CONDITION);
    createEReference(elseiF_StmtEClass, ELSEIF_STMT__STATEMENTS);

    elsE_StmtEClass = createEClass(ELSE_STMT);
    createEReference(elsE_StmtEClass, ELSE_STMT__STATEMENTS);

    case_StmtEClass = createEClass(CASE_STMT);
    createEReference(case_StmtEClass, CASE_STMT__EXPRESSION);
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
    createEAttribute(for_StmtEClass, FOR_STMT__VARIABLE);
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
    struct_DeclEClass.getESuperTypes().add(this.getStruct_Spec());
    simple_Type_DeclEClass.getESuperTypes().add(this.getType_Decl());
    subrange_Type_DeclEClass.getESuperTypes().add(this.getType_Decl());
    enum_Type_DeclEClass.getESuperTypes().add(this.getType_Decl());
    array_Type_DeclEClass.getESuperTypes().add(this.getType_Decl());
    struct_Type_DeclEClass.getESuperTypes().add(this.getType_Decl());
    str_Type_DeclEClass.getESuperTypes().add(this.getType_Decl());
    simple_SpecEClass.getESuperTypes().add(this.getVar_Spec());
    array_SpecEClass.getESuperTypes().add(this.getVar_Spec());
    simple_Spec_InitEClass.getESuperTypes().add(this.getLoc_Var_Spec_Init());
    subrangeEClass.getESuperTypes().add(this.getCase_List_Elem());
    enum_ValueEClass.getESuperTypes().add(this.getArray_Elem_Init_Value());
    enum_ValueEClass.getESuperTypes().add(this.getExpression());
    array_Spec_InitEClass.getESuperTypes().add(this.getLoc_Var_Spec_Init());
    array_InitEClass.getESuperTypes().add(this.getArray_Elem_Init_Value());
    struct_Spec_InitEClass.getESuperTypes().add(this.getStruct_Spec());
    struct_Spec_InitEClass.getESuperTypes().add(this.getLoc_Var_Spec_Init());
    struct_InitEClass.getESuperTypes().add(this.getArray_Elem_Init_Value());
    direct_VariableEClass.getESuperTypes().add(this.getVariable());
    direct_VariableEClass.getESuperTypes().add(this.getLocated_At());
    ref_Type_DeclEClass.getESuperTypes().add(this.getType_Decl());
    ref_AssignEClass.getESuperTypes().add(this.getAssign_Stmt());
    ref_AssignEClass.getESuperTypes().add(this.getParam_Assign());
    symbolic_VariableEClass.getESuperTypes().add(this.getVariable());
    var_AccessEClass.getESuperTypes().add(this.getStruct_Elem_Select());
    struct_Elem_SelectEClass.getESuperTypes().add(this.getStruct_Variable());
    input_DeclsEClass.getESuperTypes().add(this.getIO_Var_Decls());
    edge_DeclEClass.getESuperTypes().add(this.getInput_Decl());
    edge_DeclEClass.getESuperTypes().add(this.getFB_Input_Decl());
    var_Decl_InitEClass.getESuperTypes().add(this.getInput_Decl());
    var_Decl_InitEClass.getESuperTypes().add(this.getOutput_Decl());
    var_Decl_InitEClass.getESuperTypes().add(this.getFB_Input_Decl());
    var_Decl_InitEClass.getESuperTypes().add(this.getFB_Output_Decl());
    array_Conform_DeclEClass.getESuperTypes().add(this.getInput_Decl());
    array_Conform_DeclEClass.getESuperTypes().add(this.getOutput_Decl());
    array_Conform_DeclEClass.getESuperTypes().add(this.getIn_Out_Var_Decl());
    array_Conform_DeclEClass.getESuperTypes().add(this.getFB_Input_Decl());
    array_Conform_DeclEClass.getESuperTypes().add(this.getFB_Output_Decl());
    fB_Decl_No_InitEClass.getESuperTypes().add(this.getIn_Out_Var_Decl());
    output_DeclsEClass.getESuperTypes().add(this.getIO_Var_Decls());
    in_Out_DeclsEClass.getESuperTypes().add(this.getIO_Var_Decls());
    in_Out_DeclsEClass.getESuperTypes().add(this.getFB_IO_Var_Decls());
    var_DeclEClass.getESuperTypes().add(this.getIn_Out_Var_Decl());
    var_DeclsEClass.getESuperTypes().add(this.getFunc_Var_Decls());
    retain_Var_DeclsEClass.getESuperTypes().add(this.getOther_Var_Decls());
    external_Var_DeclsEClass.getESuperTypes().add(this.getFunc_Var_Decls());
    s_Byte_Str_Var_DeclEClass.getESuperTypes().add(this.getStr_Var_Decl());
    s_Byte_Str_SpecEClass.getESuperTypes().add(this.getLoc_Var_Spec_Init());
    d_Byte_Str_Var_DeclEClass.getESuperTypes().add(this.getStr_Var_Decl());
    d_Byte_Str_SpecEClass.getESuperTypes().add(this.getLoc_Var_Spec_Init());
    loc_Partly_Var_DeclEClass.getESuperTypes().add(this.getOther_Var_Decls());
    stringVar_SpecEClass.getESuperTypes().add(this.getVar_Spec());
    fB_Input_DeclsEClass.getESuperTypes().add(this.getFB_IO_Var_Decls());
    fB_Output_DeclsEClass.getESuperTypes().add(this.getFB_IO_Var_Decls());
    no_Retain_Var_DeclsEClass.getESuperTypes().add(this.getOther_Var_Decls());
    prog_DeclEClass.getESuperTypes().add(this.getST_Program());
    expressionEClass.getESuperTypes().add(this.getSubscript());
    expressionEClass.getESuperTypes().add(this.getConstant_Expr());
    constant_ExprEClass.getESuperTypes().add(this.getArray_Elem_Init_Value());
    variable_AccessEClass.getESuperTypes().add(this.getExpression());
    stmt_ListEClass.getESuperTypes().add(this.getFunc_Body());
    stmt_ListEClass.getESuperTypes().add(this.getFB_Body());
    variable_Assign_StmtEClass.getESuperTypes().add(this.getAssign_Stmt());
    assignment_AttemptEClass.getESuperTypes().add(this.getAssign_Stmt());
    named_ValueEClass.getESuperTypes().add(this.getParam_Assign());
    linked_ValueEClass.getESuperTypes().add(this.getParam_Assign());
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
    initEClass(sT_ProgramEClass, ST_Program.class, "ST_Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(data_Type_DeclEClass, Data_Type_Decl.class, "Data_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getData_Type_Decl_TypeDeclarations(), this.getType_Decl(), null, "typeDeclarations", null, 0, -1, Data_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_DeclEClass, Struct_Decl.class, "Struct_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStruct_Decl_Overlap(), ecorePackage.getEBoolean(), "overlap", null, 0, 1, Struct_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Decl_Elements(), this.getStruct_Elem_Decl(), null, "elements", null, 0, -1, Struct_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_DeclEClass, Type_Decl.class, "Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_Type_DeclEClass, Simple_Type_Decl.class, "Simple_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimple_Type_Decl_Initialization(), this.getSimple_Spec_Init(), null, "initialization", null, 0, 1, Simple_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subrange_Type_DeclEClass, Subrange_Type_Decl.class, "Subrange_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubrange_Type_Decl_Initialization(), this.getSubrange_Spec_Init(), null, "initialization", null, 0, 1, Subrange_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_Type_DeclEClass, Enum_Type_Decl.class, "Enum_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnum_Type_Decl_Initialization(), ecorePackage.getEObject(), null, "initialization", null, 0, 1, Enum_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_Type_DeclEClass, Array_Type_Decl.class, "Array_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Type_Decl_Initialization(), this.getArray_Spec_Init(), null, "initialization", null, 0, 1, Array_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_Type_DeclEClass, Struct_Type_Decl.class, "Struct_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStruct_Type_Decl_Initialization(), this.getStruct_Spec(), null, "initialization", null, 0, 1, Struct_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_Elem_DeclEClass, Struct_Elem_Decl.class, "Struct_Elem_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStruct_Elem_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, Struct_Elem_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Elem_Decl_Location(), this.getLocated_At(), null, "location", null, 0, 1, Struct_Elem_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Elem_Decl_Access(), this.getMultibit_Part_Access(), null, "access", null, 0, 1, Struct_Elem_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Elem_Decl_Initialization(), ecorePackage.getEObject(), null, "initialization", null, 0, 1, Struct_Elem_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(str_Type_DeclEClass, Str_Type_Decl.class, "Str_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStr_Type_Decl_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, Str_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStr_Type_Decl_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, Str_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_SpecEClass, Simple_Spec.class, "Simple_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subrange_SpecEClass, Subrange_Spec.class, "Subrange_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubrange_Spec_Type(), ecorePackage.getEString(), "type", null, 0, 1, Subrange_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubrange_Spec_Range(), this.getSubrange(), null, "range", null, 0, 1, Subrange_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubrange_Spec_RefRange(), ecorePackage.getEString(), "refRange", null, 0, 1, Subrange_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_Value_SpecEClass, Enum_Value_Spec.class, "Enum_Value_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Value_Spec_Type(), ecorePackage.getEString(), "type", null, 0, 1, Enum_Value_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnum_Value_Spec_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, Enum_Value_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnum_Value_Spec_Initialization(), this.getConstant_Expr(), null, "initialization", null, 0, 1, Enum_Value_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elem_Named_SpecEClass, Elem_Named_Spec.class, "Elem_Named_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElem_Named_Spec_Type(), ecorePackage.getEString(), "type", null, 0, 1, Elem_Named_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElem_Named_Spec_Initialization(), this.getNamed_Spec_Init(), null, "initialization", null, 0, 1, Elem_Named_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_SpecEClass, Array_Spec.class, "Array_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Spec_Ranges(), this.getSubrange(), null, "ranges", null, 0, -1, Array_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArray_Spec_RefDataType(), ecorePackage.getEString(), "refDataType", null, 0, 1, Array_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_SpecEClass, Struct_Spec.class, "Struct_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simple_Spec_InitEClass, Simple_Spec_Init.class, "Simple_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimple_Spec_Init_Type(), this.getSimple_Spec(), null, "type", null, 0, 1, Simple_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimple_Spec_Init_InitialValue(), this.getConstant_Expr(), null, "initialValue", null, 0, 1, Simple_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subrange_Spec_InitEClass, Subrange_Spec_Init.class, "Subrange_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubrange_Spec_Init_Type(), this.getSubrange_Spec(), null, "type", null, 0, 1, Subrange_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubrange_Spec_Init_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, Subrange_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subrangeEClass, Subrange.class, "Subrange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubrange_LowBound(), this.getConstant_Expr(), null, "lowBound", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubrange_UpBound(), this.getConstant_Expr(), null, "upBound", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(named_Spec_InitEClass, Named_Spec_Init.class, "Named_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamed_Spec_Init_InitialValues(), this.getEnum_Value_Spec(), null, "initialValues", null, 0, -1, Named_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamed_Spec_Init_Value(), this.getEnum_Value(), null, "value", null, 0, 1, Named_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_Spec_InitEClass, Enum_Spec_Init.class, "Enum_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Spec_Init_EnumItem(), ecorePackage.getEString(), "enumItem", null, 0, -1, Enum_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnum_Spec_Init_RefEnum(), ecorePackage.getEString(), "refEnum", null, 0, 1, Enum_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnum_Spec_Init_Value(), this.getEnum_Value(), null, "value", null, 0, 1, Enum_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enum_ValueEClass, Enum_Value.class, "Enum_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Value_Type(), ecorePackage.getEString(), "type", null, 0, 1, Enum_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnum_Value_Value(), ecorePackage.getEString(), "value", null, 0, 1, Enum_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_Spec_InitEClass, Array_Spec_Init.class, "Array_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Spec_Init_Type(), this.getArray_Spec(), null, "type", null, 0, 1, Array_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArray_Spec_Init_InitialValue(), this.getArray_Init(), null, "initialValue", null, 0, 1, Array_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_InitEClass, Array_Init.class, "Array_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Init_InitialValues(), this.getArray_Elem_Init(), null, "initialValues", null, 0, -1, Array_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_Elem_InitEClass, Array_Elem_Init.class, "Array_Elem_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Elem_Init_Initialization(), this.getArray_Elem_Init_Value(), null, "initialization", null, 0, 1, Array_Elem_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArray_Elem_Init_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, Array_Elem_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArray_Elem_Init_Bound(), this.getArray_Elem_Init_Value(), null, "bound", null, 0, 1, Array_Elem_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_Elem_Init_ValueEClass, Array_Elem_Init_Value.class, "Array_Elem_Init_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(struct_Spec_InitEClass, Struct_Spec_Init.class, "Struct_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStruct_Spec_Init_Type(), ecorePackage.getEString(), "type", null, 0, 1, Struct_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Spec_Init_InitialValue(), this.getStruct_Init(), null, "initialValue", null, 0, 1, Struct_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_InitEClass, Struct_Init.class, "Struct_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStruct_Init_ElementInits(), this.getStruct_Elem_Init(), null, "elementInits", null, 0, -1, Struct_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_Elem_InitEClass, Struct_Elem_Init.class, "Struct_Elem_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStruct_Elem_Init_Type(), ecorePackage.getEString(), "type", null, 0, 1, Struct_Elem_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Elem_Init_Initialization(), ecorePackage.getEObject(), null, "initialization", null, 0, 1, Struct_Elem_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(direct_VariableEClass, Direct_Variable.class, "Direct_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirect_Variable_LocationPrefix(), ecorePackage.getEString(), "locationPrefix", null, 0, 1, Direct_Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDirect_Variable_SizePrefix(), ecorePackage.getEString(), "sizePrefix", null, 0, 1, Direct_Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDirect_Variable_BitIndexes(), ecorePackage.getEString(), "bitIndexes", null, 0, -1, Direct_Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_Type_DeclEClass, Ref_Type_Decl.class, "Ref_Type_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Type_Decl_Initialization(), this.getRef_Spec_Init(), null, "initialization", null, 0, 1, Ref_Type_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_Spec_InitEClass, Ref_Spec_Init.class, "Ref_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Spec_Init_Type(), this.getRef_Spec(), null, "type", null, 0, 1, Ref_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRef_Spec_Init_InitialValue(), this.getRef_Value(), null, "initialValue", null, 0, 1, Ref_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_SpecEClass, Ref_Spec.class, "Ref_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRef_Spec_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Ref_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_ValueEClass, Ref_Value.class, "Ref_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Value_Reference(), this.getRef_Addr(), null, "reference", null, 0, 1, Ref_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_AddrEClass, Ref_Addr.class, "Ref_Addr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Addr_ReferencedVar(), this.getSymbolic_Variable(), null, "referencedVar", null, 0, 1, Ref_Addr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRef_Addr_ReferencedName(), ecorePackage.getEString(), "referencedName", null, 0, 1, Ref_Addr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_AssignEClass, Ref_Assign.class, "Ref_Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRef_Assign_Type(), ecorePackage.getEString(), "type", null, 0, 1, Ref_Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRef_Assign_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, Ref_Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRef_Assign_Initialization(), ecorePackage.getEObject(), null, "initialization", null, 0, 1, Ref_Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_DerefEClass, Ref_Deref.class, "Ref_Deref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRef_Deref_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ref_Deref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(symbolic_VariableEClass, Symbolic_Variable.class, "Symbolic_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbolic_Variable_Qualifiers(), ecorePackage.getEString(), "qualifiers", null, 0, -1, Symbolic_Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSymbolic_Variable_Variable(), ecorePackage.getEObject(), null, "variable", null, 0, 1, Symbolic_Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_AccessEClass, Var_Access.class, "Var_Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Access_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Var_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVar_Access_Reference(), this.getRef_Deref(), null, "reference", null, 0, 1, Var_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multi_Elem_VarEClass, Multi_Elem_Var.class, "Multi_Elem_Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulti_Elem_Var_Access(), this.getVar_Access(), null, "access", null, 0, 1, Multi_Elem_Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulti_Elem_Var_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, Multi_Elem_Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subscript_ListEClass, Subscript_List.class, "Subscript_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubscript_List_Item(), this.getSubscript(), null, "item", null, 0, -1, Subscript_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subscriptEClass, Subscript.class, "Subscript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(struct_VariableEClass, Struct_Variable.class, "Struct_Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(struct_Elem_SelectEClass, Struct_Elem_Select.class, "Struct_Elem_Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(input_DeclsEClass, Input_Decls.class, "Input_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_Decls_RetainType(), ecorePackage.getEString(), "retainType", null, 0, 1, Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Decls_Inputs(), this.getInput_Decl(), null, "inputs", null, 0, -1, Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(input_DeclEClass, Input_Decl.class, "Input_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(edge_DeclEClass, Edge_Decl.class, "Edge_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdge_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Edge_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdge_Decl_EdgeType(), ecorePackage.getEString(), "edgeType", null, 0, 1, Edge_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_Decl_InitEClass, Var_Decl_Init.class, "Var_Decl_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVar_Decl_Init_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVar_Decl_Init_Initialization(), ecorePackage.getEObject(), null, "initialization", null, 0, 1, Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ref_Var_DeclEClass, Ref_Var_Decl.class, "Ref_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRef_Var_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Ref_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRef_Var_Decl_Initialization(), this.getRef_Spec(), null, "initialization", null, 0, 1, Ref_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_Var_DeclEClass, Interface_Var_Decl.class, "Interface_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_Var_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Interface_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_Var_Decl_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, Interface_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_ListEClass, Variable_List.class, "Variable_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_List_Variables(), ecorePackage.getEString(), "variables", null, 0, -1, Variable_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_Var_Decl_InitEClass, Array_Var_Decl_Init.class, "Array_Var_Decl_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Var_Decl_Init_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Array_Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArray_Var_Decl_Init_Initialization(), this.getArray_Spec_Init(), null, "initialization", null, 0, 1, Array_Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_ConformandEClass, Array_Conformand.class, "Array_Conformand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArray_Conformand_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Array_Conformand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_Conform_DeclEClass, Array_Conform_Decl.class, "Array_Conform_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Conform_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Array_Conform_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArray_Conform_Decl_Conformand(), this.getArray_Conformand(), null, "conformand", null, 0, 1, Array_Conform_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_Var_Decl_InitEClass, Struct_Var_Decl_Init.class, "Struct_Var_Decl_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStruct_Var_Decl_Init_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Struct_Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Var_Decl_Init_Initialization(), this.getStruct_Spec_Init(), null, "initialization", null, 0, 1, Struct_Var_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_Decl_No_InitEClass, FB_Decl_No_Init.class, "FB_Decl_No_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFB_Decl_No_Init_Names(), ecorePackage.getEString(), "names", null, 0, -1, FB_Decl_No_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFB_Decl_No_Init_Type(), ecorePackage.getEString(), "type", null, 0, 1, FB_Decl_No_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_Decl_InitEClass, FB_Decl_Init.class, "FB_Decl_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFB_Decl_Init_Fb(), this.getFB_Decl_No_Init(), null, "fb", null, 0, 1, FB_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Init_Initialization(), this.getStruct_Init(), null, "initialization", null, 0, 1, FB_Decl_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(output_DeclsEClass, Output_Decls.class, "Output_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_Decls_RetainType(), ecorePackage.getEString(), "retainType", null, 0, 1, Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_Decls_Outputs(), this.getOutput_Decl(), null, "outputs", null, 0, -1, Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(output_DeclEClass, Output_Decl.class, "Output_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(in_Out_DeclsEClass, In_Out_Decls.class, "In_Out_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIn_Out_Decls_Inouts(), this.getIn_Out_Var_Decl(), null, "inouts", null, 0, -1, In_Out_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(in_Out_Var_DeclEClass, In_Out_Var_Decl.class, "In_Out_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(var_DeclEClass, Var_Decl.class, "Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVar_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVar_Decl_Initialization(), ecorePackage.getEObject(), null, "initialization", null, 0, 1, Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_Var_DeclEClass, Array_Var_Decl.class, "Array_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_Var_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Array_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArray_Var_Decl_Initialization(), this.getArray_Spec(), null, "initialization", null, 0, 1, Array_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(struct_Var_DeclEClass, Struct_Var_Decl.class, "Struct_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStruct_Var_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Struct_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStruct_Var_Decl_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, Struct_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_DeclsEClass, Var_Decls.class, "Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Decls_Access(), ecorePackage.getEString(), "access", null, 0, 1, Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVar_Decls_Variables(), this.getVar_Decl_Init(), null, "variables", null, 0, -1, Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(retain_Var_DeclsEClass, Retain_Var_Decls.class, "Retain_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRetain_Var_Decls_Access(), ecorePackage.getEString(), "access", null, 0, 1, Retain_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRetain_Var_Decls_Variables(), this.getVar_Decl_Init(), null, "variables", null, 0, -1, Retain_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_Var_DeclsEClass, Loc_Var_Decls.class, "Loc_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoc_Var_Decls_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, Loc_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoc_Var_Decls_Variables(), this.getLoc_Var_Decl(), null, "variables", null, 0, -1, Loc_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_Var_DeclEClass, Loc_Var_Decl.class, "Loc_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoc_Var_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Loc_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoc_Var_Decl_Location(), this.getLocated_At(), null, "location", null, 0, 1, Loc_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoc_Var_Decl_Initialization(), this.getLoc_Var_Spec_Init(), null, "initialization", null, 0, 1, Loc_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(temp_Var_DeclsEClass, Temp_Var_Decls.class, "Temp_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemp_Var_Decls_Variables(), ecorePackage.getEObject(), null, "variables", null, 0, -1, Temp_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(external_Var_DeclsEClass, External_Var_Decls.class, "External_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternal_Var_Decls_Variables(), this.getExternal_Decl(), null, "variables", null, 0, -1, External_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(external_DeclEClass, External_Decl.class, "External_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternal_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, External_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternal_Decl_Initialization(), this.getVar_Spec(), null, "initialization", null, 0, 1, External_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternal_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, External_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(global_Var_DeclsEClass, Global_Var_Decls.class, "Global_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobal_Var_Decls_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, Global_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobal_Var_Decls_Variables(), this.getGlobal_Var_Decl(), null, "variables", null, 0, -1, Global_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(global_Var_DeclEClass, Global_Var_Decl.class, "Global_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlobal_Var_Decl_Name(), this.getGlobal_Var_Spec(), null, "name", null, 0, 1, Global_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobal_Var_Decl_Initialization(), this.getLoc_Var_Spec_Init(), null, "initialization", null, 0, 1, Global_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlobal_Var_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, Global_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(global_Var_SpecEClass, Global_Var_Spec.class, "Global_Var_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobal_Var_Spec_Variables(), ecorePackage.getEString(), "variables", null, 0, -1, Global_Var_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobal_Var_Spec_Location(), this.getLocated_At(), null, "location", null, 0, 1, Global_Var_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_Var_Spec_InitEClass, Loc_Var_Spec_Init.class, "Loc_Var_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(located_AtEClass, Located_At.class, "Located_At", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(str_Var_DeclEClass, Str_Var_Decl.class, "Str_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStr_Var_Decl_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Str_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(s_Byte_Str_Var_DeclEClass, S_Byte_Str_Var_Decl.class, "S_Byte_Str_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getS_Byte_Str_Var_Decl_Initialization(), this.getS_Byte_Str_Spec(), null, "initialization", null, 0, 1, S_Byte_Str_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(s_Byte_Str_SpecEClass, S_Byte_Str_Spec.class, "S_Byte_Str_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getS_Byte_Str_Spec_Bound(), ecorePackage.getEString(), "bound", null, 0, 1, S_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getS_Byte_Str_Spec_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, S_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(d_Byte_Str_Var_DeclEClass, D_Byte_Str_Var_Decl.class, "D_Byte_Str_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getD_Byte_Str_Var_Decl_Initialization(), this.getD_Byte_Str_Spec(), null, "initialization", null, 0, 1, D_Byte_Str_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(d_Byte_Str_SpecEClass, D_Byte_Str_Spec.class, "D_Byte_Str_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getD_Byte_Str_Spec_Bound(), ecorePackage.getEString(), "bound", null, 0, 1, D_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getD_Byte_Str_Spec_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, D_Byte_Str_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_Partly_Var_DeclEClass, Loc_Partly_Var_Decl.class, "Loc_Partly_Var_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoc_Partly_Var_Decl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, Loc_Partly_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoc_Partly_Var_Decl_Variables(), this.getLoc_Partly_Var(), null, "variables", null, 0, -1, Loc_Partly_Var_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_Partly_VarEClass, Loc_Partly_Var.class, "Loc_Partly_Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoc_Partly_Var_Name(), ecorePackage.getEString(), "name", null, 0, 1, Loc_Partly_Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoc_Partly_Var_LocationPrefix(), ecorePackage.getEString(), "locationPrefix", null, 0, 1, Loc_Partly_Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoc_Partly_Var_Initialization(), this.getVar_Spec(), null, "initialization", null, 0, 1, Loc_Partly_Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_SpecEClass, Var_Spec.class, "Var_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Spec_Type(), ecorePackage.getEString(), "type", null, 0, 1, Var_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringVar_SpecEClass, StringVar_Spec.class, "StringVar_Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringVar_Spec_Bound(), ecorePackage.getEString(), "bound", null, 0, 1, StringVar_Spec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(func_DeclEClass, Func_Decl.class, "Func_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunc_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunc_Decl_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Temps(), this.getTemp_Var_Decls(), null, "temps", null, 0, -1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Decl_Body(), this.getFunc_Body(), null, "body", null, 0, 1, Func_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iO_Var_DeclsEClass, IO_Var_Decls.class, "IO_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(func_Var_DeclsEClass, Func_Var_Decls.class, "Func_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunc_Var_Decls_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, Func_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(func_BodyEClass, Func_Body.class, "Func_Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fB_DeclEClass, FB_Decl.class, "FB_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFB_Decl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFB_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFB_Decl_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Implements(), this.getInterface_Name_List(), null, "implements", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Ios(), this.getFB_IO_Var_Decls(), null, "ios", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Temps(), this.getTemp_Var_Decls(), null, "temps", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Others(), this.getOther_Var_Decls(), null, "others", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Methods(), this.getMethod_Decl(), null, "methods", null, 0, -1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Decl_Body(), this.getFB_Body(), null, "body", null, 0, 1, FB_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_IO_Var_DeclsEClass, FB_IO_Var_Decls.class, "FB_IO_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fB_Input_DeclsEClass, FB_Input_Decls.class, "FB_Input_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFB_Input_Decls_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, FB_Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Input_Decls_Variables(), this.getFB_Input_Decl(), null, "variables", null, 0, -1, FB_Input_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_Input_DeclEClass, FB_Input_Decl.class, "FB_Input_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fB_Output_DeclsEClass, FB_Output_Decls.class, "FB_Output_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFB_Output_Decls_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, FB_Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFB_Output_Decls_Variables(), this.getFB_Output_Decl(), null, "variables", null, 0, -1, FB_Output_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_Output_DeclEClass, FB_Output_Decl.class, "FB_Output_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(other_Var_DeclsEClass, Other_Var_Decls.class, "Other_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(no_Retain_Var_DeclsEClass, No_Retain_Var_Decls.class, "No_Retain_Var_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNo_Retain_Var_Decls_Access(), ecorePackage.getEString(), "access", null, 0, 1, No_Retain_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNo_Retain_Var_Decls_Variables(), this.getVar_Decl_Init(), null, "variables", null, 0, -1, No_Retain_Var_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fB_BodyEClass, FB_Body.class, "FB_Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(method_DeclEClass, Method_Decl.class, "Method_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Decl_Access(), ecorePackage.getEString(), "access", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Decl_Type(), ecorePackage.getEString(), "type", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Decl_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Decl_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Temps(), this.getTemp_Var_Decls(), null, "temps", null, 0, -1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Decl_Body(), this.getFunc_Body(), null, "body", null, 0, 1, Method_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_DeclEClass, Class_Decl.class, "Class_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Decl_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Decl_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Implements(), this.getInterface_Name_List(), null, "implements", null, 0, 1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Others(), this.getOther_Var_Decls(), null, "others", null, 0, -1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Decl_Methods(), this.getMethod_Decl(), null, "methods", null, 0, -1, Class_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_DeclEClass, Interface_Decl.class, "Interface_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Decl_Usings(), this.getUsing_Directive(), null, "usings", null, 0, -1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Decl_Extends(), this.getInterface_Name_List(), null, "extends", null, 0, -1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Decl_Methods(), this.getMethod_Prototype(), null, "methods", null, 0, -1, Interface_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(method_PrototypeEClass, Method_Prototype.class, "Method_Prototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Prototype_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method_Prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Prototype_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method_Prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Prototype_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Method_Prototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_Spec_InitEClass, Interface_Spec_Init.class, "Interface_Spec_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_Spec_Init_Variables(), this.getVariable_List(), null, "variables", null, 0, 1, Interface_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Spec_Init_Initialization(), this.getInterface_Value(), null, "initialization", null, 0, 1, Interface_Spec_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_ValueEClass, Interface_Value.class, "Interface_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_Value_Variable(), this.getSymbolic_Variable(), null, "variable", null, 0, 1, Interface_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_Value_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, Interface_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_Name_ListEClass, Interface_Name_List.class, "Interface_Name_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Name_List_Interfaces(), ecorePackage.getEString(), "interfaces", null, 0, -1, Interface_Name_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prog_DeclEClass, Prog_Decl.class, "Prog_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProg_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Ios(), this.getIO_Var_Decls(), null, "ios", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Variables(), this.getFunc_Var_Decls(), null, "variables", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Temps(), this.getTemp_Var_Decls(), null, "temps", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Others(), this.getOther_Var_Decls(), null, "others", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Locals(), this.getLoc_Var_Decls(), null, "locals", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Acesses(), this.getProg_Access_Decls(), null, "acesses", null, 0, -1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Decl_Body(), this.getFB_Body(), null, "body", null, 0, 1, Prog_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prog_Access_DeclsEClass, Prog_Access_Decls.class, "Prog_Access_Decls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProg_Access_Decls_Accesses(), this.getProg_Access_Decl(), null, "accesses", null, 0, -1, Prog_Access_Decls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prog_Access_DeclEClass, Prog_Access_Decl.class, "Prog_Access_Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProg_Access_Decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Prog_Access_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Access_Decl_Variable(), this.getSymbolic_Variable(), null, "variable", null, 0, 1, Prog_Access_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProg_Access_Decl_Access(), this.getMultibit_Part_Access(), null, "access", null, 0, 1, Prog_Access_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProg_Access_Decl_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Prog_Access_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProg_Access_Decl_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, Prog_Access_Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespace_H_NameEClass, Namespace_H_Name.class, "Namespace_H_Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_H_Name_Qualifier(), ecorePackage.getEString(), "qualifier", null, 0, -1, Namespace_H_Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(using_DirectiveEClass, Using_Directive.class, "Using_Directive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUsing_Directive_Namespaces(), this.getNamespace_H_Name(), null, "namespaces", null, 0, -1, Using_Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Left(), this.getExpression(), null, "left", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Right(), this.getExpression(), null, "right", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_ExprEClass, Constant_Expr.class, "Constant_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variable_AccessEClass, Variable_Access.class, "Variable_Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_Access_Variable(), this.getVariable(), null, "variable", null, 0, 1, Variable_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Access_Access(), this.getMultibit_Part_Access(), null, "access", null, 0, 1, Variable_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multibit_Part_AccessEClass, Multibit_Part_Access.class, "Multibit_Part_Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultibit_Part_Access_AccessSize(), ecorePackage.getEString(), "accessSize", null, 0, 1, Multibit_Part_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultibit_Part_Access_AccessSizeInfo(), this.getSize_Info(), null, "accessSizeInfo", null, 0, 1, Multibit_Part_Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(size_InfoEClass, Size_Info.class, "Size_Info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSize_Info_SizePrefix(), ecorePackage.getEString(), "sizePrefix", null, 0, 1, Size_Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSize_Info_Size(), ecorePackage.getEString(), "size", null, 0, 1, Size_Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(func_CallEClass, Func_Call.class, "Func_Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunc_Call_Access(), ecorePackage.getEString(), "access", null, 0, 1, Func_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunc_Call_Parameters(), this.getParam_Assign(), null, "parameters", null, 0, -1, Func_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmt_ListEClass, Stmt_List.class, "Stmt_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStmt_List_Statement(), this.getStmt(), null, "statement", null, 0, -1, Stmt_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmtEClass, Stmt.class, "Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assign_StmtEClass, Assign_Stmt.class, "Assign_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variable_Assign_StmtEClass, Variable_Assign_Stmt.class, "Variable_Assign_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_Assign_Stmt_Left(), this.getVariable(), null, "left", null, 0, 1, Variable_Assign_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Assign_Stmt_Right(), this.getExpression(), null, "right", null, 0, 1, Variable_Assign_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignment_AttemptEClass, Assignment_Attempt.class, "Assignment_Attempt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Attempt_LeftName(), ecorePackage.getEString(), "leftName", null, 0, 1, Assignment_Attempt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Attempt_LeftReference(), this.getRef_Deref(), null, "leftReference", null, 0, 1, Assignment_Attempt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Attempt_RightName(), ecorePackage.getEString(), "rightName", null, 0, 1, Assignment_Attempt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Attempt_RightReference(), ecorePackage.getEObject(), null, "rightReference", null, 0, 1, Assignment_Attempt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invocationEClass, Invocation.class, "Invocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInvocation_Method(), ecorePackage.getEString(), "method", null, 0, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_Parameters(), this.getParam_Assign(), null, "parameters", null, 0, -1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(param_AssignEClass, Param_Assign.class, "Param_Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(named_ValueEClass, Named_Value.class, "Named_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamed_Value_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamed_Value_Value(), this.getExpression(), null, "value", null, 0, 1, Named_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linked_ValueEClass, Linked_Value.class, "Linked_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinked_Value_Negated(), ecorePackage.getEBoolean(), "negated", null, 0, 1, Linked_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinked_Value_Name(), ecorePackage.getEString(), "name", null, 0, 1, Linked_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinked_Value_Value(), this.getVariable(), null, "value", null, 0, 1, Linked_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selection_StmtEClass, Selection_Stmt.class, "Selection_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iF_StmtEClass, IF_Stmt.class, "IF_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIF_Stmt_Condition(), this.getExpression(), null, "condition", null, 0, 1, IF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIF_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, IF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIF_Stmt_Elseifs(), this.getELSEIF_Stmt(), null, "elseifs", null, 0, -1, IF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIF_Stmt_Else(), this.getELSE_Stmt(), null, "else", null, 0, 1, IF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseiF_StmtEClass, ELSEIF_Stmt.class, "ELSEIF_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getELSEIF_Stmt_Condition(), this.getExpression(), null, "condition", null, 0, 1, ELSEIF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getELSEIF_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, ELSEIF_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsE_StmtEClass, ELSE_Stmt.class, "ELSE_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getELSE_Stmt_Statements(), this.getStmt_List(), null, "statements", null, 0, 1, ELSE_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_StmtEClass, Case_Stmt.class, "Case_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCase_Stmt_Expression(), this.getExpression(), null, "expression", null, 0, 1, Case_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
    initEAttribute(getFor_Stmt_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, For_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
