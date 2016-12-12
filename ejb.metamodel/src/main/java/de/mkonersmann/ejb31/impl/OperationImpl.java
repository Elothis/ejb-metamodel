/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity;
import de.mkonersmann.ejb31.Operation;
import de.mkonersmann.ejb31.OperationSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationImpl#getSignature
 * <em>Signature</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationImpl#getSecuritySpecs
 * <em>Security Specs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends IdentifiedElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected OperationSignature signature;

	/**
	 * The cached value of the '{@link #getSecuritySpecs() <em>Security
	 * Specs</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSecuritySpecs()
	 * @generated
	 * @ordered
	 */
	protected EnterpriseBeanOperationSecurity securitySpecs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationSignature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject) signature;
			signature = (OperationSignature) eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ejb31Package.OPERATION__SIGNATURE,
							oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationSignature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignature(OperationSignature newSignature) {
		OperationSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.OPERATION__SIGNATURE, oldSignature,
					signature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnterpriseBeanOperationSecurity getSecuritySpecs() {
		return securitySpecs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSecuritySpecs(EnterpriseBeanOperationSecurity newSecuritySpecs,
			NotificationChain msgs) {
		EnterpriseBeanOperationSecurity oldSecuritySpecs = securitySpecs;
		securitySpecs = newSecuritySpecs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Ejb31Package.OPERATION__SECURITY_SPECS, oldSecuritySpecs, newSecuritySpecs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSecuritySpecs(EnterpriseBeanOperationSecurity newSecuritySpecs) {
		if (newSecuritySpecs != securitySpecs) {
			NotificationChain msgs = null;
			if (securitySpecs != null)
				msgs = ((InternalEObject) securitySpecs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.OPERATION__SECURITY_SPECS, null, msgs);
			if (newSecuritySpecs != null)
				msgs = ((InternalEObject) newSecuritySpecs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.OPERATION__SECURITY_SPECS, null, msgs);
			msgs = basicSetSecuritySpecs(newSecuritySpecs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.OPERATION__SECURITY_SPECS,
					newSecuritySpecs, newSecuritySpecs));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.OPERATION__SECURITY_SPECS:
			return basicSetSecuritySpecs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ejb31Package.OPERATION__SIGNATURE:
			if (resolve)
				return getSignature();
			return basicGetSignature();
		case Ejb31Package.OPERATION__SECURITY_SPECS:
			return getSecuritySpecs();
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
		case Ejb31Package.OPERATION__SIGNATURE:
			setSignature((OperationSignature) newValue);
			return;
		case Ejb31Package.OPERATION__SECURITY_SPECS:
			setSecuritySpecs((EnterpriseBeanOperationSecurity) newValue);
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
		case Ejb31Package.OPERATION__SIGNATURE:
			setSignature((OperationSignature) null);
			return;
		case Ejb31Package.OPERATION__SECURITY_SPECS:
			setSecuritySpecs((EnterpriseBeanOperationSecurity) null);
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
		case Ejb31Package.OPERATION__SIGNATURE:
			return signature != null;
		case Ejb31Package.OPERATION__SECURITY_SPECS:
			return securitySpecs != null;
		}
		return super.eIsSet(featureID);
	}

} // OperationImpl
