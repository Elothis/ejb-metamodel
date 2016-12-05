/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.BusinessInterface;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.OperationSignature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Business Interface</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.BusinessInterfaceImpl#getOwnedOperationSignature
 * <em>Owned Operation Signature</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.BusinessInterfaceImpl#getName
 * <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessInterfaceImpl extends IdentifiedElementImpl implements BusinessInterface {
	/**
	 * The cached value of the '{@link #getOwnedOperationSignature() <em>Owned
	 * Operation Signature</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOwnedOperationSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationSignature> ownedOperationSignature;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BusinessInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.BUSINESS_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OperationSignature> getOwnedOperationSignature() {
		if (ownedOperationSignature == null) {
			ownedOperationSignature = new EObjectContainmentEList<OperationSignature>(OperationSignature.class, this,
					Ejb31Package.BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE);
		}
		return ownedOperationSignature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.BUSINESS_INTERFACE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE:
			return ((InternalEList<?>) getOwnedOperationSignature()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE:
			return getOwnedOperationSignature();
		case Ejb31Package.BUSINESS_INTERFACE__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ejb31Package.BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE:
			getOwnedOperationSignature().clear();
			getOwnedOperationSignature().addAll((Collection<? extends OperationSignature>) newValue);
			return;
		case Ejb31Package.BUSINESS_INTERFACE__NAME:
			setName((String) newValue);
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
		case Ejb31Package.BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE:
			getOwnedOperationSignature().clear();
			return;
		case Ejb31Package.BUSINESS_INTERFACE__NAME:
			setName(NAME_EDEFAULT);
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
		case Ejb31Package.BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE:
			return ownedOperationSignature != null && !ownedOperationSignature.isEmpty();
		case Ejb31Package.BUSINESS_INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // BusinessInterfaceImpl
