/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Binding;
import aSA.PortComposantRequis;
import aSA.PortConfigurationRequis;

import aSA.impl.BindingImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Server To CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.BindingServerToCMImpl#getPortbindingtocm <em>Portbindingtocm</em>}</li>
 *   <li>{@link M1.impl.BindingServerToCMImpl#getPortservertobinding <em>Portservertobinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingServerToCMImpl extends BindingImpl implements Binding {
	/**
	 * The cached value of the '{@link #getPortbindingtocm() <em>Portbindingtocm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtocm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portbindingtocm;

	/**
	 * The cached value of the '{@link #getPortservertobinding() <em>Portservertobinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortservertobinding()
	 * @generated
	 * @ordered
	 */
	protected PortConfigurationRequis portservertobinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingServerToCMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.BINDING_SERVER_TO_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortbindingtocm() {
		if (portbindingtocm != null && ((EObject)portbindingtocm).eIsProxy()) {
			InternalEObject oldPortbindingtocm = (InternalEObject)portbindingtocm;
			portbindingtocm = (PortComposantRequis)eResolveProxy(oldPortbindingtocm);
			if (portbindingtocm != oldPortbindingtocm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_SERVER_TO_CM__PORTBINDINGTOCM, oldPortbindingtocm, portbindingtocm));
			}
		}
		return portbindingtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis basicGetPortbindingtocm() {
		return portbindingtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortbindingtocm(PortComposantRequis newPortbindingtocm) {
		PortComposantRequis oldPortbindingtocm = portbindingtocm;
		portbindingtocm = newPortbindingtocm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_SERVER_TO_CM__PORTBINDINGTOCM, oldPortbindingtocm, portbindingtocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis getPortservertobinding() {
		if (portservertobinding != null && ((EObject)portservertobinding).eIsProxy()) {
			InternalEObject oldPortservertobinding = (InternalEObject)portservertobinding;
			portservertobinding = (PortConfigurationRequis)eResolveProxy(oldPortservertobinding);
			if (portservertobinding != oldPortservertobinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_SERVER_TO_CM__PORTSERVERTOBINDING, oldPortservertobinding, portservertobinding));
			}
		}
		return portservertobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis basicGetPortservertobinding() {
		return portservertobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortservertobinding(PortConfigurationRequis newPortservertobinding) {
		PortConfigurationRequis oldPortservertobinding = portservertobinding;
		portservertobinding = newPortservertobinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_SERVER_TO_CM__PORTSERVERTOBINDING, oldPortservertobinding, portservertobinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.BINDING_SERVER_TO_CM__PORTBINDINGTOCM:
				if (resolve) return getPortbindingtocm();
				return basicGetPortbindingtocm();
			case M1Package.BINDING_SERVER_TO_CM__PORTSERVERTOBINDING:
				if (resolve) return getPortservertobinding();
				return basicGetPortservertobinding();
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
			case M1Package.BINDING_SERVER_TO_CM__PORTBINDINGTOCM:
				setPortbindingtocm((PortComposantRequis)newValue);
				return;
			case M1Package.BINDING_SERVER_TO_CM__PORTSERVERTOBINDING:
				setPortservertobinding((PortConfigurationRequis)newValue);
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
			case M1Package.BINDING_SERVER_TO_CM__PORTBINDINGTOCM:
				setPortbindingtocm((PortComposantRequis)null);
				return;
			case M1Package.BINDING_SERVER_TO_CM__PORTSERVERTOBINDING:
				setPortservertobinding((PortConfigurationRequis)null);
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
			case M1Package.BINDING_SERVER_TO_CM__PORTBINDINGTOCM:
				return portbindingtocm != null;
			case M1Package.BINDING_SERVER_TO_CM__PORTSERVERTOBINDING:
				return portservertobinding != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingServerToCMImpl
