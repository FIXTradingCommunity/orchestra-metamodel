/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.ComponentRuleType;
import io.fixprotocol._2020.orchestra.repository.PresenceT;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentRuleTypeImpl#getWhen <em>When</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentRuleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentRuleTypeImpl#getPresence <em>Presence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRuleTypeImpl extends MinimalEObjectImpl.Container implements ComponentRuleType {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentRuleTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getComponentRuleType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWhen() {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhen(String newWhen) {
    String oldWhen = when;
    when = newWhen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_RULE_TYPE__WHEN, oldWhen, when));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_RULE_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT_RULE_TYPE__PRESENCE, oldPresence, presence, !oldPresenceESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.COMPONENT_RULE_TYPE__PRESENCE, oldPresence, PRESENCE_EDEFAULT, oldPresenceESet));
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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RepositoryPackage.COMPONENT_RULE_TYPE__WHEN:
        return getWhen();
      case RepositoryPackage.COMPONENT_RULE_TYPE__NAME:
        return getName();
      case RepositoryPackage.COMPONENT_RULE_TYPE__PRESENCE:
        return getPresence();
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
      case RepositoryPackage.COMPONENT_RULE_TYPE__WHEN:
        setWhen((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_RULE_TYPE__NAME:
        setName((String)newValue);
        return;
      case RepositoryPackage.COMPONENT_RULE_TYPE__PRESENCE:
        setPresence((PresenceT)newValue);
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
      case RepositoryPackage.COMPONENT_RULE_TYPE__WHEN:
        setWhen(WHEN_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_RULE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RepositoryPackage.COMPONENT_RULE_TYPE__PRESENCE:
        unsetPresence();
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
      case RepositoryPackage.COMPONENT_RULE_TYPE__WHEN:
        return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
      case RepositoryPackage.COMPONENT_RULE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RepositoryPackage.COMPONENT_RULE_TYPE__PRESENCE:
        return isSetPresence();
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
    result.append(" (when: ");
    result.append(when);
    result.append(", name: ");
    result.append(name);
    result.append(", presence: ");
    if (presenceESet) result.append(presence); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //ComponentRuleTypeImpl
