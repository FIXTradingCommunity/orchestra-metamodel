/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getRule <em>Rule</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getAbbrName <em>Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getBaseCategory <em>Base Category</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getBaseCategoryAbbrName <em>Base Category Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getDiscriminatorId <em>Discriminator Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getDiscriminatorName <em>Discriminator Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getImplLength <em>Impl Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMaxLength <em>Impl Max Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMinLength <em>Impl Min Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getLengthId <em>Length Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getLengthName <em>Length Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getPresence <em>Presence</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getRendering <em>Rendering</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getScenario <em>Scenario</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getType <em>Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getUnionDataType <em>Union Data Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getUpdatedEP <em>Updated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType()
 * @model extendedMetaData="name='fieldType' kind='elementOnly'"
 * @generated
 */
public interface FieldType extends EObject {
  /**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.FieldRuleType}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule to tell when a conditionally require field
	 * 						is required or forbidden, to override other attributes, or perform
	 * 						validation.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
  EList<FieldRuleType> getRule();

  /**
	 * Returns the value of the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content of element holds an assignment expression
	 * 						for a message field or state variable
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assign</em>' attribute.
	 * @see #setAssign(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Assign()
	 * @model dataType="io.fixprotocol._2016.fixrepository.ExpressionType"
	 *        extendedMetaData="kind='element' name='assign' namespace='##targetNamespace'"
	 * @generated
	 */
  String getAssign();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getAssign <em>Assign</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign</em>' attribute.
	 * @see #getAssign()
	 * @generated
	 */
  void setAssign(String value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
  Annotation getAnnotation();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getAnnotation <em>Annotation</em>}' containment reference.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_AbbrName()
	 * @model dataType="io.fixprotocol._2016.fixrepository.AbbreviationT"
	 *        extendedMetaData="kind='attribute' name='abbrName'"
	 * @generated
	 */
  String getAbbrName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getAbbrName <em>Abbr Name</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Added()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='added'"
	 * @generated
	 */
  String getAdded();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getAdded <em>Added</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_AddedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='addedEP'"
	 * @generated
	 */
  BigInteger getAddedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getAddedEP <em>Added EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added EP</em>' attribute.
	 * @see #getAddedEP()
	 * @generated
	 */
  void setAddedEP(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Base Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Category</em>' attribute.
	 * @see #setBaseCategory(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_BaseCategory()
	 * @model dataType="io.fixprotocol._2016.fixrepository.CategoryIDT"
	 *        extendedMetaData="kind='attribute' name='baseCategory'"
	 * @generated
	 */
  String getBaseCategory();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getBaseCategory <em>Base Category</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Category</em>' attribute.
	 * @see #getBaseCategory()
	 * @generated
	 */
  void setBaseCategory(String value);

  /**
	 * Returns the value of the '<em><b>Base Category Abbr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Category Abbr Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Category Abbr Name</em>' attribute.
	 * @see #setBaseCategoryAbbrName(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_BaseCategoryAbbrName()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT"
	 *        extendedMetaData="kind='attribute' name='baseCategoryAbbrName'"
	 * @generated
	 */
  String getBaseCategoryAbbrName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getBaseCategoryAbbrName <em>Base Category Abbr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Category Abbr Name</em>' attribute.
	 * @see #getBaseCategoryAbbrName()
	 * @generated
	 */
  void setBaseCategoryAbbrName(String value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_ChangeType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='changeType'"
	 * @generated
	 */
  ChangeTypeT getChangeType();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getChangeType <em>Change Type</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetChangeType()
	 * @see #getChangeType()
	 * @see #setChangeType(ChangeTypeT)
	 * @generated
	 */
  void unsetChangeType();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getChangeType <em>Change Type</em>}' attribute is set.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Deprecated()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='deprecated'"
	 * @generated
	 */
  String getDeprecated();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getDeprecated <em>Deprecated</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_DeprecatedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='deprecatedEP'"
	 * @generated
	 */
  BigInteger getDeprecatedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getDeprecatedEP <em>Deprecated EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated EP</em>' attribute.
	 * @see #getDeprecatedEP()
	 * @generated
	 */
  void setDeprecatedEP(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Discriminator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a field used as a discriminator for this field's domain
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discriminator Id</em>' attribute.
	 * @see #setDiscriminatorId(BigInteger)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_DiscriminatorId()
	 * @model dataType="io.fixprotocol._2016.fixrepository.IdT"
	 *        extendedMetaData="kind='attribute' name='discriminatorId'"
	 * @generated
	 */
  BigInteger getDiscriminatorId();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getDiscriminatorId <em>Discriminator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Id</em>' attribute.
	 * @see #getDiscriminatorId()
	 * @generated
	 */
  void setDiscriminatorId(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Discriminator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Name</em>' attribute.
	 * @see #setDiscriminatorName(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_DiscriminatorName()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT"
	 *        extendedMetaData="kind='attribute' name='discriminatorName'"
	 * @generated
	 */
  String getDiscriminatorName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getDiscriminatorName <em>Discriminator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Name</em>' attribute.
	 * @see #getDiscriminatorName()
	 * @generated
	 */
  void setDiscriminatorName(String value);

  /**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Character encoding if other than US-ASCII
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
  String getEncoding();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
  void setEncoding(String value);

  /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numeric identifier generally must be unique within a file for an element type, e.g. unique field tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Id()
	 * @model dataType="io.fixprotocol._2016.fixrepository.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
  BigInteger getId();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
  void setId(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Impl Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fixed length
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impl Length</em>' attribute.
	 * @see #isSetImplLength()
	 * @see #unsetImplLength()
	 * @see #setImplLength(short)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_ImplLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='implLength'"
	 * @generated
	 */
  short getImplLength();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplLength <em>Impl Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Length</em>' attribute.
	 * @see #isSetImplLength()
	 * @see #unsetImplLength()
	 * @see #getImplLength()
	 * @generated
	 */
  void setImplLength(short value);

  /**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplLength <em>Impl Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetImplLength()
	 * @see #getImplLength()
	 * @see #setImplLength(short)
	 * @generated
	 */
  void unsetImplLength();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplLength <em>Impl Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impl Length</em>' attribute is set.
	 * @see #unsetImplLength()
	 * @see #getImplLength()
	 * @see #setImplLength(short)
	 * @generated
	 */
  boolean isSetImplLength();

  /**
	 * Returns the value of the '<em><b>Impl Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Max Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Max Length</em>' attribute.
	 * @see #isSetImplMaxLength()
	 * @see #unsetImplMaxLength()
	 * @see #setImplMaxLength(short)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_ImplMaxLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='implMaxLength'"
	 * @generated
	 */
  short getImplMaxLength();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMaxLength <em>Impl Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Max Length</em>' attribute.
	 * @see #isSetImplMaxLength()
	 * @see #unsetImplMaxLength()
	 * @see #getImplMaxLength()
	 * @generated
	 */
  void setImplMaxLength(short value);

  /**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMaxLength <em>Impl Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetImplMaxLength()
	 * @see #getImplMaxLength()
	 * @see #setImplMaxLength(short)
	 * @generated
	 */
  void unsetImplMaxLength();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMaxLength <em>Impl Max Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impl Max Length</em>' attribute is set.
	 * @see #unsetImplMaxLength()
	 * @see #getImplMaxLength()
	 * @see #setImplMaxLength(short)
	 * @generated
	 */
  boolean isSetImplMaxLength();

  /**
	 * Returns the value of the '<em><b>Impl Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Min Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Min Length</em>' attribute.
	 * @see #isSetImplMinLength()
	 * @see #unsetImplMinLength()
	 * @see #setImplMinLength(short)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_ImplMinLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='implMinLength'"
	 * @generated
	 */
  short getImplMinLength();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMinLength <em>Impl Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Min Length</em>' attribute.
	 * @see #isSetImplMinLength()
	 * @see #unsetImplMinLength()
	 * @see #getImplMinLength()
	 * @generated
	 */
  void setImplMinLength(short value);

  /**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMinLength <em>Impl Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetImplMinLength()
	 * @see #getImplMinLength()
	 * @see #setImplMinLength(short)
	 * @generated
	 */
  void unsetImplMinLength();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMinLength <em>Impl Min Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impl Min Length</em>' attribute is set.
	 * @see #unsetImplMinLength()
	 * @see #getImplMinLength()
	 * @see #setImplMinLength(short)
	 * @generated
	 */
  boolean isSetImplMinLength();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Issue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='issue'"
	 * @generated
	 */
  String getIssue();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getIssue <em>Issue</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_LastModified()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='lastModified'"
	 * @generated
	 */
  String getLastModified();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
  void setLastModified(String value);

  /**
	 * Returns the value of the '<em><b>Length Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a field used as a length prefix
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length Id</em>' attribute.
	 * @see #setLengthId(BigInteger)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_LengthId()
	 * @model dataType="io.fixprotocol._2016.fixrepository.IdT"
	 *        extendedMetaData="kind='attribute' name='lengthId'"
	 * @generated
	 */
  BigInteger getLengthId();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getLengthId <em>Length Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Id</em>' attribute.
	 * @see #getLengthId()
	 * @generated
	 */
  void setLengthId(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Length Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Name</em>' attribute.
	 * @see #setLengthName(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_LengthName()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT"
	 *        extendedMetaData="kind='attribute' name='lengthName'"
	 * @generated
	 */
  String getLengthName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getLengthName <em>Length Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Name</em>' attribute.
	 * @see #getLengthName()
	 * @generated
	 */
  void setLengthName(String value);

  /**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inclusive upper bound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #setMaxInclusive(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_MaxInclusive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxInclusive'"
	 * @generated
	 */
  String getMaxInclusive();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #getMaxInclusive()
	 * @generated
	 */
  void setMaxInclusive(String value);

  /**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inclusive lower bound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #setMinInclusive(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_MinInclusive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='minInclusive'"
	 * @generated
	 */
  String getMinInclusive();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' attribute.
	 * @see #getMinInclusive()
	 * @generated
	 */
  void setMinInclusive(String value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Name()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Presence</b></em>' attribute.
	 * The default value is <code>"optional"</code>.
	 * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.PresenceT}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence</em>' attribute.
	 * @see io.fixprotocol._2016.fixrepository.PresenceT
	 * @see #isSetPresence()
	 * @see #unsetPresence()
	 * @see #setPresence(PresenceT)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Presence()
	 * @model default="optional" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='presence'"
	 * @generated
	 */
  PresenceT getPresence();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence</em>' attribute.
	 * @see io.fixprotocol._2016.fixrepository.PresenceT
	 * @see #isSetPresence()
	 * @see #unsetPresence()
	 * @see #getPresence()
	 * @generated
	 */
  void setPresence(PresenceT value);

  /**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetPresence()
	 * @see #getPresence()
	 * @see #setPresence(PresenceT)
	 * @generated
	 */
  void unsetPresence();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getPresence <em>Presence</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Rendering</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A hint to processes about how to interpret the element. Not validated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering</em>' attribute.
	 * @see #setRendering(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Rendering()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rendering'"
	 * @generated
	 */
  String getRendering();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getRendering <em>Rendering</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Replaced()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='replaced'"
	 * @generated
	 */
  String getReplaced();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getReplaced <em>Replaced</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_ReplacedByField()
	 * @model dataType="io.fixprotocol._2016.fixrepository.IdT"
	 *        extendedMetaData="kind='attribute' name='replacedByField'"
	 * @generated
	 */
  BigInteger getReplacedByField();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getReplacedByField <em>Replaced By Field</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_ReplacedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='replacedEP'"
	 * @generated
	 */
  BigInteger getReplacedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getReplacedEP <em>Replaced EP</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Scenario()
	 * @model default="base" unsettable="true" dataType="io.fixprotocol._2016.fixrepository.ScenarioT"
	 *        extendedMetaData="kind='attribute' name='scenario'"
	 * @generated
	 */
	String getScenario();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getScenario <em>Scenario</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getScenario <em>Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScenario()
	 * @see #getScenario()
	 * @see #setScenario(String)
	 * @generated
	 */
	void unsetScenario();

		/**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getScenario <em>Scenario</em>}' attribute is set.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Supported()
	 * @model default="supported" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='supported'"
	 * @generated
	 */
  SupportType getSupported();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getSupported <em>Supported</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getSupported <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetSupported()
	 * @see #getSupported()
	 * @see #setSupported(SupportType)
	 * @generated
	 */
  void unsetSupported();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getSupported <em>Supported</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute type refers to either a datatype or a
	 * 					codeSet, which carries an underlying datatype.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
  String getType();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
  void setType(String value);

  /**
	 * Returns the value of the '<em><b>Union Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.UnionDataTypeT}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Union Data Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Data Type</em>' attribute.
	 * @see io.fixprotocol._2016.fixrepository.UnionDataTypeT
	 * @see #isSetUnionDataType()
	 * @see #unsetUnionDataType()
	 * @see #setUnionDataType(UnionDataTypeT)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_UnionDataType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unionDataType'"
	 * @generated
	 */
  UnionDataTypeT getUnionDataType();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getUnionDataType <em>Union Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union Data Type</em>' attribute.
	 * @see io.fixprotocol._2016.fixrepository.UnionDataTypeT
	 * @see #isSetUnionDataType()
	 * @see #unsetUnionDataType()
	 * @see #getUnionDataType()
	 * @generated
	 */
  void setUnionDataType(UnionDataTypeT value);

  /**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getUnionDataType <em>Union Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetUnionDataType()
	 * @see #getUnionDataType()
	 * @see #setUnionDataType(UnionDataTypeT)
	 * @generated
	 */
  void unsetUnionDataType();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getUnionDataType <em>Union Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Union Data Type</em>' attribute is set.
	 * @see #unsetUnionDataType()
	 * @see #getUnionDataType()
	 * @see #setUnionDataType(UnionDataTypeT)
	 * @generated
	 */
  boolean isSetUnionDataType();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Updated()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='updated'"
	 * @generated
	 */
  String getUpdated();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getUpdated <em>Updated</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_UpdatedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='updatedEP'"
	 * @generated
	 */
  BigInteger getUpdatedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getUpdatedEP <em>Updated EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated EP</em>' attribute.
	 * @see #getUpdatedEP()
	 * @generated
	 */
  void setUpdatedEP(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If presence is optional, then it represents a
	 * 					default when the sender does not provide the field.
	 * 					If presence is constant, then it is the constant value.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
  String getValue();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(String value);

} // FieldType
