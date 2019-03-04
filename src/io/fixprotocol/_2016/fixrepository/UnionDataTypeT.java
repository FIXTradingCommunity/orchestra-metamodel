/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Union Data Type T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getUnionDataTypeT()
 * @model extendedMetaData="name='UnionDataType_t'"
 * @generated
 */
public enum UnionDataTypeT implements Enumerator {
  /**
	 * The '<em><b>Qty</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #QTY_VALUE
	 * @generated
	 * @ordered
	 */
  QTY(0, "Qty", "Qty"),

  /**
	 * The '<em><b>Reserved100 Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #RESERVED100_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
  RESERVED100_PLUS(1, "Reserved100Plus", "Reserved100Plus"),

  /**
	 * The '<em><b>Reserved1000 Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #RESERVED1000_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
  RESERVED1000_PLUS(2, "Reserved1000Plus", "Reserved1000Plus"),

  /**
	 * The '<em><b>Reserved4000 Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #RESERVED4000_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
  RESERVED4000_PLUS(3, "Reserved4000Plus", "Reserved4000Plus"),

  /**
	 * The '<em><b>Tenor</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TENOR_VALUE
	 * @generated
	 * @ordered
	 */
  TENOR(4, "Tenor", "Tenor");

  /**
	 * The '<em><b>Qty</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Qty</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #QTY
	 * @model name="Qty"
	 * @generated
	 * @ordered
	 */
  public static final int QTY_VALUE = 0;

  /**
	 * The '<em><b>Reserved100 Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reserved100 Plus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #RESERVED100_PLUS
	 * @model name="Reserved100Plus"
	 * @generated
	 * @ordered
	 */
  public static final int RESERVED100_PLUS_VALUE = 1;

  /**
	 * The '<em><b>Reserved1000 Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reserved1000 Plus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #RESERVED1000_PLUS
	 * @model name="Reserved1000Plus"
	 * @generated
	 * @ordered
	 */
  public static final int RESERVED1000_PLUS_VALUE = 2;

  /**
	 * The '<em><b>Reserved4000 Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reserved4000 Plus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #RESERVED4000_PLUS
	 * @model name="Reserved4000Plus"
	 * @generated
	 * @ordered
	 */
  public static final int RESERVED4000_PLUS_VALUE = 3;

  /**
	 * The '<em><b>Tenor</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tenor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TENOR
	 * @model name="Tenor"
	 * @generated
	 * @ordered
	 */
  public static final int TENOR_VALUE = 4;

  /**
	 * An array of all the '<em><b>Union Data Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final UnionDataTypeT[] VALUES_ARRAY =
    new UnionDataTypeT[] {
			QTY,
			RESERVED100_PLUS,
			RESERVED1000_PLUS,
			RESERVED4000_PLUS,
			TENOR,
		};

  /**
	 * A public read-only list of all the '<em><b>Union Data Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<UnionDataTypeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Union Data Type T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static UnionDataTypeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnionDataTypeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Union Data Type T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static UnionDataTypeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnionDataTypeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Union Data Type T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static UnionDataTypeT get(int value) {
		switch (value) {
			case QTY_VALUE: return QTY;
			case RESERVED100_PLUS_VALUE: return RESERVED100_PLUS;
			case RESERVED1000_PLUS_VALUE: return RESERVED1000_PLUS;
			case RESERVED4000_PLUS_VALUE: return RESERVED4000_PLUS;
			case TENOR_VALUE: return TENOR;
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
  private UnionDataTypeT(int value, String name, String literal) {
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
  
} //UnionDataTypeT
