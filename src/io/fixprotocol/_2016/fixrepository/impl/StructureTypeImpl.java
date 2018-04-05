/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.ComponentRefType;
import io.fixprotocol._2016.fixrepository.ComponentType;
import io.fixprotocol._2016.fixrepository.FieldRefType;
import io.fixprotocol._2016.fixrepository.FieldType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupRefType;
import io.fixprotocol._2016.fixrepository.GroupType;
import io.fixprotocol._2016.fixrepository.StructureType;

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
 * An implementation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl#getFieldRef <em>Field Ref</em>}</li>
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
    return FixrepositoryPackage.eINSTANCE.getStructureType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, FixrepositoryPackage.STRUCTURE_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentType> getComponent() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getStructureType_Component());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getStructureType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupType> getGroup1() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getStructureType_Group1());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getStructureType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldType> getField() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getStructureType_Field());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getStructureType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD:
        return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
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
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT:
        return getComponent();
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        return getComponentRef();
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP1:
        return getGroup1();
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        return getGroupRef();
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD:
        return getField();
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
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
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends ComponentType>)newValue);
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP1:
        getGroup1().clear();
        getGroup1().addAll((Collection<? extends GroupType>)newValue);
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends FieldType>)newValue);
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
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
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP:
        getGroup().clear();
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT:
        getComponent().clear();
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD:
        getField().clear();
        return;
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
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
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT:
        return !getComponent().isEmpty();
      case FixrepositoryPackage.STRUCTURE_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP1:
        return !getGroup1().isEmpty();
      case FixrepositoryPackage.STRUCTURE_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD:
        return !getField().isEmpty();
      case FixrepositoryPackage.STRUCTURE_TYPE__FIELD_REF:
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

} //StructureTypeImpl
