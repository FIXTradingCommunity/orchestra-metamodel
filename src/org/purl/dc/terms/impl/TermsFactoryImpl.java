/**
 */
package org.purl.dc.terms.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.purl.dc.dcmitype.DcmitypeFactory;
import org.purl.dc.dcmitype.DcmitypePackage;
import org.purl.dc.terms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsFactoryImpl extends EFactoryImpl implements TermsFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TermsFactory init() {
    try {
      TermsFactory theTermsFactory = (TermsFactory)EPackage.Registry.INSTANCE.getEFactory(TermsPackage.eNS_URI);
      if (theTermsFactory != null) {
        return theTermsFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TermsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermsFactoryImpl() {
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
      case TermsPackage.BOX: return createBox();
      case TermsPackage.DCMI_TYPE: return createDCMIType();
      case TermsPackage.DDC: return createDDC();
      case TermsPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case TermsPackage.ELEMENT_OR_REFINEMENT_CONTAINER: return createElementOrRefinementContainer();
      case TermsPackage.IMT: return createIMT();
      case TermsPackage.ISO3166: return createISO3166();
      case TermsPackage.ISO6392: return createISO6392();
      case TermsPackage.ISO6393: return createISO6393();
      case TermsPackage.LCC: return createLCC();
      case TermsPackage.LCSH: return createLCSH();
      case TermsPackage.MESH: return createMESH();
      case TermsPackage.PERIOD: return createPeriod();
      case TermsPackage.POINT: return createPoint();
      case TermsPackage.RFC1766: return createRFC1766();
      case TermsPackage.RFC3066: return createRFC3066();
      case TermsPackage.RFC4646: return createRFC4646();
      case TermsPackage.TGN: return createTGN();
      case TermsPackage.UDC: return createUDC();
      case TermsPackage.URI: return createURI();
      case TermsPackage.W3CDTF: return createW3CDTF();
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
      case TermsPackage.BOX_BASE_BASE:
        return createBoxBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.DCMI_TYPE_BASE_BASE:
        return createDCMITypeBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.DDC_BASE_BASE:
        return createDDCBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.IMT_BASE_BASE:
        return createIMTBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.ISO3166_BASE_BASE:
        return createISO3166BaseBaseFromString(eDataType, initialValue);
      case TermsPackage.ISO6392_BASE_BASE:
        return createISO6392BaseBaseFromString(eDataType, initialValue);
      case TermsPackage.ISO6393_BASE_BASE:
        return createISO6393BaseBaseFromString(eDataType, initialValue);
      case TermsPackage.LCC_BASE_BASE:
        return createLCCBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.LCSH_BASE_BASE:
        return createLCSHBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.MESH_BASE_BASE:
        return createMESHBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.PERIOD_BASE_BASE:
        return createPeriodBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.POINT_BASE_BASE:
        return createPointBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.RFC1766_BASE_BASE:
        return createRFC1766BaseBaseFromString(eDataType, initialValue);
      case TermsPackage.RFC3066_BASE_BASE:
        return createRFC3066BaseBaseFromString(eDataType, initialValue);
      case TermsPackage.RFC4646_BASE_BASE:
        return createRFC4646BaseBaseFromString(eDataType, initialValue);
      case TermsPackage.TGN_BASE_BASE:
        return createTGNBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.UDC_BASE_BASE:
        return createUDCBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.URI_BASE_BASE:
        return createURIBaseBaseFromString(eDataType, initialValue);
      case TermsPackage.W3CDTF_BASE_BASE:
        return createW3CDTFBaseBaseFromString(eDataType, initialValue);
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
      case TermsPackage.BOX_BASE_BASE:
        return convertBoxBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.DCMI_TYPE_BASE_BASE:
        return convertDCMITypeBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.DDC_BASE_BASE:
        return convertDDCBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.IMT_BASE_BASE:
        return convertIMTBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.ISO3166_BASE_BASE:
        return convertISO3166BaseBaseToString(eDataType, instanceValue);
      case TermsPackage.ISO6392_BASE_BASE:
        return convertISO6392BaseBaseToString(eDataType, instanceValue);
      case TermsPackage.ISO6393_BASE_BASE:
        return convertISO6393BaseBaseToString(eDataType, instanceValue);
      case TermsPackage.LCC_BASE_BASE:
        return convertLCCBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.LCSH_BASE_BASE:
        return convertLCSHBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.MESH_BASE_BASE:
        return convertMESHBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.PERIOD_BASE_BASE:
        return convertPeriodBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.POINT_BASE_BASE:
        return convertPointBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.RFC1766_BASE_BASE:
        return convertRFC1766BaseBaseToString(eDataType, instanceValue);
      case TermsPackage.RFC3066_BASE_BASE:
        return convertRFC3066BaseBaseToString(eDataType, instanceValue);
      case TermsPackage.RFC4646_BASE_BASE:
        return convertRFC4646BaseBaseToString(eDataType, instanceValue);
      case TermsPackage.TGN_BASE_BASE:
        return convertTGNBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.UDC_BASE_BASE:
        return convertUDCBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.URI_BASE_BASE:
        return convertURIBaseBaseToString(eDataType, instanceValue);
      case TermsPackage.W3CDTF_BASE_BASE:
        return convertW3CDTFBaseBaseToString(eDataType, instanceValue);
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
		public Box createBox() {
    BoxImpl box = new BoxImpl();
    return box;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public DCMIType createDCMIType() {
    DCMITypeImpl dcmiType = new DCMITypeImpl();
    return dcmiType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public DDC createDDC() {
    DDCImpl ddc = new DDCImpl();
    return ddc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ElementOrRefinementContainer createElementOrRefinementContainer() {
    ElementOrRefinementContainerImpl elementOrRefinementContainer = new ElementOrRefinementContainerImpl();
    return elementOrRefinementContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public IMT createIMT() {
    IMTImpl imt = new IMTImpl();
    return imt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ISO3166 createISO3166() {
    ISO3166Impl iso3166 = new ISO3166Impl();
    return iso3166;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ISO6392 createISO6392() {
    ISO6392Impl iso6392 = new ISO6392Impl();
    return iso6392;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ISO6393 createISO6393() {
    ISO6393Impl iso6393 = new ISO6393Impl();
    return iso6393;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public LCC createLCC() {
    LCCImpl lcc = new LCCImpl();
    return lcc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public LCSH createLCSH() {
    LCSHImpl lcsh = new LCSHImpl();
    return lcsh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public MESH createMESH() {
    MESHImpl mesh = new MESHImpl();
    return mesh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public Period createPeriod() {
    PeriodImpl period = new PeriodImpl();
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public Point createPoint() {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public RFC1766 createRFC1766() {
    RFC1766Impl rfc1766 = new RFC1766Impl();
    return rfc1766;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public RFC3066 createRFC3066() {
    RFC3066Impl rfc3066 = new RFC3066Impl();
    return rfc3066;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public RFC4646 createRFC4646() {
    RFC4646Impl rfc4646 = new RFC4646Impl();
    return rfc4646;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public TGN createTGN() {
    TGNImpl tgn = new TGNImpl();
    return tgn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public UDC createUDC() {
    UDCImpl udc = new UDCImpl();
    return udc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public URI createURI() {
    URIImpl uri = new URIImpl();
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public W3CDTF createW3CDTF() {
    W3CDTFImpl w3CDTF = new W3CDTFImpl();
    return w3CDTF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createBoxBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoxBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumerator createDCMITypeBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (Enumerator)DcmitypeFactory.eINSTANCE.createFromString(DcmitypePackage.Literals.DCMI_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDCMITypeBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return DcmitypeFactory.eINSTANCE.convertToString(DcmitypePackage.Literals.DCMI_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createDDCBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDDCBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createIMTBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIMTBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createISO3166BaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertISO3166BaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createISO6392BaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertISO6392BaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createISO6393BaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertISO6393BaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createLCCBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLCCBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createLCSHBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLCSHBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createMESHBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMESHBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createPeriodBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPeriodBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createPointBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPointBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createRFC1766BaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRFC1766BaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createRFC3066BaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRFC3066BaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createRFC4646BaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRFC4646BaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createTGNBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTGNBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createUDCBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUDCBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createURIBaseBaseFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertURIBaseBaseToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar createW3CDTFBaseBaseFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    XMLGregorianCalendar result = null;
    RuntimeException exception = null;
    try {
      result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
        return result;
      }
    }
    catch (RuntimeException e) {
      exception = e;
    }
    try {
      result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
        return result;
      }
    }
    catch (RuntimeException e) {
      exception = e;
    }
    try {
      result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
        return result;
      }
    }
    catch (RuntimeException e) {
      exception = e;
    }
    try {
      result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
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
  public String convertW3CDTFBaseBaseToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
      try {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
        if (value != null) return value;
      }
      catch (Exception e) {
        // Keep trying other member types until all have failed.
      }
    }
    if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
      try {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
        if (value != null) return value;
      }
      catch (Exception e) {
        // Keep trying other member types until all have failed.
      }
    }
    if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
      try {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
        if (value != null) return value;
      }
      catch (Exception e) {
        // Keep trying other member types until all have failed.
      }
    }
    if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
      try {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
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
  @Override
		public TermsPackage getTermsPackage() {
    return (TermsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TermsPackage getPackage() {
    return TermsPackage.eINSTANCE;
  }

} //TermsFactoryImpl
