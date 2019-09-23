/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getUnique <em>Unique</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getAssign <em>Assign</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getWhen <em>When</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplLength <em>Impl Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMaxLength <em>Impl Max Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMinLength <em>Impl Min Length</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getPresence <em>Presence</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getRendering <em>Rendering</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getType <em>Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType()
 * @model extendedMetaData="name='fieldRuleType' kind='elementOnly'"
 * @generated
 */
public interface FieldRuleType extends EObject {
  /**
   * Returns the value of the '<em><b>Unique</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' containment reference.
   * @see #setUnique(UniqueType)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Unique()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='unique' namespace='##targetNamespace'"
   * @generated
   */
  UniqueType getUnique();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getUnique <em>Unique</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' containment reference.
   * @see #getUnique()
   * @generated
   */
  void setUnique(UniqueType value);

  /**
   * Returns the value of the '<em><b>Assign</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Content of element holds an assignment expression
   * 							for a message field or state variable.
   * 							This can be used for field validation.
   * 						
   * <!-- end-model-doc -->
   * @return the value of the '<em>Assign</em>' attribute list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Assign()
   * @model unique="false" dataType="io.fixprotocol._2016.fixrepository.ExpressionType"
   *        extendedMetaData="kind='element' name='assign' namespace='##targetNamespace'"
   * @generated
   */
  EList<String> getAssign();

  /**
   * Returns the value of the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' attribute.
   * @see #setWhen(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_When()
   * @model dataType="io.fixprotocol._2016.fixrepository.ExpressionType" required="true"
   *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
   * @generated
   */
  String getWhen();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getWhen <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' attribute.
   * @see #getWhen()
   * @generated
   */
  void setWhen(String value);

  /**
   * Returns the value of the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Character encoding if other than US-ASCII
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Encoding</em>' attribute.
   * @see #setEncoding(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Encoding()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='encoding'"
   * @generated
   */
  String getEncoding();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getEncoding <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encoding</em>' attribute.
   * @see #getEncoding()
   * @generated
   */
  void setEncoding(String value);

  /**
   * Returns the value of the '<em><b>Impl Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Fixed length
   * <!-- end-model-doc -->
   * @return the value of the '<em>Impl Length</em>' attribute.
   * @see #isSetImplLength()
   * @see #unsetImplLength()
   * @see #setImplLength(short)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_ImplLength()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
   *        extendedMetaData="kind='attribute' name='implLength'"
   * @generated
   */
  short getImplLength();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplLength <em>Impl Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Length</em>' attribute.
   * @see #isSetImplLength()
   * @see #unsetImplLength()
   * @see #getImplLength()
   * @generated
   */
  void setImplLength(short value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplLength <em>Impl Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetImplLength()
   * @see #getImplLength()
   * @see #setImplLength(short)
   * @generated
   */
  void unsetImplLength();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplLength <em>Impl Length</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Impl Length</em>' attribute is set.
   * @see #unsetImplLength()
   * @see #getImplLength()
   * @see #setImplLength(short)
   * @generated
   */
  boolean isSetImplLength();

  /**
   * Returns the value of the '<em><b>Impl Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Max Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Max Length</em>' attribute.
   * @see #isSetImplMaxLength()
   * @see #unsetImplMaxLength()
   * @see #setImplMaxLength(short)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_ImplMaxLength()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
   *        extendedMetaData="kind='attribute' name='implMaxLength'"
   * @generated
   */
  short getImplMaxLength();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMaxLength <em>Impl Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Max Length</em>' attribute.
   * @see #isSetImplMaxLength()
   * @see #unsetImplMaxLength()
   * @see #getImplMaxLength()
   * @generated
   */
  void setImplMaxLength(short value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMaxLength <em>Impl Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetImplMaxLength()
   * @see #getImplMaxLength()
   * @see #setImplMaxLength(short)
   * @generated
   */
  void unsetImplMaxLength();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMaxLength <em>Impl Max Length</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Impl Max Length</em>' attribute is set.
   * @see #unsetImplMaxLength()
   * @see #getImplMaxLength()
   * @see #setImplMaxLength(short)
   * @generated
   */
  boolean isSetImplMaxLength();

  /**
   * Returns the value of the '<em><b>Impl Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Min Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Min Length</em>' attribute.
   * @see #isSetImplMinLength()
   * @see #unsetImplMinLength()
   * @see #setImplMinLength(short)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_ImplMinLength()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
   *        extendedMetaData="kind='attribute' name='implMinLength'"
   * @generated
   */
  short getImplMinLength();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMinLength <em>Impl Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Min Length</em>' attribute.
   * @see #isSetImplMinLength()
   * @see #unsetImplMinLength()
   * @see #getImplMinLength()
   * @generated
   */
  void setImplMinLength(short value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMinLength <em>Impl Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetImplMinLength()
   * @see #getImplMinLength()
   * @see #setImplMinLength(short)
   * @generated
   */
  void unsetImplMinLength();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMinLength <em>Impl Min Length</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Impl Min Length</em>' attribute is set.
   * @see #unsetImplMinLength()
   * @see #getImplMinLength()
   * @see #setImplMinLength(short)
   * @generated
   */
  boolean isSetImplMinLength();

  /**
   * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Inclusive upper bound
   * <!-- end-model-doc -->
   * @return the value of the '<em>Max Inclusive</em>' attribute.
   * @see #setMaxInclusive(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_MaxInclusive()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='maxInclusive'"
   * @generated
   */
  String getMaxInclusive();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Inclusive</em>' attribute.
   * @see #getMaxInclusive()
   * @generated
   */
  void setMaxInclusive(String value);

  /**
   * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Inclusive lower bound
   * <!-- end-model-doc -->
   * @return the value of the '<em>Min Inclusive</em>' attribute.
   * @see #setMinInclusive(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_MinInclusive()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='minInclusive'"
   * @generated
   */
  String getMinInclusive();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getMinInclusive <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Inclusive</em>' attribute.
   * @see #getMinInclusive()
   * @generated
   */
  void setMinInclusive(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Name of this rule
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Name()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Presence</b></em>' attribute.
   * The default value is <code>"optional"</code>.
   * The literals are from the enumeration {@link io.fixprotocol._2016.fixrepository.PresenceT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presence</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.PresenceT
   * @see #isSetPresence()
   * @see #unsetPresence()
   * @see #setPresence(PresenceT)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Presence()
   * @model default="optional" unsettable="true"
   *        extendedMetaData="kind='attribute' name='presence'"
   * @generated
   */
  PresenceT getPresence();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getPresence <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Presence</em>' attribute.
   * @see io.fixprotocol._2016.fixrepository.PresenceT
   * @see #isSetPresence()
   * @see #unsetPresence()
   * @see #getPresence()
   * @generated
   */
  void setPresence(PresenceT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getPresence <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPresence()
   * @see #getPresence()
   * @see #setPresence(PresenceT)
   * @generated
   */
  void unsetPresence();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getPresence <em>Presence</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Presence</em>' attribute is set.
   * @see #unsetPresence()
   * @see #getPresence()
   * @see #setPresence(PresenceT)
   * @generated
   */
  boolean isSetPresence();

  /**
   * Returns the value of the '<em><b>Rendering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * A hint to processes about how to interpret the element. Not validated.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rendering</em>' attribute.
   * @see #setRendering(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Rendering()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='rendering'"
   * @generated
   */
  String getRendering();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getRendering <em>Rendering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rendering</em>' attribute.
   * @see #getRendering()
   * @generated
   */
  void setRendering(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Overrides the type of the referenced field.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Type()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * If presence is optional, then it represents a
   * 					default when the sender does not provide the field.
   * 					If presence is constant, then it is the constant value.
   * 				
   * <!-- end-model-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getFieldRuleType_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // FieldRuleType
