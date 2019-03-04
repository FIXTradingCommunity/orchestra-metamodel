/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.FieldRuleType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.PresenceT;
import io.fixprotocol._2016.fixrepository.UniqueType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getWhen <em>When</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getImplLength <em>Impl Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getImplMaxLength <em>Impl Max Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getImplMinLength <em>Impl Min Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getPresence <em>Presence</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldRuleTypeImpl extends MinimalEObjectImpl.Container implements FieldRuleType {
  /**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
  protected UniqueType unique;

  /**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
  protected EList<String> assign;

  /**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
  protected static final String WHEN_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
  protected String when = WHEN_EDEFAULT;

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
  protected FieldRuleTypeImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getFieldRuleType();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public UniqueType getUnique() {
		return unique;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetUnique(UniqueType newUnique, NotificationChain msgs) {
		UniqueType oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE, oldUnique, newUnique);
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
		public void setUnique(UniqueType newUnique) {
		if (newUnique != unique) {
			NotificationChain msgs = null;
			if (unique != null)
				msgs = ((InternalEObject)unique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE, null, msgs);
			if (newUnique != null)
				msgs = ((InternalEObject)newUnique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE, null, msgs);
			msgs = basicSetUnique(newUnique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE, newUnique, newUnique));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<String> getAssign() {
		if (assign == null) {
			assign = new EDataTypeEList<String>(String.class, this, FixrepositoryPackage.FIELD_RULE_TYPE__ASSIGN);
		}
		return assign;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getWhen() {
		return when;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setWhen(String newWhen) {
		String oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__WHEN, oldWhen, when));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getEncoding() {
		return encoding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__ENCODING, oldEncoding, encoding));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public short getImplLength() {
		return implLength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setImplLength(short newImplLength) {
		short oldImplLength = implLength;
		implLength = newImplLength;
		boolean oldImplLengthESet = implLengthESet;
		implLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_LENGTH, oldImplLength, implLength, !oldImplLengthESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetImplLength() {
		short oldImplLength = implLength;
		boolean oldImplLengthESet = implLengthESet;
		implLength = IMPL_LENGTH_EDEFAULT;
		implLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_LENGTH, oldImplLength, IMPL_LENGTH_EDEFAULT, oldImplLengthESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetImplLength() {
		return implLengthESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public short getImplMaxLength() {
		return implMaxLength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setImplMaxLength(short newImplMaxLength) {
		short oldImplMaxLength = implMaxLength;
		implMaxLength = newImplMaxLength;
		boolean oldImplMaxLengthESet = implMaxLengthESet;
		implMaxLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MAX_LENGTH, oldImplMaxLength, implMaxLength, !oldImplMaxLengthESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetImplMaxLength() {
		short oldImplMaxLength = implMaxLength;
		boolean oldImplMaxLengthESet = implMaxLengthESet;
		implMaxLength = IMPL_MAX_LENGTH_EDEFAULT;
		implMaxLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MAX_LENGTH, oldImplMaxLength, IMPL_MAX_LENGTH_EDEFAULT, oldImplMaxLengthESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetImplMaxLength() {
		return implMaxLengthESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public short getImplMinLength() {
		return implMinLength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setImplMinLength(short newImplMinLength) {
		short oldImplMinLength = implMinLength;
		implMinLength = newImplMinLength;
		boolean oldImplMinLengthESet = implMinLengthESet;
		implMinLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MIN_LENGTH, oldImplMinLength, implMinLength, !oldImplMinLengthESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetImplMinLength() {
		short oldImplMinLength = implMinLength;
		boolean oldImplMinLengthESet = implMinLengthESet;
		implMinLength = IMPL_MIN_LENGTH_EDEFAULT;
		implMinLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MIN_LENGTH, oldImplMinLength, IMPL_MIN_LENGTH_EDEFAULT, oldImplMinLengthESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetImplMinLength() {
		return implMinLengthESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getMaxInclusive() {
		return maxInclusive;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setMaxInclusive(String newMaxInclusive) {
		String oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getMinInclusive() {
		return minInclusive;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setMinInclusive(String newMinInclusive) {
		String oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PresenceT getPresence() {
		return presence;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setPresence(PresenceT newPresence) {
		PresenceT oldPresence = presence;
		presence = newPresence == null ? PRESENCE_EDEFAULT : newPresence;
		boolean oldPresenceESet = presenceESet;
		presenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__PRESENCE, oldPresence, presence, !oldPresenceESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void unsetPresence() {
		PresenceT oldPresence = presence;
		boolean oldPresenceESet = presenceESet;
		presence = PRESENCE_EDEFAULT;
		presenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.FIELD_RULE_TYPE__PRESENCE, oldPresence, PRESENCE_EDEFAULT, oldPresenceESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public boolean isSetPresence() {
		return presenceESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getRendering() {
		return rendering;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setRendering(String newRendering) {
		String oldRendering = rendering;
		rendering = newRendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__RENDERING, oldRendering, rendering));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getType() {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getValue() {
		return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.FIELD_RULE_TYPE__VALUE, oldValue, value));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE:
				return basicSetUnique(null, msgs);
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
			case FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE:
				return getUnique();
			case FixrepositoryPackage.FIELD_RULE_TYPE__ASSIGN:
				return getAssign();
			case FixrepositoryPackage.FIELD_RULE_TYPE__WHEN:
				return getWhen();
			case FixrepositoryPackage.FIELD_RULE_TYPE__ENCODING:
				return getEncoding();
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_LENGTH:
				return getImplLength();
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MAX_LENGTH:
				return getImplMaxLength();
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MIN_LENGTH:
				return getImplMinLength();
			case FixrepositoryPackage.FIELD_RULE_TYPE__MAX_INCLUSIVE:
				return getMaxInclusive();
			case FixrepositoryPackage.FIELD_RULE_TYPE__MIN_INCLUSIVE:
				return getMinInclusive();
			case FixrepositoryPackage.FIELD_RULE_TYPE__NAME:
				return getName();
			case FixrepositoryPackage.FIELD_RULE_TYPE__PRESENCE:
				return getPresence();
			case FixrepositoryPackage.FIELD_RULE_TYPE__RENDERING:
				return getRendering();
			case FixrepositoryPackage.FIELD_RULE_TYPE__TYPE:
				return getType();
			case FixrepositoryPackage.FIELD_RULE_TYPE__VALUE:
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
			case FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE:
				setUnique((UniqueType)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__ASSIGN:
				getAssign().clear();
				getAssign().addAll((Collection<? extends String>)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__WHEN:
				setWhen((String)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_LENGTH:
				setImplLength((Short)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MAX_LENGTH:
				setImplMaxLength((Short)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MIN_LENGTH:
				setImplMinLength((Short)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__MAX_INCLUSIVE:
				setMaxInclusive((String)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__MIN_INCLUSIVE:
				setMinInclusive((String)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__NAME:
				setName((String)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__PRESENCE:
				setPresence((PresenceT)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__RENDERING:
				setRendering((String)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__TYPE:
				setType((String)newValue);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__VALUE:
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
			case FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE:
				setUnique((UniqueType)null);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__ASSIGN:
				getAssign().clear();
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_LENGTH:
				unsetImplLength();
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MAX_LENGTH:
				unsetImplMaxLength();
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MIN_LENGTH:
				unsetImplMinLength();
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__MAX_INCLUSIVE:
				setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__MIN_INCLUSIVE:
				setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__PRESENCE:
				unsetPresence();
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__RENDERING:
				setRendering(RENDERING_EDEFAULT);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FixrepositoryPackage.FIELD_RULE_TYPE__VALUE:
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
			case FixrepositoryPackage.FIELD_RULE_TYPE__UNIQUE:
				return unique != null;
			case FixrepositoryPackage.FIELD_RULE_TYPE__ASSIGN:
				return assign != null && !assign.isEmpty();
			case FixrepositoryPackage.FIELD_RULE_TYPE__WHEN:
				return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
			case FixrepositoryPackage.FIELD_RULE_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_LENGTH:
				return isSetImplLength();
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MAX_LENGTH:
				return isSetImplMaxLength();
			case FixrepositoryPackage.FIELD_RULE_TYPE__IMPL_MIN_LENGTH:
				return isSetImplMinLength();
			case FixrepositoryPackage.FIELD_RULE_TYPE__MAX_INCLUSIVE:
				return MAX_INCLUSIVE_EDEFAULT == null ? maxInclusive != null : !MAX_INCLUSIVE_EDEFAULT.equals(maxInclusive);
			case FixrepositoryPackage.FIELD_RULE_TYPE__MIN_INCLUSIVE:
				return MIN_INCLUSIVE_EDEFAULT == null ? minInclusive != null : !MIN_INCLUSIVE_EDEFAULT.equals(minInclusive);
			case FixrepositoryPackage.FIELD_RULE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FixrepositoryPackage.FIELD_RULE_TYPE__PRESENCE:
				return isSetPresence();
			case FixrepositoryPackage.FIELD_RULE_TYPE__RENDERING:
				return RENDERING_EDEFAULT == null ? rendering != null : !RENDERING_EDEFAULT.equals(rendering);
			case FixrepositoryPackage.FIELD_RULE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case FixrepositoryPackage.FIELD_RULE_TYPE__VALUE:
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
		result.append(" (assign: ");
		result.append(assign);
		result.append(", when: ");
		result.append(when);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", implLength: ");
		if (implLengthESet) result.append(implLength); else result.append("<unset>");
		result.append(", implMaxLength: ");
		if (implMaxLengthESet) result.append(implMaxLength); else result.append("<unset>");
		result.append(", implMinLength: ");
		if (implMinLengthESet) result.append(implMinLength); else result.append("<unset>");
		result.append(", maxInclusive: ");
		result.append(maxInclusive);
		result.append(", minInclusive: ");
		result.append(minInclusive);
		result.append(", name: ");
		result.append(name);
		result.append(", presence: ");
		if (presenceESet) result.append(presence); else result.append("<unset>");
		result.append(", rendering: ");
		result.append(rendering);
		result.append(", type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //FieldRuleTypeImpl
