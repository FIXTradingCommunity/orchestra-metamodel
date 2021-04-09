/**
 */
package io.fixprotocol._2020.orchestra.repository;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getBlockAssignment <em>Block Assignment</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getRule <em>Rule</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getPresence <em>Presence</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getScenario <em>Scenario</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdatedEP <em>Updated EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType()
 * @model extendedMetaData="name='componentRefType' kind='elementOnly'"
 * @generated
 */
public interface ComponentRefType extends EObject {
  /**
   * Returns the value of the '<em><b>Block Assignment</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies a how a component or each group entry is populated (optional)
   * <!-- end-model-doc -->
   * @return the value of the '<em>Block Assignment</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_BlockAssignment()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='blockAssignment' namespace='##targetNamespace'"
   * @generated
   */
  EList<BlockAssignmentType> getBlockAssignment();

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Rule to tell when a conditionally require component
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rule</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Rule()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
   * @generated
   */
  EList<ComponentRuleType> getRule();

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

  /**
   * Returns the value of the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added</em>' attribute.
   * @see #setAdded(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Added()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='added'"
   * @generated
   */
  String getAdded();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAdded <em>Added</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added EP</em>' attribute.
   * @see #setAddedEP(BigInteger)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_AddedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='addedEP'"
   * @generated
   */
  BigInteger getAddedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAddedEP <em>Added EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Added EP</em>' attribute.
   * @see #getAddedEP()
   * @generated
   */
  void setAddedEP(BigInteger value);

  /**
   * Returns the value of the '<em><b>Change Type</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2020.orchestra.repository.ChangeTypeT}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Type</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.ChangeTypeT
   * @see #isSetChangeType()
   * @see #unsetChangeType()
   * @see #setChangeType(ChangeTypeT)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_ChangeType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='changeType'"
   * @generated
   */
  ChangeTypeT getChangeType();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getChangeType <em>Change Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change Type</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.ChangeTypeT
   * @see #isSetChangeType()
   * @see #unsetChangeType()
   * @see #getChangeType()
   * @generated
   */
  void setChangeType(ChangeTypeT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getChangeType <em>Change Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetChangeType()
   * @see #getChangeType()
   * @see #setChangeType(ChangeTypeT)
   * @generated
   */
  void unsetChangeType();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getChangeType <em>Change Type</em>}' attribute is set.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see #setDeprecated(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Deprecated()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='deprecated'"
   * @generated
   */
  String getDeprecated();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecated <em>Deprecated</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated EP</em>' attribute.
   * @see #setDeprecatedEP(BigInteger)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_DeprecatedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='deprecatedEP'"
   * @generated
   */
  BigInteger getDeprecatedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecatedEP <em>Deprecated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated EP</em>' attribute.
   * @see #getDeprecatedEP()
   * @generated
   */
  void setDeprecatedEP(BigInteger value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Numeric identifier generally must be unique within a file for an element type, e.g. unique field tag
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(BigInteger)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Id()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.IdT" required="true"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  BigInteger getId();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(BigInteger value);

  /**
   * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Override the component name for this instance, for
   * 					code generation and the like. Allows more than one instance of a
   * 					component in a message.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Name</em>' attribute.
   * @see #setInstanceName(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_InstanceName()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.ComponentNameT"
   *        extendedMetaData="kind='attribute' name='instanceName'"
   * @generated
   */
  String getInstanceName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getInstanceName <em>Instance Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Name</em>' attribute.
   * @see #getInstanceName()
   * @generated
   */
  void setInstanceName(String value);

  /**
   * Returns the value of the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issue</em>' attribute.
   * @see #setIssue(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Issue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='issue'"
   * @generated
   */
  String getIssue();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getIssue <em>Issue</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Modified</em>' attribute.
   * @see #setLastModified(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_LastModified()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='lastModified'"
   * @generated
   */
  String getLastModified();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getLastModified <em>Last Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Modified</em>' attribute.
   * @see #getLastModified()
   * @generated
   */
  void setLastModified(String value);

  /**
   * Returns the value of the '<em><b>Presence</b></em>' attribute.
   * The default value is <code>"optional"</code>.
   * The literals are from the enumeration {@link io.fixprotocol._2020.orchestra.repository.PresenceT}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presence</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @see #isSetPresence()
   * @see #unsetPresence()
   * @see #setPresence(PresenceT)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Presence()
   * @model default="optional" unsettable="true"
   *        extendedMetaData="kind='attribute' name='presence'"
   * @generated
   */
  PresenceT getPresence();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getPresence <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Presence</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @see #isSetPresence()
   * @see #unsetPresence()
   * @see #getPresence()
   * @generated
   */
  void setPresence(PresenceT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getPresence <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPresence()
   * @see #getPresence()
   * @see #setPresence(PresenceT)
   * @generated
   */
  void unsetPresence();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getPresence <em>Presence</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Presence</em>' attribute is set.
   * @see #unsetPresence()
   * @see #getPresence()
   * @see #setPresence(PresenceT)
   * @generated
   */
  boolean isSetPresence();

  /**
   * Returns the value of the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaced</em>' attribute.
   * @see #setReplaced(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Replaced()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='replaced'"
   * @generated
   */
  String getReplaced();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplaced <em>Replaced</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaced By Field</em>' attribute.
   * @see #setReplacedByField(BigInteger)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_ReplacedByField()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.IdT"
   *        extendedMetaData="kind='attribute' name='replacedByField'"
   * @generated
   */
  BigInteger getReplacedByField();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedByField <em>Replaced By Field</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaced EP</em>' attribute.
   * @see #setReplacedEP(BigInteger)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_ReplacedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='replacedEP'"
   * @generated
   */
  BigInteger getReplacedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedEP <em>Replaced EP</em>}' attribute.
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
   * The use case of an element, distinguished by workflow, asset class, etc.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Scenario</em>' attribute.
   * @see #isSetScenario()
   * @see #unsetScenario()
   * @see #setScenario(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Scenario()
   * @model default="base" unsettable="true" dataType="io.fixprotocol._2020.orchestra.repository.ScenarioT"
   *        extendedMetaData="kind='attribute' name='scenario'"
   * @generated
   */
  String getScenario();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getScenario <em>Scenario</em>}' attribute.
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
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getScenario <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetScenario()
   * @see #getScenario()
   * @see #setScenario(String)
   * @generated
   */
  void unsetScenario();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getScenario <em>Scenario</em>}' attribute is set.
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
   * The literals are from the enumeration {@link io.fixprotocol._2020.orchestra.repository.SupportType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supported</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.SupportType
   * @see #isSetSupported()
   * @see #unsetSupported()
   * @see #setSupported(SupportType)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Supported()
   * @model default="supported" unsettable="true"
   *        extendedMetaData="kind='attribute' name='supported'"
   * @generated
   */
  SupportType getSupported();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getSupported <em>Supported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supported</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.SupportType
   * @see #isSetSupported()
   * @see #unsetSupported()
   * @see #getSupported()
   * @generated
   */
  void setSupported(SupportType value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getSupported <em>Supported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetSupported()
   * @see #getSupported()
   * @see #setSupported(SupportType)
   * @generated
   */
  void unsetSupported();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getSupported <em>Supported</em>}' attribute is set.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updated</em>' attribute.
   * @see #setUpdated(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_Updated()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='updated'"
   * @generated
   */
  String getUpdated();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdated <em>Updated</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updated EP</em>' attribute.
   * @see #setUpdatedEP(BigInteger)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRefType_UpdatedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='updatedEP'"
   * @generated
   */
  BigInteger getUpdatedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdatedEP <em>Updated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updated EP</em>' attribute.
   * @see #getUpdatedEP()
   * @generated
   */
  void setUpdatedEP(BigInteger value);

} // ComponentRefType
