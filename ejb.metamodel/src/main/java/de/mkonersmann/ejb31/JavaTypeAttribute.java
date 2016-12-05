/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Java
 * Type Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.JavaTypeAttribute#getType <em>Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.JavaTypeAttribute#getMultiplicity
 * <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getJavaTypeAttribute()
 * @model
 * @generated
 */
public interface JavaTypeAttribute extends AbstractEntityAttribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getJavaTypeAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	Class getType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.JavaTypeAttribute#getType <em>Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute. The
	 * default value is <code>"ONE_TO_ONE"</code>. The literals are from the
	 * enumeration {@link de.mkonersmann.ejb31.JavaTypeReferenceMultipicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see de.mkonersmann.ejb31.JavaTypeReferenceMultipicity
	 * @see #setMultiplicity(JavaTypeReferenceMultipicity)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getJavaTypeAttribute_Multiplicity()
	 * @model default="ONE_TO_ONE" required="true"
	 * @generated
	 */
	JavaTypeReferenceMultipicity getMultiplicity();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.JavaTypeAttribute#getMultiplicity
	 * <em>Multiplicity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Multiplicity</em>' attribute.
	 * @see de.mkonersmann.ejb31.JavaTypeReferenceMultipicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(JavaTypeReferenceMultipicity value);

} // JavaTypeAttribute
