/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.AbbreviationsType;
import io.fixprotocol._2016.fixrepository.ActorsType;
import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.CategoriesType;
import io.fixprotocol._2016.fixrepository.CodeSetsType;
import io.fixprotocol._2016.fixrepository.ComponentsType;
import io.fixprotocol._2016.fixrepository.ConceptsType;
import io.fixprotocol._2016.fixrepository.DatatypesType;
import io.fixprotocol._2016.fixrepository.FieldsType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.GroupsType;
import io.fixprotocol._2016.fixrepository.MessagesType;
import io.fixprotocol._2016.fixrepository.RepositoryType;
import io.fixprotocol._2016.fixrepository.SectionsType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.purl.dc.terms.ElementOrRefinementContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getCodeSets <em>Code Sets</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getApplVerId <em>Appl Ver Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getLatestEP <em>Latest EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getSpecUrl <em>Spec Url</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryTypeImpl extends MinimalEObjectImpl.Container implements RepositoryType {
  /**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
  protected ElementOrRefinementContainer metadata;

  /**
	 * The cached value of the '{@link #getAbbreviations() <em>Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAbbreviations()
	 * @generated
	 * @ordered
	 */
  protected AbbreviationsType abbreviations;

  /**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
  protected CategoriesType categories;

  /**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
  protected SectionsType sections;

  /**
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
  protected DatatypesType datatypes;

  /**
	 * The cached value of the '{@link #getCodeSets() <em>Code Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCodeSets()
	 * @generated
	 * @ordered
	 */
  protected CodeSetsType codeSets;

  /**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
  protected FieldsType fields;

  /**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
  protected ActorsType actors;

  /**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
  protected ComponentsType components;

  /**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected GroupsType groups;

		/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
  protected MessagesType messages;

  /**
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
  protected ConceptsType concepts;

  /**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
  protected Annotation annotation;

  /**
	 * The default value of the '{@link #getApplVerId() <em>Appl Ver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getApplVerId()
	 * @generated
	 * @ordered
	 */
  protected static final String APPL_VER_ID_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getApplVerId() <em>Appl Ver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getApplVerId()
	 * @generated
	 * @ordered
	 */
  protected String applVerId = APPL_VER_ID_EDEFAULT;

  /**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "Score";

		/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

		/**
	 * This is true if the Expression Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expressionLanguageESet;

		/**
	 * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
  protected static final String GUID_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
  protected String guid = GUID_EDEFAULT;

  /**
	 * The default value of the '{@link #getLatestEP() <em>Latest EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatestEP()
	 * @generated
	 * @ordered
	 */
  protected static final BigInteger LATEST_EP_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLatestEP() <em>Latest EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatestEP()
	 * @generated
	 * @ordered
	 */
  protected BigInteger latestEP = LATEST_EP_EDEFAULT;

  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
  protected String namespace = NAMESPACE_EDEFAULT;

  /**
	 * The default value of the '{@link #getSpecUrl() <em>Spec Url</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSpecUrl()
	 * @generated
	 * @ordered
	 */
  protected static final String SPEC_URL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSpecUrl() <em>Spec Url</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSpecUrl()
	 * @generated
	 * @ordered
	 */
  protected String specUrl = SPEC_URL_EDEFAULT;

  /**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
  protected static final String VERSION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
  protected String version = VERSION_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RepositoryTypeImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getRepositoryType();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ElementOrRefinementContainer getMetadata() {
		return metadata;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMetadata(ElementOrRefinementContainer newMetadata, NotificationChain msgs) {
		ElementOrRefinementContainer oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setMetadata(ElementOrRefinementContainer newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__METADATA, newMetadata, newMetadata));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public AbbreviationsType getAbbreviations() {
		return abbreviations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAbbreviations(AbbreviationsType newAbbreviations, NotificationChain msgs) {
		AbbreviationsType oldAbbreviations = abbreviations;
		abbreviations = newAbbreviations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS, oldAbbreviations, newAbbreviations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setAbbreviations(AbbreviationsType newAbbreviations) {
		if (newAbbreviations != abbreviations) {
			NotificationChain msgs = null;
			if (abbreviations != null)
				msgs = ((InternalEObject)abbreviations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS, null, msgs);
			if (newAbbreviations != null)
				msgs = ((InternalEObject)newAbbreviations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS, null, msgs);
			msgs = basicSetAbbreviations(newAbbreviations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS, newAbbreviations, newAbbreviations));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CategoriesType getCategories() {
		return categories;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCategories(CategoriesType newCategories, NotificationChain msgs) {
		CategoriesType oldCategories = categories;
		categories = newCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES, oldCategories, newCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setCategories(CategoriesType newCategories) {
		if (newCategories != categories) {
			NotificationChain msgs = null;
			if (categories != null)
				msgs = ((InternalEObject)categories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES, null, msgs);
			if (newCategories != null)
				msgs = ((InternalEObject)newCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES, null, msgs);
			msgs = basicSetCategories(newCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES, newCategories, newCategories));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public SectionsType getSections() {
		return sections;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSections(SectionsType newSections, NotificationChain msgs) {
		SectionsType oldSections = sections;
		sections = newSections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS, oldSections, newSections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setSections(SectionsType newSections) {
		if (newSections != sections) {
			NotificationChain msgs = null;
			if (sections != null)
				msgs = ((InternalEObject)sections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS, null, msgs);
			if (newSections != null)
				msgs = ((InternalEObject)newSections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS, null, msgs);
			msgs = basicSetSections(newSections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS, newSections, newSections));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DatatypesType getDatatypes() {
		return datatypes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDatatypes(DatatypesType newDatatypes, NotificationChain msgs) {
		DatatypesType oldDatatypes = datatypes;
		datatypes = newDatatypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES, oldDatatypes, newDatatypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDatatypes(DatatypesType newDatatypes) {
		if (newDatatypes != datatypes) {
			NotificationChain msgs = null;
			if (datatypes != null)
				msgs = ((InternalEObject)datatypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES, null, msgs);
			if (newDatatypes != null)
				msgs = ((InternalEObject)newDatatypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES, null, msgs);
			msgs = basicSetDatatypes(newDatatypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES, newDatatypes, newDatatypes));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CodeSetsType getCodeSets() {
		return codeSets;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCodeSets(CodeSetsType newCodeSets, NotificationChain msgs) {
		CodeSetsType oldCodeSets = codeSets;
		codeSets = newCodeSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS, oldCodeSets, newCodeSets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setCodeSets(CodeSetsType newCodeSets) {
		if (newCodeSets != codeSets) {
			NotificationChain msgs = null;
			if (codeSets != null)
				msgs = ((InternalEObject)codeSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS, null, msgs);
			if (newCodeSets != null)
				msgs = ((InternalEObject)newCodeSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS, null, msgs);
			msgs = basicSetCodeSets(newCodeSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS, newCodeSets, newCodeSets));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FieldsType getFields() {
		return fields;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFields(FieldsType newFields, NotificationChain msgs) {
		FieldsType oldFields = fields;
		fields = newFields;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__FIELDS, oldFields, newFields);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setFields(FieldsType newFields) {
		if (newFields != fields) {
			NotificationChain msgs = null;
			if (fields != null)
				msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__FIELDS, null, msgs);
			if (newFields != null)
				msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__FIELDS, null, msgs);
			msgs = basicSetFields(newFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__FIELDS, newFields, newFields));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ActorsType getActors() {
		return actors;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetActors(ActorsType newActors, NotificationChain msgs) {
		ActorsType oldActors = actors;
		actors = newActors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__ACTORS, oldActors, newActors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setActors(ActorsType newActors) {
		if (newActors != actors) {
			NotificationChain msgs = null;
			if (actors != null)
				msgs = ((InternalEObject)actors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__ACTORS, null, msgs);
			if (newActors != null)
				msgs = ((InternalEObject)newActors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__ACTORS, null, msgs);
			msgs = basicSetActors(newActors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__ACTORS, newActors, newActors));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ComponentsType getComponents() {
		return components;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetComponents(ComponentsType newComponents, NotificationChain msgs) {
		ComponentsType oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS, oldComponents, newComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setComponents(ComponentsType newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS, newComponents, newComponents));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupsType getGroups() {
		return groups;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroups(GroupsType newGroups, NotificationChain msgs) {
		GroupsType oldGroups = groups;
		groups = newGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__GROUPS, oldGroups, newGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroups(GroupsType newGroups) {
		if (newGroups != groups) {
			NotificationChain msgs = null;
			if (groups != null)
				msgs = ((InternalEObject)groups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__GROUPS, null, msgs);
			if (newGroups != null)
				msgs = ((InternalEObject)newGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__GROUPS, null, msgs);
			msgs = basicSetGroups(newGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__GROUPS, newGroups, newGroups));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public MessagesType getMessages() {
		return messages;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMessages(MessagesType newMessages, NotificationChain msgs) {
		MessagesType oldMessages = messages;
		messages = newMessages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES, oldMessages, newMessages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setMessages(MessagesType newMessages) {
		if (newMessages != messages) {
			NotificationChain msgs = null;
			if (messages != null)
				msgs = ((InternalEObject)messages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES, null, msgs);
			if (newMessages != null)
				msgs = ((InternalEObject)newMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES, null, msgs);
			msgs = basicSetMessages(newMessages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES, newMessages, newMessages));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ConceptsType getConcepts() {
		return concepts;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetConcepts(ConceptsType newConcepts, NotificationChain msgs) {
		ConceptsType oldConcepts = concepts;
		concepts = newConcepts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS, oldConcepts, newConcepts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setConcepts(ConceptsType newConcepts) {
		if (newConcepts != concepts) {
			NotificationChain msgs = null;
			if (concepts != null)
				msgs = ((InternalEObject)concepts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS, null, msgs);
			if (newConcepts != null)
				msgs = ((InternalEObject)newConcepts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS, null, msgs);
			msgs = basicSetConcepts(newConcepts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS, newConcepts, newConcepts));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Annotation getAnnotation() {
		return annotation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setAnnotation(Annotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION, newAnnotation, newAnnotation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getApplVerId() {
		return applVerId;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setApplVerId(String newApplVerId) {
		String oldApplVerId = applVerId;
		applVerId = newApplVerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__APPL_VER_ID, oldApplVerId, applVerId));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage, !oldExpressionLanguageESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExpressionLanguage() {
		String oldExpressionLanguage = expressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;
		expressionLanguageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.REPOSITORY_TYPE__EXPRESSION_LANGUAGE, oldExpressionLanguage, EXPRESSION_LANGUAGE_EDEFAULT, oldExpressionLanguageESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExpressionLanguage() {
		return expressionLanguageESet;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getGuid() {
		return guid;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setGuid(String newGuid) {
		String oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__GUID, oldGuid, guid));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BigInteger getLatestEP() {
		return latestEP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLatestEP(BigInteger newLatestEP) {
		BigInteger oldLatestEP = latestEP;
		latestEP = newLatestEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__LATEST_EP, oldLatestEP, latestEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getName() {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getNamespace() {
		return namespace;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__NAMESPACE, oldNamespace, namespace));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getSpecUrl() {
		return specUrl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setSpecUrl(String newSpecUrl) {
		String oldSpecUrl = specUrl;
		specUrl = newSpecUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__SPEC_URL, oldSpecUrl, specUrl));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getVersion() {
		return version;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.REPOSITORY_TYPE__VERSION, oldVersion, version));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.REPOSITORY_TYPE__METADATA:
				return basicSetMetadata(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS:
				return basicSetAbbreviations(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES:
				return basicSetCategories(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS:
				return basicSetSections(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES:
				return basicSetDatatypes(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS:
				return basicSetCodeSets(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__FIELDS:
				return basicSetFields(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__ACTORS:
				return basicSetActors(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS:
				return basicSetComponents(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__GROUPS:
				return basicSetGroups(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES:
				return basicSetMessages(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS:
				return basicSetConcepts(null, msgs);
			case FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
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
			case FixrepositoryPackage.REPOSITORY_TYPE__METADATA:
				return getMetadata();
			case FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS:
				return getAbbreviations();
			case FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES:
				return getCategories();
			case FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS:
				return getSections();
			case FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES:
				return getDatatypes();
			case FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS:
				return getCodeSets();
			case FixrepositoryPackage.REPOSITORY_TYPE__FIELDS:
				return getFields();
			case FixrepositoryPackage.REPOSITORY_TYPE__ACTORS:
				return getActors();
			case FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS:
				return getComponents();
			case FixrepositoryPackage.REPOSITORY_TYPE__GROUPS:
				return getGroups();
			case FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES:
				return getMessages();
			case FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS:
				return getConcepts();
			case FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION:
				return getAnnotation();
			case FixrepositoryPackage.REPOSITORY_TYPE__APPL_VER_ID:
				return getApplVerId();
			case FixrepositoryPackage.REPOSITORY_TYPE__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case FixrepositoryPackage.REPOSITORY_TYPE__GUID:
				return getGuid();
			case FixrepositoryPackage.REPOSITORY_TYPE__LATEST_EP:
				return getLatestEP();
			case FixrepositoryPackage.REPOSITORY_TYPE__NAME:
				return getName();
			case FixrepositoryPackage.REPOSITORY_TYPE__NAMESPACE:
				return getNamespace();
			case FixrepositoryPackage.REPOSITORY_TYPE__SPEC_URL:
				return getSpecUrl();
			case FixrepositoryPackage.REPOSITORY_TYPE__VERSION:
				return getVersion();
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
			case FixrepositoryPackage.REPOSITORY_TYPE__METADATA:
				setMetadata((ElementOrRefinementContainer)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS:
				setAbbreviations((AbbreviationsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES:
				setCategories((CategoriesType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS:
				setSections((SectionsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES:
				setDatatypes((DatatypesType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS:
				setCodeSets((CodeSetsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__FIELDS:
				setFields((FieldsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__ACTORS:
				setActors((ActorsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS:
				setComponents((ComponentsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__GROUPS:
				setGroups((GroupsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES:
				setMessages((MessagesType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS:
				setConcepts((ConceptsType)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__APPL_VER_ID:
				setApplVerId((String)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__GUID:
				setGuid((String)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__LATEST_EP:
				setLatestEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__NAME:
				setName((String)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__SPEC_URL:
				setSpecUrl((String)newValue);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__VERSION:
				setVersion((String)newValue);
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
			case FixrepositoryPackage.REPOSITORY_TYPE__METADATA:
				setMetadata((ElementOrRefinementContainer)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS:
				setAbbreviations((AbbreviationsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES:
				setCategories((CategoriesType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS:
				setSections((SectionsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES:
				setDatatypes((DatatypesType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS:
				setCodeSets((CodeSetsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__FIELDS:
				setFields((FieldsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__ACTORS:
				setActors((ActorsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS:
				setComponents((ComponentsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__GROUPS:
				setGroups((GroupsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES:
				setMessages((MessagesType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS:
				setConcepts((ConceptsType)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__APPL_VER_ID:
				setApplVerId(APPL_VER_ID_EDEFAULT);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__EXPRESSION_LANGUAGE:
				unsetExpressionLanguage();
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__LATEST_EP:
				setLatestEP(LATEST_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__SPEC_URL:
				setSpecUrl(SPEC_URL_EDEFAULT);
				return;
			case FixrepositoryPackage.REPOSITORY_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case FixrepositoryPackage.REPOSITORY_TYPE__METADATA:
				return metadata != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__ABBREVIATIONS:
				return abbreviations != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__CATEGORIES:
				return categories != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__SECTIONS:
				return sections != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__DATATYPES:
				return datatypes != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__CODE_SETS:
				return codeSets != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__FIELDS:
				return fields != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__ACTORS:
				return actors != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__COMPONENTS:
				return components != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__GROUPS:
				return groups != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__MESSAGES:
				return messages != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__CONCEPTS:
				return concepts != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__ANNOTATION:
				return annotation != null;
			case FixrepositoryPackage.REPOSITORY_TYPE__APPL_VER_ID:
				return APPL_VER_ID_EDEFAULT == null ? applVerId != null : !APPL_VER_ID_EDEFAULT.equals(applVerId);
			case FixrepositoryPackage.REPOSITORY_TYPE__EXPRESSION_LANGUAGE:
				return isSetExpressionLanguage();
			case FixrepositoryPackage.REPOSITORY_TYPE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case FixrepositoryPackage.REPOSITORY_TYPE__LATEST_EP:
				return LATEST_EP_EDEFAULT == null ? latestEP != null : !LATEST_EP_EDEFAULT.equals(latestEP);
			case FixrepositoryPackage.REPOSITORY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FixrepositoryPackage.REPOSITORY_TYPE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case FixrepositoryPackage.REPOSITORY_TYPE__SPEC_URL:
				return SPEC_URL_EDEFAULT == null ? specUrl != null : !SPEC_URL_EDEFAULT.equals(specUrl);
			case FixrepositoryPackage.REPOSITORY_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (applVerId: ");
		result.append(applVerId);
		result.append(", expressionLanguage: ");
		if (expressionLanguageESet) result.append(expressionLanguage); else result.append("<unset>");
		result.append(", guid: ");
		result.append(guid);
		result.append(", latestEP: ");
		result.append(latestEP);
		result.append(", name: ");
		result.append(name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", specUrl: ");
		result.append(specUrl);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //RepositoryTypeImpl
