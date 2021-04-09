/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.IdentifiersType;
import io.fixprotocol._2020.orchestra.repository.MessageRefType;
import io.fixprotocol._2020.orchestra.repository.RepositoryFactory;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl#getImplMaxOccurs <em>Impl Max Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl#getImplMinOccurs <em>Impl Min Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl#getMsgType <em>Msg Type</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageRefTypeImpl extends MinimalEObjectImpl.Container implements MessageRefType {
  /**
   * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiers()
   * @generated
   * @ordered
   */
  protected IdentifiersType identifiers;

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
   * The default value of the '{@link #getImplMaxOccurs() <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMaxOccurs()
   * @generated
   * @ordered
   */
  protected static final Object IMPL_MAX_OCCURS_EDEFAULT = RepositoryFactory.eINSTANCE.createFromString(RepositoryPackage.eINSTANCE.getUnboundedIntType(), "unbounded");

  /**
   * The cached value of the '{@link #getImplMaxOccurs() <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMaxOccurs()
   * @generated
   * @ordered
   */
  protected Object implMaxOccurs = IMPL_MAX_OCCURS_EDEFAULT;

  /**
   * This is true if the Impl Max Occurs attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean implMaxOccursESet;

  /**
   * The default value of the '{@link #getImplMinOccurs() <em>Impl Min Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMinOccurs()
   * @generated
   * @ordered
   */
  protected static final BigInteger IMPL_MIN_OCCURS_EDEFAULT = new BigInteger("1");

  /**
   * The cached value of the '{@link #getImplMinOccurs() <em>Impl Min Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplMinOccurs()
   * @generated
   * @ordered
   */
  protected BigInteger implMinOccurs = IMPL_MIN_OCCURS_EDEFAULT;

  /**
   * This is true if the Impl Min Occurs attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean implMinOccursESet;

  /**
   * The default value of the '{@link #getMsgType() <em>Msg Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsgType()
   * @generated
   * @ordered
   */
  protected static final String MSG_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMsgType() <em>Msg Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsgType()
   * @generated
   * @ordered
   */
  protected String msgType = MSG_TYPE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageRefTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getMessageRefType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifiersType getIdentifiers() {
    return identifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifiers(IdentifiersType newIdentifiers, NotificationChain msgs) {
    IdentifiersType oldIdentifiers = identifiers;
    identifiers = newIdentifiers;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS, oldIdentifiers, newIdentifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifiers(IdentifiersType newIdentifiers) {
    if (newIdentifiers != identifiers) {
      NotificationChain msgs = null;
      if (identifiers != null)
        msgs = ((InternalEObject)identifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS, null, msgs);
      if (newIdentifiers != null)
        msgs = ((InternalEObject)newIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS, null, msgs);
      msgs = basicSetIdentifiers(newIdentifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS, newIdentifiers, newIdentifiers));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImplMaxOccurs() {
    return implMaxOccurs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplMaxOccurs(Object newImplMaxOccurs) {
    Object oldImplMaxOccurs = implMaxOccurs;
    implMaxOccurs = newImplMaxOccurs;
    boolean oldImplMaxOccursESet = implMaxOccursESet;
    implMaxOccursESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MAX_OCCURS, oldImplMaxOccurs, implMaxOccurs, !oldImplMaxOccursESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetImplMaxOccurs() {
    Object oldImplMaxOccurs = implMaxOccurs;
    boolean oldImplMaxOccursESet = implMaxOccursESet;
    implMaxOccurs = IMPL_MAX_OCCURS_EDEFAULT;
    implMaxOccursESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MAX_OCCURS, oldImplMaxOccurs, IMPL_MAX_OCCURS_EDEFAULT, oldImplMaxOccursESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetImplMaxOccurs() {
    return implMaxOccursESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getImplMinOccurs() {
    return implMinOccurs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplMinOccurs(BigInteger newImplMinOccurs) {
    BigInteger oldImplMinOccurs = implMinOccurs;
    implMinOccurs = newImplMinOccurs;
    boolean oldImplMinOccursESet = implMinOccursESet;
    implMinOccursESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MIN_OCCURS, oldImplMinOccurs, implMinOccurs, !oldImplMinOccursESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetImplMinOccurs() {
    BigInteger oldImplMinOccurs = implMinOccurs;
    boolean oldImplMinOccursESet = implMinOccursESet;
    implMinOccurs = IMPL_MIN_OCCURS_EDEFAULT;
    implMinOccursESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MIN_OCCURS, oldImplMinOccurs, IMPL_MIN_OCCURS_EDEFAULT, oldImplMinOccursESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetImplMinOccurs() {
    return implMinOccursESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMsgType() {
    return msgType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMsgType(String newMsgType) {
    String oldMsgType = msgType;
    msgType = newMsgType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__MSG_TYPE, oldMsgType, msgType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MESSAGE_REF_TYPE__SCENARIO, oldScenario, scenario, !oldScenarioESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.MESSAGE_REF_TYPE__SCENARIO, oldScenario, SCENARIO_EDEFAULT, oldScenarioESet));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS:
        return basicSetIdentifiers(null, msgs);
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
      case RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS:
        return getIdentifiers();
      case RepositoryPackage.MESSAGE_REF_TYPE__ID:
        return getId();
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MAX_OCCURS:
        return getImplMaxOccurs();
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MIN_OCCURS:
        return getImplMinOccurs();
      case RepositoryPackage.MESSAGE_REF_TYPE__MSG_TYPE:
        return getMsgType();
      case RepositoryPackage.MESSAGE_REF_TYPE__NAME:
        return getName();
      case RepositoryPackage.MESSAGE_REF_TYPE__SCENARIO:
        return getScenario();
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
      case RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS:
        setIdentifiers((IdentifiersType)newValue);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__ID:
        setId((BigInteger)newValue);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MAX_OCCURS:
        setImplMaxOccurs(newValue);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MIN_OCCURS:
        setImplMinOccurs((BigInteger)newValue);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__MSG_TYPE:
        setMsgType((String)newValue);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__NAME:
        setName((String)newValue);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__SCENARIO:
        setScenario((String)newValue);
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
      case RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS:
        setIdentifiers((IdentifiersType)null);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MAX_OCCURS:
        unsetImplMaxOccurs();
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MIN_OCCURS:
        unsetImplMinOccurs();
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__MSG_TYPE:
        setMsgType(MSG_TYPE_EDEFAULT);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RepositoryPackage.MESSAGE_REF_TYPE__SCENARIO:
        unsetScenario();
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
      case RepositoryPackage.MESSAGE_REF_TYPE__IDENTIFIERS:
        return identifiers != null;
      case RepositoryPackage.MESSAGE_REF_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MAX_OCCURS:
        return isSetImplMaxOccurs();
      case RepositoryPackage.MESSAGE_REF_TYPE__IMPL_MIN_OCCURS:
        return isSetImplMinOccurs();
      case RepositoryPackage.MESSAGE_REF_TYPE__MSG_TYPE:
        return MSG_TYPE_EDEFAULT == null ? msgType != null : !MSG_TYPE_EDEFAULT.equals(msgType);
      case RepositoryPackage.MESSAGE_REF_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RepositoryPackage.MESSAGE_REF_TYPE__SCENARIO:
        return isSetScenario();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", implMaxOccurs: ");
    if (implMaxOccursESet) result.append(implMaxOccurs); else result.append("<unset>");
    result.append(", implMinOccurs: ");
    if (implMinOccursESet) result.append(implMinOccurs); else result.append("<unset>");
    result.append(", msgType: ");
    result.append(msgType);
    result.append(", name: ");
    result.append(name);
    result.append(", scenario: ");
    if (scenarioESet) result.append(scenario); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //MessageRefTypeImpl
