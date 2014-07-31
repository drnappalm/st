/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.ELSEIF_Stmt;
import at.bachmann.plc.st.stLanguage.ELSE_Stmt;
import at.bachmann.plc.st.stLanguage.IF_Stmt;
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
 * An implementation of the model object '<em><b>IF Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl#getElseifs <em>Elseifs</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.IF_StmtImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IF_StmtImpl extends Selection_StmtImpl implements IF_Stmt
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected Stmt_List statements;

  /**
   * The cached value of the '{@link #getElseifs() <em>Elseifs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseifs()
   * @generated
   * @ordered
   */
  protected EList<ELSEIF_Stmt> elseifs;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected ELSE_Stmt else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IF_StmtImpl()
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
    return StLanguagePackage.Literals.IF_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt_List getStatements()
  {
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatements(Stmt_List newStatements, NotificationChain msgs)
  {
    Stmt_List oldStatements = statements;
    statements = newStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.IF_STMT__STATEMENTS, oldStatements, newStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatements(Stmt_List newStatements)
  {
    if (newStatements != statements)
    {
      NotificationChain msgs = null;
      if (statements != null)
        msgs = ((InternalEObject)statements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.IF_STMT__STATEMENTS, null, msgs);
      if (newStatements != null)
        msgs = ((InternalEObject)newStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.IF_STMT__STATEMENTS, null, msgs);
      msgs = basicSetStatements(newStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.IF_STMT__STATEMENTS, newStatements, newStatements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ELSEIF_Stmt> getElseifs()
  {
    if (elseifs == null)
    {
      elseifs = new EObjectContainmentEList<ELSEIF_Stmt>(ELSEIF_Stmt.class, this, StLanguagePackage.IF_STMT__ELSEIFS);
    }
    return elseifs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ELSE_Stmt getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(ELSE_Stmt newElse, NotificationChain msgs)
  {
    ELSE_Stmt oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.IF_STMT__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(ELSE_Stmt newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.IF_STMT__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.IF_STMT__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.IF_STMT__ELSE, newElse, newElse));
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
      case StLanguagePackage.IF_STMT__STATEMENTS:
        return basicSetStatements(null, msgs);
      case StLanguagePackage.IF_STMT__ELSEIFS:
        return ((InternalEList<?>)getElseifs()).basicRemove(otherEnd, msgs);
      case StLanguagePackage.IF_STMT__ELSE:
        return basicSetElse(null, msgs);
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
      case StLanguagePackage.IF_STMT__STATEMENTS:
        return getStatements();
      case StLanguagePackage.IF_STMT__ELSEIFS:
        return getElseifs();
      case StLanguagePackage.IF_STMT__ELSE:
        return getElse();
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
      case StLanguagePackage.IF_STMT__STATEMENTS:
        setStatements((Stmt_List)newValue);
        return;
      case StLanguagePackage.IF_STMT__ELSEIFS:
        getElseifs().clear();
        getElseifs().addAll((Collection<? extends ELSEIF_Stmt>)newValue);
        return;
      case StLanguagePackage.IF_STMT__ELSE:
        setElse((ELSE_Stmt)newValue);
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
      case StLanguagePackage.IF_STMT__STATEMENTS:
        setStatements((Stmt_List)null);
        return;
      case StLanguagePackage.IF_STMT__ELSEIFS:
        getElseifs().clear();
        return;
      case StLanguagePackage.IF_STMT__ELSE:
        setElse((ELSE_Stmt)null);
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
      case StLanguagePackage.IF_STMT__STATEMENTS:
        return statements != null;
      case StLanguagePackage.IF_STMT__ELSEIFS:
        return elseifs != null && !elseifs.isEmpty();
      case StLanguagePackage.IF_STMT__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //IF_StmtImpl
