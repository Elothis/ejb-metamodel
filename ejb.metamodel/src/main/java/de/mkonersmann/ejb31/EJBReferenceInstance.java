/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EJB
 * Reference Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EJBReferenceInstance#getEjbreference
 * <em>Ejbreference</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EJBReferenceInstance#getSessionbeaninstance
 * <em>Sessionbeaninstance</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBReferenceInstance()
 * @model extendedMetaData="name='SessionBean'"
 * @generated
 */
public interface EJBReferenceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Ejbreference</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejbreference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ejbreference</em>' reference.
	 * @see #setEjbreference(EJBReference)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBReferenceInstance_Ejbreference()
	 * @model required="true"
	 * @generated
	 */
	EJBReference getEjbreference();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EJBReferenceInstance#getEjbreference
	 * <em>Ejbreference</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ejbreference</em>' reference.
	 * @see #getEjbreference()
	 * @generated
	 */
	void setEjbreference(EJBReference value);

	/**
	 * Returns the value of the '<em><b>Sessionbeaninstance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessionbeaninstance</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sessionbeaninstance</em>' reference.
	 * @see #setSessionbeaninstance(SessionBeanInstance)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEJBReferenceInstance_Sessionbeaninstance()
	 * @model required="true"
	 * @generated
	 */
	SessionBeanInstance getSessionbeaninstance();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EJBReferenceInstance#getSessionbeaninstance
	 * <em>Sessionbeaninstance</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sessionbeaninstance</em>' reference.
	 * @see #getSessionbeaninstance()
	 * @generated
	 */
	void setSessionbeaninstance(SessionBeanInstance value);

} // EJBReferenceInstance
