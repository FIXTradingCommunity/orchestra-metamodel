/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Volume Name T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getVolumeNameT()
 * @model extendedMetaData="name='VolumeName_t'"
 * @generated
 */
public enum VolumeNameT implements Enumerator {
  /**
   * The '<em><b>Volume1</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOLUME1_VALUE
   * @generated
   * @ordered
   */
  VOLUME1(0, "Volume1", "Volume1"),

  /**
   * The '<em><b>Volume2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOLUME2_VALUE
   * @generated
   * @ordered
   */
  VOLUME2(1, "Volume2", "Volume2"),

  /**
   * The '<em><b>Volume3</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOLUME3_VALUE
   * @generated
   * @ordered
   */
  VOLUME3(2, "Volume3", "Volume3"),

  /**
   * The '<em><b>Volume4</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOLUME4_VALUE
   * @generated
   * @ordered
   */
  VOLUME4(3, "Volume4", "Volume4"),

  /**
   * The '<em><b>Volume5</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOLUME5_VALUE
   * @generated
   * @ordered
   */
  VOLUME5(4, "Volume5", "Volume5");

  /**
   * The '<em><b>Volume1</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Volume1</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VOLUME1
   * @model name="Volume1"
   * @generated
   * @ordered
   */
  public static final int VOLUME1_VALUE = 0;

  /**
   * The '<em><b>Volume2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Volume2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VOLUME2
   * @model name="Volume2"
   * @generated
   * @ordered
   */
  public static final int VOLUME2_VALUE = 1;

  /**
   * The '<em><b>Volume3</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Volume3</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VOLUME3
   * @model name="Volume3"
   * @generated
   * @ordered
   */
  public static final int VOLUME3_VALUE = 2;

  /**
   * The '<em><b>Volume4</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Volume4</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VOLUME4
   * @model name="Volume4"
   * @generated
   * @ordered
   */
  public static final int VOLUME4_VALUE = 3;

  /**
   * The '<em><b>Volume5</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Volume5</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VOLUME5
   * @model name="Volume5"
   * @generated
   * @ordered
   */
  public static final int VOLUME5_VALUE = 4;

  /**
   * An array of all the '<em><b>Volume Name T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VolumeNameT[] VALUES_ARRAY =
    new VolumeNameT[] {
      VOLUME1,
      VOLUME2,
      VOLUME3,
      VOLUME4,
      VOLUME5,
    };

  /**
   * A public read-only list of all the '<em><b>Volume Name T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VolumeNameT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Volume Name T</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static VolumeNameT get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      VolumeNameT result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Volume Name T</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static VolumeNameT getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      VolumeNameT result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Volume Name T</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static VolumeNameT get(int value) {
    switch (value) {
      case VOLUME1_VALUE: return VOLUME1;
      case VOLUME2_VALUE: return VOLUME2;
      case VOLUME3_VALUE: return VOLUME3;
      case VOLUME4_VALUE: return VOLUME4;
      case VOLUME5_VALUE: return VOLUME5;
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
  private VolumeNameT(int value, String name, String literal) {
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
  
} //VolumeNameT
