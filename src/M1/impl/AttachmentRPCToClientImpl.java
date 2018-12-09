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
 * An implementation of the model object '<em><b>Attachment RPC To Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentRPCToClientImpl#getPortrpctoclient <em>Portrpctoclient</em>}</li>
 *   <li>{@link M1.impl.AttachmentRPCToClientImpl#getRolerpctoclient <em>Rolerpctoclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentRPCToClientImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortrpctoclient() <em>Portrpctoclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrpctoclient()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portrpctoclient;

	/**
	 * The cached value of the '{@link #getRolerpctoclient() <em>Rolerpctoclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpctoclient()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolerpctoclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentRPCToClientImpl(PortComposantRequis p, RoleFourni r) {
		super();
		this.portrpctoclient = p;
		this.rolerpctoclient = r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_RPC_TO_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortrpctoclient() {
		if (portrpctoclient != null && ((EObject)portrpctoclient).eIsProxy()) {
			InternalEObject oldPortrpctoclient = (InternalEObject)portrpctoclient;
			portrpctoclient = (PortComposantRequis)eResolveProxy(oldPortrpctoclient);
			if (portrpctoclient != oldPortrpctoclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT, oldPortrpctoclient, portrpctoclient));
			}
		}
		return portrpctoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortrpctoclient() {
		return portrpctoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrpctoclient(PortComposantRequis newPortrpctoclient) {
		PortComposantRequis oldPortrpctoclient = portrpctoclient;
		portrpctoclient = newPortrpctoclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT, oldPortrpctoclient, portrpctoclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolerpctoclient() {
		if (rolerpctoclient != null && ((EObject)rolerpctoclient).eIsProxy()) {
			InternalEObject oldRolerpctoclient = (InternalEObject)rolerpctoclient;
			rolerpctoclient = (RoleFourni)eResolveProxy(oldRolerpctoclient);
			if (rolerpctoclient != oldRolerpctoclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT, oldRolerpctoclient, rolerpctoclient));
			}
		}
		return rolerpctoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolerpctoclient() {
		return rolerpctoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpctoclient(RoleFourni newRolerpctoclient) {
		RoleFourni oldRolerpctoclient = rolerpctoclient;
		rolerpctoclient = newRolerpctoclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT, oldRolerpctoclient, rolerpctoclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT:
				if (resolve) return getPortrpctoclient();
				return basicGetPortrpctoclient();
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT:
				if (resolve) return getRolerpctoclient();
				return basicGetRolerpctoclient();
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
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT:
				setPortrpctoclient((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT:
				setRolerpctoclient((RoleFourni)newValue);
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
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT:
				setPortrpctoclient((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT:
				setRolerpctoclient((RoleFourni)null);
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
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT:
				return portrpctoclient != null;
			case M1Package.ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT:
				return rolerpctoclient != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentRPCToClientImpl
