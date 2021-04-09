/**
 */
package io.fixprotocol._2020.orchestra.repository;

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
 * 			© Copyright 2016-2020 FIX Protocol Limited
 * 			Creative Commons Attribution-NoDerivatives 4.0
 * 			International Public License
 * 		
 * 
 * 			© Copyright 2016-2020 FIX Protocol Limited Creative
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
 * <!-- end-model-doc -->
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "repository";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://fixprotocol.io/2020/orchestra/repository";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "repository";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RepositoryPackage eINSTANCE = io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl.init();

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl <em>Action Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ActionTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getActionType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ActorsTypeImpl <em>Actors Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ActorsTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getActorsType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl <em>Actor Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ActorTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getActorType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.AnnotationImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getAnnotation()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl <em>Appinfo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.AppinfoImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getAppinfo()
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
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__GROUP = 1;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ANY = 2;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ADDED = 3;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ADDED_EP = 4;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__CHANGE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__DEPRECATED = 6;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__DEPRECATED_EP = 7;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ISSUE = 8;

  /**
   * The feature id for the '<em><b>Lang Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__LANG_ID = 9;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__LAST_MODIFIED = 10;

  /**
   * The feature id for the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__PURPOSE = 11;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__REPLACED = 12;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__REPLACED_BY_FIELD = 13;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__REPLACED_EP = 14;

  /**
   * The feature id for the '<em><b>Spec Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__SPEC_URL = 15;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__SUPPORTED = 16;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__UPDATED = 17;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__UPDATED_EP = 18;

  /**
   * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO__ANY_ATTRIBUTE = 19;

  /**
   * The number of structural features of the '<em>Appinfo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO_FEATURE_COUNT = 20;

  /**
   * The number of operations of the '<em>Appinfo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPINFO_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.BlockAssignmentTypeImpl <em>Block Assignment Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.BlockAssignmentTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getBlockAssignmentType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.CategoriesTypeImpl <em>Categories Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.CategoriesTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCategoriesType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.CategoryTypeImpl <em>Category Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.CategoryTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCategoryType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.CodeSetsTypeImpl <em>Code Sets Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.CodeSetsTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCodeSetsType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.CodeSetTypeImpl <em>Code Set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.CodeSetTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCodeSetType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl <em>Code Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.CodeTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCodeType()
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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentRefTypeImpl <em>Component Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ComponentRefTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getComponentRefType()
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
   * The feature id for the '<em><b>Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__RULE = 1;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Added</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ADDED = 3;

  /**
   * The feature id for the '<em><b>Added EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ADDED_EP = 4;

  /**
   * The feature id for the '<em><b>Change Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__CHANGE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__DEPRECATED = 6;

  /**
   * The feature id for the '<em><b>Deprecated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__DEPRECATED_EP = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ID = 8;

  /**
   * The feature id for the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__INSTANCE_NAME = 9;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__ISSUE = 10;

  /**
   * The feature id for the '<em><b>Last Modified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__LAST_MODIFIED = 11;

  /**
   * The feature id for the '<em><b>Presence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__PRESENCE = 12;

  /**
   * The feature id for the '<em><b>Replaced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__REPLACED = 13;

  /**
   * The feature id for the '<em><b>Replaced By Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__REPLACED_BY_FIELD = 14;

  /**
   * The feature id for the '<em><b>Replaced EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__REPLACED_EP = 15;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__SCENARIO = 16;

  /**
   * The feature id for the '<em><b>Supported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__SUPPORTED = 17;

  /**
   * The feature id for the '<em><b>Updated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__UPDATED = 18;

  /**
   * The feature id for the '<em><b>Updated EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE__UPDATED_EP = 19;

  /**
   * The number of structural features of the '<em>Component Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE_FEATURE_COUNT = 20;

  /**
   * The number of operations of the '<em>Component Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REF_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentRuleTypeImpl <em>Component Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ComponentRuleTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getComponentRuleType()
   * @generated
   */
  int COMPONENT_RULE_TYPE = 12;

  /**
   * The feature id for the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RULE_TYPE__WHEN = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RULE_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Presence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RULE_TYPE__PRESENCE = 2;

  /**
   * The number of structural features of the '<em>Component Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RULE_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Component Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_RULE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentsTypeImpl <em>Components Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ComponentsTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getComponentsType()
   * @generated
   */
  int COMPONENTS_TYPE = 13;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl <em>Component Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ComponentTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getComponentType()
   * @generated
   */
  int COMPONENT_TYPE = 14;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptsTypeImpl <em>Concepts Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ConceptsTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getConceptsType()
   * @generated
   */
  int CONCEPTS_TYPE = 15;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl <em>Concept Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ConceptTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getConceptType()
   * @generated
   */
  int CONCEPT_TYPE = 16;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.DatatypesTypeImpl <em>Datatypes Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.DatatypesTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getDatatypesType()
   * @generated
   */
  int DATATYPES_TYPE = 17;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.DatatypeTypeImpl <em>Datatype Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.DatatypeTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getDatatypeType()
   * @generated
   */
  int DATATYPE_TYPE = 18;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentationImpl <em>Documentation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.DocumentationImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getDocumentation()
   * @generated
   */
  int DOCUMENTATION = 19;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.DocumentRootImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 20;

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
   * The feature id for the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MESSAGES = 12;

  /**
   * The feature id for the '<em><b>Repository</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REPOSITORY = 13;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SECTIONS = 14;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ExtensionTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getExtensionType()
   * @generated
   */
  int EXTENSION_TYPE = 21;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_TYPE__ANY = 0;

  /**
   * The number of structural features of the '<em>Extension Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Extension Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.FieldRefTypeImpl <em>Field Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.FieldRefTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getFieldRefType()
   * @generated
   */
  int FIELD_REF_TYPE = 22;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.FieldRuleTypeImpl <em>Field Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.FieldRuleTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getFieldRuleType()
   * @generated
   */
  int FIELD_RULE_TYPE = 23;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.FieldsTypeImpl <em>Fields Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.FieldsTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getFieldsType()
   * @generated
   */
  int FIELDS_TYPE = 24;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.FieldTypeImpl <em>Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.FieldTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getFieldType()
   * @generated
   */
  int FIELD_TYPE = 25;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.FlowTypeImpl <em>Flow Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.FlowTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getFlowType()
   * @generated
   */
  int FLOW_TYPE = 26;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.GroupRefTypeImpl <em>Group Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.GroupRefTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getGroupRefType()
   * @generated
   */
  int GROUP_REF_TYPE = 27;

  /**
   * The feature id for the '<em><b>Block Assignment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__BLOCK_ASSIGNMENT = COMPONENT_REF_TYPE__BLOCK_ASSIGNMENT;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_REF_TYPE__RULE = COMPONENT_REF_TYPE__RULE;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.GroupsTypeImpl <em>Groups Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.GroupsTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getGroupsType()
   * @generated
   */
  int GROUPS_TYPE = 28;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.GroupTypeImpl <em>Group Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.GroupTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getGroupType()
   * @generated
   */
  int GROUP_TYPE = 29;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.IdentifiersTypeImpl <em>Identifiers Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.IdentifiersTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getIdentifiersType()
   * @generated
   */
  int IDENTIFIERS_TYPE = 30;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.IdentifierTypeImpl <em>Identifier Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.IdentifierTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getIdentifierType()
   * @generated
   */
  int IDENTIFIER_TYPE = 31;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl <em>Mapped Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMappedDatatype()
   * @generated
   */
  int MAPPED_DATATYPE = 32;

  /**
   * The feature id for the '<em><b>Extension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__EXTENSION = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__BASE = 2;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__BUILTIN = 3;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__MAX_INCLUSIVE = 5;

  /**
   * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__MIN_INCLUSIVE = 6;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__PARAMETER = 7;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__PATTERN = 8;

  /**
   * The feature id for the '<em><b>Standard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE__STANDARD = 9;

  /**
   * The number of structural features of the '<em>Mapped Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_FEATURE_COUNT = 10;

  /**
   * The number of operations of the '<em>Mapped Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_DATATYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl <em>Message Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.MessageRefTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMessageRefType()
   * @generated
   */
  int MESSAGE_REF_TYPE = 33;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.MessagesTypeImpl <em>Messages Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.MessagesTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMessagesType()
   * @generated
   */
  int MESSAGES_TYPE = 34;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.MessageTypeImpl <em>Message Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.MessageTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMessageType()
   * @generated
   */
  int MESSAGE_TYPE = 35;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.RepositoryTypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getRepositoryType()
   * @generated
   */
  int REPOSITORY_TYPE = 36;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__CATEGORIES = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__SECTIONS = 1;

  /**
   * The feature id for the '<em><b>Datatypes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__DATATYPES = 2;

  /**
   * The feature id for the '<em><b>Code Sets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__CODE_SETS = 3;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__FIELDS = 4;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__ACTORS = 5;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__COMPONENTS = 6;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__GROUPS = 7;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__MESSAGES = 8;

  /**
   * The feature id for the '<em><b>Concepts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__CONCEPTS = 9;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__ANNOTATION = 10;

  /**
   * The feature id for the '<em><b>Appl Ver Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__APPL_VER_ID = 11;

  /**
   * The feature id for the '<em><b>Expression Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__EXPRESSION_LANGUAGE = 12;

  /**
   * The feature id for the '<em><b>Guid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__GUID = 13;

  /**
   * The feature id for the '<em><b>Latest EP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__LATEST_EP = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__NAME = 15;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__NAMESPACE = 16;

  /**
   * The feature id for the '<em><b>Spec Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__SPEC_URL = 17;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__VERSION = 18;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE_FEATURE_COUNT = 19;

  /**
   * The number of operations of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ResponsesTypeImpl <em>Responses Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ResponsesTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getResponsesType()
   * @generated
   */
  int RESPONSES_TYPE = 37;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.ResponseTypeImpl <em>Response Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.ResponseTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getResponseType()
   * @generated
   */
  int RESPONSE_TYPE = 38;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.SectionsTypeImpl <em>Sections Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.SectionsTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getSectionsType()
   * @generated
   */
  int SECTIONS_TYPE = 39;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.SectionTypeImpl <em>Section Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.SectionTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getSectionType()
   * @generated
   */
  int SECTION_TYPE = 40;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.StateMachineTypeImpl <em>State Machine Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.StateMachineTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getStateMachineType()
   * @generated
   */
  int STATE_MACHINE_TYPE = 41;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.StateTypeImpl <em>State Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.StateTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 42;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.StructureTypeImpl <em>Structure Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.StructureTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getStructureType()
   * @generated
   */
  int STRUCTURE_TYPE = 43;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.TimerScheduleImpl <em>Timer Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.TimerScheduleImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getTimerSchedule()
   * @generated
   */
  int TIMER_SCHEDULE = 44;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.TimerTypeImpl <em>Timer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.TimerTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getTimerType()
   * @generated
   */
  int TIMER_TYPE = 45;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.TransitionTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getTransitionType()
   * @generated
   */
  int TRANSITION_TYPE = 46;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.TriggerTypeImpl <em>Trigger Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.TriggerTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getTriggerType()
   * @generated
   */
  int TRIGGER_TYPE = 47;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.impl.UniqueTypeImpl <em>Unique Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.impl.UniqueTypeImpl
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getUniqueType()
   * @generated
   */
  int UNIQUE_TYPE = 48;

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
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.CatComponentTypeT <em>Cat Component Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.CatComponentTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCatComponentTypeT()
   * @generated
   */
  int CAT_COMPONENT_TYPE_T = 49;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT <em>Category Component Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCategoryComponentTypeT()
   * @generated
   */
  int CATEGORY_COMPONENT_TYPE_T = 50;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.CatIncludeFileT <em>Cat Include File T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.CatIncludeFileT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCatIncludeFileT()
   * @generated
   */
  int CAT_INCLUDE_FILE_T = 51;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.ChangeTypeT <em>Change Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.ChangeTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getChangeTypeT()
   * @generated
   */
  int CHANGE_TYPE_T = 52;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum <em>Datatype Standard Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getDatatypeStandardEnum()
   * @generated
   */
  int DATATYPE_STANDARD_ENUM = 53;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.IncludeFileT <em>Include File T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.IncludeFileT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getIncludeFileT()
   * @generated
   */
  int INCLUDE_FILE_T = 54;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.MemberType <em>Member Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.MemberType
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMemberType()
   * @generated
   */
  int MEMBER_TYPE = 55;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.PresenceT <em>Presence T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getPresenceT()
   * @generated
   */
  int PRESENCE_T = 56;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.PurposeEnum <em>Purpose Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.PurposeEnum
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getPurposeEnum()
   * @generated
   */
  int PURPOSE_ENUM = 57;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.ReliabilityT <em>Reliability T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.ReliabilityT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getReliabilityT()
   * @generated
   */
  int RELIABILITY_T = 58;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.SupportType <em>Support Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.SupportType
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getSupportType()
   * @generated
   */
  int SUPPORT_TYPE = 59;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.Synchronization <em>Synchronization</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.Synchronization
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getSynchronization()
   * @generated
   */
  int SYNCHRONIZATION = 60;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.TimerOperation <em>Timer Operation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.TimerOperation
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getTimerOperation()
   * @generated
   */
  int TIMER_OPERATION = 61;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.Unbounded <em>Unbounded</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.Unbounded
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getUnbounded()
   * @generated
   */
  int UNBOUNDED = 62;

  /**
   * The meta object id for the '{@link io.fixprotocol._2020.orchestra.repository.UnionDataTypeT <em>Union Data Type T</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.UnionDataTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getUnionDataTypeT()
   * @generated
   */
  int UNION_DATA_TYPE_T = 63;

  /**
   * The meta object id for the '<em>Abbreviation T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getAbbreviationT()
   * @generated
   */
  int ABBREVIATION_T = 64;

  /**
   * The meta object id for the '<em>Cat Component Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.CatComponentTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCatComponentTypeTObject()
   * @generated
   */
  int CAT_COMPONENT_TYPE_TOBJECT = 65;

  /**
   * The meta object id for the '<em>Category Component Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCategoryComponentTypeTObject()
   * @generated
   */
  int CATEGORY_COMPONENT_TYPE_TOBJECT = 66;

  /**
   * The meta object id for the '<em>Cat Include File TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.CatIncludeFileT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCatIncludeFileTObject()
   * @generated
   */
  int CAT_INCLUDE_FILE_TOBJECT = 67;

  /**
   * The meta object id for the '<em>Change Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.ChangeTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getChangeTypeTObject()
   * @generated
   */
  int CHANGE_TYPE_TOBJECT = 68;

  /**
   * The meta object id for the '<em>Comp IDT</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getCompIDT()
   * @generated
   */
  int COMP_IDT = 69;

  /**
   * The meta object id for the '<em>Component Name T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getComponentNameT()
   * @generated
   */
  int COMPONENT_NAME_T = 70;

  /**
   * The meta object id for the '<em>Datatype Standard Enum Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getDatatypeStandardEnumObject()
   * @generated
   */
  int DATATYPE_STANDARD_ENUM_OBJECT = 71;

  /**
   * The meta object id for the '<em>Datatype Standard T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getDatatypeStandardT()
   * @generated
   */
  int DATATYPE_STANDARD_T = 72;

  /**
   * The meta object id for the '<em>Edition T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getEditionT()
   * @generated
   */
  int EDITION_T = 73;

  /**
   * The meta object id for the '<em>EPT</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getEPT()
   * @generated
   */
  int EPT = 74;

  /**
   * The meta object id for the '<em>Expression Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getExpressionType()
   * @generated
   */
  int EXPRESSION_TYPE = 75;

  /**
   * The meta object id for the '<em>Group Name T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getGroupNameT()
   * @generated
   */
  int GROUP_NAME_T = 76;

  /**
   * The meta object id for the '<em>Id T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getIdT()
   * @generated
   */
  int ID_T = 77;

  /**
   * The meta object id for the '<em>Include File TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.IncludeFileT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getIncludeFileTObject()
   * @generated
   */
  int INCLUDE_FILE_TOBJECT = 78;

  /**
   * The meta object id for the '<em>Language T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getLanguageT()
   * @generated
   */
  int LANGUAGE_T = 79;

  /**
   * The meta object id for the '<em>Member Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.MemberType
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMemberTypeObject()
   * @generated
   */
  int MEMBER_TYPE_OBJECT = 80;

  /**
   * The meta object id for the '<em>Mime T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMimeT()
   * @generated
   */
  int MIME_T = 81;

  /**
   * The meta object id for the '<em>Msg Type T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getMsgTypeT()
   * @generated
   */
  int MSG_TYPE_T = 82;

  /**
   * The meta object id for the '<em>Name T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getNameT()
   * @generated
   */
  int NAME_T = 83;

  /**
   * The meta object id for the '<em>Presence TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getPresenceTObject()
   * @generated
   */
  int PRESENCE_TOBJECT = 84;

  /**
   * The meta object id for the '<em>Purpose Enum Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.PurposeEnum
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getPurposeEnumObject()
   * @generated
   */
  int PURPOSE_ENUM_OBJECT = 85;

  /**
   * The meta object id for the '<em>Purpose T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getPurposeT()
   * @generated
   */
  int PURPOSE_T = 86;

  /**
   * The meta object id for the '<em>Reliability TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.ReliabilityT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getReliabilityTObject()
   * @generated
   */
  int RELIABILITY_TOBJECT = 87;

  /**
   * The meta object id for the '<em>Scenario T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getScenarioT()
   * @generated
   */
  int SCENARIO_T = 88;

  /**
   * The meta object id for the '<em>Sort T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getSortT()
   * @generated
   */
  int SORT_T = 89;

  /**
   * The meta object id for the '<em>Support Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.SupportType
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getSupportTypeObject()
   * @generated
   */
  int SUPPORT_TYPE_OBJECT = 90;

  /**
   * The meta object id for the '<em>Synchronization Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.Synchronization
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getSynchronizationObject()
   * @generated
   */
  int SYNCHRONIZATION_OBJECT = 91;

  /**
   * The meta object id for the '<em>Term T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getTermT()
   * @generated
   */
  int TERM_T = 92;

  /**
   * The meta object id for the '<em>Timer Operation Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.TimerOperation
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getTimerOperationObject()
   * @generated
   */
  int TIMER_OPERATION_OBJECT = 93;

  /**
   * The meta object id for the '<em>Unbounded Int Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getUnboundedIntType()
   * @generated
   */
  int UNBOUNDED_INT_TYPE = 94;

  /**
   * The meta object id for the '<em>Unbounded Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.Unbounded
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getUnboundedObject()
   * @generated
   */
  int UNBOUNDED_OBJECT = 95;

  /**
   * The meta object id for the '<em>Union Data Type TObject</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see io.fixprotocol._2020.orchestra.repository.UnionDataTypeT
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getUnionDataTypeTObject()
   * @generated
   */
  int UNION_DATA_TYPE_TOBJECT = 96;

  /**
   * The meta object id for the '<em>Usage T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getUsageT()
   * @generated
   */
  int USAGE_T = 97;

  /**
   * The meta object id for the '<em>Version T</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see io.fixprotocol._2020.orchestra.repository.impl.RepositoryPackageImpl#getVersionT()
   * @generated
   */
  int VERSION_T = 98;


  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType
   * @generated
   */
  EClass getActionType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getGroup()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getField()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Field();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getFieldRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_FieldRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getComponent()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Component();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getComponentRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getGroup1 <em>Group1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group1</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getGroup1()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Group1();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getGroupRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_GroupRef();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getGroup2 <em>Group2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group2</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getGroup2()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_Group2();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getMessageRef <em>Message Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getMessageRef()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_MessageRef();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Assign</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getAssign()
   * @see #getActionType()
   * @generated
   */
  EAttribute getActionType_Assign();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trigger</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getTrigger()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_Trigger();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActionType#getTimerSchedule <em>Timer Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timer Schedule</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType#getTimerSchedule()
   * @see #getActionType()
   * @generated
   */
  EReference getActionType_TimerSchedule();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ActorsType <em>Actors Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actors Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorsType
   * @generated
   */
  EClass getActorsType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorsType#getGroup()
   * @see #getActorsType()
   * @generated
   */
  EAttribute getActorsType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actor</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorsType#getActor()
   * @see #getActorsType()
   * @generated
   */
  EReference getActorsType_Actor();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getFlow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flow</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorsType#getFlow()
   * @see #getActorsType()
   * @generated
   */
  EReference getActorsType_Flow();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ActorsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorsType#getBase()
   * @see #getActorsType()
   * @generated
   */
  EAttribute getActorsType_Base();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ActorType <em>Actor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType
   * @generated
   */
  EClass getActorType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getGroup()
   * @see #getActorType()
   * @generated
   */
  EAttribute getActorType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getField()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Field();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getFieldRef()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_FieldRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getComponent()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Component();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getComponentRef()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getGroup1 <em>Group1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group1</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getGroup1()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Group1();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getGroupRef()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getStates()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_States();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getTimer <em>Timer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timer</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getTimer()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Timer();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getAnnotation()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ActorType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType#getName()
   * @see #getActorType()
   * @generated
   */
  EAttribute getActorType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getGroup()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Documentation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getDocumentation()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getAppinfo <em>Appinfo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Appinfo</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getAppinfo()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Appinfo();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getAdded()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getAddedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getChangeType()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getDeprecated()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getDeprecatedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getIssue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getLastModified()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getReplaced()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getReplacedByField()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getReplacedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getSupported()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getUpdated()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Annotation#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation#getUpdatedEP()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.Appinfo <em>Appinfo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Appinfo</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo
   * @generated
   */
  EClass getAppinfo();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getMixed()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Mixed();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getGroup()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Group();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getAny()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Any();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getAdded()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getAddedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getChangeType()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getDeprecated()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getDeprecatedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getIssue()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getLangId <em>Lang Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getLangId()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_LangId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getLastModified()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getPurpose <em>Purpose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purpose</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getPurpose()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Purpose();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getReplaced()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getReplacedByField()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getReplacedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getSpecUrl <em>Spec Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec Url</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getSpecUrl()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_SpecUrl();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getSupported()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getUpdated()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getUpdatedEP()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_UpdatedEP();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.Appinfo#getAnyAttribute <em>Any Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any Attribute</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo#getAnyAttribute()
   * @see #getAppinfo()
   * @generated
   */
  EAttribute getAppinfo_AnyAttribute();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType <em>Block Assignment Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Assignment Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.BlockAssignmentType
   * @generated
   */
  EClass getBlockAssignmentType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getGroup()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EAttribute getBlockAssignmentType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getComponentRef()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EReference getBlockAssignmentType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getGroupRef()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EReference getBlockAssignmentType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.BlockAssignmentType#getFieldRef()
   * @see #getBlockAssignmentType()
   * @generated
   */
  EReference getBlockAssignmentType_FieldRef();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.CategoriesType <em>Categories Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Categories Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoriesType
   * @generated
   */
  EClass getCategoriesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.CategoriesType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Category</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoriesType#getCategory()
   * @see #getCategoriesType()
   * @generated
   */
  EReference getCategoriesType_Category();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoriesType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoriesType#getBase()
   * @see #getCategoriesType()
   * @generated
   */
  EAttribute getCategoriesType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoriesType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoriesType#getLatestEP()
   * @see #getCategoriesType()
   * @generated
   */
  EAttribute getCategoriesType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.CategoryType <em>Category Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType
   * @generated
   */
  EClass getCategoryType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getAnnotation()
   * @see #getCategoryType()
   * @generated
   */
  EReference getCategoryType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getAdded()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getAddedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getChangeType()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getComponentType()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ComponentType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecated()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getDeprecatedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getFIXMLFileName <em>FIXML File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>FIXML File Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getFIXMLFileName()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_FIXMLFileName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include File</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getIncludeFile()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_IncludeFile();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getIssue()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getLastModified()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getName()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getReplaced()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedByField()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getReplacedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Section</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getSection()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Section();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getSupported()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdated()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType#getUpdatedEP()
   * @see #getCategoryType()
   * @generated
   */
  EAttribute getCategoryType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.CodeSetsType <em>Code Sets Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Sets Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetsType
   * @generated
   */
  EClass getCodeSetsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.CodeSetsType#getCodeSet <em>Code Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code Set</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetsType#getCodeSet()
   * @see #getCodeSetsType()
   * @generated
   */
  EReference getCodeSetsType_CodeSet();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetsType#getBase()
   * @see #getCodeSetsType()
   * @generated
   */
  EAttribute getCodeSetsType_Base();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType <em>Code Set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Set Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType
   * @generated
   */
  EClass getCodeSetType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getCode()
   * @see #getCodeSetType()
   * @generated
   */
  EReference getCodeSetType_Code();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getAnnotation()
   * @see #getCodeSetType()
   * @generated
   */
  EReference getCodeSetType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getAbbrName()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getAdded()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getAddedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getChangeType()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getDefault()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Default();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getDeprecated()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getDeprecatedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getId()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getIssue()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getLastModified()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getName()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getReplaced()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getReplacedByField()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getReplacedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getScenario()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getSpecUrl <em>Spec Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec Url</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getSpecUrl()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_SpecUrl();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getSupported()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getType()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Type();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getUpdated()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType#getUpdatedEP()
   * @see #getCodeSetType()
   * @generated
   */
  EAttribute getCodeSetType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.CodeType <em>Code Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType
   * @generated
   */
  EClass getCodeType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getAnnotation()
   * @see #getCodeType()
   * @generated
   */
  EReference getCodeType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getAbbrName()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getAdded()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getAddedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getChangeType()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getDeprecated()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getDeprecatedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getGroup()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Group();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getId()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getIssue()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getLastModified()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getName()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getReplaced()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getReplacedByField()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getReplacedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getScenario()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getSort()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Sort();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getSupported()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getUpdated()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getUpdatedEP()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.CodeType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType#getValue()
   * @see #getCodeType()
   * @generated
   */
  EAttribute getCodeType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType <em>Component Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Ref Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType
   * @generated
   */
  EClass getComponentRefType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getBlockAssignment <em>Block Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Block Assignment</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getBlockAssignment()
   * @see #getComponentRefType()
   * @generated
   */
  EReference getComponentRefType_BlockAssignment();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getRule()
   * @see #getComponentRefType()
   * @generated
   */
  EReference getComponentRefType_Rule();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAnnotation()
   * @see #getComponentRefType()
   * @generated
   */
  EReference getComponentRefType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAdded()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getAddedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getChangeType()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecated()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getDeprecatedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getId()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getInstanceName <em>Instance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getInstanceName()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_InstanceName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getIssue()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getLastModified()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getPresence()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplaced()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedByField()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getReplacedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getScenario()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getSupported()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdated()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType#getUpdatedEP()
   * @see #getComponentRefType()
   * @generated
   */
  EAttribute getComponentRefType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType <em>Component Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Rule Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRuleType
   * @generated
   */
  EClass getComponentRuleType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getWhen()
   * @see #getComponentRuleType()
   * @generated
   */
  EAttribute getComponentRuleType_When();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getName()
   * @see #getComponentRuleType()
   * @generated
   */
  EAttribute getComponentRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRuleType#getPresence()
   * @see #getComponentRuleType()
   * @generated
   */
  EAttribute getComponentRuleType_Presence();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ComponentsType <em>Components Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Components Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentsType
   * @generated
   */
  EClass getComponentsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ComponentsType#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentsType#getComponent()
   * @see #getComponentsType()
   * @generated
   */
  EReference getComponentsType_Component();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentsType#getBase()
   * @see #getComponentsType()
   * @generated
   */
  EAttribute getComponentsType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentsType#getLatestEP()
   * @see #getComponentsType()
   * @generated
   */
  EAttribute getComponentsType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType
   * @generated
   */
  EClass getComponentType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getGroup()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getComponentRef()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getGroupRef()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getFieldRef()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_FieldRef();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getAnnotation()
   * @see #getComponentType()
   * @generated
   */
  EReference getComponentType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getAbbrName()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getAdded()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getAddedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getCategory()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Category();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getChangeType()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getDeprecated()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getDeprecatedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getId()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getIssue()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getLastModified()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getName()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getRendering()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getReplaced()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getReplacedByField()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getReplacedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getScenario()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getSupported()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getUpdated()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getUpdatedEP()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ComponentType#getWhich <em>Which</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Which</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType#getWhich()
   * @see #getComponentType()
   * @generated
   */
  EAttribute getComponentType_Which();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ConceptsType <em>Concepts Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concepts Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptsType
   * @generated
   */
  EClass getConceptsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ConceptsType#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concept</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptsType#getConcept()
   * @see #getConceptsType()
   * @generated
   */
  EReference getConceptsType_Concept();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ConceptsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptsType#getBase()
   * @see #getConceptsType()
   * @generated
   */
  EAttribute getConceptsType_Base();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ConceptType <em>Concept Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType
   * @generated
   */
  EClass getConceptType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ConceptType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType#getGroup()
   * @see #getConceptType()
   * @generated
   */
  EAttribute getConceptType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ConceptType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType#getComponentRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ConceptType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType#getGroupRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ConceptType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType#getFieldRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_FieldRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ConceptType#getMessageRef <em>Message Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType#getMessageRef()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_MessageRef();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.ConceptType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType#getAnnotation()
   * @see #getConceptType()
   * @generated
   */
  EReference getConceptType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ConceptType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType#getName()
   * @see #getConceptType()
   * @generated
   */
  EAttribute getConceptType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.DatatypesType <em>Datatypes Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatypes Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypesType
   * @generated
   */
  EClass getDatatypesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.DatatypesType#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datatype</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypesType#getDatatype()
   * @see #getDatatypesType()
   * @generated
   */
  EReference getDatatypesType_Datatype();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypesType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypesType#getBase()
   * @see #getDatatypesType()
   * @generated
   */
  EAttribute getDatatypesType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypesType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypesType#getLatestEP()
   * @see #getDatatypesType()
   * @generated
   */
  EAttribute getDatatypesType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType <em>Datatype Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType
   * @generated
   */
  EClass getDatatypeType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getMappedDatatype <em>Mapped Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Datatype</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getMappedDatatype()
   * @see #getDatatypeType()
   * @generated
   */
  EReference getDatatypeType_MappedDatatype();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getAnnotation()
   * @see #getDatatypeType()
   * @generated
   */
  EReference getDatatypeType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getAdded()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getAddedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getBaseType()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_BaseType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getChangeType()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getDeprecated()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getDeprecatedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getIssue()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getLastModified()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getName()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getReplaced()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getReplacedByField()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getReplacedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getSupported()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getUpdated()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType#getUpdatedEP()
   * @see #getDatatypeType()
   * @generated
   */
  EAttribute getDatatypeType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.Documentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documentation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation
   * @generated
   */
  EClass getDocumentation();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getMixed()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Mixed();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getAny()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Any();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getAdded()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getAddedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getChangeType()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getContentType <em>Content Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getContentType()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_ContentType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getDeprecated()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getDeprecatedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getIssue()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getLangId <em>Lang Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getLangId()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_LangId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getLastModified()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getPurpose <em>Purpose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purpose</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getPurpose()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Purpose();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getReplaced()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getReplacedByField()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getReplacedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getSupported()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getUpdated()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.Documentation#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation#getUpdatedEP()
   * @see #getDocumentation()
   * @generated
   */
  EAttribute getDocumentation_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actors</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getActors()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Actors();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Categories</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getCategories()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Categories();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getCodeSets <em>Code Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code Sets</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getCodeSets()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CodeSets();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Components</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getComponents()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Components();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getConcepts <em>Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concepts</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getConcepts()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Concepts();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getDatatype()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Datatype();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getDatatypes <em>Datatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatypes</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getDatatypes()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Datatypes();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getFields()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Fields();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Groups</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getGroups()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Groups();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Messages</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getMessages()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Messages();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repository</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getRepository()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Repository();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sections</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot#getSections()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Sections();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ExtensionType <em>Extension Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ExtensionType
   * @generated
   */
  EClass getExtensionType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.ExtensionType#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ExtensionType#getAny()
   * @see #getExtensionType()
   * @generated
   */
  EAttribute getExtensionType_Any();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType <em>Field Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Ref Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType
   * @generated
   */
  EClass getFieldRefType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getRule()
   * @see #getFieldRefType()
   * @generated
   */
  EReference getFieldRefType_Rule();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assign</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getAssign()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Assign();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getAnnotation()
   * @see #getFieldRefType()
   * @generated
   */
  EReference getFieldRefType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getAdded()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getAddedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getChangeType()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getDeprecated()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getDeprecatedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getEncoding()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Encoding();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getId()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getImplLength <em>Impl Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getImplLength()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ImplLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getImplMaxLength <em>Impl Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getImplMaxLength()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ImplMaxLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getImplMinLength <em>Impl Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getImplMinLength()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ImplMinLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getInstanceName <em>Instance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getInstanceName()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_InstanceName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getIssue()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getLastModified()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getLengthId <em>Length Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getLengthId()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_LengthId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getMaxInclusive()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getMinInclusive()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getPresence()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getRendering()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getReplaced()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getReplacedByField()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getReplacedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getScenario()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getSupported()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getUpdated()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getUpdatedEP()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType#getValue()
   * @see #getFieldRefType()
   * @generated
   */
  EAttribute getFieldRefType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType <em>Field Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Rule Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType
   * @generated
   */
  EClass getFieldRuleType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unique</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getUnique()
   * @see #getFieldRuleType()
   * @generated
   */
  EReference getFieldRuleType_Unique();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Assign</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getAssign()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Assign();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getWhen()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_When();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getEncoding()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Encoding();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getImplLength <em>Impl Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getImplLength()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_ImplLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getImplMaxLength <em>Impl Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getImplMaxLength()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_ImplMaxLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getImplMinLength <em>Impl Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getImplMinLength()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_ImplMinLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getMaxInclusive()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getMinInclusive()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getName()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getPresence()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getRendering()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getType()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Type();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType#getValue()
   * @see #getFieldRuleType()
   * @generated
   */
  EAttribute getFieldRuleType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.FieldsType <em>Fields Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fields Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldsType
   * @generated
   */
  EClass getFieldsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.FieldsType#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldsType#getField()
   * @see #getFieldsType()
   * @generated
   */
  EReference getFieldsType_Field();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldsType#getBase()
   * @see #getFieldsType()
   * @generated
   */
  EAttribute getFieldsType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldsType#getLatestEP()
   * @see #getFieldsType()
   * @generated
   */
  EAttribute getFieldsType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType
   * @generated
   */
  EClass getFieldType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getRule()
   * @see #getFieldType()
   * @generated
   */
  EReference getFieldType_Rule();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assign</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getAssign()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Assign();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getAnnotation()
   * @see #getFieldType()
   * @generated
   */
  EReference getFieldType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getAbbrName()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getAdded()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getAddedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getBaseCategory <em>Base Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Category</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getBaseCategory()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_BaseCategory();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getBaseCategoryAbbrName <em>Base Category Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Category Abbr Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getBaseCategoryAbbrName()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_BaseCategoryAbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getChangeType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getDeprecated()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getDeprecatedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getDiscriminatorId <em>Discriminator Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getDiscriminatorId()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_DiscriminatorId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getEncoding()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Encoding();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getId()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getImplLength <em>Impl Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getImplLength()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ImplLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getImplMaxLength <em>Impl Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getImplMaxLength()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ImplMaxLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getImplMinLength <em>Impl Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Length</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getImplMinLength()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ImplMinLength();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getIssue()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getLastModified()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getLengthId <em>Length Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getLengthId()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_LengthId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getMaxInclusive()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getMinInclusive()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getName()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getPresence <em>Presence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Presence</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getPresence()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Presence();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getRendering()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getReplaced()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getReplacedByField()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getReplacedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getScenario()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getSupported()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Type();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getUnionDataType <em>Union Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Union Data Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getUnionDataType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_UnionDataType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getUpdated()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getUpdatedEP()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FieldType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType#getValue()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Value();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.FlowType <em>Flow Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FlowType
   * @generated
   */
  EClass getFlowType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.FlowType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FlowType#getAnnotation()
   * @see #getFlowType()
   * @generated
   */
  EReference getFlowType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FlowType#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FlowType#getDestination()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Destination();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FlowType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FlowType#getName()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FlowType#getReliability <em>Reliability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reliability</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FlowType#getReliability()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Reliability();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.FlowType#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.FlowType#getSource()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Source();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.GroupRefType <em>Group Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Ref Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupRefType
   * @generated
   */
  EClass getGroupRefType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Occurs</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupRefType#getImplMaxOccurs()
   * @see #getGroupRefType()
   * @generated
   */
  EAttribute getGroupRefType_ImplMaxOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupRefType#getImplMinOccurs <em>Impl Min Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Occurs</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupRefType#getImplMinOccurs()
   * @see #getGroupRefType()
   * @generated
   */
  EAttribute getGroupRefType_ImplMinOccurs();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.GroupsType <em>Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Groups Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupsType
   * @generated
   */
  EClass getGroupsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.GroupsType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupsType#getGroup()
   * @see #getGroupsType()
   * @generated
   */
  EReference getGroupsType_Group();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupsType#getBase()
   * @see #getGroupsType()
   * @generated
   */
  EAttribute getGroupsType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupsType#getLatestEP()
   * @see #getGroupsType()
   * @generated
   */
  EAttribute getGroupsType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.GroupType <em>Group Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType
   * @generated
   */
  EClass getGroupType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getNumInGroup <em>Num In Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num In Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getNumInGroup()
   * @see #getGroupType()
   * @generated
   */
  EReference getGroupType_NumInGroup();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getGroup()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getComponentRef()
   * @see #getGroupType()
   * @generated
   */
  EReference getGroupType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getGroupRef()
   * @see #getGroupType()
   * @generated
   */
  EReference getGroupType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getFieldRef()
   * @see #getGroupType()
   * @generated
   */
  EReference getGroupType_FieldRef();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getAnnotation()
   * @see #getGroupType()
   * @generated
   */
  EReference getGroupType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getAbbrName()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getAdded()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getAddedEP()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getCategory()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Category();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getChangeType()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getDeprecated()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getDeprecatedEP()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getId()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Occurs</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getImplMaxOccurs()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_ImplMaxOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getImplMinOccurs <em>Impl Min Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Occurs</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getImplMinOccurs()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_ImplMinOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getIssue()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getLastModified()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getName()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getRendering <em>Rendering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rendering</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getRendering()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Rendering();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getReplaced()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getReplacedByField()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getReplacedEP()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getScenario()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getSupported()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getUpdated()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getUpdatedEP()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_UpdatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.GroupType#getWhich <em>Which</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Which</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType#getWhich()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Which();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.IdentifiersType <em>Identifiers Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifiers Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifiersType
   * @generated
   */
  EClass getIdentifiersType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.IdentifiersType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifiersType#getGroup()
   * @see #getIdentifiersType()
   * @generated
   */
  EAttribute getIdentifiersType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.IdentifiersType#getCorrelate <em>Correlate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Correlate</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifiersType#getCorrelate()
   * @see #getIdentifiersType()
   * @generated
   */
  EReference getIdentifiersType_Correlate();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.IdentifiersType#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assign</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifiersType#getAssign()
   * @see #getIdentifiersType()
   * @generated
   */
  EReference getIdentifiersType_Assign();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.IdentifiersType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifiersType#getAnnotation()
   * @see #getIdentifiersType()
   * @generated
   */
  EReference getIdentifiersType_Annotation();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.IdentifierType <em>Identifier Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifierType
   * @generated
   */
  EClass getIdentifierType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.IdentifierType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifierType#getId()
   * @see #getIdentifierType()
   * @generated
   */
  EAttribute getIdentifierType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.IdentifierType#getSourceId <em>Source Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifierType#getSourceId()
   * @see #getIdentifierType()
   * @generated
   */
  EAttribute getIdentifierType_SourceId();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype <em>Mapped Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Datatype</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype
   * @generated
   */
  EClass getMappedDatatype();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extension</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getExtension()
   * @see #getMappedDatatype()
   * @generated
   */
  EReference getMappedDatatype_Extension();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getAnnotation()
   * @see #getMappedDatatype()
   * @generated
   */
  EReference getMappedDatatype_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getBase()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#isBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builtin</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#isBuiltin()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_Builtin();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getElement()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_Element();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMaxInclusive <em>Max Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMaxInclusive()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_MaxInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMinInclusive <em>Min Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Inclusive</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getMinInclusive()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_MinInclusive();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getParameter()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_Parameter();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getPattern()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_Pattern();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype#getStandard <em>Standard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Standard</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype#getStandard()
   * @see #getMappedDatatype()
   * @generated
   */
  EAttribute getMappedDatatype_Standard();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType <em>Message Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Ref Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType
   * @generated
   */
  EClass getMessageRefType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiers</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType#getIdentifiers()
   * @see #getMessageRefType()
   * @generated
   */
  EReference getMessageRefType_Identifiers();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType#getId()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType#getImplMaxOccurs <em>Impl Max Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Max Occurs</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType#getImplMaxOccurs()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_ImplMaxOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType#getImplMinOccurs <em>Impl Min Occurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Min Occurs</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType#getImplMinOccurs()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_ImplMinOccurs();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType#getMsgType <em>Msg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msg Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType#getMsgType()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_MsgType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType#getName()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType#getScenario()
   * @see #getMessageRefType()
   * @generated
   */
  EAttribute getMessageRefType_Scenario();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.MessagesType <em>Messages Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Messages Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessagesType
   * @generated
   */
  EClass getMessagesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessagesType#getMessage()
   * @see #getMessagesType()
   * @generated
   */
  EReference getMessagesType_Message();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessagesType#getBase()
   * @see #getMessagesType()
   * @generated
   */
  EAttribute getMessagesType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessagesType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessagesType#getLatestEP()
   * @see #getMessagesType()
   * @generated
   */
  EAttribute getMessagesType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.MessageType <em>Message Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType
   * @generated
   */
  EClass getMessageType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getStructure()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Structure();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getResponses <em>Responses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Responses</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getResponses()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Responses();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getAnnotation()
   * @see #getMessageType()
   * @generated
   */
  EReference getMessageType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getAbbrName <em>Abbr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getAbbrName()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_AbbrName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getAdded()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getAddedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getCategory()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Category();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getChangeType()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getDeprecated()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getDeprecatedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getFlow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flow</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getFlow()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Flow();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getId()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Id();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getIssue()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getLastModified()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getMsgType <em>Msg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msg Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getMsgType()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_MsgType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getName()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getReplaced()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getReplacedByField()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getReplacedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getScenario()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Scenario();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getSupported()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getUpdated()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.MessageType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType#getUpdatedEP()
   * @see #getMessageType()
   * @generated
   */
  EAttribute getMessageType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType
   * @generated
   */
  EClass getRepositoryType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Categories</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getCategories()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Categories();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sections</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getSections()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Sections();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getDatatypes <em>Datatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatypes</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getDatatypes()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Datatypes();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getCodeSets <em>Code Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code Sets</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getCodeSets()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_CodeSets();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getFields()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Fields();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actors</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getActors()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Actors();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Components</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getComponents()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Components();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Groups</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getGroups()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Groups();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Messages</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getMessages()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Messages();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getConcepts <em>Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concepts</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getConcepts()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Concepts();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getAnnotation()
   * @see #getRepositoryType()
   * @generated
   */
  EReference getRepositoryType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getApplVerId <em>Appl Ver Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Appl Ver Id</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getApplVerId()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_ApplVerId();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getExpressionLanguage <em>Expression Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression Language</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getExpressionLanguage()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_ExpressionLanguage();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getGuid <em>Guid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guid</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getGuid()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Guid();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getLatestEP()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_LatestEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getName()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getNamespace()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Namespace();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getSpecUrl <em>Spec Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec Url</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getSpecUrl()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_SpecUrl();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType#getVersion()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Version();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ResponsesType <em>Responses Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Responses Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ResponsesType
   * @generated
   */
  EClass getResponsesType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.ResponsesType#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Response</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ResponsesType#getResponse()
   * @see #getResponsesType()
   * @generated
   */
  EReference getResponsesType_Response();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.ResponseType <em>Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ResponseType
   * @generated
   */
  EClass getResponseType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ResponseType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ResponseType#getWhen()
   * @see #getResponseType()
   * @generated
   */
  EAttribute getResponseType_When();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.ResponseType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ResponseType#getAnnotation()
   * @see #getResponseType()
   * @generated
   */
  EReference getResponseType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ResponseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ResponseType#getName()
   * @see #getResponseType()
   * @generated
   */
  EAttribute getResponseType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.ResponseType#getSync <em>Sync</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sync</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ResponseType#getSync()
   * @see #getResponseType()
   * @generated
   */
  EAttribute getResponseType_Sync();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.SectionsType <em>Sections Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sections Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionsType
   * @generated
   */
  EClass getSectionsType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.SectionsType#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Section</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionsType#getSection()
   * @see #getSectionsType()
   * @generated
   */
  EReference getSectionsType_Section();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionsType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionsType#getBase()
   * @see #getSectionsType()
   * @generated
   */
  EAttribute getSectionsType_Base();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionsType#getLatestEP <em>Latest EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Latest EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionsType#getLatestEP()
   * @see #getSectionsType()
   * @generated
   */
  EAttribute getSectionsType_LatestEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.SectionType <em>Section Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType
   * @generated
   */
  EClass getSectionType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getAnnotation()
   * @see #getSectionType()
   * @generated
   */
  EReference getSectionType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getAdded <em>Added</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getAdded()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Added();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getAddedEP <em>Added EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getAddedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_AddedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getChangeType <em>Change Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Change Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getChangeType()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_ChangeType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getDeprecated()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getDeprecatedEP <em>Deprecated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getDeprecatedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_DeprecatedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getDisplayOrder <em>Display Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Order</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getDisplayOrder()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_DisplayOrder();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getFIXMLFileName <em>FIXML File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>FIXML File Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getFIXMLFileName()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_FIXMLFileName();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Issue</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getIssue()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Issue();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getLastModified <em>Last Modified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Modified</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getLastModified()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_LastModified();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getName()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getReplaced <em>Replaced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getReplaced()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Replaced();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getReplacedByField <em>Replaced By Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced By Field</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getReplacedByField()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_ReplacedByField();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getReplacedEP <em>Replaced EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replaced EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getReplacedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_ReplacedEP();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getSupported <em>Supported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supported</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getSupported()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Supported();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getUpdated <em>Updated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getUpdated()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_Updated();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.SectionType#getUpdatedEP <em>Updated EP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updated EP</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType#getUpdatedEP()
   * @see #getSectionType()
   * @generated
   */
  EAttribute getSectionType_UpdatedEP();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType <em>State Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateMachineType
   * @generated
   */
  EClass getStateMachineType();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateMachineType#getInitial()
   * @see #getStateMachineType()
   * @generated
   */
  EReference getStateMachineType_Initial();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateMachineType#getState()
   * @see #getStateMachineType()
   * @generated
   */
  EReference getStateMachineType_State();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateMachineType#getAnnotation()
   * @see #getStateMachineType()
   * @generated
   */
  EReference getStateMachineType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateMachineType#getName()
   * @see #getStateMachineType()
   * @generated
   */
  EAttribute getStateMachineType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateType
   * @generated
   */
  EClass getStateType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.StateType#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateType#getTransition()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Transition();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.StateType#getOnentry <em>Onentry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Onentry</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateType#getOnentry()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Onentry();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.StateType#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Activity</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateType#getActivity()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Activity();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.StateType#getOnexit <em>Onexit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Onexit</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateType#getOnexit()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Onexit();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.StateType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateType#getAnnotation()
   * @see #getStateType()
   * @generated
   */
  EReference getStateType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.StateType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StateType#getName()
   * @see #getStateType()
   * @generated
   */
  EAttribute getStateType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.StructureType <em>Structure Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StructureType
   * @generated
   */
  EClass getStructureType();

  /**
   * Returns the meta object for the attribute list '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StructureType#getGroup()
   * @see #getStructureType()
   * @generated
   */
  EAttribute getStructureType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getComponentRef <em>Component Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StructureType#getComponentRef()
   * @see #getStructureType()
   * @generated
   */
  EReference getStructureType_ComponentRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getGroupRef <em>Group Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StructureType#getGroupRef()
   * @see #getStructureType()
   * @generated
   */
  EReference getStructureType_GroupRef();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StructureType#getFieldRef()
   * @see #getStructureType()
   * @generated
   */
  EReference getStructureType_FieldRef();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.StructureType#getWhich <em>Which</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Which</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.StructureType#getWhich()
   * @see #getStructureType()
   * @generated
   */
  EAttribute getStructureType_Which();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.TimerSchedule <em>Timer Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Schedule</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerSchedule
   * @generated
   */
  EClass getTimerSchedule();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.TimerSchedule#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Activity</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerSchedule#getActivity()
   * @see #getTimerSchedule()
   * @generated
   */
  EReference getTimerSchedule_Activity();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TimerSchedule#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actor</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerSchedule#getActor()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Actor();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TimerSchedule#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interval</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerSchedule#getInterval()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Interval();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TimerSchedule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerSchedule#getName()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TimerSchedule#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerSchedule#getOperation()
   * @see #getTimerSchedule()
   * @generated
   */
  EAttribute getTimerSchedule_Operation();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.TimerType <em>Timer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timer Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerType
   * @generated
   */
  EClass getTimerType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TimerType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerType#getName()
   * @see #getTimerType()
   * @generated
   */
  EAttribute getTimerType_Name();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TransitionType
   * @generated
   */
  EClass getTransitionType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TransitionType#getWhen()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_When();

  /**
   * Returns the meta object for the containment reference '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TransitionType#getAnnotation()
   * @see #getTransitionType()
   * @generated
   */
  EReference getTransitionType_Annotation();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TransitionType#getName()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TransitionType#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TransitionType#getTarget()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_Target();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.TriggerType <em>Trigger Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TriggerType
   * @generated
   */
  EClass getTriggerType();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TriggerType#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actor</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TriggerType#getActor()
   * @see #getTriggerType()
   * @generated
   */
  EAttribute getTriggerType_Actor();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TriggerType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TriggerType#getName()
   * @see #getTriggerType()
   * @generated
   */
  EAttribute getTriggerType_Name();

  /**
   * Returns the meta object for the attribute '{@link io.fixprotocol._2020.orchestra.repository.TriggerType#getStateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Machine</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TriggerType#getStateMachine()
   * @see #getTriggerType()
   * @generated
   */
  EAttribute getTriggerType_StateMachine();

  /**
   * Returns the meta object for class '{@link io.fixprotocol._2020.orchestra.repository.UniqueType <em>Unique Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.UniqueType
   * @generated
   */
  EClass getUniqueType();

  /**
   * Returns the meta object for the containment reference list '{@link io.fixprotocol._2020.orchestra.repository.UniqueType#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Ref</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.UniqueType#getFieldRef()
   * @see #getUniqueType()
   * @generated
   */
  EReference getUniqueType_FieldRef();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.CatComponentTypeT <em>Cat Component Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cat Component Type T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CatComponentTypeT
   * @generated
   */
  EEnum getCatComponentTypeT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT <em>Category Component Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Category Component Type T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT
   * @generated
   */
  EEnum getCategoryComponentTypeT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.CatIncludeFileT <em>Cat Include File T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cat Include File T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CatIncludeFileT
   * @generated
   */
  EEnum getCatIncludeFileT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.ChangeTypeT <em>Change Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Change Type T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ChangeTypeT
   * @generated
   */
  EEnum getChangeTypeT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum <em>Datatype Standard Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Datatype Standard Enum</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum
   * @generated
   */
  EEnum getDatatypeStandardEnum();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.IncludeFileT <em>Include File T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Include File T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IncludeFileT
   * @generated
   */
  EEnum getIncludeFileT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.MemberType <em>Member Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Member Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MemberType
   * @generated
   */
  EEnum getMemberType();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.PresenceT <em>Presence T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Presence T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @generated
   */
  EEnum getPresenceT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.PurposeEnum <em>Purpose Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Purpose Enum</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.PurposeEnum
   * @generated
   */
  EEnum getPurposeEnum();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.ReliabilityT <em>Reliability T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Reliability T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ReliabilityT
   * @generated
   */
  EEnum getReliabilityT();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.SupportType <em>Support Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Support Type</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SupportType
   * @generated
   */
  EEnum getSupportType();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.Synchronization <em>Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Synchronization</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Synchronization
   * @generated
   */
  EEnum getSynchronization();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.TimerOperation <em>Timer Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Timer Operation</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerOperation
   * @generated
   */
  EEnum getTimerOperation();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.Unbounded <em>Unbounded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unbounded</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Unbounded
   * @generated
   */
  EEnum getUnbounded();

  /**
   * Returns the meta object for enum '{@link io.fixprotocol._2020.orchestra.repository.UnionDataTypeT <em>Union Data Type T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Union Data Type T</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.UnionDataTypeT
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.CatComponentTypeT <em>Cat Component Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Cat Component Type TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CatComponentTypeT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.CatComponentTypeT"
   *        extendedMetaData="name='CatComponentType_t:Object' baseType='CatComponentType_t'"
   * @generated
   */
  EDataType getCatComponentTypeTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT <em>Category Component Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Category Component Type TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.CategoryComponentTypeT"
   *        extendedMetaData="name='CategoryComponentType_t:Object' baseType='CategoryComponentType_t'"
   * @generated
   */
  EDataType getCategoryComponentTypeTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.CatIncludeFileT <em>Cat Include File TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Cat Include File TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.CatIncludeFileT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.CatIncludeFileT"
   *        extendedMetaData="name='CatIncludeFile_t:Object' baseType='CatIncludeFile_t'"
   * @generated
   */
  EDataType getCatIncludeFileTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.ChangeTypeT <em>Change Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Change Type TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ChangeTypeT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.ChangeTypeT"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum <em>Datatype Standard Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Datatype Standard Enum Object</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.DatatypeStandardEnum"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.IncludeFileT <em>Include File TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Include File TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.IncludeFileT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.IncludeFileT"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.MemberType <em>Member Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Member Type Object</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.MemberType
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.MemberType"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.PresenceT <em>Presence TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Presence TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.PresenceT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.PresenceT"
   *        extendedMetaData="name='presence_t:Object' baseType='presence_t'"
   * @generated
   */
  EDataType getPresenceTObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.PurposeEnum <em>Purpose Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Purpose Enum Object</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.PurposeEnum
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.PurposeEnum"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.ReliabilityT <em>Reliability TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Reliability TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.ReliabilityT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.ReliabilityT"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.SupportType <em>Support Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Support Type Object</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.SupportType
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.SupportType"
   *        extendedMetaData="name='supportType:Object' baseType='supportType'"
   * @generated
   */
  EDataType getSupportTypeObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.Synchronization <em>Synchronization Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Synchronization Object</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Synchronization
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.Synchronization"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.TimerOperation <em>Timer Operation Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Timer Operation Object</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.TimerOperation
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.TimerOperation"
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
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.Unbounded <em>Unbounded Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unbounded Object</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.Unbounded
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.Unbounded"
   *        extendedMetaData="name='unbounded:Object' baseType='unbounded'"
   * @generated
   */
  EDataType getUnboundedObject();

  /**
   * Returns the meta object for data type '{@link io.fixprotocol._2020.orchestra.repository.UnionDataTypeT <em>Union Data Type TObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Union Data Type TObject</em>'.
   * @see io.fixprotocol._2020.orchestra.repository.UnionDataTypeT
   * @model instanceClass="io.fixprotocol._2020.orchestra.repository.UnionDataTypeT"
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
   *        extendedMetaData="name='Version_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(FIX.2.7)|(FIX.3.0)|(FIX\\.4\\.[0-4])|((FIX.Latest|(FIX\\.5\\.0(SP\\d{1,2})?))(_EP((9[8-9])|([1-9][0-9][0-9])))?)|(FIXT.1.1)|([0-9]+)\\.([0-9]+)|(\\d{8})'"
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
  RepositoryFactory getRepositoryFactory();

} //RepositoryPackage
