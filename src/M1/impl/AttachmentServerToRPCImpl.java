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
 * An implementation of the model object '<em><b>Attachment Server To RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentServerToRPCImpl#getPortservertorpc <em>Portservertorpc</em>}</li>
 *   <li>{@link M1.impl.AttachmentServerToRPCImpl#getRolerpcfromserver <em>Rolerpcfromserver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentServerToRPCImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortservertorpc() <em>Portservertorpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortservertorpc()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portservertorpc;

	/**
	 * The cached value of the '{@link #getRolerpcfromserver() <em>Rolerpcfromserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerpcfromserver()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolerpcfromserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentServerToRPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_SERVER_TO_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortservertorpc() {
		if (portservertorpc != null && ((EObject)portservertorpc).eIsProxy()) {
			InternalEObject oldPortservertorpc = (InternalEObject)portservertorpc;
			portservertorpc = (PortComposantFourni)eResolveProxy(oldPortservertorpc);
			if (portservertorpc != oldPortservertorpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC, oldPortservertorpc, portservertorpc));
			}
		}
		return portservertorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortservertorpc() {
		return portservertorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortservertorpc(PortComposantFourni newPortservertorpc) {
		PortComposantFourni oldPortservertorpc = portservertorpc;
		portservertorpc = newPortservertorpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC, oldPortservertorpc, portservertorpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolerpcfromserver() {
		if (rolerpcfromserver != null && ((EObject)rolerpcfromserver).eIsProxy()) {
			InternalEObject oldRolerpcfromserver = (InternalEObject)rolerpcfromserver;
			rolerpcfromserver = (RoleRequis)eResolveProxy(oldRolerpcfromserver);
			if (rolerpcfromserver != oldRolerpcfromserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER, oldRolerpcfromserver, rolerpcfromserver));
			}
		}
		return rolerpcfromserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolerpcfromserver() {
		return rolerpcfromserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerpcfromserver(RoleRequis newRolerpcfromserver) {
		RoleRequis oldRolerpcfromserver = rolerpcfromserver;
		rolerpcfromserver = newRolerpcfromserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER, oldRolerpcfromserver, rolerpcfromserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC:
				if (resolve) return getPortservertorpc();
				return basicGetPortservertorpc();
			case M1Package.ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER:
				if (resolve) return getRolerpcfromserver();
				return basicGetRolerpcfromserver();
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
			case M1Package.ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC:
				setPortservertorpc((PortComposantFourni)newValue);
				return;
			case M1Package.ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER:
				setRolerpcfromserver((RoleRequis)newValue);
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
			case M1Package.ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC:
				setPortservertorpc((PortComposantFourni)null);
				return;
			case M1Package.ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER:
				setRolerpcfromserver((RoleRequis)null);
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
			case M1Package.ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC:
				return portservertorpc != null;
			case M1Package.ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER:
				return rolerpcfromserver != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentServerToRPCImpl
