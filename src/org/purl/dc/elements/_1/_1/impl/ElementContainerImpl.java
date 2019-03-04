/**
 */
package org.purl.dc.elements._1._1.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.purl.dc.elements._1._1.ElementContainer;
import org.purl.dc.elements._1._1.SimpleLiteral;
import org.purl.dc.elements._1._1._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.elements._1._1.impl.ElementContainerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.ElementContainerImpl#getAnyGroup <em>Any Group</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.ElementContainerImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementContainerImpl extends MinimalEObjectImpl.Container implements ElementContainer {
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
  protected ElementContainerImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return _1Package.Literals.ELEMENT_CONTAINER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _1Package.ELEMENT_CONTAINER__GROUP);
		}
		return group;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FeatureMap getAnyGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(_1Package.Literals.ELEMENT_CONTAINER__ANY_GROUP);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<SimpleLiteral> getAny() {
		return getAnyGroup().list(_1Package.Literals.ELEMENT_CONTAINER__ANY);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ELEMENT_CONTAINER__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _1Package.ELEMENT_CONTAINER__ANY_GROUP:
				return ((InternalEList<?>)getAnyGroup()).basicRemove(otherEnd, msgs);
			case _1Package.ELEMENT_CONTAINER__ANY:
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
			case _1Package.ELEMENT_CONTAINER__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _1Package.ELEMENT_CONTAINER__ANY_GROUP:
				if (coreType) return getAnyGroup();
				return ((FeatureMap.Internal)getAnyGroup()).getWrapper();
			case _1Package.ELEMENT_CONTAINER__ANY:
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
			case _1Package.ELEMENT_CONTAINER__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _1Package.ELEMENT_CONTAINER__ANY_GROUP:
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
			case _1Package.ELEMENT_CONTAINER__GROUP:
				getGroup().clear();
				return;
			case _1Package.ELEMENT_CONTAINER__ANY_GROUP:
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
			case _1Package.ELEMENT_CONTAINER__GROUP:
				return group != null && !group.isEmpty();
			case _1Package.ELEMENT_CONTAINER__ANY_GROUP:
				return !getAnyGroup().isEmpty();
			case _1Package.ELEMENT_CONTAINER__ANY:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ElementContainerImpl
