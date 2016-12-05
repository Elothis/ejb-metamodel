/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseBeanSecurity;
import de.mkonersmann.ejb31.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Enterprise Bean Security</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl#isPermitAll
 * <em>Permit All</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl#isDenyAll
 * <em>Deny All</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl#getRolesAllowed
 * <em>Roles Allowed</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl#getRolesDeclared
 * <em>Roles Declared</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl#getRunAs
 * <em>Run As</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseBeanSecurityImpl extends EObjectImpl implements EnterpriseBeanSecurity {
	/**
	 * The default value of the '{@link #isPermitAll() <em>Permit All</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPermitAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERMIT_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPermitAll() <em>Permit All</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPermitAll()
	 * @generated
	 * @ordered
	 */
	protected boolean permitAll = PERMIT_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isDenyAll() <em>Deny All</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDenyAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DENY_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDenyAll() <em>Deny All</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDenyAll()
	 * @generated
	 * @ordered
	 */
	protected boolean denyAll = DENY_ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRolesAllowed() <em>Roles
	 * Allowed</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getRolesAllowed()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> rolesAllowed;

	/**
	 * The cached value of the '{@link #getRolesDeclared() <em>Roles
	 * Declared</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getRolesDeclared()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> rolesDeclared;

	/**
	 * The cached value of the '{@link #getRunAs() <em>Run As</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRunAs()
	 * @generated
	 * @ordered
	 */
	protected Role runAs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnterpriseBeanSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.ENTERPRISE_BEAN_SECURITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPermitAll() {
		return permitAll;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPermitAll(boolean newPermitAll) {
		boolean oldPermitAll = permitAll;
		permitAll = newPermitAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.ENTERPRISE_BEAN_SECURITY__PERMIT_ALL,
					oldPermitAll, permitAll));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDenyAll() {
		return denyAll;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDenyAll(boolean newDenyAll) {
		boolean oldDenyAll = denyAll;
		denyAll = newDenyAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.ENTERPRISE_BEAN_SECURITY__DENY_ALL,
					oldDenyAll, denyAll));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Role> getRolesAllowed() {
		if (rolesAllowed == null) {
			rolesAllowed = new EObjectResolvingEList<Role>(Role.class, this,
					Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED);
		}
		return rolesAllowed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Role> getRolesDeclared() {
		if (rolesDeclared == null) {
			rolesDeclared = new EObjectResolvingEList<Role>(Role.class, this,
					Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED);
		}
		return rolesDeclared;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Role getRunAs() {
		if (runAs != null && runAs.eIsProxy()) {
			InternalEObject oldRunAs = (InternalEObject) runAs;
			runAs = (Role) eResolveProxy(oldRunAs);
			if (runAs != oldRunAs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Ejb31Package.ENTERPRISE_BEAN_SECURITY__RUN_AS, oldRunAs, runAs));
			}
		}
		return runAs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Role basicGetRunAs() {
		return runAs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRunAs(Role newRunAs) {
		Role oldRunAs = runAs;
		runAs = newRunAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.ENTERPRISE_BEAN_SECURITY__RUN_AS,
					oldRunAs, runAs));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__PERMIT_ALL:
			return isPermitAll();
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__DENY_ALL:
			return isDenyAll();
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED:
			return getRolesAllowed();
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED:
			return getRolesDeclared();
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__RUN_AS:
			if (resolve)
				return getRunAs();
			return basicGetRunAs();
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
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__PERMIT_ALL:
			setPermitAll((Boolean) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__DENY_ALL:
			setDenyAll((Boolean) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED:
			getRolesAllowed().clear();
			getRolesAllowed().addAll((Collection<? extends Role>) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED:
			getRolesDeclared().clear();
			getRolesDeclared().addAll((Collection<? extends Role>) newValue);
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__RUN_AS:
			setRunAs((Role) newValue);
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
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__PERMIT_ALL:
			setPermitAll(PERMIT_ALL_EDEFAULT);
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__DENY_ALL:
			setDenyAll(DENY_ALL_EDEFAULT);
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED:
			getRolesAllowed().clear();
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED:
			getRolesDeclared().clear();
			return;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__RUN_AS:
			setRunAs((Role) null);
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
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__PERMIT_ALL:
			return permitAll != PERMIT_ALL_EDEFAULT;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__DENY_ALL:
			return denyAll != DENY_ALL_EDEFAULT;
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED:
			return rolesAllowed != null && !rolesAllowed.isEmpty();
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED:
			return rolesDeclared != null && !rolesDeclared.isEmpty();
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY__RUN_AS:
			return runAs != null;
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
		result.append(" (permitAll: ");
		result.append(permitAll);
		result.append(", denyAll: ");
		result.append(denyAll);
		result.append(')');
		return result.toString();
	}

} // EnterpriseBeanSecurityImpl
