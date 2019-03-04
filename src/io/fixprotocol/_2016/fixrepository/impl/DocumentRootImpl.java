/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.AbbreviationsType;
import io.fixprotocol._2016.fixrepository.ActorsType;
import io.fixprotocol._2016.fixrepository.CategoriesType;
import io.fixprotocol._2016.fixrepository.CodeSetsType;
import io.fixprotocol._2016.fixrepository.ComponentsType;
import io.fixprotocol._2016.fixrepository.ConceptsType;
import io.fixprotocol._2016.fixrepository.DatatypeType;
import io.fixprotocol._2016.fixrepository.DatatypesType;
import io.fixprotocol._2016.fixrepository.DocumentRoot;
import io.fixprotocol._2016.fixrepository.FieldsType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupsType;
import io.fixprotocol._2016.fixrepository.MappedDatatypeType;
import io.fixprotocol._2016.fixrepository.MessagesType;
import io.fixprotocol._2016.fixrepository.RepositoryType;
import io.fixprotocol._2016.fixrepository.SectionsType;

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
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getCodeSets <em>Code Sets</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getMappedDatatype <em>Mapped Datatype</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl#getSections <em>Sections</em>}</li>
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
		return FixrepositoryPackage.eINSTANCE.getDocumentRoot();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FixrepositoryPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FixrepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FixrepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public AbbreviationsType getAbbreviations() {
		return (AbbreviationsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Abbreviations(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAbbreviations(AbbreviationsType newAbbreviations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Abbreviations(), newAbbreviations, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setAbbreviations(AbbreviationsType newAbbreviations) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Abbreviations(), newAbbreviations);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ActorsType getActors() {
		return (ActorsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Actors(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetActors(ActorsType newActors, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Actors(), newActors, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setActors(ActorsType newActors) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Actors(), newActors);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CategoriesType getCategories() {
		return (CategoriesType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Categories(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCategories(CategoriesType newCategories, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Categories(), newCategories, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setCategories(CategoriesType newCategories) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Categories(), newCategories);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CodeSetsType getCodeSets() {
		return (CodeSetsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_CodeSets(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCodeSets(CodeSetsType newCodeSets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_CodeSets(), newCodeSets, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setCodeSets(CodeSetsType newCodeSets) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_CodeSets(), newCodeSets);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ComponentsType getComponents() {
		return (ComponentsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Components(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetComponents(ComponentsType newComponents, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Components(), newComponents, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setComponents(ComponentsType newComponents) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Components(), newComponents);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ConceptsType getConcepts() {
		return (ConceptsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Concepts(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetConcepts(ConceptsType newConcepts, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Concepts(), newConcepts, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setConcepts(ConceptsType newConcepts) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Concepts(), newConcepts);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DatatypeType getDatatype() {
		return (DatatypeType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Datatype(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDatatype(DatatypeType newDatatype, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Datatype(), newDatatype, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDatatype(DatatypeType newDatatype) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Datatype(), newDatatype);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DatatypesType getDatatypes() {
		return (DatatypesType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Datatypes(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDatatypes(DatatypesType newDatatypes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Datatypes(), newDatatypes, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDatatypes(DatatypesType newDatatypes) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Datatypes(), newDatatypes);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FieldsType getFields() {
		return (FieldsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Fields(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFields(FieldsType newFields, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Fields(), newFields, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setFields(FieldsType newFields) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Fields(), newFields);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupsType getGroups() {
		return (GroupsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Groups(), true);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroups(GroupsType newGroups, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Groups(), newGroups, msgs);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroups(GroupsType newGroups) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Groups(), newGroups);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public MappedDatatypeType getMappedDatatype() {
		return (MappedDatatypeType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_MappedDatatype(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMappedDatatype(MappedDatatypeType newMappedDatatype, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_MappedDatatype(), newMappedDatatype, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setMappedDatatype(MappedDatatypeType newMappedDatatype) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_MappedDatatype(), newMappedDatatype);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public MessagesType getMessages() {
		return (MessagesType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Messages(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMessages(MessagesType newMessages, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Messages(), newMessages, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setMessages(MessagesType newMessages) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Messages(), newMessages);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public RepositoryType getRepository() {
		return (RepositoryType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Repository(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRepository(RepositoryType newRepository, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Repository(), newRepository, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setRepository(RepositoryType newRepository) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Repository(), newRepository);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public SectionsType getSections() {
		return (SectionsType)getMixed().get(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Sections(), true);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSections(SectionsType newSections, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Sections(), newSections, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setSections(SectionsType newSections) {
		((FeatureMap.Internal)getMixed()).set(FixrepositoryPackage.eINSTANCE.getDocumentRoot_Sections(), newSections);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__ABBREVIATIONS:
				return basicSetAbbreviations(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__ACTORS:
				return basicSetActors(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
				return basicSetCategories(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
				return basicSetCodeSets(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
				return basicSetComponents(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
				return basicSetConcepts(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPE:
				return basicSetDatatype(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPES:
				return basicSetDatatypes(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__FIELDS:
				return basicSetFields(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__GROUPS:
				return basicSetGroups(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__MAPPED_DATATYPE:
				return basicSetMappedDatatype(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__MESSAGES:
				return basicSetMessages(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
				return basicSetRepository(null, msgs);
			case FixrepositoryPackage.DOCUMENT_ROOT__SECTIONS:
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
			case FixrepositoryPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FixrepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case FixrepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case FixrepositoryPackage.DOCUMENT_ROOT__ABBREVIATIONS:
				return getAbbreviations();
			case FixrepositoryPackage.DOCUMENT_ROOT__ACTORS:
				return getActors();
			case FixrepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
				return getCategories();
			case FixrepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
				return getCodeSets();
			case FixrepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
				return getComponents();
			case FixrepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
				return getConcepts();
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPE:
				return getDatatype();
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPES:
				return getDatatypes();
			case FixrepositoryPackage.DOCUMENT_ROOT__FIELDS:
				return getFields();
			case FixrepositoryPackage.DOCUMENT_ROOT__GROUPS:
				return getGroups();
			case FixrepositoryPackage.DOCUMENT_ROOT__MAPPED_DATATYPE:
				return getMappedDatatype();
			case FixrepositoryPackage.DOCUMENT_ROOT__MESSAGES:
				return getMessages();
			case FixrepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
				return getRepository();
			case FixrepositoryPackage.DOCUMENT_ROOT__SECTIONS:
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
			case FixrepositoryPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__ABBREVIATIONS:
				setAbbreviations((AbbreviationsType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__ACTORS:
				setActors((ActorsType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
				setCategories((CategoriesType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
				setCodeSets((CodeSetsType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
				setComponents((ComponentsType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
				setConcepts((ConceptsType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPE:
				setDatatype((DatatypeType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPES:
				setDatatypes((DatatypesType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__FIELDS:
				setFields((FieldsType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__GROUPS:
				setGroups((GroupsType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__MAPPED_DATATYPE:
				setMappedDatatype((MappedDatatypeType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__MESSAGES:
				setMessages((MessagesType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
				setRepository((RepositoryType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__SECTIONS:
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
			case FixrepositoryPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__ABBREVIATIONS:
				setAbbreviations((AbbreviationsType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__ACTORS:
				setActors((ActorsType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
				setCategories((CategoriesType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
				setCodeSets((CodeSetsType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
				setComponents((ComponentsType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
				setConcepts((ConceptsType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPE:
				setDatatype((DatatypeType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPES:
				setDatatypes((DatatypesType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__FIELDS:
				setFields((FieldsType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__GROUPS:
				setGroups((GroupsType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__MAPPED_DATATYPE:
				setMappedDatatype((MappedDatatypeType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__MESSAGES:
				setMessages((MessagesType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
				setRepository((RepositoryType)null);
				return;
			case FixrepositoryPackage.DOCUMENT_ROOT__SECTIONS:
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
			case FixrepositoryPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FixrepositoryPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case FixrepositoryPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case FixrepositoryPackage.DOCUMENT_ROOT__ABBREVIATIONS:
				return getAbbreviations() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__ACTORS:
				return getActors() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__CATEGORIES:
				return getCategories() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__CODE_SETS:
				return getCodeSets() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__COMPONENTS:
				return getComponents() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__CONCEPTS:
				return getConcepts() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPE:
				return getDatatype() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__DATATYPES:
				return getDatatypes() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__FIELDS:
				return getFields() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__GROUPS:
				return getGroups() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__MAPPED_DATATYPE:
				return getMappedDatatype() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__MESSAGES:
				return getMessages() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__REPOSITORY:
				return getRepository() != null;
			case FixrepositoryPackage.DOCUMENT_ROOT__SECTIONS:
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
