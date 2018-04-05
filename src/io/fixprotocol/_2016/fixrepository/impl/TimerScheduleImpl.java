/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.ActionType;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.TimerOperation;
import io.fixprotocol._2016.fixrepository.TimerSchedule;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TimerScheduleImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TimerScheduleImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TimerScheduleImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TimerScheduleImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.TimerScheduleImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerScheduleImpl extends MinimalEObjectImpl.Container implements TimerSchedule {
  /**
   * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivity()
   * @generated
   * @ordered
   */
  protected ActionType activity;

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
   * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected static final Duration INTERVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected Duration interval = INTERVAL_EDEFAULT;

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
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final TimerOperation OPERATION_EDEFAULT = TimerOperation.START;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected TimerOperation operation = OPERATION_EDEFAULT;

  /**
   * This is true if the Operation attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean operationESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimerScheduleImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getTimerSchedule();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionType getActivity() {
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActivity(ActionType newActivity, NotificationChain msgs) {
    ActionType oldActivity = activity;
    activity = newActivity;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY, oldActivity, newActivity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivity(ActionType newActivity) {
    if (newActivity != activity) {
      NotificationChain msgs = null;
      if (activity != null)
        msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY, null, msgs);
      if (newActivity != null)
        msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY, null, msgs);
      msgs = basicSetActivity(newActivity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY, newActivity, newActivity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TIMER_SCHEDULE__ACTOR, oldActor, actor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration getInterval() {
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterval(Duration newInterval) {
    Duration oldInterval = interval;
    interval = newInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TIMER_SCHEDULE__INTERVAL, oldInterval, interval));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TIMER_SCHEDULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerOperation getOperation() {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(TimerOperation newOperation) {
    TimerOperation oldOperation = operation;
    operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
    boolean oldOperationESet = operationESet;
    operationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.TIMER_SCHEDULE__OPERATION, oldOperation, operation, !oldOperationESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOperation() {
    TimerOperation oldOperation = operation;
    boolean oldOperationESet = operationESet;
    operation = OPERATION_EDEFAULT;
    operationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.TIMER_SCHEDULE__OPERATION, oldOperation, OPERATION_EDEFAULT, oldOperationESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOperation() {
    return operationESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY:
        return basicSetActivity(null, msgs);
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
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY:
        return getActivity();
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTOR:
        return getActor();
      case FixrepositoryPackage.TIMER_SCHEDULE__INTERVAL:
        return getInterval();
      case FixrepositoryPackage.TIMER_SCHEDULE__NAME:
        return getName();
      case FixrepositoryPackage.TIMER_SCHEDULE__OPERATION:
        return getOperation();
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
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY:
        setActivity((ActionType)newValue);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTOR:
        setActor((String)newValue);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__INTERVAL:
        setInterval((Duration)newValue);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__NAME:
        setName((String)newValue);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__OPERATION:
        setOperation((TimerOperation)newValue);
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
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY:
        setActivity((ActionType)null);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTOR:
        setActor(ACTOR_EDEFAULT);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__INTERVAL:
        setInterval(INTERVAL_EDEFAULT);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FixrepositoryPackage.TIMER_SCHEDULE__OPERATION:
        unsetOperation();
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
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTIVITY:
        return activity != null;
      case FixrepositoryPackage.TIMER_SCHEDULE__ACTOR:
        return ACTOR_EDEFAULT == null ? actor != null : !ACTOR_EDEFAULT.equals(actor);
      case FixrepositoryPackage.TIMER_SCHEDULE__INTERVAL:
        return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
      case FixrepositoryPackage.TIMER_SCHEDULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FixrepositoryPackage.TIMER_SCHEDULE__OPERATION:
        return isSetOperation();
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
    result.append(", interval: ");
    result.append(interval);
    result.append(", name: ");
    result.append(name);
    result.append(", operation: ");
    if (operationESet) result.append(operation); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //TimerScheduleImpl
