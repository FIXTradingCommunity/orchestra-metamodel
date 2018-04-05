/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbreviations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.AbbreviationsType#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.AbbreviationsType#getLatestEP <em>Latest EP</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAbbreviationsType()
 * @model extendedMetaData="name='abbreviations_._type' kind='elementOnly'"
 * @generated
 */
public interface AbbreviationsType extends EObject {
  /**
   * Returns the value of the '<em><b>Abbreviation</b></em>' containment reference list.
   * The list contents are of type {@link io.fixprotocol._2016.fixrepository.AbbreviationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbreviation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abbreviation</em>' containment reference list.
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAbbreviationsType_Abbreviation()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='abbreviation' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbbreviationType> getAbbreviation();

  /**
   * Returns the value of the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latest EP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Latest EP</em>' attribute.
   * @see #setLatestEP(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getAbbreviationsType_LatestEP()
   * @model dataType="io.fixprotocol._2016.fixrepository.EPT"
   *        extendedMetaData="kind='attribute' name='latestEP'"
   * @generated
   */
  BigInteger getLatestEP();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.AbbreviationsType#getLatestEP <em>Latest EP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Latest EP</em>' attribute.
   * @see #getLatestEP()
   * @generated
   */
  void setLatestEP(BigInteger value);

} // AbbreviationsType
