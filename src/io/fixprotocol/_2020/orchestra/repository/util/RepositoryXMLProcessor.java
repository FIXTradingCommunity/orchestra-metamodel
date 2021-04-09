/**
 */
package io.fixprotocol._2020.orchestra.repository.util;

import io.fixprotocol._2020.orchestra.repository.RepositoryPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryXMLProcessor extends XMLProcessor {

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryXMLProcessor() {
    super((EPackage.Registry.INSTANCE));
    RepositoryPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the RepositoryResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null) {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new RepositoryResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new RepositoryResourceFactoryImpl());
    }
    return registrations;
  }

} //RepositoryXMLProcessor
