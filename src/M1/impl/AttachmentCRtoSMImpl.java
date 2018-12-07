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
 * An implementation of the model object '<em><b>Attachment CRto SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentCRtoSMImpl#getPortcrtosm <em>Portcrtosm</em>}</li>
 *   <li>{@link M1.impl.AttachmentCRtoSMImpl#getRolecrtosm <em>Rolecrtosm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentCRtoSMImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortcrtosm() <em>Portcrtosm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcrtosm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portcrtosm;

	/**
	 * The cached value of the '{@link #getRolecrtosm() <em>Rolecrtosm</em>}' reference.
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
	protected AttachmentCRtoSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_CRTO_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortcrtosm() {
		if (portcrtosm != null && ((EObject)portcrtosm).eIsProxy()) {
			InternalEObject oldPortcrtosm = (InternalEObject)portcrtosm;
			portcrtosm = (PortComposantRequis)eResolveProxy(oldPortcrtosm);
			if (portcrtosm != oldPortcrtosm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CRTO_SM__PORTCRTOSM, oldPortcrtosm, portcrtosm));
			}
		}
		return portcrtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortcrtosm() {
		return portcrtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcrtosm(PortComposantRequis newPortcrtosm) {
		PortComposantRequis oldPortcrtosm = portcrtosm;
		portcrtosm = newPortcrtosm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CRTO_SM__PORTCRTOSM, oldPortcrtosm, portcrtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolecrtosm() {
		if (rolecrtosm != null && ((EObject)rolecrtosm).eIsProxy()) {
			InternalEObject oldRolecrtosm = (InternalEObject)rolecrtosm;
			rolecrtosm = (RoleRequis)eResolveProxy(oldRolecrtosm);
			if (rolecrtosm != oldRolecrtosm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CRTO_SM__ROLECRTOSM, oldRolecrtosm, rolecrtosm));
			}
		}
		return rolecrtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolecrtosm() {
		return rolecrtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolecrtosm(RoleRequis newRolecrtosm) {
		RoleRequis oldRolecrtosm = rolecrtosm;
		rolecrtosm = newRolecrtosm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CRTO_SM__ROLECRTOSM, oldRolecrtosm, rolecrtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_CRTO_SM__PORTCRTOSM:
				if (resolve) return getPortcrtosm();
				return basicGetPortcrtosm();
			case M1Package.ATTACHMENT_CRTO_SM__ROLECRTOSM:
				if (resolve) return getRolecrtosm();
				return basicGetRolecrtosm();
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
			case M1Package.ATTACHMENT_CRTO_SM__PORTCRTOSM:
				setPortcrtosm((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_CRTO_SM__ROLECRTOSM:
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
			case M1Package.ATTACHMENT_CRTO_SM__PORTCRTOSM:
				setPortcrtosm((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_CRTO_SM__ROLECRTOSM:
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
			case M1Package.ATTACHMENT_CRTO_SM__PORTCRTOSM:
				return portcrtosm != null;
			case M1Package.ATTACHMENT_CRTO_SM__ROLECRTOSM:
				return rolecrtosm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentCRtoSMImpl
