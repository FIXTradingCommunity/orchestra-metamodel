/**
 */
package org.purl.dc.elements._1._1.impl;

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

import org.purl.dc.elements._1._1.DocumentRoot;
import org.purl.dc.elements._1._1.SimpleLiteral;
import org.purl.dc.elements._1._1._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl#getType <em>Type</em>}</li>
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
    return _1Package.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public FeatureMap getMixed() {
    if (mixed == null) {
      mixed = new BasicFeatureMap(this, _1Package.DOCUMENT_ROOT__MIXED);
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EMap<String, String> getXMLNSPrefixMap() {
    if (xMLNSPrefixMap == null) {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EMap<String, String> getXSISchemaLocation() {
    if (xSISchemaLocation == null) {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getDescription() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(SimpleLiteral newDescription, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setDescription(SimpleLiteral newDescription) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getAny() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__ANY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAny(SimpleLiteral newAny, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__ANY, newAny, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getRights() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__RIGHTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRights(SimpleLiteral newRights, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__RIGHTS, newRights, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setRights(SimpleLiteral newRights) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__RIGHTS, newRights);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getTitle() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TITLE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(SimpleLiteral newTitle, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setTitle(SimpleLiteral newTitle) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TITLE, newTitle);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getDate() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__DATE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDate(SimpleLiteral newDate, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__DATE, newDate, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setDate(SimpleLiteral newDate) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__DATE, newDate);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getIdentifier() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__IDENTIFIER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier(SimpleLiteral newIdentifier, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setIdentifier(SimpleLiteral newIdentifier) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getRelation() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__RELATION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelation(SimpleLiteral newRelation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__RELATION, newRelation, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setRelation(SimpleLiteral newRelation) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__RELATION, newRelation);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getContributor() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CONTRIBUTOR, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContributor(SimpleLiteral newContributor, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CONTRIBUTOR, newContributor, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setContributor(SimpleLiteral newContributor) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CONTRIBUTOR, newContributor);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getCoverage() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__COVERAGE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoverage(SimpleLiteral newCoverage, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__COVERAGE, newCoverage, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setCoverage(SimpleLiteral newCoverage) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__COVERAGE, newCoverage);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getCreator() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__CREATOR, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreator(SimpleLiteral newCreator, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__CREATOR, newCreator, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setCreator(SimpleLiteral newCreator) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__CREATOR, newCreator);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getFormat() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__FORMAT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormat(SimpleLiteral newFormat, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__FORMAT, newFormat, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setFormat(SimpleLiteral newFormat) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__FORMAT, newFormat);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getLanguage() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__LANGUAGE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLanguage(SimpleLiteral newLanguage, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setLanguage(SimpleLiteral newLanguage) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getPublisher() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PUBLISHER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPublisher(SimpleLiteral newPublisher, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setPublisher(SimpleLiteral newPublisher) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getSource() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__SOURCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(SimpleLiteral newSource, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setSource(SimpleLiteral newSource) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__SOURCE, newSource);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getSubject() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__SUBJECT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubject(SimpleLiteral newSubject, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__SUBJECT, newSubject, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setSubject(SimpleLiteral newSubject) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__SUBJECT, newSubject);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SimpleLiteral getType() {
    return (SimpleLiteral)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(SimpleLiteral newType, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE, newType, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setType(SimpleLiteral newType) {
    ((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE, newType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case _1Package.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case _1Package.DOCUMENT_ROOT__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case _1Package.DOCUMENT_ROOT__ANY:
        return basicSetAny(null, msgs);
      case _1Package.DOCUMENT_ROOT__RIGHTS:
        return basicSetRights(null, msgs);
      case _1Package.DOCUMENT_ROOT__TITLE:
        return basicSetTitle(null, msgs);
      case _1Package.DOCUMENT_ROOT__DATE:
        return basicSetDate(null, msgs);
      case _1Package.DOCUMENT_ROOT__IDENTIFIER:
        return basicSetIdentifier(null, msgs);
      case _1Package.DOCUMENT_ROOT__RELATION:
        return basicSetRelation(null, msgs);
      case _1Package.DOCUMENT_ROOT__CONTRIBUTOR:
        return basicSetContributor(null, msgs);
      case _1Package.DOCUMENT_ROOT__COVERAGE:
        return basicSetCoverage(null, msgs);
      case _1Package.DOCUMENT_ROOT__CREATOR:
        return basicSetCreator(null, msgs);
      case _1Package.DOCUMENT_ROOT__FORMAT:
        return basicSetFormat(null, msgs);
      case _1Package.DOCUMENT_ROOT__LANGUAGE:
        return basicSetLanguage(null, msgs);
      case _1Package.DOCUMENT_ROOT__PUBLISHER:
        return basicSetPublisher(null, msgs);
      case _1Package.DOCUMENT_ROOT__SOURCE:
        return basicSetSource(null, msgs);
      case _1Package.DOCUMENT_ROOT__SUBJECT:
        return basicSetSubject(null, msgs);
      case _1Package.DOCUMENT_ROOT__TYPE:
        return basicSetType(null, msgs);
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
      case _1Package.DOCUMENT_ROOT__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case _1Package.DOCUMENT_ROOT__DESCRIPTION:
        return getDescription();
      case _1Package.DOCUMENT_ROOT__ANY:
        return getAny();
      case _1Package.DOCUMENT_ROOT__RIGHTS:
        return getRights();
      case _1Package.DOCUMENT_ROOT__TITLE:
        return getTitle();
      case _1Package.DOCUMENT_ROOT__DATE:
        return getDate();
      case _1Package.DOCUMENT_ROOT__IDENTIFIER:
        return getIdentifier();
      case _1Package.DOCUMENT_ROOT__RELATION:
        return getRelation();
      case _1Package.DOCUMENT_ROOT__CONTRIBUTOR:
        return getContributor();
      case _1Package.DOCUMENT_ROOT__COVERAGE:
        return getCoverage();
      case _1Package.DOCUMENT_ROOT__CREATOR:
        return getCreator();
      case _1Package.DOCUMENT_ROOT__FORMAT:
        return getFormat();
      case _1Package.DOCUMENT_ROOT__LANGUAGE:
        return getLanguage();
      case _1Package.DOCUMENT_ROOT__PUBLISHER:
        return getPublisher();
      case _1Package.DOCUMENT_ROOT__SOURCE:
        return getSource();
      case _1Package.DOCUMENT_ROOT__SUBJECT:
        return getSubject();
      case _1Package.DOCUMENT_ROOT__TYPE:
        return getType();
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
      case _1Package.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case _1Package.DOCUMENT_ROOT__DESCRIPTION:
        setDescription((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__RIGHTS:
        setRights((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__TITLE:
        setTitle((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__DATE:
        setDate((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__IDENTIFIER:
        setIdentifier((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__RELATION:
        setRelation((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__CONTRIBUTOR:
        setContributor((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__COVERAGE:
        setCoverage((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__CREATOR:
        setCreator((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__FORMAT:
        setFormat((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__LANGUAGE:
        setLanguage((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__PUBLISHER:
        setPublisher((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__SOURCE:
        setSource((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__SUBJECT:
        setSubject((SimpleLiteral)newValue);
        return;
      case _1Package.DOCUMENT_ROOT__TYPE:
        setType((SimpleLiteral)newValue);
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
      case _1Package.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case _1Package.DOCUMENT_ROOT__DESCRIPTION:
        setDescription((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__RIGHTS:
        setRights((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__TITLE:
        setTitle((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__DATE:
        setDate((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__IDENTIFIER:
        setIdentifier((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__RELATION:
        setRelation((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__CONTRIBUTOR:
        setContributor((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__COVERAGE:
        setCoverage((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__CREATOR:
        setCreator((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__FORMAT:
        setFormat((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__LANGUAGE:
        setLanguage((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__PUBLISHER:
        setPublisher((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__SOURCE:
        setSource((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__SUBJECT:
        setSubject((SimpleLiteral)null);
        return;
      case _1Package.DOCUMENT_ROOT__TYPE:
        setType((SimpleLiteral)null);
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
      case _1Package.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case _1Package.DOCUMENT_ROOT__DESCRIPTION:
        return getDescription() != null;
      case _1Package.DOCUMENT_ROOT__ANY:
        return getAny() != null;
      case _1Package.DOCUMENT_ROOT__RIGHTS:
        return getRights() != null;
      case _1Package.DOCUMENT_ROOT__TITLE:
        return getTitle() != null;
      case _1Package.DOCUMENT_ROOT__DATE:
        return getDate() != null;
      case _1Package.DOCUMENT_ROOT__IDENTIFIER:
        return getIdentifier() != null;
      case _1Package.DOCUMENT_ROOT__RELATION:
        return getRelation() != null;
      case _1Package.DOCUMENT_ROOT__CONTRIBUTOR:
        return getContributor() != null;
      case _1Package.DOCUMENT_ROOT__COVERAGE:
        return getCoverage() != null;
      case _1Package.DOCUMENT_ROOT__CREATOR:
        return getCreator() != null;
      case _1Package.DOCUMENT_ROOT__FORMAT:
        return getFormat() != null;
      case _1Package.DOCUMENT_ROOT__LANGUAGE:
        return getLanguage() != null;
      case _1Package.DOCUMENT_ROOT__PUBLISHER:
        return getPublisher() != null;
      case _1Package.DOCUMENT_ROOT__SOURCE:
        return getSource() != null;
      case _1Package.DOCUMENT_ROOT__SUBJECT:
        return getSubject() != null;
      case _1Package.DOCUMENT_ROOT__TYPE:
        return getType() != null;
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
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
