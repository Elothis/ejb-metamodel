/**
 */
package de.mkonersmann.ejb31;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.OperationParameter#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.OperationParameter#getJavaType <em>Java
 * Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.OperationParameter#getApplicationDataType
 * <em>Application Data Type</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationParameter()
 * @model
 * @generated
 */
public interface OperationParameter extends IdentifiedElement {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.OperationParameter#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Java Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Java Type</em>' attribute.
	 * @see #setJavaType(Class)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationParameter_JavaType()
	 * @model
	 * @generated
	 */
	Class getJavaType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.OperationParameter#getJavaType <em>Java
	 * Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Java Type</em>' attribute.
	 * @see #getJavaType()
	 * @generated
	 */
	void setJavaType(Class value);

	/**
	 * Returns the value of the '<em><b>Application Data Type</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Data Type</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Application Data Type</em>' reference.
	 * @see #setApplicationDataType(DataType)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationParameter_ApplicationDataType()
	 * @model
	 * @generated
	 */
	DataType getApplicationDataType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.OperationParameter#getApplicationDataType
	 * <em>Application Data Type</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Application Data Type</em>'
	 *            reference.
	 * @see #getApplicationDataType()
	 * @generated
	 */
	void setApplicationDataType(DataType value);

} // OperationParameter
