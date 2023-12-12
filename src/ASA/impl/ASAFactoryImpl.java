/**
 */
package ASA.impl;

import ASA.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASAFactoryImpl extends EFactoryImpl implements ASAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ASAFactory init() {
		try {
			ASAFactory theASAFactory = (ASAFactory)EPackage.Registry.INSTANCE.getEFactory(ASAPackage.eNS_URI);
			if (theASAFactory != null) {
				return theASAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ASAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ASAPackage.COMPONENT: return createComponent();
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE: return createComponentRequiredInterface();
			case ASAPackage.COMPONENT_REQUIRED_PORT: return createComponentRequiredPort();
			case ASAPackage.COMPONENT_PORT: return createComponentPort();
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE: return createComponentProvidedInterface();
			case ASAPackage.COMPONENT_PROVIDED_PORT: return createComponentProvidedPort();
			case ASAPackage.CONFIGURATION: return createConfiguration();
			case ASAPackage.CONFIGURATION_INTERFACE: return createConfigurationInterface();
			case ASAPackage.CONFIGURATION_REQUIRED_PORT: return createConfigurationRequiredPort();
			case ASAPackage.CONFIGURATION_PORT: return createConfigurationPort();
			case ASAPackage.CONFIGURATION_PROVIDED_PORT: return createConfigurationProvidedPort();
			case ASAPackage.CONNECTOR: return createConnector();
			case ASAPackage.CONNECTOR_FROM_INTERFACE: return createConnectorFromInterface();
			case ASAPackage.CONNECTOR_TO_INTERFACE: return createConnectorToInterface();
			case ASAPackage.GLUE: return createGlue();
			case ASAPackage.MESSAGE: return createMessage();
			case ASAPackage.PROPERTY: return createProperty();
			case ASAPackage.ROLE_FROM: return createRoleFrom();
			case ASAPackage.ROLE_TO: return createRoleTo();
			case ASAPackage.SERVICE_PROVIDED: return createServiceProvided();
			case ASAPackage.SERVICE_REQUIRED: return createServiceRequired();
			case ASAPackage.TECHNICAL_CONSTRAINT: return createTechnicalConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRequiredInterface createComponentRequiredInterface() {
		ComponentRequiredInterfaceImpl componentRequiredInterface = new ComponentRequiredInterfaceImpl();
		return componentRequiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRequiredPort createComponentRequiredPort() {
		ComponentRequiredPortImpl componentRequiredPort = new ComponentRequiredPortImpl();
		return componentRequiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPort createComponentPort() {
		ComponentPortImpl componentPort = new ComponentPortImpl();
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentProvidedInterface createComponentProvidedInterface() {
		ComponentProvidedInterfaceImpl componentProvidedInterface = new ComponentProvidedInterfaceImpl();
		return componentProvidedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentProvidedPort createComponentProvidedPort() {
		ComponentProvidedPortImpl componentProvidedPort = new ComponentProvidedPortImpl();
		return componentProvidedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationInterface createConfigurationInterface() {
		ConfigurationInterfaceImpl configurationInterface = new ConfigurationInterfaceImpl();
		return configurationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationRequiredPort createConfigurationRequiredPort() {
		ConfigurationRequiredPortImpl configurationRequiredPort = new ConfigurationRequiredPortImpl();
		return configurationRequiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationPort createConfigurationPort() {
		ConfigurationPortImpl configurationPort = new ConfigurationPortImpl();
		return configurationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationProvidedPort createConfigurationProvidedPort() {
		ConfigurationProvidedPortImpl configurationProvidedPort = new ConfigurationProvidedPortImpl();
		return configurationProvidedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorFromInterface createConnectorFromInterface() {
		ConnectorFromInterfaceImpl connectorFromInterface = new ConnectorFromInterfaceImpl();
		return connectorFromInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorToInterface createConnectorToInterface() {
		ConnectorToInterfaceImpl connectorToInterface = new ConnectorToInterfaceImpl();
		return connectorToInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleFrom createRoleFrom() {
		RoleFromImpl roleFrom = new RoleFromImpl();
		return roleFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleTo createRoleTo() {
		RoleToImpl roleTo = new RoleToImpl();
		return roleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceProvided createServiceProvided() {
		ServiceProvidedImpl serviceProvided = new ServiceProvidedImpl();
		return serviceProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRequired createServiceRequired() {
		ServiceRequiredImpl serviceRequired = new ServiceRequiredImpl();
		return serviceRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnicalConstraint createTechnicalConstraint() {
		TechnicalConstraintImpl technicalConstraint = new TechnicalConstraintImpl();
		return technicalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASAPackage getASAPackage() {
		return (ASAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ASAPackage getPackage() {
		return ASAPackage.eINSTANCE;
	}

} //ASAFactoryImpl
