/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.For_List;
import at.bachmann.plc.st.stLanguage.For_Stmt;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Stmt_List;
import at.bachmann.plc.st.stLanguage.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.For_StmtImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.For_StmtImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.For_StmtImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class For_StmtImpl extends Iteration_StmtImpl implements For_Stmt
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBounds()
   * @generated
   * @ordered
   */
  protected For_List bounds;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected For_StmtImpl()
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
    return StLanguagePackage.Literals.FOR_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (Variable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StLanguagePackage.FOR_STMT__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_STMT__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_List getBounds()
  {
    return bounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBounds(For_List newBounds, NotificationChain msgs)
  {
    For_List oldBounds = bounds;
    bounds = newBounds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_STMT__BOUNDS, oldBounds, newBounds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBounds(For_List newBounds)
  {
    if (newBounds != bounds)
    {
      NotificationChain msgs = null;
      if (bounds != null)
        msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_STMT__BOUNDS, null, msgs);
      if (newBounds != null)
        msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_STMT__BOUNDS, null, msgs);
      msgs = basicSetBounds(newBounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_STMT__BOUNDS, newBounds, newBounds));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_STMT__STATEMENTS, oldStatements, newStatements);
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
        msgs = ((InternalEObject)statements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_STMT__STATEMENTS, null, msgs);
      if (newStatements != null)
        msgs = ((InternalEObject)newStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StLanguagePackage.FOR_STMT__STATEMENTS, null, msgs);
      msgs = basicSetStatements(newStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.FOR_STMT__STATEMENTS, newStatements, newStatements));
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
      case StLanguagePackage.FOR_STMT__BOUNDS:
        return basicSetBounds(null, msgs);
      case StLanguagePackage.FOR_STMT__STATEMENTS:
        return basicSetStatements(null, msgs);
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
      case StLanguagePackage.FOR_STMT__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case StLanguagePackage.FOR_STMT__BOUNDS:
        return getBounds();
      case StLanguagePackage.FOR_STMT__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StLanguagePackage.FOR_STMT__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case StLanguagePackage.FOR_STMT__BOUNDS:
        setBounds((For_List)newValue);
        return;
      case StLanguagePackage.FOR_STMT__STATEMENTS:
        setStatements((Stmt_List)newValue);
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
      case StLanguagePackage.FOR_STMT__VARIABLE:
        setVariable((Variable)null);
        return;
      case StLanguagePackage.FOR_STMT__BOUNDS:
        setBounds((For_List)null);
        return;
      case StLanguagePackage.FOR_STMT__STATEMENTS:
        setStatements((Stmt_List)null);
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
      case StLanguagePackage.FOR_STMT__VARIABLE:
        return variable != null;
      case StLanguagePackage.FOR_STMT__BOUNDS:
        return bounds != null;
      case StLanguagePackage.FOR_STMT__STATEMENTS:
        return statements != null;
    }
    return super.eIsSet(featureID);
  }

} //For_StmtImpl
