/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getWhen <em>When</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getName <em>Name</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getPresence <em>Presence</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRuleType()
 * @model extendedMetaData="name='componentRuleType' kind='elementOnly'"
 * @generated
 */
public interface ComponentRuleType extends EObject {
  /**
   * Returns the value of the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' attribute.
   * @see #setWhen(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRuleType_When()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.ExpressionType" required="true"
   *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
   * @generated
   */
  String getWhen();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getWhen <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' attribute.
   * @see #getWhen()
   * @generated
   */
  void setWhen(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Name of this rule
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRuleType_Name()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.NameT"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Presence</b></em>' attribute.
   * The literals are from the enumeration {@link io.fixprotocol._2020.orchestra.repository.PresenceT}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Overrides presence when expression is true
   * <!-- end-model-doc -->
   * @return the value of the '<em>Presence</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @see #isSetPresence()
   * @see #unsetPresence()
   * @see #setPresence(PresenceT)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getComponentRuleType_Presence()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='presence'"
   * @generated
   */
  PresenceT getPresence();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getPresence <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Presence</em>' attribute.
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @see #isSetPresence()
   * @see #unsetPresence()
   * @see #getPresence()
   * @generated
   */
  void setPresence(PresenceT value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getPresence <em>Presence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPresence()
   * @see #getPresence()
   * @see #setPresence(PresenceT)
   * @generated
   */
  void unsetPresence();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getPresence <em>Presence</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Presence</em>' attribute is set.
   * @see #unsetPresence()
   * @see #getPresence()
   * @see #setPresence(PresenceT)
   * @generated
   */
  boolean isSetPresence();

} // ComponentRuleType
