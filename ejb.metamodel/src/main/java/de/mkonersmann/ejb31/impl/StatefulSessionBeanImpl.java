/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.StatefulSessionBean;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Stateful Session Bean</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class StatefulSessionBeanImpl extends SessionBeanImpl implements StatefulSessionBean {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StatefulSessionBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.STATEFUL_SESSION_BEAN;
	}

} // StatefulSessionBeanImpl
