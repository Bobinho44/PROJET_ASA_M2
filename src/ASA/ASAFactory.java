/**
 */
package ASA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ASA.ASAPackage
 * @generated
 */
public interface ASAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASAFactory eINSTANCE = ASA.impl.ASAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Component Required Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Required Interface</em>'.
	 * @generated
	 */
	ComponentRequiredInterface createComponentRequiredInterface();

	/**
	 * Returns a new object of class '<em>Component Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Required Port</em>'.
	 * @generated
	 */
	ComponentRequiredPort createComponentRequiredPort();

	/**
	 * Returns a new object of class '<em>Component Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Port</em>'.
	 * @generated
	 */
	ComponentPort createComponentPort();

	/**
	 * Returns a new object of class '<em>Component Provided Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Provided Interface</em>'.
	 * @generated
	 */
	ComponentProvidedInterface createComponentProvidedInterface();

	/**
	 * Returns a new object of class '<em>Component Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Provided Port</em>'.
	 * @generated
	 */
	ComponentProvidedPort createComponentProvidedPort();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Configuration Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Interface</em>'.
	 * @generated
	 */
	ConfigurationInterface createConfigurationInterface();

	/**
	 * Returns a new object of class '<em>Configuration Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Required Port</em>'.
	 * @generated
	 */
	ConfigurationRequiredPort createConfigurationRequiredPort();

	/**
	 * Returns a new object of class '<em>Configuration Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Port</em>'.
	 * @generated
	 */
	ConfigurationPort createConfigurationPort();

	/**
	 * Returns a new object of class '<em>Configuration Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Provided Port</em>'.
	 * @generated
	 */
	ConfigurationProvidedPort createConfigurationProvidedPort();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Connector From Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector From Interface</em>'.
	 * @generated
	 */
	ConnectorFromInterface createConnectorFromInterface();

	/**
	 * Returns a new object of class '<em>Connector To Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector To Interface</em>'.
	 * @generated
	 */
	ConnectorToInterface createConnectorToInterface();

	/**
	 * Returns a new object of class '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue</em>'.
	 * @generated
	 */
	Glue createGlue();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Role From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role From</em>'.
	 * @generated
	 */
	RoleFrom createRoleFrom();

	/**
	 * Returns a new object of class '<em>Role To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role To</em>'.
	 * @generated
	 */
	RoleTo createRoleTo();

	/**
	 * Returns a new object of class '<em>Service Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Provided</em>'.
	 * @generated
	 */
	ServiceProvided createServiceProvided();

	/**
	 * Returns a new object of class '<em>Service Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Required</em>'.
	 * @generated
	 */
	ServiceRequired createServiceRequired();

	/**
	 * Returns a new object of class '<em>Technical Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technical Constraint</em>'.
	 * @generated
	 */
	TechnicalConstraint createTechnicalConstraint();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ASAPackage getASAPackage();

} //ASAFactory
