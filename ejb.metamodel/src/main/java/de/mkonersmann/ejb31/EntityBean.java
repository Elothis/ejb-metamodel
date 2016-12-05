/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity
 * Bean</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EntityBean#getName <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EntityBean#getAttributes
 * <em>Attributes</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EntityBean#getSuperType <em>Super
 * Type</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEntityBean()
 * @model
 * @generated
 */
public interface EntityBean extends IdentifiedElement {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEntityBean_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mkonersmann.ejb31.EntityBean#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.AbstractEntityAttribute}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attributes</em>' containment reference
	 *         list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEntityBean_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEntityAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(EntityBean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEntityBean_SuperType()
	 * @model
	 * @generated
	 */
	EntityBean getSuperType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EntityBean#getSuperType <em>Super
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(EntityBean value);

} // EntityBean
