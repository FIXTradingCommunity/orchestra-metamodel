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

} // ConceptsType
