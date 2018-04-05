/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.FixrepositoryFactory;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.GroupTypeImpl#getImplMaxOccurs <em>Impl Max Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.GroupTypeImpl#getImplMinOccurs <em>Impl Min Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.GroupTypeImpl#getNumInGroupId <em>Num In Group Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.GroupTypeImpl#getNumInGroupName <em>Num In Group Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupTypeImpl extends ComponentTypeImpl implements GroupType {
  /**
   * The default value of the '{@link #getImplMaxOccurs() <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMaxOccurs()
   * @generated
   * @ordered
   */
  protected static final Object IMPL_MAX_OCCURS_EDEFAULT = FixrepositoryFactory.eINSTANCE.createFromString(FixrepositoryPackage.eINSTANCE.getUnboundedIntType(), "unbounded");

  /**
   * The cached value of the '{@link #getImplMaxOccurs() <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMaxOccurs()
   * @generated
   * @ordered
   */
  protected Object implMaxOccurs = IMPL_MAX_OCCURS_EDEFAULT;

  /**
   * This is true if the Impl Max Occurs attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean implMaxOccursESet;

  /**
   * The default value of the '{@link #getImplMinOccurs() <em>Impl Min Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMinOccurs()
   * @generated
   * @ordered
   */
  protected static final BigInteger IMPL_MIN_OCCURS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplMinOccurs() <em>Impl Min Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMinOccurs()
   * @generated
   * @ordered
   */
  protected BigInteger implMinOccurs = IMPL_MIN_OCCURS_EDEFAULT;

  /**
   * The default value of the '{@link #getNumInGroupId() <em>Num In Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumInGroupId()
   * @generated
   * @ordered
   */
  protected static final BigInteger NUM_IN_GROUP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumInGroupId() <em>Num In Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumInGroupId()
   * @generated
   * @ordered
   */
  protected BigInteger numInGroupId = NUM_IN_GROUP_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getNumInGroupName() <em>Num In Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumInGroupName()
   * @generated
   * @ordered
   */
  protected static final String NUM_IN_GROUP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumInGroupName() <em>Num In Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumInGroupName()
   * @generated
   * @ordered
   */
  protected String numInGroupName = NUM_IN_GROUP_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getGroupType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImplMaxOccurs() {
    return implMaxOccurs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplMaxOccurs(Object newImplMaxOccurs) {
    Object oldImplMaxOccurs = implMaxOccurs;
    implMaxOccurs = newImplMaxOccurs;
    boolean oldImplMaxOccursESet = implMaxOccursESet;
    implMaxOccursESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.GROUP_TYPE__IMPL_MAX_OCCURS, oldImplMaxOccurs, implMaxOccurs, !oldImplMaxOccursESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetImplMaxOccurs() {
    Object oldImplMaxOccurs = implMaxOccurs;
    boolean oldImplMaxOccursESet = implMaxOccursESet;
    implMaxOccurs = IMPL_MAX_OCCURS_EDEFAULT;
    implMaxOccursESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.GROUP_TYPE__IMPL_MAX_OCCURS, oldImplMaxOccurs, IMPL_MAX_OCCURS_EDEFAULT, oldImplMaxOccursESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetImplMaxOccurs() {
    return implMaxOccursESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getImplMinOccurs() {
    return implMinOccurs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplMinOccurs(BigInteger newImplMinOccurs) {
    BigInteger oldImplMinOccurs = implMinOccurs;
    implMinOccurs = newImplMinOccurs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.GROUP_TYPE__IMPL_MIN_OCCURS, oldImplMinOccurs, implMinOccurs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getNumInGroupId() {
    return numInGroupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumInGroupId(BigInteger newNumInGroupId) {
    BigInteger oldNumInGroupId = numInGroupId;
    numInGroupId = newNumInGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_ID, oldNumInGroupId, numInGroupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumInGroupName() {
    return numInGroupName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumInGroupName(String newNumInGroupName) {
    String oldNumInGroupName = numInGroupName;
    numInGroupName = newNumInGroupName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_NAME, oldNumInGroupName, numInGroupName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MAX_OCCURS:
        return getImplMaxOccurs();
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MIN_OCCURS:
        return getImplMinOccurs();
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_ID:
        return getNumInGroupId();
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_NAME:
        return getNumInGroupName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MAX_OCCURS:
        setImplMaxOccurs(newValue);
        return;
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MIN_OCCURS:
        setImplMinOccurs((BigInteger)newValue);
        return;
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_ID:
        setNumInGroupId((BigInteger)newValue);
        return;
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_NAME:
        setNumInGroupName((String)newValue);
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
  public void eUnset(int featureID) {
    switch (featureID) {
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MAX_OCCURS:
        unsetImplMaxOccurs();
        return;
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MIN_OCCURS:
        setImplMinOccurs(IMPL_MIN_OCCURS_EDEFAULT);
        return;
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_ID:
        setNumInGroupId(NUM_IN_GROUP_ID_EDEFAULT);
        return;
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_NAME:
        setNumInGroupName(NUM_IN_GROUP_NAME_EDEFAULT);
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
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MAX_OCCURS:
        return isSetImplMaxOccurs();
      case FixrepositoryPackage.GROUP_TYPE__IMPL_MIN_OCCURS:
        return IMPL_MIN_OCCURS_EDEFAULT == null ? implMinOccurs != null : !IMPL_MIN_OCCURS_EDEFAULT.equals(implMinOccurs);
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_ID:
        return NUM_IN_GROUP_ID_EDEFAULT == null ? numInGroupId != null : !NUM_IN_GROUP_ID_EDEFAULT.equals(numInGroupId);
      case FixrepositoryPackage.GROUP_TYPE__NUM_IN_GROUP_NAME:
        return NUM_IN_GROUP_NAME_EDEFAULT == null ? numInGroupName != null : !NUM_IN_GROUP_NAME_EDEFAULT.equals(numInGroupName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (implMaxOccurs: ");
    if (implMaxOccursESet) result.append(implMaxOccurs); else result.append("<unset>");
    result.append(", implMinOccurs: ");
    result.append(implMinOccurs);
    result.append(", numInGroupId: ");
    result.append(numInGroupId);
    result.append(", numInGroupName: ");
    result.append(numInGroupName);
    result.append(')');
    return result.toString();
  }

} //GroupTypeImpl
