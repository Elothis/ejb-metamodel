/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.LocalProvision;
import de.mkonersmann.ejb31.OperationSignature;
import de.mkonersmann.ejb31.RemoteProvision;
import de.mkonersmann.ejb31.SessionBean;
import de.mkonersmann.ejb31.SessionBeanInstance;
import de.mkonersmann.ejb31.SessionBeanOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Session
 * Bean</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanImpl#getOwnedOperationSignature
 * <em>Owned Operation Signature</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanImpl#getLocalBusinessInterfaces
 * <em>Local Business Interfaces</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanImpl#getOwnedOperations
 * <em>Owned Operations</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanImpl#getRemoteBusinessInterfaces
 * <em>Remote Business Interfaces</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanImpl#getInstances
 * <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionBeanImpl extends EnterpriseBeanImpl implements SessionBean {
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
	 * The cached value of the '{@link #getLocalBusinessInterfaces() <em>Local
	 * Business Interfaces</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocalBusinessInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalProvision> localBusinessInterfaces;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned
	 * Operations</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<SessionBeanOperation> ownedOperations;

	/**
	 * The cached value of the '{@link #getRemoteBusinessInterfaces() <em>Remote
	 * Business Interfaces</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRemoteBusinessInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteProvision> remoteBusinessInterfaces;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<SessionBeanInstance> instances;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SessionBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.SESSION_BEAN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OperationSignature> getOwnedOperationSignature() {
		if (ownedOperationSignature == null) {
			ownedOperationSignature = new EObjectContainmentEList<OperationSignature>(OperationSignature.class, this,
					Ejb31Package.SESSION_BEAN__OWNED_OPERATION_SIGNATURE);
		}
		return ownedOperationSignature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<LocalProvision> getLocalBusinessInterfaces() {
		if (localBusinessInterfaces == null) {
			localBusinessInterfaces = new EObjectContainmentEList<LocalProvision>(LocalProvision.class, this,
					Ejb31Package.SESSION_BEAN__LOCAL_BUSINESS_INTERFACES);
		}
		return localBusinessInterfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SessionBeanOperation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentEList<SessionBeanOperation>(SessionBeanOperation.class, this,
					Ejb31Package.SESSION_BEAN__OWNED_OPERATIONS);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RemoteProvision> getRemoteBusinessInterfaces() {
		if (remoteBusinessInterfaces == null) {
			remoteBusinessInterfaces = new EObjectContainmentEList<RemoteProvision>(RemoteProvision.class, this,
					Ejb31Package.SESSION_BEAN__REMOTE_BUSINESS_INTERFACES);
		}
		return remoteBusinessInterfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SessionBeanInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<SessionBeanInstance>(SessionBeanInstance.class, this,
					Ejb31Package.SESSION_BEAN__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATION_SIGNATURE:
			return ((InternalEList<?>) getOwnedOperationSignature()).basicRemove(otherEnd, msgs);
		case Ejb31Package.SESSION_BEAN__LOCAL_BUSINESS_INTERFACES:
			return ((InternalEList<?>) getLocalBusinessInterfaces()).basicRemove(otherEnd, msgs);
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATIONS:
			return ((InternalEList<?>) getOwnedOperations()).basicRemove(otherEnd, msgs);
		case Ejb31Package.SESSION_BEAN__REMOTE_BUSINESS_INTERFACES:
			return ((InternalEList<?>) getRemoteBusinessInterfaces()).basicRemove(otherEnd, msgs);
		case Ejb31Package.SESSION_BEAN__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATION_SIGNATURE:
			return getOwnedOperationSignature();
		case Ejb31Package.SESSION_BEAN__LOCAL_BUSINESS_INTERFACES:
			return getLocalBusinessInterfaces();
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATIONS:
			return getOwnedOperations();
		case Ejb31Package.SESSION_BEAN__REMOTE_BUSINESS_INTERFACES:
			return getRemoteBusinessInterfaces();
		case Ejb31Package.SESSION_BEAN__INSTANCES:
			return getInstances();
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
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATION_SIGNATURE:
			getOwnedOperationSignature().clear();
			getOwnedOperationSignature().addAll((Collection<? extends OperationSignature>) newValue);
			return;
		case Ejb31Package.SESSION_BEAN__LOCAL_BUSINESS_INTERFACES:
			getLocalBusinessInterfaces().clear();
			getLocalBusinessInterfaces().addAll((Collection<? extends LocalProvision>) newValue);
			return;
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATIONS:
			getOwnedOperations().clear();
			getOwnedOperations().addAll((Collection<? extends SessionBeanOperation>) newValue);
			return;
		case Ejb31Package.SESSION_BEAN__REMOTE_BUSINESS_INTERFACES:
			getRemoteBusinessInterfaces().clear();
			getRemoteBusinessInterfaces().addAll((Collection<? extends RemoteProvision>) newValue);
			return;
		case Ejb31Package.SESSION_BEAN__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends SessionBeanInstance>) newValue);
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
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATION_SIGNATURE:
			getOwnedOperationSignature().clear();
			return;
		case Ejb31Package.SESSION_BEAN__LOCAL_BUSINESS_INTERFACES:
			getLocalBusinessInterfaces().clear();
			return;
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATIONS:
			getOwnedOperations().clear();
			return;
		case Ejb31Package.SESSION_BEAN__REMOTE_BUSINESS_INTERFACES:
			getRemoteBusinessInterfaces().clear();
			return;
		case Ejb31Package.SESSION_BEAN__INSTANCES:
			getInstances().clear();
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
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATION_SIGNATURE:
			return ownedOperationSignature != null && !ownedOperationSignature.isEmpty();
		case Ejb31Package.SESSION_BEAN__LOCAL_BUSINESS_INTERFACES:
			return localBusinessInterfaces != null && !localBusinessInterfaces.isEmpty();
		case Ejb31Package.SESSION_BEAN__OWNED_OPERATIONS:
			return ownedOperations != null && !ownedOperations.isEmpty();
		case Ejb31Package.SESSION_BEAN__REMOTE_BUSINESS_INTERFACES:
			return remoteBusinessInterfaces != null && !remoteBusinessInterfaces.isEmpty();
		case Ejb31Package.SESSION_BEAN__INSTANCES:
			return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SessionBeanImpl
