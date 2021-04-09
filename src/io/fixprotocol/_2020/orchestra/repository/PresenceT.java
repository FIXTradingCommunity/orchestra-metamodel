/**
 */
package io.fixprotocol._2020.orchestra.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Presence T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getPresenceT()
 * @model extendedMetaData="name='presence_t'"
 * @generated
 */
public enum PresenceT implements Enumerator {
  /**
   * The '<em><b>Optional</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MAY be present; it may be conditionally required based on a rule.
   * <!-- end-model-doc -->
   * @see #OPTIONAL_VALUE
   * @generated
   * @ordered
   */
  OPTIONAL(0, "optional", "optional"),

  /**
   * The '<em><b>Required</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MUST be present.
   * <!-- end-model-doc -->
   * @see #REQUIRED_VALUE
   * @generated
   * @ordered
   */
  REQUIRED(1, "required", "required"),

  /**
   * The '<em><b>Forbidden</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MUST NOT be present.
   * <!-- end-model-doc -->
   * @see #FORBIDDEN_VALUE
   * @generated
   * @ordered
   */
  FORBIDDEN(2, "forbidden", "forbidden"),

  /**
   * The '<em><b>Ignored</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MAY be present but is not validated.
   * <!-- end-model-doc -->
   * @see #IGNORED_VALUE
   * @generated
   * @ordered
   */
  IGNORED(3, "ignored", "ignored"),

  /**
   * The '<em><b>Constant</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field has a constant value; in some encodings it need not be sent on the wire.
   * <!-- end-model-doc -->
   * @see #CONSTANT_VALUE
   * @generated
   * @ordered
   */
  CONSTANT(4, "constant", "constant");

  /**
   * The '<em><b>Optional</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MAY be present; it may be conditionally required based on a rule.
   * <!-- end-model-doc -->
   * @see #OPTIONAL
   * @model name="optional"
   * @generated
   * @ordered
   */
  public static final int OPTIONAL_VALUE = 0;

  /**
   * The '<em><b>Required</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MUST be present.
   * <!-- end-model-doc -->
   * @see #REQUIRED
   * @model name="required"
   * @generated
   * @ordered
   */
  public static final int REQUIRED_VALUE = 1;

  /**
   * The '<em><b>Forbidden</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MUST NOT be present.
   * <!-- end-model-doc -->
   * @see #FORBIDDEN
   * @model name="forbidden"
   * @generated
   * @ordered
   */
  public static final int FORBIDDEN_VALUE = 2;

  /**
   * The '<em><b>Ignored</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field or component MAY be present but is not validated.
   * <!-- end-model-doc -->
   * @see #IGNORED
   * @model name="ignored"
   * @generated
   * @ordered
   */
  public static final int IGNORED_VALUE = 3;

  /**
   * The '<em><b>Constant</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The field has a constant value; in some encodings it need not be sent on the wire.
   * <!-- end-model-doc -->
   * @see #CONSTANT
   * @model name="constant"
   * @generated
   * @ordered
   */
  public static final int CONSTANT_VALUE = 4;

  /**
   * An array of all the '<em><b>Presence T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PresenceT[] VALUES_ARRAY =
    new PresenceT[] {
      OPTIONAL,
      REQUIRED,
      FORBIDDEN,
      IGNORED,
      CONSTANT,
    };

  /**
   * A public read-only list of all the '<em><b>Presence T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PresenceT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Presence T</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PresenceT get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      PresenceT result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Presence T</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PresenceT getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      PresenceT result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Presence T</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PresenceT get(int value) {
    switch (value) {
      case OPTIONAL_VALUE: return OPTIONAL;
      case REQUIRED_VALUE: return REQUIRED;
      case FORBIDDEN_VALUE: return FORBIDDEN;
      case IGNORED_VALUE: return IGNORED;
      case CONSTANT_VALUE: return CONSTANT;
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
  private PresenceT(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
  
} //PresenceT
