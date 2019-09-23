/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concepts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptsType#getConcept <em>Concept</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ConceptsType#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptsType()
 * @model extendedMetaData="name='concepts_._type' kind='elementOnly'"
 * @generated
 */
public interface ConceptsType extends EObject {
  /**
   * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.ConceptType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptsType_Concept()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
   * @generated
   */
  EList<ConceptType> getConcept();

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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getConceptsType_Base()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
   *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ConceptsType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

} // ConceptsType
