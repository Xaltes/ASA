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
	protected EList<PortConfigurationRequis> portbindingtoconfigclientserver;

	/**
	 * The cached value of the '{@link #getPortconfigclientservertobinding() <em>Portconfigclientservertobinding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortconfigclientservertobinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConfigurationFourni> portconfigclientservertobinding;

	/**
	 * The cached value of the '{@link #getBindingclienttoconfigclientserver() <em>Bindingclienttoconfigclientserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingclienttoconfigclientserver()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindingclienttoconfigclientserver;

	/**
	 * The cached value of the '{@link #getBindingconfigclientservertoclient() <em>Bindingconfigclientservertoclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingconfigclientservertoclient()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindingconfigclientservertoclient;

	/**
	 * The cached value of the '{@link #getAttachmentrpctoclient() <em>Attachmentrpctoclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentrpctoclient()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachmentrpctoclient;

	/**
	 * The cached value of the '{@link #getAttachmentservertorpc() <em>Attachmentservertorpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentservertorpc()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachmentservertorpc;

	/**
	 * The cached value of the '{@link #getAttachmentclienttorpc() <em>Attachmentclienttorpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentclienttorpc()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachmentclienttorpc;

	/**
	 * The cached value of the '{@link #getAttachmentrpctoserver() <em>Attachmentrpctoserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentrpctoserver()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachmentrpctoserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationClientServerImpl() {
		super();
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
	public EList<PortConfigurationRequis> getPortbindingtoconfigclientserver() {
		if (portbindingtoconfigclientserver == null) {
			portbindingtoconfigclientserver = new EObjectContainmentEList<PortConfigurationRequis>(PortConfigurationRequis.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER);
		}
		return portbindingtoconfigclientserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConfigurationFourni> getPortconfigclientservertobinding() {
		if (portconfigclientservertobinding == null) {
			portconfigclientservertobinding = new EObjectContainmentEList<PortConfigurationFourni>(PortConfigurationFourni.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING);
		}
		return portconfigclientservertobinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindingclienttoconfigclientserver() {
		if (bindingclienttoconfigclientserver == null) {
			bindingclienttoconfigclientserver = new EObjectContainmentEList<Binding>(Binding.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER);
		}
		return bindingclienttoconfigclientserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindingconfigclientservertoclient() {
		if (bindingconfigclientservertoclient == null) {
			bindingconfigclientservertoclient = new EObjectContainmentEList<Binding>(Binding.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT);
		}
		return bindingconfigclientservertoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachmentrpctoclient() {
		if (attachmentrpctoclient == null) {
			attachmentrpctoclient = new EObjectContainmentEList<Attachment>(Attachment.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT);
		}
		return attachmentrpctoclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachmentservertorpc() {
		if (attachmentservertorpc == null) {
			attachmentservertorpc = new EObjectContainmentEList<Attachment>(Attachment.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC);
		}
		return attachmentservertorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachmentclienttorpc() {
		if (attachmentclienttorpc == null) {
			attachmentclienttorpc = new EObjectContainmentEList<Attachment>(Attachment.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC);
		}
		return attachmentclienttorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachmentrpctoserver() {
		if (attachmentrpctoserver == null) {
			attachmentrpctoserver = new EObjectContainmentEList<Attachment>(Attachment.class, this, M1Package.CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER);
		}
		return attachmentrpctoserver;
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
				getPortbindingtoconfigclientserver().addAll((Collection<? extends PortConfigurationRequis>)newValue);
				return;
			case M1Package.CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING:
				getPortconfigclientservertobinding().clear();
				getPortconfigclientservertobinding().addAll((Collection<? extends PortConfigurationFourni>)newValue);
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

} //ConfigurationClientServerImpl
