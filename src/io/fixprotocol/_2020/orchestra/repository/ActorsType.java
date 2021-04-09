/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getActor <em>Actor</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getFlow <em>Flow</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getActorsType()
 * @model extendedMetaData="name='actors_._type' kind='elementOnly'"
 * @generated
 */
public interface ActorsType extends EObject {
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getActorsType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
  FeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.ActorType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getActorsType_Actor()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<ActorType> getActor();

  /**
   * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.FlowType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getActorsType_Flow()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='flow' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<FlowType> getFlow();

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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getActorsType_Base()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

} // ActorsType
