/**
 */
package M1.impl;

import M1.M1Package;

import aSA.ComposantSimple;
import aSA.PortComposantRequis;

import aSA.impl.PortComposantRequisImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port CRto SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.PortCRtoSMImpl#getSecuritymanager <em>Securitymanager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortCRtoSMImpl extends PortComposantRequisImpl implements PortComposantRequis {
	/**
	 * The cached value of the '{@link #getSecuritymanager() <em>Securitymanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanager()
	 * @generated
	 * @ordered
	 */
	protected ComposantSimple securitymanager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortCRtoSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.PORT_CRTO_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple getSecuritymanager() {
		if (securitymanager != null && ((EObject)securitymanager).eIsProxy()) {
			InternalEObject oldSecuritymanager = (InternalEObject)securitymanager;
			securitymanager = (ComposantSimple)eResolveProxy(oldSecuritymanager);
			if (securitymanager != oldSecuritymanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.PORT_CRTO_SM__SECURITYMANAGER, oldSecuritymanager, securitymanager));
			}
		}
		return securitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple basicGetSecuritymanager() {
		return securitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritymanager(ComposantSimple newSecuritymanager) {
		ComposantSimple oldSecuritymanager = securitymanager;
		securitymanager = newSecuritymanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.PORT_CRTO_SM__SECURITYMANAGER, oldSecuritymanager, securitymanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.PORT_CRTO_SM__SECURITYMANAGER:
				if (resolve) return getSecuritymanager();
				return basicGetSecuritymanager();
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
			case M1Package.PORT_CRTO_SM__SECURITYMANAGER:
				setSecuritymanager((ComposantSimple)newValue);
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
			case M1Package.PORT_CRTO_SM__SECURITYMANAGER:
				setSecuritymanager((ComposantSimple)null);
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
			case M1Package.PORT_CRTO_SM__SECURITYMANAGER:
				return securitymanager != null;
		}
		return super.eIsSet(featureID);
	}

} //PortCRtoSMImpl
