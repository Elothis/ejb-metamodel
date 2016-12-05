/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Session
 * Bean</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.SessionBean#getOwnedOperationSignature
 * <em>Owned Operation Signature</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBean#getLocalBusinessInterfaces
 * <em>Local Business Interfaces</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBean#getOwnedOperations <em>Owned
 * Operations</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBean#getRemoteBusinessInterfaces
 * <em>Remote Business Interfaces</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.SessionBean#getInstances
 * <em>Instances</em>}</li>
 * </ul>
 *
 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBean()
 * @model
 * @generated
 */
public interface SessionBean extends EnterpriseBean {
	/**
	 * Returns the value of the '<em><b>Owned Operation Signature</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.OperationSignature}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation Signature</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owned Operation Signature</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBean_OwnedOperationSignature()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationSignature> getOwnedOperationSignature();

	/**
	 * Returns the value of the '<em><b>Local Business Interfaces</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.LocalProvision}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Business Interfaces</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Local Business Interfaces</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBean_LocalBusinessInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalProvision> getLocalBusinessInterfaces();

	/**
	 * Returns the value of the '<em><b>Owned Operations</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.SessionBeanOperation}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Owned Operations</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owned Operations</em>' containment
	 *         reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBean_OwnedOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SessionBeanOperation> getOwnedOperations();

	/**
	 * Returns the value of the '<em><b>Remote Business Interfaces</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.RemoteProvision}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Business Interfaces</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Remote Business Interfaces</em>'
	 *         containment reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBean_RemoteBusinessInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<RemoteProvision> getRemoteBusinessInterfaces();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.mkonersmann.ejb31.SessionBeanInstance}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see de.mkonersmann.ejb31.Ejb31Package#getSessionBean_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<SessionBeanInstance> getInstances();

} // SessionBean
