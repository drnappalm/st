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
      public Adapter caseST(ST object)
      {
        return createSTAdapter();
      }
      @Override
      public Adapter casePOU_Decl(POU_Decl object)
      {
        return createPOU_DeclAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseNumeric_Literal(Numeric_Literal object)
      {
        return createNumeric_LiteralAdapter();
      }
      @Override
      public Adapter caseInt_Literal(Int_Literal object)
      {
        return createInt_LiteralAdapter();
      }
      @Override
      public Adapter caseUnsigned_Int(Unsigned_Int object)
      {
        return createUnsigned_IntAdapter();
      }
      @Override
      public Adapter caseSigned_Int(Signed_Int object)
      {
        return createSigned_IntAdapter();
      }
      @Override
      public Adapter caseReal_Literal(Real_Literal object)
      {
        return createReal_LiteralAdapter();
      }
      @Override
      public Adapter caseBit_Str_Literal(Bit_Str_Literal object)
      {
        return createBit_Str_LiteralAdapter();
      }
      @Override
      public Adapter caseBool_Literal(Bool_Literal object)
      {
        return createBool_LiteralAdapter();
      }
      @Override
      public Adapter caseChar_Literal(Char_Literal object)
      {
        return createChar_LiteralAdapter();
      }
      @Override
      public Adapter caseTime_Literal(Time_Literal object)
      {
        return createTime_LiteralAdapter();
      }
      @Override
      public Adapter caseDuration(Duration object)
      {
        return createDurationAdapter();
      }
      @Override
      public Adapter caseTime_Of_Day(Time_Of_Day object)
      {
        return createTime_Of_DayAdapter();
      }
      @Override
      public Adapter caseDaytime(Daytime object)
      {
        return createDaytimeAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseDate_And_Time(Date_And_Time object)
      {
        return createDate_And_TimeAdapter();
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
      public Adapter caseVariable_Decl(Variable_Decl object)
      {
        return createVariable_DeclAdapter();
      }
      @Override
      public Adapter caseType_Decl(Type_Decl object)
      {
        return createType_DeclAdapter();
      }
      @Override
      public Adapter caseStr_Type_Decl(Str_Type_Decl object)
      {
        return createStr_Type_DeclAdapter();
      }
      @Override
      public Adapter caseSpec_Init(Spec_Init object)
      {
        return createSpec_InitAdapter();
      }
      @Override
      public Adapter caseSubrange(Subrange object)
      {
        return createSubrangeAdapter();
      }
      @Override
      public Adapter caseEnum_Spec_Init(Enum_Spec_Init object)
      {
        return createEnum_Spec_InitAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseVariable_Address(Variable_Address object)
      {
        return createVariable_AddressAdapter();
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
      public Adapter caseVar_Decl_Init(Var_Decl_Init object)
      {
        return createVar_Decl_InitAdapter();
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
      public Adapter caseVar_Decls(Var_Decls object)
      {
        return createVar_DeclsAdapter();
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
      public Adapter caseNamespace_Decl(Namespace_Decl object)
      {
        return createNamespace_DeclAdapter();
      }
      @Override
      public Adapter caseNamespace_Elements(Namespace_Elements object)
      {
        return createNamespace_ElementsAdapter();
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
      public Adapter caseCallable(Callable object)
      {
        return createCallableAdapter();
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
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.ST <em>ST</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.ST
   * @generated
   */
  public Adapter createSTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.POU_Decl <em>POU Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.POU_Decl
   * @generated
   */
  public Adapter createPOU_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Numeric_Literal <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Numeric_Literal
   * @generated
   */
  public Adapter createNumeric_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Int_Literal <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Int_Literal
   * @generated
   */
  public Adapter createInt_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Unsigned_Int <em>Unsigned Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Unsigned_Int
   * @generated
   */
  public Adapter createUnsigned_IntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Signed_Int <em>Signed Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Signed_Int
   * @generated
   */
  public Adapter createSigned_IntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Real_Literal <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Real_Literal
   * @generated
   */
  public Adapter createReal_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Bit_Str_Literal <em>Bit Str Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Bit_Str_Literal
   * @generated
   */
  public Adapter createBit_Str_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Bool_Literal <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Bool_Literal
   * @generated
   */
  public Adapter createBool_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Char_Literal <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Char_Literal
   * @generated
   */
  public Adapter createChar_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Time_Literal <em>Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Time_Literal
   * @generated
   */
  public Adapter createTime_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Duration
   * @generated
   */
  public Adapter createDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Time_Of_Day <em>Time Of Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Time_Of_Day
   * @generated
   */
  public Adapter createTime_Of_DayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Daytime <em>Daytime</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Daytime
   * @generated
   */
  public Adapter createDaytimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Date_And_Time <em>Date And Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Date_And_Time
   * @generated
   */
  public Adapter createDate_And_TimeAdapter()
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
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Variable_Decl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Variable_Decl
   * @generated
   */
  public Adapter createVariable_DeclAdapter()
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
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Spec_Init <em>Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Spec_Init
   * @generated
   */
  public Adapter createSpec_InitAdapter()
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
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Variable_Address <em>Variable Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Variable_Address
   * @generated
   */
  public Adapter createVariable_AddressAdapter()
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
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl <em>Namespace Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Decl
   * @generated
   */
  public Adapter createNamespace_DeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Namespace_Elements <em>Namespace Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Elements
   * @generated
   */
  public Adapter createNamespace_ElementsAdapter()
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
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Callable <em>Callable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Callable
   * @generated
   */
  public Adapter createCallableAdapter()
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
