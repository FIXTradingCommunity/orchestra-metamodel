/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.AbbreviationType;
import io.fixprotocol._2016.fixrepository.AbbreviationsType;
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
 * An implementation of the model object '<em><b>Abbreviations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AbbreviationsTypeImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AbbreviationsTypeImpl#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbbreviationsTypeImpl extends MinimalEObjectImpl.Container implements AbbreviationsType {
  /**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
  protected EList<AbbreviationType> abbreviation;

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
  protected AbbreviationsTypeImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getAbbreviationsType();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<AbbreviationType> getAbbreviation() {
		if (abbreviation == null) {
			abbreviation = new EObjectContainmentEList<AbbreviationType>(AbbreviationType.class, this, FixrepositoryPackage.ABBREVIATIONS_TYPE__ABBREVIATION);
		}
		return abbreviation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ABBREVIATIONS_TYPE__LATEST_EP, oldLatestEP, latestEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__ABBREVIATION:
				return ((InternalEList<?>)getAbbreviation()).basicRemove(otherEnd, msgs);
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
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__ABBREVIATION:
				return getAbbreviation();
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__LATEST_EP:
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
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__ABBREVIATION:
				getAbbreviation().clear();
				getAbbreviation().addAll((Collection<? extends AbbreviationType>)newValue);
				return;
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__LATEST_EP:
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
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__ABBREVIATION:
				getAbbreviation().clear();
				return;
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__LATEST_EP:
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
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__ABBREVIATION:
				return abbreviation != null && !abbreviation.isEmpty();
			case FixrepositoryPackage.ABBREVIATIONS_TYPE__LATEST_EP:
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

} //AbbreviationsTypeImpl
