/**
 */
package io.fixprotocol._2020.orchestra.repository.util;

import io.fixprotocol._2020.orchestra.repository.*;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage
 * @generated
 */
public class RepositoryValidator extends EObjectValidator {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final RepositoryValidator INSTANCE = new RepositoryValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "io.fixprotocol._2020.orchestra.repository";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryValidator() {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage() {
    return RepositoryPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID) {
      case RepositoryPackage.ACTION_TYPE:
        return validateActionType((ActionType)value, diagnostics, context);
      case RepositoryPackage.ACTORS_TYPE:
        return validateActorsType((ActorsType)value, diagnostics, context);
      case RepositoryPackage.ACTOR_TYPE:
        return validateActorType((ActorType)value, diagnostics, context);
      case RepositoryPackage.ANNOTATION:
        return validateAnnotation((Annotation)value, diagnostics, context);
      case RepositoryPackage.APPINFO:
        return validateAppinfo((Appinfo)value, diagnostics, context);
      case RepositoryPackage.BLOCK_ASSIGNMENT_TYPE:
        return validateBlockAssignmentType((BlockAssignmentType)value, diagnostics, context);
      case RepositoryPackage.CATEGORIES_TYPE:
        return validateCategoriesType((CategoriesType)value, diagnostics, context);
      case RepositoryPackage.CATEGORY_TYPE:
        return validateCategoryType((CategoryType)value, diagnostics, context);
      case RepositoryPackage.CODE_SETS_TYPE:
        return validateCodeSetsType((CodeSetsType)value, diagnostics, context);
      case RepositoryPackage.CODE_SET_TYPE:
        return validateCodeSetType((CodeSetType)value, diagnostics, context);
      case RepositoryPackage.CODE_TYPE:
        return validateCodeType((CodeType)value, diagnostics, context);
      case RepositoryPackage.COMPONENT_REF_TYPE:
        return validateComponentRefType((ComponentRefType)value, diagnostics, context);
      case RepositoryPackage.COMPONENT_RULE_TYPE:
        return validateComponentRuleType((ComponentRuleType)value, diagnostics, context);
      case RepositoryPackage.COMPONENTS_TYPE:
        return validateComponentsType((ComponentsType)value, diagnostics, context);
      case RepositoryPackage.COMPONENT_TYPE:
        return validateComponentType((ComponentType)value, diagnostics, context);
      case RepositoryPackage.CONCEPTS_TYPE:
        return validateConceptsType((ConceptsType)value, diagnostics, context);
      case RepositoryPackage.CONCEPT_TYPE:
        return validateConceptType((ConceptType)value, diagnostics, context);
      case RepositoryPackage.DATATYPES_TYPE:
        return validateDatatypesType((DatatypesType)value, diagnostics, context);
      case RepositoryPackage.DATATYPE_TYPE:
        return validateDatatypeType((DatatypeType)value, diagnostics, context);
      case RepositoryPackage.DOCUMENTATION:
        return validateDocumentation((Documentation)value, diagnostics, context);
      case RepositoryPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case RepositoryPackage.EXTENSION_TYPE:
        return validateExtensionType((ExtensionType)value, diagnostics, context);
      case RepositoryPackage.FIELD_REF_TYPE:
        return validateFieldRefType((FieldRefType)value, diagnostics, context);
      case RepositoryPackage.FIELD_RULE_TYPE:
        return validateFieldRuleType((FieldRuleType)value, diagnostics, context);
      case RepositoryPackage.FIELDS_TYPE:
        return validateFieldsType((FieldsType)value, diagnostics, context);
      case RepositoryPackage.FIELD_TYPE:
        return validateFieldType((FieldType)value, diagnostics, context);
      case RepositoryPackage.FLOW_TYPE:
        return validateFlowType((FlowType)value, diagnostics, context);
      case RepositoryPackage.GROUP_REF_TYPE:
        return validateGroupRefType((GroupRefType)value, diagnostics, context);
      case RepositoryPackage.GROUPS_TYPE:
        return validateGroupsType((GroupsType)value, diagnostics, context);
      case RepositoryPackage.GROUP_TYPE:
        return validateGroupType((GroupType)value, diagnostics, context);
      case RepositoryPackage.IDENTIFIERS_TYPE:
        return validateIdentifiersType((IdentifiersType)value, diagnostics, context);
      case RepositoryPackage.IDENTIFIER_TYPE:
        return validateIdentifierType((IdentifierType)value, diagnostics, context);
      case RepositoryPackage.MAPPED_DATATYPE:
        return validateMappedDatatype((MappedDatatype)value, diagnostics, context);
      case RepositoryPackage.MESSAGE_REF_TYPE:
        return validateMessageRefType((MessageRefType)value, diagnostics, context);
      case RepositoryPackage.MESSAGES_TYPE:
        return validateMessagesType((MessagesType)value, diagnostics, context);
      case RepositoryPackage.MESSAGE_TYPE:
        return validateMessageType((MessageType)value, diagnostics, context);
      case RepositoryPackage.REPOSITORY_TYPE:
        return validateRepositoryType((RepositoryType)value, diagnostics, context);
      case RepositoryPackage.RESPONSES_TYPE:
        return validateResponsesType((ResponsesType)value, diagnostics, context);
      case RepositoryPackage.RESPONSE_TYPE:
        return validateResponseType((ResponseType)value, diagnostics, context);
      case RepositoryPackage.SECTIONS_TYPE:
        return validateSectionsType((SectionsType)value, diagnostics, context);
      case RepositoryPackage.SECTION_TYPE:
        return validateSectionType((SectionType)value, diagnostics, context);
      case RepositoryPackage.STATE_MACHINE_TYPE:
        return validateStateMachineType((StateMachineType)value, diagnostics, context);
      case RepositoryPackage.STATE_TYPE:
        return validateStateType((StateType)value, diagnostics, context);
      case RepositoryPackage.STRUCTURE_TYPE:
        return validateStructureType((StructureType)value, diagnostics, context);
      case RepositoryPackage.TIMER_SCHEDULE:
        return validateTimerSchedule((TimerSchedule)value, diagnostics, context);
      case RepositoryPackage.TIMER_TYPE:
        return validateTimerType((TimerType)value, diagnostics, context);
      case RepositoryPackage.TRANSITION_TYPE:
        return validateTransitionType((TransitionType)value, diagnostics, context);
      case RepositoryPackage.TRIGGER_TYPE:
        return validateTriggerType((TriggerType)value, diagnostics, context);
      case RepositoryPackage.UNIQUE_TYPE:
        return validateUniqueType((UniqueType)value, diagnostics, context);
      case RepositoryPackage.CAT_COMPONENT_TYPE_T:
        return validateCatComponentTypeT((CatComponentTypeT)value, diagnostics, context);
      case RepositoryPackage.CATEGORY_COMPONENT_TYPE_T:
        return validateCategoryComponentTypeT((CategoryComponentTypeT)value, diagnostics, context);
      case RepositoryPackage.CAT_INCLUDE_FILE_T:
        return validateCatIncludeFileT((CatIncludeFileT)value, diagnostics, context);
      case RepositoryPackage.CHANGE_TYPE_T:
        return validateChangeTypeT((ChangeTypeT)value, diagnostics, context);
      case RepositoryPackage.DATATYPE_STANDARD_ENUM:
        return validateDatatypeStandardEnum((DatatypeStandardEnum)value, diagnostics, context);
      case RepositoryPackage.INCLUDE_FILE_T:
        return validateIncludeFileT((IncludeFileT)value, diagnostics, context);
      case RepositoryPackage.MEMBER_TYPE:
        return validateMemberType((MemberType)value, diagnostics, context);
      case RepositoryPackage.PRESENCE_T:
        return validatePresenceT((PresenceT)value, diagnostics, context);
      case RepositoryPackage.PURPOSE_ENUM:
        return validatePurposeEnum((PurposeEnum)value, diagnostics, context);
      case RepositoryPackage.RELIABILITY_T:
        return validateReliabilityT((ReliabilityT)value, diagnostics, context);
      case RepositoryPackage.SUPPORT_TYPE:
        return validateSupportType((SupportType)value, diagnostics, context);
      case RepositoryPackage.SYNCHRONIZATION:
        return validateSynchronization((Synchronization)value, diagnostics, context);
      case RepositoryPackage.TIMER_OPERATION:
        return validateTimerOperation((TimerOperation)value, diagnostics, context);
      case RepositoryPackage.UNBOUNDED:
        return validateUnbounded((Unbounded)value, diagnostics, context);
      case RepositoryPackage.UNION_DATA_TYPE_T:
        return validateUnionDataTypeT((UnionDataTypeT)value, diagnostics, context);
      case RepositoryPackage.ABBREVIATION_T:
        return validateAbbreviationT((String)value, diagnostics, context);
      case RepositoryPackage.CAT_COMPONENT_TYPE_TOBJECT:
        return validateCatComponentTypeTObject((CatComponentTypeT)value, diagnostics, context);
      case RepositoryPackage.CATEGORY_COMPONENT_TYPE_TOBJECT:
        return validateCategoryComponentTypeTObject((CategoryComponentTypeT)value, diagnostics, context);
      case RepositoryPackage.CAT_INCLUDE_FILE_TOBJECT:
        return validateCatIncludeFileTObject((CatIncludeFileT)value, diagnostics, context);
      case RepositoryPackage.CHANGE_TYPE_TOBJECT:
        return validateChangeTypeTObject((ChangeTypeT)value, diagnostics, context);
      case RepositoryPackage.COMP_IDT:
        return validateCompIDT((BigInteger)value, diagnostics, context);
      case RepositoryPackage.COMPONENT_NAME_T:
        return validateComponentNameT((String)value, diagnostics, context);
      case RepositoryPackage.DATATYPE_STANDARD_ENUM_OBJECT:
        return validateDatatypeStandardEnumObject((DatatypeStandardEnum)value, diagnostics, context);
      case RepositoryPackage.DATATYPE_STANDARD_T:
        return validateDatatypeStandardT(value, diagnostics, context);
      case RepositoryPackage.EDITION_T:
        return validateEditionT((String)value, diagnostics, context);
      case RepositoryPackage.EPT:
        return validateEPT((BigInteger)value, diagnostics, context);
      case RepositoryPackage.EXPRESSION_TYPE:
        return validateExpressionType((String)value, diagnostics, context);
      case RepositoryPackage.GROUP_NAME_T:
        return validateGroupNameT((String)value, diagnostics, context);
      case RepositoryPackage.ID_T:
        return validateIdT((BigInteger)value, diagnostics, context);
      case RepositoryPackage.INCLUDE_FILE_TOBJECT:
        return validateIncludeFileTObject((IncludeFileT)value, diagnostics, context);
      case RepositoryPackage.LANGUAGE_T:
        return validateLanguageT((String)value, diagnostics, context);
      case RepositoryPackage.MEMBER_TYPE_OBJECT:
        return validateMemberTypeObject((MemberType)value, diagnostics, context);
      case RepositoryPackage.MIME_T:
        return validateMimeT((String)value, diagnostics, context);
      case RepositoryPackage.MSG_TYPE_T:
        return validateMsgTypeT((String)value, diagnostics, context);
      case RepositoryPackage.NAME_T:
        return validateNameT((String)value, diagnostics, context);
      case RepositoryPackage.PRESENCE_TOBJECT:
        return validatePresenceTObject((PresenceT)value, diagnostics, context);
      case RepositoryPackage.PURPOSE_ENUM_OBJECT:
        return validatePurposeEnumObject((PurposeEnum)value, diagnostics, context);
      case RepositoryPackage.PURPOSE_T:
        return validatePurposeT(value, diagnostics, context);
      case RepositoryPackage.RELIABILITY_TOBJECT:
        return validateReliabilityTObject((ReliabilityT)value, diagnostics, context);
      case RepositoryPackage.SCENARIO_T:
        return validateScenarioT((String)value, diagnostics, context);
      case RepositoryPackage.SORT_T:
        return validateSortT((BigInteger)value, diagnostics, context);
      case RepositoryPackage.SUPPORT_TYPE_OBJECT:
        return validateSupportTypeObject((SupportType)value, diagnostics, context);
      case RepositoryPackage.SYNCHRONIZATION_OBJECT:
        return validateSynchronizationObject((Synchronization)value, diagnostics, context);
      case RepositoryPackage.TERM_T:
        return validateTermT((String)value, diagnostics, context);
      case RepositoryPackage.TIMER_OPERATION_OBJECT:
        return validateTimerOperationObject((TimerOperation)value, diagnostics, context);
      case RepositoryPackage.UNBOUNDED_INT_TYPE:
        return validateUnboundedIntType(value, diagnostics, context);
      case RepositoryPackage.UNBOUNDED_OBJECT:
        return validateUnboundedObject((Unbounded)value, diagnostics, context);
      case RepositoryPackage.UNION_DATA_TYPE_TOBJECT:
        return validateUnionDataTypeTObject((UnionDataTypeT)value, diagnostics, context);
      case RepositoryPackage.USAGE_T:
        return validateUsageT((String)value, diagnostics, context);
      case RepositoryPackage.VERSION_T:
        return validateVersionT((String)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(actionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActorsType(ActorsType actorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(actorsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActorType(ActorType actorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(actorType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(annotation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAppinfo(Appinfo appinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(appinfo, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBlockAssignmentType(BlockAssignmentType blockAssignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(blockAssignmentType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCategoriesType(CategoriesType categoriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(categoriesType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCategoryType(CategoryType categoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(categoryType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCodeSetsType(CodeSetsType codeSetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(codeSetsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCodeSetType(CodeSetType codeSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(codeSetType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCodeType(CodeType codeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(codeType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComponentRefType(ComponentRefType componentRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(componentRefType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComponentRuleType(ComponentRuleType componentRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(componentRuleType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComponentsType(ComponentsType componentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(componentsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(componentType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConceptsType(ConceptsType conceptsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(conceptsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConceptType(ConceptType conceptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(conceptType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDatatypesType(DatatypesType datatypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(datatypesType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDatatypeType(DatatypeType datatypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(datatypeType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(documentation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExtensionType(ExtensionType extensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(extensionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFieldRefType(FieldRefType fieldRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fieldRefType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFieldRuleType(FieldRuleType fieldRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fieldRuleType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFieldsType(FieldsType fieldsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fieldsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFieldType(FieldType fieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(fieldType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFlowType(FlowType flowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(flowType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupRefType(GroupRefType groupRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(groupRefType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupsType(GroupsType groupsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(groupsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(groupType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIdentifiersType(IdentifiersType identifiersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(identifiersType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIdentifierType(IdentifierType identifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(identifierType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMappedDatatype(MappedDatatype mappedDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(mappedDatatype, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMessageRefType(MessageRefType messageRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(messageRefType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMessagesType(MessagesType messagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(messagesType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMessageType(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(messageType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRepositoryType(RepositoryType repositoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(repositoryType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResponsesType(ResponsesType responsesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(responsesType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResponseType(ResponseType responseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(responseType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSectionsType(SectionsType sectionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sectionsType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSectionType(SectionType sectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(sectionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStateMachineType(StateMachineType stateMachineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stateMachineType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStateType(StateType stateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(stateType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStructureType(StructureType structureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(structureType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimerSchedule(TimerSchedule timerSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(timerSchedule, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimerType(TimerType timerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(timerType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransitionType(TransitionType transitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(transitionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTriggerType(TriggerType triggerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(triggerType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUniqueType(UniqueType uniqueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validate_EveryDefaultConstraint(uniqueType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCatComponentTypeT(CatComponentTypeT catComponentTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCategoryComponentTypeT(CategoryComponentTypeT categoryComponentTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCatIncludeFileT(CatIncludeFileT catIncludeFileT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChangeTypeT(ChangeTypeT changeTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDatatypeStandardEnum(DatatypeStandardEnum datatypeStandardEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIncludeFileT(IncludeFileT includeFileT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMemberType(MemberType memberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePresenceT(PresenceT presenceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePurposeEnum(PurposeEnum purposeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReliabilityT(ReliabilityT reliabilityT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSupportType(SupportType supportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSynchronization(Synchronization synchronization, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimerOperation(TimerOperation timerOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUnbounded(Unbounded unbounded, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUnionDataTypeT(UnionDataTypeT unionDataTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbbreviationT(String abbreviationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCatComponentTypeTObject(CatComponentTypeT catComponentTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCategoryComponentTypeTObject(CategoryComponentTypeT categoryComponentTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCatIncludeFileTObject(CatIncludeFileT catIncludeFileTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChangeTypeTObject(ChangeTypeT changeTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCompIDT(BigInteger compIDT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateCompIDT_Min(compIDT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateCompIDT_Min
   */
  public static final BigInteger COMP_IDT__MIN__VALUE = new BigInteger("1000");

  /**
   * Validates the Min constraint of '<em>Comp IDT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCompIDT_Min(BigInteger compIDT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = compIDT.compareTo(COMP_IDT__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(RepositoryPackage.eINSTANCE.getCompIDT(), compIDT, COMP_IDT__MIN__VALUE, true, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComponentNameT(String componentNameT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateNameT_Pattern(componentNameT, diagnostics, context);
    if (result || diagnostics != null) result &= validateNameT_MinLength(componentNameT, diagnostics, context);
    if (result || diagnostics != null) result &= validateNameT_MaxLength(componentNameT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDatatypeStandardEnumObject(DatatypeStandardEnum datatypeStandardEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDatatypeStandardT(Object datatypeStandardT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateDatatypeStandardT_MemberTypes(datatypeStandardT, diagnostics, context);
    return result;
  }

  /**
   * Validates the MemberTypes constraint of '<em>Datatype Standard T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDatatypeStandardT_MemberTypes(Object datatypeStandardT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (diagnostics != null) {
      BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
      if (RepositoryPackage.eINSTANCE.getDatatypeStandardEnum().isInstance(datatypeStandardT)) {
        if (validateDatatypeStandardEnum((DatatypeStandardEnum)datatypeStandardT, tempDiagnostics, context)) return true;
      }
      if (XMLTypePackage.Literals.STRING.isInstance(datatypeStandardT)) {
        if (xmlTypeValidator.validateString((String)datatypeStandardT, tempDiagnostics, context)) return true;
      }
      for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
        diagnostics.add(diagnostic);
      }
    }
    else {
      if (RepositoryPackage.eINSTANCE.getDatatypeStandardEnum().isInstance(datatypeStandardT)) {
        if (validateDatatypeStandardEnum((DatatypeStandardEnum)datatypeStandardT, null, context)) return true;
      }
      if (XMLTypePackage.Literals.STRING.isInstance(datatypeStandardT)) {
        if (xmlTypeValidator.validateString((String)datatypeStandardT, null, context)) return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEditionT(String editionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateEditionT_MaxLength(editionT, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>Edition T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEditionT_MaxLength(String editionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = editionT.length();
    boolean result = length <= 8;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(RepositoryPackage.eINSTANCE.getEditionT(), editionT, length, 8, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEPT(BigInteger ept, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExpressionType(String expressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateExpressionType_MaxLength(expressionType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>Expression Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExpressionType_MaxLength(String expressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = expressionType.length();
    boolean result = length <= 1024;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(RepositoryPackage.eINSTANCE.getExpressionType(), expressionType, length, 1024, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupNameT(String groupNameT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIdT(BigInteger idT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validatePositiveInteger_Min(idT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIncludeFileTObject(IncludeFileT includeFileTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLanguageT(String languageT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateLanguage_Pattern(languageT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMemberTypeObject(MemberType memberTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMimeT(String mimeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateMimeT_MinLength(mimeT, diagnostics, context);
    return result;
  }

  /**
   * Validates the MinLength constraint of '<em>Mime T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMimeT_MinLength(String mimeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = mimeT.length();
    boolean result = length >= 3;
    if (!result && diagnostics != null)
      reportMinLengthViolation(RepositoryPackage.eINSTANCE.getMimeT(), mimeT, length, 3, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMsgTypeT(String msgTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateMsgTypeT_MinLength(msgTypeT, diagnostics, context);
    if (result || diagnostics != null) result &= validateMsgTypeT_MaxLength(msgTypeT, diagnostics, context);
    return result;
  }

  /**
   * Validates the MinLength constraint of '<em>Msg Type T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMsgTypeT_MinLength(String msgTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = msgTypeT.length();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(RepositoryPackage.eINSTANCE.getMsgTypeT(), msgTypeT, length, 1, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>Msg Type T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMsgTypeT_MaxLength(String msgTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = msgTypeT.length();
    boolean result = length <= 2;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(RepositoryPackage.eINSTANCE.getMsgTypeT(), msgTypeT, length, 2, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNameT(String nameT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateNameT_Pattern(nameT, diagnostics, context);
    if (result || diagnostics != null) result &= validateNameT_MinLength(nameT, diagnostics, context);
    if (result || diagnostics != null) result &= validateNameT_MaxLength(nameT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateNameT_Pattern
   */
  public static final  PatternMatcher [][] NAME_T__PATTERN__VALUES =
    new PatternMatcher [][] {
      new PatternMatcher [] {
        XMLTypeUtil.createPatternMatcher("([A-Z]|[a-z])([0-9]|[A-Z]|[a-z]|_)*")
      }
    };

  /**
   * Validates the Pattern constraint of '<em>Name T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNameT_Pattern(String nameT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validatePattern(RepositoryPackage.eINSTANCE.getNameT(), nameT, NAME_T__PATTERN__VALUES, diagnostics, context);
  }

  /**
   * Validates the MinLength constraint of '<em>Name T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNameT_MinLength(String nameT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = nameT.length();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(RepositoryPackage.eINSTANCE.getNameT(), nameT, length, 1, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>Name T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNameT_MaxLength(String nameT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = nameT.length();
    boolean result = length <= 255;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(RepositoryPackage.eINSTANCE.getNameT(), nameT, length, 255, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePresenceTObject(PresenceT presenceTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePurposeEnumObject(PurposeEnum purposeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePurposeT(Object purposeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validatePurposeT_MemberTypes(purposeT, diagnostics, context);
    return result;
  }

  /**
   * Validates the MemberTypes constraint of '<em>Purpose T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePurposeT_MemberTypes(Object purposeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (diagnostics != null) {
      BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
      if (RepositoryPackage.eINSTANCE.getPurposeEnum().isInstance(purposeT)) {
        if (validatePurposeEnum((PurposeEnum)purposeT, tempDiagnostics, context)) return true;
      }
      if (XMLTypePackage.Literals.STRING.isInstance(purposeT)) {
        if (xmlTypeValidator.validateString((String)purposeT, tempDiagnostics, context)) return true;
      }
      for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
        diagnostics.add(diagnostic);
      }
    }
    else {
      if (RepositoryPackage.eINSTANCE.getPurposeEnum().isInstance(purposeT)) {
        if (validatePurposeEnum((PurposeEnum)purposeT, null, context)) return true;
      }
      if (XMLTypePackage.Literals.STRING.isInstance(purposeT)) {
        if (xmlTypeValidator.validateString((String)purposeT, null, context)) return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReliabilityTObject(ReliabilityT reliabilityTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateScenarioT(String scenarioT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateScenarioT_Pattern(scenarioT, diagnostics, context);
    if (result || diagnostics != null) result &= validateScenarioT_MinLength(scenarioT, diagnostics, context);
    if (result || diagnostics != null) result &= validateScenarioT_MaxLength(scenarioT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateScenarioT_Pattern
   */
  public static final  PatternMatcher [][] SCENARIO_T__PATTERN__VALUES =
    new PatternMatcher [][] {
      new PatternMatcher [] {
        XMLTypeUtil.createPatternMatcher("([A-Z]|[a-z])([0-9]|[A-Z]|[a-z]|_|-)*")
      }
    };

  /**
   * Validates the Pattern constraint of '<em>Scenario T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateScenarioT_Pattern(String scenarioT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validatePattern(RepositoryPackage.eINSTANCE.getScenarioT(), scenarioT, SCENARIO_T__PATTERN__VALUES, diagnostics, context);
  }

  /**
   * Validates the MinLength constraint of '<em>Scenario T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateScenarioT_MinLength(String scenarioT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = scenarioT.length();
    boolean result = length >= 1;
    if (!result && diagnostics != null)
      reportMinLengthViolation(RepositoryPackage.eINSTANCE.getScenarioT(), scenarioT, length, 1, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>Scenario T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateScenarioT_MaxLength(String scenarioT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    int length = scenarioT.length();
    boolean result = length <= 255;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(RepositoryPackage.eINSTANCE.getScenarioT(), scenarioT, length, 255, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSortT(BigInteger sortT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(sortT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSupportTypeObject(SupportType supportTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSynchronizationObject(Synchronization synchronizationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTermT(String termT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimerOperationObject(TimerOperation timerOperationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUnboundedIntType(Object unboundedIntType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateUnboundedIntType_MemberTypes(unboundedIntType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MemberTypes constraint of '<em>Unbounded Int Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUnboundedIntType_MemberTypes(Object unboundedIntType, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (diagnostics != null) {
      BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
      if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(unboundedIntType)) {
        if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)unboundedIntType, tempDiagnostics, context)) return true;
      }
      if (RepositoryPackage.eINSTANCE.getUnbounded().isInstance(unboundedIntType)) {
        if (validateUnbounded((Unbounded)unboundedIntType, tempDiagnostics, context)) return true;
      }
      for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
        diagnostics.add(diagnostic);
      }
    }
    else {
      if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(unboundedIntType)) {
        if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)unboundedIntType, null, context)) return true;
      }
      if (RepositoryPackage.eINSTANCE.getUnbounded().isInstance(unboundedIntType)) {
        if (validateUnbounded((Unbounded)unboundedIntType, null, context)) return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUnboundedObject(Unbounded unboundedObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUnionDataTypeTObject(UnionDataTypeT unionDataTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUsageT(String usageT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVersionT(String versionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    boolean result = validateVersionT_Pattern(versionT, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateVersionT_Pattern
   */
  public static final  PatternMatcher [][] VERSION_T__PATTERN__VALUES =
    new PatternMatcher [][] {
      new PatternMatcher [] {
        XMLTypeUtil.createPatternMatcher("(FIX.2.7)|(FIX.3.0)|(FIX\\.4\\.[0-4])|((FIX.Latest|(FIX\\.5\\.0(SP\\d{1,2})?))(_EP((9[8-9])|([1-9][0-9][0-9])))?)|(FIXT.1.1)|([0-9]+)\\.([0-9]+)|(\\d{8})")
      }
    };

  /**
   * Validates the Pattern constraint of '<em>Version T</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVersionT_Pattern(String versionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return validatePattern(RepositoryPackage.eINSTANCE.getVersionT(), versionT, VERSION_T__PATTERN__VALUES, diagnostics, context);
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //RepositoryValidator
