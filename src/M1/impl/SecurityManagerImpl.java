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
 *   <li>{@link M1.impl.SecurityManagerImpl#getPortsmtosq <em>Portsmtosq</em>}</li>
 *   <li>{@link M1.impl.SecurityManagerImpl#getPortsqtosm <em>Portsqtosm</em>}</li>
 *   <li>{@link M1.impl.SecurityManagerImpl#getPortcrtosm <em>Portcrtosm</em>}</li>
 *   <li>{@link M1.impl.SecurityManagerImpl#getPortsmtocr <em>Portsmtocr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityManagerImpl extends ComposantSimpleImpl implements ComposantSimple {
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
	 * The cached value of the '{@link #getPortcrtosm() <em>Portcrtosm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcrtosm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portcrtosm;

	/**
	 * The cached value of the '{@link #getPortsmtocr() <em>Portsmtocr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsmtocr()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portsmtocr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagerImpl(PortComposantFourni p1, PortComposantRequis p2, PortComposantRequis p3, PortComposantFourni p4) {
		super();
		this.portsmtosq = p1;
		this.portsqtosm = p2;
		this.portcrtosm = p3;
		this.portsmtocr = p4;
	}
	
	public boolean checkRights(String pseudo, String query) {		
		return pseudo.equals("Ophelie");
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
			//if (portsmtosq != null)
				//msgs = ((InternalEObject)portsmtosq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSMTOSQ, null, msgs);
			//if (newPortsmtosq != null)
				//msgs = ((InternalEObject)newPortsmtosq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSMTOSQ, null, msgs);
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
	public PortComposantRequis getPortcrtosm() {
		return portcrtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortcrtosm(PortComposantRequis newPortcrtosm, NotificationChain msgs) {
		PortComposantRequis oldPortcrtosm = portcrtosm;
		portcrtosm = newPortcrtosm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTCRTOSM, oldPortcrtosm, newPortcrtosm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcrtosm(PortComposantRequis newPortcrtosm) {
		if (newPortcrtosm != portcrtosm) {
			NotificationChain msgs = null;
			//if (portcrtosm != null)
				//msgs = ((InternalEObject)portcrtosm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTCRTOSM, null, msgs);
			//if (newPortcrtosm != null)
				//msgs = ((InternalEObject)newPortcrtosm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTCRTOSM, null, msgs);
			msgs = basicSetPortcrtosm(newPortcrtosm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTCRTOSM, newPortcrtosm, newPortcrtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortsmtocr() {
		return portsmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortsmtocr(PortComposantFourni newPortsmtocr, NotificationChain msgs) {
		PortComposantFourni oldPortsmtocr = portsmtocr;
		portsmtocr = newPortsmtocr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTSMTOCR, oldPortsmtocr, newPortsmtocr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsmtocr(PortComposantFourni newPortsmtocr) {
		if (newPortsmtocr != portsmtocr) {
			NotificationChain msgs = null;
			if (portsmtocr != null)
				msgs = ((InternalEObject)portsmtocr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSMTOCR, null, msgs);
			if (newPortsmtocr != null)
				msgs = ((InternalEObject)newPortsmtocr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SECURITY_MANAGER__PORTSMTOCR, null, msgs);
			msgs = basicSetPortsmtocr(newPortsmtocr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SECURITY_MANAGER__PORTSMTOCR, newPortsmtocr, newPortsmtocr));
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
			case M1Package.SECURITY_MANAGER__PORTCRTOSM:
				return basicSetPortcrtosm(null, msgs);
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				return basicSetPortsmtocr(null, msgs);
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
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				return getPortsmtosq();
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				return getPortsqtosm();
			case M1Package.SECURITY_MANAGER__PORTCRTOSM:
				return getPortcrtosm();
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				return getPortsmtocr();
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
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				setPortsmtosq((PortComposantFourni)newValue);
				return;
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				setPortsqtosm((PortComposantRequis)newValue);
				return;
			case M1Package.SECURITY_MANAGER__PORTCRTOSM:
				setPortcrtosm((PortComposantRequis)newValue);
				return;
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				setPortsmtocr((PortComposantFourni)newValue);
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
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				setPortsmtosq((PortComposantFourni)null);
				return;
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				setPortsqtosm((PortComposantRequis)null);
				return;
			case M1Package.SECURITY_MANAGER__PORTCRTOSM:
				setPortcrtosm((PortComposantRequis)null);
				return;
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				setPortsmtocr((PortComposantFourni)null);
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
			case M1Package.SECURITY_MANAGER__PORTSMTOSQ:
				return portsmtosq != null;
			case M1Package.SECURITY_MANAGER__PORTSQTOSM:
				return portsqtosm != null;
			case M1Package.SECURITY_MANAGER__PORTCRTOSM:
				return portcrtosm != null;
			case M1Package.SECURITY_MANAGER__PORTSMTOCR:
				return portsmtocr != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityManagerImpl
