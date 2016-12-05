/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EJB
 * Package</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EJBPackage#getBeans <em>Beans</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EJBPackage#getInterfaces
 * <em>Interfaces</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EJBPackage#getName <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EJBPackage#getDataTypes <em>Data
 * Types</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EJBPackage#getChildren
 * <em>Children</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBPackage()
 * @model
 * @generated
 */
public interface EJBPackage extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.EnterpriseBean}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beans</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Beans</em>' containment reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBPackage_Beans()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnterpriseBean> getBeans();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.BusinessInterface}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Interfaces</em>' containment reference
	 *         list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBPackage_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mkonersmann.ejb31.EJBPackage#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.DataType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Types</em>' containment reference
	 *         list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBPackage_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.EJBPackage}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBPackage_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<EJBPackage> getChildren();

} // EJBPackage
