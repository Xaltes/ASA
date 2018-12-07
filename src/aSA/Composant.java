/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Composant#getInterfacecomposant <em>Interfacecomposant</em>}</li>
 *   <li>{@link aSA.Composant#getPropriete <em>Propriete</em>}</li>
 *   <li>{@link aSA.Composant#getContraintetechnique <em>Contraintetechnique</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getComposant()
 * @model
 * @generated
 */
public interface Composant extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.InterfaceComposant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacecomposant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacecomposant</em>' containment reference list.
	 * @see aSA.ASAPackage#getComposant_Interfacecomposant()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<InterfaceComposant> getInterfacecomposant();

	/**
	 * Returns the value of the '<em><b>Propriete</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Propriete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propriete</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propriete</em>' containment reference list.
	 * @see aSA.ASAPackage#getComposant_Propriete()
	 * @model containment="true"
	 * @generated
	 */
	EList<Propriete> getPropriete();

	/**
	 * Returns the value of the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.ContrainteTechnique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintetechnique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintetechnique</em>' containment reference list.
	 * @see aSA.ASAPackage#getComposant_Contraintetechnique()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContrainteTechnique> getContraintetechnique();

} // Composant
