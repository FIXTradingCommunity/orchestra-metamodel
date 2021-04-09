/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ResponsesType#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getResponsesType()
 * @model extendedMetaData="name='responses_._type' kind='elementOnly'"
 * @generated
 */
public interface ResponsesType extends EObject {
  /**
   * Returns the value of the '<em><b>Response</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.ResponseType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Responses are evaluated and triggered in the order listed
   * <!-- end-model-doc -->
   * @return the value of the '<em>Response</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getResponsesType_Response()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
   * @generated
   */
  EList<ResponseType> getResponse();

} // ResponsesType
