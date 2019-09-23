/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.*;

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
public class FixrepositoryFactoryImpl extends EFactoryImpl implements FixrepositoryFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FixrepositoryFactory init() {
    try {
      FixrepositoryFactory theFixrepositoryFactory = (FixrepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(FixrepositoryPackage.eNS_URI);
      if (theFixrepositoryFactory != null) {
        return theFixrepositoryFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FixrepositoryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixrepositoryFactoryImpl() {
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
      case FixrepositoryPackage.ACTION_TYPE: return createActionType();
      case FixrepositoryPackage.ACTORS_TYPE: return createActorsType();
      case FixrepositoryPackage.ACTOR_TYPE: return createActorType();
      case FixrepositoryPackage.ANNOTATION: return createAnnotation();
      case FixrepositoryPackage.APPINFO: return createAppinfo();
      case FixrepositoryPackage.BLOCK_ASSIGNMENT_TYPE: return createBlockAssignmentType();
      case FixrepositoryPackage.CATEGORIES_TYPE: return createCategoriesType();
      case FixrepositoryPackage.CATEGORY_TYPE: return createCategoryType();
      case FixrepositoryPackage.CODE_SETS_TYPE: return createCodeSetsType();
      case FixrepositoryPackage.CODE_SET_TYPE: return createCodeSetType();
      case FixrepositoryPackage.CODE_TYPE: return createCodeType();
      case FixrepositoryPackage.COMPONENT_REF_TYPE: return createComponentRefType();
      case FixrepositoryPackage.COMPONENTS_TYPE: return createComponentsType();
      case FixrepositoryPackage.COMPONENT_TYPE: return createComponentType();
      case FixrepositoryPackage.CONCEPTS_TYPE: return createConceptsType();
      case FixrepositoryPackage.CONCEPT_TYPE: return createConceptType();
      case FixrepositoryPackage.DATATYPES_TYPE: return createDatatypesType();
      case FixrepositoryPackage.DATATYPE_TYPE: return createDatatypeType();
      case FixrepositoryPackage.DOCUMENTATION: return createDocumentation();
      case FixrepositoryPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case FixrepositoryPackage.FIELD_REF_TYPE: return createFieldRefType();
      case FixrepositoryPackage.FIELD_RULE_TYPE: return createFieldRuleType();
      case FixrepositoryPackage.FIELDS_TYPE: return createFieldsType();
      case FixrepositoryPackage.FIELD_TYPE: return createFieldType();
      case FixrepositoryPackage.FLOW_TYPE: return createFlowType();
      case FixrepositoryPackage.GROUP_REF_TYPE: return createGroupRefType();
      case FixrepositoryPackage.GROUPS_TYPE: return createGroupsType();
      case FixrepositoryPackage.GROUP_TYPE: return createGroupType();
      case FixrepositoryPackage.IDENTIFIERS_TYPE: return createIdentifiersType();
      case FixrepositoryPackage.IDENTIFIER_TYPE: return createIdentifierType();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE: return createMappedDatatypeType();
      case FixrepositoryPackage.MESSAGE_REF_TYPE: return createMessageRefType();
      case FixrepositoryPackage.MESSAGES_TYPE: return createMessagesType();
      case FixrepositoryPackage.MESSAGE_TYPE: return createMessageType();
      case FixrepositoryPackage.REPOSITORY_TYPE: return createRepositoryType();
      case FixrepositoryPackage.RESPONSES_TYPE: return createResponsesType();
      case FixrepositoryPackage.RESPONSE_TYPE: return createResponseType();
      case FixrepositoryPackage.SECTIONS_TYPE: return createSectionsType();
      case FixrepositoryPackage.SECTION_TYPE: return createSectionType();
      case FixrepositoryPackage.STATE_MACHINE_TYPE: return createStateMachineType();
      case FixrepositoryPackage.STATE_TYPE: return createStateType();
      case FixrepositoryPackage.STRUCTURE_TYPE: return createStructureType();
      case FixrepositoryPackage.TIMER_SCHEDULE: return createTimerSchedule();
      case FixrepositoryPackage.TIMER_TYPE: return createTimerType();
      case FixrepositoryPackage.TRANSITION_TYPE: return createTransitionType();
      case FixrepositoryPackage.TRIGGER_TYPE: return createTriggerType();
      case FixrepositoryPackage.UNIQUE_TYPE: return createUniqueType();
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
      case FixrepositoryPackage.CAT_COMPONENT_TYPE_T:
        return createCatComponentTypeTFromString(eDataType, initialValue);
      case FixrepositoryPackage.CATEGORY_COMPONENT_TYPE_T:
        return createCategoryComponentTypeTFromString(eDataType, initialValue);
      case FixrepositoryPackage.CAT_INCLUDE_FILE_T:
        return createCatIncludeFileTFromString(eDataType, initialValue);
      case FixrepositoryPackage.CHANGE_TYPE_T:
        return createChangeTypeTFromString(eDataType, initialValue);
      case FixrepositoryPackage.DATATYPE_STANDARD_ENUM:
        return createDatatypeStandardEnumFromString(eDataType, initialValue);
      case FixrepositoryPackage.INCLUDE_FILE_T:
        return createIncludeFileTFromString(eDataType, initialValue);
      case FixrepositoryPackage.MEMBER_TYPE:
        return createMemberTypeFromString(eDataType, initialValue);
      case FixrepositoryPackage.PRESENCE_T:
        return createPresenceTFromString(eDataType, initialValue);
      case FixrepositoryPackage.PURPOSE_ENUM:
        return createPurposeEnumFromString(eDataType, initialValue);
      case FixrepositoryPackage.RELIABILITY_T:
        return createReliabilityTFromString(eDataType, initialValue);
      case FixrepositoryPackage.SUPPORT_TYPE:
        return createSupportTypeFromString(eDataType, initialValue);
      case FixrepositoryPackage.SYNCHRONIZATION:
        return createSynchronizationFromString(eDataType, initialValue);
      case FixrepositoryPackage.TIMER_OPERATION:
        return createTimerOperationFromString(eDataType, initialValue);
      case FixrepositoryPackage.UNBOUNDED:
        return createUnboundedFromString(eDataType, initialValue);
      case FixrepositoryPackage.UNION_DATA_TYPE_T:
        return createUnionDataTypeTFromString(eDataType, initialValue);
      case FixrepositoryPackage.ABBREVIATION_T:
        return createAbbreviationTFromString(eDataType, initialValue);
      case FixrepositoryPackage.CAT_COMPONENT_TYPE_TOBJECT:
        return createCatComponentTypeTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.CATEGORY_COMPONENT_TYPE_TOBJECT:
        return createCategoryComponentTypeTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.CAT_INCLUDE_FILE_TOBJECT:
        return createCatIncludeFileTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.CHANGE_TYPE_TOBJECT:
        return createChangeTypeTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.COMP_IDT:
        return createCompIDTFromString(eDataType, initialValue);
      case FixrepositoryPackage.COMPONENT_NAME_T:
        return createComponentNameTFromString(eDataType, initialValue);
      case FixrepositoryPackage.DATATYPE_STANDARD_ENUM_OBJECT:
        return createDatatypeStandardEnumObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.DATATYPE_STANDARD_T:
        return createDatatypeStandardTFromString(eDataType, initialValue);
      case FixrepositoryPackage.EDITION_T:
        return createEditionTFromString(eDataType, initialValue);
      case FixrepositoryPackage.EPT:
        return createEPTFromString(eDataType, initialValue);
      case FixrepositoryPackage.EXPRESSION_TYPE:
        return createExpressionTypeFromString(eDataType, initialValue);
      case FixrepositoryPackage.GROUP_NAME_T:
        return createGroupNameTFromString(eDataType, initialValue);
      case FixrepositoryPackage.ID_T:
        return createIdTFromString(eDataType, initialValue);
      case FixrepositoryPackage.INCLUDE_FILE_TOBJECT:
        return createIncludeFileTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.LANGUAGE_T:
        return createLanguageTFromString(eDataType, initialValue);
      case FixrepositoryPackage.MEMBER_TYPE_OBJECT:
        return createMemberTypeObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.MIME_T:
        return createMimeTFromString(eDataType, initialValue);
      case FixrepositoryPackage.MSG_TYPE_T:
        return createMsgTypeTFromString(eDataType, initialValue);
      case FixrepositoryPackage.NAME_T:
        return createNameTFromString(eDataType, initialValue);
      case FixrepositoryPackage.PRESENCE_TOBJECT:
        return createPresenceTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.PURPOSE_ENUM_OBJECT:
        return createPurposeEnumObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.PURPOSE_T:
        return createPurposeTFromString(eDataType, initialValue);
      case FixrepositoryPackage.RELIABILITY_TOBJECT:
        return createReliabilityTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.SCENARIO_T:
        return createScenarioTFromString(eDataType, initialValue);
      case FixrepositoryPackage.SORT_T:
        return createSortTFromString(eDataType, initialValue);
      case FixrepositoryPackage.SUPPORT_TYPE_OBJECT:
        return createSupportTypeObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.SYNCHRONIZATION_OBJECT:
        return createSynchronizationObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.TERM_T:
        return createTermTFromString(eDataType, initialValue);
      case FixrepositoryPackage.TIMER_OPERATION_OBJECT:
        return createTimerOperationObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.UNBOUNDED_INT_TYPE:
        return createUnboundedIntTypeFromString(eDataType, initialValue);
      case FixrepositoryPackage.UNBOUNDED_OBJECT:
        return createUnboundedObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.UNION_DATA_TYPE_TOBJECT:
        return createUnionDataTypeTObjectFromString(eDataType, initialValue);
      case FixrepositoryPackage.USAGE_T:
        return createUsageTFromString(eDataType, initialValue);
      case FixrepositoryPackage.VERSION_T:
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
      case FixrepositoryPackage.CAT_COMPONENT_TYPE_T:
        return convertCatComponentTypeTToString(eDataType, instanceValue);
      case FixrepositoryPackage.CATEGORY_COMPONENT_TYPE_T:
        return convertCategoryComponentTypeTToString(eDataType, instanceValue);
      case FixrepositoryPackage.CAT_INCLUDE_FILE_T:
        return convertCatIncludeFileTToString(eDataType, instanceValue);
      case FixrepositoryPackage.CHANGE_TYPE_T:
        return convertChangeTypeTToString(eDataType, instanceValue);
      case FixrepositoryPackage.DATATYPE_STANDARD_ENUM:
        return convertDatatypeStandardEnumToString(eDataType, instanceValue);
      case FixrepositoryPackage.INCLUDE_FILE_T:
        return convertIncludeFileTToString(eDataType, instanceValue);
      case FixrepositoryPackage.MEMBER_TYPE:
        return convertMemberTypeToString(eDataType, instanceValue);
      case FixrepositoryPackage.PRESENCE_T:
        return convertPresenceTToString(eDataType, instanceValue);
      case FixrepositoryPackage.PURPOSE_ENUM:
        return convertPurposeEnumToString(eDataType, instanceValue);
      case FixrepositoryPackage.RELIABILITY_T:
        return convertReliabilityTToString(eDataType, instanceValue);
      case FixrepositoryPackage.SUPPORT_TYPE:
        return convertSupportTypeToString(eDataType, instanceValue);
      case FixrepositoryPackage.SYNCHRONIZATION:
        return convertSynchronizationToString(eDataType, instanceValue);
      case FixrepositoryPackage.TIMER_OPERATION:
        return convertTimerOperationToString(eDataType, instanceValue);
      case FixrepositoryPackage.UNBOUNDED:
        return convertUnboundedToString(eDataType, instanceValue);
      case FixrepositoryPackage.UNION_DATA_TYPE_T:
        return convertUnionDataTypeTToString(eDataType, instanceValue);
      case FixrepositoryPackage.ABBREVIATION_T:
        return convertAbbreviationTToString(eDataType, instanceValue);
      case FixrepositoryPackage.CAT_COMPONENT_TYPE_TOBJECT:
        return convertCatComponentTypeTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.CATEGORY_COMPONENT_TYPE_TOBJECT:
        return convertCategoryComponentTypeTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.CAT_INCLUDE_FILE_TOBJECT:
        return convertCatIncludeFileTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.CHANGE_TYPE_TOBJECT:
        return convertChangeTypeTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.COMP_IDT:
        return convertCompIDTToString(eDataType, instanceValue);
      case FixrepositoryPackage.COMPONENT_NAME_T:
        return convertComponentNameTToString(eDataType, instanceValue);
      case FixrepositoryPackage.DATATYPE_STANDARD_ENUM_OBJECT:
        return convertDatatypeStandardEnumObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.DATATYPE_STANDARD_T:
        return convertDatatypeStandardTToString(eDataType, instanceValue);
      case FixrepositoryPackage.EDITION_T:
        return convertEditionTToString(eDataType, instanceValue);
      case FixrepositoryPackage.EPT:
        return convertEPTToString(eDataType, instanceValue);
      case FixrepositoryPackage.EXPRESSION_TYPE:
        return convertExpressionTypeToString(eDataType, instanceValue);
      case FixrepositoryPackage.GROUP_NAME_T:
        return convertGroupNameTToString(eDataType, instanceValue);
      case FixrepositoryPackage.ID_T:
        return convertIdTToString(eDataType, instanceValue);
      case FixrepositoryPackage.INCLUDE_FILE_TOBJECT:
        return convertIncludeFileTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.LANGUAGE_T:
        return convertLanguageTToString(eDataType, instanceValue);
      case FixrepositoryPackage.MEMBER_TYPE_OBJECT:
        return convertMemberTypeObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.MIME_T:
        return convertMimeTToString(eDataType, instanceValue);
      case FixrepositoryPackage.MSG_TYPE_T:
        return convertMsgTypeTToString(eDataType, instanceValue);
      case FixrepositoryPackage.NAME_T:
        return convertNameTToString(eDataType, instanceValue);
      case FixrepositoryPackage.PRESENCE_TOBJECT:
        return convertPresenceTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.PURPOSE_ENUM_OBJECT:
        return convertPurposeEnumObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.PURPOSE_T:
        return convertPurposeTToString(eDataType, instanceValue);
      case FixrepositoryPackage.RELIABILITY_TOBJECT:
        return convertReliabilityTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.SCENARIO_T:
        return convertScenarioTToString(eDataType, instanceValue);
      case FixrepositoryPackage.SORT_T:
        return convertSortTToString(eDataType, instanceValue);
      case FixrepositoryPackage.SUPPORT_TYPE_OBJECT:
        return convertSupportTypeObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.SYNCHRONIZATION_OBJECT:
        return convertSynchronizationObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.TERM_T:
        return convertTermTToString(eDataType, instanceValue);
      case FixrepositoryPackage.TIMER_OPERATION_OBJECT:
        return convertTimerOperationObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.UNBOUNDED_INT_TYPE:
        return convertUnboundedIntTypeToString(eDataType, instanceValue);
      case FixrepositoryPackage.UNBOUNDED_OBJECT:
        return convertUnboundedObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.UNION_DATA_TYPE_TOBJECT:
        return convertUnionDataTypeTObjectToString(eDataType, instanceValue);
      case FixrepositoryPackage.USAGE_T:
        return convertUsageTToString(eDataType, instanceValue);
      case FixrepositoryPackage.VERSION_T:
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
  @Override
		public ActionType createActionType() {
    ActionTypeImpl actionType = new ActionTypeImpl();
    return actionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ActorsType createActorsType() {
    ActorsTypeImpl actorsType = new ActorsTypeImpl();
    return actorsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ActorType createActorType() {
    ActorTypeImpl actorType = new ActorTypeImpl();
    return actorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public Annotation createAnnotation() {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public Appinfo createAppinfo() {
    AppinfoImpl appinfo = new AppinfoImpl();
    return appinfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public BlockAssignmentType createBlockAssignmentType() {
    BlockAssignmentTypeImpl blockAssignmentType = new BlockAssignmentTypeImpl();
    return blockAssignmentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public CategoriesType createCategoriesType() {
    CategoriesTypeImpl categoriesType = new CategoriesTypeImpl();
    return categoriesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public CategoryType createCategoryType() {
    CategoryTypeImpl categoryType = new CategoryTypeImpl();
    return categoryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public CodeSetsType createCodeSetsType() {
    CodeSetsTypeImpl codeSetsType = new CodeSetsTypeImpl();
    return codeSetsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public CodeSetType createCodeSetType() {
    CodeSetTypeImpl codeSetType = new CodeSetTypeImpl();
    return codeSetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public CodeType createCodeType() {
    CodeTypeImpl codeType = new CodeTypeImpl();
    return codeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ComponentRefType createComponentRefType() {
    ComponentRefTypeImpl componentRefType = new ComponentRefTypeImpl();
    return componentRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ComponentsType createComponentsType() {
    ComponentsTypeImpl componentsType = new ComponentsTypeImpl();
    return componentsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ComponentType createComponentType() {
    ComponentTypeImpl componentType = new ComponentTypeImpl();
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ConceptsType createConceptsType() {
    ConceptsTypeImpl conceptsType = new ConceptsTypeImpl();
    return conceptsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ConceptType createConceptType() {
    ConceptTypeImpl conceptType = new ConceptTypeImpl();
    return conceptType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public DatatypesType createDatatypesType() {
    DatatypesTypeImpl datatypesType = new DatatypesTypeImpl();
    return datatypesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public DatatypeType createDatatypeType() {
    DatatypeTypeImpl datatypeType = new DatatypeTypeImpl();
    return datatypeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public Documentation createDocumentation() {
    DocumentationImpl documentation = new DocumentationImpl();
    return documentation;
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
		public FieldRefType createFieldRefType() {
    FieldRefTypeImpl fieldRefType = new FieldRefTypeImpl();
    return fieldRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public FieldRuleType createFieldRuleType() {
    FieldRuleTypeImpl fieldRuleType = new FieldRuleTypeImpl();
    return fieldRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public FieldsType createFieldsType() {
    FieldsTypeImpl fieldsType = new FieldsTypeImpl();
    return fieldsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public FieldType createFieldType() {
    FieldTypeImpl fieldType = new FieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public FlowType createFlowType() {
    FlowTypeImpl flowType = new FlowTypeImpl();
    return flowType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public GroupRefType createGroupRefType() {
    GroupRefTypeImpl groupRefType = new GroupRefTypeImpl();
    return groupRefType;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public GroupsType createGroupsType() {
    GroupsTypeImpl groupsType = new GroupsTypeImpl();
    return groupsType;
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public GroupType createGroupType() {
    GroupTypeImpl groupType = new GroupTypeImpl();
    return groupType;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public IdentifiersType createIdentifiersType() {
    IdentifiersTypeImpl identifiersType = new IdentifiersTypeImpl();
    return identifiersType;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public IdentifierType createIdentifierType() {
    IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
    return identifierType;
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public MappedDatatypeType createMappedDatatypeType() {
    MappedDatatypeTypeImpl mappedDatatypeType = new MappedDatatypeTypeImpl();
    return mappedDatatypeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public MessageRefType createMessageRefType() {
    MessageRefTypeImpl messageRefType = new MessageRefTypeImpl();
    return messageRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public MessagesType createMessagesType() {
    MessagesTypeImpl messagesType = new MessagesTypeImpl();
    return messagesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public MessageType createMessageType() {
    MessageTypeImpl messageType = new MessageTypeImpl();
    return messageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public RepositoryType createRepositoryType() {
    RepositoryTypeImpl repositoryType = new RepositoryTypeImpl();
    return repositoryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ResponsesType createResponsesType() {
    ResponsesTypeImpl responsesType = new ResponsesTypeImpl();
    return responsesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ResponseType createResponseType() {
    ResponseTypeImpl responseType = new ResponseTypeImpl();
    return responseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SectionsType createSectionsType() {
    SectionsTypeImpl sectionsType = new SectionsTypeImpl();
    return sectionsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SectionType createSectionType() {
    SectionTypeImpl sectionType = new SectionTypeImpl();
    return sectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public StateMachineType createStateMachineType() {
    StateMachineTypeImpl stateMachineType = new StateMachineTypeImpl();
    return stateMachineType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public StateType createStateType() {
    StateTypeImpl stateType = new StateTypeImpl();
    return stateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public StructureType createStructureType() {
    StructureTypeImpl structureType = new StructureTypeImpl();
    return structureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public TimerSchedule createTimerSchedule() {
    TimerScheduleImpl timerSchedule = new TimerScheduleImpl();
    return timerSchedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public TimerType createTimerType() {
    TimerTypeImpl timerType = new TimerTypeImpl();
    return timerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public TransitionType createTransitionType() {
    TransitionTypeImpl transitionType = new TransitionTypeImpl();
    return transitionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public TriggerType createTriggerType() {
    TriggerTypeImpl triggerType = new TriggerTypeImpl();
    return triggerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
    return createCatComponentTypeTFromString(FixrepositoryPackage.eINSTANCE.getCatComponentTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCatComponentTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCatComponentTypeTToString(FixrepositoryPackage.eINSTANCE.getCatComponentTypeT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryComponentTypeT createCategoryComponentTypeTObjectFromString(EDataType eDataType, String initialValue) {
    return createCategoryComponentTypeTFromString(FixrepositoryPackage.eINSTANCE.getCategoryComponentTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCategoryComponentTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCategoryComponentTypeTToString(FixrepositoryPackage.eINSTANCE.getCategoryComponentTypeT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatIncludeFileT createCatIncludeFileTObjectFromString(EDataType eDataType, String initialValue) {
    return createCatIncludeFileTFromString(FixrepositoryPackage.eINSTANCE.getCatIncludeFileT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCatIncludeFileTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertCatIncludeFileTToString(FixrepositoryPackage.eINSTANCE.getCatIncludeFileT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeTypeT createChangeTypeTObjectFromString(EDataType eDataType, String initialValue) {
    return createChangeTypeTFromString(FixrepositoryPackage.eINSTANCE.getChangeTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChangeTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertChangeTypeTToString(FixrepositoryPackage.eINSTANCE.getChangeTypeT(), instanceValue);
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
    return createNameTFromString(FixrepositoryPackage.eINSTANCE.getNameT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComponentNameTToString(EDataType eDataType, Object instanceValue) {
    return convertNameTToString(FixrepositoryPackage.eINSTANCE.getNameT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeStandardEnum createDatatypeStandardEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createDatatypeStandardEnumFromString(FixrepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDatatypeStandardEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertDatatypeStandardEnumToString(FixrepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), instanceValue);
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
      result = createDatatypeStandardEnumFromString(FixrepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), initialValue);
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
    if (FixrepositoryPackage.eINSTANCE.getDatatypeStandardEnum().isInstance(instanceValue)) {
      try {
        String value = convertDatatypeStandardEnumToString(FixrepositoryPackage.eINSTANCE.getDatatypeStandardEnum(), instanceValue);
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
    return createIncludeFileTFromString(FixrepositoryPackage.eINSTANCE.getIncludeFileT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIncludeFileTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertIncludeFileTToString(FixrepositoryPackage.eINSTANCE.getIncludeFileT(), instanceValue);
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
    return createMemberTypeFromString(FixrepositoryPackage.eINSTANCE.getMemberType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMemberTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertMemberTypeToString(FixrepositoryPackage.eINSTANCE.getMemberType(), instanceValue);
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
    return createPresenceTFromString(FixrepositoryPackage.eINSTANCE.getPresenceT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPresenceTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertPresenceTToString(FixrepositoryPackage.eINSTANCE.getPresenceT(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurposeEnum createPurposeEnumObjectFromString(EDataType eDataType, String initialValue) {
    return createPurposeEnumFromString(FixrepositoryPackage.eINSTANCE.getPurposeEnum(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPurposeEnumObjectToString(EDataType eDataType, Object instanceValue) {
    return convertPurposeEnumToString(FixrepositoryPackage.eINSTANCE.getPurposeEnum(), instanceValue);
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
      result = createPurposeEnumFromString(FixrepositoryPackage.eINSTANCE.getPurposeEnum(), initialValue);
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
    if (FixrepositoryPackage.eINSTANCE.getPurposeEnum().isInstance(instanceValue)) {
      try {
        String value = convertPurposeEnumToString(FixrepositoryPackage.eINSTANCE.getPurposeEnum(), instanceValue);
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
    return createReliabilityTFromString(FixrepositoryPackage.eINSTANCE.getReliabilityT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertReliabilityTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertReliabilityTToString(FixrepositoryPackage.eINSTANCE.getReliabilityT(), instanceValue);
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
    return createSupportTypeFromString(FixrepositoryPackage.eINSTANCE.getSupportType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSupportTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertSupportTypeToString(FixrepositoryPackage.eINSTANCE.getSupportType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Synchronization createSynchronizationObjectFromString(EDataType eDataType, String initialValue) {
    return createSynchronizationFromString(FixrepositoryPackage.eINSTANCE.getSynchronization(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSynchronizationObjectToString(EDataType eDataType, Object instanceValue) {
    return convertSynchronizationToString(FixrepositoryPackage.eINSTANCE.getSynchronization(), instanceValue);
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
    return createTimerOperationFromString(FixrepositoryPackage.eINSTANCE.getTimerOperation(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimerOperationObjectToString(EDataType eDataType, Object instanceValue) {
    return convertTimerOperationToString(FixrepositoryPackage.eINSTANCE.getTimerOperation(), instanceValue);
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
      result = createUnboundedFromString(FixrepositoryPackage.eINSTANCE.getUnbounded(), initialValue);
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
    if (FixrepositoryPackage.eINSTANCE.getUnbounded().isInstance(instanceValue)) {
      try {
        String value = convertUnboundedToString(FixrepositoryPackage.eINSTANCE.getUnbounded(), instanceValue);
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
    return createUnboundedFromString(FixrepositoryPackage.eINSTANCE.getUnbounded(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnboundedObjectToString(EDataType eDataType, Object instanceValue) {
    return convertUnboundedToString(FixrepositoryPackage.eINSTANCE.getUnbounded(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionDataTypeT createUnionDataTypeTObjectFromString(EDataType eDataType, String initialValue) {
    return createUnionDataTypeTFromString(FixrepositoryPackage.eINSTANCE.getUnionDataTypeT(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnionDataTypeTObjectToString(EDataType eDataType, Object instanceValue) {
    return convertUnionDataTypeTToString(FixrepositoryPackage.eINSTANCE.getUnionDataTypeT(), instanceValue);
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
  @Override
		public FixrepositoryPackage getFixrepositoryPackage() {
    return (FixrepositoryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FixrepositoryPackage getPackage() {
    return FixrepositoryPackage.eINSTANCE;
  }

} //FixrepositoryFactoryImpl
