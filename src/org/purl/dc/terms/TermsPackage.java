/**
 */
package org.purl.dc.terms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.purl.dc.elements._1._1._1Package;

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
 *       DCterms XML Schema
 *       XML Schema for http://purl.org/dc/terms/ namespace
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
 *       This schema declares XML elements for the DC elements and
 *       DC element refinements from the http://purl.org/dc/terms/ namespace.
 *       
 *       It reuses the complexType dc:SimpleLiteral, imported from the dc.xsd
 *       schema, which permits simple element content, and makes the xml:lang
 *       attribute available.
 * 
 *       This complexType permits the derivation of other complexTypes
 *       which would permit child elements.
 * 
 *       XML elements corresponding to DC elements are declared as substitutable for the abstract element dc:any, and 
 *       XML elements corresponding to DC element refinements are defined as substitutable for the base elements 
 *       which they refine.
 * 
 *       This means that the default type for all XML elements (i.e. corresponding to all DC elements and 
 *       element refinements) is dc:SimpleLiteral.
 * 
 *       Encoding schemes are defined as complexTypes which are restrictions
 *       of the dc:SimpleLiteral complexType. These complexTypes restrict 
 *       values to an appropriates syntax or format using data typing,
 *       regular expressions, or enumerated lists.
 *   
 *       In order to specify one of these encodings an xsi:type attribute must 
 *       be used in the instance document.
 * 
 *       Also, note that one shortcoming of this approach is that any type can be 
 *       applied to any of the elements or refinements.  There is no convenient way
 *       to restrict types to specific elements using this approach.
 * 
 *       Changes in 2008-02-11 version:
 *       
 *       Add element declarations corresponding to 15 new dcterms URIs, and amend use of substitutionGroups.
 *       
 *       Add compexType definitions corresponding to ISO639-3, RFC4646.
 *       
 *     
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
 * 
 *       DCMI Type Vocabulary XML Schema
 *       XML Schema for http://purl.org/dc/dcmitype/ namespace
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
 *       This schema defines a simpleType which enumerates
 *       the allowable values for the DCMI Type Vocabulary.
 *     
 * <!-- end-model-doc -->
 * @see org.purl.dc.terms.TermsFactory
 * @model kind="package"
 * @generated
 */
public interface TermsPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "terms";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://purl.org/dc/terms/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "terms";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TermsPackage eINSTANCE = org.purl.dc.terms.impl.TermsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.BoxImpl <em>Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.BoxImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getBox()
   * @generated
   */
  int BOX = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.DCMITypeImpl <em>DCMI Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.DCMITypeImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getDCMIType()
   * @generated
   */
  int DCMI_TYPE = 1;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCMI_TYPE__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCMI_TYPE__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCMI_TYPE__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DCMI Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCMI_TYPE_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>DCMI Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCMI_TYPE_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.DDCImpl <em>DDC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.DDCImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getDDC()
   * @generated
   */
  int DDC = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDC__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDC__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDC__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DDC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDC_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>DDC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDC_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.DocumentRootImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 3;

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
   * The feature id for the '<em><b>Abstract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ABSTRACT = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Access Rights</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ACCESS_RIGHTS = 5;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RIGHTS = 6;

  /**
   * The feature id for the '<em><b>Accrual Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ACCRUAL_METHOD = 7;

  /**
   * The feature id for the '<em><b>Accrual Periodicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ACCRUAL_PERIODICITY = 8;

  /**
   * The feature id for the '<em><b>Accrual Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ACCRUAL_POLICY = 9;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ALTERNATIVE = 10;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TITLE = 11;

  /**
   * The feature id for the '<em><b>Audience</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__AUDIENCE = 12;

  /**
   * The feature id for the '<em><b>Available</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__AVAILABLE = 13;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DATE = 14;

  /**
   * The feature id for the '<em><b>Bibliographic Citation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION = 15;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IDENTIFIER = 16;

  /**
   * The feature id for the '<em><b>Conforms To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONFORMS_TO = 17;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RELATION = 18;

  /**
   * The feature id for the '<em><b>Contributor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONTRIBUTOR = 19;

  /**
   * The feature id for the '<em><b>Coverage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__COVERAGE = 20;

  /**
   * The feature id for the '<em><b>Created</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATED = 21;

  /**
   * The feature id for the '<em><b>Creator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATOR = 22;

  /**
   * The feature id for the '<em><b>Date Accepted</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DATE_ACCEPTED = 23;

  /**
   * The feature id for the '<em><b>Date Copyrighted</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DATE_COPYRIGHTED = 24;

  /**
   * The feature id for the '<em><b>Date Submitted</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DATE_SUBMITTED = 25;

  /**
   * The feature id for the '<em><b>Education Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EDUCATION_LEVEL = 26;

  /**
   * The feature id for the '<em><b>Extent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXTENT = 27;

  /**
   * The feature id for the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FORMAT = 28;

  /**
   * The feature id for the '<em><b>Has Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__HAS_FORMAT = 29;

  /**
   * The feature id for the '<em><b>Has Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__HAS_PART = 30;

  /**
   * The feature id for the '<em><b>Has Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__HAS_VERSION = 31;

  /**
   * The feature id for the '<em><b>Instructional Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INSTRUCTIONAL_METHOD = 32;

  /**
   * The feature id for the '<em><b>Is Format Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IS_FORMAT_OF = 33;

  /**
   * The feature id for the '<em><b>Is Part Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IS_PART_OF = 34;

  /**
   * The feature id for the '<em><b>Is Referenced By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IS_REFERENCED_BY = 35;

  /**
   * The feature id for the '<em><b>Is Replaced By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IS_REPLACED_BY = 36;

  /**
   * The feature id for the '<em><b>Is Required By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IS_REQUIRED_BY = 37;

  /**
   * The feature id for the '<em><b>Issued</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ISSUED = 38;

  /**
   * The feature id for the '<em><b>Is Version Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IS_VERSION_OF = 39;

  /**
   * The feature id for the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LANGUAGE = 40;

  /**
   * The feature id for the '<em><b>License</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LICENSE = 41;

  /**
   * The feature id for the '<em><b>Mediator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MEDIATOR = 42;

  /**
   * The feature id for the '<em><b>Medium</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MEDIUM = 43;

  /**
   * The feature id for the '<em><b>Modified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MODIFIED = 44;

  /**
   * The feature id for the '<em><b>Provenance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROVENANCE = 45;

  /**
   * The feature id for the '<em><b>Publisher</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PUBLISHER = 46;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REFERENCES = 47;

  /**
   * The feature id for the '<em><b>Replaces</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REPLACES = 48;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REQUIRES = 49;

  /**
   * The feature id for the '<em><b>Rights Holder</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RIGHTS_HOLDER = 50;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SOURCE = 51;

  /**
   * The feature id for the '<em><b>Spatial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SPATIAL = 52;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SUBJECT = 53;

  /**
   * The feature id for the '<em><b>Table Of Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TABLE_OF_CONTENTS = 54;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TEMPORAL = 55;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TYPE = 56;

  /**
   * The feature id for the '<em><b>Valid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VALID = 57;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 58;

  /**
   * The number of operations of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.ElementOrRefinementContainerImpl <em>Element Or Refinement Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.ElementOrRefinementContainerImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getElementOrRefinementContainer()
   * @generated
   */
  int ELEMENT_OR_REFINEMENT_CONTAINER = 4;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OR_REFINEMENT_CONTAINER__GROUP = 0;

  /**
   * The feature id for the '<em><b>Any Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP = 1;

  /**
   * The feature id for the '<em><b>Any</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OR_REFINEMENT_CONTAINER__ANY = 2;

  /**
   * The number of structural features of the '<em>Element Or Refinement Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OR_REFINEMENT_CONTAINER_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Element Or Refinement Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OR_REFINEMENT_CONTAINER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.IMTImpl <em>IMT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.IMTImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getIMT()
   * @generated
   */
  int IMT = 5;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMT__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMT__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMT__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IMT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMT_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>IMT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMT_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.ISO3166Impl <em>ISO3166</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.ISO3166Impl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO3166()
   * @generated
   */
  int ISO3166 = 6;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO3166__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO3166__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO3166__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ISO3166</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO3166_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>ISO3166</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO3166_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.ISO6392Impl <em>ISO6392</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.ISO6392Impl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6392()
   * @generated
   */
  int ISO6392 = 7;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6392__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6392__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6392__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ISO6392</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6392_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>ISO6392</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6392_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.ISO6393Impl <em>ISO6393</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.ISO6393Impl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6393()
   * @generated
   */
  int ISO6393 = 8;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6393__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6393__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6393__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ISO6393</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6393_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>ISO6393</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISO6393_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.LCCImpl <em>LCC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.LCCImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCC()
   * @generated
   */
  int LCC = 9;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCC__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCC__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCC__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LCC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCC_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>LCC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCC_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.LCSHImpl <em>LCSH</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.LCSHImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCSH()
   * @generated
   */
  int LCSH = 10;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCSH__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCSH__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCSH__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LCSH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCSH_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>LCSH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCSH_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.MESHImpl <em>MESH</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.MESHImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getMESH()
   * @generated
   */
  int MESH = 11;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESH__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESH__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESH__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MESH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESH_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>MESH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESH_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.PeriodImpl <em>Period</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.PeriodImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getPeriod()
   * @generated
   */
  int PERIOD = 12;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Period</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Period</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.PointImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getPoint()
   * @generated
   */
  int POINT = 13;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.RFC1766Impl <em>RFC1766</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.RFC1766Impl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC1766()
   * @generated
   */
  int RFC1766 = 14;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC1766__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC1766__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC1766__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RFC1766</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC1766_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>RFC1766</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC1766_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.RFC3066Impl <em>RFC3066</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.RFC3066Impl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC3066()
   * @generated
   */
  int RFC3066 = 15;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC3066__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC3066__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC3066__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RFC3066</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC3066_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>RFC3066</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC3066_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.RFC4646Impl <em>RFC4646</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.RFC4646Impl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC4646()
   * @generated
   */
  int RFC4646 = 16;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC4646__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC4646__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC4646__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RFC4646</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC4646_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>RFC4646</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RFC4646_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.TGNImpl <em>TGN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.TGNImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getTGN()
   * @generated
   */
  int TGN = 17;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGN__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGN__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGN__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TGN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGN_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>TGN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TGN_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.UDCImpl <em>UDC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.UDCImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getUDC()
   * @generated
   */
  int UDC = 18;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UDC__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UDC__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UDC__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UDC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UDC_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>UDC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UDC_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.URIImpl <em>URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.URIImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getURI()
   * @generated
   */
  int URI = 19;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.purl.dc.terms.impl.W3CDTFImpl <em>W3CDTF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.purl.dc.terms.impl.W3CDTFImpl
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getW3CDTF()
   * @generated
   */
  int W3CDTF = 20;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W3CDTF__MIXED = _1Package.SIMPLE_LITERAL__MIXED;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W3CDTF__LANG = _1Package.SIMPLE_LITERAL__LANG;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W3CDTF__VALUE = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>W3CDTF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W3CDTF_FEATURE_COUNT = _1Package.SIMPLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>W3CDTF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int W3CDTF_OPERATION_COUNT = _1Package.SIMPLE_LITERAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '<em>Box Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getBoxBaseBase()
   * @generated
   */
  int BOX_BASE_BASE = 21;

  /**
   * The meta object id for the '<em>DCMI Type Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Enumerator
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getDCMITypeBaseBase()
   * @generated
   */
  int DCMI_TYPE_BASE_BASE = 22;

  /**
   * The meta object id for the '<em>DDC Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getDDCBaseBase()
   * @generated
   */
  int DDC_BASE_BASE = 23;

  /**
   * The meta object id for the '<em>IMT Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getIMTBaseBase()
   * @generated
   */
  int IMT_BASE_BASE = 24;

  /**
   * The meta object id for the '<em>ISO3166 Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO3166BaseBase()
   * @generated
   */
  int ISO3166_BASE_BASE = 25;

  /**
   * The meta object id for the '<em>ISO6392 Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6392BaseBase()
   * @generated
   */
  int ISO6392_BASE_BASE = 26;

  /**
   * The meta object id for the '<em>ISO6393 Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6393BaseBase()
   * @generated
   */
  int ISO6393_BASE_BASE = 27;

  /**
   * The meta object id for the '<em>LCC Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCCBaseBase()
   * @generated
   */
  int LCC_BASE_BASE = 28;

  /**
   * The meta object id for the '<em>LCSH Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCSHBaseBase()
   * @generated
   */
  int LCSH_BASE_BASE = 29;

  /**
   * The meta object id for the '<em>MESH Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getMESHBaseBase()
   * @generated
   */
  int MESH_BASE_BASE = 30;

  /**
   * The meta object id for the '<em>Period Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getPeriodBaseBase()
   * @generated
   */
  int PERIOD_BASE_BASE = 31;

  /**
   * The meta object id for the '<em>Point Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getPointBaseBase()
   * @generated
   */
  int POINT_BASE_BASE = 32;

  /**
   * The meta object id for the '<em>RFC1766 Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC1766BaseBase()
   * @generated
   */
  int RFC1766_BASE_BASE = 33;

  /**
   * The meta object id for the '<em>RFC3066 Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC3066BaseBase()
   * @generated
   */
  int RFC3066_BASE_BASE = 34;

  /**
   * The meta object id for the '<em>RFC4646 Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC4646BaseBase()
   * @generated
   */
  int RFC4646_BASE_BASE = 35;

  /**
   * The meta object id for the '<em>TGN Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getTGNBaseBase()
   * @generated
   */
  int TGN_BASE_BASE = 36;

  /**
   * The meta object id for the '<em>UDC Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getUDCBaseBase()
   * @generated
   */
  int UDC_BASE_BASE = 37;

  /**
   * The meta object id for the '<em>URI Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getURIBaseBase()
   * @generated
   */
  int URI_BASE_BASE = 38;

  /**
   * The meta object id for the '<em>W3CDTF Base Base</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @see org.purl.dc.terms.impl.TermsPackageImpl#getW3CDTFBaseBase()
   * @generated
   */
  int W3CDTF_BASE_BASE = 39;


  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.Box <em>Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Box</em>'.
   * @see org.purl.dc.terms.Box
   * @generated
   */
  EClass getBox();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.Box#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.Box#getValue()
   * @see #getBox()
   * @generated
   */
  EAttribute getBox_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.DCMIType <em>DCMI Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DCMI Type</em>'.
   * @see org.purl.dc.terms.DCMIType
   * @generated
   */
  EClass getDCMIType();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.DCMIType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.DCMIType#getValue()
   * @see #getDCMIType()
   * @generated
   */
  EAttribute getDCMIType_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.DDC <em>DDC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DDC</em>'.
   * @see org.purl.dc.terms.DDC
   * @generated
   */
  EClass getDDC();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.DDC#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.DDC#getValue()
   * @see #getDDC()
   * @generated
   */
  EAttribute getDDC_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see org.purl.dc.terms.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link org.purl.dc.terms.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link org.purl.dc.terms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link org.purl.dc.terms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAbstract()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getDescription()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAccessRights <em>Access Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Rights</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAccessRights()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AccessRights();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rights</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getRights()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Rights();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAccrualMethod <em>Accrual Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accrual Method</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAccrualMethod()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AccrualMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAccrualPeriodicity <em>Accrual Periodicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accrual Periodicity</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAccrualPeriodicity()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AccrualPeriodicity();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAccrualPolicy <em>Accrual Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accrual Policy</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAccrualPolicy()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AccrualPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAlternative()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Alternative();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getTitle()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAudience <em>Audience</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Audience</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAudience()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Audience();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getAvailable <em>Available</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Available</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getAvailable()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Available();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getDate()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Date();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getBibliographicCitation <em>Bibliographic Citation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bibliographic Citation</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getBibliographicCitation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BibliographicCitation();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIdentifier()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getConformsTo <em>Conforms To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conforms To</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getConformsTo()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ConformsTo();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relation</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getRelation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Relation();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getContributor <em>Contributor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contributor</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getContributor()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Contributor();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getCoverage <em>Coverage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coverage</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getCoverage()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Coverage();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getCreated <em>Created</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Created</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getCreated()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Created();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getCreator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Creator</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getCreator()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Creator();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getDateAccepted <em>Date Accepted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date Accepted</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getDateAccepted()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DateAccepted();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getDateCopyrighted <em>Date Copyrighted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date Copyrighted</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getDateCopyrighted()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DateCopyrighted();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getDateSubmitted <em>Date Submitted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date Submitted</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getDateSubmitted()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DateSubmitted();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getEducationLevel <em>Education Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Education Level</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getEducationLevel()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EducationLevel();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getExtent <em>Extent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extent</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getExtent()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Extent();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Format</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getFormat()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Format();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getHasFormat <em>Has Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Format</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getHasFormat()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_HasFormat();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getHasPart <em>Has Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Part</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getHasPart()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_HasPart();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getHasVersion <em>Has Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Version</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getHasVersion()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_HasVersion();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getInstructionalMethod <em>Instructional Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instructional Method</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getInstructionalMethod()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_InstructionalMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIsFormatOf <em>Is Format Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Format Of</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIsFormatOf()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IsFormatOf();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIsPartOf <em>Is Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Part Of</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIsPartOf()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IsPartOf();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIsReferencedBy <em>Is Referenced By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Referenced By</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIsReferencedBy()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IsReferencedBy();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIsReplacedBy <em>Is Replaced By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Replaced By</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIsReplacedBy()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IsReplacedBy();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIsRequiredBy <em>Is Required By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Required By</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIsRequiredBy()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IsRequiredBy();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIssued <em>Issued</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Issued</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIssued()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Issued();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getIsVersionOf <em>Is Version Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Version Of</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getIsVersionOf()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IsVersionOf();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Language</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getLanguage()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Language();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getLicense <em>License</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>License</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getLicense()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_License();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getMediator <em>Mediator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mediator</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getMediator()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Mediator();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getMedium <em>Medium</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Medium</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getMedium()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Medium();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getModified <em>Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modified</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getModified()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Modified();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getProvenance <em>Provenance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provenance</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getProvenance()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Provenance();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getPublisher <em>Publisher</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Publisher</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getPublisher()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Publisher();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>References</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getReferences()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_References();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getReplaces <em>Replaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replaces</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getReplaces()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Replaces();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Requires</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getRequires()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Requires();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getRightsHolder <em>Rights Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rights Holder</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getRightsHolder()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_RightsHolder();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getSource()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getSpatial <em>Spatial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spatial</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getSpatial()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Spatial();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getSubject()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Subject();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getTableOfContents <em>Table Of Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Of Contents</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getTableOfContents()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_TableOfContents();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getTemporal <em>Temporal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Temporal</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getTemporal()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Temporal();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getType()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.purl.dc.terms.DocumentRoot#getValid <em>Valid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valid</em>'.
   * @see org.purl.dc.terms.DocumentRoot#getValid()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Valid();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.ElementOrRefinementContainer <em>Element Or Refinement Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Or Refinement Container</em>'.
   * @see org.purl.dc.terms.ElementOrRefinementContainer
   * @generated
   */
  EClass getElementOrRefinementContainer();

  /**
   * Returns the meta object for the attribute list '{@link org.purl.dc.terms.ElementOrRefinementContainer#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see org.purl.dc.terms.ElementOrRefinementContainer#getGroup()
   * @see #getElementOrRefinementContainer()
   * @generated
   */
  EAttribute getElementOrRefinementContainer_Group();

  /**
   * Returns the meta object for the attribute list '{@link org.purl.dc.terms.ElementOrRefinementContainer#getAnyGroup <em>Any Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any Group</em>'.
   * @see org.purl.dc.terms.ElementOrRefinementContainer#getAnyGroup()
   * @see #getElementOrRefinementContainer()
   * @generated
   */
  EAttribute getElementOrRefinementContainer_AnyGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.purl.dc.terms.ElementOrRefinementContainer#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Any</em>'.
   * @see org.purl.dc.terms.ElementOrRefinementContainer#getAny()
   * @see #getElementOrRefinementContainer()
   * @generated
   */
  EReference getElementOrRefinementContainer_Any();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.IMT <em>IMT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IMT</em>'.
   * @see org.purl.dc.terms.IMT
   * @generated
   */
  EClass getIMT();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.IMT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.IMT#getValue()
   * @see #getIMT()
   * @generated
   */
  EAttribute getIMT_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.ISO3166 <em>ISO3166</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ISO3166</em>'.
   * @see org.purl.dc.terms.ISO3166
   * @generated
   */
  EClass getISO3166();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.ISO3166#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.ISO3166#getValue()
   * @see #getISO3166()
   * @generated
   */
  EAttribute getISO3166_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.ISO6392 <em>ISO6392</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ISO6392</em>'.
   * @see org.purl.dc.terms.ISO6392
   * @generated
   */
  EClass getISO6392();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.ISO6392#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.ISO6392#getValue()
   * @see #getISO6392()
   * @generated
   */
  EAttribute getISO6392_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.ISO6393 <em>ISO6393</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ISO6393</em>'.
   * @see org.purl.dc.terms.ISO6393
   * @generated
   */
  EClass getISO6393();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.ISO6393#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.ISO6393#getValue()
   * @see #getISO6393()
   * @generated
   */
  EAttribute getISO6393_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.LCC <em>LCC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LCC</em>'.
   * @see org.purl.dc.terms.LCC
   * @generated
   */
  EClass getLCC();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.LCC#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.LCC#getValue()
   * @see #getLCC()
   * @generated
   */
  EAttribute getLCC_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.LCSH <em>LCSH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LCSH</em>'.
   * @see org.purl.dc.terms.LCSH
   * @generated
   */
  EClass getLCSH();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.LCSH#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.LCSH#getValue()
   * @see #getLCSH()
   * @generated
   */
  EAttribute getLCSH_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.MESH <em>MESH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MESH</em>'.
   * @see org.purl.dc.terms.MESH
   * @generated
   */
  EClass getMESH();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.MESH#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.MESH#getValue()
   * @see #getMESH()
   * @generated
   */
  EAttribute getMESH_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.Period <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Period</em>'.
   * @see org.purl.dc.terms.Period
   * @generated
   */
  EClass getPeriod();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.Period#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.Period#getValue()
   * @see #getPeriod()
   * @generated
   */
  EAttribute getPeriod_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.purl.dc.terms.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.Point#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.Point#getValue()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.RFC1766 <em>RFC1766</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RFC1766</em>'.
   * @see org.purl.dc.terms.RFC1766
   * @generated
   */
  EClass getRFC1766();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.RFC1766#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.RFC1766#getValue()
   * @see #getRFC1766()
   * @generated
   */
  EAttribute getRFC1766_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.RFC3066 <em>RFC3066</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RFC3066</em>'.
   * @see org.purl.dc.terms.RFC3066
   * @generated
   */
  EClass getRFC3066();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.RFC3066#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.RFC3066#getValue()
   * @see #getRFC3066()
   * @generated
   */
  EAttribute getRFC3066_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.RFC4646 <em>RFC4646</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RFC4646</em>'.
   * @see org.purl.dc.terms.RFC4646
   * @generated
   */
  EClass getRFC4646();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.RFC4646#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.RFC4646#getValue()
   * @see #getRFC4646()
   * @generated
   */
  EAttribute getRFC4646_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.TGN <em>TGN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TGN</em>'.
   * @see org.purl.dc.terms.TGN
   * @generated
   */
  EClass getTGN();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.TGN#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.TGN#getValue()
   * @see #getTGN()
   * @generated
   */
  EAttribute getTGN_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.UDC <em>UDC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UDC</em>'.
   * @see org.purl.dc.terms.UDC
   * @generated
   */
  EClass getUDC();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.UDC#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.UDC#getValue()
   * @see #getUDC()
   * @generated
   */
  EAttribute getUDC_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI</em>'.
   * @see org.purl.dc.terms.URI
   * @generated
   */
  EClass getURI();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.URI#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.URI#getValue()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_Value();

  /**
   * Returns the meta object for class '{@link org.purl.dc.terms.W3CDTF <em>W3CDTF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>W3CDTF</em>'.
   * @see org.purl.dc.terms.W3CDTF
   * @generated
   */
  EClass getW3CDTF();

  /**
   * Returns the meta object for the attribute '{@link org.purl.dc.terms.W3CDTF#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.purl.dc.terms.W3CDTF#getValue()
   * @see #getW3CDTF()
   * @generated
   */
  EAttribute getW3CDTF_Value();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Box Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Box Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Box_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getBoxBaseBase();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>DCMI Type Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>DCMI Type Base Base</em>'.
   * @see org.eclipse.emf.common.util.Enumerator
   * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
   *        extendedMetaData="name='DCMIType_._base_._base' baseType='http://purl.org/dc/dcmitype/#DCMIType'"
   * @generated
   */
  EDataType getDCMITypeBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>DDC Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>DDC Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='DDC_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getDDCBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>IMT Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IMT Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='IMT_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getIMTBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>ISO3166 Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ISO3166 Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ISO3166_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getISO3166BaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>ISO6392 Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ISO6392 Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ISO639-2_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getISO6392BaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>ISO6393 Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ISO6393 Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ISO639-3_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getISO6393BaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>LCC Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>LCC Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='LCC_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getLCCBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>LCSH Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>LCSH Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='LCSH_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getLCSHBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>MESH Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MESH Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='MESH_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getMESHBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Period Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Period Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Period_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getPeriodBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Point Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Point Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Point_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getPointBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>RFC1766 Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>RFC1766 Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='RFC1766_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#language'"
   * @generated
   */
  EDataType getRFC1766BaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>RFC3066 Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>RFC3066 Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='RFC3066_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#language'"
   * @generated
   */
  EDataType getRFC3066BaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>RFC4646 Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>RFC4646 Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='RFC4646_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#language'"
   * @generated
   */
  EDataType getRFC4646BaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>TGN Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>TGN Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='TGN_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getTGNBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>UDC Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>UDC Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='UDC_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getUDCBaseBase();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>URI Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>URI Base Base</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='URI_._base_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
   * @generated
   */
  EDataType getURIBaseBase();

  /**
   * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>W3CDTF Base Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>W3CDTF Base Base</em>'.
   * @see javax.xml.datatype.XMLGregorianCalendar
   * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
   *        extendedMetaData="name='W3CDTF_._base_._base' memberTypes='http://www.eclipse.org/emf/2003/XMLType#gYear http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#dateTime'"
   * @generated
   */
  EDataType getW3CDTFBaseBase();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TermsFactory getTermsFactory();

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
     * The meta object literal for the '{@link org.purl.dc.terms.impl.BoxImpl <em>Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.BoxImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getBox()
     * @generated
     */
    EClass BOX = eINSTANCE.getBox();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOX__VALUE = eINSTANCE.getBox_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.DCMITypeImpl <em>DCMI Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.DCMITypeImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getDCMIType()
     * @generated
     */
    EClass DCMI_TYPE = eINSTANCE.getDCMIType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DCMI_TYPE__VALUE = eINSTANCE.getDCMIType_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.DDCImpl <em>DDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.DDCImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getDDC()
     * @generated
     */
    EClass DDC = eINSTANCE.getDDC();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DDC__VALUE = eINSTANCE.getDDC_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.DocumentRootImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ABSTRACT = eINSTANCE.getDocumentRoot_Abstract();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

    /**
     * The meta object literal for the '<em><b>Access Rights</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ACCESS_RIGHTS = eINSTANCE.getDocumentRoot_AccessRights();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__RIGHTS = eINSTANCE.getDocumentRoot_Rights();

    /**
     * The meta object literal for the '<em><b>Accrual Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ACCRUAL_METHOD = eINSTANCE.getDocumentRoot_AccrualMethod();

    /**
     * The meta object literal for the '<em><b>Accrual Periodicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ACCRUAL_PERIODICITY = eINSTANCE.getDocumentRoot_AccrualPeriodicity();

    /**
     * The meta object literal for the '<em><b>Accrual Policy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ACCRUAL_POLICY = eINSTANCE.getDocumentRoot_AccrualPolicy();

    /**
     * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ALTERNATIVE = eINSTANCE.getDocumentRoot_Alternative();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

    /**
     * The meta object literal for the '<em><b>Audience</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__AUDIENCE = eINSTANCE.getDocumentRoot_Audience();

    /**
     * The meta object literal for the '<em><b>Available</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__AVAILABLE = eINSTANCE.getDocumentRoot_Available();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__DATE = eINSTANCE.getDocumentRoot_Date();

    /**
     * The meta object literal for the '<em><b>Bibliographic Citation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__BIBLIOGRAPHIC_CITATION = eINSTANCE.getDocumentRoot_BibliographicCitation();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__IDENTIFIER = eINSTANCE.getDocumentRoot_Identifier();

    /**
     * The meta object literal for the '<em><b>Conforms To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CONFORMS_TO = eINSTANCE.getDocumentRoot_ConformsTo();

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
     * The meta object literal for the '<em><b>Created</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATED = eINSTANCE.getDocumentRoot_Created();

    /**
     * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATOR = eINSTANCE.getDocumentRoot_Creator();

    /**
     * The meta object literal for the '<em><b>Date Accepted</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__DATE_ACCEPTED = eINSTANCE.getDocumentRoot_DateAccepted();

    /**
     * The meta object literal for the '<em><b>Date Copyrighted</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__DATE_COPYRIGHTED = eINSTANCE.getDocumentRoot_DateCopyrighted();

    /**
     * The meta object literal for the '<em><b>Date Submitted</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__DATE_SUBMITTED = eINSTANCE.getDocumentRoot_DateSubmitted();

    /**
     * The meta object literal for the '<em><b>Education Level</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EDUCATION_LEVEL = eINSTANCE.getDocumentRoot_EducationLevel();

    /**
     * The meta object literal for the '<em><b>Extent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EXTENT = eINSTANCE.getDocumentRoot_Extent();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FORMAT = eINSTANCE.getDocumentRoot_Format();

    /**
     * The meta object literal for the '<em><b>Has Format</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__HAS_FORMAT = eINSTANCE.getDocumentRoot_HasFormat();

    /**
     * The meta object literal for the '<em><b>Has Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__HAS_PART = eINSTANCE.getDocumentRoot_HasPart();

    /**
     * The meta object literal for the '<em><b>Has Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__HAS_VERSION = eINSTANCE.getDocumentRoot_HasVersion();

    /**
     * The meta object literal for the '<em><b>Instructional Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__INSTRUCTIONAL_METHOD = eINSTANCE.getDocumentRoot_InstructionalMethod();

    /**
     * The meta object literal for the '<em><b>Is Format Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__IS_FORMAT_OF = eINSTANCE.getDocumentRoot_IsFormatOf();

    /**
     * The meta object literal for the '<em><b>Is Part Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__IS_PART_OF = eINSTANCE.getDocumentRoot_IsPartOf();

    /**
     * The meta object literal for the '<em><b>Is Referenced By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__IS_REFERENCED_BY = eINSTANCE.getDocumentRoot_IsReferencedBy();

    /**
     * The meta object literal for the '<em><b>Is Replaced By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__IS_REPLACED_BY = eINSTANCE.getDocumentRoot_IsReplacedBy();

    /**
     * The meta object literal for the '<em><b>Is Required By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__IS_REQUIRED_BY = eINSTANCE.getDocumentRoot_IsRequiredBy();

    /**
     * The meta object literal for the '<em><b>Issued</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ISSUED = eINSTANCE.getDocumentRoot_Issued();

    /**
     * The meta object literal for the '<em><b>Is Version Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__IS_VERSION_OF = eINSTANCE.getDocumentRoot_IsVersionOf();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

    /**
     * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LICENSE = eINSTANCE.getDocumentRoot_License();

    /**
     * The meta object literal for the '<em><b>Mediator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__MEDIATOR = eINSTANCE.getDocumentRoot_Mediator();

    /**
     * The meta object literal for the '<em><b>Medium</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__MEDIUM = eINSTANCE.getDocumentRoot_Medium();

    /**
     * The meta object literal for the '<em><b>Modified</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__MODIFIED = eINSTANCE.getDocumentRoot_Modified();

    /**
     * The meta object literal for the '<em><b>Provenance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PROVENANCE = eINSTANCE.getDocumentRoot_Provenance();

    /**
     * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PUBLISHER = eINSTANCE.getDocumentRoot_Publisher();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__REFERENCES = eINSTANCE.getDocumentRoot_References();

    /**
     * The meta object literal for the '<em><b>Replaces</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__REPLACES = eINSTANCE.getDocumentRoot_Replaces();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__REQUIRES = eINSTANCE.getDocumentRoot_Requires();

    /**
     * The meta object literal for the '<em><b>Rights Holder</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__RIGHTS_HOLDER = eINSTANCE.getDocumentRoot_RightsHolder();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

    /**
     * The meta object literal for the '<em><b>Spatial</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SPATIAL = eINSTANCE.getDocumentRoot_Spatial();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SUBJECT = eINSTANCE.getDocumentRoot_Subject();

    /**
     * The meta object literal for the '<em><b>Table Of Contents</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TABLE_OF_CONTENTS = eINSTANCE.getDocumentRoot_TableOfContents();

    /**
     * The meta object literal for the '<em><b>Temporal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TEMPORAL = eINSTANCE.getDocumentRoot_Temporal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

    /**
     * The meta object literal for the '<em><b>Valid</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__VALID = eINSTANCE.getDocumentRoot_Valid();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.ElementOrRefinementContainerImpl <em>Element Or Refinement Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.ElementOrRefinementContainerImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getElementOrRefinementContainer()
     * @generated
     */
    EClass ELEMENT_OR_REFINEMENT_CONTAINER = eINSTANCE.getElementOrRefinementContainer();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_OR_REFINEMENT_CONTAINER__GROUP = eINSTANCE.getElementOrRefinementContainer_Group();

    /**
     * The meta object literal for the '<em><b>Any Group</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_OR_REFINEMENT_CONTAINER__ANY_GROUP = eINSTANCE.getElementOrRefinementContainer_AnyGroup();

    /**
     * The meta object literal for the '<em><b>Any</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_OR_REFINEMENT_CONTAINER__ANY = eINSTANCE.getElementOrRefinementContainer_Any();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.IMTImpl <em>IMT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.IMTImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getIMT()
     * @generated
     */
    EClass IMT = eINSTANCE.getIMT();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMT__VALUE = eINSTANCE.getIMT_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.ISO3166Impl <em>ISO3166</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.ISO3166Impl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO3166()
     * @generated
     */
    EClass ISO3166 = eINSTANCE.getISO3166();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISO3166__VALUE = eINSTANCE.getISO3166_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.ISO6392Impl <em>ISO6392</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.ISO6392Impl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6392()
     * @generated
     */
    EClass ISO6392 = eINSTANCE.getISO6392();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISO6392__VALUE = eINSTANCE.getISO6392_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.ISO6393Impl <em>ISO6393</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.ISO6393Impl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6393()
     * @generated
     */
    EClass ISO6393 = eINSTANCE.getISO6393();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISO6393__VALUE = eINSTANCE.getISO6393_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.LCCImpl <em>LCC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.LCCImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCC()
     * @generated
     */
    EClass LCC = eINSTANCE.getLCC();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LCC__VALUE = eINSTANCE.getLCC_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.LCSHImpl <em>LCSH</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.LCSHImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCSH()
     * @generated
     */
    EClass LCSH = eINSTANCE.getLCSH();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LCSH__VALUE = eINSTANCE.getLCSH_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.MESHImpl <em>MESH</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.MESHImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getMESH()
     * @generated
     */
    EClass MESH = eINSTANCE.getMESH();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESH__VALUE = eINSTANCE.getMESH_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.PeriodImpl <em>Period</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.PeriodImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getPeriod()
     * @generated
     */
    EClass PERIOD = eINSTANCE.getPeriod();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERIOD__VALUE = eINSTANCE.getPeriod_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.PointImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__VALUE = eINSTANCE.getPoint_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.RFC1766Impl <em>RFC1766</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.RFC1766Impl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC1766()
     * @generated
     */
    EClass RFC1766 = eINSTANCE.getRFC1766();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RFC1766__VALUE = eINSTANCE.getRFC1766_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.RFC3066Impl <em>RFC3066</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.RFC3066Impl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC3066()
     * @generated
     */
    EClass RFC3066 = eINSTANCE.getRFC3066();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RFC3066__VALUE = eINSTANCE.getRFC3066_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.RFC4646Impl <em>RFC4646</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.RFC4646Impl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC4646()
     * @generated
     */
    EClass RFC4646 = eINSTANCE.getRFC4646();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RFC4646__VALUE = eINSTANCE.getRFC4646_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.TGNImpl <em>TGN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.TGNImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getTGN()
     * @generated
     */
    EClass TGN = eINSTANCE.getTGN();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TGN__VALUE = eINSTANCE.getTGN_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.UDCImpl <em>UDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.UDCImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getUDC()
     * @generated
     */
    EClass UDC = eINSTANCE.getUDC();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UDC__VALUE = eINSTANCE.getUDC_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.URIImpl <em>URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.URIImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getURI()
     * @generated
     */
    EClass URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__VALUE = eINSTANCE.getURI_Value();

    /**
     * The meta object literal for the '{@link org.purl.dc.terms.impl.W3CDTFImpl <em>W3CDTF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.purl.dc.terms.impl.W3CDTFImpl
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getW3CDTF()
     * @generated
     */
    EClass W3CDTF = eINSTANCE.getW3CDTF();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute W3CDTF__VALUE = eINSTANCE.getW3CDTF_Value();

    /**
     * The meta object literal for the '<em>Box Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getBoxBaseBase()
     * @generated
     */
    EDataType BOX_BASE_BASE = eINSTANCE.getBoxBaseBase();

    /**
     * The meta object literal for the '<em>DCMI Type Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Enumerator
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getDCMITypeBaseBase()
     * @generated
     */
    EDataType DCMI_TYPE_BASE_BASE = eINSTANCE.getDCMITypeBaseBase();

    /**
     * The meta object literal for the '<em>DDC Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getDDCBaseBase()
     * @generated
     */
    EDataType DDC_BASE_BASE = eINSTANCE.getDDCBaseBase();

    /**
     * The meta object literal for the '<em>IMT Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getIMTBaseBase()
     * @generated
     */
    EDataType IMT_BASE_BASE = eINSTANCE.getIMTBaseBase();

    /**
     * The meta object literal for the '<em>ISO3166 Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO3166BaseBase()
     * @generated
     */
    EDataType ISO3166_BASE_BASE = eINSTANCE.getISO3166BaseBase();

    /**
     * The meta object literal for the '<em>ISO6392 Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6392BaseBase()
     * @generated
     */
    EDataType ISO6392_BASE_BASE = eINSTANCE.getISO6392BaseBase();

    /**
     * The meta object literal for the '<em>ISO6393 Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getISO6393BaseBase()
     * @generated
     */
    EDataType ISO6393_BASE_BASE = eINSTANCE.getISO6393BaseBase();

    /**
     * The meta object literal for the '<em>LCC Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCCBaseBase()
     * @generated
     */
    EDataType LCC_BASE_BASE = eINSTANCE.getLCCBaseBase();

    /**
     * The meta object literal for the '<em>LCSH Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getLCSHBaseBase()
     * @generated
     */
    EDataType LCSH_BASE_BASE = eINSTANCE.getLCSHBaseBase();

    /**
     * The meta object literal for the '<em>MESH Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getMESHBaseBase()
     * @generated
     */
    EDataType MESH_BASE_BASE = eINSTANCE.getMESHBaseBase();

    /**
     * The meta object literal for the '<em>Period Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getPeriodBaseBase()
     * @generated
     */
    EDataType PERIOD_BASE_BASE = eINSTANCE.getPeriodBaseBase();

    /**
     * The meta object literal for the '<em>Point Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getPointBaseBase()
     * @generated
     */
    EDataType POINT_BASE_BASE = eINSTANCE.getPointBaseBase();

    /**
     * The meta object literal for the '<em>RFC1766 Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC1766BaseBase()
     * @generated
     */
    EDataType RFC1766_BASE_BASE = eINSTANCE.getRFC1766BaseBase();

    /**
     * The meta object literal for the '<em>RFC3066 Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC3066BaseBase()
     * @generated
     */
    EDataType RFC3066_BASE_BASE = eINSTANCE.getRFC3066BaseBase();

    /**
     * The meta object literal for the '<em>RFC4646 Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getRFC4646BaseBase()
     * @generated
     */
    EDataType RFC4646_BASE_BASE = eINSTANCE.getRFC4646BaseBase();

    /**
     * The meta object literal for the '<em>TGN Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getTGNBaseBase()
     * @generated
     */
    EDataType TGN_BASE_BASE = eINSTANCE.getTGNBaseBase();

    /**
     * The meta object literal for the '<em>UDC Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getUDCBaseBase()
     * @generated
     */
    EDataType UDC_BASE_BASE = eINSTANCE.getUDCBaseBase();

    /**
     * The meta object literal for the '<em>URI Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getURIBaseBase()
     * @generated
     */
    EDataType URI_BASE_BASE = eINSTANCE.getURIBaseBase();

    /**
     * The meta object literal for the '<em>W3CDTF Base Base</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see javax.xml.datatype.XMLGregorianCalendar
     * @see org.purl.dc.terms.impl.TermsPackageImpl#getW3CDTFBaseBase()
     * @generated
     */
    EDataType W3CDTF_BASE_BASE = eINSTANCE.getW3CDTFBaseBase();

  }

} //TermsPackage
