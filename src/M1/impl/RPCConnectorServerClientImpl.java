/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Connecteur;
import aSA.RoleFourni;
import aSA.RoleRequis;

import aSA.impl.ConnecteurImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC Connector Server Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.RPCConnectorServerClientImpl#getRolerpctoclient <em>Rolerpctoclient</em>}</li>
 *   <li>{@link M1.impl.RPCConnectorServerClientImpl#getRolerpcfromserver <em>Rolerpcfromserver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCConnectorServerClientImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolerpctoclient() <em>Rolerpctoclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpctoclient()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolerpctoclient;

	/**
	 * The cached value of the '{@link #getRolerpcfromserver() <em>Rolerpcfromserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpcfromserver()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolerpcfromserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCConnectorServerClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.RPC_CONNECTOR_SERVER_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolerpctoclient() {
		return rolerpctoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolerpctoclient(RoleFourni newRolerpctoclient, NotificationChain msgs) {
		RoleFourni oldRolerpctoclient = rolerpctoclient;
		rolerpctoclient = newRolerpctoclient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT, oldRolerpctoclient, newRolerpctoclient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpctoclient(RoleFourni newRolerpctoclient) {
		if (newRolerpctoclient != rolerpctoclient) {
			NotificationChain msgs = null;
			//if (rolerpctoclient != null)
				//msgs = ((InternalEObject)rolerpctoclient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT, null, msgs);
			//if (newRolerpctoclient != null)
				//msgs = ((InternalEObject)newRolerpctoclient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT, null, msgs);
			msgs = basicSetRolerpctoclient(newRolerpctoclient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT, newRolerpctoclient, newRolerpctoclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolerpcfromserver() {
		return rolerpcfromserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolerpcfromserver(RoleRequis newRolerpcfromserver, NotificationChain msgs) {
		RoleRequis oldRolerpcfromserver = rolerpcfromserver;
		rolerpcfromserver = newRolerpcfromserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER, oldRolerpcfromserver, newRolerpcfromserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpcfromserver(RoleRequis newRolerpcfromserver) {
		if (newRolerpcfromserver != rolerpcfromserver) {
			NotificationChain msgs = null;
			//if (rolerpcfromserver != null)
				//msgs = ((InternalEObject)rolerpcfromserver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER, null, msgs);
			//if (newRolerpcfromserver != null)
				//msgs = ((InternalEObject)newRolerpcfromserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER, null, msgs);
			msgs = basicSetRolerpcfromserver(newRolerpcfromserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER, newRolerpcfromserver, newRolerpcfromserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT:
				return basicSetRolerpctoclient(null, msgs);
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER:
				return basicSetRolerpcfromserver(null, msgs);
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
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT:
				return getRolerpctoclient();
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER:
				return getRolerpcfromserver();
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
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT:
				setRolerpctoclient((RoleFourni)newValue);
				return;
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER:
				setRolerpcfromserver((RoleRequis)newValue);
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
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT:
				setRolerpctoclient((RoleFourni)null);
				return;
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER:
				setRolerpcfromserver((RoleRequis)null);
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
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT:
				return rolerpctoclient != null;
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER:
				return rolerpcfromserver != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCConnectorServerClientImpl
