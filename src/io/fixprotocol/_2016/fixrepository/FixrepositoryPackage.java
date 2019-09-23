/**
 */
package io.fixprotocol._2016.fixrepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * 			FIX Repository standard structure of messages with workflow
 * 			© Copyright 2016-2019 FIX Protocol Limited
 * 			Creative Commons Attribution-NoDerivatives 4.0
 * 			International Public License
 * 		
 * 
 * 			© Copyright 2016-2019 FIX Protocol Limited Creative
 * 			Commons Attribution-NoDerivatives 4.0
 * 			International Public License
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
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface FixrepositoryPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fixrepository";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://fixprotocol.io/2016/fixrepository";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fixrepository";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FixrepositoryPackage eINSTANCE = io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl.init();

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl <em>Action Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ActionTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getActionType()
   * @generated
   */
  int ACTION_TYPE = 0;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__FIELD = 1;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__FIELD_REF = 2;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__COMPONENT_REF = 4;

  /**
   * The feature id for the '<em><b>Group1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__GROUP1 = 5;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__GROUP_REF = 6;

  /**
   * The feature id for the '<em><b>Group2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__GROUP2 = 7;

  /**
   * The feature id for the '<em><b>Message Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__MESSAGE_REF = 8;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__ASSIGN = 9;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__TRIGGER = 10;

  /**
   * The feature id for the '<em><b>Timer Schedule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE__TIMER_SCHEDULE = 11;

  /**
   * The number of structural features of the '<em>Action Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE_FEATURE_COUNT = 12;

  /**
   * The number of operations of the '<em>Action Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ActorsTypeImpl <em>Actors Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ActorsTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getActorsType()
   * @generated
   */
  int ACTORS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTORS_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Actor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTORS_TYPE__ACTOR = 1;

  /**
   * The feature id for the '<em><b>Flow</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTORS_TYPE__FLOW = 2;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTORS_TYPE__BASE = 3;

  /**
   * The number of structural features of the '<em>Actors Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTORS_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Actors Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTORS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl <em>Actor Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ActorTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getActorType()
   * @generated
   */
  int ACTOR_TYPE = 2;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__FIELD = 1;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__FIELD_REF = 2;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__COMPONENT_REF = 4;

  /**
   * The feature id for the '<em><b>Group1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__GROUP1 = 5;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__GROUP_REF = 6;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__STATES = 7;

  /**
   * The feature id for the '<em><b>Timer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__TIMER = 8;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__ANNOTATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__NAME = 10;

  /**
   * The number of structural features of the '<em>Actor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_FEATURE_COUNT = 11;

  /**
   * The number of operations of the '<em>Actor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.AnnotationImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 3;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__GROUP = 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__DOCUMENTATION = 1;

  /**
   * The feature id for the '<em><b>Appinfo</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__APPINFO = 2;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ADDED = 3;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ADDED_EP = 4;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__CHANGE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__DEPRECATED = 6;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__DEPRECATED_EP = 7;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ISSUE = 8;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__LAST_MODIFIED = 9;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__REPLACED = 10;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__REPLACED_BY_FIELD = 11;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__REPLACED_EP = 12;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__SUPPORTED = 13;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__UPDATED = 14;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__UPDATED_EP = 15;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.AppinfoImpl <em>Appinfo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.AppinfoImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getAppinfo()
   * @generated
   */
  int APPINFO = 4;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__MIXED = 0;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ADDED = 1;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ADDED_EP = 2;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__CHANGE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__DEPRECATED = 4;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__DEPRECATED_EP = 5;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ISSUE = 6;

  /**
   * The feature id for the '<em><b>Lang Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__LANG_ID = 7;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__LAST_MODIFIED = 8;

  /**
   * The feature id for the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__PURPOSE = 9;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__REPLACED = 10;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__REPLACED_BY_FIELD = 11;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__REPLACED_EP = 12;

  /**
   * The feature id for the '<em><b>Spec Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__SPEC_URL = 13;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__SUPPORTED = 14;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__UPDATED = 15;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__UPDATED_EP = 16;

  /**
   * The number of structural features of the '<em>Appinfo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO_FEATURE_COUNT = 17;

  /**
   * The number of operations of the '<em>Appinfo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.BlockAssignmentTypeImpl <em>Block Assignment Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.BlockAssignmentTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getBlockAssignmentType()
   * @generated
   */
  int BLOCK_ASSIGNMENT_TYPE = 5;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ASSIGNMENT_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ASSIGNMENT_TYPE__COMPONENT_REF = 1;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ASSIGNMENT_TYPE__GROUP_REF = 2;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ASSIGNMENT_TYPE__FIELD_REF = 3;

  /**
   * The number of structural features of the '<em>Block Assignment Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ASSIGNMENT_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Block Assignment Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ASSIGNMENT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.CategoriesTypeImpl <em>Categories Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.CategoriesTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCategoriesType()
   * @generated
   */
  int CATEGORIES_TYPE = 6;

  /**
   * The feature id for the '<em><b>Category</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIES_TYPE__CATEGORY = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIES_TYPE__BASE = 1;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIES_TYPE__LATEST_EP = 2;

  /**
   * The number of structural features of the '<em>Categories Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIES_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Categories Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl <em>Category Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.CategoryTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCategoryType()
   * @generated
   */
  int CATEGORY_TYPE = 7;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__ADDED = 1;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__ADDED_EP = 2;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__CHANGE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Component Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__COMPONENT_TYPE = 4;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__DEPRECATED = 5;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__DEPRECATED_EP = 6;

  /**
   * The feature id for the '<em><b>FIXML File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__FIXML_FILE_NAME = 7;

  /**
   * The feature id for the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__INCLUDE_FILE = 8;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__ISSUE = 9;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__LAST_MODIFIED = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__NAME = 11;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__REPLACED = 12;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__REPLACED_BY_FIELD = 13;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__REPLACED_EP = 14;

  /**
   * The feature id for the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__SECTION = 15;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__SUPPORTED = 16;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__UPDATED = 17;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE__UPDATED_EP = 18;

  /**
   * The number of structural features of the '<em>Category Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE_FEATURE_COUNT = 19;

  /**
   * The number of operations of the '<em>Category Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.CodeSetsTypeImpl <em>Code Sets Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.CodeSetsTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCodeSetsType()
   * @generated
   */
  int CODE_SETS_TYPE = 8;

  /**
   * The feature id for the '<em><b>Code Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SETS_TYPE__CODE_SET = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SETS_TYPE__BASE = 1;

  /**
   * The number of structural features of the '<em>Code Sets Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SETS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Code Sets Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SETS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.CodeSetTypeImpl <em>Code Set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.CodeSetTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCodeSetType()
   * @generated
   */
  int CODE_SET_TYPE = 9;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__CODE = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__ABBR_NAME = 2;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__ADDED = 3;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__ADDED_EP = 4;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__CHANGE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__DEFAULT = 6;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__DEPRECATED = 7;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__DEPRECATED_EP = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__ID = 9;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__ISSUE = 10;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__LAST_MODIFIED = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__NAME = 12;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__REPLACED = 13;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__REPLACED_BY_FIELD = 14;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__REPLACED_EP = 15;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CODE_SET_TYPE__SCENARIO = 16;

		/**
   * The feature id for the '<em><b>Spec Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__SPEC_URL = 17;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__SUPPORTED = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__TYPE = 19;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__UPDATED = 20;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE__UPDATED_EP = 21;

  /**
   * The number of structural features of the '<em>Code Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE_FEATURE_COUNT = 22;

  /**
   * The number of operations of the '<em>Code Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_SET_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.CodeTypeImpl <em>Code Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.CodeTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCodeType()
   * @generated
   */
  int CODE_TYPE = 10;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__ABBR_NAME = 1;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__ADDED = 2;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__ADDED_EP = 3;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__CHANGE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__DEPRECATED = 5;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__DEPRECATED_EP = 6;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__GROUP = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__ID = 8;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__ISSUE = 9;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__LAST_MODIFIED = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__NAME = 11;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__REPLACED = 12;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__REPLACED_BY_FIELD = 13;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__REPLACED_EP = 14;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CODE_TYPE__SCENARIO = 15;

		/**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__SORT = 16;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__SUPPORTED = 17;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__UPDATED = 18;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__UPDATED_EP = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE__VALUE = 20;

  /**
   * The number of structural features of the '<em>Code Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE_FEATURE_COUNT = 21;

  /**
   * The number of operations of the '<em>Code Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ComponentRefTypeImpl <em>Component Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ComponentRefTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getComponentRefType()
   * @generated
   */
  int COMPONENT_REF_TYPE = 11;

  /**
   * The feature id for the '<em><b>Block Assignment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__BLOCK_ASSIGNMENT = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ADDED = 2;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ADDED_EP = 3;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__CHANGE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__DEPRECATED = 5;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__DEPRECATED_EP = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__INSTANCE_NAME = 8;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ISSUE = 9;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__LAST_MODIFIED = 10;

  /**
   * The feature id for the '<em><b>Presence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__PRESENCE = 11;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__REPLACED = 12;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__REPLACED_BY_FIELD = 13;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__REPLACED_EP = 14;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__SCENARIO = 15;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__SUPPORTED = 16;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__UPDATED = 17;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__UPDATED_EP = 18;

  /**
   * The number of structural features of the '<em>Component Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE_FEATURE_COUNT = 19;

  /**
   * The number of operations of the '<em>Component Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ComponentsTypeImpl <em>Components Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ComponentsTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getComponentsType()
   * @generated
   */
  int COMPONENTS_TYPE = 12;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTS_TYPE__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTS_TYPE__BASE = 1;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTS_TYPE__LATEST_EP = 2;

  /**
   * The number of structural features of the '<em>Components Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTS_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Components Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ComponentTypeImpl <em>Component Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ComponentTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getComponentType()
   * @generated
   */
  int COMPONENT_TYPE = 13;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__COMPONENT_REF = 1;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__GROUP_REF = 2;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__FIELD_REF = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__ANNOTATION = 4;

  /**
   * The feature id for the '<em><b>Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__ABBR_NAME = 5;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__ADDED = 6;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__ADDED_EP = 7;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__CATEGORY = 8;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__CHANGE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__DEPRECATED = 10;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__DEPRECATED_EP = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__ID = 12;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__ISSUE = 13;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__LAST_MODIFIED = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__NAME = 15;

  /**
   * The feature id for the '<em><b>Rendering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__RENDERING = 16;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__REPLACED = 17;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__REPLACED_BY_FIELD = 18;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__REPLACED_EP = 19;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__SCENARIO = 20;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__SUPPORTED = 21;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__UPDATED = 22;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__UPDATED_EP = 23;

  /**
   * The feature id for the '<em><b>Which</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE__WHICH = 24;

  /**
   * The number of structural features of the '<em>Component Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE_FEATURE_COUNT = 25;

  /**
   * The number of operations of the '<em>Component Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ConceptsTypeImpl <em>Concepts Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ConceptsTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getConceptsType()
   * @generated
   */
  int CONCEPTS_TYPE = 14;

  /**
   * The feature id for the '<em><b>Concept</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPTS_TYPE__CONCEPT = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPTS_TYPE__BASE = 1;

  /**
   * The number of structural features of the '<em>Concepts Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPTS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Concepts Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPTS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl <em>Concept Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ConceptTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getConceptType()
   * @generated
   */
  int CONCEPT_TYPE = 15;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE__COMPONENT_REF = 1;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE__GROUP_REF = 2;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE__FIELD_REF = 3;

  /**
   * The feature id for the '<em><b>Message Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE__MESSAGE_REF = 4;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE__ANNOTATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE__NAME = 6;

  /**
   * The number of structural features of the '<em>Concept Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Concept Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.DatatypesTypeImpl <em>Datatypes Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.DatatypesTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getDatatypesType()
   * @generated
   */
  int DATATYPES_TYPE = 16;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES_TYPE__DATATYPE = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES_TYPE__BASE = 1;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES_TYPE__LATEST_EP = 2;

  /**
   * The number of structural features of the '<em>Datatypes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Datatypes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.DatatypeTypeImpl <em>Datatype Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.DatatypeTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getDatatypeType()
   * @generated
   */
  int DATATYPE_TYPE = 17;

  /**
   * The feature id for the '<em><b>Mapped Datatype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__MAPPED_DATATYPE = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__ADDED = 2;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__ADDED_EP = 3;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__BASE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__CHANGE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__DEPRECATED = 6;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__DEPRECATED_EP = 7;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__ISSUE = 8;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__LAST_MODIFIED = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__NAME = 10;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__REPLACED = 11;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__REPLACED_BY_FIELD = 12;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__REPLACED_EP = 13;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__SUPPORTED = 14;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__UPDATED = 15;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE__UPDATED_EP = 16;

  /**
   * The number of structural features of the '<em>Datatype Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE_FEATURE_COUNT = 17;

  /**
   * The number of operations of the '<em>Datatype Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.DocumentationImpl <em>Documentation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.DocumentationImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getDocumentation()
   * @generated
   */
  int DOCUMENTATION = 18;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__MIXED = 0;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__ANY = 1;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__ADDED = 2;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__ADDED_EP = 3;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__CHANGE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Content Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENTATION__CONTENT_TYPE = 5;

		/**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__DEPRECATED = 6;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__DEPRECATED_EP = 7;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__ISSUE = 8;

  /**
   * The feature id for the '<em><b>Lang Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__LANG_ID = 9;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__LAST_MODIFIED = 10;

  /**
   * The feature id for the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__PURPOSE = 11;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__REPLACED = 12;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__REPLACED_BY_FIELD = 13;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__REPLACED_EP = 14;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__SUPPORTED = 15;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__UPDATED = 16;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION__UPDATED_EP = 17;

  /**
   * The number of structural features of the '<em>Documentation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION_FEATURE_COUNT = 18;

  /**
   * The number of operations of the '<em>Documentation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.DocumentRootImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 19;

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
   * The feature id for the '<em><b>Actors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ACTORS = 3;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CATEGORIES = 4;

  /**
   * The feature id for the '<em><b>Code Sets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CODE_SETS = 5;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__COMPONENTS = 6;

  /**
   * The feature id for the '<em><b>Concepts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONCEPTS = 7;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DATATYPE = 8;

  /**
   * The feature id for the '<em><b>Datatypes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DATATYPES = 9;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FIELDS = 10;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DOCUMENT_ROOT__GROUPS = 11;

		/**
   * The feature id for the '<em><b>Mapped Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MAPPED_DATATYPE = 12;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MESSAGES = 13;

  /**
   * The feature id for the '<em><b>Repository</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REPOSITORY = 14;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SECTIONS = 15;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.FieldRefTypeImpl <em>Field Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.FieldRefTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getFieldRefType()
   * @generated
   */
  int FIELD_REF_TYPE = 20;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__RULE = 0;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__ASSIGN = 1;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__ADDED = 3;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__ADDED_EP = 4;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__CHANGE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__DEPRECATED = 6;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__DEPRECATED_EP = 7;

  /**
   * The feature id for the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__ENCODING = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__ID = 9;

  /**
   * The feature id for the '<em><b>Impl Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__IMPL_LENGTH = 10;

  /**
   * The feature id for the '<em><b>Impl Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__IMPL_MAX_LENGTH = 11;

  /**
   * The feature id for the '<em><b>Impl Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__IMPL_MIN_LENGTH = 12;

  /**
   * The feature id for the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__INSTANCE_NAME = 13;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__ISSUE = 14;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__LAST_MODIFIED = 15;

  /**
   * The feature id for the '<em><b>Length Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__LENGTH_ID = 16;

  /**
   * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__MAX_INCLUSIVE = 17;

  /**
   * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__MIN_INCLUSIVE = 18;

  /**
   * The feature id for the '<em><b>Presence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__PRESENCE = 19;

  /**
   * The feature id for the '<em><b>Rendering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__RENDERING = 20;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__REPLACED = 21;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__REPLACED_BY_FIELD = 22;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__REPLACED_EP = 23;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FIELD_REF_TYPE__SCENARIO = 24;

		/**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__SUPPORTED = 25;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__UPDATED = 26;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__UPDATED_EP = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE__VALUE = 28;

  /**
   * The number of structural features of the '<em>Field Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE_FEATURE_COUNT = 29;

  /**
   * The number of operations of the '<em>Field Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl <em>Field Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.FieldRuleTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getFieldRuleType()
   * @generated
   */
  int FIELD_RULE_TYPE = 21;

  /**
   * The feature id for the '<em><b>Unique</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__UNIQUE = 0;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__ASSIGN = 1;

  /**
   * The feature id for the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__WHEN = 2;

  /**
   * The feature id for the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__ENCODING = 3;

  /**
   * The feature id for the '<em><b>Impl Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__IMPL_LENGTH = 4;

  /**
   * The feature id for the '<em><b>Impl Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__IMPL_MAX_LENGTH = 5;

  /**
   * The feature id for the '<em><b>Impl Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__IMPL_MIN_LENGTH = 6;

  /**
   * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__MAX_INCLUSIVE = 7;

  /**
   * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__MIN_INCLUSIVE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__NAME = 9;

  /**
   * The feature id for the '<em><b>Presence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__PRESENCE = 10;

  /**
   * The feature id for the '<em><b>Rendering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__RENDERING = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__TYPE = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE__VALUE = 13;

  /**
   * The number of structural features of the '<em>Field Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE_FEATURE_COUNT = 14;

  /**
   * The number of operations of the '<em>Field Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RULE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.FieldsTypeImpl <em>Fields Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.FieldsTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getFieldsType()
   * @generated
   */
  int FIELDS_TYPE = 22;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_TYPE__FIELD = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_TYPE__BASE = 1;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_TYPE__LATEST_EP = 2;

  /**
   * The number of structural features of the '<em>Fields Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Fields Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl <em>Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.FieldTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getFieldType()
   * @generated
   */
  int FIELD_TYPE = 23;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__RULE = 0;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ASSIGN = 1;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ABBR_NAME = 3;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ADDED = 4;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ADDED_EP = 5;

  /**
   * The feature id for the '<em><b>Base Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__BASE_CATEGORY = 6;

  /**
   * The feature id for the '<em><b>Base Category Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__BASE_CATEGORY_ABBR_NAME = 7;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__CHANGE_TYPE = 8;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__DEPRECATED = 9;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__DEPRECATED_EP = 10;

  /**
   * The feature id for the '<em><b>Discriminator Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__DISCRIMINATOR_ID = 11;

  /**
   * The feature id for the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ENCODING = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ID = 13;

  /**
   * The feature id for the '<em><b>Impl Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__IMPL_LENGTH = 14;

  /**
   * The feature id for the '<em><b>Impl Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__IMPL_MAX_LENGTH = 15;

  /**
   * The feature id for the '<em><b>Impl Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__IMPL_MIN_LENGTH = 16;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__ISSUE = 17;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__LAST_MODIFIED = 18;

  /**
   * The feature id for the '<em><b>Length Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__LENGTH_ID = 19;

  /**
   * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__MAX_INCLUSIVE = 20;

  /**
   * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__MIN_INCLUSIVE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__NAME = 22;

  /**
   * The feature id for the '<em><b>Presence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__PRESENCE = 23;

  /**
   * The feature id for the '<em><b>Rendering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__RENDERING = 24;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__REPLACED = 25;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__REPLACED_BY_FIELD = 26;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__REPLACED_EP = 27;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FIELD_TYPE__SCENARIO = 28;

		/**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__SUPPORTED = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__TYPE = 30;

  /**
   * The feature id for the '<em><b>Union Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__UNION_DATA_TYPE = 31;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__UPDATED = 32;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__UPDATED_EP = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__VALUE = 34;

  /**
   * The number of structural features of the '<em>Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE_FEATURE_COUNT = 35;

  /**
   * The number of operations of the '<em>Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.FlowTypeImpl <em>Flow Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.FlowTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getFlowType()
   * @generated
   */
  int FLOW_TYPE = 24;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__DESTINATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__NAME = 2;

  /**
   * The feature id for the '<em><b>Reliability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__RELIABILITY = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__SOURCE = 4;

  /**
   * The number of structural features of the '<em>Flow Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Flow Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.GroupRefTypeImpl <em>Group Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.GroupRefTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getGroupRefType()
   * @generated
   */
  int GROUP_REF_TYPE = 25;

  /**
   * The feature id for the '<em><b>Block Assignment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__BLOCK_ASSIGNMENT = COMPONENT_REF_TYPE__BLOCK_ASSIGNMENT;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__ANNOTATION = COMPONENT_REF_TYPE__ANNOTATION;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__ADDED = COMPONENT_REF_TYPE__ADDED;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__ADDED_EP = COMPONENT_REF_TYPE__ADDED_EP;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__CHANGE_TYPE = COMPONENT_REF_TYPE__CHANGE_TYPE;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__DEPRECATED = COMPONENT_REF_TYPE__DEPRECATED;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__DEPRECATED_EP = COMPONENT_REF_TYPE__DEPRECATED_EP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__ID = COMPONENT_REF_TYPE__ID;

  /**
   * The feature id for the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__INSTANCE_NAME = COMPONENT_REF_TYPE__INSTANCE_NAME;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__ISSUE = COMPONENT_REF_TYPE__ISSUE;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__LAST_MODIFIED = COMPONENT_REF_TYPE__LAST_MODIFIED;

  /**
   * The feature id for the '<em><b>Presence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__PRESENCE = COMPONENT_REF_TYPE__PRESENCE;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__REPLACED = COMPONENT_REF_TYPE__REPLACED;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__REPLACED_BY_FIELD = COMPONENT_REF_TYPE__REPLACED_BY_FIELD;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__REPLACED_EP = COMPONENT_REF_TYPE__REPLACED_EP;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__SCENARIO = COMPONENT_REF_TYPE__SCENARIO;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__SUPPORTED = COMPONENT_REF_TYPE__SUPPORTED;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__UPDATED = COMPONENT_REF_TYPE__UPDATED;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__UPDATED_EP = COMPONENT_REF_TYPE__UPDATED_EP;

  /**
   * The feature id for the '<em><b>Impl Max Occurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__IMPL_MAX_OCCURS = COMPONENT_REF_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Impl Min Occurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__IMPL_MIN_OCCURS = COMPONENT_REF_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Group Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE_FEATURE_COUNT = COMPONENT_REF_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Group Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE_OPERATION_COUNT = COMPONENT_REF_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.GroupsTypeImpl <em>Groups Type</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.GroupsTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getGroupsType()
   * @generated
   */
	int GROUPS_TYPE = 26;

		/**
   * The feature id for the '<em><b>Group</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GROUPS_TYPE__GROUP = 0;

		/**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPS_TYPE__BASE = 1;

    /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GROUPS_TYPE__LATEST_EP = 2;

		/**
   * The number of structural features of the '<em>Groups Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GROUPS_TYPE_FEATURE_COUNT = 3;

		/**
   * The number of operations of the '<em>Groups Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GROUPS_TYPE_OPERATION_COUNT = 0;

		/**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.GroupTypeImpl <em>Group Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.GroupTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getGroupType()
   * @generated
   */
  int GROUP_TYPE = 27;

  /**
   * The feature id for the '<em><b>Num In Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GROUP_TYPE__NUM_IN_GROUP = 0;

		/**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__GROUP = 1;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__COMPONENT_REF = 2;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__GROUP_REF = 3;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__FIELD_REF = 4;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__ANNOTATION = 5;

  /**
   * The feature id for the '<em><b>Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__ABBR_NAME = 6;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__ADDED = 7;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__ADDED_EP = 8;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__CATEGORY = 9;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__CHANGE_TYPE = 10;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__DEPRECATED = 11;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__DEPRECATED_EP = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__ID = 13;

  /**
   * The feature id for the '<em><b>Impl Max Occurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__IMPL_MAX_OCCURS = 14;

  /**
   * The feature id for the '<em><b>Impl Min Occurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__IMPL_MIN_OCCURS = 15;

		/**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__ISSUE = 16;

		/**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__LAST_MODIFIED = 17;

		/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__NAME = 18;

		/**
   * The feature id for the '<em><b>Rendering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__RENDERING = 19;

		/**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__REPLACED = 20;

		/**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__REPLACED_BY_FIELD = 21;

		/**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__REPLACED_EP = 22;

		/**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__SCENARIO = 23;

		/**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__SUPPORTED = 24;

		/**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__UPDATED = 25;

		/**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__UPDATED_EP = 26;

  /**
   * The feature id for the '<em><b>Which</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__WHICH = 27;

  /**
   * The number of structural features of the '<em>Group Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE_FEATURE_COUNT = 28;

  /**
   * The number of operations of the '<em>Group Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.IdentifiersTypeImpl <em>Identifiers Type</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.IdentifiersTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getIdentifiersType()
   * @generated
   */
	int IDENTIFIERS_TYPE = 28;

		/**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIERS_TYPE__GROUP = 0;

		/**
   * The feature id for the '<em><b>Correlate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIERS_TYPE__CORRELATE = 1;

		/**
   * The feature id for the '<em><b>Assign</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIERS_TYPE__ASSIGN = 2;

		/**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIERS_TYPE__ANNOTATION = 3;

		/**
   * The number of structural features of the '<em>Identifiers Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIERS_TYPE_FEATURE_COUNT = 4;

		/**
   * The number of operations of the '<em>Identifiers Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIERS_TYPE_OPERATION_COUNT = 0;

		/**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.IdentifierTypeImpl <em>Identifier Type</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.IdentifierTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getIdentifierType()
   * @generated
   */
	int IDENTIFIER_TYPE = 29;

		/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIER_TYPE__ID = 0;

		/**
   * The feature id for the '<em><b>Source Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIER_TYPE__SOURCE_ID = 1;

		/**
   * The number of structural features of the '<em>Identifier Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIER_TYPE_FEATURE_COUNT = 2;

		/**
   * The number of operations of the '<em>Identifier Type</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IDENTIFIER_TYPE_OPERATION_COUNT = 0;

		/**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl <em>Mapped Datatype Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMappedDatatypeType()
   * @generated
   */
  int MAPPED_DATATYPE_TYPE = 30;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPED_DATATYPE_TYPE__ANY = 0;

		/**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__BASE = 1;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__BUILTIN = 2;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__MAX_INCLUSIVE = 4;

  /**
   * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__MIN_INCLUSIVE = 5;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__PATTERN = 7;

  /**
   * The feature id for the '<em><b>Standard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE__STANDARD = 8;

  /**
   * The number of structural features of the '<em>Mapped Datatype Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE_FEATURE_COUNT = 9;

  /**
   * The number of operations of the '<em>Mapped Datatype Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.MessageRefTypeImpl <em>Message Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.MessageRefTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMessageRefType()
   * @generated
   */
  int MESSAGE_REF_TYPE = 31;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MESSAGE_REF_TYPE__IDENTIFIERS = 0;

		/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MESSAGE_REF_TYPE__ID = 1;

		/**
   * The feature id for the '<em><b>Impl Max Occurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_REF_TYPE__IMPL_MAX_OCCURS = 2;

  /**
   * The feature id for the '<em><b>Impl Min Occurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_REF_TYPE__IMPL_MIN_OCCURS = 3;

  /**
   * The feature id for the '<em><b>Msg Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_REF_TYPE__MSG_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_REF_TYPE__NAME = 5;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_REF_TYPE__SCENARIO = 6;

  /**
   * The number of structural features of the '<em>Message Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_REF_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Message Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_REF_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.MessagesTypeImpl <em>Messages Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.MessagesTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMessagesType()
   * @generated
   */
  int MESSAGES_TYPE = 32;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES_TYPE__MESSAGE = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES_TYPE__BASE = 1;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES_TYPE__LATEST_EP = 2;

  /**
   * The number of structural features of the '<em>Messages Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Messages Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.MessageTypeImpl <em>Message Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.MessageTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMessageType()
   * @generated
   */
  int MESSAGE_TYPE = 33;

  /**
   * The feature id for the '<em><b>Structure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__STRUCTURE = 0;

  /**
   * The feature id for the '<em><b>Responses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__RESPONSES = 1;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Abbr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__ABBR_NAME = 3;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__ADDED = 4;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__ADDED_EP = 5;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__CATEGORY = 6;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__CHANGE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__DEPRECATED = 8;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__DEPRECATED_EP = 9;

  /**
   * The feature id for the '<em><b>Flow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__FLOW = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__ID = 11;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__ISSUE = 12;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__LAST_MODIFIED = 13;

  /**
   * The feature id for the '<em><b>Msg Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__MSG_TYPE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__NAME = 15;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__REPLACED = 16;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__REPLACED_BY_FIELD = 17;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__REPLACED_EP = 18;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__SCENARIO = 19;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__SUPPORTED = 20;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__UPDATED = 21;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE__UPDATED_EP = 22;

  /**
   * The number of structural features of the '<em>Message Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE_FEATURE_COUNT = 23;

  /**
   * The number of operations of the '<em>Message Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl <em>Repository Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.RepositoryTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getRepositoryType()
   * @generated
   */
  int REPOSITORY_TYPE = 34;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__METADATA = 0;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__CATEGORIES = 1;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__SECTIONS = 2;

  /**
   * The feature id for the '<em><b>Datatypes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__DATATYPES = 3;

  /**
   * The feature id for the '<em><b>Code Sets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__CODE_SETS = 4;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__FIELDS = 5;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__ACTORS = 6;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__COMPONENTS = 7;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REPOSITORY_TYPE__GROUPS = 8;

		/**
   * The feature id for the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__MESSAGES = 9;

  /**
   * The feature id for the '<em><b>Concepts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__CONCEPTS = 10;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__ANNOTATION = 11;

  /**
   * The feature id for the '<em><b>Appl Ver Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__APPL_VER_ID = 12;

  /**
   * The feature id for the '<em><b>Expression Language</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REPOSITORY_TYPE__EXPRESSION_LANGUAGE = 13;

		/**
   * The feature id for the '<em><b>Guid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__GUID = 14;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__LATEST_EP = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__NAME = 16;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__NAMESPACE = 17;

  /**
   * The feature id for the '<em><b>Spec Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__SPEC_URL = 18;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__VERSION = 19;

  /**
   * The number of structural features of the '<em>Repository Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE_FEATURE_COUNT = 20;

  /**
   * The number of operations of the '<em>Repository Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ResponsesTypeImpl <em>Responses Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ResponsesTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getResponsesType()
   * @generated
   */
  int RESPONSES_TYPE = 35;

  /**
   * The feature id for the '<em><b>Response</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSES_TYPE__RESPONSE = 0;

  /**
   * The number of structural features of the '<em>Responses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSES_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Responses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.ResponseTypeImpl <em>Response Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.ResponseTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getResponseType()
   * @generated
   */
  int RESPONSE_TYPE = 36;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__GROUP = ACTION_TYPE__GROUP;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__FIELD = ACTION_TYPE__FIELD;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__FIELD_REF = ACTION_TYPE__FIELD_REF;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__COMPONENT = ACTION_TYPE__COMPONENT;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__COMPONENT_REF = ACTION_TYPE__COMPONENT_REF;

  /**
   * The feature id for the '<em><b>Group1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__GROUP1 = ACTION_TYPE__GROUP1;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__GROUP_REF = ACTION_TYPE__GROUP_REF;

  /**
   * The feature id for the '<em><b>Group2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__GROUP2 = ACTION_TYPE__GROUP2;

  /**
   * The feature id for the '<em><b>Message Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__MESSAGE_REF = ACTION_TYPE__MESSAGE_REF;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__ASSIGN = ACTION_TYPE__ASSIGN;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__TRIGGER = ACTION_TYPE__TRIGGER;

  /**
   * The feature id for the '<em><b>Timer Schedule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__TIMER_SCHEDULE = ACTION_TYPE__TIMER_SCHEDULE;

  /**
   * The feature id for the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__WHEN = ACTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__ANNOTATION = ACTION_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__NAME = ACTION_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sync</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE__SYNC = ACTION_TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Response Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE_FEATURE_COUNT = ACTION_TYPE_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Response Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TYPE_OPERATION_COUNT = ACTION_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.SectionsTypeImpl <em>Sections Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.SectionsTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getSectionsType()
   * @generated
   */
  int SECTIONS_TYPE = 37;

  /**
   * The feature id for the '<em><b>Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONS_TYPE__SECTION = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONS_TYPE__BASE = 1;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONS_TYPE__LATEST_EP = 2;

  /**
   * The number of structural features of the '<em>Sections Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONS_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Sections Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl <em>Section Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.SectionTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getSectionType()
   * @generated
   */
  int SECTION_TYPE = 38;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__ADDED = 1;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__ADDED_EP = 2;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__CHANGE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__DEPRECATED = 4;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__DEPRECATED_EP = 5;

  /**
   * The feature id for the '<em><b>Display Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__DISPLAY_ORDER = 6;

  /**
   * The feature id for the '<em><b>FIXML File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__FIXML_FILE_NAME = 7;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__ISSUE = 8;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__LAST_MODIFIED = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__NAME = 10;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__REPLACED = 11;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__REPLACED_BY_FIELD = 12;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__REPLACED_EP = 13;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__SUPPORTED = 14;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__UPDATED = 15;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE__UPDATED_EP = 16;

  /**
   * The number of structural features of the '<em>Section Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE_FEATURE_COUNT = 17;

  /**
   * The number of operations of the '<em>Section Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.StateMachineTypeImpl <em>State Machine Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.StateMachineTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getStateMachineType()
   * @generated
   */
  int STATE_MACHINE_TYPE = 39;

  /**
   * The feature id for the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_TYPE__INITIAL = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_TYPE__STATE = 1;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_TYPE__ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_TYPE__NAME = 3;

  /**
   * The number of structural features of the '<em>State Machine Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>State Machine Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.StateTypeImpl <em>State Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.StateTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 40;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__TRANSITION = 0;

  /**
   * The feature id for the '<em><b>Onentry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__ONENTRY = 1;

  /**
   * The feature id for the '<em><b>Activity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__ACTIVITY = 2;

  /**
   * The feature id for the '<em><b>Onexit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__ONEXIT = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__ANNOTATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__NAME = 5;

  /**
   * The number of structural features of the '<em>State Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>State Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl <em>Structure Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.StructureTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getStructureType()
   * @generated
   */
  int STRUCTURE_TYPE = 41;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Component Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_TYPE__COMPONENT_REF = 1;

  /**
   * The feature id for the '<em><b>Group Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_TYPE__GROUP_REF = 2;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_TYPE__FIELD_REF = 3;

  /**
   * The feature id for the '<em><b>Which</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_TYPE__WHICH = 4;

  /**
   * The number of structural features of the '<em>Structure Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_TYPE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Structure Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.TimerScheduleImpl <em>Timer Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.TimerScheduleImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getTimerSchedule()
   * @generated
   */
  int TIMER_SCHEDULE = 42;

  /**
   * The feature id for the '<em><b>Activity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_SCHEDULE__ACTIVITY = 0;

  /**
   * The feature id for the '<em><b>Actor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_SCHEDULE__ACTOR = 1;

  /**
   * The feature id for the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_SCHEDULE__INTERVAL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_SCHEDULE__NAME = 3;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_SCHEDULE__OPERATION = 4;

  /**
   * The number of structural features of the '<em>Timer Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_SCHEDULE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Timer Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_SCHEDULE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.TimerTypeImpl <em>Timer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.TimerTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getTimerType()
   * @generated
   */
  int TIMER_TYPE = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Timer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Timer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMER_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.TransitionTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getTransitionType()
   * @generated
   */
  int TRANSITION_TYPE = 44;

  /**
   * The feature id for the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE__WHEN = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE__ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE__NAME = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE__TARGET = 3;

  /**
   * The number of structural features of the '<em>Transition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Transition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.TriggerTypeImpl <em>Trigger Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.TriggerTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getTriggerType()
   * @generated
   */
  int TRIGGER_TYPE = 45;

  /**
   * The feature id for the '<em><b>Actor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_TYPE__ACTOR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>State Machine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_TYPE__STATE_MACHINE = 2;

  /**
   * The number of structural features of the '<em>Trigger Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Trigger Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.impl.UniqueTypeImpl <em>Unique Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.impl.UniqueTypeImpl
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getUniqueType()
   * @generated
   */
  int UNIQUE_TYPE = 46;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TYPE__FIELD_REF = 0;

  /**
   * The number of structural features of the '<em>Unique Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Unique Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.CatComponentTypeT <em>Cat Component Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.CatComponentTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCatComponentTypeT()
   * @generated
   */
  int CAT_COMPONENT_TYPE_T = 47;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.CategoryComponentTypeT <em>Category Component Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.CategoryComponentTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCategoryComponentTypeT()
   * @generated
   */
  int CATEGORY_COMPONENT_TYPE_T = 48;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.CatIncludeFileT <em>Cat Include File T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.CatIncludeFileT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCatIncludeFileT()
   * @generated
   */
  int CAT_INCLUDE_FILE_T = 49;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.ChangeTypeT <em>Change Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.ChangeTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getChangeTypeT()
   * @generated
   */
  int CHANGE_TYPE_T = 50;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.DatatypeStandardEnum <em>Datatype Standard Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.DatatypeStandardEnum
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getDatatypeStandardEnum()
   * @generated
   */
  int DATATYPE_STANDARD_ENUM = 51;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.IncludeFileT <em>Include File T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.IncludeFileT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getIncludeFileT()
   * @generated
   */
  int INCLUDE_FILE_T = 52;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.MemberType <em>Member Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.MemberType
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMemberType()
   * @generated
   */
  int MEMBER_TYPE = 53;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.PresenceT <em>Presence T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.PresenceT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getPresenceT()
   * @generated
   */
  int PRESENCE_T = 54;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.PurposeEnum <em>Purpose Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.PurposeEnum
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getPurposeEnum()
   * @generated
   */
  int PURPOSE_ENUM = 55;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.ReliabilityT <em>Reliability T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.ReliabilityT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getReliabilityT()
   * @generated
   */
  int RELIABILITY_T = 56;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.SupportType <em>Support Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.SupportType
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getSupportType()
   * @generated
   */
  int SUPPORT_TYPE = 57;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.Synchronization <em>Synchronization</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.Synchronization
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getSynchronization()
   * @generated
   */
  int SYNCHRONIZATION = 58;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.TimerOperation <em>Timer Operation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.TimerOperation
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getTimerOperation()
   * @generated
   */
  int TIMER_OPERATION = 59;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.Unbounded <em>Unbounded</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.Unbounded
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getUnbounded()
   * @generated
   */
  int UNBOUNDED = 60;

  /**
   * The meta object id for the '{@link io.fixprotocol._2016.fixrepository.UnionDataTypeT <em>Union Data Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.UnionDataTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getUnionDataTypeT()
   * @generated
   */
  int UNION_DATA_TYPE_T = 61;

  /**
   * The meta object id for the '<em>Abbreviation T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getAbbreviationT()
   * @generated
   */
  int ABBREVIATION_T = 62;

  /**
   * The meta object id for the '<em>Cat Component Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.CatComponentTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCatComponentTypeTObject()
   * @generated
   */
  int CAT_COMPONENT_TYPE_TOBJECT = 63;

  /**
   * The meta object id for the '<em>Category Component Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.CategoryComponentTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCategoryComponentTypeTObject()
   * @generated
   */
  int CATEGORY_COMPONENT_TYPE_TOBJECT = 64;

  /**
   * The meta object id for the '<em>Cat Include File TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.CatIncludeFileT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCatIncludeFileTObject()
   * @generated
   */
  int CAT_INCLUDE_FILE_TOBJECT = 65;

  /**
   * The meta object id for the '<em>Change Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.ChangeTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getChangeTypeTObject()
   * @generated
   */
  int CHANGE_TYPE_TOBJECT = 66;

  /**
   * The meta object id for the '<em>Comp IDT</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getCompIDT()
   * @generated
   */
  int COMP_IDT = 67;

  /**
   * The meta object id for the '<em>Component Name T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getComponentNameT()
   * @generated
   */
  int COMPONENT_NAME_T = 68;

  /**
   * The meta object id for the '<em>Datatype Standard Enum Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.DatatypeStandardEnum
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getDatatypeStandardEnumObject()
   * @generated
   */
  int DATATYPE_STANDARD_ENUM_OBJECT = 69;

  /**
   * The meta object id for the '<em>Datatype Standard T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getDatatypeStandardT()
   * @generated
   */
  int DATATYPE_STANDARD_T = 70;

  /**
   * The meta object id for the '<em>Edition T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getEditionT()
   * @generated
   */
  int EDITION_T = 71;

  /**
   * The meta object id for the '<em>EPT</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getEPT()
   * @generated
   */
  int EPT = 72;

  /**
   * The meta object id for the '<em>Expression Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getExpressionType()
   * @generated
   */
  int EXPRESSION_TYPE = 73;

  /**
   * The meta object id for the '<em>Group Name T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getGroupNameT()
   * @generated
   */
  int GROUP_NAME_T = 74;

  /**
   * The meta object id for the '<em>Id T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getIdT()
   * @generated
   */
  int ID_T = 75;

  /**
   * The meta object id for the '<em>Include File TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.IncludeFileT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getIncludeFileTObject()
   * @generated
   */
  int INCLUDE_FILE_TOBJECT = 76;

  /**
   * The meta object id for the '<em>Language T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getLanguageT()
   * @generated
   */
  int LANGUAGE_T = 77;

  /**
   * The meta object id for the '<em>Member Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.MemberType
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMemberTypeObject()
   * @generated
   */
  int MEMBER_TYPE_OBJECT = 78;

  /**
   * The meta object id for the '<em>Mime T</em>' data type.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMimeT()
   * @generated
   */
	int MIME_T = 79;

		/**
   * The meta object id for the '<em>Msg Type T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getMsgTypeT()
   * @generated
   */
  int MSG_TYPE_T = 80;

  /**
   * The meta object id for the '<em>Name T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getNameT()
   * @generated
   */
  int NAME_T = 81;

  /**
   * The meta object id for the '<em>Presence TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.PresenceT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getPresenceTObject()
   * @generated
   */
  int PRESENCE_TOBJECT = 82;

  /**
   * The meta object id for the '<em>Purpose Enum Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.PurposeEnum
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getPurposeEnumObject()
   * @generated
   */
  int PURPOSE_ENUM_OBJECT = 83;

  /**
   * The meta object id for the '<em>Purpose T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getPurposeT()
   * @generated
   */
  int PURPOSE_T = 84;

  /**
   * The meta object id for the '<em>Reliability TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.ReliabilityT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getReliabilityTObject()
   * @generated
   */
  int RELIABILITY_TOBJECT = 85;

  /**
   * The meta object id for the '<em>Scenario T</em>' data type.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getScenarioT()
   * @generated
   */
	int SCENARIO_T = 86;

		/**
   * The meta object id for the '<em>Sort T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getSortT()
   * @generated
   */
  int SORT_T = 87;

  /**
   * The meta object id for the '<em>Support Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.SupportType
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getSupportTypeObject()
   * @generated
   */
  int SUPPORT_TYPE_OBJECT = 88;

  /**
   * The meta object id for the '<em>Synchronization Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.Synchronization
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getSynchronizationObject()
   * @generated
   */
  int SYNCHRONIZATION_OBJECT = 89;

  /**
   * The meta object id for the '<em>Term T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getTermT()
   * @generated
   */
  int TERM_T = 90;

  /**
   * The meta object id for the '<em>Timer Operation Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.TimerOperation
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getTimerOperationObject()
   * @generated
   */
  int TIMER_OPERATION_OBJECT = 91;

  /**
   * The meta object id for the '<em>Unbounded Int Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getUnboundedIntType()
   * @generated
   */
  int UNBOUNDED_INT_TYPE = 92;

  /**
   * The meta object id for the '<em>Unbounded Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.Unbounded
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getUnboundedObject()
   * @generated
   */
  int UNBOUNDED_OBJECT = 93;

  /**
   * The meta object id for the '<em>Union Data Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2016.fixrepository.UnionDataTypeT
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getUnionDataTypeTObject()
   * @generated
   */
  int UNION_DATA_TYPE_TOBJECT = 94;

  /**
   * The meta object id for the '<em>Usage T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getUsageT()
   * @generated
   */
  int USAGE_T = 95;

  /**
   * The meta object id for the '<em>Version T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2016.fixrepository.impl.FixrepositoryPackageImpl#getVersionT()
   * @generated
   */
  int VERSION_T = 96;

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType
   * @generated
   */
  EClass getActionType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.ActionType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getGroup()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getField()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Field();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getFieldRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_FieldRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getComponent()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Component();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getComponentRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getGroup1 <em>Group1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group1</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getGroup1()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Group1();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getGroupRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_GroupRef();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.ActionType#getGroup2 <em>Group2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group2</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getGroup2()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_Group2();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getMessageRef <em>Message Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getMessageRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_MessageRef();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.ActionType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Assign</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getAssign()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_Assign();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trigger</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getTrigger()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Trigger();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActionType#getTimerSchedule <em>Timer Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timer Schedule</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActionType#getTimerSchedule()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_TimerSchedule();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ActorsType <em>Actors Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actors Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorsType
   * @generated
   */
  EClass getActorsType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.ActorsType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorsType#getGroup()
   * @see #getActorsType()
   * @generated
   */
  EAttribute getActorsType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorsType#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actor</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorsType#getActor()
   * @see #getActorsType()
   * @generated
   */
  EReference getActorsType_Actor();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorsType#getFlow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flow</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorsType#getFlow()
   * @see #getActorsType()
   * @generated
   */
  EReference getActorsType_Flow();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ActorsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorsType#getBase()
   * @see #getActorsType()
   * @generated
   */
  EAttribute getActorsType_Base();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ActorType <em>Actor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType
   * @generated
   */
  EClass getActorType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.ActorType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getGroup()
   * @see #getActorType()
   * @generated
   */
  EAttribute getActorType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getField()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Field();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getFieldRef()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_FieldRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getComponent()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Component();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getComponentRef()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getGroup1 <em>Group1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group1</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getGroup1()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Group1();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getGroupRef()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getStates()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_States();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ActorType#getTimer <em>Timer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timer</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getTimer()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Timer();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.ActorType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getAnnotation()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ActorType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.ActorType#getName()
   * @see #getActorType()
   * @generated
   */
  EAttribute getActorType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.Annotation#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getGroup()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.Annotation#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Documentation</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getDocumentation()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.Annotation#getAppinfo <em>Appinfo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Appinfo</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getAppinfo()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Appinfo();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getAdded()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getAddedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getChangeType()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getDeprecated()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getDeprecatedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getIssue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getLastModified()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getReplaced()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getReplacedByField()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getReplacedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getSupported()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getUpdated()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Annotation#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Annotation#getUpdatedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.Appinfo <em>Appinfo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Appinfo</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo
   * @generated
   */
  EClass getAppinfo();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.Appinfo#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getMixed()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Mixed();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getAdded()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getAddedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getChangeType()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getDeprecated()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getDeprecatedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getIssue()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getLangId <em>Lang Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getLangId()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_LangId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getLastModified()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getPurpose <em>Purpose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purpose</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getPurpose()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Purpose();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getReplaced()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getReplacedByField()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getReplacedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getSpecUrl <em>Spec Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec Url</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getSpecUrl()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_SpecUrl();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getSupported()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getUpdated()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Appinfo#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Appinfo#getUpdatedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.BlockAssignmentType <em>Block Assignment Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Assignment Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.BlockAssignmentType
   * @generated
   */
  EClass getBlockAssignmentType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.BlockAssignmentType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.BlockAssignmentType#getGroup()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EAttribute getBlockAssignmentType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.BlockAssignmentType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.BlockAssignmentType#getComponentRef()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EReference getBlockAssignmentType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.BlockAssignmentType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.BlockAssignmentType#getGroupRef()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EReference getBlockAssignmentType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.BlockAssignmentType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.BlockAssignmentType#getFieldRef()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EReference getBlockAssignmentType_FieldRef();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.CategoriesType <em>Categories Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Categories Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoriesType
   * @generated
   */
  EClass getCategoriesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.CategoriesType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Category</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoriesType#getCategory()
   * @see #getCategoriesType()
   * @generated
   */
  EReference getCategoriesType_Category();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoriesType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoriesType#getBase()
   * @see #getCategoriesType()
   * @generated
   */
  EAttribute getCategoriesType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoriesType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoriesType#getLatestEP()
   * @see #getCategoriesType()
   * @generated
   */
  EAttribute getCategoriesType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.CategoryType <em>Category Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType
   * @generated
   */
  EClass getCategoryType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.CategoryType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getAnnotation()
   * @see #getCategoryType()
   * @generated
   */
  EReference getCategoryType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getAdded()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getAddedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getChangeType()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getComponentType()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ComponentType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getDeprecated()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getDeprecatedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getFIXMLFileName <em>FIXML File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>FIXML File Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getFIXMLFileName()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_FIXMLFileName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getIncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include File</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getIncludeFile()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_IncludeFile();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getIssue()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getLastModified()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getName()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getReplaced()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getReplacedByField()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getReplacedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Section</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getSection()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Section();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getSupported()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getUpdated()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CategoryType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryType#getUpdatedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.CodeSetsType <em>Code Sets Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Sets Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetsType
   * @generated
   */
  EClass getCodeSetsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.CodeSetsType#getCodeSet <em>Code Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code Set</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetsType#getCodeSet()
   * @see #getCodeSetsType()
   * @generated
   */
  EReference getCodeSetsType_CodeSet();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetsType#getBase()
   * @see #getCodeSetsType()
   * @generated
   */
  EAttribute getCodeSetsType_Base();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.CodeSetType <em>Code Set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Set Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType
   * @generated
   */
  EClass getCodeSetType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getCode()
   * @see #getCodeSetType()
   * @generated
   */
  EReference getCodeSetType_Code();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getAnnotation()
   * @see #getCodeSetType()
   * @generated
   */
  EReference getCodeSetType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getAbbrName()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getAdded()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getAddedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getChangeType()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getDefault()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Default();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getDeprecated()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getDeprecatedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getId()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getIssue()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getLastModified()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getName()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getReplaced()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getReplacedByField()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getReplacedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getScenario()
   * @see #getCodeSetType()
   * @generated
   */
	EAttribute getCodeSetType_Scenario();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getSpecUrl <em>Spec Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec Url</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getSpecUrl()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_SpecUrl();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getSupported()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getType()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Type();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getUpdated()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeSetType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeSetType#getUpdatedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.CodeType <em>Code Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType
   * @generated
   */
  EClass getCodeType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.CodeType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getAnnotation()
   * @see #getCodeType()
   * @generated
   */
  EReference getCodeType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getAbbrName()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getAdded()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getAddedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getChangeType()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getDeprecated()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getDeprecatedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getGroup()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Group();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getId()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getIssue()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getLastModified()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getName()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getReplaced()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getReplacedByField()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getReplacedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getScenario()
   * @see #getCodeType()
   * @generated
   */
	EAttribute getCodeType_Scenario();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getSort()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Sort();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getSupported()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getUpdated()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getUpdatedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.CodeType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2016.fixrepository.CodeType#getValue()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ComponentRefType <em>Component Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Ref Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType
   * @generated
   */
  EClass getComponentRefType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getBlockAssignment <em>Block Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Block Assignment</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getBlockAssignment()
   * @see #getComponentRefType()
   * @generated
   */
  EReference getComponentRefType_BlockAssignment();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getAnnotation()
   * @see #getComponentRefType()
   * @generated
   */
  EReference getComponentRefType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getAdded()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getAddedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getChangeType()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getDeprecated()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getDeprecatedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getId()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getInstanceName <em>Instance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getInstanceName()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_InstanceName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getIssue()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getLastModified()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getPresence()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getReplaced()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getReplacedByField()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getReplacedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getScenario()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getSupported()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getUpdated()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentRefType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentRefType#getUpdatedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ComponentsType <em>Components Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Components Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentsType
   * @generated
   */
  EClass getComponentsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ComponentsType#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentsType#getComponent()
   * @see #getComponentsType()
   * @generated
   */
  EReference getComponentsType_Component();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentsType#getBase()
   * @see #getComponentsType()
   * @generated
   */
  EAttribute getComponentsType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentsType#getLatestEP()
   * @see #getComponentsType()
   * @generated
   */
  EAttribute getComponentsType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType
   * @generated
   */
  EClass getComponentType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.ComponentType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getGroup()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ComponentType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getComponentRef()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ComponentType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getGroupRef()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ComponentType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getFieldRef()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_FieldRef();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getAnnotation()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getAbbrName()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getAdded()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getAddedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getCategory()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Category();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getChangeType()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getDeprecated()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getDeprecatedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getId()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getIssue()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getLastModified()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getName()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getRendering()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getReplaced()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getReplacedByField()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getReplacedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getScenario()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getSupported()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getUpdated()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getUpdatedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ComponentType#getWhich <em>Which</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Which</em>'.
   * @see io.fixprotocol._2016.fixrepository.ComponentType#getWhich()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Which();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ConceptsType <em>Concepts Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concepts Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptsType
   * @generated
   */
  EClass getConceptsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ConceptsType#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concept</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptsType#getConcept()
   * @see #getConceptsType()
   * @generated
   */
  EReference getConceptsType_Concept();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ConceptsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptsType#getBase()
   * @see #getConceptsType()
   * @generated
   */
  EAttribute getConceptsType_Base();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ConceptType <em>Concept Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType
   * @generated
   */
  EClass getConceptType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.ConceptType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType#getGroup()
   * @see #getConceptType()
   * @generated
   */
  EAttribute getConceptType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ConceptType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType#getComponentRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ConceptType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType#getGroupRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ConceptType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType#getFieldRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_FieldRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ConceptType#getMessageRef <em>Message Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType#getMessageRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_MessageRef();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.ConceptType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType#getAnnotation()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ConceptType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.ConceptType#getName()
   * @see #getConceptType()
   * @generated
   */
  EAttribute getConceptType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.DatatypesType <em>Datatypes Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatypes Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypesType
   * @generated
   */
  EClass getDatatypesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.DatatypesType#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datatype</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypesType#getDatatype()
   * @see #getDatatypesType()
   * @generated
   */
  EReference getDatatypesType_Datatype();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypesType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypesType#getBase()
   * @see #getDatatypesType()
   * @generated
   */
  EAttribute getDatatypesType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypesType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypesType#getLatestEP()
   * @see #getDatatypesType()
   * @generated
   */
  EAttribute getDatatypesType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.DatatypeType <em>Datatype Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType
   * @generated
   */
  EClass getDatatypeType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getMappedDatatype <em>Mapped Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Datatype</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getMappedDatatype()
   * @see #getDatatypeType()
   * @generated
   */
  EReference getDatatypeType_MappedDatatype();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getAnnotation()
   * @see #getDatatypeType()
   * @generated
   */
  EReference getDatatypeType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getAdded()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getAddedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getBaseType()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_BaseType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getChangeType()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getDeprecated()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getDeprecatedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getIssue()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getLastModified()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getName()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getReplaced()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getReplacedByField()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getReplacedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getSupported()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getUpdated()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.DatatypeType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeType#getUpdatedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.Documentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documentation</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation
   * @generated
   */
  EClass getDocumentation();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.Documentation#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getMixed()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Mixed();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.Documentation#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getAny()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Any();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getAdded()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getAddedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getChangeType()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getContentType <em>Content Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getContentType()
   * @see #getDocumentation()
   * @generated
   */
	EAttribute getDocumentation_ContentType();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getDeprecated()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getDeprecatedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getIssue()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getLangId <em>Lang Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getLangId()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_LangId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getLastModified()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getPurpose <em>Purpose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purpose</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getPurpose()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Purpose();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getReplaced()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getReplacedByField()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getReplacedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getSupported()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getUpdated()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.Documentation#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.Documentation#getUpdatedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actors</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getActors()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Actors();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Categories</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getCategories()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Categories();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getCodeSets <em>Code Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code Sets</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getCodeSets()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CodeSets();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Components</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getComponents()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Components();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getConcepts <em>Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concepts</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getConcepts()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Concepts();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatype()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Datatype();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatypes <em>Datatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatypes</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getDatatypes()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Datatypes();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getFields()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Fields();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Groups</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getGroups()
   * @see #getDocumentRoot()
   * @generated
   */
	EReference getDocumentRoot_Groups();

		/**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMappedDatatype <em>Mapped Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapped Datatype</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getMappedDatatype()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MappedDatatype();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Messages</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getMessages()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Messages();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repository</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getRepository()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Repository();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.DocumentRoot#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sections</em>'.
   * @see io.fixprotocol._2016.fixrepository.DocumentRoot#getSections()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Sections();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.FieldRefType <em>Field Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Ref Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType
   * @generated
   */
  EClass getFieldRefType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getRule()
   * @see #getFieldRefType()
   * @generated
   */
  EReference getFieldRefType_Rule();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assign</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getAssign()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Assign();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getAnnotation()
   * @see #getFieldRefType()
   * @generated
   */
  EReference getFieldRefType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getAdded()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getAddedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getChangeType()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getDeprecated()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getDeprecatedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getEncoding()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Encoding();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getId()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getImplLength <em>Impl Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getImplLength()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ImplLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getImplMaxLength <em>Impl Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getImplMaxLength()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ImplMaxLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getImplMinLength <em>Impl Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getImplMinLength()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ImplMinLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getInstanceName <em>Instance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getInstanceName()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_InstanceName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getIssue()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getLastModified()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getLengthId <em>Length Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getLengthId()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_LengthId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getMaxInclusive()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getMinInclusive()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getPresence()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getRendering()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getReplaced()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getReplacedByField()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getReplacedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getScenario()
   * @see #getFieldRefType()
   * @generated
   */
	EAttribute getFieldRefType_Scenario();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getSupported()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getUpdated()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getUpdatedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRefType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRefType#getValue()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.FieldRuleType <em>Field Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Rule Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType
   * @generated
   */
  EClass getFieldRuleType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unique</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getUnique()
   * @see #getFieldRuleType()
   * @generated
   */
  EReference getFieldRuleType_Unique();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Assign</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getAssign()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Assign();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getWhen()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_When();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getEncoding()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Encoding();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplLength <em>Impl Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getImplLength()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_ImplLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMaxLength <em>Impl Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMaxLength()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_ImplMaxLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMinLength <em>Impl Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getImplMinLength()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_ImplMinLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getMaxInclusive()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getMinInclusive()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getName()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getPresence()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getRendering()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getType()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Type();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldRuleType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldRuleType#getValue()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.FieldsType <em>Fields Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fields Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldsType
   * @generated
   */
  EClass getFieldsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.FieldsType#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldsType#getField()
   * @see #getFieldsType()
   * @generated
   */
  EReference getFieldsType_Field();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldsType#getBase()
   * @see #getFieldsType()
   * @generated
   */
  EAttribute getFieldsType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldsType#getLatestEP()
   * @see #getFieldsType()
   * @generated
   */
  EAttribute getFieldsType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType
   * @generated
   */
  EClass getFieldType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.FieldType#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getRule()
   * @see #getFieldType()
   * @generated
   */
  EReference getFieldType_Rule();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assign</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getAssign()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Assign();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.FieldType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getAnnotation()
   * @see #getFieldType()
   * @generated
   */
  EReference getFieldType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getAbbrName()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getAdded()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getAddedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getBaseCategory <em>Base Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Category</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getBaseCategory()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_BaseCategory();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getBaseCategoryAbbrName <em>Base Category Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Category Abbr Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getBaseCategoryAbbrName()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_BaseCategoryAbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getChangeType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getDeprecated()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getDeprecatedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getDiscriminatorId <em>Discriminator Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getDiscriminatorId()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_DiscriminatorId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getEncoding()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Encoding();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getId()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplLength <em>Impl Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getImplLength()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ImplLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMaxLength <em>Impl Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getImplMaxLength()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ImplMaxLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getImplMinLength <em>Impl Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Length</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getImplMinLength()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ImplMinLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getIssue()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getLastModified()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getLengthId <em>Length Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getLengthId()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_LengthId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getMaxInclusive()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getMinInclusive()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getName()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getPresence()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getRendering()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getReplaced()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getReplacedByField()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getReplacedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getScenario()
   * @see #getFieldType()
   * @generated
   */
	EAttribute getFieldType_Scenario();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getSupported()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Type();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getUnionDataType <em>Union Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Union Data Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getUnionDataType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_UnionDataType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getUpdated()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getUpdatedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FieldType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2016.fixrepository.FieldType#getValue()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.FlowType <em>Flow Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.FlowType
   * @generated
   */
  EClass getFlowType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.FlowType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.FlowType#getAnnotation()
   * @see #getFlowType()
   * @generated
   */
  EReference getFlowType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FlowType#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see io.fixprotocol._2016.fixrepository.FlowType#getDestination()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Destination();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FlowType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.FlowType#getName()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FlowType#getReliability <em>Reliability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reliability</em>'.
   * @see io.fixprotocol._2016.fixrepository.FlowType#getReliability()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Reliability();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.FlowType#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see io.fixprotocol._2016.fixrepository.FlowType#getSource()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Source();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.GroupRefType <em>Group Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Ref Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupRefType
   * @generated
   */
  EClass getGroupRefType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Occurs</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupRefType#getImplMaxOccurs()
   * @see #getGroupRefType()
   * @generated
   */
  EAttribute getGroupRefType_ImplMaxOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupRefType#getImplMinOccurs <em>Impl Min Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Occurs</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupRefType#getImplMinOccurs()
   * @see #getGroupRefType()
   * @generated
   */
  EAttribute getGroupRefType_ImplMinOccurs();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.GroupsType <em>Groups Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Groups Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupsType
   * @generated
   */
	EClass getGroupsType();

		/**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.GroupsType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupsType#getGroup()
   * @see #getGroupsType()
   * @generated
   */
	EReference getGroupsType_Group();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupsType#getBase()
   * @see #getGroupsType()
   * @generated
   */
  EAttribute getGroupsType_Base();

    /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupsType#getLatestEP()
   * @see #getGroupsType()
   * @generated
   */
	EAttribute getGroupsType_LatestEP();

		/**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.GroupType <em>Group Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType
   * @generated
   */
  EClass getGroupType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.GroupType#getNumInGroup <em>Num In Group</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num In Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getNumInGroup()
   * @see #getGroupType()
   * @generated
   */
	EReference getGroupType_NumInGroup();

		/**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.GroupType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getGroup()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Group();

		/**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.GroupType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getComponentRef()
   * @see #getGroupType()
   * @generated
   */
	EReference getGroupType_ComponentRef();

		/**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.GroupType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getGroupRef()
   * @see #getGroupType()
   * @generated
   */
	EReference getGroupType_GroupRef();

		/**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.GroupType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getFieldRef()
   * @see #getGroupType()
   * @generated
   */
	EReference getGroupType_FieldRef();

		/**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.GroupType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getAnnotation()
   * @see #getGroupType()
   * @generated
   */
	EReference getGroupType_Annotation();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getAbbrName()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_AbbrName();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getAdded()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Added();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getAddedEP()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_AddedEP();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getCategory()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Category();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getChangeType()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_ChangeType();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getDeprecated()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Deprecated();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getDeprecatedEP()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_DeprecatedEP();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getId()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Id();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Occurs</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_ImplMaxOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMinOccurs <em>Impl Min Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Occurs</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getImplMinOccurs()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_ImplMinOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getIssue()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Issue();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getLastModified()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_LastModified();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getName()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Name();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getRendering()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Rendering();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getReplaced()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Replaced();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getReplacedByField()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_ReplacedByField();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getReplacedEP()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_ReplacedEP();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getScenario()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Scenario();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getSupported()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Supported();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getUpdated()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_Updated();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getUpdatedEP()
   * @see #getGroupType()
   * @generated
   */
	EAttribute getGroupType_UpdatedEP();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.GroupType#getWhich <em>Which</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Which</em>'.
   * @see io.fixprotocol._2016.fixrepository.GroupType#getWhich()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Which();

    /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.IdentifiersType <em>Identifiers Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifiers Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifiersType
   * @generated
   */
	EClass getIdentifiersType();

		/**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifiersType#getGroup()
   * @see #getIdentifiersType()
   * @generated
   */
	EAttribute getIdentifiersType_Group();

		/**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getCorrelate <em>Correlate</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Correlate</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifiersType#getCorrelate()
   * @see #getIdentifiersType()
   * @generated
   */
	EReference getIdentifiersType_Correlate();

		/**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assign</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifiersType#getAssign()
   * @see #getIdentifiersType()
   * @generated
   */
	EReference getIdentifiersType_Assign();

		/**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.IdentifiersType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifiersType#getAnnotation()
   * @see #getIdentifiersType()
   * @generated
   */
	EReference getIdentifiersType_Annotation();

		/**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.IdentifierType <em>Identifier Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifierType
   * @generated
   */
	EClass getIdentifierType();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.IdentifierType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifierType#getId()
   * @see #getIdentifierType()
   * @generated
   */
	EAttribute getIdentifierType_Id();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.IdentifierType#getSourceId <em>Source Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.IdentifierType#getSourceId()
   * @see #getIdentifierType()
   * @generated
   */
	EAttribute getIdentifierType_SourceId();

		/**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType <em>Mapped Datatype Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Datatype Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType
   * @generated
   */
  EClass getMappedDatatypeType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getAny()
   * @see #getMappedDatatypeType()
   * @generated
   */
	EAttribute getMappedDatatypeType_Any();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getBase()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#isBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builtin</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#isBuiltin()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_Builtin();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getElement()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_Element();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMaxInclusive()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getMinInclusive()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getParameter()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_Parameter();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getPattern()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_Pattern();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType#getStandard <em>Standard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Standard</em>'.
   * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType#getStandard()
   * @see #getMappedDatatypeType()
   * @generated
   */
  EAttribute getMappedDatatypeType_Standard();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.MessageRefType <em>Message Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Ref Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType
   * @generated
   */
  EClass getMessageRefType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType#getIdentifiers()
   * @see #getMessageRefType()
   * @generated
   */
	EReference getMessageRefType_Identifiers();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType#getId()
   * @see #getMessageRefType()
   * @generated
   */
	EAttribute getMessageRefType_Id();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Occurs</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType#getImplMaxOccurs()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_ImplMaxOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getImplMinOccurs <em>Impl Min Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Occurs</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType#getImplMinOccurs()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_ImplMinOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getMsgType <em>Msg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msg Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType#getMsgType()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_MsgType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType#getName()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageRefType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageRefType#getScenario()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_Scenario();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.MessagesType <em>Messages Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Messages Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessagesType
   * @generated
   */
  EClass getMessagesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.MessagesType#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessagesType#getMessage()
   * @see #getMessagesType()
   * @generated
   */
  EReference getMessagesType_Message();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessagesType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessagesType#getBase()
   * @see #getMessagesType()
   * @generated
   */
  EAttribute getMessagesType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessagesType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessagesType#getLatestEP()
   * @see #getMessagesType()
   * @generated
   */
  EAttribute getMessagesType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.MessageType <em>Message Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType
   * @generated
   */
  EClass getMessageType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.MessageType#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getStructure()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Structure();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.MessageType#getResponses <em>Responses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Responses</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getResponses()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Responses();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.MessageType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getAnnotation()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getAbbrName()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getAdded()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getAddedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getCategory()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Category();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getChangeType()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getDeprecated()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getDeprecatedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getFlow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flow</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getFlow()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Flow();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getId()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getIssue()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getLastModified()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getMsgType <em>Msg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msg Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getMsgType()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_MsgType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getName()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getReplaced()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getReplacedByField()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getReplacedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getScenario()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getSupported()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getUpdated()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.MessageType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.MessageType#getUpdatedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.RepositoryType <em>Repository Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType
   * @generated
   */
  EClass getRepositoryType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getMetadata()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Metadata();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Categories</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getCategories()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Categories();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sections</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getSections()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Sections();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getDatatypes <em>Datatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatypes</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getDatatypes()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Datatypes();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getCodeSets <em>Code Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code Sets</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getCodeSets()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_CodeSets();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getFields()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Fields();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actors</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getActors()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Actors();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Components</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getComponents()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Components();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Groups</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getGroups()
   * @see #getRepositoryType()
   * @generated
   */
	EReference getRepositoryType_Groups();

		/**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Messages</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getMessages()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Messages();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getConcepts <em>Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concepts</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getConcepts()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Concepts();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getAnnotation()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getApplVerId <em>Appl Ver Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Appl Ver Id</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getApplVerId()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_ApplVerId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getExpressionLanguage <em>Expression Language</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression Language</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getExpressionLanguage()
   * @see #getRepositoryType()
   * @generated
   */
	EAttribute getRepositoryType_ExpressionLanguage();

		/**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getGuid <em>Guid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guid</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getGuid()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Guid();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getLatestEP()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_LatestEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getName()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getNamespace()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Namespace();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getSpecUrl <em>Spec Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec Url</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getSpecUrl()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_SpecUrl();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.RepositoryType#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see io.fixprotocol._2016.fixrepository.RepositoryType#getVersion()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Version();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ResponsesType <em>Responses Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Responses Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ResponsesType
   * @generated
   */
  EClass getResponsesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.ResponsesType#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Response</em>'.
   * @see io.fixprotocol._2016.fixrepository.ResponsesType#getResponse()
   * @see #getResponsesType()
   * @generated
   */
  EReference getResponsesType_Response();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.ResponseType <em>Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.ResponseType
   * @generated
   */
  EClass getResponseType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ResponseType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see io.fixprotocol._2016.fixrepository.ResponseType#getWhen()
   * @see #getResponseType()
   * @generated
   */
  EAttribute getResponseType_When();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.ResponseType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.ResponseType#getAnnotation()
   * @see #getResponseType()
   * @generated
   */
  EReference getResponseType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ResponseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.ResponseType#getName()
   * @see #getResponseType()
   * @generated
   */
  EAttribute getResponseType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.ResponseType#getSync <em>Sync</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sync</em>'.
   * @see io.fixprotocol._2016.fixrepository.ResponseType#getSync()
   * @see #getResponseType()
   * @generated
   */
  EAttribute getResponseType_Sync();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.SectionsType <em>Sections Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sections Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionsType
   * @generated
   */
  EClass getSectionsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.SectionsType#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Section</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionsType#getSection()
   * @see #getSectionsType()
   * @generated
   */
  EReference getSectionsType_Section();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionsType#getBase()
   * @see #getSectionsType()
   * @generated
   */
  EAttribute getSectionsType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionsType#getLatestEP()
   * @see #getSectionsType()
   * @generated
   */
  EAttribute getSectionsType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.SectionType <em>Section Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType
   * @generated
   */
  EClass getSectionType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.SectionType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getAnnotation()
   * @see #getSectionType()
   * @generated
   */
  EReference getSectionType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getAdded()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getAddedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getChangeType()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getDeprecated()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getDeprecatedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getDisplayOrder <em>Display Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Order</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getDisplayOrder()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_DisplayOrder();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getFIXMLFileName <em>FIXML File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>FIXML File Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getFIXMLFileName()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_FIXMLFileName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getIssue()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getLastModified()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getName()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getReplaced()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getReplacedByField()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getReplacedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getSupported()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getUpdated()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.SectionType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2016.fixrepository.SectionType#getUpdatedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.StateMachineType <em>State Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateMachineType
   * @generated
   */
  EClass getStateMachineType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.StateMachineType#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateMachineType#getInitial()
   * @see #getStateMachineType()
   * @generated
   */
  EReference getStateMachineType_Initial();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.StateMachineType#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateMachineType#getState()
   * @see #getStateMachineType()
   * @generated
   */
  EReference getStateMachineType_State();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.StateMachineType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateMachineType#getAnnotation()
   * @see #getStateMachineType()
   * @generated
   */
  EReference getStateMachineType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.StateMachineType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateMachineType#getName()
   * @see #getStateMachineType()
   * @generated
   */
  EAttribute getStateMachineType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateType
   * @generated
   */
  EClass getStateType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.StateType#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateType#getTransition()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Transition();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.StateType#getOnentry <em>Onentry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Onentry</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateType#getOnentry()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Onentry();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.StateType#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Activity</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateType#getActivity()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Activity();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.StateType#getOnexit <em>Onexit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Onexit</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateType#getOnexit()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Onexit();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.StateType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateType#getAnnotation()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.StateType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.StateType#getName()
   * @see #getStateType()
   * @generated
   */
  EAttribute getStateType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.StructureType <em>Structure Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.StructureType
   * @generated
   */
  EClass getStructureType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2016.fixrepository.StructureType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2016.fixrepository.StructureType#getGroup()
   * @see #getStructureType()
   * @generated
   */
  EAttribute getStructureType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.StructureType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.StructureType#getComponentRef()
   * @see #getStructureType()
   * @generated
   */
  EReference getStructureType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.StructureType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.StructureType#getGroupRef()
   * @see #getStructureType()
   * @generated
   */
  EReference getStructureType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.StructureType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.StructureType#getFieldRef()
   * @see #getStructureType()
   * @generated
   */
  EReference getStructureType_FieldRef();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.StructureType#getWhich <em>Which</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Which</em>'.
   * @see io.fixprotocol._2016.fixrepository.StructureType#getWhich()
   * @see #getStructureType()
   * @generated
   */
  EAttribute getStructureType_Which();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.TimerSchedule <em>Timer Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Schedule</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerSchedule
   * @generated
   */
  EClass getTimerSchedule();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Activity</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerSchedule#getActivity()
   * @see #getTimerSchedule()
   * @generated
   */
  EReference getTimerSchedule_Activity();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actor</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerSchedule#getActor()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Actor();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interval</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerSchedule#getInterval()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Interval();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerSchedule#getName()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TimerSchedule#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerSchedule#getOperation()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Operation();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.TimerType <em>Timer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerType
   * @generated
   */
  EClass getTimerType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TimerType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerType#getName()
   * @see #getTimerType()
   * @generated
   */
  EAttribute getTimerType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.TransitionType
   * @generated
   */
  EClass getTransitionType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TransitionType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see io.fixprotocol._2016.fixrepository.TransitionType#getWhen()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_When();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2016.fixrepository.TransitionType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2016.fixrepository.TransitionType#getAnnotation()
   * @see #getTransitionType()
   * @generated
   */
  EReference getTransitionType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TransitionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.TransitionType#getName()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TransitionType#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see io.fixprotocol._2016.fixrepository.TransitionType#getTarget()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_Target();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.TriggerType <em>Trigger Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.TriggerType
   * @generated
   */
  EClass getTriggerType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TriggerType#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actor</em>'.
   * @see io.fixprotocol._2016.fixrepository.TriggerType#getActor()
   * @see #getTriggerType()
   * @generated
   */
  EAttribute getTriggerType_Actor();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TriggerType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2016.fixrepository.TriggerType#getName()
   * @see #getTriggerType()
   * @generated
   */
  EAttribute getTriggerType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2016.fixrepository.TriggerType#getStateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Machine</em>'.
   * @see io.fixprotocol._2016.fixrepository.TriggerType#getStateMachine()
   * @see #getTriggerType()
   * @generated
   */
  EAttribute getTriggerType_StateMachine();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2016.fixrepository.UniqueType <em>Unique Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.UniqueType
   * @generated
   */
  EClass getUniqueType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2016.fixrepository.UniqueType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2016.fixrepository.UniqueType#getFieldRef()
   * @see #getUniqueType()
   * @generated
   */
  EReference getUniqueType_FieldRef();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.CatComponentTypeT <em>Cat Component Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cat Component Type T</em>'.
   * @see io.fixprotocol._2016.fixrepository.CatComponentTypeT
   * @generated
   */
  EEnum getCatComponentTypeT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.CategoryComponentTypeT <em>Category Component Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Category Component Type T</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryComponentTypeT
   * @generated
   */
  EEnum getCategoryComponentTypeT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.CatIncludeFileT <em>Cat Include File T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cat Include File T</em>'.
   * @see io.fixprotocol._2016.fixrepository.CatIncludeFileT
   * @generated
   */
  EEnum getCatIncludeFileT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.ChangeTypeT <em>Change Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Change Type T</em>'.
   * @see io.fixprotocol._2016.fixrepository.ChangeTypeT
   * @generated
   */
  EEnum getChangeTypeT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.DatatypeStandardEnum <em>Datatype Standard Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Datatype Standard Enum</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeStandardEnum
   * @generated
   */
  EEnum getDatatypeStandardEnum();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.IncludeFileT <em>Include File T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Include File T</em>'.
   * @see io.fixprotocol._2016.fixrepository.IncludeFileT
   * @generated
   */
  EEnum getIncludeFileT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.MemberType <em>Member Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Member Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.MemberType
   * @generated
   */
  EEnum getMemberType();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.PresenceT <em>Presence T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Presence T</em>'.
   * @see io.fixprotocol._2016.fixrepository.PresenceT
   * @generated
   */
  EEnum getPresenceT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.PurposeEnum <em>Purpose Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Purpose Enum</em>'.
   * @see io.fixprotocol._2016.fixrepository.PurposeEnum
   * @generated
   */
  EEnum getPurposeEnum();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.ReliabilityT <em>Reliability T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Reliability T</em>'.
   * @see io.fixprotocol._2016.fixrepository.ReliabilityT
   * @generated
   */
  EEnum getReliabilityT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.SupportType <em>Support Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Support Type</em>'.
   * @see io.fixprotocol._2016.fixrepository.SupportType
   * @generated
   */
  EEnum getSupportType();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.Synchronization <em>Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Synchronization</em>'.
   * @see io.fixprotocol._2016.fixrepository.Synchronization
   * @generated
   */
  EEnum getSynchronization();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.TimerOperation <em>Timer Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Timer Operation</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerOperation
   * @generated
   */
  EEnum getTimerOperation();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.Unbounded <em>Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unbounded</em>'.
   * @see io.fixprotocol._2016.fixrepository.Unbounded
   * @generated
   */
  EEnum getUnbounded();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2016.fixrepository.UnionDataTypeT <em>Union Data Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Union Data Type T</em>'.
   * @see io.fixprotocol._2016.fixrepository.UnionDataTypeT
   * @generated
   */
  EEnum getUnionDataTypeT();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Abbreviation T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Abbreviation T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Abbreviation_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getAbbreviationT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.CatComponentTypeT <em>Cat Component Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Cat Component Type TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.CatComponentTypeT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.CatComponentTypeT"
   *        extendedMetaData="name='CatComponentType_t:Object' baseType='CatComponentType_t'"
   * @generated
   */
  EDataType getCatComponentTypeTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.CategoryComponentTypeT <em>Category Component Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Category Component Type TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.CategoryComponentTypeT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.CategoryComponentTypeT"
   *        extendedMetaData="name='CategoryComponentType_t:Object' baseType='CategoryComponentType_t'"
   * @generated
   */
  EDataType getCategoryComponentTypeTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.CatIncludeFileT <em>Cat Include File TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Cat Include File TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.CatIncludeFileT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.CatIncludeFileT"
   *        extendedMetaData="name='CatIncludeFile_t:Object' baseType='CatIncludeFile_t'"
   * @generated
   */
  EDataType getCatIncludeFileTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.ChangeTypeT <em>Change Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Change Type TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.ChangeTypeT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.ChangeTypeT"
   *        extendedMetaData="name='changeType_t:Object' baseType='changeType_t'"
   * @generated
   */
  EDataType getChangeTypeTObject();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Comp IDT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Comp IDT</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='CompID_t' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1000'"
   * @generated
   */
  EDataType getCompIDT();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Component Name T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Component Name T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ComponentName_t' baseType='Name_t'"
   * @generated
   */
  EDataType getComponentNameT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.DatatypeStandardEnum <em>Datatype Standard Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Datatype Standard Enum Object</em>'.
   * @see io.fixprotocol._2016.fixrepository.DatatypeStandardEnum
   * @model instanceClass="io.fixprotocol._2016.fixrepository.DatatypeStandardEnum"
   *        extendedMetaData="name='datatypeStandard_enum:Object' baseType='datatypeStandard_enum'"
   * @generated
   */
  EDataType getDatatypeStandardEnumObject();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>Datatype Standard T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Extensible datatype standards
     * <!-- end-model-doc -->
   * @return the meta object for data type '<em>Datatype Standard T</em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object"
   *        extendedMetaData="name='datatypeStandard_t' memberTypes='datatypeStandard_enum http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getDatatypeStandardT();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Edition T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Edition T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Edition_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='8'"
   * @generated
   */
  EDataType getEditionT();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>EPT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EPT</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='EP_t' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'"
   * @generated
   */
  EDataType getEPT();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Expressed in a Domain Specific Language
     * 			
     * <!-- end-model-doc -->
   * @return the meta object for data type '<em>Expression Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='expressionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='1024'"
   * @generated
   */
  EDataType getExpressionType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Group Name T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Group Name T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='GroupName_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getGroupNameT();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Id T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Id T</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='id_t' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger'"
   * @generated
   */
  EDataType getIdT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.IncludeFileT <em>Include File TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Include File TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.IncludeFileT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.IncludeFileT"
   *        extendedMetaData="name='IncludeFile_t:Object' baseType='IncludeFile_t'"
   * @generated
   */
  EDataType getIncludeFileTObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Language T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Language T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='language_t' baseType='http://www.eclipse.org/emf/2003/XMLType#language'"
   * @generated
   */
  EDataType getLanguageT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.MemberType <em>Member Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Member Type Object</em>'.
   * @see io.fixprotocol._2016.fixrepository.MemberType
   * @model instanceClass="io.fixprotocol._2016.fixrepository.MemberType"
   *        extendedMetaData="name='memberType:Object' baseType='memberType'"
   * @generated
   */
  EDataType getMemberTypeObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Mime T</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Multipurpose Internet Mail Extensions (MIME) media type
     * <!-- end-model-doc -->
   * @return the meta object for data type '<em>Mime T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='mime_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='3'"
   * @generated
   */
	EDataType getMimeT();

		/**
   * Returns the meta object for data type '{@link java.lang.String <em>Msg Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Msg Type T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='MsgType_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='2'"
   * @generated
   */
  EDataType getMsgTypeT();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Name T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Name T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Name_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='255' pattern='([A-Z]|[a-z])([0-9]|[A-Z]|[a-z]|_)*'"
   * @generated
   */
  EDataType getNameT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.PresenceT <em>Presence TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Presence TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.PresenceT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.PresenceT"
   *        extendedMetaData="name='presence_t:Object' baseType='presence_t'"
   * @generated
   */
  EDataType getPresenceTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.PurposeEnum <em>Purpose Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Purpose Enum Object</em>'.
   * @see io.fixprotocol._2016.fixrepository.PurposeEnum
   * @model instanceClass="io.fixprotocol._2016.fixrepository.PurposeEnum"
   *        extendedMetaData="name='purpose_enum:Object' baseType='purpose_enum'"
   * @generated
   */
  EDataType getPurposeEnumObject();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>Purpose T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Extensible annotation purposes
     * <!-- end-model-doc -->
   * @return the meta object for data type '<em>Purpose T</em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object"
   *        extendedMetaData="name='purpose_t' memberTypes='purpose_enum http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getPurposeT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.ReliabilityT <em>Reliability TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Reliability TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.ReliabilityT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.ReliabilityT"
   *        extendedMetaData="name='reliability_t:Object' baseType='reliability_t'"
   * @generated
   */
  EDataType getReliabilityTObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Scenario T</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Scenario T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Scenario_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='255' pattern='([A-Z]|[a-z])([0-9]|[A-Z]|[a-z]|_|-)*'"
   * @generated
   */
	EDataType getScenarioT();

		/**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Sort T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Sort T</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='Sort_t' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
   * @generated
   */
  EDataType getSortT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.SupportType <em>Support Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Support Type Object</em>'.
   * @see io.fixprotocol._2016.fixrepository.SupportType
   * @model instanceClass="io.fixprotocol._2016.fixrepository.SupportType"
   *        extendedMetaData="name='supportType:Object' baseType='supportType'"
   * @generated
   */
  EDataType getSupportTypeObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.Synchronization <em>Synchronization Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Synchronization Object</em>'.
   * @see io.fixprotocol._2016.fixrepository.Synchronization
   * @model instanceClass="io.fixprotocol._2016.fixrepository.Synchronization"
   *        extendedMetaData="name='synchronization:Object' baseType='synchronization'"
   * @generated
   */
  EDataType getSynchronizationObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Term T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Term T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Term_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getTermT();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.TimerOperation <em>Timer Operation Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Timer Operation Object</em>'.
   * @see io.fixprotocol._2016.fixrepository.TimerOperation
   * @model instanceClass="io.fixprotocol._2016.fixrepository.TimerOperation"
   *        extendedMetaData="name='timerOperation:Object' baseType='timerOperation'"
   * @generated
   */
  EDataType getTimerOperationObject();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>Unbounded Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unbounded Int Type</em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object"
   *        extendedMetaData="name='unboundedIntType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger unbounded'"
   * @generated
   */
  EDataType getUnboundedIntType();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.Unbounded <em>Unbounded Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unbounded Object</em>'.
   * @see io.fixprotocol._2016.fixrepository.Unbounded
   * @model instanceClass="io.fixprotocol._2016.fixrepository.Unbounded"
   *        extendedMetaData="name='unbounded:Object' baseType='unbounded'"
   * @generated
   */
  EDataType getUnboundedObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2016.fixrepository.UnionDataTypeT <em>Union Data Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Union Data Type TObject</em>'.
   * @see io.fixprotocol._2016.fixrepository.UnionDataTypeT
   * @model instanceClass="io.fixprotocol._2016.fixrepository.UnionDataTypeT"
   *        extendedMetaData="name='UnionDataType_t:Object' baseType='UnionDataType_t'"
   * @generated
   */
  EDataType getUnionDataTypeTObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Usage T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Usage T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Usage_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getUsageT();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Version T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Enumerated FIX versions or major.minor or date as
     * 					yyyymmdd of any protocol
     * 				
     * <!-- end-model-doc -->
   * @return the meta object for data type '<em>Version T</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='Version_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(FIX.2.7)|(FIX.3.0)|(FIX\\.4\\.[0-4])|(FIX\\.5\\.0(SP\\d{1,2})?(_EP((9[8-9])|([1-9][0-9][0-9])))?)|(FIXT.1.1)|([0-9]+)\\.([0-9]+)|(\\d{8})'"
   * @generated
   */
  EDataType getVersionT();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FixrepositoryFactory getFixrepositoryFactory();

} //FixrepositoryPackage
