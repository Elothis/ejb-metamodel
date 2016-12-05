/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity
 * Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.EntityAttribute#getType <em>Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.EntityAttribute#getMultiplicity
 * <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getEntityAttribute()
 * @model
 * @generated
 */
public interface EntityAttribute extends AbstractEntityAttribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EntityBean)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEntityAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	EntityBean getType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EntityAttribute#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EntityBean value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute. The
	 * default value is <code>"ONE_TO_ONE"</code>. The literals are from the
	 * enumeration {@link de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity
	 * @see #setMultiplicity(EntityTypeReferenceMultiplicity)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getEntityAttribute_Multiplicity()
	 * @model default="ONE_TO_ONE" required="true"
	 * @generated
	 */
	EntityTypeReferenceMultiplicity getMultiplicity();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.EntityAttribute#getMultiplicity
	 * <em>Multiplicity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Multiplicity</em>' attribute.
	 * @see de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(EntityTypeReferenceMultiplicity value);

} // EntityAttribute
