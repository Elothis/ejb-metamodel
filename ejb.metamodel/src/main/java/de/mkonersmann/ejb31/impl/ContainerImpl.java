/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Archive;
import de.mkonersmann.ejb31.Client;
import de.mkonersmann.ejb31.Container;
import de.mkonersmann.ejb31.ContainerService;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnvironmentEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.ContainerImpl#getProvides
 * <em>Provides</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.ContainerImpl#getDeployedArchives
 * <em>Deployed Archives</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.ContainerImpl#getConnectedTo
 * <em>Connected To</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.ContainerImpl#getEnvironmentEntries
 * <em>Environment Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends IdentifiedElementImpl implements Container {
	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerService> provides;

	/**
	 * The cached value of the '{@link #getDeployedArchives() <em>Deployed
	 * Archives</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getDeployedArchives()
	 * @generated
	 * @ordered
	 */
	protected EList<Archive> deployedArchives;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> connectedTo;

	/**
	 * The cached value of the '{@link #getEnvironmentEntries() <em>Environment
	 * Entries</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEnvironmentEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentEntry> environmentEntries;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ContainerService> getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentEList<ContainerService>(ContainerService.class, this,
					Ejb31Package.CONTAINER__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Archive> getDeployedArchives() {
		if (deployedArchives == null) {
			deployedArchives = new EObjectWithInverseResolvingEList.ManyInverse<Archive>(Archive.class, this,
					Ejb31Package.CONTAINER__DEPLOYED_ARCHIVES, Ejb31Package.ARCHIVE__CONTAINER);
		}
		return deployedArchives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Client> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectResolvingEList<Client>(Client.class, this, Ejb31Package.CONTAINER__CONNECTED_TO);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EnvironmentEntry> getEnvironmentEntries() {
		if (environmentEntries == null) {
			environmentEntries = new EObjectContainmentEList<EnvironmentEntry>(EnvironmentEntry.class, this,
					Ejb31Package.CONTAINER__ENVIRONMENT_ENTRIES);
		}
		return environmentEntries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.CONTAINER__DEPLOYED_ARCHIVES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDeployedArchives()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.CONTAINER__PROVIDES:
			return ((InternalEList<?>) getProvides()).basicRemove(otherEnd, msgs);
		case Ejb31Package.CONTAINER__DEPLOYED_ARCHIVES:
			return ((InternalEList<?>) getDeployedArchives()).basicRemove(otherEnd, msgs);
		case Ejb31Package.CONTAINER__ENVIRONMENT_ENTRIES:
			return ((InternalEList<?>) getEnvironmentEntries()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.CONTAINER__PROVIDES:
			return getProvides();
		case Ejb31Package.CONTAINER__DEPLOYED_ARCHIVES:
			return getDeployedArchives();
		case Ejb31Package.CONTAINER__CONNECTED_TO:
			return getConnectedTo();
		case Ejb31Package.CONTAINER__ENVIRONMENT_ENTRIES:
			return getEnvironmentEntries();
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
		case Ejb31Package.CONTAINER__PROVIDES:
			getProvides().clear();
			getProvides().addAll((Collection<? extends ContainerService>) newValue);
			return;
		case Ejb31Package.CONTAINER__DEPLOYED_ARCHIVES:
			getDeployedArchives().clear();
			getDeployedArchives().addAll((Collection<? extends Archive>) newValue);
			return;
		case Ejb31Package.CONTAINER__CONNECTED_TO:
			getConnectedTo().clear();
			getConnectedTo().addAll((Collection<? extends Client>) newValue);
			return;
		case Ejb31Package.CONTAINER__ENVIRONMENT_ENTRIES:
			getEnvironmentEntries().clear();
			getEnvironmentEntries().addAll((Collection<? extends EnvironmentEntry>) newValue);
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
		case Ejb31Package.CONTAINER__PROVIDES:
			getProvides().clear();
			return;
		case Ejb31Package.CONTAINER__DEPLOYED_ARCHIVES:
			getDeployedArchives().clear();
			return;
		case Ejb31Package.CONTAINER__CONNECTED_TO:
			getConnectedTo().clear();
			return;
		case Ejb31Package.CONTAINER__ENVIRONMENT_ENTRIES:
			getEnvironmentEntries().clear();
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
		case Ejb31Package.CONTAINER__PROVIDES:
			return provides != null && !provides.isEmpty();
		case Ejb31Package.CONTAINER__DEPLOYED_ARCHIVES:
			return deployedArchives != null && !deployedArchives.isEmpty();
		case Ejb31Package.CONTAINER__CONNECTED_TO:
			return connectedTo != null && !connectedTo.isEmpty();
		case Ejb31Package.CONTAINER__ENVIRONMENT_ENTRIES:
			return environmentEntries != null && !environmentEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ContainerImpl
