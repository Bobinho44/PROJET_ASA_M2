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
 * </ul>
 *
 * @see ASA.ASAPackage#getComponentRequiredInterface()
 * @model
 * @generated
 */
public interface ComponentRequiredInterface extends ComponentInterface {
	/**
	 * Returns the value of the '<em><b>Required Ports</b></em>' reference list.
	 * The list contents are of type {@link ASA.ComponentRequiredPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Ports</em>' reference list.
	 * @see ASA.ASAPackage#getComponentRequiredInterface_RequiredPorts()
	 * @model
	 * @generated
	 */
	EList<ComponentRequiredPort> getRequiredPorts();

} // ComponentRequiredInterface
