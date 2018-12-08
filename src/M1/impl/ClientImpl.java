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
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.ClientImpl#getId <em>Id</em>}</li>
 *   <li>{@link M1.impl.ClientImpl#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link M1.impl.ClientImpl#getPortrpctoclient <em>Portrpctoclient</em>}</li>
 *   <li>{@link M1.impl.ClientImpl#getPortclienttorpc <em>Portclienttorpc</em>}</li>
 *   <li>{@link M1.impl.ClientImpl#getPortclienttobinding <em>Portclienttobinding</em>}</li>
 *   <li>{@link M1.impl.ClientImpl#getPortbindingtoclient <em>Portbindingtoclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends ComposantSimpleImpl implements ComposantSimple {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected String pseudo = PSEUDO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortrpctoclient() <em>Portrpctoclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrpctoclient()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portrpctoclient;

	/**
	 * The cached value of the '{@link #getPortclienttorpc() <em>Portclienttorpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortclienttorpc()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portclienttorpc;

	/**
	 * The cached value of the '{@link #getPortclienttobinding() <em>Portclienttobinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortclienttobinding()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portclienttobinding;

	/**
	 * The cached value of the '{@link #getPortbindingtoclient() <em>Portbindingtoclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtoclient()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portbindingtoclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudo(String newPseudo) {
		String oldPseudo = pseudo;
		pseudo = newPseudo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortrpctoclient() {
		return portrpctoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortrpctoclient(PortComposantRequis newPortrpctoclient, NotificationChain msgs) {
		PortComposantRequis oldPortrpctoclient = portrpctoclient;
		portrpctoclient = newPortrpctoclient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTRPCTOCLIENT, oldPortrpctoclient, newPortrpctoclient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrpctoclient(PortComposantRequis newPortrpctoclient) {
		if (newPortrpctoclient != portrpctoclient) {
			NotificationChain msgs = null;
			if (portrpctoclient != null)
				msgs = ((InternalEObject)portrpctoclient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTRPCTOCLIENT, null, msgs);
			if (newPortrpctoclient != null)
				msgs = ((InternalEObject)newPortrpctoclient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTRPCTOCLIENT, null, msgs);
			msgs = basicSetPortrpctoclient(newPortrpctoclient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTRPCTOCLIENT, newPortrpctoclient, newPortrpctoclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortclienttorpc() {
		return portclienttorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortclienttorpc(PortComposantFourni newPortclienttorpc, NotificationChain msgs) {
		PortComposantFourni oldPortclienttorpc = portclienttorpc;
		portclienttorpc = newPortclienttorpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTCLIENTTORPC, oldPortclienttorpc, newPortclienttorpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortclienttorpc(PortComposantFourni newPortclienttorpc) {
		if (newPortclienttorpc != portclienttorpc) {
			NotificationChain msgs = null;
			if (portclienttorpc != null)
				msgs = ((InternalEObject)portclienttorpc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTCLIENTTORPC, null, msgs);
			if (newPortclienttorpc != null)
				msgs = ((InternalEObject)newPortclienttorpc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTCLIENTTORPC, null, msgs);
			msgs = basicSetPortclienttorpc(newPortclienttorpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTCLIENTTORPC, newPortclienttorpc, newPortclienttorpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortclienttobinding() {
		return portclienttobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortclienttobinding(PortComposantFourni newPortclienttobinding, NotificationChain msgs) {
		PortComposantFourni oldPortclienttobinding = portclienttobinding;
		portclienttobinding = newPortclienttobinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTCLIENTTOBINDING, oldPortclienttobinding, newPortclienttobinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortclienttobinding(PortComposantFourni newPortclienttobinding) {
		if (newPortclienttobinding != portclienttobinding) {
			NotificationChain msgs = null;
			if (portclienttobinding != null)
				msgs = ((InternalEObject)portclienttobinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTCLIENTTOBINDING, null, msgs);
			if (newPortclienttobinding != null)
				msgs = ((InternalEObject)newPortclienttobinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTCLIENTTOBINDING, null, msgs);
			msgs = basicSetPortclienttobinding(newPortclienttobinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTCLIENTTOBINDING, newPortclienttobinding, newPortclienttobinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortbindingtoclient() {
		return portbindingtoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortbindingtoclient(PortComposantRequis newPortbindingtoclient, NotificationChain msgs) {
		PortComposantRequis oldPortbindingtoclient = portbindingtoclient;
		portbindingtoclient = newPortbindingtoclient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTBINDINGTOCLIENT, oldPortbindingtoclient, newPortbindingtoclient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortbindingtoclient(PortComposantRequis newPortbindingtoclient) {
		if (newPortbindingtoclient != portbindingtoclient) {
			NotificationChain msgs = null;
			if (portbindingtoclient != null)
				msgs = ((InternalEObject)portbindingtoclient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTBINDINGTOCLIENT, null, msgs);
			if (newPortbindingtoclient != null)
				msgs = ((InternalEObject)newPortbindingtoclient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.CLIENT__PORTBINDINGTOCLIENT, null, msgs);
			msgs = basicSetPortbindingtoclient(newPortbindingtoclient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.CLIENT__PORTBINDINGTOCLIENT, newPortbindingtoclient, newPortbindingtoclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.CLIENT__PORTRPCTOCLIENT:
				return basicSetPortrpctoclient(null, msgs);
			case M1Package.CLIENT__PORTCLIENTTORPC:
				return basicSetPortclienttorpc(null, msgs);
			case M1Package.CLIENT__PORTCLIENTTOBINDING:
				return basicSetPortclienttobinding(null, msgs);
			case M1Package.CLIENT__PORTBINDINGTOCLIENT:
				return basicSetPortbindingtoclient(null, msgs);
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
			case M1Package.CLIENT__ID:
				return getId();
			case M1Package.CLIENT__PSEUDO:
				return getPseudo();
			case M1Package.CLIENT__PORTRPCTOCLIENT:
				return getPortrpctoclient();
			case M1Package.CLIENT__PORTCLIENTTORPC:
				return getPortclienttorpc();
			case M1Package.CLIENT__PORTCLIENTTOBINDING:
				return getPortclienttobinding();
			case M1Package.CLIENT__PORTBINDINGTOCLIENT:
				return getPortbindingtoclient();
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
			case M1Package.CLIENT__ID:
				setId((String)newValue);
				return;
			case M1Package.CLIENT__PSEUDO:
				setPseudo((String)newValue);
				return;
			case M1Package.CLIENT__PORTRPCTOCLIENT:
				setPortrpctoclient((PortComposantRequis)newValue);
				return;
			case M1Package.CLIENT__PORTCLIENTTORPC:
				setPortclienttorpc((PortComposantFourni)newValue);
				return;
			case M1Package.CLIENT__PORTCLIENTTOBINDING:
				setPortclienttobinding((PortComposantFourni)newValue);
				return;
			case M1Package.CLIENT__PORTBINDINGTOCLIENT:
				setPortbindingtoclient((PortComposantRequis)newValue);
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
			case M1Package.CLIENT__ID:
				setId(ID_EDEFAULT);
				return;
			case M1Package.CLIENT__PSEUDO:
				setPseudo(PSEUDO_EDEFAULT);
				return;
			case M1Package.CLIENT__PORTRPCTOCLIENT:
				setPortrpctoclient((PortComposantRequis)null);
				return;
			case M1Package.CLIENT__PORTCLIENTTORPC:
				setPortclienttorpc((PortComposantFourni)null);
				return;
			case M1Package.CLIENT__PORTCLIENTTOBINDING:
				setPortclienttobinding((PortComposantFourni)null);
				return;
			case M1Package.CLIENT__PORTBINDINGTOCLIENT:
				setPortbindingtoclient((PortComposantRequis)null);
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
			case M1Package.CLIENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case M1Package.CLIENT__PSEUDO:
				return PSEUDO_EDEFAULT == null ? pseudo != null : !PSEUDO_EDEFAULT.equals(pseudo);
			case M1Package.CLIENT__PORTRPCTOCLIENT:
				return portrpctoclient != null;
			case M1Package.CLIENT__PORTCLIENTTORPC:
				return portclienttorpc != null;
			case M1Package.CLIENT__PORTCLIENTTOBINDING:
				return portclienttobinding != null;
			case M1Package.CLIENT__PORTBINDINGTOCLIENT:
				return portbindingtoclient != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", pseudo: ");
		result.append(pseudo);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
