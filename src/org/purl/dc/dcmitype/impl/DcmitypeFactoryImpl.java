/**
 */
package org.purl.dc.dcmitype.impl;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.purl.dc.dcmitype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcmitypeFactoryImpl extends EFactoryImpl implements DcmitypeFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DcmitypeFactory init() {
    try {
      DcmitypeFactory theDcmitypeFactory = (DcmitypeFactory)EPackage.Registry.INSTANCE.getEFactory(DcmitypePackage.eNS_URI);
      if (theDcmitypeFactory != null) {
        return theDcmitypeFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DcmitypeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DcmitypeFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case DcmitypePackage.DCMI_TYPE_MEMBER0:
        return createDCMITypeMember0FromString(eDataType, initialValue);
      case DcmitypePackage.DCMI_TYPE:
        return createDCMITypeFromString(eDataType, initialValue);
      case DcmitypePackage.DCMI_TYPE_MEMBER0_OBJECT:
        return createDCMITypeMember0ObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case DcmitypePackage.DCMI_TYPE_MEMBER0:
        return convertDCMITypeMember0ToString(eDataType, instanceValue);
      case DcmitypePackage.DCMI_TYPE:
        return convertDCMITypeToString(eDataType, instanceValue);
      case DcmitypePackage.DCMI_TYPE_MEMBER0_OBJECT:
        return convertDCMITypeMember0ObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCMITypeMember0 createDCMITypeMember0FromString(EDataType eDataType, String initialValue) {
    DCMITypeMember0 result = DCMITypeMember0.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDCMITypeMember0ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumerator createDCMITypeFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    Enumerator result = null;
    RuntimeException exception = null;
    try {
      result = (Enumerator)createDCMITypeMember0FromString(DcmitypePackage.Literals.DCMI_TYPE_MEMBER0, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
        return result;
      }
    }
    catch (RuntimeException e) {
      exception = e;
    }
    if (result != null || exception == null) return result;
    
    throw exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDCMITypeToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    if (DcmitypePackage.Literals.DCMI_TYPE_MEMBER0.isInstance(instanceValue)) {
      try {
        String value = convertDCMITypeMember0ToString(DcmitypePackage.Literals.DCMI_TYPE_MEMBER0, instanceValue);
        if (value != null) return value;
      }
      catch (Exception e) {
        // Keep trying other member types until all have failed.
      }
    }
    throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCMITypeMember0 createDCMITypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
    return createDCMITypeMember0FromString(DcmitypePackage.Literals.DCMI_TYPE_MEMBER0, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDCMITypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
    return convertDCMITypeMember0ToString(DcmitypePackage.Literals.DCMI_TYPE_MEMBER0, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DcmitypePackage getDcmitypePackage() {
    return (DcmitypePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DcmitypePackage getPackage() {
    return DcmitypePackage.eINSTANCE;
  }

} //DcmitypeFactoryImpl
