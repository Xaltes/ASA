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
 * An implementation of the model object '<em><b>Security Query Connector In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.SecurityQueryConnectorInImpl#getRolesqtodb <em>Rolesqtodb</em>}</li>
 *   <li>{@link M1.impl.SecurityQueryConnectorInImpl#getRolesqfromsm <em>Rolesqfromsm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityQueryConnectorInImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolesqtodb() <em>Rolesqtodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqtodb()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolesqtodb;

	/**
	 * The cached value of the '{@link #getRolesqfromsm() <em>Rolesqfromsm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqfromsm()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolesqfromsm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityQueryConnectorInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.SECURITY_QUERY_CONNECTOR_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqtodb() {
		return rolesqtodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqtodb(RoleRequis newRolesqtodb, NotificationChain msgs) {
		RoleRequis oldRolesqtodb = rolesqtodb;
		rolesqtodb = newRolesqtodb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB, oldRolesqtodb, newRolesqtodb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqtodb(RoleRequis newRolesqtodb) {
		if (newRolesqtodb != rolesqtodb) {
			NotificationChain msgs = null;
			if (rolesqtodb != null)
				msgs = ((InternalEObject)rolesqtodb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB, null, msgs);
			if (newRolesqtodb != null)
				msgs = ((InternalEObject)newRolesqtodb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB, null, msgs);
			msgs = basicSetRolesqtodb(newRolesqtodb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB, newRolesqtodb, newRolesqtodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqfromsm() {
		return rolesqfromsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolesqfromsm(RoleFourni newRolesqfromsm, NotificationChain msgs) {
		RoleFourni oldRolesqfromsm = rolesqfromsm;
		rolesqfromsm = newRolesqfromsm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM, oldRolesqfromsm, newRolesqfromsm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqfromsm(RoleFourni newRolesqfromsm) {
		if (newRolesqfromsm != rolesqfromsm) {
			NotificationChain msgs = null;
			if (rolesqfromsm != null)
				msgs = ((InternalEObject)rolesqfromsm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM, null, msgs);
			if (newRolesqfromsm != null)
				msgs = ((InternalEObject)newRolesqfromsm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM, null, msgs);
			msgs = basicSetRolesqfromsm(newRolesqfromsm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM, newRolesqfromsm, newRolesqfromsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB:
				return basicSetRolesqtodb(null, msgs);
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM:
				return basicSetRolesqfromsm(null, msgs);
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
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB:
				return getRolesqtodb();
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM:
				return getRolesqfromsm();
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
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB:
				setRolesqtodb((RoleRequis)newValue);
				return;
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM:
				setRolesqfromsm((RoleFourni)newValue);
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
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB:
				setRolesqtodb((RoleRequis)null);
				return;
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM:
				setRolesqfromsm((RoleFourni)null);
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
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB:
				return rolesqtodb != null;
			case M1Package.SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM:
				return rolesqfromsm != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityQueryConnectorInImpl
