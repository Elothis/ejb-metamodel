/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.EJBReference;
import de.mkonersmann.ejb31.EJBReferenceInstance;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.SessionBeanInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EJB
 * Reference Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBReferenceInstanceImpl#getEjbreference
 * <em>Ejbreference</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBReferenceInstanceImpl#getSessionbeaninstance
 * <em>Sessionbeaninstance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EJBReferenceInstanceImpl extends EObjectImpl implements EJBReferenceInstance {
	/**
	 * The cached value of the '{@link #getEjbreference()
	 * <em>Ejbreference</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEjbreference()
	 * @generated
	 * @ordered
	 */
	protected EJBReference ejbreference;

	/**
	 * The cached value of the '{@link #getSessionbeaninstance()
	 * <em>Sessionbeaninstance</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSessionbeaninstance()
	 * @generated
	 * @ordered
	 */
	protected SessionBeanInstance sessionbeaninstance;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EJBReferenceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.EJB_REFERENCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EJBReference getEjbreference() {
		if (ejbreference != null && ejbreference.eIsProxy()) {
			InternalEObject oldEjbreference = (InternalEObject) ejbreference;
			ejbreference = (EJBReference) eResolveProxy(oldEjbreference);
			if (ejbreference != oldEjbreference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Ejb31Package.EJB_REFERENCE_INSTANCE__EJBREFERENCE, oldEjbreference, ejbreference));
			}
		}
		return ejbreference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EJBReference basicGetEjbreference() {
		return ejbreference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEjbreference(EJBReference newEjbreference) {
		EJBReference oldEjbreference = ejbreference;
		ejbreference = newEjbreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.EJB_REFERENCE_INSTANCE__EJBREFERENCE,
					oldEjbreference, ejbreference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SessionBeanInstance getSessionbeaninstance() {
		if (sessionbeaninstance != null && sessionbeaninstance.eIsProxy()) {
			InternalEObject oldSessionbeaninstance = (InternalEObject) sessionbeaninstance;
			sessionbeaninstance = (SessionBeanInstance) eResolveProxy(oldSessionbeaninstance);
			if (sessionbeaninstance != oldSessionbeaninstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Ejb31Package.EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE, oldSessionbeaninstance,
							sessionbeaninstance));
			}
		}
		return sessionbeaninstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SessionBeanInstance basicGetSessionbeaninstance() {
		return sessionbeaninstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSessionbeaninstance(SessionBeanInstance newSessionbeaninstance) {
		SessionBeanInstance oldSessionbeaninstance = sessionbeaninstance;
		sessionbeaninstance = newSessionbeaninstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ejb31Package.EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE, oldSessionbeaninstance,
					sessionbeaninstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ejb31Package.EJB_REFERENCE_INSTANCE__EJBREFERENCE:
			if (resolve)
				return getEjbreference();
			return basicGetEjbreference();
		case Ejb31Package.EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE:
			if (resolve)
				return getSessionbeaninstance();
			return basicGetSessionbeaninstance();
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
		case Ejb31Package.EJB_REFERENCE_INSTANCE__EJBREFERENCE:
			setEjbreference((EJBReference) newValue);
			return;
		case Ejb31Package.EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE:
			setSessionbeaninstance((SessionBeanInstance) newValue);
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
		case Ejb31Package.EJB_REFERENCE_INSTANCE__EJBREFERENCE:
			setEjbreference((EJBReference) null);
			return;
		case Ejb31Package.EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE:
			setSessionbeaninstance((SessionBeanInstance) null);
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
		case Ejb31Package.EJB_REFERENCE_INSTANCE__EJBREFERENCE:
			return ejbreference != null;
		case Ejb31Package.EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE:
			return sessionbeaninstance != null;
		}
		return super.eIsSet(featureID);
	}

} // EJBReferenceInstanceImpl
