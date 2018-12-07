/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Connecteur#getInterfaceconnecteur <em>Interfaceconnecteur</em>}</li>
 *   <li>{@link aSA.Connecteur#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getConnecteur()
 * @model
 * @generated
 */
public interface Connecteur extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.InterfaceConnecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconnecteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconnecteur</em>' containment reference list.
	 * @see aSA.ASAPackage#getConnecteur_Interfaceconnecteur()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<InterfaceConnecteur> getInterfaceconnecteur();

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference.
	 * @see #setGlue(Glue)
	 * @see aSA.ASAPackage#getConnecteur_Glue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link aSA.Connecteur#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

} // Connecteur
