/**
 */
package org.purl.dc.terms.impl;

import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;

import io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.purl.dc.elements._1._1._1Package;

import org.purl.dc.elements._1._1.impl._1PackageImpl;

import org.purl.dc.terms.Box;
import org.purl.dc.terms.DCMIType;
import org.purl.dc.terms.DocumentRoot;
import org.purl.dc.terms.ElementOrRefinementContainer;
import org.purl.dc.terms.Period;
import org.purl.dc.terms.Point;
import org.purl.dc.terms.TermsFactory;
import org.purl.dc.terms.TermsPackage;

import org.purl.dc.terms.util.TermsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsPackageImpl extends EPackageImpl implements TermsPackage {
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass boxEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dcmiTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ddcEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass documentRootEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass elementOrRefinementContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imtEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass iso3166EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass iso6392EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass iso6393EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lccEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lcshEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass meshEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass periodEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass pointEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rfc1766EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rfc3066EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rfc4646EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tgnEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass udcEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass uriEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass w3CDTFEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType boxBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType dcmiTypeBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType ddcBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType imtBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType iso3166BaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType iso6392BaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType iso6393BaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType lccBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType lcshBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType meshBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType periodBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType pointBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType rfc1766BaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType rfc3066BaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType rfc4646BaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType tgnBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType udcBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType uriBaseBaseEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType w3CDTFBaseBaseEDataType = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.purl.dc.terms.TermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private TermsPackageImpl() {
		super(eNS_URI, TermsFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static TermsPackage init() {
		if (isInited) return (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTermsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TermsPackageImpl theTermsPackage = registeredTermsPackage instanceof TermsPackageImpl ? (TermsPackageImpl)registeredTermsPackage : new TermsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI);
		FixrepositoryPackageImpl theFixrepositoryPackage = (FixrepositoryPackageImpl)(registeredPackage instanceof FixrepositoryPackageImpl ? registeredPackage : FixrepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);
		_1PackageImpl the_1Package = (_1PackageImpl)(registeredPackage instanceof _1PackageImpl ? registeredPackage : _1Package.eINSTANCE);

		// Load packages
		theFixrepositoryPackage.loadPackage();

		// Create package meta-data objects
		theTermsPackage.createPackageContents();
		the_1Package.createPackageContents();

		// Initialize created meta-data
		theTermsPackage.initializePackageContents();
		the_1Package.initializePackageContents();

		// Fix loaded packages
		theFixrepositoryPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTermsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return TermsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTermsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TermsPackage.eNS_URI, theTermsPackage);
		return theTermsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getBox() {
		return boxEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getBox_Value() {
		return (EAttribute)boxEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDCMIType() {
		return dcmiTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDCMIType_Value() {
		return (EAttribute)dcmiTypeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDDC() {
		return ddcEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDDC_Value() {
		return (EAttribute)ddcEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDocumentRoot() {
		return documentRootEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Abstract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_AccessRights() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Rights() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_AccrualMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_AccrualPeriodicity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_AccrualPolicy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Alternative() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Audience() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Available() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Date() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_BibliographicCitation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Identifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_ConformsTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Relation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Contributor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Coverage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Created() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Creator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_DateAccepted() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_DateCopyrighted() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_DateSubmitted() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_EducationLevel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Extent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Format() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_HasFormat() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_HasPart() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_HasVersion() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_InstructionalMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_IsFormatOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_IsPartOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_IsReferencedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_IsReplacedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_IsRequiredBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Issued() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_IsVersionOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Language() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_License() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Mediator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Medium() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Modified() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Provenance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Publisher() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_References() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Replaces() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Requires() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_RightsHolder() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Source() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Spatial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Subject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_TableOfContents() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Temporal() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Type() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Valid() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getElementOrRefinementContainer() {
		return elementOrRefinementContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getElementOrRefinementContainer_Group() {
		return (EAttribute)elementOrRefinementContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getElementOrRefinementContainer_AnyGroup() {
		return (EAttribute)elementOrRefinementContainerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getElementOrRefinementContainer_Any() {
		return (EReference)elementOrRefinementContainerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getIMT() {
		return imtEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getIMT_Value() {
		return (EAttribute)imtEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getISO3166() {
		return iso3166EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getISO3166_Value() {
		return (EAttribute)iso3166EClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getISO6392() {
		return iso6392EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getISO6392_Value() {
		return (EAttribute)iso6392EClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getISO6393() {
		return iso6393EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getISO6393_Value() {
		return (EAttribute)iso6393EClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLCC() {
		return lccEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getLCC_Value() {
		return (EAttribute)lccEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLCSH() {
		return lcshEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getLCSH_Value() {
		return (EAttribute)lcshEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getMESH() {
		return meshEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getMESH_Value() {
		return (EAttribute)meshEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPeriod() {
		return periodEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPeriod_Value() {
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPoint() {
		return pointEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPoint_Value() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getRFC1766() {
		return rfc1766EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getRFC1766_Value() {
		return (EAttribute)rfc1766EClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getRFC3066() {
		return rfc3066EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getRFC3066_Value() {
		return (EAttribute)rfc3066EClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getRFC4646() {
		return rfc4646EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getRFC4646_Value() {
		return (EAttribute)rfc4646EClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getTGN() {
		return tgnEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getTGN_Value() {
		return (EAttribute)tgnEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getUDC() {
		return udcEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getUDC_Value() {
		return (EAttribute)udcEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getURI() {
		return uriEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getURI_Value() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getW3CDTF() {
		return w3CDTFEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getW3CDTF_Value() {
		return (EAttribute)w3CDTFEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getBoxBaseBase() {
		return boxBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getDCMITypeBaseBase() {
		return dcmiTypeBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getDDCBaseBase() {
		return ddcBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getIMTBaseBase() {
		return imtBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getISO3166BaseBase() {
		return iso3166BaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getISO6392BaseBase() {
		return iso6392BaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getISO6393BaseBase() {
		return iso6393BaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getLCCBaseBase() {
		return lccBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getLCSHBaseBase() {
		return lcshBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getMESHBaseBase() {
		return meshBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getPeriodBaseBase() {
		return periodBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getPointBaseBase() {
		return pointBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getRFC1766BaseBase() {
		return rfc1766BaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getRFC3066BaseBase() {
		return rfc3066BaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getRFC4646BaseBase() {
		return rfc4646BaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getTGNBaseBase() {
		return tgnBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getUDCBaseBase() {
		return udcBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getURIBaseBase() {
		return uriBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EDataType getW3CDTFBaseBase() {
		return w3CDTFBaseBaseEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public TermsFactory getTermsFactory() {
		return (TermsFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boxEClass = createEClass(BOX);
		createEAttribute(boxEClass, BOX__VALUE);

		dcmiTypeEClass = createEClass(DCMI_TYPE);
		createEAttribute(dcmiTypeEClass, DCMI_TYPE__VALUE);

		ddcEClass = createEClass(DDC);
		createEAttribute(ddcEClass, DDC__VALUE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCESS_RIGHTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RIGHTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCRUAL_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCRUAL_PERIODICITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCRUAL_POLICY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALTERNATIVE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDIENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AVAILABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDENTIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFORMS_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTRIBUTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COVERAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_ACCEPTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_COPYRIGHTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_SUBMITTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EDUCATION_LEVEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_PART);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_VERSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INSTRUCTIONAL_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_FORMAT_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_PART_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_REFERENCED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_REPLACED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_REQUIRED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ISSUED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IS_VERSION_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LANGUAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LICENSE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEDIATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEDIUM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODIFIED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROVENANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUBLISHER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPLACES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RIGHTS_HOLDER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPATIAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE_OF_CONTENTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPORAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALID);

		elementOrRefinementContainerEClass = createEClass(ELEMENT_OR_REFINEMENT_CONTAINER);
		createEAttribute(elementOrRefinementContainerEClass, ELEMENT_OR_REFINEMENT_CONTAINER__GROUP);
		createEAttribute(elementOrRefinementContainerEClass, ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP);
		createEReference(elementOrRefinementContainerEClass, ELEMENT_OR_REFINEMENT_CONTAINER__ANY);

		imtEClass = createEClass(IMT);
		createEAttribute(imtEClass, IMT__VALUE);

		iso3166EClass = createEClass(ISO3166);
		createEAttribute(iso3166EClass, ISO3166__VALUE);

		iso6392EClass = createEClass(ISO6392);
		createEAttribute(iso6392EClass, ISO6392__VALUE);

		iso6393EClass = createEClass(ISO6393);
		createEAttribute(iso6393EClass, ISO6393__VALUE);

		lccEClass = createEClass(LCC);
		createEAttribute(lccEClass, LCC__VALUE);

		lcshEClass = createEClass(LCSH);
		createEAttribute(lcshEClass, LCSH__VALUE);

		meshEClass = createEClass(MESH);
		createEAttribute(meshEClass, MESH__VALUE);

		periodEClass = createEClass(PERIOD);
		createEAttribute(periodEClass, PERIOD__VALUE);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__VALUE);

		rfc1766EClass = createEClass(RFC1766);
		createEAttribute(rfc1766EClass, RFC1766__VALUE);

		rfc3066EClass = createEClass(RFC3066);
		createEAttribute(rfc3066EClass, RFC3066__VALUE);

		rfc4646EClass = createEClass(RFC4646);
		createEAttribute(rfc4646EClass, RFC4646__VALUE);

		tgnEClass = createEClass(TGN);
		createEAttribute(tgnEClass, TGN__VALUE);

		udcEClass = createEClass(UDC);
		createEAttribute(udcEClass, UDC__VALUE);

		uriEClass = createEClass(URI);
		createEAttribute(uriEClass, URI__VALUE);

		w3CDTFEClass = createEClass(W3CDTF);
		createEAttribute(w3CDTFEClass, W3CDTF__VALUE);

		// Create data types
		boxBaseBaseEDataType = createEDataType(BOX_BASE_BASE);
		dcmiTypeBaseBaseEDataType = createEDataType(DCMI_TYPE_BASE_BASE);
		ddcBaseBaseEDataType = createEDataType(DDC_BASE_BASE);
		imtBaseBaseEDataType = createEDataType(IMT_BASE_BASE);
		iso3166BaseBaseEDataType = createEDataType(ISO3166_BASE_BASE);
		iso6392BaseBaseEDataType = createEDataType(ISO6392_BASE_BASE);
		iso6393BaseBaseEDataType = createEDataType(ISO6393_BASE_BASE);
		lccBaseBaseEDataType = createEDataType(LCC_BASE_BASE);
		lcshBaseBaseEDataType = createEDataType(LCSH_BASE_BASE);
		meshBaseBaseEDataType = createEDataType(MESH_BASE_BASE);
		periodBaseBaseEDataType = createEDataType(PERIOD_BASE_BASE);
		pointBaseBaseEDataType = createEDataType(POINT_BASE_BASE);
		rfc1766BaseBaseEDataType = createEDataType(RFC1766_BASE_BASE);
		rfc3066BaseBaseEDataType = createEDataType(RFC3066_BASE_BASE);
		rfc4646BaseBaseEDataType = createEDataType(RFC4646_BASE_BASE);
		tgnBaseBaseEDataType = createEDataType(TGN_BASE_BASE);
		udcBaseBaseEDataType = createEDataType(UDC_BASE_BASE);
		uriBaseBaseEDataType = createEDataType(URI_BASE_BASE);
		w3CDTFBaseBaseEDataType = createEDataType(W3CDTF_BASE_BASE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		_1Package the_1Package = (_1Package)EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boxEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		dcmiTypeEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		ddcEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		imtEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		iso3166EClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		iso6392EClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		iso6393EClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		lccEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		lcshEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		meshEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		periodEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		pointEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		rfc1766EClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		rfc3066EClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		rfc4646EClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		tgnEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		udcEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		uriEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());
		w3CDTFEClass.getESuperTypes().add(the_1Package.getSimpleLiteral());

		// Initialize classes, features, and operations; add parameters
		initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBox_Value(), this.getBoxBaseBase(), "value", null, 0, 1, Box.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dcmiTypeEClass, DCMIType.class, "DCMIType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCMIType_Value(), this.getDCMITypeBaseBase(), "value", null, 0, 1, DCMIType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ddcEClass, org.purl.dc.terms.DDC.class, "DDC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDDC_Value(), this.getDDCBaseBase(), "value", null, 0, 1, org.purl.dc.terms.DDC.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Abstract(), the_1Package.getSimpleLiteral(), null, "abstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), the_1Package.getSimpleLiteral(), null, "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccessRights(), the_1Package.getSimpleLiteral(), null, "accessRights", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rights(), the_1Package.getSimpleLiteral(), null, "rights", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccrualMethod(), the_1Package.getSimpleLiteral(), null, "accrualMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccrualPeriodicity(), the_1Package.getSimpleLiteral(), null, "accrualPeriodicity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccrualPolicy(), the_1Package.getSimpleLiteral(), null, "accrualPolicy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Alternative(), the_1Package.getSimpleLiteral(), null, "alternative", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), the_1Package.getSimpleLiteral(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Audience(), the_1Package.getSimpleLiteral(), null, "audience", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Available(), the_1Package.getSimpleLiteral(), null, "available", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Date(), the_1Package.getSimpleLiteral(), null, "date", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BibliographicCitation(), the_1Package.getSimpleLiteral(), null, "bibliographicCitation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Identifier(), the_1Package.getSimpleLiteral(), null, "identifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConformsTo(), the_1Package.getSimpleLiteral(), null, "conformsTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Relation(), the_1Package.getSimpleLiteral(), null, "relation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Contributor(), the_1Package.getSimpleLiteral(), null, "contributor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Coverage(), the_1Package.getSimpleLiteral(), null, "coverage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Created(), the_1Package.getSimpleLiteral(), null, "created", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Creator(), the_1Package.getSimpleLiteral(), null, "creator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateAccepted(), the_1Package.getSimpleLiteral(), null, "dateAccepted", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateCopyrighted(), the_1Package.getSimpleLiteral(), null, "dateCopyrighted", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateSubmitted(), the_1Package.getSimpleLiteral(), null, "dateSubmitted", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EducationLevel(), the_1Package.getSimpleLiteral(), null, "educationLevel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Extent(), the_1Package.getSimpleLiteral(), null, "extent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Format(), the_1Package.getSimpleLiteral(), null, "format", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasFormat(), the_1Package.getSimpleLiteral(), null, "hasFormat", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasPart(), the_1Package.getSimpleLiteral(), null, "hasPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasVersion(), the_1Package.getSimpleLiteral(), null, "hasVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InstructionalMethod(), the_1Package.getSimpleLiteral(), null, "instructionalMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsFormatOf(), the_1Package.getSimpleLiteral(), null, "isFormatOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsPartOf(), the_1Package.getSimpleLiteral(), null, "isPartOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsReferencedBy(), the_1Package.getSimpleLiteral(), null, "isReferencedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsReplacedBy(), the_1Package.getSimpleLiteral(), null, "isReplacedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsRequiredBy(), the_1Package.getSimpleLiteral(), null, "isRequiredBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Issued(), the_1Package.getSimpleLiteral(), null, "issued", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IsVersionOf(), the_1Package.getSimpleLiteral(), null, "isVersionOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Language(), the_1Package.getSimpleLiteral(), null, "language", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_License(), the_1Package.getSimpleLiteral(), null, "license", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mediator(), the_1Package.getSimpleLiteral(), null, "mediator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Medium(), the_1Package.getSimpleLiteral(), null, "medium", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Modified(), the_1Package.getSimpleLiteral(), null, "modified", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Provenance(), the_1Package.getSimpleLiteral(), null, "provenance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Publisher(), the_1Package.getSimpleLiteral(), null, "publisher", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_References(), the_1Package.getSimpleLiteral(), null, "references", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Replaces(), the_1Package.getSimpleLiteral(), null, "replaces", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Requires(), the_1Package.getSimpleLiteral(), null, "requires", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RightsHolder(), the_1Package.getSimpleLiteral(), null, "rightsHolder", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Source(), the_1Package.getSimpleLiteral(), null, "source", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Spatial(), the_1Package.getSimpleLiteral(), null, "spatial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Subject(), the_1Package.getSimpleLiteral(), null, "subject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TableOfContents(), the_1Package.getSimpleLiteral(), null, "tableOfContents", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Temporal(), the_1Package.getSimpleLiteral(), null, "temporal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Type(), the_1Package.getSimpleLiteral(), null, "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Valid(), the_1Package.getSimpleLiteral(), null, "valid", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementOrRefinementContainerEClass, ElementOrRefinementContainer.class, "ElementOrRefinementContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementOrRefinementContainer_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ElementOrRefinementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementOrRefinementContainer_AnyGroup(), ecorePackage.getEFeatureMapEntry(), "anyGroup", null, 0, -1, ElementOrRefinementContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElementOrRefinementContainer_Any(), the_1Package.getSimpleLiteral(), null, "any", null, 0, -1, ElementOrRefinementContainer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(imtEClass, org.purl.dc.terms.IMT.class, "IMT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIMT_Value(), this.getIMTBaseBase(), "value", null, 0, 1, org.purl.dc.terms.IMT.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iso3166EClass, org.purl.dc.terms.ISO3166.class, "ISO3166", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISO3166_Value(), this.getISO3166BaseBase(), "value", null, 0, 1, org.purl.dc.terms.ISO3166.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iso6392EClass, org.purl.dc.terms.ISO6392.class, "ISO6392", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISO6392_Value(), this.getISO6392BaseBase(), "value", null, 0, 1, org.purl.dc.terms.ISO6392.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iso6393EClass, org.purl.dc.terms.ISO6393.class, "ISO6393", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISO6393_Value(), this.getISO6393BaseBase(), "value", null, 0, 1, org.purl.dc.terms.ISO6393.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(lccEClass, org.purl.dc.terms.LCC.class, "LCC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLCC_Value(), this.getLCCBaseBase(), "value", null, 0, 1, org.purl.dc.terms.LCC.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(lcshEClass, org.purl.dc.terms.LCSH.class, "LCSH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLCSH_Value(), this.getLCSHBaseBase(), "value", null, 0, 1, org.purl.dc.terms.LCSH.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(meshEClass, org.purl.dc.terms.MESH.class, "MESH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMESH_Value(), this.getMESHBaseBase(), "value", null, 0, 1, org.purl.dc.terms.MESH.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriod_Value(), this.getPeriodBaseBase(), "value", null, 0, 1, Period.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Value(), this.getPointBaseBase(), "value", null, 0, 1, Point.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rfc1766EClass, org.purl.dc.terms.RFC1766.class, "RFC1766", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRFC1766_Value(), this.getRFC1766BaseBase(), "value", null, 0, 1, org.purl.dc.terms.RFC1766.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rfc3066EClass, org.purl.dc.terms.RFC3066.class, "RFC3066", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRFC3066_Value(), this.getRFC3066BaseBase(), "value", null, 0, 1, org.purl.dc.terms.RFC3066.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rfc4646EClass, org.purl.dc.terms.RFC4646.class, "RFC4646", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRFC4646_Value(), this.getRFC4646BaseBase(), "value", null, 0, 1, org.purl.dc.terms.RFC4646.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tgnEClass, org.purl.dc.terms.TGN.class, "TGN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTGN_Value(), this.getTGNBaseBase(), "value", null, 0, 1, org.purl.dc.terms.TGN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(udcEClass, org.purl.dc.terms.UDC.class, "UDC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUDC_Value(), this.getUDCBaseBase(), "value", null, 0, 1, org.purl.dc.terms.UDC.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(uriEClass, org.purl.dc.terms.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURI_Value(), this.getURIBaseBase(), "value", null, 0, 1, org.purl.dc.terms.URI.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(w3CDTFEClass, org.purl.dc.terms.W3CDTF.class, "W3CDTF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getW3CDTF_Value(), this.getW3CDTFBaseBase(), "value", null, 0, 1, org.purl.dc.terms.W3CDTF.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(boxBaseBaseEDataType, String.class, "BoxBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dcmiTypeBaseBaseEDataType, Enumerator.class, "DCMITypeBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ddcBaseBaseEDataType, String.class, "DDCBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(imtBaseBaseEDataType, String.class, "IMTBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iso3166BaseBaseEDataType, String.class, "ISO3166BaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iso6392BaseBaseEDataType, String.class, "ISO6392BaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iso6393BaseBaseEDataType, String.class, "ISO6393BaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lccBaseBaseEDataType, String.class, "LCCBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lcshBaseBaseEDataType, String.class, "LCSHBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meshBaseBaseEDataType, String.class, "MESHBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(periodBaseBaseEDataType, String.class, "PeriodBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointBaseBaseEDataType, String.class, "PointBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rfc1766BaseBaseEDataType, String.class, "RFC1766BaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rfc3066BaseBaseEDataType, String.class, "RFC3066BaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rfc4646BaseBaseEDataType, String.class, "RFC4646BaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tgnBaseBaseEDataType, String.class, "TGNBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(udcBaseBaseEDataType, String.class, "UDCBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriBaseBaseEDataType, String.class, "URIBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(w3CDTFBaseBaseEDataType, XMLGregorianCalendar.class, "W3CDTFBaseBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

  /**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (boxEClass,
		   source,
		   new String[] {
			   "name", "Box",
			   "kind", "simple"
		   });
		addAnnotation
		  (getBox_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (boxBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "Box_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (dcmiTypeEClass,
		   source,
		   new String[] {
			   "name", "DCMIType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDCMIType_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (dcmiTypeBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "DCMIType_._base_._base",
			   "baseType", "http://purl.org/dc/dcmitype/#DCMIType"
		   });
		addAnnotation
		  (ddcEClass,
		   source,
		   new String[] {
			   "name", "DDC",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDDC_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (ddcBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "DDC_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Abstract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "abstract",
			   "namespace", "##targetNamespace",
			   "affiliation", "description"
		   });
		addAnnotation
		  (getDocumentRoot_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#description"
		   });
		addAnnotation
		  (getDocumentRoot_AccessRights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accessRights",
			   "namespace", "##targetNamespace",
			   "affiliation", "rights"
		   });
		addAnnotation
		  (getDocumentRoot_Rights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rights",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#rights"
		   });
		addAnnotation
		  (getDocumentRoot_AccrualMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualMethod",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#any"
		   });
		addAnnotation
		  (getDocumentRoot_AccrualPeriodicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualPeriodicity",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#any"
		   });
		addAnnotation
		  (getDocumentRoot_AccrualPolicy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "accrualPolicy",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#any"
		   });
		addAnnotation
		  (getDocumentRoot_Alternative(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alternative",
			   "namespace", "##targetNamespace",
			   "affiliation", "title"
		   });
		addAnnotation
		  (getDocumentRoot_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#title"
		   });
		addAnnotation
		  (getDocumentRoot_Audience(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "audience",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#any"
		   });
		addAnnotation
		  (getDocumentRoot_Available(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "available",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (getDocumentRoot_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#date"
		   });
		addAnnotation
		  (getDocumentRoot_BibliographicCitation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bibliographicCitation",
			   "namespace", "##targetNamespace",
			   "affiliation", "identifier"
		   });
		addAnnotation
		  (getDocumentRoot_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#identifier"
		   });
		addAnnotation
		  (getDocumentRoot_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conformsTo",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_Relation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relation",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#relation"
		   });
		addAnnotation
		  (getDocumentRoot_Contributor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contributor",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#contributor"
		   });
		addAnnotation
		  (getDocumentRoot_Coverage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "coverage",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#coverage"
		   });
		addAnnotation
		  (getDocumentRoot_Created(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "created",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (getDocumentRoot_Creator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creator",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#creator"
		   });
		addAnnotation
		  (getDocumentRoot_DateAccepted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateAccepted",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (getDocumentRoot_DateCopyrighted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateCopyrighted",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (getDocumentRoot_DateSubmitted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dateSubmitted",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (getDocumentRoot_EducationLevel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "educationLevel",
			   "namespace", "##targetNamespace",
			   "affiliation", "audience"
		   });
		addAnnotation
		  (getDocumentRoot_Extent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extent",
			   "namespace", "##targetNamespace",
			   "affiliation", "format"
		   });
		addAnnotation
		  (getDocumentRoot_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "format",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#format"
		   });
		addAnnotation
		  (getDocumentRoot_HasFormat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasFormat",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_HasPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasPart",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_HasVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hasVersion",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_InstructionalMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionalMethod",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#any"
		   });
		addAnnotation
		  (getDocumentRoot_IsFormatOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isFormatOf",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_IsPartOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isPartOf",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_IsReferencedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isReferencedBy",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_IsReplacedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isReplacedBy",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_IsRequiredBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isRequiredBy",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_Issued(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issued",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (getDocumentRoot_IsVersionOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isVersionOf",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#language"
		   });
		addAnnotation
		  (getDocumentRoot_License(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "license",
			   "namespace", "##targetNamespace",
			   "affiliation", "rights"
		   });
		addAnnotation
		  (getDocumentRoot_Mediator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mediator",
			   "namespace", "##targetNamespace",
			   "affiliation", "audience"
		   });
		addAnnotation
		  (getDocumentRoot_Medium(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "medium",
			   "namespace", "##targetNamespace",
			   "affiliation", "format"
		   });
		addAnnotation
		  (getDocumentRoot_Modified(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "modified",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (getDocumentRoot_Provenance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "provenance",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#any"
		   });
		addAnnotation
		  (getDocumentRoot_Publisher(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publisher",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#publisher"
		   });
		addAnnotation
		  (getDocumentRoot_References(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "references",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_Replaces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "replaces",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_Requires(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requires",
			   "namespace", "##targetNamespace",
			   "affiliation", "relation"
		   });
		addAnnotation
		  (getDocumentRoot_RightsHolder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rightsHolder",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#any"
		   });
		addAnnotation
		  (getDocumentRoot_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#source"
		   });
		addAnnotation
		  (getDocumentRoot_Spatial(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatial",
			   "namespace", "##targetNamespace",
			   "affiliation", "coverage"
		   });
		addAnnotation
		  (getDocumentRoot_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "subject",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#subject"
		   });
		addAnnotation
		  (getDocumentRoot_TableOfContents(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tableOfContents",
			   "namespace", "##targetNamespace",
			   "affiliation", "description"
		   });
		addAnnotation
		  (getDocumentRoot_Temporal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporal",
			   "namespace", "##targetNamespace",
			   "affiliation", "coverage"
		   });
		addAnnotation
		  (getDocumentRoot_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://purl.org/dc/elements/1.1/#type"
		   });
		addAnnotation
		  (getDocumentRoot_Valid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "valid",
			   "namespace", "##targetNamespace",
			   "affiliation", "date"
		   });
		addAnnotation
		  (elementOrRefinementContainerEClass,
		   source,
		   new String[] {
			   "name", "elementOrRefinementContainer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElementOrRefinementContainer_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getElementOrRefinementContainer_AnyGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "any:group",
			   "namespace", "http://purl.org/dc/elements/1.1/",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getElementOrRefinementContainer_Any(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "any",
			   "namespace", "http://purl.org/dc/elements/1.1/",
			   "group", "http://purl.org/dc/elements/1.1/#any:group"
		   });
		addAnnotation
		  (imtEClass,
		   source,
		   new String[] {
			   "name", "IMT",
			   "kind", "simple"
		   });
		addAnnotation
		  (getIMT_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (imtBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "IMT_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (iso3166EClass,
		   source,
		   new String[] {
			   "name", "ISO3166",
			   "kind", "simple"
		   });
		addAnnotation
		  (getISO3166_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (iso3166BaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "ISO3166_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (iso6392EClass,
		   source,
		   new String[] {
			   "name", "ISO639-2",
			   "kind", "simple"
		   });
		addAnnotation
		  (getISO6392_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (iso6392BaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "ISO639-2_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (iso6393EClass,
		   source,
		   new String[] {
			   "name", "ISO639-3",
			   "kind", "simple"
		   });
		addAnnotation
		  (getISO6393_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (iso6393BaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "ISO639-3_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (lccEClass,
		   source,
		   new String[] {
			   "name", "LCC",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLCC_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (lccBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "LCC_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (lcshEClass,
		   source,
		   new String[] {
			   "name", "LCSH",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLCSH_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (lcshBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "LCSH_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (meshEClass,
		   source,
		   new String[] {
			   "name", "MESH",
			   "kind", "simple"
		   });
		addAnnotation
		  (getMESH_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (meshBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "MESH_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (periodEClass,
		   source,
		   new String[] {
			   "name", "Period",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPeriod_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (periodBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "Period_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (pointEClass,
		   source,
		   new String[] {
			   "name", "Point",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPoint_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (pointBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "Point_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (rfc1766EClass,
		   source,
		   new String[] {
			   "name", "RFC1766",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRFC1766_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (rfc1766BaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "RFC1766_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#language"
		   });
		addAnnotation
		  (rfc3066EClass,
		   source,
		   new String[] {
			   "name", "RFC3066",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRFC3066_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (rfc3066BaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "RFC3066_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#language"
		   });
		addAnnotation
		  (rfc4646EClass,
		   source,
		   new String[] {
			   "name", "RFC4646",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRFC4646_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (rfc4646BaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "RFC4646_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#language"
		   });
		addAnnotation
		  (tgnEClass,
		   source,
		   new String[] {
			   "name", "TGN",
			   "kind", "simple"
		   });
		addAnnotation
		  (getTGN_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (tgnBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "TGN_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (udcEClass,
		   source,
		   new String[] {
			   "name", "UDC",
			   "kind", "simple"
		   });
		addAnnotation
		  (getUDC_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (udcBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "UDC_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (uriEClass,
		   source,
		   new String[] {
			   "name", "URI",
			   "kind", "simple"
		   });
		addAnnotation
		  (getURI_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (uriBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "URI_._base_._base",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });
		addAnnotation
		  (w3CDTFEClass,
		   source,
		   new String[] {
			   "name", "W3CDTF",
			   "kind", "simple"
		   });
		addAnnotation
		  (getW3CDTF_Value(),
		   source,
		   new String[] {
			   "name", ":2",
			   "kind", "simple"
		   });
		addAnnotation
		  (w3CDTFBaseBaseEDataType,
		   source,
		   new String[] {
			   "name", "W3CDTF_._base_._base",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });
	}

} //TermsPackageImpl
