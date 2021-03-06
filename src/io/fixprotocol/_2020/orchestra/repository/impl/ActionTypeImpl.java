/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.ActionType;
import io.fixprotocol._2020.orchestra.repository.ComponentRefType;
import io.fixprotocol._2020.orchestra.repository.ComponentType;
import io.fixprotocol._2020.orchestra.repository.FieldRefType;
import io.fixprotocol._2020.orchestra.repository.FieldType;
import io.fixprotocol._2020.orchestra.repository.GroupRefType;
import io.fixprotocol._2020.orchestra.repository.GroupType;
import io.fixprotocol._2020.orchestra.repository.MessageRefType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.TimerSchedule;
import io.fixprotocol._2020.orchestra.repository.TriggerType;

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
 * An implementation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl#getTimerSchedule <em>Timer Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionTypeImpl extends MinimalEObjectImpl.Container implements ActionType {
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
   * The cached value of the '{@link #getGroup2() <em>Group2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup2()
   * @generated
   * @ordered
   */
  protected FeatureMap group2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getActionType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, RepositoryPackage.ACTION_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldType> getField() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActionType_Field());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActionType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentType> getComponent() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActionType_Component());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActionType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupType> getGroup1() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActionType_Group1());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActionType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup2() {
    if (group2 == null) {
      group2 = new BasicFeatureMap(this, RepositoryPackage.ACTION_TYPE__GROUP2);
    }
    return group2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageRefType> getMessageRef() {
    return getGroup2().list(RepositoryPackage.eINSTANCE.getActionType_MessageRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAssign() {
    return getGroup2().list(RepositoryPackage.eINSTANCE.getActionType_Assign());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TriggerType> getTrigger() {
    return getGroup2().list(RepositoryPackage.eINSTANCE.getActionType_Trigger());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TimerSchedule> getTimerSchedule() {
    return getGroup2().list(RepositoryPackage.eINSTANCE.getActionType_TimerSchedule());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.ACTION_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__FIELD:
        return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__GROUP2:
        return ((InternalEList<?>)getGroup2()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        return ((InternalEList<?>)getMessageRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__TRIGGER:
        return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
        return ((InternalEList<?>)getTimerSchedule()).basicRemove(otherEnd, msgs);
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
      case RepositoryPackage.ACTION_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.ACTION_TYPE__FIELD:
        return getField();
      case RepositoryPackage.ACTION_TYPE__FIELD_REF:
        return getFieldRef();
      case RepositoryPackage.ACTION_TYPE__COMPONENT:
        return getComponent();
      case RepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        return getComponentRef();
      case RepositoryPackage.ACTION_TYPE__GROUP1:
        return getGroup1();
      case RepositoryPackage.ACTION_TYPE__GROUP_REF:
        return getGroupRef();
      case RepositoryPackage.ACTION_TYPE__GROUP2:
        if (coreType) return getGroup2();
        return ((FeatureMap.Internal)getGroup2()).getWrapper();
      case RepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        return getMessageRef();
      case RepositoryPackage.ACTION_TYPE__ASSIGN:
        return getAssign();
      case RepositoryPackage.ACTION_TYPE__TRIGGER:
        return getTrigger();
      case RepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
        return getTimerSchedule();
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
      case RepositoryPackage.ACTION_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends FieldType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends ComponentType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__GROUP1:
        getGroup1().clear();
        getGroup1().addAll((Collection<? extends GroupType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__GROUP2:
        ((FeatureMap.Internal)getGroup2()).set(newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        getMessageRef().addAll((Collection<? extends MessageRefType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__ASSIGN:
        getAssign().clear();
        getAssign().addAll((Collection<? extends String>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__TRIGGER:
        getTrigger().clear();
        getTrigger().addAll((Collection<? extends TriggerType>)newValue);
        return;
      case RepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
        getTimerSchedule().clear();
        getTimerSchedule().addAll((Collection<? extends TimerSchedule>)newValue);
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
      case RepositoryPackage.ACTION_TYPE__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__FIELD:
        getField().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__COMPONENT:
        getComponent().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__GROUP2:
        getGroup2().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__ASSIGN:
        getAssign().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__TRIGGER:
        getTrigger().clear();
        return;
      case RepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
        getTimerSchedule().clear();
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
      case RepositoryPackage.ACTION_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case RepositoryPackage.ACTION_TYPE__FIELD:
        return !getField().isEmpty();
      case RepositoryPackage.ACTION_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case RepositoryPackage.ACTION_TYPE__COMPONENT:
        return !getComponent().isEmpty();
      case RepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case RepositoryPackage.ACTION_TYPE__GROUP1:
        return !getGroup1().isEmpty();
      case RepositoryPackage.ACTION_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case RepositoryPackage.ACTION_TYPE__GROUP2:
        return group2 != null && !group2.isEmpty();
      case RepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        return !getMessageRef().isEmpty();
      case RepositoryPackage.ACTION_TYPE__ASSIGN:
        return !getAssign().isEmpty();
      case RepositoryPackage.ACTION_TYPE__TRIGGER:
        return !getTrigger().isEmpty();
      case RepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
        return !getTimerSchedule().isEmpty();
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
    result.append(", group2: ");
    result.append(group2);
    result.append(')');
    return result.toString();
  }

} //ActionTypeImpl
