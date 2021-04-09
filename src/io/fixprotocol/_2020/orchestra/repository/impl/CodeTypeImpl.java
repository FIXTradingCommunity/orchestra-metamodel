/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.Annotation;
import io.fixprotocol._2020.orchestra.repository.ChangeTypeT;
import io.fixprotocol._2020.orchestra.repository.CodeType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.SupportType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getAbbrName <em>Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getUpdatedEP <em>Updated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeTypeImpl extends MinimalEObjectImpl.Container implements CodeType {
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
   * The default value of the '{@link #getAbbrName() <em>Abbr Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrName()
   * @generated
   * @ordered
   */
  protected static final String ABBR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbbrName() <em>Abbr Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrName()
   * @generated
   * @ordered
   */
  protected String abbrName = ABBR_NAME_EDEFAULT;

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
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final String GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected String group = GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final BigInteger ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected BigInteger id = ID_EDEFAULT;

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
   * The default value of the '{@link #getScenario() <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenario()
   * @generated
   * @ordered
   */
  protected static final String SCENARIO_EDEFAULT = "base";

  /**
   * The cached value of the '{@link #getScenario() <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenario()
   * @generated
   * @ordered
   */
  protected String scenario = SCENARIO_EDEFAULT;

  /**
   * This is true if the Scenario attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean scenarioESet;

  /**
   * The default value of the '{@link #getSort() <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected static final String SORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSort() <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected String sort = SORT_EDEFAULT;

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
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CodeTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getCodeType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.CODE_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.CODE_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__ANNOTATION, newAnnotation, newAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbbrName() {
    return abbrName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbbrName(String newAbbrName) {
    String oldAbbrName = abbrName;
    abbrName = newAbbrName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__ABBR_NAME, oldAbbrName, abbrName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__ADDED, oldAdded, added));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__ADDED_EP, oldAddedEP, addedEP));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.CODE_TYPE__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__DEPRECATED, oldDeprecated, deprecated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroup() {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(String newGroup) {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(BigInteger newId) {
    BigInteger oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__ISSUE, oldIssue, issue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__REPLACED, oldReplaced, replaced));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__REPLACED_EP, oldReplacedEP, replacedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScenario() {
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScenario(String newScenario) {
    String oldScenario = scenario;
    scenario = newScenario;
    boolean oldScenarioESet = scenarioESet;
    scenarioESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__SCENARIO, oldScenario, scenario, !oldScenarioESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetScenario() {
    String oldScenario = scenario;
    boolean oldScenarioESet = scenarioESet;
    scenario = SCENARIO_EDEFAULT;
    scenarioESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.CODE_TYPE__SCENARIO, oldScenario, SCENARIO_EDEFAULT, oldScenarioESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetScenario() {
    return scenarioESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSort() {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(String newSort) {
    String oldSort = sort;
    sort = newSort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__SORT, oldSort, sort));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__SUPPORTED, oldSupported, supported, !oldSupportedESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.CODE_TYPE__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__UPDATED, oldUpdated, updated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__UPDATED_EP, oldUpdatedEP, updatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.CODE_TYPE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.CODE_TYPE__ANNOTATION:
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
      case RepositoryPackage.CODE_TYPE__ANNOTATION:
        return getAnnotation();
      case RepositoryPackage.CODE_TYPE__ABBR_NAME:
        return getAbbrName();
      case RepositoryPackage.CODE_TYPE__ADDED:
        return getAdded();
      case RepositoryPackage.CODE_TYPE__ADDED_EP:
        return getAddedEP();
      case RepositoryPackage.CODE_TYPE__CHANGE_TYPE:
        return getChangeType();
      case RepositoryPackage.CODE_TYPE__DEPRECATED:
        return getDeprecated();
      case RepositoryPackage.CODE_TYPE__DEPRECATED_EP:
        return getDeprecatedEP();
      case RepositoryPackage.CODE_TYPE__GROUP:
        return getGroup();
      case RepositoryPackage.CODE_TYPE__ID:
        return getId();
      case RepositoryPackage.CODE_TYPE__ISSUE:
        return getIssue();
      case RepositoryPackage.CODE_TYPE__LAST_MODIFIED:
        return getLastModified();
      case RepositoryPackage.CODE_TYPE__NAME:
        return getName();
      case RepositoryPackage.CODE_TYPE__REPLACED:
        return getReplaced();
      case RepositoryPackage.CODE_TYPE__REPLACED_BY_FIELD:
        return getReplacedByField();
      case RepositoryPackage.CODE_TYPE__REPLACED_EP:
        return getReplacedEP();
      case RepositoryPackage.CODE_TYPE__SCENARIO:
        return getScenario();
      case RepositoryPackage.CODE_TYPE__SORT:
        return getSort();
      case RepositoryPackage.CODE_TYPE__SUPPORTED:
        return getSupported();
      case RepositoryPackage.CODE_TYPE__UPDATED:
        return getUpdated();
      case RepositoryPackage.CODE_TYPE__UPDATED_EP:
        return getUpdatedEP();
      case RepositoryPackage.CODE_TYPE__VALUE:
        return getValue();
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
      case RepositoryPackage.CODE_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__ABBR_NAME:
        setAbbrName((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__ADDED:
        setAdded((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__ADDED_EP:
        setAddedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__CHANGE_TYPE:
        setChangeType((ChangeTypeT)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__DEPRECATED:
        setDeprecated((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__DEPRECATED_EP:
        setDeprecatedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__GROUP:
        setGroup((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__ID:
        setId((BigInteger)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__ISSUE:
        setIssue((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__LAST_MODIFIED:
        setLastModified((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__NAME:
        setName((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__REPLACED:
        setReplaced((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__REPLACED_BY_FIELD:
        setReplacedByField((BigInteger)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__REPLACED_EP:
        setReplacedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__SCENARIO:
        setScenario((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__SORT:
        setSort((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__SUPPORTED:
        setSupported((SupportType)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__UPDATED:
        setUpdated((String)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__UPDATED_EP:
        setUpdatedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.CODE_TYPE__VALUE:
        setValue((String)newValue);
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
      case RepositoryPackage.CODE_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case RepositoryPackage.CODE_TYPE__ABBR_NAME:
        setAbbrName(ABBR_NAME_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__ADDED:
        setAdded(ADDED_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__ADDED_EP:
        setAddedEP(ADDED_EP_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__CHANGE_TYPE:
        unsetChangeType();
        return;
      case RepositoryPackage.CODE_TYPE__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__DEPRECATED_EP:
        setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__ISSUE:
        setIssue(ISSUE_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__LAST_MODIFIED:
        setLastModified(LAST_MODIFIED_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__REPLACED:
        setReplaced(REPLACED_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__REPLACED_BY_FIELD:
        setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__REPLACED_EP:
        setReplacedEP(REPLACED_EP_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__SCENARIO:
        unsetScenario();
        return;
      case RepositoryPackage.CODE_TYPE__SORT:
        setSort(SORT_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__SUPPORTED:
        unsetSupported();
        return;
      case RepositoryPackage.CODE_TYPE__UPDATED:
        setUpdated(UPDATED_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__UPDATED_EP:
        setUpdatedEP(UPDATED_EP_EDEFAULT);
        return;
      case RepositoryPackage.CODE_TYPE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case RepositoryPackage.CODE_TYPE__ANNOTATION:
        return annotation != null;
      case RepositoryPackage.CODE_TYPE__ABBR_NAME:
        return ABBR_NAME_EDEFAULT == null ? abbrName != null : !ABBR_NAME_EDEFAULT.equals(abbrName);
      case RepositoryPackage.CODE_TYPE__ADDED:
        return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
      case RepositoryPackage.CODE_TYPE__ADDED_EP:
        return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
      case RepositoryPackage.CODE_TYPE__CHANGE_TYPE:
        return isSetChangeType();
      case RepositoryPackage.CODE_TYPE__DEPRECATED:
        return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
      case RepositoryPackage.CODE_TYPE__DEPRECATED_EP:
        return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
      case RepositoryPackage.CODE_TYPE__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
      case RepositoryPackage.CODE_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RepositoryPackage.CODE_TYPE__ISSUE:
        return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
      case RepositoryPackage.CODE_TYPE__LAST_MODIFIED:
        return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
      case RepositoryPackage.CODE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RepositoryPackage.CODE_TYPE__REPLACED:
        return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
      case RepositoryPackage.CODE_TYPE__REPLACED_BY_FIELD:
        return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
      case RepositoryPackage.CODE_TYPE__REPLACED_EP:
        return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
      case RepositoryPackage.CODE_TYPE__SCENARIO:
        return isSetScenario();
      case RepositoryPackage.CODE_TYPE__SORT:
        return SORT_EDEFAULT == null ? sort != null : !SORT_EDEFAULT.equals(sort);
      case RepositoryPackage.CODE_TYPE__SUPPORTED:
        return isSetSupported();
      case RepositoryPackage.CODE_TYPE__UPDATED:
        return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
      case RepositoryPackage.CODE_TYPE__UPDATED_EP:
        return UPDATED_EP_EDEFAULT == null ? updatedEP != null : !UPDATED_EP_EDEFAULT.equals(updatedEP);
      case RepositoryPackage.CODE_TYPE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (abbrName: ");
    result.append(abbrName);
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
    result.append(", group: ");
    result.append(group);
    result.append(", id: ");
    result.append(id);
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
    result.append(", scenario: ");
    if (scenarioESet) result.append(scenario); else result.append("<unset>");
    result.append(", sort: ");
    result.append(sort);
    result.append(", supported: ");
    if (supportedESet) result.append(supported); else result.append("<unset>");
    result.append(", updated: ");
    result.append(updated);
    result.append(", updatedEP: ");
    result.append(updatedEP);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //CodeTypeImpl
