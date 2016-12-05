/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Container</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.Container#getProvides <em>Provides</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.Container#getDeployedArchives <em>Deployed
 * Archives</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.Container#getConnectedTo <em>Connected
 * To</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.Container#getEnvironmentEntries
 * <em>Environment Entries</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.ContainerService}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getContainer_Provides()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerService> getProvides();

	/**
	 * Returns the value of the '<em><b>Deployed Archives</b></em>' reference
	 * list. The list contents are of type {@link de.mkonersmann.ejb31.Archive}.
	 * It is bidirectional and its opposite is
	 * '{@link de.mkonersmann.ejb31.Archive#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Archives</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Deployed Archives</em>' reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getContainer_DeployedArchives()
	 * @see de.mkonersmann.ejb31.Archive#getContainer
	 * @model opposite="container"
	 * @generated
	 */
	EList<Archive> getDeployedArchives();

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link de.mkonersmann.ejb31.Client}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getContainer_ConnectedTo()
	 * @model
	 * @generated
	 */
	EList<Client> getConnectedTo();

	/**
	 * Returns the value of the '<em><b>Environment Entries</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.EnvironmentEntry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Entries</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Environment Entries</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getContainer_EnvironmentEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentEntry> getEnvironmentEntries();

} // Container
