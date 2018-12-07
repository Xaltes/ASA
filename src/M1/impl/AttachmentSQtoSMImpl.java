/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Attachment;
import aSA.PortComposantRequis;
import aSA.RoleRequis;

import aSA.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment SQto SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentSQtoSMImpl#getPortsqtosm <em>Portsqtosm</em>}</li>
 *   <li>{@link M1.impl.AttachmentSQtoSMImpl#getRolesqtosm <em>Rolesqtosm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentSQtoSMImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortsqtosm() <em>Portsqtosm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqtosm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqtosm;

	/**
	 * The cached value of the '{@link #getRolesqtosm() <em>Rolesqtosm</em>}' reference.
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
	protected AttachmentSQtoSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_SQTO_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqtosm() {
		if (portsqtosm != null && ((EObject)portsqtosm).eIsProxy()) {
			InternalEObject oldPortsqtosm = (InternalEObject)portsqtosm;
			portsqtosm = (PortComposantRequis)eResolveProxy(oldPortsqtosm);
			if (portsqtosm != oldPortsqtosm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQTO_SM__PORTSQTOSM, oldPortsqtosm, portsqtosm));
			}
		}
		return portsqtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortsqtosm() {
		return portsqtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqtosm(PortComposantRequis newPortsqtosm) {
		PortComposantRequis oldPortsqtosm = portsqtosm;
		portsqtosm = newPortsqtosm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQTO_SM__PORTSQTOSM, oldPortsqtosm, portsqtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqtosm() {
		if (rolesqtosm != null && ((EObject)rolesqtosm).eIsProxy()) {
			InternalEObject oldRolesqtosm = (InternalEObject)rolesqtosm;
			rolesqtosm = (RoleRequis)eResolveProxy(oldRolesqtosm);
			if (rolesqtosm != oldRolesqtosm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQTO_SM__ROLESQTOSM, oldRolesqtosm, rolesqtosm));
			}
		}
		return rolesqtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolesqtosm() {
		return rolesqtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqtosm(RoleRequis newRolesqtosm) {
		RoleRequis oldRolesqtosm = rolesqtosm;
		rolesqtosm = newRolesqtosm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQTO_SM__ROLESQTOSM, oldRolesqtosm, rolesqtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_SQTO_SM__PORTSQTOSM:
				if (resolve) return getPortsqtosm();
				return basicGetPortsqtosm();
			case M1Package.ATTACHMENT_SQTO_SM__ROLESQTOSM:
				if (resolve) return getRolesqtosm();
				return basicGetRolesqtosm();
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
			case M1Package.ATTACHMENT_SQTO_SM__PORTSQTOSM:
				setPortsqtosm((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_SQTO_SM__ROLESQTOSM:
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
			case M1Package.ATTACHMENT_SQTO_SM__PORTSQTOSM:
				setPortsqtosm((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_SQTO_SM__ROLESQTOSM:
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
			case M1Package.ATTACHMENT_SQTO_SM__PORTSQTOSM:
				return portsqtosm != null;
			case M1Package.ATTACHMENT_SQTO_SM__ROLESQTOSM:
				return rolesqtosm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentSQtoSMImpl
