/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Connecteur;
import aSA.Glue;
import aSA.InterfaceConnecteur;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ConnecteurImpl#getInterfaceconnecteur <em>Interfaceconnecteur</em>}</li>
 *   <li>{@link aSA.impl.ConnecteurImpl#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnecteurImpl extends MinimalEObjectImpl.Container implements Connecteur {
	/**
	 * The cached value of the '{@link #getInterfaceconnecteur() <em>Interfaceconnecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconnecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnecteur> interfaceconnecteur;

	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnecteur> getInterfaceconnecteur() {
		if (interfaceconnecteur == null) {
			interfaceconnecteur = new EObjectContainmentEList<InterfaceConnecteur>(InterfaceConnecteur.class, this, ASAPackage.CONNECTEUR__INTERFACECONNECTEUR);
		}
		return interfaceconnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASAPackage.CONNECTEUR__GLUE, oldGlue, newGlue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject)glue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ASAPackage.CONNECTEUR__GLUE, null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject)newGlue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ASAPackage.CONNECTEUR__GLUE, null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.CONNECTEUR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASAPackage.CONNECTEUR__INTERFACECONNECTEUR:
				return ((InternalEList<?>)getInterfaceconnecteur()).basicRemove(otherEnd, msgs);
			case ASAPackage.CONNECTEUR__GLUE:
				return basicSetGlue(null, msgs);
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
			case ASAPackage.CONNECTEUR__INTERFACECONNECTEUR:
				return getInterfaceconnecteur();
			case ASAPackage.CONNECTEUR__GLUE:
				return getGlue();
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
			case ASAPackage.CONNECTEUR__INTERFACECONNECTEUR:
				getInterfaceconnecteur().clear();
				getInterfaceconnecteur().addAll((Collection<? extends InterfaceConnecteur>)newValue);
				return;
			case ASAPackage.CONNECTEUR__GLUE:
				setGlue((Glue)newValue);
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
			case ASAPackage.CONNECTEUR__INTERFACECONNECTEUR:
				getInterfaceconnecteur().clear();
				return;
			case ASAPackage.CONNECTEUR__GLUE:
				setGlue((Glue)null);
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
			case ASAPackage.CONNECTEUR__INTERFACECONNECTEUR:
				return interfaceconnecteur != null && !interfaceconnecteur.isEmpty();
			case ASAPackage.CONNECTEUR__GLUE:
				return glue != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnecteurImpl
