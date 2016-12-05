/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Enterprise Bean</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBean#getName <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBean#getEnvironmentEntries
 * <em>Environment Entries</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBean#getServiceDependencies
 * <em>Service Dependencies</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBean#getBeanReferences <em>Bean
 * References</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBean#getSecuritySpecs <em>Security
 * Specs</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBean()
 * @model abstract="true"
 * @generated
 */
public interface EnterpriseBean extends IdentifiedElement {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBean_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mkonersmann.ejb31.EnterpriseBean#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Environment Entries</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.EnvironmentEntry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Entries</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Environment Entries</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBean_EnvironmentEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentEntry> getEnvironmentEntries();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference
	 * list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.ContainerService}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Dependencies</em>' reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBean_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<ContainerService> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Bean References</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.BeanReference}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean References</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bean References</em>' containment reference
	 *         list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBean_BeanReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<BeanReference> getBeanReferences();

	/**
	 * Returns the value of the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Specs</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Security Specs</em>' containment reference.
	 * @see #setSecuritySpecs(EnterpriseBeanSecurity)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBean_SecuritySpecs()
	 * @model containment="true"
	 * @generated
	 */
	EnterpriseBeanSecurity getSecuritySpecs();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean#getSecuritySpecs <em>Security
	 * Specs</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Security Specs</em>' containment
	 *            reference.
	 * @see #getSecuritySpecs()
	 * @generated
	 */
	void setSecuritySpecs(EnterpriseBeanSecurity value);

} // EnterpriseBean
