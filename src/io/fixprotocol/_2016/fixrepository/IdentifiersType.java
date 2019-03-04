/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getCorrelate <em>Correlate</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifiersType()
 * @model extendedMetaData="name='identifiersType' kind='elementOnly'"
 * @generated
 */
public interface IdentifiersType extends EObject {
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifiersType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Correlate</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Correlated field IDs between two message types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correlate</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifiersType_Correlate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='correlate' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IdentifierType> getCorrelate();

	/**
	 * Returns the value of the '<em><b>Assign</b></em>' containment reference list.
	 * The list contents are of type {@link io.fixprotocol._2016.fixrepository.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Field ID assigned
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assign</em>' containment reference list.
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifiersType_Assign()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assign' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IdentifierType> getAssign();

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifiersType_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

} // IdentifiersType
