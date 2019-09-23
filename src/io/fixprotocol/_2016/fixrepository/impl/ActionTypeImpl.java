/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.ActionType;
import io.fixprotocol._2016.fixrepository.ComponentRefType;
import io.fixprotocol._2016.fixrepository.ComponentType;
import io.fixprotocol._2016.fixrepository.FieldRefType;
import io.fixprotocol._2016.fixrepository.FieldType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupRefType;
import io.fixprotocol._2016.fixrepository.GroupType;
import io.fixprotocol._2016.fixrepository.MessageRefType;
import io.fixprotocol._2016.fixrepository.TimerSchedule;
import io.fixprotocol._2016.fixrepository.TriggerType;

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
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl#getTimerSchedule <em>Timer Schedule</em>}</li>
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
    return FixrepositoryPackage.eINSTANCE.getActionType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, FixrepositoryPackage.ACTION_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<FieldType> getField() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActionType_Field());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<FieldRefType> getFieldRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActionType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<ComponentType> getComponent() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActionType_Component());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActionType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<GroupType> getGroup1() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActionType_Group1());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<GroupRefType> getGroupRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActionType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public FeatureMap getGroup2() {
    if (group2 == null) {
      group2 = new BasicFeatureMap(this, FixrepositoryPackage.ACTION_TYPE__GROUP2);
    }
    return group2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<MessageRefType> getMessageRef() {
    return getGroup2().list(FixrepositoryPackage.eINSTANCE.getActionType_MessageRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<String> getAssign() {
    return getGroup2().list(FixrepositoryPackage.eINSTANCE.getActionType_Assign());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<TriggerType> getTrigger() {
    return getGroup2().list(FixrepositoryPackage.eINSTANCE.getActionType_Trigger());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<TimerSchedule> getTimerSchedule() {
    return getGroup2().list(FixrepositoryPackage.eINSTANCE.getActionType_TimerSchedule());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.ACTION_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__FIELD:
        return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__GROUP2:
        return ((InternalEList<?>)getGroup2()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        return ((InternalEList<?>)getMessageRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__TRIGGER:
        return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
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
      case FixrepositoryPackage.ACTION_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case FixrepositoryPackage.ACTION_TYPE__FIELD:
        return getField();
      case FixrepositoryPackage.ACTION_TYPE__FIELD_REF:
        return getFieldRef();
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT:
        return getComponent();
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        return getComponentRef();
      case FixrepositoryPackage.ACTION_TYPE__GROUP1:
        return getGroup1();
      case FixrepositoryPackage.ACTION_TYPE__GROUP_REF:
        return getGroupRef();
      case FixrepositoryPackage.ACTION_TYPE__GROUP2:
        if (coreType) return getGroup2();
        return ((FeatureMap.Internal)getGroup2()).getWrapper();
      case FixrepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        return getMessageRef();
      case FixrepositoryPackage.ACTION_TYPE__ASSIGN:
        return getAssign();
      case FixrepositoryPackage.ACTION_TYPE__TRIGGER:
        return getTrigger();
      case FixrepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
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
      case FixrepositoryPackage.ACTION_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends FieldType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends ComponentType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__GROUP1:
        getGroup1().clear();
        getGroup1().addAll((Collection<? extends GroupType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__GROUP2:
        ((FeatureMap.Internal)getGroup2()).set(newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        getMessageRef().addAll((Collection<? extends MessageRefType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__ASSIGN:
        getAssign().clear();
        getAssign().addAll((Collection<? extends String>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__TRIGGER:
        getTrigger().clear();
        getTrigger().addAll((Collection<? extends TriggerType>)newValue);
        return;
      case FixrepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
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
      case FixrepositoryPackage.ACTION_TYPE__GROUP:
        getGroup().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__FIELD:
        getField().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT:
        getComponent().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__GROUP2:
        getGroup2().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__ASSIGN:
        getAssign().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__TRIGGER:
        getTrigger().clear();
        return;
      case FixrepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
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
      case FixrepositoryPackage.ACTION_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__FIELD:
        return !getField().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT:
        return !getComponent().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__GROUP1:
        return !getGroup1().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__GROUP2:
        return group2 != null && !group2.isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__MESSAGE_REF:
        return !getMessageRef().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__ASSIGN:
        return !getAssign().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__TRIGGER:
        return !getTrigger().isEmpty();
      case FixrepositoryPackage.ACTION_TYPE__TIMER_SCHEDULE:
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
