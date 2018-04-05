/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.FixrepositoryFactory;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;

import io.fixprotocol._2016.fixrepository.util.FixrepositoryValidator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.purl.dc.dcmitype.DcmitypePackage;

import org.purl.dc.dcmitype.impl.DcmitypePackageImpl;

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
public class FixrepositoryPackageImpl extends EPackageImpl implements FixrepositoryPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "fixrepository.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbreviationsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbreviationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appinfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockAssignmentTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoriesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeSetsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeSetTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentRefTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentationEClass = null;

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
  private EClass fieldRefTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldRuleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupRefTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappedDatatypeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageRefTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messagesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responsesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateMachineTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timerScheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timerTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum catComponentTypeTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum categoryComponentTypeTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum catIncludeFileTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum changeTypeTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum datatypeStandardEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum includeFileTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum presenceTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum purposeEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum reliabilityTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sectionIDTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum supportTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum synchronizationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timerOperationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unboundedEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unionDataTypeTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum volumeNameTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum volumeTEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType abbreviationTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType catComponentTypeTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType categoryComponentTypeTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType categoryIDTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType catIncludeFileTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType changeTypeTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType compIDTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType componentNameTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType datatypeStandardEnumObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType datatypeStandardTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType editionTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType eptEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType expressionTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType groupNameTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType idTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType includeFileTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType languageTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType msgTypeTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType nameTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType oidOrUriTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType oidTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType presenceTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType purposeEnumObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType purposeTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType reliabilityTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType sectionIDTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType sortTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType supportTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType synchronizationObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType termTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType timerOperationObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType unboundedIntTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType unboundedObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType unionDataTypeTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType usageTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType versionTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType volumeNameTObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType volumeNumberTEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType volumeTObjectEDataType = null;

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
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FixrepositoryPackageImpl() {
    super(eNS_URI, FixrepositoryFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FixrepositoryPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static FixrepositoryPackage init() {
    if (isInited) return (FixrepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI);

    // Obtain or create and register package
    FixrepositoryPackageImpl theFixrepositoryPackage = (FixrepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FixrepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FixrepositoryPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);
    _1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) : _1Package.eINSTANCE);
    DcmitypePackageImpl theDcmitypePackage = (DcmitypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DcmitypePackage.eNS_URI) instanceof DcmitypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DcmitypePackage.eNS_URI) : DcmitypePackage.eINSTANCE);

    // Load packages
    theFixrepositoryPackage.loadPackage();

    // Create package meta-data objects
    theTermsPackage.createPackageContents();
    the_1Package.createPackageContents();
    theDcmitypePackage.createPackageContents();

    // Initialize created meta-data
    theTermsPackage.initializePackageContents();
    the_1Package.initializePackageContents();
    theDcmitypePackage.initializePackageContents();

    // Fix loaded packages
    theFixrepositoryPackage.fixPackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theFixrepositoryPackage, 
       new EValidator.Descriptor() {
         public EValidator getEValidator() {
           return FixrepositoryValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theFixrepositoryPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FixrepositoryPackage.eNS_URI, theFixrepositoryPackage);
    return theFixrepositoryPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbreviationsType() {
    if (abbreviationsTypeEClass == null) {
      abbreviationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(0);
    }
    return abbreviationsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbbreviationsType_Abbreviation() {
        return (EReference)getAbbreviationsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationsType_LatestEP() {
        return (EAttribute)getAbbreviationsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbreviationType() {
    if (abbreviationTypeEClass == null) {
      abbreviationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(2);
    }
    return abbreviationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbbreviationType_Annotation() {
        return (EReference)getAbbreviationType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_Added() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_AddedEP() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_ChangeType() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_Deprecated() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_DeprecatedEP() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_Issue() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_LastModified() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_Name() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_Replaced() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_ReplacedByField() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_ReplacedEP() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_Supported() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_Updated() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviationType_UpdatedEP() {
        return (EAttribute)getAbbreviationType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionType() {
    if (actionTypeEClass == null) {
      actionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(3);
    }
    return actionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionType_Group() {
        return (EAttribute)getActionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_Field() {
        return (EReference)getActionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_FieldRef() {
        return (EReference)getActionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_Component() {
        return (EReference)getActionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_ComponentRef() {
        return (EReference)getActionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_Group1() {
        return (EReference)getActionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_GroupRef() {
        return (EReference)getActionType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionType_Group2() {
        return (EAttribute)getActionType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_MessageRef() {
        return (EReference)getActionType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionType_Assign() {
        return (EAttribute)getActionType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_Trigger() {
        return (EReference)getActionType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionType_TimerSchedule() {
        return (EReference)getActionType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorsType() {
    if (actorsTypeEClass == null) {
      actorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(4);
    }
    return actorsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorsType_Group() {
        return (EAttribute)getActorsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorsType_Actor() {
        return (EReference)getActorsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorsType_Flow() {
        return (EReference)getActorsType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorType() {
    if (actorTypeEClass == null) {
      actorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(5);
    }
    return actorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorType_Group() {
        return (EAttribute)getActorType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_Field() {
        return (EReference)getActorType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_FieldRef() {
        return (EReference)getActorType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_Component() {
        return (EReference)getActorType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_ComponentRef() {
        return (EReference)getActorType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_Group1() {
        return (EReference)getActorType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_GroupRef() {
        return (EReference)getActorType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_States() {
        return (EReference)getActorType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_Timer() {
        return (EReference)getActorType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_Annotation() {
        return (EReference)getActorType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorType_Extends() {
        return (EAttribute)getActorType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorType_Name() {
        return (EAttribute)getActorType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation() {
    if (annotationEClass == null) {
      annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(6);
    }
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Group() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_Documentation() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_Appinfo() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Added() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_AddedEP() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_ChangeType() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Deprecated() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_DeprecatedEP() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Issue() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_LastModified() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Replaced() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_ReplacedByField() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_ReplacedEP() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Supported() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Updated() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_UpdatedEP() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppinfo() {
    if (appinfoEClass == null) {
      appinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(7);
    }
    return appinfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Mixed() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Added() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_AddedEP() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_ChangeType() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Deprecated() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_DeprecatedEP() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Issue() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_LangId() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_LastModified() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Purpose() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Replaced() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_ReplacedByField() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_ReplacedEP() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_SpecUrl() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Supported() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_Updated() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppinfo_UpdatedEP() {
        return (EAttribute)getAppinfo().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockAssignmentType() {
    if (blockAssignmentTypeEClass == null) {
      blockAssignmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(8);
    }
    return blockAssignmentTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlockAssignmentType_Group() {
        return (EAttribute)getBlockAssignmentType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockAssignmentType_ComponentRef() {
        return (EReference)getBlockAssignmentType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockAssignmentType_GroupRef() {
        return (EReference)getBlockAssignmentType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockAssignmentType_FieldRef() {
        return (EReference)getBlockAssignmentType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategoriesType() {
    if (categoriesTypeEClass == null) {
      categoriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(11);
    }
    return categoriesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoriesType_Category() {
        return (EReference)getCategoriesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoriesType_LatestEP() {
        return (EAttribute)getCategoriesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategoryType() {
    if (categoryTypeEClass == null) {
      categoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(15);
    }
    return categoryTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryType_Annotation() {
        return (EReference)getCategoryType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Added() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_AddedEP() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_ChangeType() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_ComponentType() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Deprecated() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_DeprecatedEP() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_FIXMLFileName() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Id() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_IncludeFile() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Issue() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_LastModified() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Replaced() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_ReplacedByField() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_ReplacedEP() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Section() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Supported() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Updated() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_UpdatedEP() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategoryType_Volume() {
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeSetsType() {
    if (codeSetsTypeEClass == null) {
      codeSetsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(20);
    }
    return codeSetsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeSetsType_CodeSet() {
        return (EReference)getCodeSetsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetsType_Name() {
        return (EAttribute)getCodeSetsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeSetType() {
    if (codeSetTypeEClass == null) {
      codeSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(21);
    }
    return codeSetTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeSetType_Code() {
        return (EReference)getCodeSetType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeSetType_Annotation() {
        return (EReference)getCodeSetType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_AbbrName() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Added() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_AddedEP() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_ChangeType() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Default() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Deprecated() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_DeprecatedEP() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Id() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Issue() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_LastModified() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Name() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Oid() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Replaced() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_ReplacedByField() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_ReplacedEP() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_SpecUrl() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Supported() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Type() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_Updated() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeSetType_UpdatedEP() {
        return (EAttribute)getCodeSetType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeType() {
    if (codeTypeEClass == null) {
      codeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(22);
    }
    return codeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeType_Annotation() {
        return (EReference)getCodeType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_AbbrName() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Added() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_AddedEP() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_ChangeType() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Deprecated() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_DeprecatedEP() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Group() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Id() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Issue() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_LastModified() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Name() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Oid() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Replaced() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_ReplacedByField() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_ReplacedEP() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Sort() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Supported() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Updated() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_UpdatedEP() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeType_Value() {
        return (EAttribute)getCodeType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentRefType() {
    if (componentRefTypeEClass == null) {
      componentRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(25);
    }
    return componentRefTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRefType_BlockAssignment() {
        return (EReference)getComponentRefType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRefType_Annotation() {
        return (EReference)getComponentRefType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_AbbrName() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Added() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_AddedEP() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_ChangeType() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Deprecated() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_DeprecatedEP() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Id() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_InstanceName() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Issue() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_LastModified() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Name() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Oid() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Presence() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Replaced() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_ReplacedByField() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_ReplacedEP() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Scenario() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Supported() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_Updated() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefType_UpdatedEP() {
        return (EAttribute)getComponentRefType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentsType() {
    if (componentsTypeEClass == null) {
      componentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(26);
    }
    return componentsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentsType_Group() {
        return (EAttribute)getComponentsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentsType_Component() {
        return (EReference)getComponentsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentsType_Group1() {
        return (EReference)getComponentsType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentsType_LatestEP() {
        return (EAttribute)getComponentsType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentType() {
    if (componentTypeEClass == null) {
      componentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(27);
    }
    return componentTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Group() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_ComponentRef() {
        return (EReference)getComponentType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_GroupRef() {
        return (EReference)getComponentType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_FieldRef() {
        return (EReference)getComponentType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_Component() {
        return (EReference)getComponentType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_Group1() {
        return (EReference)getComponentType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_Field() {
        return (EReference)getComponentType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentType_Annotation() {
        return (EReference)getComponentType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_AbbrName() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Added() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_AddedEP() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Category() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_ChangeType() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Deprecated() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_DeprecatedEP() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Extends() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Id() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Issue() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_LastModified() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Name() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Oid() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Rendering() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Replaced() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_ReplacedByField() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_ReplacedEP() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Scenario() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Supported() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_Updated() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentType_UpdatedEP() {
        return (EAttribute)getComponentType().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptsType() {
    if (conceptsTypeEClass == null) {
      conceptsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(28);
    }
    return conceptsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptsType_Concept() {
        return (EReference)getConceptsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConceptType() {
    if (conceptTypeEClass == null) {
      conceptTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(29);
    }
    return conceptTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptType_Group() {
        return (EAttribute)getConceptType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptType_ComponentRef() {
        return (EReference)getConceptType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptType_GroupRef() {
        return (EReference)getConceptType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptType_FieldRef() {
        return (EReference)getConceptType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptType_MessageRef() {
        return (EReference)getConceptType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConceptType_Annotation() {
        return (EReference)getConceptType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptType_Name() {
        return (EAttribute)getConceptType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConceptType_Oid() {
        return (EAttribute)getConceptType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatypesType() {
    if (datatypesTypeEClass == null) {
      datatypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(33);
    }
    return datatypesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypesType_Datatype() {
        return (EReference)getDatatypesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypesType_LatestEP() {
        return (EAttribute)getDatatypesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatypeType() {
    if (datatypeTypeEClass == null) {
      datatypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(34);
    }
    return datatypeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeType_MappedDatatype() {
        return (EReference)getDatatypeType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeType_Annotation() {
        return (EReference)getDatatypeType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_Added() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_AddedEP() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_BaseType() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_ChangeType() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_Deprecated() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_DeprecatedEP() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_Issue() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_LastModified() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_Name() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_Replaced() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_ReplacedByField() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_ReplacedEP() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_Supported() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_Updated() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatypeType_UpdatedEP() {
        return (EAttribute)getDatatypeType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentation() {
    if (documentationEClass == null) {
      documentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(35);
    }
    return documentationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Mixed() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Any() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Added() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_AddedEP() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_ChangeType() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Deprecated() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_DeprecatedEP() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Issue() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_LangId() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_LastModified() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Purpose() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Replaced() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_ReplacedByField() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_ReplacedEP() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Supported() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_Updated() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentation_UpdatedEP() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot() {
    if (documentRootEClass == null) {
      documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(36);
    }
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Abbreviations() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Actors() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Categories() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CodeSets() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Components() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Concepts() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Datatype() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Datatypes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Fields() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_MappedDatatype() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Messages() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Repository() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Sections() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldRefType() {
    if (fieldRefTypeEClass == null) {
      fieldRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(40);
    }
    return fieldRefTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldRefType_CodeSet() {
        return (EReference)getFieldRefType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldRefType_Rule() {
        return (EReference)getFieldRefType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Assign() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldRefType_Annotation() {
        return (EReference)getFieldRefType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_AbbrName() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Added() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_AddedEP() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_ChangeType() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Deprecated() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_DeprecatedEP() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Encoding() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Id() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_ImplLength() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_ImplMaxLength() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_ImplMinLength() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_InstanceName() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Issue() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_LastModified() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_LengthId() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_MaxInclusive() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_MinInclusive() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Name() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Oid() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Presence() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Rendering() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Replaced() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_ReplacedByField() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_ReplacedEP() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Supported() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Updated() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_UpdatedEP() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRefType_Value() {
        return (EAttribute)getFieldRefType().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldRuleType() {
    if (fieldRuleTypeEClass == null) {
      fieldRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(41);
    }
    return fieldRuleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldRuleType_Unique() {
        return (EReference)getFieldRuleType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_Assign() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_When() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_Encoding() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_ImplLength() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_ImplMaxLength() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_ImplMinLength() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_MaxInclusive() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_MinInclusive() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_Name() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_Presence() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_Rendering() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_Type() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldRuleType_Value() {
        return (EAttribute)getFieldRuleType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldsType() {
    if (fieldsTypeEClass == null) {
      fieldsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(42);
    }
    return fieldsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldsType_Field() {
        return (EReference)getFieldsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldsType_LatestEP() {
        return (EAttribute)getFieldsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldType() {
    if (fieldTypeEClass == null) {
      fieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(43);
    }
    return fieldTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldType_CodeSet() {
        return (EReference)getFieldType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldType_Rule() {
        return (EReference)getFieldType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Assign() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldType_Annotation() {
        return (EReference)getFieldType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_AbbrName() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Added() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_AddedEP() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_BaseCategory() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_BaseCategoryAbbrName() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_ChangeType() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Deprecated() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_DeprecatedEP() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_DiscriminatorId() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_DiscriminatorName() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Encoding() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Id() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_ImplLength() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_ImplMaxLength() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_ImplMinLength() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Issue() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_LastModified() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_LengthId() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_LengthName() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_MaxInclusive() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_MinInclusive() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Name() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Oid() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Presence() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Rendering() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Replaced() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_ReplacedByField() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_ReplacedEP() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Supported() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Type() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_UnionDataType() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Updated() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_UpdatedEP() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldType_Value() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowType() {
    if (flowTypeEClass == null) {
      flowTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(44);
    }
    return flowTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowType_Annotation() {
        return (EReference)getFlowType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowType_Destination() {
        return (EAttribute)getFlowType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowType_Name() {
        return (EAttribute)getFlowType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowType_Reliability() {
        return (EAttribute)getFlowType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowType_Source() {
        return (EAttribute)getFlowType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupRefType() {
    if (groupRefTypeEClass == null) {
      groupRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(46);
    }
    return groupRefTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupRefType_ImplMaxOccurs() {
        return (EAttribute)getGroupRefType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupRefType_ImplMinOccurs() {
        return (EAttribute)getGroupRefType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupType() {
    if (groupTypeEClass == null) {
      groupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(47);
    }
    return groupTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupType_ImplMaxOccurs() {
        return (EAttribute)getGroupType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupType_ImplMinOccurs() {
        return (EAttribute)getGroupType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupType_NumInGroupId() {
        return (EAttribute)getGroupType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupType_NumInGroupName() {
        return (EAttribute)getGroupType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappedDatatypeType() {
    if (mappedDatatypeTypeEClass == null) {
      mappedDatatypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(52);
    }
    return mappedDatatypeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappedDatatypeType_MappedDatatype() {
        return (EReference)getMappedDatatypeType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappedDatatypeType_Annotation() {
        return (EReference)getMappedDatatypeType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_Base() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_Builtin() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_Element() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_MaxInclusive() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_MinInclusive() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_Parameter() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_Pattern() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedDatatypeType_Standard() {
        return (EAttribute)getMappedDatatypeType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageRefType() {
    if (messageRefTypeEClass == null) {
      messageRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(53);
    }
    return messageRefTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageRefType_ImplMaxOccurs() {
        return (EAttribute)getMessageRefType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageRefType_ImplMinOccurs() {
        return (EAttribute)getMessageRefType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageRefType_MsgType() {
        return (EAttribute)getMessageRefType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageRefType_Name() {
        return (EAttribute)getMessageRefType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageRefType_Scenario() {
        return (EAttribute)getMessageRefType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessagesType() {
    if (messagesTypeEClass == null) {
      messagesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(54);
    }
    return messagesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessagesType_Message() {
        return (EReference)getMessagesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessagesType_LatestEP() {
        return (EAttribute)getMessagesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageType() {
    if (messageTypeEClass == null) {
      messageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(55);
    }
    return messageTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageType_Structure() {
        return (EReference)getMessageType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageType_Responses() {
        return (EReference)getMessageType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageType_Annotation() {
        return (EReference)getMessageType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_AbbrName() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Added() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_AddedEP() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Category() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_ChangeType() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Deprecated() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_DeprecatedEP() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Extends() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Flow() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Id() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Issue() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_LastModified() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_MsgType() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Name() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Oid() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Replaced() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_ReplacedByField() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_ReplacedEP() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Scenario() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Section() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Supported() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_Updated() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageType_UpdatedEP() {
        return (EAttribute)getMessageType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepositoryType() {
    if (repositoryTypeEClass == null) {
      repositoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(67);
    }
    return repositoryTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Metadata() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Abbreviations() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Categories() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Sections() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Datatypes() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_CodeSets() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Fields() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Actors() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Components() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Messages() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Concepts() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryType_Annotation() {
        return (EReference)getRepositoryType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_ApplVerId() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_Guid() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_HasComponents() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_LatestEP() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_Name() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_Namespace() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_SpecUrl() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_Version() {
        return (EAttribute)getRepositoryType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResponsesType() {
    if (responsesTypeEClass == null) {
      responsesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(68);
    }
    return responsesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResponsesType_Response() {
        return (EReference)getResponsesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResponseType() {
    if (responseTypeEClass == null) {
      responseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(69);
    }
    return responseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResponseType_When() {
        return (EAttribute)getResponseType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResponseType_Annotation() {
        return (EReference)getResponseType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResponseType_Name() {
        return (EAttribute)getResponseType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResponseType_Sync() {
        return (EAttribute)getResponseType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionsType() {
    if (sectionsTypeEClass == null) {
      sectionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(72);
    }
    return sectionsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionsType_Section() {
        return (EReference)getSectionsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionsType_LatestEP() {
        return (EAttribute)getSectionsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSectionType() {
    if (sectionTypeEClass == null) {
      sectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(73);
    }
    return sectionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSectionType_Annotation() {
        return (EReference)getSectionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Added() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_AddedEP() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_ChangeType() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Deprecated() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_DeprecatedEP() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_DisplayOrder() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_FIXMLFileName() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Id() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Issue() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_LastModified() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Name() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Replaced() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_ReplacedByField() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_ReplacedEP() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Supported() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Updated() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_UpdatedEP() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSectionType_Volume() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateMachineType() {
    if (stateMachineTypeEClass == null) {
      stateMachineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(75);
    }
    return stateMachineTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachineType_Initial() {
        return (EReference)getStateMachineType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachineType_State() {
        return (EReference)getStateMachineType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachineType_Annotation() {
        return (EReference)getStateMachineType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateMachineType_Name() {
        return (EAttribute)getStateMachineType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateType() {
    if (stateTypeEClass == null) {
      stateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(76);
    }
    return stateTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateType_Transition() {
        return (EReference)getStateType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateType_Onentry() {
        return (EReference)getStateType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateType_Activity() {
        return (EReference)getStateType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateType_Onexit() {
        return (EReference)getStateType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateType_Annotation() {
        return (EReference)getStateType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateType_Name() {
        return (EAttribute)getStateType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureType() {
    if (structureTypeEClass == null) {
      structureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(77);
    }
    return structureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructureType_Group() {
        return (EAttribute)getStructureType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureType_Component() {
        return (EReference)getStructureType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureType_ComponentRef() {
        return (EReference)getStructureType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureType_Group1() {
        return (EReference)getStructureType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureType_GroupRef() {
        return (EReference)getStructureType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureType_Field() {
        return (EReference)getStructureType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureType_FieldRef() {
        return (EReference)getStructureType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimerSchedule() {
    if (timerScheduleEClass == null) {
      timerScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(85);
    }
    return timerScheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimerSchedule_Activity() {
        return (EReference)getTimerSchedule().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimerSchedule_Actor() {
        return (EAttribute)getTimerSchedule().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimerSchedule_Interval() {
        return (EAttribute)getTimerSchedule().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimerSchedule_Name() {
        return (EAttribute)getTimerSchedule().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimerSchedule_Operation() {
        return (EAttribute)getTimerSchedule().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimerType() {
    if (timerTypeEClass == null) {
      timerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(86);
    }
    return timerTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimerType_Name() {
        return (EAttribute)getTimerType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionType() {
    if (transitionTypeEClass == null) {
      transitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(87);
    }
    return transitionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionType_When() {
        return (EAttribute)getTransitionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionType_Annotation() {
        return (EReference)getTransitionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionType_Name() {
        return (EAttribute)getTransitionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionType_Target() {
        return (EAttribute)getTransitionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggerType() {
    if (triggerTypeEClass == null) {
      triggerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(88);
    }
    return triggerTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTriggerType_Actor() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTriggerType_Name() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTriggerType_StateMachine() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueType() {
    if (uniqueTypeEClass == null) {
      uniqueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(94);
    }
    return uniqueTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueType_FieldRef() {
        return (EReference)getUniqueType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCatComponentTypeT() {
    if (catComponentTypeTEEnum == null) {
      catComponentTypeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(9);
    }
    return catComponentTypeTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCategoryComponentTypeT() {
    if (categoryComponentTypeTEEnum == null) {
      categoryComponentTypeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(12);
    }
    return categoryComponentTypeTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCatIncludeFileT() {
    if (catIncludeFileTEEnum == null) {
      catIncludeFileTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(16);
    }
    return catIncludeFileTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getChangeTypeT() {
    if (changeTypeTEEnum == null) {
      changeTypeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(18);
    }
    return changeTypeTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDatatypeStandardEnum() {
    if (datatypeStandardEnumEEnum == null) {
      datatypeStandardEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(30);
    }
    return datatypeStandardEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIncludeFileT() {
    if (includeFileTEEnum == null) {
      includeFileTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(49);
    }
    return includeFileTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPresenceT() {
    if (presenceTEEnum == null) {
      presenceTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(60);
    }
    return presenceTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPurposeEnum() {
    if (purposeEnumEEnum == null) {
      purposeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(62);
    }
    return purposeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getReliabilityT() {
    if (reliabilityTEEnum == null) {
      reliabilityTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(65);
    }
    return reliabilityTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSectionIDT() {
    if (sectionIDTEEnum == null) {
      sectionIDTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(70);
    }
    return sectionIDTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSupportType() {
    if (supportTypeEEnum == null) {
      supportTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(78);
    }
    return supportTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSynchronization() {
    if (synchronizationEEnum == null) {
      synchronizationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(80);
    }
    return synchronizationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTimerOperation() {
    if (timerOperationEEnum == null) {
      timerOperationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(83);
    }
    return timerOperationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnbounded() {
    if (unboundedEEnum == null) {
      unboundedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(89);
    }
    return unboundedEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnionDataTypeT() {
    if (unionDataTypeTEEnum == null) {
      unionDataTypeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(92);
    }
    return unionDataTypeTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVolumeNameT() {
    if (volumeNameTEEnum == null) {
      volumeNameTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(97);
    }
    return volumeNameTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVolumeT() {
    if (volumeTEEnum == null) {
      volumeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(100);
    }
    return volumeTEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAbbreviationT() {
    if (abbreviationTEDataType == null) {
      abbreviationTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(1);
    }
    return abbreviationTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCatComponentTypeTObject() {
    if (catComponentTypeTObjectEDataType == null) {
      catComponentTypeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(10);
    }
    return catComponentTypeTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCategoryComponentTypeTObject() {
    if (categoryComponentTypeTObjectEDataType == null) {
      categoryComponentTypeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(13);
    }
    return categoryComponentTypeTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCategoryIDT() {
    if (categoryIDTEDataType == null) {
      categoryIDTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(14);
    }
    return categoryIDTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCatIncludeFileTObject() {
    if (catIncludeFileTObjectEDataType == null) {
      catIncludeFileTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(17);
    }
    return catIncludeFileTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getChangeTypeTObject() {
    if (changeTypeTObjectEDataType == null) {
      changeTypeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(19);
    }
    return changeTypeTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCompIDT() {
    if (compIDTEDataType == null) {
      compIDTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(23);
    }
    return compIDTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getComponentNameT() {
    if (componentNameTEDataType == null) {
      componentNameTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(24);
    }
    return componentNameTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDatatypeStandardEnumObject() {
    if (datatypeStandardEnumObjectEDataType == null) {
      datatypeStandardEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(31);
    }
    return datatypeStandardEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDatatypeStandardT() {
    if (datatypeStandardTEDataType == null) {
      datatypeStandardTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(32);
    }
    return datatypeStandardTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEditionT() {
    if (editionTEDataType == null) {
      editionTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(37);
    }
    return editionTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEPT() {
    if (eptEDataType == null) {
      eptEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(38);
    }
    return eptEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getExpressionType() {
    if (expressionTypeEDataType == null) {
      expressionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(39);
    }
    return expressionTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getGroupNameT() {
    if (groupNameTEDataType == null) {
      groupNameTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(45);
    }
    return groupNameTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIdT() {
    if (idTEDataType == null) {
      idTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(48);
    }
    return idTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIncludeFileTObject() {
    if (includeFileTObjectEDataType == null) {
      includeFileTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(50);
    }
    return includeFileTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getLanguageT() {
    if (languageTEDataType == null) {
      languageTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(51);
    }
    return languageTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMsgTypeT() {
    if (msgTypeTEDataType == null) {
      msgTypeTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(56);
    }
    return msgTypeTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getNameT() {
    if (nameTEDataType == null) {
      nameTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(57);
    }
    return nameTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOidOrUriT() {
    if (oidOrUriTEDataType == null) {
      oidOrUriTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(58);
    }
    return oidOrUriTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOidT() {
    if (oidTEDataType == null) {
      oidTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(59);
    }
    return oidTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getPresenceTObject() {
    if (presenceTObjectEDataType == null) {
      presenceTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(61);
    }
    return presenceTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getPurposeEnumObject() {
    if (purposeEnumObjectEDataType == null) {
      purposeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(63);
    }
    return purposeEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getPurposeT() {
    if (purposeTEDataType == null) {
      purposeTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(64);
    }
    return purposeTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getReliabilityTObject() {
    if (reliabilityTObjectEDataType == null) {
      reliabilityTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(66);
    }
    return reliabilityTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSectionIDTObject() {
    if (sectionIDTObjectEDataType == null) {
      sectionIDTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(71);
    }
    return sectionIDTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSortT() {
    if (sortTEDataType == null) {
      sortTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(74);
    }
    return sortTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSupportTypeObject() {
    if (supportTypeObjectEDataType == null) {
      supportTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(79);
    }
    return supportTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSynchronizationObject() {
    if (synchronizationObjectEDataType == null) {
      synchronizationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(81);
    }
    return synchronizationObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTermT() {
    if (termTEDataType == null) {
      termTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(82);
    }
    return termTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTimerOperationObject() {
    if (timerOperationObjectEDataType == null) {
      timerOperationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(84);
    }
    return timerOperationObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUnboundedIntType() {
    if (unboundedIntTypeEDataType == null) {
      unboundedIntTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(90);
    }
    return unboundedIntTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUnboundedObject() {
    if (unboundedObjectEDataType == null) {
      unboundedObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(91);
    }
    return unboundedObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUnionDataTypeTObject() {
    if (unionDataTypeTObjectEDataType == null) {
      unionDataTypeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(93);
    }
    return unionDataTypeTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUsageT() {
    if (usageTEDataType == null) {
      usageTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(95);
    }
    return usageTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVersionT() {
    if (versionTEDataType == null) {
      versionTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(96);
    }
    return versionTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVolumeNameTObject() {
    if (volumeNameTObjectEDataType == null) {
      volumeNameTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(98);
    }
    return volumeNameTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVolumeNumberT() {
    if (volumeNumberTEDataType == null) {
      volumeNumberTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(99);
    }
    return volumeNumberTEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVolumeTObject() {
    if (volumeTObjectEDataType == null) {
      volumeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI).getEClassifiers().get(101);
    }
    return volumeTObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixrepositoryFactory getFixrepositoryFactory() {
    return (FixrepositoryFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage() {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null) {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try {
      resource.load(null);
    }
    catch (IOException exception) {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents() {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier) {
    if (eClassifier.getInstanceClassName() == null) {
      eClassifier.setInstanceClassName("io.fixprotocol._2016.fixrepository." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //FixrepositoryPackageImpl
