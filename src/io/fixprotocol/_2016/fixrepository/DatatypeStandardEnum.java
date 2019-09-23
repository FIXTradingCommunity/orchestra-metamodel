/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datatype Standard Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getDatatypeStandardEnum()
 * @model extendedMetaData="name='datatypeStandard_enum'"
 * @generated
 */
public enum DatatypeStandardEnum implements Enumerator {
  /**
   * The '<em><b>ISO11404</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * General Purpose Datatypes
   * <!-- end-model-doc -->
   * @see #ISO11404_VALUE
   * @generated
   * @ordered
   */
  ISO11404(0, "ISO11404", "ISO11404"),

  /**
   * The '<em><b>GPB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Google Protocol Buffers
   * <!-- end-model-doc -->
   * @see #GPB_VALUE
   * @generated
   * @ordered
   */
  GPB(1, "GPB", "GPB"),

  /**
   * The '<em><b>JSON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * JSON Schema
   * <!-- end-model-doc -->
   * @see #JSON_VALUE
   * @generated
   * @ordered
   */
  JSON(2, "JSON", "JSON"),

  /**
   * The '<em><b>SBE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Simple Binary Encoding
   * <!-- end-model-doc -->
   * @see #SBE_VALUE
   * @generated
   * @ordered
   */
  SBE(3, "SBE", "SBE"),

  /**
   * The '<em><b>XML</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * XML Schema and FIXML
   * <!-- end-model-doc -->
   * @see #XML_VALUE
   * @generated
   * @ordered
   */
  XML(4, "XML", "XML"), /**
   * The '<em><b>TAGVALUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * FIX classic encoding
   * <!-- end-model-doc -->
   * @see #TAGVALUE_VALUE
   * @generated
   * @ordered
   */
  TAGVALUE(5, "TAGVALUE", "TAG_VALUE");

  /**
   * The '<em><b>ISO11404</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * General Purpose Datatypes
   * <!-- end-model-doc -->
   * @see #ISO11404
   * @model
   * @generated
   * @ordered
   */
  public static final int ISO11404_VALUE = 0;

  /**
   * The '<em><b>GPB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Google Protocol Buffers
   * <!-- end-model-doc -->
   * @see #GPB
   * @model
   * @generated
   * @ordered
   */
  public static final int GPB_VALUE = 1;

  /**
   * The '<em><b>JSON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * JSON Schema
   * <!-- end-model-doc -->
   * @see #JSON
   * @model
   * @generated
   * @ordered
   */
  public static final int JSON_VALUE = 2;

  /**
   * The '<em><b>SBE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Simple Binary Encoding
   * <!-- end-model-doc -->
   * @see #SBE
   * @model
   * @generated
   * @ordered
   */
  public static final int SBE_VALUE = 3;

  /**
   * The '<em><b>XML</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * XML Schema and FIXML
   * <!-- end-model-doc -->
   * @see #XML
   * @model
   * @generated
   * @ordered
   */
  public static final int XML_VALUE = 4;

  /**
   * The '<em><b>TAGVALUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * FIX classic encoding
   * <!-- end-model-doc -->
   * @see #TAGVALUE
   * @model literal="TAG_VALUE"
   * @generated
   * @ordered
   */
  public static final int TAGVALUE_VALUE = 5;

  /**
   * An array of all the '<em><b>Datatype Standard Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DatatypeStandardEnum[] VALUES_ARRAY =
    new DatatypeStandardEnum[] {
      ISO11404,
      GPB,
      JSON,
      SBE,
      XML,
      TAGVALUE,
    };

  /**
   * A public read-only list of all the '<em><b>Datatype Standard Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DatatypeStandardEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Datatype Standard Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatatypeStandardEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      DatatypeStandardEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype Standard Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatatypeStandardEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      DatatypeStandardEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Datatype Standard Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatatypeStandardEnum get(int value) {
    switch (value) {
      case ISO11404_VALUE: return ISO11404;
      case GPB_VALUE: return GPB;
      case JSON_VALUE: return JSON;
      case SBE_VALUE: return SBE;
      case XML_VALUE: return XML;
      case TAGVALUE_VALUE: return TAGVALUE;
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
  private DatatypeStandardEnum(int value, String name, String literal) {
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
  
} //DatatypeStandardEnum
