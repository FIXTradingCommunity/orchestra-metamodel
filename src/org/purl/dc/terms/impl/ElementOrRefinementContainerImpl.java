/**
 */
package org.purl.dc.terms.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.purl.dc.elements._1._1.SimpleLiteral;

import org.purl.dc.terms.ElementOrRefinementContainer;
import org.purl.dc.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Or Refinement Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.impl.ElementOrRefinementContainerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.ElementOrRefinementContainerImpl#getAnyGroup <em>Any Group</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.ElementOrRefinementContainerImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementOrRefinementContainerImpl extends MinimalEObjectImpl.Container implements ElementOrRefinementContainer {
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
  protected ElementOrRefinementContainerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TermsPackage.Literals.ELEMENT_OR_REFINEMENT_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getAnyGroup() {
    return (FeatureMap)getGroup().<FeatureMap.Entry>list(TermsPackage.Literals.ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SimpleLiteral> getAny() {
    return getAnyGroup().list(TermsPackage.Literals.ELEMENT_OR_REFINEMENT_CONTAINER__ANY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP:
        return ((InternalEList<?>)getAnyGroup()).basicRemove(otherEnd, msgs);
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY:
        return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP:
        if (coreType) return getAnyGroup();
        return ((FeatureMap.Internal)getAnyGroup()).getWrapper();
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY:
        return getAny();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP:
        ((FeatureMap.Internal)getAnyGroup()).set(newValue);
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
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__GROUP:
        getGroup().clear();
        return;
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP:
        getAnyGroup().clear();
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
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__GROUP:
        return group != null && !group.isEmpty();
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP:
        return !getAnyGroup().isEmpty();
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER__ANY:
        return !getAny().isEmpty();
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

} //ElementOrRefinementContainerImpl
