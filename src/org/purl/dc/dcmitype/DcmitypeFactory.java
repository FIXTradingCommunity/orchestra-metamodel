/**
 */
package org.purl.dc.dcmitype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.purl.dc.dcmitype.DcmitypePackage
 * @generated
 */
public interface DcmitypeFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DcmitypeFactory eINSTANCE = org.purl.dc.dcmitype.impl.DcmitypeFactoryImpl.init();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DcmitypePackage getDcmitypePackage();

} //DcmitypeFactory
