/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class Ejb31FactoryImpl extends EFactoryImpl implements Ejb31Factory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static Ejb31Factory init() {
		try {
			Ejb31Factory theEjb31Factory = (Ejb31Factory) EPackage.Registry.INSTANCE.getEFactory(Ejb31Package.eNS_URI);
			if (theEjb31Factory != null) {
				return theEjb31Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ejb31FactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Ejb31FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Ejb31Package.ENVIRONMENT_ENTRY:
			return createEnvironmentEntry();
		case Ejb31Package.ENTERPRISE_ARCHIVE:
			return createEnterpriseArchive();
		case Ejb31Package.EJB_ARCHIVE:
			return createEJBArchive();
		case Ejb31Package.APPLICATION_ASSEMBLY_INFORMATION:
			return createApplicationAssemblyInformation();
		case Ejb31Package.LIBRARY:
			return createLibrary();
		case Ejb31Package.SECURITY_SERVICE:
			return createSecurityService();
		case Ejb31Package.CONCURRENCY_SERVICE:
			return createConcurrencyService();
		case Ejb31Package.TRANSACTION_SERVICE:
			return createTransactionService();
		case Ejb31Package.SECONDARY_STORAGE_SERVICE:
			return createSecondaryStorageService();
		case Ejb31Package.STATELESS_SESSION_BEAN:
			return createStatelessSessionBean();
		case Ejb31Package.SESSION_BEAN:
			return createSessionBean();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN:
			return createMessageDrivenBean();
		case Ejb31Package.STATEFUL_SESSION_BEAN:
			return createStatefulSessionBean();
		case Ejb31Package.SINGLETON_SESSION_BEAN:
			return createSingletonSessionBean();
		case Ejb31Package.OPERATION_SIGNATURE:
			return createOperationSignature();
		case Ejb31Package.BUSINESS_INTERFACE:
			return createBusinessInterface();
		case Ejb31Package.EJB_REFERENCE:
			return createEJBReference();
		case Ejb31Package.OPERATION_PARAMETER:
			return createOperationParameter();
		case Ejb31Package.LOCAL_PROVISION:
			return createLocalProvision();
		case Ejb31Package.MESSAGE_SELECTOR:
			return (EObject) createMessageSelector();
		case Ejb31Package.DATA_TYPE:
			return createDataType();
		case Ejb31Package.DATA_TYPE_OPERATION:
			return createDataTypeOperation();
		case Ejb31Package.MESSAGE_DRIVEN_BEAN_OPERATION:
			return createMessageDrivenBeanOperation();
		case Ejb31Package.SYNCHRONOUS_OPERATION:
			return createSynchronousOperation();
		case Ejb31Package.ASYNCHRONOUS_OPERATION:
			return createAsynchronousOperation();
		case Ejb31Package.ENTITY_BEAN:
			return createEntityBean();
		case Ejb31Package.JAVA_TYPE_ATTRIBUTE:
			return createJavaTypeAttribute();
		case Ejb31Package.ENTITY_ATTRIBUTE:
			return createEntityAttribute();
		case Ejb31Package.EJB_PACKAGE:
			return createEJBPackage();
		case Ejb31Package.IDENTIFIED_ELEMENT:
			return createIdentifiedElement();
		case Ejb31Package.SESSION_BEAN_INSTANCE:
			return createSessionBeanInstance();
		case Ejb31Package.EJB_REFERENCE_INSTANCE:
			return createEJBReferenceInstance();
		case Ejb31Package.ENTERPRISE_BEAN_SECURITY:
			return createEnterpriseBeanSecurity();
		case Ejb31Package.ROLE:
			return createRole();
		case Ejb31Package.ENTERPRISE_BEAN_OPERATION_SECURITY:
			return createEnterpriseBeanOperationSecurity();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Ejb31Package.DESTINATION_TYPE:
			return createDestinationTypeFromString(eDataType, initialValue);
		case Ejb31Package.ENTITY_TYPE_REFERENCE_MULTIPLICITY:
			return createEntityTypeReferenceMultiplicityFromString(eDataType, initialValue);
		case Ejb31Package.JAVA_TYPE_REFERENCE_MULTIPICITY:
			return createJavaTypeReferenceMultipicityFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Ejb31Package.DESTINATION_TYPE:
			return convertDestinationTypeToString(eDataType, instanceValue);
		case Ejb31Package.ENTITY_TYPE_REFERENCE_MULTIPLICITY:
			return convertEntityTypeReferenceMultiplicityToString(eDataType, instanceValue);
		case Ejb31Package.JAVA_TYPE_REFERENCE_MULTIPICITY:
			return convertJavaTypeReferenceMultipicityToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnvironmentEntry createEnvironmentEntry() {
		EnvironmentEntryImpl environmentEntry = new EnvironmentEntryImpl();
		return environmentEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnterpriseArchive createEnterpriseArchive() {
		EnterpriseArchiveImpl enterpriseArchive = new EnterpriseArchiveImpl();
		return enterpriseArchive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EJBArchive createEJBArchive() {
		EJBArchiveImpl ejbArchive = new EJBArchiveImpl();
		return ejbArchive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApplicationAssemblyInformation createApplicationAssemblyInformation() {
		ApplicationAssemblyInformationImpl applicationAssemblyInformation = new ApplicationAssemblyInformationImpl();
		return applicationAssemblyInformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SecurityService createSecurityService() {
		SecurityServiceImpl securityService = new SecurityServiceImpl();
		return securityService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConcurrencyService createConcurrencyService() {
		ConcurrencyServiceImpl concurrencyService = new ConcurrencyServiceImpl();
		return concurrencyService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransactionService createTransactionService() {
		TransactionServiceImpl transactionService = new TransactionServiceImpl();
		return transactionService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SecondaryStorageService createSecondaryStorageService() {
		SecondaryStorageServiceImpl secondaryStorageService = new SecondaryStorageServiceImpl();
		return secondaryStorageService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatelessSessionBean createStatelessSessionBean() {
		StatelessSessionBeanImpl statelessSessionBean = new StatelessSessionBeanImpl();
		return statelessSessionBean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SessionBean createSessionBean() {
		SessionBeanImpl sessionBean = new SessionBeanImpl();
		return sessionBean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MessageDrivenBean createMessageDrivenBean() {
		MessageDrivenBeanImpl messageDrivenBean = new MessageDrivenBeanImpl();
		return messageDrivenBean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatefulSessionBean createStatefulSessionBean() {
		StatefulSessionBeanImpl statefulSessionBean = new StatefulSessionBeanImpl();
		return statefulSessionBean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SingletonSessionBean createSingletonSessionBean() {
		SingletonSessionBeanImpl singletonSessionBean = new SingletonSessionBeanImpl();
		return singletonSessionBean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationSignature createOperationSignature() {
		OperationSignatureImpl operationSignature = new OperationSignatureImpl();
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BusinessInterface createBusinessInterface() {
		BusinessInterfaceImpl businessInterface = new BusinessInterfaceImpl();
		return businessInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EJBReference createEJBReference() {
		EJBReferenceImpl ejbReference = new EJBReferenceImpl();
		return ejbReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationParameter createOperationParameter() {
		OperationParameterImpl operationParameter = new OperationParameterImpl();
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LocalProvision createLocalProvision() {
		LocalProvisionImpl localProvision = new LocalProvisionImpl();
		return localProvision;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<String, String> createMessageSelector() {
		MessageSelectorImpl messageSelector = new MessageSelectorImpl();
		return messageSelector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataTypeOperation createDataTypeOperation() {
		DataTypeOperationImpl dataTypeOperation = new DataTypeOperationImpl();
		return dataTypeOperation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MessageDrivenBeanOperation createMessageDrivenBeanOperation() {
		MessageDrivenBeanOperationImpl messageDrivenBeanOperation = new MessageDrivenBeanOperationImpl();
		return messageDrivenBeanOperation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SynchronousOperation createSynchronousOperation() {
		SynchronousOperationImpl synchronousOperation = new SynchronousOperationImpl();
		return synchronousOperation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AsynchronousOperation createAsynchronousOperation() {
		AsynchronousOperationImpl asynchronousOperation = new AsynchronousOperationImpl();
		return asynchronousOperation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityBean createEntityBean() {
		EntityBeanImpl entityBean = new EntityBeanImpl();
		return entityBean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaTypeAttribute createJavaTypeAttribute() {
		JavaTypeAttributeImpl javaTypeAttribute = new JavaTypeAttributeImpl();
		return javaTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityAttribute createEntityAttribute() {
		EntityAttributeImpl entityAttribute = new EntityAttributeImpl();
		return entityAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EJBPackage createEJBPackage() {
		EJBPackageImpl ejbPackage = new EJBPackageImpl();
		return ejbPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IdentifiedElement createIdentifiedElement() {
		IdentifiedElementImpl identifiedElement = new IdentifiedElementImpl();
		return identifiedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SessionBeanInstance createSessionBeanInstance() {
		SessionBeanInstanceImpl sessionBeanInstance = new SessionBeanInstanceImpl();
		return sessionBeanInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EJBReferenceInstance createEJBReferenceInstance() {
		EJBReferenceInstanceImpl ejbReferenceInstance = new EJBReferenceInstanceImpl();
		return ejbReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnterpriseBeanSecurity createEnterpriseBeanSecurity() {
		EnterpriseBeanSecurityImpl enterpriseBeanSecurity = new EnterpriseBeanSecurityImpl();
		return enterpriseBeanSecurity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnterpriseBeanOperationSecurity createEnterpriseBeanOperationSecurity() {
		EnterpriseBeanOperationSecurityImpl enterpriseBeanOperationSecurity = new EnterpriseBeanOperationSecurityImpl();
		return enterpriseBeanOperationSecurity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DestinationType createDestinationTypeFromString(EDataType eDataType, String initialValue) {
		DestinationType result = DestinationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDestinationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityTypeReferenceMultiplicity createEntityTypeReferenceMultiplicityFromString(EDataType eDataType,
			String initialValue) {
		EntityTypeReferenceMultiplicity result = EntityTypeReferenceMultiplicity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertEntityTypeReferenceMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaTypeReferenceMultipicity createJavaTypeReferenceMultipicityFromString(EDataType eDataType,
			String initialValue) {
		JavaTypeReferenceMultipicity result = JavaTypeReferenceMultipicity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertJavaTypeReferenceMultipicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Ejb31Package getEjb31Package() {
		return (Ejb31Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ejb31Package getPackage() {
		return Ejb31Package.eINSTANCE;
	}

} // Ejb31FactoryImpl
