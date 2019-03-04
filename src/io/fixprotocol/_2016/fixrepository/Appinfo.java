/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Usage specific annotation, optionally with link to
 * 				an external reference or standard
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getMixed <em>Mixed</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getLangId <em>Lang Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getSpecUrl <em>Spec Url</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.Appinfo#getUpdatedEP <em>Updated EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo()
 * @model extendedMetaData="name='appinfo' kind='mixed'"
 * @generated
 */
public interface Appinfo extends EObject {
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
  FeatureMap getMixed();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Added()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='added'"
	 * @generated
	 */
  String getAdded();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getAdded <em>Added</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_AddedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='addedEP'"
	 * @generated
	 */
  BigInteger getAddedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getAddedEP <em>Added EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added EP</em>' attribute.
	 * @see #getAddedEP()
	 * @generated
	 */
  void setAddedEP(BigInteger value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_ChangeType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='changeType'"
	 * @generated
	 */
  ChangeTypeT getChangeType();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getChangeType <em>Change Type</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetChangeType()
	 * @see #getChangeType()
	 * @see #setChangeType(ChangeTypeT)
	 * @generated
	 */
  void unsetChangeType();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getChangeType <em>Change Type</em>}' attribute is set.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Deprecated()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='deprecated'"
	 * @generated
	 */
  String getDeprecated();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getDeprecated <em>Deprecated</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_DeprecatedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='deprecatedEP'"
	 * @generated
	 */
  BigInteger getDeprecatedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getDeprecatedEP <em>Deprecated EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated EP</em>' attribute.
	 * @see #getDeprecatedEP()
	 * @generated
	 */
  void setDeprecatedEP(BigInteger value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Issue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='issue'"
	 * @generated
	 */
  String getIssue();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
  void setIssue(String value);

  /**
	 * Returns the value of the '<em><b>Lang Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Id</em>' attribute.
	 * @see #setLangId(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_LangId()
	 * @model dataType="io.fixprotocol._2016.fixrepository.LanguageT"
	 *        extendedMetaData="kind='attribute' name='langId'"
	 * @generated
	 */
  String getLangId();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getLangId <em>Lang Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Id</em>' attribute.
	 * @see #getLangId()
	 * @generated
	 */
  void setLangId(String value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_LastModified()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='lastModified'"
	 * @generated
	 */
  String getLastModified();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
  void setLastModified(String value);

  /**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(Object)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Purpose()
	 * @model dataType="io.fixprotocol._2016.fixrepository.PurposeT"
	 *        extendedMetaData="kind='attribute' name='purpose'"
	 * @generated
	 */
  Object getPurpose();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
  void setPurpose(Object value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Replaced()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='replaced'"
	 * @generated
	 */
  String getReplaced();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplaced <em>Replaced</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_ReplacedByField()
	 * @model dataType="io.fixprotocol._2016.fixrepository.IdT"
	 *        extendedMetaData="kind='attribute' name='replacedByField'"
	 * @generated
	 */
  BigInteger getReplacedByField();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplacedByField <em>Replaced By Field</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_ReplacedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='replacedEP'"
	 * @generated
	 */
  BigInteger getReplacedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplacedEP <em>Replaced EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced EP</em>' attribute.
	 * @see #getReplacedEP()
	 * @generated
	 */
  void setReplacedEP(BigInteger value);

  /**
	 * Returns the value of the '<em><b>Spec Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spec Url</em>' attribute.
	 * @see #setSpecUrl(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_SpecUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='specUrl'"
	 * @generated
	 */
  String getSpecUrl();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getSpecUrl <em>Spec Url</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Url</em>' attribute.
	 * @see #getSpecUrl()
	 * @generated
	 */
  void setSpecUrl(String value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Supported()
	 * @model default="supported" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='supported'"
	 * @generated
	 */
  SupportType getSupported();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getSupported <em>Supported</em>}' attribute.
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
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getSupported <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetSupported()
	 * @see #getSupported()
	 * @see #setSupported(SupportType)
	 * @generated
	 */
  void unsetSupported();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getSupported <em>Supported</em>}' attribute is set.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_Updated()
	 * @model dataType="io.fixprotocol._2016.fixrepository.VersionT"
	 *        extendedMetaData="kind='attribute' name='updated'"
	 * @generated
	 */
  String getUpdated();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getUpdated <em>Updated</em>}' attribute.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAppinfo_UpdatedEP()
	 * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
	 *        extendedMetaData="kind='attribute' name='updatedEP'"
	 * @generated
	 */
  BigInteger getUpdatedEP();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.Appinfo#getUpdatedEP <em>Updated EP</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated EP</em>' attribute.
	 * @see #getUpdatedEP()
	 * @generated
	 */
  void setUpdatedEP(BigInteger value);

} // Appinfo
