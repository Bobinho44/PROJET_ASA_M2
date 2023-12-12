/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.Component;
import ASA.ComponentProvidedInterface;
import ASA.ComponentProvidedPort;
import ASA.ServiceProvided;
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
 * An implementation of the model object '<em><b>Component Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.ComponentProvidedInterfaceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ASA.impl.ComponentProvidedInterfaceImpl#getProvidedPorts <em>Provided Ports</em>}</li>
 *   <li>{@link ASA.impl.ComponentProvidedInterfaceImpl#getRequiredServices <em>Required Services</em>}</li>
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
	 * The cached value of the '{@link #getProvidedPorts() <em>Provided Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentProvidedPort> providedPorts;

	/**
	 * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProvided> requiredServices;

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
			providedPorts = new EObjectContainmentEList<ComponentProvidedPort>(ComponentProvidedPort.class, this, ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS);
		}
		return providedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceProvided> getRequiredServices() {
		if (requiredServices == null) {
			requiredServices = new EObjectContainmentEList<ServiceProvided>(ServiceProvided.class, this, ASAPackage.COMPONENT_PROVIDED_INTERFACE__REQUIRED_SERVICES);
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
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				return ((InternalEList<?>)getProvidedPorts()).basicRemove(otherEnd, msgs);
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__REQUIRED_SERVICES:
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
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				return getProvidedPorts();
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__REQUIRED_SERVICES:
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
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER:
				setOwner((Component)newValue);
				return;
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				getProvidedPorts().clear();
				getProvidedPorts().addAll((Collection<? extends ComponentProvidedPort>)newValue);
				return;
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__REQUIRED_SERVICES:
				getRequiredServices().clear();
				getRequiredServices().addAll((Collection<? extends ServiceProvided>)newValue);
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
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__REQUIRED_SERVICES:
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
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__OWNER:
				return owner != null;
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__PROVIDED_PORTS:
				return providedPorts != null && !providedPorts.isEmpty();
			case ASAPackage.COMPONENT_PROVIDED_INTERFACE__REQUIRED_SERVICES:
				return requiredServices != null && !requiredServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentProvidedInterfaceImpl
