/**
 */
package org.purl.dc.terms;

import org.purl.dc.elements._1._1.SimpleLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISO6393</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.ISO6393#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.TermsPackage#getISO6393()
 * @model extendedMetaData="name='ISO639-3' kind='simple'"
 * @generated
 */
public interface ISO6393 extends SimpleLiteral {
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.purl.dc.terms.TermsPackage#getISO6393_Value()
   * @model dataType="org.purl.dc.terms.ISO6393BaseBase" transient="true" volatile="true" derived="true"
   *        extendedMetaData="name=':2' kind='simple'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.purl.dc.terms.ISO6393#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ISO6393
