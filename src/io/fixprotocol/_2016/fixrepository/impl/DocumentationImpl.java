/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.ChangeTypeT;
import io.fixprotocol._2016.fixrepository.Documentation;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.SupportType;

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
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getLangId <em>Lang Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl#getUpdatedEP <em>Updated EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
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
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = "text/plain";

		/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

		/**
	 * This is true if the Content Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contentTypeESet;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DocumentationImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getDocumentation();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FixrepositoryPackage.DOCUMENTATION__MIXED);
		}
		return mixed;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(FixrepositoryPackage.eINSTANCE.getDocumentation_Any());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getAdded() {
		return added;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setAdded(String newAdded) {
		String oldAdded = added;
		added = newAdded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__ADDED, oldAdded, added));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BigInteger getAddedEP() {
		return addedEP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setAddedEP(BigInteger newAddedEP) {
		BigInteger oldAddedEP = addedEP;
		addedEP = newAddedEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__ADDED_EP, oldAddedEP, addedEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ChangeTypeT getChangeType() {
		return changeType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setChangeType(ChangeTypeT newChangeType) {
		ChangeTypeT oldChangeType = changeType;
		changeType = newChangeType == null ? CHANGE_TYPE_EDEFAULT : newChangeType;
		boolean oldChangeTypeESet = changeTypeESet;
		changeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetChangeType() {
		ChangeTypeT oldChangeType = changeType;
		boolean oldChangeTypeESet = changeTypeESet;
		changeType = CHANGE_TYPE_EDEFAULT;
		changeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.DOCUMENTATION__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetChangeType() {
		return changeTypeESet;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		boolean oldContentTypeESet = contentTypeESet;
		contentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__CONTENT_TYPE, oldContentType, contentType, !oldContentTypeESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetContentType() {
		String oldContentType = contentType;
		boolean oldContentTypeESet = contentTypeESet;
		contentType = CONTENT_TYPE_EDEFAULT;
		contentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.DOCUMENTATION__CONTENT_TYPE, oldContentType, CONTENT_TYPE_EDEFAULT, oldContentTypeESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContentType() {
		return contentTypeESet;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getDeprecated() {
		return deprecated;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDeprecated(String newDeprecated) {
		String oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__DEPRECATED, oldDeprecated, deprecated));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BigInteger getDeprecatedEP() {
		return deprecatedEP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDeprecatedEP(BigInteger newDeprecatedEP) {
		BigInteger oldDeprecatedEP = deprecatedEP;
		deprecatedEP = newDeprecatedEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getIssue() {
		return issue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__ISSUE, oldIssue, issue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getLangId() {
		return langId;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLangId(String newLangId) {
		String oldLangId = langId;
		langId = newLangId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__LANG_ID, oldLangId, langId));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getLastModified() {
		return lastModified;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLastModified(String newLastModified) {
		String oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__LAST_MODIFIED, oldLastModified, lastModified));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Object getPurpose() {
		return purpose;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setPurpose(Object newPurpose) {
		Object oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__PURPOSE, oldPurpose, purpose));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getReplaced() {
		return replaced;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setReplaced(String newReplaced) {
		String oldReplaced = replaced;
		replaced = newReplaced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__REPLACED, oldReplaced, replaced));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BigInteger getReplacedByField() {
		return replacedByField;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setReplacedByField(BigInteger newReplacedByField) {
		BigInteger oldReplacedByField = replacedByField;
		replacedByField = newReplacedByField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BigInteger getReplacedEP() {
		return replacedEP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setReplacedEP(BigInteger newReplacedEP) {
		BigInteger oldReplacedEP = replacedEP;
		replacedEP = newReplacedEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__REPLACED_EP, oldReplacedEP, replacedEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public SupportType getSupported() {
		return supported;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setSupported(SupportType newSupported) {
		SupportType oldSupported = supported;
		supported = newSupported == null ? SUPPORTED_EDEFAULT : newSupported;
		boolean oldSupportedESet = supportedESet;
		supportedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__SUPPORTED, oldSupported, supported, !oldSupportedESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetSupported() {
		SupportType oldSupported = supported;
		boolean oldSupportedESet = supportedESet;
		supported = SUPPORTED_EDEFAULT;
		supportedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.DOCUMENTATION__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetSupported() {
		return supportedESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getUpdated() {
		return updated;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setUpdated(String newUpdated) {
		String oldUpdated = updated;
		updated = newUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__UPDATED, oldUpdated, updated));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BigInteger getUpdatedEP() {
		return updatedEP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setUpdatedEP(BigInteger newUpdatedEP) {
		BigInteger oldUpdatedEP = updatedEP;
		updatedEP = newUpdatedEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.DOCUMENTATION__UPDATED_EP, oldUpdatedEP, updatedEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.DOCUMENTATION__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FixrepositoryPackage.DOCUMENTATION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case FixrepositoryPackage.DOCUMENTATION__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FixrepositoryPackage.DOCUMENTATION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case FixrepositoryPackage.DOCUMENTATION__ADDED:
				return getAdded();
			case FixrepositoryPackage.DOCUMENTATION__ADDED_EP:
				return getAddedEP();
			case FixrepositoryPackage.DOCUMENTATION__CHANGE_TYPE:
				return getChangeType();
			case FixrepositoryPackage.DOCUMENTATION__CONTENT_TYPE:
				return getContentType();
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED:
				return getDeprecated();
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED_EP:
				return getDeprecatedEP();
			case FixrepositoryPackage.DOCUMENTATION__ISSUE:
				return getIssue();
			case FixrepositoryPackage.DOCUMENTATION__LANG_ID:
				return getLangId();
			case FixrepositoryPackage.DOCUMENTATION__LAST_MODIFIED:
				return getLastModified();
			case FixrepositoryPackage.DOCUMENTATION__PURPOSE:
				return getPurpose();
			case FixrepositoryPackage.DOCUMENTATION__REPLACED:
				return getReplaced();
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_BY_FIELD:
				return getReplacedByField();
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_EP:
				return getReplacedEP();
			case FixrepositoryPackage.DOCUMENTATION__SUPPORTED:
				return getSupported();
			case FixrepositoryPackage.DOCUMENTATION__UPDATED:
				return getUpdated();
			case FixrepositoryPackage.DOCUMENTATION__UPDATED_EP:
				return getUpdatedEP();
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
			case FixrepositoryPackage.DOCUMENTATION__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__ADDED:
				setAdded((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__ADDED_EP:
				setAddedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__CHANGE_TYPE:
				setChangeType((ChangeTypeT)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED:
				setDeprecated((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED_EP:
				setDeprecatedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__ISSUE:
				setIssue((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__LANG_ID:
				setLangId((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__LAST_MODIFIED:
				setLastModified((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__PURPOSE:
				setPurpose(newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__REPLACED:
				setReplaced((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_BY_FIELD:
				setReplacedByField((BigInteger)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_EP:
				setReplacedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__SUPPORTED:
				setSupported((SupportType)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__UPDATED:
				setUpdated((String)newValue);
				return;
			case FixrepositoryPackage.DOCUMENTATION__UPDATED_EP:
				setUpdatedEP((BigInteger)newValue);
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
			case FixrepositoryPackage.DOCUMENTATION__MIXED:
				getMixed().clear();
				return;
			case FixrepositoryPackage.DOCUMENTATION__ANY:
				getAny().clear();
				return;
			case FixrepositoryPackage.DOCUMENTATION__ADDED:
				setAdded(ADDED_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__ADDED_EP:
				setAddedEP(ADDED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__CHANGE_TYPE:
				unsetChangeType();
				return;
			case FixrepositoryPackage.DOCUMENTATION__CONTENT_TYPE:
				unsetContentType();
				return;
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED_EP:
				setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__LANG_ID:
				setLangId(LANG_ID_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__REPLACED:
				setReplaced(REPLACED_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_BY_FIELD:
				setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_EP:
				setReplacedEP(REPLACED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__SUPPORTED:
				unsetSupported();
				return;
			case FixrepositoryPackage.DOCUMENTATION__UPDATED:
				setUpdated(UPDATED_EDEFAULT);
				return;
			case FixrepositoryPackage.DOCUMENTATION__UPDATED_EP:
				setUpdatedEP(UPDATED_EP_EDEFAULT);
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
			case FixrepositoryPackage.DOCUMENTATION__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FixrepositoryPackage.DOCUMENTATION__ANY:
				return !getAny().isEmpty();
			case FixrepositoryPackage.DOCUMENTATION__ADDED:
				return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
			case FixrepositoryPackage.DOCUMENTATION__ADDED_EP:
				return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
			case FixrepositoryPackage.DOCUMENTATION__CHANGE_TYPE:
				return isSetChangeType();
			case FixrepositoryPackage.DOCUMENTATION__CONTENT_TYPE:
				return isSetContentType();
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
			case FixrepositoryPackage.DOCUMENTATION__DEPRECATED_EP:
				return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
			case FixrepositoryPackage.DOCUMENTATION__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case FixrepositoryPackage.DOCUMENTATION__LANG_ID:
				return LANG_ID_EDEFAULT == null ? langId != null : !LANG_ID_EDEFAULT.equals(langId);
			case FixrepositoryPackage.DOCUMENTATION__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case FixrepositoryPackage.DOCUMENTATION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case FixrepositoryPackage.DOCUMENTATION__REPLACED:
				return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_BY_FIELD:
				return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
			case FixrepositoryPackage.DOCUMENTATION__REPLACED_EP:
				return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
			case FixrepositoryPackage.DOCUMENTATION__SUPPORTED:
				return isSetSupported();
			case FixrepositoryPackage.DOCUMENTATION__UPDATED:
				return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
			case FixrepositoryPackage.DOCUMENTATION__UPDATED_EP:
				return UPDATED_EP_EDEFAULT == null ? updatedEP != null : !UPDATED_EP_EDEFAULT.equals(updatedEP);
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
		result.append(", contentType: ");
		if (contentTypeESet) result.append(contentType); else result.append("<unset>");
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
		result.append(", supported: ");
		if (supportedESet) result.append(supported); else result.append("<unset>");
		result.append(", updated: ");
		result.append(updated);
		result.append(", updatedEP: ");
		result.append(updatedEP);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
