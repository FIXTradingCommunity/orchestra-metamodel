/**
 */
package org.purl.dc.dcmitype.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.purl.dc.dcmitype.DcmitypePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DcmitypeXMLProcessor extends XMLProcessor {

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DcmitypeXMLProcessor() {
    super((EPackage.Registry.INSTANCE));
    DcmitypePackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the DcmitypeResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null) {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new DcmitypeResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new DcmitypeResourceFactoryImpl());
    }
    return registrations;
  }

} //DcmitypeXMLProcessor
