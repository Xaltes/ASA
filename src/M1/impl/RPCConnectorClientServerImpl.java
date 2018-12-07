/**
 */
package M1.impl;

import M1.M1Package;

import aSA.RoleFourni;
import aSA.RoleRequis;

import aSA.Connecteur;

import aSA.impl.ConnecteurImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC Connector Client Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.RPCConnectorClientServerImpl#getRolerpctoserver <em>Rolerpctoserver</em>}</li>
 *   <li>{@link M1.impl.RPCConnectorClientServerImpl#getRolerpcfromclient <em>Rolerpcfromclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCConnectorClientServerImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolerpctoserver() <em>Rolerpctoserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpctoserver()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolerpctoserver;

	/**
	 * The cached value of the '{@link #getRolerpcfromclient() <em>Rolerpcfromclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpcfromclient()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolerpcfromclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCConnectorClientServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.RPC_CONNECTOR_CLIENT_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolerpctoserver() {
		return rolerpctoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolerpctoserver(RoleFourni newRolerpctoserver, NotificationChain msgs) {
		RoleFourni oldRolerpctoserver = rolerpctoserver;
		rolerpctoserver = newRolerpctoserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER, oldRolerpctoserver, newRolerpctoserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpctoserver(RoleFourni newRolerpctoserver) {
		if (newRolerpctoserver != rolerpctoserver) {
			NotificationChain msgs = null;
			if (rolerpctoserver != null)
				msgs = ((InternalEObject)rolerpctoserver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER, null, msgs);
			if (newRolerpctoserver != null)
				msgs = ((InternalEObject)newRolerpctoserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER, null, msgs);
			msgs = basicSetRolerpctoserver(newRolerpctoserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER, newRolerpctoserver, newRolerpctoserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolerpcfromclient() {
		return rolerpcfromclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolerpcfromclient(RoleRequis newRolerpcfromclient, NotificationChain msgs) {
		RoleRequis oldRolerpcfromclient = rolerpcfromclient;
		rolerpcfromclient = newRolerpcfromclient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT, oldRolerpcfromclient, newRolerpcfromclient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpcfromclient(RoleRequis newRolerpcfromclient) {
		if (newRolerpcfromclient != rolerpcfromclient) {
			NotificationChain msgs = null;
			if (rolerpcfromclient != null)
				msgs = ((InternalEObject)rolerpcfromclient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT, null, msgs);
			if (newRolerpcfromclient != null)
				msgs = ((InternalEObject)newRolerpcfromclient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT, null, msgs);
			msgs = basicSetRolerpcfromclient(newRolerpcfromclient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT, newRolerpcfromclient, newRolerpcfromclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER:
				return basicSetRolerpctoserver(null, msgs);
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT:
				return basicSetRolerpcfromclient(null, msgs);
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
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER:
				return getRolerpctoserver();
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT:
				return getRolerpcfromclient();
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
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER:
				setRolerpctoserver((RoleFourni)newValue);
				return;
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT:
				setRolerpcfromclient((RoleRequis)newValue);
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
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER:
				setRolerpctoserver((RoleFourni)null);
				return;
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT:
				setRolerpcfromclient((RoleRequis)null);
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
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER:
				return rolerpctoserver != null;
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT:
				return rolerpcfromclient != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCConnectorClientServerImpl
