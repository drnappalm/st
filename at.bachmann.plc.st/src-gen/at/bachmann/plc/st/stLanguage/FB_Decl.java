/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FB Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getFunctionblock <em>Functionblock</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getExtends <em>Extends</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getImplements <em>Implements</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getIos <em>Ios</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getTemps <em>Temps</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getMethods <em>Methods</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.FB_Decl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl()
 * @model
 * @generated
 */
public interface FB_Decl extends Namespace_Elements
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see #setModifier(String)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Modifier()
   * @model
   * @generated
   */
  String getModifier();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see #getModifier()
   * @generated
   */
  void setModifier(String value);

  /**
   * Returns the value of the '<em><b>Functionblock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functionblock</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionblock</em>' containment reference.
   * @see #setFunctionblock(FunctionBlock)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Functionblock()
   * @model containment="true"
   * @generated
   */
  FunctionBlock getFunctionblock();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getFunctionblock <em>Functionblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functionblock</em>' containment reference.
   * @see #getFunctionblock()
   * @generated
   */
  void setFunctionblock(FunctionBlock value);

  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Using_Directive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Usings()
   * @model containment="true"
   * @generated
   */
  EList<Using_Directive> getUsings();

  /**
   * Returns the value of the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' reference.
   * @see #setExtends(FunctionBlock)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Extends()
   * @model
   * @generated
   */
  FunctionBlock getExtends();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getExtends <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(FunctionBlock value);

  /**
   * Returns the value of the '<em><b>Implements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' containment reference.
   * @see #setImplements(Interface_Name_List)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Implements()
   * @model containment="true"
   * @generated
   */
  Interface_Name_List getImplements();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getImplements <em>Implements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implements</em>' containment reference.
   * @see #getImplements()
   * @generated
   */
  void setImplements(Interface_Name_List value);

  /**
   * Returns the value of the '<em><b>Ios</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.FB_IO_Var_Decls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ios</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Ios()
   * @model containment="true"
   * @generated
   */
  EList<FB_IO_Var_Decls> getIos();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Func_Var_Decls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Func_Var_Decls> getVariables();

  /**
   * Returns the value of the '<em><b>Temps</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Temp_Var_Decls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temps</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Temps()
   * @model containment="true"
   * @generated
   */
  EList<Temp_Var_Decls> getTemps();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link at.bachmann.plc.st.stLanguage.Method_Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method_Decl> getMethods();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(FB_Body)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getFB_Decl_Body()
   * @model containment="true"
   * @generated
   */
  FB_Body getBody();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.FB_Decl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(FB_Body value);

} // FB_Decl
