/**
 */
package org.purl.dc.elements._1._1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       DCMES 1.1 XML Schema
 *       XML Schema for http://purl.org/dc/elements/1.1/ namespace
 * 
 *       Created 2008-02-11
 * 
 *       Created by 
 * 
 *       Tim Cole (t-cole3@uiuc.edu)
 *       Tom Habing (thabing@uiuc.edu)
 *       Jane Hunter (jane@dstc.edu.au)
 *       Pete Johnston (p.johnston@ukoln.ac.uk),
 *       Carl Lagoze (lagoze@cs.cornell.edu)
 * 
 *       This schema declares XML elements for the 15 DC elements from the
 *       http://purl.org/dc/elements/1.1/ namespace.
 * 
 *       It defines a complexType SimpleLiteral which permits mixed content 
 *       and makes the xml:lang attribute available. It disallows child elements by
 *       use of minOcccurs/maxOccurs.
 * 
 *       However, this complexType does permit the derivation of other complexTypes
 *       which would permit child elements.
 * 
 *       All elements are declared as substitutable for the abstract element any, 
 *       which means that the default type for all elements is dc:SimpleLiteral.
 * 
 *     
 * 
 *    See http://www.w3.org/XML/1998/namespace.html and
 *    http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *     This schema document describes the XML namespace, in a form
 *     suitable for import by other schema documents.  
 * 
 *     Note that local names in this namespace are intended to be defined
 *     only by the World Wide Web Consortium or its subgroups.  The
 *     following names are currently defined in this namespace and should
 *     not be used with conflicting semantics by any Working Group,
 *     specification, or document instance:
 * 
 *     base (as an attribute name): denotes an attribute whose value
 *          provides a URI to be used as the base for interpreting any
 *          relative URIs in the scope of the element on which it
 *          appears; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML Base specification.
 * 
 *     lang (as an attribute name): denotes an attribute whose value
 *          is a language code for the natural language of the content of
 *          any element; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML specification.
 *   
 *     space (as an attribute name): denotes an attribute whose
 *          value is a keyword indicating what whitespace processing
 *          discipline is intended for the content of the element; its
 *          value is inherited.  This name is reserved by virtue of its
 *          definition in the XML specification.
 * 
 *     Father (in any context at all): denotes Jon Bosak, the chair of 
 *          the original XML Working Group.  This name is reserved by 
 *          the following decision of the W3C XML Plenary and 
 *          XML Coordination groups:
 * 
 *              In appreciation for his vision, leadership and dedication
 *              the W3C XML Plenary on this 10th day of February, 2000
 *              reserves for Jon Bosak in perpetuity the XML name
 *              xml:Father
 *   
 * This schema defines attributes and an attribute group
 *         suitable for use by
 *         schemas wishing to allow xml:base, xml:lang or xml:space attributes
 *         on elements they define.
 * 
 *         To enable this, such a schema must import this schema
 *         for the XML namespace, e.g. as follows:
 *         <schema . . .>
 *          . . .
 *          <import namespace="http://www.w3.org/XML/1998/namespace"
 *                     schemaLocation="http://www.w3.org/2001/03/xml.xsd"/>
 * 
 *         Subsequently, qualified reference to any of the attributes
 *         or the group defined below will have the desired effect, e.g.
 * 
 *         <type . . .>
 *          . . .
 *          <attributeGroup ref="xml:specialAttrs"/>
 *  
 *          will define a type which will schema-validate an instance
 *          element with any of those attributes
 * In keeping with the XML Schema WG's standard versioning
 *    policy, this schema document will persist at
 *    http://www.w3.org/2001/03/xml.xsd.
 *    At the date of issue it can also be found at
 *    http://www.w3.org/2001/xml.xsd.
 *    The schema document at that URI may however change in the future,
 *    in order to remain compatible with the latest version of XML Schema
 *    itself.  In other words, if the XML Schema namespace changes, the version
 *    of this document at
 *    http://www.w3.org/2001/xml.xsd will change
 *    accordingly; the version at
 *    http://www.w3.org/2001/03/xml.xsd will not change.
 *   
 * <!-- end-model-doc -->
 * @see org.purl.dc.elements._1._1._1Factory
 * @model kind="package"
 * @generated
 */
public interface _1Package extends EPackage {
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "_1";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://purl.org/dc/elements/1.1/";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "_1";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  _1Package eINSTANCE = org.purl.dc.elements._1._1.impl._1PackageImpl.init();

  /**
	 * The meta object id for the '{@link org.purl.dc.elements._1._1.impl.ElementContainerImpl <em>Element Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.purl.dc.elements._1._1.impl.ElementContainerImpl
	 * @see org.purl.dc.elements._1._1.impl._1PackageImpl#getElementContainer()
	 * @generated
	 */
  int ELEMENT_CONTAINER = 0;

  /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT_CONTAINER__GROUP = 0;

  /**
	 * The feature id for the '<em><b>Any Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT_CONTAINER__ANY_GROUP = 1;

  /**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT_CONTAINER__ANY = 2;

  /**
	 * The number of structural features of the '<em>Element Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT_CONTAINER_FEATURE_COUNT = 3;

  /**
	 * The number of operations of the '<em>Element Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT_CONTAINER_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.purl.dc.elements._1._1.impl.SimpleLiteralImpl <em>Simple Literal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.purl.dc.elements._1._1.impl.SimpleLiteralImpl
	 * @see org.purl.dc.elements._1._1.impl._1PackageImpl#getSimpleLiteral()
	 * @generated
	 */
  int SIMPLE_LITERAL = 1;

  /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_LITERAL__MIXED = 0;

  /**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_LITERAL__LANG = 1;

  /**
	 * The number of structural features of the '<em>Simple Literal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_LITERAL_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Simple Literal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SIMPLE_LITERAL_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.purl.dc.elements._1._1.impl.DocumentRootImpl
	 * @see org.purl.dc.elements._1._1.impl._1PackageImpl#getDocumentRoot()
	 * @generated
	 */
  int DOCUMENT_ROOT = 2;

  /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__DESCRIPTION = 3;

  /**
	 * The feature id for the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__ANY = 4;

  /**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__RIGHTS = 5;

  /**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__TITLE = 6;

  /**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__DATE = 7;

  /**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__IDENTIFIER = 8;

  /**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__RELATION = 9;

  /**
	 * The feature id for the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__CONTRIBUTOR = 10;

  /**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__COVERAGE = 11;

  /**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__CREATOR = 12;

  /**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__FORMAT = 13;

  /**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__LANGUAGE = 14;

  /**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__PUBLISHER = 15;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__SOURCE = 16;

  /**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__SUBJECT = 17;

  /**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT__TYPE = 18;

  /**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT_FEATURE_COUNT = 19;

  /**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENT_ROOT_OPERATION_COUNT = 0;


  /**
	 * Returns the meta object for class '{@link org.purl.dc.elements._1._1.ElementContainer <em>Element Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Container</em>'.
	 * @see org.purl.dc.elements._1._1.ElementContainer
	 * @generated
	 */
  EClass getElementContainer();

  /**
	 * Returns the meta object for the attribute list '{@link org.purl.dc.elements._1._1.ElementContainer#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.purl.dc.elements._1._1.ElementContainer#getGroup()
	 * @see #getElementContainer()
	 * @generated
	 */
  EAttribute getElementContainer_Group();

  /**
	 * Returns the meta object for the attribute list '{@link org.purl.dc.elements._1._1.ElementContainer#getAnyGroup <em>Any Group</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Group</em>'.
	 * @see org.purl.dc.elements._1._1.ElementContainer#getAnyGroup()
	 * @see #getElementContainer()
	 * @generated
	 */
  EAttribute getElementContainer_AnyGroup();

  /**
	 * Returns the meta object for the containment reference list '{@link org.purl.dc.elements._1._1.ElementContainer#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.purl.dc.elements._1._1.ElementContainer#getAny()
	 * @see #getElementContainer()
	 * @generated
	 */
  EReference getElementContainer_Any();

  /**
	 * Returns the meta object for class '{@link org.purl.dc.elements._1._1.SimpleLiteral <em>Simple Literal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Literal</em>'.
	 * @see org.purl.dc.elements._1._1.SimpleLiteral
	 * @generated
	 */
  EClass getSimpleLiteral();

  /**
	 * Returns the meta object for the attribute list '{@link org.purl.dc.elements._1._1.SimpleLiteral#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.purl.dc.elements._1._1.SimpleLiteral#getMixed()
	 * @see #getSimpleLiteral()
	 * @generated
	 */
  EAttribute getSimpleLiteral_Mixed();

  /**
	 * Returns the meta object for the attribute '{@link org.purl.dc.elements._1._1.SimpleLiteral#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.purl.dc.elements._1._1.SimpleLiteral#getLang()
	 * @see #getSimpleLiteral()
	 * @generated
	 */
  EAttribute getSimpleLiteral_Lang();

  /**
	 * Returns the meta object for class '{@link org.purl.dc.elements._1._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot
	 * @generated
	 */
  EClass getDocumentRoot();

  /**
	 * Returns the meta object for the attribute list '{@link org.purl.dc.elements._1._1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EAttribute getDocumentRoot_Mixed();

  /**
	 * Returns the meta object for the map '{@link org.purl.dc.elements._1._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
	 * Returns the meta object for the map '{@link org.purl.dc.elements._1._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Description();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getAny()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Any();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getRights()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Rights();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Title();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Date();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Identifier();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Relation();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributor</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getContributor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Contributor();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getCoverage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Coverage();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getCreator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Creator();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Format();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Language();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getPublisher()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Publisher();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Source();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getSubject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Subject();

  /**
	 * Returns the meta object for the containment reference '{@link org.purl.dc.elements._1._1.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.purl.dc.elements._1._1.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
  EReference getDocumentRoot_Type();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  _1Factory get_1Factory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals {
    /**
		 * The meta object literal for the '{@link org.purl.dc.elements._1._1.impl.ElementContainerImpl <em>Element Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.purl.dc.elements._1._1.impl.ElementContainerImpl
		 * @see org.purl.dc.elements._1._1.impl._1PackageImpl#getElementContainer()
		 * @generated
		 */
    EClass ELEMENT_CONTAINER = eINSTANCE.getElementContainer();

    /**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ELEMENT_CONTAINER__GROUP = eINSTANCE.getElementContainer_Group();

    /**
		 * The meta object literal for the '<em><b>Any Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ELEMENT_CONTAINER__ANY_GROUP = eINSTANCE.getElementContainer_AnyGroup();

    /**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ELEMENT_CONTAINER__ANY = eINSTANCE.getElementContainer_Any();

    /**
		 * The meta object literal for the '{@link org.purl.dc.elements._1._1.impl.SimpleLiteralImpl <em>Simple Literal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.purl.dc.elements._1._1.impl.SimpleLiteralImpl
		 * @see org.purl.dc.elements._1._1.impl._1PackageImpl#getSimpleLiteral()
		 * @generated
		 */
    EClass SIMPLE_LITERAL = eINSTANCE.getSimpleLiteral();

    /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SIMPLE_LITERAL__MIXED = eINSTANCE.getSimpleLiteral_Mixed();

    /**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SIMPLE_LITERAL__LANG = eINSTANCE.getSimpleLiteral_Lang();

    /**
		 * The meta object literal for the '{@link org.purl.dc.elements._1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.purl.dc.elements._1._1.impl.DocumentRootImpl
		 * @see org.purl.dc.elements._1._1.impl._1PackageImpl#getDocumentRoot()
		 * @generated
		 */
    EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

    /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

    /**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

    /**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__ANY = eINSTANCE.getDocumentRoot_Any();

    /**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__RIGHTS = eINSTANCE.getDocumentRoot_Rights();

    /**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

    /**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__DATE = eINSTANCE.getDocumentRoot_Date();

    /**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__IDENTIFIER = eINSTANCE.getDocumentRoot_Identifier();

    /**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__RELATION = eINSTANCE.getDocumentRoot_Relation();

    /**
		 * The meta object literal for the '<em><b>Contributor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__CONTRIBUTOR = eINSTANCE.getDocumentRoot_Contributor();

    /**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__COVERAGE = eINSTANCE.getDocumentRoot_Coverage();

    /**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__CREATOR = eINSTANCE.getDocumentRoot_Creator();

    /**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__FORMAT = eINSTANCE.getDocumentRoot_Format();

    /**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

    /**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__PUBLISHER = eINSTANCE.getDocumentRoot_Publisher();

    /**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

    /**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__SUBJECT = eINSTANCE.getDocumentRoot_Subject();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

  }

} //_1Package
