/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A repeating group. Logically, groupType is a subclass of componentType, but to make numInGroup first in the sequence, it cannot be an extension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getNumInGroup <em>Num In Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getAbbrName <em>Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getCategory <em>Category</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMinOccurs <em>Impl Min Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getRendering <em>Rendering</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getScenario <em>Scenario</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getUpdatedEP <em>Updated EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType()
 * @model extendedMetaData="name='groupType' kind='elementOnly'"
 * @generated
 */
public interface GroupType extends EObject {
  /**
	 * Returns the value of the '<em><b>Num In Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num In Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num In Group</em>' containment reference.
	 * @see #setNumInGroup(FieldRefType)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_NumInGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numInGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	FieldRefType getNumInGroup();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getNumInGroup <em>Num In Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num In Group</em>' containment reference.
	 * @see #getNumInGroup()
	 * @generated
	 */
	void setNumInGroup(FieldRefType value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ComponentRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentRef' namespace='##targetNamespace' group='#group:1'"
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_GroupRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace' group='#group:1'"
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_FieldRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<FieldRefType> getFieldRef();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getAnnotation <em>Annotation</em>}' containment reference.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_AbbrName()
	 * @model dataType="io.fixprotocol._2016.fixrepository.AbbreviationT"
	 *        extendedMetaData="kind='attribute' name='abbrName'"
	 * @generated
	 */
	String getAbbrName();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getAbbrName <em>Abbr Name</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Added()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='added'"
	 * @generated
	 */
	String getAdded();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getAdded <em>Added</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_AddedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='addedEP'"
	 * @generated
	 */
	BigInteger getAddedEP();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getAddedEP <em>Added EP</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Category()
	 * @model dataType="io.fixprotocol._2016.fixrepository.CategoryIDT"
	 *        extendedMetaData="kind='attribute' name='category'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getCategory <em>Category</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ChangeType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='changeType'"
	 * @generated
	 */
	ChangeTypeT getChangeType();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getChangeType <em>Change Type</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChangeType()
	 * @see #getChangeType()
	 * @see #setChangeType(ChangeTypeT)
	 * @generated
	 */
	void unsetChangeType();

	/**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getChangeType <em>Change Type</em>}' attribute is set.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Deprecated()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='deprecated'"
	 * @generated
	 */
	String getDeprecated();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getDeprecated <em>Deprecated</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_DeprecatedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='deprecatedEP'"
	 * @generated
	 */
	BigInteger getDeprecatedEP();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getDeprecatedEP <em>Deprecated EP</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Id()
	 * @model dataType="io.fixprotocol._2016.fixrepository.IdT" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

		/**
	 * Returns the value of the '<em><b>Impl Max Occurs</b></em>' attribute.
	 * The default value is <code>"unbounded"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Max Occurs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Max Occurs</em>' attribute.
	 * @see #isSetImplMaxOccurs()
	 * @see #unsetImplMaxOccurs()
	 * @see #setImplMaxOccurs(Object)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ImplMaxOccurs()
	 * @model default="unbounded" unsettable="true" dataType="io.fixprotocol._2016.fixrepository.UnboundedIntType"
	 *        extendedMetaData="kind='attribute' name='implMaxOccurs'"
	 * @generated
	 */
  Object getImplMaxOccurs();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Max Occurs</em>' attribute.
	 * @see #isSetImplMaxOccurs()
	 * @see #unsetImplMaxOccurs()
	 * @see #getImplMaxOccurs()
	 * @generated
	 */
  void setImplMaxOccurs(Object value);

  /**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetImplMaxOccurs()
	 * @see #getImplMaxOccurs()
	 * @see #setImplMaxOccurs(Object)
	 * @generated
	 */
  void unsetImplMaxOccurs();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impl Max Occurs</em>' attribute is set.
	 * @see #unsetImplMaxOccurs()
	 * @see #getImplMaxOccurs()
	 * @see #setImplMaxOccurs(Object)
	 * @generated
	 */
  boolean isSetImplMaxOccurs();

  /**
	 * Returns the value of the '<em><b>Impl Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Min Occurs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Min Occurs</em>' attribute.
	 * @see #setImplMinOccurs(BigInteger)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ImplMinOccurs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='implMinOccurs'"
	 * @generated
	 */
  BigInteger getImplMinOccurs();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMinOccurs <em>Impl Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Min Occurs</em>' attribute.
	 * @see #getImplMinOccurs()
	 * @generated
	 */
  void setImplMinOccurs(BigInteger value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Issue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='issue'"
	 * @generated
	 */
	String getIssue();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getIssue <em>Issue</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_LastModified()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='lastModified'"
	 * @generated
	 */
	String getLastModified();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getLastModified <em>Last Modified</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Name()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

		/**
	 * Returns the value of the '<em><b>Rendering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A hint to processes about how to interpret the element. Not validated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering</em>' attribute.
	 * @see #setRendering(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Rendering()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rendering'"
	 * @generated
	 */
	String getRendering();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getRendering <em>Rendering</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Replaced()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='replaced'"
	 * @generated
	 */
	String getReplaced();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getReplaced <em>Replaced</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ReplacedByField()
	 * @model dataType="io.fixprotocol._2016.fixrepository.IdT"
	 *        extendedMetaData="kind='attribute' name='replacedByField'"
	 * @generated
	 */
	BigInteger getReplacedByField();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getReplacedByField <em>Replaced By Field</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ReplacedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='replacedEP'"
	 * @generated
	 */
	BigInteger getReplacedEP();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getReplacedEP <em>Replaced EP</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Scenario()
	 * @model default="base" unsettable="true" dataType="io.fixprotocol._2016.fixrepository.ScenarioT"
	 *        extendedMetaData="kind='attribute' name='scenario'"
	 * @generated
	 */
	String getScenario();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getScenario <em>Scenario</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getScenario <em>Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScenario()
	 * @see #getScenario()
	 * @see #setScenario(String)
	 * @generated
	 */
	void unsetScenario();

		/**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getScenario <em>Scenario</em>}' attribute is set.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Supported()
	 * @model default="supported" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='supported'"
	 * @generated
	 */
	SupportType getSupported();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getSupported <em>Supported</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getSupported <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupported()
	 * @see #getSupported()
	 * @see #setSupported(SupportType)
	 * @generated
	 */
	void unsetSupported();

		/**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getSupported <em>Supported</em>}' attribute is set.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_Updated()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='updated'"
	 * @generated
	 */
	String getUpdated();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getUpdated <em>Updated</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_UpdatedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='updatedEP'"
	 * @generated
	 */
	BigInteger getUpdatedEP();

		/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getUpdatedEP <em>Updated EP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated EP</em>' attribute.
	 * @see #getUpdatedEP()
	 * @generated
	 */
	void setUpdatedEP(BigInteger value);

} // GroupType
