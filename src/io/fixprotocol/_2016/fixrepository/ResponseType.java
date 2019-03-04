/**
 */
package io.fixprotocol._2016.fixrepository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any number of action behaviors can be triggered by the same 'when' condition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ResponseType#getWhen <em>When</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ResponseType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ResponseType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.ResponseType#getSync <em>Sync</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getResponseType()
 * @model extendedMetaData="name='responseType' kind='elementOnly'"
 * @generated
 */
public interface ResponseType extends ActionType {
  /**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A common condition for all of the actions. If it
	 * 						evalutes true, then the actions are invoked. If 'when' is not
	 * 						present, the actions are unconditional.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(String)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getResponseType_When()
	 * @model dataType="io.fixprotocol._2016.fixrepository.ExpressionType"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
  String getWhen();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ResponseType#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
  void setWhen(String value);

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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getResponseType_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
  Annotation getAnnotation();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ResponseType#getAnnotation <em>Annotation</em>}' containment reference.
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
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getResponseType_Name()
	 * @model dataType="io.fixprotocol._2016.fixrepository.NameT"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ResponseType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.Synchronization}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sync</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync</em>' attribute.
	 * @see io.fixprotocol._2016.fixrepository.Synchronization
	 * @see #isSetSync()
	 * @see #unsetSync()
	 * @see #setSync(Synchronization)
	 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getResponseType_Sync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sync'"
	 * @generated
	 */
  Synchronization getSync();

  /**
	 * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.ResponseType#getSync <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync</em>' attribute.
	 * @see io.fixprotocol._2016.fixrepository.Synchronization
	 * @see #isSetSync()
	 * @see #unsetSync()
	 * @see #getSync()
	 * @generated
	 */
  void setSync(Synchronization value);

  /**
	 * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.ResponseType#getSync <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetSync()
	 * @see #getSync()
	 * @see #setSync(Synchronization)
	 * @generated
	 */
  void unsetSync();

  /**
	 * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.ResponseType#getSync <em>Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sync</em>' attribute is set.
	 * @see #unsetSync()
	 * @see #getSync()
	 * @see #setSync(Synchronization)
	 * @generated
	 */
  boolean isSetSync();

} // ResponseType
