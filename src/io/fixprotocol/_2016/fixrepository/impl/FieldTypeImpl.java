/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.ChangeTypeT;
import io.fixprotocol._2016.fixrepository.CodeSetType;
import io.fixprotocol._2016.fixrepository.FieldRuleType;
import io.fixprotocol._2016.fixrepository.FieldType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.PresenceT;
import io.fixprotocol._2016.fixrepository.SupportType;
import io.fixprotocol._2016.fixrepository.UnionDataTypeT;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getAbbrName <em>Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getAddedEP <em>Added EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getBaseCategory <em>Base Category</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getBaseCategoryAbbrName <em>Base Category Abbr Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getDeprecatedEP <em>Deprecated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getDiscriminatorId <em>Discriminator Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getDiscriminatorName <em>Discriminator Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getImplLength <em>Impl Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getImplMaxLength <em>Impl Max Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getImplMinLength <em>Impl Min Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getLengthId <em>Length Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getLengthName <em>Length Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getOid <em>Oid</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getPresence <em>Presence</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getReplaced <em>Replaced</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getReplacedByField <em>Replaced By Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getReplacedEP <em>Replaced EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getSupported <em>Supported</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getUnionDataType <em>Union Data Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getUpdatedEP <em>Updated EP</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldTypeImpl extends MinimalEObjectImpl.Container implements FieldType {
  /**
   * The cached value of the '{@link #getCodeSet() <em>Code Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeSet()
   * @generated
   * @ordered
   */
  protected CodeSetType codeSet;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected EList<FieldRuleType> rule;

  /**
   * The default value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected static final String ASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected String assign = ASSIGN_EDEFAULT;

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
   * The default value of the '{@link #getBaseCategory() <em>Base Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseCategory()
   * @generated
   * @ordered
   */
  protected static final String BASE_CATEGORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseCategory() <em>Base Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseCategory()
   * @generated
   * @ordered
   */
  protected String baseCategory = BASE_CATEGORY_EDEFAULT;

  /**
   * The default value of the '{@link #getBaseCategoryAbbrName() <em>Base Category Abbr Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseCategoryAbbrName()
   * @generated
   * @ordered
   */
  protected static final String BASE_CATEGORY_ABBR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseCategoryAbbrName() <em>Base Category Abbr Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseCategoryAbbrName()
   * @generated
   * @ordered
   */
  protected String baseCategoryAbbrName = BASE_CATEGORY_ABBR_NAME_EDEFAULT;

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
   * The default value of the '{@link #getDiscriminatorId() <em>Discriminator Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminatorId()
   * @generated
   * @ordered
   */
  protected static final BigInteger DISCRIMINATOR_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiscriminatorId() <em>Discriminator Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminatorId()
   * @generated
   * @ordered
   */
  protected BigInteger discriminatorId = DISCRIMINATOR_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDiscriminatorName() <em>Discriminator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminatorName()
   * @generated
   * @ordered
   */
  protected static final String DISCRIMINATOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiscriminatorName() <em>Discriminator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminatorName()
   * @generated
   * @ordered
   */
  protected String discriminatorName = DISCRIMINATOR_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncoding()
   * @generated
   * @ordered
   */
  protected static final String ENCODING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncoding()
   * @generated
   * @ordered
   */
  protected String encoding = ENCODING_EDEFAULT;

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
   * The default value of the '{@link #getImplLength() <em>Impl Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplLength()
   * @generated
   * @ordered
   */
  protected static final short IMPL_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getImplLength() <em>Impl Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplLength()
   * @generated
   * @ordered
   */
  protected short implLength = IMPL_LENGTH_EDEFAULT;

  /**
   * This is true if the Impl Length attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean implLengthESet;

  /**
   * The default value of the '{@link #getImplMaxLength() <em>Impl Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMaxLength()
   * @generated
   * @ordered
   */
  protected static final short IMPL_MAX_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getImplMaxLength() <em>Impl Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMaxLength()
   * @generated
   * @ordered
   */
  protected short implMaxLength = IMPL_MAX_LENGTH_EDEFAULT;

  /**
   * This is true if the Impl Max Length attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean implMaxLengthESet;

  /**
   * The default value of the '{@link #getImplMinLength() <em>Impl Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMinLength()
   * @generated
   * @ordered
   */
  protected static final short IMPL_MIN_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getImplMinLength() <em>Impl Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMinLength()
   * @generated
   * @ordered
   */
  protected short implMinLength = IMPL_MIN_LENGTH_EDEFAULT;

  /**
   * This is true if the Impl Min Length attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean implMinLengthESet;

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
   * The default value of the '{@link #getLengthId() <em>Length Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLengthId()
   * @generated
   * @ordered
   */
  protected static final BigInteger LENGTH_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLengthId() <em>Length Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLengthId()
   * @generated
   * @ordered
   */
  protected BigInteger lengthId = LENGTH_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLengthName() <em>Length Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLengthName()
   * @generated
   * @ordered
   */
  protected static final String LENGTH_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLengthName() <em>Length Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLengthName()
   * @generated
   * @ordered
   */
  protected String lengthName = LENGTH_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
  protected static final String MAX_INCLUSIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
  protected String maxInclusive = MAX_INCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
  protected static final String MIN_INCLUSIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
  protected String minInclusive = MIN_INCLUSIVE_EDEFAULT;

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
   * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOid()
   * @generated
   * @ordered
   */
  protected static final String OID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOid()
   * @generated
   * @ordered
   */
  protected String oid = OID_EDEFAULT;

  /**
   * The default value of the '{@link #getPresence() <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresence()
   * @generated
   * @ordered
   */
  protected static final PresenceT PRESENCE_EDEFAULT = PresenceT.OPTIONAL;

  /**
   * The cached value of the '{@link #getPresence() <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresence()
   * @generated
   * @ordered
   */
  protected PresenceT presence = PRESENCE_EDEFAULT;

  /**
   * This is true if the Presence attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean presenceESet;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getUnionDataType() <em>Union Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnionDataType()
   * @generated
   * @ordered
   */
  protected static final UnionDataTypeT UNION_DATA_TYPE_EDEFAULT = UnionDataTypeT.QTY;

  /**
   * The cached value of the '{@link #getUnionDataType() <em>Union Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnionDataType()
   * @generated
   * @ordered
   */
  protected UnionDataTypeT unionDataType = UNION_DATA_TYPE_EDEFAULT;

  /**
   * This is true if the Union Data Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean unionDataTypeESet;

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
  protected FieldTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getFieldType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeSetType getCodeSet() {
    return codeSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeSet(CodeSetType newCodeSet, NotificationChain msgs) {
    CodeSetType oldCodeSet = codeSet;
    codeSet = newCodeSet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__CODE_SET, oldCodeSet, newCodeSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeSet(CodeSetType newCodeSet) {
    if (newCodeSet != codeSet) {
      NotificationChain msgs = null;
      if (codeSet != null)
        msgs = ((InternalEObject)codeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.FIELD_TYPE__CODE_SET, null, msgs);
      if (newCodeSet != null)
        msgs = ((InternalEObject)newCodeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.FIELD_TYPE__CODE_SET, null, msgs);
      msgs = basicSetCodeSet(newCodeSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__CODE_SET, newCodeSet, newCodeSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldRuleType> getRule() {
    if (rule == null) {
      rule = new EObjectContainmentEList<FieldRuleType>(FieldRuleType.class, this, FixrepositoryPackage.FIELD_TYPE__RULE);
    }
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssign() {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssign(String newAssign) {
    String oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ASSIGN, oldAssign, assign));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.FIELD_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.FIELD_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ABBR_NAME, oldAbbrName, abbrName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ADDED, oldAdded, added));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ADDED_EP, oldAddedEP, addedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseCategory() {
    return baseCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseCategory(String newBaseCategory) {
    String oldBaseCategory = baseCategory;
    baseCategory = newBaseCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY, oldBaseCategory, baseCategory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseCategoryAbbrName() {
    return baseCategoryAbbrName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseCategoryAbbrName(String newBaseCategoryAbbrName) {
    String oldBaseCategoryAbbrName = baseCategoryAbbrName;
    baseCategoryAbbrName = newBaseCategoryAbbrName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY_ABBR_NAME, oldBaseCategoryAbbrName, baseCategoryAbbrName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_TYPE__CHANGE_TYPE, oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__DEPRECATED, oldDeprecated, deprecated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__DEPRECATED_EP, oldDeprecatedEP, deprecatedEP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getDiscriminatorId() {
    return discriminatorId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminatorId(BigInteger newDiscriminatorId) {
    BigInteger oldDiscriminatorId = discriminatorId;
    discriminatorId = newDiscriminatorId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_ID, oldDiscriminatorId, discriminatorId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDiscriminatorName() {
    return discriminatorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminatorName(String newDiscriminatorName) {
    String oldDiscriminatorName = discriminatorName;
    discriminatorName = newDiscriminatorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_NAME, oldDiscriminatorName, discriminatorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEncoding() {
    return encoding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEncoding(String newEncoding) {
    String oldEncoding = encoding;
    encoding = newEncoding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ENCODING, oldEncoding, encoding));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public short getImplLength() {
    return implLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplLength(short newImplLength) {
    short oldImplLength = implLength;
    implLength = newImplLength;
    boolean oldImplLengthESet = implLengthESet;
    implLengthESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__IMPL_LENGTH, oldImplLength, implLength, !oldImplLengthESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetImplLength() {
    short oldImplLength = implLength;
    boolean oldImplLengthESet = implLengthESet;
    implLength = IMPL_LENGTH_EDEFAULT;
    implLengthESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_TYPE__IMPL_LENGTH, oldImplLength, IMPL_LENGTH_EDEFAULT, oldImplLengthESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetImplLength() {
    return implLengthESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public short getImplMaxLength() {
    return implMaxLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplMaxLength(short newImplMaxLength) {
    short oldImplMaxLength = implMaxLength;
    implMaxLength = newImplMaxLength;
    boolean oldImplMaxLengthESet = implMaxLengthESet;
    implMaxLengthESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__IMPL_MAX_LENGTH, oldImplMaxLength, implMaxLength, !oldImplMaxLengthESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetImplMaxLength() {
    short oldImplMaxLength = implMaxLength;
    boolean oldImplMaxLengthESet = implMaxLengthESet;
    implMaxLength = IMPL_MAX_LENGTH_EDEFAULT;
    implMaxLengthESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_TYPE__IMPL_MAX_LENGTH, oldImplMaxLength, IMPL_MAX_LENGTH_EDEFAULT, oldImplMaxLengthESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetImplMaxLength() {
    return implMaxLengthESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public short getImplMinLength() {
    return implMinLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplMinLength(short newImplMinLength) {
    short oldImplMinLength = implMinLength;
    implMinLength = newImplMinLength;
    boolean oldImplMinLengthESet = implMinLengthESet;
    implMinLengthESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__IMPL_MIN_LENGTH, oldImplMinLength, implMinLength, !oldImplMinLengthESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetImplMinLength() {
    short oldImplMinLength = implMinLength;
    boolean oldImplMinLengthESet = implMinLengthESet;
    implMinLength = IMPL_MIN_LENGTH_EDEFAULT;
    implMinLengthESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_TYPE__IMPL_MIN_LENGTH, oldImplMinLength, IMPL_MIN_LENGTH_EDEFAULT, oldImplMinLengthESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetImplMinLength() {
    return implMinLengthESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__ISSUE, oldIssue, issue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__LAST_MODIFIED, oldLastModified, lastModified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getLengthId() {
    return lengthId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLengthId(BigInteger newLengthId) {
    BigInteger oldLengthId = lengthId;
    lengthId = newLengthId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__LENGTH_ID, oldLengthId, lengthId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLengthName() {
    return lengthName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLengthName(String newLengthName) {
    String oldLengthName = lengthName;
    lengthName = newLengthName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__LENGTH_NAME, oldLengthName, lengthName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaxInclusive() {
    return maxInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxInclusive(String newMaxInclusive) {
    String oldMaxInclusive = maxInclusive;
    maxInclusive = newMaxInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinInclusive() {
    return minInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinInclusive(String newMinInclusive) {
    String oldMinInclusive = minInclusive;
    minInclusive = newMinInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOid() {
    return oid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOid(String newOid) {
    String oldOid = oid;
    oid = newOid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__OID, oldOid, oid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresenceT getPresence() {
    return presence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPresence(PresenceT newPresence) {
    PresenceT oldPresence = presence;
    presence = newPresence == null ? PRESENCE_EDEFAULT : newPresence;
    boolean oldPresenceESet = presenceESet;
    presenceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__PRESENCE, oldPresence, presence, !oldPresenceESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetPresence() {
    PresenceT oldPresence = presence;
    boolean oldPresenceESet = presenceESet;
    presence = PRESENCE_EDEFAULT;
    presenceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_TYPE__PRESENCE, oldPresence, PRESENCE_EDEFAULT, oldPresenceESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPresence() {
    return presenceESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__RENDERING, oldRendering, rendering));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__REPLACED, oldReplaced, replaced));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__REPLACED_BY_FIELD, oldReplacedByField, replacedByField));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__REPLACED_EP, oldReplacedEP, replacedEP));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__SUPPORTED, oldSupported, supported, !oldSupportedESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_TYPE__SUPPORTED, oldSupported, SUPPORTED_EDEFAULT, oldSupportedESet));
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
  public String getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionDataTypeT getUnionDataType() {
    return unionDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnionDataType(UnionDataTypeT newUnionDataType) {
    UnionDataTypeT oldUnionDataType = unionDataType;
    unionDataType = newUnionDataType == null ? UNION_DATA_TYPE_EDEFAULT : newUnionDataType;
    boolean oldUnionDataTypeESet = unionDataTypeESet;
    unionDataTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__UNION_DATA_TYPE, oldUnionDataType, unionDataType, !oldUnionDataTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetUnionDataType() {
    UnionDataTypeT oldUnionDataType = unionDataType;
    boolean oldUnionDataTypeESet = unionDataTypeESet;
    unionDataType = UNION_DATA_TYPE_EDEFAULT;
    unionDataTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_TYPE__UNION_DATA_TYPE, oldUnionDataType, UNION_DATA_TYPE_EDEFAULT, oldUnionDataTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetUnionDataType() {
    return unionDataTypeESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__UPDATED, oldUpdated, updated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__UPDATED_EP, oldUpdatedEP, updatedEP));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_TYPE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.FIELD_TYPE__CODE_SET:
        return basicSetCodeSet(null, msgs);
      case FixrepositoryPackage.FIELD_TYPE__RULE:
        return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.FIELD_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.FIELD_TYPE__CODE_SET:
        return getCodeSet();
      case FixrepositoryPackage.FIELD_TYPE__RULE:
        return getRule();
      case FixrepositoryPackage.FIELD_TYPE__ASSIGN:
        return getAssign();
      case FixrepositoryPackage.FIELD_TYPE__ANNOTATION:
        return getAnnotation();
      case FixrepositoryPackage.FIELD_TYPE__ABBR_NAME:
        return getAbbrName();
      case FixrepositoryPackage.FIELD_TYPE__ADDED:
        return getAdded();
      case FixrepositoryPackage.FIELD_TYPE__ADDED_EP:
        return getAddedEP();
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY:
        return getBaseCategory();
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY_ABBR_NAME:
        return getBaseCategoryAbbrName();
      case FixrepositoryPackage.FIELD_TYPE__CHANGE_TYPE:
        return getChangeType();
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED:
        return getDeprecated();
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED_EP:
        return getDeprecatedEP();
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_ID:
        return getDiscriminatorId();
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_NAME:
        return getDiscriminatorName();
      case FixrepositoryPackage.FIELD_TYPE__ENCODING:
        return getEncoding();
      case FixrepositoryPackage.FIELD_TYPE__ID:
        return getId();
      case FixrepositoryPackage.FIELD_TYPE__IMPL_LENGTH:
        return getImplLength();
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MAX_LENGTH:
        return getImplMaxLength();
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MIN_LENGTH:
        return getImplMinLength();
      case FixrepositoryPackage.FIELD_TYPE__ISSUE:
        return getIssue();
      case FixrepositoryPackage.FIELD_TYPE__LAST_MODIFIED:
        return getLastModified();
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_ID:
        return getLengthId();
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_NAME:
        return getLengthName();
      case FixrepositoryPackage.FIELD_TYPE__MAX_INCLUSIVE:
        return getMaxInclusive();
      case FixrepositoryPackage.FIELD_TYPE__MIN_INCLUSIVE:
        return getMinInclusive();
      case FixrepositoryPackage.FIELD_TYPE__NAME:
        return getName();
      case FixrepositoryPackage.FIELD_TYPE__OID:
        return getOid();
      case FixrepositoryPackage.FIELD_TYPE__PRESENCE:
        return getPresence();
      case FixrepositoryPackage.FIELD_TYPE__RENDERING:
        return getRendering();
      case FixrepositoryPackage.FIELD_TYPE__REPLACED:
        return getReplaced();
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_BY_FIELD:
        return getReplacedByField();
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_EP:
        return getReplacedEP();
      case FixrepositoryPackage.FIELD_TYPE__SUPPORTED:
        return getSupported();
      case FixrepositoryPackage.FIELD_TYPE__TYPE:
        return getType();
      case FixrepositoryPackage.FIELD_TYPE__UNION_DATA_TYPE:
        return getUnionDataType();
      case FixrepositoryPackage.FIELD_TYPE__UPDATED:
        return getUpdated();
      case FixrepositoryPackage.FIELD_TYPE__UPDATED_EP:
        return getUpdatedEP();
      case FixrepositoryPackage.FIELD_TYPE__VALUE:
        return getValue();
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
      case FixrepositoryPackage.FIELD_TYPE__CODE_SET:
        setCodeSet((CodeSetType)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__RULE:
        getRule().clear();
        getRule().addAll((Collection<? extends FieldRuleType>)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ASSIGN:
        setAssign((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ABBR_NAME:
        setAbbrName((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ADDED:
        setAdded((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ADDED_EP:
        setAddedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY:
        setBaseCategory((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY_ABBR_NAME:
        setBaseCategoryAbbrName((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__CHANGE_TYPE:
        setChangeType((ChangeTypeT)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED:
        setDeprecated((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED_EP:
        setDeprecatedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_ID:
        setDiscriminatorId((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_NAME:
        setDiscriminatorName((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ENCODING:
        setEncoding((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ID:
        setId((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__IMPL_LENGTH:
        setImplLength((Short)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MAX_LENGTH:
        setImplMaxLength((Short)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MIN_LENGTH:
        setImplMinLength((Short)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ISSUE:
        setIssue((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__LAST_MODIFIED:
        setLastModified((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_ID:
        setLengthId((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_NAME:
        setLengthName((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__MAX_INCLUSIVE:
        setMaxInclusive((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__MIN_INCLUSIVE:
        setMinInclusive((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__NAME:
        setName((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__OID:
        setOid((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__PRESENCE:
        setPresence((PresenceT)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__RENDERING:
        setRendering((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__REPLACED:
        setReplaced((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_BY_FIELD:
        setReplacedByField((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_EP:
        setReplacedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__SUPPORTED:
        setSupported((SupportType)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__TYPE:
        setType((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__UNION_DATA_TYPE:
        setUnionDataType((UnionDataTypeT)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__UPDATED:
        setUpdated((String)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__UPDATED_EP:
        setUpdatedEP((BigInteger)newValue);
        return;
      case FixrepositoryPackage.FIELD_TYPE__VALUE:
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
      case FixrepositoryPackage.FIELD_TYPE__CODE_SET:
        setCodeSet((CodeSetType)null);
        return;
      case FixrepositoryPackage.FIELD_TYPE__RULE:
        getRule().clear();
        return;
      case FixrepositoryPackage.FIELD_TYPE__ASSIGN:
        setAssign(ASSIGN_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ABBR_NAME:
        setAbbrName(ABBR_NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ADDED:
        setAdded(ADDED_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ADDED_EP:
        setAddedEP(ADDED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY:
        setBaseCategory(BASE_CATEGORY_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY_ABBR_NAME:
        setBaseCategoryAbbrName(BASE_CATEGORY_ABBR_NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__CHANGE_TYPE:
        unsetChangeType();
        return;
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED_EP:
        setDeprecatedEP(DEPRECATED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_ID:
        setDiscriminatorId(DISCRIMINATOR_ID_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_NAME:
        setDiscriminatorName(DISCRIMINATOR_NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ENCODING:
        setEncoding(ENCODING_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__IMPL_LENGTH:
        unsetImplLength();
        return;
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MAX_LENGTH:
        unsetImplMaxLength();
        return;
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MIN_LENGTH:
        unsetImplMinLength();
        return;
      case FixrepositoryPackage.FIELD_TYPE__ISSUE:
        setIssue(ISSUE_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__LAST_MODIFIED:
        setLastModified(LAST_MODIFIED_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_ID:
        setLengthId(LENGTH_ID_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_NAME:
        setLengthName(LENGTH_NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__MAX_INCLUSIVE:
        setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__MIN_INCLUSIVE:
        setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__OID:
        setOid(OID_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__PRESENCE:
        unsetPresence();
        return;
      case FixrepositoryPackage.FIELD_TYPE__RENDERING:
        setRendering(RENDERING_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__REPLACED:
        setReplaced(REPLACED_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_BY_FIELD:
        setReplacedByField(REPLACED_BY_FIELD_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_EP:
        setReplacedEP(REPLACED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__SUPPORTED:
        unsetSupported();
        return;
      case FixrepositoryPackage.FIELD_TYPE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__UNION_DATA_TYPE:
        unsetUnionDataType();
        return;
      case FixrepositoryPackage.FIELD_TYPE__UPDATED:
        setUpdated(UPDATED_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__UPDATED_EP:
        setUpdatedEP(UPDATED_EP_EDEFAULT);
        return;
      case FixrepositoryPackage.FIELD_TYPE__VALUE:
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
      case FixrepositoryPackage.FIELD_TYPE__CODE_SET:
        return codeSet != null;
      case FixrepositoryPackage.FIELD_TYPE__RULE:
        return rule != null && !rule.isEmpty();
      case FixrepositoryPackage.FIELD_TYPE__ASSIGN:
        return ASSIGN_EDEFAULT == null ? assign != null : !ASSIGN_EDEFAULT.equals(assign);
      case FixrepositoryPackage.FIELD_TYPE__ANNOTATION:
        return annotation != null;
      case FixrepositoryPackage.FIELD_TYPE__ABBR_NAME:
        return ABBR_NAME_EDEFAULT == null ? abbrName != null : !ABBR_NAME_EDEFAULT.equals(abbrName);
      case FixrepositoryPackage.FIELD_TYPE__ADDED:
        return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
      case FixrepositoryPackage.FIELD_TYPE__ADDED_EP:
        return ADDED_EP_EDEFAULT == null ? addedEP != null : !ADDED_EP_EDEFAULT.equals(addedEP);
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY:
        return BASE_CATEGORY_EDEFAULT == null ? baseCategory != null : !BASE_CATEGORY_EDEFAULT.equals(baseCategory);
      case FixrepositoryPackage.FIELD_TYPE__BASE_CATEGORY_ABBR_NAME:
        return BASE_CATEGORY_ABBR_NAME_EDEFAULT == null ? baseCategoryAbbrName != null : !BASE_CATEGORY_ABBR_NAME_EDEFAULT.equals(baseCategoryAbbrName);
      case FixrepositoryPackage.FIELD_TYPE__CHANGE_TYPE:
        return isSetChangeType();
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED:
        return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
      case FixrepositoryPackage.FIELD_TYPE__DEPRECATED_EP:
        return DEPRECATED_EP_EDEFAULT == null ? deprecatedEP != null : !DEPRECATED_EP_EDEFAULT.equals(deprecatedEP);
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_ID:
        return DISCRIMINATOR_ID_EDEFAULT == null ? discriminatorId != null : !DISCRIMINATOR_ID_EDEFAULT.equals(discriminatorId);
      case FixrepositoryPackage.FIELD_TYPE__DISCRIMINATOR_NAME:
        return DISCRIMINATOR_NAME_EDEFAULT == null ? discriminatorName != null : !DISCRIMINATOR_NAME_EDEFAULT.equals(discriminatorName);
      case FixrepositoryPackage.FIELD_TYPE__ENCODING:
        return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
      case FixrepositoryPackage.FIELD_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case FixrepositoryPackage.FIELD_TYPE__IMPL_LENGTH:
        return isSetImplLength();
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MAX_LENGTH:
        return isSetImplMaxLength();
      case FixrepositoryPackage.FIELD_TYPE__IMPL_MIN_LENGTH:
        return isSetImplMinLength();
      case FixrepositoryPackage.FIELD_TYPE__ISSUE:
        return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
      case FixrepositoryPackage.FIELD_TYPE__LAST_MODIFIED:
        return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_ID:
        return LENGTH_ID_EDEFAULT == null ? lengthId != null : !LENGTH_ID_EDEFAULT.equals(lengthId);
      case FixrepositoryPackage.FIELD_TYPE__LENGTH_NAME:
        return LENGTH_NAME_EDEFAULT == null ? lengthName != null : !LENGTH_NAME_EDEFAULT.equals(lengthName);
      case FixrepositoryPackage.FIELD_TYPE__MAX_INCLUSIVE:
        return MAX_INCLUSIVE_EDEFAULT == null ? maxInclusive != null : !MAX_INCLUSIVE_EDEFAULT.equals(maxInclusive);
      case FixrepositoryPackage.FIELD_TYPE__MIN_INCLUSIVE:
        return MIN_INCLUSIVE_EDEFAULT == null ? minInclusive != null : !MIN_INCLUSIVE_EDEFAULT.equals(minInclusive);
      case FixrepositoryPackage.FIELD_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FixrepositoryPackage.FIELD_TYPE__OID:
        return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT.equals(oid);
      case FixrepositoryPackage.FIELD_TYPE__PRESENCE:
        return isSetPresence();
      case FixrepositoryPackage.FIELD_TYPE__RENDERING:
        return RENDERING_EDEFAULT == null ? rendering != null : !RENDERING_EDEFAULT.equals(rendering);
      case FixrepositoryPackage.FIELD_TYPE__REPLACED:
        return REPLACED_EDEFAULT == null ? replaced != null : !REPLACED_EDEFAULT.equals(replaced);
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_BY_FIELD:
        return REPLACED_BY_FIELD_EDEFAULT == null ? replacedByField != null : !REPLACED_BY_FIELD_EDEFAULT.equals(replacedByField);
      case FixrepositoryPackage.FIELD_TYPE__REPLACED_EP:
        return REPLACED_EP_EDEFAULT == null ? replacedEP != null : !REPLACED_EP_EDEFAULT.equals(replacedEP);
      case FixrepositoryPackage.FIELD_TYPE__SUPPORTED:
        return isSetSupported();
      case FixrepositoryPackage.FIELD_TYPE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case FixrepositoryPackage.FIELD_TYPE__UNION_DATA_TYPE:
        return isSetUnionDataType();
      case FixrepositoryPackage.FIELD_TYPE__UPDATED:
        return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
      case FixrepositoryPackage.FIELD_TYPE__UPDATED_EP:
        return UPDATED_EP_EDEFAULT == null ? updatedEP != null : !UPDATED_EP_EDEFAULT.equals(updatedEP);
      case FixrepositoryPackage.FIELD_TYPE__VALUE:
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (assign: ");
    result.append(assign);
    result.append(", abbrName: ");
    result.append(abbrName);
    result.append(", added: ");
    result.append(added);
    result.append(", addedEP: ");
    result.append(addedEP);
    result.append(", baseCategory: ");
    result.append(baseCategory);
    result.append(", baseCategoryAbbrName: ");
    result.append(baseCategoryAbbrName);
    result.append(", changeType: ");
    if (changeTypeESet) result.append(changeType); else result.append("<unset>");
    result.append(", deprecated: ");
    result.append(deprecated);
    result.append(", deprecatedEP: ");
    result.append(deprecatedEP);
    result.append(", discriminatorId: ");
    result.append(discriminatorId);
    result.append(", discriminatorName: ");
    result.append(discriminatorName);
    result.append(", encoding: ");
    result.append(encoding);
    result.append(", id: ");
    result.append(id);
    result.append(", implLength: ");
    if (implLengthESet) result.append(implLength); else result.append("<unset>");
    result.append(", implMaxLength: ");
    if (implMaxLengthESet) result.append(implMaxLength); else result.append("<unset>");
    result.append(", implMinLength: ");
    if (implMinLengthESet) result.append(implMinLength); else result.append("<unset>");
    result.append(", issue: ");
    result.append(issue);
    result.append(", lastModified: ");
    result.append(lastModified);
    result.append(", lengthId: ");
    result.append(lengthId);
    result.append(", lengthName: ");
    result.append(lengthName);
    result.append(", maxInclusive: ");
    result.append(maxInclusive);
    result.append(", minInclusive: ");
    result.append(minInclusive);
    result.append(", name: ");
    result.append(name);
    result.append(", oid: ");
    result.append(oid);
    result.append(", presence: ");
    if (presenceESet) result.append(presence); else result.append("<unset>");
    result.append(", rendering: ");
    result.append(rendering);
    result.append(", replaced: ");
    result.append(replaced);
    result.append(", replacedByField: ");
    result.append(replacedByField);
    result.append(", replacedEP: ");
    result.append(replacedEP);
    result.append(", supported: ");
    if (supportedESet) result.append(supported); else result.append("<unset>");
    result.append(", type: ");
    result.append(type);
    result.append(", unionDataType: ");
    if (unionDataTypeESet) result.append(unionDataType); else result.append("<unset>");
    result.append(", updated: ");
    result.append(updated);
    result.append(", updatedEP: ");
    result.append(updatedEP);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //FieldTypeImpl