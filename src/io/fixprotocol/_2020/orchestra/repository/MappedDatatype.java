/**
 */
package io.fixprotocol._2020.orchestra.repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getExtension <em>Extension</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getBase <em>Base</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#isBuiltin <em>Builtin</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getElement <em>Element</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getParameter <em>Parameter</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getPattern <em>Pattern</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype()
 * @model extendedMetaData="name='mappedDatatype' kind='elementOnly'"
 * @generated
 */
public interface MappedDatatype extends EObject {
  /**
   * Returns the value of the '<em><b>Extension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * A datatype may be mapped to an XML snippet in the native schema belonging to its encoding standard.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extension</em>' containment reference.
   * @see #setExtension(ExtensionType)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Extension()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
   * @generated
   */
  ExtensionType getExtension();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getExtension <em>Extension</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' containment reference.
   * @see #getExtension()
   * @generated
   */
  void setExtension(ExtensionType value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Annotation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Base()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='base'"
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getBase <em>Base</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' attribute.
   * @see #isSetBuiltin()
   * @see #unsetBuiltin()
   * @see #setBuiltin(boolean)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Builtin()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='builtin'"
   * @generated
   */
  boolean isBuiltin();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#isBuiltin <em>Builtin</em>}' attribute.
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
   * Unsets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#isBuiltin <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetBuiltin()
   * @see #isBuiltin()
   * @see #setBuiltin(boolean)
   * @generated
   */
  void unsetBuiltin();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#isBuiltin <em>Builtin</em>}' attribute is set.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Element()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='element'"
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getElement <em>Element</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_MaxInclusive()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='maxInclusive'"
   * @generated
   */
  String getMaxInclusive();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMaxInclusive <em>Max Inclusive</em>}' attribute.
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
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_MinInclusive()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='minInclusive'"
   * @generated
   */
  String getMinInclusive();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMinInclusive <em>Min Inclusive</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute.
   * @see #setParameter(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Parameter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='parameter'"
   * @generated
   */
  String getParameter();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getParameter <em>Parameter</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Pattern()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='pattern'"
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getPattern <em>Pattern</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Standard</em>' attribute.
   * @see #setStandard(Object)
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage#getMappedDatatype_Standard()
   * @model dataType="io.fixprotocol._2020.orchestra.repository.DatatypeStandardT" required="true"
   *        extendedMetaData="kind='attribute' name='standard'"
   * @generated
   */
  Object getStandard();

  /**
   * Sets the value of the '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getStandard <em>Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Standard</em>' attribute.
   * @see #getStandard()
   * @generated
   */
  void setStandard(Object value);

} // MappedDatatype
