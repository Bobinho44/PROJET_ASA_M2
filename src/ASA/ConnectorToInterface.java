/**
 */
package ASA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector To Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.ConnectorToInterface#getToRoles <em>To Roles</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getConnectorToInterface()
 * @model
 * @generated
 */
public interface ConnectorToInterface extends ConnectorInterface {
	/**
	 * Returns the value of the '<em><b>To Roles</b></em>' reference list.
	 * The list contents are of type {@link ASA.RoleTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Roles</em>' reference list.
	 * @see ASA.ASAPackage#getConnectorToInterface_ToRoles()
	 * @model
	 * @generated
	 */
	EList<RoleTo> getToRoles();

} // ConnectorToInterface
