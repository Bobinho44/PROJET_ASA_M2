/**
 */
package ASA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASA.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link ASA.Component#getTechnicalConstraints <em>Technical Constraints</em>}</li>
 *   <li>{@link ASA.Component#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link ASA.Component#getProvidedInterface <em>Provided Interface</em>}</li>
 * </ul>
 *
 * @see ASA.ASAPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link ASA.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see ASA.ASAPackage#getComponent_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Technical Constraints</b></em>' reference list.
	 * The list contents are of type {@link ASA.TechnicalConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Constraints</em>' reference list.
	 * @see ASA.ASAPackage#getComponent_TechnicalConstraints()
	 * @model
	 * @generated
	 */
	EList<TechnicalConstraint> getTechnicalConstraints();

	/**
	 * Returns the value of the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface</em>' reference.
	 * @see #setRequiredInterface(ComponentRequiredInterface)
	 * @see ASA.ASAPackage#getComponent_RequiredInterface()
	 * @model required="true"
	 * @generated
	 */
	ComponentRequiredInterface getRequiredInterface();

	/**
	 * Sets the value of the '{@link ASA.Component#getRequiredInterface <em>Required Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interface</em>' reference.
	 * @see #getRequiredInterface()
	 * @generated
	 */
	void setRequiredInterface(ComponentRequiredInterface value);

	/**
	 * Returns the value of the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface</em>' reference.
	 * @see #setProvidedInterface(ComponentProvidedInterface)
	 * @see ASA.ASAPackage#getComponent_ProvidedInterface()
	 * @model required="true"
	 * @generated
	 */
	ComponentProvidedInterface getProvidedInterface();

	/**
	 * Sets the value of the '{@link ASA.Component#getProvidedInterface <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface</em>' reference.
	 * @see #getProvidedInterface()
	 * @generated
	 */
	void setProvidedInterface(ComponentProvidedInterface value);

} // Component
