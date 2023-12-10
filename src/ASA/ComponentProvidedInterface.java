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
 * </ul>
 *
 * @see ASA.ASAPackage#getComponentProvidedInterface()
 * @model
 * @generated
 */
public interface ComponentProvidedInterface extends ComponentInterface {
	/**
	 * Returns the value of the '<em><b>Provided Ports</b></em>' reference list.
	 * The list contents are of type {@link ASA.ComponentProvidedPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Ports</em>' reference list.
	 * @see ASA.ASAPackage#getComponentProvidedInterface_ProvidedPorts()
	 * @model required="true"
	 * @generated
	 */
	EList<ComponentProvidedPort> getProvidedPorts();

} // ComponentProvidedInterface
