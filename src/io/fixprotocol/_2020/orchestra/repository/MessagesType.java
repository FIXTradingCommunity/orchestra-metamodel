/**
 */
package io.fixprotocol._2020.orchestra.repository;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Messages Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getMessage <em>Message</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getBase <em>Base</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMessagesType()
 * @model extendedMetaData="name='messages_._type' kind='elementOnly'"
 * @generated
 */
public interface MessagesType extends EObject {
  /**
   * Returns the value of the '<em><b>Message</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.MessageType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMessagesType_Message()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
   * @generated
   */
  EList<MessageType> getMessage();

  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * See http://www.w3.org/TR/xmlbase/ for
   *                      information about this attribute.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMessagesType_Base()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

  /**
   * Returns the value of the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Latest EP</em>' attribute.
   * @see #setLatestEP(BigInteger)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMessagesType_LatestEP()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.EPT"
   *        extendedMetaData="kind='attribute' name='latestEP'"
   * @generated
   */
  BigInteger getLatestEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getLatestEP <em>Latest EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Latest EP</em>' attribute.
   * @see #getLatestEP()
   * @generated
   */
  void setLatestEP(BigInteger value);

} // MessagesType
