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
 * An implementation of the model object '<em><b>Attachment CMto SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentCMtoSQLImpl#getPortcmtosql <em>Portcmtosql</em>}</li>
 *   <li>{@link M1.impl.AttachmentCMtoSQLImpl#getRolesqlfromcm <em>Rolesqlfromcm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentCMtoSQLImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortcmtosql() <em>Portcmtosql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcmtosql()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portcmtosql;

	/**
	 * The cached value of the '{@link #getRolesqlfromcm() <em>Rolesqlfromcm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqlfromcm()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolesqlfromcm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentCMtoSQLImpl(PortComposantFourni p, RoleRequis r) {
		super();
		this.portcmtosql = p;
		this.rolesqlfromcm = r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_CMTO_SQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortcmtosql() {
		if (portcmtosql != null && ((EObject)portcmtosql).eIsProxy()) {
			InternalEObject oldPortcmtosql = (InternalEObject)portcmtosql;
			portcmtosql = (PortComposantFourni)eResolveProxy(oldPortcmtosql);
			if (portcmtosql != oldPortcmtosql) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CMTO_SQL__PORTCMTOSQL, oldPortcmtosql, portcmtosql));
			}
		}
		return portcmtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortcmtosql() {
		return portcmtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcmtosql(PortComposantFourni newPortcmtosql) {
		PortComposantFourni oldPortcmtosql = portcmtosql;
		portcmtosql = newPortcmtosql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CMTO_SQL__PORTCMTOSQL, oldPortcmtosql, portcmtosql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqlfromcm() {
		if (rolesqlfromcm != null && ((EObject)rolesqlfromcm).eIsProxy()) {
			InternalEObject oldRolesqlfromcm = (InternalEObject)rolesqlfromcm;
			rolesqlfromcm = (RoleRequis)eResolveProxy(oldRolesqlfromcm);
			if (rolesqlfromcm != oldRolesqlfromcm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_CMTO_SQL__ROLESQLFROMCM, oldRolesqlfromcm, rolesqlfromcm));
			}
		}
		return rolesqlfromcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolesqlfromcm() {
		return rolesqlfromcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqlfromcm(RoleRequis newRolesqlfromcm) {
		RoleRequis oldRolesqlfromcm = rolesqlfromcm;
		rolesqlfromcm = newRolesqlfromcm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_CMTO_SQL__ROLESQLFROMCM, oldRolesqlfromcm, rolesqlfromcm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_CMTO_SQL__PORTCMTOSQL:
				if (resolve) return getPortcmtosql();
				return basicGetPortcmtosql();
			case M1Package.ATTACHMENT_CMTO_SQL__ROLESQLFROMCM:
				if (resolve) return getRolesqlfromcm();
				return basicGetRolesqlfromcm();
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
			case M1Package.ATTACHMENT_CMTO_SQL__PORTCMTOSQL:
				setPortcmtosql((PortComposantFourni)newValue);
				return;
			case M1Package.ATTACHMENT_CMTO_SQL__ROLESQLFROMCM:
				setRolesqlfromcm((RoleRequis)newValue);
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
			case M1Package.ATTACHMENT_CMTO_SQL__PORTCMTOSQL:
				setPortcmtosql((PortComposantFourni)null);
				return;
			case M1Package.ATTACHMENT_CMTO_SQL__ROLESQLFROMCM:
				setRolesqlfromcm((RoleRequis)null);
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
			case M1Package.ATTACHMENT_CMTO_SQL__PORTCMTOSQL:
				return portcmtosql != null;
			case M1Package.ATTACHMENT_CMTO_SQL__ROLESQLFROMCM:
				return rolesqlfromcm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentCMtoSQLImpl
