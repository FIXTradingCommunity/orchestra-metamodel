/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stream of messages in one direction
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FlowType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FlowType#getDestination <em>Destination</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FlowType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FlowType#getReliability <em>Reliability</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FlowType#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFlowType()
 * @model extendedMetaData="name='flowType' kind='elementOnly'"
 * @generated
 */
public interface FlowType extends EObject {
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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFlowType_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FlowType#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Name of the actor that receives messages.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFlowType_Destination()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='destination'"
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FlowType#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFlowType_Name()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FlowType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reliability</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.ReliabilityT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reliability</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.ReliabilityT
   * @see #isSetReliability()
   * @see #unsetReliability()
   * @see #setReliability(ReliabilityT)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFlowType_Reliability()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='reliability'"
   * @generated
   */
  ReliabilityT getReliability();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FlowType#getReliability <em>Reliability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reliability</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.ReliabilityT
   * @see #isSetReliability()
   * @see #unsetReliability()
   * @see #getReliability()
   * @generated
   */
  void setReliability(ReliabilityT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FlowType#getReliability <em>Reliability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetReliability()
   * @see #getReliability()
   * @see #setReliability(ReliabilityT)
   * @generated
   */
  void unsetReliability();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FlowType#getReliability <em>Reliability</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Reliability</em>' attribute is set.
   * @see #unsetReliability()
   * @see #getReliability()
   * @see #setReliability(ReliabilityT)
   * @generated
   */
  boolean isSetReliability();

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Name of the actor that originates messages
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFlowType_Source()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='source'"
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FlowType#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

} // FlowType
