/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.DestinationType;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.MessageDrivenBean;
import de.mkonersmann.ejb31.MessageDrivenBeanOperation;
import de.mkonersmann.ejb31.OperationSignature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Message
 * Driven Bean</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl#getDestinationType
 * <em>Destination Type</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl#getMessageSelectorEntries
 * <em>Message Selector Entries</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl#getOwnedOperationSignatures
 * <em>Owned Operation Signatures</em>}</li>
 * <li>{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl#getOwnedOperations
 * <em>Owned Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDrivenBeanImpl extends EnterpriseBeanImpl implements MessageDrivenBean {
	/**
	 * The default value of the '{@link #getDestinationType() <em>Destination
	 * Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDestinationType()
	 * @generated
	 * @ordered
	 */
	protected static final DestinationType DESTINATION_TYPE_EDEFAULT = DestinationType.NON_DURABLE_TOPIC;

	/**
	 * The cached value of the '{@link #getDestinationType() <em>Destination
	 * Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDestinationType()
	 * @generated
	 * @ordered
	 */
	protected DestinationType destinationType = DESTINATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageSelectorEntries() <em>Message
	 * Selector Entries</em>}' map. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getMessageSelectorEntries()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> messageSelectorEntries;

	/**
	 * The cached value of the '{@link #getOwnedOperationSignatures() <em>Owned
	 * Operation Signatures</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOwnedOperationSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationSignature> ownedOperationSignatures;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned
	 * Operations</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDrivenBeanOperation> ownedOperations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MessageDrivenBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ejb31Package.Literals.MESSAGE_DRIVEN_BEAN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DestinationType getDestinationType() {
		return destinationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDestinationType(DestinationType newDestinationType) {
		DestinationType oldDestinationType = destinationType;
		destinationType = newDestinationType == null ? DESTINATION_TYPE_EDEFAULT : newDestinationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ejb31Package.MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE,
					oldDestinationType, destinationType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getMessageSelectorEntries() {
		if (messageSelectorEntries == null) {
			messageSelectorEntries = new EcoreEMap<String, String>(Ejb31Package.Literals.MESSAGE_SELECTOR,
					MessageSelectorImpl.class, this, Ejb31Package.MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES);
		}
		return messageSelectorEntries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<OperationSignature> getOwnedOperationSignatures() {
		if (ownedOperationSignatures == null) {
			ownedOperationSignatures = new EObjectContainmentEList<OperationSignature>(OperationSignature.class, this,
					Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES);
		}
		return ownedOperationSignatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MessageDrivenBeanOperation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentEList<MessageDrivenBeanOperation>(MessageDrivenBeanOperation.class,
					this, Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES:
			return ((InternalEList<?>) getMessageSelectorEntries()).basicRemove(otherEnd, msgs);
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES:
			return ((InternalEList<?>) getOwnedOperationSignatures()).basicRemove(otherEnd, msgs);
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS:
			return ((InternalEList<?>) getOwnedOperations()).basicRemove(otherEnd, msgs);
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE:
			return getDestinationType();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES:
			if (coreType)
				return getMessageSelectorEntries();
			else
				return getMessageSelectorEntries().map();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES:
			return getOwnedOperationSignatures();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS:
			return getOwnedOperations();
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE:
			setDestinationType((DestinationType) newValue);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES:
			((EStructuralFeature.Setting) getMessageSelectorEntries()).set(newValue);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES:
			getOwnedOperationSignatures().clear();
			getOwnedOperationSignatures().addAll((Collection<? extends OperationSignature>) newValue);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS:
			getOwnedOperations().clear();
			getOwnedOperations().addAll((Collection<? extends MessageDrivenBeanOperation>) newValue);
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE:
			setDestinationType(DESTINATION_TYPE_EDEFAULT);
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES:
			getMessageSelectorEntries().clear();
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES:
			getOwnedOperationSignatures().clear();
			return;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS:
			getOwnedOperations().clear();
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
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE:
			return destinationType != DESTINATION_TYPE_EDEFAULT;
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES:
			return messageSelectorEntries != null && !messageSelectorEntries.isEmpty();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES:
			return ownedOperationSignatures != null && !ownedOperationSignatures.isEmpty();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS:
			return ownedOperations != null && !ownedOperations.isEmpty();
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
		result.append(" (destinationType: ");
		result.append(destinationType);
		result.append(')');
		return result.toString();
	}

} // MessageDrivenBeanImpl
