/**
 */
package at.bachmann.plc.st.stLanguage.impl;

import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Variable_Address;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl#getSize <em>Size</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl#getBitIndexes <em>Bit Indexes</em>}</li>
 *   <li>{@link at.bachmann.plc.st.stLanguage.impl.Variable_AddressImpl#getBitIndex <em>Bit Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Variable_AddressImpl extends MinimalEObjectImpl.Container implements Variable_Address
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBitIndexes() <em>Bit Indexes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitIndexes()
   * @generated
   * @ordered
   */
  protected EList<String> bitIndexes;

  /**
   * The cached value of the '{@link #getBitIndex() <em>Bit Index</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitIndex()
   * @generated
   * @ordered
   */
  protected EList<String> bitIndex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Variable_AddressImpl()
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
    return StLanguagePackage.Literals.VARIABLE_ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.VARIABLE_ADDRESS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StLanguagePackage.VARIABLE_ADDRESS__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBitIndexes()
  {
    if (bitIndexes == null)
    {
      bitIndexes = new EDataTypeEList<String>(String.class, this, StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEXES);
    }
    return bitIndexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBitIndex()
  {
    if (bitIndex == null)
    {
      bitIndex = new EDataTypeEList<String>(String.class, this, StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEX);
    }
    return bitIndex;
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
      case StLanguagePackage.VARIABLE_ADDRESS__TYPE:
        return getType();
      case StLanguagePackage.VARIABLE_ADDRESS__SIZE:
        return getSize();
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEXES:
        return getBitIndexes();
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEX:
        return getBitIndex();
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
      case StLanguagePackage.VARIABLE_ADDRESS__TYPE:
        setType((String)newValue);
        return;
      case StLanguagePackage.VARIABLE_ADDRESS__SIZE:
        setSize((String)newValue);
        return;
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEXES:
        getBitIndexes().clear();
        getBitIndexes().addAll((Collection<? extends String>)newValue);
        return;
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEX:
        getBitIndex().clear();
        getBitIndex().addAll((Collection<? extends String>)newValue);
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
      case StLanguagePackage.VARIABLE_ADDRESS__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case StLanguagePackage.VARIABLE_ADDRESS__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEXES:
        getBitIndexes().clear();
        return;
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEX:
        getBitIndex().clear();
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
      case StLanguagePackage.VARIABLE_ADDRESS__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case StLanguagePackage.VARIABLE_ADDRESS__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEXES:
        return bitIndexes != null && !bitIndexes.isEmpty();
      case StLanguagePackage.VARIABLE_ADDRESS__BIT_INDEX:
        return bitIndex != null && !bitIndex.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", size: ");
    result.append(size);
    result.append(", bitIndexes: ");
    result.append(bitIndexes);
    result.append(", bitIndex: ");
    result.append(bitIndex);
    result.append(')');
    return result.toString();
  }

} //Variable_AddressImpl
