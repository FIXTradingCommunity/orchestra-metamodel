/**
 */
package org.purl.dc.dcmitype.impl;

import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;

import io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.purl.dc.dcmitype.DCMITypeMember0;
import org.purl.dc.dcmitype.DcmitypeFactory;
import org.purl.dc.dcmitype.DcmitypePackage;

import org.purl.dc.dcmitype.util.DcmitypeValidator;

import org.purl.dc.elements._1._1._1Package;

import org.purl.dc.elements._1._1.impl._1PackageImpl;

import org.purl.dc.terms.TermsPackage;

import org.purl.dc.terms.impl.TermsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcmitypePackageImpl extends EPackageImpl implements DcmitypePackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dcmiTypeMember0EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dcmiTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dcmiTypeMember0ObjectEDataType = null;

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
   * @see org.purl.dc.dcmitype.DcmitypePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DcmitypePackageImpl() {
    super(eNS_URI, DcmitypeFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DcmitypePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DcmitypePackage init() {
    if (isInited) return (DcmitypePackage)EPackage.Registry.INSTANCE.getEPackage(DcmitypePackage.eNS_URI);

    // Obtain or create and register package
    DcmitypePackageImpl theDcmitypePackage = (DcmitypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DcmitypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DcmitypePackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    FixrepositoryPackageImpl theFixrepositoryPackage = (FixrepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI) instanceof FixrepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI) : FixrepositoryPackage.eINSTANCE);
    TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);
    _1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) : _1Package.eINSTANCE);

    // Load packages
    theFixrepositoryPackage.loadPackage();

    // Create package meta-data objects
    theDcmitypePackage.createPackageContents();
    theTermsPackage.createPackageContents();
    the_1Package.createPackageContents();

    // Initialize created meta-data
    theDcmitypePackage.initializePackageContents();
    theTermsPackage.initializePackageContents();
    the_1Package.initializePackageContents();

    // Fix loaded packages
    theFixrepositoryPackage.fixPackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theDcmitypePackage, 
       new EValidator.Descriptor() {
         public EValidator getEValidator() {
           return DcmitypeValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theDcmitypePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DcmitypePackage.eNS_URI, theDcmitypePackage);
    return theDcmitypePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDCMITypeMember0() {
    return dcmiTypeMember0EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDCMIType() {
    return dcmiTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDCMITypeMember0Object() {
    return dcmiTypeMember0ObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DcmitypeFactory getDcmitypeFactory() {
    return (DcmitypeFactory)getEFactoryInstance();
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

    // Create enums
    dcmiTypeMember0EEnum = createEEnum(DCMI_TYPE_MEMBER0);

    // Create data types
    dcmiTypeEDataType = createEDataType(DCMI_TYPE);
    dcmiTypeMember0ObjectEDataType = createEDataType(DCMI_TYPE_MEMBER0_OBJECT);
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

    // Initialize enums and add enum literals
    initEEnum(dcmiTypeMember0EEnum, DCMITypeMember0.class, "DCMITypeMember0");
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.COLLECTION);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.DATASET);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.EVENT);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.IMAGE);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.MOVING_IMAGE);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.STILL_IMAGE);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.INTERACTIVE_RESOURCE);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.SERVICE);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.SOFTWARE);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.SOUND);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.TEXT);
    addEEnumLiteral(dcmiTypeMember0EEnum, DCMITypeMember0.PHYSICAL_OBJECT);

    // Initialize data types
    initEDataType(dcmiTypeEDataType, Enumerator.class, "DCMIType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dcmiTypeMember0ObjectEDataType, DCMITypeMember0.class, "DCMITypeMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
      (dcmiTypeEDataType, 
       source, 
       new String[] {
       "name", "DCMIType",
       "memberTypes", "DCMIType_._member_._0"
       });	
    addAnnotation
      (dcmiTypeMember0EEnum, 
       source, 
       new String[] {
       "name", "DCMIType_._member_._0"
       });	
    addAnnotation
      (dcmiTypeMember0ObjectEDataType, 
       source, 
       new String[] {
       "name", "DCMIType_._member_._0:Object",
       "baseType", "DCMIType_._member_._0"
       });
  }

} //DcmitypePackageImpl
