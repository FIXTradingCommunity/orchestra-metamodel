/**
 */
package org.purl.dc.terms.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.purl.dc.elements._1._1.SimpleLiteral;

import org.purl.dc.terms.DocumentRoot;
import org.purl.dc.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAccrualMethod <em>Accrual Method</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAccrualPeriodicity <em>Accrual Periodicity</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAccrualPolicy <em>Accrual Policy</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getAvailable <em>Available</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getDateAccepted <em>Date Accepted</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getDateCopyrighted <em>Date Copyrighted</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getDateSubmitted <em>Date Submitted</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getHasFormat <em>Has Format</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getHasPart <em>Has Part</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getHasVersion <em>Has Version</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getInstructionalMethod <em>Instructional Method</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIsFormatOf <em>Is Format Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIsReferencedBy <em>Is Referenced By</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIsReplacedBy <em>Is Replaced By</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIsRequiredBy <em>Is Required By</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getIsVersionOf <em>Is Version Of</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getMediator <em>Mediator</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getTableOfContents <em>Table Of Contents</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.purl.dc.terms.impl.DocumentRootImpl#getValid <em>Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected FeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TermsPackage.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getMixed() {
    if (mixed == null) {
      mixed = new BasicFeatureMap(this, TermsPackage.DOCUMENT_ROOT__MIXED);
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap() {
    if (xMLNSPrefixMap == null) {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation() {
    if (xSISchemaLocation == null) {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAbstract() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ABSTRACT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstract(SimpleLiteral newAbstract, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(SimpleLiteral newAbstract) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getDescription() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(SimpleLiteral newDescription, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(SimpleLiteral newDescription) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAccessRights() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCESS_RIGHTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessRights(SimpleLiteral newAccessRights, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ACCESS_RIGHTS, newAccessRights, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessRights(SimpleLiteral newAccessRights) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCESS_RIGHTS, newAccessRights);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getRights() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRights(SimpleLiteral newRights, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS, newRights, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRights(SimpleLiteral newRights) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS, newRights);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAccrualMethod() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_METHOD, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccrualMethod(SimpleLiteral newAccrualMethod, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_METHOD, newAccrualMethod, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccrualMethod(SimpleLiteral newAccrualMethod) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_METHOD, newAccrualMethod);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAccrualPeriodicity() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_PERIODICITY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccrualPeriodicity(SimpleLiteral newAccrualPeriodicity, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_PERIODICITY, newAccrualPeriodicity, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccrualPeriodicity(SimpleLiteral newAccrualPeriodicity) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_PERIODICITY, newAccrualPeriodicity);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAccrualPolicy() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_POLICY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccrualPolicy(SimpleLiteral newAccrualPolicy, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_POLICY, newAccrualPolicy, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccrualPolicy(SimpleLiteral newAccrualPolicy) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ACCRUAL_POLICY, newAccrualPolicy);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAlternative() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ALTERNATIVE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternative(SimpleLiteral newAlternative, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ALTERNATIVE, newAlternative, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlternative(SimpleLiteral newAlternative) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ALTERNATIVE, newAlternative);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getTitle() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TITLE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(SimpleLiteral newTitle, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(SimpleLiteral newTitle) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAudience() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__AUDIENCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAudience(SimpleLiteral newAudience, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__AUDIENCE, newAudience, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAudience(SimpleLiteral newAudience) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__AUDIENCE, newAudience);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getAvailable() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__AVAILABLE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAvailable(SimpleLiteral newAvailable, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__AVAILABLE, newAvailable, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAvailable(SimpleLiteral newAvailable) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__AVAILABLE, newAvailable);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getDate() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DATE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDate(SimpleLiteral newDate, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DATE, newDate, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(SimpleLiteral newDate) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DATE, newDate);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getBibliographicCitation() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBibliographicCitation(SimpleLiteral newBibliographicCitation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION, newBibliographicCitation, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBibliographicCitation(SimpleLiteral newBibliographicCitation) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION, newBibliographicCitation);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIdentifier() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier(SimpleLiteral newIdentifier, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(SimpleLiteral newIdentifier) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getConformsTo() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConformsTo(SimpleLiteral newConformsTo, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, newConformsTo, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConformsTo(SimpleLiteral newConformsTo) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, newConformsTo);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getRelation() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__RELATION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelation(SimpleLiteral newRelation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(SimpleLiteral newRelation) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getContributor() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContributor(SimpleLiteral newContributor, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR, newContributor, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContributor(SimpleLiteral newContributor) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR, newContributor);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getCoverage() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__COVERAGE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoverage(SimpleLiteral newCoverage, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__COVERAGE, newCoverage, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoverage(SimpleLiteral newCoverage) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__COVERAGE, newCoverage);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getCreated() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__CREATED, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreated(SimpleLiteral newCreated, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__CREATED, newCreated, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreated(SimpleLiteral newCreated) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__CREATED, newCreated);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getCreator() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__CREATOR, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreator(SimpleLiteral newCreator, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__CREATOR, newCreator, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreator(SimpleLiteral newCreator) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__CREATOR, newCreator);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getDateAccepted() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DATE_ACCEPTED, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDateAccepted(SimpleLiteral newDateAccepted, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DATE_ACCEPTED, newDateAccepted, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateAccepted(SimpleLiteral newDateAccepted) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DATE_ACCEPTED, newDateAccepted);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getDateCopyrighted() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DATE_COPYRIGHTED, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDateCopyrighted(SimpleLiteral newDateCopyrighted, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DATE_COPYRIGHTED, newDateCopyrighted, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateCopyrighted(SimpleLiteral newDateCopyrighted) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DATE_COPYRIGHTED, newDateCopyrighted);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getDateSubmitted() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__DATE_SUBMITTED, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDateSubmitted(SimpleLiteral newDateSubmitted, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__DATE_SUBMITTED, newDateSubmitted, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateSubmitted(SimpleLiteral newDateSubmitted) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__DATE_SUBMITTED, newDateSubmitted);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getEducationLevel() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__EDUCATION_LEVEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEducationLevel(SimpleLiteral newEducationLevel, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__EDUCATION_LEVEL, newEducationLevel, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEducationLevel(SimpleLiteral newEducationLevel) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__EDUCATION_LEVEL, newEducationLevel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getExtent() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__EXTENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtent(SimpleLiteral newExtent, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__EXTENT, newExtent, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtent(SimpleLiteral newExtent) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__EXTENT, newExtent);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getFormat() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__FORMAT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormat(SimpleLiteral newFormat, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__FORMAT, newFormat, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(SimpleLiteral newFormat) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__FORMAT, newFormat);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getHasFormat() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__HAS_FORMAT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasFormat(SimpleLiteral newHasFormat, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__HAS_FORMAT, newHasFormat, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasFormat(SimpleLiteral newHasFormat) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__HAS_FORMAT, newHasFormat);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getHasPart() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__HAS_PART, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasPart(SimpleLiteral newHasPart, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__HAS_PART, newHasPart, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPart(SimpleLiteral newHasPart) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__HAS_PART, newHasPart);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getHasVersion() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__HAS_VERSION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasVersion(SimpleLiteral newHasVersion, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__HAS_VERSION, newHasVersion, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasVersion(SimpleLiteral newHasVersion) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__HAS_VERSION, newHasVersion);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getInstructionalMethod() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstructionalMethod(SimpleLiteral newInstructionalMethod, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD, newInstructionalMethod, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstructionalMethod(SimpleLiteral newInstructionalMethod) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD, newInstructionalMethod);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIsFormatOf() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_FORMAT_OF, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsFormatOf(SimpleLiteral newIsFormatOf, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_FORMAT_OF, newIsFormatOf, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFormatOf(SimpleLiteral newIsFormatOf) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_FORMAT_OF, newIsFormatOf);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIsPartOf() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_PART_OF, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsPartOf(SimpleLiteral newIsPartOf, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_PART_OF, newIsPartOf, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsPartOf(SimpleLiteral newIsPartOf) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_PART_OF, newIsPartOf);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIsReferencedBy() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_REFERENCED_BY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsReferencedBy(SimpleLiteral newIsReferencedBy, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_REFERENCED_BY, newIsReferencedBy, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsReferencedBy(SimpleLiteral newIsReferencedBy) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_REFERENCED_BY, newIsReferencedBy);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIsReplacedBy() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_REPLACED_BY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsReplacedBy(SimpleLiteral newIsReplacedBy, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_REPLACED_BY, newIsReplacedBy, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsReplacedBy(SimpleLiteral newIsReplacedBy) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_REPLACED_BY, newIsReplacedBy);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIsRequiredBy() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_REQUIRED_BY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsRequiredBy(SimpleLiteral newIsRequiredBy, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_REQUIRED_BY, newIsRequiredBy, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRequiredBy(SimpleLiteral newIsRequiredBy) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_REQUIRED_BY, newIsRequiredBy);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIssued() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__ISSUED, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIssued(SimpleLiteral newIssued, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__ISSUED, newIssued, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIssued(SimpleLiteral newIssued) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__ISSUED, newIssued);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getIsVersionOf() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__IS_VERSION_OF, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsVersionOf(SimpleLiteral newIsVersionOf, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__IS_VERSION_OF, newIsVersionOf, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsVersionOf(SimpleLiteral newIsVersionOf) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__IS_VERSION_OF, newIsVersionOf);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getLanguage() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__LANGUAGE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLanguage(SimpleLiteral newLanguage, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(SimpleLiteral newLanguage) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getLicense() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__LICENSE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLicense(SimpleLiteral newLicense, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__LICENSE, newLicense, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLicense(SimpleLiteral newLicense) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__LICENSE, newLicense);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getMediator() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__MEDIATOR, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMediator(SimpleLiteral newMediator, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__MEDIATOR, newMediator, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMediator(SimpleLiteral newMediator) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__MEDIATOR, newMediator);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getMedium() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__MEDIUM, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMedium(SimpleLiteral newMedium, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__MEDIUM, newMedium, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMedium(SimpleLiteral newMedium) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__MEDIUM, newMedium);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getModified() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__MODIFIED, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModified(SimpleLiteral newModified, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__MODIFIED, newModified, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModified(SimpleLiteral newModified) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__MODIFIED, newModified);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getProvenance() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__PROVENANCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProvenance(SimpleLiteral newProvenance, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__PROVENANCE, newProvenance, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvenance(SimpleLiteral newProvenance) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__PROVENANCE, newProvenance);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getPublisher() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__PUBLISHER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPublisher(SimpleLiteral newPublisher, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublisher(SimpleLiteral newPublisher) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getReferences() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__REFERENCES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferences(SimpleLiteral newReferences, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__REFERENCES, newReferences, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferences(SimpleLiteral newReferences) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__REFERENCES, newReferences);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getReplaces() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__REPLACES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReplaces(SimpleLiteral newReplaces, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__REPLACES, newReplaces, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplaces(SimpleLiteral newReplaces) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__REPLACES, newReplaces);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getRequires() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__REQUIRES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequires(SimpleLiteral newRequires, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__REQUIRES, newRequires, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequires(SimpleLiteral newRequires) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__REQUIRES, newRequires);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getRightsHolder() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS_HOLDER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightsHolder(SimpleLiteral newRightsHolder, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS_HOLDER, newRightsHolder, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightsHolder(SimpleLiteral newRightsHolder) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__RIGHTS_HOLDER, newRightsHolder);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getSource() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__SOURCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(SimpleLiteral newSource, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(SimpleLiteral newSource) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getSpatial() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__SPATIAL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpatial(SimpleLiteral newSpatial, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__SPATIAL, newSpatial, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpatial(SimpleLiteral newSpatial) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__SPATIAL, newSpatial);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getSubject() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__SUBJECT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubject(SimpleLiteral newSubject, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__SUBJECT, newSubject, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(SimpleLiteral newSubject) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__SUBJECT, newSubject);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getTableOfContents() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TABLE_OF_CONTENTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTableOfContents(SimpleLiteral newTableOfContents, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TABLE_OF_CONTENTS, newTableOfContents, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableOfContents(SimpleLiteral newTableOfContents) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TABLE_OF_CONTENTS, newTableOfContents);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getTemporal() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TEMPORAL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemporal(SimpleLiteral newTemporal, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TEMPORAL, newTemporal, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemporal(SimpleLiteral newTemporal) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TEMPORAL, newTemporal);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getType() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__TYPE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(SimpleLiteral newType, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__TYPE, newType, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(SimpleLiteral newType) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__TYPE, newType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral getValid() {
    return (SimpleLiteral)getMixed().get(TermsPackage.Literals.DOCUMENT_ROOT__VALID, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValid(SimpleLiteral newValid, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(TermsPackage.Literals.DOCUMENT_ROOT__VALID, newValid, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValid(SimpleLiteral newValid) {
    ((FeatureMap.Internal)getMixed()).set(TermsPackage.Literals.DOCUMENT_ROOT__VALID, newValid);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TermsPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
        return basicSetAbstract(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
        return basicSetAccessRights(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__RIGHTS:
        return basicSetRights(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
        return basicSetAccrualMethod(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
        return basicSetAccrualPeriodicity(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
        return basicSetAccrualPolicy(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__TITLE:
        return basicSetTitle(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
        return basicSetAudience(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
        return basicSetAvailable(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__DATE:
        return basicSetDate(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
        return basicSetBibliographicCitation(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
        return basicSetConformsTo(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__RELATION:
        return basicSetRelation(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__CONTRIBUTOR:
        return basicSetContributor(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__COVERAGE:
        return basicSetCoverage(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__CREATED:
        return basicSetCreated(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__CREATOR:
        return basicSetCreator(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
        return basicSetDateAccepted(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
        return basicSetDateCopyrighted(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
        return basicSetDateSubmitted(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
        return basicSetEducationLevel(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__EXTENT:
        return basicSetExtent(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__FORMAT:
        return basicSetFormat(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
        return basicSetHasFormat(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__HAS_PART:
        return basicSetHasPart(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
        return basicSetHasVersion(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
        return basicSetInstructionalMethod(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
        return basicSetIsFormatOf(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
        return basicSetIsPartOf(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
        return basicSetIsReferencedBy(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
        return basicSetIsReplacedBy(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
        return basicSetIsRequiredBy(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__ISSUED:
        return basicSetIssued(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
        return basicSetIsVersionOf(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
        return basicSetLanguage(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__LICENSE:
        return basicSetLicense(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
        return basicSetMediator(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__MEDIUM:
        return basicSetMedium(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__MODIFIED:
        return basicSetModified(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
        return basicSetProvenance(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
        return basicSetPublisher(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__REFERENCES:
        return basicSetReferences(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__REPLACES:
        return basicSetReplaces(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__REQUIRES:
        return basicSetRequires(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
        return basicSetRightsHolder(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__SOURCE:
        return basicSetSource(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__SPATIAL:
        return basicSetSpatial(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__SUBJECT:
        return basicSetSubject(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
        return basicSetTableOfContents(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
        return basicSetTemporal(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__TYPE:
        return basicSetType(null, msgs);
      case TermsPackage.DOCUMENT_ROOT__VALID:
        return basicSetValid(null, msgs);
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
      case TermsPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
        return getAbstract();
      case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
        return getDescription();
      case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
        return getAccessRights();
      case TermsPackage.DOCUMENT_ROOT__RIGHTS:
        return getRights();
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
        return getAccrualMethod();
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
        return getAccrualPeriodicity();
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
        return getAccrualPolicy();
      case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
        return getAlternative();
      case TermsPackage.DOCUMENT_ROOT__TITLE:
        return getTitle();
      case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
        return getAudience();
      case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
        return getAvailable();
      case TermsPackage.DOCUMENT_ROOT__DATE:
        return getDate();
      case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
        return getBibliographicCitation();
      case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
        return getIdentifier();
      case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
        return getConformsTo();
      case TermsPackage.DOCUMENT_ROOT__RELATION:
        return getRelation();
      case TermsPackage.DOCUMENT_ROOT__CONTRIBUTOR:
        return getContributor();
      case TermsPackage.DOCUMENT_ROOT__COVERAGE:
        return getCoverage();
      case TermsPackage.DOCUMENT_ROOT__CREATED:
        return getCreated();
      case TermsPackage.DOCUMENT_ROOT__CREATOR:
        return getCreator();
      case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
        return getDateAccepted();
      case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
        return getDateCopyrighted();
      case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
        return getDateSubmitted();
      case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
        return getEducationLevel();
      case TermsPackage.DOCUMENT_ROOT__EXTENT:
        return getExtent();
      case TermsPackage.DOCUMENT_ROOT__FORMAT:
        return getFormat();
      case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
        return getHasFormat();
      case TermsPackage.DOCUMENT_ROOT__HAS_PART:
        return getHasPart();
      case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
        return getHasVersion();
      case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
        return getInstructionalMethod();
      case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
        return getIsFormatOf();
      case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
        return getIsPartOf();
      case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
        return getIsReferencedBy();
      case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
        return getIsReplacedBy();
      case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
        return getIsRequiredBy();
      case TermsPackage.DOCUMENT_ROOT__ISSUED:
        return getIssued();
      case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
        return getIsVersionOf();
      case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
        return getLanguage();
      case TermsPackage.DOCUMENT_ROOT__LICENSE:
        return getLicense();
      case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
        return getMediator();
      case TermsPackage.DOCUMENT_ROOT__MEDIUM:
        return getMedium();
      case TermsPackage.DOCUMENT_ROOT__MODIFIED:
        return getModified();
      case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
        return getProvenance();
      case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
        return getPublisher();
      case TermsPackage.DOCUMENT_ROOT__REFERENCES:
        return getReferences();
      case TermsPackage.DOCUMENT_ROOT__REPLACES:
        return getReplaces();
      case TermsPackage.DOCUMENT_ROOT__REQUIRES:
        return getRequires();
      case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
        return getRightsHolder();
      case TermsPackage.DOCUMENT_ROOT__SOURCE:
        return getSource();
      case TermsPackage.DOCUMENT_ROOT__SPATIAL:
        return getSpatial();
      case TermsPackage.DOCUMENT_ROOT__SUBJECT:
        return getSubject();
      case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
        return getTableOfContents();
      case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
        return getTemporal();
      case TermsPackage.DOCUMENT_ROOT__TYPE:
        return getType();
      case TermsPackage.DOCUMENT_ROOT__VALID:
        return getValid();
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
      case TermsPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
        setAbstract((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
        setDescription((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
        setAccessRights((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__RIGHTS:
        setRights((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
        setAccrualMethod((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
        setAccrualPeriodicity((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
        setAccrualPolicy((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
        setAlternative((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__TITLE:
        setTitle((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
        setAudience((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
        setAvailable((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE:
        setDate((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
        setBibliographicCitation((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
        setIdentifier((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
        setConformsTo((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__RELATION:
        setRelation((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__CONTRIBUTOR:
        setContributor((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__COVERAGE:
        setCoverage((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__CREATED:
        setCreated((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__CREATOR:
        setCreator((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
        setDateAccepted((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
        setDateCopyrighted((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
        setDateSubmitted((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
        setEducationLevel((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__EXTENT:
        setExtent((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__FORMAT:
        setFormat((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
        setHasFormat((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__HAS_PART:
        setHasPart((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
        setHasVersion((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
        setInstructionalMethod((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
        setIsFormatOf((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
        setIsPartOf((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
        setIsReferencedBy((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
        setIsReplacedBy((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
        setIsRequiredBy((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__ISSUED:
        setIssued((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
        setIsVersionOf((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
        setLanguage((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__LICENSE:
        setLicense((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
        setMediator((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__MEDIUM:
        setMedium((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__MODIFIED:
        setModified((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
        setProvenance((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
        setPublisher((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__REFERENCES:
        setReferences((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__REPLACES:
        setReplaces((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__REQUIRES:
        setRequires((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
        setRightsHolder((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__SOURCE:
        setSource((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__SPATIAL:
        setSpatial((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__SUBJECT:
        setSubject((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
        setTableOfContents((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
        setTemporal((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__TYPE:
        setType((SimpleLiteral)newValue);
        return;
      case TermsPackage.DOCUMENT_ROOT__VALID:
        setValid((SimpleLiteral)newValue);
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
      case TermsPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
        setAbstract((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
        setDescription((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
        setAccessRights((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__RIGHTS:
        setRights((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
        setAccrualMethod((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
        setAccrualPeriodicity((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
        setAccrualPolicy((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
        setAlternative((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__TITLE:
        setTitle((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
        setAudience((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
        setAvailable((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE:
        setDate((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
        setBibliographicCitation((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
        setIdentifier((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
        setConformsTo((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__RELATION:
        setRelation((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__CONTRIBUTOR:
        setContributor((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__COVERAGE:
        setCoverage((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__CREATED:
        setCreated((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__CREATOR:
        setCreator((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
        setDateAccepted((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
        setDateCopyrighted((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
        setDateSubmitted((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
        setEducationLevel((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__EXTENT:
        setExtent((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__FORMAT:
        setFormat((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
        setHasFormat((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__HAS_PART:
        setHasPart((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
        setHasVersion((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
        setInstructionalMethod((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
        setIsFormatOf((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
        setIsPartOf((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
        setIsReferencedBy((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
        setIsReplacedBy((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
        setIsRequiredBy((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__ISSUED:
        setIssued((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
        setIsVersionOf((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
        setLanguage((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__LICENSE:
        setLicense((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
        setMediator((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__MEDIUM:
        setMedium((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__MODIFIED:
        setModified((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
        setProvenance((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
        setPublisher((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__REFERENCES:
        setReferences((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__REPLACES:
        setReplaces((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__REQUIRES:
        setRequires((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
        setRightsHolder((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__SOURCE:
        setSource((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__SPATIAL:
        setSpatial((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__SUBJECT:
        setSubject((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
        setTableOfContents((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
        setTemporal((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__TYPE:
        setType((SimpleLiteral)null);
        return;
      case TermsPackage.DOCUMENT_ROOT__VALID:
        setValid((SimpleLiteral)null);
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
      case TermsPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case TermsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case TermsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case TermsPackage.DOCUMENT_ROOT__ABSTRACT:
        return getAbstract() != null;
      case TermsPackage.DOCUMENT_ROOT__DESCRIPTION:
        return getDescription() != null;
      case TermsPackage.DOCUMENT_ROOT__ACCESS_RIGHTS:
        return getAccessRights() != null;
      case TermsPackage.DOCUMENT_ROOT__RIGHTS:
        return getRights() != null;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_METHOD:
        return getAccrualMethod() != null;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_PERIODICITY:
        return getAccrualPeriodicity() != null;
      case TermsPackage.DOCUMENT_ROOT__ACCRUAL_POLICY:
        return getAccrualPolicy() != null;
      case TermsPackage.DOCUMENT_ROOT__ALTERNATIVE:
        return getAlternative() != null;
      case TermsPackage.DOCUMENT_ROOT__TITLE:
        return getTitle() != null;
      case TermsPackage.DOCUMENT_ROOT__AUDIENCE:
        return getAudience() != null;
      case TermsPackage.DOCUMENT_ROOT__AVAILABLE:
        return getAvailable() != null;
      case TermsPackage.DOCUMENT_ROOT__DATE:
        return getDate() != null;
      case TermsPackage.DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION:
        return getBibliographicCitation() != null;
      case TermsPackage.DOCUMENT_ROOT__IDENTIFIER:
        return getIdentifier() != null;
      case TermsPackage.DOCUMENT_ROOT__CONFORMS_TO:
        return getConformsTo() != null;
      case TermsPackage.DOCUMENT_ROOT__RELATION:
        return getRelation() != null;
      case TermsPackage.DOCUMENT_ROOT__CONTRIBUTOR:
        return getContributor() != null;
      case TermsPackage.DOCUMENT_ROOT__COVERAGE:
        return getCoverage() != null;
      case TermsPackage.DOCUMENT_ROOT__CREATED:
        return getCreated() != null;
      case TermsPackage.DOCUMENT_ROOT__CREATOR:
        return getCreator() != null;
      case TermsPackage.DOCUMENT_ROOT__DATE_ACCEPTED:
        return getDateAccepted() != null;
      case TermsPackage.DOCUMENT_ROOT__DATE_COPYRIGHTED:
        return getDateCopyrighted() != null;
      case TermsPackage.DOCUMENT_ROOT__DATE_SUBMITTED:
        return getDateSubmitted() != null;
      case TermsPackage.DOCUMENT_ROOT__EDUCATION_LEVEL:
        return getEducationLevel() != null;
      case TermsPackage.DOCUMENT_ROOT__EXTENT:
        return getExtent() != null;
      case TermsPackage.DOCUMENT_ROOT__FORMAT:
        return getFormat() != null;
      case TermsPackage.DOCUMENT_ROOT__HAS_FORMAT:
        return getHasFormat() != null;
      case TermsPackage.DOCUMENT_ROOT__HAS_PART:
        return getHasPart() != null;
      case TermsPackage.DOCUMENT_ROOT__HAS_VERSION:
        return getHasVersion() != null;
      case TermsPackage.DOCUMENT_ROOT__INSTRUCTIONAL_METHOD:
        return getInstructionalMethod() != null;
      case TermsPackage.DOCUMENT_ROOT__IS_FORMAT_OF:
        return getIsFormatOf() != null;
      case TermsPackage.DOCUMENT_ROOT__IS_PART_OF:
        return getIsPartOf() != null;
      case TermsPackage.DOCUMENT_ROOT__IS_REFERENCED_BY:
        return getIsReferencedBy() != null;
      case TermsPackage.DOCUMENT_ROOT__IS_REPLACED_BY:
        return getIsReplacedBy() != null;
      case TermsPackage.DOCUMENT_ROOT__IS_REQUIRED_BY:
        return getIsRequiredBy() != null;
      case TermsPackage.DOCUMENT_ROOT__ISSUED:
        return getIssued() != null;
      case TermsPackage.DOCUMENT_ROOT__IS_VERSION_OF:
        return getIsVersionOf() != null;
      case TermsPackage.DOCUMENT_ROOT__LANGUAGE:
        return getLanguage() != null;
      case TermsPackage.DOCUMENT_ROOT__LICENSE:
        return getLicense() != null;
      case TermsPackage.DOCUMENT_ROOT__MEDIATOR:
        return getMediator() != null;
      case TermsPackage.DOCUMENT_ROOT__MEDIUM:
        return getMedium() != null;
      case TermsPackage.DOCUMENT_ROOT__MODIFIED:
        return getModified() != null;
      case TermsPackage.DOCUMENT_ROOT__PROVENANCE:
        return getProvenance() != null;
      case TermsPackage.DOCUMENT_ROOT__PUBLISHER:
        return getPublisher() != null;
      case TermsPackage.DOCUMENT_ROOT__REFERENCES:
        return getReferences() != null;
      case TermsPackage.DOCUMENT_ROOT__REPLACES:
        return getReplaces() != null;
      case TermsPackage.DOCUMENT_ROOT__REQUIRES:
        return getRequires() != null;
      case TermsPackage.DOCUMENT_ROOT__RIGHTS_HOLDER:
        return getRightsHolder() != null;
      case TermsPackage.DOCUMENT_ROOT__SOURCE:
        return getSource() != null;
      case TermsPackage.DOCUMENT_ROOT__SPATIAL:
        return getSpatial() != null;
      case TermsPackage.DOCUMENT_ROOT__SUBJECT:
        return getSubject() != null;
      case TermsPackage.DOCUMENT_ROOT__TABLE_OF_CONTENTS:
        return getTableOfContents() != null;
      case TermsPackage.DOCUMENT_ROOT__TEMPORAL:
        return getTemporal() != null;
      case TermsPackage.DOCUMENT_ROOT__TYPE:
        return getType() != null;
      case TermsPackage.DOCUMENT_ROOT__VALID:
        return getValid() != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
