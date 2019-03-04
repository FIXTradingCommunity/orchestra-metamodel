/**
 */
package io.fixprotocol._2016.fixrepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Section IDT</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getSectionIDT()
 * @model extendedMetaData="name='SectionID_t'"
 * @generated
 */
public enum SectionIDT implements Enumerator {
  /**
	 * The '<em><b>Session</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SESSION_VALUE
	 * @generated
	 * @ordered
	 */
  SESSION(0, "Session", "Session"),

  /**
	 * The '<em><b>Pre Trade</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PRE_TRADE_VALUE
	 * @generated
	 * @ordered
	 */
  PRE_TRADE(1, "PreTrade", "PreTrade"),

  /**
	 * The '<em><b>Trade</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TRADE_VALUE
	 * @generated
	 * @ordered
	 */
  TRADE(2, "Trade", "Trade"),

  /**
	 * The '<em><b>Post Trade</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #POST_TRADE_VALUE
	 * @generated
	 * @ordered
	 */
  POST_TRADE(3, "PostTrade", "PostTrade"),

  /**
	 * The '<em><b>Infrastructure</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #INFRASTRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
  INFRASTRUCTURE(4, "Infrastructure", "Infrastructure"),

  /**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
  OTHER(5, "Other", "Other");

  /**
	 * The '<em><b>Session</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Session</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SESSION
	 * @model name="Session"
	 * @generated
	 * @ordered
	 */
  public static final int SESSION_VALUE = 0;

  /**
	 * The '<em><b>Pre Trade</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pre Trade</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PRE_TRADE
	 * @model name="PreTrade"
	 * @generated
	 * @ordered
	 */
  public static final int PRE_TRADE_VALUE = 1;

  /**
	 * The '<em><b>Trade</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Trade</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TRADE
	 * @model name="Trade"
	 * @generated
	 * @ordered
	 */
  public static final int TRADE_VALUE = 2;

  /**
	 * The '<em><b>Post Trade</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Post Trade</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #POST_TRADE
	 * @model name="PostTrade"
	 * @generated
	 * @ordered
	 */
  public static final int POST_TRADE_VALUE = 3;

  /**
	 * The '<em><b>Infrastructure</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Infrastructure</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #INFRASTRUCTURE
	 * @model name="Infrastructure"
	 * @generated
	 * @ordered
	 */
  public static final int INFRASTRUCTURE_VALUE = 4;

  /**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
  public static final int OTHER_VALUE = 5;

  /**
	 * An array of all the '<em><b>Section IDT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final SectionIDT[] VALUES_ARRAY =
    new SectionIDT[] {
			SESSION,
			PRE_TRADE,
			TRADE,
			POST_TRADE,
			INFRASTRUCTURE,
			OTHER,
		};

  /**
	 * A public read-only list of all the '<em><b>Section IDT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<SectionIDT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Section IDT</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static SectionIDT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionIDT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Section IDT</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static SectionIDT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionIDT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Section IDT</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static SectionIDT get(int value) {
		switch (value) {
			case SESSION_VALUE: return SESSION;
			case PRE_TRADE_VALUE: return PRE_TRADE;
			case TRADE_VALUE: return TRADE;
			case POST_TRADE_VALUE: return POST_TRADE;
			case INFRASTRUCTURE_VALUE: return INFRASTRUCTURE;
			case OTHER_VALUE: return OTHER;
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
  private SectionIDT(int value, String name, String literal) {
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
  
} //SectionIDT
