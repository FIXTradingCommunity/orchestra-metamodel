/**
 */
package org.purl.dc.elements._1._1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.purl.dc.elements._1._1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1FactoryImpl extends EFactoryImpl implements _1Factory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static _1Factory init() {
    try {
      _1Factory the_1Factory = (_1Factory)EPackage.Registry.INSTANCE.getEFactory(_1Package.eNS_URI);
      if (the_1Factory != null) {
        return the_1Factory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new _1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public _1FactoryImpl() {
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
      case _1Package.ELEMENT_CONTAINER: return createElementContainer();
      case _1Package.SIMPLE_LITERAL: return createSimpleLiteral();
      case _1Package.DOCUMENT_ROOT: return createDocumentRoot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementContainer createElementContainer() {
    ElementContainerImpl elementContainer = new ElementContainerImpl();
    return elementContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleLiteral createSimpleLiteral() {
    SimpleLiteralImpl simpleLiteral = new SimpleLiteralImpl();
    return simpleLiteral;
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
  public _1Package get_1Package() {
    return (_1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static _1Package getPackage() {
    return _1Package.eINSTANCE;
  }

} //_1FactoryImpl
