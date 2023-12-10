/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.ConnectorFromInterface;
import ASA.ConnectorToInterface;
import ASA.Glue;

import ASA.Message;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.GlueImpl#getFromInterface <em>From Interface</em>}</li>
 *   <li>{@link ASA.impl.GlueImpl#getToInterface <em>To Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueImpl extends MinimalEObjectImpl.Container implements Glue {
	/**
	 * The cached value of the '{@link #getFromInterface() <em>From Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromInterface()
	 * @generated
	 * @ordered
	 */
	protected ConnectorFromInterface fromInterface;

	/**
	 * The cached value of the '{@link #getToInterface() <em>To Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInterface()
	 * @generated
	 * @ordered
	 */
	protected ConnectorToInterface toInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorFromInterface getFromInterface() {
		if (fromInterface != null && fromInterface.eIsProxy()) {
			InternalEObject oldFromInterface = (InternalEObject)fromInterface;
			fromInterface = (ConnectorFromInterface)eResolveProxy(oldFromInterface);
			if (fromInterface != oldFromInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.GLUE__FROM_INTERFACE, oldFromInterface, fromInterface));
			}
		}
		return fromInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorFromInterface basicGetFromInterface() {
		return fromInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromInterface(ConnectorFromInterface newFromInterface) {
		ConnectorFromInterface oldFromInterface = fromInterface;
		fromInterface = newFromInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.GLUE__FROM_INTERFACE, oldFromInterface, fromInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorToInterface getToInterface() {
		if (toInterface != null && toInterface.eIsProxy()) {
			InternalEObject oldToInterface = (InternalEObject)toInterface;
			toInterface = (ConnectorToInterface)eResolveProxy(oldToInterface);
			if (toInterface != oldToInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.GLUE__TO_INTERFACE, oldToInterface, toInterface));
			}
		}
		return toInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorToInterface basicGetToInterface() {
		return toInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToInterface(ConnectorToInterface newToInterface) {
		ConnectorToInterface oldToInterface = toInterface;
		toInterface = newToInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.GLUE__TO_INTERFACE, oldToInterface, toInterface));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASAPackage.GLUE__FROM_INTERFACE:
				if (resolve) return getFromInterface();
				return basicGetFromInterface();
			case ASAPackage.GLUE__TO_INTERFACE:
				if (resolve) return getToInterface();
				return basicGetToInterface();
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
			case ASAPackage.GLUE__FROM_INTERFACE:
				setFromInterface((ConnectorFromInterface)newValue);
				return;
			case ASAPackage.GLUE__TO_INTERFACE:
				setToInterface((ConnectorToInterface)newValue);
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
			case ASAPackage.GLUE__FROM_INTERFACE:
				setFromInterface((ConnectorFromInterface)null);
				return;
			case ASAPackage.GLUE__TO_INTERFACE:
				setToInterface((ConnectorToInterface)null);
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
			case ASAPackage.GLUE__FROM_INTERFACE:
				return fromInterface != null;
			case ASAPackage.GLUE__TO_INTERFACE:
				return toInterface != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ASAPackage.GLUE___TRANSFER__MESSAGE:
				return transfer((Message)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GlueImpl
