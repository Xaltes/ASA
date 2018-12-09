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
 * An implementation of the model object '<em><b>Attachment SQ Lto DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentSQLtoDBImpl#getPortsqltodb <em>Portsqltodb</em>}</li>
 *   <li>{@link M1.impl.AttachmentSQLtoDBImpl#getRolesqltodb <em>Rolesqltodb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentSQLtoDBImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortsqltodb() <em>Portsqltodb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqltodb()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqltodb;

	/**
	 * The cached value of the '{@link #getRolesqltodb() <em>Rolesqltodb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqltodb()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolesqltodb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentSQLtoDBImpl(PortSQLtoDBImpl portsqltodb2, RoleSQLfromCMImpl rolesqltodb2) {
		super();
		this.portsqltodb = portsqltodb2;
		this.rolesqltodb = rolesqltodb2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_SQ_LTO_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqltodb() {
		if (portsqltodb != null && ((EObject)portsqltodb).eIsProxy()) {
			InternalEObject oldPortsqltodb = (InternalEObject)portsqltodb;
			portsqltodb = (PortComposantRequis)eResolveProxy(oldPortsqltodb);
			if (portsqltodb != oldPortsqltodb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQ_LTO_DB__PORTSQLTODB, oldPortsqltodb, portsqltodb));
			}
		}
		return portsqltodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortsqltodb() {
		return portsqltodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqltodb(PortComposantRequis newPortsqltodb) {
		PortComposantRequis oldPortsqltodb = portsqltodb;
		portsqltodb = newPortsqltodb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQ_LTO_DB__PORTSQLTODB, oldPortsqltodb, portsqltodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqltodb() {
		if (rolesqltodb != null && ((EObject)rolesqltodb).eIsProxy()) {
			InternalEObject oldRolesqltodb = (InternalEObject)rolesqltodb;
			rolesqltodb = (RoleFourni)eResolveProxy(oldRolesqltodb);
			if (rolesqltodb != oldRolesqltodb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_SQ_LTO_DB__ROLESQLTODB, oldRolesqltodb, rolesqltodb));
			}
		}
		return rolesqltodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolesqltodb() {
		return rolesqltodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqltodb(RoleFourni newRolesqltodb) {
		RoleFourni oldRolesqltodb = rolesqltodb;
		rolesqltodb = newRolesqltodb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_SQ_LTO_DB__ROLESQLTODB, oldRolesqltodb, rolesqltodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_SQ_LTO_DB__PORTSQLTODB:
				if (resolve) return getPortsqltodb();
				return basicGetPortsqltodb();
			case M1Package.ATTACHMENT_SQ_LTO_DB__ROLESQLTODB:
				if (resolve) return getRolesqltodb();
				return basicGetRolesqltodb();
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
			case M1Package.ATTACHMENT_SQ_LTO_DB__PORTSQLTODB:
				setPortsqltodb((PortComposantRequis)newValue);
				return;
			case M1Package.ATTACHMENT_SQ_LTO_DB__ROLESQLTODB:
				setRolesqltodb((RoleFourni)newValue);
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
			case M1Package.ATTACHMENT_SQ_LTO_DB__PORTSQLTODB:
				setPortsqltodb((PortComposantRequis)null);
				return;
			case M1Package.ATTACHMENT_SQ_LTO_DB__ROLESQLTODB:
				setRolesqltodb((RoleFourni)null);
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
			case M1Package.ATTACHMENT_SQ_LTO_DB__PORTSQLTODB:
				return portsqltodb != null;
			case M1Package.ATTACHMENT_SQ_LTO_DB__ROLESQLTODB:
				return rolesqltodb != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentSQLtoDBImpl
