/**
 */
package M1.impl;

import M1.M1Package;

import aSA.ComposantSimple;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;

import aSA.impl.ComposantSimpleImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.SecurityManagerImpl#getPortsmtocr <em>Portsmtocr</em>}</li>
 *   <li>{@link M1.impl.SecurityManagerImpl#getPortsmtosq <em>Portsmtosq</em>}</li>
 *   <li>{@link M1.impl.SecurityManagerImpl#getPortsqtosm <em>Portsqtosm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityManagerImpl extends ComposantSimpleImpl implements ComposantSimple {
	/**
	 * The cached value of the '{@link #getPortsmtocr() <em>Portsmtocr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsmtocr()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portsmtocr;

	/**
	 * The cached value of the '{@link #getPortsmtosq() <em>Portsmtosq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsmtosq()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portsmtosq;

	/**
	 * The cached value of the '{@link #getPortsqtosm() <em>Portsqtosm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqtosm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqtosm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.SECURITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortsmtocr() {
		if (portsmtocr != null && ((EObject)portsmtocr).eIsProxy()) {
			InternalEObject oldPortsmtocr = (InternalEObject)portsmtocr;
			portsmtocr = (PortComposantFourni)eResolveProxy(oldPortsmtocr);
			if (portsmtocr != oldPortsmtocr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.SECURITY_MANAGER__PORTSMTOCR, oldPortsmtocr, portsmtocr));
			}
		}
		return portsmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni basicGetPortsmtocr() {
		return portsmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsmtocr(PortComposantFourni newPortsmtocr) {
		PortComposantFourni oldPortsmtocr = portsmtocr;
		portsmtocr = newPortsmtocr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTSMTOCR, oldPortsmtocr, portsmtocr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortsmtosq() {
		return portsmtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortsmtosq(PortComposantFourni newPortsmtosq, NotificationChain msgs) {
		PortComposantFourni oldPortsmtosq = portsmtosq;
		portsmtosq = newPortsmtosq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTSMTOSQ, oldPortsmtosq, newPortsmtosq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsmtosq(PortComposantFourni newPortsmtosq) {
		if (newPortsmtosq != portsmtosq) {
			NotificationChain msgs = null;
			if (portsmtosq != null)
				msgs = ((InternalEObject)portsmtosq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSMTOSQ, null, msgs);
			if (newPortsmtosq != null)
				msgs = ((InternalEObject)newPortsmtosq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSMTOSQ, null, msgs);
			msgs = basicSetPortsmtosq(newPortsmtosq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTSMTOSQ, newPortsmtosq, newPortsmtosq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqtosm() {
		return portsqtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortsqtosm(PortComposantRequis newPortsqtosm, NotificationChain msgs) {
		PortComposantRequis oldPortsqtosm = portsqtosm;
		portsqtosm = newPortsqtosm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTSQTOSM, oldPortsqtosm, newPortsqtosm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqtosm(PortComposantRequis newPortsqtosm) {
		if (newPortsqtosm != portsqtosm) {
			NotificationChain msgs = null;
			if (portsqtosm != null)
				msgs = ((InternalEObject)portsqtosm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSQTOSM, null, msgs);
			if (newPortsqtosm != null)
				msgs = ((InternalEObject)newPortsqtosm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSQTOSM, null, msgs);
			msgs = basicSetPortsqtosm(newPortsqtosm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTSQTOSM, newPortsqtosm, newPortsqtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				return basicSetPortsmtosq(null, msgs);
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				return basicSetPortsqtosm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				if (resolve) return getPortsmtocr();
				return basicGetPortsmtocr();
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				return getPortsmtosq();
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				return getPortsqtosm();
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
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				setPortsmtocr((PortComposantFourni)newValue);
				return;
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				setPortsmtosq((PortComposantFourni)newValue);
				return;
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				setPortsqtosm((PortComposantRequis)newValue);
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
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				setPortsmtocr((PortComposantFourni)null);
				return;
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				setPortsmtosq((PortComposantFourni)null);
				return;
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				setPortsqtosm((PortComposantRequis)null);
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
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				return portsmtocr != null;
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				return portsmtosq != null;
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				return portsqtosm != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityManagerImpl
