/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.ActorType;
import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.ComponentRefType;
import io.fixprotocol._2016.fixrepository.ComponentType;
import io.fixprotocol._2016.fixrepository.FieldRefType;
import io.fixprotocol._2016.fixrepository.FieldType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupRefType;
import io.fixprotocol._2016.fixrepository.GroupType;
import io.fixprotocol._2016.fixrepository.StateMachineType;
import io.fixprotocol._2016.fixrepository.TimerType;

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
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getStates <em>States</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl#getName <em>Name</em>}</li>
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
   * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected static final String EXTENDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected String extends_ = EXTENDS_EDEFAULT;

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
    return FixrepositoryPackage.eINSTANCE.getActorType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, FixrepositoryPackage.ACTOR_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldType> getField() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_Field());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentType> getComponent() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_Component());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupType> getGroup1() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_Group1());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateMachineType> getStates() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_States());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TimerType> getTimer() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getActorType_Timer());
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ACTOR_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.ACTOR_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.ACTOR_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ACTOR_TYPE__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtends() {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(String newExtends) {
    String oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ACTOR_TYPE__EXTENDS, oldExtends, extends_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ACTOR_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.ACTOR_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__FIELD:
        return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__GROUP1:
        return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__TIMER:
        return ((InternalEList<?>)getTimer()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.ACTOR_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.ACTOR_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case FixrepositoryPackage.ACTOR_TYPE__FIELD:
        return getField();
      case FixrepositoryPackage.ACTOR_TYPE__FIELD_REF:
        return getFieldRef();
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT:
        return getComponent();
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        return getComponentRef();
      case FixrepositoryPackage.ACTOR_TYPE__GROUP1:
        return getGroup1();
      case FixrepositoryPackage.ACTOR_TYPE__GROUP_REF:
        return getGroupRef();
      case FixrepositoryPackage.ACTOR_TYPE__STATES:
        return getStates();
      case FixrepositoryPackage.ACTOR_TYPE__TIMER:
        return getTimer();
      case FixrepositoryPackage.ACTOR_TYPE__ANNOTATION:
        return getAnnotation();
      case FixrepositoryPackage.ACTOR_TYPE__EXTENDS:
        return getExtends();
      case FixrepositoryPackage.ACTOR_TYPE__NAME:
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
      case FixrepositoryPackage.ACTOR_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__FIELD:
        getField().clear();
        getField().addAll((Collection<? extends FieldType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends ComponentType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__GROUP1:
        getGroup1().clear();
        getGroup1().addAll((Collection<? extends GroupType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends StateMachineType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__TIMER:
        getTimer().clear();
        getTimer().addAll((Collection<? extends TimerType>)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__EXTENDS:
        setExtends((String)newValue);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__NAME:
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
      case FixrepositoryPackage.ACTOR_TYPE__GROUP:
        getGroup().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__FIELD:
        getField().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT:
        getComponent().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__GROUP1:
        getGroup1().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__STATES:
        getStates().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__TIMER:
        getTimer().clear();
        return;
      case FixrepositoryPackage.ACTOR_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__EXTENDS:
        setExtends(EXTENDS_EDEFAULT);
        return;
      case FixrepositoryPackage.ACTOR_TYPE__NAME:
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
      case FixrepositoryPackage.ACTOR_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__FIELD:
        return !getField().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT:
        return !getComponent().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__GROUP1:
        return !getGroup1().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__STATES:
        return !getStates().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__TIMER:
        return !getTimer().isEmpty();
      case FixrepositoryPackage.ACTOR_TYPE__ANNOTATION:
        return annotation != null;
      case FixrepositoryPackage.ACTOR_TYPE__EXTENDS:
        return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
      case FixrepositoryPackage.ACTOR_TYPE__NAME:
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (group: ");
    result.append(group);
    result.append(", extends: ");
    result.append(extends_);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActorTypeImpl
