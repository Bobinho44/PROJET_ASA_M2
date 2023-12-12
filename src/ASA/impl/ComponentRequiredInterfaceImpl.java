/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.Component;
import ASA.ComponentRequiredInterface;
import ASA.ComponentRequiredPort;
import ASA.ServiceRequired;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Required Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.ComponentRequiredInterfaceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ASA.impl.ComponentRequiredInterfaceImpl#getRequiredPorts <em>Required Ports</em>}</li>
 *   <li>{@link ASA.impl.ComponentRequiredInterfaceImpl#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRequiredInterfaceImpl extends MinimalEObjectImpl.Container implements ComponentRequiredInterface {
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
	 * The cached value of the '{@link #getRequiredPorts() <em>Required Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentRequiredPort> requiredPorts;

	/**
	 * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRequired> requiredServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRequiredInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.COMPONENT_REQUIRED_INTERFACE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.COMPONENT_REQUIRED_INTERFACE__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT_REQUIRED_INTERFACE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentRequiredPort> getRequiredPorts() {
		if (requiredPorts == null) {
			requiredPorts = new EObjectContainmentEList<ComponentRequiredPort>(ComponentRequiredPort.class, this, ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS);
		}
		return requiredPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceRequired> getRequiredServices() {
		if (requiredServices == null) {
			requiredServices = new EObjectContainmentEList<ServiceRequired>(ServiceRequired.class, this, ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_SERVICES);
		}
		return requiredServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS:
				return ((InternalEList<?>)getRequiredPorts()).basicRemove(otherEnd, msgs);
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_SERVICES:
				return ((InternalEList<?>)getRequiredServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS:
				return getRequiredPorts();
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_SERVICES:
				return getRequiredServices();
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
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__OWNER:
				setOwner((Component)newValue);
				return;
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS:
				getRequiredPorts().clear();
				getRequiredPorts().addAll((Collection<? extends ComponentRequiredPort>)newValue);
				return;
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_SERVICES:
				getRequiredServices().clear();
				getRequiredServices().addAll((Collection<? extends ServiceRequired>)newValue);
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
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__OWNER:
				setOwner((Component)null);
				return;
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS:
				getRequiredPorts().clear();
				return;
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_SERVICES:
				getRequiredServices().clear();
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
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__OWNER:
				return owner != null;
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_PORTS:
				return requiredPorts != null && !requiredPorts.isEmpty();
			case ASAPackage.COMPONENT_REQUIRED_INTERFACE__REQUIRED_SERVICES:
				return requiredServices != null && !requiredServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentRequiredInterfaceImpl
