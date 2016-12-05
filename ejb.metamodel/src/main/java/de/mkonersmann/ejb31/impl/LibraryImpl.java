/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.EJBPackage;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.Library;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Library</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.LibraryImpl#getRootPackages <em>Root
 * Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends ArchiveImpl implements Library {
	/**
	 * The cached value of the '{@link #getRootPackages() <em>Root
	 * Packages</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRootPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EJBPackage> rootPackages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EJBPackage> getRootPackages() {
		if (rootPackages == null) {
			rootPackages = new EObjectContainmentEList<EJBPackage>(EJBPackage.class, this,
					Ejb31Package.LIBRARY__ROOT_PACKAGES);
		}
		return rootPackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.LIBRARY__ROOT_PACKAGES:
			return ((InternalEList<?>) getRootPackages()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.LIBRARY__ROOT_PACKAGES:
			return getRootPackages();
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
		case Ejb31Package.LIBRARY__ROOT_PACKAGES:
			getRootPackages().clear();
			getRootPackages().addAll((Collection<? extends EJBPackage>) newValue);
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
		case Ejb31Package.LIBRARY__ROOT_PACKAGES:
			getRootPackages().clear();
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
		case Ejb31Package.LIBRARY__ROOT_PACKAGES:
			return rootPackages != null && !rootPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // LibraryImpl
