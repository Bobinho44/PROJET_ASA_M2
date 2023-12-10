/**
 */
package ASA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ConnectorInterface#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getConnectorInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConnectorInterface extends Interface, Bus {

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Glue)
	 * @see ASA.ASAPackage#getConnectorInterface_Owner()
	 * @model required="true"
	 * @generated
	 */
	Glue getOwner();

	/**
	 * Sets the value of the '{@link ASA.ConnectorInterface#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Glue value);
} // ConnectorInterface
