/**
 */
package io.fixprotocol._2020.orchestra.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Member Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMemberType()
 * @model extendedMetaData="name='memberType'"
 * @generated
 */
public enum MemberType implements Enumerator {
  /**
   * The '<em><b>One Of</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Members are mutually exclusive; exactly one must be present.
   * <!-- end-model-doc -->
   * @see #ONE_OF_VALUE
   * @generated
   * @ordered
   */
  ONE_OF(0, "oneOf", "oneOf"),

  /**
   * The '<em><b>Any Of</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * At least one of the members must be present.
   * <!-- end-model-doc -->
   * @see #ANY_OF_VALUE
   * @generated
   * @ordered
   */
  ANY_OF(1, "anyOf", "anyOf");

  /**
   * The '<em><b>One Of</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Members are mutually exclusive; exactly one must be present.
   * <!-- end-model-doc -->
   * @see #ONE_OF
   * @model name="oneOf"
   * @generated
   * @ordered
   */
  public static final int ONE_OF_VALUE = 0;

  /**
   * The '<em><b>Any Of</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * At least one of the members must be present.
   * <!-- end-model-doc -->
   * @see #ANY_OF
   * @model name="anyOf"
   * @generated
   * @ordered
   */
  public static final int ANY_OF_VALUE = 1;

  /**
   * An array of all the '<em><b>Member Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MemberType[] VALUES_ARRAY =
    new MemberType[] {
      ONE_OF,
      ANY_OF,
    };

  /**
   * A public read-only list of all the '<em><b>Member Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MemberType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Member Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MemberType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MemberType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Member Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MemberType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MemberType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Member Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MemberType get(int value) {
    switch (value) {
      case ONE_OF_VALUE: return ONE_OF;
      case ANY_OF_VALUE: return ANY_OF;
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
  private MemberType(int value, String name, String literal) {
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
  
} //MemberType
