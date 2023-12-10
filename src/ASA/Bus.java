/**
 */
package ASA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ASA.ASAPackage#getBus()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Bus extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" messageRequired="true"
	 * @generated
	 */
	Message transfer(Message message);

} // Bus
