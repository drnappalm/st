/**
 */
package at.bachmann.plc.st.stLanguage.util;

import at.bachmann.plc.st.stLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage
 * @generated
 */
public class StLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StLanguageSwitch<Adapter> modelSwitch =
    new StLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseST_Program(ST_Program object)
      {
        return createST_ProgramAdapter();
      }
      @Override
      public Adapter caseData_Type_Decl(Data_Type_Decl object)
      {
        return createData_Type_DeclAdapter();
      }
      @Override
      public Adapter caseStruct_Decl(Struct_Decl object)
      {
        return createStruct_DeclAdapter();
      }
      @Override
      public Adapter caseType_Decl(Type_Decl object)
      {
        return createType_DeclAdapter();
      }
      @Override
      public Adapter caseSimple_Type_Decl(Simple_Type_Decl object)
      {
        return createSimple_Type_DeclAdapter();
      }
      @Override
      public Adapter caseSubrange_Type_Decl(Subrange_Type_Decl object)
      {
        return createSubrange_Type_DeclAdapter();
      }
      @Override
      public Adapter caseEnum_Type_Decl(Enum_Type_Decl object)
      {
        return createEnum_Type_DeclAdapter();
      }
      @Override
      public Adapter caseArray_Type_Decl(Array_Type_Decl object)
      {
        return createArray_Type_DeclAdapter();
      }
      @Override
      public Adapter caseStruct_Type_Decl(Struct_Type_Decl object)
      {
        return createStruct_Type_DeclAdapter();
      }
      @Override
      public Adapter caseStruct_Elem_Decl(Struct_Elem_Decl object)
      {
        return createStruct_Elem_DeclAdapter();
      }
      @Override
      public Adapter caseStr_Type_Decl(Str_Type_Decl object)
      {
        return createStr_Type_DeclAdapter();
      }
      @Override
      public Adapter caseSimple_Spec(Simple_Spec object)
      {
        return createSimple_SpecAdapter();
      }
      @Override
      public Adapter caseSubrange_Spec(Subrange_Spec object)
      {
        return createSubrange_SpecAdapter();
      }
      @Override
      public Adapter caseEnum_Value_Spec(Enum_Value_Spec object)
      {
        return createEnum_Value_SpecAdapter();
      }
      @Override
      public Adapter caseElem_Named_Spec(Elem_Named_Spec object)
      {
        return createElem_Named_SpecAdapter();
      }
      @Override
      public Adapter caseArray_Spec(Array_Spec object)
      {
        return createArray_SpecAdapter();
      }
      @Override
      public Adapter caseStruct_Spec(Struct_Spec object)
      {
        return createStruct_SpecAdapter();
      }
      @Override
      public Adapter caseSimple_Spec_Init(Simple_Spec_Init object)
      {
        return createSimple_Spec_InitAdapter();
      }
      @Override
      public Adapter caseSubrange_Spec_Init(Subrange_Spec_Init object)
      {
        return createSubrange_Spec_InitAdapter();
      }
      @Override
      public Adapter caseSubrange(Subrange object)
      {
        return createSubrangeAdapter();
      }
      @Override
      public Adapter caseNamed_Spec_Init(Named_Spec_Init object)
      {
        return createNamed_Spec_InitAdapter();
      }
      @Override
      public Adapter caseEnum_Spec_Init(Enum_Spec_Init object)
      {
        return createEnum_Spec_InitAdapter();
      }
      @Override
      public Adapter caseEnum_Value(Enum_Value object)
      {
        return createEnum_ValueAdapter();
      }
      @Override
      public Adapter caseArray_Spec_Init(Array_Spec_Init object)
      {
        return createArray_Spec_InitAdapter();
      }
      @Override
      public Adapter caseArray_Init(Array_Init object)
      {
        return createArray_InitAdapter();
      }
      @Override
      public Adapter caseArray_Elem_Init(Array_Elem_Init object)
      {
        return createArray_Elem_InitAdapter();
      }
      @Override
      public Adapter caseArray_Elem_Init_Value(Array_Elem_Init_Value object)
      {
        return createArray_Elem_Init_ValueAdapter();
      }
      @Override
      public Adapter caseStruct_Spec_Init(Struct_Spec_Init object)
      {
        return createStruct_Spec_InitAdapter();
      }
      @Override
      public Adapter caseStruct_Init(Struct_Init object)
      {
        return createStruct_InitAdapter();
      }
      @Override
      public Adapter caseStruct_Elem_Init(Struct_Elem_Init object)
      {
        return createStruct_Elem_InitAdapter();
      }
      @Override
      public Adapter caseDirect_Variable(Direct_Variable object)
      {
        return createDirect_VariableAdapter();
      }
      @Override
      public Adapter caseRef_Type_Decl(Ref_Type_Decl object)
      {
        return createRef_Type_DeclAdapter();
      }
      @Override
      public Adapter caseRef_Spec_Init(Ref_Spec_Init object)
      {
        return createRef_Spec_InitAdapter();
      }
      @Override
      public Adapter caseRef_Spec(Ref_Spec object)
      {
        return createRef_SpecAdapter();
      }
      @Override
      public Adapter caseRef_Value(Ref_Value object)
      {
        return createRef_ValueAdapter();
      }
      @Override
      public Adapter caseRef_Addr(Ref_Addr object)
      {
        return createRef_AddrAdapter();
      }
      @Override
      public Adapter caseRef_Assign(Ref_Assign object)
      {
        return createRef_AssignAdapter();
      }
      @Override
      public Adapter caseRef_Deref(Ref_Deref object)
      {
        return createRef_DerefAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseSymbolic_Variable(Symbolic_Variable object)
      {
        return createSymbolic_VariableAdapter();
      }
      @Override
      public Adapter caseVar_Access(Var_Access object)
      {
        return createVar_AccessAdapter();
      }
      @Override
      public Adapter caseMulti_Elem_Var(Multi_Elem_Var object)
      {
        return createMulti_Elem_VarAdapter();
      }
      @Override
      public Adapter caseSubscript_List(Subscript_List object)
      {
        return createSubscript_ListAdapter();
      }
      @Override
      public Adapter caseSubscript(Subscript object)
      {
        return createSubscriptAdapter();
      }
      @Override
      public Adapter caseStruct_Variable(Struct_Variable object)
      {
        return createStruct_VariableAdapter();
      }
      @Override
      public Adapter caseStruct_Elem_Select(Struct_Elem_Select object)
      {
        return createStruct_Elem_SelectAdapter();
      }
      @Override
      public Adapter caseInput_Decls(Input_Decls object)
      {
        return createInput_DeclsAdapter();
      }
      @Override
      public Adapter caseInput_Decl(Input_Decl object)
      {
        return createInput_DeclAdapter();
      }
      @Override
      public Adapter caseEdge_Decl(Edge_Decl object)
      {
        return createEdge_DeclAdapter();
      }
      @Override
      public Adapter caseVar_Decl_Init(Var_Decl_Init object)
      {
        return createVar_Decl_InitAdapter();
      }
      @Override
      public Adapter caseRef_Var_Decl(Ref_Var_Decl object)
      {
        return createRef_Var_DeclAdapter();
      }
      @Override
      public Adapter caseInterface_Var_Decl(Interface_Var_Decl object)
      {
        return createInterface_Var_DeclAdapter();
      }
      @Override
      public Adapter caseVariable_List(Variable_List object)
      {
        return createVariable_ListAdapter();
      }
      @Override
      public Adapter caseArray_Var_Decl_Init(Array_Var_Decl_Init object)
      {
        return createArray_Var_Decl_InitAdapter();
      }
      @Override
      public Adapter caseArray_Conformand(Array_Conformand object)
      {
        return createArray_ConformandAdapter();
      }
      @Override
      public Adapter caseArray_Conform_Decl(Array_Conform_Decl object)
      {
        return createArray_Conform_DeclAdapter();
      }
      @Override
      public Adapter caseStruct_Var_Decl_Init(Struct_Var_Decl_Init object)
      {
        return createStruct_Var_Decl_InitAdapter();
      }
      @Override
      public Adapter caseFB_Decl_No_Init(FB_Decl_No_Init object)
      {
        return createFB_Decl_No_InitAdapter();
      }
      @Override
      public Adapter caseFB_Decl_Init(FB_Decl_Init object)
      {
        return createFB_Decl_InitAdapter();
      }
      @Override
      public Adapter caseOutput_Decls(Output_Decls object)
      {
        return createOutput_DeclsAdapter();
      }
      @Override
      public Adapter caseOutput_Decl(Output_Decl object)
      {
        return createOutput_DeclAdapter();
      }
      @Override
      public Adapter caseIn_Out_Decls(In_Out_Decls object)
      {
        return createIn_Out_DeclsAdapter();
      }
      @Override
      public Adapter caseIn_Out_Var_Decl(In_Out_Var_Decl object)
      {
        return createIn_Out_Var_DeclAdapter();
      }
      @Override
      public Adapter caseVar_Decl(Var_Decl object)
      {
        return createVar_DeclAdapter();
      }
      @Override
      public Adapter caseArray_Var_Decl(Array_Var_Decl object)
      {
        return createArray_Var_DeclAdapter();
      }
      @Override
      public Adapter caseStruct_Var_Decl(Struct_Var_Decl object)
      {
        return createStruct_Var_DeclAdapter();
      }
      @Override
      public Adapter caseVar_Decls(Var_Decls object)
      {
        return createVar_DeclsAdapter();
      }
      @Override
      public Adapter caseRetain_Var_Decls(Retain_Var_Decls object)
      {
        return createRetain_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseLoc_Var_Decls(Loc_Var_Decls object)
      {
        return createLoc_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseLoc_Var_Decl(Loc_Var_Decl object)
      {
        return createLoc_Var_DeclAdapter();
      }
      @Override
      public Adapter caseTemp_Var_Decls(Temp_Var_Decls object)
      {
        return createTemp_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseExternal_Var_Decls(External_Var_Decls object)
      {
        return createExternal_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseExternal_Decl(External_Decl object)
      {
        return createExternal_DeclAdapter();
      }
      @Override
      public Adapter caseGlobal_Var_Decls(Global_Var_Decls object)
      {
        return createGlobal_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseGlobal_Var_Decl(Global_Var_Decl object)
      {
        return createGlobal_Var_DeclAdapter();
      }
      @Override
      public Adapter caseGlobal_Var_Spec(Global_Var_Spec object)
      {
        return createGlobal_Var_SpecAdapter();
      }
      @Override
      public Adapter caseLoc_Var_Spec_Init(Loc_Var_Spec_Init object)
      {
        return createLoc_Var_Spec_InitAdapter();
      }
      @Override
      public Adapter caseLocated_At(Located_At object)
      {
        return createLocated_AtAdapter();
      }
      @Override
      public Adapter caseStr_Var_Decl(Str_Var_Decl object)
      {
        return createStr_Var_DeclAdapter();
      }
      @Override
      public Adapter caseS_Byte_Str_Var_Decl(S_Byte_Str_Var_Decl object)
      {
        return createS_Byte_Str_Var_DeclAdapter();
      }
      @Override
      public Adapter caseS_Byte_Str_Spec(S_Byte_Str_Spec object)
      {
        return createS_Byte_Str_SpecAdapter();
      }
      @Override
      public Adapter caseD_Byte_Str_Var_Decl(D_Byte_Str_Var_Decl object)
      {
        return createD_Byte_Str_Var_DeclAdapter();
      }
      @Override
      public Adapter caseD_Byte_Str_Spec(D_Byte_Str_Spec object)
      {
        return createD_Byte_Str_SpecAdapter();
      }
      @Override
      public Adapter caseLoc_Partly_Var_Decl(Loc_Partly_Var_Decl object)
      {
        return createLoc_Partly_Var_DeclAdapter();
      }
      @Override
      public Adapter caseLoc_Partly_Var(Loc_Partly_Var object)
      {
        return createLoc_Partly_VarAdapter();
      }
      @Override
      public Adapter caseVar_Spec(Var_Spec object)
      {
        return createVar_SpecAdapter();
      }
      @Override
      public Adapter caseStringVar_Spec(StringVar_Spec object)
      {
        return createStringVar_SpecAdapter();
      }
      @Override
      public Adapter caseFunc_Decl(Func_Decl object)
      {
        return createFunc_DeclAdapter();
      }
      @Override
      public Adapter caseIO_Var_Decls(IO_Var_Decls object)
      {
        return createIO_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseFunc_Var_Decls(Func_Var_Decls object)
      {
        return createFunc_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseFunc_Body(Func_Body object)
      {
        return createFunc_BodyAdapter();
      }
      @Override
      public Adapter caseFB_Decl(FB_Decl object)
      {
        return createFB_DeclAdapter();
      }
      @Override
      public Adapter caseFB_IO_Var_Decls(FB_IO_Var_Decls object)
      {
        return createFB_IO_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseFB_Input_Decls(FB_Input_Decls object)
      {
        return createFB_Input_DeclsAdapter();
      }
      @Override
      public Adapter caseFB_Input_Decl(FB_Input_Decl object)
      {
        return createFB_Input_DeclAdapter();
      }
      @Override
      public Adapter caseFB_Output_Decls(FB_Output_Decls object)
      {
        return createFB_Output_DeclsAdapter();
      }
      @Override
      public Adapter caseFB_Output_Decl(FB_Output_Decl object)
      {
        return createFB_Output_DeclAdapter();
      }
      @Override
      public Adapter caseOther_Var_Decls(Other_Var_Decls object)
      {
        return createOther_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseNo_Retain_Var_Decls(No_Retain_Var_Decls object)
      {
        return createNo_Retain_Var_DeclsAdapter();
      }
      @Override
      public Adapter caseFB_Body(FB_Body object)
      {
        return createFB_BodyAdapter();
      }
      @Override
      public Adapter caseMethod_Decl(Method_Decl object)
      {
        return createMethod_DeclAdapter();
      }
      @Override
      public Adapter caseClass_Decl(Class_Decl object)
      {
        return createClass_DeclAdapter();
      }
      @Override
      public Adapter caseInterface_Decl(Interface_Decl object)
      {
        return createInterface_DeclAdapter();
      }
      @Override
      public Adapter caseMethod_Prototype(Method_Prototype object)
      {
        return createMethod_PrototypeAdapter();
      }
      @Override
      public Adapter caseInterface_Spec_Init(Interface_Spec_Init object)
      {
        return createInterface_Spec_InitAdapter();
      }
      @Override
      public Adapter caseInterface_Value(Interface_Value object)
      {
        return createInterface_ValueAdapter();
      }
      @Override
      public Adapter caseInterface_Name_List(Interface_Name_List object)
      {
        return createInterface_Name_ListAdapter();
      }
      @Override
      public Adapter caseProg_Decl(Prog_Decl object)
      {
        return createProg_DeclAdapter();
      }
      @Override
      public Adapter caseProg_Access_Decls(Prog_Access_Decls object)
      {
        return createProg_Access_DeclsAdapter();
      }
      @Override
      public Adapter caseProg_Access_Decl(Prog_Access_Decl object)
      {
        return createProg_Access_DeclAdapter();
      }
      @Override
      public Adapter caseNamespace_H_Name(Namespace_H_Name object)
      {
        return createNamespace_H_NameAdapter();
      }
      @Override
      public Adapter caseUsing_Directive(Using_Directive object)
      {
        return createUsing_DirectiveAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseConstant_Expr(Constant_Expr object)
      {
        return createConstant_ExprAdapter();
      }
      @Override
      public Adapter caseVariable_Access(Variable_Access object)
      {
        return createVariable_AccessAdapter();
      }
      @Override
      public Adapter caseMultibit_Part_Access(Multibit_Part_Access object)
      {
        return createMultibit_Part_AccessAdapter();
      }
      @Override
      public Adapter caseSize_Info(Size_Info object)
      {
        return createSize_InfoAdapter();
      }
      @Override
      public Adapter caseFunc_Call(Func_Call object)
      {
        return createFunc_CallAdapter();
      }
      @Override
      public Adapter caseStmt_List(Stmt_List object)
      {
        return createStmt_ListAdapter();
      }
      @Override
      public Adapter caseStmt(Stmt object)
      {
        return createStmtAdapter();
      }
      @Override
      public Adapter caseAssign_Stmt(Assign_Stmt object)
      {
        return createAssign_StmtAdapter();
      }
      @Override
      public Adapter caseVariable_Assign_Stmt(Variable_Assign_Stmt object)
      {
        return createVariable_Assign_StmtAdapter();
      }
      @Override
      public Adapter caseAssignment_Attempt(Assignment_Attempt object)
      {
        return createAssignment_AttemptAdapter();
      }
      @Override
      public Adapter caseInvocation(Invocation object)
      {
        return createInvocationAdapter();
      }
      @Override
      public Adapter caseParam_Assign(Param_Assign object)
      {
        return createParam_AssignAdapter();
      }
      @Override
      public Adapter caseNamed_Value(Named_Value object)
      {
        return createNamed_ValueAdapter();
      }
      @Override
      public Adapter caseLinked_Value(Linked_Value object)
      {
        return createLinked_ValueAdapter();
      }
      @Override
      public Adapter caseSelection_Stmt(Selection_Stmt object)
      {
        return createSelection_StmtAdapter();
      }
      @Override
      public Adapter caseIF_Stmt(IF_Stmt object)
      {
        return createIF_StmtAdapter();
      }
      @Override
      public Adapter caseELSEIF_Stmt(ELSEIF_Stmt object)
      {
        return createELSEIF_StmtAdapter();
      }
      @Override
      public Adapter caseELSE_Stmt(ELSE_Stmt object)
      {
        return createELSE_StmtAdapter();
      }
      @Override
      public Adapter caseCase_Stmt(Case_Stmt object)
      {
        return createCase_StmtAdapter();
      }
      @Override
      public Adapter caseCase_Selection(Case_Selection object)
      {
        return createCase_SelectionAdapter();
      }
      @Override
      public Adapter caseCase_List(Case_List object)
      {
        return createCase_ListAdapter();
      }
      @Override
      public Adapter caseCase_List_Elem(Case_List_Elem object)
      {
        return createCase_List_ElemAdapter();
      }
      @Override
      public Adapter caseIteration_Stmt(Iteration_Stmt object)
      {
        return createIteration_StmtAdapter();
      }
      @Override
      public Adapter caseExit_Stmt(Exit_Stmt object)
      {
        return createExit_StmtAdapter();
      }
      @Override
      public Adapter caseContinue_Stmt(Continue_Stmt object)
      {
        return createContinue_StmtAdapter();
      }
      @Override
      public Adapter caseFor_Stmt(For_Stmt object)
      {
        return createFor_StmtAdapter();
      }
      @Override
      public Adapter caseFor_List(For_List object)
      {
        return createFor_ListAdapter();
      }
      @Override
      public Adapter caseWhile_Stmt(While_Stmt object)
      {
        return createWhile_StmtAdapter();
      }
      @Override
      public Adapter caseRepeat_Stmt(Repeat_Stmt object)
      {
        return createRepeat_StmtAdapter();
      }
      @Override
      public Adapter caseXor_Expr(Xor_Expr object)
      {
        return createXor_ExprAdapter();
      }
      @Override
      public Adapter caseAnd_Expr(And_Expr object)
      {
        return createAnd_ExprAdapter();
      }
      @Override
      public Adapter caseCompare_Expr(Compare_Expr object)
      {
        return createCompare_ExprAdapter();
      }
      @Override
      public Adapter caseEqu_Expr(Equ_Expr object)
      {
        return createEqu_ExprAdapter();
      }
      @Override
      public Adapter caseAdd_Expr(Add_Expr object)
      {
        return createAdd_ExprAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter casePower_Expr(Power_Expr object)
      {
        return createPower_ExprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.ST_Program <em>ST Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.ST_Program
   * @generated
   */
  public Adapter createST_ProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Data_Type_Decl <em>Data Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Data_Type_Decl
   * @generated
   */
  public Adapter createData_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Decl <em>Struct Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Decl
   * @generated
   */
  public Adapter createStruct_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Type_Decl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl
   * @generated
   */
  public Adapter createType_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Simple_Type_Decl <em>Simple Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Simple_Type_Decl
   * @generated
   */
  public Adapter createSimple_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Subrange_Type_Decl <em>Subrange Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Type_Decl
   * @generated
   */
  public Adapter createSubrange_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Enum_Type_Decl <em>Enum Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Enum_Type_Decl
   * @generated
   */
  public Adapter createEnum_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Type_Decl <em>Array Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Type_Decl
   * @generated
   */
  public Adapter createArray_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Type_Decl <em>Struct Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Type_Decl
   * @generated
   */
  public Adapter createStruct_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Decl <em>Struct Elem Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Decl
   * @generated
   */
  public Adapter createStruct_Elem_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl <em>Str Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl
   * @generated
   */
  public Adapter createStr_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Simple_Spec <em>Simple Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Simple_Spec
   * @generated
   */
  public Adapter createSimple_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec <em>Subrange Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec
   * @generated
   */
  public Adapter createSubrange_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Enum_Value_Spec <em>Enum Value Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value_Spec
   * @generated
   */
  public Adapter createEnum_Value_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Elem_Named_Spec <em>Elem Named Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Elem_Named_Spec
   * @generated
   */
  public Adapter createElem_Named_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Spec <em>Array Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec
   * @generated
   */
  public Adapter createArray_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Spec <em>Struct Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Spec
   * @generated
   */
  public Adapter createStruct_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Simple_Spec_Init <em>Simple Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Simple_Spec_Init
   * @generated
   */
  public Adapter createSimple_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Subrange_Spec_Init <em>Subrange Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Subrange_Spec_Init
   * @generated
   */
  public Adapter createSubrange_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Subrange <em>Subrange</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Subrange
   * @generated
   */
  public Adapter createSubrangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Named_Spec_Init <em>Named Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Named_Spec_Init
   * @generated
   */
  public Adapter createNamed_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init <em>Enum Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init
   * @generated
   */
  public Adapter createEnum_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Enum_Value <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value
   * @generated
   */
  public Adapter createEnum_ValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Spec_Init <em>Array Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Spec_Init
   * @generated
   */
  public Adapter createArray_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Init <em>Array Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Init
   * @generated
   */
  public Adapter createArray_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Elem_Init <em>Array Elem Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Elem_Init
   * @generated
   */
  public Adapter createArray_Elem_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Elem_Init_Value <em>Array Elem Init Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Elem_Init_Value
   * @generated
   */
  public Adapter createArray_Elem_Init_ValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Spec_Init <em>Struct Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Spec_Init
   * @generated
   */
  public Adapter createStruct_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Init <em>Struct Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Init
   * @generated
   */
  public Adapter createStruct_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Init <em>Struct Elem Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Init
   * @generated
   */
  public Adapter createStruct_Elem_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Direct_Variable <em>Direct Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Direct_Variable
   * @generated
   */
  public Adapter createDirect_VariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Type_Decl <em>Ref Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Type_Decl
   * @generated
   */
  public Adapter createRef_Type_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Spec_Init <em>Ref Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec_Init
   * @generated
   */
  public Adapter createRef_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Spec <em>Ref Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec
   * @generated
   */
  public Adapter createRef_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Value <em>Ref Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Value
   * @generated
   */
  public Adapter createRef_ValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Addr <em>Ref Addr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Addr
   * @generated
   */
  public Adapter createRef_AddrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Assign <em>Ref Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign
   * @generated
   */
  public Adapter createRef_AssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Deref <em>Ref Deref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Deref
   * @generated
   */
  public Adapter createRef_DerefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Symbolic_Variable <em>Symbolic Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Symbolic_Variable
   * @generated
   */
  public Adapter createSymbolic_VariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Var_Access <em>Var Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Var_Access
   * @generated
   */
  public Adapter createVar_AccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Multi_Elem_Var <em>Multi Elem Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Multi_Elem_Var
   * @generated
   */
  public Adapter createMulti_Elem_VarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Subscript_List <em>Subscript List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Subscript_List
   * @generated
   */
  public Adapter createSubscript_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Subscript <em>Subscript</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Subscript
   * @generated
   */
  public Adapter createSubscriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Variable <em>Struct Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Variable
   * @generated
   */
  public Adapter createStruct_VariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Elem_Select <em>Struct Elem Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Elem_Select
   * @generated
   */
  public Adapter createStruct_Elem_SelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Input_Decls <em>Input Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls
   * @generated
   */
  public Adapter createInput_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Input_Decl <em>Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Input_Decl
   * @generated
   */
  public Adapter createInput_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Edge_Decl <em>Edge Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Edge_Decl
   * @generated
   */
  public Adapter createEdge_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init <em>Var Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl_Init
   * @generated
   */
  public Adapter createVar_Decl_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Ref_Var_Decl <em>Ref Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Ref_Var_Decl
   * @generated
   */
  public Adapter createRef_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl <em>Interface Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Interface_Var_Decl
   * @generated
   */
  public Adapter createInterface_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Variable_List <em>Variable List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Variable_List
   * @generated
   */
  public Adapter createVariable_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init <em>Array Var Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl_Init
   * @generated
   */
  public Adapter createArray_Var_Decl_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Conformand <em>Array Conformand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Conformand
   * @generated
   */
  public Adapter createArray_ConformandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Conform_Decl <em>Array Conform Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Conform_Decl
   * @generated
   */
  public Adapter createArray_Conform_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init <em>Struct Var Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl_Init
   * @generated
   */
  public Adapter createStruct_Var_Decl_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Decl_No_Init <em>FB Decl No Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_No_Init
   * @generated
   */
  public Adapter createFB_Decl_No_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Decl_Init <em>FB Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl_Init
   * @generated
   */
  public Adapter createFB_Decl_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Output_Decls <em>Output Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls
   * @generated
   */
  public Adapter createOutput_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Output_Decl <em>Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Output_Decl
   * @generated
   */
  public Adapter createOutput_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.In_Out_Decls <em>In Out Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Decls
   * @generated
   */
  public Adapter createIn_Out_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.In_Out_Var_Decl <em>In Out Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Var_Decl
   * @generated
   */
  public Adapter createIn_Out_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Var_Decl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl
   * @generated
   */
  public Adapter createVar_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Array_Var_Decl <em>Array Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Array_Var_Decl
   * @generated
   */
  public Adapter createArray_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Struct_Var_Decl <em>Struct Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Struct_Var_Decl
   * @generated
   */
  public Adapter createStruct_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Var_Decls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls
   * @generated
   */
  public Adapter createVar_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Retain_Var_Decls <em>Retain Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Retain_Var_Decls
   * @generated
   */
  public Adapter createRetain_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decls <em>Loc Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decls
   * @generated
   */
  public Adapter createLoc_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl <em>Loc Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl
   * @generated
   */
  public Adapter createLoc_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Temp_Var_Decls <em>Temp Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Temp_Var_Decls
   * @generated
   */
  public Adapter createTemp_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.External_Var_Decls <em>External Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.External_Var_Decls
   * @generated
   */
  public Adapter createExternal_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.External_Decl <em>External Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.External_Decl
   * @generated
   */
  public Adapter createExternal_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls <em>Global Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls
   * @generated
   */
  public Adapter createGlobal_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl <em>Global Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl
   * @generated
   */
  public Adapter createGlobal_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec <em>Global Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Spec
   * @generated
   */
  public Adapter createGlobal_Var_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init <em>Loc Var Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init
   * @generated
   */
  public Adapter createLoc_Var_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Located_At <em>Located At</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Located_At
   * @generated
   */
  public Adapter createLocated_AtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Str_Var_Decl <em>Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Str_Var_Decl
   * @generated
   */
  public Adapter createStr_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl <em>SByte Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl
   * @generated
   */
  public Adapter createS_Byte_Str_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec <em>SByte Str Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec
   * @generated
   */
  public Adapter createS_Byte_Str_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl <em>DByte Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl
   * @generated
   */
  public Adapter createD_Byte_Str_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec <em>DByte Str Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec
   * @generated
   */
  public Adapter createD_Byte_Str_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl <em>Loc Partly Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var_Decl
   * @generated
   */
  public Adapter createLoc_Partly_Var_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Loc_Partly_Var <em>Loc Partly Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Loc_Partly_Var
   * @generated
   */
  public Adapter createLoc_Partly_VarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Var_Spec <em>Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Var_Spec
   * @generated
   */
  public Adapter createVar_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.StringVar_Spec <em>String Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.StringVar_Spec
   * @generated
   */
  public Adapter createStringVar_SpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Func_Decl <em>Func Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl
   * @generated
   */
  public Adapter createFunc_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.IO_Var_Decls <em>IO Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.IO_Var_Decls
   * @generated
   */
  public Adapter createIO_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Func_Var_Decls <em>Func Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Func_Var_Decls
   * @generated
   */
  public Adapter createFunc_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Func_Body <em>Func Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Func_Body
   * @generated
   */
  public Adapter createFunc_BodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Decl <em>FB Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl
   * @generated
   */
  public Adapter createFB_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls <em>FB IO Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls
   * @generated
   */
  public Adapter createFB_IO_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls <em>FB Input Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls
   * @generated
   */
  public Adapter createFB_Input_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decl <em>FB Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decl
   * @generated
   */
  public Adapter createFB_Input_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls <em>FB Output Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls
   * @generated
   */
  public Adapter createFB_Output_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decl <em>FB Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decl
   * @generated
   */
  public Adapter createFB_Output_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Other_Var_Decls <em>Other Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Other_Var_Decls
   * @generated
   */
  public Adapter createOther_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls <em>No Retain Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.No_Retain_Var_Decls
   * @generated
   */
  public Adapter createNo_Retain_Var_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.FB_Body <em>FB Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.FB_Body
   * @generated
   */
  public Adapter createFB_BodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Method_Decl <em>Method Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl
   * @generated
   */
  public Adapter createMethod_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Class_Decl <em>Class Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl
   * @generated
   */
  public Adapter createClass_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Interface_Decl <em>Interface Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl
   * @generated
   */
  public Adapter createInterface_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Method_Prototype <em>Method Prototype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype
   * @generated
   */
  public Adapter createMethod_PrototypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Interface_Spec_Init <em>Interface Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Interface_Spec_Init
   * @generated
   */
  public Adapter createInterface_Spec_InitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Interface_Value <em>Interface Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Interface_Value
   * @generated
   */
  public Adapter createInterface_ValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Interface_Name_List <em>Interface Name List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Interface_Name_List
   * @generated
   */
  public Adapter createInterface_Name_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Prog_Decl <em>Prog Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl
   * @generated
   */
  public Adapter createProg_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decls <em>Prog Access Decls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decls
   * @generated
   */
  public Adapter createProg_Access_DeclsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Prog_Access_Decl <em>Prog Access Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Prog_Access_Decl
   * @generated
   */
  public Adapter createProg_Access_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Namespace_H_Name <em>Namespace HName</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Namespace_H_Name
   * @generated
   */
  public Adapter createNamespace_H_NameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Using_Directive <em>Using Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Using_Directive
   * @generated
   */
  public Adapter createUsing_DirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Constant_Expr <em>Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Constant_Expr
   * @generated
   */
  public Adapter createConstant_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Variable_Access <em>Variable Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Variable_Access
   * @generated
   */
  public Adapter createVariable_AccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access <em>Multibit Part Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Multibit_Part_Access
   * @generated
   */
  public Adapter createMultibit_Part_AccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Size_Info <em>Size Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Size_Info
   * @generated
   */
  public Adapter createSize_InfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Func_Call <em>Func Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Func_Call
   * @generated
   */
  public Adapter createFunc_CallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Stmt_List <em>Stmt List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Stmt_List
   * @generated
   */
  public Adapter createStmt_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Stmt
   * @generated
   */
  public Adapter createStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Assign_Stmt <em>Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Assign_Stmt
   * @generated
   */
  public Adapter createAssign_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt <em>Variable Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt
   * @generated
   */
  public Adapter createVariable_Assign_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt <em>Assignment Attempt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt
   * @generated
   */
  public Adapter createAssignment_AttemptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Invocation <em>Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Invocation
   * @generated
   */
  public Adapter createInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Param_Assign <em>Param Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Param_Assign
   * @generated
   */
  public Adapter createParam_AssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Named_Value <em>Named Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Named_Value
   * @generated
   */
  public Adapter createNamed_ValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Linked_Value <em>Linked Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value
   * @generated
   */
  public Adapter createLinked_ValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Selection_Stmt <em>Selection Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Selection_Stmt
   * @generated
   */
  public Adapter createSelection_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.IF_Stmt <em>IF Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt
   * @generated
   */
  public Adapter createIF_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt <em>ELSEIF Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.ELSEIF_Stmt
   * @generated
   */
  public Adapter createELSEIF_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.ELSE_Stmt <em>ELSE Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.ELSE_Stmt
   * @generated
   */
  public Adapter createELSE_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Case_Stmt <em>Case Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt
   * @generated
   */
  public Adapter createCase_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Case_Selection <em>Case Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Case_Selection
   * @generated
   */
  public Adapter createCase_SelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Case_List <em>Case List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Case_List
   * @generated
   */
  public Adapter createCase_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Case_List_Elem <em>Case List Elem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Case_List_Elem
   * @generated
   */
  public Adapter createCase_List_ElemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Iteration_Stmt <em>Iteration Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Iteration_Stmt
   * @generated
   */
  public Adapter createIteration_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Exit_Stmt <em>Exit Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Exit_Stmt
   * @generated
   */
  public Adapter createExit_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Continue_Stmt <em>Continue Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Continue_Stmt
   * @generated
   */
  public Adapter createContinue_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.For_Stmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt
   * @generated
   */
  public Adapter createFor_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.For_List <em>For List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.For_List
   * @generated
   */
  public Adapter createFor_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.While_Stmt <em>While Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.While_Stmt
   * @generated
   */
  public Adapter createWhile_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Repeat_Stmt <em>Repeat Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Repeat_Stmt
   * @generated
   */
  public Adapter createRepeat_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Xor_Expr <em>Xor Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Xor_Expr
   * @generated
   */
  public Adapter createXor_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.And_Expr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.And_Expr
   * @generated
   */
  public Adapter createAnd_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Compare_Expr <em>Compare Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Compare_Expr
   * @generated
   */
  public Adapter createCompare_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Equ_Expr <em>Equ Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Equ_Expr
   * @generated
   */
  public Adapter createEqu_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Add_Expr <em>Add Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Add_Expr
   * @generated
   */
  public Adapter createAdd_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Power_Expr <em>Power Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Power_Expr
   * @generated
   */
  public Adapter createPower_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //StLanguageAdapterFactory
