/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MessageRefType#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MessageRefType#getId <em>Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMinOccurs <em>Impl Min Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MessageRefType#getMsgType <em>Msg Type</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MessageRefType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MessageRefType#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType()
 * @model extendedMetaData="name='messageRefType' kind='elementOnly'"
 * @generated
 */
public interface MessageRefType extends EObject {
  /**
   * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiers</em>' containment reference.
   * @see #setIdentifiers(IdentifiersType)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType_Identifiers()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='identifiers' namespace='##targetNamespace'"
   * @generated
   */
	IdentifiersType getIdentifiers();

	/**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getIdentifiers <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiers</em>' containment reference.
   * @see #getIdentifiers()
   * @generated
   */
	void setIdentifiers(IdentifiersType value);

	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Numeric identifier generally must be unique within a file for an element type, e.g. unique field tag
   * <!-- end-model-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType_Id()
   * @model dataType="io.fixprotocol._2016.fixrepository.IdT" required="true"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
	BigInteger getId();

	/**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(BigInteger value);

		/**
   * Returns the value of the '<em><b>Impl Max Occurs</b></em>' attribute.
   * The default value is <code>"unbounded"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The same message type may be sent one or more times
   * <!-- end-model-doc -->
   * @return the value of the '<em>Impl Max Occurs</em>' attribute.
   * @see #isSetImplMaxOccurs()
   * @see #unsetImplMaxOccurs()
   * @see #setImplMaxOccurs(Object)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType_ImplMaxOccurs()
   * @model default="unbounded" unsettable="true" dataType="io.fixprotocol._2016.fixrepository.UnboundedIntType"
   *        extendedMetaData="kind='attribute' name='implMaxOccurs'"
   * @generated
   */
  Object getImplMaxOccurs();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Max Occurs</em>' attribute.
   * @see #isSetImplMaxOccurs()
   * @see #unsetImplMaxOccurs()
   * @see #getImplMaxOccurs()
   * @generated
   */
  void setImplMaxOccurs(Object value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetImplMaxOccurs()
   * @see #getImplMaxOccurs()
   * @see #setImplMaxOccurs(Object)
   * @generated
   */
  void unsetImplMaxOccurs();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Impl Max Occurs</em>' attribute is set.
   * @see #unsetImplMaxOccurs()
   * @see #getImplMaxOccurs()
   * @see #setImplMaxOccurs(Object)
   * @generated
   */
  boolean isSetImplMaxOccurs();

  /**
   * Returns the value of the '<em><b>Impl Min Occurs</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Min Occurs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Min Occurs</em>' attribute.
   * @see #isSetImplMinOccurs()
   * @see #unsetImplMinOccurs()
   * @see #setImplMinOccurs(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType_ImplMinOccurs()
   * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
   *        extendedMetaData="kind='attribute' name='implMinOccurs'"
   * @generated
   */
  BigInteger getImplMinOccurs();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMinOccurs <em>Impl Min Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Min Occurs</em>' attribute.
   * @see #isSetImplMinOccurs()
   * @see #unsetImplMinOccurs()
   * @see #getImplMinOccurs()
   * @generated
   */
  void setImplMinOccurs(BigInteger value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMinOccurs <em>Impl Min Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetImplMinOccurs()
   * @see #getImplMinOccurs()
   * @see #setImplMinOccurs(BigInteger)
   * @generated
   */
  void unsetImplMinOccurs();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMinOccurs <em>Impl Min Occurs</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Impl Min Occurs</em>' attribute is set.
   * @see #unsetImplMinOccurs()
   * @see #getImplMinOccurs()
   * @see #setImplMinOccurs(BigInteger)
   * @generated
   */
  boolean isSetImplMinOccurs();

  /**
   * Returns the value of the '<em><b>Msg Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg Type</em>' attribute.
   * @see #setMsgType(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType_MsgType()
   * @model dataType="io.fixprotocol._2016.fixrepository.MsgTypeT"
   *        extendedMetaData="kind='attribute' name='msgType'"
   * @generated
   */
  String getMsgType();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getMsgType <em>Msg Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg Type</em>' attribute.
   * @see #getMsgType()
   * @generated
   */
  void setMsgType(String value);

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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType_Name()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Scenario</b></em>' attribute.
   * The default value is <code>"base"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The use case of an element, distinguished by workflow, asset class, etc.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Scenario</em>' attribute.
   * @see #isSetScenario()
   * @see #unsetScenario()
   * @see #setScenario(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMessageRefType_Scenario()
   * @model default="base" unsettable="true" dataType="io.fixprotocol._2016.fixrepository.ScenarioT"
   *        extendedMetaData="kind='attribute' name='scenario'"
   * @generated
   */
  String getScenario();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getScenario <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' attribute.
   * @see #isSetScenario()
   * @see #unsetScenario()
   * @see #getScenario()
   * @generated
   */
  void setScenario(String value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getScenario <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetScenario()
   * @see #getScenario()
   * @see #setScenario(String)
   * @generated
   */
  void unsetScenario();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getScenario <em>Scenario</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Scenario</em>' attribute is set.
   * @see #unsetScenario()
   * @see #getScenario()
   * @see #setScenario(String)
   * @generated
   */
  boolean isSetScenario();

} // MessageRefType
