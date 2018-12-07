/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Attachment;
import aSA.PortComposantRequis;
import aSA.RoleFourni;

import aSA.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment SQ Lto CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentSQLtoCMImpl#getPortsqltocm <em>Portsqltocm</em>}</li>
 *   <li>{@link M1.impl.AttachmentSQLtoCMImpl#getRolesqltocm <em>Rolesqltocm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentSQLtoCMImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortsqltocm() <em>Portsqltocm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqltocm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqltocm;

	/**
	 * The cached value of the '{@link #getRolesqltocm() <em>Rolesqltocm</em>}' reference.
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
	protected AttachmentSQLtoCMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_SQ_LTO_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqltocm() {
		if (portsqltocm != null && ((EObject)portsqltocm).eIsProxy()) {
			InternalEObject oldPortsqltocm = (InternalEObject)portsqltocm;
			portsqltocm = (PortComposantRequis)eResolveProxy(oldPortsqltocm);
			if (portsqltocm != oldPortsqltocm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM, oldPortsqltocm, portsqltocm));
			}
		}
		return portsqltocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortsqltocm() {
		return portsqltocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqltocm(PortComposantRequis newPortsqltocm) {
		PortComposantRequis oldPortsqltocm = portsqltocm;
		portsqltocm = newPortsqltocm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM, oldPortsqltocm, portsqltocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqltocm() {
		if (rolesqltocm != null && ((EObject)rolesqltocm).eIsProxy()) {
			InternalEObject oldRolesqltocm = (InternalEObject)rolesqltocm;
			rolesqltocm = (RoleFourni)eResolveProxy(oldRolesqltocm);
			if (rolesqltocm != oldRolesqltocm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM, oldRolesqltocm, rolesqltocm));
			}
		}
		return rolesqltocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolesqltocm() {
		return rolesqltocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqltocm(RoleFourni newRolesqltocm) {
		RoleFourni oldRolesqltocm = rolesqltocm;
		rolesqltocm = newRolesqltocm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM, oldRolesqltocm, rolesqltocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM:
				if (resolve) return getPortsqltocm();
				return basicGetPortsqltocm();
			case M1Package.ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM:
				if (resolve) return getRolesqltocm();
				return basicGetRolesqltocm();
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
			case M1Package.ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM:
				setPortsqltocm((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM:
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
			case M1Package.ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM:
				setPortsqltocm((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM:
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
			case M1Package.ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM:
				return portsqltocm != null;
			case M1Package.ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM:
				return rolesqltocm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentSQLtoCMImpl
