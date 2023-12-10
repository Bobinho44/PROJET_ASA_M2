/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.Component;
import ASA.ComponentProvidedInterface;
import ASA.ComponentProvidedPort;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.ComponentProvidedInterfaceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ASA.impl.ComponentProvidedInterfaceImpl#getProvidedPorts <em>Provided Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentProvidedInterfaceImpl extends MinimalEObjectImpl.Container implements ComponentProvidedInterface {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Component owner;

	/**
	 * The cached value of the '{@link #getProvidedPorts() <em>Provided Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentProvidedPort> providedPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentProvidedInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.COMPONENT_PROVIDED_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Component)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Component newOwner) {
		Component oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentProvidedPort> getProvidedPorts() {
		if (providedPorts == null) {
			providedPorts = new EObjectResolvingEList<ComponentProvidedPort>(ComponentProvidedPort.class, this, ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS);
		}
		return providedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				return getProvidedPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER:
				setOwner((Component)newValue);
				return;
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				getProvidedPorts().clear();
				getProvidedPorts().addAll((Collection<? extends ComponentProvidedPort>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER:
				setOwner((Component)null);
				return;
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				getProvidedPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER:
				return owner != null;
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				return providedPorts != null && !providedPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentProvidedInterfaceImpl
