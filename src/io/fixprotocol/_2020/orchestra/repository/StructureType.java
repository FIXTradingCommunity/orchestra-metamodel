/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StructureType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StructureType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StructureType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StructureType#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.StructureType#getWhich <em>Which</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStructureType()
 * @model extendedMetaData="name='structure_._type' kind='elementOnly'"
 * @generated
 */
public interface StructureType extends EObject {
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStructureType_Group()
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStructureType_ComponentRef()
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStructureType_GroupRef()
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStructureType_FieldRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<FieldRefType> getFieldRef();

  /**
   * Returns the value of the '<em><b>Which</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2020.orchestra.repository.MemberType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Which</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.MemberType
   * @see #isSetWhich()
   * @see #unsetWhich()
   * @see #setWhich(MemberType)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getStructureType_Which()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='which'"
   * @generated
   */
  MemberType getWhich();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getWhich <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Which</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.MemberType
   * @see #isSetWhich()
   * @see #unsetWhich()
   * @see #getWhich()
   * @generated
   */
  void setWhich(MemberType value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getWhich <em>Which</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetWhich()
   * @see #getWhich()
   * @see #setWhich(MemberType)
   * @generated
   */
  void unsetWhich();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getWhich <em>Which</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Which</em>' attribute is set.
   * @see #unsetWhich()
   * @see #getWhich()
   * @see #setWhich(MemberType)
   * @generated
   */
  boolean isSetWhich();

} // StructureType
