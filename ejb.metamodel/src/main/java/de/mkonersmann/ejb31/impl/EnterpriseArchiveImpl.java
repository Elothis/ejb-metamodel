/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.ApplicationAssemblyInformation;
import de.mkonersmann.ejb31.EJBArchive;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseArchive;
import de.mkonersmann.ejb31.Library;

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
 * '<em><b>Enterprise Archive</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseArchiveImpl#getEjbArchives
 * <em>Ejb Archives</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseArchiveImpl#getAssemblyInformation
 * <em>Assembly Information</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseArchiveImpl#getLibraries
 * <em>Libraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseArchiveImpl extends ArchiveImpl implements EnterpriseArchive {
	/**
	 * The cached value of the '{@link #getEjbArchives() <em>Ejb Archives</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEjbArchives()
	 * @generated
	 * @ordered
	 */
	protected EList<EJBArchive> ejbArchives;

	/**
	 * The cached value of the '{@link #getAssemblyInformation() <em>Assembly
	 * Information</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAssemblyInformation()
	 * @generated
	 * @ordered
	 */
	protected ApplicationAssemblyInformation assemblyInformation;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnterpriseArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.ENTERPRISE_ARCHIVE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EJBArchive> getEjbArchives() {
		if (ejbArchives == null) {
			ejbArchives = new EObjectContainmentEList<EJBArchive>(EJBArchive.class, this,
					Ejb31Package.ENTERPRISE_ARCHIVE__EJB_ARCHIVES);
		}
		return ejbArchives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApplicationAssemblyInformation getAssemblyInformation() {
		return assemblyInformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssemblyInformation(ApplicationAssemblyInformation newAssemblyInformation,
			NotificationChain msgs) {
		ApplicationAssemblyInformation oldAssemblyInformation = assemblyInformation;
		assemblyInformation = newAssemblyInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION, oldAssemblyInformation,
					newAssemblyInformation);
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
	public void setAssemblyInformation(ApplicationAssemblyInformation newAssemblyInformation) {
		if (newAssemblyInformation != assemblyInformation) {
			NotificationChain msgs = null;
			if (assemblyInformation != null)
				msgs = ((InternalEObject) assemblyInformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION, null, msgs);
			if (newAssemblyInformation != null)
				msgs = ((InternalEObject) newAssemblyInformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION, null, msgs);
			msgs = basicSetAssemblyInformation(newAssemblyInformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION,
					newAssemblyInformation, newAssemblyInformation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<Library>(Library.class, this,
					Ejb31Package.ENTERPRISE_ARCHIVE__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.ENTERPRISE_ARCHIVE__EJB_ARCHIVES:
			return ((InternalEList<?>) getEjbArchives()).basicRemove(otherEnd, msgs);
		case Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION:
			return basicSetAssemblyInformation(null, msgs);
		case Ejb31Package.ENTERPRISE_ARCHIVE__LIBRARIES:
			return ((InternalEList<?>) getLibraries()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.ENTERPRISE_ARCHIVE__EJB_ARCHIVES:
			return getEjbArchives();
		case Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION:
			return getAssemblyInformation();
		case Ejb31Package.ENTERPRISE_ARCHIVE__LIBRARIES:
			return getLibraries();
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
		case Ejb31Package.ENTERPRISE_ARCHIVE__EJB_ARCHIVES:
			getEjbArchives().clear();
			getEjbArchives().addAll((Collection<? extends EJBArchive>) newValue);
			return;
		case Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION:
			setAssemblyInformation((ApplicationAssemblyInformation) newValue);
			return;
		case Ejb31Package.ENTERPRISE_ARCHIVE__LIBRARIES:
			getLibraries().clear();
			getLibraries().addAll((Collection<? extends Library>) newValue);
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
		case Ejb31Package.ENTERPRISE_ARCHIVE__EJB_ARCHIVES:
			getEjbArchives().clear();
			return;
		case Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION:
			setAssemblyInformation((ApplicationAssemblyInformation) null);
			return;
		case Ejb31Package.ENTERPRISE_ARCHIVE__LIBRARIES:
			getLibraries().clear();
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
		case Ejb31Package.ENTERPRISE_ARCHIVE__EJB_ARCHIVES:
			return ejbArchives != null && !ejbArchives.isEmpty();
		case Ejb31Package.ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION:
			return assemblyInformation != null;
		case Ejb31Package.ENTERPRISE_ARCHIVE__LIBRARIES:
			return libraries != null && !libraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EnterpriseArchiveImpl
