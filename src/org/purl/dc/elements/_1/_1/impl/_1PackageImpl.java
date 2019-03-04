/**
 */
package org.purl.dc.elements._1._1.impl;

import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;

import io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.purl.dc.elements._1._1.DocumentRoot;
import org.purl.dc.elements._1._1.ElementContainer;
import org.purl.dc.elements._1._1.SimpleLiteral;
import org.purl.dc.elements._1._1._1Factory;
import org.purl.dc.elements._1._1._1Package;

import org.purl.dc.terms.TermsPackage;

import org.purl.dc.terms.impl.TermsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1PackageImpl extends EPackageImpl implements _1Package {
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass elementContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass simpleLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass documentRootEClass = null;

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
	 * @see org.purl.dc.elements._1._1._1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private _1PackageImpl() {
		super(eNS_URI, _1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static _1Package init() {
		if (isInited) return (_1Package)EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);

		// Obtain or create and register package
		Object registered_1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		_1PackageImpl the_1Package = registered_1Package instanceof _1PackageImpl ? (_1PackageImpl)registered_1Package : new _1PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FixrepositoryPackage.eNS_URI);
		FixrepositoryPackageImpl theFixrepositoryPackage = (FixrepositoryPackageImpl)(registeredPackage instanceof FixrepositoryPackageImpl ? registeredPackage : FixrepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(registeredPackage instanceof TermsPackageImpl ? registeredPackage : TermsPackage.eINSTANCE);

		// Load packages
		theFixrepositoryPackage.loadPackage();

		// Create package meta-data objects
		the_1Package.createPackageContents();
		theTermsPackage.createPackageContents();

		// Initialize created meta-data
		the_1Package.initializePackageContents();
		theTermsPackage.initializePackageContents();

		// Fix loaded packages
		theFixrepositoryPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		the_1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_1Package.eNS_URI, the_1Package);
		return the_1Package;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getElementContainer() {
		return elementContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getElementContainer_Group() {
		return (EAttribute)elementContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getElementContainer_AnyGroup() {
		return (EAttribute)elementContainerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getElementContainer_Any() {
		return (EReference)elementContainerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getSimpleLiteral() {
		return simpleLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getSimpleLiteral_Mixed() {
		return (EAttribute)simpleLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getSimpleLiteral_Lang() {
		return (EAttribute)simpleLiteralEClass.getEStructuralFeatures().get(1);
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
		public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Any() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Rights() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Date() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Identifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Relation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Contributor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Coverage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Creator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Format() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Language() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Publisher() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Source() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Subject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDocumentRoot_Type() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public _1Factory get_1Factory() {
		return (_1Factory)getEFactoryInstance();
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
		elementContainerEClass = createEClass(ELEMENT_CONTAINER);
		createEAttribute(elementContainerEClass, ELEMENT_CONTAINER__GROUP);
		createEAttribute(elementContainerEClass, ELEMENT_CONTAINER__ANY_GROUP);
		createEReference(elementContainerEClass, ELEMENT_CONTAINER__ANY);

		simpleLiteralEClass = createEClass(SIMPLE_LITERAL);
		createEAttribute(simpleLiteralEClass, SIMPLE_LITERAL__MIXED);
		createEAttribute(simpleLiteralEClass, SIMPLE_LITERAL__LANG);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RIGHTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDENTIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTRIBUTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COVERAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LANGUAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUBLISHER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(elementContainerEClass, ElementContainer.class, "ElementContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementContainer_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementContainer_AnyGroup(), ecorePackage.getEFeatureMapEntry(), "anyGroup", null, 0, -1, ElementContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElementContainer_Any(), this.getSimpleLiteral(), null, "any", null, 0, -1, ElementContainer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(simpleLiteralEClass, SimpleLiteral.class, "SimpleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleLiteral_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SimpleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleLiteral_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 0, 1, SimpleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), this.getSimpleLiteral(), null, "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Any(), this.getSimpleLiteral(), null, "any", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rights(), this.getSimpleLiteral(), null, "rights", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), this.getSimpleLiteral(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Date(), this.getSimpleLiteral(), null, "date", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Identifier(), this.getSimpleLiteral(), null, "identifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Relation(), this.getSimpleLiteral(), null, "relation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Contributor(), this.getSimpleLiteral(), null, "contributor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Coverage(), this.getSimpleLiteral(), null, "coverage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Creator(), this.getSimpleLiteral(), null, "creator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Format(), this.getSimpleLiteral(), null, "format", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Language(), this.getSimpleLiteral(), null, "language", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Publisher(), this.getSimpleLiteral(), null, "publisher", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Source(), this.getSimpleLiteral(), null, "source", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Subject(), this.getSimpleLiteral(), null, "subject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Type(), this.getSimpleLiteral(), null, "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (elementContainerEClass,
		   source,
		   new String[] {
			   "name", "elementContainer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElementContainer_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getElementContainer_AnyGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "any:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getElementContainer_Any(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "any",
			   "namespace", "##targetNamespace",
			   "group", "any:group"
		   });
		addAnnotation
		  (simpleLiteralEClass,
		   source,
		   new String[] {
			   "name", "SimpleLiteral",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getSimpleLiteral_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getSimpleLiteral_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
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
		  (getDocumentRoot_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Any(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "any",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Rights(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rights",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Identifier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifier",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Relation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relation",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Contributor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contributor",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Coverage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "coverage",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Creator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "creator",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "format",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Language(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "language",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Publisher(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publisher",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "subject",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
		addAnnotation
		  (getDocumentRoot_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace",
			   "affiliation", "any"
		   });
	}

} //_1PackageImpl
