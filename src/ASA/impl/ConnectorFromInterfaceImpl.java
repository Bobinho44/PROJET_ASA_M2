/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.Bus;
import ASA.ConnectorFromInterface;
import ASA.Glue;
import ASA.Message;
import ASA.RoleFrom;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Connector From Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.ConnectorFromInterfaceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ASA.impl.ConnectorFromInterfaceImpl#getFromRoles <em>From Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorFromInterfaceImpl extends MinimalEObjectImpl.Container implements ConnectorFromInterface {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Glue owner;
	/**
	 * The cached value of the '{@link #getFromRoles() <em>From Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleFrom> fromRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorFromInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.CONNECTOR_FROM_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glue getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Glue)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.CONNECTOR_FROM_INTERFACE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Glue newOwner) {
		Glue oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.CONNECTOR_FROM_INTERFACE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleFrom> getFromRoles() {
		if (fromRoles == null) {
			fromRoles = new EObjectContainmentEList<RoleFrom>(RoleFrom.class, this, ASAPackage.CONNECTOR_FROM_INTERFACE__FROM_ROLES);
		}
		return fromRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message transfer(Message message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASAPackage.CONNECTOR_FROM_INTERFACE__FROM_ROLES:
				return ((InternalEList<?>)getFromRoles()).basicRemove(otherEnd, msgs);
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
			case ASAPackage.CONNECTOR_FROM_INTERFACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ASAPackage.CONNECTOR_FROM_INTERFACE__FROM_ROLES:
				return getFromRoles();
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
			case ASAPackage.CONNECTOR_FROM_INTERFACE__OWNER:
				setOwner((Glue)newValue);
				return;
			case ASAPackage.CONNECTOR_FROM_INTERFACE__FROM_ROLES:
				getFromRoles().clear();
				getFromRoles().addAll((Collection<? extends RoleFrom>)newValue);
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
			case ASAPackage.CONNECTOR_FROM_INTERFACE__OWNER:
				setOwner((Glue)null);
				return;
			case ASAPackage.CONNECTOR_FROM_INTERFACE__FROM_ROLES:
				getFromRoles().clear();
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
			case ASAPackage.CONNECTOR_FROM_INTERFACE__OWNER:
				return owner != null;
			case ASAPackage.CONNECTOR_FROM_INTERFACE__FROM_ROLES:
				return fromRoles != null && !fromRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Bus.class) {
			switch (baseOperationID) {
				case ASAPackage.BUS___TRANSFER__MESSAGE: return ASAPackage.CONNECTOR_FROM_INTERFACE___TRANSFER__MESSAGE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ASAPackage.CONNECTOR_FROM_INTERFACE___TRANSFER__MESSAGE:
				return transfer((Message)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectorFromInterfaceImpl
