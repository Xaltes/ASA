/**
 */
package M1.impl;

import M1.M1Factory;
import M1.M1Package;

import aSA.Attachment;
import aSA.Binding;
import aSA.ComposantSimple;
import aSA.Configuration;
import aSA.Connecteur;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;
import aSA.RoleFourni;
import aSA.RoleRequis;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M1FactoryImpl extends EFactoryImpl implements M1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static M1Factory init() {
		try {
			M1Factory theM1Factory = (M1Factory)EPackage.Registry.INSTANCE.getEFactory(M1Package.eNS_URI);
			if (theM1Factory != null) {
				return theM1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new M1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case M1Package.CLIENT: return (EObject)createClient();
			case M1Package.SERVER_CONFIGURATION: return (EObject)createServerConfiguration();
			case M1Package.CONNECTION_MANAGER: return (EObject)createConnectionManager();
			case M1Package.DATABASE: return (EObject)createDatabase();
			case M1Package.SECURITY_MANAGER: return (EObject)createSecurityManager();
			case M1Package.PORT_CLIENTTO_RPC: return (EObject)createPortClienttoRPC();
			case M1Package.PORT_RP_CTO_CLIENT: return (EObject)createPortRPCtoClient();
			case M1Package.PORT_RP_CTO_SERVER: return (EObject)createPortRPCtoServer();
			case M1Package.PORT_SERVER_TO_RPC: return (EObject)createPortServerToRPC();
			case M1Package.ATTACHMENT_CLIENTTO_RPC: return (EObject)createAttachmentClienttoRPC();
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER: return (EObject)createRPCConnectorClientServer();
			case M1Package.ATTACHMENT_RP_CTO_SERVER: return (EObject)createAttachmentRPCtoServer();
			case M1Package.ATTACHMENT_SERVER_TO_RPC: return (EObject)createAttachmentServerToRPC();
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT: return (EObject)createRPCConnectorServerClient();
			case M1Package.ATTACHMENT_RPC_TO_CLIENT: return (EObject)createAttachmentRPCToClient();
			case M1Package.PORT_SQ_LTO_CM: return (EObject)createPortSQLtoCM();
			case M1Package.PORT_CMTO_CR: return (EObject)createPortCMtoCR();
			case M1Package.PORT_CRTO_SM: return (EObject)createPortCRtoSM();
			case M1Package.PORT_SMTO_CR: return (EObject)createPortSMtoCR();
			case M1Package.PORT_SQTO_DB: return (EObject)createPortSQtoDB();
			case M1Package.PORT_CRTO_CM: return (EObject)createPortCRtoCM();
			case M1Package.PORT_CMTO_SQL: return (EObject)createPortCMtoSQL();
			case M1Package.PORT_DBTO_SQ: return (EObject)createPortDBtoSQ();
			case M1Package.PORT_DBTO_SQL: return (EObject)createPortDBtoSQL();
			case M1Package.PORT_SQ_LTO_DB: return (EObject)createPortSQLtoDB();
			case M1Package.SQL_QUERY_CONNECTOR_OUT: return (EObject)createSQLQueryConnectorOut();
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN: return (EObject)createClearanceRequestConnectorIn();
			case M1Package.SECURITY_QUERY_CONNECTOR_IN: return (EObject)createSecurityQueryConnectorIn();
			case M1Package.ATTACHMENT_SQ_LTO_DB: return (EObject)createAttachmentSQLtoDB();
			case M1Package.ATTACHMENT_DBTO_SQL: return (EObject)createAttachmentDBtoSQL();
			case M1Package.ATTACHMENT_SQ_LTO_CM: return (EObject)createAttachmentSQLtoCM();
			case M1Package.ATTACHMENT_CMTO_SQL: return (EObject)createAttachmentCMtoSQL();
			case M1Package.ATTACHMENT_DBTO_SQ: return (EObject)createAttachmentDBtoSQ();
			case M1Package.ATTACHMENT_SQTO_DB: return (EObject)createAttachmentSQtoDB();
			case M1Package.ATTACHMENT_SQTO_SM: return (EObject)createAttachmentSQtoSM();
			case M1Package.ATTACHMENT_SMTO_SQ: return (EObject)createAttachmentSMtoSQ();
			case M1Package.ATTACHMENT_CRTO_CM: return (EObject)createAttachmentCRtoCM();
			case M1Package.ATTACHMENT_CMTO_CR: return (EObject)createAttachmentCMtoCR();
			case M1Package.ATTACHMENT_SMTO_CR: return (EObject)createAttachmentSMtoCR();
			case M1Package.ATTACHMENT_CRTO_SM: return (EObject)createAttachmentCRtoSM();
			case M1Package.SQL_QUERY_CONNECTOR_IN: return (EObject)createSQLQueryConnectorIn();
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT: return (EObject)createSecurityQueryConnectorOut();
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT: return (EObject)createClearanceRequestConnectorOut();
			case M1Package.PORT_SQTO_SM: return (EObject)createPortSQtoSM();
			case M1Package.PORT_SMTO_SQ: return (EObject)createPortSMtoSQ();
			case M1Package.PORT_SERVER_TO_BINDING: return (EObject)createPortServerToBinding();
			case M1Package.PORT_BINDING_TO_SERVER: return (EObject)createPortBindingToServer();
			case M1Package.PORT_BINDING_TO_CM: return (EObject)createPortBindingToCM();
			case M1Package.PORT_CMTO_BINDING: return (EObject)createPortCMtoBinding();
			case M1Package.BINDING_SERVER_TO_CM: return (EObject)createBindingServerToCM();
			case M1Package.BINDING_CMTO_SERVER: return (EObject)createBindingCMtoServer();
			case M1Package.ROLE_RP_CFROM_CLIENT: return (EObject)createRoleRPCfromClient();
			case M1Package.ROLE_RP_CTO_CLIENT: return (EObject)createRoleRPCtoClient();
			case M1Package.ROLE_RP_CTO_SERVER: return (EObject)createRoleRPCtoServer();
			case M1Package.ROLE_RP_CFROM_SERVER: return (EObject)createRoleRPCfromServer();
			case M1Package.ROLE_SQ_LTO_DB: return (EObject)createRoleSQLtoDB();
			case M1Package.ROLE_SQ_LFROM_DB: return (EObject)createRoleSQLfromDB();
			case M1Package.ROLE_SQ_LTO_CM: return (EObject)createRoleSQLtoCM();
			case M1Package.ROLE_SQ_LFROM_CM: return (EObject)createRoleSQLfromCM();
			case M1Package.ROLE_SQFROM_DB: return (EObject)createRoleSQfromDB();
			case M1Package.ROLE_SQTO_DB: return (EObject)createRoleSQtoDB();
			case M1Package.ROLE_SQTO_SM: return (EObject)createRoleSQtoSM();
			case M1Package.ROLE_SQFROM_SM: return (EObject)createRoleSQfromSM();
			case M1Package.ROLE_CRTO_CM: return (EObject)createRoleCRtoCM();
			case M1Package.ROLE_CRFROM_SM: return (EObject)createRoleCRfromSM();
			case M1Package.ROLE_CRTO_SM: return (EObject)createRoleCRtoSM();
			case M1Package.ROLE_CRFROM_CM: return (EObject)createRoleCRfromCM();
			case M1Package.CONFIGURATION_CLIENT_SERVER: return (EObject)createConfigurationClientServer();
			case M1Package.PORT_BINDING_TO_CONFIG_CLIENT_SERVER: return (EObject)createPortBindingToConfigClientServer();
			case M1Package.PORT_CONFIG_CLIENT_SERVER_TO_BINDING: return (EObject)createPortConfigClientServerToBinding();
			case M1Package.PORT_CLIENT_TO_BINDING: return (EObject)createPortClientToBinding();
			case M1Package.PORT_BINDING_TO_CLIENT: return (EObject)createPortBindingToClient();
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER: return (EObject)createBindingClientToConfigClientServer();
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT: return (EObject)createBindingConfigClientServerToClient();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createServerConfiguration() {
		ServerConfigurationImpl serverConfiguration = new ServerConfigurationImpl();
		return serverConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createConnectionManager() {
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl();
		return connectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createSecurityManager() {
		SecurityManagerImpl securityManager = new SecurityManagerImpl();
		return securityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortClienttoRPC() {
		PortClienttoRPCImpl portClienttoRPC = new PortClienttoRPCImpl();
		return portClienttoRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortRPCtoClient() {
		PortRPCtoClientImpl portRPCtoClient = new PortRPCtoClientImpl();
		return portRPCtoClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortRPCtoServer() {
		PortRPCtoServerImpl portRPCtoServer = new PortRPCtoServerImpl();
		return portRPCtoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortServerToRPC() {
		PortServerToRPCImpl portServerToRPC = new PortServerToRPCImpl();
		return portServerToRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentClienttoRPC() {
		AttachmentClienttoRPCImpl attachmentClienttoRPC = new AttachmentClienttoRPCImpl();
		return attachmentClienttoRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createRPCConnectorClientServer() {
		RPCConnectorClientServerImpl rpcConnectorClientServer = new RPCConnectorClientServerImpl();
		return rpcConnectorClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentRPCtoServer() {
		AttachmentRPCtoServerImpl attachmentRPCtoServer = new AttachmentRPCtoServerImpl();
		return attachmentRPCtoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentServerToRPC() {
		AttachmentServerToRPCImpl attachmentServerToRPC = new AttachmentServerToRPCImpl();
		return attachmentServerToRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createRPCConnectorServerClient() {
		RPCConnectorServerClientImpl rpcConnectorServerClient = new RPCConnectorServerClientImpl();
		return rpcConnectorServerClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentRPCToClient() {
		AttachmentRPCToClientImpl attachmentRPCToClient = new AttachmentRPCToClientImpl();
		return attachmentRPCToClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortSQLtoCM() {
		PortSQLtoCMImpl portSQLtoCM = new PortSQLtoCMImpl();
		return portSQLtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortCMtoCR() {
		PortCMtoCRImpl portCMtoCR = new PortCMtoCRImpl();
		return portCMtoCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortCRtoSM() {
		PortCRtoSMImpl portCRtoSM = new PortCRtoSMImpl();
		return portCRtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortSMtoCR() {
		PortSMtoCRImpl portSMtoCR = new PortSMtoCRImpl();
		return portSMtoCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortSQtoDB() {
		PortSQtoDBImpl portSQtoDB = new PortSQtoDBImpl();
		return portSQtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortCRtoCM() {
		PortCRtoCMImpl portCRtoCM = new PortCRtoCMImpl();
		return portCRtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortCMtoSQL() {
		PortCMtoSQLImpl portCMtoSQL = new PortCMtoSQLImpl();
		return portCMtoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortDBtoSQ() {
		PortDBtoSQImpl portDBtoSQ = new PortDBtoSQImpl();
		return portDBtoSQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortDBtoSQL() {
		PortDBtoSQLImpl portDBtoSQL = new PortDBtoSQLImpl();
		return portDBtoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortSQLtoDB() {
		PortSQLtoDBImpl portSQLtoDB = new PortSQLtoDBImpl();
		return portSQLtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createSQLQueryConnectorOut() {
		SQLQueryConnectorOutImpl sqlQueryConnectorOut = new SQLQueryConnectorOutImpl();
		return sqlQueryConnectorOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createClearanceRequestConnectorIn() {
		ClearanceRequestConnectorInImpl clearanceRequestConnectorIn = new ClearanceRequestConnectorInImpl();
		return clearanceRequestConnectorIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createSecurityQueryConnectorIn() {
		SecurityQueryConnectorInImpl securityQueryConnectorIn = new SecurityQueryConnectorInImpl();
		return securityQueryConnectorIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQLtoDB() {
		AttachmentSQLtoDBImpl attachmentSQLtoDB = new AttachmentSQLtoDBImpl();
		return attachmentSQLtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentDBtoSQL() {
		AttachmentDBtoSQLImpl attachmentDBtoSQL = new AttachmentDBtoSQLImpl();
		return attachmentDBtoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQLtoCM() {
		AttachmentSQLtoCMImpl attachmentSQLtoCM = new AttachmentSQLtoCMImpl();
		return attachmentSQLtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCMtoSQL() {
		AttachmentCMtoSQLImpl attachmentCMtoSQL = new AttachmentCMtoSQLImpl();
		return attachmentCMtoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentDBtoSQ() {
		AttachmentDBtoSQImpl attachmentDBtoSQ = new AttachmentDBtoSQImpl();
		return attachmentDBtoSQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQtoDB() {
		AttachmentSQtoDBImpl attachmentSQtoDB = new AttachmentSQtoDBImpl();
		return attachmentSQtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQtoSM() {
		AttachmentSQtoSMImpl attachmentSQtoSM = new AttachmentSQtoSMImpl();
		return attachmentSQtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSMtoSQ() {
		AttachmentSMtoSQImpl attachmentSMtoSQ = new AttachmentSMtoSQImpl();
		return attachmentSMtoSQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCRtoCM() {
		AttachmentCRtoCMImpl attachmentCRtoCM = new AttachmentCRtoCMImpl();
		return attachmentCRtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCMtoCR() {
		AttachmentCMtoCRImpl attachmentCMtoCR = new AttachmentCMtoCRImpl();
		return attachmentCMtoCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSMtoCR() {
		AttachmentSMtoCRImpl attachmentSMtoCR = new AttachmentSMtoCRImpl();
		return attachmentSMtoCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCRtoSM() {
		AttachmentCRtoSMImpl attachmentCRtoSM = new AttachmentCRtoSMImpl();
		return attachmentCRtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createSQLQueryConnectorIn() {
		SQLQueryConnectorInImpl sqlQueryConnectorIn = new SQLQueryConnectorInImpl();
		return sqlQueryConnectorIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createSecurityQueryConnectorOut() {
		SecurityQueryConnectorOutImpl securityQueryConnectorOut = new SecurityQueryConnectorOutImpl();
		return securityQueryConnectorOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createClearanceRequestConnectorOut() {
		ClearanceRequestConnectorOutImpl clearanceRequestConnectorOut = new ClearanceRequestConnectorOutImpl();
		return clearanceRequestConnectorOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortSQtoSM() {
		PortSQtoSMImpl portSQtoSM = new PortSQtoSMImpl();
		return portSQtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortSMtoSQ() {
		PortSMtoSQImpl portSMtoSQ = new PortSMtoSQImpl();
		return portSMtoSQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis createPortServerToBinding() {
		PortServerToBindingImpl portServerToBinding = new PortServerToBindingImpl();
		return portServerToBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni createPortBindingToServer() {
		PortBindingToServerImpl portBindingToServer = new PortBindingToServerImpl();
		return portBindingToServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortBindingToCM() {
		PortBindingToCMImpl portBindingToCM = new PortBindingToCMImpl();
		return portBindingToCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortCMtoBinding() {
		PortCMtoBindingImpl portCMtoBinding = new PortCMtoBindingImpl();
		return portCMtoBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBindingServerToCM() {
		BindingServerToCMImpl bindingServerToCM = new BindingServerToCMImpl();
		return bindingServerToCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBindingCMtoServer() {
		BindingCMtoServerImpl bindingCMtoServer = new BindingCMtoServerImpl();
		return bindingCMtoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleRPCfromClient() {
		RoleRPCfromClientImpl roleRPCfromClient = new RoleRPCfromClientImpl();
		return roleRPCfromClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleRPCtoClient() {
		RoleRPCtoClientImpl roleRPCtoClient = new RoleRPCtoClientImpl();
		return roleRPCtoClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleRPCtoServer() {
		RoleRPCtoServerImpl roleRPCtoServer = new RoleRPCtoServerImpl();
		return roleRPCtoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleRPCfromServer() {
		RoleRPCfromServerImpl roleRPCfromServer = new RoleRPCfromServerImpl();
		return roleRPCfromServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleSQLtoDB() {
		RoleSQLtoDBImpl roleSQLtoDB = new RoleSQLtoDBImpl();
		return roleSQLtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleSQLfromDB() {
		RoleSQLfromDBImpl roleSQLfromDB = new RoleSQLfromDBImpl();
		return roleSQLfromDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleSQLtoCM() {
		RoleSQLtoCMImpl roleSQLtoCM = new RoleSQLtoCMImpl();
		return roleSQLtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleSQLfromCM() {
		RoleSQLfromCMImpl roleSQLfromCM = new RoleSQLfromCMImpl();
		return roleSQLfromCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleSQfromDB() {
		RoleSQfromDBImpl roleSQfromDB = new RoleSQfromDBImpl();
		return roleSQfromDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleSQtoDB() {
		RoleSQtoDBImpl roleSQtoDB = new RoleSQtoDBImpl();
		return roleSQtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleSQtoSM() {
		RoleSQtoSMImpl roleSQtoSM = new RoleSQtoSMImpl();
		return roleSQtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleSQfromSM() {
		RoleSQfromSMImpl roleSQfromSM = new RoleSQfromSMImpl();
		return roleSQfromSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleCRtoCM() {
		RoleCRtoCMImpl roleCRtoCM = new RoleCRtoCMImpl();
		return roleCRtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleCRfromSM() {
		RoleCRfromSMImpl roleCRfromSM = new RoleCRfromSMImpl();
		return roleCRfromSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleCRtoSM() {
		RoleCRtoSMImpl roleCRtoSM = new RoleCRtoSMImpl();
		return roleCRtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleCRfromCM() {
		RoleCRfromCMImpl roleCRfromCM = new RoleCRfromCMImpl();
		return roleCRfromCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfigurationClientServer() {
		ConfigurationClientServerImpl configurationClientServer = new ConfigurationClientServerImpl();
		return configurationClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis createPortBindingToConfigClientServer() {
		PortBindingToConfigClientServerImpl portBindingToConfigClientServer = new PortBindingToConfigClientServerImpl();
		return portBindingToConfigClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni createPortConfigClientServerToBinding() {
		PortConfigClientServerToBindingImpl portConfigClientServerToBinding = new PortConfigClientServerToBindingImpl();
		return portConfigClientServerToBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortClientToBinding() {
		PortClientToBindingImpl portClientToBinding = new PortClientToBindingImpl();
		return portClientToBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortBindingToClient() {
		PortBindingToClientImpl portBindingToClient = new PortBindingToClientImpl();
		return portBindingToClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBindingClientToConfigClientServer() {
		BindingClientToConfigClientServerImpl bindingClientToConfigClientServer = new BindingClientToConfigClientServerImpl();
		return bindingClientToConfigClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBindingConfigClientServerToClient() {
		BindingConfigClientServerToClientImpl bindingConfigClientServerToClient = new BindingConfigClientServerToClientImpl();
		return bindingConfigClientServerToClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1Package getM1Package() {
		return (M1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static M1Package getPackage() {
		return M1Package.eINSTANCE;
	}

} //M1FactoryImpl
