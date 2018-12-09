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

import java.util.ArrayList;

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
	public ComposantSimple createClient(String s, String p, int v) {
		ClientImpl client = new ClientImpl(s, p, v);
		return client;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createServerConfiguration(Binding b1, Binding b2, ArrayList<PortComposantFourni> p1, ArrayList<PortComposantRequis> p2, PortConfigurationRequis p3, PortConfigurationFourni p4, 
			Attachment a1, Attachment a2, Attachment a3, Attachment a4, Attachment a5, Attachment a6, Attachment a7, Attachment a8, Attachment a9, Attachment a10, Attachment a11, Attachment a12) {
		ServerConfigurationImpl serverConfiguration = new ServerConfigurationImpl(b1, b2, p1, p2, p3, p4, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12);
		return serverConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createConnectionManager(PortSQLtoCMImpl p1, 
			PortCMtoSQLImpl p2, 
			PortBindingToCMImpl p3,
			PortCMtoBindingImpl p4,
			PortCRtoCMImpl p5,
			PortCMtoCRImpl p6) {
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl(p1, p2, p3, p4, p5, p6);
		return connectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createDatabase(PortComposantFourni p1, PortComposantRequis p2, PortComposantFourni p3, PortComposantRequis p4) {
		DatabaseImpl database = new DatabaseImpl(p1, p2, p3, p4);
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createSecurityManager(PortComposantFourni p1, PortComposantRequis p2, PortComposantRequis p3, PortComposantFourni p4) {
		SecurityManagerImpl securityManager = new SecurityManagerImpl(p1, p2, p3, p4);
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
	public Attachment createAttachmentClienttoRPC(PortComposantFourni p, RoleRequis r) {
		AttachmentClienttoRPCImpl attachmentClienttoRPC = new AttachmentClienttoRPCImpl(p, r);
		return attachmentClienttoRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createRPCConnectorClientServer(RoleRequis r1, RoleFourni r2) {
		RPCConnectorClientServerImpl rpcConnectorClientServer = new RPCConnectorClientServerImpl(r1, r2);
		return rpcConnectorClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentRPCtoServer(PortComposantRequis p, RoleFourni r) {
		AttachmentRPCtoServerImpl attachmentRPCtoServer = new AttachmentRPCtoServerImpl(p, r);
		return attachmentRPCtoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentServerToRPC(PortComposantFourni p, RoleRequis r) {
		AttachmentServerToRPCImpl attachmentServerToRPC = new AttachmentServerToRPCImpl(p, r);
		return attachmentServerToRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createRPCConnectorServerClient(RoleRequis r1, RoleFourni r2) {
		RPCConnectorServerClientImpl rpcConnectorServerClient = new RPCConnectorServerClientImpl(r1, r2);
		return rpcConnectorServerClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentRPCToClient(PortComposantRequis p, RoleFourni r) {
		AttachmentRPCToClientImpl attachmentRPCToClient = new AttachmentRPCToClientImpl(p, r);
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
	public Connecteur createSQLQueryConnectorOut(RoleRequis r1, RoleFourni r2) {
		SQLQueryConnectorOutImpl sqlQueryConnectorOut = new SQLQueryConnectorOutImpl(r1, r2);
		return sqlQueryConnectorOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createClearanceRequestConnectorIn(RoleFourni r1, RoleRequis r2) {
		ClearanceRequestConnectorInImpl clearanceRequestConnectorIn = new ClearanceRequestConnectorInImpl(r1, r2);
		return clearanceRequestConnectorIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createSecurityQueryConnectorIn(RoleRequis r1, RoleFourni r2) {
		SecurityQueryConnectorInImpl securityQueryConnectorIn = new SecurityQueryConnectorInImpl(r1, r2);
		return securityQueryConnectorIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQLtoDB(PortSQLtoDBImpl portsqltodb2, RoleSQLtoDBImpl rolesqltodb2) {
		AttachmentSQLtoDBImpl attachmentSQLtoDB = new AttachmentSQLtoDBImpl(portsqltodb2, rolesqltodb2);
		return attachmentSQLtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentDBtoSQL(PortDBtoSQLImpl p, RoleSQLfromDBImpl r) {
		AttachmentDBtoSQLImpl attachmentDBtoSQL = new AttachmentDBtoSQLImpl(p, r);
		return attachmentDBtoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQLtoCM(PortComposantRequis p, RoleFourni r) {
		AttachmentSQLtoCMImpl attachmentSQLtoCM = new AttachmentSQLtoCMImpl(p, r);
		return attachmentSQLtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCMtoSQL(PortComposantFourni p, RoleRequis r) {
		AttachmentCMtoSQLImpl attachmentCMtoSQL = new AttachmentCMtoSQLImpl(p, r);
		return attachmentCMtoSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentDBtoSQ(PortDBtoSQImpl portdbtosq2, RoleSQfromDBImpl rolesqfromdb2) {
		AttachmentDBtoSQImpl attachmentDBtoSQ = new AttachmentDBtoSQImpl(portdbtosq2, rolesqfromdb2);
		return attachmentDBtoSQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQtoDB(PortSQtoDBImpl portsqtodb2, RoleSQtoDBImpl rolesqtodb2) {
		AttachmentSQtoDBImpl attachmentSQtoDB = new AttachmentSQtoDBImpl(portsqtodb2, rolesqtodb2);
		return attachmentSQtoDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSQtoSM(PortSQtoSMImpl portsqtosm2, RoleSQtoSMImpl rolesqtosm2) {
		AttachmentSQtoSMImpl attachmentSQtoSM = new AttachmentSQtoSMImpl(portsqtosm2, rolesqtosm2);
		return attachmentSQtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSMtoSQ(PortSMtoSQImpl portsmtosq2, RoleSQfromSMImpl rolesqfromsm2) {
		AttachmentSMtoSQImpl attachmentSMtoSQ = new AttachmentSMtoSQImpl(portsmtosq2, rolesqfromsm2);
		return attachmentSMtoSQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCRtoCM(PortCRtoCMImpl portcrtocm2, RoleCRtoCMImpl rolecrtocm2) {
		AttachmentCRtoCMImpl attachmentCRtoCM = new AttachmentCRtoCMImpl(portcrtocm2, rolecrtocm2);
		return attachmentCRtoCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCMtoCR(PortCMtoCRImpl portcmtocr2, RoleCRfromCMImpl rolecrfromcm2) {
		AttachmentCMtoCRImpl attachmentCMtoCR = new AttachmentCMtoCRImpl(portcmtocr2, rolecrfromcm2);
		return attachmentCMtoCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentSMtoCR(PortSMtoCRImpl portsmtocr2, RoleCRfromSMImpl rolecrfromsm2) {
		AttachmentSMtoCRImpl attachmentSMtoCR = new AttachmentSMtoCRImpl(portsmtocr2, rolecrfromsm2);
		return attachmentSMtoCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentCRtoSM(PortCRtoSMImpl portcrtosm2, RoleCRtoSMImpl rolecrtosm2) {
		AttachmentCRtoSMImpl attachmentCRtoSM = new AttachmentCRtoSMImpl(portcrtosm2, rolecrtosm2);
		return attachmentCRtoSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createSQLQueryConnectorIn(RoleFourni r1, RoleRequis r2) {
		SQLQueryConnectorInImpl sqlQueryConnectorIn = new SQLQueryConnectorInImpl(r1, r2);
		return sqlQueryConnectorIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createSecurityQueryConnectorOut(RoleFourni r1, RoleRequis r2) {
		SecurityQueryConnectorOutImpl securityQueryConnectorOut = new SecurityQueryConnectorOutImpl(r1, r2);
		return securityQueryConnectorOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createClearanceRequestConnectorOut(RoleRequis r1, RoleFourni r2) {
		ClearanceRequestConnectorOutImpl clearanceRequestConnectorOut = new ClearanceRequestConnectorOutImpl(r1, r2);
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
	public Binding createBindingServerToCM(PortComposantRequis p1, PortConfigurationRequis p2) {
		BindingServerToCMImpl bindingServerToCM = new BindingServerToCMImpl(p1, p2);
		return bindingServerToCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBindingCMtoServer(PortComposantFourni p1, PortConfigurationFourni p2) {
		BindingCMtoServerImpl bindingCMtoServer = new BindingCMtoServerImpl(p1, p2);
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
	public Configuration createConfigurationClientServer(ArrayList<PortConfigurationFourni> p1, ArrayList<PortConfigurationRequis> p2, ArrayList<Binding> b1, ArrayList<Binding> b2, ArrayList<Attachment> a1, ArrayList<Attachment> a2, ArrayList<Attachment> a3, ArrayList<Attachment> a4) {
		ConfigurationClientServerImpl configurationClientServer = new ConfigurationClientServerImpl(p1, p2, b1, b2, a1, a2, a3, a4);
		return configurationClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni createPortBindingToConfigClientServer() {
		PortBindingToConfigClientServerImpl portBindingToConfigClientServer = new PortBindingToConfigClientServerImpl();
		return portBindingToConfigClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis createPortConfigClientServerToBinding() {
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
	public Binding createBindingClientToConfigClientServer(PortConfigurationFourni p1, PortComposantFourni p2) {
		BindingClientToConfigClientServerImpl bindingClientToConfigClientServer = new BindingClientToConfigClientServerImpl(p1, p2);
		return bindingClientToConfigClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBindingConfigClientServerToClient(PortComposantRequis p1, PortConfigurationRequis p2) {
		BindingConfigClientServerToClientImpl bindingConfigClientServerToClient = new BindingConfigClientServerToClientImpl(p1, p2);
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
