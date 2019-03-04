/**
 */
package org.purl.dc.terms.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.purl.dc.terms.TermsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsXMLProcessor extends XMLProcessor {

  /**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TermsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TermsPackage.eINSTANCE.eClass();
	}
  
  /**
	 * Register for "*" and "xml" file extensions the TermsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TermsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TermsResourceFactoryImpl());
		}
		return registrations;
	}

} //TermsXMLProcessor
