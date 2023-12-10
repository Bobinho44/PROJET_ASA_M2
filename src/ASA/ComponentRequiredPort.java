/**
 */
package ASA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Required Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ComponentRequiredPort#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link ASA.ComponentRequiredPort#getBinding <em>Binding</em>}</li>
 *   <li>{@link ASA.ComponentRequiredPort#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getComponentRequiredPort()
 * @model
 * @generated
 */
public interface ComponentRequiredPort extends ComponentPort {
	/**
	 * Returns the value of the '<em><b>Attachement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachement</em>' reference.
	 * @see #setAttachement(RoleTo)
	 * @see ASA.ASAPackage#getComponentRequiredPort_Attachement()
	 * @model
	 * @generated
	 */
	RoleTo getAttachement();

	/**
	 * Sets the value of the '{@link ASA.ComponentRequiredPort#getAttachement <em>Attachement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachement</em>' reference.
	 * @see #getAttachement()
	 * @generated
	 */
	void setAttachement(RoleTo value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(ConfigurationProvidedPort)
	 * @see ASA.ASAPackage#getComponentRequiredPort_Binding()
	 * @model
	 * @generated
	 */
	ConfigurationProvidedPort getBinding();

	/**
	 * Sets the value of the '{@link ASA.ComponentRequiredPort#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ConfigurationProvidedPort value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ComponentRequiredInterface)
	 * @see ASA.ASAPackage#getComponentRequiredPort_Owner()
	 * @model required="true"
	 * @generated
	 */
	ComponentRequiredInterface getOwner();

	/**
	 * Sets the value of the '{@link ASA.ComponentRequiredPort#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ComponentRequiredInterface value);

} // ComponentRequiredPort
