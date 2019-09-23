/**
 */
package org.purl.dc.terms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.purl.dc.elements._1._1.SimpleLiteral;

import org.purl.dc.terms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.purl.dc.terms.TermsPackage
 * @generated
 */
public class TermsAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TermsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = TermsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermsSwitch<Adapter> modelSwitch =
    new TermsSwitch<Adapter>() {
      @Override
      public Adapter caseBox(Box object) {
        return createBoxAdapter();
      }
      @Override
      public Adapter caseDCMIType(DCMIType object) {
        return createDCMITypeAdapter();
      }
      @Override
      public Adapter caseDDC(DDC object) {
        return createDDCAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object) {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseElementOrRefinementContainer(ElementOrRefinementContainer object) {
        return createElementOrRefinementContainerAdapter();
      }
      @Override
      public Adapter caseIMT(IMT object) {
        return createIMTAdapter();
      }
      @Override
      public Adapter caseISO3166(ISO3166 object) {
        return createISO3166Adapter();
      }
      @Override
      public Adapter caseISO6392(ISO6392 object) {
        return createISO6392Adapter();
      }
      @Override
      public Adapter caseISO6393(ISO6393 object) {
        return createISO6393Adapter();
      }
      @Override
      public Adapter caseLCC(LCC object) {
        return createLCCAdapter();
      }
      @Override
      public Adapter caseLCSH(LCSH object) {
        return createLCSHAdapter();
      }
      @Override
      public Adapter caseMESH(MESH object) {
        return createMESHAdapter();
      }
      @Override
      public Adapter casePeriod(Period object) {
        return createPeriodAdapter();
      }
      @Override
      public Adapter casePoint(Point object) {
        return createPointAdapter();
      }
      @Override
      public Adapter caseRFC1766(RFC1766 object) {
        return createRFC1766Adapter();
      }
      @Override
      public Adapter caseRFC3066(RFC3066 object) {
        return createRFC3066Adapter();
      }
      @Override
      public Adapter caseRFC4646(RFC4646 object) {
        return createRFC4646Adapter();
      }
      @Override
      public Adapter caseTGN(TGN object) {
        return createTGNAdapter();
      }
      @Override
      public Adapter caseUDC(UDC object) {
        return createUDCAdapter();
      }
      @Override
      public Adapter caseURI(URI object) {
        return createURIAdapter();
      }
      @Override
      public Adapter caseW3CDTF(W3CDTF object) {
        return createW3CDTFAdapter();
      }
      @Override
      public Adapter caseSimpleLiteral(SimpleLiteral object) {
        return createSimpleLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.Box <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.Box
   * @generated
   */
  public Adapter createBoxAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.DCMIType <em>DCMI Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.DCMIType
   * @generated
   */
  public Adapter createDCMITypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.DDC <em>DDC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.DDC
   * @generated
   */
  public Adapter createDDCAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.ElementOrRefinementContainer <em>Element Or Refinement Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.ElementOrRefinementContainer
   * @generated
   */
  public Adapter createElementOrRefinementContainerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.IMT <em>IMT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.IMT
   * @generated
   */
  public Adapter createIMTAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.ISO3166 <em>ISO3166</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.ISO3166
   * @generated
   */
  public Adapter createISO3166Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.ISO6392 <em>ISO6392</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.ISO6392
   * @generated
   */
  public Adapter createISO6392Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.ISO6393 <em>ISO6393</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.ISO6393
   * @generated
   */
  public Adapter createISO6393Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.LCC <em>LCC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.LCC
   * @generated
   */
  public Adapter createLCCAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.LCSH <em>LCSH</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.LCSH
   * @generated
   */
  public Adapter createLCSHAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.MESH <em>MESH</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.MESH
   * @generated
   */
  public Adapter createMESHAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.Period <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.Period
   * @generated
   */
  public Adapter createPeriodAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.Point
   * @generated
   */
  public Adapter createPointAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.RFC1766 <em>RFC1766</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.RFC1766
   * @generated
   */
  public Adapter createRFC1766Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.RFC3066 <em>RFC3066</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.RFC3066
   * @generated
   */
  public Adapter createRFC3066Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.RFC4646 <em>RFC4646</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.RFC4646
   * @generated
   */
  public Adapter createRFC4646Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.TGN <em>TGN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.TGN
   * @generated
   */
  public Adapter createTGNAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.UDC <em>UDC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.UDC
   * @generated
   */
  public Adapter createUDCAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.URI
   * @generated
   */
  public Adapter createURIAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.terms.W3CDTF <em>W3CDTF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.terms.W3CDTF
   * @generated
   */
  public Adapter createW3CDTFAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.purl.dc.elements._1._1.SimpleLiteral <em>Simple Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.purl.dc.elements._1._1.SimpleLiteral
   * @generated
   */
  public Adapter createSimpleLiteralAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //TermsAdapterFactory
