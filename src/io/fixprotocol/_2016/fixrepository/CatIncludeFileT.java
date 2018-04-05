/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cat Include File T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getCatIncludeFileT()
 * @model extendedMetaData="name='CatIncludeFile_t'"
 * @generated
 */
public enum CatIncludeFileT implements Enumerator {
  /**
   * The '<em><b>Components</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPONENTS_VALUE
   * @generated
   * @ordered
   */
  COMPONENTS(0, "components", "components"),

  /**
   * The '<em><b>Fields</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELDS_VALUE
   * @generated
   * @ordered
   */
  FIELDS(1, "fields", "fields");

  /**
   * The '<em><b>Components</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Components</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPONENTS
   * @model name="components"
   * @generated
   * @ordered
   */
  public static final int COMPONENTS_VALUE = 0;

  /**
   * The '<em><b>Fields</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fields</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIELDS
   * @model name="fields"
   * @generated
   * @ordered
   */
  public static final int FIELDS_VALUE = 1;

  /**
   * An array of all the '<em><b>Cat Include File T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CatIncludeFileT[] VALUES_ARRAY =
    new CatIncludeFileT[] {
      COMPONENTS,
      FIELDS,
    };

  /**
   * A public read-only list of all the '<em><b>Cat Include File T</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CatIncludeFileT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Cat Include File T</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CatIncludeFileT get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CatIncludeFileT result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cat Include File T</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CatIncludeFileT getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CatIncludeFileT result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cat Include File T</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CatIncludeFileT get(int value) {
    switch (value) {
      case COMPONENTS_VALUE: return COMPONENTS;
      case FIELDS_VALUE: return FIELDS;
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
  private CatIncludeFileT(int value, String name, String literal) {
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
  
} //CatIncludeFileT
