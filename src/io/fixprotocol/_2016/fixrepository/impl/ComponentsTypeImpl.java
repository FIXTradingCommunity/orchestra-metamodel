/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.ComponentType;
import io.fixprotocol._2016.fixrepository.ComponentsType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupType;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ComponentsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ComponentsTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ComponentsTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ComponentsTypeImpl#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsTypeImpl extends MinimalEObjectImpl.Container implements ComponentsType {
  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected FeatureMap group;

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
  protected ComponentsTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getComponentsType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, FixrepositoryPackage.COMPONENTS_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentType> getComponent() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getComponentsType_Component());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupType> getGroup1() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getComponentsType_Group1());
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.COMPONENTS_TYPE__LATEST_EP, oldLatestEP, latestEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.COMPONENTS_TYPE__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
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
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case FixrepositoryPackage.COMPONENTS_TYPE__COMPONENT:
        return getComponent();
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP1:
        return getGroup1();
      case FixrepositoryPackage.COMPONENTS_TYPE__LATEST_EP:
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
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case FixrepositoryPackage.COMPONENTS_TYPE__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends ComponentType>)newValue);
        return;
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP1:
        getGroup1().clear();
        getGroup1().addAll((Collection<? extends GroupType>)newValue);
        return;
      case FixrepositoryPackage.COMPONENTS_TYPE__LATEST_EP:
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
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP:
        getGroup().clear();
        return;
      case FixrepositoryPackage.COMPONENTS_TYPE__COMPONENT:
        getComponent().clear();
        return;
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case FixrepositoryPackage.COMPONENTS_TYPE__LATEST_EP:
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
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case FixrepositoryPackage.COMPONENTS_TYPE__COMPONENT:
        return !getComponent().isEmpty();
      case FixrepositoryPackage.COMPONENTS_TYPE__GROUP1:
        return !getGroup1().isEmpty();
      case FixrepositoryPackage.COMPONENTS_TYPE__LATEST_EP:
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
    result.append(" (group: ");
    result.append(group);
    result.append(", latestEP: ");
    result.append(latestEP);
    result.append(')');
    return result.toString();
  }

} //ComponentsTypeImpl
