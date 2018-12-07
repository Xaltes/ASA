/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.InterfaceComposant;
import aSA.PortComposant;
import aSA.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.InterfaceComposantImpl#getService <em>Service</em>}</li>
 *   <li>{@link aSA.impl.InterfaceComposantImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceComposantImpl extends MinimalEObjectImpl.Container implements InterfaceComposant {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<PortComposant> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.INTERFACE_COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, ASAPackage.INTERFACE_COMPOSANT__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortComposant> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<PortComposant>(PortComposant.class, this, ASAPackage.INTERFACE_COMPOSANT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASAPackage.INTERFACE_COMPOSANT__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case ASAPackage.INTERFACE_COMPOSANT__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case ASAPackage.INTERFACE_COMPOSANT__SERVICE:
				return getService();
			case ASAPackage.INTERFACE_COMPOSANT__PORT:
				return getPort();
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
			case ASAPackage.INTERFACE_COMPOSANT__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case ASAPackage.INTERFACE_COMPOSANT__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends PortComposant>)newValue);
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
			case ASAPackage.INTERFACE_COMPOSANT__SERVICE:
				getService().clear();
				return;
			case ASAPackage.INTERFACE_COMPOSANT__PORT:
				getPort().clear();
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
			case ASAPackage.INTERFACE_COMPOSANT__SERVICE:
				return service != null && !service.isEmpty();
			case ASAPackage.INTERFACE_COMPOSANT__PORT:
				return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceComposantImpl
