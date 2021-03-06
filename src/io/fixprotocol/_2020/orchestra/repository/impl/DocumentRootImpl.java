/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.ActorsType;
import io.fixprotocol._2020.orchestra.repository.CategoriesType;
import io.fixprotocol._2020.orchestra.repository.CodeSetsType;
import io.fixprotocol._2020.orchestra.repository.ComponentsType;
import io.fixprotocol._2020.orchestra.repository.ConceptsType;
import io.fixprotocol._2020.orchestra.repository.DatatypeType;
import io.fixprotocol._2020.orchestra.repository.DatatypesType;
import io.fixprotocol._2020.orchestra.repository.DocumentRoot;
import io.fixprotocol._2020.orchestra.repository.FieldsType;
import io.fixprotocol._2020.orchestra.repository.GroupsType;
import io.fixprotocol._2020.orchestra.repository.MessagesType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.RepositoryType;
import io.fixprotocol._2020.orchestra.repository.SectionsType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getCodeSets <em>Code Sets</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl#getSections <em>Sections</em>}</li>
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
    return RepositoryPackage.eINSTANCE.getDocumentRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getMixed() {
    if (mixed == null) {
      mixed = new BasicFeatureMap(this, RepositoryPackage.DOCUMENT_ROOT__MIXED);
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
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorsType getActors() {
    return (ActorsType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Actors(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActors(ActorsType newActors, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Actors(), newActors, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActors(ActorsType newActors) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Actors(), newActors);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoriesType getCategories() {
    return (CategoriesType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Categories(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCategories(CategoriesType newCategories, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Categories(), newCategories, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategories(CategoriesType newCategories) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Categories(), newCategories);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeSetsType getCodeSets() {
    return (CodeSetsType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_CodeSets(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeSets(CodeSetsType newCodeSets, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_CodeSets(), newCodeSets, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeSets(CodeSetsType newCodeSets) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_CodeSets(), newCodeSets);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentsType getComponents() {
    return (ComponentsType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Components(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponents(ComponentsType newComponents, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Components(), newComponents, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponents(ComponentsType newComponents) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Components(), newComponents);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptsType getConcepts() {
    return (ConceptsType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Concepts(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcepts(ConceptsType newConcepts, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Concepts(), newConcepts, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcepts(ConceptsType newConcepts) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Concepts(), newConcepts);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeType getDatatype() {
    return (DatatypeType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Datatype(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatatype(DatatypeType newDatatype, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Datatype(), newDatatype, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatype(DatatypeType newDatatype) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Datatype(), newDatatype);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypesType getDatatypes() {
    return (DatatypesType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Datatypes(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatatypes(DatatypesType newDatatypes, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Datatypes(), newDatatypes, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatypes(DatatypesType newDatatypes) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Datatypes(), newDatatypes);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldsType getFields() {
    return (FieldsType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Fields(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFields(FieldsType newFields, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Fields(), newFields, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFields(FieldsType newFields) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Fields(), newFields);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupsType getGroups() {
    return (GroupsType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Groups(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroups(GroupsType newGroups, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Groups(), newGroups, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroups(GroupsType newGroups) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Groups(), newGroups);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessagesType getMessages() {
    return (MessagesType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Messages(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessages(MessagesType newMessages, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Messages(), newMessages, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessages(MessagesType newMessages) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Messages(), newMessages);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryType getRepository() {
    return (RepositoryType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Repository(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepository(RepositoryType newRepository, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Repository(), newRepository, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepository(RepositoryType newRepository) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Repository(), newRepository);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionsType getSections() {
    return (SectionsType)getMixed().get(RepositoryPackage.eINSTANCE.getDocumentRoot_Sections(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSections(SectionsType newSections, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(RepositoryPackage.eINSTANCE.getDocumentRoot_Sections(), newSections, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSections(SectionsType newSections) {
    ((FeatureMap.Internal)getMixed()).set(RepositoryPackage.eINSTANCE.getDocumentRoot_Sections(), newSections);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__ACTORS:
        return basicSetActors(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
        return basicSetCategories(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
        return basicSetCodeSets(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
        return basicSetComponents(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
        return basicSetConcepts(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPE:
        return basicSetDatatype(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPES:
        return basicSetDatatypes(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__FIELDS:
        return basicSetFields(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__GROUPS:
        return basicSetGroups(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__MESSAGES:
        return basicSetMessages(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
        return basicSetRepository(null, msgs);
      case RepositoryPackage.DOCUMENT_ROOT__SECTIONS:
        return basicSetSections(null, msgs);
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
      case RepositoryPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case RepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case RepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case RepositoryPackage.DOCUMENT_ROOT__ACTORS:
        return getActors();
      case RepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
        return getCategories();
      case RepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
        return getCodeSets();
      case RepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
        return getComponents();
      case RepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
        return getConcepts();
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPE:
        return getDatatype();
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPES:
        return getDatatypes();
      case RepositoryPackage.DOCUMENT_ROOT__FIELDS:
        return getFields();
      case RepositoryPackage.DOCUMENT_ROOT__GROUPS:
        return getGroups();
      case RepositoryPackage.DOCUMENT_ROOT__MESSAGES:
        return getMessages();
      case RepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
        return getRepository();
      case RepositoryPackage.DOCUMENT_ROOT__SECTIONS:
        return getSections();
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
      case RepositoryPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__ACTORS:
        setActors((ActorsType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
        setCategories((CategoriesType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
        setCodeSets((CodeSetsType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
        setComponents((ComponentsType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
        setConcepts((ConceptsType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPE:
        setDatatype((DatatypeType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPES:
        setDatatypes((DatatypesType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__FIELDS:
        setFields((FieldsType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__GROUPS:
        setGroups((GroupsType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__MESSAGES:
        setMessages((MessagesType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
        setRepository((RepositoryType)newValue);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__SECTIONS:
        setSections((SectionsType)newValue);
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
      case RepositoryPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case RepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case RepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case RepositoryPackage.DOCUMENT_ROOT__ACTORS:
        setActors((ActorsType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
        setCategories((CategoriesType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
        setCodeSets((CodeSetsType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
        setComponents((ComponentsType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
        setConcepts((ConceptsType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPE:
        setDatatype((DatatypeType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPES:
        setDatatypes((DatatypesType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__FIELDS:
        setFields((FieldsType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__GROUPS:
        setGroups((GroupsType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__MESSAGES:
        setMessages((MessagesType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
        setRepository((RepositoryType)null);
        return;
      case RepositoryPackage.DOCUMENT_ROOT__SECTIONS:
        setSections((SectionsType)null);
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
      case RepositoryPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case RepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case RepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case RepositoryPackage.DOCUMENT_ROOT__ACTORS:
        return getActors() != null;
      case RepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
        return getCategories() != null;
      case RepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
        return getCodeSets() != null;
      case RepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
        return getComponents() != null;
      case RepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
        return getConcepts() != null;
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPE:
        return getDatatype() != null;
      case RepositoryPackage.DOCUMENT_ROOT__DATATYPES:
        return getDatatypes() != null;
      case RepositoryPackage.DOCUMENT_ROOT__FIELDS:
        return getFields() != null;
      case RepositoryPackage.DOCUMENT_ROOT__GROUPS:
        return getGroups() != null;
      case RepositoryPackage.DOCUMENT_ROOT__MESSAGES:
        return getMessages() != null;
      case RepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
        return getRepository() != null;
      case RepositoryPackage.DOCUMENT_ROOT__SECTIONS:
        return getSections() != null;
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
