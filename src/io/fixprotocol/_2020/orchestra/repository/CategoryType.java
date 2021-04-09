/**
 */
package io.fixprotocol._2020.orchestra.repository;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getFIXMLFileName <em>FIXML File Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIncludeFile <em>Include File</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSection <em>Section</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdatedEP <em>Updated EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType()
 * @model extendedMetaData="name='categoryType' kind='elementOnly'"
 * @generated
 */
public interface CategoryType extends EObject {
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAnnotation <em>Annotation</em>}' containment reference.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Added()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='added'"
   * @generated
   */
  String getAdded();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAdded <em>Added</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_AddedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='addedEP'"
   * @generated
   */
  BigInteger getAddedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAddedEP <em>Added EP</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_ChangeType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='changeType'"
   * @generated
   */
  ChangeTypeT getChangeType();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getChangeType <em>Change Type</em>}' attribute.
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
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getChangeType <em>Change Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetChangeType()
   * @see #getChangeType()
   * @see #setChangeType(ChangeTypeT)
   * @generated
   */
  void unsetChangeType();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getChangeType <em>Change Type</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Component Type</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2020.orchestra.repository.CatComponentTypeT}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Type</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.CatComponentTypeT
   * @see #isSetComponentType()
   * @see #unsetComponentType()
   * @see #setComponentType(CatComponentTypeT)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_ComponentType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='componentType'"
   * @generated
   */
  CatComponentTypeT getComponentType();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getComponentType <em>Component Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Type</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.CatComponentTypeT
   * @see #isSetComponentType()
   * @see #unsetComponentType()
   * @see #getComponentType()
   * @generated
   */
  void setComponentType(CatComponentTypeT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getComponentType <em>Component Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetComponentType()
   * @see #getComponentType()
   * @see #setComponentType(CatComponentTypeT)
   * @generated
   */
  void unsetComponentType();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getComponentType <em>Component Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Component Type</em>' attribute is set.
   * @see #unsetComponentType()
   * @see #getComponentType()
   * @see #setComponentType(CatComponentTypeT)
   * @generated
   */
  boolean isSetComponentType();

  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see #setDeprecated(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Deprecated()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='deprecated'"
   * @generated
   */
  String getDeprecated();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecated <em>Deprecated</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_DeprecatedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='deprecatedEP'"
   * @generated
   */
  BigInteger getDeprecatedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecatedEP <em>Deprecated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated EP</em>' attribute.
   * @see #getDeprecatedEP()
   * @generated
   */
  void setDeprecatedEP(BigInteger value);

  /**
   * Returns the value of the '<em><b>FIXML File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>FIXML File Name</em>' attribute.
   * @see #setFIXMLFileName(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_FIXMLFileName()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.NameT"
   *        extendedMetaData="kind='attribute' name='FIXMLFileName'"
   * @generated
   */
  String getFIXMLFileName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getFIXMLFileName <em>FIXML File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FIXML File Name</em>' attribute.
   * @see #getFIXMLFileName()
   * @generated
   */
  void setFIXMLFileName(String value);

  /**
   * Returns the value of the '<em><b>Include File</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2020.orchestra.repository.CatIncludeFileT}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include File</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.CatIncludeFileT
   * @see #isSetIncludeFile()
   * @see #unsetIncludeFile()
   * @see #setIncludeFile(CatIncludeFileT)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_IncludeFile()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='includeFile'"
   * @generated
   */
  CatIncludeFileT getIncludeFile();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIncludeFile <em>Include File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.CatIncludeFileT
   * @see #isSetIncludeFile()
   * @see #unsetIncludeFile()
   * @see #getIncludeFile()
   * @generated
   */
  void setIncludeFile(CatIncludeFileT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIncludeFile <em>Include File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetIncludeFile()
   * @see #getIncludeFile()
   * @see #setIncludeFile(CatIncludeFileT)
   * @generated
   */
  void unsetIncludeFile();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIncludeFile <em>Include File</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Include File</em>' attribute is set.
   * @see #unsetIncludeFile()
   * @see #getIncludeFile()
   * @see #setIncludeFile(CatIncludeFileT)
   * @generated
   */
  boolean isSetIncludeFile();

  /**
   * Returns the value of the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issue</em>' attribute.
   * @see #setIssue(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Issue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='issue'"
   * @generated
   */
  String getIssue();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIssue <em>Issue</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_LastModified()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='lastModified'"
   * @generated
   */
  String getLastModified();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getLastModified <em>Last Modified</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Name()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.NameT"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaced</em>' attribute.
   * @see #setReplaced(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Replaced()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='replaced'"
   * @generated
   */
  String getReplaced();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplaced <em>Replaced</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_ReplacedByField()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.IdT"
   *        extendedMetaData="kind='attribute' name='replacedByField'"
   * @generated
   */
  BigInteger getReplacedByField();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedByField <em>Replaced By Field</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_ReplacedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='replacedEP'"
   * @generated
   */
  BigInteger getReplacedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedEP <em>Replaced EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replaced EP</em>' attribute.
   * @see #getReplacedEP()
   * @generated
   */
  void setReplacedEP(BigInteger value);

  /**
   * Returns the value of the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section</em>' attribute.
   * @see #setSection(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Section()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.NameT"
   *        extendedMetaData="kind='attribute' name='section'"
   * @generated
   */
  String getSection();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSection <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Section</em>' attribute.
   * @see #getSection()
   * @generated
   */
  void setSection(String value);

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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Supported()
   * @model default="supported" unsettable="true"
   *        extendedMetaData="kind='attribute' name='supported'"
   * @generated
   */
  SupportType getSupported();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSupported <em>Supported</em>}' attribute.
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
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSupported <em>Supported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetSupported()
   * @see #getSupported()
   * @see #setSupported(SupportType)
   * @generated
   */
  void unsetSupported();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSupported <em>Supported</em>}' attribute is set.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_Updated()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.VersionT"
   *        extendedMetaData="kind='attribute' name='updated'"
   * @generated
   */
  String getUpdated();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdated <em>Updated</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCategoryType_UpdatedEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='updatedEP'"
   * @generated
   */
  BigInteger getUpdatedEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdatedEP <em>Updated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Updated EP</em>' attribute.
   * @see #getUpdatedEP()
   * @generated
   */
  void setUpdatedEP(BigInteger value);

} // CategoryType
