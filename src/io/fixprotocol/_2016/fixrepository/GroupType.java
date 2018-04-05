/**
 */
package io.fixprotocol._2016.fixrepository;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMinOccurs <em>Impl Min Occurs</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getNumInGroupId <em>Num In Group Id</em>}</li>
 *   <li>{@link io.fixprotocol._2016.fixrepository.GroupType#getNumInGroupName <em>Num In Group Name</em>}</li>
 * </ul>
 *
 * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType()
 * @model extendedMetaData="name='groupType' kind='elementOnly'"
 * @generated
 */
public interface GroupType extends ComponentType {
  /**
   * Returns the value of the '<em><b>Impl Max Occurs</b></em>' attribute.
   * The default value is <code>"unbounded"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Max Occurs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Max Occurs</em>' attribute.
   * @see #isSetImplMaxOccurs()
   * @see #unsetImplMaxOccurs()
   * @see #setImplMaxOccurs(Object)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ImplMaxOccurs()
   * @model default="unbounded" unsettable="true" dataType="io.fixprotocol._2016.fixrepository.UnboundedIntType"
   *        extendedMetaData="kind='attribute' name='implMaxOccurs'"
   * @generated
   */
  Object getImplMaxOccurs();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Max Occurs</em>' attribute.
   * @see #isSetImplMaxOccurs()
   * @see #unsetImplMaxOccurs()
   * @see #getImplMaxOccurs()
   * @generated
   */
  void setImplMaxOccurs(Object value);

  /**
   * Unsets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetImplMaxOccurs()
   * @see #getImplMaxOccurs()
   * @see #setImplMaxOccurs(Object)
   * @generated
   */
  void unsetImplMaxOccurs();

  /**
   * Returns whether the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMaxOccurs <em>Impl Max Occurs</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Impl Max Occurs</em>' attribute is set.
   * @see #unsetImplMaxOccurs()
   * @see #getImplMaxOccurs()
   * @see #setImplMaxOccurs(Object)
   * @generated
   */
  boolean isSetImplMaxOccurs();

  /**
   * Returns the value of the '<em><b>Impl Min Occurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Min Occurs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Min Occurs</em>' attribute.
   * @see #setImplMinOccurs(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_ImplMinOccurs()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
   *        extendedMetaData="kind='attribute' name='implMinOccurs'"
   * @generated
   */
  BigInteger getImplMinOccurs();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getImplMinOccurs <em>Impl Min Occurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Min Occurs</em>' attribute.
   * @see #getImplMinOccurs()
   * @generated
   */
  void setImplMinOccurs(BigInteger value);

  /**
   * Returns the value of the '<em><b>Num In Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num In Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num In Group Id</em>' attribute.
   * @see #setNumInGroupId(BigInteger)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_NumInGroupId()
   * @model dataType="io.fixprotocol._2016.fixrepository.IdT" required="true"
   *        extendedMetaData="kind='attribute' name='numInGroupId'"
   * @generated
   */
  BigInteger getNumInGroupId();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getNumInGroupId <em>Num In Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num In Group Id</em>' attribute.
   * @see #getNumInGroupId()
   * @generated
   */
  void setNumInGroupId(BigInteger value);

  /**
   * Returns the value of the '<em><b>Num In Group Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num In Group Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num In Group Name</em>' attribute.
   * @see #setNumInGroupName(String)
   * @see io.fixprotocol._2016.fixrepository.FixrepositoryPackage#getGroupType_NumInGroupName()
   * @model dataType="io.fixprotocol._2016.fixrepository.NameT" required="true"
   *        extendedMetaData="kind='attribute' name='numInGroupName'"
   * @generated
   */
  String getNumInGroupName();

  /**
   * Sets the value of the '{@link io.fixprotocol._2016.fixrepository.GroupType#getNumInGroupName <em>Num In Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num In Group Name</em>' attribute.
   * @see #getNumInGroupName()
   * @generated
   */
  void setNumInGroupName(String value);

} // GroupType
