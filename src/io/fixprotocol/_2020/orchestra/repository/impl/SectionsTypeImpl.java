/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.SectionType;
import io.fixprotocol._2020.orchestra.repository.SectionsType;

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
 * An implementation of the model object '<em><b>Sections Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.SectionsTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.SectionsTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.SectionsTypeImpl#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionsTypeImpl extends MinimalEObjectImpl.Container implements SectionsType {
  /**
   * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection()
   * @generated
   * @ordered
   */
  protected EList<SectionType> section;

  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

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
  protected SectionsTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getSectionsType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SectionType> getSection() {
    if (section == null) {
      section = new EObjectContainmentEList<SectionType>(SectionType.class, this, RepositoryPackage.SECTIONS_TYPE__SECTION);
    }
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBase() {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(String newBase) {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.SECTIONS_TYPE__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getLatestEP() {
    return latestEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatestEP(BigInteger newLatestEP) {
    BigInteger oldLatestEP = latestEP;
    latestEP = newLatestEP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.SECTIONS_TYPE__LATEST_EP, oldLatestEP, latestEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.SECTIONS_TYPE__SECTION:
        return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
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
      case RepositoryPackage.SECTIONS_TYPE__SECTION:
        return getSection();
      case RepositoryPackage.SECTIONS_TYPE__BASE:
        return getBase();
      case RepositoryPackage.SECTIONS_TYPE__LATEST_EP:
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
      case RepositoryPackage.SECTIONS_TYPE__SECTION:
        getSection().clear();
        getSection().addAll((Collection<? extends SectionType>)newValue);
        return;
      case RepositoryPackage.SECTIONS_TYPE__BASE:
        setBase((String)newValue);
        return;
      case RepositoryPackage.SECTIONS_TYPE__LATEST_EP:
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
      case RepositoryPackage.SECTIONS_TYPE__SECTION:
        getSection().clear();
        return;
      case RepositoryPackage.SECTIONS_TYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case RepositoryPackage.SECTIONS_TYPE__LATEST_EP:
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
      case RepositoryPackage.SECTIONS_TYPE__SECTION:
        return section != null && !section.isEmpty();
      case RepositoryPackage.SECTIONS_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case RepositoryPackage.SECTIONS_TYPE__LATEST_EP:
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
    result.append(" (base: ");
    result.append(base);
    result.append(", latestEP: ");
    result.append(latestEP);
    result.append(')');
    return result.toString();
  }

} //SectionsTypeImpl
