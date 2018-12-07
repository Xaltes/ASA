/**
 */
package M1.impl;

import M1.BindingClientToConfigClientServer;
import M1.M1Package;

import aSA.PortComposantFourni;
import aSA.PortConfigurationRequis;

import aSA.impl.BindingImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Client To Config Client Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.BindingClientToConfigClientServerImpl#getPortbindingtoconfigclientserver <em>Portbindingtoconfigclientserver</em>}</li>
 *   <li>{@link M1.impl.BindingClientToConfigClientServerImpl#getPortclienttobinding <em>Portclienttobinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingClientToConfigClientServerImpl extends BindingImpl implements BindingClientToConfigClientServer {
	/**
	 * The cached value of the '{@link #getPortbindingtoconfigclientserver() <em>Portbindingtoconfigclientserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtoconfigclientserver()
	 * @generated
	 * @ordered
	 */
	protected PortConfigurationRequis portbindingtoconfigclientserver;

	/**
	 * The cached value of the '{@link #getPortclienttobinding() <em>Portclienttobinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortclienttobinding()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portclienttobinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingClientToConfigClientServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis getPortbindingtoconfigclientserver() {
		if (portbindingtoconfigclientserver != null && ((EObject)portbindingtoconfigclientserver).eIsProxy()) {
			InternalEObject oldPortbindingtoconfigclientserver = (InternalEObject)portbindingtoconfigclientserver;
			portbindingtoconfigclientserver = (PortConfigurationRequis)eResolveProxy(oldPortbindingtoconfigclientserver);
			if (portbindingtoconfigclientserver != oldPortbindingtoconfigclientserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER, oldPortbindingtoconfigclientserver, portbindingtoconfigclientserver));
			}
		}
		return portbindingtoconfigclientserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis basicGetPortbindingtoconfigclientserver() {
		return portbindingtoconfigclientserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortbindingtoconfigclientserver(PortConfigurationRequis newPortbindingtoconfigclientserver) {
		PortConfigurationRequis oldPortbindingtoconfigclientserver = portbindingtoconfigclientserver;
		portbindingtoconfigclientserver = newPortbindingtoconfigclientserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER, oldPortbindingtoconfigclientserver, portbindingtoconfigclientserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortclienttobinding() {
		if (portclienttobinding != null && ((EObject)portclienttobinding).eIsProxy()) {
			InternalEObject oldPortclienttobinding = (InternalEObject)portclienttobinding;
			portclienttobinding = (PortComposantFourni)eResolveProxy(oldPortclienttobinding);
			if (portclienttobinding != oldPortclienttobinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING, oldPortclienttobinding, portclienttobinding));
			}
		}
		return portclienttobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortclienttobinding() {
		return portclienttobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortclienttobinding(PortComposantFourni newPortclienttobinding) {
		PortComposantFourni oldPortclienttobinding = portclienttobinding;
		portclienttobinding = newPortclienttobinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING, oldPortclienttobinding, portclienttobinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
				if (resolve) return getPortbindingtoconfigclientserver();
				return basicGetPortbindingtoconfigclientserver();
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING:
				if (resolve) return getPortclienttobinding();
				return basicGetPortclienttobinding();
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
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
				setPortbindingtoconfigclientserver((PortConfigurationRequis)newValue);
				return;
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING:
				setPortclienttobinding((PortComposantFourni)newValue);
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
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
				setPortbindingtoconfigclientserver((PortConfigurationRequis)null);
				return;
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING:
				setPortclienttobinding((PortComposantFourni)null);
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
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
				return portbindingtoconfigclientserver != null;
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING:
				return portclienttobinding != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingClientToConfigClientServerImpl
