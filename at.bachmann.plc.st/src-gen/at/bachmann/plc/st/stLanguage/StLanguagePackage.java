/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface StLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bachmann.at/plc/st/STLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StLanguagePackage eINSTANCE = at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.STImpl <em>ST</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.STImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getST()
   * @generated
   */
  int ST = 0;

  /**
   * The number of structural features of the '<em>ST</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.POU_DeclImpl <em>POU Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.POU_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getPOU_Decl()
   * @generated
   */
  int POU_DECL = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POU_DECL__USINGS = ST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pous</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POU_DECL__POUS = ST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>POU Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POU_DECL_FEATURE_COUNT = ST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl <em>Case List Elem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List_Elem()
   * @generated
   */
  int CASE_LIST_ELEM = 111;

  /**
   * The number of structural features of the '<em>Case List Elem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST_ELEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl <em>Constant Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant_Expr()
   * @generated
   */
  int CONSTANT_EXPR = 91;

  /**
   * The number of structural features of the '<em>Constant Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPR_FEATURE_COUNT = CASE_LIST_ELEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ExpressionImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 90;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = CONSTANT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR = CONSTANT_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = CONSTANT_EXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = CONSTANT_EXPR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = CONSTANT_EXPR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ConstantImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNumeric_Literal()
   * @generated
   */
  int NUMERIC_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__LEFT = CONSTANT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__OPERATOR = CONSTANT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__RIGHT = CONSTANT__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__EXPRESSION = CONSTANT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInt_Literal()
   * @generated
   */
  int INT_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__LEFT = NUMERIC_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__OPERATOR = NUMERIC_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__RIGHT = NUMERIC_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__EXPRESSION = NUMERIC_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = NUMERIC_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl <em>Unsigned Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUnsigned_Int()
   * @generated
   */
  int UNSIGNED_INT = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT__LEFT = INT_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT__OPERATOR = INT_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT__RIGHT = INT_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT__EXPRESSION = INT_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT__VALUE = INT_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Unsigned Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_INT_FEATURE_COUNT = INT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl <em>Signed Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSigned_Int()
   * @generated
   */
  int SIGNED_INT = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__LEFT = INT_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__OPERATOR = INT_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__RIGHT = INT_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__EXPRESSION = INT_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__VALUE = INT_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Signed Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT_FEATURE_COUNT = INT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getReal_Literal()
   * @generated
   */
  int REAL_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__LEFT = NUMERIC_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__OPERATOR = NUMERIC_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__RIGHT = NUMERIC_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__EXPRESSION = NUMERIC_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VALUE = NUMERIC_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl <em>Bit Str Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBit_Str_Literal()
   * @generated
   */
  int BIT_STR_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL__LEFT = CONSTANT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL__OPERATOR = CONSTANT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL__RIGHT = CONSTANT__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL__EXPRESSION = CONSTANT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Bit Str Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STR_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl <em>Bool Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBool_Literal()
   * @generated
   */
  int BOOL_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__LEFT = CONSTANT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__OPERATOR = CONSTANT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__RIGHT = CONSTANT__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__EXPRESSION = CONSTANT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Bool Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl <em>Char Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getChar_Literal()
   * @generated
   */
  int CHAR_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__LEFT = CONSTANT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__OPERATOR = CONSTANT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__RIGHT = CONSTANT__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__EXPRESSION = CONSTANT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Char Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl <em>Time Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Literal()
   * @generated
   */
  int TIME_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__LEFT = CONSTANT__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__OPERATOR = CONSTANT__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__RIGHT = CONSTANT__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__EXPRESSION = CONSTANT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__VALUE = CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Time Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.DurationImpl <em>Duration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.DurationImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDuration()
   * @generated
   */
  int DURATION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__LEFT = TIME_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__OPERATOR = TIME_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__RIGHT = TIME_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__EXPRESSION = TIME_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Duration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl <em>Time Of Day</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Of_Day()
   * @generated
   */
  int TIME_OF_DAY = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__LEFT = TIME_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__OPERATOR = TIME_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__RIGHT = TIME_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__EXPRESSION = TIME_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Time Of Day</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.DaytimeImpl <em>Daytime</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.DaytimeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDaytime()
   * @generated
   */
  int DAYTIME = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAYTIME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Daytime</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAYTIME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.DateImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate()
   * @generated
   */
  int DATE = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__LEFT = TIME_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__OPERATOR = TIME_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__RIGHT = TIME_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__EXPRESSION = TIME_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl <em>Date And Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate_And_Time()
   * @generated
   */
  int DATE_AND_TIME = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME__LEFT = TIME_LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME__OPERATOR = TIME_LITERAL__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME__RIGHT = TIME_LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME__EXPRESSION = TIME_LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME__VALUE = TIME_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Date And Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_AND_TIME_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Namespace_ElementsImpl <em>Namespace Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Namespace_ElementsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace_Elements()
   * @generated
   */
  int NAMESPACE_ELEMENTS = 88;

  /**
   * The number of structural features of the '<em>Namespace Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl <em>Data Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getData_Type_Decl()
   * @generated
   */
  int DATA_TYPE_DECL = 17;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL__TYPES = NAMESPACE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL_FEATURE_COUNT = NAMESPACE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl <em>Struct Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Decl()
   * @generated
   */
  int STRUCT_DECL = 18;

  /**
   * The feature id for the '<em><b>Overlap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECL__OVERLAP = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Struct Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getType_Decl()
   * @generated
   */
  int TYPE_DECL = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__INITIALIZATION = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__LOCATION = 2;

  /**
   * The feature id for the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__ACCESS = 3;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl <em>Str Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Type_Decl()
   * @generated
   */
  int STR_TYPE_DECL = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL__INITIALIZATION = 1;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL__INITIAL_VALUE = 2;

  /**
   * The number of structural features of the '<em>Str Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_TYPE_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl <em>Loc Var Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Spec_Init()
   * @generated
   */
  int LOC_VAR_SPEC_INIT = 56;

  /**
   * The number of structural features of the '<em>Loc Var Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_SPEC_INIT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Spec_InitImpl <em>Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSpec_Init()
   * @generated
   */
  int SPEC_INIT = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_INIT__TYPE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_INIT__INITIAL_VALUE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_INIT__RANGE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_INIT__VARIABLE = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_INIT_FEATURE_COUNT = LOC_VAR_SPEC_INIT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.SubrangeImpl <em>Subrange</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.SubrangeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange()
   * @generated
   */
  int SUBRANGE = 22;

  /**
   * The feature id for the '<em><b>Low Bound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__LOW_BOUND = CASE_LIST_ELEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Up Bound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__UP_BOUND = CASE_LIST_ELEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subrange</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_FEATURE_COUNT = CASE_LIST_ELEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl <em>Enum Spec Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Spec_Init()
   * @generated
   */
  int ENUM_SPEC_INIT = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPEC_INIT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPEC_INIT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Spec Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPEC_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl <em>Enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Value()
   * @generated
   */
  int ENUM_VALUE = 24;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>Enum Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl <em>Variable Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Address()
   * @generated
   */
  int VARIABLE_ADDRESS = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ADDRESS__TYPE = 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ADDRESS__SIZE = 1;

  /**
   * The feature id for the '<em><b>Bit Indexes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ADDRESS__BIT_INDEXES = 2;

  /**
   * The feature id for the '<em><b>Bit Index</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ADDRESS__BIT_INDEX = 3;

  /**
   * The number of structural features of the '<em>Variable Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ADDRESS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl <em>Ref Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Spec()
   * @generated
   */
  int REF_SPEC = 27;

  /**
   * The feature id for the '<em><b>Ref Tos</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC__REF_TOS = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC__REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Ref Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl <em>Ref Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Value()
   * @generated
   */
  int REF_VALUE = 28;

  /**
   * The number of structural features of the '<em>Ref Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Null_RefImpl <em>Null Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Null_RefImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNull_Ref()
   * @generated
   */
  int NULL_REF = 29;

  /**
   * The number of structural features of the '<em>Null Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_REF_FEATURE_COUNT = REF_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl <em>Ref Addr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Addr()
   * @generated
   */
  int REF_ADDR = 30;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ADDR__VARIABLE = REF_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Addr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ADDR_FEATURE_COUNT = REF_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl <em>Ref Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Assign()
   * @generated
   */
  int REF_ASSIGN = 31;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ASSIGN__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ASSIGN__VALUE = 1;

  /**
   * The number of structural features of the '<em>Ref Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ASSIGN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Inline_VariableImpl <em>Inline Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Inline_VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInline_Variable()
   * @generated
   */
  int INLINE_VARIABLE = 33;

  /**
   * The number of structural features of the '<em>Inline Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_VARIABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl <em>Symbolic Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSymbolic_Variable()
   * @generated
   */
  int SYMBOLIC_VARIABLE = 34;

  /**
   * The number of structural features of the '<em>Symbolic Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC_VARIABLE_FEATURE_COUNT = INLINE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl <em>Var Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Access()
   * @generated
   */
  int VAR_ACCESS = 35;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ACCESS__VARIABLE = SYMBOLIC_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ACCESS_FEATURE_COUNT = SYMBOLIC_VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl <em>Ref Deref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Deref()
   * @generated
   */
  int REF_DEREF = 32;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_DEREF__VARIABLE = VAR_ACCESS__VARIABLE;

  /**
   * The number of structural features of the '<em>Ref Deref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_DEREF_FEATURE_COUNT = VAR_ACCESS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_VariableImpl <em>Named Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Named_VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Variable()
   * @generated
   */
  int NAMED_VARIABLE = 36;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VARIABLE__VARIABLE = VAR_ACCESS__VARIABLE;

  /**
   * The number of structural features of the '<em>Named Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VARIABLE_FEATURE_COUNT = VAR_ACCESS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl <em>Direct Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDirect_Variable()
   * @generated
   */
  int DIRECT_VARIABLE = 37;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_VARIABLE__VARIABLE = INLINE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Direct Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_VARIABLE_FEATURE_COUNT = INLINE_VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl <em>IO Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIO_Var_Decls()
   * @generated
   */
  int IO_VAR_DECLS = 65;

  /**
   * The number of structural features of the '<em>IO Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_VAR_DECLS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl <em>Input Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decls()
   * @generated
   */
  int INPUT_DECLS = 38;

  /**
   * The feature id for the '<em><b>Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECLS__RETAIN = IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Non Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECLS__NON_RETAIN = IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECLS__DECLARATIONS = IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Input Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECLS_FEATURE_COUNT = IO_VAR_DECLS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl <em>Input Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decl()
   * @generated
   */
  int INPUT_DECL = 39;

  /**
   * The number of structural features of the '<em>Input Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl <em>Var Decl Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl_Init()
   * @generated
   */
  int VAR_DECL_INIT = 40;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_INIT__VARIABLES = INPUT_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_INIT__INITIALIZATION = INPUT_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Decl Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_INIT_FEATURE_COUNT = INPUT_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl <em>Interface Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Var_Decl()
   * @generated
   */
  int INTERFACE_VAR_DECL = 41;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VAR_DECL__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VAR_DECL__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Interface Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl <em>Variable List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_List()
   * @generated
   */
  int VARIABLE_LIST = 42;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Variable List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl <em>Output Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decls()
   * @generated
   */
  int OUTPUT_DECLS = 43;

  /**
   * The feature id for the '<em><b>Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECLS__RETAIN = IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Non Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECLS__NON_RETAIN = IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECLS__DECLARATIONS = IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Output Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECLS_FEATURE_COUNT = IO_VAR_DECLS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl <em>Output Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decl()
   * @generated
   */
  int OUTPUT_DECL = 44;

  /**
   * The number of structural features of the '<em>Output Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl <em>In Out Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Decls()
   * @generated
   */
  int IN_OUT_DECLS = 45;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_DECLS__DECLARATIONS = IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Out Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_DECLS_FEATURE_COUNT = IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl <em>In Out Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Var_Decl()
   * @generated
   */
  int IN_OUT_VAR_DECL = 46;

  /**
   * The number of structural features of the '<em>In Out Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_VAR_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl()
   * @generated
   */
  int VAR_DECL = 47;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VARIABLES = IN_OUT_VAR_DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__INITIALIZATION = IN_OUT_VAR_DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = IN_OUT_VAR_DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl <em>Func Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Var_Decls()
   * @generated
   */
  int FUNC_VAR_DECLS = 66;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_VAR_DECLS__CONSTANT = 0;

  /**
   * The number of structural features of the '<em>Func Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_VAR_DECLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl <em>Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decls()
   * @generated
   */
  int VAR_DECLS = 48;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__CONSTANT = FUNC_VAR_DECLS__CONSTANT;

  /**
   * The feature id for the '<em><b>Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__RETAIN = FUNC_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Non Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__NON_RETAIN = FUNC_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__ACCESS = FUNC_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS__DECLARATIONS = FUNC_VAR_DECLS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLS_FEATURE_COUNT = FUNC_VAR_DECLS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl <em>Loc Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Decl()
   * @generated
   */
  int LOC_VAR_DECL = 49;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL__INITIALIZATION = 2;

  /**
   * The number of structural features of the '<em>Loc Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_VAR_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl <em>Temp Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTemp_Var_Decls()
   * @generated
   */
  int TEMP_VAR_DECLS = 50;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMP_VAR_DECLS__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Temp Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMP_VAR_DECLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl <em>External Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Var_Decls()
   * @generated
   */
  int EXTERNAL_VAR_DECLS = 51;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VAR_DECLS__CONSTANT = FUNC_VAR_DECLS__CONSTANT;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VAR_DECLS__DECLARATIONS = FUNC_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_VAR_DECLS_FEATURE_COUNT = FUNC_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.External_DeclImpl <em>External Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.External_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Decl()
   * @generated
   */
  int EXTERNAL_DECL = 52;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECL__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>External Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl <em>Global Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decls()
   * @generated
   */
  int GLOBAL_VAR_DECLS = 53;

  /**
   * The feature id for the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLS__CONSTANT = 0;

  /**
   * The feature id for the '<em><b>Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLS__RETAIN = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLS__DECLARATIONS = 2;

  /**
   * The number of structural features of the '<em>Global Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl <em>Global Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decl()
   * @generated
   */
  int GLOBAL_VAR_DECL = 54;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECL__INITIALIZATION = 1;

  /**
   * The number of structural features of the '<em>Global Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl <em>Global Var Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Spec()
   * @generated
   */
  int GLOBAL_VAR_SPEC = 55;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_SPEC__NAMES = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_SPEC__LOCATION = 1;

  /**
   * The number of structural features of the '<em>Global Var Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Located_AtImpl <em>Located At</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Located_AtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLocated_At()
   * @generated
   */
  int LOCATED_AT = 57;

  /**
   * The number of structural features of the '<em>Located At</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATED_AT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl <em>Str Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Var_Decl()
   * @generated
   */
  int STR_VAR_DECL = 58;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_VAR_DECL__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Str Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_VAR_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl <em>SByte Str Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Var_Decl()
   * @generated
   */
  int SBYTE_STR_VAR_DECL = 59;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_VAR_DECL__VARIABLES = STR_VAR_DECL__VARIABLES;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_VAR_DECL__INITIALIZATION = STR_VAR_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SByte Str Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_VAR_DECL_FEATURE_COUNT = STR_VAR_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl <em>SByte Str Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Spec()
   * @generated
   */
  int SBYTE_STR_SPEC = 60;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_SPEC__BOUND = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_SPEC__INITIAL_VALUE = 1;

  /**
   * The number of structural features of the '<em>SByte Str Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBYTE_STR_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl <em>DByte Str Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Var_Decl()
   * @generated
   */
  int DBYTE_STR_VAR_DECL = 61;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_VAR_DECL__VARIABLES = STR_VAR_DECL__VARIABLES;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_VAR_DECL__INITIALIZATION = STR_VAR_DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DByte Str Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_VAR_DECL_FEATURE_COUNT = STR_VAR_DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl <em>DByte Str Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Spec()
   * @generated
   */
  int DBYTE_STR_SPEC = 62;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_SPEC__BOUND = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_SPEC__INITIAL_VALUE = 1;

  /**
   * The number of structural features of the '<em>DByte Str Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DBYTE_STR_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl <em>Func Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Decl()
   * @generated
   */
  int FUNC_DECL = 63;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__NAME = NAMESPACE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__RETURN_TYPE = NAMESPACE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__USINGS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__IOS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__VARIABLES = NAMESPACE_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Temps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__TEMPS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL__BODY = NAMESPACE_ELEMENTS_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Func Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_DECL_FEATURE_COUNT = NAMESPACE_ELEMENTS_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FunctionImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl <em>Func Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Body()
   * @generated
   */
  int FUNC_BODY = 67;

  /**
   * The number of structural features of the '<em>Func Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl <em>FB Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl()
   * @generated
   */
  int FB_DECL = 68;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__MODIFIER = NAMESPACE_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__NAME = NAMESPACE_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__USINGS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__EXTENDS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__IMPLEMENTS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__IOS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__VARIABLES = NAMESPACE_ELEMENTS_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Temps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__TEMPS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__METHODS = NAMESPACE_ELEMENTS_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL__BODY = NAMESPACE_ELEMENTS_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>FB Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_DECL_FEATURE_COUNT = NAMESPACE_ELEMENTS_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FunctionBlockImpl <em>Function Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FunctionBlockImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunctionBlock()
   * @generated
   */
  int FUNCTION_BLOCK = 69;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK__NAME = 0;

  /**
   * The number of structural features of the '<em>Function Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl <em>FB IO Var Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_IO_Var_Decls()
   * @generated
   */
  int FB_IO_VAR_DECLS = 70;

  /**
   * The number of structural features of the '<em>FB IO Var Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_IO_VAR_DECLS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl <em>FB Input Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decls()
   * @generated
   */
  int FB_INPUT_DECLS = 71;

  /**
   * The feature id for the '<em><b>Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECLS__RETAIN = FB_IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Non Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECLS__NON_RETAIN = FB_IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECLS__VARIABLES = FB_IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>FB Input Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECLS_FEATURE_COUNT = FB_IO_VAR_DECLS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl <em>FB Input Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decl()
   * @generated
   */
  int FB_INPUT_DECL = 72;

  /**
   * The number of structural features of the '<em>FB Input Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_INPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl <em>FB Output Decls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decls()
   * @generated
   */
  int FB_OUTPUT_DECLS = 73;

  /**
   * The feature id for the '<em><b>Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECLS__RETAIN = FB_IO_VAR_DECLS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Non Retain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECLS__NON_RETAIN = FB_IO_VAR_DECLS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECLS__VARIABLES = FB_IO_VAR_DECLS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>FB Output Decls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECLS_FEATURE_COUNT = FB_IO_VAR_DECLS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl <em>FB Output Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decl()
   * @generated
   */
  int FB_OUTPUT_DECL = 74;

  /**
   * The number of structural features of the '<em>FB Output Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_OUTPUT_DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl <em>FB Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Body()
   * @generated
   */
  int FB_BODY = 75;

  /**
   * The number of structural features of the '<em>FB Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FB_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl <em>Method Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Decl()
   * @generated
   */
  int METHOD_DECL = 76;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__OVERRIDE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__NAME = 3;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__RETURN_TYPE = 4;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__IOS = 5;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__VARIABLES = 6;

  /**
   * The feature id for the '<em><b>Temps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__TEMPS = 7;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__BODY = 8;

  /**
   * The number of structural features of the '<em>Method Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl <em>Class Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getClass_Decl()
   * @generated
   */
  int CLASS_DECL = 77;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__CLASS = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__USINGS = 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__EXTENDS = 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__IMPLEMENTS = 4;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__VARIABLES = 5;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__METHODS = 6;

  /**
   * The number of structural features of the '<em>Class Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ClassImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getClass_()
   * @generated
   */
  int CLASS = 78;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl <em>Interface Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Decl()
   * @generated
   */
  int INTERFACE_DECL = 79;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__USINGS = 1;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__EXTENDS = 2;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__METHODS = 3;

  /**
   * The number of structural features of the '<em>Interface Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.InterfaceImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 80;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl <em>Method Prototype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Prototype()
   * @generated
   */
  int METHOD_PROTOTYPE = 81;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE__METHOD = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE__IOS = 2;

  /**
   * The number of structural features of the '<em>Method Prototype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PROTOTYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.MethodImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod()
   * @generated
   */
  int METHOD = 82;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 0;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl <em>Interface Name List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Name_List()
   * @generated
   */
  int INTERFACE_NAME_LIST = 83;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_NAME_LIST__INTERFACES = 0;

  /**
   * The number of structural features of the '<em>Interface Name List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_NAME_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl <em>Prog Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Decl()
   * @generated
   */
  int PROG_DECL = 84;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__PROGRAM = ST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__IOS = ST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__VARIABLES = ST_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL__BODY = ST_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Prog Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_DECL_FEATURE_COUNT = ST_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ProgramImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 85;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl <em>Namespace Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace_Decl()
   * @generated
   */
  int NAMESPACE_DECL = 86;

  /**
   * The feature id for the '<em><b>Internal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECL__INTERNAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECL__NAME = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECL__USINGS = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECL__ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Namespace Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.NamespaceImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 87;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = 0;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl <em>Using Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUsing_Directive()
   * @generated
   */
  int USING_DIRECTIVE = 89;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_DIRECTIVE__NAMESPACES = 0;

  /**
   * The number of structural features of the '<em>Using Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_DIRECTIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl <em>Variable Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Access()
   * @generated
   */
  int VARIABLE_ACCESS = 92;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__ACCESS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl <em>Multibit Part Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMultibit_Part_Access()
   * @generated
   */
  int MULTIBIT_PART_ACCESS = 93;

  /**
   * The feature id for the '<em><b>Bit Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIBIT_PART_ACCESS__BIT_INDEX = 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIBIT_PART_ACCESS__SIZE = 1;

  /**
   * The number of structural features of the '<em>Multibit Part Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIBIT_PART_ACCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.CallableImpl <em>Callable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.CallableImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCallable()
   * @generated
   */
  int CALLABLE = 94;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLABLE__CALLABLE = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLABLE__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Callable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl <em>Stmt List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt_List()
   * @generated
   */
  int STMT_LIST = 95;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_LIST__STATEMENTS = FUNC_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stmt List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_LIST_FEATURE_COUNT = FUNC_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt()
   * @generated
   */
  int STMT = 96;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__CALLABLE = CALLABLE__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__PARAMETERS = CALLABLE__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__TYPE = CALLABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = CALLABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl <em>Assign Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssign_Stmt()
   * @generated
   */
  int ASSIGN_STMT = 97;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT__CALLABLE = STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT__PARAMETERS = STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT__TYPE = STMT__TYPE;

  /**
   * The number of structural features of the '<em>Assign Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl <em>Variable Assign Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Assign_Stmt()
   * @generated
   */
  int VARIABLE_ASSIGN_STMT = 98;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT__CALLABLE = ASSIGN_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT__PARAMETERS = ASSIGN_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT__TYPE = ASSIGN_STMT__TYPE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT__VARIABLE = ASSIGN_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT__VALUE = ASSIGN_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Assign Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_STMT_FEATURE_COUNT = ASSIGN_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl <em>Assignment Attempt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssignment_Attempt()
   * @generated
   */
  int ASSIGNMENT_ATTEMPT = 99;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Assignment Attempt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_ATTEMPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl <em>Param Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getParam_Assign()
   * @generated
   */
  int PARAM_ASSIGN = 100;

  /**
   * The number of structural features of the '<em>Param Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_ASSIGN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl <em>Named Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Value()
   * @generated
   */
  int NAMED_VALUE = 101;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VALUE__VARIABLE = PARAM_ASSIGN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VALUE__VALUE = PARAM_ASSIGN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_VALUE_FEATURE_COUNT = PARAM_ASSIGN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl <em>Linked Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLinked_Value()
   * @generated
   */
  int LINKED_VALUE = 102;

  /**
   * The feature id for the '<em><b>Negated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE__NEGATED = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE__VARIABLE = 2;

  /**
   * The number of structural features of the '<em>Linked Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.InRef_AssignImpl <em>In Ref Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.InRef_AssignImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInRef_Assign()
   * @generated
   */
  int IN_REF_ASSIGN = 103;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_REF_ASSIGN__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_REF_ASSIGN__VALUE = 1;

  /**
   * The number of structural features of the '<em>In Ref Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_REF_ASSIGN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl <em>Selection Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSelection_Stmt()
   * @generated
   */
  int SELECTION_STMT = 104;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STMT__CALLABLE = STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STMT__PARAMETERS = STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STMT__TYPE = STMT__TYPE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STMT__CONDITION = STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl <em>IF Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIF_Stmt()
   * @generated
   */
  int IF_STMT = 105;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__CALLABLE = SELECTION_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__PARAMETERS = SELECTION_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__TYPE = SELECTION_STMT__TYPE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__CONDITION = SELECTION_STMT__CONDITION;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__STATEMENTS = SELECTION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elseifs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__ELSEIFS = SELECTION_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__ELSE = SELECTION_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>IF Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_FEATURE_COUNT = SELECTION_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl <em>ELSEIF Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSEIF_Stmt()
   * @generated
   */
  int ELSEIF_STMT = 106;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSEIF_STMT__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSEIF_STMT__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>ELSEIF Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSEIF_STMT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl <em>ELSE Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSE_Stmt()
   * @generated
   */
  int ELSE_STMT = 107;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_STMT__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>ELSE Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl <em>Case Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Stmt()
   * @generated
   */
  int CASE_STMT = 108;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__CALLABLE = SELECTION_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__PARAMETERS = SELECTION_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__TYPE = SELECTION_STMT__TYPE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__CONDITION = SELECTION_STMT__CONDITION;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__CASES = SELECTION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT__DEFAULT_STATEMENTS = SELECTION_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Case Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STMT_FEATURE_COUNT = SELECTION_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl <em>Case Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Selection()
   * @generated
   */
  int CASE_SELECTION = 109;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SELECTION__VALUES = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SELECTION__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Case Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SELECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_ListImpl <em>Case List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Case_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List()
   * @generated
   */
  int CASE_LIST = 110;

  /**
   * The feature id for the '<em><b>Case Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST__CASE_VALUES = 0;

  /**
   * The number of structural features of the '<em>Case List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl <em>Iteration Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIteration_Stmt()
   * @generated
   */
  int ITERATION_STMT = 112;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STMT__CALLABLE = STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STMT__PARAMETERS = STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STMT__TYPE = STMT__TYPE;

  /**
   * The number of structural features of the '<em>Iteration Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl <em>Exit Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExit_Stmt()
   * @generated
   */
  int EXIT_STMT = 113;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STMT__CALLABLE = ITERATION_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STMT__PARAMETERS = ITERATION_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STMT__TYPE = ITERATION_STMT__TYPE;

  /**
   * The number of structural features of the '<em>Exit Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl <em>Continue Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getContinue_Stmt()
   * @generated
   */
  int CONTINUE_STMT = 114;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STMT__CALLABLE = ITERATION_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STMT__PARAMETERS = ITERATION_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STMT__TYPE = ITERATION_STMT__TYPE;

  /**
   * The number of structural features of the '<em>Continue Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.For_StmtImpl <em>For Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.For_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_Stmt()
   * @generated
   */
  int FOR_STMT = 115;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__CALLABLE = ITERATION_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__PARAMETERS = ITERATION_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__TYPE = ITERATION_STMT__TYPE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__VARIABLE = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__BOUNDS = ITERATION_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__STATEMENTS = ITERATION_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.For_ListImpl <em>For List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.For_ListImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_List()
   * @generated
   */
  int FOR_LIST = 116;

  /**
   * The feature id for the '<em><b>Low Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST__LOW_BOUND = 0;

  /**
   * The feature id for the '<em><b>Up Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST__UP_BOUND = 1;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST__STEP = 2;

  /**
   * The number of structural features of the '<em>For List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LIST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.While_StmtImpl <em>While Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.While_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getWhile_Stmt()
   * @generated
   */
  int WHILE_STMT = 117;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__CALLABLE = ITERATION_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__PARAMETERS = ITERATION_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__TYPE = ITERATION_STMT__TYPE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__CONDITION = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__STATEMENTS = ITERATION_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl <em>Repeat Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRepeat_Stmt()
   * @generated
   */
  int REPEAT_STMT = 118;

  /**
   * The feature id for the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__CALLABLE = ITERATION_STMT__CALLABLE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__PARAMETERS = ITERATION_STMT__PARAMETERS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__TYPE = ITERATION_STMT__TYPE;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__STATEMENTS = ITERATION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT__CONDITION = ITERATION_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Repeat Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STMT_FEATURE_COUNT = ITERATION_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl <em>Xor Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getXor_Expr()
   * @generated
   */
  int XOR_EXPR = 119;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Xor Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.And_ExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.And_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAnd_Expr()
   * @generated
   */
  int AND_EXPR = 120;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl <em>Compare Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCompare_Expr()
   * @generated
   */
  int COMPARE_EXPR = 121;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Compare Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl <em>Equ Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEqu_Expr()
   * @generated
   */
  int EQU_EXPR = 122;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Equ Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQU_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl <em>Add Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAdd_Expr()
   * @generated
   */
  int ADD_EXPR = 123;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Add Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.TermImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTerm()
   * @generated
   */
  int TERM = 124;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl <em>Power Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl
   * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getPower_Expr()
   * @generated
   */
  int POWER_EXPR = 125;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Power Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.ST <em>ST</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ST</em>'.
   * @see at.bachmann.plc.st.stLanguage.ST
   * @generated
   */
  EClass getST();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.POU_Decl <em>POU Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POU Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.POU_Decl
   * @generated
   */
  EClass getPOU_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.POU_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.POU_Decl#getUsings()
   * @see #getPOU_Decl()
   * @generated
   */
  EReference getPOU_Decl_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.POU_Decl#getPous <em>Pous</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pous</em>'.
   * @see at.bachmann.plc.st.stLanguage.POU_Decl#getPous()
   * @see #getPOU_Decl()
   * @generated
   */
  EReference getPOU_Decl_Pous();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see at.bachmann.plc.st.stLanguage.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Numeric_Literal <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Numeric_Literal
   * @generated
   */
  EClass getNumeric_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Int_Literal <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Int_Literal
   * @generated
   */
  EClass getInt_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Unsigned_Int <em>Unsigned Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsigned Int</em>'.
   * @see at.bachmann.plc.st.stLanguage.Unsigned_Int
   * @generated
   */
  EClass getUnsigned_Int();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Signed_Int <em>Signed Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Int</em>'.
   * @see at.bachmann.plc.st.stLanguage.Signed_Int
   * @generated
   */
  EClass getSigned_Int();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Real_Literal <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Real_Literal
   * @generated
   */
  EClass getReal_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Bit_Str_Literal <em>Bit Str Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Str Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Bit_Str_Literal
   * @generated
   */
  EClass getBit_Str_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Bool_Literal <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Bool_Literal
   * @generated
   */
  EClass getBool_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Char_Literal <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Char_Literal
   * @generated
   */
  EClass getChar_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Time_Literal <em>Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Literal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Time_Literal
   * @generated
   */
  EClass getTime_Literal();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration</em>'.
   * @see at.bachmann.plc.st.stLanguage.Duration
   * @generated
   */
  EClass getDuration();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Time_Of_Day <em>Time Of Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Of Day</em>'.
   * @see at.bachmann.plc.st.stLanguage.Time_Of_Day
   * @generated
   */
  EClass getTime_Of_Day();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Daytime <em>Daytime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daytime</em>'.
   * @see at.bachmann.plc.st.stLanguage.Daytime
   * @generated
   */
  EClass getDaytime();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Daytime#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Daytime#getValue()
   * @see #getDaytime()
   * @generated
   */
  EAttribute getDaytime_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see at.bachmann.plc.st.stLanguage.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Date_And_Time <em>Date And Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date And Time</em>'.
   * @see at.bachmann.plc.st.stLanguage.Date_And_Time
   * @generated
   */
  EClass getDate_And_Time();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Data_Type_Decl <em>Data Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Data_Type_Decl
   * @generated
   */
  EClass getData_Type_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Data_Type_Decl#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see at.bachmann.plc.st.stLanguage.Data_Type_Decl#getTypes()
   * @see #getData_Type_Decl()
   * @generated
   */
  EReference getData_Type_Decl_Types();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Struct_Decl <em>Struct Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Decl
   * @generated
   */
  EClass getStruct_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Struct_Decl#isOverlap <em>Overlap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overlap</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Decl#isOverlap()
   * @see #getStruct_Decl()
   * @generated
   */
  EAttribute getStruct_Decl_Overlap();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Struct_Decl#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Struct_Decl#getElements()
   * @see #getStruct_Decl()
   * @generated
   */
  EReference getStruct_Decl_Elements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Type_Decl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl
   * @generated
   */
  EClass getType_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl#getName()
   * @see #getType_Decl()
   * @generated
   */
  EAttribute getType_Decl_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl#getInitialization()
   * @see #getType_Decl()
   * @generated
   */
  EReference getType_Decl_Initialization();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl#getLocation()
   * @see #getType_Decl()
   * @generated
   */
  EReference getType_Decl_Location();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Type_Decl#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Type_Decl#getAccess()
   * @see #getType_Decl()
   * @generated
   */
  EReference getType_Decl_Access();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl <em>Str Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Str Type Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl
   * @generated
   */
  EClass getStr_Type_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl#getType()
   * @see #getStr_Type_Decl()
   * @generated
   */
  EAttribute getStr_Type_Decl_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialization()
   * @see #getStr_Type_Decl()
   * @generated
   */
  EAttribute getStr_Type_Decl_Initialization();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Type_Decl#getInitialValue()
   * @see #getStr_Type_Decl()
   * @generated
   */
  EAttribute getStr_Type_Decl_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Spec_Init <em>Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Spec_Init
   * @generated
   */
  EClass getSpec_Init();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Spec_Init#getType()
   * @see #getSpec_Init()
   * @generated
   */
  EAttribute getSpec_Init_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Spec_Init#getInitialValue()
   * @see #getSpec_Init()
   * @generated
   */
  EReference getSpec_Init_InitialValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see at.bachmann.plc.st.stLanguage.Spec_Init#getRange()
   * @see #getSpec_Init()
   * @generated
   */
  EReference getSpec_Init_Range();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Spec_Init#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Spec_Init#getVariable()
   * @see #getSpec_Init()
   * @generated
   */
  EReference getSpec_Init_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Subrange <em>Subrange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange
   * @generated
   */
  EClass getSubrange();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Subrange#getLowBound <em>Low Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Low Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange#getLowBound()
   * @see #getSubrange()
   * @generated
   */
  EReference getSubrange_LowBound();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Subrange#getUpBound <em>Up Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Up Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.Subrange#getUpBound()
   * @see #getSubrange()
   * @generated
   */
  EReference getSubrange_UpBound();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init <em>Enum Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init
   * @generated
   */
  EClass getEnum_Spec_Init();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getType()
   * @see #getEnum_Spec_Init()
   * @generated
   */
  EAttribute getEnum_Spec_Init_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Spec_Init#getValue()
   * @see #getEnum_Spec_Init()
   * @generated
   */
  EReference getEnum_Spec_Init_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Enum_Value <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value
   * @generated
   */
  EClass getEnum_Value();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Enum_Value#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Enum_Value#getVariable()
   * @see #getEnum_Value()
   * @generated
   */
  EReference getEnum_Value_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable_Address <em>Variable Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Address</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Address
   * @generated
   */
  EClass getVariable_Address();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Variable_Address#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Address#getType()
   * @see #getVariable_Address()
   * @generated
   */
  EAttribute getVariable_Address_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Variable_Address#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Address#getSize()
   * @see #getVariable_Address()
   * @generated
   */
  EAttribute getVariable_Address_Size();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Variable_Address#getBitIndexes <em>Bit Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Bit Indexes</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Address#getBitIndexes()
   * @see #getVariable_Address()
   * @generated
   */
  EAttribute getVariable_Address_BitIndexes();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Variable_Address#getBitIndex <em>Bit Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Bit Index</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Address#getBitIndex()
   * @see #getVariable_Address()
   * @generated
   */
  EAttribute getVariable_Address_BitIndex();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Spec <em>Ref Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec
   * @generated
   */
  EClass getRef_Spec();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Ref_Spec#getRefTos <em>Ref Tos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ref Tos</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec#getRefTos()
   * @see #getRef_Spec()
   * @generated
   */
  EAttribute getRef_Spec_RefTos();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Ref_Spec#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Spec#getReference()
   * @see #getRef_Spec()
   * @generated
   */
  EAttribute getRef_Spec_Reference();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Value <em>Ref Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Value
   * @generated
   */
  EClass getRef_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Null_Ref <em>Null Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Ref</em>'.
   * @see at.bachmann.plc.st.stLanguage.Null_Ref
   * @generated
   */
  EClass getNull_Ref();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Addr <em>Ref Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Addr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Addr
   * @generated
   */
  EClass getRef_Addr();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Ref_Addr#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Addr#getVariable()
   * @see #getRef_Addr()
   * @generated
   */
  EReference getRef_Addr_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Assign <em>Ref Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Assign</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign
   * @generated
   */
  EClass getRef_Assign();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Ref_Assign#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign#getVariable()
   * @see #getRef_Assign()
   * @generated
   */
  EReference getRef_Assign_Variable();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Ref_Assign#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Assign#getValue()
   * @see #getRef_Assign()
   * @generated
   */
  EReference getRef_Assign_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Ref_Deref <em>Ref Deref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Deref</em>'.
   * @see at.bachmann.plc.st.stLanguage.Ref_Deref
   * @generated
   */
  EClass getRef_Deref();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Inline_Variable <em>Inline Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Inline_Variable
   * @generated
   */
  EClass getInline_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Symbolic_Variable <em>Symbolic Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbolic Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Symbolic_Variable
   * @generated
   */
  EClass getSymbolic_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Access <em>Var Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Access
   * @generated
   */
  EClass getVar_Access();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Var_Access#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Access#getVariable()
   * @see #getVar_Access()
   * @generated
   */
  EReference getVar_Access_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Named_Variable <em>Named Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Variable
   * @generated
   */
  EClass getNamed_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Direct_Variable <em>Direct Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Direct_Variable
   * @generated
   */
  EClass getDirect_Variable();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Direct_Variable#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Direct_Variable#getVariable()
   * @see #getDirect_Variable()
   * @generated
   */
  EReference getDirect_Variable_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Input_Decls <em>Input Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls
   * @generated
   */
  EClass getInput_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Input_Decls#isRetain <em>Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls#isRetain()
   * @see #getInput_Decls()
   * @generated
   */
  EAttribute getInput_Decls_Retain();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Input_Decls#isNonRetain <em>Non Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Non Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls#isNonRetain()
   * @see #getInput_Decls()
   * @generated
   */
  EAttribute getInput_Decls_NonRetain();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Input_Decls#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decls#getDeclarations()
   * @see #getInput_Decls()
   * @generated
   */
  EReference getInput_Decls_Declarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Input_Decl <em>Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Input_Decl
   * @generated
   */
  EClass getInput_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init <em>Var Decl Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl_Init
   * @generated
   */
  EClass getVar_Decl_Init();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl_Init#getVariables()
   * @see #getVar_Decl_Init()
   * @generated
   */
  EReference getVar_Decl_Init_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Decl_Init#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl_Init#getInitialization()
   * @see #getVar_Decl_Init()
   * @generated
   */
  EReference getVar_Decl_Init_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl <em>Interface Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Var_Decl
   * @generated
   */
  EClass getInterface_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getVariables()
   * @see #getInterface_Var_Decl()
   * @generated
   */
  EReference getInterface_Var_Decl_Variables();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Var_Decl#getInitialization()
   * @see #getInterface_Var_Decl()
   * @generated
   */
  EReference getInterface_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable_List <em>Variable List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_List
   * @generated
   */
  EClass getVariable_List();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Variable_List#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_List#getVariables()
   * @see #getVariable_List()
   * @generated
   */
  EReference getVariable_List_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Output_Decls <em>Output Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls
   * @generated
   */
  EClass getOutput_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Output_Decls#isRetain <em>Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls#isRetain()
   * @see #getOutput_Decls()
   * @generated
   */
  EAttribute getOutput_Decls_Retain();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Output_Decls#isNonRetain <em>Non Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Non Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls#isNonRetain()
   * @see #getOutput_Decls()
   * @generated
   */
  EAttribute getOutput_Decls_NonRetain();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Output_Decls#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decls#getDeclarations()
   * @see #getOutput_Decls()
   * @generated
   */
  EReference getOutput_Decls_Declarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Output_Decl <em>Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Output_Decl
   * @generated
   */
  EClass getOutput_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.In_Out_Decls <em>In Out Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Decls
   * @generated
   */
  EClass getIn_Out_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.In_Out_Decls#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Decls#getDeclarations()
   * @see #getIn_Out_Decls()
   * @generated
   */
  EReference getIn_Out_Decls_Declarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.In_Out_Var_Decl <em>In Out Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.In_Out_Var_Decl
   * @generated
   */
  EClass getIn_Out_Var_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Decl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl
   * @generated
   */
  EClass getVar_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl#getVariables()
   * @see #getVar_Decl()
   * @generated
   */
  EReference getVar_Decl_Variables();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decl#getInitialization()
   * @see #getVar_Decl()
   * @generated
   */
  EAttribute getVar_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Var_Decls <em>Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls
   * @generated
   */
  EClass getVar_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Var_Decls#isRetain <em>Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls#isRetain()
   * @see #getVar_Decls()
   * @generated
   */
  EAttribute getVar_Decls_Retain();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Var_Decls#isNonRetain <em>Non Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Non Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls#isNonRetain()
   * @see #getVar_Decls()
   * @generated
   */
  EAttribute getVar_Decls_NonRetain();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Var_Decls#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls#getAccess()
   * @see #getVar_Decls()
   * @generated
   */
  EAttribute getVar_Decls_Access();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Var_Decls#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.Var_Decls#getDeclarations()
   * @see #getVar_Decls()
   * @generated
   */
  EReference getVar_Decls_Declarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl <em>Loc Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl
   * @generated
   */
  EClass getLoc_Var_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getVariable()
   * @see #getLoc_Var_Decl()
   * @generated
   */
  EAttribute getLoc_Var_Decl_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getLocation()
   * @see #getLoc_Var_Decl()
   * @generated
   */
  EReference getLoc_Var_Decl_Location();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Decl#getInitialization()
   * @see #getLoc_Var_Decl()
   * @generated
   */
  EReference getLoc_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Temp_Var_Decls <em>Temp Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Temp Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Temp_Var_Decls
   * @generated
   */
  EClass getTemp_Var_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Temp_Var_Decls#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.Temp_Var_Decls#getDeclarations()
   * @see #getTemp_Var_Decls()
   * @generated
   */
  EReference getTemp_Var_Decls_Declarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.External_Var_Decls <em>External Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Var_Decls
   * @generated
   */
  EClass getExternal_Var_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.External_Var_Decls#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Var_Decls#getDeclarations()
   * @see #getExternal_Var_Decls()
   * @generated
   */
  EReference getExternal_Var_Decls_Declarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.External_Decl <em>External Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Decl
   * @generated
   */
  EClass getExternal_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.External_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Decl#getType()
   * @see #getExternal_Decl()
   * @generated
   */
  EAttribute getExternal_Decl_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.External_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.External_Decl#getInitialization()
   * @see #getExternal_Decl()
   * @generated
   */
  EAttribute getExternal_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls <em>Global Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls
   * @generated
   */
  EClass getGlobal_Var_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#isConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls#isConstant()
   * @see #getGlobal_Var_Decls()
   * @generated
   */
  EAttribute getGlobal_Var_Decls_Constant();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#isRetain <em>Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls#isRetain()
   * @see #getGlobal_Var_Decls()
   * @generated
   */
  EAttribute getGlobal_Var_Decls_Retain();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decls#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decls#getDeclarations()
   * @see #getGlobal_Var_Decls()
   * @generated
   */
  EReference getGlobal_Var_Decls_Declarations();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl <em>Global Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl
   * @generated
   */
  EClass getGlobal_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl#getType()
   * @see #getGlobal_Var_Decl()
   * @generated
   */
  EReference getGlobal_Var_Decl_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Global_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Decl#getInitialization()
   * @see #getGlobal_Var_Decl()
   * @generated
   */
  EReference getGlobal_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec <em>Global Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Var Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Spec
   * @generated
   */
  EClass getGlobal_Var_Spec();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Spec#getNames()
   * @see #getGlobal_Var_Spec()
   * @generated
   */
  EAttribute getGlobal_Var_Spec_Names();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Global_Var_Spec#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see at.bachmann.plc.st.stLanguage.Global_Var_Spec#getLocation()
   * @see #getGlobal_Var_Spec()
   * @generated
   */
  EReference getGlobal_Var_Spec_Location();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init <em>Loc Var Spec Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Var Spec Init</em>'.
   * @see at.bachmann.plc.st.stLanguage.Loc_Var_Spec_Init
   * @generated
   */
  EClass getLoc_Var_Spec_Init();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Located_At <em>Located At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Located At</em>'.
   * @see at.bachmann.plc.st.stLanguage.Located_At
   * @generated
   */
  EClass getLocated_At();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Str_Var_Decl <em>Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Str Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Var_Decl
   * @generated
   */
  EClass getStr_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Str_Var_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Str_Var_Decl#getVariables()
   * @see #getStr_Var_Decl()
   * @generated
   */
  EReference getStr_Var_Decl_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl <em>SByte Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SByte Str Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl
   * @generated
   */
  EClass getS_Byte_Str_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Var_Decl#getInitialization()
   * @see #getS_Byte_Str_Var_Decl()
   * @generated
   */
  EReference getS_Byte_Str_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec <em>SByte Str Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SByte Str Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec
   * @generated
   */
  EClass getS_Byte_Str_Spec();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getBound()
   * @see #getS_Byte_Str_Spec()
   * @generated
   */
  EReference getS_Byte_Str_Spec_Bound();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.S_Byte_Str_Spec#getInitialValue()
   * @see #getS_Byte_Str_Spec()
   * @generated
   */
  EAttribute getS_Byte_Str_Spec_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl <em>DByte Str Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DByte Str Var Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl
   * @generated
   */
  EClass getD_Byte_Str_Var_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Var_Decl#getInitialization()
   * @see #getD_Byte_Str_Var_Decl()
   * @generated
   */
  EReference getD_Byte_Str_Var_Decl_Initialization();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec <em>DByte Str Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DByte Str Spec</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec
   * @generated
   */
  EClass getD_Byte_Str_Spec();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getBound()
   * @see #getD_Byte_Str_Spec()
   * @generated
   */
  EReference getD_Byte_Str_Spec_Bound();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.D_Byte_Str_Spec#getInitialValue()
   * @see #getD_Byte_Str_Spec()
   * @generated
   */
  EAttribute getD_Byte_Str_Spec_InitialValue();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Func_Decl <em>Func Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl
   * @generated
   */
  EClass getFunc_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getName()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getReturnType()
   * @see #getFunc_Decl()
   * @generated
   */
  EAttribute getFunc_Decl_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getUsings()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getIos()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getVariables()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Temps</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getTemps()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Temps();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Func_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Decl#getBody()
   * @see #getFunc_Decl()
   * @generated
   */
  EReference getFunc_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see at.bachmann.plc.st.stLanguage.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.IO_Var_Decls <em>IO Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IO Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.IO_Var_Decls
   * @generated
   */
  EClass getIO_Var_Decls();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Func_Var_Decls <em>Func Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Var_Decls
   * @generated
   */
  EClass getFunc_Var_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Func_Var_Decls#isConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constant</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Var_Decls#isConstant()
   * @see #getFunc_Var_Decls()
   * @generated
   */
  EAttribute getFunc_Var_Decls_Constant();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Func_Body <em>Func Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Func_Body
   * @generated
   */
  EClass getFunc_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Decl <em>FB Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl
   * @generated
   */
  EClass getFB_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getModifier()
   * @see #getFB_Decl()
   * @generated
   */
  EAttribute getFB_Decl_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getName()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getUsings()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Usings();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getExtends()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Extends();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implements</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getImplements()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getIos()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getVariables()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Temps</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getTemps()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Temps();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getMethods()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Methods();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Decl#getBody()
   * @see #getFB_Decl()
   * @generated
   */
  EReference getFB_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FunctionBlock <em>Function Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Block</em>'.
   * @see at.bachmann.plc.st.stLanguage.FunctionBlock
   * @generated
   */
  EClass getFunctionBlock();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FunctionBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.FunctionBlock#getName()
   * @see #getFunctionBlock()
   * @generated
   */
  EAttribute getFunctionBlock_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls <em>FB IO Var Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB IO Var Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls
   * @generated
   */
  EClass getFB_IO_Var_Decls();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls <em>FB Input Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Input Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls
   * @generated
   */
  EClass getFB_Input_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls#isRetain <em>Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls#isRetain()
   * @see #getFB_Input_Decls()
   * @generated
   */
  EAttribute getFB_Input_Decls_Retain();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls#isNonRetain <em>Non Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Non Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls#isNonRetain()
   * @see #getFB_Input_Decls()
   * @generated
   */
  EAttribute getFB_Input_Decls_NonRetain();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decls#getVariables()
   * @see #getFB_Input_Decls()
   * @generated
   */
  EReference getFB_Input_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Input_Decl <em>FB Input Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Input Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Input_Decl
   * @generated
   */
  EClass getFB_Input_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls <em>FB Output Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Output Decls</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls
   * @generated
   */
  EClass getFB_Output_Decls();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls#isRetain <em>Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls#isRetain()
   * @see #getFB_Output_Decls()
   * @generated
   */
  EAttribute getFB_Output_Decls_Retain();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls#isNonRetain <em>Non Retain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Non Retain</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls#isNonRetain()
   * @see #getFB_Output_Decls()
   * @generated
   */
  EAttribute getFB_Output_Decls_NonRetain();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decls#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decls#getVariables()
   * @see #getFB_Output_Decls()
   * @generated
   */
  EReference getFB_Output_Decls_Variables();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Output_Decl <em>FB Output Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Output Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Output_Decl
   * @generated
   */
  EClass getFB_Output_Decl();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.FB_Body <em>FB Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FB Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.FB_Body
   * @generated
   */
  EClass getFB_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Method_Decl <em>Method Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl
   * @generated
   */
  EClass getMethod_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getAccess()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_Access();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getType()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#isOverride()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_Override();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getName()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getReturnType()
   * @see #getMethod_Decl()
   * @generated
   */
  EAttribute getMethod_Decl_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getIos()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getVariables()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Temps</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getTemps()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Temps();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Method_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Decl#getBody()
   * @see #getMethod_Decl()
   * @generated
   */
  EReference getMethod_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Class_Decl <em>Class Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl
   * @generated
   */
  EClass getClass_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getModifier()
   * @see #getClass_Decl()
   * @generated
   */
  EAttribute getClass_Decl_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getClass_()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Class();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getUsings()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Usings();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getExtends()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Extends();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getImplements()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getVariables()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class_Decl#getMethods()
   * @see #getClass_Decl()
   * @generated
   */
  EReference getClass_Decl_Methods();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Decl <em>Interface Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl
   * @generated
   */
  EClass getInterface_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getInterface()
   * @see #getInterface_Decl()
   * @generated
   */
  EReference getInterface_Decl_Interface();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getUsings()
   * @see #getInterface_Decl()
   * @generated
   */
  EReference getInterface_Decl_Usings();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getExtends()
   * @see #getInterface_Decl()
   * @generated
   */
  EReference getInterface_Decl_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Interface_Decl#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Decl#getMethods()
   * @see #getInterface_Decl()
   * @generated
   */
  EReference getInterface_Decl_Methods();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Method_Prototype <em>Method Prototype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Prototype</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype
   * @generated
   */
  EClass getMethod_Prototype();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype#getMethod()
   * @see #getMethod_Prototype()
   * @generated
   */
  EReference getMethod_Prototype_Method();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype#getReturnType()
   * @see #getMethod_Prototype()
   * @generated
   */
  EAttribute getMethod_Prototype_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Method_Prototype#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method_Prototype#getIos()
   * @see #getMethod_Prototype()
   * @generated
   */
  EReference getMethod_Prototype_Ios();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Interface_Name_List <em>Interface Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Name List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Name_List
   * @generated
   */
  EClass getInterface_Name_List();

  /**
   * Returns the meta object for the reference list '{@link at.bachmann.plc.st.stLanguage.Interface_Name_List#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Interfaces</em>'.
   * @see at.bachmann.plc.st.stLanguage.Interface_Name_List#getInterfaces()
   * @see #getInterface_Name_List()
   * @generated
   */
  EReference getInterface_Name_List_Interfaces();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Prog_Decl <em>Prog Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prog Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl
   * @generated
   */
  EClass getProg_Decl();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getProgram()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Program();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getIos <em>Ios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ios</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getIos()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Ios();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getVariables()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Variables();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Prog_Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see at.bachmann.plc.st.stLanguage.Prog_Decl#getBody()
   * @see #getProg_Decl()
   * @generated
   */
  EReference getProg_Decl_Body();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see at.bachmann.plc.st.stLanguage.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl <em>Namespace Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Decl</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Decl
   * @generated
   */
  EClass getNamespace_Decl();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#isInternal <em>Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Internal</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Decl#isInternal()
   * @see #getNamespace_Decl()
   * @generated
   */
  EAttribute getNamespace_Decl_Internal();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Decl#getName()
   * @see #getNamespace_Decl()
   * @generated
   */
  EReference getNamespace_Decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Decl#getUsings()
   * @see #getNamespace_Decl()
   * @generated
   */
  EReference getNamespace_Decl_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Namespace_Decl#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Decl#getElements()
   * @see #getNamespace_Decl()
   * @generated
   */
  EReference getNamespace_Decl_Elements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Namespace_Elements <em>Namespace Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Elements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Namespace_Elements
   * @generated
   */
  EClass getNamespace_Elements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Using_Directive <em>Using Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using Directive</em>'.
   * @see at.bachmann.plc.st.stLanguage.Using_Directive
   * @generated
   */
  EClass getUsing_Directive();

  /**
   * Returns the meta object for the attribute list '{@link at.bachmann.plc.st.stLanguage.Using_Directive#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Namespaces</em>'.
   * @see at.bachmann.plc.st.stLanguage.Using_Directive#getNamespaces()
   * @see #getUsing_Directive()
   * @generated
   */
  EAttribute getUsing_Directive_Namespaces();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see at.bachmann.plc.st.stLanguage.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Constant_Expr <em>Constant Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Constant_Expr
   * @generated
   */
  EClass getConstant_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable_Access <em>Variable Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Access
   * @generated
   */
  EClass getVariable_Access();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Variable_Access#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Access#getVariable()
   * @see #getVariable_Access()
   * @generated
   */
  EReference getVariable_Access_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Variable_Access#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Access#getAccess()
   * @see #getVariable_Access()
   * @generated
   */
  EReference getVariable_Access_Access();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access <em>Multibit Part Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multibit Part Access</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multibit_Part_Access
   * @generated
   */
  EClass getMultibit_Part_Access();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getBitIndex <em>Bit Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bit Index</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getBitIndex()
   * @see #getMultibit_Part_Access()
   * @generated
   */
  EAttribute getMultibit_Part_Access_BitIndex();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see at.bachmann.plc.st.stLanguage.Multibit_Part_Access#getSize()
   * @see #getMultibit_Part_Access()
   * @generated
   */
  EAttribute getMultibit_Part_Access_Size();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Callable <em>Callable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Callable
   * @generated
   */
  EClass getCallable();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Callable#getCallable <em>Callable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Callable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Callable#getCallable()
   * @see #getCallable()
   * @generated
   */
  EReference getCallable_Callable();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Callable#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see at.bachmann.plc.st.stLanguage.Callable#getParameters()
   * @see #getCallable()
   * @generated
   */
  EReference getCallable_Parameters();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Stmt_List <em>Stmt List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Stmt_List
   * @generated
   */
  EClass getStmt_List();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Stmt_List#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Stmt_List#getStatements()
   * @see #getStmt_List()
   * @generated
   */
  EReference getStmt_List_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Stmt#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bachmann.plc.st.stLanguage.Stmt#getType()
   * @see #getStmt()
   * @generated
   */
  EAttribute getStmt_Type();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Assign_Stmt <em>Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assign_Stmt
   * @generated
   */
  EClass getAssign_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt <em>Variable Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assign Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt
   * @generated
   */
  EClass getVariable_Assign_Stmt();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getVariable()
   * @see #getVariable_Assign_Stmt()
   * @generated
   */
  EReference getVariable_Assign_Stmt_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Variable_Assign_Stmt#getValue()
   * @see #getVariable_Assign_Stmt()
   * @generated
   */
  EReference getVariable_Assign_Stmt_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt <em>Assignment Attempt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Attempt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt
   * @generated
   */
  EClass getAssignment_Attempt();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt#getVariable()
   * @see #getAssignment_Attempt()
   * @generated
   */
  EReference getAssignment_Attempt_Variable();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Assignment_Attempt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Assignment_Attempt#getValue()
   * @see #getAssignment_Attempt()
   * @generated
   */
  EReference getAssignment_Attempt_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Param_Assign <em>Param Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Assign</em>'.
   * @see at.bachmann.plc.st.stLanguage.Param_Assign
   * @generated
   */
  EClass getParam_Assign();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Named_Value <em>Named Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Value
   * @generated
   */
  EClass getNamed_Value();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Named_Value#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Value#getVariable()
   * @see #getNamed_Value()
   * @generated
   */
  EReference getNamed_Value_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Named_Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Named_Value#getValue()
   * @see #getNamed_Value()
   * @generated
   */
  EReference getNamed_Value_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Linked_Value <em>Linked Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linked Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value
   * @generated
   */
  EClass getLinked_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bachmann.plc.st.stLanguage.Linked_Value#isNegated <em>Negated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negated</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value#isNegated()
   * @see #getLinked_Value()
   * @generated
   */
  EAttribute getLinked_Value_Negated();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Linked_Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value#getValue()
   * @see #getLinked_Value()
   * @generated
   */
  EReference getLinked_Value_Value();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.Linked_Value#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.Linked_Value#getVariable()
   * @see #getLinked_Value()
   * @generated
   */
  EReference getLinked_Value_Variable();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.InRef_Assign <em>In Ref Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Ref Assign</em>'.
   * @see at.bachmann.plc.st.stLanguage.InRef_Assign
   * @generated
   */
  EClass getInRef_Assign();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.InRef_Assign#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.InRef_Assign#getVariable()
   * @see #getInRef_Assign()
   * @generated
   */
  EReference getInRef_Assign_Variable();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.InRef_Assign#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see at.bachmann.plc.st.stLanguage.InRef_Assign#getValue()
   * @see #getInRef_Assign()
   * @generated
   */
  EReference getInRef_Assign_Value();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Selection_Stmt <em>Selection Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Selection_Stmt
   * @generated
   */
  EClass getSelection_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Selection_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.Selection_Stmt#getCondition()
   * @see #getSelection_Stmt()
   * @generated
   */
  EReference getSelection_Stmt_Condition();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.IF_Stmt <em>IF Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IF Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt
   * @generated
   */
  EClass getIF_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt#getStatements()
   * @see #getIF_Stmt()
   * @generated
   */
  EReference getIF_Stmt_Statements();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getElseifs <em>Elseifs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseifs</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt#getElseifs()
   * @see #getIF_Stmt()
   * @generated
   */
  EReference getIF_Stmt_Elseifs();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.IF_Stmt#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see at.bachmann.plc.st.stLanguage.IF_Stmt#getElse()
   * @see #getIF_Stmt()
   * @generated
   */
  EReference getIF_Stmt_Else();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt <em>ELSEIF Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ELSEIF Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSEIF_Stmt
   * @generated
   */
  EClass getELSEIF_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getCondition()
   * @see #getELSEIF_Stmt()
   * @generated
   */
  EReference getELSEIF_Stmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSEIF_Stmt#getStatements()
   * @see #getELSEIF_Stmt()
   * @generated
   */
  EReference getELSEIF_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.ELSE_Stmt <em>ELSE Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ELSE Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSE_Stmt
   * @generated
   */
  EClass getELSE_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.ELSE_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.ELSE_Stmt#getStatements()
   * @see #getELSE_Stmt()
   * @generated
   */
  EReference getELSE_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_Stmt <em>Case Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt
   * @generated
   */
  EClass getCase_Stmt();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt#getCases()
   * @see #getCase_Stmt()
   * @generated
   */
  EReference getCase_Stmt_Cases();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Case_Stmt#getDefaultStatements <em>Default Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Stmt#getDefaultStatements()
   * @see #getCase_Stmt()
   * @generated
   */
  EReference getCase_Stmt_DefaultStatements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_Selection <em>Case Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Selection</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Selection
   * @generated
   */
  EClass getCase_Selection();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Case_Selection#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Selection#getValues()
   * @see #getCase_Selection()
   * @generated
   */
  EReference getCase_Selection_Values();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Case_Selection#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_Selection#getStatements()
   * @see #getCase_Selection()
   * @generated
   */
  EReference getCase_Selection_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_List <em>Case List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case List</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_List
   * @generated
   */
  EClass getCase_List();

  /**
   * Returns the meta object for the containment reference list '{@link at.bachmann.plc.st.stLanguage.Case_List#getCaseValues <em>Case Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Values</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_List#getCaseValues()
   * @see #getCase_List()
   * @generated
   */
  EReference getCase_List_CaseValues();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Case_List_Elem <em>Case List Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case List Elem</em>'.
   * @see at.bachmann.plc.st.stLanguage.Case_List_Elem
   * @generated
   */
  EClass getCase_List_Elem();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Iteration_Stmt <em>Iteration Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Iteration_Stmt
   * @generated
   */
  EClass getIteration_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Exit_Stmt <em>Exit Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Exit_Stmt
   * @generated
   */
  EClass getExit_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Continue_Stmt <em>Continue Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continue Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Continue_Stmt
   * @generated
   */
  EClass getContinue_Stmt();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.For_Stmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt
   * @generated
   */
  EClass getFor_Stmt();

  /**
   * Returns the meta object for the reference '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt#getVariable()
   * @see #getFor_Stmt()
   * @generated
   */
  EReference getFor_Stmt_Variable();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getBounds <em>Bounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounds</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt#getBounds()
   * @see #getFor_Stmt()
   * @generated
   */
  EReference getFor_Stmt_Bounds();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_Stmt#getStatements()
   * @see #getFor_Stmt()
   * @generated
   */
  EReference getFor_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.For_List <em>For List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For List</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List
   * @generated
   */
  EClass getFor_List();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_List#getLowBound <em>Low Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Low Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List#getLowBound()
   * @see #getFor_List()
   * @generated
   */
  EReference getFor_List_LowBound();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_List#getUpBound <em>Up Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Up Bound</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List#getUpBound()
   * @see #getFor_List()
   * @generated
   */
  EReference getFor_List_UpBound();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.For_List#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Step</em>'.
   * @see at.bachmann.plc.st.stLanguage.For_List#getStep()
   * @see #getFor_List()
   * @generated
   */
  EReference getFor_List_Step();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.While_Stmt <em>While Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.While_Stmt
   * @generated
   */
  EClass getWhile_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.While_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.While_Stmt#getCondition()
   * @see #getWhile_Stmt()
   * @generated
   */
  EReference getWhile_Stmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.While_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.While_Stmt#getStatements()
   * @see #getWhile_Stmt()
   * @generated
   */
  EReference getWhile_Stmt_Statements();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Repeat_Stmt <em>Repeat Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat Stmt</em>'.
   * @see at.bachmann.plc.st.stLanguage.Repeat_Stmt
   * @generated
   */
  EClass getRepeat_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Repeat_Stmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see at.bachmann.plc.st.stLanguage.Repeat_Stmt#getStatements()
   * @see #getRepeat_Stmt()
   * @generated
   */
  EReference getRepeat_Stmt_Statements();

  /**
   * Returns the meta object for the containment reference '{@link at.bachmann.plc.st.stLanguage.Repeat_Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see at.bachmann.plc.st.stLanguage.Repeat_Stmt#getCondition()
   * @see #getRepeat_Stmt()
   * @generated
   */
  EReference getRepeat_Stmt_Condition();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Xor_Expr <em>Xor Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Xor_Expr
   * @generated
   */
  EClass getXor_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.And_Expr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.And_Expr
   * @generated
   */
  EClass getAnd_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Compare_Expr <em>Compare Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Compare_Expr
   * @generated
   */
  EClass getCompare_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Equ_Expr <em>Equ Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equ Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Equ_Expr
   * @generated
   */
  EClass getEqu_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Add_Expr <em>Add Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Add_Expr
   * @generated
   */
  EClass getAdd_Expr();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see at.bachmann.plc.st.stLanguage.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link at.bachmann.plc.st.stLanguage.Power_Expr <em>Power Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power Expr</em>'.
   * @see at.bachmann.plc.st.stLanguage.Power_Expr
   * @generated
   */
  EClass getPower_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StLanguageFactory getStLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.STImpl <em>ST</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.STImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getST()
     * @generated
     */
    EClass ST = eINSTANCE.getST();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.POU_DeclImpl <em>POU Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.POU_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getPOU_Decl()
     * @generated
     */
    EClass POU_DECL = eINSTANCE.getPOU_Decl();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POU_DECL__USINGS = eINSTANCE.getPOU_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Pous</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POU_DECL__POUS = eINSTANCE.getPOU_Decl_Pous();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ConstantImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Numeric_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNumeric_Literal()
     * @generated
     */
    EClass NUMERIC_LITERAL = eINSTANCE.getNumeric_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Int_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInt_Literal()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getInt_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl <em>Unsigned Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Unsigned_IntImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUnsigned_Int()
     * @generated
     */
    EClass UNSIGNED_INT = eINSTANCE.getUnsigned_Int();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl <em>Signed Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Signed_IntImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSigned_Int()
     * @generated
     */
    EClass SIGNED_INT = eINSTANCE.getSigned_Int();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Real_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getReal_Literal()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getReal_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl <em>Bit Str Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Bit_Str_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBit_Str_Literal()
     * @generated
     */
    EClass BIT_STR_LITERAL = eINSTANCE.getBit_Str_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl <em>Bool Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Bool_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getBool_Literal()
     * @generated
     */
    EClass BOOL_LITERAL = eINSTANCE.getBool_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl <em>Char Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Char_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getChar_Literal()
     * @generated
     */
    EClass CHAR_LITERAL = eINSTANCE.getChar_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl <em>Time Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Time_LiteralImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Literal()
     * @generated
     */
    EClass TIME_LITERAL = eINSTANCE.getTime_Literal();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.DurationImpl <em>Duration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.DurationImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDuration()
     * @generated
     */
    EClass DURATION = eINSTANCE.getDuration();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl <em>Time Of Day</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Time_Of_DayImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTime_Of_Day()
     * @generated
     */
    EClass TIME_OF_DAY = eINSTANCE.getTime_Of_Day();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.DaytimeImpl <em>Daytime</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.DaytimeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDaytime()
     * @generated
     */
    EClass DAYTIME = eINSTANCE.getDaytime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAYTIME__VALUE = eINSTANCE.getDaytime_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.DateImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl <em>Date And Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Date_And_TimeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDate_And_Time()
     * @generated
     */
    EClass DATE_AND_TIME = eINSTANCE.getDate_And_Time();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl <em>Data Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Data_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getData_Type_Decl()
     * @generated
     */
    EClass DATA_TYPE_DECL = eINSTANCE.getData_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_DECL__TYPES = eINSTANCE.getData_Type_Decl_Types();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl <em>Struct Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Struct_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStruct_Decl()
     * @generated
     */
    EClass STRUCT_DECL = eINSTANCE.getStruct_Decl();

    /**
     * The meta object literal for the '<em><b>Overlap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_DECL__OVERLAP = eINSTANCE.getStruct_Decl_Overlap();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECL__ELEMENTS = eINSTANCE.getStruct_Decl_Elements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl <em>Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getType_Decl()
     * @generated
     */
    EClass TYPE_DECL = eINSTANCE.getType_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECL__NAME = eINSTANCE.getType_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__INITIALIZATION = eINSTANCE.getType_Decl_Initialization();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__LOCATION = eINSTANCE.getType_Decl_Location();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__ACCESS = eINSTANCE.getType_Decl_Access();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl <em>Str Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Str_Type_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Type_Decl()
     * @generated
     */
    EClass STR_TYPE_DECL = eINSTANCE.getStr_Type_Decl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STR_TYPE_DECL__TYPE = eINSTANCE.getStr_Type_Decl_Type();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STR_TYPE_DECL__INITIALIZATION = eINSTANCE.getStr_Type_Decl_Initialization();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STR_TYPE_DECL__INITIAL_VALUE = eINSTANCE.getStr_Type_Decl_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Spec_InitImpl <em>Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSpec_Init()
     * @generated
     */
    EClass SPEC_INIT = eINSTANCE.getSpec_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEC_INIT__TYPE = eINSTANCE.getSpec_Init_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_INIT__INITIAL_VALUE = eINSTANCE.getSpec_Init_InitialValue();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_INIT__RANGE = eINSTANCE.getSpec_Init_Range();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPEC_INIT__VARIABLE = eINSTANCE.getSpec_Init_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.SubrangeImpl <em>Subrange</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.SubrangeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSubrange()
     * @generated
     */
    EClass SUBRANGE = eINSTANCE.getSubrange();

    /**
     * The meta object literal for the '<em><b>Low Bound</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE__LOW_BOUND = eINSTANCE.getSubrange_LowBound();

    /**
     * The meta object literal for the '<em><b>Up Bound</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBRANGE__UP_BOUND = eINSTANCE.getSubrange_UpBound();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl <em>Enum Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Enum_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Spec_Init()
     * @generated
     */
    EClass ENUM_SPEC_INIT = eINSTANCE.getEnum_Spec_Init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_SPEC_INIT__TYPE = eINSTANCE.getEnum_Spec_Init_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_SPEC_INIT__VALUE = eINSTANCE.getEnum_Spec_Init_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl <em>Enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Enum_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEnum_Value()
     * @generated
     */
    EClass ENUM_VALUE = eINSTANCE.getEnum_Value();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_VALUE__VARIABLE = eINSTANCE.getEnum_Value_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl <em>Variable Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Address()
     * @generated
     */
    EClass VARIABLE_ADDRESS = eINSTANCE.getVariable_Address();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ADDRESS__TYPE = eINSTANCE.getVariable_Address_Type();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ADDRESS__SIZE = eINSTANCE.getVariable_Address_Size();

    /**
     * The meta object literal for the '<em><b>Bit Indexes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ADDRESS__BIT_INDEXES = eINSTANCE.getVariable_Address_BitIndexes();

    /**
     * The meta object literal for the '<em><b>Bit Index</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ADDRESS__BIT_INDEX = eINSTANCE.getVariable_Address_BitIndex();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl <em>Ref Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Spec()
     * @generated
     */
    EClass REF_SPEC = eINSTANCE.getRef_Spec();

    /**
     * The meta object literal for the '<em><b>Ref Tos</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_SPEC__REF_TOS = eINSTANCE.getRef_Spec_RefTos();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_SPEC__REFERENCE = eINSTANCE.getRef_Spec_Reference();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl <em>Ref Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Value()
     * @generated
     */
    EClass REF_VALUE = eINSTANCE.getRef_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Null_RefImpl <em>Null Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Null_RefImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNull_Ref()
     * @generated
     */
    EClass NULL_REF = eINSTANCE.getNull_Ref();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl <em>Ref Addr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_AddrImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Addr()
     * @generated
     */
    EClass REF_ADDR = eINSTANCE.getRef_Addr();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ADDR__VARIABLE = eINSTANCE.getRef_Addr_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl <em>Ref Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_AssignImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Assign()
     * @generated
     */
    EClass REF_ASSIGN = eINSTANCE.getRef_Assign();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ASSIGN__VARIABLE = eINSTANCE.getRef_Assign_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ASSIGN__VALUE = eINSTANCE.getRef_Assign_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl <em>Ref Deref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Ref_DerefImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRef_Deref()
     * @generated
     */
    EClass REF_DEREF = eINSTANCE.getRef_Deref();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Inline_VariableImpl <em>Inline Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Inline_VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInline_Variable()
     * @generated
     */
    EClass INLINE_VARIABLE = eINSTANCE.getInline_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl <em>Symbolic Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Symbolic_VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSymbolic_Variable()
     * @generated
     */
    EClass SYMBOLIC_VARIABLE = eINSTANCE.getSymbolic_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl <em>Var Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_AccessImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Access()
     * @generated
     */
    EClass VAR_ACCESS = eINSTANCE.getVar_Access();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_ACCESS__VARIABLE = eINSTANCE.getVar_Access_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_VariableImpl <em>Named Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Named_VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Variable()
     * @generated
     */
    EClass NAMED_VARIABLE = eINSTANCE.getNamed_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl <em>Direct Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Direct_VariableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getDirect_Variable()
     * @generated
     */
    EClass DIRECT_VARIABLE = eINSTANCE.getDirect_Variable();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_VARIABLE__VARIABLE = eINSTANCE.getDirect_Variable_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl <em>Input Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decls()
     * @generated
     */
    EClass INPUT_DECLS = eINSTANCE.getInput_Decls();

    /**
     * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_DECLS__RETAIN = eINSTANCE.getInput_Decls_Retain();

    /**
     * The meta object literal for the '<em><b>Non Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_DECLS__NON_RETAIN = eINSTANCE.getInput_Decls_NonRetain();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_DECLS__DECLARATIONS = eINSTANCE.getInput_Decls_Declarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl <em>Input Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Input_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInput_Decl()
     * @generated
     */
    EClass INPUT_DECL = eINSTANCE.getInput_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl <em>Var Decl Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_Decl_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl_Init()
     * @generated
     */
    EClass VAR_DECL_INIT = eINSTANCE.getVar_Decl_Init();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL_INIT__VARIABLES = eINSTANCE.getVar_Decl_Init_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL_INIT__INITIALIZATION = eINSTANCE.getVar_Decl_Init_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl <em>Interface Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Var_Decl()
     * @generated
     */
    EClass INTERFACE_VAR_DECL = eINSTANCE.getInterface_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_VAR_DECL__VARIABLES = eINSTANCE.getInterface_Var_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_VAR_DECL__INITIALIZATION = eINSTANCE.getInterface_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl <em>Variable List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Variable_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_List()
     * @generated
     */
    EClass VARIABLE_LIST = eINSTANCE.getVariable_List();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_LIST__VARIABLES = eINSTANCE.getVariable_List_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl <em>Output Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decls()
     * @generated
     */
    EClass OUTPUT_DECLS = eINSTANCE.getOutput_Decls();

    /**
     * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_DECLS__RETAIN = eINSTANCE.getOutput_Decls_Retain();

    /**
     * The meta object literal for the '<em><b>Non Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_DECLS__NON_RETAIN = eINSTANCE.getOutput_Decls_NonRetain();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DECLS__DECLARATIONS = eINSTANCE.getOutput_Decls_Declarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl <em>Output Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Output_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getOutput_Decl()
     * @generated
     */
    EClass OUTPUT_DECL = eINSTANCE.getOutput_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl <em>In Out Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.In_Out_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Decls()
     * @generated
     */
    EClass IN_OUT_DECLS = eINSTANCE.getIn_Out_Decls();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUT_DECLS__DECLARATIONS = eINSTANCE.getIn_Out_Decls_Declarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl <em>In Out Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.In_Out_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIn_Out_Var_Decl()
     * @generated
     */
    EClass IN_OUT_VAR_DECL = eINSTANCE.getIn_Out_Var_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVar_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__VARIABLES = eINSTANCE.getVar_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__INITIALIZATION = eINSTANCE.getVar_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl <em>Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVar_Decls()
     * @generated
     */
    EClass VAR_DECLS = eINSTANCE.getVar_Decls();

    /**
     * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLS__RETAIN = eINSTANCE.getVar_Decls_Retain();

    /**
     * The meta object literal for the '<em><b>Non Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLS__NON_RETAIN = eINSTANCE.getVar_Decls_NonRetain();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLS__ACCESS = eINSTANCE.getVar_Decls_Access();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLS__DECLARATIONS = eINSTANCE.getVar_Decls_Declarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl <em>Loc Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Decl()
     * @generated
     */
    EClass LOC_VAR_DECL = eINSTANCE.getLoc_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOC_VAR_DECL__VARIABLE = eINSTANCE.getLoc_Var_Decl_Variable();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_VAR_DECL__LOCATION = eINSTANCE.getLoc_Var_Decl_Location();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_VAR_DECL__INITIALIZATION = eINSTANCE.getLoc_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl <em>Temp Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Temp_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTemp_Var_Decls()
     * @generated
     */
    EClass TEMP_VAR_DECLS = eINSTANCE.getTemp_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMP_VAR_DECLS__DECLARATIONS = eINSTANCE.getTemp_Var_Decls_Declarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl <em>External Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.External_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Var_Decls()
     * @generated
     */
    EClass EXTERNAL_VAR_DECLS = eINSTANCE.getExternal_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_VAR_DECLS__DECLARATIONS = eINSTANCE.getExternal_Var_Decls_Declarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.External_DeclImpl <em>External Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.External_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExternal_Decl()
     * @generated
     */
    EClass EXTERNAL_DECL = eINSTANCE.getExternal_Decl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DECL__TYPE = eINSTANCE.getExternal_Decl_Type();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DECL__INITIALIZATION = eINSTANCE.getExternal_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl <em>Global Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decls()
     * @generated
     */
    EClass GLOBAL_VAR_DECLS = eINSTANCE.getGlobal_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_DECLS__CONSTANT = eINSTANCE.getGlobal_Var_Decls_Constant();

    /**
     * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_DECLS__RETAIN = eINSTANCE.getGlobal_Var_Decls_Retain();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_DECLS__DECLARATIONS = eINSTANCE.getGlobal_Var_Decls_Declarations();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl <em>Global Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Decl()
     * @generated
     */
    EClass GLOBAL_VAR_DECL = eINSTANCE.getGlobal_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_DECL__TYPE = eINSTANCE.getGlobal_Var_Decl_Type();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_DECL__INITIALIZATION = eINSTANCE.getGlobal_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl <em>Global Var Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Global_Var_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getGlobal_Var_Spec()
     * @generated
     */
    EClass GLOBAL_VAR_SPEC = eINSTANCE.getGlobal_Var_Spec();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_SPEC__NAMES = eINSTANCE.getGlobal_Var_Spec_Names();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_SPEC__LOCATION = eINSTANCE.getGlobal_Var_Spec_Location();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl <em>Loc Var Spec Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Loc_Var_Spec_InitImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLoc_Var_Spec_Init()
     * @generated
     */
    EClass LOC_VAR_SPEC_INIT = eINSTANCE.getLoc_Var_Spec_Init();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Located_AtImpl <em>Located At</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Located_AtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLocated_At()
     * @generated
     */
    EClass LOCATED_AT = eINSTANCE.getLocated_At();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl <em>Str Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Str_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStr_Var_Decl()
     * @generated
     */
    EClass STR_VAR_DECL = eINSTANCE.getStr_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STR_VAR_DECL__VARIABLES = eINSTANCE.getStr_Var_Decl_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl <em>SByte Str Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Var_Decl()
     * @generated
     */
    EClass SBYTE_STR_VAR_DECL = eINSTANCE.getS_Byte_Str_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SBYTE_STR_VAR_DECL__INITIALIZATION = eINSTANCE.getS_Byte_Str_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl <em>SByte Str Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.S_Byte_Str_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getS_Byte_Str_Spec()
     * @generated
     */
    EClass SBYTE_STR_SPEC = eINSTANCE.getS_Byte_Str_Spec();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SBYTE_STR_SPEC__BOUND = eINSTANCE.getS_Byte_Str_Spec_Bound();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SBYTE_STR_SPEC__INITIAL_VALUE = eINSTANCE.getS_Byte_Str_Spec_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl <em>DByte Str Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_Var_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Var_Decl()
     * @generated
     */
    EClass DBYTE_STR_VAR_DECL = eINSTANCE.getD_Byte_Str_Var_Decl();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DBYTE_STR_VAR_DECL__INITIALIZATION = eINSTANCE.getD_Byte_Str_Var_Decl_Initialization();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl <em>DByte Str Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.D_Byte_Str_SpecImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getD_Byte_Str_Spec()
     * @generated
     */
    EClass DBYTE_STR_SPEC = eINSTANCE.getD_Byte_Str_Spec();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DBYTE_STR_SPEC__BOUND = eINSTANCE.getD_Byte_Str_Spec_Bound();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DBYTE_STR_SPEC__INITIAL_VALUE = eINSTANCE.getD_Byte_Str_Spec_InitialValue();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl <em>Func Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Func_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Decl()
     * @generated
     */
    EClass FUNC_DECL = eINSTANCE.getFunc_Decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__NAME = eINSTANCE.getFunc_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_DECL__RETURN_TYPE = eINSTANCE.getFunc_Decl_ReturnType();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__USINGS = eINSTANCE.getFunc_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__IOS = eINSTANCE.getFunc_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__VARIABLES = eINSTANCE.getFunc_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__TEMPS = eINSTANCE.getFunc_Decl_Temps();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_DECL__BODY = eINSTANCE.getFunc_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FunctionImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl <em>IO Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.IO_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIO_Var_Decls()
     * @generated
     */
    EClass IO_VAR_DECLS = eINSTANCE.getIO_Var_Decls();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl <em>Func Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Func_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Var_Decls()
     * @generated
     */
    EClass FUNC_VAR_DECLS = eINSTANCE.getFunc_Var_Decls();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_VAR_DECLS__CONSTANT = eINSTANCE.getFunc_Var_Decls_Constant();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl <em>Func Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Func_BodyImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunc_Body()
     * @generated
     */
    EClass FUNC_BODY = eINSTANCE.getFunc_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl <em>FB Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Decl()
     * @generated
     */
    EClass FB_DECL = eINSTANCE.getFB_Decl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_DECL__MODIFIER = eINSTANCE.getFB_Decl_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__NAME = eINSTANCE.getFB_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__USINGS = eINSTANCE.getFB_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__EXTENDS = eINSTANCE.getFB_Decl_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__IMPLEMENTS = eINSTANCE.getFB_Decl_Implements();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__IOS = eINSTANCE.getFB_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__VARIABLES = eINSTANCE.getFB_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__TEMPS = eINSTANCE.getFB_Decl_Temps();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__METHODS = eINSTANCE.getFB_Decl_Methods();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_DECL__BODY = eINSTANCE.getFB_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FunctionBlockImpl <em>Function Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FunctionBlockImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFunctionBlock()
     * @generated
     */
    EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_BLOCK__NAME = eINSTANCE.getFunctionBlock_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl <em>FB IO Var Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_IO_Var_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_IO_Var_Decls()
     * @generated
     */
    EClass FB_IO_VAR_DECLS = eINSTANCE.getFB_IO_Var_Decls();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl <em>FB Input Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decls()
     * @generated
     */
    EClass FB_INPUT_DECLS = eINSTANCE.getFB_Input_Decls();

    /**
     * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_INPUT_DECLS__RETAIN = eINSTANCE.getFB_Input_Decls_Retain();

    /**
     * The meta object literal for the '<em><b>Non Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_INPUT_DECLS__NON_RETAIN = eINSTANCE.getFB_Input_Decls_NonRetain();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_INPUT_DECLS__VARIABLES = eINSTANCE.getFB_Input_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl <em>FB Input Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Input_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Input_Decl()
     * @generated
     */
    EClass FB_INPUT_DECL = eINSTANCE.getFB_Input_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl <em>FB Output Decls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decls()
     * @generated
     */
    EClass FB_OUTPUT_DECLS = eINSTANCE.getFB_Output_Decls();

    /**
     * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_OUTPUT_DECLS__RETAIN = eINSTANCE.getFB_Output_Decls_Retain();

    /**
     * The meta object literal for the '<em><b>Non Retain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FB_OUTPUT_DECLS__NON_RETAIN = eINSTANCE.getFB_Output_Decls_NonRetain();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FB_OUTPUT_DECLS__VARIABLES = eINSTANCE.getFB_Output_Decls_Variables();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl <em>FB Output Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_Output_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Output_Decl()
     * @generated
     */
    EClass FB_OUTPUT_DECL = eINSTANCE.getFB_Output_Decl();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl <em>FB Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.FB_BodyImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFB_Body()
     * @generated
     */
    EClass FB_BODY = eINSTANCE.getFB_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl <em>Method Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Method_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Decl()
     * @generated
     */
    EClass METHOD_DECL = eINSTANCE.getMethod_Decl();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__ACCESS = eINSTANCE.getMethod_Decl_Access();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__TYPE = eINSTANCE.getMethod_Decl_Type();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__OVERRIDE = eINSTANCE.getMethod_Decl_Override();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__NAME = eINSTANCE.getMethod_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECL__RETURN_TYPE = eINSTANCE.getMethod_Decl_ReturnType();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__IOS = eINSTANCE.getMethod_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__VARIABLES = eINSTANCE.getMethod_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__TEMPS = eINSTANCE.getMethod_Decl_Temps();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__BODY = eINSTANCE.getMethod_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl <em>Class Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Class_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getClass_Decl()
     * @generated
     */
    EClass CLASS_DECL = eINSTANCE.getClass_Decl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECL__MODIFIER = eINSTANCE.getClass_Decl_Modifier();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__CLASS = eINSTANCE.getClass_Decl_Class();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__USINGS = eINSTANCE.getClass_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__EXTENDS = eINSTANCE.getClass_Decl_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__IMPLEMENTS = eINSTANCE.getClass_Decl_Implements();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__VARIABLES = eINSTANCE.getClass_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__METHODS = eINSTANCE.getClass_Decl_Methods();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ClassImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl <em>Interface Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Decl()
     * @generated
     */
    EClass INTERFACE_DECL = eINSTANCE.getInterface_Decl();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__INTERFACE = eINSTANCE.getInterface_Decl_Interface();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__USINGS = eINSTANCE.getInterface_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__EXTENDS = eINSTANCE.getInterface_Decl_Extends();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__METHODS = eINSTANCE.getInterface_Decl_Methods();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.InterfaceImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl <em>Method Prototype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Method_PrototypeImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod_Prototype()
     * @generated
     */
    EClass METHOD_PROTOTYPE = eINSTANCE.getMethod_Prototype();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PROTOTYPE__METHOD = eINSTANCE.getMethod_Prototype_Method();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_PROTOTYPE__RETURN_TYPE = eINSTANCE.getMethod_Prototype_ReturnType();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PROTOTYPE__IOS = eINSTANCE.getMethod_Prototype_Ios();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.MethodImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl <em>Interface Name List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Interface_Name_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInterface_Name_List()
     * @generated
     */
    EClass INTERFACE_NAME_LIST = eINSTANCE.getInterface_Name_List();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_NAME_LIST__INTERFACES = eINSTANCE.getInterface_Name_List_Interfaces();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl <em>Prog Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Prog_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProg_Decl()
     * @generated
     */
    EClass PROG_DECL = eINSTANCE.getProg_Decl();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__PROGRAM = eINSTANCE.getProg_Decl_Program();

    /**
     * The meta object literal for the '<em><b>Ios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__IOS = eINSTANCE.getProg_Decl_Ios();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__VARIABLES = eINSTANCE.getProg_Decl_Variables();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG_DECL__BODY = eINSTANCE.getProg_Decl_Body();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ProgramImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl <em>Namespace Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Namespace_DeclImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace_Decl()
     * @generated
     */
    EClass NAMESPACE_DECL = eINSTANCE.getNamespace_Decl();

    /**
     * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_DECL__INTERNAL = eINSTANCE.getNamespace_Decl_Internal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DECL__NAME = eINSTANCE.getNamespace_Decl_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DECL__USINGS = eINSTANCE.getNamespace_Decl_Usings();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DECL__ELEMENTS = eINSTANCE.getNamespace_Decl_Elements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.NamespaceImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Namespace_ElementsImpl <em>Namespace Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Namespace_ElementsImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamespace_Elements()
     * @generated
     */
    EClass NAMESPACE_ELEMENTS = eINSTANCE.getNamespace_Elements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl <em>Using Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Using_DirectiveImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getUsing_Directive()
     * @generated
     */
    EClass USING_DIRECTIVE = eINSTANCE.getUsing_Directive();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USING_DIRECTIVE__NAMESPACES = eINSTANCE.getUsing_Directive_Namespaces();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ExpressionImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl <em>Constant Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Constant_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getConstant_Expr()
     * @generated
     */
    EClass CONSTANT_EXPR = eINSTANCE.getConstant_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl <em>Variable Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Variable_AccessImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Access()
     * @generated
     */
    EClass VARIABLE_ACCESS = eINSTANCE.getVariable_Access();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ACCESS__VARIABLE = eINSTANCE.getVariable_Access_Variable();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ACCESS__ACCESS = eINSTANCE.getVariable_Access_Access();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl <em>Multibit Part Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Multibit_Part_AccessImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getMultibit_Part_Access()
     * @generated
     */
    EClass MULTIBIT_PART_ACCESS = eINSTANCE.getMultibit_Part_Access();

    /**
     * The meta object literal for the '<em><b>Bit Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIBIT_PART_ACCESS__BIT_INDEX = eINSTANCE.getMultibit_Part_Access_BitIndex();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIBIT_PART_ACCESS__SIZE = eINSTANCE.getMultibit_Part_Access_Size();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.CallableImpl <em>Callable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.CallableImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCallable()
     * @generated
     */
    EClass CALLABLE = eINSTANCE.getCallable();

    /**
     * The meta object literal for the '<em><b>Callable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALLABLE__CALLABLE = eINSTANCE.getCallable_Callable();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALLABLE__PARAMETERS = eINSTANCE.getCallable_Parameters();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl <em>Stmt List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Stmt_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt_List()
     * @generated
     */
    EClass STMT_LIST = eINSTANCE.getStmt_List();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT_LIST__STATEMENTS = eINSTANCE.getStmt_List_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STMT__TYPE = eINSTANCE.getStmt_Type();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl <em>Assign Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Assign_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssign_Stmt()
     * @generated
     */
    EClass ASSIGN_STMT = eINSTANCE.getAssign_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl <em>Variable Assign Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Variable_Assign_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getVariable_Assign_Stmt()
     * @generated
     */
    EClass VARIABLE_ASSIGN_STMT = eINSTANCE.getVariable_Assign_Stmt();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGN_STMT__VARIABLE = eINSTANCE.getVariable_Assign_Stmt_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGN_STMT__VALUE = eINSTANCE.getVariable_Assign_Stmt_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl <em>Assignment Attempt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Assignment_AttemptImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAssignment_Attempt()
     * @generated
     */
    EClass ASSIGNMENT_ATTEMPT = eINSTANCE.getAssignment_Attempt();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_ATTEMPT__VARIABLE = eINSTANCE.getAssignment_Attempt_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_ATTEMPT__VALUE = eINSTANCE.getAssignment_Attempt_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl <em>Param Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Param_AssignImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getParam_Assign()
     * @generated
     */
    EClass PARAM_ASSIGN = eINSTANCE.getParam_Assign();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl <em>Named Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Named_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getNamed_Value()
     * @generated
     */
    EClass NAMED_VALUE = eINSTANCE.getNamed_Value();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_VALUE__VARIABLE = eINSTANCE.getNamed_Value_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_VALUE__VALUE = eINSTANCE.getNamed_Value_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl <em>Linked Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Linked_ValueImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getLinked_Value()
     * @generated
     */
    EClass LINKED_VALUE = eINSTANCE.getLinked_Value();

    /**
     * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINKED_VALUE__NEGATED = eINSTANCE.getLinked_Value_Negated();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINKED_VALUE__VALUE = eINSTANCE.getLinked_Value_Value();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINKED_VALUE__VARIABLE = eINSTANCE.getLinked_Value_Variable();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.InRef_AssignImpl <em>In Ref Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.InRef_AssignImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getInRef_Assign()
     * @generated
     */
    EClass IN_REF_ASSIGN = eINSTANCE.getInRef_Assign();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_REF_ASSIGN__VARIABLE = eINSTANCE.getInRef_Assign_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_REF_ASSIGN__VALUE = eINSTANCE.getInRef_Assign_Value();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl <em>Selection Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Selection_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getSelection_Stmt()
     * @generated
     */
    EClass SELECTION_STMT = eINSTANCE.getSelection_Stmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_STMT__CONDITION = eINSTANCE.getSelection_Stmt_Condition();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl <em>IF Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIF_Stmt()
     * @generated
     */
    EClass IF_STMT = eINSTANCE.getIF_Stmt();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__STATEMENTS = eINSTANCE.getIF_Stmt_Statements();

    /**
     * The meta object literal for the '<em><b>Elseifs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__ELSEIFS = eINSTANCE.getIF_Stmt_Elseifs();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__ELSE = eINSTANCE.getIF_Stmt_Else();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl <em>ELSEIF Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ELSEIF_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSEIF_Stmt()
     * @generated
     */
    EClass ELSEIF_STMT = eINSTANCE.getELSEIF_Stmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSEIF_STMT__CONDITION = eINSTANCE.getELSEIF_Stmt_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSEIF_STMT__STATEMENTS = eINSTANCE.getELSEIF_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl <em>ELSE Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.ELSE_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getELSE_Stmt()
     * @generated
     */
    EClass ELSE_STMT = eINSTANCE.getELSE_Stmt();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_STMT__STATEMENTS = eINSTANCE.getELSE_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl <em>Case Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Stmt()
     * @generated
     */
    EClass CASE_STMT = eINSTANCE.getCase_Stmt();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STMT__CASES = eINSTANCE.getCase_Stmt_Cases();

    /**
     * The meta object literal for the '<em><b>Default Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_STMT__DEFAULT_STATEMENTS = eINSTANCE.getCase_Stmt_DefaultStatements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl <em>Case Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_SelectionImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_Selection()
     * @generated
     */
    EClass CASE_SELECTION = eINSTANCE.getCase_Selection();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_SELECTION__VALUES = eINSTANCE.getCase_Selection_Values();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_SELECTION__STATEMENTS = eINSTANCE.getCase_Selection_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_ListImpl <em>Case List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List()
     * @generated
     */
    EClass CASE_LIST = eINSTANCE.getCase_List();

    /**
     * The meta object literal for the '<em><b>Case Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_LIST__CASE_VALUES = eINSTANCE.getCase_List_CaseValues();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl <em>Case List Elem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Case_List_ElemImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCase_List_Elem()
     * @generated
     */
    EClass CASE_LIST_ELEM = eINSTANCE.getCase_List_Elem();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl <em>Iteration Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Iteration_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getIteration_Stmt()
     * @generated
     */
    EClass ITERATION_STMT = eINSTANCE.getIteration_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl <em>Exit Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Exit_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getExit_Stmt()
     * @generated
     */
    EClass EXIT_STMT = eINSTANCE.getExit_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl <em>Continue Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Continue_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getContinue_Stmt()
     * @generated
     */
    EClass CONTINUE_STMT = eINSTANCE.getContinue_Stmt();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.For_StmtImpl <em>For Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.For_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_Stmt()
     * @generated
     */
    EClass FOR_STMT = eINSTANCE.getFor_Stmt();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__VARIABLE = eINSTANCE.getFor_Stmt_Variable();

    /**
     * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__BOUNDS = eINSTANCE.getFor_Stmt_Bounds();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__STATEMENTS = eINSTANCE.getFor_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.For_ListImpl <em>For List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.For_ListImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getFor_List()
     * @generated
     */
    EClass FOR_LIST = eINSTANCE.getFor_List();

    /**
     * The meta object literal for the '<em><b>Low Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LIST__LOW_BOUND = eINSTANCE.getFor_List_LowBound();

    /**
     * The meta object literal for the '<em><b>Up Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LIST__UP_BOUND = eINSTANCE.getFor_List_UpBound();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LIST__STEP = eINSTANCE.getFor_List_Step();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.While_StmtImpl <em>While Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.While_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getWhile_Stmt()
     * @generated
     */
    EClass WHILE_STMT = eINSTANCE.getWhile_Stmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__CONDITION = eINSTANCE.getWhile_Stmt_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__STATEMENTS = eINSTANCE.getWhile_Stmt_Statements();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl <em>Repeat Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Repeat_StmtImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getRepeat_Stmt()
     * @generated
     */
    EClass REPEAT_STMT = eINSTANCE.getRepeat_Stmt();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STMT__STATEMENTS = eINSTANCE.getRepeat_Stmt_Statements();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT_STMT__CONDITION = eINSTANCE.getRepeat_Stmt_Condition();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl <em>Xor Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Xor_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getXor_Expr()
     * @generated
     */
    EClass XOR_EXPR = eINSTANCE.getXor_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.And_ExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.And_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAnd_Expr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAnd_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl <em>Compare Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Compare_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getCompare_Expr()
     * @generated
     */
    EClass COMPARE_EXPR = eINSTANCE.getCompare_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl <em>Equ Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Equ_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getEqu_Expr()
     * @generated
     */
    EClass EQU_EXPR = eINSTANCE.getEqu_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl <em>Add Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Add_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getAdd_Expr()
     * @generated
     */
    EClass ADD_EXPR = eINSTANCE.getAdd_Expr();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.TermImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl <em>Power Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bachmann.plc.st.stLanguage.impl.Power_ExprImpl
     * @see at.bachmann.plc.st.stLanguage.impl.StLanguagePackageImpl#getPower_Expr()
     * @generated
     */
    EClass POWER_EXPR = eINSTANCE.getPower_Expr();

  }

} //StLanguagePackage
