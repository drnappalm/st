/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage
 * @generated
 */
public interface StLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StLanguageFactory eINSTANCE = at.bachmann.plc.st.stLanguage.impl.StLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>ST Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ST Program</em>'.
   * @generated
   */
  ST_Program createST_Program();

  /**
   * Returns a new object of class '<em>Data Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Decl</em>'.
   * @generated
   */
  Data_Type_Decl createData_Type_Decl();

  /**
   * Returns a new object of class '<em>Struct Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Decl</em>'.
   * @generated
   */
  Struct_Decl createStruct_Decl();

  /**
   * Returns a new object of class '<em>Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Decl</em>'.
   * @generated
   */
  Type_Decl createType_Decl();

  /**
   * Returns a new object of class '<em>Simple Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Type Decl</em>'.
   * @generated
   */
  Simple_Type_Decl createSimple_Type_Decl();

  /**
   * Returns a new object of class '<em>Subrange Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subrange Type Decl</em>'.
   * @generated
   */
  Subrange_Type_Decl createSubrange_Type_Decl();

  /**
   * Returns a new object of class '<em>Enum Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type Decl</em>'.
   * @generated
   */
  Enum_Type_Decl createEnum_Type_Decl();

  /**
   * Returns a new object of class '<em>Array Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type Decl</em>'.
   * @generated
   */
  Array_Type_Decl createArray_Type_Decl();

  /**
   * Returns a new object of class '<em>Struct Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Type Decl</em>'.
   * @generated
   */
  Struct_Type_Decl createStruct_Type_Decl();

  /**
   * Returns a new object of class '<em>Struct Elem Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Elem Decl</em>'.
   * @generated
   */
  Struct_Elem_Decl createStruct_Elem_Decl();

  /**
   * Returns a new object of class '<em>Str Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Str Type Decl</em>'.
   * @generated
   */
  Str_Type_Decl createStr_Type_Decl();

  /**
   * Returns a new object of class '<em>Simple Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Spec</em>'.
   * @generated
   */
  Simple_Spec createSimple_Spec();

  /**
   * Returns a new object of class '<em>Subrange Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subrange Spec</em>'.
   * @generated
   */
  Subrange_Spec createSubrange_Spec();

  /**
   * Returns a new object of class '<em>Enum Value Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Value Spec</em>'.
   * @generated
   */
  Enum_Value_Spec createEnum_Value_Spec();

  /**
   * Returns a new object of class '<em>Elem Named Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elem Named Spec</em>'.
   * @generated
   */
  Elem_Named_Spec createElem_Named_Spec();

  /**
   * Returns a new object of class '<em>Array Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Spec</em>'.
   * @generated
   */
  Array_Spec createArray_Spec();

  /**
   * Returns a new object of class '<em>Struct Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Spec</em>'.
   * @generated
   */
  Struct_Spec createStruct_Spec();

  /**
   * Returns a new object of class '<em>Simple Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Spec Init</em>'.
   * @generated
   */
  Simple_Spec_Init createSimple_Spec_Init();

  /**
   * Returns a new object of class '<em>Subrange Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subrange Spec Init</em>'.
   * @generated
   */
  Subrange_Spec_Init createSubrange_Spec_Init();

  /**
   * Returns a new object of class '<em>Subrange</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subrange</em>'.
   * @generated
   */
  Subrange createSubrange();

  /**
   * Returns a new object of class '<em>Named Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Spec Init</em>'.
   * @generated
   */
  Named_Spec_Init createNamed_Spec_Init();

  /**
   * Returns a new object of class '<em>Enum Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Spec Init</em>'.
   * @generated
   */
  Enum_Spec_Init createEnum_Spec_Init();

  /**
   * Returns a new object of class '<em>Enum Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Value</em>'.
   * @generated
   */
  Enum_Value createEnum_Value();

  /**
   * Returns a new object of class '<em>Array Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Spec Init</em>'.
   * @generated
   */
  Array_Spec_Init createArray_Spec_Init();

  /**
   * Returns a new object of class '<em>Array Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Init</em>'.
   * @generated
   */
  Array_Init createArray_Init();

  /**
   * Returns a new object of class '<em>Array Elem Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Elem Init</em>'.
   * @generated
   */
  Array_Elem_Init createArray_Elem_Init();

  /**
   * Returns a new object of class '<em>Array Elem Init Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Elem Init Value</em>'.
   * @generated
   */
  Array_Elem_Init_Value createArray_Elem_Init_Value();

  /**
   * Returns a new object of class '<em>Struct Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Spec Init</em>'.
   * @generated
   */
  Struct_Spec_Init createStruct_Spec_Init();

  /**
   * Returns a new object of class '<em>Struct Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Init</em>'.
   * @generated
   */
  Struct_Init createStruct_Init();

  /**
   * Returns a new object of class '<em>Struct Elem Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Elem Init</em>'.
   * @generated
   */
  Struct_Elem_Init createStruct_Elem_Init();

  /**
   * Returns a new object of class '<em>Direct Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Variable</em>'.
   * @generated
   */
  Direct_Variable createDirect_Variable();

  /**
   * Returns a new object of class '<em>Ref Type Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Type Decl</em>'.
   * @generated
   */
  Ref_Type_Decl createRef_Type_Decl();

  /**
   * Returns a new object of class '<em>Ref Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Spec Init</em>'.
   * @generated
   */
  Ref_Spec_Init createRef_Spec_Init();

  /**
   * Returns a new object of class '<em>Ref Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Spec</em>'.
   * @generated
   */
  Ref_Spec createRef_Spec();

  /**
   * Returns a new object of class '<em>Ref Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Value</em>'.
   * @generated
   */
  Ref_Value createRef_Value();

  /**
   * Returns a new object of class '<em>Ref Addr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Addr</em>'.
   * @generated
   */
  Ref_Addr createRef_Addr();

  /**
   * Returns a new object of class '<em>Ref Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Assign</em>'.
   * @generated
   */
  Ref_Assign createRef_Assign();

  /**
   * Returns a new object of class '<em>Ref Deref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Deref</em>'.
   * @generated
   */
  Ref_Deref createRef_Deref();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Symbolic Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbolic Variable</em>'.
   * @generated
   */
  Symbolic_Variable createSymbolic_Variable();

  /**
   * Returns a new object of class '<em>Var Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Access</em>'.
   * @generated
   */
  Var_Access createVar_Access();

  /**
   * Returns a new object of class '<em>Multi Elem Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Elem Var</em>'.
   * @generated
   */
  Multi_Elem_Var createMulti_Elem_Var();

  /**
   * Returns a new object of class '<em>Subscript List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subscript List</em>'.
   * @generated
   */
  Subscript_List createSubscript_List();

  /**
   * Returns a new object of class '<em>Subscript</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subscript</em>'.
   * @generated
   */
  Subscript createSubscript();

  /**
   * Returns a new object of class '<em>Struct Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Variable</em>'.
   * @generated
   */
  Struct_Variable createStruct_Variable();

  /**
   * Returns a new object of class '<em>Struct Elem Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Elem Select</em>'.
   * @generated
   */
  Struct_Elem_Select createStruct_Elem_Select();

  /**
   * Returns a new object of class '<em>Input Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Decls</em>'.
   * @generated
   */
  Input_Decls createInput_Decls();

  /**
   * Returns a new object of class '<em>Input Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Decl</em>'.
   * @generated
   */
  Input_Decl createInput_Decl();

  /**
   * Returns a new object of class '<em>Edge Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edge Decl</em>'.
   * @generated
   */
  Edge_Decl createEdge_Decl();

  /**
   * Returns a new object of class '<em>Var Decl Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl Init</em>'.
   * @generated
   */
  Var_Decl_Init createVar_Decl_Init();

  /**
   * Returns a new object of class '<em>Ref Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Var Decl</em>'.
   * @generated
   */
  Ref_Var_Decl createRef_Var_Decl();

  /**
   * Returns a new object of class '<em>Interface Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Var Decl</em>'.
   * @generated
   */
  Interface_Var_Decl createInterface_Var_Decl();

  /**
   * Returns a new object of class '<em>Variable List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable List</em>'.
   * @generated
   */
  Variable_List createVariable_List();

  /**
   * Returns a new object of class '<em>Array Var Decl Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Var Decl Init</em>'.
   * @generated
   */
  Array_Var_Decl_Init createArray_Var_Decl_Init();

  /**
   * Returns a new object of class '<em>Array Conformand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Conformand</em>'.
   * @generated
   */
  Array_Conformand createArray_Conformand();

  /**
   * Returns a new object of class '<em>Array Conform Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Conform Decl</em>'.
   * @generated
   */
  Array_Conform_Decl createArray_Conform_Decl();

  /**
   * Returns a new object of class '<em>Struct Var Decl Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Var Decl Init</em>'.
   * @generated
   */
  Struct_Var_Decl_Init createStruct_Var_Decl_Init();

  /**
   * Returns a new object of class '<em>FB Decl No Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Decl No Init</em>'.
   * @generated
   */
  FB_Decl_No_Init createFB_Decl_No_Init();

  /**
   * Returns a new object of class '<em>FB Decl Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Decl Init</em>'.
   * @generated
   */
  FB_Decl_Init createFB_Decl_Init();

  /**
   * Returns a new object of class '<em>Output Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Decls</em>'.
   * @generated
   */
  Output_Decls createOutput_Decls();

  /**
   * Returns a new object of class '<em>Output Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Decl</em>'.
   * @generated
   */
  Output_Decl createOutput_Decl();

  /**
   * Returns a new object of class '<em>In Out Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out Decls</em>'.
   * @generated
   */
  In_Out_Decls createIn_Out_Decls();

  /**
   * Returns a new object of class '<em>In Out Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out Var Decl</em>'.
   * @generated
   */
  In_Out_Var_Decl createIn_Out_Var_Decl();

  /**
   * Returns a new object of class '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl</em>'.
   * @generated
   */
  Var_Decl createVar_Decl();

  /**
   * Returns a new object of class '<em>Array Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Var Decl</em>'.
   * @generated
   */
  Array_Var_Decl createArray_Var_Decl();

  /**
   * Returns a new object of class '<em>Struct Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Var Decl</em>'.
   * @generated
   */
  Struct_Var_Decl createStruct_Var_Decl();

  /**
   * Returns a new object of class '<em>Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decls</em>'.
   * @generated
   */
  Var_Decls createVar_Decls();

  /**
   * Returns a new object of class '<em>Retain Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Retain Var Decls</em>'.
   * @generated
   */
  Retain_Var_Decls createRetain_Var_Decls();

  /**
   * Returns a new object of class '<em>Loc Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loc Var Decls</em>'.
   * @generated
   */
  Loc_Var_Decls createLoc_Var_Decls();

  /**
   * Returns a new object of class '<em>Loc Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loc Var Decl</em>'.
   * @generated
   */
  Loc_Var_Decl createLoc_Var_Decl();

  /**
   * Returns a new object of class '<em>Temp Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temp Var Decls</em>'.
   * @generated
   */
  Temp_Var_Decls createTemp_Var_Decls();

  /**
   * Returns a new object of class '<em>External Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Var Decls</em>'.
   * @generated
   */
  External_Var_Decls createExternal_Var_Decls();

  /**
   * Returns a new object of class '<em>External Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Decl</em>'.
   * @generated
   */
  External_Decl createExternal_Decl();

  /**
   * Returns a new object of class '<em>Global Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Var Decls</em>'.
   * @generated
   */
  Global_Var_Decls createGlobal_Var_Decls();

  /**
   * Returns a new object of class '<em>Global Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Var Decl</em>'.
   * @generated
   */
  Global_Var_Decl createGlobal_Var_Decl();

  /**
   * Returns a new object of class '<em>Global Var Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Var Spec</em>'.
   * @generated
   */
  Global_Var_Spec createGlobal_Var_Spec();

  /**
   * Returns a new object of class '<em>Loc Var Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loc Var Spec Init</em>'.
   * @generated
   */
  Loc_Var_Spec_Init createLoc_Var_Spec_Init();

  /**
   * Returns a new object of class '<em>Located At</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Located At</em>'.
   * @generated
   */
  Located_At createLocated_At();

  /**
   * Returns a new object of class '<em>Str Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Str Var Decl</em>'.
   * @generated
   */
  Str_Var_Decl createStr_Var_Decl();

  /**
   * Returns a new object of class '<em>SByte Str Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SByte Str Var Decl</em>'.
   * @generated
   */
  S_Byte_Str_Var_Decl createS_Byte_Str_Var_Decl();

  /**
   * Returns a new object of class '<em>SByte Str Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SByte Str Spec</em>'.
   * @generated
   */
  S_Byte_Str_Spec createS_Byte_Str_Spec();

  /**
   * Returns a new object of class '<em>DByte Str Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DByte Str Var Decl</em>'.
   * @generated
   */
  D_Byte_Str_Var_Decl createD_Byte_Str_Var_Decl();

  /**
   * Returns a new object of class '<em>DByte Str Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DByte Str Spec</em>'.
   * @generated
   */
  D_Byte_Str_Spec createD_Byte_Str_Spec();

  /**
   * Returns a new object of class '<em>Loc Partly Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loc Partly Var Decl</em>'.
   * @generated
   */
  Loc_Partly_Var_Decl createLoc_Partly_Var_Decl();

  /**
   * Returns a new object of class '<em>Loc Partly Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loc Partly Var</em>'.
   * @generated
   */
  Loc_Partly_Var createLoc_Partly_Var();

  /**
   * Returns a new object of class '<em>Var Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Spec</em>'.
   * @generated
   */
  Var_Spec createVar_Spec();

  /**
   * Returns a new object of class '<em>String Var Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Var Spec</em>'.
   * @generated
   */
  StringVar_Spec createStringVar_Spec();

  /**
   * Returns a new object of class '<em>Func Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Decl</em>'.
   * @generated
   */
  Func_Decl createFunc_Decl();

  /**
   * Returns a new object of class '<em>IO Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IO Var Decls</em>'.
   * @generated
   */
  IO_Var_Decls createIO_Var_Decls();

  /**
   * Returns a new object of class '<em>Func Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Var Decls</em>'.
   * @generated
   */
  Func_Var_Decls createFunc_Var_Decls();

  /**
   * Returns a new object of class '<em>Func Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Body</em>'.
   * @generated
   */
  Func_Body createFunc_Body();

  /**
   * Returns a new object of class '<em>FB Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Decl</em>'.
   * @generated
   */
  FB_Decl createFB_Decl();

  /**
   * Returns a new object of class '<em>FB IO Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB IO Var Decls</em>'.
   * @generated
   */
  FB_IO_Var_Decls createFB_IO_Var_Decls();

  /**
   * Returns a new object of class '<em>FB Input Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Input Decls</em>'.
   * @generated
   */
  FB_Input_Decls createFB_Input_Decls();

  /**
   * Returns a new object of class '<em>FB Input Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Input Decl</em>'.
   * @generated
   */
  FB_Input_Decl createFB_Input_Decl();

  /**
   * Returns a new object of class '<em>FB Output Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Output Decls</em>'.
   * @generated
   */
  FB_Output_Decls createFB_Output_Decls();

  /**
   * Returns a new object of class '<em>FB Output Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Output Decl</em>'.
   * @generated
   */
  FB_Output_Decl createFB_Output_Decl();

  /**
   * Returns a new object of class '<em>Other Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Var Decls</em>'.
   * @generated
   */
  Other_Var_Decls createOther_Var_Decls();

  /**
   * Returns a new object of class '<em>No Retain Var Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Retain Var Decls</em>'.
   * @generated
   */
  No_Retain_Var_Decls createNo_Retain_Var_Decls();

  /**
   * Returns a new object of class '<em>FB Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FB Body</em>'.
   * @generated
   */
  FB_Body createFB_Body();

  /**
   * Returns a new object of class '<em>Method Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Decl</em>'.
   * @generated
   */
  Method_Decl createMethod_Decl();

  /**
   * Returns a new object of class '<em>Class Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Decl</em>'.
   * @generated
   */
  Class_Decl createClass_Decl();

  /**
   * Returns a new object of class '<em>Interface Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Decl</em>'.
   * @generated
   */
  Interface_Decl createInterface_Decl();

  /**
   * Returns a new object of class '<em>Method Prototype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Prototype</em>'.
   * @generated
   */
  Method_Prototype createMethod_Prototype();

  /**
   * Returns a new object of class '<em>Interface Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Spec Init</em>'.
   * @generated
   */
  Interface_Spec_Init createInterface_Spec_Init();

  /**
   * Returns a new object of class '<em>Interface Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Value</em>'.
   * @generated
   */
  Interface_Value createInterface_Value();

  /**
   * Returns a new object of class '<em>Interface Name List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Name List</em>'.
   * @generated
   */
  Interface_Name_List createInterface_Name_List();

  /**
   * Returns a new object of class '<em>Prog Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prog Decl</em>'.
   * @generated
   */
  Prog_Decl createProg_Decl();

  /**
   * Returns a new object of class '<em>Prog Access Decls</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prog Access Decls</em>'.
   * @generated
   */
  Prog_Access_Decls createProg_Access_Decls();

  /**
   * Returns a new object of class '<em>Prog Access Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prog Access Decl</em>'.
   * @generated
   */
  Prog_Access_Decl createProg_Access_Decl();

  /**
   * Returns a new object of class '<em>Namespace HName</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace HName</em>'.
   * @generated
   */
  Namespace_H_Name createNamespace_H_Name();

  /**
   * Returns a new object of class '<em>Using Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using Directive</em>'.
   * @generated
   */
  Using_Directive createUsing_Directive();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Constant Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expr</em>'.
   * @generated
   */
  Constant_Expr createConstant_Expr();

  /**
   * Returns a new object of class '<em>Variable Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Access</em>'.
   * @generated
   */
  Variable_Access createVariable_Access();

  /**
   * Returns a new object of class '<em>Multibit Part Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multibit Part Access</em>'.
   * @generated
   */
  Multibit_Part_Access createMultibit_Part_Access();

  /**
   * Returns a new object of class '<em>Size Info</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size Info</em>'.
   * @generated
   */
  Size_Info createSize_Info();

  /**
   * Returns a new object of class '<em>Func Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Call</em>'.
   * @generated
   */
  Func_Call createFunc_Call();

  /**
   * Returns a new object of class '<em>Stmt List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmt List</em>'.
   * @generated
   */
  Stmt_List createStmt_List();

  /**
   * Returns a new object of class '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmt</em>'.
   * @generated
   */
  Stmt createStmt();

  /**
   * Returns a new object of class '<em>Assign Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Stmt</em>'.
   * @generated
   */
  Assign_Stmt createAssign_Stmt();

  /**
   * Returns a new object of class '<em>Variable Assign Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assign Stmt</em>'.
   * @generated
   */
  Variable_Assign_Stmt createVariable_Assign_Stmt();

  /**
   * Returns a new object of class '<em>Assignment Attempt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Attempt</em>'.
   * @generated
   */
  Assignment_Attempt createAssignment_Attempt();

  /**
   * Returns a new object of class '<em>Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invocation</em>'.
   * @generated
   */
  Invocation createInvocation();

  /**
   * Returns a new object of class '<em>Param Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Assign</em>'.
   * @generated
   */
  Param_Assign createParam_Assign();

  /**
   * Returns a new object of class '<em>Named Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Value</em>'.
   * @generated
   */
  Named_Value createNamed_Value();

  /**
   * Returns a new object of class '<em>Linked Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Linked Value</em>'.
   * @generated
   */
  Linked_Value createLinked_Value();

  /**
   * Returns a new object of class '<em>Selection Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Stmt</em>'.
   * @generated
   */
  Selection_Stmt createSelection_Stmt();

  /**
   * Returns a new object of class '<em>IF Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IF Stmt</em>'.
   * @generated
   */
  IF_Stmt createIF_Stmt();

  /**
   * Returns a new object of class '<em>ELSEIF Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ELSEIF Stmt</em>'.
   * @generated
   */
  ELSEIF_Stmt createELSEIF_Stmt();

  /**
   * Returns a new object of class '<em>ELSE Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ELSE Stmt</em>'.
   * @generated
   */
  ELSE_Stmt createELSE_Stmt();

  /**
   * Returns a new object of class '<em>Case Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Stmt</em>'.
   * @generated
   */
  Case_Stmt createCase_Stmt();

  /**
   * Returns a new object of class '<em>Case Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Selection</em>'.
   * @generated
   */
  Case_Selection createCase_Selection();

  /**
   * Returns a new object of class '<em>Case List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case List</em>'.
   * @generated
   */
  Case_List createCase_List();

  /**
   * Returns a new object of class '<em>Case List Elem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case List Elem</em>'.
   * @generated
   */
  Case_List_Elem createCase_List_Elem();

  /**
   * Returns a new object of class '<em>Iteration Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration Stmt</em>'.
   * @generated
   */
  Iteration_Stmt createIteration_Stmt();

  /**
   * Returns a new object of class '<em>Exit Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Stmt</em>'.
   * @generated
   */
  Exit_Stmt createExit_Stmt();

  /**
   * Returns a new object of class '<em>Continue Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continue Stmt</em>'.
   * @generated
   */
  Continue_Stmt createContinue_Stmt();

  /**
   * Returns a new object of class '<em>For Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Stmt</em>'.
   * @generated
   */
  For_Stmt createFor_Stmt();

  /**
   * Returns a new object of class '<em>For List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For List</em>'.
   * @generated
   */
  For_List createFor_List();

  /**
   * Returns a new object of class '<em>While Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Stmt</em>'.
   * @generated
   */
  While_Stmt createWhile_Stmt();

  /**
   * Returns a new object of class '<em>Repeat Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat Stmt</em>'.
   * @generated
   */
  Repeat_Stmt createRepeat_Stmt();

  /**
   * Returns a new object of class '<em>Xor Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xor Expr</em>'.
   * @generated
   */
  Xor_Expr createXor_Expr();

  /**
   * Returns a new object of class '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expr</em>'.
   * @generated
   */
  And_Expr createAnd_Expr();

  /**
   * Returns a new object of class '<em>Compare Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare Expr</em>'.
   * @generated
   */
  Compare_Expr createCompare_Expr();

  /**
   * Returns a new object of class '<em>Equ Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equ Expr</em>'.
   * @generated
   */
  Equ_Expr createEqu_Expr();

  /**
   * Returns a new object of class '<em>Add Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Expr</em>'.
   * @generated
   */
  Add_Expr createAdd_Expr();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Power Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Power Expr</em>'.
   * @generated
   */
  Power_Expr createPower_Expr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StLanguagePackage getStLanguagePackage();

} //StLanguageFactory
