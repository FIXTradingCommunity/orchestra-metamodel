/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.Appinfo;
import io.fixprotocol._2016.fixrepository.ChangeTypeT;
import io.fixprotocol._2016.fixrepository.Documentation;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.SupportType;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getAppinfo <em>Appinfo</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl#getUpdatedEP <em>Updated EP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation {
  /**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
  protected FeatureMap group;

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
  protected AnnotationImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getAnnotation();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, FixrepositoryPackage.ANNOTATION__GROUP);
		}
		return group;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<Documentation> getDocumentation() {
		return getGroup().list(FixrepositoryPackage.eINSTANCE.getAnnotation_Documentation());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<Appinfo> getAppinfo() {
		return getGroup().list(FixrepositoryPackage.eINSTANCE.getAnnotation_Appinfo());
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__ADDED, oldAdded, added));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__ADDED_EP, oldAddedEP, addedEP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.ANNOTATION__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__DEPRECATED, oldDeprecated, deprecated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__ISSUE, oldIssue, issue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__LAST_MODIFIED, oldLastModified, lastModified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__REPLACED, oldReplaced, replaced));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__REPLACED_EP, oldReplacedEP, replacedEP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__SUPPORTED, oldSupported, supported, !oldSupportedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.ANNOTATION__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__UPDATED, oldUpdated, updated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.ANNOTATION__UPDATED_EP, oldUpdatedEP, updatedEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.ANNOTATION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FixrepositoryPackage.ANNOTATION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case FixrepositoryPackage.ANNOTATION__APPINFO:
				return ((InternalEList<?>)getAppinfo()).basicRemove(otherEnd, msgs);
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
			case FixrepositoryPackage.ANNOTATION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case FixrepositoryPackage.ANNOTATION__DOCUMENTATION:
				return getDocumentation();
			case FixrepositoryPackage.ANNOTATION__APPINFO:
				return getAppinfo();
			case FixrepositoryPackage.ANNOTATION__ADDED:
				return getAdded();
			case FixrepositoryPackage.ANNOTATION__ADDED_EP:
				return getAddedEP();
			case FixrepositoryPackage.ANNOTATION__CHANGE_TYPE:
				return getChangeType();
			case FixrepositoryPackage.ANNOTATION__DEPRECATED:
				return getDeprecated();
			case FixrepositoryPackage.ANNOTATION__DEPRECATED_EP:
				return getDeprecatedEP();
			case FixrepositoryPackage.ANNOTATION__ISSUE:
				return getIssue();
			case FixrepositoryPackage.ANNOTATION__LAST_MODIFIED:
				return getLastModified();
			case FixrepositoryPackage.ANNOTATION__REPLACED:
				return getReplaced();
			case FixrepositoryPackage.ANNOTATION__REPLACED_BY_FIELD:
				return getReplacedByField();
			case FixrepositoryPackage.ANNOTATION__REPLACED_EP:
				return getReplacedEP();
			case FixrepositoryPackage.ANNOTATION__SUPPORTED:
				return getSupported();
			case FixrepositoryPackage.ANNOTATION__UPDATED:
				return getUpdated();
			case FixrepositoryPackage.ANNOTATION__UPDATED_EP:
				return getUpdatedEP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FixrepositoryPackage.ANNOTATION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__APPINFO:
				getAppinfo().clear();
				getAppinfo().addAll((Collection<? extends Appinfo>)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__ADDED:
				setAdded((String)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__ADDED_EP:
				setAddedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__CHANGE_TYPE:
				setChangeType((ChangeTypeT)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__DEPRECATED:
				setDeprecated((String)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__DEPRECATED_EP:
				setDeprecatedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__ISSUE:
				setIssue((String)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__LAST_MODIFIED:
				setLastModified((String)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__REPLACED:
				setReplaced((String)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__REPLACED_BY_FIELD:
				setReplacedByField((BigInteger)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__REPLACED_EP:
				setReplacedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__SUPPORTED:
				setSupported((SupportType)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__UPDATED:
				setUpdated((String)newValue);
				return;
			case FixrepositoryPackage.ANNOTATION__UPDATED_EP:
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
			case FixrepositoryPackage.ANNOTATION__GROUP:
				getGroup().clear();
				return;
			case FixrepositoryPackage.ANNOTATION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case FixrepositoryPackage.ANNOTATION__APPINFO:
				getAppinfo().clear();
				return;
			case FixrepositoryPackage.ANNOTATION__ADDED:
				setAdded(ADDED_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__ADDED_EP:
				setAddedEP(ADDED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__CHANGE_TYPE:
				unsetChangeType();
				return;
			case FixrepositoryPackage.ANNOTATION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__DEPRECATED_EP:
				setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__REPLACED:
				setReplaced(REPLACED_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__REPLACED_BY_FIELD:
				setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__REPLACED_EP:
				setReplacedEP(REPLACED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__SUPPORTED:
				unsetSupported();
				return;
			case FixrepositoryPackage.ANNOTATION__UPDATED:
				setUpdated(UPDATED_EDEFAULT);
				return;
			case FixrepositoryPackage.ANNOTATION__UPDATED_EP:
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
			case FixrepositoryPackage.ANNOTATION__GROUP:
				return group != null && !group.isEmpty();
			case FixrepositoryPackage.ANNOTATION__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case FixrepositoryPackage.ANNOTATION__APPINFO:
				return !getAppinfo().isEmpty();
			case FixrepositoryPackage.ANNOTATION__ADDED:
				return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
			case FixrepositoryPackage.ANNOTATION__ADDED_EP:
				return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
			case FixrepositoryPackage.ANNOTATION__CHANGE_TYPE:
				return isSetChangeType();
			case FixrepositoryPackage.ANNOTATION__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
			case FixrepositoryPackage.ANNOTATION__DEPRECATED_EP:
				return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
			case FixrepositoryPackage.ANNOTATION__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case FixrepositoryPackage.ANNOTATION__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case FixrepositoryPackage.ANNOTATION__REPLACED:
				return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
			case FixrepositoryPackage.ANNOTATION__REPLACED_BY_FIELD:
				return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
			case FixrepositoryPackage.ANNOTATION__REPLACED_EP:
				return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
			case FixrepositoryPackage.ANNOTATION__SUPPORTED:
				return isSetSupported();
			case FixrepositoryPackage.ANNOTATION__UPDATED:
				return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
			case FixrepositoryPackage.ANNOTATION__UPDATED_EP:
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
		result.append(" (group: ");
		result.append(group);
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
		result.append(", lastModified: ");
		result.append(lastModified);
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

} //AnnotationImpl
