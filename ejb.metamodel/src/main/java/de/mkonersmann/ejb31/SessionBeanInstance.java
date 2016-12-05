/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Session
 * Bean Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.SessionBeanInstance#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBeanInstance#getReferenceinstances
 * <em>Referenceinstances</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanInstance()
 * @model extendedMetaData="name='SessionBean'"
 * @generated
 */
public interface SessionBeanInstance extends EObject {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.SessionBeanInstance#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Referenceinstances</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.EJBReferenceInstance}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Referenceinstances</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Referenceinstances</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBeanInstance_Referenceinstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<EJBReferenceInstance> getReferenceinstances();

} // SessionBeanInstance
