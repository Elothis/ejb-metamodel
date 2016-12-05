/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.SynchronousOperation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Synchronous Operation</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class SynchronousOperationImpl extends SessionBeanOperationImpl implements SynchronousOperation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SynchronousOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.SYNCHRONOUS_OPERATION;
	}

} // SynchronousOperationImpl
