/**
 */
package de.mkonersmann.ejb31.impl;

import de.mkonersmann.ejb31.AbstractEntityAttribute;
import de.mkonersmann.ejb31.ApplicationAssemblyInformation;
import de.mkonersmann.ejb31.Archive;
import de.mkonersmann.ejb31.AsynchronousOperation;
import de.mkonersmann.ejb31.BeanReference;
import de.mkonersmann.ejb31.BusinessInterface;
import de.mkonersmann.ejb31.Client;
import de.mkonersmann.ejb31.ConcurrencyService;
import de.mkonersmann.ejb31.ContainerService;
import de.mkonersmann.ejb31.DataType;
import de.mkonersmann.ejb31.DataTypeOperation;
import de.mkonersmann.ejb31.DestinationType;
import de.mkonersmann.ejb31.EJBArchive;
import de.mkonersmann.ejb31.EJBPackage;
import de.mkonersmann.ejb31.EJBReference;
import de.mkonersmann.ejb31.EJBReferenceInstance;
import de.mkonersmann.ejb31.Ejb31Factory;
import de.mkonersmann.ejb31.Ejb31Package;
import de.mkonersmann.ejb31.EnterpriseArchive;
import de.mkonersmann.ejb31.EnterpriseBean;
import de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity;
import de.mkonersmann.ejb31.EnterpriseBeanSecurity;
import de.mkonersmann.ejb31.EntityAttribute;
import de.mkonersmann.ejb31.EntityBean;
import de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity;
import de.mkonersmann.ejb31.EnvironmentEntry;
import de.mkonersmann.ejb31.IdentifiedElement;
import de.mkonersmann.ejb31.JavaTypeAttribute;
import de.mkonersmann.ejb31.JavaTypeReferenceMultipicity;
import de.mkonersmann.ejb31.Library;
import de.mkonersmann.ejb31.LocalProvision;
import de.mkonersmann.ejb31.MessageDrivenBean;
import de.mkonersmann.ejb31.MessageDrivenBeanOperation;
import de.mkonersmann.ejb31.Operation;
import de.mkonersmann.ejb31.OperationParameter;
import de.mkonersmann.ejb31.OperationSignature;
import de.mkonersmann.ejb31.Provision;
import de.mkonersmann.ejb31.RemoteProvision;
import de.mkonersmann.ejb31.Role;
import de.mkonersmann.ejb31.SecondaryStorageService;
import de.mkonersmann.ejb31.SecurityService;
import de.mkonersmann.ejb31.SessionBean;
import de.mkonersmann.ejb31.SessionBeanInstance;
import de.mkonersmann.ejb31.SessionBeanOperation;
import de.mkonersmann.ejb31.SingletonSessionBean;
import de.mkonersmann.ejb31.StatefulSessionBean;
import de.mkonersmann.ejb31.StatelessSessionBean;
import de.mkonersmann.ejb31.SynchronousOperation;
import de.mkonersmann.ejb31.TransactionService;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class Ejb31PackageImpl extends EPackageImpl implements Ejb31Package {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass environmentEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass archiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enterpriseArchiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ejbArchiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass applicationAssemblyInformationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass containerServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass securityServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass concurrencyServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass transactionServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass secondaryStorageServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enterpriseBeanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statelessSessionBeanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sessionBeanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass messageDrivenBeanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statefulSessionBeanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass singletonSessionBeanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass operationSignatureEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass businessInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass beanReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ejbReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass operationParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass localProvisionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass remoteProvisionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass messageSelectorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dataTypeOperationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sessionBeanOperationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass messageDrivenBeanOperationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass synchronousOperationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass asynchronousOperationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityBeanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abstractEntityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaTypeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ejbPackageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass provisionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sessionBeanInstanceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ejbReferenceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enterpriseBeanSecurityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enterpriseBeanOperationSecurityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum destinationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum entityTypeReferenceMultiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum javaTypeReferenceMultipicityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mkonersmann.ejb31.Ejb31Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ejb31PackageImpl() {
		super(eNS_URI, Ejb31Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link Ejb31Package#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ejb31Package init() {
		if (isInited)
			return (Ejb31Package) EPackage.Registry.INSTANCE.getEPackage(Ejb31Package.eNS_URI);

		// Obtain or create and register package
		Ejb31PackageImpl theEjb31Package = (Ejb31PackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Ejb31PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Ejb31PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEjb31Package.createPackageContents();

		// Initialize created meta-data
		theEjb31Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEjb31Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ejb31Package.eNS_URI, theEjb31Package);
		return theEjb31Package;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnvironmentEntry() {
		return environmentEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getArchive() {
		return archiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getArchive_Name() {
		return (EAttribute) archiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getArchive_Container() {
		return (EReference) archiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnterpriseArchive() {
		return enterpriseArchiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseArchive_EjbArchives() {
		return (EReference) enterpriseArchiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseArchive_AssemblyInformation() {
		return (EReference) enterpriseArchiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseArchive_Libraries() {
		return (EReference) enterpriseArchiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEJBArchive() {
		return ejbArchiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBArchive_RootPackages() {
		return (EReference) ejbArchiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getApplicationAssemblyInformation() {
		return applicationAssemblyInformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLibrary_RootPackages() {
		return (EReference) libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getContainer_Provides() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getContainer_DeployedArchives() {
		return (EReference) containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getContainer_ConnectedTo() {
		return (EReference) containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getContainer_EnvironmentEntries() {
		return (EReference) containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getContainerService() {
		return containerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSecurityService() {
		return securityServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConcurrencyService() {
		return concurrencyServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTransactionService() {
		return transactionServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSecondaryStorageService() {
		return secondaryStorageServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnterpriseBean() {
		return enterpriseBeanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEnterpriseBean_Name() {
		return (EAttribute) enterpriseBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBean_EnvironmentEntries() {
		return (EReference) enterpriseBeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBean_ServiceDependencies() {
		return (EReference) enterpriseBeanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBean_BeanReferences() {
		return (EReference) enterpriseBeanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBean_SecuritySpecs() {
		return (EReference) enterpriseBeanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatelessSessionBean() {
		return statelessSessionBeanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSessionBean() {
		return sessionBeanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSessionBean_OwnedOperationSignature() {
		return (EReference) sessionBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSessionBean_LocalBusinessInterfaces() {
		return (EReference) sessionBeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSessionBean_OwnedOperations() {
		return (EReference) sessionBeanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSessionBean_RemoteBusinessInterfaces() {
		return (EReference) sessionBeanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSessionBean_Instances() {
		return (EReference) sessionBeanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMessageDrivenBean() {
		return messageDrivenBeanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMessageDrivenBean_DestinationType() {
		return (EAttribute) messageDrivenBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMessageDrivenBean_MessageSelectorEntries() {
		return (EReference) messageDrivenBeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMessageDrivenBean_OwnedOperationSignatures() {
		return (EReference) messageDrivenBeanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMessageDrivenBean_OwnedOperations() {
		return (EReference) messageDrivenBeanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatefulSessionBean() {
		return statefulSessionBeanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSingletonSessionBean() {
		return singletonSessionBeanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSingletonSessionBean_Startup() {
		return (EAttribute) singletonSessionBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOperationSignature() {
		return operationSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOperationSignature_Name() {
		return (EAttribute) operationSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOperationSignature_ReturnJavaType() {
		return (EAttribute) operationSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperationSignature_Parameters() {
		return (EReference) operationSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOperationSignature_Exceptions() {
		return (EAttribute) operationSignatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperationSignature_ReturnApplicationType() {
		return (EReference) operationSignatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBusinessInterface() {
		return businessInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBusinessInterface_OwnedOperationSignature() {
		return (EReference) businessInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBusinessInterface_Name() {
		return (EAttribute) businessInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBeanReference() {
		return beanReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeanReference_Reference() {
		return (EReference) beanReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBeanReference_Description() {
		return (EAttribute) beanReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEJBReference() {
		return ejbReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBReference_Sessionbean() {
		return (EReference) ejbReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOperationParameter() {
		return operationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOperationParameter_Name() {
		return (EAttribute) operationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOperationParameter_JavaType() {
		return (EAttribute) operationParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperationParameter_ApplicationDataType() {
		return (EReference) operationParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLocalProvision() {
		return localProvisionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLocalProvision_Interface() {
		return (EReference) localProvisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRemoteProvision() {
		return remoteProvisionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRemoteProvision_Interface() {
		return (EReference) remoteProvisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMessageSelector() {
		return messageSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMessageSelector_Key() {
		return (EAttribute) messageSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMessageSelector_Value() {
		return (EAttribute) messageSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDataType_Name() {
		return (EAttribute) dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataType_SuperType() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataType_OwnedOperations() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperation_Signature() {
		return (EReference) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperation_SecuritySpecs() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataTypeOperation() {
		return dataTypeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDataTypeOperation_Signature() {
		return (EReference) dataTypeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSessionBeanOperation() {
		return sessionBeanOperationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSessionBeanOperation_PreDestroy() {
		return (EAttribute) sessionBeanOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSessionBeanOperation_PostConstruct() {
		return (EAttribute) sessionBeanOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSessionBeanOperation_PrePassivate() {
		return (EAttribute) sessionBeanOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSessionBeanOperation_PostActivate() {
		return (EAttribute) sessionBeanOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMessageDrivenBeanOperation() {
		return messageDrivenBeanOperationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMessageDrivenBeanOperation_PostConstruct() {
		return (EAttribute) messageDrivenBeanOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMessageDrivenBeanOperation_PreDestroy() {
		return (EAttribute) messageDrivenBeanOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSynchronousOperation() {
		return synchronousOperationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAsynchronousOperation() {
		return asynchronousOperationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityBean() {
		return entityBeanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityBean_Name() {
		return (EAttribute) entityBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityBean_Attributes() {
		return (EReference) entityBeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityBean_SuperType() {
		return (EReference) entityBeanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAbstractEntityAttribute() {
		return abstractEntityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAbstractEntityAttribute_Name() {
		return (EAttribute) abstractEntityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJavaTypeAttribute() {
		return javaTypeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getJavaTypeAttribute_Type() {
		return (EAttribute) javaTypeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getJavaTypeAttribute_Multiplicity() {
		return (EAttribute) javaTypeAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityAttribute() {
		return entityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityAttribute_Type() {
		return (EReference) entityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityAttribute_Multiplicity() {
		return (EAttribute) entityAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEJBPackage() {
		return ejbPackageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBPackage_Beans() {
		return (EReference) ejbPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBPackage_Interfaces() {
		return (EReference) ejbPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEJBPackage_Name() {
		return (EAttribute) ejbPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBPackage_DataTypes() {
		return (EReference) ejbPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBPackage_Children() {
		return (EReference) ejbPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute) identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProvision() {
		return provisionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSessionBeanInstance() {
		return sessionBeanInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSessionBeanInstance_Name() {
		return (EAttribute) sessionBeanInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSessionBeanInstance_Referenceinstances() {
		return (EReference) sessionBeanInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEJBReferenceInstance() {
		return ejbReferenceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBReferenceInstance_Ejbreference() {
		return (EReference) ejbReferenceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEJBReferenceInstance_Sessionbeaninstance() {
		return (EReference) ejbReferenceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnterpriseBeanSecurity() {
		return enterpriseBeanSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEnterpriseBeanSecurity_PermitAll() {
		return (EAttribute) enterpriseBeanSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEnterpriseBeanSecurity_DenyAll() {
		return (EAttribute) enterpriseBeanSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBeanSecurity_RolesAllowed() {
		return (EReference) enterpriseBeanSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBeanSecurity_RolesDeclared() {
		return (EReference) enterpriseBeanSecurityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBeanSecurity_RunAs() {
		return (EReference) enterpriseBeanSecurityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnterpriseBeanOperationSecurity() {
		return enterpriseBeanOperationSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEnterpriseBeanOperationSecurity_PermitAll() {
		return (EAttribute) enterpriseBeanOperationSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEnterpriseBeanOperationSecurity_DenyAll() {
		return (EAttribute) enterpriseBeanOperationSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnterpriseBeanOperationSecurity_RolesAllowed() {
		return (EReference) enterpriseBeanOperationSecurityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getDestinationType() {
		return destinationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getEntityTypeReferenceMultiplicity() {
		return entityTypeReferenceMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getJavaTypeReferenceMultipicity() {
		return javaTypeReferenceMultipicityEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Ejb31Factory getEjb31Factory() {
		return (Ejb31Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		clientEClass = createEClass(CLIENT);

		environmentEntryEClass = createEClass(ENVIRONMENT_ENTRY);

		archiveEClass = createEClass(ARCHIVE);
		createEAttribute(archiveEClass, ARCHIVE__NAME);
		createEReference(archiveEClass, ARCHIVE__CONTAINER);

		enterpriseArchiveEClass = createEClass(ENTERPRISE_ARCHIVE);
		createEReference(enterpriseArchiveEClass, ENTERPRISE_ARCHIVE__EJB_ARCHIVES);
		createEReference(enterpriseArchiveEClass, ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION);
		createEReference(enterpriseArchiveEClass, ENTERPRISE_ARCHIVE__LIBRARIES);

		ejbArchiveEClass = createEClass(EJB_ARCHIVE);
		createEReference(ejbArchiveEClass, EJB_ARCHIVE__ROOT_PACKAGES);

		applicationAssemblyInformationEClass = createEClass(APPLICATION_ASSEMBLY_INFORMATION);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__ROOT_PACKAGES);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__PROVIDES);
		createEReference(containerEClass, CONTAINER__DEPLOYED_ARCHIVES);
		createEReference(containerEClass, CONTAINER__CONNECTED_TO);
		createEReference(containerEClass, CONTAINER__ENVIRONMENT_ENTRIES);

		containerServiceEClass = createEClass(CONTAINER_SERVICE);

		securityServiceEClass = createEClass(SECURITY_SERVICE);

		concurrencyServiceEClass = createEClass(CONCURRENCY_SERVICE);

		transactionServiceEClass = createEClass(TRANSACTION_SERVICE);

		secondaryStorageServiceEClass = createEClass(SECONDARY_STORAGE_SERVICE);

		enterpriseBeanEClass = createEClass(ENTERPRISE_BEAN);
		createEAttribute(enterpriseBeanEClass, ENTERPRISE_BEAN__NAME);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__SERVICE_DEPENDENCIES);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__BEAN_REFERENCES);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__SECURITY_SPECS);

		statelessSessionBeanEClass = createEClass(STATELESS_SESSION_BEAN);

		sessionBeanEClass = createEClass(SESSION_BEAN);
		createEReference(sessionBeanEClass, SESSION_BEAN__OWNED_OPERATION_SIGNATURE);
		createEReference(sessionBeanEClass, SESSION_BEAN__LOCAL_BUSINESS_INTERFACES);
		createEReference(sessionBeanEClass, SESSION_BEAN__OWNED_OPERATIONS);
		createEReference(sessionBeanEClass, SESSION_BEAN__REMOTE_BUSINESS_INTERFACES);
		createEReference(sessionBeanEClass, SESSION_BEAN__INSTANCES);

		messageDrivenBeanEClass = createEClass(MESSAGE_DRIVEN_BEAN);
		createEAttribute(messageDrivenBeanEClass, MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE);
		createEReference(messageDrivenBeanEClass, MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES);
		createEReference(messageDrivenBeanEClass, MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES);
		createEReference(messageDrivenBeanEClass, MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS);

		statefulSessionBeanEClass = createEClass(STATEFUL_SESSION_BEAN);

		singletonSessionBeanEClass = createEClass(SINGLETON_SESSION_BEAN);
		createEAttribute(singletonSessionBeanEClass, SINGLETON_SESSION_BEAN__STARTUP);

		operationSignatureEClass = createEClass(OPERATION_SIGNATURE);
		createEAttribute(operationSignatureEClass, OPERATION_SIGNATURE__NAME);
		createEAttribute(operationSignatureEClass, OPERATION_SIGNATURE__RETURN_JAVA_TYPE);
		createEReference(operationSignatureEClass, OPERATION_SIGNATURE__PARAMETERS);
		createEAttribute(operationSignatureEClass, OPERATION_SIGNATURE__EXCEPTIONS);
		createEReference(operationSignatureEClass, OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE);

		businessInterfaceEClass = createEClass(BUSINESS_INTERFACE);
		createEReference(businessInterfaceEClass, BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE);
		createEAttribute(businessInterfaceEClass, BUSINESS_INTERFACE__NAME);

		beanReferenceEClass = createEClass(BEAN_REFERENCE);
		createEReference(beanReferenceEClass, BEAN_REFERENCE__REFERENCE);
		createEAttribute(beanReferenceEClass, BEAN_REFERENCE__DESCRIPTION);

		ejbReferenceEClass = createEClass(EJB_REFERENCE);
		createEReference(ejbReferenceEClass, EJB_REFERENCE__SESSIONBEAN);

		operationParameterEClass = createEClass(OPERATION_PARAMETER);
		createEAttribute(operationParameterEClass, OPERATION_PARAMETER__NAME);
		createEAttribute(operationParameterEClass, OPERATION_PARAMETER__JAVA_TYPE);
		createEReference(operationParameterEClass, OPERATION_PARAMETER__APPLICATION_DATA_TYPE);

		localProvisionEClass = createEClass(LOCAL_PROVISION);
		createEReference(localProvisionEClass, LOCAL_PROVISION__INTERFACE);

		remoteProvisionEClass = createEClass(REMOTE_PROVISION);
		createEReference(remoteProvisionEClass, REMOTE_PROVISION__INTERFACE);

		messageSelectorEClass = createEClass(MESSAGE_SELECTOR);
		createEAttribute(messageSelectorEClass, MESSAGE_SELECTOR__KEY);
		createEAttribute(messageSelectorEClass, MESSAGE_SELECTOR__VALUE);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__NAME);
		createEReference(dataTypeEClass, DATA_TYPE__SUPER_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_OPERATIONS);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__SIGNATURE);
		createEReference(operationEClass, OPERATION__SECURITY_SPECS);

		dataTypeOperationEClass = createEClass(DATA_TYPE_OPERATION);
		createEReference(dataTypeOperationEClass, DATA_TYPE_OPERATION__SIGNATURE);

		sessionBeanOperationEClass = createEClass(SESSION_BEAN_OPERATION);
		createEAttribute(sessionBeanOperationEClass, SESSION_BEAN_OPERATION__PRE_DESTROY);
		createEAttribute(sessionBeanOperationEClass, SESSION_BEAN_OPERATION__POST_CONSTRUCT);
		createEAttribute(sessionBeanOperationEClass, SESSION_BEAN_OPERATION__PRE_PASSIVATE);
		createEAttribute(sessionBeanOperationEClass, SESSION_BEAN_OPERATION__POST_ACTIVATE);

		messageDrivenBeanOperationEClass = createEClass(MESSAGE_DRIVEN_BEAN_OPERATION);
		createEAttribute(messageDrivenBeanOperationEClass, MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT);
		createEAttribute(messageDrivenBeanOperationEClass, MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY);

		synchronousOperationEClass = createEClass(SYNCHRONOUS_OPERATION);

		asynchronousOperationEClass = createEClass(ASYNCHRONOUS_OPERATION);

		entityBeanEClass = createEClass(ENTITY_BEAN);
		createEAttribute(entityBeanEClass, ENTITY_BEAN__NAME);
		createEReference(entityBeanEClass, ENTITY_BEAN__ATTRIBUTES);
		createEReference(entityBeanEClass, ENTITY_BEAN__SUPER_TYPE);

		abstractEntityAttributeEClass = createEClass(ABSTRACT_ENTITY_ATTRIBUTE);
		createEAttribute(abstractEntityAttributeEClass, ABSTRACT_ENTITY_ATTRIBUTE__NAME);

		javaTypeAttributeEClass = createEClass(JAVA_TYPE_ATTRIBUTE);
		createEAttribute(javaTypeAttributeEClass, JAVA_TYPE_ATTRIBUTE__TYPE);
		createEAttribute(javaTypeAttributeEClass, JAVA_TYPE_ATTRIBUTE__MULTIPLICITY);

		entityAttributeEClass = createEClass(ENTITY_ATTRIBUTE);
		createEReference(entityAttributeEClass, ENTITY_ATTRIBUTE__TYPE);
		createEAttribute(entityAttributeEClass, ENTITY_ATTRIBUTE__MULTIPLICITY);

		ejbPackageEClass = createEClass(EJB_PACKAGE);
		createEReference(ejbPackageEClass, EJB_PACKAGE__BEANS);
		createEReference(ejbPackageEClass, EJB_PACKAGE__INTERFACES);
		createEAttribute(ejbPackageEClass, EJB_PACKAGE__NAME);
		createEReference(ejbPackageEClass, EJB_PACKAGE__DATA_TYPES);
		createEReference(ejbPackageEClass, EJB_PACKAGE__CHILDREN);

		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		provisionEClass = createEClass(PROVISION);

		sessionBeanInstanceEClass = createEClass(SESSION_BEAN_INSTANCE);
		createEAttribute(sessionBeanInstanceEClass, SESSION_BEAN_INSTANCE__NAME);
		createEReference(sessionBeanInstanceEClass, SESSION_BEAN_INSTANCE__REFERENCEINSTANCES);

		ejbReferenceInstanceEClass = createEClass(EJB_REFERENCE_INSTANCE);
		createEReference(ejbReferenceInstanceEClass, EJB_REFERENCE_INSTANCE__EJBREFERENCE);
		createEReference(ejbReferenceInstanceEClass, EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE);

		enterpriseBeanSecurityEClass = createEClass(ENTERPRISE_BEAN_SECURITY);
		createEAttribute(enterpriseBeanSecurityEClass, ENTERPRISE_BEAN_SECURITY__PERMIT_ALL);
		createEAttribute(enterpriseBeanSecurityEClass, ENTERPRISE_BEAN_SECURITY__DENY_ALL);
		createEReference(enterpriseBeanSecurityEClass, ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED);
		createEReference(enterpriseBeanSecurityEClass, ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED);
		createEReference(enterpriseBeanSecurityEClass, ENTERPRISE_BEAN_SECURITY__RUN_AS);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);

		enterpriseBeanOperationSecurityEClass = createEClass(ENTERPRISE_BEAN_OPERATION_SECURITY);
		createEAttribute(enterpriseBeanOperationSecurityEClass, ENTERPRISE_BEAN_OPERATION_SECURITY__PERMIT_ALL);
		createEAttribute(enterpriseBeanOperationSecurityEClass, ENTERPRISE_BEAN_OPERATION_SECURITY__DENY_ALL);
		createEReference(enterpriseBeanOperationSecurityEClass, ENTERPRISE_BEAN_OPERATION_SECURITY__ROLES_ALLOWED);

		// Create enums
		destinationTypeEEnum = createEEnum(DESTINATION_TYPE);
		entityTypeReferenceMultiplicityEEnum = createEEnum(ENTITY_TYPE_REFERENCE_MULTIPLICITY);
		javaTypeReferenceMultipicityEEnum = createEEnum(JAVA_TYPE_REFERENCE_MULTIPICITY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientEClass.getESuperTypes().add(this.getIdentifiedElement());
		environmentEntryEClass.getESuperTypes().add(this.getIdentifiedElement());
		archiveEClass.getESuperTypes().add(this.getIdentifiedElement());
		enterpriseArchiveEClass.getESuperTypes().add(this.getArchive());
		ejbArchiveEClass.getESuperTypes().add(this.getArchive());
		applicationAssemblyInformationEClass.getESuperTypes().add(this.getIdentifiedElement());
		libraryEClass.getESuperTypes().add(this.getArchive());
		containerEClass.getESuperTypes().add(this.getIdentifiedElement());
		containerServiceEClass.getESuperTypes().add(this.getIdentifiedElement());
		securityServiceEClass.getESuperTypes().add(this.getContainerService());
		concurrencyServiceEClass.getESuperTypes().add(this.getContainerService());
		transactionServiceEClass.getESuperTypes().add(this.getContainerService());
		secondaryStorageServiceEClass.getESuperTypes().add(this.getContainerService());
		enterpriseBeanEClass.getESuperTypes().add(this.getIdentifiedElement());
		statelessSessionBeanEClass.getESuperTypes().add(this.getSessionBean());
		sessionBeanEClass.getESuperTypes().add(this.getEnterpriseBean());
		messageDrivenBeanEClass.getESuperTypes().add(this.getEnterpriseBean());
		statefulSessionBeanEClass.getESuperTypes().add(this.getSessionBean());
		singletonSessionBeanEClass.getESuperTypes().add(this.getSessionBean());
		operationSignatureEClass.getESuperTypes().add(this.getIdentifiedElement());
		businessInterfaceEClass.getESuperTypes().add(this.getIdentifiedElement());
		beanReferenceEClass.getESuperTypes().add(this.getIdentifiedElement());
		ejbReferenceEClass.getESuperTypes().add(this.getBeanReference());
		operationParameterEClass.getESuperTypes().add(this.getIdentifiedElement());
		localProvisionEClass.getESuperTypes().add(this.getIdentifiedElement());
		localProvisionEClass.getESuperTypes().add(this.getProvision());
		remoteProvisionEClass.getESuperTypes().add(this.getIdentifiedElement());
		remoteProvisionEClass.getESuperTypes().add(this.getProvision());
		messageSelectorEClass.getESuperTypes().add(this.getIdentifiedElement());
		dataTypeEClass.getESuperTypes().add(this.getIdentifiedElement());
		operationEClass.getESuperTypes().add(this.getIdentifiedElement());
		dataTypeOperationEClass.getESuperTypes().add(this.getIdentifiedElement());
		sessionBeanOperationEClass.getESuperTypes().add(this.getOperation());
		messageDrivenBeanOperationEClass.getESuperTypes().add(this.getOperation());
		synchronousOperationEClass.getESuperTypes().add(this.getSessionBeanOperation());
		asynchronousOperationEClass.getESuperTypes().add(this.getSessionBeanOperation());
		entityBeanEClass.getESuperTypes().add(this.getIdentifiedElement());
		abstractEntityAttributeEClass.getESuperTypes().add(this.getIdentifiedElement());
		javaTypeAttributeEClass.getESuperTypes().add(this.getAbstractEntityAttribute());
		entityAttributeEClass.getESuperTypes().add(this.getAbstractEntityAttribute());
		ejbPackageEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(clientEClass, Client.class, "Client", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentEntryEClass, EnvironmentEntry.class, "EnvironmentEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(archiveEClass, Archive.class, "Archive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchive_Name(), ecorePackage.getEString(), "name", null, 1, 1, Archive.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchive_Container(), this.getContainer(), this.getContainer_DeployedArchives(), "container",
				null, 0, -1, Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enterpriseArchiveEClass, EnterpriseArchive.class, "EnterpriseArchive", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterpriseArchive_EjbArchives(), this.getEJBArchive(), null, "ejbArchives", null, 0, -1,
				EnterpriseArchive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseArchive_AssemblyInformation(), this.getApplicationAssemblyInformation(), null,
				"assemblyInformation", null, 1, 1, EnterpriseArchive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseArchive_Libraries(), this.getLibrary(), null, "libraries", null, 0, -1,
				EnterpriseArchive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejbArchiveEClass, EJBArchive.class, "EJBArchive", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEJBArchive_RootPackages(), this.getEJBPackage(), null, "rootPackages", null, 1, -1,
				EJBArchive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationAssemblyInformationEClass, ApplicationAssemblyInformation.class,
				"ApplicationAssemblyInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_RootPackages(), this.getEJBPackage(), null, "rootPackages", null, 1, -1,
				Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, de.mkonersmann.ejb31.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Provides(), this.getContainerService(), null, "provides", null, 0, -1,
				de.mkonersmann.ejb31.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_DeployedArchives(), this.getArchive(), this.getArchive_Container(),
				"deployedArchives", null, 0, -1, de.mkonersmann.ejb31.Container.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_ConnectedTo(), this.getClient(), null, "connectedTo", null, 0, -1,
				de.mkonersmann.ejb31.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_EnvironmentEntries(), this.getEnvironmentEntry(), null, "environmentEntries", null,
				0, -1, de.mkonersmann.ejb31.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerServiceEClass, ContainerService.class, "ContainerService", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityServiceEClass, SecurityService.class, "SecurityService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(concurrencyServiceEClass, ConcurrencyService.class, "ConcurrencyService", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transactionServiceEClass, TransactionService.class, "TransactionService", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(secondaryStorageServiceEClass, SecondaryStorageService.class, "SecondaryStorageService",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enterpriseBeanEClass, EnterpriseBean.class, "EnterpriseBean", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnterpriseBean_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnterpriseBean.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_EnvironmentEntries(), this.getEnvironmentEntry(), null, "environmentEntries",
				null, 0, -1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_ServiceDependencies(), this.getContainerService(), null, "serviceDependencies",
				null, 0, -1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_BeanReferences(), this.getBeanReference(), null, "beanReferences", null, 0, -1,
				EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_SecuritySpecs(), this.getEnterpriseBeanSecurity(), null, "securitySpecs", null,
				0, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statelessSessionBeanEClass, StatelessSessionBean.class, "StatelessSessionBean", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sessionBeanEClass, SessionBean.class, "SessionBean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSessionBean_OwnedOperationSignature(), this.getOperationSignature(), null,
				"ownedOperationSignature", null, 0, -1, SessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionBean_LocalBusinessInterfaces(), this.getLocalProvision(), null,
				"localBusinessInterfaces", null, 0, -1, SessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionBean_OwnedOperations(), this.getSessionBeanOperation(), null, "ownedOperations", null,
				0, -1, SessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionBean_RemoteBusinessInterfaces(), this.getRemoteProvision(), null,
				"remoteBusinessInterfaces", null, 0, -1, SessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionBean_Instances(), this.getSessionBeanInstance(), null, "instances", null, 0, -1,
				SessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageDrivenBeanEClass, MessageDrivenBean.class, "MessageDrivenBean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageDrivenBean_DestinationType(), this.getDestinationType(), "destinationType", null, 1, 1,
				MessageDrivenBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDrivenBean_MessageSelectorEntries(), this.getMessageSelector(), null,
				"messageSelectorEntries", null, 0, -1, MessageDrivenBean.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDrivenBean_OwnedOperationSignatures(), this.getOperationSignature(), null,
				"ownedOperationSignatures", null, 0, -1, MessageDrivenBean.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDrivenBean_OwnedOperations(), this.getMessageDrivenBeanOperation(), null,
				"ownedOperations", null, 0, -1, MessageDrivenBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statefulSessionBeanEClass, StatefulSessionBean.class, "StatefulSessionBean", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonSessionBeanEClass, SingletonSessionBean.class, "SingletonSessionBean", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingletonSessionBean_Startup(), ecorePackage.getEBoolean(), "startup", "false", 1, 1,
				SingletonSessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationSignatureEClass, OperationSignature.class, "OperationSignature", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationSignature_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationSignature_ReturnJavaType(), ecorePackage.getEJavaClass(), "returnJavaType", null, 0,
				1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationSignature_Parameters(), this.getOperationParameter(), null, "parameters", null, 0,
				-1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationSignature_Exceptions(), ecorePackage.getEJavaClass(), "exceptions", null, 0, -1,
				OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperationSignature_ReturnApplicationType(), this.getDataType(), null, "returnApplicationType",
				null, 0, 1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessInterfaceEClass, BusinessInterface.class, "BusinessInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessInterface_OwnedOperationSignature(), this.getOperationSignature(), null,
				"ownedOperationSignature", null, 0, -1, BusinessInterface.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				BusinessInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(beanReferenceEClass, BeanReference.class, "BeanReference", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeanReference_Reference(), this.getProvision(), null, "reference", null, 1, 1,
				BeanReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeanReference_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				BeanReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ejbReferenceEClass, EJBReference.class, "EJBReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEJBReference_Sessionbean(), this.getSessionBean(), null, "sessionbean", null, 1, 1,
				EJBReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationParameterEClass, OperationParameter.class, "OperationParameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationParameter_JavaType(), ecorePackage.getEJavaClass(), "javaType", null, 0, 1,
				OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperationParameter_ApplicationDataType(), this.getDataType(), null, "applicationDataType",
				null, 0, 1, OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localProvisionEClass, LocalProvision.class, "LocalProvision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalProvision_Interface(), this.getBusinessInterface(), null, "interface", null, 1, 1,
				LocalProvision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteProvisionEClass, RemoteProvision.class, "RemoteProvision", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteProvision_Interface(), this.getBusinessInterface(), null, "interface", null, 1, 1,
				RemoteProvision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSelectorEClass, Map.Entry.class, "MessageSelector", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageSelector_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageSelector_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_SuperType(), this.getDataType(), null, "superType", null, 0, 1, DataType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_OwnedOperations(), this.getDataTypeOperation(), null, "ownedOperations", null, 0, -1,
				DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Signature(), this.getOperationSignature(), null, "signature", null, 1, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_SecuritySpecs(), this.getEnterpriseBeanOperationSecurity(), null, "securitySpecs",
				null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeOperationEClass, DataTypeOperation.class, "DataTypeOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeOperation_Signature(), this.getOperationSignature(), null, "signature", null, 1, 1,
				DataTypeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionBeanOperationEClass, SessionBeanOperation.class, "SessionBeanOperation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSessionBeanOperation_PreDestroy(), ecorePackage.getEBoolean(), "preDestroy", "false", 0, 1,
				SessionBeanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionBeanOperation_PostConstruct(), ecorePackage.getEBoolean(), "postConstruct", "false", 0,
				1, SessionBeanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionBeanOperation_PrePassivate(), ecorePackage.getEBoolean(), "prePassivate", "false", 0,
				1, SessionBeanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionBeanOperation_PostActivate(), ecorePackage.getEBoolean(), "postActivate", "false", 0,
				1, SessionBeanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageDrivenBeanOperationEClass, MessageDrivenBeanOperation.class, "MessageDrivenBeanOperation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageDrivenBeanOperation_PostConstruct(), ecorePackage.getEBoolean(), "postConstruct",
				"false", 0, 1, MessageDrivenBeanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDrivenBeanOperation_PreDestroy(), ecorePackage.getEBoolean(), "preDestroy", "false", 0,
				1, MessageDrivenBeanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronousOperationEClass, SynchronousOperation.class, "SynchronousOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asynchronousOperationEClass, AsynchronousOperation.class, "AsynchronousOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityBeanEClass, EntityBean.class, "EntityBean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityBean_Name(), ecorePackage.getEString(), "name", null, 1, 1, EntityBean.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityBean_Attributes(), this.getAbstractEntityAttribute(), null, "attributes", null, 0, -1,
				EntityBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityBean_SuperType(), this.getEntityBean(), null, "superType", null, 0, 1, EntityBean.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEntityAttributeEClass, AbstractEntityAttribute.class, "AbstractEntityAttribute", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractEntityAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractEntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaTypeAttributeEClass, JavaTypeAttribute.class, "JavaTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaTypeAttribute_Type(), ecorePackage.getEJavaClass(), "type", null, 1, 1,
				JavaTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaTypeAttribute_Multiplicity(), this.getJavaTypeReferenceMultipicity(), "multiplicity",
				"ONE_TO_ONE", 1, 1, JavaTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityAttributeEClass, EntityAttribute.class, "EntityAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityAttribute_Type(), this.getEntityBean(), null, "type", null, 1, 1, EntityAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAttribute_Multiplicity(), this.getEntityTypeReferenceMultiplicity(), "multiplicity",
				"ONE_TO_ONE", 1, 1, EntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejbPackageEClass, EJBPackage.class, "EJBPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEJBPackage_Beans(), this.getEnterpriseBean(), null, "beans", null, 0, -1, EJBPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBPackage_Interfaces(), this.getBusinessInterface(), null, "interfaces", null, 0, -1,
				EJBPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJBPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, EJBPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBPackage_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, EJBPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBPackage_Children(), this.getEJBPackage(), null, "children", null, 0, -1, EJBPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provisionEClass, Provision.class, "Provision", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sessionBeanInstanceEClass, SessionBeanInstance.class, "SessionBeanInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSessionBeanInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				SessionBeanInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionBeanInstance_Referenceinstances(), this.getEJBReferenceInstance(), null,
				"referenceinstances", null, 0, -1, SessionBeanInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejbReferenceInstanceEClass, EJBReferenceInstance.class, "EJBReferenceInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEJBReferenceInstance_Ejbreference(), this.getEJBReference(), null, "ejbreference", null, 1, 1,
				EJBReferenceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBReferenceInstance_Sessionbeaninstance(), this.getSessionBeanInstance(), null,
				"sessionbeaninstance", null, 1, 1, EJBReferenceInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enterpriseBeanSecurityEClass, EnterpriseBeanSecurity.class, "EnterpriseBeanSecurity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnterpriseBeanSecurity_PermitAll(), ecorePackage.getEBoolean(), "permitAll", "false", 0, 1,
				EnterpriseBeanSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnterpriseBeanSecurity_DenyAll(), ecorePackage.getEBoolean(), "denyAll", "false", 0, 1,
				EnterpriseBeanSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBeanSecurity_RolesAllowed(), this.getRole(), null, "rolesAllowed", null, 0, -1,
				EnterpriseBeanSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBeanSecurity_RolesDeclared(), this.getRole(), null, "rolesDeclared", null, 0, -1,
				EnterpriseBeanSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBeanSecurity_RunAs(), this.getRole(), null, "runAs", null, 0, 1,
				EnterpriseBeanSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enterpriseBeanOperationSecurityEClass, EnterpriseBeanOperationSecurity.class,
				"EnterpriseBeanOperationSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnterpriseBeanOperationSecurity_PermitAll(), ecorePackage.getEBoolean(), "permitAll", "false",
				0, 1, EnterpriseBeanOperationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnterpriseBeanOperationSecurity_DenyAll(), ecorePackage.getEBoolean(), "denyAll", "false", 0,
				1, EnterpriseBeanOperationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBeanOperationSecurity_RolesAllowed(), this.getRole(), null, "rolesAllowed", null, 0,
				-1, EnterpriseBeanOperationSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(destinationTypeEEnum, DestinationType.class, "DestinationType");
		addEEnumLiteral(destinationTypeEEnum, DestinationType.NON_DURABLE_TOPIC);
		addEEnumLiteral(destinationTypeEEnum, DestinationType.QUEUE);
		addEEnumLiteral(destinationTypeEEnum, DestinationType.DURABLE_TOPIC);

		initEEnum(entityTypeReferenceMultiplicityEEnum, EntityTypeReferenceMultiplicity.class,
				"EntityTypeReferenceMultiplicity");
		addEEnumLiteral(entityTypeReferenceMultiplicityEEnum, EntityTypeReferenceMultiplicity.ONE_TO_ONE);
		addEEnumLiteral(entityTypeReferenceMultiplicityEEnum, EntityTypeReferenceMultiplicity.ONE_TO_MANY);
		addEEnumLiteral(entityTypeReferenceMultiplicityEEnum, EntityTypeReferenceMultiplicity.MANY_TO_ONE);
		addEEnumLiteral(entityTypeReferenceMultiplicityEEnum, EntityTypeReferenceMultiplicity.MANY_TO_MANY);

		initEEnum(javaTypeReferenceMultipicityEEnum, JavaTypeReferenceMultipicity.class,
				"JavaTypeReferenceMultipicity");
		addEEnumLiteral(javaTypeReferenceMultipicityEEnum, JavaTypeReferenceMultipicity.ONE_TO_ONE);
		addEEnumLiteral(javaTypeReferenceMultipicityEEnum, JavaTypeReferenceMultipicity.ONE_TO_MANY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(ejbReferenceEClass, source, new String[] { "name", "SessionBean" });
		addAnnotation(sessionBeanInstanceEClass, source, new String[] { "name", "SessionBean" });
		addAnnotation(ejbReferenceInstanceEClass, source, new String[] { "name", "SessionBean" });
	}

} // Ejb31PackageImpl
