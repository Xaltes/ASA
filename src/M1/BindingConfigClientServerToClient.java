/**
 */
package M1;

import aSA.Binding;
import aSA.PortComposantRequis;
import aSA.PortConfigurationFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Config Client Server To Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link M1.BindingConfigClientServerToClient#getPortbindingtoclient <em>Portbindingtoclient</em>}</li>
 *   <li>{@link M1.BindingConfigClientServerToClient#getPortconfigclientservertobinding <em>Portconfigclientservertobinding</em>}</li>
 * </ul>
 *
 * @see M1.M1Package#getBindingConfigClientServerToClient()
 * @model
 * @generated
 */
public interface BindingConfigClientServerToClient extends Binding {
	/**
	 * Returns the value of the '<em><b>Portbindingtoclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portbindingtoclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portbindingtoclient</em>' reference.
	 * @see #setPortbindingtoclient(PortComposantRequis)
	 * @see M1.M1Package#getBindingConfigClientServerToClient_Portbindingtoclient()
	 * @model type="M1.PortBindingToClient" required="true"
	 * @generated
	 */
	PortComposantRequis getPortbindingtoclient();

	/**
	 * Sets the value of the '{@link M1.BindingConfigClientServerToClient#getPortbindingtoclient <em>Portbindingtoclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portbindingtoclient</em>' reference.
	 * @see #getPortbindingtoclient()
	 * @generated
	 */
	void setPortbindingtoclient(PortComposantRequis value);

	/**
	 * Returns the value of the '<em><b>Portconfigclientservertobinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portconfigclientservertobinding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portconfigclientservertobinding</em>' reference.
	 * @see #setPortconfigclientservertobinding(PortConfigurationFourni)
	 * @see M1.M1Package#getBindingConfigClientServerToClient_Portconfigclientservertobinding()
	 * @model type="M1.PortConfigClientServerToBinding" required="true"
	 * @generated
	 */
	PortConfigurationFourni getPortconfigclientservertobinding();

	/**
	 * Sets the value of the '{@link M1.BindingConfigClientServerToClient#getPortconfigclientservertobinding <em>Portconfigclientservertobinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portconfigclientservertobinding</em>' reference.
	 * @see #getPortconfigclientservertobinding()
	 * @generated
	 */
	void setPortconfigclientservertobinding(PortConfigurationFourni value);

} // BindingConfigClientServerToClient
