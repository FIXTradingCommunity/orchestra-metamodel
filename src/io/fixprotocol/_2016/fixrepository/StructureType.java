/**
 */
package io.fixprotocol._2016.fixrepository;

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
 *   <li>{@link io.fixprotocol._2016.fixrepository.StructureType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.StructureType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.StructureType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.StructureType#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getStructureType()
 * @model extendedMetaData="name='structure_._type' kind='elementOnly'"
 * @generated
 */
public interface StructureType extends EObject {
  /**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getStructureType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
  FeatureMap getGroup();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getStructureType_ComponentRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<ComponentRefType> getComponentRef();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getStructureType_GroupRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='groupRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<GroupRefType> getGroupRef();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getStructureType_FieldRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
  EList<FieldRefType> getFieldRef();

} // StructureType
