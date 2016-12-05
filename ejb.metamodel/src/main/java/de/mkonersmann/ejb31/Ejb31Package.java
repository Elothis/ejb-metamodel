/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see de.mkonersmann.ejb31.Ejb31Factory
 * @model kind="package"
 * @generated
 */
public interface Ejb31Package extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "ejb31";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://de.mkonersmann.ejb31/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "ejb";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	Ejb31Package eINSTANCE = de.mkonersmann.ejb31.impl.Ejb31PackageImpl.init();

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.IdentifiedElementImpl <em>Identified
	 * Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.IdentifiedElementImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.mkonersmann.ejb31.impl.ClientImpl
	 * <em>Client</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.ClientImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Client</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EnvironmentEntryImpl <em>Environment
	 * Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EnvironmentEntryImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnvironmentEntry()
	 * @generated
	 */
	int ENVIRONMENT_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ENTRY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Environment Entry</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ENTRY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mkonersmann.ejb31.impl.ArchiveImpl
	 * <em>Archive</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.ArchiveImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getArchive()
	 * @generated
	 */
	int ARCHIVE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__CONTAINER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Archive</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EnterpriseArchiveImpl <em>Enterprise
	 * Archive</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EnterpriseArchiveImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseArchive()
	 * @generated
	 */
	int ENTERPRISE_ARCHIVE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHIVE__ID = ARCHIVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHIVE__NAME = ARCHIVE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHIVE__CONTAINER = ARCHIVE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Ejb Archives</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHIVE__EJB_ARCHIVES = ARCHIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Information</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION = ARCHIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHIVE__LIBRARIES = ARCHIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enterprise Archive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHIVE_FEATURE_COUNT = ARCHIVE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EJBArchiveImpl <em>EJB Archive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EJBArchiveImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBArchive()
	 * @generated
	 */
	int EJB_ARCHIVE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_ARCHIVE__ID = ARCHIVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_ARCHIVE__NAME = ARCHIVE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_ARCHIVE__CONTAINER = ARCHIVE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Packages</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_ARCHIVE__ROOT_PACKAGES = ARCHIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EJB Archive</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_ARCHIVE_FEATURE_COUNT = ARCHIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.ApplicationAssemblyInformationImpl
	 * <em>Application Assembly Information</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.ApplicationAssemblyInformationImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getApplicationAssemblyInformation()
	 * @generated
	 */
	int APPLICATION_ASSEMBLY_INFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSEMBLY_INFORMATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Application Assembly
	 * Information</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSEMBLY_INFORMATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mkonersmann.ejb31.impl.LibraryImpl
	 * <em>Library</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.LibraryImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID = ARCHIVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = ARCHIVE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONTAINER = ARCHIVE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Packages</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ROOT_PACKAGES = ARCHIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = ARCHIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.ContainerImpl <em>Container</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.ContainerImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PROVIDES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployed Archives</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEPLOYED_ARCHIVES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONNECTED_TO = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environment Entries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENVIRONMENT_ENTRIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.ContainerServiceImpl <em>Container
	 * Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.ContainerServiceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getContainerService()
	 * @generated
	 */
	int CONTAINER_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Container Service</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SERVICE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.SecurityServiceImpl <em>Security
	 * Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.SecurityServiceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSecurityService()
	 * @generated
	 */
	int SECURITY_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__ID = CONTAINER_SERVICE__ID;

	/**
	 * The number of structural features of the '<em>Security Service</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_FEATURE_COUNT = CONTAINER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.ConcurrencyServiceImpl <em>Concurrency
	 * Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.ConcurrencyServiceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getConcurrencyService()
	 * @generated
	 */
	int CONCURRENCY_SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_SERVICE__ID = CONTAINER_SERVICE__ID;

	/**
	 * The number of structural features of the '<em>Concurrency Service</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_SERVICE_FEATURE_COUNT = CONTAINER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.TransactionServiceImpl <em>Transaction
	 * Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.TransactionServiceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getTransactionService()
	 * @generated
	 */
	int TRANSACTION_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SERVICE__ID = CONTAINER_SERVICE__ID;

	/**
	 * The number of structural features of the '<em>Transaction Service</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SERVICE_FEATURE_COUNT = CONTAINER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.SecondaryStorageServiceImpl
	 * <em>Secondary Storage Service</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.SecondaryStorageServiceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSecondaryStorageService()
	 * @generated
	 */
	int SECONDARY_STORAGE_SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECONDARY_STORAGE_SERVICE__ID = CONTAINER_SERVICE__ID;

	/**
	 * The number of structural features of the '<em>Secondary Storage
	 * Service</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECONDARY_STORAGE_SERVICE_FEATURE_COUNT = CONTAINER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EnterpriseBeanImpl <em>Enterprise
	 * Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EnterpriseBeanImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseBean()
	 * @generated
	 */
	int ENTERPRISE_BEAN = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environment Entries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__SERVICE_DEPENDENCIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bean References</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__BEAN_REFERENCES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__SECURITY_SPECS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enterprise Bean</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.SessionBeanImpl <em>Session Bean</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.SessionBeanImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSessionBean()
	 * @generated
	 */
	int SESSION_BEAN = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__ID = ENTERPRISE_BEAN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__NAME = ENTERPRISE_BEAN__NAME;

	/**
	 * The feature id for the '<em><b>Environment Entries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__ENVIRONMENT_ENTRIES = ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SERVICE_DEPENDENCIES = ENTERPRISE_BEAN__SERVICE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Bean References</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__BEAN_REFERENCES = ENTERPRISE_BEAN__BEAN_REFERENCES;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SECURITY_SPECS = ENTERPRISE_BEAN__SECURITY_SPECS;

	/**
	 * The feature id for the '<em><b>Owned Operation Signature</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__OWNED_OPERATION_SIGNATURE = ENTERPRISE_BEAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__LOCAL_BUSINESS_INTERFACES = ENTERPRISE_BEAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__OWNED_OPERATIONS = ENTERPRISE_BEAN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remote Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__REMOTE_BUSINESS_INTERFACES = ENTERPRISE_BEAN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__INSTANCES = ENTERPRISE_BEAN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Session Bean</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_FEATURE_COUNT = ENTERPRISE_BEAN_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.StatelessSessionBeanImpl <em>Stateless
	 * Session Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.StatelessSessionBeanImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getStatelessSessionBean()
	 * @generated
	 */
	int STATELESS_SESSION_BEAN = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__ID = SESSION_BEAN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

	/**
	 * The feature id for the '<em><b>Environment Entries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__ENVIRONMENT_ENTRIES = SESSION_BEAN__ENVIRONMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__SERVICE_DEPENDENCIES = SESSION_BEAN__SERVICE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Bean References</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__BEAN_REFERENCES = SESSION_BEAN__BEAN_REFERENCES;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__SECURITY_SPECS = SESSION_BEAN__SECURITY_SPECS;

	/**
	 * The feature id for the '<em><b>Owned Operation Signature</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__OWNED_OPERATION_SIGNATURE = SESSION_BEAN__OWNED_OPERATION_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Local Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__LOCAL_BUSINESS_INTERFACES = SESSION_BEAN__LOCAL_BUSINESS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__OWNED_OPERATIONS = SESSION_BEAN__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Remote Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__REMOTE_BUSINESS_INTERFACES = SESSION_BEAN__REMOTE_BUSINESS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN__INSTANCES = SESSION_BEAN__INSTANCES;

	/**
	 * The number of structural features of the '<em>Stateless Session
	 * Bean</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATELESS_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl <em>Message
	 * Driven Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getMessageDrivenBean()
	 * @generated
	 */
	int MESSAGE_DRIVEN_BEAN = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__ID = ENTERPRISE_BEAN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__NAME = ENTERPRISE_BEAN__NAME;

	/**
	 * The feature id for the '<em><b>Environment Entries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__ENVIRONMENT_ENTRIES = ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__SERVICE_DEPENDENCIES = ENTERPRISE_BEAN__SERVICE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Bean References</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__BEAN_REFERENCES = ENTERPRISE_BEAN__BEAN_REFERENCES;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__SECURITY_SPECS = ENTERPRISE_BEAN__SECURITY_SPECS;

	/**
	 * The feature id for the '<em><b>Destination Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE = ENTERPRISE_BEAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Selector Entries</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES = ENTERPRISE_BEAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Operation Signatures</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES = ENTERPRISE_BEAN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS = ENTERPRISE_BEAN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Driven Bean</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_FEATURE_COUNT = ENTERPRISE_BEAN_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.StatefulSessionBeanImpl <em>Stateful
	 * Session Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.StatefulSessionBeanImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getStatefulSessionBean()
	 * @generated
	 */
	int STATEFUL_SESSION_BEAN = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__ID = SESSION_BEAN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

	/**
	 * The feature id for the '<em><b>Environment Entries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__ENVIRONMENT_ENTRIES = SESSION_BEAN__ENVIRONMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__SERVICE_DEPENDENCIES = SESSION_BEAN__SERVICE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Bean References</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__BEAN_REFERENCES = SESSION_BEAN__BEAN_REFERENCES;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__SECURITY_SPECS = SESSION_BEAN__SECURITY_SPECS;

	/**
	 * The feature id for the '<em><b>Owned Operation Signature</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__OWNED_OPERATION_SIGNATURE = SESSION_BEAN__OWNED_OPERATION_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Local Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__LOCAL_BUSINESS_INTERFACES = SESSION_BEAN__LOCAL_BUSINESS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__OWNED_OPERATIONS = SESSION_BEAN__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Remote Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__REMOTE_BUSINESS_INTERFACES = SESSION_BEAN__REMOTE_BUSINESS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN__INSTANCES = SESSION_BEAN__INSTANCES;

	/**
	 * The number of structural features of the '<em>Stateful Session Bean</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.SingletonSessionBeanImpl <em>Singleton
	 * Session Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.SingletonSessionBeanImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSingletonSessionBean()
	 * @generated
	 */
	int SINGLETON_SESSION_BEAN = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__ID = SESSION_BEAN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

	/**
	 * The feature id for the '<em><b>Environment Entries</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__ENVIRONMENT_ENTRIES = SESSION_BEAN__ENVIRONMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__SERVICE_DEPENDENCIES = SESSION_BEAN__SERVICE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Bean References</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__BEAN_REFERENCES = SESSION_BEAN__BEAN_REFERENCES;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__SECURITY_SPECS = SESSION_BEAN__SECURITY_SPECS;

	/**
	 * The feature id for the '<em><b>Owned Operation Signature</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__OWNED_OPERATION_SIGNATURE = SESSION_BEAN__OWNED_OPERATION_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Local Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__LOCAL_BUSINESS_INTERFACES = SESSION_BEAN__LOCAL_BUSINESS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__OWNED_OPERATIONS = SESSION_BEAN__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Remote Business Interfaces</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__REMOTE_BUSINESS_INTERFACES = SESSION_BEAN__REMOTE_BUSINESS_INTERFACES;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__INSTANCES = SESSION_BEAN__INSTANCES;

	/**
	 * The feature id for the '<em><b>Startup</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN__STARTUP = SESSION_BEAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singleton Session
	 * Bean</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.OperationSignatureImpl <em>Operation
	 * Signature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.OperationSignatureImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getOperationSignature()
	 * @generated
	 */
	int OPERATION_SIGNATURE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Java Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__RETURN_JAVA_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__PARAMETERS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__EXCEPTIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Application Type</b></em>'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operation Signature</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.BusinessInterfaceImpl <em>Business
	 * Interface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.BusinessInterfaceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getBusinessInterface()
	 * @generated
	 */
	int BUSINESS_INTERFACE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owned Operation Signature</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Interface</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INTERFACE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.BeanReferenceImpl <em>Bean
	 * Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.BeanReferenceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getBeanReference()
	 * @generated
	 */
	int BEAN_REFERENCE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE__REFERENCE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE__DESCRIPTION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bean Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EJBReferenceImpl <em>EJB
	 * Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EJBReferenceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBReference()
	 * @generated
	 */
	int EJB_REFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE__ID = BEAN_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE__REFERENCE = BEAN_REFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE__DESCRIPTION = BEAN_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sessionbean</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE__SESSIONBEAN = BEAN_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EJB Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE_FEATURE_COUNT = BEAN_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.OperationParameterImpl <em>Operation
	 * Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.OperationParameterImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getOperationParameter()
	 * @generated
	 */
	int OPERATION_PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Java Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__JAVA_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application Data Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__APPLICATION_DATA_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Parameter</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.LocalProvisionImpl <em>Local
	 * Provision</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.LocalProvisionImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getLocalProvision()
	 * @generated
	 */
	int LOCAL_PROVISION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROVISION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROVISION__INTERFACE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Provision</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROVISION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.mkonersmann.ejb31.RemoteProvision
	 * <em>Remote Provision</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.RemoteProvision
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getRemoteProvision()
	 * @generated
	 */
	int REMOTE_PROVISION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REMOTE_PROVISION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REMOTE_PROVISION__INTERFACE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote Provision</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REMOTE_PROVISION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.MessageSelectorImpl <em>Message
	 * Selector</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.MessageSelectorImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getMessageSelector()
	 * @generated
	 */
	int MESSAGE_SELECTOR = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SELECTOR__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SELECTOR__KEY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SELECTOR__VALUE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Selector</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SELECTOR_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.mkonersmann.ejb31.impl.DataTypeImpl
	 * <em>Data Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.DataTypeImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUPER_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_OPERATIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.OperationImpl <em>Operation</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.OperationImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION__SIGNATURE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.DataTypeOperationImpl <em>Data Type
	 * Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.DataTypeOperationImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getDataTypeOperation()
	 * @generated
	 */
	int DATA_TYPE_OPERATION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION__SIGNATURE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Operation</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.SessionBeanOperationImpl <em>Session
	 * Bean Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.SessionBeanOperationImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSessionBeanOperation()
	 * @generated
	 */
	int SESSION_BEAN_OPERATION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION__ID = OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION__SIGNATURE = OPERATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION__PRE_DESTROY = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION__POST_CONSTRUCT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre Passivate</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION__PRE_PASSIVATE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post Activate</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION__POST_ACTIVATE = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION__SECURITY_SPECS = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Session Bean
	 * Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanOperationImpl
	 * <em>Message Driven Bean Operation</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.MessageDrivenBeanOperationImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getMessageDrivenBeanOperation()
	 * @generated
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION__ID = OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION__SIGNATURE = OPERATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Driven Bean
	 * Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.SynchronousOperationImpl
	 * <em>Synchronous Operation</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.SynchronousOperationImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSynchronousOperation()
	 * @generated
	 */
	int SYNCHRONOUS_OPERATION = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION__ID = SESSION_BEAN_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION__SIGNATURE = SESSION_BEAN_OPERATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION__PRE_DESTROY = SESSION_BEAN_OPERATION__PRE_DESTROY;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION__POST_CONSTRUCT = SESSION_BEAN_OPERATION__POST_CONSTRUCT;

	/**
	 * The feature id for the '<em><b>Pre Passivate</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION__PRE_PASSIVATE = SESSION_BEAN_OPERATION__PRE_PASSIVATE;

	/**
	 * The feature id for the '<em><b>Post Activate</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION__POST_ACTIVATE = SESSION_BEAN_OPERATION__POST_ACTIVATE;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION__SECURITY_SPECS = SESSION_BEAN_OPERATION__SECURITY_SPECS;

	/**
	 * The number of structural features of the '<em>Synchronous Operation</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_OPERATION_FEATURE_COUNT = SESSION_BEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.AsynchronousOperationImpl
	 * <em>Asynchronous Operation</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.AsynchronousOperationImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getAsynchronousOperation()
	 * @generated
	 */
	int ASYNCHRONOUS_OPERATION = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION__ID = SESSION_BEAN_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION__SIGNATURE = SESSION_BEAN_OPERATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Pre Destroy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION__PRE_DESTROY = SESSION_BEAN_OPERATION__PRE_DESTROY;

	/**
	 * The feature id for the '<em><b>Post Construct</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION__POST_CONSTRUCT = SESSION_BEAN_OPERATION__POST_CONSTRUCT;

	/**
	 * The feature id for the '<em><b>Pre Passivate</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION__PRE_PASSIVATE = SESSION_BEAN_OPERATION__PRE_PASSIVATE;

	/**
	 * The feature id for the '<em><b>Post Activate</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION__POST_ACTIVATE = SESSION_BEAN_OPERATION__POST_ACTIVATE;

	/**
	 * The feature id for the '<em><b>Security Specs</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION__SECURITY_SPECS = SESSION_BEAN_OPERATION__SECURITY_SPECS;

	/**
	 * The number of structural features of the '<em>Asynchronous
	 * Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_OPERATION_FEATURE_COUNT = SESSION_BEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EntityBeanImpl <em>Entity Bean</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EntityBeanImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEntityBean()
	 * @generated
	 */
	int ENTITY_BEAN = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__ATTRIBUTES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__SUPER_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Bean</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.AbstractEntityAttributeImpl
	 * <em>Abstract Entity Attribute</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.AbstractEntityAttributeImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getAbstractEntityAttribute()
	 * @generated
	 */
	int ABSTRACT_ENTITY_ATTRIBUTE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_ATTRIBUTE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_ATTRIBUTE__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Entity
	 * Attribute</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_ATTRIBUTE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.JavaTypeAttributeImpl <em>Java Type
	 * Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.JavaTypeAttributeImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getJavaTypeAttribute()
	 * @generated
	 */
	int JAVA_TYPE_ATTRIBUTE = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_ATTRIBUTE__ID = ABSTRACT_ENTITY_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_ATTRIBUTE__NAME = ABSTRACT_ENTITY_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_ATTRIBUTE__TYPE = ABSTRACT_ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_ATTRIBUTE__MULTIPLICITY = ABSTRACT_ENTITY_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Type Attribute</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_ATTRIBUTE_FEATURE_COUNT = ABSTRACT_ENTITY_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EntityAttributeImpl <em>Entity
	 * Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EntityAttributeImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEntityAttribute()
	 * @generated
	 */
	int ENTITY_ATTRIBUTE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__ID = ABSTRACT_ENTITY_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__NAME = ABSTRACT_ENTITY_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__TYPE = ABSTRACT_ENTITY_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE__MULTIPLICITY = ABSTRACT_ENTITY_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Attribute</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_FEATURE_COUNT = ABSTRACT_ENTITY_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EJBPackageImpl <em>EJB Package</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EJBPackageImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBPackage()
	 * @generated
	 */
	int EJB_PACKAGE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_PACKAGE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_PACKAGE__BEANS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_PACKAGE__INTERFACES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_PACKAGE__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_PACKAGE__DATA_TYPES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_PACKAGE__CHILDREN = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EJB Package</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_PACKAGE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.ProvisionImpl <em>Provision</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.ProvisionImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getProvision()
	 * @generated
	 */
	int PROVISION = 40;

	/**
	 * The number of structural features of the '<em>Provision</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROVISION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.SessionBeanInstanceImpl <em>Session
	 * Bean Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.SessionBeanInstanceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSessionBeanInstance()
	 * @generated
	 */
	int SESSION_BEAN_INSTANCE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Referenceinstances</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_INSTANCE__REFERENCEINSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Session Bean Instance</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EJBReferenceInstanceImpl <em>EJB
	 * Reference Instance</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EJBReferenceInstanceImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBReferenceInstance()
	 * @generated
	 */
	int EJB_REFERENCE_INSTANCE = 42;

	/**
	 * The feature id for the '<em><b>Ejbreference</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE_INSTANCE__EJBREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Sessionbeaninstance</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE = 1;

	/**
	 * The number of structural features of the '<em>EJB Reference
	 * Instance</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EJB_REFERENCE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl
	 * <em>Enterprise Bean Security</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseBeanSecurity()
	 * @generated
	 */
	int ENTERPRISE_BEAN_SECURITY = 43;

	/**
	 * The feature id for the '<em><b>Permit All</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_SECURITY__PERMIT_ALL = 0;

	/**
	 * The feature id for the '<em><b>Deny All</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_SECURITY__DENY_ALL = 1;

	/**
	 * The feature id for the '<em><b>Roles Allowed</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED = 2;

	/**
	 * The feature id for the '<em><b>Roles Declared</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED = 3;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_SECURITY__RUN_AS = 4;

	/**
	 * The number of structural features of the '<em>Enterprise Bean
	 * Security</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_SECURITY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.mkonersmann.ejb31.impl.RoleImpl
	 * <em>Role</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.RoleImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.impl.EnterpriseBeanOperationSecurityImpl
	 * <em>Enterprise Bean Operation Security</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.impl.EnterpriseBeanOperationSecurityImpl
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseBeanOperationSecurity()
	 * @generated
	 */
	int ENTERPRISE_BEAN_OPERATION_SECURITY = 45;

	/**
	 * The feature id for the '<em><b>Permit All</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_OPERATION_SECURITY__PERMIT_ALL = 0;

	/**
	 * The feature id for the '<em><b>Deny All</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_OPERATION_SECURITY__DENY_ALL = 1;

	/**
	 * The feature id for the '<em><b>Roles Allowed</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_OPERATION_SECURITY__ROLES_ALLOWED = 2;

	/**
	 * The number of structural features of the '<em>Enterprise Bean Operation
	 * Security</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_OPERATION_SECURITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.mkonersmann.ejb31.DestinationType
	 * <em>Destination Type</em>}' enum. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.DestinationType
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getDestinationType()
	 * @generated
	 */
	int DESTINATION_TYPE = 46;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity <em>Entity
	 * Type Reference Multiplicity</em>}' enum. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEntityTypeReferenceMultiplicity()
	 * @generated
	 */
	int ENTITY_TYPE_REFERENCE_MULTIPLICITY = 47;

	/**
	 * The meta object id for the
	 * '{@link de.mkonersmann.ejb31.JavaTypeReferenceMultipicity <em>Java Type
	 * Reference Multipicity</em>}' enum. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.mkonersmann.ejb31.JavaTypeReferenceMultipicity
	 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getJavaTypeReferenceMultipicity()
	 * @generated
	 */
	int JAVA_TYPE_REFERENCE_MULTIPICITY = 48;

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.Client
	 * <em>Client</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Client</em>'.
	 * @see de.mkonersmann.ejb31.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EnvironmentEntry <em>Environment
	 * Entry</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Environment Entry</em>'.
	 * @see de.mkonersmann.ejb31.EnvironmentEntry
	 * @generated
	 */
	EClass getEnvironmentEntry();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.Archive
	 * <em>Archive</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see de.mkonersmann.ejb31.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.Archive#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.Archive#getName()
	 * @see #getArchive()
	 * @generated
	 */
	EAttribute getArchive_Name();

	/**
	 * Returns the meta object for the reference list
	 * '{@link de.mkonersmann.ejb31.Archive#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Container</em>'.
	 * @see de.mkonersmann.ejb31.Archive#getContainer()
	 * @see #getArchive()
	 * @generated
	 */
	EReference getArchive_Container();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EnterpriseArchive <em>Enterprise
	 * Archive</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enterprise Archive</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseArchive
	 * @generated
	 */
	EClass getEnterpriseArchive();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseArchive#getEjbArchives <em>Ejb
	 * Archives</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Ejb
	 *         Archives</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseArchive#getEjbArchives()
	 * @see #getEnterpriseArchive()
	 * @generated
	 */
	EReference getEnterpriseArchive_EjbArchives();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link de.mkonersmann.ejb31.EnterpriseArchive#getAssemblyInformation
	 * <em>Assembly Information</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Assembly
	 *         Information</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseArchive#getAssemblyInformation()
	 * @see #getEnterpriseArchive()
	 * @generated
	 */
	EReference getEnterpriseArchive_AssemblyInformation();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseArchive#getLibraries
	 * <em>Libraries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Libraries</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseArchive#getLibraries()
	 * @see #getEnterpriseArchive()
	 * @generated
	 */
	EReference getEnterpriseArchive_Libraries();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.EJBArchive
	 * <em>EJB Archive</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EJB Archive</em>'.
	 * @see de.mkonersmann.ejb31.EJBArchive
	 * @generated
	 */
	EClass getEJBArchive();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EJBArchive#getRootPackages <em>Root
	 * Packages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Root
	 *         Packages</em>'.
	 * @see de.mkonersmann.ejb31.EJBArchive#getRootPackages()
	 * @see #getEJBArchive()
	 * @generated
	 */
	EReference getEJBArchive_RootPackages();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.ApplicationAssemblyInformation
	 * <em>Application Assembly Information</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Application Assembly
	 *         Information</em>'.
	 * @see de.mkonersmann.ejb31.ApplicationAssemblyInformation
	 * @generated
	 */
	EClass getApplicationAssemblyInformation();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.Library
	 * <em>Library</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Library</em>'.
	 * @see de.mkonersmann.ejb31.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.Library#getRootPackages <em>Root
	 * Packages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Root
	 *         Packages</em>'.
	 * @see de.mkonersmann.ejb31.Library#getRootPackages()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_RootPackages();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.Container
	 * <em>Container</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.mkonersmann.ejb31.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.Container#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Provides</em>'.
	 * @see de.mkonersmann.ejb31.Container#getProvides()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Provides();

	/**
	 * Returns the meta object for the reference list
	 * '{@link de.mkonersmann.ejb31.Container#getDeployedArchives <em>Deployed
	 * Archives</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Deployed
	 *         Archives</em>'.
	 * @see de.mkonersmann.ejb31.Container#getDeployedArchives()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_DeployedArchives();

	/**
	 * Returns the meta object for the reference list
	 * '{@link de.mkonersmann.ejb31.Container#getConnectedTo <em>Connected
	 * To</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see de.mkonersmann.ejb31.Container#getConnectedTo()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ConnectedTo();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.Container#getEnvironmentEntries
	 * <em>Environment Entries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Environment Entries</em>'.
	 * @see de.mkonersmann.ejb31.Container#getEnvironmentEntries()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_EnvironmentEntries();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.ContainerService <em>Container
	 * Service</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Container Service</em>'.
	 * @see de.mkonersmann.ejb31.ContainerService
	 * @generated
	 */
	EClass getContainerService();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Security Service</em>'.
	 * @see de.mkonersmann.ejb31.SecurityService
	 * @generated
	 */
	EClass getSecurityService();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.ConcurrencyService <em>Concurrency
	 * Service</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Concurrency Service</em>'.
	 * @see de.mkonersmann.ejb31.ConcurrencyService
	 * @generated
	 */
	EClass getConcurrencyService();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.TransactionService <em>Transaction
	 * Service</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Transaction Service</em>'.
	 * @see de.mkonersmann.ejb31.TransactionService
	 * @generated
	 */
	EClass getTransactionService();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.SecondaryStorageService <em>Secondary
	 * Storage Service</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Secondary Storage Service</em>'.
	 * @see de.mkonersmann.ejb31.SecondaryStorageService
	 * @generated
	 */
	EClass getSecondaryStorageService();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean <em>Enterprise Bean</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enterprise Bean</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBean
	 * @generated
	 */
	EClass getEnterpriseBean();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBean#getName()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EAttribute getEnterpriseBean_Name();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean#getEnvironmentEntries
	 * <em>Environment Entries</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Environment Entries</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBean#getEnvironmentEntries()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EReference getEnterpriseBean_EnvironmentEntries();

	/**
	 * Returns the meta object for the reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean#getServiceDependencies
	 * <em>Service Dependencies</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Service
	 *         Dependencies</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBean#getServiceDependencies()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EReference getEnterpriseBean_ServiceDependencies();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean#getBeanReferences <em>Bean
	 * References</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Bean
	 *         References</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBean#getBeanReferences()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EReference getEnterpriseBean_BeanReferences();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link de.mkonersmann.ejb31.EnterpriseBean#getSecuritySpecs <em>Security
	 * Specs</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Security
	 *         Specs</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBean#getSecuritySpecs()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EReference getEnterpriseBean_SecuritySpecs();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.StatelessSessionBean <em>Stateless Session
	 * Bean</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stateless Session Bean</em>'.
	 * @see de.mkonersmann.ejb31.StatelessSessionBean
	 * @generated
	 */
	EClass getStatelessSessionBean();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.SessionBean <em>Session Bean</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Session Bean</em>'.
	 * @see de.mkonersmann.ejb31.SessionBean
	 * @generated
	 */
	EClass getSessionBean();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.SessionBean#getOwnedOperationSignature
	 * <em>Owned Operation Signature</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned
	 *         Operation Signature</em>'.
	 * @see de.mkonersmann.ejb31.SessionBean#getOwnedOperationSignature()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_OwnedOperationSignature();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.SessionBean#getLocalBusinessInterfaces
	 * <em>Local Business Interfaces</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Local
	 *         Business Interfaces</em>'.
	 * @see de.mkonersmann.ejb31.SessionBean#getLocalBusinessInterfaces()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_LocalBusinessInterfaces();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.SessionBean#getOwnedOperations <em>Owned
	 * Operations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned
	 *         Operations</em>'.
	 * @see de.mkonersmann.ejb31.SessionBean#getOwnedOperations()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_OwnedOperations();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.SessionBean#getRemoteBusinessInterfaces
	 * <em>Remote Business Interfaces</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Remote
	 *         Business Interfaces</em>'.
	 * @see de.mkonersmann.ejb31.SessionBean#getRemoteBusinessInterfaces()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_RemoteBusinessInterfaces();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.SessionBean#getInstances
	 * <em>Instances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Instances</em>'.
	 * @see de.mkonersmann.ejb31.SessionBean#getInstances()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_Instances();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBean <em>Message Driven
	 * Bean</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message Driven Bean</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBean
	 * @generated
	 */
	EClass getMessageDrivenBean();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBean#getDestinationType
	 * <em>Destination Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Destination Type</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBean#getDestinationType()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_DestinationType();

	/**
	 * Returns the meta object for the map
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBean#getMessageSelectorEntries
	 * <em>Message Selector Entries</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>Message Selector Entries</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBean#getMessageSelectorEntries()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_MessageSelectorEntries();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBean#getOwnedOperationSignatures
	 * <em>Owned Operation Signatures</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned
	 *         Operation Signatures</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBean#getOwnedOperationSignatures()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_OwnedOperationSignatures();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBean#getOwnedOperations
	 * <em>Owned Operations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned
	 *         Operations</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBean#getOwnedOperations()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_OwnedOperations();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.StatefulSessionBean <em>Stateful Session
	 * Bean</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Stateful Session Bean</em>'.
	 * @see de.mkonersmann.ejb31.StatefulSessionBean
	 * @generated
	 */
	EClass getStatefulSessionBean();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.SingletonSessionBean <em>Singleton Session
	 * Bean</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Singleton Session Bean</em>'.
	 * @see de.mkonersmann.ejb31.SingletonSessionBean
	 * @generated
	 */
	EClass getSingletonSessionBean();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.SingletonSessionBean#isStartup
	 * <em>Startup</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Startup</em>'.
	 * @see de.mkonersmann.ejb31.SingletonSessionBean#isStartup()
	 * @see #getSingletonSessionBean()
	 * @generated
	 */
	EAttribute getSingletonSessionBean_Startup();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.OperationSignature <em>Operation
	 * Signature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operation Signature</em>'.
	 * @see de.mkonersmann.ejb31.OperationSignature
	 * @generated
	 */
	EClass getOperationSignature();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.OperationSignature#getName()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EAttribute getOperationSignature_Name();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getReturnJavaType
	 * <em>Return Java Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Return Java Type</em>'.
	 * @see de.mkonersmann.ejb31.OperationSignature#getReturnJavaType()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EAttribute getOperationSignature_ReturnJavaType();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getParameters
	 * <em>Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Parameters</em>'.
	 * @see de.mkonersmann.ejb31.OperationSignature#getParameters()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_Parameters();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getExceptions
	 * <em>Exceptions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Exceptions</em>'.
	 * @see de.mkonersmann.ejb31.OperationSignature#getExceptions()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EAttribute getOperationSignature_Exceptions();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.OperationSignature#getReturnApplicationType
	 * <em>Return Application Type</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Return Application
	 *         Type</em>'.
	 * @see de.mkonersmann.ejb31.OperationSignature#getReturnApplicationType()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_ReturnApplicationType();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.BusinessInterface <em>Business
	 * Interface</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Business Interface</em>'.
	 * @see de.mkonersmann.ejb31.BusinessInterface
	 * @generated
	 */
	EClass getBusinessInterface();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.BusinessInterface#getOwnedOperationSignature
	 * <em>Owned Operation Signature</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned
	 *         Operation Signature</em>'.
	 * @see de.mkonersmann.ejb31.BusinessInterface#getOwnedOperationSignature()
	 * @see #getBusinessInterface()
	 * @generated
	 */
	EReference getBusinessInterface_OwnedOperationSignature();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.BusinessInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.BusinessInterface#getName()
	 * @see #getBusinessInterface()
	 * @generated
	 */
	EAttribute getBusinessInterface_Name();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.BeanReference <em>Bean Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bean Reference</em>'.
	 * @see de.mkonersmann.ejb31.BeanReference
	 * @generated
	 */
	EClass getBeanReference();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.BeanReference#getReference
	 * <em>Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see de.mkonersmann.ejb31.BeanReference#getReference()
	 * @see #getBeanReference()
	 * @generated
	 */
	EReference getBeanReference_Reference();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.BeanReference#getDescription
	 * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.mkonersmann.ejb31.BeanReference#getDescription()
	 * @see #getBeanReference()
	 * @generated
	 */
	EAttribute getBeanReference_Description();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EJBReference <em>EJB Reference</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EJB Reference</em>'.
	 * @see de.mkonersmann.ejb31.EJBReference
	 * @generated
	 */
	EClass getEJBReference();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.EJBReference#getSessionbean
	 * <em>Sessionbean</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Sessionbean</em>'.
	 * @see de.mkonersmann.ejb31.EJBReference#getSessionbean()
	 * @see #getEJBReference()
	 * @generated
	 */
	EReference getEJBReference_Sessionbean();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.OperationParameter <em>Operation
	 * Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operation Parameter</em>'.
	 * @see de.mkonersmann.ejb31.OperationParameter
	 * @generated
	 */
	EClass getOperationParameter();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.OperationParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.OperationParameter#getName()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EAttribute getOperationParameter_Name();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.OperationParameter#getJavaType <em>Java
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Java Type</em>'.
	 * @see de.mkonersmann.ejb31.OperationParameter#getJavaType()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EAttribute getOperationParameter_JavaType();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.OperationParameter#getApplicationDataType
	 * <em>Application Data Type</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Application Data
	 *         Type</em>'.
	 * @see de.mkonersmann.ejb31.OperationParameter#getApplicationDataType()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EReference getOperationParameter_ApplicationDataType();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.LocalProvision <em>Local Provision</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Local Provision</em>'.
	 * @see de.mkonersmann.ejb31.LocalProvision
	 * @generated
	 */
	EClass getLocalProvision();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.LocalProvision#getInterface
	 * <em>Interface</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see de.mkonersmann.ejb31.LocalProvision#getInterface()
	 * @see #getLocalProvision()
	 * @generated
	 */
	EReference getLocalProvision_Interface();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.RemoteProvision <em>Remote Provision</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Remote Provision</em>'.
	 * @see de.mkonersmann.ejb31.RemoteProvision
	 * @generated
	 */
	EClass getRemoteProvision();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.RemoteProvision#getInterface
	 * <em>Interface</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see de.mkonersmann.ejb31.RemoteProvision#getInterface()
	 * @see #getRemoteProvision()
	 * @generated
	 */
	EReference getRemoteProvision_Interface();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Message
	 * Selector</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message Selector</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getMessageSelector();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry
	 * <em>Key</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMessageSelector()
	 * @generated
	 */
	EAttribute getMessageSelector_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMessageSelector()
	 * @generated
	 */
	EAttribute getMessageSelector_Value();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.DataType
	 * <em>Data Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see de.mkonersmann.ejb31.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.DataType#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.DataType#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see de.mkonersmann.ejb31.DataType#getSuperType()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_SuperType();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.DataType#getOwnedOperations <em>Owned
	 * Operations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned
	 *         Operations</em>'.
	 * @see de.mkonersmann.ejb31.DataType#getOwnedOperations()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_OwnedOperations();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.Operation
	 * <em>Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.mkonersmann.ejb31.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.Operation#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see de.mkonersmann.ejb31.Operation#getSignature()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Signature();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.DataTypeOperation <em>Data Type
	 * Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Type Operation</em>'.
	 * @see de.mkonersmann.ejb31.DataTypeOperation
	 * @generated
	 */
	EClass getDataTypeOperation();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link de.mkonersmann.ejb31.DataTypeOperation#getSignature
	 * <em>Signature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference
	 *         '<em>Signature</em>'.
	 * @see de.mkonersmann.ejb31.DataTypeOperation#getSignature()
	 * @see #getDataTypeOperation()
	 * @generated
	 */
	EReference getDataTypeOperation_Signature();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation <em>Session Bean
	 * Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Session Bean Operation</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanOperation
	 * @generated
	 */
	EClass getSessionBeanOperation();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPreDestroy <em>Pre
	 * Destroy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Pre Destroy</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanOperation#isPreDestroy()
	 * @see #getSessionBeanOperation()
	 * @generated
	 */
	EAttribute getSessionBeanOperation_PreDestroy();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPostConstruct
	 * <em>Post Construct</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Post Construct</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanOperation#isPostConstruct()
	 * @see #getSessionBeanOperation()
	 * @generated
	 */
	EAttribute getSessionBeanOperation_PostConstruct();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPrePassivate <em>Pre
	 * Passivate</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Pre Passivate</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanOperation#isPrePassivate()
	 * @see #getSessionBeanOperation()
	 * @generated
	 */
	EAttribute getSessionBeanOperation_PrePassivate();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#isPostActivate <em>Post
	 * Activate</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Post Activate</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanOperation#isPostActivate()
	 * @see #getSessionBeanOperation()
	 * @generated
	 */
	EAttribute getSessionBeanOperation_PostActivate();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link de.mkonersmann.ejb31.SessionBeanOperation#getSecuritySpecs
	 * <em>Security Specs</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Security
	 *         Specs</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanOperation#getSecuritySpecs()
	 * @see #getSessionBeanOperation()
	 * @generated
	 */
	EReference getSessionBeanOperation_SecuritySpecs();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation <em>Message
	 * Driven Bean Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Message Driven Bean
	 *         Operation</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBeanOperation
	 * @generated
	 */
	EClass getMessageDrivenBeanOperation();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPostConstruct
	 * <em>Post Construct</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Post Construct</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPostConstruct()
	 * @see #getMessageDrivenBeanOperation()
	 * @generated
	 */
	EAttribute getMessageDrivenBeanOperation_PostConstruct();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPreDestroy
	 * <em>Pre Destroy</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Pre Destroy</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBeanOperation#isPreDestroy()
	 * @see #getMessageDrivenBeanOperation()
	 * @generated
	 */
	EAttribute getMessageDrivenBeanOperation_PreDestroy();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link de.mkonersmann.ejb31.MessageDrivenBeanOperation#getSecuritySpecs
	 * <em>Security Specs</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Security
	 *         Specs</em>'.
	 * @see de.mkonersmann.ejb31.MessageDrivenBeanOperation#getSecuritySpecs()
	 * @see #getMessageDrivenBeanOperation()
	 * @generated
	 */
	EReference getMessageDrivenBeanOperation_SecuritySpecs();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.SynchronousOperation <em>Synchronous
	 * Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Synchronous Operation</em>'.
	 * @see de.mkonersmann.ejb31.SynchronousOperation
	 * @generated
	 */
	EClass getSynchronousOperation();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.AsynchronousOperation <em>Asynchronous
	 * Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Asynchronous Operation</em>'.
	 * @see de.mkonersmann.ejb31.AsynchronousOperation
	 * @generated
	 */
	EClass getAsynchronousOperation();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.EntityBean
	 * <em>Entity Bean</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity Bean</em>'.
	 * @see de.mkonersmann.ejb31.EntityBean
	 * @generated
	 */
	EClass getEntityBean();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EntityBean#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.EntityBean#getName()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_Name();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EntityBean#getAttributes
	 * <em>Attributes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Attributes</em>'.
	 * @see de.mkonersmann.ejb31.EntityBean#getAttributes()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_Attributes();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.EntityBean#getSuperType <em>Super
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see de.mkonersmann.ejb31.EntityBean#getSuperType()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_SuperType();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.AbstractEntityAttribute <em>Abstract Entity
	 * Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Abstract Entity Attribute</em>'.
	 * @see de.mkonersmann.ejb31.AbstractEntityAttribute
	 * @generated
	 */
	EClass getAbstractEntityAttribute();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.AbstractEntityAttribute#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.AbstractEntityAttribute#getName()
	 * @see #getAbstractEntityAttribute()
	 * @generated
	 */
	EAttribute getAbstractEntityAttribute_Name();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.JavaTypeAttribute <em>Java Type
	 * Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Java Type Attribute</em>'.
	 * @see de.mkonersmann.ejb31.JavaTypeAttribute
	 * @generated
	 */
	EClass getJavaTypeAttribute();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.JavaTypeAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.mkonersmann.ejb31.JavaTypeAttribute#getType()
	 * @see #getJavaTypeAttribute()
	 * @generated
	 */
	EAttribute getJavaTypeAttribute_Type();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.JavaTypeAttribute#getMultiplicity
	 * <em>Multiplicity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see de.mkonersmann.ejb31.JavaTypeAttribute#getMultiplicity()
	 * @see #getJavaTypeAttribute()
	 * @generated
	 */
	EAttribute getJavaTypeAttribute_Multiplicity();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity Attribute</em>'.
	 * @see de.mkonersmann.ejb31.EntityAttribute
	 * @generated
	 */
	EClass getEntityAttribute();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.EntityAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.mkonersmann.ejb31.EntityAttribute#getType()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EReference getEntityAttribute_Type();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EntityAttribute#getMultiplicity
	 * <em>Multiplicity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see de.mkonersmann.ejb31.EntityAttribute#getMultiplicity()
	 * @see #getEntityAttribute()
	 * @generated
	 */
	EAttribute getEntityAttribute_Multiplicity();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.EJBPackage
	 * <em>EJB Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EJB Package</em>'.
	 * @see de.mkonersmann.ejb31.EJBPackage
	 * @generated
	 */
	EClass getEJBPackage();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EJBPackage#getBeans <em>Beans</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Beans</em>'.
	 * @see de.mkonersmann.ejb31.EJBPackage#getBeans()
	 * @see #getEJBPackage()
	 * @generated
	 */
	EReference getEJBPackage_Beans();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EJBPackage#getInterfaces
	 * <em>Interfaces</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Interfaces</em>'.
	 * @see de.mkonersmann.ejb31.EJBPackage#getInterfaces()
	 * @see #getEJBPackage()
	 * @generated
	 */
	EReference getEJBPackage_Interfaces();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EJBPackage#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.EJBPackage#getName()
	 * @see #getEJBPackage()
	 * @generated
	 */
	EAttribute getEJBPackage_Name();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EJBPackage#getDataTypes <em>Data
	 * Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Data
	 *         Types</em>'.
	 * @see de.mkonersmann.ejb31.EJBPackage#getDataTypes()
	 * @see #getEJBPackage()
	 * @generated
	 */
	EReference getEJBPackage_DataTypes();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.EJBPackage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Children</em>'.
	 * @see de.mkonersmann.ejb31.EJBPackage#getChildren()
	 * @see #getEJBPackage()
	 * @generated
	 */
	EReference getEJBPackage_Children();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.IdentifiedElement <em>Identified
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see de.mkonersmann.ejb31.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.IdentifiedElement#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.mkonersmann.ejb31.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.Provision
	 * <em>Provision</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Provision</em>'.
	 * @see de.mkonersmann.ejb31.Provision
	 * @generated
	 */
	EClass getProvision();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.SessionBeanInstance <em>Session Bean
	 * Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Session Bean Instance</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanInstance
	 * @generated
	 */
	EClass getSessionBeanInstance();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.SessionBeanInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanInstance#getName()
	 * @see #getSessionBeanInstance()
	 * @generated
	 */
	EAttribute getSessionBeanInstance_Name();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.mkonersmann.ejb31.SessionBeanInstance#getReferenceinstances
	 * <em>Referenceinstances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Referenceinstances</em>'.
	 * @see de.mkonersmann.ejb31.SessionBeanInstance#getReferenceinstances()
	 * @see #getSessionBeanInstance()
	 * @generated
	 */
	EReference getSessionBeanInstance_Referenceinstances();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EJBReferenceInstance <em>EJB Reference
	 * Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EJB Reference Instance</em>'.
	 * @see de.mkonersmann.ejb31.EJBReferenceInstance
	 * @generated
	 */
	EClass getEJBReferenceInstance();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.EJBReferenceInstance#getEjbreference
	 * <em>Ejbreference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Ejbreference</em>'.
	 * @see de.mkonersmann.ejb31.EJBReferenceInstance#getEjbreference()
	 * @see #getEJBReferenceInstance()
	 * @generated
	 */
	EReference getEJBReferenceInstance_Ejbreference();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.EJBReferenceInstance#getSessionbeaninstance
	 * <em>Sessionbeaninstance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Sessionbeaninstance</em>'.
	 * @see de.mkonersmann.ejb31.EJBReferenceInstance#getSessionbeaninstance()
	 * @see #getEJBReferenceInstance()
	 * @generated
	 */
	EReference getEJBReferenceInstance_Sessionbeaninstance();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity <em>Enterprise Bean
	 * Security</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enterprise Bean Security</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanSecurity
	 * @generated
	 */
	EClass getEnterpriseBeanSecurity();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#isPermitAll
	 * <em>Permit All</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Permit All</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanSecurity#isPermitAll()
	 * @see #getEnterpriseBeanSecurity()
	 * @generated
	 */
	EAttribute getEnterpriseBeanSecurity_PermitAll();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#isDenyAll <em>Deny
	 * All</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Deny All</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanSecurity#isDenyAll()
	 * @see #getEnterpriseBeanSecurity()
	 * @generated
	 */
	EAttribute getEnterpriseBeanSecurity_DenyAll();

	/**
	 * Returns the meta object for the reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRolesAllowed
	 * <em>Roles Allowed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Roles Allowed</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRolesAllowed()
	 * @see #getEnterpriseBeanSecurity()
	 * @generated
	 */
	EReference getEnterpriseBeanSecurity_RolesAllowed();

	/**
	 * Returns the meta object for the reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRolesDeclared
	 * <em>Roles Declared</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Roles Declared</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRolesDeclared()
	 * @see #getEnterpriseBeanSecurity()
	 * @generated
	 */
	EReference getEnterpriseBeanSecurity_RolesDeclared();

	/**
	 * Returns the meta object for the reference
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRunAs <em>Run
	 * As</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Run As</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanSecurity#getRunAs()
	 * @see #getEnterpriseBeanSecurity()
	 * @generated
	 */
	EReference getEnterpriseBeanSecurity_RunAs();

	/**
	 * Returns the meta object for class '{@link de.mkonersmann.ejb31.Role
	 * <em>Role</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Role</em>'.
	 * @see de.mkonersmann.ejb31.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.Role#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.mkonersmann.ejb31.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity
	 * <em>Enterprise Bean Operation Security</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enterprise Bean Operation
	 *         Security</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity
	 * @generated
	 */
	EClass getEnterpriseBeanOperationSecurity();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity#isPermitAll
	 * <em>Permit All</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Permit All</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity#isPermitAll()
	 * @see #getEnterpriseBeanOperationSecurity()
	 * @generated
	 */
	EAttribute getEnterpriseBeanOperationSecurity_PermitAll();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity#isDenyAll
	 * <em>Deny All</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Deny All</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity#isDenyAll()
	 * @see #getEnterpriseBeanOperationSecurity()
	 * @generated
	 */
	EAttribute getEnterpriseBeanOperationSecurity_DenyAll();

	/**
	 * Returns the meta object for the reference list
	 * '{@link de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity#getRolesAllowed
	 * <em>Roles Allowed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Roles Allowed</em>'.
	 * @see de.mkonersmann.ejb31.EnterpriseBeanOperationSecurity#getRolesAllowed()
	 * @see #getEnterpriseBeanOperationSecurity()
	 * @generated
	 */
	EReference getEnterpriseBeanOperationSecurity_RolesAllowed();

	/**
	 * Returns the meta object for enum
	 * '{@link de.mkonersmann.ejb31.DestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Destination Type</em>'.
	 * @see de.mkonersmann.ejb31.DestinationType
	 * @generated
	 */
	EEnum getDestinationType();

	/**
	 * Returns the meta object for enum
	 * '{@link de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity <em>Entity
	 * Type Reference Multiplicity</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Entity Type Reference
	 *         Multiplicity</em>'.
	 * @see de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity
	 * @generated
	 */
	EEnum getEntityTypeReferenceMultiplicity();

	/**
	 * Returns the meta object for enum
	 * '{@link de.mkonersmann.ejb31.JavaTypeReferenceMultipicity <em>Java Type
	 * Reference Multipicity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Java Type Reference
	 *         Multipicity</em>'.
	 * @see de.mkonersmann.ejb31.JavaTypeReferenceMultipicity
	 * @generated
	 */
	EEnum getJavaTypeReferenceMultipicity();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ejb31Factory getEjb31Factory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.ClientImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EnvironmentEntryImpl
		 * <em>Environment Entry</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EnvironmentEntryImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnvironmentEntry()
		 * @generated
		 */
		EClass ENVIRONMENT_ENTRY = eINSTANCE.getEnvironmentEntry();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.ArchiveImpl <em>Archive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.ArchiveImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getArchive()
		 * @generated
		 */
		EClass ARCHIVE = eINSTANCE.getArchive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ARCHIVE__NAME = eINSTANCE.getArchive_Name();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ARCHIVE__CONTAINER = eINSTANCE.getArchive_Container();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EnterpriseArchiveImpl
		 * <em>Enterprise Archive</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EnterpriseArchiveImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseArchive()
		 * @generated
		 */
		EClass ENTERPRISE_ARCHIVE = eINSTANCE.getEnterpriseArchive();

		/**
		 * The meta object literal for the '<em><b>Ejb Archives</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_ARCHIVE__EJB_ARCHIVES = eINSTANCE.getEnterpriseArchive_EjbArchives();

		/**
		 * The meta object literal for the '<em><b>Assembly
		 * Information</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_ARCHIVE__ASSEMBLY_INFORMATION = eINSTANCE.getEnterpriseArchive_AssemblyInformation();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_ARCHIVE__LIBRARIES = eINSTANCE.getEnterpriseArchive_Libraries();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EJBArchiveImpl <em>EJB
		 * Archive</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EJBArchiveImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBArchive()
		 * @generated
		 */
		EClass EJB_ARCHIVE = eINSTANCE.getEJBArchive();

		/**
		 * The meta object literal for the '<em><b>Root Packages</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_ARCHIVE__ROOT_PACKAGES = eINSTANCE.getEJBArchive_RootPackages();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.ApplicationAssemblyInformationImpl
		 * <em>Application Assembly Information</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.ApplicationAssemblyInformationImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getApplicationAssemblyInformation()
		 * @generated
		 */
		EClass APPLICATION_ASSEMBLY_INFORMATION = eINSTANCE.getApplicationAssemblyInformation();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.LibraryImpl <em>Library</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.LibraryImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Root Packages</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__ROOT_PACKAGES = eINSTANCE.getLibrary_RootPackages();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.ContainerImpl <em>Container</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.ContainerImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINER__PROVIDES = eINSTANCE.getContainer_Provides();

		/**
		 * The meta object literal for the '<em><b>Deployed Archives</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINER__DEPLOYED_ARCHIVES = eINSTANCE.getContainer_DeployedArchives();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINER__CONNECTED_TO = eINSTANCE.getContainer_ConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Environment Entries</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINER__ENVIRONMENT_ENTRIES = eINSTANCE.getContainer_EnvironmentEntries();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.ContainerServiceImpl <em>Container
		 * Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.ContainerServiceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getContainerService()
		 * @generated
		 */
		EClass CONTAINER_SERVICE = eINSTANCE.getContainerService();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.SecurityServiceImpl <em>Security
		 * Service</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.SecurityServiceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSecurityService()
		 * @generated
		 */
		EClass SECURITY_SERVICE = eINSTANCE.getSecurityService();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.ConcurrencyServiceImpl
		 * <em>Concurrency Service</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.ConcurrencyServiceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getConcurrencyService()
		 * @generated
		 */
		EClass CONCURRENCY_SERVICE = eINSTANCE.getConcurrencyService();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.TransactionServiceImpl
		 * <em>Transaction Service</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.TransactionServiceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getTransactionService()
		 * @generated
		 */
		EClass TRANSACTION_SERVICE = eINSTANCE.getTransactionService();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.SecondaryStorageServiceImpl
		 * <em>Secondary Storage Service</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.SecondaryStorageServiceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSecondaryStorageService()
		 * @generated
		 */
		EClass SECONDARY_STORAGE_SERVICE = eINSTANCE.getSecondaryStorageService();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EnterpriseBeanImpl <em>Enterprise
		 * Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EnterpriseBeanImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseBean()
		 * @generated
		 */
		EClass ENTERPRISE_BEAN = eINSTANCE.getEnterpriseBean();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTERPRISE_BEAN__NAME = eINSTANCE.getEnterpriseBean_Name();

		/**
		 * The meta object literal for the '<em><b>Environment Entries</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN__ENVIRONMENT_ENTRIES = eINSTANCE.getEnterpriseBean_EnvironmentEntries();

		/**
		 * The meta object literal for the '<em><b>Service
		 * Dependencies</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN__SERVICE_DEPENDENCIES = eINSTANCE.getEnterpriseBean_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Bean References</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN__BEAN_REFERENCES = eINSTANCE.getEnterpriseBean_BeanReferences();

		/**
		 * The meta object literal for the '<em><b>Security Specs</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN__SECURITY_SPECS = eINSTANCE.getEnterpriseBean_SecuritySpecs();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.StatelessSessionBeanImpl
		 * <em>Stateless Session Bean</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.StatelessSessionBeanImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getStatelessSessionBean()
		 * @generated
		 */
		EClass STATELESS_SESSION_BEAN = eINSTANCE.getStatelessSessionBean();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.SessionBeanImpl <em>Session
		 * Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.SessionBeanImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSessionBean()
		 * @generated
		 */
		EClass SESSION_BEAN = eINSTANCE.getSessionBean();

		/**
		 * The meta object literal for the '<em><b>Owned Operation
		 * Signature</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SESSION_BEAN__OWNED_OPERATION_SIGNATURE = eINSTANCE.getSessionBean_OwnedOperationSignature();

		/**
		 * The meta object literal for the '<em><b>Local Business
		 * Interfaces</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SESSION_BEAN__LOCAL_BUSINESS_INTERFACES = eINSTANCE.getSessionBean_LocalBusinessInterfaces();

		/**
		 * The meta object literal for the '<em><b>Owned Operations</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SESSION_BEAN__OWNED_OPERATIONS = eINSTANCE.getSessionBean_OwnedOperations();

		/**
		 * The meta object literal for the '<em><b>Remote Business
		 * Interfaces</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SESSION_BEAN__REMOTE_BUSINESS_INTERFACES = eINSTANCE.getSessionBean_RemoteBusinessInterfaces();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SESSION_BEAN__INSTANCES = eINSTANCE.getSessionBean_Instances();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl <em>Message
		 * Driven Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.MessageDrivenBeanImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getMessageDrivenBean()
		 * @generated
		 */
		EClass MESSAGE_DRIVEN_BEAN = eINSTANCE.getMessageDrivenBean();

		/**
		 * The meta object literal for the '<em><b>Destination Type</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__DESTINATION_TYPE = eINSTANCE.getMessageDrivenBean_DestinationType();

		/**
		 * The meta object literal for the '<em><b>Message Selector
		 * Entries</b></em>' map feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__MESSAGE_SELECTOR_ENTRIES = eINSTANCE
				.getMessageDrivenBean_MessageSelectorEntries();

		/**
		 * The meta object literal for the '<em><b>Owned Operation
		 * Signatures</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__OWNED_OPERATION_SIGNATURES = eINSTANCE
				.getMessageDrivenBean_OwnedOperationSignatures();

		/**
		 * The meta object literal for the '<em><b>Owned Operations</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__OWNED_OPERATIONS = eINSTANCE.getMessageDrivenBean_OwnedOperations();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.StatefulSessionBeanImpl
		 * <em>Stateful Session Bean</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.StatefulSessionBeanImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getStatefulSessionBean()
		 * @generated
		 */
		EClass STATEFUL_SESSION_BEAN = eINSTANCE.getStatefulSessionBean();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.SingletonSessionBeanImpl
		 * <em>Singleton Session Bean</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.SingletonSessionBeanImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSingletonSessionBean()
		 * @generated
		 */
		EClass SINGLETON_SESSION_BEAN = eINSTANCE.getSingletonSessionBean();

		/**
		 * The meta object literal for the '<em><b>Startup</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SINGLETON_SESSION_BEAN__STARTUP = eINSTANCE.getSingletonSessionBean_Startup();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.OperationSignatureImpl
		 * <em>Operation Signature</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.OperationSignatureImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getOperationSignature()
		 * @generated
		 */
		EClass OPERATION_SIGNATURE = eINSTANCE.getOperationSignature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION_SIGNATURE__NAME = eINSTANCE.getOperationSignature_Name();

		/**
		 * The meta object literal for the '<em><b>Return Java Type</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION_SIGNATURE__RETURN_JAVA_TYPE = eINSTANCE.getOperationSignature_ReturnJavaType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__PARAMETERS = eINSTANCE.getOperationSignature_Parameters();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION_SIGNATURE__EXCEPTIONS = eINSTANCE.getOperationSignature_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Return Application
		 * Type</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__RETURN_APPLICATION_TYPE = eINSTANCE
				.getOperationSignature_ReturnApplicationType();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.BusinessInterfaceImpl <em>Business
		 * Interface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.BusinessInterfaceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getBusinessInterface()
		 * @generated
		 */
		EClass BUSINESS_INTERFACE = eINSTANCE.getBusinessInterface();

		/**
		 * The meta object literal for the '<em><b>Owned Operation
		 * Signature</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUSINESS_INTERFACE__OWNED_OPERATION_SIGNATURE = eINSTANCE
				.getBusinessInterface_OwnedOperationSignature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUSINESS_INTERFACE__NAME = eINSTANCE.getBusinessInterface_Name();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.BeanReferenceImpl <em>Bean
		 * Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.BeanReferenceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getBeanReference()
		 * @generated
		 */
		EClass BEAN_REFERENCE = eINSTANCE.getBeanReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEAN_REFERENCE__REFERENCE = eINSTANCE.getBeanReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BEAN_REFERENCE__DESCRIPTION = eINSTANCE.getBeanReference_Description();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EJBReferenceImpl <em>EJB
		 * Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EJBReferenceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBReference()
		 * @generated
		 */
		EClass EJB_REFERENCE = eINSTANCE.getEJBReference();

		/**
		 * The meta object literal for the '<em><b>Sessionbean</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_REFERENCE__SESSIONBEAN = eINSTANCE.getEJBReference_Sessionbean();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.OperationParameterImpl
		 * <em>Operation Parameter</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.OperationParameterImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getOperationParameter()
		 * @generated
		 */
		EClass OPERATION_PARAMETER = eINSTANCE.getOperationParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER__NAME = eINSTANCE.getOperationParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Java Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER__JAVA_TYPE = eINSTANCE.getOperationParameter_JavaType();

		/**
		 * The meta object literal for the '<em><b>Application Data
		 * Type</b></em>' reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION_PARAMETER__APPLICATION_DATA_TYPE = eINSTANCE.getOperationParameter_ApplicationDataType();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.LocalProvisionImpl <em>Local
		 * Provision</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.LocalProvisionImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getLocalProvision()
		 * @generated
		 */
		EClass LOCAL_PROVISION = eINSTANCE.getLocalProvision();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LOCAL_PROVISION__INTERFACE = eINSTANCE.getLocalProvision_Interface();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.RemoteProvision <em>Remote
		 * Provision</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.RemoteProvision
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getRemoteProvision()
		 * @generated
		 */
		EClass REMOTE_PROVISION = eINSTANCE.getRemoteProvision();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REMOTE_PROVISION__INTERFACE = eINSTANCE.getRemoteProvision_Interface();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.MessageSelectorImpl <em>Message
		 * Selector</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.MessageSelectorImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getMessageSelector()
		 * @generated
		 */
		EClass MESSAGE_SELECTOR = eINSTANCE.getMessageSelector();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MESSAGE_SELECTOR__KEY = eINSTANCE.getMessageSelector_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MESSAGE_SELECTOR__VALUE = eINSTANCE.getMessageSelector_Value();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.DataTypeImpl <em>Data Type</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.DataTypeImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_TYPE__SUPER_TYPE = eINSTANCE.getDataType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Owned Operations</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_TYPE__OWNED_OPERATIONS = eINSTANCE.getDataType_OwnedOperations();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.OperationImpl <em>Operation</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.OperationImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION__SIGNATURE = eINSTANCE.getOperation_Signature();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.DataTypeOperationImpl <em>Data Type
		 * Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.DataTypeOperationImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getDataTypeOperation()
		 * @generated
		 */
		EClass DATA_TYPE_OPERATION = eINSTANCE.getDataTypeOperation();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_TYPE_OPERATION__SIGNATURE = eINSTANCE.getDataTypeOperation_Signature();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.SessionBeanOperationImpl
		 * <em>Session Bean Operation</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.SessionBeanOperationImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSessionBeanOperation()
		 * @generated
		 */
		EClass SESSION_BEAN_OPERATION = eINSTANCE.getSessionBeanOperation();

		/**
		 * The meta object literal for the '<em><b>Pre Destroy</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SESSION_BEAN_OPERATION__PRE_DESTROY = eINSTANCE.getSessionBeanOperation_PreDestroy();

		/**
		 * The meta object literal for the '<em><b>Post Construct</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SESSION_BEAN_OPERATION__POST_CONSTRUCT = eINSTANCE.getSessionBeanOperation_PostConstruct();

		/**
		 * The meta object literal for the '<em><b>Pre Passivate</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SESSION_BEAN_OPERATION__PRE_PASSIVATE = eINSTANCE.getSessionBeanOperation_PrePassivate();

		/**
		 * The meta object literal for the '<em><b>Post Activate</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SESSION_BEAN_OPERATION__POST_ACTIVATE = eINSTANCE.getSessionBeanOperation_PostActivate();

		/**
		 * The meta object literal for the '<em><b>Security Specs</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SESSION_BEAN_OPERATION__SECURITY_SPECS = eINSTANCE.getSessionBeanOperation_SecuritySpecs();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.MessageDrivenBeanOperationImpl
		 * <em>Message Driven Bean Operation</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.MessageDrivenBeanOperationImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getMessageDrivenBeanOperation()
		 * @generated
		 */
		EClass MESSAGE_DRIVEN_BEAN_OPERATION = eINSTANCE.getMessageDrivenBeanOperation();

		/**
		 * The meta object literal for the '<em><b>Post Construct</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN_OPERATION__POST_CONSTRUCT = eINSTANCE
				.getMessageDrivenBeanOperation_PostConstruct();

		/**
		 * The meta object literal for the '<em><b>Pre Destroy</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN_OPERATION__PRE_DESTROY = eINSTANCE.getMessageDrivenBeanOperation_PreDestroy();

		/**
		 * The meta object literal for the '<em><b>Security Specs</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN_OPERATION__SECURITY_SPECS = eINSTANCE
				.getMessageDrivenBeanOperation_SecuritySpecs();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.SynchronousOperationImpl
		 * <em>Synchronous Operation</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.SynchronousOperationImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSynchronousOperation()
		 * @generated
		 */
		EClass SYNCHRONOUS_OPERATION = eINSTANCE.getSynchronousOperation();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.AsynchronousOperationImpl
		 * <em>Asynchronous Operation</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.AsynchronousOperationImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getAsynchronousOperation()
		 * @generated
		 */
		EClass ASYNCHRONOUS_OPERATION = eINSTANCE.getAsynchronousOperation();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EntityBeanImpl <em>Entity
		 * Bean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EntityBeanImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEntityBean()
		 * @generated
		 */
		EClass ENTITY_BEAN = eINSTANCE.getEntityBean();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_BEAN__NAME = eINSTANCE.getEntityBean_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_BEAN__ATTRIBUTES = eINSTANCE.getEntityBean_Attributes();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_BEAN__SUPER_TYPE = eINSTANCE.getEntityBean_SuperType();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.AbstractEntityAttributeImpl
		 * <em>Abstract Entity Attribute</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.AbstractEntityAttributeImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getAbstractEntityAttribute()
		 * @generated
		 */
		EClass ABSTRACT_ENTITY_ATTRIBUTE = eINSTANCE.getAbstractEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ABSTRACT_ENTITY_ATTRIBUTE__NAME = eINSTANCE.getAbstractEntityAttribute_Name();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.JavaTypeAttributeImpl <em>Java Type
		 * Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.JavaTypeAttributeImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getJavaTypeAttribute()
		 * @generated
		 */
		EClass JAVA_TYPE_ATTRIBUTE = eINSTANCE.getJavaTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute JAVA_TYPE_ATTRIBUTE__TYPE = eINSTANCE.getJavaTypeAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute JAVA_TYPE_ATTRIBUTE__MULTIPLICITY = eINSTANCE.getJavaTypeAttribute_Multiplicity();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EntityAttributeImpl <em>Entity
		 * Attribute</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EntityAttributeImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEntityAttribute()
		 * @generated
		 */
		EClass ENTITY_ATTRIBUTE = eINSTANCE.getEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTITY_ATTRIBUTE__TYPE = eINSTANCE.getEntityAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE__MULTIPLICITY = eINSTANCE.getEntityAttribute_Multiplicity();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EJBPackageImpl <em>EJB
		 * Package</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EJBPackageImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBPackage()
		 * @generated
		 */
		EClass EJB_PACKAGE = eINSTANCE.getEJBPackage();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_PACKAGE__BEANS = eINSTANCE.getEJBPackage_Beans();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_PACKAGE__INTERFACES = eINSTANCE.getEJBPackage_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EJB_PACKAGE__NAME = eINSTANCE.getEJBPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_PACKAGE__DATA_TYPES = eINSTANCE.getEJBPackage_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_PACKAGE__CHILDREN = eINSTANCE.getEJBPackage_Children();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.IdentifiedElementImpl
		 * <em>Identified Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.IdentifiedElementImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.ProvisionImpl <em>Provision</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.ProvisionImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getProvision()
		 * @generated
		 */
		EClass PROVISION = eINSTANCE.getProvision();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.SessionBeanInstanceImpl <em>Session
		 * Bean Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.SessionBeanInstanceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getSessionBeanInstance()
		 * @generated
		 */
		EClass SESSION_BEAN_INSTANCE = eINSTANCE.getSessionBeanInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SESSION_BEAN_INSTANCE__NAME = eINSTANCE.getSessionBeanInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Referenceinstances</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SESSION_BEAN_INSTANCE__REFERENCEINSTANCES = eINSTANCE.getSessionBeanInstance_Referenceinstances();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EJBReferenceInstanceImpl <em>EJB
		 * Reference Instance</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EJBReferenceInstanceImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEJBReferenceInstance()
		 * @generated
		 */
		EClass EJB_REFERENCE_INSTANCE = eINSTANCE.getEJBReferenceInstance();

		/**
		 * The meta object literal for the '<em><b>Ejbreference</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_REFERENCE_INSTANCE__EJBREFERENCE = eINSTANCE.getEJBReferenceInstance_Ejbreference();

		/**
		 * The meta object literal for the '<em><b>Sessionbeaninstance</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EJB_REFERENCE_INSTANCE__SESSIONBEANINSTANCE = eINSTANCE
				.getEJBReferenceInstance_Sessionbeaninstance();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl
		 * <em>Enterprise Bean Security</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EnterpriseBeanSecurityImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseBeanSecurity()
		 * @generated
		 */
		EClass ENTERPRISE_BEAN_SECURITY = eINSTANCE.getEnterpriseBeanSecurity();

		/**
		 * The meta object literal for the '<em><b>Permit All</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTERPRISE_BEAN_SECURITY__PERMIT_ALL = eINSTANCE.getEnterpriseBeanSecurity_PermitAll();

		/**
		 * The meta object literal for the '<em><b>Deny All</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTERPRISE_BEAN_SECURITY__DENY_ALL = eINSTANCE.getEnterpriseBeanSecurity_DenyAll();

		/**
		 * The meta object literal for the '<em><b>Roles Allowed</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN_SECURITY__ROLES_ALLOWED = eINSTANCE.getEnterpriseBeanSecurity_RolesAllowed();

		/**
		 * The meta object literal for the '<em><b>Roles Declared</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN_SECURITY__ROLES_DECLARED = eINSTANCE.getEnterpriseBeanSecurity_RolesDeclared();

		/**
		 * The meta object literal for the '<em><b>Run As</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN_SECURITY__RUN_AS = eINSTANCE.getEnterpriseBeanSecurity_RunAs();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.RoleImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.impl.EnterpriseBeanOperationSecurityImpl
		 * <em>Enterprise Bean Operation Security</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.impl.EnterpriseBeanOperationSecurityImpl
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEnterpriseBeanOperationSecurity()
		 * @generated
		 */
		EClass ENTERPRISE_BEAN_OPERATION_SECURITY = eINSTANCE.getEnterpriseBeanOperationSecurity();

		/**
		 * The meta object literal for the '<em><b>Permit All</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTERPRISE_BEAN_OPERATION_SECURITY__PERMIT_ALL = eINSTANCE
				.getEnterpriseBeanOperationSecurity_PermitAll();

		/**
		 * The meta object literal for the '<em><b>Deny All</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTERPRISE_BEAN_OPERATION_SECURITY__DENY_ALL = eINSTANCE
				.getEnterpriseBeanOperationSecurity_DenyAll();

		/**
		 * The meta object literal for the '<em><b>Roles Allowed</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENTERPRISE_BEAN_OPERATION_SECURITY__ROLES_ALLOWED = eINSTANCE
				.getEnterpriseBeanOperationSecurity_RolesAllowed();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.DestinationType <em>Destination
		 * Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.DestinationType
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getDestinationType()
		 * @generated
		 */
		EEnum DESTINATION_TYPE = eINSTANCE.getDestinationType();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity
		 * <em>Entity Type Reference Multiplicity</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.EntityTypeReferenceMultiplicity
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getEntityTypeReferenceMultiplicity()
		 * @generated
		 */
		EEnum ENTITY_TYPE_REFERENCE_MULTIPLICITY = eINSTANCE.getEntityTypeReferenceMultiplicity();

		/**
		 * The meta object literal for the
		 * '{@link de.mkonersmann.ejb31.JavaTypeReferenceMultipicity <em>Java
		 * Type Reference Multipicity</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.mkonersmann.ejb31.JavaTypeReferenceMultipicity
		 * @see de.mkonersmann.ejb31.impl.Ejb31PackageImpl#getJavaTypeReferenceMultipicity()
		 * @generated
		 */
		EEnum JAVA_TYPE_REFERENCE_MULTIPICITY = eINSTANCE.getJavaTypeReferenceMultipicity();

	}

} // Ejb31Package
