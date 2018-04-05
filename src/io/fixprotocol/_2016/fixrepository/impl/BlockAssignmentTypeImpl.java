/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.BlockAssignmentType;
import io.fixprotocol._2016.fixrepository.ComponentRefType;
import io.fixprotocol._2016.fixrepository.FieldRefType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupRefType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Assignment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.BlockAssignmentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.BlockAssignmentTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.BlockAssignmentTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.BlockAssignmentTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockAssignmentTypeImpl extends MinimalEObjectImpl.Container implements BlockAssignmentType {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockAssignmentTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getBlockAssignmentType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getBlockAssignmentType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getBlockAssignmentType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getBlockAssignmentType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__FIELD_REF:
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
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__COMPONENT_REF:
        return getComponentRef();
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP_REF:
        return getGroupRef();
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__FIELD_REF:
        return getFieldRef();
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
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
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
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP:
        getGroup().clear();
        return;
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__FIELD_REF:
        getFieldRef().clear();
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
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //BlockAssignmentTypeImpl
