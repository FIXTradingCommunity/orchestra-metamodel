/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Support Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Support level
 * <!-- end-model-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getSupportType()
 * @model extendedMetaData="name='supportType'"
 * @generated
 */
public enum SupportType implements Enumerator {
  /**
   * The '<em><b>Supported</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPPORTED_VALUE
   * @generated
   * @ordered
   */
  SUPPORTED(0, "supported", "supported"),

  /**
   * The '<em><b>Forbidden</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FORBIDDEN_VALUE
   * @generated
   * @ordered
   */
  FORBIDDEN(1, "forbidden", "forbidden"),

  /**
   * The '<em><b>Ignored</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IGNORED_VALUE
   * @generated
   * @ordered
   */
  IGNORED(2, "ignored", "ignored");

  /**
   * The '<em><b>Supported</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Supported</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUPPORTED
   * @model name="supported"
   * @generated
   * @ordered
   */
  public static final int SUPPORTED_VALUE = 0;

  /**
   * The '<em><b>Forbidden</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Forbidden</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FORBIDDEN
   * @model name="forbidden"
   * @generated
   * @ordered
   */
  public static final int FORBIDDEN_VALUE = 1;

  /**
   * The '<em><b>Ignored</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ignored</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IGNORED
   * @model name="ignored"
   * @generated
   * @ordered
   */
  public static final int IGNORED_VALUE = 2;

  /**
   * An array of all the '<em><b>Support Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SupportType[] VALUES_ARRAY =
    new SupportType[] {
      SUPPORTED,
      FORBIDDEN,
      IGNORED,
    };

  /**
   * A public read-only list of all the '<em><b>Support Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SupportType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Support Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SupportType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SupportType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Support Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SupportType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SupportType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Support Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SupportType get(int value) {
    switch (value) {
      case SUPPORTED_VALUE: return SUPPORTED;
      case FORBIDDEN_VALUE: return FORBIDDEN;
      case IGNORED_VALUE: return IGNORED;
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
  private SupportType(int value, String name, String literal) {
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
  
} //SupportType
