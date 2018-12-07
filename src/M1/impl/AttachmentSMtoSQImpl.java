/**
 */
package M1.impl;

import M1.M1Package;

import aSA.RoleFourni;

import aSA.Attachment;
import aSA.PortComposantFourni;

import aSA.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment SMto SQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentSMtoSQImpl#getPortsmtosq <em>Portsmtosq</em>}</li>
 *   <li>{@link M1.impl.AttachmentSMtoSQImpl#getRolesqfromsm <em>Rolesqfromsm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentSMtoSQImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortsmtosq() <em>Portsmtosq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsmtosq()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portsmtosq;

	/**
	 * The cached value of the '{@link #getRolesqfromsm() <em>Rolesqfromsm</em>}' reference.
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
	protected AttachmentSMtoSQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_SMTO_SQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortsmtosq() {
		if (portsmtosq != null && ((EObject)portsmtosq).eIsProxy()) {
			InternalEObject oldPortsmtosq = (InternalEObject)portsmtosq;
			portsmtosq = (PortComposantFourni)eResolveProxy(oldPortsmtosq);
			if (portsmtosq != oldPortsmtosq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SMTO_SQ__PORTSMTOSQ, oldPortsmtosq, portsmtosq));
			}
		}
		return portsmtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortsmtosq() {
		return portsmtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsmtosq(PortComposantFourni newPortsmtosq) {
		PortComposantFourni oldPortsmtosq = portsmtosq;
		portsmtosq = newPortsmtosq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SMTO_SQ__PORTSMTOSQ, oldPortsmtosq, portsmtosq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqfromsm() {
		if (rolesqfromsm != null && ((EObject)rolesqfromsm).eIsProxy()) {
			InternalEObject oldRolesqfromsm = (InternalEObject)rolesqfromsm;
			rolesqfromsm = (RoleFourni)eResolveProxy(oldRolesqfromsm);
			if (rolesqfromsm != oldRolesqfromsm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SMTO_SQ__ROLESQFROMSM, oldRolesqfromsm, rolesqfromsm));
			}
		}
		return rolesqfromsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolesqfromsm() {
		return rolesqfromsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqfromsm(RoleFourni newRolesqfromsm) {
		RoleFourni oldRolesqfromsm = rolesqfromsm;
		rolesqfromsm = newRolesqfromsm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SMTO_SQ__ROLESQFROMSM, oldRolesqfromsm, rolesqfromsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_SMTO_SQ__PORTSMTOSQ:
				if (resolve) return getPortsmtosq();
				return basicGetPortsmtosq();
			case M1Package.ATTACHMENT_SMTO_SQ__ROLESQFROMSM:
				if (resolve) return getRolesqfromsm();
				return basicGetRolesqfromsm();
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
			case M1Package.ATTACHMENT_SMTO_SQ__PORTSMTOSQ:
				setPortsmtosq((PortComposantFourni)newValue);
				return;
			case M1Package.ATTACHMENT_SMTO_SQ__ROLESQFROMSM:
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
			case M1Package.ATTACHMENT_SMTO_SQ__PORTSMTOSQ:
				setPortsmtosq((PortComposantFourni)null);
				return;
			case M1Package.ATTACHMENT_SMTO_SQ__ROLESQFROMSM:
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
			case M1Package.ATTACHMENT_SMTO_SQ__PORTSMTOSQ:
				return portsmtosq != null;
			case M1Package.ATTACHMENT_SMTO_SQ__ROLESQFROMSM:
				return rolesqfromsm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentSMtoSQImpl
