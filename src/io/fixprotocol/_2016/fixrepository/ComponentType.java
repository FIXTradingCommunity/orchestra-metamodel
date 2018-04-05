/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getAbbrName <em>Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getCategory <em>Category</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getExtends <em>Extends</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getOid <em>Oid</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getRendering <em>Rendering</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getScenario <em>Scenario</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentType#getUpdatedEP <em>Updated EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType()
 * @model extendedMetaData="name='componentType' kind='elementOnly'"
 * @generated
 */
public interface ComponentType extends EObject {
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
  FeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Component Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.ComponentRefType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Ref</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_ComponentRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='componentRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<ComponentRefType> getComponentRef();

  /**
   * Returns the value of the '<em><b>Group Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.GroupRefType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Ref</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_GroupRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<GroupRefType> getGroupRef();

  /**
   * Returns the value of the '<em><b>Field Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.FieldRefType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Ref</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_FieldRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<FieldRefType> getFieldRef();

  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.ComponentType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Component()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<ComponentType> getComponent();

  /**
   * Returns the value of the '<em><b>Group1</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.GroupType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group1</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Group1()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<GroupType> getGroup1();

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.FieldType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Field()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<FieldType> getField();

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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

  /**
   * Returns the value of the '<em><b>Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbr Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abbr Name</em>' attribute.
   * @see #setAbbrName(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_AbbrName()
   * @model dataType="io.fixprotocol._2016.fixrepository.AbbreviationT"
   *        extendedMetaData="kind='attribute' name='abbrName'"
   * @generated
   */
  String getAbbrName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAbbrName <em>Abbr Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abbr Name</em>' attribute.
   * @see #getAbbrName()
   * @generated
   */
  void setAbbrName(String value);

  /**
   * Returns the value of the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Added</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added</em>' attribute.
   * @see #setAdded(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Added()
   * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
   *        extendedMetaData="kind='attribute' name='added'"
   * @generated
   */
  String getAdded();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAdded <em>Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Added</em>' attribute.
   * @see #getAdded()
   * @generated
   */
  void setAdded(String value);

  /**
   * Returns the value of the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Added EP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added EP</em>' attribute.
   * @see #setAddedEP(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_AddedEP()
   * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
   *        extendedMetaData="kind='attribute' name='addedEP'"
   * @generated
   */
  BigInteger getAddedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAddedEP <em>Added EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Added EP</em>' attribute.
   * @see #getAddedEP()
   * @generated
   */
  void setAddedEP(BigInteger value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' attribute.
   * @see #setCategory(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Category()
   * @model dataType="io.fixprotocol._2016.fixrepository.CategoryIDT"
   *        extendedMetaData="kind='attribute' name='category'"
   * @generated
   */
  String getCategory();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getCategory <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' attribute.
   * @see #getCategory()
   * @generated
   */
  void setCategory(String value);

  /**
   * Returns the value of the '<em><b>Change Type</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.ChangeTypeT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Change Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Type</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.ChangeTypeT
   * @see #isSetChangeType()
   * @see #unsetChangeType()
   * @see #setChangeType(ChangeTypeT)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_ChangeType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='changeType'"
   * @generated
   */
  ChangeTypeT getChangeType();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getChangeType <em>Change Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change Type</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.ChangeTypeT
   * @see #isSetChangeType()
   * @see #unsetChangeType()
   * @see #getChangeType()
   * @generated
   */
  void setChangeType(ChangeTypeT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getChangeType <em>Change Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetChangeType()
   * @see #getChangeType()
   * @see #setChangeType(ChangeTypeT)
   * @generated
   */
  void unsetChangeType();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getChangeType <em>Change Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Change Type</em>' attribute is set.
   * @see #unsetChangeType()
   * @see #getChangeType()
   * @see #setChangeType(ChangeTypeT)
   * @generated
   */
  boolean isSetChangeType();

  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see #setDeprecated(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Deprecated()
   * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
   *        extendedMetaData="kind='attribute' name='deprecated'"
   * @generated
   */
  String getDeprecated();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getDeprecated <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' attribute.
   * @see #getDeprecated()
   * @generated
   */
  void setDeprecated(String value);

  /**
   * Returns the value of the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deprecated EP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated EP</em>' attribute.
   * @see #setDeprecatedEP(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_DeprecatedEP()
   * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
   *        extendedMetaData="kind='attribute' name='deprecatedEP'"
   * @generated
   */
  BigInteger getDeprecatedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getDeprecatedEP <em>Deprecated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated EP</em>' attribute.
   * @see #getDeprecatedEP()
   * @generated
   */
  void setDeprecatedEP(BigInteger value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * If present, refers to another scenario, assuming
   * 					the same component name
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extends</em>' attribute.
   * @see #setExtends(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Extends()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='extends'"
   * @generated
   */
  String getExtends();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getExtends <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' attribute.
   * @see #getExtends()
   * @generated
   */
  void setExtends(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Id()
   * @model dataType="io.fixprotocol._2016.fixrepository.IdT" required="true"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  BigInteger getId();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(BigInteger value);

  /**
   * Returns the value of the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Issue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issue</em>' attribute.
   * @see #setIssue(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Issue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='issue'"
   * @generated
   */
  String getIssue();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getIssue <em>Issue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Issue</em>' attribute.
   * @see #getIssue()
   * @generated
   */
  void setIssue(String value);

  /**
   * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Modified</em>' attribute.
   * @see #setLastModified(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_LastModified()
   * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
   *        extendedMetaData="kind='attribute' name='lastModified'"
   * @generated
   */
  String getLastModified();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getLastModified <em>Last Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Modified</em>' attribute.
   * @see #getLastModified()
   * @generated
   */
  void setLastModified(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Name()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Oid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * An object ID or URI
   * <!-- end-model-doc -->
   * @return the value of the '<em>Oid</em>' attribute.
   * @see #setOid(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Oid()
   * @model dataType="io.fixprotocol._2016.fixrepository.OidOrUriT"
   *        extendedMetaData="kind='attribute' name='oid'"
   * @generated
   */
  String getOid();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getOid <em>Oid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oid</em>' attribute.
   * @see #getOid()
   * @generated
   */
  void setOid(String value);

  /**
   * Returns the value of the '<em><b>Rendering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * A hint to processes about how to interpret the element. Not validated.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rendering</em>' attribute.
   * @see #setRendering(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Rendering()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='rendering'"
   * @generated
   */
  String getRendering();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getRendering <em>Rendering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rendering</em>' attribute.
   * @see #getRendering()
   * @generated
   */
  void setRendering(String value);

  /**
   * Returns the value of the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replaced</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaced</em>' attribute.
   * @see #setReplaced(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Replaced()
   * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
   *        extendedMetaData="kind='attribute' name='replaced'"
   * @generated
   */
  String getReplaced();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplaced <em>Replaced</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replaced</em>' attribute.
   * @see #getReplaced()
   * @generated
   */
  void setReplaced(String value);

  /**
   * Returns the value of the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replaced By Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaced By Field</em>' attribute.
   * @see #setReplacedByField(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_ReplacedByField()
   * @model dataType="io.fixprotocol._2016.fixrepository.IdT"
   *        extendedMetaData="kind='attribute' name='replacedByField'"
   * @generated
   */
  BigInteger getReplacedByField();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplacedByField <em>Replaced By Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replaced By Field</em>' attribute.
   * @see #getReplacedByField()
   * @generated
   */
  void setReplacedByField(BigInteger value);

  /**
   * Returns the value of the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replaced EP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaced EP</em>' attribute.
   * @see #setReplacedEP(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_ReplacedEP()
   * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
   *        extendedMetaData="kind='attribute' name='replacedEP'"
   * @generated
   */
  BigInteger getReplacedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplacedEP <em>Replaced EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replaced EP</em>' attribute.
   * @see #getReplacedEP()
   * @generated
   */
  void setReplacedEP(BigInteger value);

  /**
   * Returns the value of the '<em><b>Scenario</b></em>' attribute.
   * The default value is <code>"base"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The name of one use case of this component. 
   * 				Each scenario of a component must have a unique numeric id.
   * 				The default scenario name is 'base'.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Scenario</em>' attribute.
   * @see #isSetScenario()
   * @see #unsetScenario()
   * @see #setScenario(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Scenario()
   * @model default="base" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='scenario'"
   * @generated
   */
  String getScenario();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getScenario <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' attribute.
   * @see #isSetScenario()
   * @see #unsetScenario()
   * @see #getScenario()
   * @generated
   */
  void setScenario(String value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getScenario <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetScenario()
   * @see #getScenario()
   * @see #setScenario(String)
   * @generated
   */
  void unsetScenario();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getScenario <em>Scenario</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Scenario</em>' attribute is set.
   * @see #unsetScenario()
   * @see #getScenario()
   * @see #setScenario(String)
   * @generated
   */
  boolean isSetScenario();

  /**
   * Returns the value of the '<em><b>Supported</b></em>' attribute.
   * The default value is <code>"supported"</code>.
   * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.SupportType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supported</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supported</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.SupportType
   * @see #isSetSupported()
   * @see #unsetSupported()
   * @see #setSupported(SupportType)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Supported()
   * @model default="supported" unsettable="true"
   *        extendedMetaData="kind='attribute' name='supported'"
   * @generated
   */
  SupportType getSupported();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getSupported <em>Supported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supported</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.SupportType
   * @see #isSetSupported()
   * @see #unsetSupported()
   * @see #getSupported()
   * @generated
   */
  void setSupported(SupportType value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getSupported <em>Supported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetSupported()
   * @see #getSupported()
   * @see #setSupported(SupportType)
   * @generated
   */
  void unsetSupported();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getSupported <em>Supported</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Supported</em>' attribute is set.
   * @see #unsetSupported()
   * @see #getSupported()
   * @see #setSupported(SupportType)
   * @generated
   */
  boolean isSetSupported();

  /**
   * Returns the value of the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updated</em>' attribute.
   * @see #setUpdated(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_Updated()
   * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
   *        extendedMetaData="kind='attribute' name='updated'"
   * @generated
   */
  String getUpdated();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getUpdated <em>Updated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updated</em>' attribute.
   * @see #getUpdated()
   * @generated
   */
  void setUpdated(String value);

  /**
   * Returns the value of the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updated EP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updated EP</em>' attribute.
   * @see #setUpdatedEP(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentType_UpdatedEP()
   * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
   *        extendedMetaData="kind='attribute' name='updatedEP'"
   * @generated
   */
  BigInteger getUpdatedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentType#getUpdatedEP <em>Updated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updated EP</em>' attribute.
   * @see #getUpdatedEP()
   * @generated
   */
  void setUpdatedEP(BigInteger value);

} // ComponentType
