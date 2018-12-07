/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.InterfaceConnecteur#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getInterfaceConnecteur()
 * @model
 * @generated
 */
public interface InterfaceConnecteur extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see aSA.ASAPackage#getInterfaceConnecteur_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

} // InterfaceConnecteur
