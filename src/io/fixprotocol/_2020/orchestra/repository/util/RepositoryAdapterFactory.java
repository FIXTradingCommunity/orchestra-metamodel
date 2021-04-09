/**
 */
package io.fixprotocol._2020.orchestra.repository.util;

import io.fixprotocol._2020.orchestra.repository.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2020.orchestra.repository.RepositoryPackage
 * @generated
 */
public class RepositoryAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RepositoryPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = RepositoryPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositorySwitch<Adapter> modelSwitch =
    new RepositorySwitch<Adapter>() {
      @Override
      public Adapter caseActionType(ActionType object) {
        return createActionTypeAdapter();
      }
      @Override
      public Adapter caseActorsType(ActorsType object) {
        return createActorsTypeAdapter();
      }
      @Override
      public Adapter caseActorType(ActorType object) {
        return createActorTypeAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object) {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAppinfo(Appinfo object) {
        return createAppinfoAdapter();
      }
      @Override
      public Adapter caseBlockAssignmentType(BlockAssignmentType object) {
        return createBlockAssignmentTypeAdapter();
      }
      @Override
      public Adapter caseCategoriesType(CategoriesType object) {
        return createCategoriesTypeAdapter();
      }
      @Override
      public Adapter caseCategoryType(CategoryType object) {
        return createCategoryTypeAdapter();
      }
      @Override
      public Adapter caseCodeSetsType(CodeSetsType object) {
        return createCodeSetsTypeAdapter();
      }
      @Override
      public Adapter caseCodeSetType(CodeSetType object) {
        return createCodeSetTypeAdapter();
      }
      @Override
      public Adapter caseCodeType(CodeType object) {
        return createCodeTypeAdapter();
      }
      @Override
      public Adapter caseComponentRefType(ComponentRefType object) {
        return createComponentRefTypeAdapter();
      }
      @Override
      public Adapter caseComponentRuleType(ComponentRuleType object) {
        return createComponentRuleTypeAdapter();
      }
      @Override
      public Adapter caseComponentsType(ComponentsType object) {
        return createComponentsTypeAdapter();
      }
      @Override
      public Adapter caseComponentType(ComponentType object) {
        return createComponentTypeAdapter();
      }
      @Override
      public Adapter caseConceptsType(ConceptsType object) {
        return createConceptsTypeAdapter();
      }
      @Override
      public Adapter caseConceptType(ConceptType object) {
        return createConceptTypeAdapter();
      }
      @Override
      public Adapter caseDatatypesType(DatatypesType object) {
        return createDatatypesTypeAdapter();
      }
      @Override
      public Adapter caseDatatypeType(DatatypeType object) {
        return createDatatypeTypeAdapter();
      }
      @Override
      public Adapter caseDocumentation(Documentation object) {
        return createDocumentationAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object) {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseExtensionType(ExtensionType object) {
        return createExtensionTypeAdapter();
      }
      @Override
      public Adapter caseFieldRefType(FieldRefType object) {
        return createFieldRefTypeAdapter();
      }
      @Override
      public Adapter caseFieldRuleType(FieldRuleType object) {
        return createFieldRuleTypeAdapter();
      }
      @Override
      public Adapter caseFieldsType(FieldsType object) {
        return createFieldsTypeAdapter();
      }
      @Override
      public Adapter caseFieldType(FieldType object) {
        return createFieldTypeAdapter();
      }
      @Override
      public Adapter caseFlowType(FlowType object) {
        return createFlowTypeAdapter();
      }
      @Override
      public Adapter caseGroupRefType(GroupRefType object) {
        return createGroupRefTypeAdapter();
      }
      @Override
      public Adapter caseGroupsType(GroupsType object) {
        return createGroupsTypeAdapter();
      }
      @Override
      public Adapter caseGroupType(GroupType object) {
        return createGroupTypeAdapter();
      }
      @Override
      public Adapter caseIdentifiersType(IdentifiersType object) {
        return createIdentifiersTypeAdapter();
      }
      @Override
      public Adapter caseIdentifierType(IdentifierType object) {
        return createIdentifierTypeAdapter();
      }
      @Override
      public Adapter caseMappedDatatype(MappedDatatype object) {
        return createMappedDatatypeAdapter();
      }
      @Override
      public Adapter caseMessageRefType(MessageRefType object) {
        return createMessageRefTypeAdapter();
      }
      @Override
      public Adapter caseMessagesType(MessagesType object) {
        return createMessagesTypeAdapter();
      }
      @Override
      public Adapter caseMessageType(MessageType object) {
        return createMessageTypeAdapter();
      }
      @Override
      public Adapter caseRepositoryType(RepositoryType object) {
        return createRepositoryTypeAdapter();
      }
      @Override
      public Adapter caseResponsesType(ResponsesType object) {
        return createResponsesTypeAdapter();
      }
      @Override
      public Adapter caseResponseType(ResponseType object) {
        return createResponseTypeAdapter();
      }
      @Override
      public Adapter caseSectionsType(SectionsType object) {
        return createSectionsTypeAdapter();
      }
      @Override
      public Adapter caseSectionType(SectionType object) {
        return createSectionTypeAdapter();
      }
      @Override
      public Adapter caseStateMachineType(StateMachineType object) {
        return createStateMachineTypeAdapter();
      }
      @Override
      public Adapter caseStateType(StateType object) {
        return createStateTypeAdapter();
      }
      @Override
      public Adapter caseStructureType(StructureType object) {
        return createStructureTypeAdapter();
      }
      @Override
      public Adapter caseTimerSchedule(TimerSchedule object) {
        return createTimerScheduleAdapter();
      }
      @Override
      public Adapter caseTimerType(TimerType object) {
        return createTimerTypeAdapter();
      }
      @Override
      public Adapter caseTransitionType(TransitionType object) {
        return createTransitionTypeAdapter();
      }
      @Override
      public Adapter caseTriggerType(TriggerType object) {
        return createTriggerTypeAdapter();
      }
      @Override
      public Adapter caseUniqueType(UniqueType object) {
        return createUniqueTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ActionType <em>Action Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ActionType
   * @generated
   */
  public Adapter createActionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ActorsType <em>Actors Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ActorsType
   * @generated
   */
  public Adapter createActorsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ActorType <em>Actor Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ActorType
   * @generated
   */
  public Adapter createActorTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.Appinfo <em>Appinfo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.Appinfo
   * @generated
   */
  public Adapter createAppinfoAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.BlockAssignmentType <em>Block Assignment Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.BlockAssignmentType
   * @generated
   */
  public Adapter createBlockAssignmentTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.CategoriesType <em>Categories Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.CategoriesType
   * @generated
   */
  public Adapter createCategoriesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.CategoryType <em>Category Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.CategoryType
   * @generated
   */
  public Adapter createCategoryTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.CodeSetsType <em>Code Sets Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetsType
   * @generated
   */
  public Adapter createCodeSetsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.CodeSetType <em>Code Set Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.CodeSetType
   * @generated
   */
  public Adapter createCodeSetTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.CodeType <em>Code Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.CodeType
   * @generated
   */
  public Adapter createCodeTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ComponentRefType <em>Component Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRefType
   * @generated
   */
  public Adapter createComponentRefTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ComponentRuleType <em>Component Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentRuleType
   * @generated
   */
  public Adapter createComponentRuleTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ComponentsType <em>Components Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentsType
   * @generated
   */
  public Adapter createComponentsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ComponentType <em>Component Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ComponentType
   * @generated
   */
  public Adapter createComponentTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ConceptsType <em>Concepts Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptsType
   * @generated
   */
  public Adapter createConceptsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ConceptType <em>Concept Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ConceptType
   * @generated
   */
  public Adapter createConceptTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.DatatypesType <em>Datatypes Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypesType
   * @generated
   */
  public Adapter createDatatypesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.DatatypeType <em>Datatype Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.DatatypeType
   * @generated
   */
  public Adapter createDatatypeTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.Documentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.Documentation
   * @generated
   */
  public Adapter createDocumentationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ExtensionType <em>Extension Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ExtensionType
   * @generated
   */
  public Adapter createExtensionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.FieldRefType <em>Field Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRefType
   * @generated
   */
  public Adapter createFieldRefTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.FieldRuleType <em>Field Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.FieldRuleType
   * @generated
   */
  public Adapter createFieldRuleTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.FieldsType <em>Fields Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.FieldsType
   * @generated
   */
  public Adapter createFieldsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.FieldType
   * @generated
   */
  public Adapter createFieldTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.FlowType <em>Flow Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.FlowType
   * @generated
   */
  public Adapter createFlowTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.GroupRefType <em>Group Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.GroupRefType
   * @generated
   */
  public Adapter createGroupRefTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.GroupsType <em>Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.GroupsType
   * @generated
   */
  public Adapter createGroupsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.GroupType <em>Group Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.GroupType
   * @generated
   */
  public Adapter createGroupTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.IdentifiersType <em>Identifiers Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifiersType
   * @generated
   */
  public Adapter createIdentifiersTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.IdentifierType <em>Identifier Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.IdentifierType
   * @generated
   */
  public Adapter createIdentifierTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.MappedDatatype <em>Mapped Datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.MappedDatatype
   * @generated
   */
  public Adapter createMappedDatatypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.MessageRefType <em>Message Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.MessageRefType
   * @generated
   */
  public Adapter createMessageRefTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.MessagesType <em>Messages Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.MessagesType
   * @generated
   */
  public Adapter createMessagesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.MessageType <em>Message Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.MessageType
   * @generated
   */
  public Adapter createMessageTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.RepositoryType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.RepositoryType
   * @generated
   */
  public Adapter createRepositoryTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ResponsesType <em>Responses Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ResponsesType
   * @generated
   */
  public Adapter createResponsesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.ResponseType <em>Response Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.ResponseType
   * @generated
   */
  public Adapter createResponseTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.SectionsType <em>Sections Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.SectionsType
   * @generated
   */
  public Adapter createSectionsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.SectionType <em>Section Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.SectionType
   * @generated
   */
  public Adapter createSectionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.StateMachineType <em>State Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.StateMachineType
   * @generated
   */
  public Adapter createStateMachineTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.StateType
   * @generated
   */
  public Adapter createStateTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.StructureType <em>Structure Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.StructureType
   * @generated
   */
  public Adapter createStructureTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.TimerSchedule <em>Timer Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.TimerSchedule
   * @generated
   */
  public Adapter createTimerScheduleAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.TimerType <em>Timer Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.TimerType
   * @generated
   */
  public Adapter createTimerTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.TransitionType
   * @generated
   */
  public Adapter createTransitionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.TriggerType <em>Trigger Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.TriggerType
   * @generated
   */
  public Adapter createTriggerTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.fixprotocol._2020.orchestra.repository.UniqueType <em>Unique Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.fixprotocol._2020.orchestra.repository.UniqueType
   * @generated
   */
  public Adapter createUniqueTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //RepositoryAdapterFactory
