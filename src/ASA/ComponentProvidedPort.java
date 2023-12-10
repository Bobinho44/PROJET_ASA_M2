/**
 */
package ASA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Provided Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ComponentProvidedPort#getBinding <em>Binding</em>}</li>
 *   <li>{@link ASA.ComponentProvidedPort#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getComponentProvidedPort()
 * @model
 * @generated
 */
public interface ComponentProvidedPort extends ComponentPort {

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(ConfigurationRequiredPort)
	 * @see ASA.ASAPackage#getComponentProvidedPort_Binding()
	 * @model
	 * @generated
	 */
	ConfigurationRequiredPort getBinding();

	/**
	 * Sets the value of the '{@link ASA.ComponentProvidedPort#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ConfigurationRequiredPort value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ComponentProvidedInterface)
	 * @see ASA.ASAPackage#getComponentProvidedPort_Owner()
	 * @model required="true"
	 * @generated
	 */
	ComponentProvidedInterface getOwner();

	/**
	 * Sets the value of the '{@link ASA.ComponentProvidedPort#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ComponentProvidedInterface value);

} // ComponentProvidedPort
