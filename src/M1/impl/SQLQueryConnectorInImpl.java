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
 * An implementation of the model object '<em><b>SQL Query Connector In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.SQLQueryConnectorInImpl#getRolesqltodb <em>Rolesqltodb</em>}</li>
 *   <li>{@link M1.impl.SQLQueryConnectorInImpl#getRolesqlfromcm <em>Rolesqlfromcm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SQLQueryConnectorInImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolesqltodb() <em>Rolesqltodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqltodb()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolesqltodb;

	/**
	 * The cached value of the '{@link #getRolesqlfromcm() <em>Rolesqlfromcm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqlfromcm()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolesqlfromcm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLQueryConnectorInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.SQL_QUERY_CONNECTOR_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqltodb() {
		return rolesqltodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqltodb(RoleFourni newRolesqltodb, NotificationChain msgs) {
		RoleFourni oldRolesqltodb = rolesqltodb;
		rolesqltodb = newRolesqltodb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB, oldRolesqltodb, newRolesqltodb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqltodb(RoleFourni newRolesqltodb) {
		if (newRolesqltodb != rolesqltodb) {
			NotificationChain msgs = null;
			//if (rolesqltodb != null)
				//msgs = ((InternalEObject)rolesqltodb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB, null, msgs);
			//if (newRolesqltodb != null)
				//msgs = ((InternalEObject)newRolesqltodb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB, null, msgs);
			msgs = basicSetRolesqltodb(newRolesqltodb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB, newRolesqltodb, newRolesqltodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqlfromcm() {
		return rolesqlfromcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqlfromcm(RoleRequis newRolesqlfromcm, NotificationChain msgs) {
		RoleRequis oldRolesqlfromcm = rolesqlfromcm;
		rolesqlfromcm = newRolesqlfromcm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM, oldRolesqlfromcm, newRolesqlfromcm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqlfromcm(RoleRequis newRolesqlfromcm) {
		if (newRolesqlfromcm != rolesqlfromcm) {
			NotificationChain msgs = null;
			//if (rolesqlfromcm != null)
				//msgs = ((InternalEObject)rolesqlfromcm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM, null, msgs);
			//if (newRolesqlfromcm != null)
				//msgs = ((InternalEObject)newRolesqlfromcm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM, null, msgs);
			msgs = basicSetRolesqlfromcm(newRolesqlfromcm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM, newRolesqlfromcm, newRolesqlfromcm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB:
				return basicSetRolesqltodb(null, msgs);
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM:
				return basicSetRolesqlfromcm(null, msgs);
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
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB:
				return getRolesqltodb();
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM:
				return getRolesqlfromcm();
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
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB:
				setRolesqltodb((RoleFourni)newValue);
				return;
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM:
				setRolesqlfromcm((RoleRequis)newValue);
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
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB:
				setRolesqltodb((RoleFourni)null);
				return;
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM:
				setRolesqlfromcm((RoleRequis)null);
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
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLTODB:
				return rolesqltodb != null;
			case M1Package.SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM:
				return rolesqlfromcm != null;
		}
		return super.eIsSet(featureID);
	}

} //SQLQueryConnectorInImpl
