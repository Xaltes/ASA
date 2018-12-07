/**
 */
package M1.impl;

import M1.M1Package;

import aSA.RoleRequis;

import aSA.Attachment;
import aSA.PortComposantFourni;

import aSA.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment DBto SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentDBtoSQLImpl#getPortdbtosql <em>Portdbtosql</em>}</li>
 *   <li>{@link M1.impl.AttachmentDBtoSQLImpl#getRolesqlfromdb <em>Rolesqlfromdb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentDBtoSQLImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortdbtosql() <em>Portdbtosql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortdbtosql()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portdbtosql;

	/**
	 * The cached value of the '{@link #getRolesqlfromdb() <em>Rolesqlfromdb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqlfromdb()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis rolesqlfromdb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentDBtoSQLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_DBTO_SQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortdbtosql() {
		if (portdbtosql != null && ((EObject)portdbtosql).eIsProxy()) {
			InternalEObject oldPortdbtosql = (InternalEObject)portdbtosql;
			portdbtosql = (PortComposantFourni)eResolveProxy(oldPortdbtosql);
			if (portdbtosql != oldPortdbtosql) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_DBTO_SQL__PORTDBTOSQL, oldPortdbtosql, portdbtosql));
			}
		}
		return portdbtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortdbtosql() {
		return portdbtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortdbtosql(PortComposantFourni newPortdbtosql) {
		PortComposantFourni oldPortdbtosql = portdbtosql;
		portdbtosql = newPortdbtosql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_DBTO_SQL__PORTDBTOSQL, oldPortdbtosql, portdbtosql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getRolesqlfromdb() {
		if (rolesqlfromdb != null && ((EObject)rolesqlfromdb).eIsProxy()) {
			InternalEObject oldRolesqlfromdb = (InternalEObject)rolesqlfromdb;
			rolesqlfromdb = (RoleRequis)eResolveProxy(oldRolesqlfromdb);
			if (rolesqlfromdb != oldRolesqlfromdb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_DBTO_SQL__ROLESQLFROMDB, oldRolesqlfromdb, rolesqlfromdb));
			}
		}
		return rolesqlfromdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetRolesqlfromdb() {
		return rolesqlfromdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqlfromdb(RoleRequis newRolesqlfromdb) {
		RoleRequis oldRolesqlfromdb = rolesqlfromdb;
		rolesqlfromdb = newRolesqlfromdb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_DBTO_SQL__ROLESQLFROMDB, oldRolesqlfromdb, rolesqlfromdb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_DBTO_SQL__PORTDBTOSQL:
				if (resolve) return getPortdbtosql();
				return basicGetPortdbtosql();
			case M1Package.ATTACHMENT_DBTO_SQL__ROLESQLFROMDB:
				if (resolve) return getRolesqlfromdb();
				return basicGetRolesqlfromdb();
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
			case M1Package.ATTACHMENT_DBTO_SQL__PORTDBTOSQL:
				setPortdbtosql((PortComposantFourni)newValue);
				return;
			case M1Package.ATTACHMENT_DBTO_SQL__ROLESQLFROMDB:
				setRolesqlfromdb((RoleRequis)newValue);
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
			case M1Package.ATTACHMENT_DBTO_SQL__PORTDBTOSQL:
				setPortdbtosql((PortComposantFourni)null);
				return;
			case M1Package.ATTACHMENT_DBTO_SQL__ROLESQLFROMDB:
				setRolesqlfromdb((RoleRequis)null);
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
			case M1Package.ATTACHMENT_DBTO_SQL__PORTDBTOSQL:
				return portdbtosql != null;
			case M1Package.ATTACHMENT_DBTO_SQL__ROLESQLFROMDB:
				return rolesqlfromdb != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentDBtoSQLImpl
