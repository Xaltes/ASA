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
 * An implementation of the model object '<em><b>Security Query Connector Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.SecurityQueryConnectorOutImpl#getRolesqfromdb <em>Rolesqfromdb</em>}</li>
 *   <li>{@link M1.impl.SecurityQueryConnectorOutImpl#getRolesqtosm <em>Rolesqtosm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityQueryConnectorOutImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolesqfromdb() <em>Rolesqfromdb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqfromdb()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolesqfromdb;

	/**
	 * The cached value of the '{@link #getRolesqtosm() <em>Rolesqtosm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqtosm()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolesqtosm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityQueryConnectorOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.SECURITY_QUERY_CONNECTOR_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqfromdb() {
		return rolesqfromdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqfromdb(RoleFourni newRolesqfromdb, NotificationChain msgs) {
		RoleFourni oldRolesqfromdb = rolesqfromdb;
		rolesqfromdb = newRolesqfromdb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB, oldRolesqfromdb, newRolesqfromdb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqfromdb(RoleFourni newRolesqfromdb) {
		if (newRolesqfromdb != rolesqfromdb) {
			NotificationChain msgs = null;
			//if (rolesqfromdb != null)
				//msgs = ((InternalEObject)rolesqfromdb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB, null, msgs);
			//if (newRolesqfromdb != null)
				//msgs = ((InternalEObject)newRolesqfromdb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB, null, msgs);
			msgs = basicSetRolesqfromdb(newRolesqfromdb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB, newRolesqfromdb, newRolesqfromdb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqtosm() {
		return rolesqtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqtosm(RoleRequis newRolesqtosm, NotificationChain msgs) {
		RoleRequis oldRolesqtosm = rolesqtosm;
		rolesqtosm = newRolesqtosm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM, oldRolesqtosm, newRolesqtosm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqtosm(RoleRequis newRolesqtosm) {
		if (newRolesqtosm != rolesqtosm) {
			NotificationChain msgs = null;
			//if (rolesqtosm != null)
				//msgs = ((InternalEObject)rolesqtosm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM, null, msgs);
			//if (newRolesqtosm != null)
				//msgs = ((InternalEObject)newRolesqtosm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM, null, msgs);
			msgs = basicSetRolesqtosm(newRolesqtosm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM, newRolesqtosm, newRolesqtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB:
				return basicSetRolesqfromdb(null, msgs);
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM:
				return basicSetRolesqtosm(null, msgs);
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
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB:
				return getRolesqfromdb();
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM:
				return getRolesqtosm();
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
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB:
				setRolesqfromdb((RoleFourni)newValue);
				return;
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM:
				setRolesqtosm((RoleRequis)newValue);
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
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB:
				setRolesqfromdb((RoleFourni)null);
				return;
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM:
				setRolesqtosm((RoleRequis)null);
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
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB:
				return rolesqfromdb != null;
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM:
				return rolesqtosm != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityQueryConnectorOutImpl
