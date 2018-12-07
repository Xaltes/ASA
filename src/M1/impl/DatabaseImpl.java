/**
 */
package M1.impl;

import M1.M1Package;

import aSA.ComposantSimple;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;

import aSA.impl.ComposantSimpleImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.DatabaseImpl#getPortdbtosql <em>Portdbtosql</em>}</li>
 *   <li>{@link M1.impl.DatabaseImpl#getPortsqltodb <em>Portsqltodb</em>}</li>
 *   <li>{@link M1.impl.DatabaseImpl#getPortdbtosq <em>Portdbtosq</em>}</li>
 *   <li>{@link M1.impl.DatabaseImpl#getPortsqtodb <em>Portsqtodb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends ComposantSimpleImpl implements ComposantSimple {
	private static final String dbPath = "../database.json";
	private BufferedWriter jsonWritter;
	private BufferedReader jsonReader;
	private JsonObject data;
	private Gson gson;
	
	/**
	 * The cached value of the '{@link #getPortdbtosql() <em>Portdbtosql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortdbtosql()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portdbtosql;

	/**
	 * The cached value of the '{@link #getPortsqltodb() <em>Portsqltodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqltodb()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqltodb;

	/**
	 * The cached value of the '{@link #getPortdbtosq() <em>Portdbtosq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortdbtosq()
	 * @generated
	 * @ordered
	 */
	protected PortComposantFourni portdbtosq;

	/**
	 * The cached value of the '{@link #getPortsqtodb() <em>Portsqtodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsqtodb()
	 * @generated
	 * @ordered
	 */
	protected PortComposantRequis portsqtodb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
		JsonParser parser = new JsonParser();
		this.data = parser.parse(this.jsonReader).getAsJsonObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortdbtosql() {
		return portdbtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortdbtosql(PortComposantFourni newPortdbtosql, NotificationChain msgs) {
		PortComposantFourni oldPortdbtosql = portdbtosql;
		portdbtosql = newPortdbtosql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTDBTOSQL, oldPortdbtosql, newPortdbtosql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortdbtosql(PortComposantFourni newPortdbtosql) {
		if (newPortdbtosql != portdbtosql) {
			NotificationChain msgs = null;
			if (portdbtosql != null)
				msgs = ((InternalEObject)portdbtosql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTDBTOSQL, null, msgs);
			if (newPortdbtosql != null)
				msgs = ((InternalEObject)newPortdbtosql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTDBTOSQL, null, msgs);
			msgs = basicSetPortdbtosql(newPortdbtosql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTDBTOSQL, newPortdbtosql, newPortdbtosql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqltodb() {
		return portsqltodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortsqltodb(PortComposantRequis newPortsqltodb, NotificationChain msgs) {
		PortComposantRequis oldPortsqltodb = portsqltodb;
		portsqltodb = newPortsqltodb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTSQLTODB, oldPortsqltodb, newPortsqltodb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqltodb(PortComposantRequis newPortsqltodb) {
		if (newPortsqltodb != portsqltodb) {
			NotificationChain msgs = null;
			if (portsqltodb != null)
				msgs = ((InternalEObject)portsqltodb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTSQLTODB, null, msgs);
			if (newPortsqltodb != null)
				msgs = ((InternalEObject)newPortsqltodb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTSQLTODB, null, msgs);
			msgs = basicSetPortsqltodb(newPortsqltodb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTSQLTODB, newPortsqltodb, newPortsqltodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni getPortdbtosq() {
		return portdbtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortdbtosq(PortComposantFourni newPortdbtosq, NotificationChain msgs) {
		PortComposantFourni oldPortdbtosq = portdbtosq;
		portdbtosq = newPortdbtosq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTDBTOSQ, oldPortdbtosq, newPortdbtosq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortdbtosq(PortComposantFourni newPortdbtosq) {
		if (newPortdbtosq != portdbtosq) {
			NotificationChain msgs = null;
			if (portdbtosq != null)
				msgs = ((InternalEObject)portdbtosq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTDBTOSQ, null, msgs);
			if (newPortdbtosq != null)
				msgs = ((InternalEObject)newPortdbtosq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTDBTOSQ, null, msgs);
			msgs = basicSetPortdbtosq(newPortdbtosq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTDBTOSQ, newPortdbtosq, newPortdbtosq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis getPortsqtodb() {
		return portsqtodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortsqtodb(PortComposantRequis newPortsqtodb, NotificationChain msgs) {
		PortComposantRequis oldPortsqtodb = portsqtodb;
		portsqtodb = newPortsqtodb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTSQTODB, oldPortsqtodb, newPortsqtodb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortsqtodb(PortComposantRequis newPortsqtodb) {
		if (newPortsqtodb != portsqtodb) {
			NotificationChain msgs = null;
			if (portsqtodb != null)
				msgs = ((InternalEObject)portsqtodb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTSQTODB, null, msgs);
			if (newPortsqtodb != null)
				msgs = ((InternalEObject)newPortsqtodb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.DATABASE__PORTSQTODB, null, msgs);
			msgs = basicSetPortsqtodb(newPortsqtodb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.DATABASE__PORTSQTODB, newPortsqtodb, newPortsqtodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.DATABASE__PORTDBTOSQL:
				return basicSetPortdbtosql(null, msgs);
			case M1Package.DATABASE__PORTSQLTODB:
				return basicSetPortsqltodb(null, msgs);
			case M1Package.DATABASE__PORTDBTOSQ:
				return basicSetPortdbtosq(null, msgs);
			case M1Package.DATABASE__PORTSQTODB:
				return basicSetPortsqtodb(null, msgs);
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
			case M1Package.DATABASE__PORTDBTOSQL:
				return getPortdbtosql();
			case M1Package.DATABASE__PORTSQLTODB:
				return getPortsqltodb();
			case M1Package.DATABASE__PORTDBTOSQ:
				return getPortdbtosq();
			case M1Package.DATABASE__PORTSQTODB:
				return getPortsqtodb();
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
			case M1Package.DATABASE__PORTDBTOSQL:
				setPortdbtosql((PortComposantFourni)newValue);
				return;
			case M1Package.DATABASE__PORTSQLTODB:
				setPortsqltodb((PortComposantRequis)newValue);
				return;
			case M1Package.DATABASE__PORTDBTOSQ:
				setPortdbtosq((PortComposantFourni)newValue);
				return;
			case M1Package.DATABASE__PORTSQTODB:
				setPortsqtodb((PortComposantRequis)newValue);
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
			case M1Package.DATABASE__PORTDBTOSQL:
				setPortdbtosql((PortComposantFourni)null);
				return;
			case M1Package.DATABASE__PORTSQLTODB:
				setPortsqltodb((PortComposantRequis)null);
				return;
			case M1Package.DATABASE__PORTDBTOSQ:
				setPortdbtosq((PortComposantFourni)null);
				return;
			case M1Package.DATABASE__PORTSQTODB:
				setPortsqtodb((PortComposantRequis)null);
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
			case M1Package.DATABASE__PORTDBTOSQL:
				return portdbtosql != null;
			case M1Package.DATABASE__PORTSQLTODB:
				return portsqltodb != null;
			case M1Package.DATABASE__PORTDBTOSQ:
				return portdbtosq != null;
			case M1Package.DATABASE__PORTSQTODB:
				return portsqtodb != null;
		}
		return super.eIsSet(featureID);
	}
	
	//database control with json file
	
	/**
	 * method to add a client in the database
	 * @param client : the client you want to add in the database
	 */
	public void add(ClientImpl client) {
		this.data.get("clients").getAsJsonArray().add(gson.toJsonTree(client));
		try {
			Path file = Paths.get(dbPath);
			this.jsonWritter = Files.newBufferedWriter(file, StandardOpenOption.CREATE);
			jsonWritter.write(data.toString());
			jsonWritter.flush();
		} catch (IOException error) {
			error.printStackTrace();
		}
		System.out.println("Added client " + client.pseudo + " to the database with value " + client.getValue());
	}
	
	/**
	 * method to update informations of a client already in the database
	 * @param client : the client you want to update the informations in the database
	 */
	public void update(ClientImpl client) {
		JsonElement clients = data.get("clients");
		if (clients.isJsonArray()){
			for (JsonElement c : clients.getAsJsonArray()){
				if (c.getAsJsonObject().get("id").getAsString().equals(client.pseudo)) {
					clients.getAsJsonArray().remove(c);
					break;
				}
			}
		}
		this.data.get("clients").getAsJsonArray().add(gson.toJsonTree(client));
		try {
			Path file = Paths.get(dbPath);
			this.jsonWritter = Files.newBufferedWriter(file, StandardOpenOption.CREATE);
			jsonWritter.write(data.toString());
			jsonWritter.flush();
		} catch (IOException error) {
			error.printStackTrace();
		}
	}
	
	/**
	 * method to delete a client from the database
	 * @param client : the client you want to delete from the database
	 */
	public void delete(ClientImpl client) {
		JsonElement clients = data.get("clients");
		if (clients.isJsonArray()){
			for (JsonElement c : clients.getAsJsonArray()){
				if (c.getAsJsonObject().get("id").getAsString().equals(client.pseudo)) {
					clients.getAsJsonArray().remove(c);
					break;
				}
			}
		}
		try {
			Path file = Paths.get(dbPath);
			this.jsonWritter = Files.newBufferedWriter(file, StandardOpenOption.CREATE);
			jsonWritter.write(data.toString());
			jsonWritter.flush();
		} catch (IOException error) {
			error.printStackTrace();
		}
	}

} //DatabaseImpl
