/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.CatComponentTypeT;
import io.fixprotocol._2016.fixrepository.CatIncludeFileT;
import io.fixprotocol._2016.fixrepository.CategoryType;
import io.fixprotocol._2016.fixrepository.ChangeTypeT;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.SectionIDT;
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
 * An implementation of the model object '<em><b>Category Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getFIXMLFileName <em>FIXML File Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getIncludeFile <em>Include File</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getUpdatedEP <em>Updated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryTypeImpl extends MinimalEObjectImpl.Container implements CategoryType {
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
   * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentType()
   * @generated
   * @ordered
   */
  protected static final CatComponentTypeT COMPONENT_TYPE_EDEFAULT = CatComponentTypeT.FIELD;

  /**
   * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentType()
   * @generated
   * @ordered
   */
  protected CatComponentTypeT componentType = COMPONENT_TYPE_EDEFAULT;

  /**
   * This is true if the Component Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean componentTypeESet;

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
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected static final CatIncludeFileT INCLUDE_FILE_EDEFAULT = CatIncludeFileT.COMPONENTS;

  /**
   * The cached value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected CatIncludeFileT includeFile = INCLUDE_FILE_EDEFAULT;

  /**
   * This is true if the Include File attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean includeFileESet;

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
   * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection()
   * @generated
   * @ordered
   */
  protected static final SectionIDT SECTION_EDEFAULT = SectionIDT.SESSION;

  /**
   * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection()
   * @generated
   * @ordered
   */
  protected SectionIDT section = SECTION_EDEFAULT;

  /**
   * This is true if the Section attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean sectionESet;

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
  protected CategoryTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getCategoryType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(Annotation newAnnotation) {
    if (newAnnotation != annotation) {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__ADDED, oldAdded, added));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__ADDED_EP, oldAddedEP, addedEP));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.CATEGORY_TYPE__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
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
  public CatComponentTypeT getComponentType() {
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentType(CatComponentTypeT newComponentType) {
    CatComponentTypeT oldComponentType = componentType;
    componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
    boolean oldComponentTypeESet = componentTypeESet;
    componentTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__COMPONENT_TYPE, oldComponentType, componentType, !oldComponentTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetComponentType() {
    CatComponentTypeT oldComponentType = componentType;
    boolean oldComponentTypeESet = componentTypeESet;
    componentType = COMPONENT_TYPE_EDEFAULT;
    componentTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.CATEGORY_TYPE__COMPONENT_TYPE, oldComponentType, COMPONENT_TYPE_EDEFAULT, oldComponentTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetComponentType() {
    return componentTypeESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED, oldDeprecated, deprecated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFIXMLFileName() {
    return fIXMLFileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFIXMLFileName(String newFIXMLFileName) {
    String oldFIXMLFileName = fIXMLFileName;
    fIXMLFileName = newFIXMLFileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__FIXML_FILE_NAME, oldFIXMLFileName, fIXMLFileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatIncludeFileT getIncludeFile() {
    return includeFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeFile(CatIncludeFileT newIncludeFile) {
    CatIncludeFileT oldIncludeFile = includeFile;
    includeFile = newIncludeFile == null ? INCLUDE_FILE_EDEFAULT : newIncludeFile;
    boolean oldIncludeFileESet = includeFileESet;
    includeFileESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__INCLUDE_FILE, oldIncludeFile, includeFile, !oldIncludeFileESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetIncludeFile() {
    CatIncludeFileT oldIncludeFile = includeFile;
    boolean oldIncludeFileESet = includeFileESet;
    includeFile = INCLUDE_FILE_EDEFAULT;
    includeFileESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.CATEGORY_TYPE__INCLUDE_FILE, oldIncludeFile, INCLUDE_FILE_EDEFAULT, oldIncludeFileESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIncludeFile() {
    return includeFileESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__ISSUE, oldIssue, issue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__REPLACED, oldReplaced, replaced));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__REPLACED_EP, oldReplacedEP, replacedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionIDT getSection() {
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSection(SectionIDT newSection) {
    SectionIDT oldSection = section;
    section = newSection == null ? SECTION_EDEFAULT : newSection;
    boolean oldSectionESet = sectionESet;
    sectionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__SECTION, oldSection, section, !oldSectionESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetSection() {
    SectionIDT oldSection = section;
    boolean oldSectionESet = sectionESet;
    section = SECTION_EDEFAULT;
    sectionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.CATEGORY_TYPE__SECTION, oldSection, SECTION_EDEFAULT, oldSectionESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSection() {
    return sectionESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__SUPPORTED, oldSupported, supported, !oldSupportedESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.CATEGORY_TYPE__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__UPDATED, oldUpdated, updated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__UPDATED_EP, oldUpdatedEP, updatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VolumeT getVolume() {
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolume(VolumeT newVolume) {
    VolumeT oldVolume = volume;
    volume = newVolume == null ? VOLUME_EDEFAULT : newVolume;
    boolean oldVolumeESet = volumeESet;
    volumeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.CATEGORY_TYPE__VOLUME, oldVolume, volume, !oldVolumeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetVolume() {
    VolumeT oldVolume = volume;
    boolean oldVolumeESet = volumeESet;
    volume = VOLUME_EDEFAULT;
    volumeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.CATEGORY_TYPE__VOLUME, oldVolume, VOLUME_EDEFAULT, oldVolumeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
      case FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION:
        return getAnnotation();
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED:
        return getAdded();
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED_EP:
        return getAddedEP();
      case FixrepositoryPackage.CATEGORY_TYPE__CHANGE_TYPE:
        return getChangeType();
      case FixrepositoryPackage.CATEGORY_TYPE__COMPONENT_TYPE:
        return getComponentType();
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED:
        return getDeprecated();
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED_EP:
        return getDeprecatedEP();
      case FixrepositoryPackage.CATEGORY_TYPE__FIXML_FILE_NAME:
        return getFIXMLFileName();
      case FixrepositoryPackage.CATEGORY_TYPE__ID:
        return getId();
      case FixrepositoryPackage.CATEGORY_TYPE__INCLUDE_FILE:
        return getIncludeFile();
      case FixrepositoryPackage.CATEGORY_TYPE__ISSUE:
        return getIssue();
      case FixrepositoryPackage.CATEGORY_TYPE__LAST_MODIFIED:
        return getLastModified();
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED:
        return getReplaced();
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_BY_FIELD:
        return getReplacedByField();
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_EP:
        return getReplacedEP();
      case FixrepositoryPackage.CATEGORY_TYPE__SECTION:
        return getSection();
      case FixrepositoryPackage.CATEGORY_TYPE__SUPPORTED:
        return getSupported();
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED:
        return getUpdated();
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED_EP:
        return getUpdatedEP();
      case FixrepositoryPackage.CATEGORY_TYPE__VOLUME:
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
      case FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED:
        setAdded((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED_EP:
        setAddedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__CHANGE_TYPE:
        setChangeType((ChangeTypeT)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__COMPONENT_TYPE:
        setComponentType((CatComponentTypeT)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED:
        setDeprecated((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED_EP:
        setDeprecatedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__FIXML_FILE_NAME:
        setFIXMLFileName((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ID:
        setId((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__INCLUDE_FILE:
        setIncludeFile((CatIncludeFileT)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ISSUE:
        setIssue((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__LAST_MODIFIED:
        setLastModified((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED:
        setReplaced((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_BY_FIELD:
        setReplacedByField((BigInteger)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_EP:
        setReplacedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__SECTION:
        setSection((SectionIDT)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__SUPPORTED:
        setSupported((SupportType)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED:
        setUpdated((String)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED_EP:
        setUpdatedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__VOLUME:
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
      case FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED:
        setAdded(ADDED_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED_EP:
        setAddedEP(ADDED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__CHANGE_TYPE:
        unsetChangeType();
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__COMPONENT_TYPE:
        unsetComponentType();
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED_EP:
        setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__FIXML_FILE_NAME:
        setFIXMLFileName(FIXML_FILE_NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__INCLUDE_FILE:
        unsetIncludeFile();
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__ISSUE:
        setIssue(ISSUE_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__LAST_MODIFIED:
        setLastModified(LAST_MODIFIED_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED:
        setReplaced(REPLACED_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_BY_FIELD:
        setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_EP:
        setReplacedEP(REPLACED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__SECTION:
        unsetSection();
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__SUPPORTED:
        unsetSupported();
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED:
        setUpdated(UPDATED_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED_EP:
        setUpdatedEP(UPDATED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.CATEGORY_TYPE__VOLUME:
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
      case FixrepositoryPackage.CATEGORY_TYPE__ANNOTATION:
        return annotation != null;
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED:
        return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
      case FixrepositoryPackage.CATEGORY_TYPE__ADDED_EP:
        return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
      case FixrepositoryPackage.CATEGORY_TYPE__CHANGE_TYPE:
        return isSetChangeType();
      case FixrepositoryPackage.CATEGORY_TYPE__COMPONENT_TYPE:
        return isSetComponentType();
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED:
        return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
      case FixrepositoryPackage.CATEGORY_TYPE__DEPRECATED_EP:
        return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
      case FixrepositoryPackage.CATEGORY_TYPE__FIXML_FILE_NAME:
        return FIXML_FILE_NAME_EDEFAULT == null ? fIXMLFileName != null : !FIXML_FILE_NAME_EDEFAULT.equals(fIXMLFileName);
      case FixrepositoryPackage.CATEGORY_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case FixrepositoryPackage.CATEGORY_TYPE__INCLUDE_FILE:
        return isSetIncludeFile();
      case FixrepositoryPackage.CATEGORY_TYPE__ISSUE:
        return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
      case FixrepositoryPackage.CATEGORY_TYPE__LAST_MODIFIED:
        return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED:
        return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_BY_FIELD:
        return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
      case FixrepositoryPackage.CATEGORY_TYPE__REPLACED_EP:
        return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
      case FixrepositoryPackage.CATEGORY_TYPE__SECTION:
        return isSetSection();
      case FixrepositoryPackage.CATEGORY_TYPE__SUPPORTED:
        return isSetSupported();
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED:
        return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
      case FixrepositoryPackage.CATEGORY_TYPE__UPDATED_EP:
        return UPDATED_EP_EDEFAULT == null ? updatedEP != null : !UPDATED_EP_EDEFAULT.equals(updatedEP);
      case FixrepositoryPackage.CATEGORY_TYPE__VOLUME:
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (added: ");
    result.append(added);
    result.append(", addedEP: ");
    result.append(addedEP);
    result.append(", changeType: ");
    if (changeTypeESet) result.append(changeType); else result.append("<unset>");
    result.append(", componentType: ");
    if (componentTypeESet) result.append(componentType); else result.append("<unset>");
    result.append(", deprecated: ");
    result.append(deprecated);
    result.append(", deprecatedEP: ");
    result.append(deprecatedEP);
    result.append(", fIXMLFileName: ");
    result.append(fIXMLFileName);
    result.append(", id: ");
    result.append(id);
    result.append(", includeFile: ");
    if (includeFileESet) result.append(includeFile); else result.append("<unset>");
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
    result.append(", section: ");
    if (sectionESet) result.append(section); else result.append("<unset>");
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

} //CategoryTypeImpl
