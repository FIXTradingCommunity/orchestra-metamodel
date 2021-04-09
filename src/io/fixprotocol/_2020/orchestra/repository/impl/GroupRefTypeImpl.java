/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.GroupRefType;
import io.fixprotocol._2020.orchestra.repository.RepositoryFactory;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.GroupRefTypeImpl#getImplMaxOccurs <em>Impl Max Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.GroupRefTypeImpl#getImplMinOccurs <em>Impl Min Occurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupRefTypeImpl extends ComponentRefTypeImpl implements GroupRefType {
  /**
   * The default value of the '{@link #getImplMaxOccurs() <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMaxOccurs()
   * @generated
   * @ordered
   */
  protected static final Object IMPL_MAX_OCCURS_EDEFAULT = RepositoryFactory.eINSTANCE.createFromString(RepositoryPackage.eINSTANCE.getUnboundedIntType(), "unbounded");

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupRefTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getGroupRefType();
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.GROUP_REF_TYPE__IMPL_MAX_OCCURS, oldImplMaxOccurs, implMaxOccurs, !oldImplMaxOccursESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.GROUP_REF_TYPE__IMPL_MAX_OCCURS, oldImplMaxOccurs, IMPL_MAX_OCCURS_EDEFAULT, oldImplMaxOccursESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.GROUP_REF_TYPE__IMPL_MIN_OCCURS, oldImplMinOccurs, implMinOccurs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MAX_OCCURS:
        return getImplMaxOccurs();
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MIN_OCCURS:
        return getImplMinOccurs();
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
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MAX_OCCURS:
        setImplMaxOccurs(newValue);
        return;
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MIN_OCCURS:
        setImplMinOccurs((BigInteger)newValue);
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
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MAX_OCCURS:
        unsetImplMaxOccurs();
        return;
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MIN_OCCURS:
        setImplMinOccurs(IMPL_MIN_OCCURS_EDEFAULT);
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
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MAX_OCCURS:
        return isSetImplMaxOccurs();
      case RepositoryPackage.GROUP_REF_TYPE__IMPL_MIN_OCCURS:
        return IMPL_MIN_OCCURS_EDEFAULT == null ? implMinOccurs != null : !IMPL_MIN_OCCURS_EDEFAULT.equals(implMinOccurs);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (implMaxOccurs: ");
    if (implMaxOccursESet) result.append(implMaxOccurs); else result.append("<unset>");
    result.append(", implMinOccurs: ");
    result.append(implMinOccurs);
    result.append(')');
    return result.toString();
  }

} //GroupRefTypeImpl
