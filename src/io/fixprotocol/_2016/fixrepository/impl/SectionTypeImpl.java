/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.ChangeTypeT;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.SectionIDT;
import io.fixprotocol._2016.fixrepository.SectionType;
import io.fixprotocol._2016.fixrepository.SupportType;
import io.fixprotocol._2016.fixrepository.VolumeT;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getDisplayOrder <em>Display Order</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getFIXMLFileName <em>FIXML File Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getUpdatedEP <em>Updated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionTypeImpl extends MinimalEObjectImpl.Container implements SectionType {
  /**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
  protected Annotation annotation;

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
	 * The default value of the '{@link #getDisplayOrder() <em>Display Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplayOrder()
	 * @generated
	 * @ordered
	 */
  protected static final int DISPLAY_ORDER_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getDisplayOrder() <em>Display Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplayOrder()
	 * @generated
	 * @ordered
	 */
  protected int displayOrder = DISPLAY_ORDER_EDEFAULT;

  /**
	 * This is true if the Display Order attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean displayOrderESet;

  /**
	 * The default value of the '{@link #getFIXMLFileName() <em>FIXML File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFIXMLFileName()
	 * @generated
	 * @ordered
	 */
  protected static final String FIXML_FILE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFIXMLFileName() <em>FIXML File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFIXMLFileName()
	 * @generated
	 * @ordered
	 */
  protected String fIXMLFileName = FIXML_FILE_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
  protected static final SectionIDT ID_EDEFAULT = SectionIDT.SESSION;

  /**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
  protected SectionIDT id = ID_EDEFAULT;

  /**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean idESet;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
  protected static final VolumeT VOLUME_EDEFAULT = VolumeT._1;

  /**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
  protected VolumeT volume = VOLUME_EDEFAULT;

  /**
	 * This is true if the Volume attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean volumeESet;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SectionTypeImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getSectionType();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Annotation getAnnotation() {
		return annotation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setAnnotation(Annotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.SECTION_TYPE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.SECTION_TYPE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__ADDED, oldAdded, added));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__ADDED_EP, oldAddedEP, addedEP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.SECTION_TYPE__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__DEPRECATED, oldDeprecated, deprecated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public int getDisplayOrder() {
		return displayOrder;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDisplayOrder(int newDisplayOrder) {
		int oldDisplayOrder = displayOrder;
		displayOrder = newDisplayOrder;
		boolean oldDisplayOrderESet = displayOrderESet;
		displayOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__DISPLAY_ORDER, oldDisplayOrder, displayOrder, !oldDisplayOrderESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetDisplayOrder() {
		int oldDisplayOrder = displayOrder;
		boolean oldDisplayOrderESet = displayOrderESet;
		displayOrder = DISPLAY_ORDER_EDEFAULT;
		displayOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.SECTION_TYPE__DISPLAY_ORDER, oldDisplayOrder, DISPLAY_ORDER_EDEFAULT, oldDisplayOrderESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetDisplayOrder() {
		return displayOrderESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getFIXMLFileName() {
		return fIXMLFileName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setFIXMLFileName(String newFIXMLFileName) {
		String oldFIXMLFileName = fIXMLFileName;
		fIXMLFileName = newFIXMLFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__FIXML_FILE_NAME, oldFIXMLFileName, fIXMLFileName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public SectionIDT getId() {
		return id;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setId(SectionIDT newId) {
		SectionIDT oldId = id;
		id = newId == null ? ID_EDEFAULT : newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__ID, oldId, id, !oldIdESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetId() {
		SectionIDT oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.SECTION_TYPE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetId() {
		return idESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__ISSUE, oldIssue, issue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getName() {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__REPLACED, oldReplaced, replaced));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__REPLACED_EP, oldReplacedEP, replacedEP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__SUPPORTED, oldSupported, supported, !oldSupportedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.SECTION_TYPE__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__UPDATED, oldUpdated, updated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__UPDATED_EP, oldUpdatedEP, updatedEP));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public VolumeT getVolume() {
		return volume;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setVolume(VolumeT newVolume) {
		VolumeT oldVolume = volume;
		volume = newVolume == null ? VOLUME_EDEFAULT : newVolume;
		boolean oldVolumeESet = volumeESet;
		volumeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.SECTION_TYPE__VOLUME, oldVolume, volume, !oldVolumeESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetVolume() {
		VolumeT oldVolume = volume;
		boolean oldVolumeESet = volumeESet;
		volume = VOLUME_EDEFAULT;
		volumeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.SECTION_TYPE__VOLUME, oldVolume, VOLUME_EDEFAULT, oldVolumeESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetVolume() {
		return volumeESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.SECTION_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
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
			case FixrepositoryPackage.SECTION_TYPE__ANNOTATION:
				return getAnnotation();
			case FixrepositoryPackage.SECTION_TYPE__ADDED:
				return getAdded();
			case FixrepositoryPackage.SECTION_TYPE__ADDED_EP:
				return getAddedEP();
			case FixrepositoryPackage.SECTION_TYPE__CHANGE_TYPE:
				return getChangeType();
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED:
				return getDeprecated();
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED_EP:
				return getDeprecatedEP();
			case FixrepositoryPackage.SECTION_TYPE__DISPLAY_ORDER:
				return getDisplayOrder();
			case FixrepositoryPackage.SECTION_TYPE__FIXML_FILE_NAME:
				return getFIXMLFileName();
			case FixrepositoryPackage.SECTION_TYPE__ID:
				return getId();
			case FixrepositoryPackage.SECTION_TYPE__ISSUE:
				return getIssue();
			case FixrepositoryPackage.SECTION_TYPE__LAST_MODIFIED:
				return getLastModified();
			case FixrepositoryPackage.SECTION_TYPE__NAME:
				return getName();
			case FixrepositoryPackage.SECTION_TYPE__REPLACED:
				return getReplaced();
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_BY_FIELD:
				return getReplacedByField();
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_EP:
				return getReplacedEP();
			case FixrepositoryPackage.SECTION_TYPE__SUPPORTED:
				return getSupported();
			case FixrepositoryPackage.SECTION_TYPE__UPDATED:
				return getUpdated();
			case FixrepositoryPackage.SECTION_TYPE__UPDATED_EP:
				return getUpdatedEP();
			case FixrepositoryPackage.SECTION_TYPE__VOLUME:
				return getVolume();
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
			case FixrepositoryPackage.SECTION_TYPE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__ADDED:
				setAdded((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__ADDED_EP:
				setAddedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__CHANGE_TYPE:
				setChangeType((ChangeTypeT)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED:
				setDeprecated((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED_EP:
				setDeprecatedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__DISPLAY_ORDER:
				setDisplayOrder((Integer)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__FIXML_FILE_NAME:
				setFIXMLFileName((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__ID:
				setId((SectionIDT)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__ISSUE:
				setIssue((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__LAST_MODIFIED:
				setLastModified((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__REPLACED:
				setReplaced((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_BY_FIELD:
				setReplacedByField((BigInteger)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_EP:
				setReplacedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__SUPPORTED:
				setSupported((SupportType)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__UPDATED:
				setUpdated((String)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__UPDATED_EP:
				setUpdatedEP((BigInteger)newValue);
				return;
			case FixrepositoryPackage.SECTION_TYPE__VOLUME:
				setVolume((VolumeT)newValue);
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
			case FixrepositoryPackage.SECTION_TYPE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case FixrepositoryPackage.SECTION_TYPE__ADDED:
				setAdded(ADDED_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__ADDED_EP:
				setAddedEP(ADDED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__CHANGE_TYPE:
				unsetChangeType();
				return;
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED_EP:
				setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__DISPLAY_ORDER:
				unsetDisplayOrder();
				return;
			case FixrepositoryPackage.SECTION_TYPE__FIXML_FILE_NAME:
				setFIXMLFileName(FIXML_FILE_NAME_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__ID:
				unsetId();
				return;
			case FixrepositoryPackage.SECTION_TYPE__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__REPLACED:
				setReplaced(REPLACED_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_BY_FIELD:
				setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_EP:
				setReplacedEP(REPLACED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__SUPPORTED:
				unsetSupported();
				return;
			case FixrepositoryPackage.SECTION_TYPE__UPDATED:
				setUpdated(UPDATED_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__UPDATED_EP:
				setUpdatedEP(UPDATED_EP_EDEFAULT);
				return;
			case FixrepositoryPackage.SECTION_TYPE__VOLUME:
				unsetVolume();
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
			case FixrepositoryPackage.SECTION_TYPE__ANNOTATION:
				return annotation != null;
			case FixrepositoryPackage.SECTION_TYPE__ADDED:
				return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
			case FixrepositoryPackage.SECTION_TYPE__ADDED_EP:
				return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
			case FixrepositoryPackage.SECTION_TYPE__CHANGE_TYPE:
				return isSetChangeType();
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
			case FixrepositoryPackage.SECTION_TYPE__DEPRECATED_EP:
				return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
			case FixrepositoryPackage.SECTION_TYPE__DISPLAY_ORDER:
				return isSetDisplayOrder();
			case FixrepositoryPackage.SECTION_TYPE__FIXML_FILE_NAME:
				return FIXML_FILE_NAME_EDEFAULT == null ? fIXMLFileName != null : !FIXML_FILE_NAME_EDEFAULT.equals(fIXMLFileName);
			case FixrepositoryPackage.SECTION_TYPE__ID:
				return isSetId();
			case FixrepositoryPackage.SECTION_TYPE__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case FixrepositoryPackage.SECTION_TYPE__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case FixrepositoryPackage.SECTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FixrepositoryPackage.SECTION_TYPE__REPLACED:
				return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_BY_FIELD:
				return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
			case FixrepositoryPackage.SECTION_TYPE__REPLACED_EP:
				return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
			case FixrepositoryPackage.SECTION_TYPE__SUPPORTED:
				return isSetSupported();
			case FixrepositoryPackage.SECTION_TYPE__UPDATED:
				return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
			case FixrepositoryPackage.SECTION_TYPE__UPDATED_EP:
				return UPDATED_EP_EDEFAULT == null ? updatedEP != null : !UPDATED_EP_EDEFAULT.equals(updatedEP);
			case FixrepositoryPackage.SECTION_TYPE__VOLUME:
				return isSetVolume();
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
		result.append(" (added: ");
		result.append(added);
		result.append(", addedEP: ");
		result.append(addedEP);
		result.append(", changeType: ");
		if (changeTypeESet) result.append(changeType); else result.append("<unset>");
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(", deprecatedEP: ");
		result.append(deprecatedEP);
		result.append(", displayOrder: ");
		if (displayOrderESet) result.append(displayOrder); else result.append("<unset>");
		result.append(", fIXMLFileName: ");
		result.append(fIXMLFileName);
		result.append(", id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", issue: ");
		result.append(issue);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", name: ");
		result.append(name);
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
		result.append(", volume: ");
		if (volumeESet) result.append(volume); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SectionTypeImpl
