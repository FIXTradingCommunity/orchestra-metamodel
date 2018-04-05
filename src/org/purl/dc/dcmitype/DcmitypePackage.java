/**
 */
package org.purl.dc.dcmitype;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       DCMI Type Vocabulary XML Schema
 *       XML Schema for http://purl.org/dc/dcmitype/ namespace
 * 
 *       Created 2008-02-11
 * 
 *       Created by 
 * 
 *       Tim Cole (t-cole3@uiuc.edu)
 *       Tom Habing (thabing@uiuc.edu)
 *       Jane Hunter (jane@dstc.edu.au)
 *       Pete Johnston (p.johnston@ukoln.ac.uk),
 *       Carl Lagoze (lagoze@cs.cornell.edu)
 * 
 *       This schema defines a simpleType which enumerates
 *       the allowable values for the DCMI Type Vocabulary.
 *     
 * <!-- end-model-doc -->
 * @see org.purl.dc.dcmitype.DcmitypeFactory
 * @model kind="package"
 * @generated
 */
public interface DcmitypePackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dcmitype";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://purl.org/dc/dcmitype/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dcmitype";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DcmitypePackage eINSTANCE = org.purl.dc.dcmitype.impl.DcmitypePackageImpl.init();

  /**
   * The meta object id for the '{@link org.purl.dc.dcmitype.DCMITypeMember0 <em>DCMI Type Member0</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.dcmitype.DCMITypeMember0
   * @see org.purl.dc.dcmitype.impl.DcmitypePackageImpl#getDCMITypeMember0()
   * @generated
   */
  int DCMI_TYPE_MEMBER0 = 0;

  /**
   * The meta object id for the '<em>DCMI Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Enumerator
   * @see org.purl.dc.dcmitype.impl.DcmitypePackageImpl#getDCMIType()
   * @generated
   */
  int DCMI_TYPE = 1;

  /**
   * The meta object id for the '<em>DCMI Type Member0 Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.dcmitype.DCMITypeMember0
   * @see org.purl.dc.dcmitype.impl.DcmitypePackageImpl#getDCMITypeMember0Object()
   * @generated
   */
  int DCMI_TYPE_MEMBER0_OBJECT = 2;


  /**
   * Returns the meta object for enum '{@link org.purl.dc.dcmitype.DCMITypeMember0 <em>DCMI Type Member0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DCMI Type Member0</em>'.
   * @see org.purl.dc.dcmitype.DCMITypeMember0
   * @generated
   */
  EEnum getDCMITypeMember0();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>DCMI Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>DCMI Type</em>'.
   * @see org.eclipse.emf.common.util.Enumerator
   * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
   *        extendedMetaData="name='DCMIType' memberTypes='DCMIType_._member_._0'"
   * @generated
   */
  EDataType getDCMIType();

  /**
   * Returns the meta object for data type '{@link org.purl.dc.dcmitype.DCMITypeMember0 <em>DCMI Type Member0 Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>DCMI Type Member0 Object</em>'.
   * @see org.purl.dc.dcmitype.DCMITypeMember0
   * @model instanceClass="org.purl.dc.dcmitype.DCMITypeMember0"
   *        extendedMetaData="name='DCMIType_._member_._0:Object' baseType='DCMIType_._member_._0'"
   * @generated
   */
  EDataType getDCMITypeMember0Object();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DcmitypeFactory getDcmitypeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.purl.dc.dcmitype.DCMITypeMember0 <em>DCMI Type Member0</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.dcmitype.DCMITypeMember0
     * @see org.purl.dc.dcmitype.impl.DcmitypePackageImpl#getDCMITypeMember0()
     * @generated
     */
    EEnum DCMI_TYPE_MEMBER0 = eINSTANCE.getDCMITypeMember0();

    /**
     * The meta object literal for the '<em>DCMI Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Enumerator
     * @see org.purl.dc.dcmitype.impl.DcmitypePackageImpl#getDCMIType()
     * @generated
     */
    EDataType DCMI_TYPE = eINSTANCE.getDCMIType();

    /**
     * The meta object literal for the '<em>DCMI Type Member0 Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.dcmitype.DCMITypeMember0
     * @see org.purl.dc.dcmitype.impl.DcmitypePackageImpl#getDCMITypeMember0Object()
     * @generated
     */
    EDataType DCMI_TYPE_MEMBER0_OBJECT = eINSTANCE.getDCMITypeMember0Object();

  }

} //DcmitypePackage
