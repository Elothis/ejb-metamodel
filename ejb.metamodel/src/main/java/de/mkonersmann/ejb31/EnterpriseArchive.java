/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Enterprise Archive</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseArchive#getEjbArchives <em>Ejb
 * Archives</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseArchive#getAssemblyInformation
 * <em>Assembly Information</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseArchive#getLibraries
 * <em>Libraries</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseArchive()
 * @model
 * @generated
 */
public interface EnterpriseArchive extends Archive {
	/**
	 * Returns the value of the '<em><b>Ejb Archives</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.EJBArchive}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Archives</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ejb Archives</em>' containment reference
	 *         list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseArchive_EjbArchives()
	 * @model containment="true"
	 * @generated
	 */
	EList<EJBArchive> getEjbArchives();

	/**
	 * Returns the value of the '<em><b>Assembly Information</b></em>'
	 * containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Information</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Assembly Information</em>' containment
	 *         reference.
	 * @see #setAssemblyInformation(ApplicationAssemblyInformation)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseArchive_AssemblyInformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ApplicationAssemblyInformation getAssemblyInformation();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EnterpriseArchive#getAssemblyInformation
	 * <em>Assembly Information</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Assembly Information</em>'
	 *            containment reference.
	 * @see #getAssemblyInformation()
	 * @generated
	 */
	void setAssemblyInformation(ApplicationAssemblyInformation value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.Library}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseArchive_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getLibraries();

} // EnterpriseArchive
