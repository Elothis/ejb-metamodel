/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Message
 * Driven Bean</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.MessageDrivenBean#getDestinationType
 * <em>Destination Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.MessageDrivenBean#getMessageSelectorEntries
 * <em>Message Selector Entries</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.MessageDrivenBean#getOwnedOperationSignatures
 * <em>Owned Operation Signatures</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.MessageDrivenBean#getOwnedOperations
 * <em>Owned Operations</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBean()
 * @model
 * @generated
 */
public interface MessageDrivenBean extends EnterpriseBean {
	/**
	 * Returns the value of the '<em><b>Destination Type</b></em>' attribute.
	 * The literals are from the enumeration
	 * {@link de.mkonersmann.ejb31.DestinationType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Destination Type</em>' attribute.
	 * @see de.mkonersmann.ejb31.DestinationType
	 * @see #setDestinationType(DestinationType)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBean_DestinationType()
	 * @model required="true"
	 * @generated
	 */
	DestinationType getDestinationType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBean#getDestinationType
	 * <em>Destination Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Destination Type</em>' attribute.
	 * @see de.mkonersmann.ejb31.DestinationType
	 * @see #getDestinationType()
	 * @generated
	 */
	void setDestinationType(DestinationType value);

	/**
	 * Returns the value of the '<em><b>Message Selector Entries</b></em>' map.
	 * The key is of type {@link java.lang.String}, and the value is of type
	 * {@link java.lang.String}, <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Selector Entries</em>' map isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Message Selector Entries</em>' map.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBean_MessageSelectorEntries()
	 * @model mapType="de.mkonersmann.ejb31.MessageSelector<org.eclipse.emf.ecore.EString,
	 *        org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getMessageSelectorEntries();

	/**
	 * Returns the value of the '<em><b>Owned Operation Signatures</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.OperationSignature}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation Signatures</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owned Operation Signatures</em>'
	 *         containment reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBean_OwnedOperationSignatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationSignature> getOwnedOperationSignatures();

	/**
	 * Returns the value of the '<em><b>Owned Operations</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.MessageDrivenBeanOperation}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operations</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owned Operations</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getMessageDrivenBean_OwnedOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageDrivenBeanOperation> getOwnedOperations();

} // MessageDrivenBean
