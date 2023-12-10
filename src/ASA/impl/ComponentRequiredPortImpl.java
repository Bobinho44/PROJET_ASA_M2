/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.ComponentRequiredInterface;
import ASA.ComponentRequiredPort;
import ASA.ConfigurationProvidedPort;
import ASA.RoleTo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Required Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.ComponentRequiredPortImpl#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link ASA.impl.ComponentRequiredPortImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link ASA.impl.ComponentRequiredPortImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRequiredPortImpl extends ComponentPortImpl implements ComponentRequiredPort {
	/**
	 * The cached value of the '{@link #getAttachement() <em>Attachement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement()
	 * @generated
	 * @ordered
	 */
	protected RoleTo attachement;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationProvidedPort binding;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected ComponentRequiredInterface owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRequiredPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.COMPONENT_REQUIRED_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleTo getAttachement() {
		if (attachement != null && attachement.eIsProxy()) {
			InternalEObject oldAttachement = (InternalEObject)attachement;
			attachement = (RoleTo)eResolveProxy(oldAttachement);
			if (attachement != oldAttachement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.COMPONENT_REQUIRED_PORT__ATTACHEMENT, oldAttachement, attachement));
			}
		}
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTo basicGetAttachement() {
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachement(RoleTo newAttachement) {
		RoleTo oldAttachement = attachement;
		attachement = newAttachement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT_REQUIRED_PORT__ATTACHEMENT, oldAttachement, attachement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationProvidedPort getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject)binding;
			binding = (ConfigurationProvidedPort)eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.COMPONENT_REQUIRED_PORT__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProvidedPort basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinding(ConfigurationProvidedPort newBinding) {
		ConfigurationProvidedPort oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT_REQUIRED_PORT__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRequiredInterface getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (ComponentRequiredInterface)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.COMPONENT_REQUIRED_PORT__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRequiredInterface basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(ComponentRequiredInterface newOwner) {
		ComponentRequiredInterface oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT_REQUIRED_PORT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASAPackage.COMPONENT_REQUIRED_PORT__ATTACHEMENT:
				if (resolve) return getAttachement();
				return basicGetAttachement();
			case ASAPackage.COMPONENT_REQUIRED_PORT__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case ASAPackage.COMPONENT_REQUIRED_PORT__OWNER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ASAPackage.COMPONENT_REQUIRED_PORT__ATTACHEMENT:
				setAttachement((RoleTo)newValue);
				return;
			case ASAPackage.COMPONENT_REQUIRED_PORT__BINDING:
				setBinding((ConfigurationProvidedPort)newValue);
				return;
			case ASAPackage.COMPONENT_REQUIRED_PORT__OWNER:
				setOwner((ComponentRequiredInterface)newValue);
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
			case ASAPackage.COMPONENT_REQUIRED_PORT__ATTACHEMENT:
				setAttachement((RoleTo)null);
				return;
			case ASAPackage.COMPONENT_REQUIRED_PORT__BINDING:
				setBinding((ConfigurationProvidedPort)null);
				return;
			case ASAPackage.COMPONENT_REQUIRED_PORT__OWNER:
				setOwner((ComponentRequiredInterface)null);
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
			case ASAPackage.COMPONENT_REQUIRED_PORT__ATTACHEMENT:
				return attachement != null;
			case ASAPackage.COMPONENT_REQUIRED_PORT__BINDING:
				return binding != null;
			case ASAPackage.COMPONENT_REQUIRED_PORT__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentRequiredPortImpl
