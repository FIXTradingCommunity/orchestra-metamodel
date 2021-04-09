/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ExtensionType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getExtensionType()
 * @model extendedMetaData="name='extension_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtensionType extends EObject {
  /**
   * Returns the value of the '<em><b>Any</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' attribute list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getExtensionType_Any()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='lax'"
   * @generated
   */
  FeatureMap getAny();

} // ExtensionType
