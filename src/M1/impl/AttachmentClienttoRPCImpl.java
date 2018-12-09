/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Attachment;
import aSA.PortComposantFourni;
import aSA.RoleRequis;

import aSA.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Clientto RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentClienttoRPCImpl#getPortclienttorpc <em>Portclienttorpc</em>}</li>
 *   <li>{@link M1.impl.AttachmentClienttoRPCImpl#getRolerpcfromclient <em>Rolerpcfromclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentClienttoRPCImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortclienttorpc() <em>Portclienttorpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortclienttorpc()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portclienttorpc;

	/**
	 * The cached value of the '{@link #getRolerpcfromclient() <em>Rolerpcfromclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpcfromclient()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolerpcfromclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentClienttoRPCImpl(PortComposantFourni p, RoleRequis r) {
		super();
		this.portclienttorpc = p;
		this.rolerpcfromclient = r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_CLIENTTO_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortclienttorpc() {
		if (portclienttorpc != null && ((EObject)portclienttorpc).eIsProxy()) {
			InternalEObject oldPortclienttorpc = (InternalEObject)portclienttorpc;
			portclienttorpc = (PortComposantFourni)eResolveProxy(oldPortclienttorpc);
			if (portclienttorpc != oldPortclienttorpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC, oldPortclienttorpc, portclienttorpc));
			}
		}
		return portclienttorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortclienttorpc() {
		return portclienttorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortclienttorpc(PortComposantFourni newPortclienttorpc) {
		PortComposantFourni oldPortclienttorpc = portclienttorpc;
		portclienttorpc = newPortclienttorpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC, oldPortclienttorpc, portclienttorpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolerpcfromclient() {
		if (rolerpcfromclient != null && ((EObject)rolerpcfromclient).eIsProxy()) {
			InternalEObject oldRolerpcfromclient = (InternalEObject)rolerpcfromclient;
			rolerpcfromclient = (RoleRequis)eResolveProxy(oldRolerpcfromclient);
			if (rolerpcfromclient != oldRolerpcfromclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT, oldRolerpcfromclient, rolerpcfromclient));
			}
		}
		return rolerpcfromclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolerpcfromclient() {
		return rolerpcfromclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpcfromclient(RoleRequis newRolerpcfromclient) {
		RoleRequis oldRolerpcfromclient = rolerpcfromclient;
		rolerpcfromclient = newRolerpcfromclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT, oldRolerpcfromclient, rolerpcfromclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC:
				if (resolve) return getPortclienttorpc();
				return basicGetPortclienttorpc();
			case M1Package.ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT:
				if (resolve) return getRolerpcfromclient();
				return basicGetRolerpcfromclient();
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
			case M1Package.ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC:
				setPortclienttorpc((PortComposantFourni)newValue);
				return;
			case M1Package.ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT:
				setRolerpcfromclient((RoleRequis)newValue);
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
			case M1Package.ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC:
				setPortclienttorpc((PortComposantFourni)null);
				return;
			case M1Package.ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT:
				setRolerpcfromclient((RoleRequis)null);
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
			case M1Package.ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC:
				return portclienttorpc != null;
			case M1Package.ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT:
				return rolerpcfromclient != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentClienttoRPCImpl
