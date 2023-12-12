/**
 */
package ASA.impl;

import ASA.ASAPackage;
import ASA.Component;
import ASA.ComponentProvidedInterface;
import ASA.ComponentRequiredInterface;
import ASA.Property;
import ASA.TechnicalConstraint;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASA.impl.ComponentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ASA.impl.ComponentImpl#getTechnicalConstraints <em>Technical Constraints</em>}</li>
 *   <li>{@link ASA.impl.ComponentImpl#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link ASA.impl.ComponentImpl#getProvidedInterface <em>Provided Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getTechnicalConstraints() <em>Technical Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnicalConstraint> technicalConstraints;

	/**
	 * The cached value of the '{@link #getRequiredInterface() <em>Required Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentRequiredInterface requiredInterface;

	/**
	 * The cached value of the '{@link #getProvidedInterface() <em>Provided Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentProvidedInterface providedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ASAPackage.COMPONENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TechnicalConstraint> getTechnicalConstraints() {
		if (technicalConstraints == null) {
			technicalConstraints = new EObjectContainmentEList<TechnicalConstraint>(TechnicalConstraint.class, this, ASAPackage.COMPONENT__TECHNICAL_CONSTRAINTS);
		}
		return technicalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRequiredInterface getRequiredInterface() {
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredInterface(ComponentRequiredInterface newRequiredInterface, NotificationChain msgs) {
		ComponentRequiredInterface oldRequiredInterface = requiredInterface;
		requiredInterface = newRequiredInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT__REQUIRED_INTERFACE, oldRequiredInterface, newRequiredInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredInterface(ComponentRequiredInterface newRequiredInterface) {
		if (newRequiredInterface != requiredInterface) {
			NotificationChain msgs = null;
			if (requiredInterface != null)
				msgs = ((InternalEObject)requiredInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASAPackage.COMPONENT__REQUIRED_INTERFACE, null, msgs);
			if (newRequiredInterface != null)
				msgs = ((InternalEObject)newRequiredInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASAPackage.COMPONENT__REQUIRED_INTERFACE, null, msgs);
			msgs = basicSetRequiredInterface(newRequiredInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT__REQUIRED_INTERFACE, newRequiredInterface, newRequiredInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentProvidedInterface getProvidedInterface() {
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedInterface(ComponentProvidedInterface newProvidedInterface, NotificationChain msgs) {
		ComponentProvidedInterface oldProvidedInterface = providedInterface;
		providedInterface = newProvidedInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT__PROVIDED_INTERFACE, oldProvidedInterface, newProvidedInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedInterface(ComponentProvidedInterface newProvidedInterface) {
		if (newProvidedInterface != providedInterface) {
			NotificationChain msgs = null;
			if (providedInterface != null)
				msgs = ((InternalEObject)providedInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASAPackage.COMPONENT__PROVIDED_INTERFACE, null, msgs);
			if (newProvidedInterface != null)
				msgs = ((InternalEObject)newProvidedInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASAPackage.COMPONENT__PROVIDED_INTERFACE, null, msgs);
			msgs = basicSetProvidedInterface(newProvidedInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPONENT__PROVIDED_INTERFACE, newProvidedInterface, newProvidedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASAPackage.COMPONENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ASAPackage.COMPONENT__TECHNICAL_CONSTRAINTS:
				return ((InternalEList<?>)getTechnicalConstraints()).basicRemove(otherEnd, msgs);
			case ASAPackage.COMPONENT__REQUIRED_INTERFACE:
				return basicSetRequiredInterface(null, msgs);
			case ASAPackage.COMPONENT__PROVIDED_INTERFACE:
				return basicSetProvidedInterface(null, msgs);
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
			case ASAPackage.COMPONENT__PROPERTIES:
				return getProperties();
			case ASAPackage.COMPONENT__TECHNICAL_CONSTRAINTS:
				return getTechnicalConstraints();
			case ASAPackage.COMPONENT__REQUIRED_INTERFACE:
				return getRequiredInterface();
			case ASAPackage.COMPONENT__PROVIDED_INTERFACE:
				return getProvidedInterface();
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
			case ASAPackage.COMPONENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ASAPackage.COMPONENT__TECHNICAL_CONSTRAINTS:
				getTechnicalConstraints().clear();
				getTechnicalConstraints().addAll((Collection<? extends TechnicalConstraint>)newValue);
				return;
			case ASAPackage.COMPONENT__REQUIRED_INTERFACE:
				setRequiredInterface((ComponentRequiredInterface)newValue);
				return;
			case ASAPackage.COMPONENT__PROVIDED_INTERFACE:
				setProvidedInterface((ComponentProvidedInterface)newValue);
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
			case ASAPackage.COMPONENT__PROPERTIES:
				getProperties().clear();
				return;
			case ASAPackage.COMPONENT__TECHNICAL_CONSTRAINTS:
				getTechnicalConstraints().clear();
				return;
			case ASAPackage.COMPONENT__REQUIRED_INTERFACE:
				setRequiredInterface((ComponentRequiredInterface)null);
				return;
			case ASAPackage.COMPONENT__PROVIDED_INTERFACE:
				setProvidedInterface((ComponentProvidedInterface)null);
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
			case ASAPackage.COMPONENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ASAPackage.COMPONENT__TECHNICAL_CONSTRAINTS:
				return technicalConstraints != null && !technicalConstraints.isEmpty();
			case ASAPackage.COMPONENT__REQUIRED_INTERFACE:
				return requiredInterface != null;
			case ASAPackage.COMPONENT__PROVIDED_INTERFACE:
				return providedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
