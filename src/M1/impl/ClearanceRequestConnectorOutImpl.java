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
 * An implementation of the model object '<em><b>Clearance Request Connector Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.ClearanceRequestConnectorOutImpl#getRolecrtocm <em>Rolecrtocm</em>}</li>
 *   <li>{@link M1.impl.ClearanceRequestConnectorOutImpl#getRolecrfromsm <em>Rolecrfromsm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearanceRequestConnectorOutImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolecrtocm() <em>Rolecrtocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolecrtocm()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolecrtocm;

	/**
	 * The cached value of the '{@link #getRolecrfromsm() <em>Rolecrfromsm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolecrfromsm()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolecrfromsm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearanceRequestConnectorOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.CLEARANCE_REQUEST_CONNECTOR_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolecrtocm() {
		return rolecrtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolecrtocm(RoleRequis newRolecrtocm, NotificationChain msgs) {
		RoleRequis oldRolecrtocm = rolecrtocm;
		rolecrtocm = newRolecrtocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM, oldRolecrtocm, newRolecrtocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrtocm(RoleRequis newRolecrtocm) {
		if (newRolecrtocm != rolecrtocm) {
			NotificationChain msgs = null;
			//if (rolecrtocm != null)
				//msgs = ((InternalEObject)rolecrtocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM, null, msgs);
			//if (newRolecrtocm != null)
				//msgs = ((InternalEObject)newRolecrtocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM, null, msgs);
			msgs = basicSetRolecrtocm(newRolecrtocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM, newRolecrtocm, newRolecrtocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolecrfromsm() {
		return rolecrfromsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolecrfromsm(RoleFourni newRolecrfromsm, NotificationChain msgs) {
		RoleFourni oldRolecrfromsm = rolecrfromsm;
		rolecrfromsm = newRolecrfromsm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM, oldRolecrfromsm, newRolecrfromsm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrfromsm(RoleFourni newRolecrfromsm) {
		if (newRolecrfromsm != rolecrfromsm) {
			NotificationChain msgs = null;
			if (rolecrfromsm != null)
				msgs = ((InternalEObject)rolecrfromsm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM, null, msgs);
			if (newRolecrfromsm != null)
				msgs = ((InternalEObject)newRolecrfromsm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM, null, msgs);
			msgs = basicSetRolecrfromsm(newRolecrfromsm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM, newRolecrfromsm, newRolecrfromsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM:
				return basicSetRolecrtocm(null, msgs);
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM:
				return basicSetRolecrfromsm(null, msgs);
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM:
				return getRolecrtocm();
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM:
				return getRolecrfromsm();
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM:
				setRolecrtocm((RoleRequis)newValue);
				return;
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM:
				setRolecrfromsm((RoleFourni)newValue);
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM:
				setRolecrtocm((RoleRequis)null);
				return;
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM:
				setRolecrfromsm((RoleFourni)null);
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM:
				return rolecrtocm != null;
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM:
				return rolecrfromsm != null;
		}
		return super.eIsSet(featureID);
	}

} //ClearanceRequestConnectorOutImpl
