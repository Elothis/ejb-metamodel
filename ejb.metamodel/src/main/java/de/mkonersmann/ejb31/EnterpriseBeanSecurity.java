/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Enterprise Bean Security</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#isPermitAll <em>Permit
 * All</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#isDenyAll <em>Deny
 * All</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRolesAllowed
 * <em>Roles Allowed</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRolesDeclared
 * <em>Roles Declared</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRunAs <em>Run
 * As</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBeanSecurity()
 * @model
 * @generated
 */
public interface EnterpriseBeanSecurity extends EObject {
	/**
	 * Returns the value of the '<em><b>Permit All</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permit All</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Permit All</em>' attribute.
	 * @see #setPermitAll(boolean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBeanSecurity_PermitAll()
	 * @model default="false"
	 * @generated
	 */
	boolean isPermitAll();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#isPermitAll
	 * <em>Permit All</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Permit All</em>' attribute.
	 * @see #isPermitAll()
	 * @generated
	 */
	void setPermitAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Deny All</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deny All</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Deny All</em>' attribute.
	 * @see #setDenyAll(boolean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBeanSecurity_DenyAll()
	 * @model default="false"
	 * @generated
	 */
	boolean isDenyAll();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#isDenyAll <em>Deny
	 * All</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Deny All</em>' attribute.
	 * @see #isDenyAll()
	 * @generated
	 */
	void setDenyAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Roles Allowed</b></em>' reference list.
	 * The list contents are of type {@link de.mkonersmann.ejb31.Role}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles Allowed</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Roles Allowed</em>' reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBeanSecurity_RolesAllowed()
	 * @model
	 * @generated
	 */
	EList<Role> getRolesAllowed();

	/**
	 * Returns the value of the '<em><b>Roles Declared</b></em>' reference list.
	 * The list contents are of type {@link de.mkonersmann.ejb31.Role}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles Declared</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Roles Declared</em>' reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBeanSecurity_RolesDeclared()
	 * @model
	 * @generated
	 */
	EList<Role> getRolesDeclared();

	/**
	 * Returns the value of the '<em><b>Run As</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run As</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Run As</em>' reference.
	 * @see #setRunAs(Role)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEnterpriseBeanSecurity_RunAs()
	 * @model
	 * @generated
	 */
	Role getRunAs();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRunAs <em>Run
	 * As</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Run As</em>' reference.
	 * @see #getRunAs()
	 * @generated
	 */
	void setRunAs(Role value);

} // EnterpriseBeanSecurity
