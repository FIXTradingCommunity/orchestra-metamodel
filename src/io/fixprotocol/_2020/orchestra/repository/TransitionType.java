/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getWhen <em>When</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getTransitionType()
 * @model extendedMetaData="name='transitionType' kind='elementOnly'"
 * @generated
 */
public interface TransitionType extends EObject {
  /**
   * Returns the value of the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Optional guard condition. The transition is
   * 						allowed if the condition evaluates true. If not present, the
   * 						transition is unconditional.
   * 					
   * <!-- end-model-doc -->
   * @return the value of the '<em>When</em>' attribute.
   * @see #setWhen(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getTransitionType_When()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.ExpressionType"
   *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
   * @generated
   */
  String getWhen();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getWhen <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' attribute.
   * @see #getWhen()
   * @generated
   */
  void setWhen(String value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getTransitionType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getAnnotation <em>Annotation</em>}' containment reference.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getTransitionType_Name()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The target state of the transition
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getTransitionType_Target()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='target'"
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // TransitionType
