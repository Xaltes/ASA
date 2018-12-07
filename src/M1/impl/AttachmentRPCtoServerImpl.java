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
 * An implementation of the model object '<em><b>Attachment RP Cto Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentRPCtoServerImpl#getPortrpctoserver <em>Portrpctoserver</em>}</li>
 *   <li>{@link M1.impl.AttachmentRPCtoServerImpl#getRolerpctoserver <em>Rolerpctoserver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentRPCtoServerImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortrpctoserver() <em>Portrpctoserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrpctoserver()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portrpctoserver;

	/**
	 * The cached value of the '{@link #getRolerpctoserver() <em>Rolerpctoserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpctoserver()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolerpctoserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentRPCtoServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_RP_CTO_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortrpctoserver() {
		if (portrpctoserver != null && ((EObject)portrpctoserver).eIsProxy()) {
			InternalEObject oldPortrpctoserver = (InternalEObject)portrpctoserver;
			portrpctoserver = (PortComposantRequis)eResolveProxy(oldPortrpctoserver);
			if (portrpctoserver != oldPortrpctoserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER, oldPortrpctoserver, portrpctoserver));
			}
		}
		return portrpctoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortrpctoserver() {
		return portrpctoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrpctoserver(PortComposantRequis newPortrpctoserver) {
		PortComposantRequis oldPortrpctoserver = portrpctoserver;
		portrpctoserver = newPortrpctoserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER, oldPortrpctoserver, portrpctoserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolerpctoserver() {
		if (rolerpctoserver != null && ((EObject)rolerpctoserver).eIsProxy()) {
			InternalEObject oldRolerpctoserver = (InternalEObject)rolerpctoserver;
			rolerpctoserver = (RoleFourni)eResolveProxy(oldRolerpctoserver);
			if (rolerpctoserver != oldRolerpctoserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER, oldRolerpctoserver, rolerpctoserver));
			}
		}
		return rolerpctoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolerpctoserver() {
		return rolerpctoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpctoserver(RoleFourni newRolerpctoserver) {
		RoleFourni oldRolerpctoserver = rolerpctoserver;
		rolerpctoserver = newRolerpctoserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER, oldRolerpctoserver, rolerpctoserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER:
				if (resolve) return getPortrpctoserver();
				return basicGetPortrpctoserver();
			case M1Package.ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER:
				if (resolve) return getRolerpctoserver();
				return basicGetRolerpctoserver();
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
			case M1Package.ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER:
				setPortrpctoserver((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER:
				setRolerpctoserver((RoleFourni)newValue);
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
			case M1Package.ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER:
				setPortrpctoserver((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER:
				setRolerpctoserver((RoleFourni)null);
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
			case M1Package.ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER:
				return portrpctoserver != null;
			case M1Package.ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER:
				return rolerpctoserver != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentRPCtoServerImpl
