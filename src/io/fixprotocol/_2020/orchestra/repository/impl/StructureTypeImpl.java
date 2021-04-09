/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.ComponentRefType;
import io.fixprotocol._2020.orchestra.repository.FieldRefType;
import io.fixprotocol._2020.orchestra.repository.GroupRefType;
import io.fixprotocol._2020.orchestra.repository.MemberType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.StructureType;

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
 * An implementation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.StructureTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.StructureTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.StructureTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.StructureTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.StructureTypeImpl#getWhich <em>Which</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureTypeImpl extends MinimalEObjectImpl.Container implements StructureType {
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
   * The default value of the '{@link #getWhich() <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhich()
   * @generated
   * @ordered
   */
  protected static final MemberType WHICH_EDEFAULT = MemberType.ONE_OF;

  /**
   * The cached value of the '{@link #getWhich() <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhich()
   * @generated
   * @ordered
   */
  protected MemberType which = WHICH_EDEFAULT;

  /**
   * This is true if the Which attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean whichESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getStructureType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, RepositoryPackage.STRUCTURE_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getStructureType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getStructureType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getStructureType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberType getWhich() {
    return which;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhich(MemberType newWhich) {
    MemberType oldWhich = which;
    which = newWhich == null ? WHICH_EDEFAULT : newWhich;
    boolean oldWhichESet = whichESet;
    whichESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.STRUCTURE_TYPE__WHICH, oldWhich, which, !oldWhichESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetWhich() {
    MemberType oldWhich = which;
    boolean oldWhichESet = whichESet;
    which = WHICH_EDEFAULT;
    whichESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.STRUCTURE_TYPE__WHICH, oldWhich, WHICH_EDEFAULT, oldWhichESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetWhich() {
    return whichESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.STRUCTURE_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
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
      case RepositoryPackage.STRUCTURE_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        return getComponentRef();
      case RepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        return getGroupRef();
      case RepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
        return getFieldRef();
      case RepositoryPackage.STRUCTURE_TYPE__WHICH:
        return getWhich();
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
      case RepositoryPackage.STRUCTURE_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case RepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case RepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case RepositoryPackage.STRUCTURE_TYPE__WHICH:
        setWhich((MemberType)newValue);
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
      case RepositoryPackage.STRUCTURE_TYPE__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case RepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case RepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case RepositoryPackage.STRUCTURE_TYPE__WHICH:
        unsetWhich();
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
      case RepositoryPackage.STRUCTURE_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case RepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case RepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case RepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case RepositoryPackage.STRUCTURE_TYPE__WHICH:
        return isSetWhich();
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
    result.append(" (group: ");
    result.append(group);
    result.append(", which: ");
    if (whichESet) result.append(which); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //StructureTypeImpl
