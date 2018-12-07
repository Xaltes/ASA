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
 * An implementation of the model object '<em><b>SQL Query Connector Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.SQLQueryConnectorOutImpl#getRolesqlfromdb <em>Rolesqlfromdb</em>}</li>
 *   <li>{@link M1.impl.SQLQueryConnectorOutImpl#getRolesqltocm <em>Rolesqltocm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SQLQueryConnectorOutImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolesqlfromdb() <em>Rolesqlfromdb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqlfromdb()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolesqlfromdb;

	/**
	 * The cached value of the '{@link #getRolesqltocm() <em>Rolesqltocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqltocm()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolesqltocm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLQueryConnectorOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.SQL_QUERY_CONNECTOR_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqlfromdb() {
		return rolesqlfromdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqlfromdb(RoleRequis newRolesqlfromdb, NotificationChain msgs) {
		RoleRequis oldRolesqlfromdb = rolesqlfromdb;
		rolesqlfromdb = newRolesqlfromdb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB, oldRolesqlfromdb, newRolesqlfromdb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqlfromdb(RoleRequis newRolesqlfromdb) {
		if (newRolesqlfromdb != rolesqlfromdb) {
			NotificationChain msgs = null;
			if (rolesqlfromdb != null)
				msgs = ((InternalEObject)rolesqlfromdb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB, null, msgs);
			if (newRolesqlfromdb != null)
				msgs = ((InternalEObject)newRolesqlfromdb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB, null, msgs);
			msgs = basicSetRolesqlfromdb(newRolesqlfromdb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB, newRolesqlfromdb, newRolesqlfromdb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqltocm() {
		return rolesqltocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqltocm(RoleFourni newRolesqltocm, NotificationChain msgs) {
		RoleFourni oldRolesqltocm = rolesqltocm;
		rolesqltocm = newRolesqltocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM, oldRolesqltocm, newRolesqltocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqltocm(RoleFourni newRolesqltocm) {
		if (newRolesqltocm != rolesqltocm) {
			NotificationChain msgs = null;
			if (rolesqltocm != null)
				msgs = ((InternalEObject)rolesqltocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM, null, msgs);
			if (newRolesqltocm != null)
				msgs = ((InternalEObject)newRolesqltocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM, null, msgs);
			msgs = basicSetRolesqltocm(newRolesqltocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM, newRolesqltocm, newRolesqltocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB:
				return basicSetRolesqlfromdb(null, msgs);
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM:
				return basicSetRolesqltocm(null, msgs);
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
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB:
				return getRolesqlfromdb();
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM:
				return getRolesqltocm();
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
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB:
				setRolesqlfromdb((RoleRequis)newValue);
				return;
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM:
				setRolesqltocm((RoleFourni)newValue);
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
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB:
				setRolesqlfromdb((RoleRequis)null);
				return;
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM:
				setRolesqltocm((RoleFourni)null);
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
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB:
				return rolesqlfromdb != null;
			case M1Package.SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM:
				return rolesqltocm != null;
		}
		return super.eIsSet(featureID);
	}

} //SQLQueryConnectorOutImpl
