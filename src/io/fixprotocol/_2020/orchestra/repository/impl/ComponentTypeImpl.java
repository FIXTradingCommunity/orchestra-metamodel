/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.Annotation;
import io.fixprotocol._2020.orchestra.repository.ChangeTypeT;
import io.fixprotocol._2020.orchestra.repository.ComponentRefType;
import io.fixprotocol._2020.orchestra.repository.ComponentType;
import io.fixprotocol._2020.orchestra.repository.FieldRefType;
import io.fixprotocol._2020.orchestra.repository.GroupRefType;
import io.fixprotocol._2020.orchestra.repository.MemberType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;
import io.fixprotocol._2020.orchestra.repository.SupportType;

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
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getAbbrName <em>Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getUpdatedEP <em>Updated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl#getWhich <em>Which</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends MinimalEObjectImpl.Container implements ComponentType {
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
   * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected static final String CATEGORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected String category = CATEGORY_EDEFAULT;

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
   * The default value of the '{@link #getRendering() <em>Rendering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRendering()
   * @generated
   * @ordered
   */
  protected static final String RENDERING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRendering() <em>Rendering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRendering()
   * @generated
   * @ordered
   */
  protected String rendering = RENDERING_EDEFAULT;

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
   * The default value of the '{@link #getWhich() <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhich()
   * @generated
   * @ordered
   */
  protected static final MemberType WHICH_EDEFAULT = MemberType.ONE_OF;

  /**
   * The cached value of the '{@link #getWhich() <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhich()
   * @generated
   * @ordered
   */
  protected MemberType which = WHICH_EDEFAULT;

  /**
   * This is true if the Which attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean whichESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getComponentType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, RepositoryPackage.COMPONENT_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentRefType> getComponentRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getComponentType_ComponentRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupRefType> getGroupRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getComponentType_GroupRef());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRefType> getFieldRef() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getComponentType_FieldRef());
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPONENT_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPONENT_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__ABBR_NAME, oldAbbrName, abbrName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__ADDED, oldAdded, added));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__ADDED_EP, oldAddedEP, addedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCategory() {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(String newCategory) {
    String oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__CATEGORY, oldCategory, category));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.COMPONENT_TYPE__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__DEPRECATED, oldDeprecated, deprecated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__ISSUE, oldIssue, issue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRendering() {
    return rendering;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRendering(String newRendering) {
    String oldRendering = rendering;
    rendering = newRendering;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__RENDERING, oldRendering, rendering));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__REPLACED, oldReplaced, replaced));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__REPLACED_EP, oldReplacedEP, replacedEP));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__SCENARIO, oldScenario, scenario, !oldScenarioESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.COMPONENT_TYPE__SCENARIO, oldScenario, SCENARIO_EDEFAULT, oldScenarioESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__SUPPORTED, oldSupported, supported, !oldSupportedESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.COMPONENT_TYPE__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__UPDATED, oldUpdated, updated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__UPDATED_EP, oldUpdatedEP, updatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberType getWhich() {
    return which;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhich(MemberType newWhich) {
    MemberType oldWhich = which;
    which = newWhich == null ? WHICH_EDEFAULT : newWhich;
    boolean oldWhichESet = whichESet;
    whichESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_TYPE__WHICH, oldWhich, which, !oldWhichESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetWhich() {
    MemberType oldWhich = which;
    boolean oldWhichESet = whichESet;
    which = WHICH_EDEFAULT;
    whichESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.COMPONENT_TYPE__WHICH, oldWhich, WHICH_EDEFAULT, oldWhichESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetWhich() {
    return whichESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.COMPONENT_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.COMPONENT_TYPE__COMPONENT_REF:
        return ((InternalEList<?>)getComponentRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.COMPONENT_TYPE__GROUP_REF:
        return ((InternalEList<?>)getGroupRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.COMPONENT_TYPE__FIELD_REF:
        return ((InternalEList<?>)getFieldRef()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.COMPONENT_TYPE__ANNOTATION:
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
      case RepositoryPackage.COMPONENT_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.COMPONENT_TYPE__COMPONENT_REF:
        return getComponentRef();
      case RepositoryPackage.COMPONENT_TYPE__GROUP_REF:
        return getGroupRef();
      case RepositoryPackage.COMPONENT_TYPE__FIELD_REF:
        return getFieldRef();
      case RepositoryPackage.COMPONENT_TYPE__ANNOTATION:
        return getAnnotation();
      case RepositoryPackage.COMPONENT_TYPE__ABBR_NAME:
        return getAbbrName();
      case RepositoryPackage.COMPONENT_TYPE__ADDED:
        return getAdded();
      case RepositoryPackage.COMPONENT_TYPE__ADDED_EP:
        return getAddedEP();
      case RepositoryPackage.COMPONENT_TYPE__CATEGORY:
        return getCategory();
      case RepositoryPackage.COMPONENT_TYPE__CHANGE_TYPE:
        return getChangeType();
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED:
        return getDeprecated();
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED_EP:
        return getDeprecatedEP();
      case RepositoryPackage.COMPONENT_TYPE__ID:
        return getId();
      case RepositoryPackage.COMPONENT_TYPE__ISSUE:
        return getIssue();
      case RepositoryPackage.COMPONENT_TYPE__LAST_MODIFIED:
        return getLastModified();
      case RepositoryPackage.COMPONENT_TYPE__NAME:
        return getName();
      case RepositoryPackage.COMPONENT_TYPE__RENDERING:
        return getRendering();
      case RepositoryPackage.COMPONENT_TYPE__REPLACED:
        return getReplaced();
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_BY_FIELD:
        return getReplacedByField();
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_EP:
        return getReplacedEP();
      case RepositoryPackage.COMPONENT_TYPE__SCENARIO:
        return getScenario();
      case RepositoryPackage.COMPONENT_TYPE__SUPPORTED:
        return getSupported();
      case RepositoryPackage.COMPONENT_TYPE__UPDATED:
        return getUpdated();
      case RepositoryPackage.COMPONENT_TYPE__UPDATED_EP:
        return getUpdatedEP();
      case RepositoryPackage.COMPONENT_TYPE__WHICH:
        return getWhich();
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
      case RepositoryPackage.COMPONENT_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        getComponentRef().addAll((Collection<? extends ComponentRefType>)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__GROUP_REF:
        getGroupRef().clear();
        getGroupRef().addAll((Collection<? extends GroupRefType>)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__FIELD_REF:
        getFieldRef().clear();
        getFieldRef().addAll((Collection<? extends FieldRefType>)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ABBR_NAME:
        setAbbrName((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ADDED:
        setAdded((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ADDED_EP:
        setAddedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__CATEGORY:
        setCategory((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__CHANGE_TYPE:
        setChangeType((ChangeTypeT)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED:
        setDeprecated((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED_EP:
        setDeprecatedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ID:
        setId((BigInteger)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ISSUE:
        setIssue((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__LAST_MODIFIED:
        setLastModified((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__NAME:
        setName((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__RENDERING:
        setRendering((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__REPLACED:
        setReplaced((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_BY_FIELD:
        setReplacedByField((BigInteger)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_EP:
        setReplacedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__SCENARIO:
        setScenario((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__SUPPORTED:
        setSupported((SupportType)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__UPDATED:
        setUpdated((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__UPDATED_EP:
        setUpdatedEP((BigInteger)newValue);
        return;
      case RepositoryPackage.COMPONENT_TYPE__WHICH:
        setWhich((MemberType)newValue);
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
      case RepositoryPackage.COMPONENT_TYPE__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.COMPONENT_TYPE__COMPONENT_REF:
        getComponentRef().clear();
        return;
      case RepositoryPackage.COMPONENT_TYPE__GROUP_REF:
        getGroupRef().clear();
        return;
      case RepositoryPackage.COMPONENT_TYPE__FIELD_REF:
        getFieldRef().clear();
        return;
      case RepositoryPackage.COMPONENT_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ABBR_NAME:
        setAbbrName(ABBR_NAME_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ADDED:
        setAdded(ADDED_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ADDED_EP:
        setAddedEP(ADDED_EP_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__CATEGORY:
        setCategory(CATEGORY_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__CHANGE_TYPE:
        unsetChangeType();
        return;
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED_EP:
        setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__ISSUE:
        setIssue(ISSUE_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__LAST_MODIFIED:
        setLastModified(LAST_MODIFIED_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__RENDERING:
        setRendering(RENDERING_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__REPLACED:
        setReplaced(REPLACED_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_BY_FIELD:
        setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_EP:
        setReplacedEP(REPLACED_EP_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__SCENARIO:
        unsetScenario();
        return;
      case RepositoryPackage.COMPONENT_TYPE__SUPPORTED:
        unsetSupported();
        return;
      case RepositoryPackage.COMPONENT_TYPE__UPDATED:
        setUpdated(UPDATED_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__UPDATED_EP:
        setUpdatedEP(UPDATED_EP_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_TYPE__WHICH:
        unsetWhich();
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
      case RepositoryPackage.COMPONENT_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case RepositoryPackage.COMPONENT_TYPE__COMPONENT_REF:
        return !getComponentRef().isEmpty();
      case RepositoryPackage.COMPONENT_TYPE__GROUP_REF:
        return !getGroupRef().isEmpty();
      case RepositoryPackage.COMPONENT_TYPE__FIELD_REF:
        return !getFieldRef().isEmpty();
      case RepositoryPackage.COMPONENT_TYPE__ANNOTATION:
        return annotation != null;
      case RepositoryPackage.COMPONENT_TYPE__ABBR_NAME:
        return ABBR_NAME_EDEFAULT == null ? abbrName != null : !ABBR_NAME_EDEFAULT.equals(abbrName);
      case RepositoryPackage.COMPONENT_TYPE__ADDED:
        return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
      case RepositoryPackage.COMPONENT_TYPE__ADDED_EP:
        return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
      case RepositoryPackage.COMPONENT_TYPE__CATEGORY:
        return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
      case RepositoryPackage.COMPONENT_TYPE__CHANGE_TYPE:
        return isSetChangeType();
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED:
        return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
      case RepositoryPackage.COMPONENT_TYPE__DEPRECATED_EP:
        return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
      case RepositoryPackage.COMPONENT_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RepositoryPackage.COMPONENT_TYPE__ISSUE:
        return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
      case RepositoryPackage.COMPONENT_TYPE__LAST_MODIFIED:
        return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
      case RepositoryPackage.COMPONENT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RepositoryPackage.COMPONENT_TYPE__RENDERING:
        return RENDERING_EDEFAULT == null ? rendering != null : !RENDERING_EDEFAULT.equals(rendering);
      case RepositoryPackage.COMPONENT_TYPE__REPLACED:
        return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_BY_FIELD:
        return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
      case RepositoryPackage.COMPONENT_TYPE__REPLACED_EP:
        return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
      case RepositoryPackage.COMPONENT_TYPE__SCENARIO:
        return isSetScenario();
      case RepositoryPackage.COMPONENT_TYPE__SUPPORTED:
        return isSetSupported();
      case RepositoryPackage.COMPONENT_TYPE__UPDATED:
        return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
      case RepositoryPackage.COMPONENT_TYPE__UPDATED_EP:
        return UPDATED_EP_EDEFAULT == null ? updatedEP != null : !UPDATED_EP_EDEFAULT.equals(updatedEP);
      case RepositoryPackage.COMPONENT_TYPE__WHICH:
        return isSetWhich();
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
    result.append(", abbrName: ");
    result.append(abbrName);
    result.append(", added: ");
    result.append(added);
    result.append(", addedEP: ");
    result.append(addedEP);
    result.append(", category: ");
    result.append(category);
    result.append(", changeType: ");
    if (changeTypeESet) result.append(changeType); else result.append("<unset>");
    result.append(", deprecated: ");
    result.append(deprecated);
    result.append(", deprecatedEP: ");
    result.append(deprecatedEP);
    result.append(", id: ");
    result.append(id);
    result.append(", issue: ");
    result.append(issue);
    result.append(", lastModified: ");
    result.append(lastModified);
    result.append(", name: ");
    result.append(name);
    result.append(", rendering: ");
    result.append(rendering);
    result.append(", replaced: ");
    result.append(replaced);
    result.append(", replacedByField: ");
    result.append(replacedByField);
    result.append(", replacedEP: ");
    result.append(replacedEP);
    result.append(", scenario: ");
    if (scenarioESet) result.append(scenario); else result.append("<unset>");
    result.append(", supported: ");
    if (supportedESet) result.append(supported); else result.append("<unset>");
    result.append(", updated: ");
    result.append(updated);
    result.append(", updatedEP: ");
    result.append(updatedEP);
    result.append(", which: ");
    if (whichESet) result.append(which); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //ComponentTypeImpl
