/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptType#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptType#getGroupRef <em>Group Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptType#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptType#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType()
 * @model extendedMetaData="name='conceptType' kind='elementOnly'"
 * @generated
 */
public interface ConceptType extends EObject {
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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType_Group()
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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType_ComponentRef()
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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType_GroupRef()
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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType_FieldRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<FieldRefType> getFieldRef();

  /**
   * Returns the value of the '<em><b>Message Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.MessageRefType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Ref</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType_MessageRef()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='messageRef' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<MessageRefType> getMessageRef();

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ConceptType#getAnnotation <em>Annotation</em>}' containment reference.
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
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptType_Name()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ConceptType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ConceptType
