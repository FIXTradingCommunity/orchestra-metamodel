/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.ActionType;
import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.StateType;
import io.fixprotocol._2016.fixrepository.TransitionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StateTypeImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StateTypeImpl#getOnentry <em>Onentry</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StateTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StateTypeImpl#getOnexit <em>Onexit</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StateTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.StateTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateTypeImpl extends MinimalEObjectImpl.Container implements StateType {
  /**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
  protected EList<TransitionType> transition;

  /**
	 * The cached value of the '{@link #getOnentry() <em>Onentry</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOnentry()
	 * @generated
	 * @ordered
	 */
  protected ActionType onentry;

  /**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
  protected ActionType activity;

  /**
	 * The cached value of the '{@link #getOnexit() <em>Onexit</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOnexit()
	 * @generated
	 * @ordered
	 */
  protected ActionType onexit;

  /**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
  protected Annotation annotation;

  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StateTypeImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return FixrepositoryPackage.eINSTANCE.getStateType();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<TransitionType> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<TransitionType>(TransitionType.class, this, FixrepositoryPackage.STATE_TYPE__TRANSITION);
		}
		return transition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ActionType getOnentry() {
		return onentry;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOnentry(ActionType newOnentry, NotificationChain msgs) {
		ActionType oldOnentry = onentry;
		onentry = newOnentry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ONENTRY, oldOnentry, newOnentry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setOnentry(ActionType newOnentry) {
		if (newOnentry != onentry) {
			NotificationChain msgs = null;
			if (onentry != null)
				msgs = ((InternalEObject)onentry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ONENTRY, null, msgs);
			if (newOnentry != null)
				msgs = ((InternalEObject)newOnentry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ONENTRY, null, msgs);
			msgs = basicSetOnentry(newOnentry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ONENTRY, newOnentry, newOnentry));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ActionType getActivity() {
		return activity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetActivity(ActionType newActivity, NotificationChain msgs) {
		ActionType oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setActivity(ActionType newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ACTIVITY, newActivity, newActivity));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ActionType getOnexit() {
		return onexit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOnexit(ActionType newOnexit, NotificationChain msgs) {
		ActionType oldOnexit = onexit;
		onexit = newOnexit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ONEXIT, oldOnexit, newOnexit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setOnexit(ActionType newOnexit) {
		if (newOnexit != onexit) {
			NotificationChain msgs = null;
			if (onexit != null)
				msgs = ((InternalEObject)onexit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ONEXIT, null, msgs);
			if (newOnexit != null)
				msgs = ((InternalEObject)newOnexit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ONEXIT, null, msgs);
			msgs = basicSetOnexit(newOnexit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ONEXIT, newOnexit, newOnexit));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Annotation getAnnotation() {
		return annotation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setAnnotation(Annotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.STATE_TYPE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__ANNOTATION, newAnnotation, newAnnotation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getName() {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.STATE_TYPE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FixrepositoryPackage.STATE_TYPE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case FixrepositoryPackage.STATE_TYPE__ONENTRY:
				return basicSetOnentry(null, msgs);
			case FixrepositoryPackage.STATE_TYPE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case FixrepositoryPackage.STATE_TYPE__ONEXIT:
				return basicSetOnexit(null, msgs);
			case FixrepositoryPackage.STATE_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
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
			case FixrepositoryPackage.STATE_TYPE__TRANSITION:
				return getTransition();
			case FixrepositoryPackage.STATE_TYPE__ONENTRY:
				return getOnentry();
			case FixrepositoryPackage.STATE_TYPE__ACTIVITY:
				return getActivity();
			case FixrepositoryPackage.STATE_TYPE__ONEXIT:
				return getOnexit();
			case FixrepositoryPackage.STATE_TYPE__ANNOTATION:
				return getAnnotation();
			case FixrepositoryPackage.STATE_TYPE__NAME:
				return getName();
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
			case FixrepositoryPackage.STATE_TYPE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends TransitionType>)newValue);
				return;
			case FixrepositoryPackage.STATE_TYPE__ONENTRY:
				setOnentry((ActionType)newValue);
				return;
			case FixrepositoryPackage.STATE_TYPE__ACTIVITY:
				setActivity((ActionType)newValue);
				return;
			case FixrepositoryPackage.STATE_TYPE__ONEXIT:
				setOnexit((ActionType)newValue);
				return;
			case FixrepositoryPackage.STATE_TYPE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case FixrepositoryPackage.STATE_TYPE__NAME:
				setName((String)newValue);
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
			case FixrepositoryPackage.STATE_TYPE__TRANSITION:
				getTransition().clear();
				return;
			case FixrepositoryPackage.STATE_TYPE__ONENTRY:
				setOnentry((ActionType)null);
				return;
			case FixrepositoryPackage.STATE_TYPE__ACTIVITY:
				setActivity((ActionType)null);
				return;
			case FixrepositoryPackage.STATE_TYPE__ONEXIT:
				setOnexit((ActionType)null);
				return;
			case FixrepositoryPackage.STATE_TYPE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case FixrepositoryPackage.STATE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case FixrepositoryPackage.STATE_TYPE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case FixrepositoryPackage.STATE_TYPE__ONENTRY:
				return onentry != null;
			case FixrepositoryPackage.STATE_TYPE__ACTIVITY:
				return activity != null;
			case FixrepositoryPackage.STATE_TYPE__ONEXIT:
				return onexit != null;
			case FixrepositoryPackage.STATE_TYPE__ANNOTATION:
				return annotation != null;
			case FixrepositoryPackage.STATE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateTypeImpl
