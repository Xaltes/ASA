/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Attachment;
import aSA.Binding;
import aSA.Configuration;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;

import aSA.impl.ConfigurationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getBindingcmtoserver <em>Bindingcmtoserver</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getBindingservertocm <em>Bindingservertocm</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getPortservertorpc <em>Portservertorpc</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getPortrpctoserver <em>Portrpctoserver</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getPortservertobinding <em>Portservertobinding</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getPortbindingtoserver <em>Portbindingtoserver</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentsqltocm <em>Attachmentsqltocm</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentcmtosql <em>Attachmentcmtosql</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentsqltodb <em>Attachmentsqltodb</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentdbtosql <em>Attachmentdbtosql</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentdbtosq <em>Attachmentdbtosq</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentsqtodb <em>Attachmentsqtodb</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentsqtosm <em>Attachmentsqtosm</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentsmtosq <em>Attachmentsmtosq</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentcrtocm <em>Attachmentcrtocm</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentcmtocr <em>Attachmentcmtocr</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentsmtocr <em>Attachmentsmtocr</em>}</li>
 *   <li>{@link M1.impl.ServerConfigurationImpl#getAttachmentcrtosm <em>Attachmentcrtosm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerConfigurationImpl extends ConfigurationImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getBindingcmtoserver() <em>Bindingcmtoserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingcmtoserver()
	 * @generated
	 * @ordered
	 */
	protected Binding bindingcmtoserver;

	/**
	 * The cached value of the '{@link #getBindingservertocm() <em>Bindingservertocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingservertocm()
	 * @generated
	 * @ordered
	 */
	protected Binding bindingservertocm;

	/**
	 * The cached value of the '{@link #getPortservertorpc() <em>Portservertorpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortservertorpc()
	 * @generated
	 * @ordered
	 */
	protected EList<PortComposantFourni> portservertorpc;

	/**
	 * The cached value of the '{@link #getPortrpctoserver() <em>Portrpctoserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrpctoserver()
	 * @generated
	 * @ordered
	 */
	protected EList<PortComposantRequis> portrpctoserver;

	/**
	 * The cached value of the '{@link #getPortservertobinding() <em>Portservertobinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortservertobinding()
	 * @generated
	 * @ordered
	 */
	protected PortConfigurationRequis portservertobinding;

	/**
	 * The cached value of the '{@link #getPortbindingtoserver() <em>Portbindingtoserver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtoserver()
	 * @generated
	 * @ordered
	 */
	protected PortConfigurationFourni portbindingtoserver;

	/**
	 * The cached value of the '{@link #getAttachmentsqltocm() <em>Attachmentsqltocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentsqltocm()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentsqltocm;

	/**
	 * The cached value of the '{@link #getAttachmentcmtosql() <em>Attachmentcmtosql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentcmtosql()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentcmtosql;

	/**
	 * The cached value of the '{@link #getAttachmentsqltodb() <em>Attachmentsqltodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentsqltodb()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentsqltodb;

	/**
	 * The cached value of the '{@link #getAttachmentdbtosql() <em>Attachmentdbtosql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentdbtosql()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentdbtosql;

	/**
	 * The cached value of the '{@link #getAttachmentdbtosq() <em>Attachmentdbtosq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentdbtosq()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentdbtosq;

	/**
	 * The cached value of the '{@link #getAttachmentsqtodb() <em>Attachmentsqtodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentsqtodb()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentsqtodb;

	/**
	 * The cached value of the '{@link #getAttachmentsqtosm() <em>Attachmentsqtosm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentsqtosm()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentsqtosm;

	/**
	 * The cached value of the '{@link #getAttachmentsmtosq() <em>Attachmentsmtosq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentsmtosq()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentsmtosq;

	/**
	 * The cached value of the '{@link #getAttachmentcrtocm() <em>Attachmentcrtocm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentcrtocm()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentcrtocm;

	/**
	 * The cached value of the '{@link #getAttachmentcmtocr() <em>Attachmentcmtocr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentcmtocr()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentcmtocr;

	/**
	 * The cached value of the '{@link #getAttachmentsmtocr() <em>Attachmentsmtocr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentsmtocr()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentsmtocr;

	/**
	 * The cached value of the '{@link #getAttachmentcrtosm() <em>Attachmentcrtosm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentcrtosm()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentcrtosm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerConfigurationImpl(Binding b1, Binding b2, EList<PortComposantFourni> p1, EList<PortComposantRequis> p2, PortConfigurationRequis p3, PortConfigurationFourni p4, 
			Attachment a1, Attachment a2, Attachment a3, Attachment a4, Attachment a5, Attachment a6, Attachment a7, Attachment a8, Attachment a9, Attachment a10, Attachment a11, Attachment a12) {
		super();
		this.bindingcmtoserver = b1;
		this.bindingservertocm = b2;
		this.portservertorpc = p1;
		this.portrpctoserver = p2;
		this.portservertobinding = p3;
		this.portbindingtoserver = p4;
		this.attachmentsqltocm = a1;
		this.attachmentcmtosql = a2;
		this.attachmentsqltodb = a3;
		this.attachmentdbtosql = a4;
		this.attachmentdbtosq = a5;
		this.attachmentsqtodb = a6;
		this.attachmentsqtosm = a7;
		this.attachmentsmtosq = a8;
		this.attachmentcrtocm = a9;
		this.attachmentcmtocr = a10;
		this.attachmentsmtocr = a11;
		this.attachmentcrtosm = a12;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.SERVER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBindingcmtoserver() {
		return bindingcmtoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingcmtoserver(Binding newBindingcmtoserver, NotificationChain msgs) {
		Binding oldBindingcmtoserver = bindingcmtoserver;
		bindingcmtoserver = newBindingcmtoserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER, oldBindingcmtoserver, newBindingcmtoserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingcmtoserver(Binding newBindingcmtoserver) {
		if (newBindingcmtoserver != bindingcmtoserver) {
			NotificationChain msgs = null;
			//if (bindingcmtoserver != null)
				//msgs = ((InternalEObject)bindingcmtoserver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER, null, msgs);
			//if (newBindingcmtoserver != null)
				//msgs = ((InternalEObject)newBindingcmtoserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER, null, msgs);
			msgs = basicSetBindingcmtoserver(newBindingcmtoserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER, newBindingcmtoserver, newBindingcmtoserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBindingservertocm() {
		return bindingservertocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingservertocm(Binding newBindingservertocm, NotificationChain msgs) {
		Binding oldBindingservertocm = bindingservertocm;
		bindingservertocm = newBindingservertocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM, oldBindingservertocm, newBindingservertocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingservertocm(Binding newBindingservertocm) {
		if (newBindingservertocm != bindingservertocm) {
			NotificationChain msgs = null;
			//if (bindingservertocm != null)
				//msgs = ((InternalEObject)bindingservertocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM, null, msgs);
			//if (newBindingservertocm != null)
				//msgs = ((InternalEObject)newBindingservertocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM, null, msgs);
			msgs = basicSetBindingservertocm(newBindingservertocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM, newBindingservertocm, newBindingservertocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortComposantFourni> getPortservertorpc() {
		if (portservertorpc == null) {
			portservertorpc = new EObjectContainmentEList<PortComposantFourni>(PortComposantFourni.class, this, M1Package.SERVER_CONFIGURATION__PORTSERVERTORPC);
		}
		return portservertorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortComposantRequis> getPortrpctoserver() {
		if (portrpctoserver == null) {
			portrpctoserver = new EObjectContainmentEList<PortComposantRequis>(PortComposantRequis.class, this, M1Package.SERVER_CONFIGURATION__PORTRPCTOSERVER);
		}
		return portrpctoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis getPortservertobinding() {
		return portservertobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortservertobinding(PortConfigurationRequis newPortservertobinding, NotificationChain msgs) {
		PortConfigurationRequis oldPortservertobinding = portservertobinding;
		portservertobinding = newPortservertobinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING, oldPortservertobinding, newPortservertobinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortservertobinding(PortConfigurationRequis newPortservertobinding) {
		if (newPortservertobinding != portservertobinding) {
			NotificationChain msgs = null;
			//if (portservertobinding != null)
				//msgs = ((InternalEObject)portservertobinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING, null, msgs);
			//if (newPortservertobinding != null)
				//msgs = ((InternalEObject)newPortservertobinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING, null, msgs);
			msgs = basicSetPortservertobinding(newPortservertobinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING, newPortservertobinding, newPortservertobinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni getPortbindingtoserver() {
		return portbindingtoserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortbindingtoserver(PortConfigurationFourni newPortbindingtoserver, NotificationChain msgs) {
		PortConfigurationFourni oldPortbindingtoserver = portbindingtoserver;
		portbindingtoserver = newPortbindingtoserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER, oldPortbindingtoserver, newPortbindingtoserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortbindingtoserver(PortConfigurationFourni newPortbindingtoserver) {
		if (newPortbindingtoserver != portbindingtoserver) {
			NotificationChain msgs = null;
			//if (portbindingtoserver != null)
				//msgs = ((InternalEObject)portbindingtoserver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER, null, msgs);
			//if (newPortbindingtoserver != null)
				//msgs = ((InternalEObject)newPortbindingtoserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER, null, msgs);
			msgs = basicSetPortbindingtoserver(newPortbindingtoserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER, newPortbindingtoserver, newPortbindingtoserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentsqltocm() {
		return attachmentsqltocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentsqltocm(Attachment newAttachmentsqltocm, NotificationChain msgs) {
		Attachment oldAttachmentsqltocm = attachmentsqltocm;
		attachmentsqltocm = newAttachmentsqltocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM, oldAttachmentsqltocm, newAttachmentsqltocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentsqltocm(Attachment newAttachmentsqltocm) {
		if (newAttachmentsqltocm != attachmentsqltocm) {
			NotificationChain msgs = null;
			//if (attachmentsqltocm != null)
				//msgs = ((InternalEObject)attachmentsqltocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM, null, msgs);
			//if (newAttachmentsqltocm != null)
				//msgs = ((InternalEObject)newAttachmentsqltocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM, null, msgs);
			msgs = basicSetAttachmentsqltocm(newAttachmentsqltocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM, newAttachmentsqltocm, newAttachmentsqltocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentcmtosql() {
		return attachmentcmtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentcmtosql(Attachment newAttachmentcmtosql, NotificationChain msgs) {
		Attachment oldAttachmentcmtosql = attachmentcmtosql;
		attachmentcmtosql = newAttachmentcmtosql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL, oldAttachmentcmtosql, newAttachmentcmtosql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentcmtosql(Attachment newAttachmentcmtosql) {
		if (newAttachmentcmtosql != attachmentcmtosql) {
			NotificationChain msgs = null;
			//if (attachmentcmtosql != null)
				//msgs = ((InternalEObject)attachmentcmtosql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL, null, msgs);
			//if (newAttachmentcmtosql != null)
				//msgs = ((InternalEObject)newAttachmentcmtosql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL, null, msgs);
			msgs = basicSetAttachmentcmtosql(newAttachmentcmtosql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL, newAttachmentcmtosql, newAttachmentcmtosql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentsqltodb() {
		return attachmentsqltodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentsqltodb(Attachment newAttachmentsqltodb, NotificationChain msgs) {
		Attachment oldAttachmentsqltodb = attachmentsqltodb;
		attachmentsqltodb = newAttachmentsqltodb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB, oldAttachmentsqltodb, newAttachmentsqltodb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentsqltodb(Attachment newAttachmentsqltodb) {
		if (newAttachmentsqltodb != attachmentsqltodb) {
			NotificationChain msgs = null;
			//if (attachmentsqltodb != null)
				//msgs = ((InternalEObject)attachmentsqltodb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB, null, msgs);
			//if (newAttachmentsqltodb != null)
				//msgs = ((InternalEObject)newAttachmentsqltodb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB, null, msgs);
			msgs = basicSetAttachmentsqltodb(newAttachmentsqltodb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB, newAttachmentsqltodb, newAttachmentsqltodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentdbtosql() {
		return attachmentdbtosql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentdbtosql(Attachment newAttachmentdbtosql, NotificationChain msgs) {
		Attachment oldAttachmentdbtosql = attachmentdbtosql;
		attachmentdbtosql = newAttachmentdbtosql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL, oldAttachmentdbtosql, newAttachmentdbtosql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentdbtosql(Attachment newAttachmentdbtosql) {
		if (newAttachmentdbtosql != attachmentdbtosql) {
			NotificationChain msgs = null;
			//if (attachmentdbtosql != null)
				//msgs = ((InternalEObject)attachmentdbtosql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL, null, msgs);
			//if (newAttachmentdbtosql != null)
				//msgs = ((InternalEObject)newAttachmentdbtosql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL, null, msgs);
			msgs = basicSetAttachmentdbtosql(newAttachmentdbtosql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL, newAttachmentdbtosql, newAttachmentdbtosql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentdbtosq() {
		return attachmentdbtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentdbtosq(Attachment newAttachmentdbtosq, NotificationChain msgs) {
		Attachment oldAttachmentdbtosq = attachmentdbtosq;
		attachmentdbtosq = newAttachmentdbtosq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ, oldAttachmentdbtosq, newAttachmentdbtosq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentdbtosq(Attachment newAttachmentdbtosq) {
		if (newAttachmentdbtosq != attachmentdbtosq) {
			NotificationChain msgs = null;
			//if (attachmentdbtosq != null)
				//msgs = ((InternalEObject)attachmentdbtosq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ, null, msgs);
			//if (newAttachmentdbtosq != null)
				//msgs = ((InternalEObject)newAttachmentdbtosq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ, null, msgs);
			msgs = basicSetAttachmentdbtosq(newAttachmentdbtosq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ, newAttachmentdbtosq, newAttachmentdbtosq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentsqtodb() {
		return attachmentsqtodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentsqtodb(Attachment newAttachmentsqtodb, NotificationChain msgs) {
		Attachment oldAttachmentsqtodb = attachmentsqtodb;
		attachmentsqtodb = newAttachmentsqtodb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB, oldAttachmentsqtodb, newAttachmentsqtodb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentsqtodb(Attachment newAttachmentsqtodb) {
		if (newAttachmentsqtodb != attachmentsqtodb) {
			NotificationChain msgs = null;
			//if (attachmentsqtodb != null)
				//msgs = ((InternalEObject)attachmentsqtodb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB, null, msgs);
			//if (newAttachmentsqtodb != null)
				//msgs = ((InternalEObject)newAttachmentsqtodb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB, null, msgs);
			msgs = basicSetAttachmentsqtodb(newAttachmentsqtodb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB, newAttachmentsqtodb, newAttachmentsqtodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentsqtosm() {
		return attachmentsqtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentsqtosm(Attachment newAttachmentsqtosm, NotificationChain msgs) {
		Attachment oldAttachmentsqtosm = attachmentsqtosm;
		attachmentsqtosm = newAttachmentsqtosm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM, oldAttachmentsqtosm, newAttachmentsqtosm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentsqtosm(Attachment newAttachmentsqtosm) {
		if (newAttachmentsqtosm != attachmentsqtosm) {
			NotificationChain msgs = null;
			//if (attachmentsqtosm != null)
				//msgs = ((InternalEObject)attachmentsqtosm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM, null, msgs);
			//if (newAttachmentsqtosm != null)
				//msgs = ((InternalEObject)newAttachmentsqtosm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM, null, msgs);
			msgs = basicSetAttachmentsqtosm(newAttachmentsqtosm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM, newAttachmentsqtosm, newAttachmentsqtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentsmtosq() {
		return attachmentsmtosq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentsmtosq(Attachment newAttachmentsmtosq, NotificationChain msgs) {
		Attachment oldAttachmentsmtosq = attachmentsmtosq;
		attachmentsmtosq = newAttachmentsmtosq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ, oldAttachmentsmtosq, newAttachmentsmtosq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentsmtosq(Attachment newAttachmentsmtosq) {
		if (newAttachmentsmtosq != attachmentsmtosq) {
			NotificationChain msgs = null;
			//if (attachmentsmtosq != null)
				//msgs = ((InternalEObject)attachmentsmtosq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ, null, msgs);
			//if (newAttachmentsmtosq != null)
				//msgs = ((InternalEObject)newAttachmentsmtosq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ, null, msgs);
			msgs = basicSetAttachmentsmtosq(newAttachmentsmtosq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ, newAttachmentsmtosq, newAttachmentsmtosq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentcrtocm() {
		return attachmentcrtocm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentcrtocm(Attachment newAttachmentcrtocm, NotificationChain msgs) {
		Attachment oldAttachmentcrtocm = attachmentcrtocm;
		attachmentcrtocm = newAttachmentcrtocm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM, oldAttachmentcrtocm, newAttachmentcrtocm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentcrtocm(Attachment newAttachmentcrtocm) {
		if (newAttachmentcrtocm != attachmentcrtocm) {
			NotificationChain msgs = null;
			//if (attachmentcrtocm != null)
				//msgs = ((InternalEObject)attachmentcrtocm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM, null, msgs);
			//if (newAttachmentcrtocm != null)
				//msgs = ((InternalEObject)newAttachmentcrtocm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM, null, msgs);
			msgs = basicSetAttachmentcrtocm(newAttachmentcrtocm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM, newAttachmentcrtocm, newAttachmentcrtocm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentcmtocr() {
		return attachmentcmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentcmtocr(Attachment newAttachmentcmtocr, NotificationChain msgs) {
		Attachment oldAttachmentcmtocr = attachmentcmtocr;
		attachmentcmtocr = newAttachmentcmtocr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR, oldAttachmentcmtocr, newAttachmentcmtocr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentcmtocr(Attachment newAttachmentcmtocr) {
		if (newAttachmentcmtocr != attachmentcmtocr) {
			NotificationChain msgs = null;
			//if (attachmentcmtocr != null)
				//msgs = ((InternalEObject)attachmentcmtocr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR, null, msgs);
			//if (newAttachmentcmtocr != null)
				//msgs = ((InternalEObject)newAttachmentcmtocr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR, null, msgs);
			msgs = basicSetAttachmentcmtocr(newAttachmentcmtocr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR, newAttachmentcmtocr, newAttachmentcmtocr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentsmtocr() {
		return attachmentsmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentsmtocr(Attachment newAttachmentsmtocr, NotificationChain msgs) {
		Attachment oldAttachmentsmtocr = attachmentsmtocr;
		attachmentsmtocr = newAttachmentsmtocr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR, oldAttachmentsmtocr, newAttachmentsmtocr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentsmtocr(Attachment newAttachmentsmtocr) {
		if (newAttachmentsmtocr != attachmentsmtocr) {
			NotificationChain msgs = null;
			//if (attachmentsmtocr != null)
				//msgs = ((InternalEObject)attachmentsmtocr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR, null, msgs);
			//if (newAttachmentsmtocr != null)
				//msgs = ((InternalEObject)newAttachmentsmtocr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR, null, msgs);
			msgs = basicSetAttachmentsmtocr(newAttachmentsmtocr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR, newAttachmentsmtocr, newAttachmentsmtocr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentcrtosm() {
		return attachmentcrtosm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentcrtosm(Attachment newAttachmentcrtosm, NotificationChain msgs) {
		Attachment oldAttachmentcrtosm = attachmentcrtosm;
		attachmentcrtosm = newAttachmentcrtosm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM, oldAttachmentcrtosm, newAttachmentcrtosm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentcrtosm(Attachment newAttachmentcrtosm) {
		if (newAttachmentcrtosm != attachmentcrtosm) {
			NotificationChain msgs = null;
			//if (attachmentcrtosm != null)
				//msgs = ((InternalEObject)attachmentcrtosm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM, null, msgs);
			//if (newAttachmentcrtosm != null)
				//msgs = ((InternalEObject)newAttachmentcrtosm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM, null, msgs);
			msgs = basicSetAttachmentcrtosm(newAttachmentcrtosm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM, newAttachmentcrtosm, newAttachmentcrtosm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER:
				return basicSetBindingcmtoserver(null, msgs);
			case M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM:
				return basicSetBindingservertocm(null, msgs);
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTORPC:
				return ((InternalEList<?>)getPortservertorpc()).basicRemove(otherEnd, msgs);
			case M1Package.SERVER_CONFIGURATION__PORTRPCTOSERVER:
				return ((InternalEList<?>)getPortrpctoserver()).basicRemove(otherEnd, msgs);
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING:
				return basicSetPortservertobinding(null, msgs);
			case M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER:
				return basicSetPortbindingtoserver(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM:
				return basicSetAttachmentsqltocm(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL:
				return basicSetAttachmentcmtosql(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB:
				return basicSetAttachmentsqltodb(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL:
				return basicSetAttachmentdbtosql(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ:
				return basicSetAttachmentdbtosq(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB:
				return basicSetAttachmentsqtodb(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM:
				return basicSetAttachmentsqtosm(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ:
				return basicSetAttachmentsmtosq(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM:
				return basicSetAttachmentcrtocm(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR:
				return basicSetAttachmentcmtocr(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR:
				return basicSetAttachmentsmtocr(null, msgs);
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM:
				return basicSetAttachmentcrtosm(null, msgs);
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
			case M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER:
				return getBindingcmtoserver();
			case M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM:
				return getBindingservertocm();
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTORPC:
				return getPortservertorpc();
			case M1Package.SERVER_CONFIGURATION__PORTRPCTOSERVER:
				return getPortrpctoserver();
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING:
				return getPortservertobinding();
			case M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER:
				return getPortbindingtoserver();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM:
				return getAttachmentsqltocm();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL:
				return getAttachmentcmtosql();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB:
				return getAttachmentsqltodb();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL:
				return getAttachmentdbtosql();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ:
				return getAttachmentdbtosq();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB:
				return getAttachmentsqtodb();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM:
				return getAttachmentsqtosm();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ:
				return getAttachmentsmtosq();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM:
				return getAttachmentcrtocm();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR:
				return getAttachmentcmtocr();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR:
				return getAttachmentsmtocr();
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM:
				return getAttachmentcrtosm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER:
				setBindingcmtoserver((Binding)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM:
				setBindingservertocm((Binding)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTORPC:
				getPortservertorpc().clear();
				getPortservertorpc().addAll((Collection<? extends PortComposantFourni>)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__PORTRPCTOSERVER:
				getPortrpctoserver().clear();
				getPortrpctoserver().addAll((Collection<? extends PortComposantRequis>)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING:
				setPortservertobinding((PortConfigurationRequis)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER:
				setPortbindingtoserver((PortConfigurationFourni)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM:
				setAttachmentsqltocm((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL:
				setAttachmentcmtosql((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB:
				setAttachmentsqltodb((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL:
				setAttachmentdbtosql((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ:
				setAttachmentdbtosq((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB:
				setAttachmentsqtodb((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM:
				setAttachmentsqtosm((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ:
				setAttachmentsmtosq((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM:
				setAttachmentcrtocm((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR:
				setAttachmentcmtocr((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR:
				setAttachmentsmtocr((Attachment)newValue);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM:
				setAttachmentcrtosm((Attachment)newValue);
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
			case M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER:
				setBindingcmtoserver((Binding)null);
				return;
			case M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM:
				setBindingservertocm((Binding)null);
				return;
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTORPC:
				getPortservertorpc().clear();
				return;
			case M1Package.SERVER_CONFIGURATION__PORTRPCTOSERVER:
				getPortrpctoserver().clear();
				return;
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING:
				setPortservertobinding((PortConfigurationRequis)null);
				return;
			case M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER:
				setPortbindingtoserver((PortConfigurationFourni)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM:
				setAttachmentsqltocm((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL:
				setAttachmentcmtosql((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB:
				setAttachmentsqltodb((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL:
				setAttachmentdbtosql((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ:
				setAttachmentdbtosq((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB:
				setAttachmentsqtodb((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM:
				setAttachmentsqtosm((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ:
				setAttachmentsmtosq((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM:
				setAttachmentcrtocm((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR:
				setAttachmentcmtocr((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR:
				setAttachmentsmtocr((Attachment)null);
				return;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM:
				setAttachmentcrtosm((Attachment)null);
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
			case M1Package.SERVER_CONFIGURATION__BINDINGCMTOSERVER:
				return bindingcmtoserver != null;
			case M1Package.SERVER_CONFIGURATION__BINDINGSERVERTOCM:
				return bindingservertocm != null;
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTORPC:
				return portservertorpc != null && !portservertorpc.isEmpty();
			case M1Package.SERVER_CONFIGURATION__PORTRPCTOSERVER:
				return portrpctoserver != null && !portrpctoserver.isEmpty();
			case M1Package.SERVER_CONFIGURATION__PORTSERVERTOBINDING:
				return portservertobinding != null;
			case M1Package.SERVER_CONFIGURATION__PORTBINDINGTOSERVER:
				return portbindingtoserver != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTOCM:
				return attachmentsqltocm != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOSQL:
				return attachmentcmtosql != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQLTODB:
				return attachmentsqltodb != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQL:
				return attachmentdbtosql != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTDBTOSQ:
				return attachmentdbtosq != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTODB:
				return attachmentsqtodb != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSQTOSM:
				return attachmentsqtosm != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOSQ:
				return attachmentsmtosq != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOCM:
				return attachmentcrtocm != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCMTOCR:
				return attachmentcmtocr != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTSMTOCR:
				return attachmentsmtocr != null;
			case M1Package.SERVER_CONFIGURATION__ATTACHMENTCRTOSM:
				return attachmentcrtosm != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean testConnection(String motDePasse) {
		boolean test = true; //TODO change value to false when function entirely done
		// TODO renvoyer une requete via la connection avec DatabaseImpl pour tester le mot de passe d'un client qui souhaite se connecter
		
		return test;
	}

} //ServerConfigurationImpl
