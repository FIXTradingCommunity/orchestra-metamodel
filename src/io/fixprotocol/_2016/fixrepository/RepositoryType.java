/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.purl.dc.terms.ElementOrRefinementContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getCategories <em>Categories</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getSections <em>Sections</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getCodeSets <em>Code Sets</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getFields <em>Fields</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getActors <em>Actors</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getComponents <em>Components</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getGroups <em>Groups</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getMessages <em>Messages</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getApplVerId <em>Appl Ver Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getGuid <em>Guid</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getLatestEP <em>Latest EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getSpecUrl <em>Spec Url</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.RepositoryType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType()
 * @model extendedMetaData="name='repository_._type' kind='elementOnly'"
 * @generated
 */
public interface RepositoryType extends EObject {
  /**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(ElementOrRefinementContainer)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
  ElementOrRefinementContainer getMetadata();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
  void setMetadata(ElementOrRefinementContainer value);

  /**
	 * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbreviations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviations</em>' containment reference.
	 * @see #setAbbreviations(AbbreviationsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Abbreviations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abbreviations' namespace='##targetNamespace'"
	 * @generated
	 */
  AbbreviationsType getAbbreviations();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getAbbreviations <em>Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviations</em>' containment reference.
	 * @see #getAbbreviations()
	 * @generated
	 */
  void setAbbreviations(AbbreviationsType value);

  /**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Categories</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(CategoriesType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Categories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='categories' namespace='##targetNamespace'"
	 * @generated
	 */
  CategoriesType getCategories();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
  void setCategories(CategoriesType value);

  /**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference.
	 * @see #setSections(SectionsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Sections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sections' namespace='##targetNamespace'"
	 * @generated
	 */
  SectionsType getSections();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getSections <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' containment reference.
	 * @see #getSections()
	 * @generated
	 */
  void setSections(SectionsType value);

  /**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatypes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference.
	 * @see #setDatatypes(DatatypesType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Datatypes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datatypes' namespace='##targetNamespace'"
	 * @generated
	 */
  DatatypesType getDatatypes();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getDatatypes <em>Datatypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatypes</em>' containment reference.
	 * @see #getDatatypes()
	 * @generated
	 */
  void setDatatypes(DatatypesType value);

  /**
	 * Returns the value of the '<em><b>Code Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Sets</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Sets</em>' containment reference.
	 * @see #setCodeSets(CodeSetsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_CodeSets()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSets' namespace='##targetNamespace'"
	 * @generated
	 */
  CodeSetsType getCodeSets();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getCodeSets <em>Code Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Sets</em>' containment reference.
	 * @see #getCodeSets()
	 * @generated
	 */
  void setCodeSets(CodeSetsType value);

  /**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference.
	 * @see #setFields(FieldsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Fields()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fields' namespace='##targetNamespace'"
	 * @generated
	 */
  FieldsType getFields();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' containment reference.
	 * @see #getFields()
	 * @generated
	 */
  void setFields(FieldsType value);

  /**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants and the message flows between them
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference.
	 * @see #setActors(ActorsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Actors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actors' namespace='##targetNamespace'"
	 * @generated
	 */
  ActorsType getActors();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getActors <em>Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actors</em>' containment reference.
	 * @see #getActors()
	 * @generated
	 */
  void setActors(ActorsType value);

  /**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(ComponentsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
  ComponentsType getComponents();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
  void setComponents(ComponentsType value);

  /**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference.
	 * @see #setGroups(GroupsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Groups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groups' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupsType getGroups();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getGroups <em>Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups</em>' containment reference.
	 * @see #getGroups()
	 * @generated
	 */
	void setGroups(GroupsType value);

		/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference.
	 * @see #setMessages(MessagesType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Messages()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='messages' namespace='##targetNamespace'"
	 * @generated
	 */
  MessagesType getMessages();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getMessages <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages</em>' containment reference.
	 * @see #getMessages()
	 * @generated
	 */
  void setMessages(MessagesType value);

  /**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concepts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference.
	 * @see #setConcepts(ConceptsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Concepts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concepts' namespace='##targetNamespace'"
	 * @generated
	 */
  ConceptsType getConcepts();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getConcepts <em>Concepts</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concepts</em>' containment reference.
	 * @see #getConcepts()
	 * @generated
	 */
  void setConcepts(ConceptsType value);

  /**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
  Annotation getAnnotation();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
  void setAnnotation(Annotation value);

  /**
	 * Returns the value of the '<em><b>Appl Ver Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Appl Ver Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Appl Ver Id</em>' attribute.
	 * @see #setApplVerId(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_ApplVerId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='applVerId'"
	 * @generated
	 */
  String getApplVerId();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getApplVerId <em>Appl Ver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appl Ver Id</em>' attribute.
	 * @see #getApplVerId()
	 * @generated
	 */
  void setApplVerId(String value);

  /**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * The default value is <code>"Score"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The syntax of 'expressionType'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #isSetExpressionLanguage()
	 * @see #unsetExpressionLanguage()
	 * @see #setExpressionLanguage(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_ExpressionLanguage()
	 * @model default="Score" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='expressionLanguage'"
	 * @generated
	 */
	String getExpressionLanguage();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #isSetExpressionLanguage()
	 * @see #unsetExpressionLanguage()
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

		/**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpressionLanguage()
	 * @see #getExpressionLanguage()
	 * @see #setExpressionLanguage(String)
	 * @generated
	 */
	void unsetExpressionLanguage();

		/**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getExpressionLanguage <em>Expression Language</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expression Language</em>' attribute is set.
	 * @see #unsetExpressionLanguage()
	 * @see #getExpressionLanguage()
	 * @see #setExpressionLanguage(String)
	 * @generated
	 */
	boolean isSetExpressionLanguage();

		/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Guid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='guid'"
	 * @generated
	 */
  String getGuid();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
  void setGuid(String value);

  /**
	 * Returns the value of the '<em><b>Latest EP</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latest EP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest EP</em>' attribute.
	 * @see #setLatestEP(BigInteger)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_LatestEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='latestEP'"
	 * @generated
	 */
  BigInteger getLatestEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getLatestEP <em>Latest EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest EP</em>' attribute.
	 * @see #getLatestEP()
	 * @generated
	 */
  void setLatestEP(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stable name that does not change with minor version updates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An associated namespace as URI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='namespace'"
	 * @generated
	 */
  String getNamespace();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
  void setNamespace(String value);

  /**
	 * Returns the value of the '<em><b>Spec Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spec Url</em>' attribute.
	 * @see #setSpecUrl(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_SpecUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='specUrl'"
	 * @generated
	 */
  String getSpecUrl();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getSpecUrl <em>Spec Url</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Url</em>' attribute.
	 * @see #getSpecUrl()
	 * @generated
	 */
  void setSpecUrl(String value);

  /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getRepositoryType_Version()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
  String getVersion();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
  void setVersion(String value);

} // RepositoryType
