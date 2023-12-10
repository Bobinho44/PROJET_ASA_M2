/**
 */
package ASA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.RoleFrom#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link ASA.RoleFrom#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getRoleFrom()
 * @model
 * @generated
 */
public interface RoleFrom extends Role {
	/**
	 * Returns the value of the '<em><b>Attachement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachement</em>' reference.
	 * @see #setAttachement(ComponentProvidedPort)
	 * @see ASA.ASAPackage#getRoleFrom_Attachement()
	 * @model
	 * @generated
	 */
	ComponentProvidedPort getAttachement();

	/**
	 * Sets the value of the '{@link ASA.RoleFrom#getAttachement <em>Attachement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachement</em>' reference.
	 * @see #getAttachement()
	 * @generated
	 */
	void setAttachement(ComponentProvidedPort value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ConnectorFromInterface)
	 * @see ASA.ASAPackage#getRoleFrom_Owner()
	 * @model required="true"
	 * @generated
	 */
	ConnectorFromInterface getOwner();

	/**
	 * Sets the value of the '{@link ASA.RoleFrom#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ConnectorFromInterface value);

} // RoleFrom
