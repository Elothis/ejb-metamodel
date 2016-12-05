/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Singleton Session Bean</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.SingletonSessionBean#isStartup
 * <em>Startup</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getSingletonSessionBean()
 * @model
 * @generated
 */
public interface SingletonSessionBean extends SessionBean {
	/**
	 * Returns the value of the '<em><b>Startup</b></em>' attribute. The default
	 * value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Startup</em>' attribute.
	 * @see #setStartup(boolean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSingletonSessionBean_Startup()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isStartup();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.SingletonSessionBean#isStartup
	 * <em>Startup</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Startup</em>' attribute.
	 * @see #isStartup()
	 * @generated
	 */
	void setStartup(boolean value);

} // SingletonSessionBean
