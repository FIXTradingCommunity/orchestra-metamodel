/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Datatype Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getAny <em>Any</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getBase <em>Base</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#isBuiltin <em>Builtin</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getElement <em>Element</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType()
 * @model extendedMetaData="name='mappedDatatype_._type' kind='elementOnly'"
 * @generated
 */
public interface MappedDatatypeType extends EObject {
  /**
   * Returns the value of the '<em><b>Any</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' attribute list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_Any()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='skip'"
   * @generated
   */
	FeatureMap getAny();

		/**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_Base()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='base'"
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

  /**
   * Returns the value of the '<em><b>Builtin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' attribute.
   * @see #isSetBuiltin()
   * @see #unsetBuiltin()
   * @see #setBuiltin(boolean)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_Builtin()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='builtin'"
   * @generated
   */
  boolean isBuiltin();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#isBuiltin <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builtin</em>' attribute.
   * @see #isSetBuiltin()
   * @see #unsetBuiltin()
   * @see #isBuiltin()
   * @generated
   */
  void setBuiltin(boolean value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#isBuiltin <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetBuiltin()
   * @see #isBuiltin()
   * @see #setBuiltin(boolean)
   * @generated
   */
  void unsetBuiltin();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#isBuiltin <em>Builtin</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Builtin</em>' attribute is set.
   * @see #unsetBuiltin()
   * @see #isBuiltin()
   * @see #setBuiltin(boolean)
   * @generated
   */
  boolean isSetBuiltin();

  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_Element()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='element'"
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Inclusive upper bound
   * <!-- end-model-doc -->
   * @return the value of the '<em>Max Inclusive</em>' attribute.
   * @see #setMaxInclusive(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_MaxInclusive()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='maxInclusive'"
   * @generated
   */
  String getMaxInclusive();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Inclusive</em>' attribute.
   * @see #getMaxInclusive()
   * @generated
   */
  void setMaxInclusive(String value);

  /**
   * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Inclusive lower bound
   * <!-- end-model-doc -->
   * @return the value of the '<em>Min Inclusive</em>' attribute.
   * @see #setMinInclusive(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_MinInclusive()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='minInclusive'"
   * @generated
   */
  String getMinInclusive();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMinInclusive <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Inclusive</em>' attribute.
   * @see #getMinInclusive()
   * @generated
   */
  void setMinInclusive(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute.
   * @see #setParameter(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_Parameter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='parameter'"
   * @generated
   */
  String getParameter();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getParameter <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' attribute.
   * @see #getParameter()
   * @generated
   */
  void setParameter(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_Pattern()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='pattern'"
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

  /**
   * Returns the value of the '<em><b>Standard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Standard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Standard</em>' attribute.
   * @see #setStandard(Object)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getMappedDatatypeType_Standard()
   * @model dataType="io.fixprotocol._2016.fixrepository.DatatypeStandardT" required="true"
   *        extendedMetaData="kind='attribute' name='standard'"
   * @generated
   */
  Object getStandard();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getStandard <em>Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Standard</em>' attribute.
   * @see #getStandard()
   * @generated
   */
  void setStandard(Object value);

} // MappedDatatypeType
