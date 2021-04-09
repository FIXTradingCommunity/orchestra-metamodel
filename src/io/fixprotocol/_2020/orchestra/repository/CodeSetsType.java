/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Sets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CodeSetsType#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.CodeSetsType#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCodeSetsType()
 * @model extendedMetaData="name='codeSets_._type' kind='elementOnly'"
 * @generated
 */
public interface CodeSetsType extends EObject {
  /**
   * Returns the value of the '<em><b>Code Set</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2020.orchestra.repository.CodeSetType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Set</em>' containment reference list.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCodeSetsType_CodeSet()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='codeSet' namespace='##targetNamespace'"
   * @generated
   */
  EList<CodeSetType> getCodeSet();

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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getCodeSetsType_Base()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.CodeSetsType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

} // CodeSetsType
