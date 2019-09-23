/**
 */
package org.purl.dc.terms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.purl.dc.elements._1._1.SimpleLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Or Refinement Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *     		This is included as a convenience for schema authors who need to define a root
 *     		or container element for all of the DC elements and element refinements.
 *     	
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.ElementOrRefinementContainer#getGroup <em>Group</em>}</li>
 *   <li>{@link org.purl.dc.terms.ElementOrRefinementContainer#getAnyGroup <em>Any Group</em>}</li>
 *   <li>{@link org.purl.dc.terms.ElementOrRefinementContainer#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.TermsPackage#getElementOrRefinementContainer()
 * @model extendedMetaData="name='elementOrRefinementContainer' kind='elementOnly'"
 * @generated
 */
public interface ElementOrRefinementContainer extends EObject {
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
   * @see org.purl.dc.terms.TermsPackage#getElementOrRefinementContainer_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
  FeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Any Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Group</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Group</em>' attribute list.
   * @see org.purl.dc.terms.TermsPackage#getElementOrRefinementContainer_AnyGroup()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='group' name='any:group' namespace='http://purl.org/dc/elements/1.1/' group='#group:0'"
   * @generated
   */
  FeatureMap getAnyGroup();

  /**
   * Returns the value of the '<em><b>Any</b></em>' containment reference list.
   * The list contents are of type {@link org.purl.dc.elements._1._1.SimpleLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' containment reference list.
   * @see org.purl.dc.terms.TermsPackage#getElementOrRefinementContainer_Any()
   * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='any' namespace='http://purl.org/dc/elements/1.1/' group='http://purl.org/dc/elements/1.1/#any:group'"
   * @generated
   */
  EList<SimpleLiteral> getAny();

} // ElementOrRefinementContainer
