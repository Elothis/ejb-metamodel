/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.BeanReference;
import de.mkonersmann.ejb31.ContainerService;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseBean;
import de.mkonersmann.ejb31.EnterpriseBeanSecurity;
import de.mkonersmann.ejb31.EnvironmentEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Enterprise Bean</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanImpl#getEnvironmentEntries
 * <em>Environment Entries</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanImpl#getServiceDependencies
 * <em>Service Dependencies</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanImpl#getBeanReferences
 * <em>Bean References</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanImpl#getSecuritySpecs
 * <em>Security Specs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EnterpriseBeanImpl extends IdentifiedElementImpl implements EnterpriseBean {
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
	 * The cached value of the '{@link #getServiceDependencies() <em>Service
	 * Dependencies</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerService> serviceDependencies;

	/**
	 * The cached value of the '{@link #getBeanReferences() <em>Bean
	 * References</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBeanReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanReference> beanReferences;

	/**
	 * The cached value of the '{@link #getSecuritySpecs() <em>Security
	 * Specs</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSecuritySpecs()
	 * @generated
	 * @ordered
	 */
	protected EnterpriseBeanSecurity securitySpecs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnterpriseBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.ENTERPRISE_BEAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.ENTERPRISE_BEAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EnvironmentEntry> getEnvironmentEntries() {
		if (environmentEntries == null) {
			environmentEntries = new EObjectContainmentEList<EnvironmentEntry>(EnvironmentEntry.class, this,
					Ejb31Package.ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES);
		}
		return environmentEntries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ContainerService> getServiceDependencies() {
		if (serviceDependencies == null) {
			serviceDependencies = new EObjectResolvingEList<ContainerService>(ContainerService.class, this,
					Ejb31Package.ENTERPRISE_BEAN__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BeanReference> getBeanReferences() {
		if (beanReferences == null) {
			beanReferences = new EObjectContainmentEList<BeanReference>(BeanReference.class, this,
					Ejb31Package.ENTERPRISE_BEAN__BEAN_REFERENCES);
		}
		return beanReferences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnterpriseBeanSecurity getSecuritySpecs() {
		return securitySpecs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSecuritySpecs(EnterpriseBeanSecurity newSecuritySpecs, NotificationChain msgs) {
		EnterpriseBeanSecurity oldSecuritySpecs = securitySpecs;
		securitySpecs = newSecuritySpecs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS, oldSecuritySpecs, newSecuritySpecs);
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
	public void setSecuritySpecs(EnterpriseBeanSecurity newSecuritySpecs) {
		if (newSecuritySpecs != securitySpecs) {
			NotificationChain msgs = null;
			if (securitySpecs != null)
				msgs = ((InternalEObject) securitySpecs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS, null, msgs);
			if (newSecuritySpecs != null)
				msgs = ((InternalEObject) newSecuritySpecs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS, null, msgs);
			msgs = basicSetSecuritySpecs(newSecuritySpecs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS,
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
		case Ejb31Package.ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES:
			return ((InternalEList<?>) getEnvironmentEntries()).basicRemove(otherEnd, msgs);
		case Ejb31Package.ENTERPRISE_BEAN__BEAN_REFERENCES:
			return ((InternalEList<?>) getBeanReferences()).basicRemove(otherEnd, msgs);
		case Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS:
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
		case Ejb31Package.ENTERPRISE_BEAN__NAME:
			return getName();
		case Ejb31Package.ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES:
			return getEnvironmentEntries();
		case Ejb31Package.ENTERPRISE_BEAN__SERVICE_DEPENDENCIES:
			return getServiceDependencies();
		case Ejb31Package.ENTERPRISE_BEAN__BEAN_REFERENCES:
			return getBeanReferences();
		case Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS:
			return getSecuritySpecs();
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
		case Ejb31Package.ENTERPRISE_BEAN__NAME:
			setName((String) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES:
			getEnvironmentEntries().clear();
			getEnvironmentEntries().addAll((Collection<? extends EnvironmentEntry>) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN__SERVICE_DEPENDENCIES:
			getServiceDependencies().clear();
			getServiceDependencies().addAll((Collection<? extends ContainerService>) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN__BEAN_REFERENCES:
			getBeanReferences().clear();
			getBeanReferences().addAll((Collection<? extends BeanReference>) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS:
			setSecuritySpecs((EnterpriseBeanSecurity) newValue);
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
		case Ejb31Package.ENTERPRISE_BEAN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ejb31Package.ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES:
			getEnvironmentEntries().clear();
			return;
		case Ejb31Package.ENTERPRISE_BEAN__SERVICE_DEPENDENCIES:
			getServiceDependencies().clear();
			return;
		case Ejb31Package.ENTERPRISE_BEAN__BEAN_REFERENCES:
			getBeanReferences().clear();
			return;
		case Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS:
			setSecuritySpecs((EnterpriseBeanSecurity) null);
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
		case Ejb31Package.ENTERPRISE_BEAN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ejb31Package.ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES:
			return environmentEntries != null && !environmentEntries.isEmpty();
		case Ejb31Package.ENTERPRISE_BEAN__SERVICE_DEPENDENCIES:
			return serviceDependencies != null && !serviceDependencies.isEmpty();
		case Ejb31Package.ENTERPRISE_BEAN__BEAN_REFERENCES:
			return beanReferences != null && !beanReferences.isEmpty();
		case Ejb31Package.ENTERPRISE_BEAN__SECURITY_SPECS:
			return securitySpecs != null;
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

} // EnterpriseBeanImpl
