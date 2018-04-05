/**
 */
package org.purl.dc.terms.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.purl.dc.elements._1._1.impl.SimpleLiteralImpl;

import org.purl.dc.terms.TermsPackage;
import org.purl.dc.terms.W3CDTF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>W3CDTF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.impl.W3CDTFImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W3CDTFImpl extends SimpleLiteralImpl implements W3CDTF {
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar VALUE_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected W3CDTFImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TermsPackage.Literals.W3CDTF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getValue() {
    return (XMLGregorianCalendar)getMixed().get(TermsPackage.Literals.W3CDTF__VALUE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(XMLGregorianCalendar newValue) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.W3CDTF__VALUE, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TermsPackage.W3CDTF__VALUE:
        return getValue();
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
      case TermsPackage.W3CDTF__VALUE:
        setValue((XMLGregorianCalendar)newValue);
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
      case TermsPackage.W3CDTF__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case TermsPackage.W3CDTF__VALUE:
        return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
    }
    return super.eIsSet(featureID);
  }

} //W3CDTFImpl
