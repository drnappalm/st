/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.Case_Selection;
import at.bachmann.plc.st.stLanguage.Case_Stmt;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Stmt_List;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Case_StmtImpl#getDefaultStatements <em>Default Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Case_StmtImpl extends Selection_StmtImpl implements Case_Stmt
{
  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<Case_Selection> cases;

  /**
   * The cached value of the '{@link #getDefaultStatements() <em>Default Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultStatements()
   * @generated
   * @ordered
   */
  protected Stmt_List defaultStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Case_StmtImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StLanguagePackage.Literals.CASE_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Case_Selection> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<Case_Selection>(Case_Selection.class, this, StLanguagePackage.CASE_STMT__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt_List getDefaultStatements()
  {
    return defaultStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultStatements(Stmt_List newDefaultStatements, NotificationChain msgs)
  {
    Stmt_List oldDefaultStatements = defaultStatements;
    defaultStatements = newDefaultStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS, oldDefaultStatements, newDefaultStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultStatements(Stmt_List newDefaultStatements)
  {
    if (newDefaultStatements != defaultStatements)
    {
      NotificationChain msgs = null;
      if (defaultStatements != null)
        msgs = ((InternalEObject)defaultStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS, null, msgs);
      if (newDefaultStatements != null)
        msgs = ((InternalEObject)newDefaultStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS, null, msgs);
      msgs = basicSetDefaultStatements(newDefaultStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS, newDefaultStatements, newDefaultStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StLanguagePackage.CASE_STMT__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS:
        return basicSetDefaultStatements(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StLanguagePackage.CASE_STMT__CASES:
        return getCases();
      case StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS:
        return getDefaultStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StLanguagePackage.CASE_STMT__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends Case_Selection>)newValue);
        return;
      case StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS:
        setDefaultStatements((Stmt_List)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StLanguagePackage.CASE_STMT__CASES:
        getCases().clear();
        return;
      case StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS:
        setDefaultStatements((Stmt_List)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StLanguagePackage.CASE_STMT__CASES:
        return cases != null && !cases.isEmpty();
      case StLanguagePackage.CASE_STMT__DEFAULT_STATEMENTS:
        return defaultStatements != null;
    }
    return super.eIsSet(featureID);
  }

} //Case_StmtImpl
