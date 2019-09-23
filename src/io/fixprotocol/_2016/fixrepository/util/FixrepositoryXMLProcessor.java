/**
 */
package io.fixprotocol._2016.fixrepository.util;

import io.fixprotocol._2016.fixrepository.FixrepositoryPackage;

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
public class FixrepositoryXMLProcessor extends XMLProcessor {

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixrepositoryXMLProcessor() {
    super((EPackage.Registry.INSTANCE));
    FixrepositoryPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the FixrepositoryResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null) {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new FixrepositoryResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new FixrepositoryResourceFactoryImpl());
    }
    return registrations;
  }

} //FixrepositoryXMLProcessor
