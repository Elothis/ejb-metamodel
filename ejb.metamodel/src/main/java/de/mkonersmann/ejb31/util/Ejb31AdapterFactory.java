/**
 */
package de.mkonersmann.ejb31.util;

import de.mkonersmann.ejb31.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see de.mkonersmann.ejb31.Ejb31Package
 * @generated
 */
public class Ejb31AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static Ejb31Package modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Ejb31AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ejb31Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Ejb31Switch<Adapter> modelSwitch = new Ejb31Switch<Adapter>() {
		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseEnvironmentEntry(EnvironmentEntry object) {
			return createEnvironmentEntryAdapter();
		}

		@Override
		public Adapter caseArchive(Archive object) {
			return createArchiveAdapter();
		}

		@Override
		public Adapter caseEnterpriseArchive(EnterpriseArchive object) {
			return createEnterpriseArchiveAdapter();
		}

		@Override
		public Adapter caseEJBArchive(EJBArchive object) {
			return createEJBArchiveAdapter();
		}

		@Override
		public Adapter caseApplicationAssemblyInformation(ApplicationAssemblyInformation object) {
			return createApplicationAssemblyInformationAdapter();
		}

		@Override
		public Adapter caseLibrary(Library object) {
			return createLibraryAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseContainerService(ContainerService object) {
			return createContainerServiceAdapter();
		}

		@Override
		public Adapter caseSecurityService(SecurityService object) {
			return createSecurityServiceAdapter();
		}

		@Override
		public Adapter caseConcurrencyService(ConcurrencyService object) {
			return createConcurrencyServiceAdapter();
		}

		@Override
		public Adapter caseTransactionService(TransactionService object) {
			return createTransactionServiceAdapter();
		}

		@Override
		public Adapter caseSecondaryStorageService(SecondaryStorageService object) {
			return createSecondaryStorageServiceAdapter();
		}

		@Override
		public Adapter caseEnterpriseBean(EnterpriseBean object) {
			return createEnterpriseBeanAdapter();
		}

		@Override
		public Adapter caseStatelessSessionBean(StatelessSessionBean object) {
			return createStatelessSessionBeanAdapter();
		}

		@Override
		public Adapter caseSessionBean(SessionBean object) {
			return createSessionBeanAdapter();
		}

		@Override
		public Adapter caseMessageDrivenBean(MessageDrivenBean object) {
			return createMessageDrivenBeanAdapter();
		}

		@Override
		public Adapter caseStatefulSessionBean(StatefulSessionBean object) {
			return createStatefulSessionBeanAdapter();
		}

		@Override
		public Adapter caseSingletonSessionBean(SingletonSessionBean object) {
			return createSingletonSessionBeanAdapter();
		}

		@Override
		public Adapter caseOperationSignature(OperationSignature object) {
			return createOperationSignatureAdapter();
		}

		@Override
		public Adapter caseBusinessInterface(BusinessInterface object) {
			return createBusinessInterfaceAdapter();
		}

		@Override
		public Adapter caseBeanReference(BeanReference object) {
			return createBeanReferenceAdapter();
		}

		@Override
		public Adapter caseEJBReference(EJBReference object) {
			return createEJBReferenceAdapter();
		}

		@Override
		public Adapter caseOperationParameter(OperationParameter object) {
			return createOperationParameterAdapter();
		}

		@Override
		public Adapter caseLocalProvision(LocalProvision object) {
			return createLocalProvisionAdapter();
		}

		@Override
		public Adapter caseRemoteProvision(RemoteProvision object) {
			return createRemoteProvisionAdapter();
		}

		@Override
		public Adapter caseMessageSelector(Map.Entry<String, String> object) {
			return createMessageSelectorAdapter();
		}

		@Override
		public Adapter caseDataType(DataType object) {
			return createDataTypeAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseDataTypeOperation(DataTypeOperation object) {
			return createDataTypeOperationAdapter();
		}

		@Override
		public Adapter caseSessionBeanOperation(SessionBeanOperation object) {
			return createSessionBeanOperationAdapter();
		}

		@Override
		public Adapter caseMessageDrivenBeanOperation(MessageDrivenBeanOperation object) {
			return createMessageDrivenBeanOperationAdapter();
		}

		@Override
		public Adapter caseSynchronousOperation(SynchronousOperation object) {
			return createSynchronousOperationAdapter();
		}

		@Override
		public Adapter caseAsynchronousOperation(AsynchronousOperation object) {
			return createAsynchronousOperationAdapter();
		}

		@Override
		public Adapter caseEntityBean(EntityBean object) {
			return createEntityBeanAdapter();
		}

		@Override
		public Adapter caseAbstractEntityAttribute(AbstractEntityAttribute object) {
			return createAbstractEntityAttributeAdapter();
		}

		@Override
		public Adapter caseJavaTypeAttribute(JavaTypeAttribute object) {
			return createJavaTypeAttributeAdapter();
		}

		@Override
		public Adapter caseEntityAttribute(EntityAttribute object) {
			return createEntityAttributeAdapter();
		}

		@Override
		public Adapter caseEJBPackage(EJBPackage object) {
			return createEJBPackageAdapter();
		}

		@Override
		public Adapter caseIdentifiedElement(IdentifiedElement object) {
			return createIdentifiedElementAdapter();
		}

		@Override
		public Adapter caseProvision(Provision object) {
			return createProvisionAdapter();
		}

		@Override
		public Adapter caseSessionBeanInstance(SessionBeanInstance object) {
			return createSessionBeanInstanceAdapter();
		}

		@Override
		public Adapter caseEJBReferenceInstance(EJBReferenceInstance object) {
			return createEJBReferenceInstanceAdapter();
		}

		@Override
		public Adapter caseEnterpriseBeanSecurity(EnterpriseBeanSecurity object) {
			return createEnterpriseBeanSecurityAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseEnterpriseBeanOperationSecurity(EnterpriseBeanOperationSecurity object) {
			return createEnterpriseBeanOperationSecurityAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.Client <em>Client</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EnvironmentEntry <em>Environment
	 * Entry</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EnvironmentEntry
	 * @generated
	 */
	public Adapter createEnvironmentEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.Archive <em>Archive</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.Archive
	 * @generated
	 */
	public Adapter createArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EnterpriseArchive <em>Enterprise
	 * Archive</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EnterpriseArchive
	 * @generated
	 */
	public Adapter createEnterpriseArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EJBArchive <em>EJB Archive</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EJBArchive
	 * @generated
	 */
	public Adapter createEJBArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.ApplicationAssemblyInformation
	 * <em>Application Assembly Information</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.ApplicationAssemblyInformation
	 * @generated
	 */
	public Adapter createApplicationAssemblyInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.Library <em>Library</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.Container <em>Container</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.ContainerService <em>Container
	 * Service</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.ContainerService
	 * @generated
	 */
	public Adapter createContainerServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.SecurityService
	 * @generated
	 */
	public Adapter createSecurityServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.ConcurrencyService <em>Concurrency
	 * Service</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.ConcurrencyService
	 * @generated
	 */
	public Adapter createConcurrencyServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.TransactionService <em>Transaction
	 * Service</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.TransactionService
	 * @generated
	 */
	public Adapter createTransactionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.SecondaryStorageService <em>Secondary
	 * Storage Service</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.SecondaryStorageService
	 * @generated
	 */
	public Adapter createSecondaryStorageServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean <em>Enterprise Bean</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EnterpriseBean
	 * @generated
	 */
	public Adapter createEnterpriseBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.StatelessSessionBean <em>Stateless Session
	 * Bean</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.StatelessSessionBean
	 * @generated
	 */
	public Adapter createStatelessSessionBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.SessionBean <em>Session Bean</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.SessionBean
	 * @generated
	 */
	public Adapter createSessionBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBean <em>Message Driven
	 * Bean</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.MessageDrivenBean
	 * @generated
	 */
	public Adapter createMessageDrivenBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.StatefulSessionBean <em>Stateful Session
	 * Bean</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.StatefulSessionBean
	 * @generated
	 */
	public Adapter createStatefulSessionBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.SingletonSessionBean <em>Singleton Session
	 * Bean</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.SingletonSessionBean
	 * @generated
	 */
	public Adapter createSingletonSessionBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.OperationSignature <em>Operation
	 * Signature</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.OperationSignature
	 * @generated
	 */
	public Adapter createOperationSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.BusinessInterface <em>Business
	 * Interface</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.BusinessInterface
	 * @generated
	 */
	public Adapter createBusinessInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.BeanReference <em>Bean Reference</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.BeanReference
	 * @generated
	 */
	public Adapter createBeanReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EJBReference <em>EJB Reference</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EJBReference
	 * @generated
	 */
	public Adapter createEJBReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.OperationParameter <em>Operation
	 * Parameter</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.OperationParameter
	 * @generated
	 */
	public Adapter createOperationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.LocalProvision <em>Local Provision</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.LocalProvision
	 * @generated
	 */
	public Adapter createLocalProvisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.RemoteProvision <em>Remote Provision</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.RemoteProvision
	 * @generated
	 */
	public Adapter createRemoteProvisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry
	 * <em>Message Selector</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createMessageSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.DataType <em>Data Type</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.Operation <em>Operation</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.DataTypeOperation <em>Data Type
	 * Operation</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.DataTypeOperation
	 * @generated
	 */
	public Adapter createDataTypeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation <em>Session Bean
	 * Operation</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.SessionBeanOperation
	 * @generated
	 */
	public Adapter createSessionBeanOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation <em>Message
	 * Driven Bean Operation</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.MessageDrivenBeanOperation
	 * @generated
	 */
	public Adapter createMessageDrivenBeanOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.SynchronousOperation <em>Synchronous
	 * Operation</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.SynchronousOperation
	 * @generated
	 */
	public Adapter createSynchronousOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.AsynchronousOperation <em>Asynchronous
	 * Operation</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.AsynchronousOperation
	 * @generated
	 */
	public Adapter createAsynchronousOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EntityBean <em>Entity Bean</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EntityBean
	 * @generated
	 */
	public Adapter createEntityBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.AbstractEntityAttribute <em>Abstract Entity
	 * Attribute</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.AbstractEntityAttribute
	 * @generated
	 */
	public Adapter createAbstractEntityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.JavaTypeAttribute <em>Java Type
	 * Attribute</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.JavaTypeAttribute
	 * @generated
	 */
	public Adapter createJavaTypeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EntityAttribute
	 * @generated
	 */
	public Adapter createEntityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EJBPackage <em>EJB Package</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EJBPackage
	 * @generated
	 */
	public Adapter createEJBPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.IdentifiedElement <em>Identified
	 * Element</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.Provision <em>Provision</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.Provision
	 * @generated
	 */
	public Adapter createProvisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.SessionBeanInstance <em>Session Bean
	 * Instance</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.SessionBeanInstance
	 * @generated
	 */
	public Adapter createSessionBeanInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EJBReferenceInstance <em>EJB Reference
	 * Instance</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EJBReferenceInstance
	 * @generated
	 */
	public Adapter createEJBReferenceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity <em>Enterprise Bean
	 * Security</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanSecurity
	 * @generated
	 */
	public Adapter createEnterpriseBeanSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.Role <em>Role</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity
	 * <em>Enterprise Bean Operation Security</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity
	 * @generated
	 */
	public Adapter createEnterpriseBeanOperationSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // Ejb31AdapterFactory
