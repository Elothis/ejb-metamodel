/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Business
 * Interface</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.BusinessInterface#getOwnedOperationSignature
 * <em>Owned Operation Signature</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.BusinessInterface#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getBusinessInterface()
 * @model
 * @generated
 */
public interface BusinessInterface extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Operation Signature</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.OperationSignature}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation Signature</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owned Operation Signature</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getBusinessInterface_OwnedOperationSignature()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationSignature> getOwnedOperationSignature();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getBusinessInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.BusinessInterface#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BusinessInterface
