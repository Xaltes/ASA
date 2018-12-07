/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Glue;
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
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.GlueImpl#getTO <em>TO</em>}</li>
 *   <li>{@link aSA.impl.GlueImpl#getFROM <em>FROM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueImpl extends MinimalEObjectImpl.Container implements Glue {
	/**
	 * The cached value of the '{@link #getTO() <em>TO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTO()
	 * @generated
	 * @ordered
	 */
	protected RoleFourni to;

	/**
	 * The cached value of the '{@link #getFROM() <em>FROM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFROM()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni getTO() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTO = (InternalEObject)to;
			to = (RoleFourni)eResolveProxy(oldTO);
			if (to != oldTO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.GLUE__TO, oldTO, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni basicGetTO() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTO(RoleFourni newTO) {
		RoleFourni oldTO = to;
		to = newTO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.GLUE__TO, oldTO, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getFROM() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFROM = (InternalEObject)from;
			from = (RoleRequis)eResolveProxy(oldFROM);
			if (from != oldFROM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.GLUE__FROM, oldFROM, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetFROM() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFROM(RoleRequis newFROM) {
		RoleRequis oldFROM = from;
		from = newFROM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.GLUE__FROM, oldFROM, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis glueFunction(RoleFourni roleFourni) {
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
			case ASAPackage.GLUE__TO:
				if (resolve) return getTO();
				return basicGetTO();
			case ASAPackage.GLUE__FROM:
				if (resolve) return getFROM();
				return basicGetFROM();
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
			case ASAPackage.GLUE__TO:
				setTO((RoleFourni)newValue);
				return;
			case ASAPackage.GLUE__FROM:
				setFROM((RoleRequis)newValue);
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
			case ASAPackage.GLUE__TO:
				setTO((RoleFourni)null);
				return;
			case ASAPackage.GLUE__FROM:
				setFROM((RoleRequis)null);
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
			case ASAPackage.GLUE__TO:
				return to != null;
			case ASAPackage.GLUE__FROM:
				return from != null;
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
			case ASAPackage.GLUE___GLUE_FUNCTION__ROLEFOURNI:
				return glueFunction((RoleFourni)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GlueImpl
