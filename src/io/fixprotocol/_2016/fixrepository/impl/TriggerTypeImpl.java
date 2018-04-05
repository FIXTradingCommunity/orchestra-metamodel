/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.TriggerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TriggerTypeImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TriggerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TriggerTypeImpl#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerTypeImpl extends MinimalEObjectImpl.Container implements TriggerType {
  /**
   * The default value of the '{@link #getActor() <em>Actor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected static final String ACTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActor() <em>Actor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected String actor = ACTOR_EDEFAULT;

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
   * The default value of the '{@link #getStateMachine() <em>State Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateMachine()
   * @generated
   * @ordered
   */
  protected static final String STATE_MACHINE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateMachine()
   * @generated
   * @ordered
   */
  protected String stateMachine = STATE_MACHINE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getTriggerType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActor() {
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActor(String newActor) {
    String oldActor = actor;
    actor = newActor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TRIGGER_TYPE__ACTOR, oldActor, actor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TRIGGER_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStateMachine() {
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateMachine(String newStateMachine) {
    String oldStateMachine = stateMachine;
    stateMachine = newStateMachine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TRIGGER_TYPE__STATE_MACHINE, oldStateMachine, stateMachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case FixrepositoryPackage.TRIGGER_TYPE__ACTOR:
        return getActor();
      case FixrepositoryPackage.TRIGGER_TYPE__NAME:
        return getName();
      case FixrepositoryPackage.TRIGGER_TYPE__STATE_MACHINE:
        return getStateMachine();
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
      case FixrepositoryPackage.TRIGGER_TYPE__ACTOR:
        setActor((String)newValue);
        return;
      case FixrepositoryPackage.TRIGGER_TYPE__NAME:
        setName((String)newValue);
        return;
      case FixrepositoryPackage.TRIGGER_TYPE__STATE_MACHINE:
        setStateMachine((String)newValue);
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
      case FixrepositoryPackage.TRIGGER_TYPE__ACTOR:
        setActor(ACTOR_EDEFAULT);
        return;
      case FixrepositoryPackage.TRIGGER_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.TRIGGER_TYPE__STATE_MACHINE:
        setStateMachine(STATE_MACHINE_EDEFAULT);
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
      case FixrepositoryPackage.TRIGGER_TYPE__ACTOR:
        return ACTOR_EDEFAULT == null ? actor != null : !ACTOR_EDEFAULT.equals(actor);
      case FixrepositoryPackage.TRIGGER_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FixrepositoryPackage.TRIGGER_TYPE__STATE_MACHINE:
        return STATE_MACHINE_EDEFAULT == null ? stateMachine != null : !STATE_MACHINE_EDEFAULT.equals(stateMachine);
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
    result.append(" (actor: ");
    result.append(actor);
    result.append(", name: ");
    result.append(name);
    result.append(", stateMachine: ");
    result.append(stateMachine);
    result.append(')');
    return result.toString();
  }

} //TriggerTypeImpl
