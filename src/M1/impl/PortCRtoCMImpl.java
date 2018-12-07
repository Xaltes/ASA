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
 * An implementation of the model object '<em><b>Port CRto CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.PortCRtoCMImpl#getConnectionmanager <em>Connectionmanager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortCRtoCMImpl extends PortComposantRequisImpl implements PortComposantRequis {
	/**
	 * The cached value of the '{@link #getConnectionmanager() <em>Connectionmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionmanager()
	 * @generated
	 * @ordered
	 */
	protected ComposantSimple connectionmanager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortCRtoCMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.PORT_CRTO_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple getConnectionmanager() {
		if (connectionmanager != null && ((EObject)connectionmanager).eIsProxy()) {
			InternalEObject oldConnectionmanager = (InternalEObject)connectionmanager;
			connectionmanager = (ComposantSimple)eResolveProxy(oldConnectionmanager);
			if (connectionmanager != oldConnectionmanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.PORT_CRTO_CM__CONNECTIONMANAGER, oldConnectionmanager, connectionmanager));
			}
		}
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple basicGetConnectionmanager() {
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionmanager(ComposantSimple newConnectionmanager) {
		ComposantSimple oldConnectionmanager = connectionmanager;
		connectionmanager = newConnectionmanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.PORT_CRTO_CM__CONNECTIONMANAGER, oldConnectionmanager, connectionmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.PORT_CRTO_CM__CONNECTIONMANAGER:
				if (resolve) return getConnectionmanager();
				return basicGetConnectionmanager();
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
			case M1Package.PORT_CRTO_CM__CONNECTIONMANAGER:
				setConnectionmanager((ComposantSimple)newValue);
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
			case M1Package.PORT_CRTO_CM__CONNECTIONMANAGER:
				setConnectionmanager((ComposantSimple)null);
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
			case M1Package.PORT_CRTO_CM__CONNECTIONMANAGER:
				return connectionmanager != null;
		}
		return super.eIsSet(featureID);
	}

} //PortCRtoCMImpl
