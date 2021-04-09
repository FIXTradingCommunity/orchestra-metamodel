/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.ActorType;
import io.fixprotocol._2020.orchestra.repository.Annotation;
import io.fixprotocol._2020.orchestra.repository.ComponentRefType;
import io.fixprotocol._2020.orchestra.repository.ComponentType;
import io.fixprotocol._2020.orchestra.repository.FieldRefType;
import io.fixprotocol._2020.orchestra.repository.FieldType;
import io.fixprotocol._2020.orchestra.repository.GroupRefType;
import io.fixprotocol._2020.orchestra.repository.GroupType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.StateMachineType;
import io.fixprotocol._2020.orchestra.repository.TimerType;

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
 * An implementation of the model object '<em><b>Actor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getStates <em>States</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorTypeImpl extends MinimalEObjectImpl.Container implements ActorType {
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
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected Annotation annotation;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getActorType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, RepositoryPackage.ACTOR_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldType> getField() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_Field());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentType> getComponent() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_Component());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupType> getGroup1() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_Group1());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateMachineType> getStates() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_States());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TimerType> getTimer() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorType_Timer());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation getAnnotation() {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
    Annotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.ACTOR_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(Annotation newAnnotation) {
    if (newAnnotation != annotation) {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.ACTOR_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.ACTOR_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.ACTOR_TYPE__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.ACTOR_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.ACTOR_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__FIELD:
        return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__TIMER:
        return ((InternalEList<?>)getTimer()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTOR_TYPE__ANNOTATION:
        return basicSetAnnotation(null, msgs);
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
      case RepositoryPackage.ACTOR_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.ACTOR_TYPE__FIELD:
        return getField();
      case RepositoryPackage.ACTOR_TYPE__FIELD_REF:
        return getFieldRef();
      case RepositoryPackage.ACTOR_TYPE__COMPONENT:
        return getComponent();
      case RepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        return getComponentRef();
      case RepositoryPackage.ACTOR_TYPE__GROUP1:
        return getGroup1();
      case RepositoryPackage.ACTOR_TYPE__GROUP_REF:
        return getGroupRef();
      case RepositoryPackage.ACTOR_TYPE__STATES:
        return getStates();
      case RepositoryPackage.ACTOR_TYPE__TIMER:
        return getTimer();
      case RepositoryPackage.ACTOR_TYPE__ANNOTATION:
        return getAnnotation();
      case RepositoryPackage.ACTOR_TYPE__NAME:
        return getName();
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
      case RepositoryPackage.ACTOR_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends FieldType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends ComponentType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__GROUP1:
        getGroup1().clear();
        getGroup1().addAll((Collection<? extends GroupType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends StateMachineType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__TIMER:
        getTimer().clear();
        getTimer().addAll((Collection<? extends TimerType>)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case RepositoryPackage.ACTOR_TYPE__NAME:
        setName((String)newValue);
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
      case RepositoryPackage.ACTOR_TYPE__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__FIELD:
        getField().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__COMPONENT:
        getComponent().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__STATES:
        getStates().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__TIMER:
        getTimer().clear();
        return;
      case RepositoryPackage.ACTOR_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case RepositoryPackage.ACTOR_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case RepositoryPackage.ACTOR_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case RepositoryPackage.ACTOR_TYPE__FIELD:
        return !getField().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__COMPONENT:
        return !getComponent().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__GROUP1:
        return !getGroup1().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__STATES:
        return !getStates().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__TIMER:
        return !getTimer().isEmpty();
      case RepositoryPackage.ACTOR_TYPE__ANNOTATION:
        return annotation != null;
      case RepositoryPackage.ACTOR_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActorTypeImpl
