/**
 */
package de.mkonersmann.ejb31.util;

import de.mkonersmann.ejb31.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see de.mkonersmann.ejb31.Ejb31Package
 * @generated
 */
public class Ejb31Switch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static Ejb31Package modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Ejb31Switch() {
		if (modelPackage == null) {
			modelPackage = Ejb31Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param ePackage
	 *            the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Ejb31Package.CLIENT: {
			Client client = (Client) theEObject;
			T result = caseClient(client);
			if (result == null)
				result = caseIdentifiedElement(client);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ENVIRONMENT_ENTRY: {
			EnvironmentEntry environmentEntry = (EnvironmentEntry) theEObject;
			T result = caseEnvironmentEntry(environmentEntry);
			if (result == null)
				result = caseIdentifiedElement(environmentEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ARCHIVE: {
			Archive archive = (Archive) theEObject;
			T result = caseArchive(archive);
			if (result == null)
				result = caseIdentifiedElement(archive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ENTERPRISE_ARCHIVE: {
			EnterpriseArchive enterpriseArchive = (EnterpriseArchive) theEObject;
			T result = caseEnterpriseArchive(enterpriseArchive);
			if (result == null)
				result = caseArchive(enterpriseArchive);
			if (result == null)
				result = caseIdentifiedElement(enterpriseArchive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.EJB_ARCHIVE: {
			EJBArchive ejbArchive = (EJBArchive) theEObject;
			T result = caseEJBArchive(ejbArchive);
			if (result == null)
				result = caseArchive(ejbArchive);
			if (result == null)
				result = caseIdentifiedElement(ejbArchive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.APPLICATION_ASSEMBLY_INFORMATION: {
			ApplicationAssemblyInformation applicationAssemblyInformation = (ApplicationAssemblyInformation) theEObject;
			T result = caseApplicationAssemblyInformation(applicationAssemblyInformation);
			if (result == null)
				result = caseIdentifiedElement(applicationAssemblyInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.LIBRARY: {
			Library library = (Library) theEObject;
			T result = caseLibrary(library);
			if (result == null)
				result = caseArchive(library);
			if (result == null)
				result = caseIdentifiedElement(library);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = caseIdentifiedElement(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.CONTAINER_SERVICE: {
			ContainerService containerService = (ContainerService) theEObject;
			T result = caseContainerService(containerService);
			if (result == null)
				result = caseIdentifiedElement(containerService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.SECURITY_SERVICE: {
			SecurityService securityService = (SecurityService) theEObject;
			T result = caseSecurityService(securityService);
			if (result == null)
				result = caseContainerService(securityService);
			if (result == null)
				result = caseIdentifiedElement(securityService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.CONCURRENCY_SERVICE: {
			ConcurrencyService concurrencyService = (ConcurrencyService) theEObject;
			T result = caseConcurrencyService(concurrencyService);
			if (result == null)
				result = caseContainerService(concurrencyService);
			if (result == null)
				result = caseIdentifiedElement(concurrencyService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.TRANSACTION_SERVICE: {
			TransactionService transactionService = (TransactionService) theEObject;
			T result = caseTransactionService(transactionService);
			if (result == null)
				result = caseContainerService(transactionService);
			if (result == null)
				result = caseIdentifiedElement(transactionService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.SECONDARY_STORAGE_SERVICE: {
			SecondaryStorageService secondaryStorageService = (SecondaryStorageService) theEObject;
			T result = caseSecondaryStorageService(secondaryStorageService);
			if (result == null)
				result = caseContainerService(secondaryStorageService);
			if (result == null)
				result = caseIdentifiedElement(secondaryStorageService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ENTERPRISE_BEAN: {
			EnterpriseBean enterpriseBean = (EnterpriseBean) theEObject;
			T result = caseEnterpriseBean(enterpriseBean);
			if (result == null)
				result = caseIdentifiedElement(enterpriseBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.STATELESS_SESSION_BEAN: {
			StatelessSessionBean statelessSessionBean = (StatelessSessionBean) theEObject;
			T result = caseStatelessSessionBean(statelessSessionBean);
			if (result == null)
				result = caseSessionBean(statelessSessionBean);
			if (result == null)
				result = caseEnterpriseBean(statelessSessionBean);
			if (result == null)
				result = caseIdentifiedElement(statelessSessionBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.SESSION_BEAN: {
			SessionBean sessionBean = (SessionBean) theEObject;
			T result = caseSessionBean(sessionBean);
			if (result == null)
				result = caseEnterpriseBean(sessionBean);
			if (result == null)
				result = caseIdentifiedElement(sessionBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.MESSAGE_DRIVEN_BEAN: {
			MessageDrivenBean messageDrivenBean = (MessageDrivenBean) theEObject;
			T result = caseMessageDrivenBean(messageDrivenBean);
			if (result == null)
				result = caseEnterpriseBean(messageDrivenBean);
			if (result == null)
				result = caseIdentifiedElement(messageDrivenBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.STATEFUL_SESSION_BEAN: {
			StatefulSessionBean statefulSessionBean = (StatefulSessionBean) theEObject;
			T result = caseStatefulSessionBean(statefulSessionBean);
			if (result == null)
				result = caseSessionBean(statefulSessionBean);
			if (result == null)
				result = caseEnterpriseBean(statefulSessionBean);
			if (result == null)
				result = caseIdentifiedElement(statefulSessionBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.SINGLETON_SESSION_BEAN: {
			SingletonSessionBean singletonSessionBean = (SingletonSessionBean) theEObject;
			T result = caseSingletonSessionBean(singletonSessionBean);
			if (result == null)
				result = caseSessionBean(singletonSessionBean);
			if (result == null)
				result = caseEnterpriseBean(singletonSessionBean);
			if (result == null)
				result = caseIdentifiedElement(singletonSessionBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.OPERATION_SIGNATURE: {
			OperationSignature operationSignature = (OperationSignature) theEObject;
			T result = caseOperationSignature(operationSignature);
			if (result == null)
				result = caseIdentifiedElement(operationSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.BUSINESS_INTERFACE: {
			BusinessInterface businessInterface = (BusinessInterface) theEObject;
			T result = caseBusinessInterface(businessInterface);
			if (result == null)
				result = caseIdentifiedElement(businessInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.BEAN_REFERENCE: {
			BeanReference beanReference = (BeanReference) theEObject;
			T result = caseBeanReference(beanReference);
			if (result == null)
				result = caseIdentifiedElement(beanReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.EJB_REFERENCE: {
			EJBReference ejbReference = (EJBReference) theEObject;
			T result = caseEJBReference(ejbReference);
			if (result == null)
				result = caseBeanReference(ejbReference);
			if (result == null)
				result = caseIdentifiedElement(ejbReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.OPERATION_PARAMETER: {
			OperationParameter operationParameter = (OperationParameter) theEObject;
			T result = caseOperationParameter(operationParameter);
			if (result == null)
				result = caseIdentifiedElement(operationParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.LOCAL_PROVISION: {
			LocalProvision localProvision = (LocalProvision) theEObject;
			T result = caseLocalProvision(localProvision);
			if (result == null)
				result = caseIdentifiedElement(localProvision);
			if (result == null)
				result = caseProvision(localProvision);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.REMOTE_PROVISION: {
			RemoteProvision remoteProvision = (RemoteProvision) theEObject;
			T result = caseRemoteProvision(remoteProvision);
			if (result == null)
				result = caseIdentifiedElement(remoteProvision);
			if (result == null)
				result = caseProvision(remoteProvision);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.MESSAGE_SELECTOR: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> messageSelector = (Map.Entry<String, String>) theEObject;
			T result = caseMessageSelector(messageSelector);
			if (result == null)
				result = caseIdentifiedElement((IdentifiedElement) messageSelector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.DATA_TYPE: {
			DataType dataType = (DataType) theEObject;
			T result = caseDataType(dataType);
			if (result == null)
				result = caseIdentifiedElement(dataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseIdentifiedElement(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.DATA_TYPE_OPERATION: {
			DataTypeOperation dataTypeOperation = (DataTypeOperation) theEObject;
			T result = caseDataTypeOperation(dataTypeOperation);
			if (result == null)
				result = caseIdentifiedElement(dataTypeOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.SESSION_BEAN_OPERATION: {
			SessionBeanOperation sessionBeanOperation = (SessionBeanOperation) theEObject;
			T result = caseSessionBeanOperation(sessionBeanOperation);
			if (result == null)
				result = caseOperation(sessionBeanOperation);
			if (result == null)
				result = caseIdentifiedElement(sessionBeanOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION: {
			MessageDrivenBeanOperation messageDrivenBeanOperation = (MessageDrivenBeanOperation) theEObject;
			T result = caseMessageDrivenBeanOperation(messageDrivenBeanOperation);
			if (result == null)
				result = caseOperation(messageDrivenBeanOperation);
			if (result == null)
				result = caseIdentifiedElement(messageDrivenBeanOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.SYNCHRONOUS_OPERATION: {
			SynchronousOperation synchronousOperation = (SynchronousOperation) theEObject;
			T result = caseSynchronousOperation(synchronousOperation);
			if (result == null)
				result = caseSessionBeanOperation(synchronousOperation);
			if (result == null)
				result = caseOperation(synchronousOperation);
			if (result == null)
				result = caseIdentifiedElement(synchronousOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ASYNCHRONOUS_OPERATION: {
			AsynchronousOperation asynchronousOperation = (AsynchronousOperation) theEObject;
			T result = caseAsynchronousOperation(asynchronousOperation);
			if (result == null)
				result = caseSessionBeanOperation(asynchronousOperation);
			if (result == null)
				result = caseOperation(asynchronousOperation);
			if (result == null)
				result = caseIdentifiedElement(asynchronousOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ENTITY_BEAN: {
			EntityBean entityBean = (EntityBean) theEObject;
			T result = caseEntityBean(entityBean);
			if (result == null)
				result = caseIdentifiedElement(entityBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ABSTRACT_ENTITY_ATTRIBUTE: {
			AbstractEntityAttribute abstractEntityAttribute = (AbstractEntityAttribute) theEObject;
			T result = caseAbstractEntityAttribute(abstractEntityAttribute);
			if (result == null)
				result = caseIdentifiedElement(abstractEntityAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE: {
			JavaTypeAttribute javaTypeAttribute = (JavaTypeAttribute) theEObject;
			T result = caseJavaTypeAttribute(javaTypeAttribute);
			if (result == null)
				result = caseAbstractEntityAttribute(javaTypeAttribute);
			if (result == null)
				result = caseIdentifiedElement(javaTypeAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ENTITY_ATTRIBUTE: {
			EntityAttribute entityAttribute = (EntityAttribute) theEObject;
			T result = caseEntityAttribute(entityAttribute);
			if (result == null)
				result = caseAbstractEntityAttribute(entityAttribute);
			if (result == null)
				result = caseIdentifiedElement(entityAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.EJB_PACKAGE: {
			EJBPackage ejbPackage = (EJBPackage) theEObject;
			T result = caseEJBPackage(ejbPackage);
			if (result == null)
				result = caseIdentifiedElement(ejbPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.IDENTIFIED_ELEMENT: {
			IdentifiedElement identifiedElement = (IdentifiedElement) theEObject;
			T result = caseIdentifiedElement(identifiedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.PROVISION: {
			Provision provision = (Provision) theEObject;
			T result = caseProvision(provision);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.SESSION_BEAN_INSTANCE: {
			SessionBeanInstance sessionBeanInstance = (SessionBeanInstance) theEObject;
			T result = caseSessionBeanInstance(sessionBeanInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.EJB_REFERENCE_INSTANCE: {
			EJBReferenceInstance ejbReferenceInstance = (EJBReferenceInstance) theEObject;
			T result = caseEJBReferenceInstance(ejbReferenceInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY: {
			EnterpriseBeanSecurity enterpriseBeanSecurity = (EnterpriseBeanSecurity) theEObject;
			T result = caseEnterpriseBeanSecurity(enterpriseBeanSecurity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Ejb31Package.ENTERPRISE_BEAN_OPERATION_SECURITY: {
			EnterpriseBeanOperationSecurity enterpriseBeanOperationSecurity = (EnterpriseBeanOperationSecurity) theEObject;
			T result = caseEnterpriseBeanOperationSecurity(enterpriseBeanOperationSecurity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Client</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Environment Entry</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Environment Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentEntry(EnvironmentEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Archive</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive(Archive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Enterprise Archive</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Enterprise Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterpriseArchive(EnterpriseArchive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJB
	 * Archive</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJB
	 *         Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJBArchive(EJBArchive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Application Assembly Information</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Application Assembly Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationAssemblyInformation(ApplicationAssemblyInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Library</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Container</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Container Service</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Container Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerService(ContainerService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Security Service</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Security Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityService(SecurityService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Concurrency Service</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Concurrency Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrencyService(ConcurrencyService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Transaction Service</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Transaction Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionService(TransactionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Secondary Storage Service</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Secondary Storage Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryStorageService(SecondaryStorageService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Enterprise Bean</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Enterprise Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterpriseBean(EnterpriseBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Stateless Session Bean</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Stateless Session Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatelessSessionBean(StatelessSessionBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Session Bean</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Session Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionBean(SessionBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Message Driven Bean</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Message Driven Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDrivenBean(MessageDrivenBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Stateful Session Bean</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Stateful Session Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatefulSessionBean(StatefulSessionBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Singleton Session Bean</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Singleton Session Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonSessionBean(SingletonSessionBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Operation Signature</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Operation Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationSignature(OperationSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Business Interface</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Business Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessInterface(BusinessInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean
	 * Reference</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean
	 *         Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanReference(BeanReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJB
	 * Reference</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJB
	 *         Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJBReference(EJBReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Operation Parameter</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Operation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameter(OperationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Local Provision</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Local Provision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalProvision(LocalProvision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Remote Provision</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Remote Provision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteProvision(RemoteProvision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Message Selector</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Message Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSelector(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data
	 * Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data
	 *         Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Operation</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data
	 * Type Operation</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data
	 *         Type Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeOperation(DataTypeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Session Bean Operation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Session Bean Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionBeanOperation(SessionBeanOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Message Driven Bean Operation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Message Driven Bean Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDrivenBeanOperation(MessageDrivenBeanOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Synchronous Operation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Synchronous Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousOperation(SynchronousOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Asynchronous Operation</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Asynchronous Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchronousOperation(AsynchronousOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Entity Bean</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Entity Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityBean(EntityBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Abstract Entity Attribute</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Abstract Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEntityAttribute(AbstractEntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java
	 * Type Attribute</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java
	 *         Type Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaTypeAttribute(JavaTypeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Entity Attribute</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAttribute(EntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJB
	 * Package</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJB
	 *         Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJBPackage(EJBPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Identified Element</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Provision</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Provision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvision(Provision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Session Bean Instance</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Session Bean Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionBeanInstance(SessionBeanInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJB
	 * Reference Instance</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJB
	 *         Reference Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJBReferenceInstance(EJBReferenceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Enterprise Bean Security</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Enterprise Bean Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterpriseBeanSecurity(EnterpriseBeanSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Role</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Enterprise Bean Operation Security</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Enterprise Bean Operation Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnterpriseBeanOperationSecurity(EnterpriseBeanOperationSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // Ejb31Switch
