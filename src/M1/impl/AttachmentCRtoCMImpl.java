/**
 */
package M1.impl;

import M1.M1Package;

import aSA.RoleRequis;

import aSA.Attachment;
import aSA.PortComposantRequis;

import aSA.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment CRto CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentCRtoCMImpl#getPortcrtocm <em>Portcrtocm</em>}</li>
 *   <li>{@link M1.impl.AttachmentCRtoCMImpl#getRolecrtocm <em>Rolecrtocm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentCRtoCMImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortcrtocm() <em>Portcrtocm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcrtocm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portcrtocm;

	/**
	 * The cached value of the '{@link #getRolecrtocm() <em>Rolecrtocm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolecrtocm()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolecrtocm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentCRtoCMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_CRTO_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortcrtocm() {
		if (portcrtocm != null && ((EObject)portcrtocm).eIsProxy()) {
			InternalEObject oldPortcrtocm = (InternalEObject)portcrtocm;
			portcrtocm = (PortComposantRequis)eResolveProxy(oldPortcrtocm);
			if (portcrtocm != oldPortcrtocm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CRTO_CM__PORTCRTOCM, oldPortcrtocm, portcrtocm));
			}
		}
		return portcrtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortcrtocm() {
		return portcrtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcrtocm(PortComposantRequis newPortcrtocm) {
		PortComposantRequis oldPortcrtocm = portcrtocm;
		portcrtocm = newPortcrtocm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CRTO_CM__PORTCRTOCM, oldPortcrtocm, portcrtocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolecrtocm() {
		if (rolecrtocm != null && ((EObject)rolecrtocm).eIsProxy()) {
			InternalEObject oldRolecrtocm = (InternalEObject)rolecrtocm;
			rolecrtocm = (RoleRequis)eResolveProxy(oldRolecrtocm);
			if (rolecrtocm != oldRolecrtocm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CRTO_CM__ROLECRTOCM, oldRolecrtocm, rolecrtocm));
			}
		}
		return rolecrtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolecrtocm() {
		return rolecrtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrtocm(RoleRequis newRolecrtocm) {
		RoleRequis oldRolecrtocm = rolecrtocm;
		rolecrtocm = newRolecrtocm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CRTO_CM__ROLECRTOCM, oldRolecrtocm, rolecrtocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_CRTO_CM__PORTCRTOCM:
				if (resolve) return getPortcrtocm();
				return basicGetPortcrtocm();
			case M1Package.ATTACHMENT_CRTO_CM__ROLECRTOCM:
				if (resolve) return getRolecrtocm();
				return basicGetRolecrtocm();
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
			case M1Package.ATTACHMENT_CRTO_CM__PORTCRTOCM:
				setPortcrtocm((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_CRTO_CM__ROLECRTOCM:
				setRolecrtocm((RoleRequis)newValue);
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
			case M1Package.ATTACHMENT_CRTO_CM__PORTCRTOCM:
				setPortcrtocm((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_CRTO_CM__ROLECRTOCM:
				setRolecrtocm((RoleRequis)null);
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
			case M1Package.ATTACHMENT_CRTO_CM__PORTCRTOCM:
				return portcrtocm != null;
			case M1Package.ATTACHMENT_CRTO_CM__ROLECRTOCM:
				return rolecrtocm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentCRtoCMImpl
