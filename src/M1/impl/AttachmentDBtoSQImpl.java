/**
 */
package M1.impl;

import M1.M1Package;

import aSA.RoleFourni;

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
 * An implementation of the model object '<em><b>Attachment DBto SQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.AttachmentDBtoSQImpl#getPortdbtosq <em>Portdbtosq</em>}</li>
 *   <li>{@link M1.impl.AttachmentDBtoSQImpl#getRolesqfromdb <em>Rolesqfromdb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentDBtoSQImpl extends AttachmentImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPortdbtosq() <em>Portdbtosq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortdbtosq()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portdbtosq;

	/**
	 * The cached value of the '{@link #getRolesqfromdb() <em>Rolesqfromdb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesqfromdb()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni rolesqfromdb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentDBtoSQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.ATTACHMENT_DBTO_SQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortdbtosq() {
		if (portdbtosq != null && ((EObject)portdbtosq).eIsProxy()) {
			InternalEObject oldPortdbtosq = (InternalEObject)portdbtosq;
			portdbtosq = (PortComposantFourni)eResolveProxy(oldPortdbtosq);
			if (portdbtosq != oldPortdbtosq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_DBTO_SQ__PORTDBTOSQ, oldPortdbtosq, portdbtosq));
			}
		}
		return portdbtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortdbtosq() {
		return portdbtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortdbtosq(PortComposantFourni newPortdbtosq) {
		PortComposantFourni oldPortdbtosq = portdbtosq;
		portdbtosq = newPortdbtosq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_DBTO_SQ__PORTDBTOSQ, oldPortdbtosq, portdbtosq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getRolesqfromdb() {
		if (rolesqfromdb != null && ((EObject)rolesqfromdb).eIsProxy()) {
			InternalEObject oldRolesqfromdb = (InternalEObject)rolesqfromdb;
			rolesqfromdb = (RoleFourni)eResolveProxy(oldRolesqfromdb);
			if (rolesqfromdb != oldRolesqfromdb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.ATTACHMENT_DBTO_SQ__ROLESQFROMDB, oldRolesqfromdb, rolesqfromdb));
			}
		}
		return rolesqfromdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetRolesqfromdb() {
		return rolesqfromdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolesqfromdb(RoleFourni newRolesqfromdb) {
		RoleFourni oldRolesqfromdb = rolesqfromdb;
		rolesqfromdb = newRolesqfromdb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.ATTACHMENT_DBTO_SQ__ROLESQFROMDB, oldRolesqfromdb, rolesqfromdb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.ATTACHMENT_DBTO_SQ__PORTDBTOSQ:
				if (resolve) return getPortdbtosq();
				return basicGetPortdbtosq();
			case M1Package.ATTACHMENT_DBTO_SQ__ROLESQFROMDB:
				if (resolve) return getRolesqfromdb();
				return basicGetRolesqfromdb();
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
			case M1Package.ATTACHMENT_DBTO_SQ__PORTDBTOSQ:
				setPortdbtosq((PortComposantFourni)newValue);
				return;
			case M1Package.ATTACHMENT_DBTO_SQ__ROLESQFROMDB:
				setRolesqfromdb((RoleFourni)newValue);
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
			case M1Package.ATTACHMENT_DBTO_SQ__PORTDBTOSQ:
				setPortdbtosq((PortComposantFourni)null);
				return;
			case M1Package.ATTACHMENT_DBTO_SQ__ROLESQFROMDB:
				setRolesqfromdb((RoleFourni)null);
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
			case M1Package.ATTACHMENT_DBTO_SQ__PORTDBTOSQ:
				return portdbtosq != null;
			case M1Package.ATTACHMENT_DBTO_SQ__ROLESQFROMDB:
				return rolesqfromdb != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentDBtoSQImpl
