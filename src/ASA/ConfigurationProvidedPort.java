/**
 */
package ASA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Provided Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ConfigurationProvidedPort#getBinding <em>Binding</em>}</li>
 *   <li>{@link ASA.ConfigurationProvidedPort#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getConfigurationProvidedPort()
 * @model
 * @generated
 */
public interface ConfigurationProvidedPort extends ConfigurationPort {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(ComponentRequiredPort)
	 * @see ASA.ASAPackage#getConfigurationProvidedPort_Binding()
	 * @model
	 * @generated
	 */
	ComponentRequiredPort getBinding();

	/**
	 * Sets the value of the '{@link ASA.ConfigurationProvidedPort#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ComponentRequiredPort value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ConfigurationInterface)
	 * @see ASA.ASAPackage#getConfigurationProvidedPort_Owner()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationInterface getOwner();

	/**
	 * Sets the value of the '{@link ASA.ConfigurationProvidedPort#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ConfigurationInterface value);

} // ConfigurationProvidedPort
