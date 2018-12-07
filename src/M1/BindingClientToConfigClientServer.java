/**
 */
package M1;

import aSA.Binding;
import aSA.PortComposantFourni;
import aSA.PortConfigurationRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Client To Config Client Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link M1.BindingClientToConfigClientServer#getPortbindingtoconfigclientserver <em>Portbindingtoconfigclientserver</em>}</li>
 *   <li>{@link M1.BindingClientToConfigClientServer#getPortclienttobinding <em>Portclienttobinding</em>}</li>
 * </ul>
 *
 * @see M1.M1Package#getBindingClientToConfigClientServer()
 * @model
 * @generated
 */
public interface BindingClientToConfigClientServer extends Binding {
	/**
	 * Returns the value of the '<em><b>Portbindingtoconfigclientserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portbindingtoconfigclientserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portbindingtoconfigclientserver</em>' reference.
	 * @see #setPortbindingtoconfigclientserver(PortConfigurationRequis)
	 * @see M1.M1Package#getBindingClientToConfigClientServer_Portbindingtoconfigclientserver()
	 * @model type="M1.PortBindingToConfigClientServer" required="true"
	 * @generated
	 */
	PortConfigurationRequis getPortbindingtoconfigclientserver();

	/**
	 * Sets the value of the '{@link M1.BindingClientToConfigClientServer#getPortbindingtoconfigclientserver <em>Portbindingtoconfigclientserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portbindingtoconfigclientserver</em>' reference.
	 * @see #getPortbindingtoconfigclientserver()
	 * @generated
	 */
	void setPortbindingtoconfigclientserver(PortConfigurationRequis value);

	/**
	 * Returns the value of the '<em><b>Portclienttobinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portclienttobinding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portclienttobinding</em>' reference.
	 * @see #setPortclienttobinding(PortComposantFourni)
	 * @see M1.M1Package#getBindingClientToConfigClientServer_Portclienttobinding()
	 * @model type="M1.PortClientToBinding" required="true"
	 * @generated
	 */
	PortComposantFourni getPortclienttobinding();

	/**
	 * Sets the value of the '{@link M1.BindingClientToConfigClientServer#getPortclienttobinding <em>Portclienttobinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portclienttobinding</em>' reference.
	 * @see #getPortclienttobinding()
	 * @generated
	 */
	void setPortclienttobinding(PortComposantFourni value);

} // BindingClientToConfigClientServer
