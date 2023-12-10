/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.Configuration;
import ASA.ConfigurationInterface;
import ASA.ConfigurationProvidedPort;
import ASA.ConfigurationRequiredPort;

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
 * An implementation of the model object '<em><b>Configuration Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.ConfigurationInterfaceImpl#getRequiredPorts <em>Required Ports</em>}</li>
 *   <li>{@link ASA.impl.ConfigurationInterfaceImpl#getProvidedPorts <em>Provided Ports</em>}</li>
 *   <li>{@link ASA.impl.ConfigurationInterfaceImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationInterfaceImpl extends MinimalEObjectImpl.Container implements ConfigurationInterface {
	/**
	 * The cached value of the '{@link #getRequiredPorts() <em>Required Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationRequiredPort> requiredPorts;

	/**
	 * The cached value of the '{@link #getProvidedPorts() <em>Provided Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationProvidedPort> providedPorts;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Configuration owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.CONFIGURATION_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationRequiredPort> getRequiredPorts() {
		if (requiredPorts == null) {
			requiredPorts = new EObjectResolvingEList<ConfigurationRequiredPort>(ConfigurationRequiredPort.class, this, ASAPackage.CONFIGURATION_INTERFACE__REQUIRED_PORTS);
		}
		return requiredPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationProvidedPort> getProvidedPorts() {
		if (providedPorts == null) {
			providedPorts = new EObjectResolvingEList<ConfigurationProvidedPort>(ConfigurationProvidedPort.class, this, ASAPackage.CONFIGURATION_INTERFACE__PROVIDED_PORTS);
		}
		return providedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Configuration)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.CONFIGURATION_INTERFACE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Configuration newOwner) {
		Configuration oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.CONFIGURATION_INTERFACE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASAPackage.CONFIGURATION_INTERFACE__REQUIRED_PORTS:
				return getRequiredPorts();
			case ASAPackage.CONFIGURATION_INTERFACE__PROVIDED_PORTS:
				return getProvidedPorts();
			case ASAPackage.CONFIGURATION_INTERFACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case ASAPackage.CONFIGURATION_INTERFACE__REQUIRED_PORTS:
				getRequiredPorts().clear();
				getRequiredPorts().addAll((Collection<? extends ConfigurationRequiredPort>)newValue);
				return;
			case ASAPackage.CONFIGURATION_INTERFACE__PROVIDED_PORTS:
				getProvidedPorts().clear();
				getProvidedPorts().addAll((Collection<? extends ConfigurationProvidedPort>)newValue);
				return;
			case ASAPackage.CONFIGURATION_INTERFACE__OWNER:
				setOwner((Configuration)newValue);
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
			case ASAPackage.CONFIGURATION_INTERFACE__REQUIRED_PORTS:
				getRequiredPorts().clear();
				return;
			case ASAPackage.CONFIGURATION_INTERFACE__PROVIDED_PORTS:
				getProvidedPorts().clear();
				return;
			case ASAPackage.CONFIGURATION_INTERFACE__OWNER:
				setOwner((Configuration)null);
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
			case ASAPackage.CONFIGURATION_INTERFACE__REQUIRED_PORTS:
				return requiredPorts != null && !requiredPorts.isEmpty();
			case ASAPackage.CONFIGURATION_INTERFACE__PROVIDED_PORTS:
				return providedPorts != null && !providedPorts.isEmpty();
			case ASAPackage.CONFIGURATION_INTERFACE__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationInterfaceImpl
