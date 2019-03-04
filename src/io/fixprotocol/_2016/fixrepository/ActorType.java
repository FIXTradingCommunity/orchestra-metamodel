/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a class of participants
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getField <em>Field</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getStates <em>States</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getTimer <em>Timer</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ActorType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType()
 * @model extendedMetaData="name='actorType' kind='elementOnly'"
 * @generated
 */
public interface ActorType extends EObject {
  /**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State variables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_Group()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_Field()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_FieldRef()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_Component()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_ComponentRef()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_Group1()
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_GroupRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<GroupRefType> getGroupRef();

  /**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.StateMachineType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_States()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='states' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<StateMachineType> getStates();

  /**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.TimerType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_Timer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<TimerType> getTimer();

  /**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
  Annotation getAnnotation();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ActorType#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
  void setAnnotation(Annotation value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getActorType_Name()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ActorType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // ActorType
