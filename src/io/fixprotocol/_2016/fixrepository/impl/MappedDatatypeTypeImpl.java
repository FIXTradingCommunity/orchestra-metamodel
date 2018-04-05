/**
 */
package io.fixprotocol._2016.fixrepository.impl;

import io.fixprotocol._2016.fixrepository.Annotation;
import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;
import io.fixprotocol._2016.fixrepository.MappedDatatypeType;

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
 * An implementation of the model object '<em><b>Mapped Datatype Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getMappedDatatype <em>Mapped Datatype</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#isBuiltin <em>Builtin</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.impl.MappedDatatypeTypeImpl#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedDatatypeTypeImpl extends MinimalEObjectImpl.Container implements MappedDatatypeType {
  /**
   * The cached value of the '{@link #getMappedDatatype() <em>Mapped Datatype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedDatatype()
   * @generated
   * @ordered
   */
  protected EList<MappedDatatypeType> mappedDatatype;

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
   * The default value of the '{@link #isBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBuiltin()
   * @generated
   * @ordered
   */
  protected static final boolean BUILTIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBuiltin()
   * @generated
   * @ordered
   */
  protected boolean builtin = BUILTIN_EDEFAULT;

  /**
   * This is true if the Builtin attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean builtinESet;

  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
  protected static final String MAX_INCLUSIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInclusive()
   * @generated
   * @ordered
   */
  protected String maxInclusive = MAX_INCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
  protected static final String MIN_INCLUSIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInclusive()
   * @generated
   * @ordered
   */
  protected String minInclusive = MIN_INCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected String parameter = PARAMETER_EDEFAULT;

  /**
   * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected String pattern = PATTERN_EDEFAULT;

  /**
   * The default value of the '{@link #getStandard() <em>Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandard()
   * @generated
   * @ordered
   */
  protected static final Object STANDARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStandard() <em>Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandard()
   * @generated
   * @ordered
   */
  protected Object standard = STANDARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappedDatatypeTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FixrepositoryPackage.eINSTANCE.getMappedDatatypeType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappedDatatypeType> getMappedDatatype() {
    if (mappedDatatype == null) {
      mappedDatatype = new EObjectContainmentEList<MappedDatatypeType>(MappedDatatypeType.class, this, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAPPED_DATATYPE);
    }
    return mappedDatatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(Annotation newAnnotation) {
    if (newAnnotation != annotation) {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBuiltin() {
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltin(boolean newBuiltin) {
    boolean oldBuiltin = builtin;
    builtin = newBuiltin;
    boolean oldBuiltinESet = builtinESet;
    builtinESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BUILTIN, oldBuiltin, builtin, !oldBuiltinESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetBuiltin() {
    boolean oldBuiltin = builtin;
    boolean oldBuiltinESet = builtinESet;
    builtin = BUILTIN_EDEFAULT;
    builtinESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BUILTIN, oldBuiltin, BUILTIN_EDEFAULT, oldBuiltinESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetBuiltin() {
    return builtinESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement() {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement) {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaxInclusive() {
    return maxInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxInclusive(String newMaxInclusive) {
    String oldMaxInclusive = maxInclusive;
    maxInclusive = newMaxInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinInclusive() {
    return minInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinInclusive(String newMinInclusive) {
    String oldMinInclusive = minInclusive;
    minInclusive = newMinInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameter() {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(String newParameter) {
    String oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PARAMETER, oldParameter, parameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPattern() {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(String newPattern) {
    String oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getStandard() {
    return standard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStandard(Object newStandard) {
    Object oldStandard = standard;
    standard = newStandard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixrepositoryPackage.MAPPED_DATATYPE_TYPE__STANDARD, oldStandard, standard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAPPED_DATATYPE:
        return ((InternalEList<?>)getMappedDatatype()).basicRemove(otherEnd, msgs);
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION:
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
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAPPED_DATATYPE:
        return getMappedDatatype();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION:
        return getAnnotation();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BASE:
        return getBase();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BUILTIN:
        return isBuiltin();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ELEMENT:
        return getElement();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAX_INCLUSIVE:
        return getMaxInclusive();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MIN_INCLUSIVE:
        return getMinInclusive();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PARAMETER:
        return getParameter();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PATTERN:
        return getPattern();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__STANDARD:
        return getStandard();
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
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAPPED_DATATYPE:
        getMappedDatatype().clear();
        getMappedDatatype().addAll((Collection<? extends MappedDatatypeType>)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BASE:
        setBase((String)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BUILTIN:
        setBuiltin((Boolean)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ELEMENT:
        setElement((String)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAX_INCLUSIVE:
        setMaxInclusive((String)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MIN_INCLUSIVE:
        setMinInclusive((String)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PARAMETER:
        setParameter((String)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PATTERN:
        setPattern((String)newValue);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__STANDARD:
        setStandard(newValue);
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
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAPPED_DATATYPE:
        getMappedDatatype().clear();
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BUILTIN:
        unsetBuiltin();
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAX_INCLUSIVE:
        setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MIN_INCLUSIVE:
        setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PARAMETER:
        setParameter(PARAMETER_EDEFAULT);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PATTERN:
        setPattern(PATTERN_EDEFAULT);
        return;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__STANDARD:
        setStandard(STANDARD_EDEFAULT);
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
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAPPED_DATATYPE:
        return mappedDatatype != null && !mappedDatatype.isEmpty();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ANNOTATION:
        return annotation != null;
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__BUILTIN:
        return isSetBuiltin();
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MAX_INCLUSIVE:
        return MAX_INCLUSIVE_EDEFAULT == null ? maxInclusive != null : !MAX_INCLUSIVE_EDEFAULT.equals(maxInclusive);
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__MIN_INCLUSIVE:
        return MIN_INCLUSIVE_EDEFAULT == null ? minInclusive != null : !MIN_INCLUSIVE_EDEFAULT.equals(minInclusive);
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PARAMETER:
        return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__PATTERN:
        return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
      case FixrepositoryPackage.MAPPED_DATATYPE_TYPE__STANDARD:
        return STANDARD_EDEFAULT == null ? standard != null : !STANDARD_EDEFAULT.equals(standard);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (base: ");
    result.append(base);
    result.append(", builtin: ");
    if (builtinESet) result.append(builtin); else result.append("<unset>");
    result.append(", element: ");
    result.append(element);
    result.append(", maxInclusive: ");
    result.append(maxInclusive);
    result.append(", minInclusive: ");
    result.append(minInclusive);
    result.append(", parameter: ");
    result.append(parameter);
    result.append(", pattern: ");
    result.append(pattern);
    result.append(", standard: ");
    result.append(standard);
    result.append(')');
    return result.toString();
  }

} //MappedDatatypeTypeImpl
