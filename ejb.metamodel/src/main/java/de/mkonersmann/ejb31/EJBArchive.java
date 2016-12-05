/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EJB
 * Archive</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EJBArchive#getRootPackages <em>Root
 * Packages</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBArchive()
 * @model
 * @generated
 */
public interface EJBArchive extends Archive {
	/**
	 * Returns the value of the '<em><b>Root Packages</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.EJBPackage}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Packages</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Root Packages</em>' containment reference
	 *         list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBArchive_RootPackages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EJBPackage> getRootPackages();

} // EJBArchive
