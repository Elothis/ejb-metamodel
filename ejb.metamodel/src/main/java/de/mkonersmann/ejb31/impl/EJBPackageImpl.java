/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.BusinessInterface;
import de.mkonersmann.ejb31.DataType;
import de.mkonersmann.ejb31.EJBPackage;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseBean;

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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EJB
 * Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBPackageImpl#getBeans
 * <em>Beans</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBPackageImpl#getInterfaces
 * <em>Interfaces</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBPackageImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBPackageImpl#getDataTypes <em>Data
 * Types</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.EJBPackageImpl#getChildren
 * <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EJBPackageImpl extends IdentifiedElementImpl implements EJBPackage {
	/**
	 * The cached value of the '{@link #getBeans() <em>Beans</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBeans()
	 * @generated
	 * @ordered
	 */
	protected EList<EnterpriseBean> beans;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessInterface> interfaces;

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
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<EJBPackage> children;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EJBPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.EJB_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EnterpriseBean> getBeans() {
		if (beans == null) {
			beans = new EObjectContainmentEList<EnterpriseBean>(EnterpriseBean.class, this,
					Ejb31Package.EJB_PACKAGE__BEANS);
		}
		return beans;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BusinessInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<BusinessInterface>(BusinessInterface.class, this,
					Ejb31Package.EJB_PACKAGE__INTERFACES);
		}
		return interfaces;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.EJB_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this,
					Ejb31Package.EJB_PACKAGE__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EJBPackage> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<EJBPackage>(EJBPackage.class, this,
					Ejb31Package.EJB_PACKAGE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.EJB_PACKAGE__BEANS:
			return ((InternalEList<?>) getBeans()).basicRemove(otherEnd, msgs);
		case Ejb31Package.EJB_PACKAGE__INTERFACES:
			return ((InternalEList<?>) getInterfaces()).basicRemove(otherEnd, msgs);
		case Ejb31Package.EJB_PACKAGE__DATA_TYPES:
			return ((InternalEList<?>) getDataTypes()).basicRemove(otherEnd, msgs);
		case Ejb31Package.EJB_PACKAGE__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.EJB_PACKAGE__BEANS:
			return getBeans();
		case Ejb31Package.EJB_PACKAGE__INTERFACES:
			return getInterfaces();
		case Ejb31Package.EJB_PACKAGE__NAME:
			return getName();
		case Ejb31Package.EJB_PACKAGE__DATA_TYPES:
			return getDataTypes();
		case Ejb31Package.EJB_PACKAGE__CHILDREN:
			return getChildren();
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
		case Ejb31Package.EJB_PACKAGE__BEANS:
			getBeans().clear();
			getBeans().addAll((Collection<? extends EnterpriseBean>) newValue);
			return;
		case Ejb31Package.EJB_PACKAGE__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends BusinessInterface>) newValue);
			return;
		case Ejb31Package.EJB_PACKAGE__NAME:
			setName((String) newValue);
			return;
		case Ejb31Package.EJB_PACKAGE__DATA_TYPES:
			getDataTypes().clear();
			getDataTypes().addAll((Collection<? extends DataType>) newValue);
			return;
		case Ejb31Package.EJB_PACKAGE__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends EJBPackage>) newValue);
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
		case Ejb31Package.EJB_PACKAGE__BEANS:
			getBeans().clear();
			return;
		case Ejb31Package.EJB_PACKAGE__INTERFACES:
			getInterfaces().clear();
			return;
		case Ejb31Package.EJB_PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ejb31Package.EJB_PACKAGE__DATA_TYPES:
			getDataTypes().clear();
			return;
		case Ejb31Package.EJB_PACKAGE__CHILDREN:
			getChildren().clear();
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
		case Ejb31Package.EJB_PACKAGE__BEANS:
			return beans != null && !beans.isEmpty();
		case Ejb31Package.EJB_PACKAGE__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		case Ejb31Package.EJB_PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ejb31Package.EJB_PACKAGE__DATA_TYPES:
			return dataTypes != null && !dataTypes.isEmpty();
		case Ejb31Package.EJB_PACKAGE__CHILDREN:
			return children != null && !children.isEmpty();
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

} // EJBPackageImpl
