/**
 */
package ASA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.Glue#getFromInterface <em>From Interface</em>}</li>
 *   <li>{@link ASA.Glue#getToInterface <em>To Interface</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getGlue()
 * @model
 * @generated
 */
public interface Glue extends Bus {
	/**
	 * Returns the value of the '<em><b>From Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Interface</em>' reference.
	 * @see #setFromInterface(ConnectorFromInterface)
	 * @see ASA.ASAPackage#getGlue_FromInterface()
	 * @model required="true"
	 * @generated
	 */
	ConnectorFromInterface getFromInterface();

	/**
	 * Sets the value of the '{@link ASA.Glue#getFromInterface <em>From Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Interface</em>' reference.
	 * @see #getFromInterface()
	 * @generated
	 */
	void setFromInterface(ConnectorFromInterface value);

	/**
	 * Returns the value of the '<em><b>To Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Interface</em>' reference.
	 * @see #setToInterface(ConnectorToInterface)
	 * @see ASA.ASAPackage#getGlue_ToInterface()
	 * @model required="true"
	 * @generated
	 */
	ConnectorToInterface getToInterface();

	/**
	 * Sets the value of the '{@link ASA.Glue#getToInterface <em>To Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Interface</em>' reference.
	 * @see #getToInterface()
	 * @generated
	 */
	void setToInterface(ConnectorToInterface value);

} // Glue
