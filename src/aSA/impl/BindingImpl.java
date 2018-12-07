/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Binding;
import aSA.PortComposant;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.PortConfiguration;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.BindingImpl#getPortcomposant <em>Portcomposant</em>}</li>
 *   <li>{@link aSA.impl.BindingImpl#getPortconfiguration <em>Portconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The cached value of the '{@link #getPortcomposant() <em>Portcomposant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcomposant()
	 * @generated
	 * @ordered
	 */
	protected PortComposant portcomposant;

	/**
	 * The cached value of the '{@link #getPortconfiguration() <em>Portconfiguration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortconfiguration()
	 * @generated
	 * @ordered
	 */
	protected PortConfiguration portconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposant getPortcomposant() {
		if (portcomposant != null && portcomposant.eIsProxy()) {
			InternalEObject oldPortcomposant = (InternalEObject)portcomposant;
			portcomposant = (PortComposant)eResolveProxy(oldPortcomposant);
			if (portcomposant != oldPortcomposant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.BINDING__PORTCOMPOSANT, oldPortcomposant, portcomposant));
			}
		}
		return portcomposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposant basicGetPortcomposant() {
		return portcomposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcomposant(PortComposant newPortcomposant) {
		PortComposant oldPortcomposant = portcomposant;
		portcomposant = newPortcomposant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.BINDING__PORTCOMPOSANT, oldPortcomposant, portcomposant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfiguration getPortconfiguration() {
		if (portconfiguration != null && portconfiguration.eIsProxy()) {
			InternalEObject oldPortconfiguration = (InternalEObject)portconfiguration;
			portconfiguration = (PortConfiguration)eResolveProxy(oldPortconfiguration);
			if (portconfiguration != oldPortconfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.BINDING__PORTCONFIGURATION, oldPortconfiguration, portconfiguration));
			}
		}
		return portconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfiguration basicGetPortconfiguration() {
		return portconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortconfiguration(PortConfiguration newPortconfiguration) {
		PortConfiguration oldPortconfiguration = portconfiguration;
		portconfiguration = newPortconfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.BINDING__PORTCONFIGURATION, oldPortconfiguration, portconfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni bindingConfigConponent(PortConfigurationFourni portConfigFourni) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni bindingComponentConfig(PortComposantFourni portCompoFourni) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis bindingConfigConponent(PortConfigurationRequis portConfigRequis) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis bindingComponentConfig(PortComposantRequis portCompoRequis) {
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
			case ASAPackage.BINDING__PORTCOMPOSANT:
				if (resolve) return getPortcomposant();
				return basicGetPortcomposant();
			case ASAPackage.BINDING__PORTCONFIGURATION:
				if (resolve) return getPortconfiguration();
				return basicGetPortconfiguration();
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
			case ASAPackage.BINDING__PORTCOMPOSANT:
				setPortcomposant((PortComposant)newValue);
				return;
			case ASAPackage.BINDING__PORTCONFIGURATION:
				setPortconfiguration((PortConfiguration)newValue);
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
			case ASAPackage.BINDING__PORTCOMPOSANT:
				setPortcomposant((PortComposant)null);
				return;
			case ASAPackage.BINDING__PORTCONFIGURATION:
				setPortconfiguration((PortConfiguration)null);
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
			case ASAPackage.BINDING__PORTCOMPOSANT:
				return portcomposant != null;
			case ASAPackage.BINDING__PORTCONFIGURATION:
				return portconfiguration != null;
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
			case ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI:
				return bindingConfigConponent((PortConfigurationFourni)arguments.get(0));
			case ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI:
				return bindingComponentConfig((PortComposantFourni)arguments.get(0));
			case ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS:
				return bindingConfigConponent((PortConfigurationRequis)arguments.get(0));
			case ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS:
				return bindingComponentConfig((PortComposantRequis)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BindingImpl
