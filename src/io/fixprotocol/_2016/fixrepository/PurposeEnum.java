/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Purpose Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Recommended annotation purposes
 * <!-- end-model-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getPurposeEnum()
 * @model extendedMetaData="name='purpose_enum'"
 * @generated
 */
public enum PurposeEnum implements Enumerator {
  /**
	 * The '<em><b>SYNOPSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SYNOPSIS_VALUE
	 * @generated
	 * @ordered
	 */
  SYNOPSIS(0, "SYNOPSIS", "SYNOPSIS"),

  /**
	 * The '<em><b>ELABORATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ELABORATION_VALUE
	 * @generated
	 * @ordered
	 */
  ELABORATION(1, "ELABORATION", "ELABORATION"),

  /**
	 * The '<em><b>EXAMPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #EXAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
  EXAMPLE(2, "EXAMPLE", "EXAMPLE"),

  /**
	 * The '<em><b>DISPLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For UI when different from canonical name; may
	 * 						have multi-language displays
	 * 					
	 * <!-- end-model-doc -->
	 * @see #DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
  DISPLAY(3, "DISPLAY", "DISPLAY");

  /**
	 * The '<em><b>SYNOPSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYNOPSIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SYNOPSIS
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int SYNOPSIS_VALUE = 0;

  /**
	 * The '<em><b>ELABORATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ELABORATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ELABORATION
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int ELABORATION_VALUE = 1;

  /**
	 * The '<em><b>EXAMPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXAMPLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #EXAMPLE
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int EXAMPLE_VALUE = 2;

  /**
	 * The '<em><b>DISPLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For UI when different from canonical name; may
	 * 						have multi-language displays
	 * 					
	 * <!-- end-model-doc -->
	 * @see #DISPLAY
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int DISPLAY_VALUE = 3;

  /**
	 * An array of all the '<em><b>Purpose Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final PurposeEnum[] VALUES_ARRAY =
    new PurposeEnum[] {
			SYNOPSIS,
			ELABORATION,
			EXAMPLE,
			DISPLAY,
		};

  /**
	 * A public read-only list of all the '<em><b>Purpose Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<PurposeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Purpose Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static PurposeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PurposeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Purpose Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static PurposeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PurposeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Purpose Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static PurposeEnum get(int value) {
		switch (value) {
			case SYNOPSIS_VALUE: return SYNOPSIS;
			case ELABORATION_VALUE: return ELABORATION;
			case EXAMPLE_VALUE: return EXAMPLE;
			case DISPLAY_VALUE: return DISPLAY;
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
  private PurposeEnum(int value, String name, String literal) {
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
  
} //PurposeEnum
