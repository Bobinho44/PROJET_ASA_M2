/**
 */
package ASA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ComponentProvidedInterface#getProvidedPorts <em>Provided Ports</em>}</li>
 *   <li>{@link ASA.ComponentProvidedInterface#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getComponentProvidedInterface()
 * @model
 * @generated
 */
public interface ComponentProvidedInterface extends ComponentInterface {
	/**
	 * Returns the value of the '<em><b>Provided Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ASA.ComponentProvidedPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Ports</em>' containment reference list.
	 * @see ASA.ASAPackage#getComponentProvidedInterface_ProvidedPorts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentProvidedPort> getProvidedPorts();

	/**
	 * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
	 * The list contents are of type {@link ASA.ServiceProvided}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Services</em>' containment reference list.
	 * @see ASA.ASAPackage#getComponentProvidedInterface_RequiredServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceProvided> getRequiredServices();

} // ComponentProvidedInterface
