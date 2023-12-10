/**
 */
package ASA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ASA.ASAFactory
 * @model kind="package"
 * @generated
 */
public interface ASAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ASA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ASA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ASA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASAPackage eINSTANCE = ASA.impl.ASAPackageImpl.init();

	/**
	 * The meta object id for the '{@link ASA.Bus <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.Bus
	 * @see ASA.impl.ASAPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 0;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___TRANSFER__MESSAGE = 0;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ASA.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ComponentImpl
	 * @see ASA.impl.ASAPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Technical Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TECHNICAL_CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_INTERFACE = 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ASA.Interface <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.Interface
	 * @see ASA.impl.ASAPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 18;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ASA.ComponentInterface <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.ComponentInterface
	 * @see ASA.impl.ASAPackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__OWNER = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ComponentRequiredInterfaceImpl <em>Component Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ComponentRequiredInterfaceImpl
	 * @see ASA.impl.ASAPackageImpl#getComponentRequiredInterface()
	 * @generated
	 */
	int COMPONENT_REQUIRED_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_INTERFACE__OWNER = COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Required Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS = COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_INTERFACE_FEATURE_COUNT = COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_INTERFACE_OPERATION_COUNT = COMPONENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.Port <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.Port
	 * @see ASA.impl.ASAPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 20;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = BUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___TRANSFER__MESSAGE = BUS___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = BUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ComponentPortImpl <em>Component Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ComponentPortImpl
	 * @see ASA.impl.ASAPackageImpl#getComponentPort()
	 * @generated
	 */
	int COMPONENT_PORT = 5;

	/**
	 * The number of structural features of the '<em>Component Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT___TRANSFER__MESSAGE = PORT___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Component Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ComponentRequiredPortImpl <em>Component Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ComponentRequiredPortImpl
	 * @see ASA.impl.ASAPackageImpl#getComponentRequiredPort()
	 * @generated
	 */
	int COMPONENT_REQUIRED_PORT = 4;

	/**
	 * The feature id for the '<em><b>Attachement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_PORT__ATTACHEMENT = COMPONENT_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_PORT__BINDING = COMPONENT_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_PORT__OWNER = COMPONENT_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_PORT_FEATURE_COUNT = COMPONENT_PORT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_PORT___TRANSFER__MESSAGE = COMPONENT_PORT___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Component Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REQUIRED_PORT_OPERATION_COUNT = COMPONENT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ComponentProvidedInterfaceImpl <em>Component Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ComponentProvidedInterfaceImpl
	 * @see ASA.impl.ASAPackageImpl#getComponentProvidedInterface()
	 * @generated
	 */
	int COMPONENT_PROVIDED_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_INTERFACE__OWNER = COMPONENT_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Provided Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS = COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_INTERFACE_FEATURE_COUNT = COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_INTERFACE_OPERATION_COUNT = COMPONENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ComponentProvidedPortImpl <em>Component Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ComponentProvidedPortImpl
	 * @see ASA.impl.ASAPackageImpl#getComponentProvidedPort()
	 * @generated
	 */
	int COMPONENT_PROVIDED_PORT = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_PORT__BINDING = COMPONENT_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_PORT__OWNER = COMPONENT_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_PORT_FEATURE_COUNT = COMPONENT_PORT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_PORT___TRANSFER__MESSAGE = COMPONENT_PORT___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Component Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROVIDED_PORT_OPERATION_COUNT = COMPONENT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConfigurationImpl
	 * @see ASA.impl.ASAPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ConfigurationInterfaceImpl <em>Configuration Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConfigurationInterfaceImpl
	 * @see ASA.impl.ASAPackageImpl#getConfigurationInterface()
	 * @generated
	 */
	int CONFIGURATION_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Required Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INTERFACE__REQUIRED_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Provided Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INTERFACE__PROVIDED_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INTERFACE__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Configuration Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configuration Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ConfigurationPortImpl <em>Configuration Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConfigurationPortImpl
	 * @see ASA.impl.ASAPackageImpl#getConfigurationPort()
	 * @generated
	 */
	int CONFIGURATION_PORT = 11;

	/**
	 * The number of structural features of the '<em>Configuration Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PORT___TRANSFER__MESSAGE = PORT___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Configuration Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ConfigurationRequiredPortImpl <em>Configuration Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConfigurationRequiredPortImpl
	 * @see ASA.impl.ASAPackageImpl#getConfigurationRequiredPort()
	 * @generated
	 */
	int CONFIGURATION_REQUIRED_PORT = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REQUIRED_PORT__BINDING = CONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REQUIRED_PORT__OWNER = CONFIGURATION_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REQUIRED_PORT_FEATURE_COUNT = CONFIGURATION_PORT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REQUIRED_PORT___TRANSFER__MESSAGE = CONFIGURATION_PORT___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Configuration Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REQUIRED_PORT_OPERATION_COUNT = CONFIGURATION_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ConfigurationProvidedPortImpl <em>Configuration Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConfigurationProvidedPortImpl
	 * @see ASA.impl.ASAPackageImpl#getConfigurationProvidedPort()
	 * @generated
	 */
	int CONFIGURATION_PROVIDED_PORT = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROVIDED_PORT__BINDING = CONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROVIDED_PORT__OWNER = CONFIGURATION_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROVIDED_PORT_FEATURE_COUNT = CONFIGURATION_PORT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROVIDED_PORT___TRANSFER__MESSAGE = CONFIGURATION_PORT___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Configuration Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROVIDED_PORT_OPERATION_COUNT = CONFIGURATION_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConnectorImpl
	 * @see ASA.impl.ASAPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 13;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__GLUE = 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ASA.ConnectorInterface <em>Connector Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.ConnectorInterface
	 * @see ASA.impl.ASAPackageImpl#getConnectorInterface()
	 * @generated
	 */
	int CONNECTOR_INTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INTERFACE__OWNER = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INTERFACE___TRANSFER__MESSAGE = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ASA.impl.ConnectorFromInterfaceImpl <em>Connector From Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConnectorFromInterfaceImpl
	 * @see ASA.impl.ASAPackageImpl#getConnectorFromInterface()
	 * @generated
	 */
	int CONNECTOR_FROM_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FROM_INTERFACE__OWNER = CONNECTOR_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>From Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FROM_INTERFACE__FROM_ROLES = CONNECTOR_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector From Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FROM_INTERFACE_FEATURE_COUNT = CONNECTOR_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FROM_INTERFACE___TRANSFER__MESSAGE = CONNECTOR_INTERFACE___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Connector From Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FROM_INTERFACE_OPERATION_COUNT = CONNECTOR_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.ConnectorToInterfaceImpl <em>Connector To Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.ConnectorToInterfaceImpl
	 * @see ASA.impl.ASAPackageImpl#getConnectorToInterface()
	 * @generated
	 */
	int CONNECTOR_TO_INTERFACE = 16;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TO_INTERFACE__OWNER = CONNECTOR_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>To Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TO_INTERFACE__TO_ROLES = CONNECTOR_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector To Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TO_INTERFACE_FEATURE_COUNT = CONNECTOR_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TO_INTERFACE___TRANSFER__MESSAGE = CONNECTOR_INTERFACE___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Connector To Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TO_INTERFACE_OPERATION_COUNT = CONNECTOR_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.GlueImpl
	 * @see ASA.impl.ASAPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 17;

	/**
	 * The feature id for the '<em><b>From Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__FROM_INTERFACE = BUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__TO_INTERFACE = BUS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = BUS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE___TRANSFER__MESSAGE = BUS___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = BUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASA.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.PropertyImpl
	 * @see ASA.impl.ASAPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 21;

	/**
	 * The meta object id for the '{@link ASA.Role <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.Role
	 * @see ASA.impl.ASAPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 22;

	/**
	 * The meta object id for the '{@link ASA.impl.RoleFromImpl <em>Role From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.RoleFromImpl
	 * @see ASA.impl.ASAPackageImpl#getRoleFrom()
	 * @generated
	 */
	int ROLE_FROM = 23;

	/**
	 * The meta object id for the '{@link ASA.impl.RoleToImpl <em>Role To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.RoleToImpl
	 * @see ASA.impl.ASAPackageImpl#getRoleTo()
	 * @generated
	 */
	int ROLE_TO = 24;

	/**
	 * The meta object id for the '{@link ASA.impl.TechnicalConstraintImpl <em>Technical Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.TechnicalConstraintImpl
	 * @see ASA.impl.ASAPackageImpl#getTechnicalConstraint()
	 * @generated
	 */
	int TECHNICAL_CONSTRAINT = 25;

	/**
	 * Returns the meta object for class '{@link ASA.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see ASA.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the '{@link ASA.Bus#transfer(ASA.Message) <em>Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer</em>' operation.
	 * @see ASA.Bus#transfer(ASA.Message)
	 * @generated
	 */
	EOperation getBus__Transfer__Message();

	/**
	 * The meta object id for the '{@link ASA.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASA.impl.MessageImpl
	 * @see ASA.impl.ASAPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 19;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DATA = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = BUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___TRANSFER__MESSAGE = BUS___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = BUS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attachement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FROM__ATTACHEMENT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FROM__OWNER = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FROM_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FROM___TRANSFER__MESSAGE = ROLE___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FROM_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO__OWNER = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO___TRANSFER__MESSAGE = ROLE___TRANSFER__MESSAGE;

	/**
	 * The number of operations of the '<em>Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_CONSTRAINT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Technical Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Technical Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_CONSTRAINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ASA.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see ASA.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link ASA.Component#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see ASA.Component#getProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Properties();

	/**
	 * Returns the meta object for the reference list '{@link ASA.Component#getTechnicalConstraints <em>Technical Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Technical Constraints</em>'.
	 * @see ASA.Component#getTechnicalConstraints()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_TechnicalConstraints();

	/**
	 * Returns the meta object for the reference '{@link ASA.Component#getRequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface</em>'.
	 * @see ASA.Component#getRequiredInterface()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RequiredInterface();

	/**
	 * Returns the meta object for the reference '{@link ASA.Component#getProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface</em>'.
	 * @see ASA.Component#getProvidedInterface()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedInterface();

	/**
	 * Returns the meta object for class '{@link ASA.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see ASA.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for the reference '{@link ASA.ComponentInterface#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.ComponentInterface#getOwner()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.ComponentRequiredInterface <em>Component Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Required Interface</em>'.
	 * @see ASA.ComponentRequiredInterface
	 * @generated
	 */
	EClass getComponentRequiredInterface();

	/**
	 * Returns the meta object for the reference list '{@link ASA.ComponentRequiredInterface#getRequiredPorts <em>Required Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Ports</em>'.
	 * @see ASA.ComponentRequiredInterface#getRequiredPorts()
	 * @see #getComponentRequiredInterface()
	 * @generated
	 */
	EReference getComponentRequiredInterface_RequiredPorts();

	/**
	 * Returns the meta object for class '{@link ASA.ComponentRequiredPort <em>Component Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Required Port</em>'.
	 * @see ASA.ComponentRequiredPort
	 * @generated
	 */
	EClass getComponentRequiredPort();

	/**
	 * Returns the meta object for the reference '{@link ASA.ComponentRequiredPort#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachement</em>'.
	 * @see ASA.ComponentRequiredPort#getAttachement()
	 * @see #getComponentRequiredPort()
	 * @generated
	 */
	EReference getComponentRequiredPort_Attachement();

	/**
	 * Returns the meta object for the reference '{@link ASA.ComponentRequiredPort#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see ASA.ComponentRequiredPort#getBinding()
	 * @see #getComponentRequiredPort()
	 * @generated
	 */
	EReference getComponentRequiredPort_Binding();

	/**
	 * Returns the meta object for the reference '{@link ASA.ComponentRequiredPort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.ComponentRequiredPort#getOwner()
	 * @see #getComponentRequiredPort()
	 * @generated
	 */
	EReference getComponentRequiredPort_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.ComponentPort <em>Component Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Port</em>'.
	 * @see ASA.ComponentPort
	 * @generated
	 */
	EClass getComponentPort();

	/**
	 * Returns the meta object for class '{@link ASA.ComponentProvidedInterface <em>Component Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Provided Interface</em>'.
	 * @see ASA.ComponentProvidedInterface
	 * @generated
	 */
	EClass getComponentProvidedInterface();

	/**
	 * Returns the meta object for the reference list '{@link ASA.ComponentProvidedInterface#getProvidedPorts <em>Provided Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Ports</em>'.
	 * @see ASA.ComponentProvidedInterface#getProvidedPorts()
	 * @see #getComponentProvidedInterface()
	 * @generated
	 */
	EReference getComponentProvidedInterface_ProvidedPorts();

	/**
	 * Returns the meta object for class '{@link ASA.ComponentProvidedPort <em>Component Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Provided Port</em>'.
	 * @see ASA.ComponentProvidedPort
	 * @generated
	 */
	EClass getComponentProvidedPort();

	/**
	 * Returns the meta object for the reference '{@link ASA.ComponentProvidedPort#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see ASA.ComponentProvidedPort#getBinding()
	 * @see #getComponentProvidedPort()
	 * @generated
	 */
	EReference getComponentProvidedPort_Binding();

	/**
	 * Returns the meta object for the reference '{@link ASA.ComponentProvidedPort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.ComponentProvidedPort#getOwner()
	 * @see #getComponentProvidedPort()
	 * @generated
	 */
	EReference getComponentProvidedPort_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see ASA.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link ASA.Configuration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see ASA.Configuration#getComponents()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Components();

	/**
	 * Returns the meta object for the reference list '{@link ASA.Configuration#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see ASA.Configuration#getConnectors()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connectors();

	/**
	 * Returns the meta object for the reference '{@link ASA.Configuration#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see ASA.Configuration#getInterface()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Interface();

	/**
	 * Returns the meta object for class '{@link ASA.ConfigurationInterface <em>Configuration Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Interface</em>'.
	 * @see ASA.ConfigurationInterface
	 * @generated
	 */
	EClass getConfigurationInterface();

	/**
	 * Returns the meta object for the reference list '{@link ASA.ConfigurationInterface#getRequiredPorts <em>Required Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Ports</em>'.
	 * @see ASA.ConfigurationInterface#getRequiredPorts()
	 * @see #getConfigurationInterface()
	 * @generated
	 */
	EReference getConfigurationInterface_RequiredPorts();

	/**
	 * Returns the meta object for the reference list '{@link ASA.ConfigurationInterface#getProvidedPorts <em>Provided Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Ports</em>'.
	 * @see ASA.ConfigurationInterface#getProvidedPorts()
	 * @see #getConfigurationInterface()
	 * @generated
	 */
	EReference getConfigurationInterface_ProvidedPorts();

	/**
	 * Returns the meta object for the reference '{@link ASA.ConfigurationInterface#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.ConfigurationInterface#getOwner()
	 * @see #getConfigurationInterface()
	 * @generated
	 */
	EReference getConfigurationInterface_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.ConfigurationRequiredPort <em>Configuration Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Required Port</em>'.
	 * @see ASA.ConfigurationRequiredPort
	 * @generated
	 */
	EClass getConfigurationRequiredPort();

	/**
	 * Returns the meta object for the reference '{@link ASA.ConfigurationRequiredPort#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see ASA.ConfigurationRequiredPort#getBinding()
	 * @see #getConfigurationRequiredPort()
	 * @generated
	 */
	EReference getConfigurationRequiredPort_Binding();

	/**
	 * Returns the meta object for the reference '{@link ASA.ConfigurationRequiredPort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.ConfigurationRequiredPort#getOwner()
	 * @see #getConfigurationRequiredPort()
	 * @generated
	 */
	EReference getConfigurationRequiredPort_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.ConfigurationPort <em>Configuration Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Port</em>'.
	 * @see ASA.ConfigurationPort
	 * @generated
	 */
	EClass getConfigurationPort();

	/**
	 * Returns the meta object for class '{@link ASA.ConfigurationProvidedPort <em>Configuration Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Provided Port</em>'.
	 * @see ASA.ConfigurationProvidedPort
	 * @generated
	 */
	EClass getConfigurationProvidedPort();

	/**
	 * Returns the meta object for the reference '{@link ASA.ConfigurationProvidedPort#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see ASA.ConfigurationProvidedPort#getBinding()
	 * @see #getConfigurationProvidedPort()
	 * @generated
	 */
	EReference getConfigurationProvidedPort_Binding();

	/**
	 * Returns the meta object for the reference '{@link ASA.ConfigurationProvidedPort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.ConfigurationProvidedPort#getOwner()
	 * @see #getConfigurationProvidedPort()
	 * @generated
	 */
	EReference getConfigurationProvidedPort_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see ASA.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link ASA.Connector#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glue</em>'.
	 * @see ASA.Connector#getGlue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Glue();

	/**
	 * Returns the meta object for class '{@link ASA.ConnectorInterface <em>Connector Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Interface</em>'.
	 * @see ASA.ConnectorInterface
	 * @generated
	 */
	EClass getConnectorInterface();

	/**
	 * Returns the meta object for the reference '{@link ASA.ConnectorInterface#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.ConnectorInterface#getOwner()
	 * @see #getConnectorInterface()
	 * @generated
	 */
	EReference getConnectorInterface_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.ConnectorFromInterface <em>Connector From Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector From Interface</em>'.
	 * @see ASA.ConnectorFromInterface
	 * @generated
	 */
	EClass getConnectorFromInterface();

	/**
	 * Returns the meta object for the reference list '{@link ASA.ConnectorFromInterface#getFromRoles <em>From Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Roles</em>'.
	 * @see ASA.ConnectorFromInterface#getFromRoles()
	 * @see #getConnectorFromInterface()
	 * @generated
	 */
	EReference getConnectorFromInterface_FromRoles();

	/**
	 * Returns the meta object for class '{@link ASA.ConnectorToInterface <em>Connector To Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector To Interface</em>'.
	 * @see ASA.ConnectorToInterface
	 * @generated
	 */
	EClass getConnectorToInterface();

	/**
	 * Returns the meta object for the reference list '{@link ASA.ConnectorToInterface#getToRoles <em>To Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Roles</em>'.
	 * @see ASA.ConnectorToInterface#getToRoles()
	 * @see #getConnectorToInterface()
	 * @generated
	 */
	EReference getConnectorToInterface_ToRoles();

	/**
	 * Returns the meta object for class '{@link ASA.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see ASA.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for the reference '{@link ASA.Glue#getFromInterface <em>From Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Interface</em>'.
	 * @see ASA.Glue#getFromInterface()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_FromInterface();

	/**
	 * Returns the meta object for the reference '{@link ASA.Glue#getToInterface <em>To Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Interface</em>'.
	 * @see ASA.Glue#getToInterface()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_ToInterface();

	/**
	 * Returns the meta object for class '{@link ASA.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see ASA.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link ASA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see ASA.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link ASA.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ASA.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link ASA.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ASA.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link ASA.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ASA.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link ASA.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ASA.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link ASA.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see ASA.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link ASA.RoleFrom <em>Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role From</em>'.
	 * @see ASA.RoleFrom
	 * @generated
	 */
	EClass getRoleFrom();

	/**
	 * Returns the meta object for the reference '{@link ASA.RoleFrom#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachement</em>'.
	 * @see ASA.RoleFrom#getAttachement()
	 * @see #getRoleFrom()
	 * @generated
	 */
	EReference getRoleFrom_Attachement();

	/**
	 * Returns the meta object for the reference '{@link ASA.RoleFrom#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.RoleFrom#getOwner()
	 * @see #getRoleFrom()
	 * @generated
	 */
	EReference getRoleFrom_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.RoleTo <em>Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role To</em>'.
	 * @see ASA.RoleTo
	 * @generated
	 */
	EClass getRoleTo();

	/**
	 * Returns the meta object for the reference '{@link ASA.RoleTo#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ASA.RoleTo#getOwner()
	 * @see #getRoleTo()
	 * @generated
	 */
	EReference getRoleTo_Owner();

	/**
	 * Returns the meta object for class '{@link ASA.TechnicalConstraint <em>Technical Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical Constraint</em>'.
	 * @see ASA.TechnicalConstraint
	 * @generated
	 */
	EClass getTechnicalConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ASA.TechnicalConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ASA.TechnicalConstraint#getDescription()
	 * @see #getTechnicalConstraint()
	 * @generated
	 */
	EAttribute getTechnicalConstraint_Description();

	/**
	 * Returns the meta object for class '{@link ASA.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see ASA.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link ASA.Message#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see ASA.Message#getAction()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Action();

	/**
	 * Returns the meta object for the attribute '{@link ASA.Message#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see ASA.Message#getData()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ASAFactory getASAFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ASA.Bus <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.Bus
		 * @see ASA.impl.ASAPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Transfer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUS___TRANSFER__MESSAGE = eINSTANCE.getBus__Transfer__Message();

		/**
		 * The meta object literal for the '{@link ASA.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ComponentImpl
		 * @see ASA.impl.ASAPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROPERTIES = eINSTANCE.getComponent_Properties();

		/**
		 * The meta object literal for the '<em><b>Technical Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TECHNICAL_CONSTRAINTS = eINSTANCE.getComponent_TechnicalConstraints();

		/**
		 * The meta object literal for the '<em><b>Required Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRED_INTERFACE = eINSTANCE.getComponent_RequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Provided Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_INTERFACE = eINSTANCE.getComponent_ProvidedInterface();

		/**
		 * The meta object literal for the '{@link ASA.ComponentInterface <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.ComponentInterface
		 * @see ASA.impl.ASAPackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__OWNER = eINSTANCE.getComponentInterface_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.ComponentRequiredInterfaceImpl <em>Component Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ComponentRequiredInterfaceImpl
		 * @see ASA.impl.ASAPackageImpl#getComponentRequiredInterface()
		 * @generated
		 */
		EClass COMPONENT_REQUIRED_INTERFACE = eINSTANCE.getComponentRequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Required Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS = eINSTANCE.getComponentRequiredInterface_RequiredPorts();

		/**
		 * The meta object literal for the '{@link ASA.impl.ComponentRequiredPortImpl <em>Component Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ComponentRequiredPortImpl
		 * @see ASA.impl.ASAPackageImpl#getComponentRequiredPort()
		 * @generated
		 */
		EClass COMPONENT_REQUIRED_PORT = eINSTANCE.getComponentRequiredPort();

		/**
		 * The meta object literal for the '<em><b>Attachement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REQUIRED_PORT__ATTACHEMENT = eINSTANCE.getComponentRequiredPort_Attachement();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REQUIRED_PORT__BINDING = eINSTANCE.getComponentRequiredPort_Binding();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REQUIRED_PORT__OWNER = eINSTANCE.getComponentRequiredPort_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.ComponentPortImpl <em>Component Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ComponentPortImpl
		 * @see ASA.impl.ASAPackageImpl#getComponentPort()
		 * @generated
		 */
		EClass COMPONENT_PORT = eINSTANCE.getComponentPort();

		/**
		 * The meta object literal for the '{@link ASA.impl.ComponentProvidedInterfaceImpl <em>Component Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ComponentProvidedInterfaceImpl
		 * @see ASA.impl.ASAPackageImpl#getComponentProvidedInterface()
		 * @generated
		 */
		EClass COMPONENT_PROVIDED_INTERFACE = eINSTANCE.getComponentProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Provided Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS = eINSTANCE.getComponentProvidedInterface_ProvidedPorts();

		/**
		 * The meta object literal for the '{@link ASA.impl.ComponentProvidedPortImpl <em>Component Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ComponentProvidedPortImpl
		 * @see ASA.impl.ASAPackageImpl#getComponentProvidedPort()
		 * @generated
		 */
		EClass COMPONENT_PROVIDED_PORT = eINSTANCE.getComponentProvidedPort();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROVIDED_PORT__BINDING = eINSTANCE.getComponentProvidedPort_Binding();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROVIDED_PORT__OWNER = eINSTANCE.getComponentProvidedPort_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConfigurationImpl
		 * @see ASA.impl.ASAPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENTS = eINSTANCE.getConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTORS = eINSTANCE.getConfiguration_Connectors();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INTERFACE = eINSTANCE.getConfiguration_Interface();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConfigurationInterfaceImpl <em>Configuration Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConfigurationInterfaceImpl
		 * @see ASA.impl.ASAPackageImpl#getConfigurationInterface()
		 * @generated
		 */
		EClass CONFIGURATION_INTERFACE = eINSTANCE.getConfigurationInterface();

		/**
		 * The meta object literal for the '<em><b>Required Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_INTERFACE__REQUIRED_PORTS = eINSTANCE.getConfigurationInterface_RequiredPorts();

		/**
		 * The meta object literal for the '<em><b>Provided Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_INTERFACE__PROVIDED_PORTS = eINSTANCE.getConfigurationInterface_ProvidedPorts();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_INTERFACE__OWNER = eINSTANCE.getConfigurationInterface_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConfigurationRequiredPortImpl <em>Configuration Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConfigurationRequiredPortImpl
		 * @see ASA.impl.ASAPackageImpl#getConfigurationRequiredPort()
		 * @generated
		 */
		EClass CONFIGURATION_REQUIRED_PORT = eINSTANCE.getConfigurationRequiredPort();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_REQUIRED_PORT__BINDING = eINSTANCE.getConfigurationRequiredPort_Binding();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_REQUIRED_PORT__OWNER = eINSTANCE.getConfigurationRequiredPort_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConfigurationPortImpl <em>Configuration Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConfigurationPortImpl
		 * @see ASA.impl.ASAPackageImpl#getConfigurationPort()
		 * @generated
		 */
		EClass CONFIGURATION_PORT = eINSTANCE.getConfigurationPort();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConfigurationProvidedPortImpl <em>Configuration Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConfigurationProvidedPortImpl
		 * @see ASA.impl.ASAPackageImpl#getConfigurationProvidedPort()
		 * @generated
		 */
		EClass CONFIGURATION_PROVIDED_PORT = eINSTANCE.getConfigurationProvidedPort();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROVIDED_PORT__BINDING = eINSTANCE.getConfigurationProvidedPort_Binding();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROVIDED_PORT__OWNER = eINSTANCE.getConfigurationProvidedPort_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConnectorImpl
		 * @see ASA.impl.ASAPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__GLUE = eINSTANCE.getConnector_Glue();

		/**
		 * The meta object literal for the '{@link ASA.ConnectorInterface <em>Connector Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.ConnectorInterface
		 * @see ASA.impl.ASAPackageImpl#getConnectorInterface()
		 * @generated
		 */
		EClass CONNECTOR_INTERFACE = eINSTANCE.getConnectorInterface();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INTERFACE__OWNER = eINSTANCE.getConnectorInterface_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConnectorFromInterfaceImpl <em>Connector From Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConnectorFromInterfaceImpl
		 * @see ASA.impl.ASAPackageImpl#getConnectorFromInterface()
		 * @generated
		 */
		EClass CONNECTOR_FROM_INTERFACE = eINSTANCE.getConnectorFromInterface();

		/**
		 * The meta object literal for the '<em><b>From Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_FROM_INTERFACE__FROM_ROLES = eINSTANCE.getConnectorFromInterface_FromRoles();

		/**
		 * The meta object literal for the '{@link ASA.impl.ConnectorToInterfaceImpl <em>Connector To Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.ConnectorToInterfaceImpl
		 * @see ASA.impl.ASAPackageImpl#getConnectorToInterface()
		 * @generated
		 */
		EClass CONNECTOR_TO_INTERFACE = eINSTANCE.getConnectorToInterface();

		/**
		 * The meta object literal for the '<em><b>To Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TO_INTERFACE__TO_ROLES = eINSTANCE.getConnectorToInterface_ToRoles();

		/**
		 * The meta object literal for the '{@link ASA.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.GlueImpl
		 * @see ASA.impl.ASAPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>From Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__FROM_INTERFACE = eINSTANCE.getGlue_FromInterface();

		/**
		 * The meta object literal for the '<em><b>To Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__TO_INTERFACE = eINSTANCE.getGlue_ToInterface();

		/**
		 * The meta object literal for the '{@link ASA.Interface <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.Interface
		 * @see ASA.impl.ASAPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link ASA.Port <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.Port
		 * @see ASA.impl.ASAPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link ASA.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.PropertyImpl
		 * @see ASA.impl.ASAPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link ASA.Role <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.Role
		 * @see ASA.impl.ASAPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link ASA.impl.RoleFromImpl <em>Role From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.RoleFromImpl
		 * @see ASA.impl.ASAPackageImpl#getRoleFrom()
		 * @generated
		 */
		EClass ROLE_FROM = eINSTANCE.getRoleFrom();

		/**
		 * The meta object literal for the '<em><b>Attachement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FROM__ATTACHEMENT = eINSTANCE.getRoleFrom_Attachement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FROM__OWNER = eINSTANCE.getRoleFrom_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.RoleToImpl <em>Role To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.RoleToImpl
		 * @see ASA.impl.ASAPackageImpl#getRoleTo()
		 * @generated
		 */
		EClass ROLE_TO = eINSTANCE.getRoleTo();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TO__OWNER = eINSTANCE.getRoleTo_Owner();

		/**
		 * The meta object literal for the '{@link ASA.impl.TechnicalConstraintImpl <em>Technical Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.TechnicalConstraintImpl
		 * @see ASA.impl.ASAPackageImpl#getTechnicalConstraint()
		 * @generated
		 */
		EClass TECHNICAL_CONSTRAINT = eINSTANCE.getTechnicalConstraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNICAL_CONSTRAINT__DESCRIPTION = eINSTANCE.getTechnicalConstraint_Description();

		/**
		 * The meta object literal for the '{@link ASA.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASA.impl.MessageImpl
		 * @see ASA.impl.ASAPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ACTION = eINSTANCE.getMessage_Action();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DATA = eINSTANCE.getMessage_Data();

	}

} //ASAPackage
