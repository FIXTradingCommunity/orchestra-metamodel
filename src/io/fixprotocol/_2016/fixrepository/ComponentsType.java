/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentsType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentsType#getComponent <em>Component</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentsType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ComponentsType#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentsType()
 * @model extendedMetaData="name='components_._type' kind='elementOnly'"
 * @generated
 */
public interface ComponentsType extends EObject {
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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentsType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
  FeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.ComponentType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentsType_Component()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<ComponentType> getComponent();

  /**
   * Returns the value of the '<em><b>Group1</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.GroupType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group1</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentsType_Group1()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' group='#group:0'"
   * @generated
   */
  EList<GroupType> getGroup1();

  /**
   * Returns the value of the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latest EP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Latest EP</em>' attribute.
   * @see #setLatestEP(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getComponentsType_LatestEP()
   * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
   *        extendedMetaData="kind='attribute' name='latestEP'"
   * @generated
   */
  BigInteger getLatestEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ComponentsType#getLatestEP <em>Latest EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Latest EP</em>' attribute.
   * @see #getLatestEP()
   * @generated
   */
  void setLatestEP(BigInteger value);

} // ComponentsType
