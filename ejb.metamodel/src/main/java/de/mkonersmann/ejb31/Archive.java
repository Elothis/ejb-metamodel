/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Archive</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.Archive#getName <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.Archive#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getArchive()
 * @model abstract="true"
 * @generated
 */
public interface Archive extends IdentifiedElement {
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
	 * @see de.mkonersmann.ejb31.Ejb31Package#getArchive_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mkonersmann.ejb31.Archive#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference list. The
	 * list contents are of type {@link de.mkonersmann.ejb31.Container}. It is
	 * bidirectional and its opposite is
	 * '{@link de.mkonersmann.ejb31.Container#getDeployedArchives <em>Deployed
	 * Archives</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container</em>' reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getArchive_Container()
	 * @see de.mkonersmann.ejb31.Container#getDeployedArchives
	 * @model opposite="deployedArchives"
	 * @generated
	 */
	EList<Container> getContainer();

} // Archive
