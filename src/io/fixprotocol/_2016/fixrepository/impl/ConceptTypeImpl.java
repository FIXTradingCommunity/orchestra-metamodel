/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.ComponentRefType;
import io.fixprotocol._2016.fixrepository.ConceptType;
import io.fixprotocol._2016.fixrepository.FieldRefType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupRefType;
import io.fixprotocol._2016.fixrepository.MessageRefType;

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
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl#getOid <em>Oid</em>}</li>
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
   * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOid()
   * @generated
   * @ordered
   */
  protected static final String OID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOid()
   * @generated
   * @ordered
   */
  protected String oid = OID_EDEFAULT;

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
    return FixrepositoryPackage.eINSTANCE.getConceptType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, FixrepositoryPackage.CONCEPT_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getConceptType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getConceptType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getConceptType_FieldRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageRefType> getMessageRef() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getConceptType_MessageRef());
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CONCEPT_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOid() {
    return oid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOid(String newOid) {
    String oldOid = oid;
    oid = newOid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CONCEPT_TYPE__OID, oldOid, oid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        return ((InternalEList<?>)getMessageRef()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case FixrepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        return getComponentRef();
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        return getGroupRef();
      case FixrepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        return getFieldRef();
      case FixrepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        return getMessageRef();
      case FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        return getAnnotation();
      case FixrepositoryPackage.CONCEPT_TYPE__NAME:
        return getName();
      case FixrepositoryPackage.CONCEPT_TYPE__OID:
        return getOid();
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
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        getMessageRef().addAll((Collection<? extends MessageRefType>)newValue);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__NAME:
        setName((String)newValue);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__OID:
        setOid((String)newValue);
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
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP:
        getGroup().clear();
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        getMessageRef().clear();
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.CONCEPT_TYPE__OID:
        setOid(OID_EDEFAULT);
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
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case FixrepositoryPackage.CONCEPT_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case FixrepositoryPackage.CONCEPT_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case FixrepositoryPackage.CONCEPT_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case FixrepositoryPackage.CONCEPT_TYPE__MESSAGE_REF:
        return !getMessageRef().isEmpty();
      case FixrepositoryPackage.CONCEPT_TYPE__ANNOTATION:
        return annotation != null;
      case FixrepositoryPackage.CONCEPT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FixrepositoryPackage.CONCEPT_TYPE__OID:
        return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT.equals(oid);
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
    result.append(", name: ");
    result.append(name);
    result.append(", oid: ");
    result.append(oid);
    result.append(')');
    return result.toString();
  }

} //ConceptTypeImpl
