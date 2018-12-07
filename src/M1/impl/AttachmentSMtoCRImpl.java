/**
 */
package M1.impl;

import M1.M1Package;

import aSA.RoleFourni;

import aSA.Attachment;

import aSA.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment SMto CR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentSMtoCRImpl#getRolecrfromsm <em>Rolecrfromsm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentSMtoCRImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getRolecrfromsm() <em>Rolecrfromsm</em>}' reference.
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
	protected AttachmentSMtoCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_SMTO_CR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolecrfromsm() {
		if (rolecrfromsm != null && ((EObject)rolecrfromsm).eIsProxy()) {
			InternalEObject oldRolecrfromsm = (InternalEObject)rolecrfromsm;
			rolecrfromsm = (RoleFourni)eResolveProxy(oldRolecrfromsm);
			if (rolecrfromsm != oldRolecrfromsm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SMTO_CR__ROLECRFROMSM, oldRolecrfromsm, rolecrfromsm));
			}
		}
		return rolecrfromsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolecrfromsm() {
		return rolecrfromsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrfromsm(RoleFourni newRolecrfromsm) {
		RoleFourni oldRolecrfromsm = rolecrfromsm;
		rolecrfromsm = newRolecrfromsm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SMTO_CR__ROLECRFROMSM, oldRolecrfromsm, rolecrfromsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_SMTO_CR__ROLECRFROMSM:
				if (resolve) return getRolecrfromsm();
				return basicGetRolecrfromsm();
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
			case M1Package.ATTACHMENT_SMTO_CR__ROLECRFROMSM:
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
			case M1Package.ATTACHMENT_SMTO_CR__ROLECRFROMSM:
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
			case M1Package.ATTACHMENT_SMTO_CR__ROLECRFROMSM:
				return rolecrfromsm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentSMtoCRImpl
