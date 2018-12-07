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
 * An implementation of the model object '<em><b>Attachment SQto DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentSQtoDBImpl#getPortsqtodb <em>Portsqtodb</em>}</li>
 *   <li>{@link M1.impl.AttachmentSQtoDBImpl#getRolesqtodb <em>Rolesqtodb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentSQtoDBImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortsqtodb() <em>Portsqtodb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqtodb()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqtodb;

	/**
	 * The cached value of the '{@link #getRolesqtodb() <em>Rolesqtodb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqtodb()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolesqtodb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentSQtoDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_SQTO_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqtodb() {
		if (portsqtodb != null && ((EObject)portsqtodb).eIsProxy()) {
			InternalEObject oldPortsqtodb = (InternalEObject)portsqtodb;
			portsqtodb = (PortComposantRequis)eResolveProxy(oldPortsqtodb);
			if (portsqtodb != oldPortsqtodb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQTO_DB__PORTSQTODB, oldPortsqtodb, portsqtodb));
			}
		}
		return portsqtodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortsqtodb() {
		return portsqtodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqtodb(PortComposantRequis newPortsqtodb) {
		PortComposantRequis oldPortsqtodb = portsqtodb;
		portsqtodb = newPortsqtodb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQTO_DB__PORTSQTODB, oldPortsqtodb, portsqtodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqtodb() {
		if (rolesqtodb != null && ((EObject)rolesqtodb).eIsProxy()) {
			InternalEObject oldRolesqtodb = (InternalEObject)rolesqtodb;
			rolesqtodb = (RoleRequis)eResolveProxy(oldRolesqtodb);
			if (rolesqtodb != oldRolesqtodb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQTO_DB__ROLESQTODB, oldRolesqtodb, rolesqtodb));
			}
		}
		return rolesqtodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolesqtodb() {
		return rolesqtodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqtodb(RoleRequis newRolesqtodb) {
		RoleRequis oldRolesqtodb = rolesqtodb;
		rolesqtodb = newRolesqtodb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQTO_DB__ROLESQTODB, oldRolesqtodb, rolesqtodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_SQTO_DB__PORTSQTODB:
				if (resolve) return getPortsqtodb();
				return basicGetPortsqtodb();
			case M1Package.ATTACHMENT_SQTO_DB__ROLESQTODB:
				if (resolve) return getRolesqtodb();
				return basicGetRolesqtodb();
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
			case M1Package.ATTACHMENT_SQTO_DB__PORTSQTODB:
				setPortsqtodb((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_SQTO_DB__ROLESQTODB:
				setRolesqtodb((RoleRequis)newValue);
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
			case M1Package.ATTACHMENT_SQTO_DB__PORTSQTODB:
				setPortsqtodb((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_SQTO_DB__ROLESQTODB:
				setRolesqtodb((RoleRequis)null);
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
			case M1Package.ATTACHMENT_SQTO_DB__PORTSQTODB:
				return portsqtodb != null;
			case M1Package.ATTACHMENT_SQTO_DB__ROLESQTODB:
				return rolesqtodb != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentSQtoDBImpl
