/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A state of a state machine. If it has no transitions, then it is a final state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateType#getTransition <em>Transition</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateType#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateType#getActivity <em>Activity</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateType#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StateType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateType()
 * @model extendedMetaData="name='stateType' kind='elementOnly'"
 * @generated
 */
public interface StateType extends EObject {
  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.TransitionType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateType_Transition()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='transition' namespace='##targetNamespace'"
   * @generated
   */
  EList<TransitionType> getTransition();

  /**
   * Returns the value of the '<em><b>Onentry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Operation fired when entering a state.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Onentry</em>' containment reference.
   * @see #setOnentry(ActionType)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateType_Onentry()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='onentry' namespace='##targetNamespace'"
   * @generated
   */
  ActionType getOnentry();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateType#getOnentry <em>Onentry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Onentry</em>' containment reference.
   * @see #getOnentry()
   * @generated
   */
  void setOnentry(ActionType value);

  /**
   * Returns the value of the '<em><b>Activity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Operation fired when entering a state and completing when exiting or earlier.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Activity</em>' containment reference.
   * @see #setActivity(ActionType)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateType_Activity()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
   * @generated
   */
  ActionType getActivity();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateType#getActivity <em>Activity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' containment reference.
   * @see #getActivity()
   * @generated
   */
  void setActivity(ActionType value);

  /**
   * Returns the value of the '<em><b>Onexit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Operation fired when exiting a state.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Onexit</em>' containment reference.
   * @see #setOnexit(ActionType)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateType_Onexit()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='onexit' namespace='##targetNamespace'"
   * @generated
   */
  ActionType getOnexit();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateType#getOnexit <em>Onexit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Onexit</em>' containment reference.
   * @see #getOnexit()
   * @generated
   */
  void setOnexit(ActionType value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateType#getAnnotation <em>Annotation</em>}' containment reference.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStateType_Name()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StateType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // StateType
