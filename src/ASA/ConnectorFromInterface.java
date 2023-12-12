/**
 */
package ASA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector From Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ConnectorFromInterface#getFromRoles <em>From Roles</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getConnectorFromInterface()
 * @model
 * @generated
 */
public interface ConnectorFromInterface extends ConnectorInterface {
	/**
	 * Returns the value of the '<em><b>From Roles</b></em>' containment reference list.
	 * The list contents are of type {@link ASA.RoleFrom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Roles</em>' containment reference list.
	 * @see ASA.ASAPackage#getConnectorFromInterface_FromRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleFrom> getFromRoles();

} // ConnectorFromInterface
