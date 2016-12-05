/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.DataType#getName <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.DataType#getSuperType <em>Super
 * Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.DataType#getOwnedOperations <em>Owned
 * Operations</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getDataType()
 * @model
 * @generated
 */
public interface DataType extends IdentifiedElement {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getDataType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mkonersmann.ejb31.DataType#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see #setSuperType(DataType)
	 * @see de.mkonersmann.ejb31.Ejb31Package#getDataType_SuperType()
	 * @model
	 * @generated
	 */
	DataType getSuperType();

	/**
	 * Sets the value of the '{@link de.mkonersmann.ejb31.DataType#getSuperType
	 * <em>Super Type</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(DataType value);

	/**
	 * Returns the value of the '<em><b>Owned Operations</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.DataTypeOperation}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operations</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owned Operations</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getDataType_OwnedOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeOperation> getOwnedOperations();

} // DataType
