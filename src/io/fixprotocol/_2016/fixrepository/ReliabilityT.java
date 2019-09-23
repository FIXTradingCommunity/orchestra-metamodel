/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reliability T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Message delivery gurantee
 * <!-- end-model-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getReliabilityT()
 * @model extendedMetaData="name='reliability_t'"
 * @generated
 */
public enum ReliabilityT implements Enumerator {
  /**
   * The '<em><b>Best Effort</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEST_EFFORT_VALUE
   * @generated
   * @ordered
   */
  BEST_EFFORT(0, "bestEffort", "bestEffort"),

  /**
   * The '<em><b>Idempotent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IDEMPOTENT_VALUE
   * @generated
   * @ordered
   */
  IDEMPOTENT(1, "idempotent", "idempotent"),

  /**
   * The '<em><b>Recoverable</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RECOVERABLE_VALUE
   * @generated
   * @ordered
   */
  RECOVERABLE(2, "recoverable", "recoverable");

  /**
   * The '<em><b>Best Effort</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Best Effort</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEST_EFFORT
   * @model name="bestEffort"
   * @generated
   * @ordered
   */
  public static final int BEST_EFFORT_VALUE = 0;

  /**
   * The '<em><b>Idempotent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Idempotent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IDEMPOTENT
   * @model name="idempotent"
   * @generated
   * @ordered
   */
  public static final int IDEMPOTENT_VALUE = 1;

  /**
   * The '<em><b>Recoverable</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Recoverable</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RECOVERABLE
   * @model name="recoverable"
   * @generated
   * @ordered
   */
  public static final int RECOVERABLE_VALUE = 2;

  /**
   * An array of all the '<em><b>Reliability T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ReliabilityT[] VALUES_ARRAY =
    new ReliabilityT[] {
      BEST_EFFORT,
      IDEMPOTENT,
      RECOVERABLE,
    };

  /**
   * A public read-only list of all the '<em><b>Reliability T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ReliabilityT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Reliability T</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ReliabilityT get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ReliabilityT result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Reliability T</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ReliabilityT getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ReliabilityT result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Reliability T</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ReliabilityT get(int value) {
    switch (value) {
      case BEST_EFFORT_VALUE: return BEST_EFFORT;
      case IDEMPOTENT_VALUE: return IDEMPOTENT;
      case RECOVERABLE_VALUE: return RECOVERABLE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ReliabilityT(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
  
} //ReliabilityT
