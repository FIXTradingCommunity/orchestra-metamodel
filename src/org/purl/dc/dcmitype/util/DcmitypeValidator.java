/**
 */
package org.purl.dc.dcmitype.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.purl.dc.dcmitype.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.purl.dc.dcmitype.DcmitypePackage
 * @generated
 */
public class DcmitypeValidator extends EObjectValidator {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final DcmitypeValidator INSTANCE = new DcmitypeValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.purl.dc.dcmitype";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DcmitypeValidator() {
    super();
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage() {
    return DcmitypePackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID) {
      case DcmitypePackage.DCMI_TYPE_MEMBER0:
        return validateDCMITypeMember0((DCMITypeMember0)value, diagnostics, context);
      case DcmitypePackage.DCMI_TYPE:
        return validateDCMIType((Enumerator)value, diagnostics, context);
      case DcmitypePackage.DCMI_TYPE_MEMBER0_OBJECT:
        return validateDCMITypeMember0Object((DCMITypeMember0)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDCMITypeMember0(DCMITypeMember0 dcmiTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDCMIType(Enumerator dcmiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateDCMIType_MemberTypes(dcmiType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MemberTypes constraint of '<em>DCMI Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDCMIType_MemberTypes(Enumerator dcmiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (diagnostics != null) {
      BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
      if (DcmitypePackage.Literals.DCMI_TYPE_MEMBER0.isInstance(dcmiType)) {
        if (validateDCMITypeMember0((DCMITypeMember0)dcmiType, tempDiagnostics, context)) return true;
      }
      for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
        diagnostics.add(diagnostic);
      }
    }
    else {
      if (DcmitypePackage.Literals.DCMI_TYPE_MEMBER0.isInstance(dcmiType)) {
        if (validateDCMITypeMember0((DCMITypeMember0)dcmiType, null, context)) return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDCMITypeMember0Object(DCMITypeMember0 dcmiTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //DcmitypeValidator
