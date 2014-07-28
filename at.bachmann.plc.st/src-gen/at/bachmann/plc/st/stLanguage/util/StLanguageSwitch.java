/**
 */
package at.bachmann.plc.st.stLanguage.util;

import at.bachmann.plc.st.stLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage
 * @generated
 */
public class StLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case StLanguagePackage.ST:
      {
        ST st = (ST)theEObject;
        T result = caseST(st);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.POU_DECL:
      {
        POU_Decl poU_Decl = (POU_Decl)theEObject;
        T result = casePOU_Decl(poU_Decl);
        if (result == null) result = caseST(poU_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseExpression(constant);
        if (result == null) result = caseConstant_Expr(constant);
        if (result == null) result = caseCase_List_Elem(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.NUMERIC_LITERAL:
      {
        Numeric_Literal numeric_Literal = (Numeric_Literal)theEObject;
        T result = caseNumeric_Literal(numeric_Literal);
        if (result == null) result = caseConstant(numeric_Literal);
        if (result == null) result = caseExpression(numeric_Literal);
        if (result == null) result = caseConstant_Expr(numeric_Literal);
        if (result == null) result = caseCase_List_Elem(numeric_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INT_LITERAL:
      {
        Int_Literal int_Literal = (Int_Literal)theEObject;
        T result = caseInt_Literal(int_Literal);
        if (result == null) result = caseNumeric_Literal(int_Literal);
        if (result == null) result = caseConstant(int_Literal);
        if (result == null) result = caseExpression(int_Literal);
        if (result == null) result = caseConstant_Expr(int_Literal);
        if (result == null) result = caseCase_List_Elem(int_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.UNSIGNED_INT:
      {
        Unsigned_Int unsigned_Int = (Unsigned_Int)theEObject;
        T result = caseUnsigned_Int(unsigned_Int);
        if (result == null) result = caseInt_Literal(unsigned_Int);
        if (result == null) result = caseNumeric_Literal(unsigned_Int);
        if (result == null) result = caseConstant(unsigned_Int);
        if (result == null) result = caseExpression(unsigned_Int);
        if (result == null) result = caseConstant_Expr(unsigned_Int);
        if (result == null) result = caseCase_List_Elem(unsigned_Int);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SIGNED_INT:
      {
        Signed_Int signed_Int = (Signed_Int)theEObject;
        T result = caseSigned_Int(signed_Int);
        if (result == null) result = caseInt_Literal(signed_Int);
        if (result == null) result = caseNumeric_Literal(signed_Int);
        if (result == null) result = caseConstant(signed_Int);
        if (result == null) result = caseExpression(signed_Int);
        if (result == null) result = caseConstant_Expr(signed_Int);
        if (result == null) result = caseCase_List_Elem(signed_Int);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REAL_LITERAL:
      {
        Real_Literal real_Literal = (Real_Literal)theEObject;
        T result = caseReal_Literal(real_Literal);
        if (result == null) result = caseNumeric_Literal(real_Literal);
        if (result == null) result = caseConstant(real_Literal);
        if (result == null) result = caseExpression(real_Literal);
        if (result == null) result = caseConstant_Expr(real_Literal);
        if (result == null) result = caseCase_List_Elem(real_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.BIT_STR_LITERAL:
      {
        Bit_Str_Literal bit_Str_Literal = (Bit_Str_Literal)theEObject;
        T result = caseBit_Str_Literal(bit_Str_Literal);
        if (result == null) result = caseConstant(bit_Str_Literal);
        if (result == null) result = caseExpression(bit_Str_Literal);
        if (result == null) result = caseConstant_Expr(bit_Str_Literal);
        if (result == null) result = caseCase_List_Elem(bit_Str_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.BOOL_LITERAL:
      {
        Bool_Literal bool_Literal = (Bool_Literal)theEObject;
        T result = caseBool_Literal(bool_Literal);
        if (result == null) result = caseConstant(bool_Literal);
        if (result == null) result = caseExpression(bool_Literal);
        if (result == null) result = caseConstant_Expr(bool_Literal);
        if (result == null) result = caseCase_List_Elem(bool_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CHAR_LITERAL:
      {
        Char_Literal char_Literal = (Char_Literal)theEObject;
        T result = caseChar_Literal(char_Literal);
        if (result == null) result = caseConstant(char_Literal);
        if (result == null) result = caseExpression(char_Literal);
        if (result == null) result = caseConstant_Expr(char_Literal);
        if (result == null) result = caseCase_List_Elem(char_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TIME_LITERAL:
      {
        Time_Literal time_Literal = (Time_Literal)theEObject;
        T result = caseTime_Literal(time_Literal);
        if (result == null) result = caseConstant(time_Literal);
        if (result == null) result = caseExpression(time_Literal);
        if (result == null) result = caseConstant_Expr(time_Literal);
        if (result == null) result = caseCase_List_Elem(time_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DURATION:
      {
        Duration duration = (Duration)theEObject;
        T result = caseDuration(duration);
        if (result == null) result = caseTime_Literal(duration);
        if (result == null) result = caseConstant(duration);
        if (result == null) result = caseExpression(duration);
        if (result == null) result = caseConstant_Expr(duration);
        if (result == null) result = caseCase_List_Elem(duration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TIME_OF_DAY:
      {
        Time_Of_Day time_Of_Day = (Time_Of_Day)theEObject;
        T result = caseTime_Of_Day(time_Of_Day);
        if (result == null) result = caseTime_Literal(time_Of_Day);
        if (result == null) result = caseConstant(time_Of_Day);
        if (result == null) result = caseExpression(time_Of_Day);
        if (result == null) result = caseConstant_Expr(time_Of_Day);
        if (result == null) result = caseCase_List_Elem(time_Of_Day);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DAYTIME:
      {
        Daytime daytime = (Daytime)theEObject;
        T result = caseDaytime(daytime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DATE:
      {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = caseTime_Literal(date);
        if (result == null) result = caseConstant(date);
        if (result == null) result = caseExpression(date);
        if (result == null) result = caseConstant_Expr(date);
        if (result == null) result = caseCase_List_Elem(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DATE_AND_TIME:
      {
        Date_And_Time date_And_Time = (Date_And_Time)theEObject;
        T result = caseDate_And_Time(date_And_Time);
        if (result == null) result = caseTime_Literal(date_And_Time);
        if (result == null) result = caseConstant(date_And_Time);
        if (result == null) result = caseExpression(date_And_Time);
        if (result == null) result = caseConstant_Expr(date_And_Time);
        if (result == null) result = caseCase_List_Elem(date_And_Time);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DATA_TYPE_DECL:
      {
        Data_Type_Decl data_Type_Decl = (Data_Type_Decl)theEObject;
        T result = caseData_Type_Decl(data_Type_Decl);
        if (result == null) result = caseNamespace_Elements(data_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_DECL:
      {
        Struct_Decl struct_Decl = (Struct_Decl)theEObject;
        T result = caseStruct_Decl(struct_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE_DECL:
      {
        Variable_Decl variable_Decl = (Variable_Decl)theEObject;
        T result = caseVariable_Decl(variable_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TYPE_DECL:
      {
        Type_Decl type_Decl = (Type_Decl)theEObject;
        T result = caseType_Decl(type_Decl);
        if (result == null) result = caseVariable_Decl(type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STR_TYPE_DECL:
      {
        Str_Type_Decl str_Type_Decl = (Str_Type_Decl)theEObject;
        T result = caseStr_Type_Decl(str_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SPEC_INIT:
      {
        Spec_Init spec_Init = (Spec_Init)theEObject;
        T result = caseSpec_Init(spec_Init);
        if (result == null) result = caseLoc_Var_Spec_Init(spec_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SUBRANGE:
      {
        Subrange subrange = (Subrange)theEObject;
        T result = caseSubrange(subrange);
        if (result == null) result = caseCase_List_Elem(subrange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ENUM_SPEC_INIT:
      {
        Enum_Spec_Init enum_Spec_Init = (Enum_Spec_Init)theEObject;
        T result = caseEnum_Spec_Init(enum_Spec_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseLocated_At(variable);
        if (result == null) result = caseAssign_Stmt(variable);
        if (result == null) result = caseParam_Assign(variable);
        if (result == null) result = caseConstant_Expr(variable);
        if (result == null) result = caseStmt(variable);
        if (result == null) result = caseCase_List_Elem(variable);
        if (result == null) result = caseCallable(variable);
        if (result == null) result = caseExpression(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE_ADDRESS:
      {
        Variable_Address variable_Address = (Variable_Address)theEObject;
        T result = caseVariable_Address(variable_Address);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REF_SPEC:
      {
        Ref_Spec ref_Spec = (Ref_Spec)theEObject;
        T result = caseRef_Spec(ref_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REF_VALUE:
      {
        Ref_Value ref_Value = (Ref_Value)theEObject;
        T result = caseRef_Value(ref_Value);
        if (result == null) result = caseExpression(ref_Value);
        if (result == null) result = caseConstant_Expr(ref_Value);
        if (result == null) result = caseCase_List_Elem(ref_Value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INPUT_DECLS:
      {
        Input_Decls input_Decls = (Input_Decls)theEObject;
        T result = caseInput_Decls(input_Decls);
        if (result == null) result = caseIO_Var_Decls(input_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INPUT_DECL:
      {
        Input_Decl input_Decl = (Input_Decl)theEObject;
        T result = caseInput_Decl(input_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VAR_DECL_INIT:
      {
        Var_Decl_Init var_Decl_Init = (Var_Decl_Init)theEObject;
        T result = caseVar_Decl_Init(var_Decl_Init);
        if (result == null) result = caseInput_Decl(var_Decl_Init);
        if (result == null) result = caseOutput_Decl(var_Decl_Init);
        if (result == null) result = caseFB_Input_Decl(var_Decl_Init);
        if (result == null) result = caseFB_Output_Decl(var_Decl_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INTERFACE_VAR_DECL:
      {
        Interface_Var_Decl interface_Var_Decl = (Interface_Var_Decl)theEObject;
        T result = caseInterface_Var_Decl(interface_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE_LIST:
      {
        Variable_List variable_List = (Variable_List)theEObject;
        T result = caseVariable_List(variable_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.OUTPUT_DECLS:
      {
        Output_Decls output_Decls = (Output_Decls)theEObject;
        T result = caseOutput_Decls(output_Decls);
        if (result == null) result = caseIO_Var_Decls(output_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.OUTPUT_DECL:
      {
        Output_Decl output_Decl = (Output_Decl)theEObject;
        T result = caseOutput_Decl(output_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.IN_OUT_DECLS:
      {
        In_Out_Decls in_Out_Decls = (In_Out_Decls)theEObject;
        T result = caseIn_Out_Decls(in_Out_Decls);
        if (result == null) result = caseIO_Var_Decls(in_Out_Decls);
        if (result == null) result = caseFB_IO_Var_Decls(in_Out_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.IN_OUT_VAR_DECL:
      {
        In_Out_Var_Decl in_Out_Var_Decl = (In_Out_Var_Decl)theEObject;
        T result = caseIn_Out_Var_Decl(in_Out_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VAR_DECL:
      {
        Var_Decl var_Decl = (Var_Decl)theEObject;
        T result = caseVar_Decl(var_Decl);
        if (result == null) result = caseIn_Out_Var_Decl(var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VAR_DECLS:
      {
        Var_Decls var_Decls = (Var_Decls)theEObject;
        T result = caseVar_Decls(var_Decls);
        if (result == null) result = caseFunc_Var_Decls(var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.LOC_VAR_DECL:
      {
        Loc_Var_Decl loc_Var_Decl = (Loc_Var_Decl)theEObject;
        T result = caseLoc_Var_Decl(loc_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TEMP_VAR_DECLS:
      {
        Temp_Var_Decls temp_Var_Decls = (Temp_Var_Decls)theEObject;
        T result = caseTemp_Var_Decls(temp_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.EXTERNAL_VAR_DECLS:
      {
        External_Var_Decls external_Var_Decls = (External_Var_Decls)theEObject;
        T result = caseExternal_Var_Decls(external_Var_Decls);
        if (result == null) result = caseFunc_Var_Decls(external_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.EXTERNAL_DECL:
      {
        External_Decl external_Decl = (External_Decl)theEObject;
        T result = caseExternal_Decl(external_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.GLOBAL_VAR_DECLS:
      {
        Global_Var_Decls global_Var_Decls = (Global_Var_Decls)theEObject;
        T result = caseGlobal_Var_Decls(global_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.GLOBAL_VAR_DECL:
      {
        Global_Var_Decl global_Var_Decl = (Global_Var_Decl)theEObject;
        T result = caseGlobal_Var_Decl(global_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.GLOBAL_VAR_SPEC:
      {
        Global_Var_Spec global_Var_Spec = (Global_Var_Spec)theEObject;
        T result = caseGlobal_Var_Spec(global_Var_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.LOC_VAR_SPEC_INIT:
      {
        Loc_Var_Spec_Init loc_Var_Spec_Init = (Loc_Var_Spec_Init)theEObject;
        T result = caseLoc_Var_Spec_Init(loc_Var_Spec_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.LOCATED_AT:
      {
        Located_At located_At = (Located_At)theEObject;
        T result = caseLocated_At(located_At);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STR_VAR_DECL:
      {
        Str_Var_Decl str_Var_Decl = (Str_Var_Decl)theEObject;
        T result = caseStr_Var_Decl(str_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SBYTE_STR_VAR_DECL:
      {
        S_Byte_Str_Var_Decl s_Byte_Str_Var_Decl = (S_Byte_Str_Var_Decl)theEObject;
        T result = caseS_Byte_Str_Var_Decl(s_Byte_Str_Var_Decl);
        if (result == null) result = caseStr_Var_Decl(s_Byte_Str_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SBYTE_STR_SPEC:
      {
        S_Byte_Str_Spec s_Byte_Str_Spec = (S_Byte_Str_Spec)theEObject;
        T result = caseS_Byte_Str_Spec(s_Byte_Str_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DBYTE_STR_VAR_DECL:
      {
        D_Byte_Str_Var_Decl d_Byte_Str_Var_Decl = (D_Byte_Str_Var_Decl)theEObject;
        T result = caseD_Byte_Str_Var_Decl(d_Byte_Str_Var_Decl);
        if (result == null) result = caseStr_Var_Decl(d_Byte_Str_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DBYTE_STR_SPEC:
      {
        D_Byte_Str_Spec d_Byte_Str_Spec = (D_Byte_Str_Spec)theEObject;
        T result = caseD_Byte_Str_Spec(d_Byte_Str_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FUNC_DECL:
      {
        Func_Decl func_Decl = (Func_Decl)theEObject;
        T result = caseFunc_Decl(func_Decl);
        if (result == null) result = caseNamespace_Elements(func_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.IO_VAR_DECLS:
      {
        IO_Var_Decls iO_Var_Decls = (IO_Var_Decls)theEObject;
        T result = caseIO_Var_Decls(iO_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FUNC_VAR_DECLS:
      {
        Func_Var_Decls func_Var_Decls = (Func_Var_Decls)theEObject;
        T result = caseFunc_Var_Decls(func_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FUNC_BODY:
      {
        Func_Body func_Body = (Func_Body)theEObject;
        T result = caseFunc_Body(func_Body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_DECL:
      {
        FB_Decl fB_Decl = (FB_Decl)theEObject;
        T result = caseFB_Decl(fB_Decl);
        if (result == null) result = caseNamespace_Elements(fB_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_IO_VAR_DECLS:
      {
        FB_IO_Var_Decls fB_IO_Var_Decls = (FB_IO_Var_Decls)theEObject;
        T result = caseFB_IO_Var_Decls(fB_IO_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_INPUT_DECLS:
      {
        FB_Input_Decls fB_Input_Decls = (FB_Input_Decls)theEObject;
        T result = caseFB_Input_Decls(fB_Input_Decls);
        if (result == null) result = caseFB_IO_Var_Decls(fB_Input_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_INPUT_DECL:
      {
        FB_Input_Decl fB_Input_Decl = (FB_Input_Decl)theEObject;
        T result = caseFB_Input_Decl(fB_Input_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_OUTPUT_DECLS:
      {
        FB_Output_Decls fB_Output_Decls = (FB_Output_Decls)theEObject;
        T result = caseFB_Output_Decls(fB_Output_Decls);
        if (result == null) result = caseFB_IO_Var_Decls(fB_Output_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_OUTPUT_DECL:
      {
        FB_Output_Decl fB_Output_Decl = (FB_Output_Decl)theEObject;
        T result = caseFB_Output_Decl(fB_Output_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_BODY:
      {
        FB_Body fB_Body = (FB_Body)theEObject;
        T result = caseFB_Body(fB_Body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.METHOD_DECL:
      {
        Method_Decl method_Decl = (Method_Decl)theEObject;
        T result = caseMethod_Decl(method_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CLASS_DECL:
      {
        Class_Decl class_Decl = (Class_Decl)theEObject;
        T result = caseClass_Decl(class_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INTERFACE_DECL:
      {
        Interface_Decl interface_Decl = (Interface_Decl)theEObject;
        T result = caseInterface_Decl(interface_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.METHOD_PROTOTYPE:
      {
        Method_Prototype method_Prototype = (Method_Prototype)theEObject;
        T result = caseMethod_Prototype(method_Prototype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INTERFACE_NAME_LIST:
      {
        Interface_Name_List interface_Name_List = (Interface_Name_List)theEObject;
        T result = caseInterface_Name_List(interface_Name_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.PROG_DECL:
      {
        Prog_Decl prog_Decl = (Prog_Decl)theEObject;
        T result = caseProg_Decl(prog_Decl);
        if (result == null) result = caseST(prog_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.NAMESPACE_DECL:
      {
        Namespace_Decl namespace_Decl = (Namespace_Decl)theEObject;
        T result = caseNamespace_Decl(namespace_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.NAMESPACE_ELEMENTS:
      {
        Namespace_Elements namespace_Elements = (Namespace_Elements)theEObject;
        T result = caseNamespace_Elements(namespace_Elements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.USING_DIRECTIVE:
      {
        Using_Directive using_Directive = (Using_Directive)theEObject;
        T result = caseUsing_Directive(using_Directive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseConstant_Expr(expression);
        if (result == null) result = caseCase_List_Elem(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CONSTANT_EXPR:
      {
        Constant_Expr constant_Expr = (Constant_Expr)theEObject;
        T result = caseConstant_Expr(constant_Expr);
        if (result == null) result = caseCase_List_Elem(constant_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE_ACCESS:
      {
        Variable_Access variable_Access = (Variable_Access)theEObject;
        T result = caseVariable_Access(variable_Access);
        if (result == null) result = caseExpression(variable_Access);
        if (result == null) result = caseConstant_Expr(variable_Access);
        if (result == null) result = caseCase_List_Elem(variable_Access);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.MULTIBIT_PART_ACCESS:
      {
        Multibit_Part_Access multibit_Part_Access = (Multibit_Part_Access)theEObject;
        T result = caseMultibit_Part_Access(multibit_Part_Access);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CALLABLE:
      {
        Callable callable = (Callable)theEObject;
        T result = caseCallable(callable);
        if (result == null) result = caseExpression(callable);
        if (result == null) result = caseConstant_Expr(callable);
        if (result == null) result = caseCase_List_Elem(callable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STMT_LIST:
      {
        Stmt_List stmt_List = (Stmt_List)theEObject;
        T result = caseStmt_List(stmt_List);
        if (result == null) result = caseFunc_Body(stmt_List);
        if (result == null) result = caseFB_Body(stmt_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STMT:
      {
        Stmt stmt = (Stmt)theEObject;
        T result = caseStmt(stmt);
        if (result == null) result = caseCallable(stmt);
        if (result == null) result = caseExpression(stmt);
        if (result == null) result = caseConstant_Expr(stmt);
        if (result == null) result = caseCase_List_Elem(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ASSIGN_STMT:
      {
        Assign_Stmt assign_Stmt = (Assign_Stmt)theEObject;
        T result = caseAssign_Stmt(assign_Stmt);
        if (result == null) result = caseStmt(assign_Stmt);
        if (result == null) result = caseCallable(assign_Stmt);
        if (result == null) result = caseExpression(assign_Stmt);
        if (result == null) result = caseConstant_Expr(assign_Stmt);
        if (result == null) result = caseCase_List_Elem(assign_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE_ASSIGN_STMT:
      {
        Variable_Assign_Stmt variable_Assign_Stmt = (Variable_Assign_Stmt)theEObject;
        T result = caseVariable_Assign_Stmt(variable_Assign_Stmt);
        if (result == null) result = caseAssign_Stmt(variable_Assign_Stmt);
        if (result == null) result = caseStmt(variable_Assign_Stmt);
        if (result == null) result = caseCallable(variable_Assign_Stmt);
        if (result == null) result = caseExpression(variable_Assign_Stmt);
        if (result == null) result = caseConstant_Expr(variable_Assign_Stmt);
        if (result == null) result = caseCase_List_Elem(variable_Assign_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ASSIGNMENT_ATTEMPT:
      {
        Assignment_Attempt assignment_Attempt = (Assignment_Attempt)theEObject;
        T result = caseAssignment_Attempt(assignment_Attempt);
        if (result == null) result = caseAssign_Stmt(assignment_Attempt);
        if (result == null) result = caseStmt(assignment_Attempt);
        if (result == null) result = caseCallable(assignment_Attempt);
        if (result == null) result = caseExpression(assignment_Attempt);
        if (result == null) result = caseConstant_Expr(assignment_Attempt);
        if (result == null) result = caseCase_List_Elem(assignment_Attempt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.PARAM_ASSIGN:
      {
        Param_Assign param_Assign = (Param_Assign)theEObject;
        T result = caseParam_Assign(param_Assign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.NAMED_VALUE:
      {
        Named_Value named_Value = (Named_Value)theEObject;
        T result = caseNamed_Value(named_Value);
        if (result == null) result = caseParam_Assign(named_Value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.LINKED_VALUE:
      {
        Linked_Value linked_Value = (Linked_Value)theEObject;
        T result = caseLinked_Value(linked_Value);
        if (result == null) result = caseParam_Assign(linked_Value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SELECTION_STMT:
      {
        Selection_Stmt selection_Stmt = (Selection_Stmt)theEObject;
        T result = caseSelection_Stmt(selection_Stmt);
        if (result == null) result = caseStmt(selection_Stmt);
        if (result == null) result = caseCallable(selection_Stmt);
        if (result == null) result = caseExpression(selection_Stmt);
        if (result == null) result = caseConstant_Expr(selection_Stmt);
        if (result == null) result = caseCase_List_Elem(selection_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.IF_STMT:
      {
        IF_Stmt iF_Stmt = (IF_Stmt)theEObject;
        T result = caseIF_Stmt(iF_Stmt);
        if (result == null) result = caseSelection_Stmt(iF_Stmt);
        if (result == null) result = caseStmt(iF_Stmt);
        if (result == null) result = caseCallable(iF_Stmt);
        if (result == null) result = caseExpression(iF_Stmt);
        if (result == null) result = caseConstant_Expr(iF_Stmt);
        if (result == null) result = caseCase_List_Elem(iF_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ELSEIF_STMT:
      {
        ELSEIF_Stmt elseiF_Stmt = (ELSEIF_Stmt)theEObject;
        T result = caseELSEIF_Stmt(elseiF_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ELSE_STMT:
      {
        ELSE_Stmt elsE_Stmt = (ELSE_Stmt)theEObject;
        T result = caseELSE_Stmt(elsE_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CASE_STMT:
      {
        Case_Stmt case_Stmt = (Case_Stmt)theEObject;
        T result = caseCase_Stmt(case_Stmt);
        if (result == null) result = caseSelection_Stmt(case_Stmt);
        if (result == null) result = caseStmt(case_Stmt);
        if (result == null) result = caseCallable(case_Stmt);
        if (result == null) result = caseExpression(case_Stmt);
        if (result == null) result = caseConstant_Expr(case_Stmt);
        if (result == null) result = caseCase_List_Elem(case_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CASE_SELECTION:
      {
        Case_Selection case_Selection = (Case_Selection)theEObject;
        T result = caseCase_Selection(case_Selection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CASE_LIST:
      {
        Case_List case_List = (Case_List)theEObject;
        T result = caseCase_List(case_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CASE_LIST_ELEM:
      {
        Case_List_Elem case_List_Elem = (Case_List_Elem)theEObject;
        T result = caseCase_List_Elem(case_List_Elem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ITERATION_STMT:
      {
        Iteration_Stmt iteration_Stmt = (Iteration_Stmt)theEObject;
        T result = caseIteration_Stmt(iteration_Stmt);
        if (result == null) result = caseStmt(iteration_Stmt);
        if (result == null) result = caseCallable(iteration_Stmt);
        if (result == null) result = caseExpression(iteration_Stmt);
        if (result == null) result = caseConstant_Expr(iteration_Stmt);
        if (result == null) result = caseCase_List_Elem(iteration_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.EXIT_STMT:
      {
        Exit_Stmt exit_Stmt = (Exit_Stmt)theEObject;
        T result = caseExit_Stmt(exit_Stmt);
        if (result == null) result = caseIteration_Stmt(exit_Stmt);
        if (result == null) result = caseStmt(exit_Stmt);
        if (result == null) result = caseCallable(exit_Stmt);
        if (result == null) result = caseExpression(exit_Stmt);
        if (result == null) result = caseConstant_Expr(exit_Stmt);
        if (result == null) result = caseCase_List_Elem(exit_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CONTINUE_STMT:
      {
        Continue_Stmt continue_Stmt = (Continue_Stmt)theEObject;
        T result = caseContinue_Stmt(continue_Stmt);
        if (result == null) result = caseIteration_Stmt(continue_Stmt);
        if (result == null) result = caseStmt(continue_Stmt);
        if (result == null) result = caseCallable(continue_Stmt);
        if (result == null) result = caseExpression(continue_Stmt);
        if (result == null) result = caseConstant_Expr(continue_Stmt);
        if (result == null) result = caseCase_List_Elem(continue_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FOR_STMT:
      {
        For_Stmt for_Stmt = (For_Stmt)theEObject;
        T result = caseFor_Stmt(for_Stmt);
        if (result == null) result = caseIteration_Stmt(for_Stmt);
        if (result == null) result = caseStmt(for_Stmt);
        if (result == null) result = caseCallable(for_Stmt);
        if (result == null) result = caseExpression(for_Stmt);
        if (result == null) result = caseConstant_Expr(for_Stmt);
        if (result == null) result = caseCase_List_Elem(for_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FOR_LIST:
      {
        For_List for_List = (For_List)theEObject;
        T result = caseFor_List(for_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.WHILE_STMT:
      {
        While_Stmt while_Stmt = (While_Stmt)theEObject;
        T result = caseWhile_Stmt(while_Stmt);
        if (result == null) result = caseIteration_Stmt(while_Stmt);
        if (result == null) result = caseStmt(while_Stmt);
        if (result == null) result = caseCallable(while_Stmt);
        if (result == null) result = caseExpression(while_Stmt);
        if (result == null) result = caseConstant_Expr(while_Stmt);
        if (result == null) result = caseCase_List_Elem(while_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REPEAT_STMT:
      {
        Repeat_Stmt repeat_Stmt = (Repeat_Stmt)theEObject;
        T result = caseRepeat_Stmt(repeat_Stmt);
        if (result == null) result = caseIteration_Stmt(repeat_Stmt);
        if (result == null) result = caseStmt(repeat_Stmt);
        if (result == null) result = caseCallable(repeat_Stmt);
        if (result == null) result = caseExpression(repeat_Stmt);
        if (result == null) result = caseConstant_Expr(repeat_Stmt);
        if (result == null) result = caseCase_List_Elem(repeat_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.XOR_EXPR:
      {
        Xor_Expr xor_Expr = (Xor_Expr)theEObject;
        T result = caseXor_Expr(xor_Expr);
        if (result == null) result = caseExpression(xor_Expr);
        if (result == null) result = caseConstant_Expr(xor_Expr);
        if (result == null) result = caseCase_List_Elem(xor_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.AND_EXPR:
      {
        And_Expr and_Expr = (And_Expr)theEObject;
        T result = caseAnd_Expr(and_Expr);
        if (result == null) result = caseExpression(and_Expr);
        if (result == null) result = caseConstant_Expr(and_Expr);
        if (result == null) result = caseCase_List_Elem(and_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.COMPARE_EXPR:
      {
        Compare_Expr compare_Expr = (Compare_Expr)theEObject;
        T result = caseCompare_Expr(compare_Expr);
        if (result == null) result = caseExpression(compare_Expr);
        if (result == null) result = caseConstant_Expr(compare_Expr);
        if (result == null) result = caseCase_List_Elem(compare_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.EQU_EXPR:
      {
        Equ_Expr equ_Expr = (Equ_Expr)theEObject;
        T result = caseEqu_Expr(equ_Expr);
        if (result == null) result = caseExpression(equ_Expr);
        if (result == null) result = caseConstant_Expr(equ_Expr);
        if (result == null) result = caseCase_List_Elem(equ_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ADD_EXPR:
      {
        Add_Expr add_Expr = (Add_Expr)theEObject;
        T result = caseAdd_Expr(add_Expr);
        if (result == null) result = caseExpression(add_Expr);
        if (result == null) result = caseConstant_Expr(add_Expr);
        if (result == null) result = caseCase_List_Elem(add_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = caseExpression(term);
        if (result == null) result = caseConstant_Expr(term);
        if (result == null) result = caseCase_List_Elem(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.POWER_EXPR:
      {
        Power_Expr power_Expr = (Power_Expr)theEObject;
        T result = casePower_Expr(power_Expr);
        if (result == null) result = caseExpression(power_Expr);
        if (result == null) result = caseConstant_Expr(power_Expr);
        if (result == null) result = caseCase_List_Elem(power_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ST</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ST</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseST(ST object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POU Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POU Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOU_Decl(POU_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumeric_Literal(Numeric_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInt_Literal(Int_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsigned_Int(Unsigned_Int object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signed Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signed Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSigned_Int(Signed_Int object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReal_Literal(Real_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Str Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Str Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBit_Str_Literal(Bit_Str_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBool_Literal(Bool_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Char Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Char Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChar_Literal(Char_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTime_Literal(Time_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDuration(Duration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTime_Of_Day(Time_Of_Day object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Daytime</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Daytime</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaytime(Daytime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate(Date object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date And Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date And Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate_And_Time(Date_And_Time object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData_Type_Decl(Data_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Decl(Struct_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_Decl(Variable_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_Decl(Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStr_Type_Decl(Str_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpec_Init(Spec_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subrange</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subrange</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubrange(Subrange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum_Spec_Init(Enum_Spec_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_Address(Variable_Address object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Spec(Ref_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Value(Ref_Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput_Decls(Input_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput_Decl(Input_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decl Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decl Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar_Decl_Init(Var_Decl_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_Var_Decl(Interface_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_List(Variable_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput_Decls(Output_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput_Decl(Output_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIn_Out_Decls(In_Out_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIn_Out_Var_Decl(In_Out_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar_Decl(Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar_Decls(Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loc Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoc_Var_Decl(Loc_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Temp Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Temp Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemp_Var_Decls(Temp_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternal_Var_Decls(External_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternal_Decl(External_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobal_Var_Decls(Global_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobal_Var_Decl(Global_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Var Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Var Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobal_Var_Spec(Global_Var_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loc Var Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc Var Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoc_Var_Spec_Init(Loc_Var_Spec_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Located At</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Located At</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocated_At(Located_At object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStr_Var_Decl(Str_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SByte Str Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SByte Str Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Byte_Str_Var_Decl(S_Byte_Str_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SByte Str Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SByte Str Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Byte_Str_Spec(S_Byte_Str_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DByte Str Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DByte Str Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseD_Byte_Str_Var_Decl(D_Byte_Str_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DByte Str Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DByte Str Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseD_Byte_Str_Spec(D_Byte_Str_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunc_Decl(Func_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IO Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IO Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIO_Var_Decls(IO_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunc_Var_Decls(Func_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunc_Body(Func_Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Decl(FB_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB IO Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB IO Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_IO_Var_Decls(FB_IO_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Input Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Input Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Input_Decls(FB_Input_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Input Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Input Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Input_Decl(FB_Input_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Output Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Output Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Output_Decls(FB_Output_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Output Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Output Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Output_Decl(FB_Output_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Body(FB_Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod_Decl(Method_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass_Decl(Class_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_Decl(Interface_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Prototype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Prototype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod_Prototype(Method_Prototype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Name List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Name List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_Name_List(Interface_Name_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prog Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prog Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProg_Decl(Prog_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace_Decl(Namespace_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace_Elements(Namespace_Elements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsing_Directive(Using_Directive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant_Expr(Constant_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_Access(Variable_Access object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multibit Part Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multibit Part Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultibit_Part_Access(Multibit_Part_Access object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallable(Callable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt_List(Stmt_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt(Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssign_Stmt(Assign_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assign Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assign Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_Assign_Stmt(Variable_Assign_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Attempt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Attempt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment_Attempt(Assignment_Attempt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam_Assign(Param_Assign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamed_Value(Named_Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linked Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linked Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinked_Value(Linked_Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelection_Stmt(Selection_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IF Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IF Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIF_Stmt(IF_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ELSEIF Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ELSEIF Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseELSEIF_Stmt(ELSEIF_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ELSE Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ELSE Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseELSE_Stmt(ELSE_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase_Stmt(Case_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase_Selection(Case_Selection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase_List(Case_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case List Elem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case List Elem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase_List_Elem(Case_List_Elem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iteration Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iteration Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIteration_Stmt(Iteration_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExit_Stmt(Exit_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continue Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continue Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinue_Stmt(Continue_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_Stmt(For_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_List(For_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile_Stmt(While_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeat Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeat Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeat_Stmt(Repeat_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xor Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xor Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXor_Expr(Xor_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd_Expr(And_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompare_Expr(Compare_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equ Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equ Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqu_Expr(Equ_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdd_Expr(Add_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Power Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Power Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePower_Expr(Power_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //StLanguageSwitch
