/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getInitial <em>Initial</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getState <em>State</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateMachineType()
 * @model extendedMetaData="name='stateMachineType' kind='elementOnly'"
 * @generated
 */
public interface StateMachineType extends EObject {
  /**
   * Returns the value of the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Initial state of a state machine
   * <!-- end-model-doc -->
   * @return the value of the '<em>Initial</em>' containment reference.
   * @see #setInitial(StateType)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateMachineType_Initial()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='initial' namespace='##targetNamespace'"
   * @generated
   */
  StateType getInitial();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getInitial <em>Initial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' containment reference.
   * @see #getInitial()
   * @generated
   */
  void setInitial(StateType value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.StateType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateMachineType_State()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
   * @generated
   */
  EList<StateType> getState();

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateMachineType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getAnnotation <em>Annotation</em>}' containment reference.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateMachineType_Name()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // StateMachineType
