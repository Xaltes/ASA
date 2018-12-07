/**
 */
package aSA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Binding#getPortcomposant <em>Portcomposant</em>}</li>
 *   <li>{@link aSA.Binding#getPortconfiguration <em>Portconfiguration</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Portcomposant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portcomposant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portcomposant</em>' reference.
	 * @see #setPortcomposant(PortComposant)
	 * @see aSA.ASAPackage#getBinding_Portcomposant()
	 * @model
	 * @generated
	 */
	PortComposant getPortcomposant();

	/**
	 * Sets the value of the '{@link aSA.Binding#getPortcomposant <em>Portcomposant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portcomposant</em>' reference.
	 * @see #getPortcomposant()
	 * @generated
	 */
	void setPortcomposant(PortComposant value);

	/**
	 * Returns the value of the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portconfiguration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portconfiguration</em>' reference.
	 * @see #setPortconfiguration(PortConfiguration)
	 * @see aSA.ASAPackage#getBinding_Portconfiguration()
	 * @model
	 * @generated
	 */
	PortConfiguration getPortconfiguration();

	/**
	 * Sets the value of the '{@link aSA.Binding#getPortconfiguration <em>Portconfiguration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portconfiguration</em>' reference.
	 * @see #getPortconfiguration()
	 * @generated
	 */
	void setPortconfiguration(PortConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PortComposantFourni bindingConfigConponent(PortConfigurationFourni portConfigFourni);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PortConfigurationFourni bindingComponentConfig(PortComposantFourni portCompoFourni);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PortComposantRequis bindingConfigConponent(PortConfigurationRequis portConfigRequis);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PortConfigurationRequis bindingComponentConfig(PortComposantRequis portCompoRequis);

} // Binding
