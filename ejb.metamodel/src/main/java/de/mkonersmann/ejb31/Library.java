/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Library</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.Library#getRootPackages <em>Root
 * Packages</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Archive {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getLibrary_RootPackages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EJBPackage> getRootPackages();

} // Library
