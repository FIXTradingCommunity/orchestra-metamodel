/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Synchronization</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getSynchronization()
 * @model extendedMetaData="name='synchronization'"
 * @generated
 */
public enum Synchronization implements Enumerator {
  /**
   * The '<em><b>Asynchronous</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Event timing is completely independent
   * <!-- end-model-doc -->
   * @see #ASYNCHRONOUS_VALUE
   * @generated
   * @ordered
   */
  ASYNCHRONOUS(0, "asynchronous", "asynchronous"),

  /**
   * The '<em><b>Synchronous</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Requests in-progress block subsequent requests
   * <!-- end-model-doc -->
   * @see #SYNCHRONOUS_VALUE
   * @generated
   * @ordered
   */
  SYNCHRONOUS(1, "synchronous", "synchronous"),

  /**
   * The '<em><b>Pipelined</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Response timing is dependent on a request, but multiple requests can be in-flight
   * <!-- end-model-doc -->
   * @see #PIPELINED_VALUE
   * @generated
   * @ordered
   */
  PIPELINED(2, "pipelined", "pipelined");

  /**
   * The '<em><b>Asynchronous</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Event timing is completely independent
   * <!-- end-model-doc -->
   * @see #ASYNCHRONOUS
   * @model name="asynchronous"
   * @generated
   * @ordered
   */
  public static final int ASYNCHRONOUS_VALUE = 0;

  /**
   * The '<em><b>Synchronous</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Requests in-progress block subsequent requests
   * <!-- end-model-doc -->
   * @see #SYNCHRONOUS
   * @model name="synchronous"
   * @generated
   * @ordered
   */
  public static final int SYNCHRONOUS_VALUE = 1;

  /**
   * The '<em><b>Pipelined</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Response timing is dependent on a request, but multiple requests can be in-flight
   * <!-- end-model-doc -->
   * @see #PIPELINED
   * @model name="pipelined"
   * @generated
   * @ordered
   */
  public static final int PIPELINED_VALUE = 2;

  /**
   * An array of all the '<em><b>Synchronization</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Synchronization[] VALUES_ARRAY =
    new Synchronization[] {
      ASYNCHRONOUS,
      SYNCHRONOUS,
      PIPELINED,
    };

  /**
   * A public read-only list of all the '<em><b>Synchronization</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Synchronization> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Synchronization</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Synchronization get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Synchronization result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Synchronization</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Synchronization getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Synchronization result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Synchronization</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Synchronization get(int value) {
    switch (value) {
      case ASYNCHRONOUS_VALUE: return ASYNCHRONOUS;
      case SYNCHRONOUS_VALUE: return SYNCHRONOUS;
      case PIPELINED_VALUE: return PIPELINED;
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
  private Synchronization(int value, String name, String literal) {
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
  
} //Synchronization
