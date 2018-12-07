/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.InterfaceComposant#getService <em>Service</em>}</li>
 *   <li>{@link aSA.InterfaceComposant#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getInterfaceComposant()
 * @model
 * @generated
 */
public interface InterfaceComposant extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see aSA.ASAPackage#getInterfaceComposant_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.PortComposant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see aSA.ASAPackage#getInterfaceComposant_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortComposant> getPort();

} // InterfaceComposant
