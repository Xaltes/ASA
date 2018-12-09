/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Binding;
import aSA.PortComposantFourni;
import aSA.PortConfigurationFourni;

import aSA.impl.BindingImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding CMto Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.BindingCMtoServerImpl#getPortbindingtoserver <em>Portbindingtoserver</em>}</li>
 *   <li>{@link M1.impl.BindingCMtoServerImpl#getPortcmtobinding <em>Portcmtobinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingCMtoServerImpl extends BindingImpl implements Binding {
	/**
	 * The cached value of the '{@link #getPortbindingtoserver() <em>Portbindingtoserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtoserver()
	 * @generated
	 * @ordered
	 */
	protected PortConfigurationFourni portbindingtoserver;

	/**
	 * The cached value of the '{@link #getPortcmtobinding() <em>Portcmtobinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcmtobinding()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portcmtobinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingCMtoServerImpl(PortComposantFourni p1, PortConfigurationFourni p2) {
		super();
		this.portbindingtoserver = p2;
		this.portcmtobinding = p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.BINDING_CMTO_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni getPortbindingtoserver() {
		if (portbindingtoserver != null && ((EObject)portbindingtoserver).eIsProxy()) {
			InternalEObject oldPortbindingtoserver = (InternalEObject)portbindingtoserver;
			portbindingtoserver = (PortConfigurationFourni)eResolveProxy(oldPortbindingtoserver);
			if (portbindingtoserver != oldPortbindingtoserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_CMTO_SERVER__PORTBINDINGTOSERVER, oldPortbindingtoserver, portbindingtoserver));
			}
		}
		return portbindingtoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni basicGetPortbindingtoserver() {
		return portbindingtoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortbindingtoserver(PortConfigurationFourni newPortbindingtoserver) {
		PortConfigurationFourni oldPortbindingtoserver = portbindingtoserver;
		portbindingtoserver = newPortbindingtoserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_CMTO_SERVER__PORTBINDINGTOSERVER, oldPortbindingtoserver, portbindingtoserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortcmtobinding() {
		if (portcmtobinding != null && ((EObject)portcmtobinding).eIsProxy()) {
			InternalEObject oldPortcmtobinding = (InternalEObject)portcmtobinding;
			portcmtobinding = (PortComposantFourni)eResolveProxy(oldPortcmtobinding);
			if (portcmtobinding != oldPortcmtobinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.BINDING_CMTO_SERVER__PORTCMTOBINDING, oldPortcmtobinding, portcmtobinding));
			}
		}
		return portcmtobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortcmtobinding() {
		return portcmtobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcmtobinding(PortComposantFourni newPortcmtobinding) {
		PortComposantFourni oldPortcmtobinding = portcmtobinding;
		portcmtobinding = newPortcmtobinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.BINDING_CMTO_SERVER__PORTCMTOBINDING, oldPortcmtobinding, portcmtobinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.BINDING_CMTO_SERVER__PORTBINDINGTOSERVER:
				if (resolve) return getPortbindingtoserver();
				return basicGetPortbindingtoserver();
			case M1Package.BINDING_CMTO_SERVER__PORTCMTOBINDING:
				if (resolve) return getPortcmtobinding();
				return basicGetPortcmtobinding();
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
			case M1Package.BINDING_CMTO_SERVER__PORTBINDINGTOSERVER:
				setPortbindingtoserver((PortConfigurationFourni)newValue);
				return;
			case M1Package.BINDING_CMTO_SERVER__PORTCMTOBINDING:
				setPortcmtobinding((PortComposantFourni)newValue);
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
			case M1Package.BINDING_CMTO_SERVER__PORTBINDINGTOSERVER:
				setPortbindingtoserver((PortConfigurationFourni)null);
				return;
			case M1Package.BINDING_CMTO_SERVER__PORTCMTOBINDING:
				setPortcmtobinding((PortComposantFourni)null);
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
			case M1Package.BINDING_CMTO_SERVER__PORTBINDINGTOSERVER:
				return portbindingtoserver != null;
			case M1Package.BINDING_CMTO_SERVER__PORTCMTOBINDING:
				return portcmtobinding != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingCMtoServerImpl
