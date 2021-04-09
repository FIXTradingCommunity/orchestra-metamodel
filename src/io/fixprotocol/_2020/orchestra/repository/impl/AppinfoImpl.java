/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.Appinfo;
import io.fixprotocol._2020.orchestra.repository.ChangeTypeT;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.SupportType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getAny <em>Any</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getLangId <em>Lang Id</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getSpecUrl <em>Spec Url</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getUpdatedEP <em>Updated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppinfoImpl extends MinimalEObjectImpl.Container implements Appinfo {
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
   * The default value of the '{@link #getAdded() <em>Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdded()
   * @generated
   * @ordered
   */
  protected static final String ADDED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdded() <em>Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdded()
   * @generated
   * @ordered
   */
  protected String added = ADDED_EDEFAULT;

  /**
   * The default value of the '{@link #getAddedEP() <em>Added EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddedEP()
   * @generated
   * @ordered
   */
  protected static final BigInteger ADDED_EP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddedEP() <em>Added EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddedEP()
   * @generated
   * @ordered
   */
  protected BigInteger addedEP = ADDED_EP_EDEFAULT;

  /**
   * The default value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangeType()
   * @generated
   * @ordered
   */
  protected static final ChangeTypeT CHANGE_TYPE_EDEFAULT = ChangeTypeT.EDITORIAL;

  /**
   * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangeType()
   * @generated
   * @ordered
   */
  protected ChangeTypeT changeType = CHANGE_TYPE_EDEFAULT;

  /**
   * This is true if the Change Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean changeTypeESet;

  /**
   * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecated()
   * @generated
   * @ordered
   */
  protected static final String DEPRECATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecated()
   * @generated
   * @ordered
   */
  protected String deprecated = DEPRECATED_EDEFAULT;

  /**
   * The default value of the '{@link #getDeprecatedEP() <em>Deprecated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecatedEP()
   * @generated
   * @ordered
   */
  protected static final BigInteger DEPRECATED_EP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeprecatedEP() <em>Deprecated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecatedEP()
   * @generated
   * @ordered
   */
  protected BigInteger deprecatedEP = DEPRECATED_EP_EDEFAULT;

  /**
   * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIssue()
   * @generated
   * @ordered
   */
  protected static final String ISSUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIssue()
   * @generated
   * @ordered
   */
  protected String issue = ISSUE_EDEFAULT;

  /**
   * The default value of the '{@link #getLangId() <em>Lang Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLangId()
   * @generated
   * @ordered
   */
  protected static final String LANG_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLangId() <em>Lang Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLangId()
   * @generated
   * @ordered
   */
  protected String langId = LANG_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastModified()
   * @generated
   * @ordered
   */
  protected static final String LAST_MODIFIED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastModified()
   * @generated
   * @ordered
   */
  protected String lastModified = LAST_MODIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected static final Object PURPOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected Object purpose = PURPOSE_EDEFAULT;

  /**
   * The default value of the '{@link #getReplaced() <em>Replaced</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplaced()
   * @generated
   * @ordered
   */
  protected static final String REPLACED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReplaced() <em>Replaced</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplaced()
   * @generated
   * @ordered
   */
  protected String replaced = REPLACED_EDEFAULT;

  /**
   * The default value of the '{@link #getReplacedByField() <em>Replaced By Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplacedByField()
   * @generated
   * @ordered
   */
  protected static final BigInteger REPLACED_BY_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReplacedByField() <em>Replaced By Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplacedByField()
   * @generated
   * @ordered
   */
  protected BigInteger replacedByField = REPLACED_BY_FIELD_EDEFAULT;

  /**
   * The default value of the '{@link #getReplacedEP() <em>Replaced EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplacedEP()
   * @generated
   * @ordered
   */
  protected static final BigInteger REPLACED_EP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReplacedEP() <em>Replaced EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplacedEP()
   * @generated
   * @ordered
   */
  protected BigInteger replacedEP = REPLACED_EP_EDEFAULT;

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
   * The default value of the '{@link #getSupported() <em>Supported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupported()
   * @generated
   * @ordered
   */
  protected static final SupportType SUPPORTED_EDEFAULT = SupportType.SUPPORTED;

  /**
   * The cached value of the '{@link #getSupported() <em>Supported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupported()
   * @generated
   * @ordered
   */
  protected SupportType supported = SUPPORTED_EDEFAULT;

  /**
   * This is true if the Supported attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean supportedESet;

  /**
   * The default value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdated()
   * @generated
   * @ordered
   */
  protected static final String UPDATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdated()
   * @generated
   * @ordered
   */
  protected String updated = UPDATED_EDEFAULT;

  /**
   * The default value of the '{@link #getUpdatedEP() <em>Updated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdatedEP()
   * @generated
   * @ordered
   */
  protected static final BigInteger UPDATED_EP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpdatedEP() <em>Updated EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdatedEP()
   * @generated
   * @ordered
   */
  protected BigInteger updatedEP = UPDATED_EP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyAttribute()
   * @generated
   * @ordered
   */
  protected FeatureMap anyAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AppinfoImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getAppinfo();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getMixed() {
    if (mixed == null) {
      mixed = new BasicFeatureMap(this, RepositoryPackage.APPINFO__MIXED);
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    return (FeatureMap)getMixed().<FeatureMap.Entry>list(RepositoryPackage.eINSTANCE.getAppinfo_Group());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getAny() {
    return (FeatureMap)getGroup().<FeatureMap.Entry>list(RepositoryPackage.eINSTANCE.getAppinfo_Any());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdded() {
    return added;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdded(String newAdded) {
    String oldAdded = added;
    added = newAdded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__ADDED, oldAdded, added));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getAddedEP() {
    return addedEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddedEP(BigInteger newAddedEP) {
    BigInteger oldAddedEP = addedEP;
    addedEP = newAddedEP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__ADDED_EP, oldAddedEP, addedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeTypeT getChangeType() {
    return changeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangeType(ChangeTypeT newChangeType) {
    ChangeTypeT oldChangeType = changeType;
    changeType = newChangeType == null ? CHANGE_TYPE_EDEFAULT : newChangeType;
    boolean oldChangeTypeESet = changeTypeESet;
    changeTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetChangeType() {
    ChangeTypeT oldChangeType = changeType;
    boolean oldChangeTypeESet = changeTypeESet;
    changeType = CHANGE_TYPE_EDEFAULT;
    changeTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.APPINFO__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetChangeType() {
    return changeTypeESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeprecated() {
    return deprecated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeprecated(String newDeprecated) {
    String oldDeprecated = deprecated;
    deprecated = newDeprecated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__DEPRECATED, oldDeprecated, deprecated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getDeprecatedEP() {
    return deprecatedEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeprecatedEP(BigInteger newDeprecatedEP) {
    BigInteger oldDeprecatedEP = deprecatedEP;
    deprecatedEP = newDeprecatedEP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIssue() {
    return issue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIssue(String newIssue) {
    String oldIssue = issue;
    issue = newIssue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__ISSUE, oldIssue, issue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLangId() {
    return langId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLangId(String newLangId) {
    String oldLangId = langId;
    langId = newLangId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__LANG_ID, oldLangId, langId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastModified() {
    return lastModified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastModified(String newLastModified) {
    String oldLastModified = lastModified;
    lastModified = newLastModified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__LAST_MODIFIED, oldLastModified, lastModified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getPurpose() {
    return purpose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPurpose(Object newPurpose) {
    Object oldPurpose = purpose;
    purpose = newPurpose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__PURPOSE, oldPurpose, purpose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReplaced() {
    return replaced;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplaced(String newReplaced) {
    String oldReplaced = replaced;
    replaced = newReplaced;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__REPLACED, oldReplaced, replaced));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getReplacedByField() {
    return replacedByField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplacedByField(BigInteger newReplacedByField) {
    BigInteger oldReplacedByField = replacedByField;
    replacedByField = newReplacedByField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getReplacedEP() {
    return replacedEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplacedEP(BigInteger newReplacedEP) {
    BigInteger oldReplacedEP = replacedEP;
    replacedEP = newReplacedEP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__REPLACED_EP, oldReplacedEP, replacedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSpecUrl() {
    return specUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecUrl(String newSpecUrl) {
    String oldSpecUrl = specUrl;
    specUrl = newSpecUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__SPEC_URL, oldSpecUrl, specUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportType getSupported() {
    return supported;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupported(SupportType newSupported) {
    SupportType oldSupported = supported;
    supported = newSupported == null ? SUPPORTED_EDEFAULT : newSupported;
    boolean oldSupportedESet = supportedESet;
    supportedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__SUPPORTED, oldSupported, supported, !oldSupportedESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetSupported() {
    SupportType oldSupported = supported;
    boolean oldSupportedESet = supportedESet;
    supported = SUPPORTED_EDEFAULT;
    supportedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.APPINFO__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSupported() {
    return supportedESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUpdated() {
    return updated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdated(String newUpdated) {
    String oldUpdated = updated;
    updated = newUpdated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__UPDATED, oldUpdated, updated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getUpdatedEP() {
    return updatedEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdatedEP(BigInteger newUpdatedEP) {
    BigInteger oldUpdatedEP = updatedEP;
    updatedEP = newUpdatedEP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.APPINFO__UPDATED_EP, oldUpdatedEP, updatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getAnyAttribute() {
    if (anyAttribute == null) {
      anyAttribute = new BasicFeatureMap(this, RepositoryPackage.APPINFO__ANY_ATTRIBUTE);
    }
    return anyAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.APPINFO__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.APPINFO__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.APPINFO__ANY:
        return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.APPINFO__ANY_ATTRIBUTE:
        return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
      case RepositoryPackage.APPINFO__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case RepositoryPackage.APPINFO__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.APPINFO__ANY:
        if (coreType) return getAny();
        return ((FeatureMap.Internal)getAny()).getWrapper();
      case RepositoryPackage.APPINFO__ADDED:
        return getAdded();
      case RepositoryPackage.APPINFO__ADDED_EP:
        return getAddedEP();
      case RepositoryPackage.APPINFO__CHANGE_TYPE:
        return getChangeType();
      case RepositoryPackage.APPINFO__DEPRECATED:
        return getDeprecated();
      case RepositoryPackage.APPINFO__DEPRECATED_EP:
        return getDeprecatedEP();
      case RepositoryPackage.APPINFO__ISSUE:
        return getIssue();
      case RepositoryPackage.APPINFO__LANG_ID:
        return getLangId();
      case RepositoryPackage.APPINFO__LAST_MODIFIED:
        return getLastModified();
      case RepositoryPackage.APPINFO__PURPOSE:
        return getPurpose();
      case RepositoryPackage.APPINFO__REPLACED:
        return getReplaced();
      case RepositoryPackage.APPINFO__REPLACED_BY_FIELD:
        return getReplacedByField();
      case RepositoryPackage.APPINFO__REPLACED_EP:
        return getReplacedEP();
      case RepositoryPackage.APPINFO__SPEC_URL:
        return getSpecUrl();
      case RepositoryPackage.APPINFO__SUPPORTED:
        return getSupported();
      case RepositoryPackage.APPINFO__UPDATED:
        return getUpdated();
      case RepositoryPackage.APPINFO__UPDATED_EP:
        return getUpdatedEP();
      case RepositoryPackage.APPINFO__ANY_ATTRIBUTE:
        if (coreType) return getAnyAttribute();
        return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
      case RepositoryPackage.APPINFO__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case RepositoryPackage.APPINFO__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.APPINFO__ANY:
        ((FeatureMap.Internal)getAny()).set(newValue);
        return;
      case RepositoryPackage.APPINFO__ADDED:
        setAdded((String)newValue);
        return;
      case RepositoryPackage.APPINFO__ADDED_EP:
        setAddedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.APPINFO__CHANGE_TYPE:
        setChangeType((ChangeTypeT)newValue);
        return;
      case RepositoryPackage.APPINFO__DEPRECATED:
        setDeprecated((String)newValue);
        return;
      case RepositoryPackage.APPINFO__DEPRECATED_EP:
        setDeprecatedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.APPINFO__ISSUE:
        setIssue((String)newValue);
        return;
      case RepositoryPackage.APPINFO__LANG_ID:
        setLangId((String)newValue);
        return;
      case RepositoryPackage.APPINFO__LAST_MODIFIED:
        setLastModified((String)newValue);
        return;
      case RepositoryPackage.APPINFO__PURPOSE:
        setPurpose(newValue);
        return;
      case RepositoryPackage.APPINFO__REPLACED:
        setReplaced((String)newValue);
        return;
      case RepositoryPackage.APPINFO__REPLACED_BY_FIELD:
        setReplacedByField((BigInteger)newValue);
        return;
      case RepositoryPackage.APPINFO__REPLACED_EP:
        setReplacedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.APPINFO__SPEC_URL:
        setSpecUrl((String)newValue);
        return;
      case RepositoryPackage.APPINFO__SUPPORTED:
        setSupported((SupportType)newValue);
        return;
      case RepositoryPackage.APPINFO__UPDATED:
        setUpdated((String)newValue);
        return;
      case RepositoryPackage.APPINFO__UPDATED_EP:
        setUpdatedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.APPINFO__ANY_ATTRIBUTE:
        ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
      case RepositoryPackage.APPINFO__MIXED:
        getMixed().clear();
        return;
      case RepositoryPackage.APPINFO__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.APPINFO__ANY:
        getAny().clear();
        return;
      case RepositoryPackage.APPINFO__ADDED:
        setAdded(ADDED_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__ADDED_EP:
        setAddedEP(ADDED_EP_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__CHANGE_TYPE:
        unsetChangeType();
        return;
      case RepositoryPackage.APPINFO__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__DEPRECATED_EP:
        setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__ISSUE:
        setIssue(ISSUE_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__LANG_ID:
        setLangId(LANG_ID_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__LAST_MODIFIED:
        setLastModified(LAST_MODIFIED_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__PURPOSE:
        setPurpose(PURPOSE_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__REPLACED:
        setReplaced(REPLACED_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__REPLACED_BY_FIELD:
        setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__REPLACED_EP:
        setReplacedEP(REPLACED_EP_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__SPEC_URL:
        setSpecUrl(SPEC_URL_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__SUPPORTED:
        unsetSupported();
        return;
      case RepositoryPackage.APPINFO__UPDATED:
        setUpdated(UPDATED_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__UPDATED_EP:
        setUpdatedEP(UPDATED_EP_EDEFAULT);
        return;
      case RepositoryPackage.APPINFO__ANY_ATTRIBUTE:
        getAnyAttribute().clear();
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
      case RepositoryPackage.APPINFO__MIXED:
        return mixed != null && !mixed.isEmpty();
      case RepositoryPackage.APPINFO__GROUP:
        return !getGroup().isEmpty();
      case RepositoryPackage.APPINFO__ANY:
        return !getAny().isEmpty();
      case RepositoryPackage.APPINFO__ADDED:
        return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
      case RepositoryPackage.APPINFO__ADDED_EP:
        return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
      case RepositoryPackage.APPINFO__CHANGE_TYPE:
        return isSetChangeType();
      case RepositoryPackage.APPINFO__DEPRECATED:
        return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
      case RepositoryPackage.APPINFO__DEPRECATED_EP:
        return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
      case RepositoryPackage.APPINFO__ISSUE:
        return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
      case RepositoryPackage.APPINFO__LANG_ID:
        return LANG_ID_EDEFAULT == null ? langId != null : !LANG_ID_EDEFAULT.equals(langId);
      case RepositoryPackage.APPINFO__LAST_MODIFIED:
        return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
      case RepositoryPackage.APPINFO__PURPOSE:
        return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
      case RepositoryPackage.APPINFO__REPLACED:
        return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
      case RepositoryPackage.APPINFO__REPLACED_BY_FIELD:
        return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
      case RepositoryPackage.APPINFO__REPLACED_EP:
        return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
      case RepositoryPackage.APPINFO__SPEC_URL:
        return SPEC_URL_EDEFAULT == null ? specUrl != null : !SPEC_URL_EDEFAULT.equals(specUrl);
      case RepositoryPackage.APPINFO__SUPPORTED:
        return isSetSupported();
      case RepositoryPackage.APPINFO__UPDATED:
        return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
      case RepositoryPackage.APPINFO__UPDATED_EP:
        return UPDATED_EP_EDEFAULT == null ? updatedEP != null : !UPDATED_EP_EDEFAULT.equals(updatedEP);
      case RepositoryPackage.APPINFO__ANY_ATTRIBUTE:
        return anyAttribute != null && !anyAttribute.isEmpty();
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
    result.append(", added: ");
    result.append(added);
    result.append(", addedEP: ");
    result.append(addedEP);
    result.append(", changeType: ");
    if (changeTypeESet) result.append(changeType); else result.append("<unset>");
    result.append(", deprecated: ");
    result.append(deprecated);
    result.append(", deprecatedEP: ");
    result.append(deprecatedEP);
    result.append(", issue: ");
    result.append(issue);
    result.append(", langId: ");
    result.append(langId);
    result.append(", lastModified: ");
    result.append(lastModified);
    result.append(", purpose: ");
    result.append(purpose);
    result.append(", replaced: ");
    result.append(replaced);
    result.append(", replacedByField: ");
    result.append(replacedByField);
    result.append(", replacedEP: ");
    result.append(replacedEP);
    result.append(", specUrl: ");
    result.append(specUrl);
    result.append(", supported: ");
    if (supportedESet) result.append(supported); else result.append("<unset>");
    result.append(", updated: ");
    result.append(updated);
    result.append(", updatedEP: ");
    result.append(updatedEP);
    result.append(", anyAttribute: ");
    result.append(anyAttribute);
    result.append(')');
    return result.toString();
  }

} //AppinfoImpl
