/**
 */
package ASA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.RoleTo#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getRoleTo()
 * @model
 * @generated
 */
public interface RoleTo extends Role {

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ConnectorToInterface)
	 * @see ASA.ASAPackage#getRoleTo_Owner()
	 * @model required="true"
	 * @generated
	 */
	ConnectorToInterface getOwner();

	/**
	 * Sets the value of the '{@link ASA.RoleTo#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ConnectorToInterface value);

} // RoleTo
