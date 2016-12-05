/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EJB
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EJBReference#getSessionbean
 * <em>Sessionbean</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBReference()
 * @model extendedMetaData="name='SessionBean'"
 * @generated
 */
public interface EJBReference extends BeanReference {
	/**
	 * Returns the value of the '<em><b>Sessionbean</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessionbean</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sessionbean</em>' reference.
	 * @see #setSessionbean(SessionBean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBReference_Sessionbean()
	 * @model required="true"
	 * @generated
	 */
	SessionBean getSessionbean();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EJBReference#getSessionbean
	 * <em>Sessionbean</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sessionbean</em>' reference.
	 * @see #getSessionbean()
	 * @generated
	 */
	void setSessionbean(SessionBean value);

} // EJBReference
