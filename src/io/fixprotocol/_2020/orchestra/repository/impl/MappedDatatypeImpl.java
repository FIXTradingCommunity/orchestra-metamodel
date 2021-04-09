/**
 */
package io.fixprotocol._2020.orchestra.repository.impl;

import io.fixprotocol._2020.orchestra.repository.Annotation;
import io.fixprotocol._2020.orchestra.repository.ExtensionType;
import io.fixprotocol._2020.orchestra.repository.MappedDatatype;
import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#isBuiltin <em>Builtin</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link io.fixprotocol._2020.orchestra.repository.impl.MappedDatatypeImpl#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedDatatypeImpl extends MinimalEObjectImpl.Container implements MappedDatatype {
  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected ExtensionType extension;

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
  protected MappedDatatypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RepositoryPackage.eINSTANCE.getMappedDatatype();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionType getExtension() {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtension(ExtensionType newExtension, NotificationChain msgs) {
    ExtensionType oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__EXTENSION, oldExtension, newExtension);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(ExtensionType newExtension) {
    if (newExtension != extension) {
      NotificationChain msgs = null;
      if (extension != null)
        msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.MAPPED_DATATYPE__EXTENSION, null, msgs);
      if (newExtension != null)
        msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.MAPPED_DATATYPE__EXTENSION, null, msgs);
      msgs = basicSetExtension(newExtension, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__EXTENSION, newExtension, newExtension));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.MAPPED_DATATYPE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.MAPPED_DATATYPE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__ANNOTATION, newAnnotation, newAnnotation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__BASE, oldBase, base));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__BUILTIN, oldBuiltin, builtin, !oldBuiltinESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepositoryPackage.MAPPED_DATATYPE__BUILTIN, oldBuiltin, BUILTIN_EDEFAULT, oldBuiltinESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__ELEMENT, oldElement, element));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__PARAMETER, oldParameter, parameter));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__PATTERN, oldPattern, pattern));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.MAPPED_DATATYPE__STANDARD, oldStandard, standard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RepositoryPackage.MAPPED_DATATYPE__EXTENSION:
        return basicSetExtension(null, msgs);
      case RepositoryPackage.MAPPED_DATATYPE__ANNOTATION:
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
      case RepositoryPackage.MAPPED_DATATYPE__EXTENSION:
        return getExtension();
      case RepositoryPackage.MAPPED_DATATYPE__ANNOTATION:
        return getAnnotation();
      case RepositoryPackage.MAPPED_DATATYPE__BASE:
        return getBase();
      case RepositoryPackage.MAPPED_DATATYPE__BUILTIN:
        return isBuiltin();
      case RepositoryPackage.MAPPED_DATATYPE__ELEMENT:
        return getElement();
      case RepositoryPackage.MAPPED_DATATYPE__MAX_INCLUSIVE:
        return getMaxInclusive();
      case RepositoryPackage.MAPPED_DATATYPE__MIN_INCLUSIVE:
        return getMinInclusive();
      case RepositoryPackage.MAPPED_DATATYPE__PARAMETER:
        return getParameter();
      case RepositoryPackage.MAPPED_DATATYPE__PATTERN:
        return getPattern();
      case RepositoryPackage.MAPPED_DATATYPE__STANDARD:
        return getStandard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case RepositoryPackage.MAPPED_DATATYPE__EXTENSION:
        setExtension((ExtensionType)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__BASE:
        setBase((String)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__BUILTIN:
        setBuiltin((Boolean)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__ELEMENT:
        setElement((String)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__MAX_INCLUSIVE:
        setMaxInclusive((String)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__MIN_INCLUSIVE:
        setMinInclusive((String)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__PARAMETER:
        setParameter((String)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__PATTERN:
        setPattern((String)newValue);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__STANDARD:
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
      case RepositoryPackage.MAPPED_DATATYPE__EXTENSION:
        setExtension((ExtensionType)null);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__BUILTIN:
        unsetBuiltin();
        return;
      case RepositoryPackage.MAPPED_DATATYPE__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__MAX_INCLUSIVE:
        setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__MIN_INCLUSIVE:
        setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__PARAMETER:
        setParameter(PARAMETER_EDEFAULT);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__PATTERN:
        setPattern(PATTERN_EDEFAULT);
        return;
      case RepositoryPackage.MAPPED_DATATYPE__STANDARD:
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
      case RepositoryPackage.MAPPED_DATATYPE__EXTENSION:
        return extension != null;
      case RepositoryPackage.MAPPED_DATATYPE__ANNOTATION:
        return annotation != null;
      case RepositoryPackage.MAPPED_DATATYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case RepositoryPackage.MAPPED_DATATYPE__BUILTIN:
        return isSetBuiltin();
      case RepositoryPackage.MAPPED_DATATYPE__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case RepositoryPackage.MAPPED_DATATYPE__MAX_INCLUSIVE:
        return MAX_INCLUSIVE_EDEFAULT == null ? maxInclusive != null : !MAX_INCLUSIVE_EDEFAULT.equals(maxInclusive);
      case RepositoryPackage.MAPPED_DATATYPE__MIN_INCLUSIVE:
        return MIN_INCLUSIVE_EDEFAULT == null ? minInclusive != null : !MIN_INCLUSIVE_EDEFAULT.equals(minInclusive);
      case RepositoryPackage.MAPPED_DATATYPE__PARAMETER:
        return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
      case RepositoryPackage.MAPPED_DATATYPE__PATTERN:
        return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
      case RepositoryPackage.MAPPED_DATATYPE__STANDARD:
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

    StringBuilder result = new StringBuilder(super.toString());
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

} //MappedDatatypeImpl
