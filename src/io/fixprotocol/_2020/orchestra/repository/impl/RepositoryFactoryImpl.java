/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.*;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryFactoryImpl extends EFactoryImpl implements RepositoryFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RepositoryFactory init() {
    try {
      RepositoryFactory theRepositoryFactory = (RepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(RepositoryPackage.eNS_URI);
      if (theRepositoryFactory != null) {
        return theRepositoryFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RepositoryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryFactoryImpl() {
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
      case RepositoryPackage.ACTION_TYPE: return createActionType();
      case RepositoryPackage.ACTORS_TYPE: return createActorsType();
      case RepositoryPackage.ACTOR_TYPE: return createActorType();
      case RepositoryPackage.ANNOTATION: return createAnnotation();
      case RepositoryPackage.APPINFO: return createAppinfo();
      case RepositoryPackage.BLOCK_ASSIGNMENT_TYPE: return createBlockAssignmentType();
      case RepositoryPackage.CATEGORIES_TYPE: return createCategoriesType();
      case RepositoryPackage.CATEGORY_TYPE: return createCategoryType();
      case RepositoryPackage.CODE_SETS_TYPE: return createCodeSetsType();
      case RepositoryPackage.CODE_SET_TYPE: return createCodeSetType();
      case RepositoryPackage.CODE_TYPE: return createCodeType();
      case RepositoryPackage.COMPONENT_REF_TYPE: return createComponentRefType();
      case RepositoryPackage.COMPONENT_RULE_TYPE: return createComponentRuleType();
      case RepositoryPackage.COMPONENTS_TYPE: return createComponentsType();
      case RepositoryPackage.COMPONENT_TYPE: return createComponentType();
      case RepositoryPackage.CONCEPTS_TYPE: return createConceptsType();
      case RepositoryPackage.CONCEPT_TYPE: return createConceptType();
      case RepositoryPackage.DATATYPES_TYPE: return createDatatypesType();
      case RepositoryPackage.DATATYPE_TYPE: return createDatatypeType();
      case RepositoryPackage.DOCUMENTATION: return createDocumentation();
      case RepositoryPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case RepositoryPackage.EXTENSION_TYPE: return createExtensionType();
      case RepositoryPackage.FIELD_REF_TYPE: return createFieldRefType();
      case RepositoryPackage.FIELD_RULE_TYPE: return createFieldRuleType();
      case RepositoryPackage.FIELDS_TYPE: return createFieldsType();
      case RepositoryPackage.FIELD_TYPE: return createFieldType();
      case RepositoryPackage.FLOW_TYPE: return createFlowType();
      case RepositoryPackage.GROUP_REF_TYPE: return createGroupRefType();
      case RepositoryPackage.GROUPS_TYPE: return createGroupsType();
      case RepositoryPackage.GROUP_TYPE: return createGroupType();
      case RepositoryPackage.IDENTIFIERS_TYPE: return createIdentifiersType();
      case RepositoryPackage.IDENTIFIER_TYPE: return createIdentifierType();
      case RepositoryPackage.MAPPED_DATATYPE: return createMappedDatatype();
      case RepositoryPackage.MESSAGE_REF_TYPE: return createMessageRefType();
      case RepositoryPackage.MESSAGES_TYPE: return createMessagesType();
      case RepositoryPackage.MESSAGE_TYPE: return createMessageType();
      case RepositoryPackage.REPOSITORY_TYPE: return createRepositoryType();
      case RepositoryPackage.RESPONSES_TYPE: return createResponsesType();
      case RepositoryPackage.RESPONSE_TYPE: return createResponseType();
      case RepositoryPackage.SECTIONS_TYPE: return createSectionsType();
      case RepositoryPackage.SECTION_TYPE: return createSectionType();
      case RepositoryPackage.STATE_MACHINE_TYPE: return createStateMachineType();
      case RepositoryPackage.STATE_TYPE: return createStateType();
      case RepositoryPackage.STRUCTURE_TYPE: return createStructureType();
      case RepositoryPackage.TIMER_SCHEDULE: return createTimerSchedule();
      case RepositoryPackage.TIMER_TYPE: return createTimerType();
      case RepositoryPackage.TRANSITION_TYPE: return createTransitionType();
      case RepositoryPackage.TRIGGER_TYPE: return createTriggerType();
      case RepositoryPackage.UNIQUE_TYPE: return createUniqueType();
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
      case RepositoryPackage.CAT_COMPONENT_TYPE_T:
        return createCatComponentTypeTFromString(eDataType, initialValue);
      case RepositoryPackage.CATEGORY_COMPONENT_TYPE_T:
        return createCategoryComponentTypeTFromString(eDataType, initialValue);
      case RepositoryPackage.CAT_INCLUDE_FILE_T:
        return createCatIncludeFileTFromString(eDataType, initialValue);
      case RepositoryPackage.CHANGE_TYPE_T:
        return createChangeTypeTFromString(eDataType, initialValue);
      case RepositoryPackage.DATATYPE_STANDARD_ENUM:
        return createDatatypeStandardEnumFromString(eDataType, initialValue);
      case RepositoryPackage.INCLUDE_FILE_T:
        return createIncludeFileTFromString(eDataType, initialValue);
      case RepositoryPackage.MEMBER_TYPE:
        return createMemberTypeFromString(eDataType, initialValue);
      case RepositoryPackage.PRESENCE_T:
        return createPresenceTFromString(eDataType, initialValue);
      case RepositoryPackage.PURPOSE_ENUM:
        return createPurposeEnumFromString(eDataType, initialValue);
      case RepositoryPackage.RELIABILITY_T:
        return createReliabilityTFromString(eDataType, initialValue);
      case RepositoryPackage.SUPPORT_TYPE:
        return createSupportTypeFromString(eDataType, initialValue);
      case RepositoryPackage.SYNCHRONIZATION:
        return createSynchronizationFromString(eDataType, initialValue);
      case RepositoryPackage.TIMER_OPERATION:
        return createTimerOperationFromString(eDataType, initialValue);
      case RepositoryPackage.UNBOUNDED:
        return createUnboundedFromString(eDataType, initialValue);
      case RepositoryPackage.UNION_DATA_TYPE_T:
        return createUnionDataTypeTFromString(eDataType, initialValue);
      case RepositoryPackage.ABBREVIATION_T:
        return createAbbreviationTFromString(eDataType, initialValue);
      case RepositoryPackage.CAT_COMPONENT_TYPE_TOBJECT:
        return createCatComponentTypeTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.CATEGORY_COMPONENT_TYPE_TOBJECT:
        return createCategoryComponentTypeTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.CAT_INCLUDE_FILE_TOBJECT:
        return createCatIncludeFileTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.CHANGE_TYPE_TOBJECT:
        return createChangeTypeTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.COMP_IDT:
        return createCompIDTFromString(eDataType, initialValue);
      case RepositoryPackage.COMPONENT_NAME_T:
        return createComponentNameTFromString(eDataType, initialValue);
      case RepositoryPackage.DATATYPE_STANDARD_ENUM_OBJECT:
        return createDatatypeStandardEnumObjectFromString(eDataType, initialValue);
      case RepositoryPackage.DATATYPE_STANDARD_T:
        return createDatatypeStandardTFromString(eDataType, initialValue);
      case RepositoryPackage.EDITION_T:
        return createEditionTFromString(eDataType, initialValue);
      case RepositoryPackage.EPT:
        return createEPTFromString(eDataType, initialValue);
      case RepositoryPackage.EXPRESSION_TYPE:
        return createExpressionTypeFromString(eDataType, initialValue);
      case RepositoryPackage.GROUP_NAME_T:
        return createGroupNameTFromString(eDataType, initialValue);
      case RepositoryPackage.ID_T:
        return createIdTFromString(eDataType, initialValue);
      case RepositoryPackage.INCLUDE_FILE_TOBJECT:
        return createIncludeFileTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.LANGUAGE_T:
        return createLanguageTFromString(eDataType, initialValue);
      case RepositoryPackage.MEMBER_TYPE_OBJECT:
        return createMemberTypeObjectFromString(eDataType, initialValue);
      case RepositoryPackage.MIME_T:
        return createMimeTFromString(eDataType, initialValue);
      case RepositoryPackage.MSG_TYPE_T:
        return createMsgTypeTFromString(eDataType, initialValue);
      case RepositoryPackage.NAME_T:
        return createNameTFromString(eDataType, initialValue);
      case RepositoryPackage.PRESENCE_TOBJECT:
        return createPresenceTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.PURPOSE_ENUM_OBJECT:
        return createPurposeEnumObjectFromString(eDataType, initialValue);
      case RepositoryPackage.PURPOSE_T:
        return createPurposeTFromString(eDataType, initialValue);
      case RepositoryPackage.RELIABILITY_TOBJECT:
        return createReliabilityTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.SCENARIO_T:
        return createScenarioTFromString(eDataType, initialValue);
      case RepositoryPackage.SORT_T:
        return createSortTFromString(eDataType, initialValue);
      case RepositoryPackage.SUPPORT_TYPE_OBJECT:
        return createSupportTypeObjectFromString(eDataType, initialValue);
      case RepositoryPackage.SYNCHRONIZATION_OBJECT:
        return createSynchronizationObjectFromString(eDataType, initialValue);
      case RepositoryPackage.TERM_T:
        return createTermTFromString(eDataType, initialValue);
      case RepositoryPackage.TIMER_OPERATION_OBJECT:
        return createTimerOperationObjectFromString(eDataType, initialValue);
      case RepositoryPackage.UNBOUNDED_INT_TYPE:
        return createUnboundedIntTypeFromString(eDataType, initialValue);
      case RepositoryPackage.UNBOUNDED_OBJECT:
        return createUnboundedObjectFromString(eDataType, initialValue);
      case RepositoryPackage.UNION_DATA_TYPE_TOBJECT:
        return createUnionDataTypeTObjectFromString(eDataType, initialValue);
      case RepositoryPackage.USAGE_T:
        return createUsageTFromString(eDataType, initialValue);
      case RepositoryPackage.VERSION_T:
        return createVersionTFromString(eDataType, initialValue);
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
      case RepositoryPackage.CAT_COMPONENT_TYPE_T:
        return convertCatComponentTypeTToString(eDataType, instanceValue);
      case RepositoryPackage.CATEGORY_COMPONENT_TYPE_T:
        return convertCategoryComponentTypeTToString(eDataType, instanceValue);
      case RepositoryPackage.CAT_INCLUDE_FILE_T:
        return convertCatIncludeFileTToString(eDataType, instanceValue);
      case RepositoryPackage.CHANGE_TYPE_T:
        return convertChangeTypeTToString(eDataType, instanceValue);
      case RepositoryPackage.DATATYPE_STANDARD_ENUM:
        return convertDatatypeStandardEnumToString(eDataType, instanceValue);
      case RepositoryPackage.INCLUDE_FILE_T:
        return convertIncludeFileTToString(eDataType, instanceValue);
      case RepositoryPackage.MEMBER_TYPE:
        return convertMemberTypeToString(eDataType, instanceValue);
      case RepositoryPackage.PRESENCE_T:
        return convertPresenceTToString(eDataType, instanceValue);
      case RepositoryPackage.PURPOSE_ENUM:
        return convertPurposeEnumToString(eDataType, instanceValue);
      case RepositoryPackage.RELIABILITY_T:
        return convertReliabilityTToString(eDataType, instanceValue);
      case RepositoryPackage.SUPPORT_TYPE:
        return convertSupportTypeToString(eDataType, instanceValue);
      case RepositoryPackage.SYNCHRONIZATION:
        return convertSynchronizationToString(eDataType, instanceValue);
      case RepositoryPackage.TIMER_OPERATION:
        return convertTimerOperationToString(eDataType, instanceValue);
      case RepositoryPackage.UNBOUNDED:
        return convertUnboundedToString(eDataType, instanceValue);
      case RepositoryPackage.UNION_DATA_TYPE_T:
        return convertUnionDataTypeTToString(eDataType, instanceValue);
      case RepositoryPackage.ABBREVIATION_T:
        return convertAbbreviationTToString(eDataType, instanceValue);
      case RepositoryPackage.CAT_COMPONENT_TYPE_TOBJECT:
        return convertCatComponentTypeTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.CATEGORY_COMPONENT_TYPE_TOBJECT:
        return convertCategoryComponentTypeTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.CAT_INCLUDE_FILE_TOBJECT:
        return convertCatIncludeFileTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.CHANGE_TYPE_TOBJECT:
        return convertChangeTypeTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.COMP_IDT:
        return convertCompIDTToString(eDataType, instanceValue);
      case RepositoryPackage.COMPONENT_NAME_T:
        return convertComponentNameTToString(eDataType, instanceValue);
      case RepositoryPackage.DATATYPE_STANDARD_ENUM_OBJECT:
        return convertDatatypeStandardEnumObjectToString(eDataType, instanceValue);
      case RepositoryPackage.DATATYPE_STANDARD_T:
        return convertDatatypeStandardTToString(eDataType, instanceValue);
      case RepositoryPackage.EDITION_T:
        return convertEditionTToString(eDataType, instanceValue);
      case RepositoryPackage.EPT:
        return convertEPTToString(eDataType, instanceValue);
      case RepositoryPackage.EXPRESSION_TYPE:
        return convertExpressionTypeToString(eDataType, instanceValue);
      case RepositoryPackage.GROUP_NAME_T:
        return convertGroupNameTToString(eDataType, instanceValue);
      case RepositoryPackage.ID_T:
        return convertIdTToString(eDataType, instanceValue);
      case RepositoryPackage.INCLUDE_FILE_TOBJECT:
        return convertIncludeFileTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.LANGUAGE_T:
        return convertLanguageTToString(eDataType, instanceValue);
      case RepositoryPackage.MEMBER_TYPE_OBJECT:
        return convertMemberTypeObjectToString(eDataType, instanceValue);
      case RepositoryPackage.MIME_T:
        return convertMimeTToString(eDataType, instanceValue);
      case RepositoryPackage.MSG_TYPE_T:
        return convertMsgTypeTToString(eDataType, instanceValue);
      case RepositoryPackage.NAME_T:
        return convertNameTToString(eDataType, instanceValue);
      case RepositoryPackage.PRESENCE_TOBJECT:
        return convertPresenceTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.PURPOSE_ENUM_OBJECT:
        return convertPurposeEnumObjectToString(eDataType, instanceValue);
      case RepositoryPackage.PURPOSE_T:
        return convertPurposeTToString(eDataType, instanceValue);
      case RepositoryPackage.RELIABILITY_TOBJECT:
        return convertReliabilityTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.SCENARIO_T:
        return convertScenarioTToString(eDataType, instanceValue);
      case RepositoryPackage.SORT_T:
        return convertSortTToString(eDataType, instanceValue);
      case RepositoryPackage.SUPPORT_TYPE_OBJECT:
        return convertSupportTypeObjectToString(eDataType, instanceValue);
      case RepositoryPackage.SYNCHRONIZATION_OBJECT:
        return convertSynchronizationObjectToString(eDataType, instanceValue);
      case RepositoryPackage.TERM_T:
        return convertTermTToString(eDataType, instanceValue);
      case RepositoryPackage.TIMER_OPERATION_OBJECT:
        return convertTimerOperationObjectToString(eDataType, instanceValue);
      case RepositoryPackage.UNBOUNDED_INT_TYPE:
        return convertUnboundedIntTypeToString(eDataType, instanceValue);
      case RepositoryPackage.UNBOUNDED_OBJECT:
        return convertUnboundedObjectToString(eDataType, instanceValue);
      case RepositoryPackage.UNION_DATA_TYPE_TOBJECT:
        return convertUnionDataTypeTObjectToString(eDataType, instanceValue);
      case RepositoryPackage.USAGE_T:
        return convertUsageTToString(eDataType, instanceValue);
      case RepositoryPackage.VERSION_T:
        return convertVersionTToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionType createActionType() {
    ActionTypeImpl actionType = new ActionTypeImpl();
    return actionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorsType createActorsType() {
    ActorsTypeImpl actorsType = new ActorsTypeImpl();
    return actorsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorType createActorType() {
    ActorTypeImpl actorType = new ActorTypeImpl();
    return actorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation() {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Appinfo createAppinfo() {
    AppinfoImpl appinfo = new AppinfoImpl();
    return appinfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockAssignmentType createBlockAssignmentType() {
    BlockAssignmentTypeImpl blockAssignmentType = new BlockAssignmentTypeImpl();
    return blockAssignmentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoriesType createCategoriesType() {
    CategoriesTypeImpl categoriesType = new CategoriesTypeImpl();
    return categoriesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryType createCategoryType() {
    CategoryTypeImpl categoryType = new CategoryTypeImpl();
    return categoryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeSetsType createCodeSetsType() {
    CodeSetsTypeImpl codeSetsType = new CodeSetsTypeImpl();
    return codeSetsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeSetType createCodeSetType() {
    CodeSetTypeImpl codeSetType = new CodeSetTypeImpl();
    return codeSetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeType createCodeType() {
    CodeTypeImpl codeType = new CodeTypeImpl();
    return codeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRefType createComponentRefType() {
    ComponentRefTypeImpl componentRefType = new ComponentRefTypeImpl();
    return componentRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRuleType createComponentRuleType() {
    ComponentRuleTypeImpl componentRuleType = new ComponentRuleTypeImpl();
    return componentRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentsType createComponentsType() {
    ComponentsTypeImpl componentsType = new ComponentsTypeImpl();
    return componentsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentType createComponentType() {
    ComponentTypeImpl componentType = new ComponentTypeImpl();
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptsType createConceptsType() {
    ConceptsTypeImpl conceptsType = new ConceptsTypeImpl();
    return conceptsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptType createConceptType() {
    ConceptTypeImpl conceptType = new ConceptTypeImpl();
    return conceptType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypesType createDatatypesType() {
    DatatypesTypeImpl datatypesType = new DatatypesTypeImpl();
    return datatypesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeType createDatatypeType() {
    DatatypeTypeImpl datatypeType = new DatatypeTypeImpl();
    return datatypeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Documentation createDocumentation() {
    DocumentationImpl documentation = new DocumentationImpl();
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionType createExtensionType() {
    ExtensionTypeImpl extensionType = new ExtensionTypeImpl();
    return extensionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldRefType createFieldRefType() {
    FieldRefTypeImpl fieldRefType = new FieldRefTypeImpl();
    return fieldRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldRuleType createFieldRuleType() {
    FieldRuleTypeImpl fieldRuleType = new FieldRuleTypeImpl();
    return fieldRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldsType createFieldsType() {
    FieldsTypeImpl fieldsType = new FieldsTypeImpl();
    return fieldsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType createFieldType() {
    FieldTypeImpl fieldType = new FieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowType createFlowType() {
    FlowTypeImpl flowType = new FlowTypeImpl();
    return flowType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupRefType createGroupRefType() {
    GroupRefTypeImpl groupRefType = new GroupRefTypeImpl();
    return groupRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupsType createGroupsType() {
    GroupsTypeImpl groupsType = new GroupsTypeImpl();
    return groupsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupType createGroupType() {
    GroupTypeImpl groupType = new GroupTypeImpl();
    return groupType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifiersType createIdentifiersType() {
    IdentifiersTypeImpl identifiersType = new IdentifiersTypeImpl();
    return identifiersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierType createIdentifierType() {
    IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
    return identifierType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedDatatype createMappedDatatype() {
    MappedDatatypeImpl mappedDatatype = new MappedDatatypeImpl();
    return mappedDatatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageRefType createMessageRefType() {
    MessageRefTypeImpl messageRefType = new MessageRefTypeImpl();
    return messageRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessagesType createMessagesType() {
    MessagesTypeImpl messagesType = new MessagesTypeImpl();
    return messagesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageType createMessageType() {
    MessageTypeImpl messageType = new MessageTypeImpl();
    return messageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryType createRepositoryType() {
    RepositoryTypeImpl repositoryType = new RepositoryTypeImpl();
    return repositoryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponsesType createResponsesType() {
    ResponsesTypeImpl responsesType = new ResponsesTypeImpl();
    return responsesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponseType createResponseType() {
    ResponseTypeImpl responseType = new ResponseTypeImpl();
    return responseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionsType createSectionsType() {
    SectionsTypeImpl sectionsType = new SectionsTypeImpl();
    return sectionsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionType createSectionType() {
    SectionTypeImpl sectionType = new SectionTypeImpl();
    return sectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineType createStateMachineType() {
    StateMachineTypeImpl stateMachineType = new StateMachineTypeImpl();
    return stateMachineType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateType createStateType() {
    StateTypeImpl stateType = new StateTypeImpl();
    return stateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureType createStructureType() {
    StructureTypeImpl structureType = new StructureTypeImpl();
    return structureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerSchedule createTimerSchedule() {
    TimerScheduleImpl timerSchedule = new TimerScheduleImpl();
    return timerSchedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerType createTimerType() {
    TimerTypeImpl timerType = new TimerTypeImpl();
    return timerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType createTransitionType() {
    TransitionTypeImpl transitionType = new TransitionTypeImpl();
    return transitionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerType createTriggerType() {
    TriggerTypeImpl triggerType = new TriggerTypeImpl();
    return triggerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueType createUniqueType() {
    UniqueTypeImpl uniqueType = new UniqueTypeImpl();
    return uniqueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatComponentTypeT createCatComponentTypeTFromString(EDataType eDataType, String initialValue) {
    CatComponentTypeT result = CatComponentTypeT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCatComponentTypeTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryComponentTypeT createCategoryComponentTypeTFromString(EDataType eDataType, String initialValue) {
    CategoryComponentTypeT result = CategoryComponentTypeT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCategoryComponentTypeTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatIncludeFileT createCatIncludeFileTFromString(EDataType eDataType, String initialValue) {
    CatIncludeFileT result = CatIncludeFileT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCatIncludeFileTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeTypeT createChangeTypeTFromString(EDataType eDataType, String initialValue) {
    ChangeTypeT result = ChangeTypeT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeTypeTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeStandardEnum createDatatypeStandardEnumFromString(EDataType eDataType, String initialValue) {
    DatatypeStandardEnum result = DatatypeStandardEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDatatypeStandardEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeFileT createIncludeFileTFromString(EDataType eDataType, String initialValue) {
    IncludeFileT result = IncludeFileT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIncludeFileTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberType createMemberTypeFromString(EDataType eDataType, String initialValue) {
    MemberType result = MemberType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMemberTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresenceT createPresenceTFromString(EDataType eDataType, String initialValue) {
    PresenceT result = PresenceT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPresenceTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurposeEnum createPurposeEnumFromString(EDataType eDataType, String initialValue) {
    PurposeEnum result = PurposeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPurposeEnumToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReliabilityT createReliabilityTFromString(EDataType eDataType, String initialValue) {
    ReliabilityT result = ReliabilityT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertReliabilityTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportType createSupportTypeFromString(EDataType eDataType, String initialValue) {
    SupportType result = SupportType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSupportTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Synchronization createSynchronizationFromString(EDataType eDataType, String initialValue) {
    Synchronization result = Synchronization.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSynchronizationToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerOperation createTimerOperationFromString(EDataType eDataType, String initialValue) {
    TimerOperation result = TimerOperation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimerOperationToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unbounded createUnboundedFromString(EDataType eDataType, String initialValue) {
    Unbounded result = Unbounded.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnboundedToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionDataTypeT createUnionDataTypeTFromString(EDataType eDataType, String initialValue) {
    UnionDataTypeT result = UnionDataTypeT.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnionDataTypeTToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createAbbreviationTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAbbreviationTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatComponentTypeT createCatComponentTypeTObjectFromString(EDataType eDataType, String initialValue) {
    return createCatComponentTypeTFromString(RepositoryPackage.eINSTANCE.getCatComponentTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCatComponentTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCatComponentTypeTToString(RepositoryPackage.eINSTANCE.getCatComponentTypeT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryComponentTypeT createCategoryComponentTypeTObjectFromString(EDataType eDataType, String initialValue) {
    return createCategoryComponentTypeTFromString(RepositoryPackage.eINSTANCE.getCategoryComponentTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCategoryComponentTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCategoryComponentTypeTToString(RepositoryPackage.eINSTANCE.getCategoryComponentTypeT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatIncludeFileT createCatIncludeFileTObjectFromString(EDataType eDataType, String initialValue) {
    return createCatIncludeFileTFromString(RepositoryPackage.eINSTANCE.getCatIncludeFileT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCatIncludeFileTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCatIncludeFileTToString(RepositoryPackage.eINSTANCE.getCatIncludeFileT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeTypeT createChangeTypeTObjectFromString(EDataType eDataType, String initialValue) {
    return createChangeTypeTFromString(RepositoryPackage.eINSTANCE.getChangeTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertChangeTypeTToString(RepositoryPackage.eINSTANCE.getChangeTypeT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger createCompIDTFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompIDTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createComponentNameTFromString(EDataType eDataType, String initialValue) {
    return createNameTFromString(RepositoryPackage.eINSTANCE.getNameT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComponentNameTToString(EDataType eDataType, Object instanceValue) {
    return convertNameTToString(RepositoryPackage.eINSTANCE.getNameT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeStandardEnum createDatatypeStandardEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createDatatypeStandardEnumFromString(RepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDatatypeStandardEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertDatatypeStandardEnumToString(RepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createDatatypeStandardTFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    Object result = null;
    RuntimeException exception = null;
    try {
      result = createDatatypeStandardEnumFromString(RepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
        return result;
      }
    }
    catch (RuntimeException e) {
      exception = e;
    }
    try {
      result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
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
  public String convertDatatypeStandardTToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    if (RepositoryPackage.eINSTANCE.getDatatypeStandardEnum().isInstance(instanceValue)) {
      try {
        String value = convertDatatypeStandardEnumToString(RepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e) {
        // Keep trying other member types until all have failed.
      }
    }
    if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
      try {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
  public String createEditionTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEditionTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger createEPTFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEPTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createExpressionTypeFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createGroupNameTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGroupNameTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger createIdTFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIdTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeFileT createIncludeFileTObjectFromString(EDataType eDataType, String initialValue) {
    return createIncludeFileTFromString(RepositoryPackage.eINSTANCE.getIncludeFileT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIncludeFileTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertIncludeFileTToString(RepositoryPackage.eINSTANCE.getIncludeFileT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createLanguageTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLanguageTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberType createMemberTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createMemberTypeFromString(RepositoryPackage.eINSTANCE.getMemberType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMemberTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertMemberTypeToString(RepositoryPackage.eINSTANCE.getMemberType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createMimeTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMimeTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createMsgTypeTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMsgTypeTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createNameTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNameTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresenceT createPresenceTObjectFromString(EDataType eDataType, String initialValue) {
    return createPresenceTFromString(RepositoryPackage.eINSTANCE.getPresenceT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPresenceTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertPresenceTToString(RepositoryPackage.eINSTANCE.getPresenceT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurposeEnum createPurposeEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createPurposeEnumFromString(RepositoryPackage.eINSTANCE.getPurposeEnum(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPurposeEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertPurposeEnumToString(RepositoryPackage.eINSTANCE.getPurposeEnum(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createPurposeTFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    Object result = null;
    RuntimeException exception = null;
    try {
      result = createPurposeEnumFromString(RepositoryPackage.eINSTANCE.getPurposeEnum(), initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
        return result;
      }
    }
    catch (RuntimeException e) {
      exception = e;
    }
    try {
      result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
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
  public String convertPurposeTToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    if (RepositoryPackage.eINSTANCE.getPurposeEnum().isInstance(instanceValue)) {
      try {
        String value = convertPurposeEnumToString(RepositoryPackage.eINSTANCE.getPurposeEnum(), instanceValue);
        if (value != null) return value;
      }
      catch (Exception e) {
        // Keep trying other member types until all have failed.
      }
    }
    if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
      try {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
  public ReliabilityT createReliabilityTObjectFromString(EDataType eDataType, String initialValue) {
    return createReliabilityTFromString(RepositoryPackage.eINSTANCE.getReliabilityT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertReliabilityTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertReliabilityTToString(RepositoryPackage.eINSTANCE.getReliabilityT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createScenarioTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScenarioTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger createSortTFromString(EDataType eDataType, String initialValue) {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSortTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportType createSupportTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createSupportTypeFromString(RepositoryPackage.eINSTANCE.getSupportType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSupportTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertSupportTypeToString(RepositoryPackage.eINSTANCE.getSupportType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Synchronization createSynchronizationObjectFromString(EDataType eDataType, String initialValue) {
    return createSynchronizationFromString(RepositoryPackage.eINSTANCE.getSynchronization(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSynchronizationObjectToString(EDataType eDataType, Object instanceValue) {
    return convertSynchronizationToString(RepositoryPackage.eINSTANCE.getSynchronization(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createTermTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTermTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimerOperation createTimerOperationObjectFromString(EDataType eDataType, String initialValue) {
    return createTimerOperationFromString(RepositoryPackage.eINSTANCE.getTimerOperation(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimerOperationObjectToString(EDataType eDataType, Object instanceValue) {
    return convertTimerOperationToString(RepositoryPackage.eINSTANCE.getTimerOperation(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createUnboundedIntTypeFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) return null;
    Object result = null;
    RuntimeException exception = null;
    try {
      result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
      if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
        return result;
      }
    }
    catch (RuntimeException e) {
      exception = e;
    }
    try {
      result = createUnboundedFromString(RepositoryPackage.eINSTANCE.getUnbounded(), initialValue);
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
  public String convertUnboundedIntTypeToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) return null;
    if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
      try {
        String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
        if (value != null) return value;
      }
      catch (Exception e) {
        // Keep trying other member types until all have failed.
      }
    }
    if (RepositoryPackage.eINSTANCE.getUnbounded().isInstance(instanceValue)) {
      try {
        String value = convertUnboundedToString(RepositoryPackage.eINSTANCE.getUnbounded(), instanceValue);
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
  public Unbounded createUnboundedObjectFromString(EDataType eDataType, String initialValue) {
    return createUnboundedFromString(RepositoryPackage.eINSTANCE.getUnbounded(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnboundedObjectToString(EDataType eDataType, Object instanceValue) {
    return convertUnboundedToString(RepositoryPackage.eINSTANCE.getUnbounded(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionDataTypeT createUnionDataTypeTObjectFromString(EDataType eDataType, String initialValue) {
    return createUnionDataTypeTFromString(RepositoryPackage.eINSTANCE.getUnionDataTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnionDataTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertUnionDataTypeTToString(RepositoryPackage.eINSTANCE.getUnionDataTypeT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createUsageTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUsageTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createVersionTFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVersionTToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryPackage getRepositoryPackage() {
    return (RepositoryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RepositoryPackage getPackage() {
    return RepositoryPackage.eINSTANCE;
  }

} //RepositoryFactoryImpl
