/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Local
 * Provision</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.LocalProvision#getInterface
 * <em>Interface</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getLocalProvision()
 * @model
 * @generated
 */
public interface LocalProvision extends IdentifiedElement, Provision {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(BusinessInterface)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getLocalProvision_Interface()
	 * @model required="true"
	 * @generated
	 */
	BusinessInterface getInterface();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.LocalProvision#getInterface
	 * <em>Interface</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(BusinessInterface value);

} // LocalProvision
