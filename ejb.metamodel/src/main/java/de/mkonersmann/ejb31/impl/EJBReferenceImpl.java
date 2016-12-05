/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.EJBReference;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.SessionBean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EJB
 * Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBReferenceImpl#getSessionbean
 * <em>Sessionbean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EJBReferenceImpl extends BeanReferenceImpl implements EJBReference {
	/**
	 * The cached value of the '{@link #getSessionbean() <em>Sessionbean</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSessionbean()
	 * @generated
	 * @ordered
	 */
	protected SessionBean sessionbean;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EJBReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.EJB_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SessionBean getSessionbean() {
		if (sessionbean != null && sessionbean.eIsProxy()) {
			InternalEObject oldSessionbean = (InternalEObject) sessionbean;
			sessionbean = (SessionBean) eResolveProxy(oldSessionbean);
			if (sessionbean != oldSessionbean) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ejb31Package.EJB_REFERENCE__SESSIONBEAN,
							oldSessionbean, sessionbean));
			}
		}
		return sessionbean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SessionBean basicGetSessionbean() {
		return sessionbean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSessionbean(SessionBean newSessionbean) {
		SessionBean oldSessionbean = sessionbean;
		sessionbean = newSessionbean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.EJB_REFERENCE__SESSIONBEAN,
					oldSessionbean, sessionbean));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ejb31Package.EJB_REFERENCE__SESSIONBEAN:
			if (resolve)
				return getSessionbean();
			return basicGetSessionbean();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ejb31Package.EJB_REFERENCE__SESSIONBEAN:
			setSessionbean((SessionBean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Ejb31Package.EJB_REFERENCE__SESSIONBEAN:
			setSessionbean((SessionBean) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Ejb31Package.EJB_REFERENCE__SESSIONBEAN:
			return sessionbean != null;
		}
		return super.eIsSet(featureID);
	}

} // EJBReferenceImpl
