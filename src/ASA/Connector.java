/**
 */
package ASA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.Connector#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' reference.
	 * @see #setGlue(Glue)
	 * @see ASA.ASAPackage#getConnector_Glue()
	 * @model required="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link ASA.Connector#getGlue <em>Glue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

} // Connector
