/**
 */
package ASA.util;

import ASA.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ASA.ASAPackage
 * @generated
 */
public class ASASwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ASAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASASwitch() {
		if (modelPackage == null) {
			modelPackage = ASAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ASAPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPONENT_INTERFACE: {
				ComponentInterface componentInterface = (ComponentInterface)theEObject;
				T result = caseComponentInterface(componentInterface);
				if (result == null) result = caseInterface(componentInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE: {
				ComponentRequiredInterface componentRequiredInterface = (ComponentRequiredInterface)theEObject;
				T result = caseComponentRequiredInterface(componentRequiredInterface);
				if (result == null) result = caseComponentInterface(componentRequiredInterface);
				if (result == null) result = caseInterface(componentRequiredInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPONENT_REQUIRED_PORT: {
				ComponentRequiredPort componentRequiredPort = (ComponentRequiredPort)theEObject;
				T result = caseComponentRequiredPort(componentRequiredPort);
				if (result == null) result = caseComponentPort(componentRequiredPort);
				if (result == null) result = casePort(componentRequiredPort);
				if (result == null) result = caseBus(componentRequiredPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPONENT_PORT: {
				ComponentPort componentPort = (ComponentPort)theEObject;
				T result = caseComponentPort(componentPort);
				if (result == null) result = casePort(componentPort);
				if (result == null) result = caseBus(componentPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE: {
				ComponentProvidedInterface componentProvidedInterface = (ComponentProvidedInterface)theEObject;
				T result = caseComponentProvidedInterface(componentProvidedInterface);
				if (result == null) result = caseComponentInterface(componentProvidedInterface);
				if (result == null) result = caseInterface(componentProvidedInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPONENT_PROVIDED_PORT: {
				ComponentProvidedPort componentProvidedPort = (ComponentProvidedPort)theEObject;
				T result = caseComponentProvidedPort(componentProvidedPort);
				if (result == null) result = caseComponentPort(componentProvidedPort);
				if (result == null) result = casePort(componentProvidedPort);
				if (result == null) result = caseBus(componentProvidedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONFIGURATION_INTERFACE: {
				ConfigurationInterface configurationInterface = (ConfigurationInterface)theEObject;
				T result = caseConfigurationInterface(configurationInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONFIGURATION_REQUIRED_PORT: {
				ConfigurationRequiredPort configurationRequiredPort = (ConfigurationRequiredPort)theEObject;
				T result = caseConfigurationRequiredPort(configurationRequiredPort);
				if (result == null) result = caseConfigurationPort(configurationRequiredPort);
				if (result == null) result = casePort(configurationRequiredPort);
				if (result == null) result = caseBus(configurationRequiredPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONFIGURATION_PORT: {
				ConfigurationPort configurationPort = (ConfigurationPort)theEObject;
				T result = caseConfigurationPort(configurationPort);
				if (result == null) result = casePort(configurationPort);
				if (result == null) result = caseBus(configurationPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONFIGURATION_PROVIDED_PORT: {
				ConfigurationProvidedPort configurationProvidedPort = (ConfigurationProvidedPort)theEObject;
				T result = caseConfigurationProvidedPort(configurationProvidedPort);
				if (result == null) result = caseConfigurationPort(configurationProvidedPort);
				if (result == null) result = casePort(configurationProvidedPort);
				if (result == null) result = caseBus(configurationProvidedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONNECTOR_INTERFACE: {
				ConnectorInterface connectorInterface = (ConnectorInterface)theEObject;
				T result = caseConnectorInterface(connectorInterface);
				if (result == null) result = caseInterface(connectorInterface);
				if (result == null) result = caseBus(connectorInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONNECTOR_FROM_INTERFACE: {
				ConnectorFromInterface connectorFromInterface = (ConnectorFromInterface)theEObject;
				T result = caseConnectorFromInterface(connectorFromInterface);
				if (result == null) result = caseConnectorInterface(connectorFromInterface);
				if (result == null) result = caseInterface(connectorFromInterface);
				if (result == null) result = caseBus(connectorFromInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONNECTOR_TO_INTERFACE: {
				ConnectorToInterface connectorToInterface = (ConnectorToInterface)theEObject;
				T result = caseConnectorToInterface(connectorToInterface);
				if (result == null) result = caseConnectorInterface(connectorToInterface);
				if (result == null) result = caseInterface(connectorToInterface);
				if (result == null) result = caseBus(connectorToInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.GLUE: {
				Glue glue = (Glue)theEObject;
				T result = caseGlue(glue);
				if (result == null) result = caseBus(glue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseBus(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseBus(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.ROLE_FROM: {
				RoleFrom roleFrom = (RoleFrom)theEObject;
				T result = caseRoleFrom(roleFrom);
				if (result == null) result = caseRole(roleFrom);
				if (result == null) result = caseBus(roleFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.ROLE_TO: {
				RoleTo roleTo = (RoleTo)theEObject;
				T result = caseRoleTo(roleTo);
				if (result == null) result = caseRole(roleTo);
				if (result == null) result = caseBus(roleTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.TECHNICAL_CONSTRAINT: {
				TechnicalConstraint technicalConstraint = (TechnicalConstraint)theEObject;
				T result = caseTechnicalConstraint(technicalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInterface(ComponentInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Required Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Required Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRequiredInterface(ComponentRequiredInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Required Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRequiredPort(ComponentRequiredPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPort(ComponentPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Provided Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Provided Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentProvidedInterface(ComponentProvidedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Provided Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentProvidedPort(ComponentProvidedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationInterface(ConfigurationInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Required Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationRequiredPort(ConfigurationRequiredPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPort(ConfigurationPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Provided Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationProvidedPort(ConfigurationProvidedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorInterface(ConnectorInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector From Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector From Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorFromInterface(ConnectorFromInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector To Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector To Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorToInterface(ConnectorToInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFrom(RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTo(RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalConstraint(TechnicalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ASASwitch
