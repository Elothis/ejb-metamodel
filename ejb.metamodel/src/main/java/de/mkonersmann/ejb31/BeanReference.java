/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bean
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.BeanReference#getReference
 * <em>Reference</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.BeanReference#getDescription
 * <em>Description</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getBeanReference()
 * @model abstract="true"
 * @generated
 */
public interface BeanReference extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Provision)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getBeanReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	Provision getReference();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.BeanReference#getReference
	 * <em>Reference</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Provision value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getBeanReference_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.BeanReference#getDescription
	 * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // BeanReference
