/**
 */
package org.purl.dc.terms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.purl.dc.terms.TermsPackage
 * @generated
 */
public interface TermsFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TermsFactory eINSTANCE = org.purl.dc.terms.impl.TermsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Box</em>'.
   * @generated
   */
  Box createBox();

  /**
   * Returns a new object of class '<em>DCMI Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DCMI Type</em>'.
   * @generated
   */
  DCMIType createDCMIType();

  /**
   * Returns a new object of class '<em>DDC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DDC</em>'.
   * @generated
   */
  DDC createDDC();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Element Or Refinement Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Or Refinement Container</em>'.
   * @generated
   */
  ElementOrRefinementContainer createElementOrRefinementContainer();

  /**
   * Returns a new object of class '<em>IMT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IMT</em>'.
   * @generated
   */
  IMT createIMT();

  /**
   * Returns a new object of class '<em>ISO3166</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ISO3166</em>'.
   * @generated
   */
  ISO3166 createISO3166();

  /**
   * Returns a new object of class '<em>ISO6392</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ISO6392</em>'.
   * @generated
   */
  ISO6392 createISO6392();

  /**
   * Returns a new object of class '<em>ISO6393</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ISO6393</em>'.
   * @generated
   */
  ISO6393 createISO6393();

  /**
   * Returns a new object of class '<em>LCC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LCC</em>'.
   * @generated
   */
  LCC createLCC();

  /**
   * Returns a new object of class '<em>LCSH</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LCSH</em>'.
   * @generated
   */
  LCSH createLCSH();

  /**
   * Returns a new object of class '<em>MESH</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MESH</em>'.
   * @generated
   */
  MESH createMESH();

  /**
   * Returns a new object of class '<em>Period</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Period</em>'.
   * @generated
   */
  Period createPeriod();

  /**
   * Returns a new object of class '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point</em>'.
   * @generated
   */
  Point createPoint();

  /**
   * Returns a new object of class '<em>RFC1766</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RFC1766</em>'.
   * @generated
   */
  RFC1766 createRFC1766();

  /**
   * Returns a new object of class '<em>RFC3066</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RFC3066</em>'.
   * @generated
   */
  RFC3066 createRFC3066();

  /**
   * Returns a new object of class '<em>RFC4646</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RFC4646</em>'.
   * @generated
   */
  RFC4646 createRFC4646();

  /**
   * Returns a new object of class '<em>TGN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TGN</em>'.
   * @generated
   */
  TGN createTGN();

  /**
   * Returns a new object of class '<em>UDC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UDC</em>'.
   * @generated
   */
  UDC createUDC();

  /**
   * Returns a new object of class '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URI</em>'.
   * @generated
   */
  URI createURI();

  /**
   * Returns a new object of class '<em>W3CDTF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>W3CDTF</em>'.
   * @generated
   */
  W3CDTF createW3CDTF();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TermsPackage getTermsPackage();

} //TermsFactory
