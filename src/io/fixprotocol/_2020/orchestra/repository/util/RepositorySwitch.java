/**
 */
package io.fixprotocol._2020.orchestra.repository.util;

import io.fixprotocol._2020.orchestra.repository.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage
 * @generated
 */
public class RepositorySwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RepositoryPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositorySwitch() {
    if (modelPackage == null) {
      modelPackage = RepositoryPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case RepositoryPackage.ACTION_TYPE: {
        ActionType actionType = (ActionType)theEObject;
        T result = caseActionType(actionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.ACTORS_TYPE: {
        ActorsType actorsType = (ActorsType)theEObject;
        T result = caseActorsType(actorsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.ACTOR_TYPE: {
        ActorType actorType = (ActorType)theEObject;
        T result = caseActorType(actorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.ANNOTATION: {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.APPINFO: {
        Appinfo appinfo = (Appinfo)theEObject;
        T result = caseAppinfo(appinfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.BLOCK_ASSIGNMENT_TYPE: {
        BlockAssignmentType blockAssignmentType = (BlockAssignmentType)theEObject;
        T result = caseBlockAssignmentType(blockAssignmentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.CATEGORIES_TYPE: {
        CategoriesType categoriesType = (CategoriesType)theEObject;
        T result = caseCategoriesType(categoriesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.CATEGORY_TYPE: {
        CategoryType categoryType = (CategoryType)theEObject;
        T result = caseCategoryType(categoryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.CODE_SETS_TYPE: {
        CodeSetsType codeSetsType = (CodeSetsType)theEObject;
        T result = caseCodeSetsType(codeSetsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.CODE_SET_TYPE: {
        CodeSetType codeSetType = (CodeSetType)theEObject;
        T result = caseCodeSetType(codeSetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.CODE_TYPE: {
        CodeType codeType = (CodeType)theEObject;
        T result = caseCodeType(codeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.COMPONENT_REF_TYPE: {
        ComponentRefType componentRefType = (ComponentRefType)theEObject;
        T result = caseComponentRefType(componentRefType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.COMPONENT_RULE_TYPE: {
        ComponentRuleType componentRuleType = (ComponentRuleType)theEObject;
        T result = caseComponentRuleType(componentRuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.COMPONENTS_TYPE: {
        ComponentsType componentsType = (ComponentsType)theEObject;
        T result = caseComponentsType(componentsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.COMPONENT_TYPE: {
        ComponentType componentType = (ComponentType)theEObject;
        T result = caseComponentType(componentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.CONCEPTS_TYPE: {
        ConceptsType conceptsType = (ConceptsType)theEObject;
        T result = caseConceptsType(conceptsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.CONCEPT_TYPE: {
        ConceptType conceptType = (ConceptType)theEObject;
        T result = caseConceptType(conceptType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.DATATYPES_TYPE: {
        DatatypesType datatypesType = (DatatypesType)theEObject;
        T result = caseDatatypesType(datatypesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.DATATYPE_TYPE: {
        DatatypeType datatypeType = (DatatypeType)theEObject;
        T result = caseDatatypeType(datatypeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.DOCUMENTATION: {
        Documentation documentation = (Documentation)theEObject;
        T result = caseDocumentation(documentation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.EXTENSION_TYPE: {
        ExtensionType extensionType = (ExtensionType)theEObject;
        T result = caseExtensionType(extensionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.FIELD_REF_TYPE: {
        FieldRefType fieldRefType = (FieldRefType)theEObject;
        T result = caseFieldRefType(fieldRefType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.FIELD_RULE_TYPE: {
        FieldRuleType fieldRuleType = (FieldRuleType)theEObject;
        T result = caseFieldRuleType(fieldRuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.FIELDS_TYPE: {
        FieldsType fieldsType = (FieldsType)theEObject;
        T result = caseFieldsType(fieldsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.FIELD_TYPE: {
        FieldType fieldType = (FieldType)theEObject;
        T result = caseFieldType(fieldType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.FLOW_TYPE: {
        FlowType flowType = (FlowType)theEObject;
        T result = caseFlowType(flowType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.GROUP_REF_TYPE: {
        GroupRefType groupRefType = (GroupRefType)theEObject;
        T result = caseGroupRefType(groupRefType);
        if (result == null) result = caseComponentRefType(groupRefType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.GROUPS_TYPE: {
        GroupsType groupsType = (GroupsType)theEObject;
        T result = caseGroupsType(groupsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.GROUP_TYPE: {
        GroupType groupType = (GroupType)theEObject;
        T result = caseGroupType(groupType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.IDENTIFIERS_TYPE: {
        IdentifiersType identifiersType = (IdentifiersType)theEObject;
        T result = caseIdentifiersType(identifiersType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.IDENTIFIER_TYPE: {
        IdentifierType identifierType = (IdentifierType)theEObject;
        T result = caseIdentifierType(identifierType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.MAPPED_DATATYPE: {
        MappedDatatype mappedDatatype = (MappedDatatype)theEObject;
        T result = caseMappedDatatype(mappedDatatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.MESSAGE_REF_TYPE: {
        MessageRefType messageRefType = (MessageRefType)theEObject;
        T result = caseMessageRefType(messageRefType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.MESSAGES_TYPE: {
        MessagesType messagesType = (MessagesType)theEObject;
        T result = caseMessagesType(messagesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.MESSAGE_TYPE: {
        MessageType messageType = (MessageType)theEObject;
        T result = caseMessageType(messageType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.REPOSITORY_TYPE: {
        RepositoryType repositoryType = (RepositoryType)theEObject;
        T result = caseRepositoryType(repositoryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.RESPONSES_TYPE: {
        ResponsesType responsesType = (ResponsesType)theEObject;
        T result = caseResponsesType(responsesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.RESPONSE_TYPE: {
        ResponseType responseType = (ResponseType)theEObject;
        T result = caseResponseType(responseType);
        if (result == null) result = caseActionType(responseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.SECTIONS_TYPE: {
        SectionsType sectionsType = (SectionsType)theEObject;
        T result = caseSectionsType(sectionsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.SECTION_TYPE: {
        SectionType sectionType = (SectionType)theEObject;
        T result = caseSectionType(sectionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.STATE_MACHINE_TYPE: {
        StateMachineType stateMachineType = (StateMachineType)theEObject;
        T result = caseStateMachineType(stateMachineType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.STATE_TYPE: {
        StateType stateType = (StateType)theEObject;
        T result = caseStateType(stateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.STRUCTURE_TYPE: {
        StructureType structureType = (StructureType)theEObject;
        T result = caseStructureType(structureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.TIMER_SCHEDULE: {
        TimerSchedule timerSchedule = (TimerSchedule)theEObject;
        T result = caseTimerSchedule(timerSchedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.TIMER_TYPE: {
        TimerType timerType = (TimerType)theEObject;
        T result = caseTimerType(timerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.TRANSITION_TYPE: {
        TransitionType transitionType = (TransitionType)theEObject;
        T result = caseTransitionType(transitionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.TRIGGER_TYPE: {
        TriggerType triggerType = (TriggerType)theEObject;
        T result = caseTriggerType(triggerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepositoryPackage.UNIQUE_TYPE: {
        UniqueType uniqueType = (UniqueType)theEObject;
        T result = caseUniqueType(uniqueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionType(ActionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actors Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actors Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorsType(ActorsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorType(ActorType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Appinfo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Appinfo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppinfo(Appinfo object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Assignment Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Assignment Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockAssignmentType(BlockAssignmentType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Categories Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Categories Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategoriesType(CategoriesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategoryType(CategoryType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Sets Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Sets Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeSetsType(CodeSetsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Set Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Set Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeSetType(CodeSetType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeType(CodeType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Ref Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Ref Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentRefType(ComponentRefType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Rule Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Rule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentRuleType(ComponentRuleType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Components Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Components Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentsType(ComponentsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentType(ComponentType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concepts Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concepts Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConceptsType(ConceptsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concept Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concept Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConceptType(ConceptType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatypes Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatypes Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypesType(DatatypesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypeType(DatatypeType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentation(Documentation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionType(ExtensionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Ref Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Ref Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldRefType(FieldRefType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Rule Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Rule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldRuleType(FieldRuleType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fields Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fields Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldsType(FieldsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldType(FieldType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowType(FlowType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Ref Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Ref Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupRefType(GroupRefType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Groups Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Groups Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupsType(GroupsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupType(GroupType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifiers Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifiers Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifiersType(IdentifiersType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifierType(IdentifierType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapped Datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapped Datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappedDatatype(MappedDatatype object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Ref Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Ref Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageRefType(MessageRefType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Messages Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Messages Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessagesType(MessagesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageType(MessageType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryType(RepositoryType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Responses Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Responses Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponsesType(ResponsesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Response Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Response Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponseType(ResponseType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sections Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sections Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionsType(SectionsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionType(SectionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Machine Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Machine Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateMachineType(StateMachineType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateType(StateType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureType(StructureType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timer Schedule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timer Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimerSchedule(TimerSchedule object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timer Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timer Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimerType(TimerType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionType(TransitionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggerType(TriggerType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unique Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unique Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniqueType(UniqueType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //RepositorySwitch
