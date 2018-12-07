/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Attachment;
import aSA.Binding;
import aSA.Composant;
import aSA.Configuration;
import aSA.InterfaceConfiguration;

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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ConfigurationImpl#getComposant <em>Composant</em>}</li>
 *   <li>{@link aSA.impl.ConfigurationImpl#getInterfaceconfiguration <em>Interfaceconfiguration</em>}</li>
 *   <li>{@link aSA.impl.ConfigurationImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link aSA.impl.ConfigurationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ComposantImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> composant;

	/**
	 * The cached value of the '{@link #getInterfaceconfiguration() <em>Interfaceconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconfiguration()
	 * @generated
	 * @ordered
	 */
	protected InterfaceConfiguration interfaceconfiguration;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachment;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composant> getComposant() {
		if (composant == null) {
			composant = new EObjectContainmentEList<Composant>(Composant.class, this, ASAPackage.CONFIGURATION__COMPOSANT);
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConfiguration getInterfaceconfiguration() {
		return interfaceconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceconfiguration(InterfaceConfiguration newInterfaceconfiguration, NotificationChain msgs) {
		InterfaceConfiguration oldInterfaceconfiguration = interfaceconfiguration;
		interfaceconfiguration = newInterfaceconfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASAPackage.CONFIGURATION__INTERFACECONFIGURATION, oldInterfaceconfiguration, newInterfaceconfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceconfiguration(InterfaceConfiguration newInterfaceconfiguration) {
		if (newInterfaceconfiguration != interfaceconfiguration) {
			NotificationChain msgs = null;
			if (interfaceconfiguration != null)
				msgs = ((InternalEObject)interfaceconfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASAPackage.CONFIGURATION__INTERFACECONFIGURATION, null, msgs);
			if (newInterfaceconfiguration != null)
				msgs = ((InternalEObject)newInterfaceconfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASAPackage.CONFIGURATION__INTERFACECONFIGURATION, null, msgs);
			msgs = basicSetInterfaceconfiguration(newInterfaceconfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.CONFIGURATION__INTERFACECONFIGURATION, newInterfaceconfiguration, newInterfaceconfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachment() {
		if (attachment == null) {
			attachment = new EObjectContainmentEList<Attachment>(Attachment.class, this, ASAPackage.CONFIGURATION__ATTACHMENT);
		}
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, ASAPackage.CONFIGURATION__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASAPackage.CONFIGURATION__COMPOSANT:
				return ((InternalEList<?>)getComposant()).basicRemove(otherEnd, msgs);
			case ASAPackage.CONFIGURATION__INTERFACECONFIGURATION:
				return basicSetInterfaceconfiguration(null, msgs);
			case ASAPackage.CONFIGURATION__ATTACHMENT:
				return ((InternalEList<?>)getAttachment()).basicRemove(otherEnd, msgs);
			case ASAPackage.CONFIGURATION__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case ASAPackage.CONFIGURATION__COMPOSANT:
				return getComposant();
			case ASAPackage.CONFIGURATION__INTERFACECONFIGURATION:
				return getInterfaceconfiguration();
			case ASAPackage.CONFIGURATION__ATTACHMENT:
				return getAttachment();
			case ASAPackage.CONFIGURATION__BINDING:
				return getBinding();
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
			case ASAPackage.CONFIGURATION__COMPOSANT:
				getComposant().clear();
				getComposant().addAll((Collection<? extends Composant>)newValue);
				return;
			case ASAPackage.CONFIGURATION__INTERFACECONFIGURATION:
				setInterfaceconfiguration((InterfaceConfiguration)newValue);
				return;
			case ASAPackage.CONFIGURATION__ATTACHMENT:
				getAttachment().clear();
				getAttachment().addAll((Collection<? extends Attachment>)newValue);
				return;
			case ASAPackage.CONFIGURATION__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
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
			case ASAPackage.CONFIGURATION__COMPOSANT:
				getComposant().clear();
				return;
			case ASAPackage.CONFIGURATION__INTERFACECONFIGURATION:
				setInterfaceconfiguration((InterfaceConfiguration)null);
				return;
			case ASAPackage.CONFIGURATION__ATTACHMENT:
				getAttachment().clear();
				return;
			case ASAPackage.CONFIGURATION__BINDING:
				getBinding().clear();
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
			case ASAPackage.CONFIGURATION__COMPOSANT:
				return composant != null && !composant.isEmpty();
			case ASAPackage.CONFIGURATION__INTERFACECONFIGURATION:
				return interfaceconfiguration != null;
			case ASAPackage.CONFIGURATION__ATTACHMENT:
				return attachment != null && !attachment.isEmpty();
			case ASAPackage.CONFIGURATION__BINDING:
				return binding != null && !binding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
