/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation Signature</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.OperationSignature#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.OperationSignature#getReturnJavaType
 * <em>Return Java Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.OperationSignature#getParameters
 * <em>Parameters</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.OperationSignature#getExceptions
 * <em>Exceptions</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.OperationSignature#getReturnApplicationType
 * <em>Return Application Type</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationSignature()
 * @model
 * @generated
 */
public interface OperationSignature extends IdentifiedElement {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationSignature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Java Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Java Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Return Java Type</em>' attribute.
	 * @see #setReturnJavaType(Class)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationSignature_ReturnJavaType()
	 * @model
	 * @generated
	 */
	Class getReturnJavaType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getReturnJavaType
	 * <em>Return Java Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Return Java Type</em>' attribute.
	 * @see #getReturnJavaType()
	 * @generated
	 */
	void setReturnJavaType(Class value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.OperationParameter}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference
	 *         list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationSignature_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' attribute list. The
	 * list contents are of type {@link java.lang.Class}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exceptions</em>' attribute list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationSignature_Exceptions()
	 * @model
	 * @generated
	 */
	EList<Class> getExceptions();

	/**
	 * Returns the value of the '<em><b>Return Application Type</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Application Type</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Return Application Type</em>' reference.
	 * @see #setReturnApplicationType(DataType)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getOperationSignature_ReturnApplicationType()
	 * @model
	 * @generated
	 */
	DataType getReturnApplicationType();

	/**
	 * Sets the value of the
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getReturnApplicationType
	 * <em>Return Application Type</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Return Application Type</em>'
	 *            reference.
	 * @see #getReturnApplicationType()
	 * @generated
	 */
	void setReturnApplicationType(DataType value);

} // OperationSignature
