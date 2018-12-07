/**
 */
package M1;

import aSA.RoleFourni;
import aSA.RoleRequis;

import aSA.Attachment;
import aSA.Binding;
import aSA.ComposantSimple;
import aSA.Configuration;
import aSA.Connecteur;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see M1.M1Package
 * @generated
 */
public interface M1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M1Factory eINSTANCE = M1.impl.M1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	ComposantSimple createClient();

	/**
	 * Returns a new object of class '<em>Server Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Configuration</em>'.
	 * @generated
	 */
	Configuration createServerConfiguration();

	/**
	 * Returns a new object of class '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Manager</em>'.
	 * @generated
	 */
	ComposantSimple createConnectionManager();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	ComposantSimple createDatabase();

	/**
	 * Returns a new object of class '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Manager</em>'.
	 * @generated
	 */
	ComposantSimple createSecurityManager();

	/**
	 * Returns a new object of class '<em>Port Clientto RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Clientto RPC</em>'.
	 * @generated
	 */
	PortComposantFourni createPortClienttoRPC();

	/**
	 * Returns a new object of class '<em>Port RP Cto Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port RP Cto Client</em>'.
	 * @generated
	 */
	PortComposantRequis createPortRPCtoClient();

	/**
	 * Returns a new object of class '<em>Port RP Cto Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port RP Cto Server</em>'.
	 * @generated
	 */
	PortComposantRequis createPortRPCtoServer();

	/**
	 * Returns a new object of class '<em>Port Server To RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Server To RPC</em>'.
	 * @generated
	 */
	PortComposantFourni createPortServerToRPC();

	/**
	 * Returns a new object of class '<em>Attachment Clientto RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Clientto RPC</em>'.
	 * @generated
	 */
	Attachment createAttachmentClienttoRPC();

	/**
	 * Returns a new object of class '<em>RPC Connector Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC Connector Client Server</em>'.
	 * @generated
	 */
	Connecteur createRPCConnectorClientServer();

	/**
	 * Returns a new object of class '<em>Attachment RP Cto Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment RP Cto Server</em>'.
	 * @generated
	 */
	Attachment createAttachmentRPCtoServer();

	/**
	 * Returns a new object of class '<em>Attachment Server To RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Server To RPC</em>'.
	 * @generated
	 */
	Attachment createAttachmentServerToRPC();

	/**
	 * Returns a new object of class '<em>RPC Connector Server Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC Connector Server Client</em>'.
	 * @generated
	 */
	Connecteur createRPCConnectorServerClient();

	/**
	 * Returns a new object of class '<em>Attachment RPC To Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment RPC To Client</em>'.
	 * @generated
	 */
	Attachment createAttachmentRPCToClient();

	/**
	 * Returns a new object of class '<em>Port SQ Lto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port SQ Lto CM</em>'.
	 * @generated
	 */
	PortComposantRequis createPortSQLtoCM();

	/**
	 * Returns a new object of class '<em>Port CMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port CMto CR</em>'.
	 * @generated
	 */
	PortComposantFourni createPortCMtoCR();

	/**
	 * Returns a new object of class '<em>Port CRto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port CRto SM</em>'.
	 * @generated
	 */
	PortComposantRequis createPortCRtoSM();

	/**
	 * Returns a new object of class '<em>Port SMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port SMto CR</em>'.
	 * @generated
	 */
	PortComposantFourni createPortSMtoCR();

	/**
	 * Returns a new object of class '<em>Port SQto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port SQto DB</em>'.
	 * @generated
	 */
	PortComposantRequis createPortSQtoDB();

	/**
	 * Returns a new object of class '<em>Port CRto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port CRto CM</em>'.
	 * @generated
	 */
	PortComposantRequis createPortCRtoCM();

	/**
	 * Returns a new object of class '<em>Port CMto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port CMto SQL</em>'.
	 * @generated
	 */
	PortComposantFourni createPortCMtoSQL();

	/**
	 * Returns a new object of class '<em>Port DBto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port DBto SQ</em>'.
	 * @generated
	 */
	PortComposantFourni createPortDBtoSQ();

	/**
	 * Returns a new object of class '<em>Port DBto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port DBto SQL</em>'.
	 * @generated
	 */
	PortComposantFourni createPortDBtoSQL();

	/**
	 * Returns a new object of class '<em>Port SQ Lto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port SQ Lto DB</em>'.
	 * @generated
	 */
	PortComposantRequis createPortSQLtoDB();

	/**
	 * Returns a new object of class '<em>SQL Query Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQL Query Connector Out</em>'.
	 * @generated
	 */
	Connecteur createSQLQueryConnectorOut();

	/**
	 * Returns a new object of class '<em>Clearance Request Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearance Request Connector In</em>'.
	 * @generated
	 */
	Connecteur createClearanceRequestConnectorIn();

	/**
	 * Returns a new object of class '<em>Security Query Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Query Connector In</em>'.
	 * @generated
	 */
	Connecteur createSecurityQueryConnectorIn();

	/**
	 * Returns a new object of class '<em>Attachment SQ Lto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQ Lto DB</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQLtoDB();

	/**
	 * Returns a new object of class '<em>Attachment DBto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment DBto SQL</em>'.
	 * @generated
	 */
	Attachment createAttachmentDBtoSQL();

	/**
	 * Returns a new object of class '<em>Attachment SQ Lto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQ Lto CM</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQLtoCM();

	/**
	 * Returns a new object of class '<em>Attachment CMto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CMto SQL</em>'.
	 * @generated
	 */
	Attachment createAttachmentCMtoSQL();

	/**
	 * Returns a new object of class '<em>Attachment DBto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment DBto SQ</em>'.
	 * @generated
	 */
	Attachment createAttachmentDBtoSQ();

	/**
	 * Returns a new object of class '<em>Attachment SQto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQto DB</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQtoDB();

	/**
	 * Returns a new object of class '<em>Attachment SQto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQto SM</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQtoSM();

	/**
	 * Returns a new object of class '<em>Attachment SMto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SMto SQ</em>'.
	 * @generated
	 */
	Attachment createAttachmentSMtoSQ();

	/**
	 * Returns a new object of class '<em>Attachment CRto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CRto CM</em>'.
	 * @generated
	 */
	Attachment createAttachmentCRtoCM();

	/**
	 * Returns a new object of class '<em>Attachment CMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CMto CR</em>'.
	 * @generated
	 */
	Attachment createAttachmentCMtoCR();

	/**
	 * Returns a new object of class '<em>Attachment SMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SMto CR</em>'.
	 * @generated
	 */
	Attachment createAttachmentSMtoCR();

	/**
	 * Returns a new object of class '<em>Attachment CRto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CRto SM</em>'.
	 * @generated
	 */
	Attachment createAttachmentCRtoSM();

	/**
	 * Returns a new object of class '<em>SQL Query Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQL Query Connector In</em>'.
	 * @generated
	 */
	Connecteur createSQLQueryConnectorIn();

	/**
	 * Returns a new object of class '<em>Security Query Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Query Connector Out</em>'.
	 * @generated
	 */
	Connecteur createSecurityQueryConnectorOut();

	/**
	 * Returns a new object of class '<em>Clearance Request Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearance Request Connector Out</em>'.
	 * @generated
	 */
	Connecteur createClearanceRequestConnectorOut();

	/**
	 * Returns a new object of class '<em>Port SQto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port SQto SM</em>'.
	 * @generated
	 */
	PortComposantRequis createPortSQtoSM();

	/**
	 * Returns a new object of class '<em>Port SMto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port SMto SQ</em>'.
	 * @generated
	 */
	PortComposantFourni createPortSMtoSQ();

	/**
	 * Returns a new object of class '<em>Port Server To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Server To Binding</em>'.
	 * @generated
	 */
	PortConfigurationRequis createPortServerToBinding();

	/**
	 * Returns a new object of class '<em>Port Binding To Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Binding To Server</em>'.
	 * @generated
	 */
	PortConfigurationFourni createPortBindingToServer();

	/**
	 * Returns a new object of class '<em>Port Binding To CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Binding To CM</em>'.
	 * @generated
	 */
	PortComposantRequis createPortBindingToCM();

	/**
	 * Returns a new object of class '<em>Port CMto Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port CMto Binding</em>'.
	 * @generated
	 */
	PortComposantFourni createPortCMtoBinding();

	/**
	 * Returns a new object of class '<em>Binding Server To CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Server To CM</em>'.
	 * @generated
	 */
	Binding createBindingServerToCM();

	/**
	 * Returns a new object of class '<em>Binding CMto Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding CMto Server</em>'.
	 * @generated
	 */
	Binding createBindingCMtoServer();

	/**
	 * Returns a new object of class '<em>Role RP Cfrom Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role RP Cfrom Client</em>'.
	 * @generated
	 */
	RoleRequis createRoleRPCfromClient();

	/**
	 * Returns a new object of class '<em>Role RP Cto Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role RP Cto Client</em>'.
	 * @generated
	 */
	RoleFourni createRoleRPCtoClient();

	/**
	 * Returns a new object of class '<em>Role RP Cto Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role RP Cto Server</em>'.
	 * @generated
	 */
	RoleFourni createRoleRPCtoServer();

	/**
	 * Returns a new object of class '<em>Role RP Cfrom Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role RP Cfrom Server</em>'.
	 * @generated
	 */
	RoleRequis createRoleRPCfromServer();

	/**
	 * Returns a new object of class '<em>Role SQ Lto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQ Lto DB</em>'.
	 * @generated
	 */
	RoleFourni createRoleSQLtoDB();

	/**
	 * Returns a new object of class '<em>Role SQ Lfrom DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQ Lfrom DB</em>'.
	 * @generated
	 */
	RoleRequis createRoleSQLfromDB();

	/**
	 * Returns a new object of class '<em>Role SQ Lto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQ Lto CM</em>'.
	 * @generated
	 */
	RoleFourni createRoleSQLtoCM();

	/**
	 * Returns a new object of class '<em>Role SQ Lfrom CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQ Lfrom CM</em>'.
	 * @generated
	 */
	RoleRequis createRoleSQLfromCM();

	/**
	 * Returns a new object of class '<em>Role SQfrom DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQfrom DB</em>'.
	 * @generated
	 */
	RoleFourni createRoleSQfromDB();

	/**
	 * Returns a new object of class '<em>Role SQto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQto DB</em>'.
	 * @generated
	 */
	RoleRequis createRoleSQtoDB();

	/**
	 * Returns a new object of class '<em>Role SQto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQto SM</em>'.
	 * @generated
	 */
	RoleRequis createRoleSQtoSM();

	/**
	 * Returns a new object of class '<em>Role SQfrom SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role SQfrom SM</em>'.
	 * @generated
	 */
	RoleFourni createRoleSQfromSM();

	/**
	 * Returns a new object of class '<em>Role CRto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role CRto CM</em>'.
	 * @generated
	 */
	RoleRequis createRoleCRtoCM();

	/**
	 * Returns a new object of class '<em>Role CRfrom SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role CRfrom SM</em>'.
	 * @generated
	 */
	RoleFourni createRoleCRfromSM();

	/**
	 * Returns a new object of class '<em>Role CRto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role CRto SM</em>'.
	 * @generated
	 */
	RoleRequis createRoleCRtoSM();

	/**
	 * Returns a new object of class '<em>Role CRfrom CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role CRfrom CM</em>'.
	 * @generated
	 */
	RoleFourni createRoleCRfromCM();

	/**
	 * Returns a new object of class '<em>Configuration Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Client Server</em>'.
	 * @generated
	 */
	aSA.Configuration createConfigurationClientServer();

	/**
	 * Returns a new object of class '<em>Port Binding To Config Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Binding To Config Client Server</em>'.
	 * @generated
	 */
	PortConfigurationRequis createPortBindingToConfigClientServer();

	/**
	 * Returns a new object of class '<em>Port Config Client Server To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Config Client Server To Binding</em>'.
	 * @generated
	 */
	PortConfigurationFourni createPortConfigClientServerToBinding();

	/**
	 * Returns a new object of class '<em>Port Client To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Client To Binding</em>'.
	 * @generated
	 */
	PortComposantFourni createPortClientToBinding();

	/**
	 * Returns a new object of class '<em>Port Binding To Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Binding To Client</em>'.
	 * @generated
	 */
	PortComposantRequis createPortBindingToClient();

	/**
	 * Returns a new object of class '<em>Binding Client To Config Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Client To Config Client Server</em>'.
	 * @generated
	 */
	BindingClientToConfigClientServer createBindingClientToConfigClientServer();

	/**
	 * Returns a new object of class '<em>Binding Config Client Server To Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Config Client Server To Client</em>'.
	 * @generated
	 */
	BindingConfigClientServerToClient createBindingConfigClientServerToClient();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	M1Package getM1Package();

} //M1Factory
