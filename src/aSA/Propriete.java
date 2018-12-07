/**
 */
package aSA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propriete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Propriete#isFonctionnelle <em>Fonctionnelle</em>}</li>
 *   <li>{@link aSA.Propriete#isConfigurable <em>Configurable</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getPropriete()
 * @model
 * @generated
 */
public interface Propriete extends EObject {
	/**
	 * Returns the value of the '<em><b>Fonctionnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonctionnelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonctionnelle</em>' attribute.
	 * @see #setFonctionnelle(boolean)
	 * @see aSA.ASAPackage#getPropriete_Fonctionnelle()
	 * @model
	 * @generated
	 */
	boolean isFonctionnelle();

	/**
	 * Sets the value of the '{@link aSA.Propriete#isFonctionnelle <em>Fonctionnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonctionnelle</em>' attribute.
	 * @see #isFonctionnelle()
	 * @generated
	 */
	void setFonctionnelle(boolean value);

	/**
	 * Returns the value of the '<em><b>Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurable</em>' attribute.
	 * @see #setConfigurable(boolean)
	 * @see aSA.ASAPackage#getPropriete_Configurable()
	 * @model
	 * @generated
	 */
	boolean isConfigurable();

	/**
	 * Sets the value of the '{@link aSA.Propriete#isConfigurable <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurable</em>' attribute.
	 * @see #isConfigurable()
	 * @generated
	 */
	void setConfigurable(boolean value);

} // Propriete
