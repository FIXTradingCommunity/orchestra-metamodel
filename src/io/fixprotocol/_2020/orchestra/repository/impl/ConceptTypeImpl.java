/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.Annotation;
import io.fixprotocol._2020.orchestra.repository.ComponentRefType;
import io.fixprotocol._2020.orchestra.repository.ConceptType;
import io.fixprotocol._2020.orchestra.repository.FieldRefType;
import io.fixprotocol._2020.orchestra.repository.GroupRefType;
import io.fixprotocol._2020.orchestra.repository.MessageRefType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

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
 * An implementation of the model object '<em><b>Concept Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptTypeImpl extends MinimalEObjectImpl.Container implements ConceptType {
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
  protected ConceptTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getConceptType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, RepositoryPackage.CONCEPT_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getConceptType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getConceptType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getConceptType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageRefType> getMessageRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getConceptType_MessageRef());
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.CONCEPT_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.CONCEPT_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.CONCEPT_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CONCEPT_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CONCEPT_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.CONCEPT_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        return ((InternalEList<?>)getMessageRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.CONCEPT_TYPE__ANNOTATION:
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
      case RepositoryPackage.CONCEPT_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        return getComponentRef();
      case RepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        return getGroupRef();
      case RepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        return getFieldRef();
      case RepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        return getMessageRef();
      case RepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        return getAnnotation();
      case RepositoryPackage.CONCEPT_TYPE__NAME:
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
      case RepositoryPackage.CONCEPT_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case RepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case RepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case RepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        getMessageRef().addAll((Collection<? extends MessageRefType>)newValue);
        return;
      case RepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case RepositoryPackage.CONCEPT_TYPE__NAME:
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
      case RepositoryPackage.CONCEPT_TYPE__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case RepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case RepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case RepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        return;
      case RepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case RepositoryPackage.CONCEPT_TYPE__NAME:
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
      case RepositoryPackage.CONCEPT_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case RepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case RepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case RepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case RepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        return !getMessageRef().isEmpty();
      case RepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        return annotation != null;
      case RepositoryPackage.CONCEPT_TYPE__NAME:
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

} //ConceptTypeImpl
