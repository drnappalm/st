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
      case StLanguagePackage.ST_PROGRAM:
      {
        ST_Program sT_Program = (ST_Program)theEObject;
        T result = caseST_Program(sT_Program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DATA_TYPE_DECL:
      {
        Data_Type_Decl data_Type_Decl = (Data_Type_Decl)theEObject;
        T result = caseData_Type_Decl(data_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_DECL:
      {
        Struct_Decl struct_Decl = (Struct_Decl)theEObject;
        T result = caseStruct_Decl(struct_Decl);
        if (result == null) result = caseStruct_Spec(struct_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TYPE_DECL:
      {
        Type_Decl type_Decl = (Type_Decl)theEObject;
        T result = caseType_Decl(type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SIMPLE_TYPE_DECL:
      {
        Simple_Type_Decl simple_Type_Decl = (Simple_Type_Decl)theEObject;
        T result = caseSimple_Type_Decl(simple_Type_Decl);
        if (result == null) result = caseType_Decl(simple_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SUBRANGE_TYPE_DECL:
      {
        Subrange_Type_Decl subrange_Type_Decl = (Subrange_Type_Decl)theEObject;
        T result = caseSubrange_Type_Decl(subrange_Type_Decl);
        if (result == null) result = caseType_Decl(subrange_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ENUM_TYPE_DECL:
      {
        Enum_Type_Decl enum_Type_Decl = (Enum_Type_Decl)theEObject;
        T result = caseEnum_Type_Decl(enum_Type_Decl);
        if (result == null) result = caseType_Decl(enum_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_TYPE_DECL:
      {
        Array_Type_Decl array_Type_Decl = (Array_Type_Decl)theEObject;
        T result = caseArray_Type_Decl(array_Type_Decl);
        if (result == null) result = caseType_Decl(array_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_TYPE_DECL:
      {
        Struct_Type_Decl struct_Type_Decl = (Struct_Type_Decl)theEObject;
        T result = caseStruct_Type_Decl(struct_Type_Decl);
        if (result == null) result = caseType_Decl(struct_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_ELEM_DECL:
      {
        Struct_Elem_Decl struct_Elem_Decl = (Struct_Elem_Decl)theEObject;
        T result = caseStruct_Elem_Decl(struct_Elem_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STR_TYPE_DECL:
      {
        Str_Type_Decl str_Type_Decl = (Str_Type_Decl)theEObject;
        T result = caseStr_Type_Decl(str_Type_Decl);
        if (result == null) result = caseType_Decl(str_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SIMPLE_SPEC:
      {
        Simple_Spec simple_Spec = (Simple_Spec)theEObject;
        T result = caseSimple_Spec(simple_Spec);
        if (result == null) result = caseVar_Spec(simple_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SUBRANGE_SPEC:
      {
        Subrange_Spec subrange_Spec = (Subrange_Spec)theEObject;
        T result = caseSubrange_Spec(subrange_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ENUM_VALUE_SPEC:
      {
        Enum_Value_Spec enum_Value_Spec = (Enum_Value_Spec)theEObject;
        T result = caseEnum_Value_Spec(enum_Value_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ELEM_NAMED_SPEC:
      {
        Elem_Named_Spec elem_Named_Spec = (Elem_Named_Spec)theEObject;
        T result = caseElem_Named_Spec(elem_Named_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_SPEC:
      {
        Array_Spec array_Spec = (Array_Spec)theEObject;
        T result = caseArray_Spec(array_Spec);
        if (result == null) result = caseVar_Spec(array_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_SPEC:
      {
        Struct_Spec struct_Spec = (Struct_Spec)theEObject;
        T result = caseStruct_Spec(struct_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SIMPLE_SPEC_INIT:
      {
        Simple_Spec_Init simple_Spec_Init = (Simple_Spec_Init)theEObject;
        T result = caseSimple_Spec_Init(simple_Spec_Init);
        if (result == null) result = caseLoc_Var_Spec_Init(simple_Spec_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SUBRANGE_SPEC_INIT:
      {
        Subrange_Spec_Init subrange_Spec_Init = (Subrange_Spec_Init)theEObject;
        T result = caseSubrange_Spec_Init(subrange_Spec_Init);
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
      case StLanguagePackage.NAMED_SPEC_INIT:
      {
        Named_Spec_Init named_Spec_Init = (Named_Spec_Init)theEObject;
        T result = caseNamed_Spec_Init(named_Spec_Init);
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
      case StLanguagePackage.ENUM_VALUE:
      {
        Enum_Value enum_Value = (Enum_Value)theEObject;
        T result = caseEnum_Value(enum_Value);
        if (result == null) result = caseExpression(enum_Value);
        if (result == null) result = caseSubscript(enum_Value);
        if (result == null) result = caseConstant_Expr(enum_Value);
        if (result == null) result = caseArray_Elem_Init_Value(enum_Value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_SPEC_INIT:
      {
        Array_Spec_Init array_Spec_Init = (Array_Spec_Init)theEObject;
        T result = caseArray_Spec_Init(array_Spec_Init);
        if (result == null) result = caseLoc_Var_Spec_Init(array_Spec_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_INIT:
      {
        Array_Init array_Init = (Array_Init)theEObject;
        T result = caseArray_Init(array_Init);
        if (result == null) result = caseArray_Elem_Init_Value(array_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_ELEM_INIT:
      {
        Array_Elem_Init array_Elem_Init = (Array_Elem_Init)theEObject;
        T result = caseArray_Elem_Init(array_Elem_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_ELEM_INIT_VALUE:
      {
        Array_Elem_Init_Value array_Elem_Init_Value = (Array_Elem_Init_Value)theEObject;
        T result = caseArray_Elem_Init_Value(array_Elem_Init_Value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_SPEC_INIT:
      {
        Struct_Spec_Init struct_Spec_Init = (Struct_Spec_Init)theEObject;
        T result = caseStruct_Spec_Init(struct_Spec_Init);
        if (result == null) result = caseStruct_Spec(struct_Spec_Init);
        if (result == null) result = caseLoc_Var_Spec_Init(struct_Spec_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_INIT:
      {
        Struct_Init struct_Init = (Struct_Init)theEObject;
        T result = caseStruct_Init(struct_Init);
        if (result == null) result = caseArray_Elem_Init_Value(struct_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_ELEM_INIT:
      {
        Struct_Elem_Init struct_Elem_Init = (Struct_Elem_Init)theEObject;
        T result = caseStruct_Elem_Init(struct_Elem_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.DIRECT_VARIABLE:
      {
        Direct_Variable direct_Variable = (Direct_Variable)theEObject;
        T result = caseDirect_Variable(direct_Variable);
        if (result == null) result = caseVariable(direct_Variable);
        if (result == null) result = caseLocated_At(direct_Variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REF_TYPE_DECL:
      {
        Ref_Type_Decl ref_Type_Decl = (Ref_Type_Decl)theEObject;
        T result = caseRef_Type_Decl(ref_Type_Decl);
        if (result == null) result = caseType_Decl(ref_Type_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REF_SPEC_INIT:
      {
        Ref_Spec_Init ref_Spec_Init = (Ref_Spec_Init)theEObject;
        T result = caseRef_Spec_Init(ref_Spec_Init);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REF_ADDR:
      {
        Ref_Addr ref_Addr = (Ref_Addr)theEObject;
        T result = caseRef_Addr(ref_Addr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REF_ASSIGN:
      {
        Ref_Assign ref_Assign = (Ref_Assign)theEObject;
        T result = caseRef_Assign(ref_Assign);
        if (result == null) result = caseAssign_Stmt(ref_Assign);
        if (result == null) result = caseParam_Assign(ref_Assign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REF_DEREF:
      {
        Ref_Deref ref_Deref = (Ref_Deref)theEObject;
        T result = caseRef_Deref(ref_Deref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SYMBOLIC_VARIABLE:
      {
        Symbolic_Variable symbolic_Variable = (Symbolic_Variable)theEObject;
        T result = caseSymbolic_Variable(symbolic_Variable);
        if (result == null) result = caseVariable(symbolic_Variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VAR_ACCESS:
      {
        Var_Access var_Access = (Var_Access)theEObject;
        T result = caseVar_Access(var_Access);
        if (result == null) result = caseStruct_Elem_Select(var_Access);
        if (result == null) result = caseStruct_Variable(var_Access);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.MULTI_ELEM_VAR:
      {
        Multi_Elem_Var multi_Elem_Var = (Multi_Elem_Var)theEObject;
        T result = caseMulti_Elem_Var(multi_Elem_Var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SUBSCRIPT_LIST:
      {
        Subscript_List subscript_List = (Subscript_List)theEObject;
        T result = caseSubscript_List(subscript_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.SUBSCRIPT:
      {
        Subscript subscript = (Subscript)theEObject;
        T result = caseSubscript(subscript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_VARIABLE:
      {
        Struct_Variable struct_Variable = (Struct_Variable)theEObject;
        T result = caseStruct_Variable(struct_Variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_ELEM_SELECT:
      {
        Struct_Elem_Select struct_Elem_Select = (Struct_Elem_Select)theEObject;
        T result = caseStruct_Elem_Select(struct_Elem_Select);
        if (result == null) result = caseStruct_Variable(struct_Elem_Select);
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
      case StLanguagePackage.EDGE_DECL:
      {
        Edge_Decl edge_Decl = (Edge_Decl)theEObject;
        T result = caseEdge_Decl(edge_Decl);
        if (result == null) result = caseInput_Decl(edge_Decl);
        if (result == null) result = caseFB_Input_Decl(edge_Decl);
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
      case StLanguagePackage.REF_VAR_DECL:
      {
        Ref_Var_Decl ref_Var_Decl = (Ref_Var_Decl)theEObject;
        T result = caseRef_Var_Decl(ref_Var_Decl);
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
      case StLanguagePackage.ARRAY_VAR_DECL_INIT:
      {
        Array_Var_Decl_Init array_Var_Decl_Init = (Array_Var_Decl_Init)theEObject;
        T result = caseArray_Var_Decl_Init(array_Var_Decl_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_CONFORMAND:
      {
        Array_Conformand array_Conformand = (Array_Conformand)theEObject;
        T result = caseArray_Conformand(array_Conformand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ARRAY_CONFORM_DECL:
      {
        Array_Conform_Decl array_Conform_Decl = (Array_Conform_Decl)theEObject;
        T result = caseArray_Conform_Decl(array_Conform_Decl);
        if (result == null) result = caseInput_Decl(array_Conform_Decl);
        if (result == null) result = caseOutput_Decl(array_Conform_Decl);
        if (result == null) result = caseIn_Out_Var_Decl(array_Conform_Decl);
        if (result == null) result = caseFB_Input_Decl(array_Conform_Decl);
        if (result == null) result = caseFB_Output_Decl(array_Conform_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_VAR_DECL_INIT:
      {
        Struct_Var_Decl_Init struct_Var_Decl_Init = (Struct_Var_Decl_Init)theEObject;
        T result = caseStruct_Var_Decl_Init(struct_Var_Decl_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_DECL_NO_INIT:
      {
        FB_Decl_No_Init fB_Decl_No_Init = (FB_Decl_No_Init)theEObject;
        T result = caseFB_Decl_No_Init(fB_Decl_No_Init);
        if (result == null) result = caseIn_Out_Var_Decl(fB_Decl_No_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FB_DECL_INIT:
      {
        FB_Decl_Init fB_Decl_Init = (FB_Decl_Init)theEObject;
        T result = caseFB_Decl_Init(fB_Decl_Init);
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
      case StLanguagePackage.ARRAY_VAR_DECL:
      {
        Array_Var_Decl array_Var_Decl = (Array_Var_Decl)theEObject;
        T result = caseArray_Var_Decl(array_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRUCT_VAR_DECL:
      {
        Struct_Var_Decl struct_Var_Decl = (Struct_Var_Decl)theEObject;
        T result = caseStruct_Var_Decl(struct_Var_Decl);
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
      case StLanguagePackage.RETAIN_VAR_DECLS:
      {
        Retain_Var_Decls retain_Var_Decls = (Retain_Var_Decls)theEObject;
        T result = caseRetain_Var_Decls(retain_Var_Decls);
        if (result == null) result = caseOther_Var_Decls(retain_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.LOC_VAR_DECLS:
      {
        Loc_Var_Decls loc_Var_Decls = (Loc_Var_Decls)theEObject;
        T result = caseLoc_Var_Decls(loc_Var_Decls);
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
        if (result == null) result = caseLoc_Var_Spec_Init(s_Byte_Str_Spec);
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
        if (result == null) result = caseLoc_Var_Spec_Init(d_Byte_Str_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.LOC_PARTLY_VAR_DECL:
      {
        Loc_Partly_Var_Decl loc_Partly_Var_Decl = (Loc_Partly_Var_Decl)theEObject;
        T result = caseLoc_Partly_Var_Decl(loc_Partly_Var_Decl);
        if (result == null) result = caseOther_Var_Decls(loc_Partly_Var_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.LOC_PARTLY_VAR:
      {
        Loc_Partly_Var loc_Partly_Var = (Loc_Partly_Var)theEObject;
        T result = caseLoc_Partly_Var(loc_Partly_Var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VAR_SPEC:
      {
        Var_Spec var_Spec = (Var_Spec)theEObject;
        T result = caseVar_Spec(var_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.STRING_VAR_SPEC:
      {
        StringVar_Spec stringVar_Spec = (StringVar_Spec)theEObject;
        T result = caseStringVar_Spec(stringVar_Spec);
        if (result == null) result = caseVar_Spec(stringVar_Spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FUNC_DECL:
      {
        Func_Decl func_Decl = (Func_Decl)theEObject;
        T result = caseFunc_Decl(func_Decl);
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
      case StLanguagePackage.OTHER_VAR_DECLS:
      {
        Other_Var_Decls other_Var_Decls = (Other_Var_Decls)theEObject;
        T result = caseOther_Var_Decls(other_Var_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.NO_RETAIN_VAR_DECLS:
      {
        No_Retain_Var_Decls no_Retain_Var_Decls = (No_Retain_Var_Decls)theEObject;
        T result = caseNo_Retain_Var_Decls(no_Retain_Var_Decls);
        if (result == null) result = caseOther_Var_Decls(no_Retain_Var_Decls);
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
      case StLanguagePackage.INTERFACE_SPEC_INIT:
      {
        Interface_Spec_Init interface_Spec_Init = (Interface_Spec_Init)theEObject;
        T result = caseInterface_Spec_Init(interface_Spec_Init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INTERFACE_VALUE:
      {
        Interface_Value interface_Value = (Interface_Value)theEObject;
        T result = caseInterface_Value(interface_Value);
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
        if (result == null) result = caseST_Program(prog_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.PROG_ACCESS_DECLS:
      {
        Prog_Access_Decls prog_Access_Decls = (Prog_Access_Decls)theEObject;
        T result = caseProg_Access_Decls(prog_Access_Decls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.PROG_ACCESS_DECL:
      {
        Prog_Access_Decl prog_Access_Decl = (Prog_Access_Decl)theEObject;
        T result = caseProg_Access_Decl(prog_Access_Decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.NAMESPACE_HNAME:
      {
        Namespace_H_Name namespace_H_Name = (Namespace_H_Name)theEObject;
        T result = caseNamespace_H_Name(namespace_H_Name);
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
        if (result == null) result = caseSubscript(expression);
        if (result == null) result = caseConstant_Expr(expression);
        if (result == null) result = caseArray_Elem_Init_Value(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CONSTANT_EXPR:
      {
        Constant_Expr constant_Expr = (Constant_Expr)theEObject;
        T result = caseConstant_Expr(constant_Expr);
        if (result == null) result = caseArray_Elem_Init_Value(constant_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE_ACCESS:
      {
        Variable_Access variable_Access = (Variable_Access)theEObject;
        T result = caseVariable_Access(variable_Access);
        if (result == null) result = caseExpression(variable_Access);
        if (result == null) result = caseSubscript(variable_Access);
        if (result == null) result = caseConstant_Expr(variable_Access);
        if (result == null) result = caseArray_Elem_Init_Value(variable_Access);
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
      case StLanguagePackage.SIZE_INFO:
      {
        Size_Info size_Info = (Size_Info)theEObject;
        T result = caseSize_Info(size_Info);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FUNC_CALL:
      {
        Func_Call func_Call = (Func_Call)theEObject;
        T result = caseFunc_Call(func_Call);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ASSIGN_STMT:
      {
        Assign_Stmt assign_Stmt = (Assign_Stmt)theEObject;
        T result = caseAssign_Stmt(assign_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.VARIABLE_ASSIGN_STMT:
      {
        Variable_Assign_Stmt variable_Assign_Stmt = (Variable_Assign_Stmt)theEObject;
        T result = caseVariable_Assign_Stmt(variable_Assign_Stmt);
        if (result == null) result = caseAssign_Stmt(variable_Assign_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ASSIGNMENT_ATTEMPT:
      {
        Assignment_Attempt assignment_Attempt = (Assignment_Attempt)theEObject;
        T result = caseAssignment_Attempt(assignment_Attempt);
        if (result == null) result = caseAssign_Stmt(assignment_Attempt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.INVOCATION:
      {
        Invocation invocation = (Invocation)theEObject;
        T result = caseInvocation(invocation);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.IF_STMT:
      {
        IF_Stmt iF_Stmt = (IF_Stmt)theEObject;
        T result = caseIF_Stmt(iF_Stmt);
        if (result == null) result = caseSelection_Stmt(iF_Stmt);
        if (result == null) result = caseStmt(iF_Stmt);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.EXIT_STMT:
      {
        Exit_Stmt exit_Stmt = (Exit_Stmt)theEObject;
        T result = caseExit_Stmt(exit_Stmt);
        if (result == null) result = caseIteration_Stmt(exit_Stmt);
        if (result == null) result = caseStmt(exit_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.CONTINUE_STMT:
      {
        Continue_Stmt continue_Stmt = (Continue_Stmt)theEObject;
        T result = caseContinue_Stmt(continue_Stmt);
        if (result == null) result = caseIteration_Stmt(continue_Stmt);
        if (result == null) result = caseStmt(continue_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.FOR_STMT:
      {
        For_Stmt for_Stmt = (For_Stmt)theEObject;
        T result = caseFor_Stmt(for_Stmt);
        if (result == null) result = caseIteration_Stmt(for_Stmt);
        if (result == null) result = caseStmt(for_Stmt);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.REPEAT_STMT:
      {
        Repeat_Stmt repeat_Stmt = (Repeat_Stmt)theEObject;
        T result = caseRepeat_Stmt(repeat_Stmt);
        if (result == null) result = caseIteration_Stmt(repeat_Stmt);
        if (result == null) result = caseStmt(repeat_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.XOR_EXPR:
      {
        Xor_Expr xor_Expr = (Xor_Expr)theEObject;
        T result = caseXor_Expr(xor_Expr);
        if (result == null) result = caseExpression(xor_Expr);
        if (result == null) result = caseSubscript(xor_Expr);
        if (result == null) result = caseConstant_Expr(xor_Expr);
        if (result == null) result = caseArray_Elem_Init_Value(xor_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.AND_EXPR:
      {
        And_Expr and_Expr = (And_Expr)theEObject;
        T result = caseAnd_Expr(and_Expr);
        if (result == null) result = caseExpression(and_Expr);
        if (result == null) result = caseSubscript(and_Expr);
        if (result == null) result = caseConstant_Expr(and_Expr);
        if (result == null) result = caseArray_Elem_Init_Value(and_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.COMPARE_EXPR:
      {
        Compare_Expr compare_Expr = (Compare_Expr)theEObject;
        T result = caseCompare_Expr(compare_Expr);
        if (result == null) result = caseExpression(compare_Expr);
        if (result == null) result = caseSubscript(compare_Expr);
        if (result == null) result = caseConstant_Expr(compare_Expr);
        if (result == null) result = caseArray_Elem_Init_Value(compare_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.EQU_EXPR:
      {
        Equ_Expr equ_Expr = (Equ_Expr)theEObject;
        T result = caseEqu_Expr(equ_Expr);
        if (result == null) result = caseExpression(equ_Expr);
        if (result == null) result = caseSubscript(equ_Expr);
        if (result == null) result = caseConstant_Expr(equ_Expr);
        if (result == null) result = caseArray_Elem_Init_Value(equ_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.ADD_EXPR:
      {
        Add_Expr add_Expr = (Add_Expr)theEObject;
        T result = caseAdd_Expr(add_Expr);
        if (result == null) result = caseExpression(add_Expr);
        if (result == null) result = caseSubscript(add_Expr);
        if (result == null) result = caseConstant_Expr(add_Expr);
        if (result == null) result = caseArray_Elem_Init_Value(add_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = caseExpression(term);
        if (result == null) result = caseSubscript(term);
        if (result == null) result = caseConstant_Expr(term);
        if (result == null) result = caseArray_Elem_Init_Value(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StLanguagePackage.POWER_EXPR:
      {
        Power_Expr power_Expr = (Power_Expr)theEObject;
        T result = casePower_Expr(power_Expr);
        if (result == null) result = caseExpression(power_Expr);
        if (result == null) result = caseSubscript(power_Expr);
        if (result == null) result = caseConstant_Expr(power_Expr);
        if (result == null) result = caseArray_Elem_Init_Value(power_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ST Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ST Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseST_Program(ST_Program object)
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
   * Returns the result of interpreting the object as an instance of '<em>Simple Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimple_Type_Decl(Simple_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subrange Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subrange Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubrange_Type_Decl(Subrange_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum_Type_Decl(Enum_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Type_Decl(Array_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Type_Decl(Struct_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Elem Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Elem Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Elem_Decl(Struct_Elem_Decl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Simple Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimple_Spec(Simple_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subrange Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subrange Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubrange_Spec(Subrange_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Value Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Value Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum_Value_Spec(Enum_Value_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elem Named Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elem Named Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElem_Named_Spec(Elem_Named_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Spec(Array_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Spec(Struct_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimple_Spec_Init(Simple_Spec_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subrange Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subrange Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubrange_Spec_Init(Subrange_Spec_Init object)
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
   * Returns the result of interpreting the object as an instance of '<em>Named Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamed_Spec_Init(Named_Spec_Init object)
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
   * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum_Value(Enum_Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Spec_Init(Array_Spec_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Init(Array_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Elem Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Elem Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Elem_Init(Array_Elem_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Elem Init Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Elem Init Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Elem_Init_Value(Array_Elem_Init_Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Spec_Init(Struct_Spec_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Init(Struct_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Elem Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Elem Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Elem_Init(Struct_Elem_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirect_Variable(Direct_Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Type Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Type Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Type_Decl(Ref_Type_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Spec_Init(Ref_Spec_Init object)
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
   * Returns the result of interpreting the object as an instance of '<em>Ref Addr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Addr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Addr(Ref_Addr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Assign(Ref_Assign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Deref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Deref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Deref(Ref_Deref object)
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
   * Returns the result of interpreting the object as an instance of '<em>Symbolic Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbolic Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolic_Variable(Symbolic_Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar_Access(Var_Access object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Elem Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Elem Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti_Elem_Var(Multi_Elem_Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subscript List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subscript List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubscript_List(Subscript_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subscript</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subscript</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubscript(Subscript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Variable(Struct_Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Elem Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Elem Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Elem_Select(Struct_Elem_Select object)
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
   * Returns the result of interpreting the object as an instance of '<em>Edge Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edge Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEdge_Decl(Edge_Decl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Ref Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef_Var_Decl(Ref_Var_Decl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Array Var Decl Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Var Decl Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Var_Decl_Init(Array_Var_Decl_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Conformand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Conformand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Conformand(Array_Conformand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Conform Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Conform Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Conform_Decl(Array_Conform_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Var Decl Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Var Decl Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Var_Decl_Init(Struct_Var_Decl_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Decl No Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Decl No Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Decl_No_Init(FB_Decl_No_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Decl Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Decl Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFB_Decl_Init(FB_Decl_Init object)
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
   * Returns the result of interpreting the object as an instance of '<em>Array Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_Var_Decl(Array_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct_Var_Decl(Struct_Var_Decl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Retain Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Retain Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRetain_Var_Decls(Retain_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loc Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoc_Var_Decls(Loc_Var_Decls object)
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
   * Returns the result of interpreting the object as an instance of '<em>Loc Partly Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc Partly Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoc_Partly_Var_Decl(Loc_Partly_Var_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loc Partly Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc Partly Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoc_Partly_Var(Loc_Partly_Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar_Spec(Var_Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Var Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Var Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringVar_Spec(StringVar_Spec object)
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
   * Returns the result of interpreting the object as an instance of '<em>Other Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOther_Var_Decls(Other_Var_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Retain Var Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Retain Var Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNo_Retain_Var_Decls(No_Retain_Var_Decls object)
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
   * Returns the result of interpreting the object as an instance of '<em>Interface Spec Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Spec Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_Spec_Init(Interface_Spec_Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_Value(Interface_Value object)
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
   * Returns the result of interpreting the object as an instance of '<em>Prog Access Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prog Access Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProg_Access_Decls(Prog_Access_Decls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prog Access Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prog Access Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProg_Access_Decl(Prog_Access_Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace HName</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace HName</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace_H_Name(Namespace_H_Name object)
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
   * Returns the result of interpreting the object as an instance of '<em>Size Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSize_Info(Size_Info object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunc_Call(Func_Call object)
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
   * Returns the result of interpreting the object as an instance of '<em>Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvocation(Invocation object)
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
