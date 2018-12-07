/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Configuration#getComposant <em>Composant</em>}</li>
 *   <li>{@link aSA.Configuration#getInterfaceconfiguration <em>Interfaceconfiguration</em>}</li>
 *   <li>{@link aSA.Configuration#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link aSA.Configuration#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Composant {
	/**
	 * Returns the value of the '<em><b>Composant</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Composant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' containment reference list.
	 * @see aSA.ASAPackage#getConfiguration_Composant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Composant> getComposant();

	/**
	 * Returns the value of the '<em><b>Interfaceconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconfiguration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconfiguration</em>' containment reference.
	 * @see #setInterfaceconfiguration(InterfaceConfiguration)
	 * @see aSA.ASAPackage#getConfiguration_Interfaceconfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterfaceConfiguration getInterfaceconfiguration();

	/**
	 * Sets the value of the '{@link aSA.Configuration#getInterfaceconfiguration <em>Interfaceconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaceconfiguration</em>' containment reference.
	 * @see #getInterfaceconfiguration()
	 * @generated
	 */
	void setInterfaceconfiguration(InterfaceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference list.
	 * @see aSA.ASAPackage#getConfiguration_Attachment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getAttachment();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see aSA.ASAPackage#getConfiguration_Binding()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Binding> getBinding();

} // Configuration
