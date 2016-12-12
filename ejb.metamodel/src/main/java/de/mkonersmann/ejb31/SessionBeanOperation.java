/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Session
 * Bean Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.SessionBeanOperation#isPreDestroy <em>Pre
 * Destroy</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBeanOperation#isPostConstruct <em>Post
 * Construct</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBeanOperation#isPrePassivate <em>Pre
 * Passivate</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBeanOperation#isPostActivate <em>Post
 * Activate</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanOperation()
 * @model abstract="true"
 * @generated
 */
public interface SessionBeanOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Pre Destroy</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Destroy</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pre Destroy</em>' attribute.
	 * @see #setPreDestroy(boolean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanOperation_PreDestroy()
	 * @model default="false"
	 * @generated
	 */
	boolean isPreDestroy();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPreDestroy <em>Pre
	 * Destroy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Pre Destroy</em>' attribute.
	 * @see #isPreDestroy()
	 * @generated
	 */
	void setPreDestroy(boolean value);

	/**
	 * Returns the value of the '<em><b>Post Construct</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Construct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Post Construct</em>' attribute.
	 * @see #setPostConstruct(boolean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanOperation_PostConstruct()
	 * @model default="false"
	 * @generated
	 */
	boolean isPostConstruct();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPostConstruct
	 * <em>Post Construct</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Post Construct</em>' attribute.
	 * @see #isPostConstruct()
	 * @generated
	 */
	void setPostConstruct(boolean value);

	/**
	 * Returns the value of the '<em><b>Pre Passivate</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Passivate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pre Passivate</em>' attribute.
	 * @see #setPrePassivate(boolean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanOperation_PrePassivate()
	 * @model default="false"
	 * @generated
	 */
	boolean isPrePassivate();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPrePassivate <em>Pre
	 * Passivate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Pre Passivate</em>' attribute.
	 * @see #isPrePassivate()
	 * @generated
	 */
	void setPrePassivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Post Activate</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Activate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Post Activate</em>' attribute.
	 * @see #setPostActivate(boolean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanOperation_PostActivate()
	 * @model default="false"
	 * @generated
	 */
	boolean isPostActivate();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPostActivate <em>Post
	 * Activate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Post Activate</em>' attribute.
	 * @see #isPostActivate()
	 * @generated
	 */
	void setPostActivate(boolean value);

} // SessionBeanOperation
