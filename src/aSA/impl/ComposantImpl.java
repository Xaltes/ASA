/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Composant;
import aSA.ContrainteTechnique;
import aSA.InterfaceComposant;
import aSA.Propriete;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ComposantImpl#getInterfacecomposant <em>Interfacecomposant</em>}</li>
 *   <li>{@link aSA.impl.ComposantImpl#getPropriete <em>Propriete</em>}</li>
 *   <li>{@link aSA.impl.ComposantImpl#getContraintetechnique <em>Contraintetechnique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends MinimalEObjectImpl.Container implements Composant {
	/**
	 * The cached value of the '{@link #getInterfacecomposant() <em>Interfacecomposant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacecomposant()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceComposant> interfacecomposant;

	/**
	 * The cached value of the '{@link #getPropriete() <em>Propriete</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriete()
	 * @generated
	 * @ordered
	 */
	protected EList<Propriete> propriete;

	/**
	 * The cached value of the '{@link #getContraintetechnique() <em>Contraintetechnique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintetechnique()
	 * @generated
	 * @ordered
	 */
	protected EList<ContrainteTechnique> contraintetechnique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceComposant> getInterfacecomposant() {
		if (interfacecomposant == null) {
			interfacecomposant = new EObjectContainmentEList<InterfaceComposant>(InterfaceComposant.class, this, ASAPackage.COMPOSANT__INTERFACECOMPOSANT);
		}
		return interfacecomposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Propriete> getPropriete() {
		if (propriete == null) {
			propriete = new EObjectContainmentEList<Propriete>(Propriete.class, this, ASAPackage.COMPOSANT__PROPRIETE);
		}
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContrainteTechnique> getContraintetechnique() {
		if (contraintetechnique == null) {
			contraintetechnique = new EObjectContainmentEList<ContrainteTechnique>(ContrainteTechnique.class, this, ASAPackage.COMPOSANT__CONTRAINTETECHNIQUE);
		}
		return contraintetechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASAPackage.COMPOSANT__INTERFACECOMPOSANT:
				return ((InternalEList<?>)getInterfacecomposant()).basicRemove(otherEnd, msgs);
			case ASAPackage.COMPOSANT__PROPRIETE:
				return ((InternalEList<?>)getPropriete()).basicRemove(otherEnd, msgs);
			case ASAPackage.COMPOSANT__CONTRAINTETECHNIQUE:
				return ((InternalEList<?>)getContraintetechnique()).basicRemove(otherEnd, msgs);
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
			case ASAPackage.COMPOSANT__INTERFACECOMPOSANT:
				return getInterfacecomposant();
			case ASAPackage.COMPOSANT__PROPRIETE:
				return getPropriete();
			case ASAPackage.COMPOSANT__CONTRAINTETECHNIQUE:
				return getContraintetechnique();
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
			case ASAPackage.COMPOSANT__INTERFACECOMPOSANT:
				getInterfacecomposant().clear();
				getInterfacecomposant().addAll((Collection<? extends InterfaceComposant>)newValue);
				return;
			case ASAPackage.COMPOSANT__PROPRIETE:
				getPropriete().clear();
				getPropriete().addAll((Collection<? extends Propriete>)newValue);
				return;
			case ASAPackage.COMPOSANT__CONTRAINTETECHNIQUE:
				getContraintetechnique().clear();
				getContraintetechnique().addAll((Collection<? extends ContrainteTechnique>)newValue);
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
			case ASAPackage.COMPOSANT__INTERFACECOMPOSANT:
				getInterfacecomposant().clear();
				return;
			case ASAPackage.COMPOSANT__PROPRIETE:
				getPropriete().clear();
				return;
			case ASAPackage.COMPOSANT__CONTRAINTETECHNIQUE:
				getContraintetechnique().clear();
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
			case ASAPackage.COMPOSANT__INTERFACECOMPOSANT:
				return interfacecomposant != null && !interfacecomposant.isEmpty();
			case ASAPackage.COMPOSANT__PROPRIETE:
				return propriete != null && !propriete.isEmpty();
			case ASAPackage.COMPOSANT__CONTRAINTETECHNIQUE:
				return contraintetechnique != null && !contraintetechnique.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposantImpl
