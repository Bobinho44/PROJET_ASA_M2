/**
 */
package ASA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ConfigurationInterface#getRequiredPorts <em>Required Ports</em>}</li>
 *   <li>{@link ASA.ConfigurationInterface#getProvidedPorts <em>Provided Ports</em>}</li>
 *   <li>{@link ASA.ConfigurationInterface#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getConfigurationInterface()
 * @model
 * @generated
 */
public interface ConfigurationInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Required Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ASA.ConfigurationRequiredPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Ports</em>' containment reference list.
	 * @see ASA.ASAPackage#getConfigurationInterface_RequiredPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationRequiredPort> getRequiredPorts();

	/**
	 * Returns the value of the '<em><b>Provided Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ASA.ConfigurationProvidedPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Ports</em>' containment reference list.
	 * @see ASA.ASAPackage#getConfigurationInterface_ProvidedPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationProvidedPort> getProvidedPorts();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Configuration)
	 * @see ASA.ASAPackage#getConfigurationInterface_Owner()
	 * @model required="true"
	 * @generated
	 */
	Configuration getOwner();

	/**
	 * Sets the value of the '{@link ASA.ConfigurationInterface#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Configuration value);

} // ConfigurationInterface
