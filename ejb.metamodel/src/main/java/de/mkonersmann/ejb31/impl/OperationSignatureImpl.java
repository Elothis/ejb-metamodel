/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.DataType;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.OperationParameter;
import de.mkonersmann.ejb31.OperationSignature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Operation Signature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationSignatureImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationSignatureImpl#getReturnJavaType
 * <em>Return Java Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationSignatureImpl#getParameters
 * <em>Parameters</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationSignatureImpl#getExceptions
 * <em>Exceptions</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.OperationSignatureImpl#getReturnApplicationType
 * <em>Return Application Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationSignatureImpl extends IdentifiedElementImpl implements OperationSignature {
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
	 * The cached value of the '{@link #getReturnJavaType() <em>Return Java
	 * Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReturnJavaType()
	 * @generated
	 * @ordered
	 */
	protected Class returnJavaType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationParameter> parameters;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Class> exceptions;

	/**
	 * The cached value of the '{@link #getReturnApplicationType() <em>Return
	 * Application Type</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReturnApplicationType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnApplicationType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OperationSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.OPERATION_SIGNATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.OPERATION_SIGNATURE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Class getReturnJavaType() {
		return returnJavaType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReturnJavaType(Class newReturnJavaType) {
		Class oldReturnJavaType = returnJavaType;
		returnJavaType = newReturnJavaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.OPERATION_SIGNATURE__RETURN_JAVA_TYPE,
					oldReturnJavaType, returnJavaType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OperationParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<OperationParameter>(OperationParameter.class, this,
					Ejb31Package.OPERATION_SIGNATURE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Class> getExceptions() {
		if (exceptions == null) {
			exceptions = new EDataTypeUniqueEList<Class>(Class.class, this,
					Ejb31Package.OPERATION_SIGNATURE__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataType getReturnApplicationType() {
		if (returnApplicationType != null && returnApplicationType.eIsProxy()) {
			InternalEObject oldReturnApplicationType = (InternalEObject) returnApplicationType;
			returnApplicationType = (DataType) eResolveProxy(oldReturnApplicationType);
			if (returnApplicationType != oldReturnApplicationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Ejb31Package.OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE, oldReturnApplicationType,
							returnApplicationType));
			}
		}
		return returnApplicationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataType basicGetReturnApplicationType() {
		return returnApplicationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReturnApplicationType(DataType newReturnApplicationType) {
		DataType oldReturnApplicationType = returnApplicationType;
		returnApplicationType = newReturnApplicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ejb31Package.OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE, oldReturnApplicationType,
					returnApplicationType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.OPERATION_SIGNATURE__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.OPERATION_SIGNATURE__NAME:
			return getName();
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_JAVA_TYPE:
			return getReturnJavaType();
		case Ejb31Package.OPERATION_SIGNATURE__PARAMETERS:
			return getParameters();
		case Ejb31Package.OPERATION_SIGNATURE__EXCEPTIONS:
			return getExceptions();
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE:
			if (resolve)
				return getReturnApplicationType();
			return basicGetReturnApplicationType();
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
		case Ejb31Package.OPERATION_SIGNATURE__NAME:
			setName((String) newValue);
			return;
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_JAVA_TYPE:
			setReturnJavaType((Class) newValue);
			return;
		case Ejb31Package.OPERATION_SIGNATURE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends OperationParameter>) newValue);
			return;
		case Ejb31Package.OPERATION_SIGNATURE__EXCEPTIONS:
			getExceptions().clear();
			getExceptions().addAll((Collection<? extends Class>) newValue);
			return;
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE:
			setReturnApplicationType((DataType) newValue);
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
		case Ejb31Package.OPERATION_SIGNATURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_JAVA_TYPE:
			setReturnJavaType((Class) null);
			return;
		case Ejb31Package.OPERATION_SIGNATURE__PARAMETERS:
			getParameters().clear();
			return;
		case Ejb31Package.OPERATION_SIGNATURE__EXCEPTIONS:
			getExceptions().clear();
			return;
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE:
			setReturnApplicationType((DataType) null);
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
		case Ejb31Package.OPERATION_SIGNATURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_JAVA_TYPE:
			return returnJavaType != null;
		case Ejb31Package.OPERATION_SIGNATURE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case Ejb31Package.OPERATION_SIGNATURE__EXCEPTIONS:
			return exceptions != null && !exceptions.isEmpty();
		case Ejb31Package.OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE:
			return returnApplicationType != null;
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
		result.append(", returnJavaType: ");
		result.append(returnJavaType);
		result.append(", exceptions: ");
		result.append(exceptions);
		result.append(')');
		return result.toString();
	}

} // OperationSignatureImpl
