/**
 */
package io.fixprotocol._2016.fixrepository;

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
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getActors <em>Actors</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getCategories <em>Categories</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getCodeSets <em>Code Sets</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getComponents <em>Components</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getFields <em>Fields</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getGroups <em>Groups</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMappedDatatype <em>Mapped Datatype</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMessages <em>Messages</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getRepository <em>Repository</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Mixed()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
  EMap<String, String> getXSISchemaLocation();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Abbreviations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbreviations' namespace='##targetNamespace'"
	 * @generated
	 */
  AbbreviationsType getAbbreviations();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getAbbreviations <em>Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviations</em>' containment reference.
	 * @see #getAbbreviations()
	 * @generated
	 */
  void setAbbreviations(AbbreviationsType value);

  /**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants and the message flows between them
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference.
	 * @see #setActors(ActorsType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Actors()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actors' namespace='##targetNamespace'"
	 * @generated
	 */
  ActorsType getActors();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getActors <em>Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actors</em>' containment reference.
	 * @see #getActors()
	 * @generated
	 */
  void setActors(ActorsType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Categories()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='categories' namespace='##targetNamespace'"
	 * @generated
	 */
  CategoriesType getCategories();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
  void setCategories(CategoriesType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_CodeSets()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='codeSets' namespace='##targetNamespace'"
	 * @generated
	 */
  CodeSetsType getCodeSets();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getCodeSets <em>Code Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Sets</em>' containment reference.
	 * @see #getCodeSets()
	 * @generated
	 */
  void setCodeSets(CodeSetsType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Components()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
  ComponentsType getComponents();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
  void setComponents(ComponentsType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Concepts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='concepts' namespace='##targetNamespace'"
	 * @generated
	 */
  ConceptsType getConcepts();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getConcepts <em>Concepts</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concepts</em>' containment reference.
	 * @see #getConcepts()
	 * @generated
	 */
  void setConcepts(ConceptsType value);

  /**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference.
	 * @see #setDatatype(DatatypeType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Datatype()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
  DatatypeType getDatatype();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatype <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' containment reference.
	 * @see #getDatatype()
	 * @generated
	 */
  void setDatatype(DatatypeType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Datatypes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='datatypes' namespace='##targetNamespace'"
	 * @generated
	 */
  DatatypesType getDatatypes();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatypes <em>Datatypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatypes</em>' containment reference.
	 * @see #getDatatypes()
	 * @generated
	 */
  void setDatatypes(DatatypesType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Fields()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fields' namespace='##targetNamespace'"
	 * @generated
	 */
  FieldsType getFields();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' containment reference.
	 * @see #getFields()
	 * @generated
	 */
  void setFields(FieldsType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Groups()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='groups' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupsType getGroups();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getGroups <em>Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups</em>' containment reference.
	 * @see #getGroups()
	 * @generated
	 */
	void setGroups(GroupsType value);

		/**
	 * Returns the value of the '<em><b>Mapped Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Datatype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Datatype</em>' containment reference.
	 * @see #setMappedDatatype(MappedDatatypeType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_MappedDatatype()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mappedDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
  MappedDatatypeType getMappedDatatype();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMappedDatatype <em>Mapped Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Datatype</em>' containment reference.
	 * @see #getMappedDatatype()
	 * @generated
	 */
  void setMappedDatatype(MappedDatatypeType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Messages()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='messages' namespace='##targetNamespace'"
	 * @generated
	 */
  MessagesType getMessages();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMessages <em>Messages</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages</em>' containment reference.
	 * @see #getMessages()
	 * @generated
	 */
  void setMessages(MessagesType value);

  /**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(RepositoryType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Repository()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='repository' namespace='##targetNamespace'"
	 * @generated
	 */
  RepositoryType getRepository();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
  void setRepository(RepositoryType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDocumentRoot_Sections()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sections' namespace='##targetNamespace'"
	 * @generated
	 */
  SectionsType getSections();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getSections <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' containment reference.
	 * @see #getSections()
	 * @generated
	 */
  void setSections(SectionsType value);

} // DocumentRoot
