/**
 */
package org.purl.dc.elements._1._1;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getAny <em>Any</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getRights <em>Rights</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getFormat <em>Format</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.DocumentRoot#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
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
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
  FeatureMap getMixed();

  /**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
  EMap<String, String> getXMLNSPrefixMap();

  /**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
  EMap<String, String> getXSISchemaLocation();

  /**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getDescription();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference.
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Any()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='any' namespace='##targetNamespace'"
	 * @generated
	 */
  SimpleLiteral getAny();

  /**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rights</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference.
	 * @see #setRights(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Rights()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getRights();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
  void setRights(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getTitle();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
  void setTitle(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Date()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getDate();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
  void setDate(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getIdentifier();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
  void setIdentifier(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Relation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getRelation();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
  void setRelation(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contributor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference.
	 * @see #setContributor(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Contributor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getContributor();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getContributor <em>Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' containment reference.
	 * @see #getContributor()
	 * @generated
	 */
  void setContributor(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coverage</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Coverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getCoverage();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
  void setCoverage(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Creator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getCreator();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
  void setCreator(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Format()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getFormat();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
  void setFormat(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Language()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getLanguage();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
  void setLanguage(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getPublisher();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
  void setPublisher(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Source()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getSource();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Subject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getSubject();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
  void setSubject(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SimpleLiteral)
	 * @see org.purl.dc.elements._1._1._1Package#getDocumentRoot_Type()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace' affiliation='any'"
	 * @generated
	 */
  SimpleLiteral getType();

  /**
	 * Sets the value of the '{@link org.purl.dc.elements._1._1.DocumentRoot#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
  void setType(SimpleLiteral value);

} // DocumentRoot
