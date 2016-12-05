/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data
 * Type Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.DataTypeOperation#getSignature
 * <em>Signature</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getDataTypeOperation()
 * @model
 * @generated
 */
public interface DataTypeOperation extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(OperationSignature)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getDataTypeOperation_Signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationSignature getSignature();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.DataTypeOperation#getSignature
	 * <em>Signature</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Signature</em>' containment
	 *            reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(OperationSignature value);

} // DataTypeOperation
