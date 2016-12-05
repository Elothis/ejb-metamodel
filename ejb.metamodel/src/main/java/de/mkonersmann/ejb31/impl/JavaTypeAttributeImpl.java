/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.JavaTypeAttribute;
import de.mkonersmann.ejb31.JavaTypeReferenceMultipicity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Java
 * Type Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.JavaTypeAttributeImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.JavaTypeAttributeImpl#getMultiplicity
 * <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaTypeAttributeImpl extends AbstractEntityAttributeImpl implements JavaTypeAttribute {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class type;

	/**
	 * The default value of the '{@link #getMultiplicity()
	 * <em>Multiplicity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final JavaTypeReferenceMultipicity MULTIPLICITY_EDEFAULT = JavaTypeReferenceMultipicity.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicity()
	 * <em>Multiplicity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected JavaTypeReferenceMultipicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected JavaTypeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.JAVA_TYPE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Class getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(Class newType) {
		Class oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.JAVA_TYPE_ATTRIBUTE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaTypeReferenceMultipicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMultiplicity(JavaTypeReferenceMultipicity newMultiplicity) {
		JavaTypeReferenceMultipicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.JAVA_TYPE_ATTRIBUTE__MULTIPLICITY,
					oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__TYPE:
			return getType();
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__MULTIPLICITY:
			return getMultiplicity();
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
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__TYPE:
			setType((Class) newValue);
			return;
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__MULTIPLICITY:
			setMultiplicity((JavaTypeReferenceMultipicity) newValue);
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
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__TYPE:
			setType((Class) null);
			return;
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__MULTIPLICITY:
			setMultiplicity(MULTIPLICITY_EDEFAULT);
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
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__TYPE:
			return type != null;
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE__MULTIPLICITY:
			return multiplicity != MULTIPLICITY_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} // JavaTypeAttributeImpl
