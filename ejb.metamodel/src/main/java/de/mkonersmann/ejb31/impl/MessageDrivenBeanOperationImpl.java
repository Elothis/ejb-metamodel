/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity;
import de.mkonersmann.ejb31.MessageDrivenBeanOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Message
 * Driven Bean Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanOperationImpl#isPostConstruct
 * <em>Post Construct</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanOperationImpl#isPreDestroy
 * <em>Pre Destroy</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanOperationImpl#getSecuritySpecs
 * <em>Security Specs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDrivenBeanOperationImpl extends OperationImpl implements MessageDrivenBeanOperation {
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
	protected MessageDrivenBeanOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.MESSAGE_DRIVEN_BEAN_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT, oldPostConstruct, postConstruct));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY, oldPreDestroy, preDestroy));
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
					Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS, oldSecuritySpecs, newSecuritySpecs);
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
						EOPPOSITE_FEATURE_BASE - Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS, null,
						msgs);
			if (newSecuritySpecs != null)
				msgs = ((InternalEObject) newSecuritySpecs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS, null,
						msgs);
			msgs = basicSetSecuritySpecs(newSecuritySpecs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS, newSecuritySpecs, newSecuritySpecs));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT:
			return isPostConstruct();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY:
			return isPreDestroy();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT:
			setPostConstruct((Boolean) newValue);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY:
			setPreDestroy((Boolean) newValue);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT:
			setPostConstruct(POST_CONSTRUCT_EDEFAULT);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY:
			setPreDestroy(PRE_DESTROY_EDEFAULT);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS:
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT:
			return postConstruct != POST_CONSTRUCT_EDEFAULT;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY:
			return preDestroy != PRE_DESTROY_EDEFAULT;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS:
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
		result.append(" (postConstruct: ");
		result.append(postConstruct);
		result.append(", preDestroy: ");
		result.append(preDestroy);
		result.append(')');
		return result.toString();
	}

} // MessageDrivenBeanOperationImpl
