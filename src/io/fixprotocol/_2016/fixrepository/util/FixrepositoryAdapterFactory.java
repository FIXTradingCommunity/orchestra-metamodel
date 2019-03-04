/**
 */
package io.fixprotocol._2016.fixrepository.util;

import io.fixprotocol._2016.fixrepository.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage
 * @generated
 */
public class FixrepositoryAdapterFactory extends AdapterFactoryImpl {
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static FixrepositoryPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FixrepositoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FixrepositoryPackage.eINSTANCE;
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
  protected FixrepositorySwitch<Adapter> modelSwitch =
    new FixrepositorySwitch<Adapter>() {
			@Override
			public Adapter caseAbbreviationsType(AbbreviationsType object) {
				return createAbbreviationsTypeAdapter();
			}
			@Override
			public Adapter caseAbbreviationType(AbbreviationType object) {
				return createAbbreviationTypeAdapter();
			}
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
			public Adapter caseMappedDatatypeType(MappedDatatypeType object) {
				return createMappedDatatypeTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.AbbreviationsType <em>Abbreviations Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.AbbreviationsType
	 * @generated
	 */
  public Adapter createAbbreviationsTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.AbbreviationType <em>Abbreviation Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.AbbreviationType
	 * @generated
	 */
  public Adapter createAbbreviationTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ActionType
	 * @generated
	 */
  public Adapter createActionTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ActorsType <em>Actors Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ActorsType
	 * @generated
	 */
  public Adapter createActorsTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ActorType
	 * @generated
	 */
  public Adapter createActorTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.Annotation
	 * @generated
	 */
  public Adapter createAnnotationAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.Appinfo <em>Appinfo</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.Appinfo
	 * @generated
	 */
  public Adapter createAppinfoAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.BlockAssignmentType <em>Block Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.BlockAssignmentType
	 * @generated
	 */
  public Adapter createBlockAssignmentTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.CategoriesType <em>Categories Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.CategoriesType
	 * @generated
	 */
  public Adapter createCategoriesTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.CategoryType
	 * @generated
	 */
  public Adapter createCategoryTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.CodeSetsType <em>Code Sets Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.CodeSetsType
	 * @generated
	 */
  public Adapter createCodeSetsTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.CodeSetType <em>Code Set Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.CodeSetType
	 * @generated
	 */
  public Adapter createCodeSetTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.CodeType
	 * @generated
	 */
  public Adapter createCodeTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ComponentRefType <em>Component Ref Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ComponentRefType
	 * @generated
	 */
  public Adapter createComponentRefTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ComponentsType <em>Components Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ComponentsType
	 * @generated
	 */
  public Adapter createComponentsTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ComponentType
	 * @generated
	 */
  public Adapter createComponentTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ConceptsType <em>Concepts Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ConceptsType
	 * @generated
	 */
  public Adapter createConceptsTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ConceptType <em>Concept Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ConceptType
	 * @generated
	 */
  public Adapter createConceptTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.DatatypesType <em>Datatypes Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.DatatypesType
	 * @generated
	 */
  public Adapter createDatatypesTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.DatatypeType <em>Datatype Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.DatatypeType
	 * @generated
	 */
  public Adapter createDatatypeTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.Documentation
	 * @generated
	 */
  public Adapter createDocumentationAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.DocumentRoot
	 * @generated
	 */
  public Adapter createDocumentRootAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.FieldRefType <em>Field Ref Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.FieldRefType
	 * @generated
	 */
  public Adapter createFieldRefTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.FieldRuleType <em>Field Rule Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.FieldRuleType
	 * @generated
	 */
  public Adapter createFieldRuleTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.FieldsType <em>Fields Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.FieldsType
	 * @generated
	 */
  public Adapter createFieldsTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.FieldType
	 * @generated
	 */
  public Adapter createFieldTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.FlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.FlowType
	 * @generated
	 */
  public Adapter createFlowTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.GroupRefType <em>Group Ref Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.GroupRefType
	 * @generated
	 */
  public Adapter createGroupRefTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.GroupsType <em>Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.GroupsType
	 * @generated
	 */
	public Adapter createGroupsTypeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.GroupType
	 * @generated
	 */
  public Adapter createGroupTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.IdentifiersType <em>Identifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.IdentifiersType
	 * @generated
	 */
	public Adapter createIdentifiersTypeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.IdentifierType
	 * @generated
	 */
	public Adapter createIdentifierTypeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.MappedDatatypeType <em>Mapped Datatype Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.MappedDatatypeType
	 * @generated
	 */
  public Adapter createMappedDatatypeTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.MessageRefType <em>Message Ref Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.MessageRefType
	 * @generated
	 */
  public Adapter createMessageRefTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.MessagesType <em>Messages Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.MessagesType
	 * @generated
	 */
  public Adapter createMessagesTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.MessageType
	 * @generated
	 */
  public Adapter createMessageTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.RepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.RepositoryType
	 * @generated
	 */
  public Adapter createRepositoryTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ResponsesType <em>Responses Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ResponsesType
	 * @generated
	 */
  public Adapter createResponsesTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.ResponseType
	 * @generated
	 */
  public Adapter createResponseTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.SectionsType <em>Sections Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.SectionsType
	 * @generated
	 */
  public Adapter createSectionsTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.SectionType <em>Section Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.SectionType
	 * @generated
	 */
  public Adapter createSectionTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.StateMachineType <em>State Machine Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.StateMachineType
	 * @generated
	 */
  public Adapter createStateMachineTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.StateType
	 * @generated
	 */
  public Adapter createStateTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.StructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.StructureType
	 * @generated
	 */
  public Adapter createStructureTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.TimerSchedule <em>Timer Schedule</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.TimerSchedule
	 * @generated
	 */
  public Adapter createTimerScheduleAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.TimerType <em>Timer Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.TimerType
	 * @generated
	 */
  public Adapter createTimerTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.TransitionType
	 * @generated
	 */
  public Adapter createTransitionTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.TriggerType
	 * @generated
	 */
  public Adapter createTriggerTypeAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.fixprotocol._2016.fixrepository.UniqueType <em>Unique Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.fixprotocol._2016.fixrepository.UniqueType
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

} //FixrepositoryAdapterFactory
