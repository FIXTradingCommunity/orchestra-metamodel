/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.CategoriesType;
import io.fixprotocol._2016.fixrepository.CategoryType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categories Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoriesTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoriesTypeImpl#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoriesTypeImpl extends MinimalEObjectImpl.Container implements CategoriesType {
  /**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
  protected EList<CategoryType> category;

  /**
	 * The default value of the '{@link #getLatestEP() <em>Latest EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatestEP()
	 * @generated
	 * @ordered
	 */
  protected static final BigInteger LATEST_EP_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLatestEP() <em>Latest EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatestEP()
	 * @generated
	 * @ordered
	 */
  protected BigInteger latestEP = LATEST_EP_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CategoriesTypeImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getCategoriesType();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<CategoryType> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CategoryType>(CategoryType.class, this, FixrepositoryPackage.CATEGORIES_TYPE__CATEGORY);
		}
		return category;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BigInteger getLatestEP() {
		return latestEP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLatestEP(BigInteger newLatestEP) {
		BigInteger oldLatestEP = latestEP;
		latestEP = newLatestEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORIES_TYPE__LATEST_EP, oldLatestEP, latestEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.CATEGORIES_TYPE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case FixrepositoryPackage.CATEGORIES_TYPE__CATEGORY:
				return getCategory();
			case FixrepositoryPackage.CATEGORIES_TYPE__LATEST_EP:
				return getLatestEP();
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
			case FixrepositoryPackage.CATEGORIES_TYPE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CategoryType>)newValue);
				return;
			case FixrepositoryPackage.CATEGORIES_TYPE__LATEST_EP:
				setLatestEP((BigInteger)newValue);
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
			case FixrepositoryPackage.CATEGORIES_TYPE__CATEGORY:
				getCategory().clear();
				return;
			case FixrepositoryPackage.CATEGORIES_TYPE__LATEST_EP:
				setLatestEP(LATEST_EP_EDEFAULT);
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
			case FixrepositoryPackage.CATEGORIES_TYPE__CATEGORY:
				return category != null && !category.isEmpty();
			case FixrepositoryPackage.CATEGORIES_TYPE__LATEST_EP:
				return LATEST_EP_EDEFAULT == null ? latestEP != null : !LATEST_EP_EDEFAULT.equals(latestEP);
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
		result.append(" (latestEP: ");
		result.append(latestEP);
		result.append(')');
		return result.toString();
	}

} //CategoriesTypeImpl
