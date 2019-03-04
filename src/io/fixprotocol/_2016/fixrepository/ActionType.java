/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActionType#getTimerSchedule <em>Timer Schedule</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType()
 * @model extendedMetaData="name='actionType' kind='elementOnly'"
 * @generated
 */
public interface ActionType extends EObject {
  /**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Event parameters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
  FeatureMap getGroup();

  /**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.FieldType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_Field()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<FieldType> getField();

  /**
	 * Returns the value of the '<em><b>Field Ref</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.FieldRefType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_FieldRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<FieldRefType> getFieldRef();

  /**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.ComponentType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_Component()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<ComponentType> getComponent();

  /**
	 * Returns the value of the '<em><b>Component Ref</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.ComponentRefType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Ref</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_ComponentRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<ComponentRefType> getComponentRef();

  /**
	 * Returns the value of the '<em><b>Group1</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.GroupType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_Group1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<GroupType> getGroup1();

  /**
	 * Returns the value of the '<em><b>Group Ref</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.GroupRefType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Ref</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_GroupRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<GroupRefType> getGroupRef();

  /**
	 * Returns the value of the '<em><b>Group2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any number of action behaviors can be triggered at the same time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group2</em>' attribute list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_Group2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:7'"
	 * @generated
	 */
  FeatureMap getGroup2();

  /**
	 * Returns the value of the '<em><b>Message Ref</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.MessageRefType}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Send a message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Ref</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_MessageRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='messageRef' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
  EList<MessageRefType> getMessageRef();

  /**
	 * Returns the value of the '<em><b>Assign</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content of element holds an assignment expression
	 * 							for a state variable in the form '$actor.variable=value'
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assign</em>' attribute list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_Assign()
	 * @model unique="false" dataType="io.fixprotocol._2016.fixrepository.ExpressionType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assign' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
  EList<String> getAssign();

  /**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.TriggerType}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trigger a state transtion in a state machine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_Trigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
  EList<TriggerType> getTrigger();

  /**
	 * Returns the value of the '<em><b>Timer Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.TimerSchedule}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timer Schedule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Schedule</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActionType_TimerSchedule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timerSchedule' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
  EList<TimerSchedule> getTimerSchedule();

} // ActionType
