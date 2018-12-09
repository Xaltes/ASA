/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Attachment;
import aSA.Binding;
import aSA.Configuration;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;

import aSA.impl.ConfigurationImpl;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Client Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getPortbindingtoconfigclientserver <em>Portbindingtoconfigclientserver</em>}</li>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getPortconfigclientservertobinding <em>Portconfigclientservertobinding</em>}</li>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getBindingclienttoconfigclientserver <em>Bindingclienttoconfigclientserver</em>}</li>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getBindingconfigclientservertoclient <em>Bindingconfigclientservertoclient</em>}</li>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getAttachmentrpctoclient <em>Attachmentrpctoclient</em>}</li>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getAttachmentservertorpc <em>Attachmentservertorpc</em>}</li>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getAttachmentclienttorpc <em>Attachmentclienttorpc</em>}</li>
 *   <li>{@link M1.impl.ConfigurationClientServerImpl#getAttachmentrpctoserver <em>Attachmentrpctoserver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationClientServerImpl extends ConfigurationImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getPortbindingtoconfigclientserver() <em>Portbindingtoconfigclientserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortbindingtoconfigclientserver()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<PortConfigurationFourni> portbindingtoconfigclientserver;

	/**
	 * The cached value of the '{@link #getPortconfigclientservertobinding() <em>Portconfigclientservertobinding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortconfigclientservertobinding()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<PortConfigurationRequis> portconfigclientservertobinding;

	/**
	 * The cached value of the '{@link #getBindingclienttoconfigclientserver() <em>Bindingclienttoconfigclientserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingclienttoconfigclientserver()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<Binding> bindingclienttoconfigclientserver;

	/**
	 * The cached value of the '{@link #getBindingconfigclientservertoclient() <em>Bindingconfigclientservertoclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingconfigclientservertoclient()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<Binding> bindingconfigclientservertoclient;

	/**
	 * The cached value of the '{@link #getAttachmentrpctoclient() <em>Attachmentrpctoclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentrpctoclient()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<Attachment> attachmentrpctoclient;

	/**
	 * The cached value of the '{@link #getAttachmentservertorpc() <em>Attachmentservertorpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentservertorpc()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<Attachment> attachmentservertorpc;

	/**
	 * The cached value of the '{@link #getAttachmentclienttorpc() <em>Attachmentclienttorpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentclienttorpc()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<Attachment> attachmentclienttorpc;

	/**
	 * The cached value of the '{@link #getAttachmentrpctoserver() <em>Attachmentrpctoserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentrpctoserver()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<Attachment> attachmentrpctoserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationClientServerImpl(ArrayList<PortConfigurationFourni> p1, ArrayList<PortConfigurationRequis> p2, ArrayList<Binding> b1, ArrayList<Binding> b2, ArrayList<Attachment> a1, ArrayList<Attachment> a2, ArrayList<Attachment> a3, ArrayList<Attachment> a4) {
		super();	
		this.portbindingtoconfigclientserver = p1;
		this.portconfigclientservertobinding = p2;
		this.bindingclienttoconfigclientserver = b1;
		this.bindingconfigclientservertoclient = b2;
		this.attachmentrpctoclient = a1;
		this.attachmentservertorpc = a2;
		this.attachmentclienttorpc = a3;
		this.attachmentrpctoserver = a4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.CONFIGURATION_CLIENT_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<PortConfigurationFourni> getPortbindingtoconfigclientserver() {
		return portbindingtoconfigclientserver;
	}
	
	public void addPortbindingtoconfigclientserver(PortConfigurationFourni p) {
		portbindingtoconfigclientserver.add(p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<PortConfigurationRequis> getPortconfigclientservertobinding() {
		return portconfigclientservertobinding;
	}
	
	public void addPortconfigclientservertobinding(PortConfigurationRequis p) {
		portconfigclientservertobinding.add(p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<Binding> getBindingclienttoconfigclientserver() {
		return bindingclienttoconfigclientserver;
	}
	
	public void addBindingclienttoconfigclientserver(Binding b) {
		bindingclienttoconfigclientserver.add(b);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<Binding> getBindingconfigclientservertoclient() {
		return bindingconfigclientservertoclient;
	}
	
	public void addBindingconfigclientservertoclient(Binding b) {
		bindingconfigclientservertoclient.add(b);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<Attachment> getAttachmentrpctoclient() {
		return attachmentrpctoclient;
	}
	
	public void addAttachmentrpctoclient(Attachment a) {
		attachmentrpctoclient.add(a);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<Attachment> getAttachmentservertorpc() {
		return attachmentservertorpc;
	}
	
	public void addAttachmentservertorpc(Attachment a) {
		attachmentservertorpc.add(a);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<Attachment> getAttachmentclienttorpc() {
		return attachmentclienttorpc;
	}
	
	public void addAttachmentclienttorpc(Attachment a) {
		attachmentclienttorpc.add(a);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<Attachment> getAttachmentrpctoserver() {
		return attachmentrpctoserver;
	}
	
	public void addAttachmentrpctoserver(Attachment a) {
		attachmentrpctoserver.add(a);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
			return ((InternalEList<?>)getPortbindingtoconfigclientserver()).basicRemove(otherEnd, msgs);
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING:
			return ((InternalEList<?>)getPortconfigclientservertobinding()).basicRemove(otherEnd, msgs);
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER:
			return ((InternalEList<?>)getBindingclienttoconfigclientserver()).basicRemove(otherEnd, msgs);
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT:
			return ((InternalEList<?>)getBindingconfigclientservertoclient()).basicRemove(otherEnd, msgs);
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT:
			return ((InternalEList<?>)getAttachmentrpctoclient()).basicRemove(otherEnd, msgs);
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC:
			return ((InternalEList<?>)getAttachmentservertorpc()).basicRemove(otherEnd, msgs);
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC:
			return ((InternalEList<?>)getAttachmentclienttorpc()).basicRemove(otherEnd, msgs);
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER:
			return ((InternalEList<?>)getAttachmentrpctoserver()).basicRemove(otherEnd, msgs);
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
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
			return getPortbindingtoconfigclientserver();
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING:
			return getPortconfigclientservertobinding();
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER:
			return getBindingclienttoconfigclientserver();
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT:
			return getBindingconfigclientservertoclient();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT:
			return getAttachmentrpctoclient();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC:
			return getAttachmentservertorpc();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC:
			return getAttachmentclienttorpc();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER:
			return getAttachmentrpctoserver();
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
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
			getPortbindingtoconfigclientserver().clear();
			getPortbindingtoconfigclientserver().addAll((Collection<? extends PortConfigurationFourni>)newValue);
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING:
			getPortconfigclientservertobinding().clear();
			getPortconfigclientservertobinding().addAll((Collection<? extends PortConfigurationRequis>)newValue);
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER:
			getBindingclienttoconfigclientserver().clear();
			getBindingclienttoconfigclientserver().addAll((Collection<? extends Binding>)newValue);
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT:
			getBindingconfigclientservertoclient().clear();
			getBindingconfigclientservertoclient().addAll((Collection<? extends Binding>)newValue);
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT:
			getAttachmentrpctoclient().clear();
			getAttachmentrpctoclient().addAll((Collection<? extends Attachment>)newValue);
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC:
			getAttachmentservertorpc().clear();
			getAttachmentservertorpc().addAll((Collection<? extends Attachment>)newValue);
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC:
			getAttachmentclienttorpc().clear();
			getAttachmentclienttorpc().addAll((Collection<? extends Attachment>)newValue);
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER:
			getAttachmentrpctoserver().clear();
			getAttachmentrpctoserver().addAll((Collection<? extends Attachment>)newValue);
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
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
			getPortbindingtoconfigclientserver().clear();
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING:
			getPortconfigclientservertobinding().clear();
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER:
			getBindingclienttoconfigclientserver().clear();
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT:
			getBindingconfigclientservertoclient().clear();
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT:
			getAttachmentrpctoclient().clear();
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC:
			getAttachmentservertorpc().clear();
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC:
			getAttachmentclienttorpc().clear();
			return;
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER:
			getAttachmentrpctoserver().clear();
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
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER:
			return portbindingtoconfigclientserver != null && !portbindingtoconfigclientserver.isEmpty();
		case M1Package.CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING:
			return portconfigclientservertobinding != null && !portconfigclientservertobinding.isEmpty();
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER:
			return bindingclienttoconfigclientserver != null && !bindingclienttoconfigclientserver.isEmpty();
		case M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT:
			return bindingconfigclientservertoclient != null && !bindingconfigclientservertoclient.isEmpty();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT:
			return attachmentrpctoclient != null && !attachmentrpctoclient.isEmpty();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC:
			return attachmentservertorpc != null && !attachmentservertorpc.isEmpty();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC:
			return attachmentclienttorpc != null && !attachmentclienttorpc.isEmpty();
		case M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER:
			return attachmentrpctoserver != null && !attachmentrpctoserver.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	// La configuration joue le rôle d'observateur sur le Client
    public void notifier(String s){

        String requete = s;
        if(requete == null || requete.equals("")){
            System.out.println("Pas de nouvelle requete");
        }else {
            System.out.println("La configuration client serveur a recu la notif");
            System.out.println("Nouvelle requete: "+requete);
        }

        //getAttachmentclienttorpc();
    }
	

} //ConfigurationClientServerImpl
