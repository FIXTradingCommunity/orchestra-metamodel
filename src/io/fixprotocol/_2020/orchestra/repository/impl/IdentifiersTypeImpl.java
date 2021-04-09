/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.Annotation;
import io.fixprotocol._2020.orchestra.repository.IdentifierType;
import io.fixprotocol._2020.orchestra.repository.IdentifiersType;
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
 * An implementation of the model object '<em><b>Identifiers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.IdentifiersTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.IdentifiersTypeImpl#getCorrelate <em>Correlate</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.IdentifiersTypeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.IdentifiersTypeImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiersTypeImpl extends MinimalEObjectImpl.Container implements IdentifiersType {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentifiersTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getIdentifiersType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, RepositoryPackage.IDENTIFIERS_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IdentifierType> getCorrelate() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getIdentifiersType_Correlate());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IdentifierType> getAssign() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getIdentifiersType_Assign());
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        return ((InternalEList<?>)getCorrelate()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
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
      case RepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        return getCorrelate();
      case RepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        return getAssign();
      case RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
        return getAnnotation();
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
      case RepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        getCorrelate().clear();
        getCorrelate().addAll((Collection<? extends IdentifierType>)newValue);
        return;
      case RepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        getAssign().clear();
        getAssign().addAll((Collection<? extends IdentifierType>)newValue);
        return;
      case RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
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
      case RepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        getCorrelate().clear();
        return;
      case RepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        getAssign().clear();
        return;
      case RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
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
      case RepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case RepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        return !getCorrelate().isEmpty();
      case RepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        return !getAssign().isEmpty();
      case RepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
        return annotation != null;
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
    result.append(')');
    return result.toString();
  }

} //IdentifiersTypeImpl
