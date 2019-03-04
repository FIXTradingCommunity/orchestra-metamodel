/**
 */
package org.purl.dc.elements._1._1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.purl.dc.elements._1._1._1Package
 * @generated
 */
public interface _1Factory extends EFactory {
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  _1Factory eINSTANCE = org.purl.dc.elements._1._1.impl._1FactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Element Container</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Container</em>'.
	 * @generated
	 */
  ElementContainer createElementContainer();

  /**
	 * Returns a new object of class '<em>Simple Literal</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Literal</em>'.
	 * @generated
	 */
  SimpleLiteral createSimpleLiteral();

  /**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
  DocumentRoot createDocumentRoot();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  _1Package get_1Package();

} //_1Factory
