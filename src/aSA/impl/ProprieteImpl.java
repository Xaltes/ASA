/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Propriete;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propriete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ProprieteImpl#isFonctionnelle <em>Fonctionnelle</em>}</li>
 *   <li>{@link aSA.impl.ProprieteImpl#isConfigurable <em>Configurable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProprieteImpl extends MinimalEObjectImpl.Container implements Propriete {
	/**
	 * The default value of the '{@link #isFonctionnelle() <em>Fonctionnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFonctionnelle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONCTIONNELLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFonctionnelle() <em>Fonctionnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFonctionnelle()
	 * @generated
	 * @ordered
	 */
	protected boolean fonctionnelle = FONCTIONNELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConfigurable() <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIGURABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfigurable() <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigurable()
	 * @generated
	 * @ordered
	 */
	protected boolean configurable = CONFIGURABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProprieteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.PROPRIETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFonctionnelle() {
		return fonctionnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionnelle(boolean newFonctionnelle) {
		boolean oldFonctionnelle = fonctionnelle;
		fonctionnelle = newFonctionnelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.PROPRIETE__FONCTIONNELLE, oldFonctionnelle, fonctionnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfigurable() {
		return configurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurable(boolean newConfigurable) {
		boolean oldConfigurable = configurable;
		configurable = newConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.PROPRIETE__CONFIGURABLE, oldConfigurable, configurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASAPackage.PROPRIETE__FONCTIONNELLE:
				return isFonctionnelle();
			case ASAPackage.PROPRIETE__CONFIGURABLE:
				return isConfigurable();
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
			case ASAPackage.PROPRIETE__FONCTIONNELLE:
				setFonctionnelle((Boolean)newValue);
				return;
			case ASAPackage.PROPRIETE__CONFIGURABLE:
				setConfigurable((Boolean)newValue);
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
			case ASAPackage.PROPRIETE__FONCTIONNELLE:
				setFonctionnelle(FONCTIONNELLE_EDEFAULT);
				return;
			case ASAPackage.PROPRIETE__CONFIGURABLE:
				setConfigurable(CONFIGURABLE_EDEFAULT);
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
			case ASAPackage.PROPRIETE__FONCTIONNELLE:
				return fonctionnelle != FONCTIONNELLE_EDEFAULT;
			case ASAPackage.PROPRIETE__CONFIGURABLE:
				return configurable != CONFIGURABLE_EDEFAULT;
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
		result.append(" (fonctionnelle: ");
		result.append(fonctionnelle);
		result.append(", configurable: ");
		result.append(configurable);
		result.append(')');
		return result.toString();
	}

} //ProprieteImpl
