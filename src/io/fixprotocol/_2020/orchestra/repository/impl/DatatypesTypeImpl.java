/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.DatatypeType;
import io.fixprotocol._2020.orchestra.repository.DatatypesType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

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
 * An implementation of the model object '<em><b>Datatypes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DatatypesTypeImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DatatypesTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DatatypesTypeImpl#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatatypesTypeImpl extends MinimalEObjectImpl.Container implements DatatypesType {
  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected EList<DatatypeType> datatype;

  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

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
  protected DatatypesTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getDatatypesType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DatatypeType> getDatatype() {
    if (datatype == null) {
      datatype = new EObjectContainmentEList<DatatypeType>(DatatypeType.class, this, RepositoryPackage.DATATYPES_TYPE__DATATYPE);
    }
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBase() {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(String newBase) {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.DATATYPES_TYPE__BASE, oldBase, base));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.DATATYPES_TYPE__LATEST_EP, oldLatestEP, latestEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.DATATYPES_TYPE__DATATYPE:
        return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
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
      case RepositoryPackage.DATATYPES_TYPE__DATATYPE:
        return getDatatype();
      case RepositoryPackage.DATATYPES_TYPE__BASE:
        return getBase();
      case RepositoryPackage.DATATYPES_TYPE__LATEST_EP:
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
      case RepositoryPackage.DATATYPES_TYPE__DATATYPE:
        getDatatype().clear();
        getDatatype().addAll((Collection<? extends DatatypeType>)newValue);
        return;
      case RepositoryPackage.DATATYPES_TYPE__BASE:
        setBase((String)newValue);
        return;
      case RepositoryPackage.DATATYPES_TYPE__LATEST_EP:
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
      case RepositoryPackage.DATATYPES_TYPE__DATATYPE:
        getDatatype().clear();
        return;
      case RepositoryPackage.DATATYPES_TYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case RepositoryPackage.DATATYPES_TYPE__LATEST_EP:
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
      case RepositoryPackage.DATATYPES_TYPE__DATATYPE:
        return datatype != null && !datatype.isEmpty();
      case RepositoryPackage.DATATYPES_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case RepositoryPackage.DATATYPES_TYPE__LATEST_EP:
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (base: ");
    result.append(base);
    result.append(", latestEP: ");
    result.append(latestEP);
    result.append(')');
    return result.toString();
  }

} //DatatypesTypeImpl
