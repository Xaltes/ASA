/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Attachment;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.RoleFourni;
import aSA.RoleRequis;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.AttachmentImpl#getFROM_2 <em>FROM 2</em>}</li>
 *   <li>{@link aSA.impl.AttachmentImpl#getTO_1 <em>TO 1</em>}</li>
 *   <li>{@link aSA.impl.AttachmentImpl#getFROM_1 <em>FROM 1</em>}</li>
 *   <li>{@link aSA.impl.AttachmentImpl#getTO_2 <em>TO 2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentImpl extends MinimalEObjectImpl.Container implements Attachment {
	/**
	 * The cached value of the '{@link #getFROM_2() <em>FROM 2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROM_2()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni froM_2;

	/**
	 * The cached value of the '{@link #getTO_1() <em>TO 1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTO_1()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis tO_1;

	/**
	 * The cached value of the '{@link #getFROM_1() <em>FROM 1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROM_1()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni froM_1;

	/**
	 * The cached value of the '{@link #getTO_2() <em>TO 2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTO_2()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis tO_2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getFROM_2() {
		if (froM_2 != null && froM_2.eIsProxy()) {
			InternalEObject oldFROM_2 = (InternalEObject)froM_2;
			froM_2 = (RoleFourni)eResolveProxy(oldFROM_2);
			if (froM_2 != oldFROM_2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.ATTACHMENT__FROM_2, oldFROM_2, froM_2));
			}
		}
		return froM_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetFROM_2() {
		return froM_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFROM_2(RoleFourni newFROM_2) {
		RoleFourni oldFROM_2 = froM_2;
		froM_2 = newFROM_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.ATTACHMENT__FROM_2, oldFROM_2, froM_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getTO_1() {
		if (tO_1 != null && tO_1.eIsProxy()) {
			InternalEObject oldTO_1 = (InternalEObject)tO_1;
			tO_1 = (RoleRequis)eResolveProxy(oldTO_1);
			if (tO_1 != oldTO_1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.ATTACHMENT__TO_1, oldTO_1, tO_1));
			}
		}
		return tO_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetTO_1() {
		return tO_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTO_1(RoleRequis newTO_1) {
		RoleRequis oldTO_1 = tO_1;
		tO_1 = newTO_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.ATTACHMENT__TO_1, oldTO_1, tO_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getFROM_1() {
		if (froM_1 != null && froM_1.eIsProxy()) {
			InternalEObject oldFROM_1 = (InternalEObject)froM_1;
			froM_1 = (PortComposantFourni)eResolveProxy(oldFROM_1);
			if (froM_1 != oldFROM_1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.ATTACHMENT__FROM_1, oldFROM_1, froM_1));
			}
		}
		return froM_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetFROM_1() {
		return froM_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFROM_1(PortComposantFourni newFROM_1) {
		PortComposantFourni oldFROM_1 = froM_1;
		froM_1 = newFROM_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.ATTACHMENT__FROM_1, oldFROM_1, froM_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getTO_2() {
		if (tO_2 != null && tO_2.eIsProxy()) {
			InternalEObject oldTO_2 = (InternalEObject)tO_2;
			tO_2 = (PortComposantRequis)eResolveProxy(oldTO_2);
			if (tO_2 != oldTO_2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.ATTACHMENT__TO_2, oldTO_2, tO_2));
			}
		}
		return tO_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetTO_2() {
		return tO_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTO_2(PortComposantRequis newTO_2) {
		PortComposantRequis oldTO_2 = tO_2;
		tO_2 = newTO_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.ATTACHMENT__TO_2, oldTO_2, tO_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public RoleRequis attachPortToRole(PortComposantFourni port) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis attachRoleToPort(RoleFourni role) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASAPackage.ATTACHMENT__FROM_2:
				if (resolve) return getFROM_2();
				return basicGetFROM_2();
			case ASAPackage.ATTACHMENT__TO_1:
				if (resolve) return getTO_1();
				return basicGetTO_1();
			case ASAPackage.ATTACHMENT__FROM_1:
				if (resolve) return getFROM_1();
				return basicGetFROM_1();
			case ASAPackage.ATTACHMENT__TO_2:
				if (resolve) return getTO_2();
				return basicGetTO_2();
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
			case ASAPackage.ATTACHMENT__FROM_2:
				setFROM_2((RoleFourni)newValue);
				return;
			case ASAPackage.ATTACHMENT__TO_1:
				setTO_1((RoleRequis)newValue);
				return;
			case ASAPackage.ATTACHMENT__FROM_1:
				setFROM_1((PortComposantFourni)newValue);
				return;
			case ASAPackage.ATTACHMENT__TO_2:
				setTO_2((PortComposantRequis)newValue);
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
			case ASAPackage.ATTACHMENT__FROM_2:
				setFROM_2((RoleFourni)null);
				return;
			case ASAPackage.ATTACHMENT__TO_1:
				setTO_1((RoleRequis)null);
				return;
			case ASAPackage.ATTACHMENT__FROM_1:
				setFROM_1((PortComposantFourni)null);
				return;
			case ASAPackage.ATTACHMENT__TO_2:
				setTO_2((PortComposantRequis)null);
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
			case ASAPackage.ATTACHMENT__FROM_2:
				return froM_2 != null;
			case ASAPackage.ATTACHMENT__TO_1:
				return tO_1 != null;
			case ASAPackage.ATTACHMENT__FROM_1:
				return froM_1 != null;
			case ASAPackage.ATTACHMENT__TO_2:
				return tO_2 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI:
				return attachPortToRole((PortComposantFourni)arguments.get(0));
			case ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI:
				return attachRoleToPort((RoleFourni)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttachmentImpl
