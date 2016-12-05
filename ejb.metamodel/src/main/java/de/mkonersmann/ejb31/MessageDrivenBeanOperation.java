/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Message
 * Driven Bean Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPostConstruct
 * <em>Post Construct</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPreDestroy
 * <em>Pre Destroy</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#getSecuritySpecs
 * <em>Security Specs</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBeanOperation()
 * @model
 * @generated
 */
public interface MessageDrivenBeanOperation extends Operation {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBeanOperation_PostConstruct()
	 * @model default="false"
	 * @generated
	 */
	boolean isPostConstruct();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPostConstruct
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBeanOperation_PreDestroy()
	 * @model default="false"
	 * @generated
	 */
	boolean isPreDestroy();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPreDestroy
	 * <em>Pre Destroy</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Pre Destroy</em>' attribute.
	 * @see #isPreDestroy()
	 * @generated
	 */
	void setPreDestroy(boolean value);

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
	 * @see #setSecuritySpecs(EnterpriseBeanOperationSecurity)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBeanOperation_SecuritySpecs()
	 * @model containment="true"
	 * @generated
	 */
	EnterpriseBeanOperationSecurity getSecuritySpecs();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#getSecuritySpecs
	 * <em>Security Specs</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Security Specs</em>' containment
	 *            reference.
	 * @see #getSecuritySpecs()
	 * @generated
	 */
	void setSecuritySpecs(EnterpriseBeanOperationSecurity value);

} // MessageDrivenBeanOperation
