/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.Operation#getSignature
 * <em>Signature</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.Operation#getSecuritySpecs <em>Security
 * Specs</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(OperationSignature)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperation_Signature()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getSignature();

	/**
	 * Sets the value of the '{@link de.mkonersmann.ejb31.Operation#getSignature
	 * <em>Signature</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(OperationSignature value);

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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperation_SecuritySpecs()
	 * @model containment="true"
	 * @generated
	 */
	EnterpriseBeanOperationSecurity getSecuritySpecs();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.Operation#getSecuritySpecs <em>Security
	 * Specs</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Security Specs</em>' containment
	 *            reference.
	 * @see #getSecuritySpecs()
	 * @generated
	 */
	void setSecuritySpecs(EnterpriseBeanOperationSecurity value);

} // Operation
