/**
 */
package org.purl.dc.terms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.purl.dc.elements._1._1.SimpleLiteral;

import org.purl.dc.terms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.purl.dc.terms.TermsPackage
 * @generated
 */
public class TermsSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TermsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsSwitch() {
    if (modelPackage == null) {
      modelPackage = TermsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case TermsPackage.BOX: {
        Box box = (Box)theEObject;
        T result = caseBox(box);
        if (result == null) result = caseSimpleLiteral(box);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.DCMI_TYPE: {
        DCMIType dcmiType = (DCMIType)theEObject;
        T result = caseDCMIType(dcmiType);
        if (result == null) result = caseSimpleLiteral(dcmiType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.DDC: {
        DDC ddc = (DDC)theEObject;
        T result = caseDDC(ddc);
        if (result == null) result = caseSimpleLiteral(ddc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER: {
        ElementOrRefinementContainer elementOrRefinementContainer = (ElementOrRefinementContainer)theEObject;
        T result = caseElementOrRefinementContainer(elementOrRefinementContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.IMT: {
        IMT imt = (IMT)theEObject;
        T result = caseIMT(imt);
        if (result == null) result = caseSimpleLiteral(imt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.ISO3166: {
        ISO3166 iso3166 = (ISO3166)theEObject;
        T result = caseISO3166(iso3166);
        if (result == null) result = caseSimpleLiteral(iso3166);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.ISO6392: {
        ISO6392 iso6392 = (ISO6392)theEObject;
        T result = caseISO6392(iso6392);
        if (result == null) result = caseSimpleLiteral(iso6392);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.ISO6393: {
        ISO6393 iso6393 = (ISO6393)theEObject;
        T result = caseISO6393(iso6393);
        if (result == null) result = caseSimpleLiteral(iso6393);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.LCC: {
        LCC lcc = (LCC)theEObject;
        T result = caseLCC(lcc);
        if (result == null) result = caseSimpleLiteral(lcc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.LCSH: {
        LCSH lcsh = (LCSH)theEObject;
        T result = caseLCSH(lcsh);
        if (result == null) result = caseSimpleLiteral(lcsh);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.MESH: {
        MESH mesh = (MESH)theEObject;
        T result = caseMESH(mesh);
        if (result == null) result = caseSimpleLiteral(mesh);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.PERIOD: {
        Period period = (Period)theEObject;
        T result = casePeriod(period);
        if (result == null) result = caseSimpleLiteral(period);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.POINT: {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = caseSimpleLiteral(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.RFC1766: {
        RFC1766 rfc1766 = (RFC1766)theEObject;
        T result = caseRFC1766(rfc1766);
        if (result == null) result = caseSimpleLiteral(rfc1766);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.RFC3066: {
        RFC3066 rfc3066 = (RFC3066)theEObject;
        T result = caseRFC3066(rfc3066);
        if (result == null) result = caseSimpleLiteral(rfc3066);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.RFC4646: {
        RFC4646 rfc4646 = (RFC4646)theEObject;
        T result = caseRFC4646(rfc4646);
        if (result == null) result = caseSimpleLiteral(rfc4646);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.TGN: {
        TGN tgn = (TGN)theEObject;
        T result = caseTGN(tgn);
        if (result == null) result = caseSimpleLiteral(tgn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.UDC: {
        UDC udc = (UDC)theEObject;
        T result = caseUDC(udc);
        if (result == null) result = caseSimpleLiteral(udc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.URI: {
        URI uri = (URI)theEObject;
        T result = caseURI(uri);
        if (result == null) result = caseSimpleLiteral(uri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TermsPackage.W3CDTF: {
        W3CDTF w3CDTF = (W3CDTF)theEObject;
        T result = caseW3CDTF(w3CDTF);
        if (result == null) result = caseSimpleLiteral(w3CDTF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBox(Box object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DCMI Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DCMI Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCMIType(DCMIType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DDC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DDC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDDC(DDC object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Or Refinement Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Or Refinement Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementOrRefinementContainer(ElementOrRefinementContainer object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IMT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IMT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIMT(IMT object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISO3166</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISO3166</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISO3166(ISO3166 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISO6392</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISO6392</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISO6392(ISO6392 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISO6393</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISO6393</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISO6393(ISO6393 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LCC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LCC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLCC(LCC object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LCSH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LCSH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLCSH(LCSH object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MESH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MESH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMESH(MESH object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Period</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePeriod(Period object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RFC1766</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RFC1766</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRFC1766(RFC1766 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RFC3066</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RFC3066</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRFC3066(RFC3066 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RFC4646</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RFC4646</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRFC4646(RFC4646 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TGN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TGN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTGN(TGN object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UDC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UDC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUDC(UDC object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURI(URI object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>W3CDTF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>W3CDTF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseW3CDTF(W3CDTF object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleLiteral(SimpleLiteral object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //TermsSwitch
