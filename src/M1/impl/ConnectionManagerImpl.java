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
 * An implementation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.ConnectionManagerImpl#getPortsqltocm <em>Portsqltocm</em>}</li>
 *   <li>{@link M1.impl.ConnectionManagerImpl#getPortcmtosql <em>Portcmtosql</em>}</li>
 *   <li>{@link M1.impl.ConnectionManagerImpl#getPortbindingtocm <em>Portbindingtocm</em>}</li>
 *   <li>{@link M1.impl.ConnectionManagerImpl#getPortcmtobinding <em>Portcmtobinding</em>}</li>
 *   <li>{@link M1.impl.ConnectionManagerImpl#getPortcrtocm <em>Portcrtocm</em>}</li>
 *   <li>{@link M1.impl.ConnectionManagerImpl#getPortcmtocr <em>Portcmtocr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionManagerImpl extends ComposantSimpleImpl implements ComposantSimple {
	/**
	 * The cached value of the '{@link #getPortsqltocm() <em>Portsqltocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqltocm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqltocm;

	/**
	 * The cached value of the '{@link #getPortcmtosql() <em>Portcmtosql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcmtosql()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portcmtosql;

	/**
	 * The cached value of the '{@link #getPortbindingtocm() <em>Portbindingtocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtocm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portbindingtocm;

	/**
	 * The cached value of the '{@link #getPortcmtobinding() <em>Portcmtobinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcmtobinding()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portcmtobinding;

	/**
	 * The cached value of the '{@link #getPortcrtocm() <em>Portcrtocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcrtocm()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portcrtocm;

	/**
	 * The cached value of the '{@link #getPortcmtocr() <em>Portcmtocr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcmtocr()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portcmtocr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqltocm() {
		return portsqltocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortsqltocm(PortComposantRequis newPortsqltocm, NotificationChain msgs) {
		PortComposantRequis oldPortsqltocm = portsqltocm;
		portsqltocm = newPortsqltocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTSQLTOCM, oldPortsqltocm, newPortsqltocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqltocm(PortComposantRequis newPortsqltocm) {
		if (newPortsqltocm != portsqltocm) {
			NotificationChain msgs = null;
			if (portsqltocm != null)
				msgs = ((InternalEObject)portsqltocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTSQLTOCM, null, msgs);
			if (newPortsqltocm != null)
				msgs = ((InternalEObject)newPortsqltocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTSQLTOCM, null, msgs);
			msgs = basicSetPortsqltocm(newPortsqltocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTSQLTOCM, newPortsqltocm, newPortsqltocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortcmtosql() {
		return portcmtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortcmtosql(PortComposantFourni newPortcmtosql, NotificationChain msgs) {
		PortComposantFourni oldPortcmtosql = portcmtosql;
		portcmtosql = newPortcmtosql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCMTOSQL, oldPortcmtosql, newPortcmtosql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcmtosql(PortComposantFourni newPortcmtosql) {
		if (newPortcmtosql != portcmtosql) {
			NotificationChain msgs = null;
			if (portcmtosql != null)
				msgs = ((InternalEObject)portcmtosql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCMTOSQL, null, msgs);
			if (newPortcmtosql != null)
				msgs = ((InternalEObject)newPortcmtosql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCMTOSQL, null, msgs);
			msgs = basicSetPortcmtosql(newPortcmtosql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCMTOSQL, newPortcmtosql, newPortcmtosql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortbindingtocm() {
		return portbindingtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortbindingtocm(PortComposantRequis newPortbindingtocm, NotificationChain msgs) {
		PortComposantRequis oldPortbindingtocm = portbindingtocm;
		portbindingtocm = newPortbindingtocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM, oldPortbindingtocm, newPortbindingtocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortbindingtocm(PortComposantRequis newPortbindingtocm) {
		if (newPortbindingtocm != portbindingtocm) {
			NotificationChain msgs = null;
			if (portbindingtocm != null)
				msgs = ((InternalEObject)portbindingtocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM, null, msgs);
			if (newPortbindingtocm != null)
				msgs = ((InternalEObject)newPortbindingtocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM, null, msgs);
			msgs = basicSetPortbindingtocm(newPortbindingtocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM, newPortbindingtocm, newPortbindingtocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortcmtobinding() {
		return portcmtobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortcmtobinding(PortComposantFourni newPortcmtobinding, NotificationChain msgs) {
		PortComposantFourni oldPortcmtobinding = portcmtobinding;
		portcmtobinding = newPortcmtobinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCMTOBINDING, oldPortcmtobinding, newPortcmtobinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcmtobinding(PortComposantFourni newPortcmtobinding) {
		if (newPortcmtobinding != portcmtobinding) {
			NotificationChain msgs = null;
			if (portcmtobinding != null)
				msgs = ((InternalEObject)portcmtobinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCMTOBINDING, null, msgs);
			if (newPortcmtobinding != null)
				msgs = ((InternalEObject)newPortcmtobinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCMTOBINDING, null, msgs);
			msgs = basicSetPortcmtobinding(newPortcmtobinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCMTOBINDING, newPortcmtobinding, newPortcmtobinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortcrtocm() {
		return portcrtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortcrtocm(PortComposantRequis newPortcrtocm, NotificationChain msgs) {
		PortComposantRequis oldPortcrtocm = portcrtocm;
		portcrtocm = newPortcrtocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCRTOCM, oldPortcrtocm, newPortcrtocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcrtocm(PortComposantRequis newPortcrtocm) {
		if (newPortcrtocm != portcrtocm) {
			NotificationChain msgs = null;
			if (portcrtocm != null)
				msgs = ((InternalEObject)portcrtocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCRTOCM, null, msgs);
			if (newPortcrtocm != null)
				msgs = ((InternalEObject)newPortcrtocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCRTOCM, null, msgs);
			msgs = basicSetPortcrtocm(newPortcrtocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCRTOCM, newPortcrtocm, newPortcrtocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortcmtocr() {
		return portcmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortcmtocr(PortComposantFourni newPortcmtocr, NotificationChain msgs) {
		PortComposantFourni oldPortcmtocr = portcmtocr;
		portcmtocr = newPortcmtocr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCMTOCR, oldPortcmtocr, newPortcmtocr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortcmtocr(PortComposantFourni newPortcmtocr) {
		if (newPortcmtocr != portcmtocr) {
			NotificationChain msgs = null;
			if (portcmtocr != null)
				msgs = ((InternalEObject)portcmtocr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCMTOCR, null, msgs);
			if (newPortcmtocr != null)
				msgs = ((InternalEObject)newPortcmtocr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CONNECTION_MANAGER__PORTCMTOCR, null, msgs);
			msgs = basicSetPortcmtocr(newPortcmtocr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CONNECTION_MANAGER__PORTCMTOCR, newPortcmtocr, newPortcmtocr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.CONNECTION_MANAGER__PORTSQLTOCM:
				return basicSetPortsqltocm(null, msgs);
			case M1Package.CONNECTION_MANAGER__PORTCMTOSQL:
				return basicSetPortcmtosql(null, msgs);
			case M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM:
				return basicSetPortbindingtocm(null, msgs);
			case M1Package.CONNECTION_MANAGER__PORTCMTOBINDING:
				return basicSetPortcmtobinding(null, msgs);
			case M1Package.CONNECTION_MANAGER__PORTCRTOCM:
				return basicSetPortcrtocm(null, msgs);
			case M1Package.CONNECTION_MANAGER__PORTCMTOCR:
				return basicSetPortcmtocr(null, msgs);
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
			case M1Package.CONNECTION_MANAGER__PORTSQLTOCM:
				return getPortsqltocm();
			case M1Package.CONNECTION_MANAGER__PORTCMTOSQL:
				return getPortcmtosql();
			case M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM:
				return getPortbindingtocm();
			case M1Package.CONNECTION_MANAGER__PORTCMTOBINDING:
				return getPortcmtobinding();
			case M1Package.CONNECTION_MANAGER__PORTCRTOCM:
				return getPortcrtocm();
			case M1Package.CONNECTION_MANAGER__PORTCMTOCR:
				return getPortcmtocr();
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
			case M1Package.CONNECTION_MANAGER__PORTSQLTOCM:
				setPortsqltocm((PortComposantRequis)newValue);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCMTOSQL:
				setPortcmtosql((PortComposantFourni)newValue);
				return;
			case M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM:
				setPortbindingtocm((PortComposantRequis)newValue);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCMTOBINDING:
				setPortcmtobinding((PortComposantFourni)newValue);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCRTOCM:
				setPortcrtocm((PortComposantRequis)newValue);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCMTOCR:
				setPortcmtocr((PortComposantFourni)newValue);
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
			case M1Package.CONNECTION_MANAGER__PORTSQLTOCM:
				setPortsqltocm((PortComposantRequis)null);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCMTOSQL:
				setPortcmtosql((PortComposantFourni)null);
				return;
			case M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM:
				setPortbindingtocm((PortComposantRequis)null);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCMTOBINDING:
				setPortcmtobinding((PortComposantFourni)null);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCRTOCM:
				setPortcrtocm((PortComposantRequis)null);
				return;
			case M1Package.CONNECTION_MANAGER__PORTCMTOCR:
				setPortcmtocr((PortComposantFourni)null);
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
			case M1Package.CONNECTION_MANAGER__PORTSQLTOCM:
				return portsqltocm != null;
			case M1Package.CONNECTION_MANAGER__PORTCMTOSQL:
				return portcmtosql != null;
			case M1Package.CONNECTION_MANAGER__PORTBINDINGTOCM:
				return portbindingtocm != null;
			case M1Package.CONNECTION_MANAGER__PORTCMTOBINDING:
				return portcmtobinding != null;
			case M1Package.CONNECTION_MANAGER__PORTCRTOCM:
				return portcrtocm != null;
			case M1Package.CONNECTION_MANAGER__PORTCMTOCR:
				return portcmtocr != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionManagerImpl
