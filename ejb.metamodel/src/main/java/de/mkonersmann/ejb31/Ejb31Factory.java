/**
 */
package de.mkonersmann.ejb31;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see de.mkonersmann.ejb31.Ejb31Package
 * @generated
 */
public interface Ejb31Factory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	Ejb31Factory eINSTANCE = de.mkonersmann.ejb31.impl.Ejb31FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Environment Entry</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Environment Entry</em>'.
	 * @generated
	 */
	EnvironmentEntry createEnvironmentEntry();

	/**
	 * Returns a new object of class '<em>Enterprise Archive</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Enterprise Archive</em>'.
	 * @generated
	 */
	EnterpriseArchive createEnterpriseArchive();

	/**
	 * Returns a new object of class '<em>EJB Archive</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EJB Archive</em>'.
	 * @generated
	 */
	EJBArchive createEJBArchive();

	/**
	 * Returns a new object of class '<em>Application Assembly
	 * Information</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Application Assembly
	 *         Information</em>'.
	 * @generated
	 */
	ApplicationAssemblyInformation createApplicationAssemblyInformation();

	/**
	 * Returns a new object of class '<em>Library</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Security Service</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Security Service</em>'.
	 * @generated
	 */
	SecurityService createSecurityService();

	/**
	 * Returns a new object of class '<em>Concurrency Service</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Concurrency Service</em>'.
	 * @generated
	 */
	ConcurrencyService createConcurrencyService();

	/**
	 * Returns a new object of class '<em>Transaction Service</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transaction Service</em>'.
	 * @generated
	 */
	TransactionService createTransactionService();

	/**
	 * Returns a new object of class '<em>Secondary Storage Service</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Secondary Storage Service</em>'.
	 * @generated
	 */
	SecondaryStorageService createSecondaryStorageService();

	/**
	 * Returns a new object of class '<em>Stateless Session Bean</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Stateless Session Bean</em>'.
	 * @generated
	 */
	StatelessSessionBean createStatelessSessionBean();

	/**
	 * Returns a new object of class '<em>Session Bean</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Session Bean</em>'.
	 * @generated
	 */
	SessionBean createSessionBean();

	/**
	 * Returns a new object of class '<em>Message Driven Bean</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Message Driven Bean</em>'.
	 * @generated
	 */
	MessageDrivenBean createMessageDrivenBean();

	/**
	 * Returns a new object of class '<em>Stateful Session Bean</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Stateful Session Bean</em>'.
	 * @generated
	 */
	StatefulSessionBean createStatefulSessionBean();

	/**
	 * Returns a new object of class '<em>Singleton Session Bean</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Singleton Session Bean</em>'.
	 * @generated
	 */
	SingletonSessionBean createSingletonSessionBean();

	/**
	 * Returns a new object of class '<em>Operation Signature</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Operation Signature</em>'.
	 * @generated
	 */
	OperationSignature createOperationSignature();

	/**
	 * Returns a new object of class '<em>Business Interface</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Business Interface</em>'.
	 * @generated
	 */
	BusinessInterface createBusinessInterface();

	/**
	 * Returns a new object of class '<em>EJB Reference</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EJB Reference</em>'.
	 * @generated
	 */
	EJBReference createEJBReference();

	/**
	 * Returns a new object of class '<em>Operation Parameter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Operation Parameter</em>'.
	 * @generated
	 */
	OperationParameter createOperationParameter();

	/**
	 * Returns a new object of class '<em>Local Provision</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Local Provision</em>'.
	 * @generated
	 */
	LocalProvision createLocalProvision();

	/**
	 * Returns a new object of class '<em>Data Type</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Data Type Operation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Type Operation</em>'.
	 * @generated
	 */
	DataTypeOperation createDataTypeOperation();

	/**
	 * Returns a new object of class '<em>Message Driven Bean Operation</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Message Driven Bean Operation</em>'.
	 * @generated
	 */
	MessageDrivenBeanOperation createMessageDrivenBeanOperation();

	/**
	 * Returns a new object of class '<em>Synchronous Operation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Synchronous Operation</em>'.
	 * @generated
	 */
	SynchronousOperation createSynchronousOperation();

	/**
	 * Returns a new object of class '<em>Asynchronous Operation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Asynchronous Operation</em>'.
	 * @generated
	 */
	AsynchronousOperation createAsynchronousOperation();

	/**
	 * Returns a new object of class '<em>Entity Bean</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity Bean</em>'.
	 * @generated
	 */
	EntityBean createEntityBean();

	/**
	 * Returns a new object of class '<em>Java Type Attribute</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Java Type Attribute</em>'.
	 * @generated
	 */
	JavaTypeAttribute createJavaTypeAttribute();

	/**
	 * Returns a new object of class '<em>Entity Attribute</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity Attribute</em>'.
	 * @generated
	 */
	EntityAttribute createEntityAttribute();

	/**
	 * Returns a new object of class '<em>EJB Package</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EJB Package</em>'.
	 * @generated
	 */
	EJBPackage createEJBPackage();

	/**
	 * Returns a new object of class '<em>Identified Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Identified Element</em>'.
	 * @generated
	 */
	IdentifiedElement createIdentifiedElement();

	/**
	 * Returns a new object of class '<em>Session Bean Instance</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Session Bean Instance</em>'.
	 * @generated
	 */
	SessionBeanInstance createSessionBeanInstance();

	/**
	 * Returns a new object of class '<em>EJB Reference Instance</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EJB Reference Instance</em>'.
	 * @generated
	 */
	EJBReferenceInstance createEJBReferenceInstance();

	/**
	 * Returns a new object of class '<em>Enterprise Bean Security</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Enterprise Bean Security</em>'.
	 * @generated
	 */
	EnterpriseBeanSecurity createEnterpriseBeanSecurity();

	/**
	 * Returns a new object of class '<em>Role</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Enterprise Bean Operation
	 * Security</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Enterprise Bean Operation
	 *         Security</em>'.
	 * @generated
	 */
	EnterpriseBeanOperationSecurity createEnterpriseBeanOperationSecurity();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ejb31Package getEjb31Package();

} // Ejb31Factory
