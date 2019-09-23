/**
 */
package io.fixprotocol._2016.fixrepository;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getActivity <em>Activity</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getActor <em>Actor</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getInterval <em>Interval</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTimerSchedule()
 * @model extendedMetaData="name='timerSchedule' kind='elementOnly'"
 * @generated
 */
public interface TimerSchedule extends EObject {
  /**
   * Returns the value of the '<em><b>Activity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Action to take when a timer expires
   * 								
   * <!-- end-model-doc -->
   * @return the value of the '<em>Activity</em>' containment reference.
   * @see #setActivity(ActionType)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTimerSchedule_Activity()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
   * @generated
   */
  ActionType getActivity();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getActivity <em>Activity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' containment reference.
   * @see #getActivity()
   * @generated
   */
  void setActivity(ActionType value);

  /**
   * Returns the value of the '<em><b>Actor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Name of the actor that owns the timer
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Actor</em>' attribute.
   * @see #setActor(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTimerSchedule_Actor()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='actor'"
   * @generated
   */
  String getActor();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getActor <em>Actor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor</em>' attribute.
   * @see #getActor()
   * @generated
   */
  void setActor(String value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' attribute.
   * @see #setInterval(Duration)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTimerSchedule_Interval()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
   *        extendedMetaData="kind='attribute' name='interval'"
   * @generated
   */
  Duration getInterval();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getInterval <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' attribute.
   * @see #getInterval()
   * @generated
   */
  void setInterval(Duration value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Name of the timer
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTimerSchedule_Name()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.TimerOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.TimerOperation
   * @see #isSetOperation()
   * @see #unsetOperation()
   * @see #setOperation(TimerOperation)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTimerSchedule_Operation()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='operation'"
   * @generated
   */
  TimerOperation getOperation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.TimerOperation
   * @see #isSetOperation()
   * @see #unsetOperation()
   * @see #getOperation()
   * @generated
   */
  void setOperation(TimerOperation value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOperation()
   * @see #getOperation()
   * @see #setOperation(TimerOperation)
   * @generated
   */
  void unsetOperation();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getOperation <em>Operation</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Operation</em>' attribute is set.
   * @see #unsetOperation()
   * @see #getOperation()
   * @see #setOperation(TimerOperation)
   * @generated
   */
  boolean isSetOperation();

} // TimerSchedule
