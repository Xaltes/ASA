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
 * An implementation of the model object '<em><b>Clearance Request Connector In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.ClearanceRequestConnectorInImpl#getRolecrfromcm <em>Rolecrfromcm</em>}</li>
 *   <li>{@link M1.impl.ClearanceRequestConnectorInImpl#getRolecrtosm <em>Rolecrtosm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearanceRequestConnectorInImpl extends ConnecteurImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getRolecrfromcm() <em>Rolecrfromcm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolecrfromcm()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolecrfromcm;

	/**
	 * The cached value of the '{@link #getRolecrtosm() <em>Rolecrtosm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolecrtosm()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolecrtosm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearanceRequestConnectorInImpl(RoleFourni r1, RoleRequis r2) {
		super();
		this.rolecrfromcm = r1;
		this.rolecrtosm = r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.CLEARANCE_REQUEST_CONNECTOR_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolecrfromcm() {
		return rolecrfromcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolecrfromcm(RoleFourni newRolecrfromcm, NotificationChain msgs) {
		RoleFourni oldRolecrfromcm = rolecrfromcm;
		rolecrfromcm = newRolecrfromcm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM, oldRolecrfromcm, newRolecrfromcm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrfromcm(RoleFourni newRolecrfromcm) {
		if (newRolecrfromcm != rolecrfromcm) {
			NotificationChain msgs = null;
			//if (rolecrfromcm != null)
				//msgs = ((InternalEObject)rolecrfromcm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM, null, msgs);
			//if (newRolecrfromcm != null)
				//msgs = ((InternalEObject)newRolecrfromcm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM, null, msgs);
			msgs = basicSetRolecrfromcm(newRolecrfromcm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM, newRolecrfromcm, newRolecrfromcm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolecrtosm() {
		return rolecrtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolecrtosm(RoleRequis newRolecrtosm, NotificationChain msgs) {
		RoleRequis oldRolecrtosm = rolecrtosm;
		rolecrtosm = newRolecrtosm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM, oldRolecrtosm, newRolecrtosm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrtosm(RoleRequis newRolecrtosm) {
		if (newRolecrtosm != rolecrtosm) {
			NotificationChain msgs = null;
			//if (rolecrtosm != null)
				//msgs = ((InternalEObject)rolecrtosm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM, null, msgs);
			//if (newRolecrtosm != null)
				//msgs = ((InternalEObject)newRolecrtosm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM, null, msgs);
			msgs = basicSetRolecrtosm(newRolecrtosm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM, newRolecrtosm, newRolecrtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM:
				return basicSetRolecrfromcm(null, msgs);
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM:
				return basicSetRolecrtosm(null, msgs);
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM:
				return getRolecrfromcm();
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM:
				return getRolecrtosm();
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM:
				setRolecrfromcm((RoleFourni)newValue);
				return;
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM:
				setRolecrtosm((RoleRequis)newValue);
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM:
				setRolecrfromcm((RoleFourni)null);
				return;
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM:
				setRolecrtosm((RoleRequis)null);
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
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM:
				return rolecrfromcm != null;
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM:
				return rolecrtosm != null;
		}
		return super.eIsSet(featureID);
	}

} //ClearanceRequestConnectorInImpl
