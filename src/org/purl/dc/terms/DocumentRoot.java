/**
 */
package org.purl.dc.terms;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.purl.dc.elements._1._1.SimpleLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getRights <em>Rights</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAccrualMethod <em>Accrual Method</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAccrualPeriodicity <em>Accrual Periodicity</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAccrualPolicy <em>Accrual Policy</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getAvailable <em>Available</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getCreated <em>Created</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getDateAccepted <em>Date Accepted</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getDateCopyrighted <em>Date Copyrighted</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getDateSubmitted <em>Date Submitted</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getFormat <em>Format</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getHasFormat <em>Has Format</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getHasVersion <em>Has Version</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getInstructionalMethod <em>Instructional Method</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIsFormatOf <em>Is Format Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIsReferencedBy <em>Is Referenced By</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIsReplacedBy <em>Is Replaced By</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIsRequiredBy <em>Is Required By</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getIsVersionOf <em>Is Version Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getLicense <em>License</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getMediator <em>Mediator</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getModified <em>Modified</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getReferences <em>References</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link org.purl.dc.terms.DocumentRoot#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot()
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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Mixed()
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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
  EMap<String, String> getXSISchemaLocation();

  /**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Abstract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace' affiliation='description'"
	 * @generated
	 */
  SimpleLiteral getAbstract();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
  void setAbstract(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#description'"
	 * @generated
	 */
  SimpleLiteral getDescription();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Access Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Rights</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Rights</em>' containment reference.
	 * @see #setAccessRights(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_AccessRights()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accessRights' namespace='##targetNamespace' affiliation='rights'"
	 * @generated
	 */
  SimpleLiteral getAccessRights();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAccessRights <em>Access Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Rights</em>' containment reference.
	 * @see #getAccessRights()
	 * @generated
	 */
  void setAccessRights(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Rights()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#rights'"
	 * @generated
	 */
  SimpleLiteral getRights();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
  void setRights(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Accrual Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accrual Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Accrual Method</em>' containment reference.
	 * @see #setAccrualMethod(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_AccrualMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accrualMethod' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#any'"
	 * @generated
	 */
  SimpleLiteral getAccrualMethod();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAccrualMethod <em>Accrual Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrual Method</em>' containment reference.
	 * @see #getAccrualMethod()
	 * @generated
	 */
  void setAccrualMethod(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Accrual Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accrual Periodicity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Accrual Periodicity</em>' containment reference.
	 * @see #setAccrualPeriodicity(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_AccrualPeriodicity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accrualPeriodicity' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#any'"
	 * @generated
	 */
  SimpleLiteral getAccrualPeriodicity();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAccrualPeriodicity <em>Accrual Periodicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrual Periodicity</em>' containment reference.
	 * @see #getAccrualPeriodicity()
	 * @generated
	 */
  void setAccrualPeriodicity(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Accrual Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accrual Policy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Accrual Policy</em>' containment reference.
	 * @see #setAccrualPolicy(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_AccrualPolicy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accrualPolicy' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#any'"
	 * @generated
	 */
  SimpleLiteral getAccrualPolicy();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAccrualPolicy <em>Accrual Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrual Policy</em>' containment reference.
	 * @see #getAccrualPolicy()
	 * @generated
	 */
  void setAccrualPolicy(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference.
	 * @see #setAlternative(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Alternative()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alternative' namespace='##targetNamespace' affiliation='title'"
	 * @generated
	 */
  SimpleLiteral getAlternative();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAlternative <em>Alternative</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' containment reference.
	 * @see #getAlternative()
	 * @generated
	 */
  void setAlternative(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#title'"
	 * @generated
	 */
  SimpleLiteral getTitle();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
  void setTitle(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Audience</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Audience</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' containment reference.
	 * @see #setAudience(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Audience()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='audience' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#any'"
	 * @generated
	 */
  SimpleLiteral getAudience();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAudience <em>Audience</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' containment reference.
	 * @see #getAudience()
	 * @generated
	 */
  void setAudience(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Available</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' containment reference.
	 * @see #setAvailable(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Available()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='available' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getAvailable();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getAvailable <em>Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' containment reference.
	 * @see #getAvailable()
	 * @generated
	 */
  void setAvailable(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Date()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#date'"
	 * @generated
	 */
  SimpleLiteral getDate();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
  void setDate(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Bibliographic Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bibliographic Citation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliographic Citation</em>' containment reference.
	 * @see #setBibliographicCitation(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_BibliographicCitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliographicCitation' namespace='##targetNamespace' affiliation='identifier'"
	 * @generated
	 */
  SimpleLiteral getBibliographicCitation();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getBibliographicCitation <em>Bibliographic Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliographic Citation</em>' containment reference.
	 * @see #getBibliographicCitation()
	 * @generated
	 */
  void setBibliographicCitation(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#identifier'"
	 * @generated
	 */
  SimpleLiteral getIdentifier();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
  void setIdentifier(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conforms To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference.
	 * @see #setConformsTo(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_ConformsTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conformsTo' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getConformsTo();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getConformsTo <em>Conforms To</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To</em>' containment reference.
	 * @see #getConformsTo()
	 * @generated
	 */
  void setConformsTo(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Relation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#relation'"
	 * @generated
	 */
  SimpleLiteral getRelation();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getRelation <em>Relation</em>}' containment reference.
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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Contributor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#contributor'"
	 * @generated
	 */
  SimpleLiteral getContributor();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getContributor <em>Contributor</em>}' containment reference.
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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Coverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#coverage'"
	 * @generated
	 */
  SimpleLiteral getCoverage();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
  void setCoverage(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Created</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Created()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getCreated();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
  void setCreated(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Creator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#creator'"
	 * @generated
	 */
  SimpleLiteral getCreator();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
  void setCreator(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Date Accepted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Accepted</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Accepted</em>' containment reference.
	 * @see #setDateAccepted(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_DateAccepted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateAccepted' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getDateAccepted();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getDateAccepted <em>Date Accepted</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Accepted</em>' containment reference.
	 * @see #getDateAccepted()
	 * @generated
	 */
  void setDateAccepted(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Date Copyrighted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Copyrighted</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Copyrighted</em>' containment reference.
	 * @see #setDateCopyrighted(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_DateCopyrighted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateCopyrighted' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getDateCopyrighted();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getDateCopyrighted <em>Date Copyrighted</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Copyrighted</em>' containment reference.
	 * @see #getDateCopyrighted()
	 * @generated
	 */
  void setDateCopyrighted(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Date Submitted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Submitted</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Submitted</em>' containment reference.
	 * @see #setDateSubmitted(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_DateSubmitted()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateSubmitted' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getDateSubmitted();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getDateSubmitted <em>Date Submitted</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Submitted</em>' containment reference.
	 * @see #getDateSubmitted()
	 * @generated
	 */
  void setDateSubmitted(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Education Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Education Level</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Level</em>' containment reference.
	 * @see #setEducationLevel(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_EducationLevel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='educationLevel' namespace='##targetNamespace' affiliation='audience'"
	 * @generated
	 */
  SimpleLiteral getEducationLevel();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getEducationLevel <em>Education Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education Level</em>' containment reference.
	 * @see #getEducationLevel()
	 * @generated
	 */
  void setEducationLevel(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Extent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace' affiliation='format'"
	 * @generated
	 */
  SimpleLiteral getExtent();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
  void setExtent(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Format()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#format'"
	 * @generated
	 */
  SimpleLiteral getFormat();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
  void setFormat(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Has Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Format</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Format</em>' containment reference.
	 * @see #setHasFormat(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_HasFormat()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hasFormat' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getHasFormat();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getHasFormat <em>Has Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Format</em>' containment reference.
	 * @see #getHasFormat()
	 * @generated
	 */
  void setHasFormat(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Has Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Part</em>' containment reference.
	 * @see #setHasPart(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_HasPart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hasPart' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getHasPart();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getHasPart <em>Has Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Part</em>' containment reference.
	 * @see #getHasPart()
	 * @generated
	 */
  void setHasPart(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Has Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Version</em>' containment reference.
	 * @see #setHasVersion(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_HasVersion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hasVersion' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getHasVersion();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getHasVersion <em>Has Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Version</em>' containment reference.
	 * @see #getHasVersion()
	 * @generated
	 */
  void setHasVersion(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Instructional Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructional Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructional Method</em>' containment reference.
	 * @see #setInstructionalMethod(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_InstructionalMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='instructionalMethod' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#any'"
	 * @generated
	 */
  SimpleLiteral getInstructionalMethod();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getInstructionalMethod <em>Instructional Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructional Method</em>' containment reference.
	 * @see #getInstructionalMethod()
	 * @generated
	 */
  void setInstructionalMethod(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Is Format Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Format Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Format Of</em>' containment reference.
	 * @see #setIsFormatOf(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_IsFormatOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isFormatOf' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getIsFormatOf();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIsFormatOf <em>Is Format Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Format Of</em>' containment reference.
	 * @see #getIsFormatOf()
	 * @generated
	 */
  void setIsFormatOf(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Part Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' containment reference.
	 * @see #setIsPartOf(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_IsPartOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isPartOf' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getIsPartOf();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIsPartOf <em>Is Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' containment reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
  void setIsPartOf(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Is Referenced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Referenced By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Referenced By</em>' containment reference.
	 * @see #setIsReferencedBy(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_IsReferencedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isReferencedBy' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getIsReferencedBy();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIsReferencedBy <em>Is Referenced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Referenced By</em>' containment reference.
	 * @see #getIsReferencedBy()
	 * @generated
	 */
  void setIsReferencedBy(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Is Replaced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Replaced By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replaced By</em>' containment reference.
	 * @see #setIsReplacedBy(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_IsReplacedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isReplacedBy' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getIsReplacedBy();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIsReplacedBy <em>Is Replaced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaced By</em>' containment reference.
	 * @see #getIsReplacedBy()
	 * @generated
	 */
  void setIsReplacedBy(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Is Required By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Required By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required By</em>' containment reference.
	 * @see #setIsRequiredBy(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_IsRequiredBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isRequiredBy' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getIsRequiredBy();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIsRequiredBy <em>Is Required By</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required By</em>' containment reference.
	 * @see #getIsRequiredBy()
	 * @generated
	 */
  void setIsRequiredBy(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Issued</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Issued()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getIssued();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
  void setIssued(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Is Version Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Version Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Version Of</em>' containment reference.
	 * @see #setIsVersionOf(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_IsVersionOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='isVersionOf' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getIsVersionOf();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getIsVersionOf <em>Is Version Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Version Of</em>' containment reference.
	 * @see #getIsVersionOf()
	 * @generated
	 */
  void setIsVersionOf(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Language()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#language'"
	 * @generated
	 */
  SimpleLiteral getLanguage();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
  void setLanguage(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>License</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_License()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace' affiliation='rights'"
	 * @generated
	 */
  SimpleLiteral getLicense();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
  void setLicense(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Mediator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mediator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator</em>' containment reference.
	 * @see #setMediator(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Mediator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mediator' namespace='##targetNamespace' affiliation='audience'"
	 * @generated
	 */
  SimpleLiteral getMediator();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getMediator <em>Mediator</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator</em>' containment reference.
	 * @see #getMediator()
	 * @generated
	 */
  void setMediator(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Medium</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference.
	 * @see #setMedium(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Medium()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='medium' namespace='##targetNamespace' affiliation='format'"
	 * @generated
	 */
  SimpleLiteral getMedium();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getMedium <em>Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium</em>' containment reference.
	 * @see #getMedium()
	 * @generated
	 */
  void setMedium(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modified</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' containment reference.
	 * @see #setModified(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Modified()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modified' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getModified();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
  void setModified(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provenance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference.
	 * @see #setProvenance(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Provenance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='provenance' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#any'"
	 * @generated
	 */
  SimpleLiteral getProvenance();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getProvenance <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance</em>' containment reference.
	 * @see #getProvenance()
	 * @generated
	 */
  void setProvenance(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#publisher'"
	 * @generated
	 */
  SimpleLiteral getPublisher();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
  void setPublisher(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #setReferences(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_References()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='references' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getReferences();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #getReferences()
	 * @generated
	 */
  void setReferences(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Replaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replaces</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaces</em>' containment reference.
	 * @see #setReplaces(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Replaces()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaces' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getReplaces();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getReplaces <em>Replaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaces</em>' containment reference.
	 * @see #getReplaces()
	 * @generated
	 */
  void setReplaces(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference.
	 * @see #setRequires(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Requires()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requires' namespace='##targetNamespace' affiliation='relation'"
	 * @generated
	 */
  SimpleLiteral getRequires();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getRequires <em>Requires</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' containment reference.
	 * @see #getRequires()
	 * @generated
	 */
  void setRequires(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Rights Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rights Holder</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights Holder</em>' containment reference.
	 * @see #setRightsHolder(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_RightsHolder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rightsHolder' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#any'"
	 * @generated
	 */
  SimpleLiteral getRightsHolder();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getRightsHolder <em>Rights Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights Holder</em>' containment reference.
	 * @see #getRightsHolder()
	 * @generated
	 */
  void setRightsHolder(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Source()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#source'"
	 * @generated
	 */
  SimpleLiteral getSource();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Spatial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spatial</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial</em>' containment reference.
	 * @see #setSpatial(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Spatial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spatial' namespace='##targetNamespace' affiliation='coverage'"
	 * @generated
	 */
  SimpleLiteral getSpatial();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getSpatial <em>Spatial</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial</em>' containment reference.
	 * @see #getSpatial()
	 * @generated
	 */
  void setSpatial(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Subject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#subject'"
	 * @generated
	 */
  SimpleLiteral getSubject();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
  void setSubject(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Table Of Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Of Contents</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #setTableOfContents(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_TableOfContents()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tableOfContents' namespace='##targetNamespace' affiliation='description'"
	 * @generated
	 */
  SimpleLiteral getTableOfContents();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Of Contents</em>' containment reference.
	 * @see #getTableOfContents()
	 * @generated
	 */
  void setTableOfContents(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temporal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' containment reference.
	 * @see #setTemporal(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Temporal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporal' namespace='##targetNamespace' affiliation='coverage'"
	 * @generated
	 */
  SimpleLiteral getTemporal();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getTemporal <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' containment reference.
	 * @see #getTemporal()
	 * @generated
	 */
  void setTemporal(SimpleLiteral value);

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
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Type()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace' affiliation='http://purl.org/dc/elements/1.1/#type'"
	 * @generated
	 */
  SimpleLiteral getType();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
  void setType(SimpleLiteral value);

  /**
	 * Returns the value of the '<em><b>Valid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valid</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' containment reference.
	 * @see #setValid(SimpleLiteral)
	 * @see org.purl.dc.terms.TermsPackage#getDocumentRoot_Valid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='valid' namespace='##targetNamespace' affiliation='date'"
	 * @generated
	 */
  SimpleLiteral getValid();

  /**
	 * Sets the value of the '{@link org.purl.dc.terms.DocumentRoot#getValid <em>Valid</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' containment reference.
	 * @see #getValid()
	 * @generated
	 */
  void setValid(SimpleLiteral value);

} // DocumentRoot
