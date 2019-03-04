/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TriggerType#getActor <em>Actor</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TriggerType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.TriggerType#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTriggerType()
 * @model extendedMetaData="name='triggerType' kind='empty'"
 * @generated
 */
public interface TriggerType extends EObject {
  /**
	 * Returns the value of the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the actor that owns the state machine
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' attribute.
	 * @see #setActor(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTriggerType_Actor()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
	 *        extendedMetaData="kind='attribute' name='actor'"
	 * @generated
	 */
  String getActor();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TriggerType#getActor <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' attribute.
	 * @see #getActor()
	 * @generated
	 */
  void setActor(String value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the transition to invoke
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTriggerType_Name()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TriggerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>State Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the state machine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Machine</em>' attribute.
	 * @see #setStateMachine(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getTriggerType_StateMachine()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='stateMachine'"
	 * @generated
	 */
  String getStateMachine();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.TriggerType#getStateMachine <em>State Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' attribute.
	 * @see #getStateMachine()
	 * @generated
	 */
  void setStateMachine(String value);

} // TriggerType
