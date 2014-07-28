package at.bachmann.plc.st.serializer;

import at.bachmann.plc.st.services.STLanguageGrammarAccess;
import at.bachmann.plc.st.stLanguage.Add_Expr;
import at.bachmann.plc.st.stLanguage.And_Expr;
import at.bachmann.plc.st.stLanguage.Assignment_Attempt;
import at.bachmann.plc.st.stLanguage.Bit_Str_Literal;
import at.bachmann.plc.st.stLanguage.Bool_Literal;
import at.bachmann.plc.st.stLanguage.Callable;
import at.bachmann.plc.st.stLanguage.Case_List;
import at.bachmann.plc.st.stLanguage.Case_Selection;
import at.bachmann.plc.st.stLanguage.Case_Stmt;
import at.bachmann.plc.st.stLanguage.Char_Literal;
import at.bachmann.plc.st.stLanguage.Class_Decl;
import at.bachmann.plc.st.stLanguage.Compare_Expr;
import at.bachmann.plc.st.stLanguage.Continue_Stmt;
import at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec;
import at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.Data_Type_Decl;
import at.bachmann.plc.st.stLanguage.Date;
import at.bachmann.plc.st.stLanguage.Date_And_Time;
import at.bachmann.plc.st.stLanguage.Daytime;
import at.bachmann.plc.st.stLanguage.Duration;
import at.bachmann.plc.st.stLanguage.ELSEIF_Stmt;
import at.bachmann.plc.st.stLanguage.ELSE_Stmt;
import at.bachmann.plc.st.stLanguage.Enum_Spec_Init;
import at.bachmann.plc.st.stLanguage.Equ_Expr;
import at.bachmann.plc.st.stLanguage.Exit_Stmt;
import at.bachmann.plc.st.stLanguage.Expression;
import at.bachmann.plc.st.stLanguage.External_Decl;
import at.bachmann.plc.st.stLanguage.External_Var_Decls;
import at.bachmann.plc.st.stLanguage.FB_Decl;
import at.bachmann.plc.st.stLanguage.FB_Input_Decls;
import at.bachmann.plc.st.stLanguage.FB_Output_Decls;
import at.bachmann.plc.st.stLanguage.For_List;
import at.bachmann.plc.st.stLanguage.For_Stmt;
import at.bachmann.plc.st.stLanguage.Func_Decl;
import at.bachmann.plc.st.stLanguage.Global_Var_Decl;
import at.bachmann.plc.st.stLanguage.Global_Var_Decls;
import at.bachmann.plc.st.stLanguage.Global_Var_Spec;
import at.bachmann.plc.st.stLanguage.IF_Stmt;
import at.bachmann.plc.st.stLanguage.In_Out_Decls;
import at.bachmann.plc.st.stLanguage.Input_Decls;
import at.bachmann.plc.st.stLanguage.Interface_Decl;
import at.bachmann.plc.st.stLanguage.Interface_Name_List;
import at.bachmann.plc.st.stLanguage.Interface_Var_Decl;
import at.bachmann.plc.st.stLanguage.Linked_Value;
import at.bachmann.plc.st.stLanguage.Loc_Var_Decl;
import at.bachmann.plc.st.stLanguage.Method_Decl;
import at.bachmann.plc.st.stLanguage.Method_Prototype;
import at.bachmann.plc.st.stLanguage.Multibit_Part_Access;
import at.bachmann.plc.st.stLanguage.Named_Value;
import at.bachmann.plc.st.stLanguage.Namespace_Decl;
import at.bachmann.plc.st.stLanguage.Output_Decls;
import at.bachmann.plc.st.stLanguage.POU_Decl;
import at.bachmann.plc.st.stLanguage.Power_Expr;
import at.bachmann.plc.st.stLanguage.Prog_Decl;
import at.bachmann.plc.st.stLanguage.Real_Literal;
import at.bachmann.plc.st.stLanguage.Ref_Spec;
import at.bachmann.plc.st.stLanguage.Ref_Value;
import at.bachmann.plc.st.stLanguage.Repeat_Stmt;
import at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec;
import at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl;
import at.bachmann.plc.st.stLanguage.Signed_Int;
import at.bachmann.plc.st.stLanguage.Spec_Init;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Stmt;
import at.bachmann.plc.st.stLanguage.Stmt_List;
import at.bachmann.plc.st.stLanguage.Str_Type_Decl;
import at.bachmann.plc.st.stLanguage.Struct_Decl;
import at.bachmann.plc.st.stLanguage.Subrange;
import at.bachmann.plc.st.stLanguage.Temp_Var_Decls;
import at.bachmann.plc.st.stLanguage.Term;
import at.bachmann.plc.st.stLanguage.Time_Of_Day;
import at.bachmann.plc.st.stLanguage.Type_Decl;
import at.bachmann.plc.st.stLanguage.Unsigned_Int;
import at.bachmann.plc.st.stLanguage.Using_Directive;
import at.bachmann.plc.st.stLanguage.Var_Decl;
import at.bachmann.plc.st.stLanguage.Var_Decl_Init;
import at.bachmann.plc.st.stLanguage.Var_Decls;
import at.bachmann.plc.st.stLanguage.Variable;
import at.bachmann.plc.st.stLanguage.Variable_Access;
import at.bachmann.plc.st.stLanguage.Variable_Address;
import at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt;
import at.bachmann.plc.st.stLanguage.Variable_Decl;
import at.bachmann.plc.st.stLanguage.Variable_List;
import at.bachmann.plc.st.stLanguage.While_Stmt;
import at.bachmann.plc.st.stLanguage.Xor_Expr;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class STLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private STLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StLanguagePackage.ADD_EXPR:
				if(context == grammarAccess.getAdd_ExprRule() ||
				   context == grammarAccess.getAdd_ExprAccess().getAdd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getAnd_ExprRule() ||
				   context == grammarAccess.getAnd_ExprAccess().getAnd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getCompare_ExprRule() ||
				   context == grammarAccess.getCompare_ExprAccess().getCompare_ExprLeftAction_1_0() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getEqu_ExprRule() ||
				   context == grammarAccess.getEqu_ExprAccess().getEqu_ExprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_Add_Expr(context, (Add_Expr) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.AND_EXPR:
				if(context == grammarAccess.getAnd_ExprRule() ||
				   context == grammarAccess.getAnd_ExprAccess().getAnd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_And_Expr(context, (And_Expr) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.ASSIGNMENT_ATTEMPT:
				if(context == grammarAccess.getAssign_StmtRule() ||
				   context == grammarAccess.getAssignment_AttemptRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_Assignment_Attempt(context, (Assignment_Attempt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.BIT_STR_LITERAL:
				if(context == grammarAccess.getBit_Str_LiteralRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getPrimary_ExprRule()) {
					sequence_Bit_Str_Literal(context, (Bit_Str_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.BOOL_LITERAL:
				if(context == grammarAccess.getBool_LiteralRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getPrimary_ExprRule()) {
					sequence_Bool_Literal(context, (Bool_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CALLABLE:
				if(context == grammarAccess.getCallableRule() ||
				   context == grammarAccess.getFunc_CallRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getSubprog_Ctrl_StmtRule()) {
					sequence_Func_Call(context, (Callable) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CASE_LIST:
				if(context == grammarAccess.getCase_ListRule()) {
					sequence_Case_List(context, (Case_List) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CASE_SELECTION:
				if(context == grammarAccess.getCase_SelectionRule()) {
					sequence_Case_Selection(context, (Case_Selection) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CASE_STMT:
				if(context == grammarAccess.getCase_StmtRule() ||
				   context == grammarAccess.getSelection_StmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_Case_Stmt(context, (Case_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CHAR_LITERAL:
				if(context == grammarAccess.getChar_LiteralRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getPrimary_ExprRule()) {
					sequence_Char_Literal(context, (Char_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CLASS_DECL:
				if(context == grammarAccess.getClass_DeclRule()) {
					sequence_Class_Decl(context, (Class_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.COMPARE_EXPR:
				if(context == grammarAccess.getAnd_ExprRule() ||
				   context == grammarAccess.getAnd_ExprAccess().getAnd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getCompare_ExprRule() ||
				   context == grammarAccess.getCompare_ExprAccess().getCompare_ExprLeftAction_1_0() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_Compare_Expr(context, (Compare_Expr) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CONTINUE_STMT:
				if(context == grammarAccess.getContinue_StmtRule() ||
				   context == grammarAccess.getIteration_StmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_Continue_Stmt(context, (Continue_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DBYTE_STR_SPEC:
				if(context == grammarAccess.getD_Byte_Str_SpecRule()) {
					sequence_D_Byte_Str_Spec(context, (D_Byte_Str_Spec) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DBYTE_STR_VAR_DECL:
				if(context == grammarAccess.getD_Byte_Str_Var_DeclRule() ||
				   context == grammarAccess.getStr_Var_DeclRule()) {
					sequence_D_Byte_Str_Var_Decl(context, (D_Byte_Str_Var_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DATA_TYPE_DECL:
				if(context == grammarAccess.getData_Type_DeclRule() ||
				   context == grammarAccess.getNamespace_ElementsRule()) {
					sequence_Data_Type_Decl(context, (Data_Type_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DATE:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDateRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getTime_LiteralRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DATE_AND_TIME:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDate_And_TimeRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getTime_LiteralRule()) {
					sequence_Date_And_Time(context, (Date_And_Time) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DAYTIME:
				if(context == grammarAccess.getDaytimeRule()) {
					sequence_Daytime(context, (Daytime) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DURATION:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDurationRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getTime_LiteralRule()) {
					sequence_Duration(context, (Duration) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.ELSEIF_STMT:
				if(context == grammarAccess.getELSEIF_StmtRule()) {
					sequence_ELSEIF_Stmt(context, (ELSEIF_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.ELSE_STMT:
				if(context == grammarAccess.getELSE_StmtRule()) {
					sequence_ELSE_Stmt(context, (ELSE_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.ENUM_SPEC_INIT:
				if(context == grammarAccess.getEnum_Spec_InitRule()) {
					sequence_Enum_Spec_Init(context, (Enum_Spec_Init) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.EQU_EXPR:
				if(context == grammarAccess.getAnd_ExprRule() ||
				   context == grammarAccess.getAnd_ExprAccess().getAnd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getCompare_ExprRule() ||
				   context == grammarAccess.getCompare_ExprAccess().getCompare_ExprLeftAction_1_0() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getEqu_ExprRule() ||
				   context == grammarAccess.getEqu_ExprAccess().getEqu_ExprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_Equ_Expr(context, (Equ_Expr) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.EXIT_STMT:
				if(context == grammarAccess.getExit_StmtRule() ||
				   context == grammarAccess.getIteration_StmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_Exit_Stmt(context, (Exit_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.EXPRESSION:
				if(context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()) {
					sequence_Expression_Unary_Expr(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdd_ExprRule() ||
				   context == grammarAccess.getAdd_ExprAccess().getAdd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getAnd_ExprRule() ||
				   context == grammarAccess.getAnd_ExprAccess().getAnd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getCompare_ExprRule() ||
				   context == grammarAccess.getCompare_ExprAccess().getCompare_ExprLeftAction_1_0() ||
				   context == grammarAccess.getEqu_ExprRule() ||
				   context == grammarAccess.getEqu_ExprAccess().getEqu_ExprLeftAction_1_0() ||
				   context == grammarAccess.getPower_ExprRule() ||
				   context == grammarAccess.getPower_ExprAccess().getPower_ExprLeftAction_1_0() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermAccess().getTermLeftAction_1_0() ||
				   context == grammarAccess.getUnary_ExprRule() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_Unary_Expr(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.EXTERNAL_DECL:
				if(context == grammarAccess.getExternal_DeclRule()) {
					sequence_External_Decl(context, (External_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.EXTERNAL_VAR_DECLS:
				if(context == grammarAccess.getExternal_Var_DeclsRule() ||
				   context == grammarAccess.getFunc_Var_DeclsRule()) {
					sequence_External_Var_Decls(context, (External_Var_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.FB_DECL:
				if(context == grammarAccess.getFB_DeclRule() ||
				   context == grammarAccess.getNamespace_ElementsRule()) {
					sequence_FB_Decl(context, (FB_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.FB_INPUT_DECLS:
				if(context == grammarAccess.getFB_IO_Var_DeclsRule() ||
				   context == grammarAccess.getFB_Input_DeclsRule()) {
					sequence_FB_Input_Decls(context, (FB_Input_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.FB_OUTPUT_DECLS:
				if(context == grammarAccess.getFB_IO_Var_DeclsRule() ||
				   context == grammarAccess.getFB_Output_DeclsRule()) {
					sequence_FB_Output_Decls(context, (FB_Output_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.FOR_LIST:
				if(context == grammarAccess.getFor_ListRule()) {
					sequence_For_List(context, (For_List) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.FOR_STMT:
				if(context == grammarAccess.getFor_StmtRule() ||
				   context == grammarAccess.getIteration_StmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_For_Stmt(context, (For_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.FUNC_DECL:
				if(context == grammarAccess.getFunc_DeclRule() ||
				   context == grammarAccess.getNamespace_ElementsRule()) {
					sequence_Func_Decl(context, (Func_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.GLOBAL_VAR_DECL:
				if(context == grammarAccess.getGlobal_Var_DeclRule()) {
					sequence_Global_Var_Decl(context, (Global_Var_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.GLOBAL_VAR_DECLS:
				if(context == grammarAccess.getGlobal_Var_DeclsRule()) {
					sequence_Global_Var_Decls(context, (Global_Var_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.GLOBAL_VAR_SPEC:
				if(context == grammarAccess.getGlobal_Var_SpecRule()) {
					sequence_Global_Var_Spec(context, (Global_Var_Spec) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.IF_STMT:
				if(context == grammarAccess.getIF_StmtRule() ||
				   context == grammarAccess.getSelection_StmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_IF_Stmt(context, (IF_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.IN_OUT_DECLS:
				if(context == grammarAccess.getFB_IO_Var_DeclsRule() ||
				   context == grammarAccess.getIO_Var_DeclsRule() ||
				   context == grammarAccess.getIn_Out_DeclsRule()) {
					sequence_In_Out_Decls(context, (In_Out_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.INPUT_DECLS:
				if(context == grammarAccess.getIO_Var_DeclsRule() ||
				   context == grammarAccess.getInput_DeclsRule()) {
					sequence_Input_Decls(context, (Input_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.INTERFACE_DECL:
				if(context == grammarAccess.getInterface_DeclRule()) {
					sequence_Interface_Decl(context, (Interface_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.INTERFACE_NAME_LIST:
				if(context == grammarAccess.getInterface_Name_ListRule()) {
					sequence_Interface_Name_List(context, (Interface_Name_List) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.INTERFACE_VAR_DECL:
				if(context == grammarAccess.getInterface_Var_DeclRule()) {
					sequence_Interface_Var_Decl(context, (Interface_Var_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.LINKED_VALUE:
				if(context == grammarAccess.getLinked_ValueRule() ||
				   context == grammarAccess.getParam_AssignRule()) {
					sequence_Linked_Value(context, (Linked_Value) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.LOC_VAR_DECL:
				if(context == grammarAccess.getLoc_Var_DeclRule()) {
					sequence_Loc_Var_Decl(context, (Loc_Var_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.METHOD_DECL:
				if(context == grammarAccess.getMethod_DeclRule()) {
					sequence_Method_Decl(context, (Method_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.METHOD_PROTOTYPE:
				if(context == grammarAccess.getMethod_PrototypeRule()) {
					sequence_Method_Prototype(context, (Method_Prototype) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.MULTIBIT_PART_ACCESS:
				if(context == grammarAccess.getMultibit_Part_AccessRule()) {
					sequence_Multibit_Part_Access(context, (Multibit_Part_Access) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.NAMED_VALUE:
				if(context == grammarAccess.getNamed_ValueRule() ||
				   context == grammarAccess.getParam_AssignRule()) {
					sequence_Named_Value(context, (Named_Value) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.NAMESPACE_DECL:
				if(context == grammarAccess.getNamespace_DeclRule()) {
					sequence_Namespace_Decl(context, (Namespace_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.OUTPUT_DECLS:
				if(context == grammarAccess.getIO_Var_DeclsRule() ||
				   context == grammarAccess.getOutput_DeclsRule()) {
					sequence_Output_Decls(context, (Output_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.POU_DECL:
				if(context == grammarAccess.getPOU_DeclRule() ||
				   context == grammarAccess.getSTRule()) {
					sequence_POU_Decl(context, (POU_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.POWER_EXPR:
				if(context == grammarAccess.getAdd_ExprRule() ||
				   context == grammarAccess.getAdd_ExprAccess().getAdd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getAnd_ExprRule() ||
				   context == grammarAccess.getAnd_ExprAccess().getAnd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getCompare_ExprRule() ||
				   context == grammarAccess.getCompare_ExprAccess().getCompare_ExprLeftAction_1_0() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getEqu_ExprRule() ||
				   context == grammarAccess.getEqu_ExprAccess().getEqu_ExprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPower_ExprRule() ||
				   context == grammarAccess.getPower_ExprAccess().getPower_ExprLeftAction_1_0() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermAccess().getTermLeftAction_1_0() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_Power_Expr(context, (Power_Expr) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.PROG_DECL:
				if(context == grammarAccess.getProg_DeclRule() ||
				   context == grammarAccess.getSTRule()) {
					sequence_Prog_Decl(context, (Prog_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.REAL_LITERAL:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getNumeric_LiteralRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getReal_LiteralRule()) {
					sequence_Real_Literal(context, (Real_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.REF_SPEC:
				if(context == grammarAccess.getRef_SpecRule()) {
					sequence_Ref_Spec(context, (Ref_Spec) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.REF_VALUE:
				if(context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getRef_ValueRule()) {
					sequence_Ref_Value(context, (Ref_Value) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.REPEAT_STMT:
				if(context == grammarAccess.getIteration_StmtRule() ||
				   context == grammarAccess.getRepeat_StmtRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_Repeat_Stmt(context, (Repeat_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.SBYTE_STR_SPEC:
				if(context == grammarAccess.getS_Byte_Str_SpecRule()) {
					sequence_S_Byte_Str_Spec(context, (S_Byte_Str_Spec) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.SBYTE_STR_VAR_DECL:
				if(context == grammarAccess.getS_Byte_Str_Var_DeclRule() ||
				   context == grammarAccess.getStr_Var_DeclRule()) {
					sequence_S_Byte_Str_Var_Decl(context, (S_Byte_Str_Var_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.SIGNED_INT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getInt_LiteralRule() ||
				   context == grammarAccess.getNumeric_LiteralRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getSigned_IntRule()) {
					sequence_Signed_Int(context, (Signed_Int) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.SPEC_INIT:
				if(context == grammarAccess.getRef_Spec_InitRule()) {
					sequence_Ref_Spec_Init(context, (Spec_Init) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLoc_Var_Spec_InitRule() ||
				   context == grammarAccess.getSimple_Spec_InitRule()) {
					sequence_Simple_Spec_Init(context, (Spec_Init) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSpec_InitRule()) {
					sequence_Spec_Init(context, (Spec_Init) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubrange_Spec_InitRule()) {
					sequence_Subrange_Spec_Init(context, (Spec_Init) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.STMT:
				if(context == grammarAccess.getReturn_StmtRule()) {
					sequence_Return_Stmt(context, (Stmt) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubprog_Ctrl_StmtRule()) {
					sequence_Return_Stmt_Subprog_Ctrl_Stmt_Super_Stmt(context, (Stmt) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSuper_StmtRule()) {
					sequence_Super_Stmt(context, (Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.STMT_LIST:
				if(context == grammarAccess.getFB_BodyRule() ||
				   context == grammarAccess.getFunc_BodyRule() ||
				   context == grammarAccess.getStmt_ListRule()) {
					sequence_Stmt_List(context, (Stmt_List) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.STR_TYPE_DECL:
				if(context == grammarAccess.getStr_Type_DeclRule()) {
					sequence_Str_Type_Decl(context, (Str_Type_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.STRUCT_DECL:
				if(context == grammarAccess.getStruct_DeclRule()) {
					sequence_Struct_Decl(context, (Struct_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.SUBRANGE:
				if(context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getSubrangeRule()) {
					sequence_Subrange(context, (Subrange) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.TEMP_VAR_DECLS:
				if(context == grammarAccess.getTemp_Var_DeclsRule()) {
					sequence_Temp_Var_Decls(context, (Temp_Var_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.TERM:
				if(context == grammarAccess.getAdd_ExprRule() ||
				   context == grammarAccess.getAdd_ExprAccess().getAdd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getAnd_ExprRule() ||
				   context == grammarAccess.getAnd_ExprAccess().getAnd_ExprLeftAction_1_0() ||
				   context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getCompare_ExprRule() ||
				   context == grammarAccess.getCompare_ExprAccess().getCompare_ExprLeftAction_1_0() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getEqu_ExprRule() ||
				   context == grammarAccess.getEqu_ExprAccess().getEqu_ExprLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermAccess().getTermLeftAction_1_0() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.TIME_OF_DAY:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getTime_LiteralRule() ||
				   context == grammarAccess.getTime_Of_DayRule()) {
					sequence_Time_Of_Day(context, (Time_Of_Day) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.TYPE_DECL:
				if(context == grammarAccess.getRef_Type_DeclRule()) {
					sequence_Ref_Type_Decl(context, (Type_Decl) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStruct_Elem_DeclRule()) {
					sequence_Struct_Elem_Decl(context, (Type_Decl) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getType_DeclRule() ||
				   context == grammarAccess.getVariable_DeclRule()) {
					sequence_Type_Decl(context, (Type_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.UNSIGNED_INT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getInt_LiteralRule() ||
				   context == grammarAccess.getNumeric_LiteralRule() ||
				   context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getUnsigned_IntRule()) {
					sequence_Unsigned_Int(context, (Unsigned_Int) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.USING_DIRECTIVE:
				if(context == grammarAccess.getUsing_DirectiveRule()) {
					sequence_Using_Directive(context, (Using_Directive) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VAR_DECL:
				if(context == grammarAccess.getIn_Out_Var_DeclRule() ||
				   context == grammarAccess.getVar_DeclRule()) {
					sequence_Var_Decl(context, (Var_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VAR_DECL_INIT:
				if(context == grammarAccess.getFB_Input_DeclRule() ||
				   context == grammarAccess.getFB_Output_DeclRule() ||
				   context == grammarAccess.getInput_DeclRule() ||
				   context == grammarAccess.getOutput_DeclRule() ||
				   context == grammarAccess.getVar_Decl_InitRule()) {
					sequence_Var_Decl_Init(context, (Var_Decl_Init) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VAR_DECLS:
				if(context == grammarAccess.getFunc_Var_DeclsRule() ||
				   context == grammarAccess.getVar_DeclsRule()) {
					sequence_Var_Decls(context, (Var_Decls) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Direct_Variable_Named_Variable_Ref_Deref_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDirect_VariableRule() ||
				   context == grammarAccess.getLocated_AtRule()) {
					sequence_Direct_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEnum_ValueRule() ||
				   context == grammarAccess.getPrimary_ExprRule()) {
					sequence_Enum_Value(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSymbolic_VariableRule() ||
				   context == grammarAccess.getVar_AccessRule()) {
					sequence_Named_Variable_Ref_Deref_Var_Access(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNamed_VariableRule()) {
					sequence_Named_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNull_RefRule()) {
					sequence_Null_Ref(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRef_AddrRule()) {
					sequence_Ref_Addr(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAssign_StmtRule() ||
				   context == grammarAccess.getParam_AssignRule() ||
				   context == grammarAccess.getRef_AssignRule() ||
				   context == grammarAccess.getStmtRule()) {
					sequence_Ref_Assign(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRef_DerefRule()) {
					sequence_Ref_Deref(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VARIABLE_ACCESS:
				if(context == grammarAccess.getPrimary_ExprRule() ||
				   context == grammarAccess.getVariable_AccessRule()) {
					sequence_Variable_Access(context, (Variable_Access) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VARIABLE_ADDRESS:
				if(context == grammarAccess.getVariable_AddressRule()) {
					sequence_Variable_Address(context, (Variable_Address) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VARIABLE_ASSIGN_STMT:
				if(context == grammarAccess.getAssign_StmtRule() ||
				   context == grammarAccess.getStmtRule() ||
				   context == grammarAccess.getVariable_Assign_StmtRule()) {
					sequence_Variable_Assign_Stmt(context, (Variable_Assign_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VARIABLE_DECL:
				if(context == grammarAccess.getEnum_Qualified_IdRule()) {
					sequence_Enum_Qualified_Id(context, (Variable_Decl) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.VARIABLE_LIST:
				if(context == grammarAccess.getVariable_ListRule()) {
					sequence_Variable_List(context, (Variable_List) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.WHILE_STMT:
				if(context == grammarAccess.getIteration_StmtRule() ||
				   context == grammarAccess.getStmtRule() ||
				   context == grammarAccess.getWhile_StmtRule()) {
					sequence_While_Stmt(context, (While_Stmt) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.XOR_EXPR:
				if(context == grammarAccess.getCase_List_ElemRule() ||
				   context == grammarAccess.getConstant_ExprRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0() ||
				   context == grammarAccess.getXor_ExprRule() ||
				   context == grammarAccess.getXor_ExprAccess().getXor_ExprLeftAction_1_0()) {
					sequence_Xor_Expr(context, (Xor_Expr) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Add_Expr_Add_Expr_1_0 (operator='+' | operator='-') right=Term)
	 */
	protected void sequence_Add_Expr(EObject context, Add_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=And_Expr_And_Expr_1_0 (operator='&' | operator='AND') right=Compare_Expr)
	 */
	protected void sequence_And_Expr(EObject context, And_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable_Decl|ID] value=[Variable_Decl|ID])
	 */
	protected void sequence_Assignment_Attempt(EObject context, Assignment_Attempt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Bit_Str_Value
	 */
	protected void sequence_Bit_Str_Literal(EObject context, Bit_Str_Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Bool_Value
	 */
	protected void sequence_Bool_Literal(EObject context, Bool_Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (caseValues+=Case_List_Elem caseValues+=Case_List_Elem*)
	 */
	protected void sequence_Case_List(EObject context, Case_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values=Case_List statements=Stmt_List)
	 */
	protected void sequence_Case_Selection(EObject context, Case_Selection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CASE_SELECTION__VALUES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CASE_SELECTION__VALUES));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CASE_SELECTION__STATEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CASE_SELECTION__STATEMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCase_SelectionAccess().getValuesCase_ListParserRuleCall_0_0(), semanticObject.getValues());
		feeder.accept(grammarAccess.getCase_SelectionAccess().getStatementsStmt_ListParserRuleCall_2_0(), semanticObject.getStatements());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression cases+=Case_Selection+ defaultStatements=Stmt_List?)
	 */
	protected void sequence_Case_Stmt(EObject context, Case_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Char_Value
	 */
	protected void sequence_Char_Literal(EObject context, Char_Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (modifier='FINAL' | modifier='ABSTRACT')? 
	 *         name=IDENTIFIER 
	 *         usings+=Using_Directive* 
	 *         extends=[Class_Decl|ID]? 
	 *         implements=Interface_Name_List? 
	 *         variables+=Func_Var_Decls* 
	 *         methods+=Method_Decl*
	 *     )
	 */
	protected void sequence_Class_Decl(EObject context, Class_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_Expr_Compare_Expr_1_0 (operator='=' | operator='<>') right=Equ_Expr)
	 */
	protected void sequence_Compare_Expr(EObject context, Compare_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Continue_Stmt}
	 */
	protected void sequence_Continue_Stmt(EObject context, Continue_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bound=Unsigned_Int? initialValue=D_Byte_Char_Str?)
	 */
	protected void sequence_D_Byte_Str_Spec(EObject context, D_Byte_Str_Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables=Variable_List initialization=D_Byte_Str_Spec)
	 */
	protected void sequence_D_Byte_Str_Var_Decl(EObject context, D_Byte_Str_Var_Decl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.STR_VAR_DECL__VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.STR_VAR_DECL__VARIABLES));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.DBYTE_STR_VAR_DECL__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.DBYTE_STR_VAR_DECL__INITIALIZATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getD_Byte_Str_Var_DeclAccess().getVariablesVariable_ListParserRuleCall_0_0(), semanticObject.getVariables());
		feeder.accept(grammarAccess.getD_Byte_Str_Var_DeclAccess().getInitializationD_Byte_Str_SpecParserRuleCall_2_0(), semanticObject.getInitialization());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     types+=Type_Decl+
	 */
	protected void sequence_Data_Type_Decl(EObject context, Data_Type_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Date_And_Time_Value
	 */
	protected void sequence_Date_And_Time(EObject context, Date_And_Time semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DATE_VALUE
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DAYTIME_VALUE
	 */
	protected void sequence_Daytime(EObject context, Daytime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.DAYTIME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.DAYTIME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDaytimeAccess().getValueDAYTIME_VALUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable_Address|ID] | variable=[Variable_Decl|IDENTIFIER] | variable=[Variable_Decl|IDENTIFIER])
	 */
	protected void sequence_Direct_Variable_Named_Variable_Ref_Deref_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable_Address|ID]
	 */
	protected void sequence_Direct_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Duration_Value
	 */
	protected void sequence_Duration(EObject context, Duration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statements=Stmt_List)
	 */
	protected void sequence_ELSEIF_Stmt(EObject context, ELSEIF_Stmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.ELSEIF_STMT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.ELSEIF_STMT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.ELSEIF_STMT__STATEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.ELSEIF_STMT__STATEMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getELSEIF_StmtAccess().getConditionExpressionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getELSEIF_StmtAccess().getStatementsStmt_ListParserRuleCall_3_0(), semanticObject.getStatements());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statements=Stmt_List
	 */
	protected void sequence_ELSE_Stmt(EObject context, ELSE_Stmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.ELSE_STMT__STATEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.ELSE_STMT__STATEMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getELSE_StmtAccess().getStatementsStmt_ListParserRuleCall_1_0(), semanticObject.getStatements());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Enum_Qualified_Id_Name
	 */
	protected void sequence_Enum_Qualified_Id(EObject context, Variable_Decl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.VARIABLE_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.VARIABLE_DECL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnum_Qualified_IdAccess().getNameEnum_Qualified_Id_NameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((type=Enum_Items | type=Qualified_Name) value=Enum_Value?)
	 */
	protected void sequence_Enum_Spec_Init(EObject context, Enum_Spec_Init semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable_Decl|IDENTIFIER]
	 */
	protected void sequence_Enum_Value(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equ_Expr_Equ_Expr_1_0 (operator='<' | operator='>' | operator='<=' | operator='>=') right=Add_Expr)
	 */
	protected void sequence_Equ_Expr(EObject context, Equ_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Exit_Stmt}
	 */
	protected void sequence_Exit_Stmt(EObject context, Exit_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Expression_Expression_1_0 operator='OR' right=Xor_Expr) | ((operator='-' | operator='+' | operator='NOT')? expression=Primary_Expr))
	 */
	protected void sequence_Expression_Unary_Expr(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=IDENTIFIER initialization=Elem_Type_Name)
	 */
	protected void sequence_External_Decl(EObject context, External_Decl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.EXTERNAL_DECL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.EXTERNAL_DECL__TYPE));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.EXTERNAL_DECL__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.EXTERNAL_DECL__INITIALIZATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternal_DeclAccess().getTypeIDENTIFIERTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getExternal_DeclAccess().getInitializationElem_Type_NameParserRuleCall_2_0(), semanticObject.getInitialization());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (constant?='CONSTANT'? declarations+=External_Decl*)
	 */
	protected void sequence_External_Var_Decls(EObject context, External_Var_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (modifier='FINAL' | modifier='ABSTRACT')? 
	 *         name=IDENTIFIER 
	 *         usings+=Using_Directive* 
	 *         extends=[FB_Decl|ID]? 
	 *         implements=Interface_Name_List? 
	 *         (ios+=FB_IO_Var_Decls | variables+=Func_Var_Decls | temps+=Temp_Var_Decls)* 
	 *         methods+=Method_Decl* 
	 *         body=FB_Body?
	 *     )
	 */
	protected void sequence_FB_Decl(EObject context, FB_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((retain?='RETAIN' | nonRetain?='NON_RETAIN')? variables+=FB_Input_Decl*)
	 */
	protected void sequence_FB_Input_Decls(EObject context, FB_Input_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((retain?='RETAIN' | nonRetain?='NON_RETAIN')? variables+=FB_Output_Decl*)
	 */
	protected void sequence_FB_Output_Decls(EObject context, FB_Output_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowBound=Expression upBound=Expression step=Expression?)
	 */
	protected void sequence_For_List(EObject context, For_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable_Decl|ID] bounds=For_List statements=Stmt_List)
	 */
	protected void sequence_For_Stmt(EObject context, For_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (callable=[Func_Decl|ID] (parameters+=Param_Assign parameters+=Param_Assign*)?)
	 */
	protected void sequence_Func_Call(EObject context, Callable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=IDENTIFIER 
	 *         returnType=Data_Type_Access? 
	 *         usings+=Using_Directive* 
	 *         (ios+=IO_Var_Decls | variables+=Func_Var_Decls | temps+=Temp_Var_Decls)* 
	 *         body=Func_Body
	 *     )
	 */
	protected void sequence_Func_Decl(EObject context, Func_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Global_Var_Spec initialization=Loc_Var_Spec_Init)
	 */
	protected void sequence_Global_Var_Decl(EObject context, Global_Var_Decl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.GLOBAL_VAR_DECL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.GLOBAL_VAR_DECL__TYPE));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.GLOBAL_VAR_DECL__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.GLOBAL_VAR_DECL__INITIALIZATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGlobal_Var_DeclAccess().getTypeGlobal_Var_SpecParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGlobal_Var_DeclAccess().getInitializationLoc_Var_Spec_InitParserRuleCall_2_0(), semanticObject.getInitialization());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((constant?='CONSTANT' | retain?='RETAIN')? declarations+=Global_Var_Decl*)
	 */
	protected void sequence_Global_Var_Decls(EObject context, Global_Var_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((names+=IDENTIFIER names+=IDENTIFIER*) | (names+=IDENTIFIER location=Located_At))
	 */
	protected void sequence_Global_Var_Spec(EObject context, Global_Var_Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statements=Stmt_List elseifs+=ELSEIF_Stmt* else=ELSE_Stmt?)
	 */
	protected void sequence_IF_Stmt(EObject context, IF_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=In_Out_Var_Decl*)
	 */
	protected void sequence_In_Out_Decls(EObject context, In_Out_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((retain?='RETAIN' | nonRetain?='NON_RETAIN')? declarations+=Input_Decl*)
	 */
	protected void sequence_Input_Decls(EObject context, Input_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER usings+=Using_Directive* extends=Interface_Name_List? methods+=Method_Prototype*)
	 */
	protected void sequence_Interface_Decl(EObject context, Interface_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interfaces+=[Interface_Decl|ID] interfaces+=[Interface_Decl|ID]*)
	 */
	protected void sequence_Interface_Name_List(EObject context, Interface_Name_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables=Variable_List initialization=[Interface_Decl|ID])
	 */
	protected void sequence_Interface_Var_Decl(EObject context, Interface_Var_Decl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.INTERFACE_VAR_DECL__VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.INTERFACE_VAR_DECL__VARIABLES));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.INTERFACE_VAR_DECL__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.INTERFACE_VAR_DECL__INITIALIZATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterface_Var_DeclAccess().getVariablesVariable_ListParserRuleCall_0_0(), semanticObject.getVariables());
		feeder.accept(grammarAccess.getInterface_Var_DeclAccess().getInitializationInterface_DeclIDTerminalRuleCall_2_0_1(), semanticObject.getInitialization());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (negated?='NOT'? value=[Variable|ID] variable=[Output_Decl|ID])
	 */
	protected void sequence_Linked_Value(EObject context, Linked_Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=IDENTIFIER? location=Located_At initialization=Loc_Var_Spec_Init)
	 */
	protected void sequence_Loc_Var_Decl(EObject context, Loc_Var_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         access=Access_Spec 
	 *         (type='FINAL' | type='ABSTRACT')? 
	 *         override?='OVERRIDE'? 
	 *         name=IDENTIFIER 
	 *         returnType=Data_Type_Access? 
	 *         (ios+=IO_Var_Decls | variables+=Func_Var_Decls | temps+=Temp_Var_Decls)* 
	 *         body=Func_Body
	 *     )
	 */
	protected void sequence_Method_Decl(EObject context, Method_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER returnType=Data_Type_Access? ios+=IO_Var_Decls*)
	 */
	protected void sequence_Method_Prototype(EObject context, Method_Prototype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bitIndex=DEC_VALUE | ((size='X' | size='B' | size='W' | size='D' | size='L')? bitIndex=DEC_VALUE))
	 */
	protected void sequence_Multibit_Part_Access(EObject context, Multibit_Part_Access semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Input_Decl|ID]? value=Expression)
	 */
	protected void sequence_Named_Value(EObject context, Named_Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable_Decl|IDENTIFIER] | variable=[Variable_Decl|IDENTIFIER])
	 */
	protected void sequence_Named_Variable_Ref_Deref_Var_Access(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable_Decl|IDENTIFIER]
	 */
	protected void sequence_Named_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (internal?='INTERNAL'? name=Qualified_Name usings+=Using_Directive* elements+=Namespace_Elements+)
	 */
	protected void sequence_Namespace_Decl(EObject context, Namespace_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Variable}
	 */
	protected void sequence_Null_Ref(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((retain?='RETAIN' | nonRetain?='NON_RETAIN')? declarations+=Output_Decl*)
	 */
	protected void sequence_Output_Decls(EObject context, Output_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (usings+=Using_Directive* (pous+=Func_Decl | pous+=FB_Decl | pous+=Class_Decl | pous+=Interface_Decl | pous+=Namespace_Decl)+)
	 */
	protected void sequence_POU_Decl(EObject context, POU_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Power_Expr_Power_Expr_1_0 operator='**' right=Unary_Expr)
	 */
	protected void sequence_Power_Expr(EObject context, Power_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER (ios+=IO_Var_Decls | variables+=Func_Var_Decls)* body=FB_Body)
	 */
	protected void sequence_Prog_Decl(EObject context, Prog_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Real_Value
	 */
	protected void sequence_Real_Literal(EObject context, Real_Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable_Decl|Qualified_Name]
	 */
	protected void sequence_Ref_Addr(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable_Decl|IDENTIFIER] (initialValue=IDENTIFIER | initialization=Ref_Deref | initialization=Ref_Value))
	 */
	protected void sequence_Ref_Assign(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable_Decl|IDENTIFIER]
	 */
	protected void sequence_Ref_Deref(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='REF_TO' variable=Ref_Spec initialValue=Ref_Value?)
	 */
	protected void sequence_Ref_Spec_Init(EObject context, Spec_Init semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refTos+='REF_TO'+ reference=Data_Type_Access)
	 */
	protected void sequence_Ref_Spec(EObject context, Ref_Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER initialization=Ref_Spec_Init)
	 */
	protected void sequence_Ref_Type_Decl(EObject context, Type_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=Ref_Addr | variable=Null_Ref)
	 */
	protected void sequence_Ref_Value(EObject context, Ref_Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements=Stmt_List condition=Expression)
	 */
	protected void sequence_Repeat_Stmt(EObject context, Repeat_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type='RETURN'
	 */
	protected void sequence_Return_Stmt(EObject context, Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='SUPER' | type='RETURN')
	 */
	protected void sequence_Return_Stmt_Subprog_Ctrl_Stmt_Super_Stmt(EObject context, Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bound=Unsigned_Int? initialValue=S_Byte_Char_Str?)
	 */
	protected void sequence_S_Byte_Str_Spec(EObject context, S_Byte_Str_Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables=Variable_List initialization=S_Byte_Str_Spec)
	 */
	protected void sequence_S_Byte_Str_Var_Decl(EObject context, S_Byte_Str_Var_Decl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.STR_VAR_DECL__VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.STR_VAR_DECL__VARIABLES));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.SBYTE_STR_VAR_DECL__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.SBYTE_STR_VAR_DECL__INITIALIZATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getS_Byte_Str_Var_DeclAccess().getVariablesVariable_ListParserRuleCall_0_0(), semanticObject.getVariables());
		feeder.accept(grammarAccess.getS_Byte_Str_Var_DeclAccess().getInitializationS_Byte_Str_SpecParserRuleCall_2_0(), semanticObject.getInitialization());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Signed_Int_Value
	 */
	protected void sequence_Signed_Int(EObject context, Signed_Int semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Elem_Type_Name initialValue=Constant_Expr?)
	 */
	protected void sequence_Simple_Spec_Init(EObject context, Spec_Init semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Qualified_Name
	 */
	protected void sequence_Spec_Init(EObject context, Spec_Init semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Stmt*)
	 */
	protected void sequence_Stmt_List(EObject context, Stmt_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=String_Type_Name initialization=String_Type_Name initialValue=Char_Str?)
	 */
	protected void sequence_Str_Type_Decl(EObject context, Str_Type_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (overlap?='OVERLAP'? elements+=Struct_Elem_Decl+)
	 */
	protected void sequence_Struct_Decl(EObject context, Struct_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER (location=Located_At access=Multibit_Part_Access?)? initialization=Simple_Spec_Init)
	 */
	protected void sequence_Struct_Elem_Decl(EObject context, Type_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Int_Type_Name range=Subrange initialValue=Signed_Int?)
	 */
	protected void sequence_Subrange_Spec_Init(EObject context, Spec_Init semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowBound=[Constant_Expr|ID] upBound=[Constant_Expr|ID])
	 */
	protected void sequence_Subrange(EObject context, Subrange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.SUBRANGE__LOW_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.SUBRANGE__LOW_BOUND));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.SUBRANGE__UP_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.SUBRANGE__UP_BOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubrangeAccess().getLowBoundConstant_ExprIDTerminalRuleCall_0_0_1(), semanticObject.getLowBound());
		feeder.accept(grammarAccess.getSubrangeAccess().getUpBoundConstant_ExprIDTerminalRuleCall_2_0_1(), semanticObject.getUpBound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type='SUPER'
	 */
	protected void sequence_Super_Stmt(EObject context, Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((declarations+=Var_Decl | declarations+=Interface_Var_Decl)*)
	 */
	protected void sequence_Temp_Var_Decls(EObject context, Temp_Var_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Term_Term_1_0 (operator='*' | operator='/' | operator='MOD') right=Power_Expr)
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Time_Of_Day_Value
	 */
	protected void sequence_Time_Of_Day(EObject context, Time_Of_Day semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER (initialization=Simple_Spec_Init | initialization=Subrange_Spec_Init | initialization=Str_Type_Decl))
	 */
	protected void sequence_Type_Decl(EObject context, Type_Decl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator='-' | operator='+' | operator='NOT')? expression=Primary_Expr)
	 */
	protected void sequence_Unary_Expr(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Unsigned_Int_Value
	 */
	protected void sequence_Unsigned_Int(EObject context, Unsigned_Int semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namespaces+=Qualified_Name namespaces+=Qualified_Name*)
	 */
	protected void sequence_Using_Directive(EObject context, Using_Directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables=Variable_List (initialization=Simple_Spec_Init | initialization=Ref_Spec_Init))
	 */
	protected void sequence_Var_Decl_Init(EObject context, Var_Decl_Init semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables=Variable_List initialization=Elem_Type_Name)
	 */
	protected void sequence_Var_Decl(EObject context, Var_Decl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.VAR_DECL__VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.VAR_DECL__VARIABLES));
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.VAR_DECL__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.VAR_DECL__INITIALIZATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVar_DeclAccess().getVariablesVariable_ListParserRuleCall_0_0(), semanticObject.getVariables());
		feeder.accept(grammarAccess.getVar_DeclAccess().getInitializationElem_Type_NameParserRuleCall_2_0(), semanticObject.getInitialization());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (constant?='CONSTANT' | retain?='RETAIN' | nonRetain?='NON_RETAIN')? 
	 *         access=Access_Spec? 
	 *         (declarations+=Var_Decl_Init | declarations+=Loc_Var_Decl)*
	 *     )
	 */
	protected void sequence_Var_Decls(EObject context, Var_Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable|ID] access=Multibit_Part_Access?)
	 */
	protected void sequence_Variable_Access(EObject context, Variable_Access semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='I' | type='Q' | type='M') (size='X' | size='B' | size='W' | size='D' | size='L')? bitIndexes+=DEC_VALUE bitIndex+=DEC_VALUE*)
	 */
	protected void sequence_Variable_Address(EObject context, Variable_Address semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable_Decl|ID] value=Expression)
	 */
	protected void sequence_Variable_Assign_Stmt(EObject context, Variable_Assign_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (names+=IDENTIFIER names+=IDENTIFIER*)
	 */
	protected void sequence_Variable_List(EObject context, Variable_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statements=Stmt_List)
	 */
	protected void sequence_While_Stmt(EObject context, While_Stmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Xor_Expr_Xor_Expr_1_0 operator='XOR' right=And_Expr)
	 */
	protected void sequence_Xor_Expr(EObject context, Xor_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
