/**
 */
package at.bachmann.plc.st.stLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Class_Decl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Class_Decl#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Class_Decl#getUsings <em>Usings</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Class_Decl#getExtends <em>Extends</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Class_Decl#getImplements <em>Implements</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Class_Decl#getVariables <em>Variables</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.Class_Decl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl()
 * @model
 * @generated
 */
public interface Class_Decl extends EObject
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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl_Modifier()
   * @model
   * @generated
   */
  String getModifier();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see #getModifier()
   * @generated
   */
  void setModifier(String value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(at.bachmann.plc.st.stLanguage.Class)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl_Class()
   * @model containment="true"
   * @generated
   */
  at.bachmann.plc.st.stLanguage.Class getClass_();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(at.bachmann.plc.st.stLanguage.Class value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl_Usings()
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
   * @see #setExtends(at.bachmann.plc.st.stLanguage.Class)
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl_Extends()
   * @model
   * @generated
   */
  at.bachmann.plc.st.stLanguage.Class getExtends();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getExtends <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(at.bachmann.plc.st.stLanguage.Class value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl_Implements()
   * @model containment="true"
   * @generated
   */
  Interface_Name_List getImplements();

  /**
   * Sets the value of the '{@link at.bachmann.plc.st.stLanguage.Class_Decl#getImplements <em>Implements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implements</em>' containment reference.
   * @see #getImplements()
   * @generated
   */
  void setImplements(Interface_Name_List value);

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Func_Var_Decls> getVariables();

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
   * @see at.bachmann.plc.st.stLanguage.StLanguagePackage#getClass_Decl_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method_Decl> getMethods();

} // Class_Decl
