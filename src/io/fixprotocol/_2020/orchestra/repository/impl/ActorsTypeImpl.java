/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.ActorType;
import io.fixprotocol._2020.orchestra.repository.ActorsType;
import io.fixprotocol._2020.orchestra.repository.FlowType;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorsTypeImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorsTypeImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.ActorsTypeImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorsTypeImpl extends MinimalEObjectImpl.Container implements ActorsType {
  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected FeatureMap group;

  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorsTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getActorsType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup() {
    if (group == null) {
      group = new BasicFeatureMap(this, RepositoryPackage.ACTORS_TYPE__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActorType> getActor() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorsType_Actor());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowType> getFlow() {
    return getGroup().list(RepositoryPackage.eINSTANCE.getActorsType_Flow());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBase() {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(String newBase) {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.ACTORS_TYPE__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.ACTORS_TYPE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTORS_TYPE__ACTOR:
        return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
      case RepositoryPackage.ACTORS_TYPE__FLOW:
        return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RepositoryPackage.ACTORS_TYPE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case RepositoryPackage.ACTORS_TYPE__ACTOR:
        return getActor();
      case RepositoryPackage.ACTORS_TYPE__FLOW:
        return getFlow();
      case RepositoryPackage.ACTORS_TYPE__BASE:
        return getBase();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case RepositoryPackage.ACTORS_TYPE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case RepositoryPackage.ACTORS_TYPE__ACTOR:
        getActor().clear();
        getActor().addAll((Collection<? extends ActorType>)newValue);
        return;
      case RepositoryPackage.ACTORS_TYPE__FLOW:
        getFlow().clear();
        getFlow().addAll((Collection<? extends FlowType>)newValue);
        return;
      case RepositoryPackage.ACTORS_TYPE__BASE:
        setBase((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case RepositoryPackage.ACTORS_TYPE__GROUP:
        getGroup().clear();
        return;
      case RepositoryPackage.ACTORS_TYPE__ACTOR:
        getActor().clear();
        return;
      case RepositoryPackage.ACTORS_TYPE__FLOW:
        getFlow().clear();
        return;
      case RepositoryPackage.ACTORS_TYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case RepositoryPackage.ACTORS_TYPE__GROUP:
        return group != null && !group.isEmpty();
      case RepositoryPackage.ACTORS_TYPE__ACTOR:
        return !getActor().isEmpty();
      case RepositoryPackage.ACTORS_TYPE__FLOW:
        return !getFlow().isEmpty();
      case RepositoryPackage.ACTORS_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (group: ");
    result.append(group);
    result.append(", base: ");
    result.append(base);
    result.append(')');
    return result.toString();
  }

} //ActorsTypeImpl
