/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Binding;
import aSA.PortComposantRequis;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;
import aSA.impl.BindingImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Config Client Server To Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.BindingConfigClientServerToClientImpl#getPortbindingtoclient <em>Portbindingtoclient</em>}</li>
 *   <li>{@link M1.impl.BindingConfigClientServerToClientImpl#getPortconfigclientservertobinding <em>Portconfigclientservertobinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingConfigClientServerToClientImpl extends BindingImpl implements Binding {
	/**
	 * The cached value of the '{@link #getPortbindingtoclient() <em>Portbindingtoclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtoclient()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portbindingtoclient;

	/**
	 * The cached value of the '{@link #getPortconfigclientservertobinding() <em>Portconfigclientservertobinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortconfigclientservertobinding()
	 * @generated
	 * @ordered
	 */
	protected PortConfigurationRequis portconfigclientservertobinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingConfigClientServerToClientImpl(PortComposantRequis p1, PortConfigurationRequis p2) {
		super();
		this.portbindingtoclient = p1;
		this.portconfigclientservertobinding = p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortbindingtoclient() {
		if (portbindingtoclient != null && ((EObject)portbindingtoclient).eIsProxy()) {
			InternalEObject oldPortbindingtoclient = (InternalEObject)portbindingtoclient;
			portbindingtoclient = (PortComposantRequis)eResolveProxy(oldPortbindingtoclient);
			if (portbindingtoclient != oldPortbindingtoclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT, oldPortbindingtoclient, portbindingtoclient));
			}
		}
		return portbindingtoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortbindingtoclient() {
		return portbindingtoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortbindingtoclient(PortComposantRequis newPortbindingtoclient) {
		PortComposantRequis oldPortbindingtoclient = portbindingtoclient;
		portbindingtoclient = newPortbindingtoclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT, oldPortbindingtoclient, portbindingtoclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis getPortconfigclientservertobinding() {
		if (portconfigclientservertobinding != null && ((EObject)portconfigclientservertobinding).eIsProxy()) {
			InternalEObject oldPortconfigclientservertobinding = (InternalEObject)portconfigclientservertobinding;
			portconfigclientservertobinding = (PortConfigurationRequis)eResolveProxy(oldPortconfigclientservertobinding);
			if (portconfigclientservertobinding != oldPortconfigclientservertobinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING, oldPortconfigclientservertobinding, portconfigclientservertobinding));
			}
		}
		return portconfigclientservertobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis basicGetPortconfigclientservertobinding() {
		return portconfigclientservertobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortconfigclientservertobinding(PortConfigurationRequis newPortconfigclientservertobinding) {
		PortConfigurationRequis oldPortconfigclientservertobinding = portconfigclientservertobinding;
		portconfigclientservertobinding = newPortconfigclientservertobinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING, oldPortconfigclientservertobinding, portconfigclientservertobinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT:
				if (resolve) return getPortbindingtoclient();
				return basicGetPortbindingtoclient();
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING:
				if (resolve) return getPortconfigclientservertobinding();
				return basicGetPortconfigclientservertobinding();
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
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT:
				setPortbindingtoclient((PortComposantRequis)newValue);
				return;
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING:
				setPortconfigclientservertobinding((PortConfigurationRequis)newValue);
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
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT:
				setPortbindingtoclient((PortComposantRequis)null);
				return;
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING:
				setPortconfigclientservertobinding((PortConfigurationRequis)null);
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
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT:
				return portbindingtoclient != null;
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING:
				return portconfigclientservertobinding != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingConfigClientServerToClientImpl
