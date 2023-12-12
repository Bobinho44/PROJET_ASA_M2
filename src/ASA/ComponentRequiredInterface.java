/**
 */
package ASA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Required Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ComponentRequiredInterface#getRequiredPorts <em>Required Ports</em>}</li>
 *   <li>{@link ASA.ComponentRequiredInterface#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getComponentRequiredInterface()
 * @model
 * @generated
 */
public interface ComponentRequiredInterface extends ComponentInterface {
	/**
	 * Returns the value of the '<em><b>Required Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ASA.ComponentRequiredPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Ports</em>' containment reference list.
	 * @see ASA.ASAPackage#getComponentRequiredInterface_RequiredPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentRequiredPort> getRequiredPorts();

	/**
	 * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
	 * The list contents are of type {@link ASA.ServiceRequired}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Services</em>' containment reference list.
	 * @see ASA.ASAPackage#getComponentRequiredInterface_RequiredServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceRequired> getRequiredServices();

} // ComponentRequiredInterface
