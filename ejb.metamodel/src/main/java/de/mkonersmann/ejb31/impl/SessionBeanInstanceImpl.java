/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.EJBReferenceInstance;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.SessionBeanInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Session
 * Bean Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanInstanceImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanInstanceImpl#getReferenceinstances
 * <em>Referenceinstances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionBeanInstanceImpl extends EObjectImpl implements SessionBeanInstance {
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
	 * The cached value of the '{@link #getReferenceinstances()
	 * <em>Referenceinstances</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferenceinstances()
	 * @generated
	 * @ordered
	 */
	protected EList<EJBReferenceInstance> referenceinstances;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SessionBeanInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.SESSION_BEAN_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.SESSION_BEAN_INSTANCE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EJBReferenceInstance> getReferenceinstances() {
		if (referenceinstances == null) {
			referenceinstances = new EObjectContainmentEList<EJBReferenceInstance>(EJBReferenceInstance.class, this,
					Ejb31Package.SESSION_BEAN_INSTANCE__REFERENCEINSTANCES);
		}
		return referenceinstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.SESSION_BEAN_INSTANCE__REFERENCEINSTANCES:
			return ((InternalEList<?>) getReferenceinstances()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.SESSION_BEAN_INSTANCE__NAME:
			return getName();
		case Ejb31Package.SESSION_BEAN_INSTANCE__REFERENCEINSTANCES:
			return getReferenceinstances();
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
		case Ejb31Package.SESSION_BEAN_INSTANCE__NAME:
			setName((String) newValue);
			return;
		case Ejb31Package.SESSION_BEAN_INSTANCE__REFERENCEINSTANCES:
			getReferenceinstances().clear();
			getReferenceinstances().addAll((Collection<? extends EJBReferenceInstance>) newValue);
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
		case Ejb31Package.SESSION_BEAN_INSTANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ejb31Package.SESSION_BEAN_INSTANCE__REFERENCEINSTANCES:
			getReferenceinstances().clear();
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
		case Ejb31Package.SESSION_BEAN_INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ejb31Package.SESSION_BEAN_INSTANCE__REFERENCEINSTANCES:
			return referenceinstances != null && !referenceinstances.isEmpty();
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

} // SessionBeanInstanceImpl
