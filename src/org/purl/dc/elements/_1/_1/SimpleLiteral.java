/**
 */
package org.purl.dc.elements._1._1;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             This is the default type for all of the DC elements.
 *             It permits text content only with optional
 *             xml:lang attribute.
 *             Text is allowed because mixed="true", but sub-elements
 *             are disallowed because minOccurs="0" and maxOccurs="0" 
 *             are on the xs:any tag.
 * 
 *     	    This complexType allows for restriction or extension permitting
 *             child elements.
 *     	
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.elements._1._1.SimpleLiteral#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.SimpleLiteral#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.elements._1._1._1Package#getSimpleLiteral()
 * @model extendedMetaData="name='SimpleLiteral' kind='mixed'"
 * @generated
 */
public interface SimpleLiteral extends EObject {
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see org.purl.dc.elements._1._1._1Package#getSimpleLiteral_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
  FeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * In due course, we should install the relevant ISO 2- and 3-letter
   *          codes as the enumerated possible values . . .
   * <!-- end-model-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see #setLang(String)
   * @see org.purl.dc.elements._1._1._1Package#getSimpleLiteral_Lang()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
   *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link org.purl.dc.elements._1._1.SimpleLiteral#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

} // SimpleLiteral
