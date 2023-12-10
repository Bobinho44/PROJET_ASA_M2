/**
 */
package ASA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Required Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ConfigurationRequiredPort#getBinding <em>Binding</em>}</li>
 *   <li>{@link ASA.ConfigurationRequiredPort#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getConfigurationRequiredPort()
 * @model
 * @generated
 */
public interface ConfigurationRequiredPort extends ConfigurationPort {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(ComponentProvidedPort)
	 * @see ASA.ASAPackage#getConfigurationRequiredPort_Binding()
	 * @model
	 * @generated
	 */
	ComponentProvidedPort getBinding();

	/**
	 * Sets the value of the '{@link ASA.ConfigurationRequiredPort#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ComponentProvidedPort value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ConfigurationInterface)
	 * @see ASA.ASAPackage#getConfigurationRequiredPort_Owner()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationInterface getOwner();

	/**
	 * Sets the value of the '{@link ASA.ConfigurationRequiredPort#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ConfigurationInterface value);

} // ConfigurationRequiredPort
