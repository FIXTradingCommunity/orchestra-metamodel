/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Assignment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getBlockAssignmentType()
 * @model extendedMetaData="name='blockAssignmentType' kind='elementOnly'"
 * @generated
 */
public interface BlockAssignmentType extends EObject {
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getBlockAssignmentType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
  FeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Component Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.ComponentRefType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Ref</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getBlockAssignmentType_ComponentRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='componentRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<ComponentRefType> getComponentRef();

  /**
   * Returns the value of the '<em><b>Group Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.GroupRefType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Ref</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getBlockAssignmentType_GroupRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<GroupRefType> getGroupRef();

  /**
   * Returns the value of the '<em><b>Field Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.FieldRefType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Ref</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getBlockAssignmentType_FieldRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<FieldRefType> getFieldRef();

} // BlockAssignmentType
