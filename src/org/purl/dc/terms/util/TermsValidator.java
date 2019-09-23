/**
 */
package org.purl.dc.terms.util;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.purl.dc.dcmitype.util.DcmitypeValidator;
import org.purl.dc.terms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.purl.dc.terms.TermsPackage
 * @generated
 */
public class TermsValidator extends EObjectValidator {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final TermsValidator INSTANCE = new TermsValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.purl.dc.terms";

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
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DcmitypeValidator dcmitypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsValidator() {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
    dcmitypeValidator = DcmitypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage() {
    return TermsPackage.eINSTANCE;
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
      case TermsPackage.BOX:
        return validateBox((Box)value, diagnostics, context);
      case TermsPackage.DCMI_TYPE:
        return validateDCMIType((DCMIType)value, diagnostics, context);
      case TermsPackage.DDC:
        return validateDDC((DDC)value, diagnostics, context);
      case TermsPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER:
        return validateElementOrRefinementContainer((ElementOrRefinementContainer)value, diagnostics, context);
      case TermsPackage.IMT:
        return validateIMT((IMT)value, diagnostics, context);
      case TermsPackage.ISO3166:
        return validateISO3166((ISO3166)value, diagnostics, context);
      case TermsPackage.ISO6392:
        return validateISO6392((ISO6392)value, diagnostics, context);
      case TermsPackage.ISO6393:
        return validateISO6393((ISO6393)value, diagnostics, context);
      case TermsPackage.LCC:
        return validateLCC((LCC)value, diagnostics, context);
      case TermsPackage.LCSH:
        return validateLCSH((LCSH)value, diagnostics, context);
      case TermsPackage.MESH:
        return validateMESH((MESH)value, diagnostics, context);
      case TermsPackage.PERIOD:
        return validatePeriod((Period)value, diagnostics, context);
      case TermsPackage.POINT:
        return validatePoint((Point)value, diagnostics, context);
      case TermsPackage.RFC1766:
        return validateRFC1766((RFC1766)value, diagnostics, context);
      case TermsPackage.RFC3066:
        return validateRFC3066((RFC3066)value, diagnostics, context);
      case TermsPackage.RFC4646:
        return validateRFC4646((RFC4646)value, diagnostics, context);
      case TermsPackage.TGN:
        return validateTGN((TGN)value, diagnostics, context);
      case TermsPackage.UDC:
        return validateUDC((UDC)value, diagnostics, context);
      case TermsPackage.URI:
        return validateURI((URI)value, diagnostics, context);
      case TermsPackage.W3CDTF:
        return validateW3CDTF((W3CDTF)value, diagnostics, context);
      case TermsPackage.BOX_BASE_BASE:
        return validateBoxBaseBase((String)value, diagnostics, context);
      case TermsPackage.DCMI_TYPE_BASE_BASE:
        return validateDCMITypeBaseBase((Enumerator)value, diagnostics, context);
      case TermsPackage.DDC_BASE_BASE:
        return validateDDCBaseBase((String)value, diagnostics, context);
      case TermsPackage.IMT_BASE_BASE:
        return validateIMTBaseBase((String)value, diagnostics, context);
      case TermsPackage.ISO3166_BASE_BASE:
        return validateISO3166BaseBase((String)value, diagnostics, context);
      case TermsPackage.ISO6392_BASE_BASE:
        return validateISO6392BaseBase((String)value, diagnostics, context);
      case TermsPackage.ISO6393_BASE_BASE:
        return validateISO6393BaseBase((String)value, diagnostics, context);
      case TermsPackage.LCC_BASE_BASE:
        return validateLCCBaseBase((String)value, diagnostics, context);
      case TermsPackage.LCSH_BASE_BASE:
        return validateLCSHBaseBase((String)value, diagnostics, context);
      case TermsPackage.MESH_BASE_BASE:
        return validateMESHBaseBase((String)value, diagnostics, context);
      case TermsPackage.PERIOD_BASE_BASE:
        return validatePeriodBaseBase((String)value, diagnostics, context);
      case TermsPackage.POINT_BASE_BASE:
        return validatePointBaseBase((String)value, diagnostics, context);
      case TermsPackage.RFC1766_BASE_BASE:
        return validateRFC1766BaseBase((String)value, diagnostics, context);
      case TermsPackage.RFC3066_BASE_BASE:
        return validateRFC3066BaseBase((String)value, diagnostics, context);
      case TermsPackage.RFC4646_BASE_BASE:
        return validateRFC4646BaseBase((String)value, diagnostics, context);
      case TermsPackage.TGN_BASE_BASE:
        return validateTGNBaseBase((String)value, diagnostics, context);
      case TermsPackage.UDC_BASE_BASE:
        return validateUDCBaseBase((String)value, diagnostics, context);
      case TermsPackage.URI_BASE_BASE:
        return validateURIBaseBase((String)value, diagnostics, context);
      case TermsPackage.W3CDTF_BASE_BASE:
        return validateW3CDTFBaseBase((XMLGregorianCalendar)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBox(Box box, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(box, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDCMIType(DCMIType dcmiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(dcmiType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDDC(DDC ddc, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(ddc, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateElementOrRefinementContainer(ElementOrRefinementContainer elementOrRefinementContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(elementOrRefinementContainer, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIMT(IMT imt, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(imt, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateISO3166(ISO3166 iso3166, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(iso3166, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateISO6392(ISO6392 iso6392, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(iso6392, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateISO6393(ISO6393 iso6393, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(iso6393, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLCC(LCC lcc, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lcc, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLCSH(LCSH lcsh, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(lcsh, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMESH(MESH mesh, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(mesh, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(period, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePoint(Point point, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(point, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRFC1766(RFC1766 rfc1766, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rfc1766, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRFC3066(RFC3066 rfc3066, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rfc3066, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRFC4646(RFC4646 rfc4646, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(rfc4646, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTGN(TGN tgn, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(tgn, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUDC(UDC udc, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(udc, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateURI(URI uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(uri, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateW3CDTF(W3CDTF w3CDTF, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(w3CDTF, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBoxBaseBase(String boxBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDCMITypeBaseBase(Enumerator dcmiTypeBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = dcmitypeValidator.validateDCMIType_MemberTypes(dcmiTypeBaseBase, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDDCBaseBase(String ddcBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIMTBaseBase(String imtBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateISO3166BaseBase(String iso3166BaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateISO6392BaseBase(String iso6392BaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateISO6393BaseBase(String iso6393BaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLCCBaseBase(String lccBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLCSHBaseBase(String lcshBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMESHBaseBase(String meshBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePeriodBaseBase(String periodBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePointBaseBase(String pointBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRFC1766BaseBase(String rfc1766BaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateLanguage_Pattern(rfc1766BaseBase, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRFC3066BaseBase(String rfc3066BaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateLanguage_Pattern(rfc3066BaseBase, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRFC4646BaseBase(String rfc4646BaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateLanguage_Pattern(rfc4646BaseBase, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTGNBaseBase(String tgnBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUDCBaseBase(String udcBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateURIBaseBase(String uriBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateW3CDTFBaseBase(XMLGregorianCalendar w3CDTFBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateW3CDTFBaseBase_MemberTypes(w3CDTFBaseBase, diagnostics, context);
    return result;
  }

  /**
   * Validates the MemberTypes constraint of '<em>W3CDTF Base Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateW3CDTFBaseBase_MemberTypes(XMLGregorianCalendar w3CDTFBaseBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (diagnostics != null) {
      BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
      if (XMLTypePackage.Literals.GYEAR.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateGYear(w3CDTFBaseBase, tempDiagnostics, context)) return true;
      }
      if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateGYearMonth(w3CDTFBaseBase, tempDiagnostics, context)) return true;
      }
      if (XMLTypePackage.Literals.DATE.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateDate(w3CDTFBaseBase, tempDiagnostics, context)) return true;
      }
      if (XMLTypePackage.Literals.DATE_TIME.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateDateTime(w3CDTFBaseBase, tempDiagnostics, context)) return true;
      }
      for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
        diagnostics.add(diagnostic);
      }
    }
    else {
      if (XMLTypePackage.Literals.GYEAR.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateGYear(w3CDTFBaseBase, null, context)) return true;
      }
      if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateGYearMonth(w3CDTFBaseBase, null, context)) return true;
      }
      if (XMLTypePackage.Literals.DATE.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateDate(w3CDTFBaseBase, null, context)) return true;
      }
      if (XMLTypePackage.Literals.DATE_TIME.isInstance(w3CDTFBaseBase)) {
        if (xmlTypeValidator.validateDateTime(w3CDTFBaseBase, null, context)) return true;
      }
    }
    return false;
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

} //TermsValidator
