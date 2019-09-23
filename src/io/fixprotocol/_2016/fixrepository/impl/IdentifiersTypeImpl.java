/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.IdentifierType;
import io.fixprotocol._2016.fixrepository.IdentifiersType;

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
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.IdentifiersTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.IdentifiersTypeImpl#getCorrelate <em>Correlate</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.IdentifiersTypeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.IdentifiersTypeImpl#getAnnotation <em>Annotation</em>}</li>
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
    return FixrepositoryPackage.eINSTANCE.getIdentifiersType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, FixrepositoryPackage.IDENTIFIERS_TYPE__GROUP);
    }
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<IdentifierType> getCorrelate() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getIdentifiersType_Correlate());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<IdentifierType> getAssign() {
    return getGroup().list(FixrepositoryPackage.eINSTANCE.getIdentifiersType_Assign());
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void setAnnotation(Annotation newAnnotation) {
    if (newAnnotation != annotation) {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION, newAnnotation, newAnnotation));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        return ((InternalEList<?>)getCorrelate()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case FixrepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        return getCorrelate();
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        return getAssign();
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case FixrepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        getCorrelate().clear();
        getCorrelate().addAll((Collection<? extends IdentifierType>)newValue);
        return;
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        getAssign().clear();
        getAssign().addAll((Collection<? extends IdentifierType>)newValue);
        return;
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        getGroup().clear();
        return;
      case FixrepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        getCorrelate().clear();
        return;
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        getAssign().clear();
        return;
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.IDENTIFIERS_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case FixrepositoryPackage.IDENTIFIERS_TYPE__CORRELATE:
        return !getCorrelate().isEmpty();
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ASSIGN:
        return !getAssign().isEmpty();
      case FixrepositoryPackage.IDENTIFIERS_TYPE__ANNOTATION:
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
