/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity;
import de.mkonersmann.ejb31.SessionBeanOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Session
 * Bean Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanOperationImpl#isPreDestroy
 * <em>Pre Destroy</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanOperationImpl#isPostConstruct
 * <em>Post Construct</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanOperationImpl#isPrePassivate
 * <em>Pre Passivate</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanOperationImpl#isPostActivate
 * <em>Post Activate</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.SessionBeanOperationImpl#getSecuritySpecs
 * <em>Security Specs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SessionBeanOperationImpl extends OperationImpl implements SessionBeanOperation {
	/**
	 * The default value of the '{@link #isPreDestroy() <em>Pre Destroy</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPreDestroy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRE_DESTROY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreDestroy() <em>Pre Destroy</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPreDestroy()
	 * @generated
	 * @ordered
	 */
	protected boolean preDestroy = PRE_DESTROY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostConstruct() <em>Post
	 * Construct</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPostConstruct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_CONSTRUCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostConstruct() <em>Post
	 * Construct</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPostConstruct()
	 * @generated
	 * @ordered
	 */
	protected boolean postConstruct = POST_CONSTRUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrePassivate() <em>Pre
	 * Passivate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPrePassivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRE_PASSIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrePassivate() <em>Pre
	 * Passivate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPrePassivate()
	 * @generated
	 * @ordered
	 */
	protected boolean prePassivate = PRE_PASSIVATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostActivate() <em>Post
	 * Activate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPostActivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_ACTIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostActivate() <em>Post
	 * Activate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPostActivate()
	 * @generated
	 * @ordered
	 */
	protected boolean postActivate = POST_ACTIVATE_EDEFAULT;

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
	protected SessionBeanOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.SESSION_BEAN_OPERATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPreDestroy() {
		return preDestroy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPreDestroy(boolean newPreDestroy) {
		boolean oldPreDestroy = preDestroy;
		preDestroy = newPreDestroy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.SESSION_BEAN_OPERATION__PRE_DESTROY,
					oldPreDestroy, preDestroy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPostConstruct() {
		return postConstruct;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostConstruct(boolean newPostConstruct) {
		boolean oldPostConstruct = postConstruct;
		postConstruct = newPostConstruct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.SESSION_BEAN_OPERATION__POST_CONSTRUCT,
					oldPostConstruct, postConstruct));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPrePassivate() {
		return prePassivate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrePassivate(boolean newPrePassivate) {
		boolean oldPrePassivate = prePassivate;
		prePassivate = newPrePassivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.SESSION_BEAN_OPERATION__PRE_PASSIVATE,
					oldPrePassivate, prePassivate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPostActivate() {
		return postActivate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostActivate(boolean newPostActivate) {
		boolean oldPostActivate = postActivate;
		postActivate = newPostActivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.SESSION_BEAN_OPERATION__POST_ACTIVATE,
					oldPostActivate, postActivate));
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
					Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS, oldSecuritySpecs, newSecuritySpecs);
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
						EOPPOSITE_FEATURE_BASE - Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS, null, msgs);
			if (newSecuritySpecs != null)
				msgs = ((InternalEObject) newSecuritySpecs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS, null, msgs);
			msgs = basicSetSecuritySpecs(newSecuritySpecs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS,
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
		case Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_DESTROY:
			return isPreDestroy();
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_CONSTRUCT:
			return isPostConstruct();
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_PASSIVATE:
			return isPrePassivate();
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_ACTIVATE:
			return isPostActivate();
		case Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_DESTROY:
			setPreDestroy((Boolean) newValue);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_CONSTRUCT:
			setPostConstruct((Boolean) newValue);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_PASSIVATE:
			setPrePassivate((Boolean) newValue);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_ACTIVATE:
			setPostActivate((Boolean) newValue);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_DESTROY:
			setPreDestroy(PRE_DESTROY_EDEFAULT);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_CONSTRUCT:
			setPostConstruct(POST_CONSTRUCT_EDEFAULT);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_PASSIVATE:
			setPrePassivate(PRE_PASSIVATE_EDEFAULT);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_ACTIVATE:
			setPostActivate(POST_ACTIVATE_EDEFAULT);
			return;
		case Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_DESTROY:
			return preDestroy != PRE_DESTROY_EDEFAULT;
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_CONSTRUCT:
			return postConstruct != POST_CONSTRUCT_EDEFAULT;
		case Ejb31Package.SESSION_BEAN_OPERATION__PRE_PASSIVATE:
			return prePassivate != PRE_PASSIVATE_EDEFAULT;
		case Ejb31Package.SESSION_BEAN_OPERATION__POST_ACTIVATE:
			return postActivate != POST_ACTIVATE_EDEFAULT;
		case Ejb31Package.SESSION_BEAN_OPERATION__SECURITY_SPECS:
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
		result.append(" (preDestroy: ");
		result.append(preDestroy);
		result.append(", postConstruct: ");
		result.append(postConstruct);
		result.append(", prePassivate: ");
		result.append(prePassivate);
		result.append(", postActivate: ");
		result.append(postActivate);
		result.append(')');
		return result.toString();
	}

} // SessionBeanOperationImpl
