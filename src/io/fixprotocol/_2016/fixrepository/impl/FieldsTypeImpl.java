/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.FieldType;
import io.fixprotocol._2016.fixrepository.FieldsType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fields Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldsTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldsTypeImpl#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldsTypeImpl extends MinimalEObjectImpl.Container implements FieldsType {
  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected EList<FieldType> field;

  /**
   * The default value of the '{@link #getLatestEP() <em>Latest EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatestEP()
   * @generated
   * @ordered
   */
  protected static final BigInteger LATEST_EP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLatestEP() <em>Latest EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatestEP()
   * @generated
   * @ordered
   */
  protected BigInteger latestEP = LATEST_EP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldsTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getFieldsType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldType> getField() {
    if (field == null) {
      field = new EObjectContainmentEList<FieldType>(FieldType.class, this, FixrepositoryPackage.FIELDS_TYPE__FIELD);
    }
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getLatestEP() {
    return latestEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatestEP(BigInteger newLatestEP) {
    BigInteger oldLatestEP = latestEP;
    latestEP = newLatestEP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELDS_TYPE__LATEST_EP, oldLatestEP, latestEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.FIELDS_TYPE__FIELD:
        return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case FixrepositoryPackage.FIELDS_TYPE__FIELD:
        return getField();
      case FixrepositoryPackage.FIELDS_TYPE__LATEST_EP:
        return getLatestEP();
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
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case FixrepositoryPackage.FIELDS_TYPE__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends FieldType>)newValue);
        return;
      case FixrepositoryPackage.FIELDS_TYPE__LATEST_EP:
        setLatestEP((BigInteger)newValue);
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
      case FixrepositoryPackage.FIELDS_TYPE__FIELD:
        getField().clear();
        return;
      case FixrepositoryPackage.FIELDS_TYPE__LATEST_EP:
        setLatestEP(LATEST_EP_EDEFAULT);
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
      case FixrepositoryPackage.FIELDS_TYPE__FIELD:
        return field != null && !field.isEmpty();
      case FixrepositoryPackage.FIELDS_TYPE__LATEST_EP:
        return LATEST_EP_EDEFAULT == null ? latestEP != null : !LATEST_EP_EDEFAULT.equals(latestEP);
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
    result.append(" (latestEP: ");
    result.append(latestEP);
    result.append(')');
    return result.toString();
  }

} //FieldsTypeImpl
