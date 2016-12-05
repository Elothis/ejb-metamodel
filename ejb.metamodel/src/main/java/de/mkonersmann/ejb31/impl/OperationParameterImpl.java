/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.DataType;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.OperationParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Operation Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationParameterImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationParameterImpl#getJavaType
 * <em>Java Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationParameterImpl#getApplicationDataType
 * <em>Application Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationParameterImpl extends IdentifiedElementImpl implements OperationParameter {
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
	 * The cached value of the '{@link #getJavaType() <em>Java Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getJavaType()
	 * @generated
	 * @ordered
	 */
	protected Class javaType;

	/**
	 * The cached value of the '{@link #getApplicationDataType() <em>Application
	 * Data Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getApplicationDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType applicationDataType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OperationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.OPERATION_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.OPERATION_PARAMETER__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Class getJavaType() {
		return javaType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setJavaType(Class newJavaType) {
		Class oldJavaType = javaType;
		javaType = newJavaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.OPERATION_PARAMETER__JAVA_TYPE,
					oldJavaType, javaType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataType getApplicationDataType() {
		if (applicationDataType != null && applicationDataType.eIsProxy()) {
			InternalEObject oldApplicationDataType = (InternalEObject) applicationDataType;
			applicationDataType = (DataType) eResolveProxy(oldApplicationDataType);
			if (applicationDataType != oldApplicationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Ejb31Package.OPERATION_PARAMETER__APPLICATION_DATA_TYPE, oldApplicationDataType,
							applicationDataType));
			}
		}
		return applicationDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataType basicGetApplicationDataType() {
		return applicationDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setApplicationDataType(DataType newApplicationDataType) {
		DataType oldApplicationDataType = applicationDataType;
		applicationDataType = newApplicationDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ejb31Package.OPERATION_PARAMETER__APPLICATION_DATA_TYPE, oldApplicationDataType,
					applicationDataType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ejb31Package.OPERATION_PARAMETER__NAME:
			return getName();
		case Ejb31Package.OPERATION_PARAMETER__JAVA_TYPE:
			return getJavaType();
		case Ejb31Package.OPERATION_PARAMETER__APPLICATION_DATA_TYPE:
			if (resolve)
				return getApplicationDataType();
			return basicGetApplicationDataType();
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
		case Ejb31Package.OPERATION_PARAMETER__NAME:
			setName((String) newValue);
			return;
		case Ejb31Package.OPERATION_PARAMETER__JAVA_TYPE:
			setJavaType((Class) newValue);
			return;
		case Ejb31Package.OPERATION_PARAMETER__APPLICATION_DATA_TYPE:
			setApplicationDataType((DataType) newValue);
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
		case Ejb31Package.OPERATION_PARAMETER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ejb31Package.OPERATION_PARAMETER__JAVA_TYPE:
			setJavaType((Class) null);
			return;
		case Ejb31Package.OPERATION_PARAMETER__APPLICATION_DATA_TYPE:
			setApplicationDataType((DataType) null);
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
		case Ejb31Package.OPERATION_PARAMETER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ejb31Package.OPERATION_PARAMETER__JAVA_TYPE:
			return javaType != null;
		case Ejb31Package.OPERATION_PARAMETER__APPLICATION_DATA_TYPE:
			return applicationDataType != null;
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
		result.append(", javaType: ");
		result.append(javaType);
		result.append(')');
		return result.toString();
	}

} // OperationParameterImpl
