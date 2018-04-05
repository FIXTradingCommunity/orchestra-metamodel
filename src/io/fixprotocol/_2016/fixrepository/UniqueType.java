/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.UniqueType#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getUniqueType()
 * @model extendedMetaData="name='unique_._type' kind='elementOnly'"
 * @generated
 */
public interface UniqueType extends EObject {
  /**
   * Returns the value of the '<em><b>Field Ref</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.FieldRefType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Other field or fields that scope uniqueness. 
   * 									If none provided, then the field value must be globally unique.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Field Ref</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getUniqueType_FieldRef()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='fieldRef' namespace='##targetNamespace'"
   * @generated
   */
  EList<FieldRefType> getFieldRef();

} // UniqueType
