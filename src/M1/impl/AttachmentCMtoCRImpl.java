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
 * An implementation of the model object '<em><b>Attachment CMto CR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentCMtoCRImpl#getRolecrfromcm <em>Rolecrfromcm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentCMtoCRImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getRolecrfromcm() <em>Rolecrfromcm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolecrfromcm()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolecrfromcm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentCMtoCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_CMTO_CR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolecrfromcm() {
		if (rolecrfromcm != null && ((EObject)rolecrfromcm).eIsProxy()) {
			InternalEObject oldRolecrfromcm = (InternalEObject)rolecrfromcm;
			rolecrfromcm = (RoleFourni)eResolveProxy(oldRolecrfromcm);
			if (rolecrfromcm != oldRolecrfromcm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CMTO_CR__ROLECRFROMCM, oldRolecrfromcm, rolecrfromcm));
			}
		}
		return rolecrfromcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolecrfromcm() {
		return rolecrfromcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrfromcm(RoleFourni newRolecrfromcm) {
		RoleFourni oldRolecrfromcm = rolecrfromcm;
		rolecrfromcm = newRolecrfromcm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CMTO_CR__ROLECRFROMCM, oldRolecrfromcm, rolecrfromcm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_CMTO_CR__ROLECRFROMCM:
				if (resolve) return getRolecrfromcm();
				return basicGetRolecrfromcm();
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
			case M1Package.ATTACHMENT_CMTO_CR__ROLECRFROMCM:
				setRolecrfromcm((RoleFourni)newValue);
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
			case M1Package.ATTACHMENT_CMTO_CR__ROLECRFROMCM:
				setRolecrfromcm((RoleFourni)null);
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
			case M1Package.ATTACHMENT_CMTO_CR__ROLECRFROMCM:
				return rolecrfromcm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentCMtoCRImpl
