/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.IdentifierType#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.IdentifierType#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifierType()
 * @model extendedMetaData="name='identifierType' kind='empty'"
 * @generated
 */
public interface IdentifierType extends EObject {
	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Field ID assigned or correlated in a message reference
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifierType_Id()
   * @model dataType="io.fixprotocol._2016.fixrepository.IdT" required="true"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	BigInteger getId();

	/**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.IdentifierType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(BigInteger value);

	/**
   * Returns the value of the '<em><b>Source Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Field ID correlated from source message. If not present, assumed to be same tag as 'id'.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source Id</em>' attribute.
   * @see #setSourceId(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getIdentifierType_SourceId()
   * @model dataType="io.fixprotocol._2016.fixrepository.IdT"
   *        extendedMetaData="kind='attribute' name='sourceId'"
   * @generated
   */
	BigInteger getSourceId();

	/**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.IdentifierType#getSourceId <em>Source Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Id</em>' attribute.
   * @see #getSourceId()
   * @generated
   */
	void setSourceId(BigInteger value);

} // IdentifierType
