/**
 */
package M1.util;

import M1.BindingClientToConfigClientServer;
import M1.BindingConfigClientServerToClient;
import M1.M1Package;

import aSA.RoleFourni;
import aSA.RoleRequis;

import aSA.Attachment;
import aSA.Binding;
import aSA.Composant;
import aSA.ComposantSimple;
import aSA.Configuration;
import aSA.Connecteur;
import aSA.PortComposant;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.PortConfiguration;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;
import aSA.Role;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see M1.M1Package
 * @generated
 */
public class M1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static M1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1Switch() {
		if (modelPackage == null) {
			modelPackage = M1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given 
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case M1Package.CLIENT: {
				ComposantSimple client = (ComposantSimple)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseComposantSimple(client);
				if (result == null) result = caseComposant(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.SERVER_CONFIGURATION: {
				Configuration serverConfiguration = (Configuration)theEObject;
				T result = caseServerConfiguration(serverConfiguration);
				if (result == null) result = caseConfiguration(serverConfiguration);
				if (result == null) result = caseComposant(serverConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.CONNECTION_MANAGER: {
				ComposantSimple connectionManager = (ComposantSimple)theEObject;
				T result = caseConnectionManager(connectionManager);
				if (result == null) result = caseComposantSimple(connectionManager);
				if (result == null) result = caseComposant(connectionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.DATABASE: {
				ComposantSimple database = (ComposantSimple)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseComposantSimple(database);
				if (result == null) result = caseComposant(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.SECURITY_MANAGER: {
				ComposantSimple securityManager = (ComposantSimple)theEObject;
				T result = caseSecurityManager(securityManager);
				if (result == null) result = caseComposantSimple(securityManager);
				if (result == null) result = caseComposant(securityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CLIENTTO_RPC: {
				PortComposantFourni portClienttoRPC = (PortComposantFourni)theEObject;
				T result = casePortClienttoRPC(portClienttoRPC);
				if (result == null) result = casePortComposantFourni(portClienttoRPC);
				if (result == null) result = casePortComposant(portClienttoRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_RP_CTO_CLIENT: {
				PortComposantRequis portRPCtoClient = (PortComposantRequis)theEObject;
				T result = casePortRPCtoClient(portRPCtoClient);
				if (result == null) result = casePortComposantRequis(portRPCtoClient);
				if (result == null) result = casePortComposant(portRPCtoClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_RP_CTO_SERVER: {
				PortComposantRequis portRPCtoServer = (PortComposantRequis)theEObject;
				T result = casePortRPCtoServer(portRPCtoServer);
				if (result == null) result = casePortComposantRequis(portRPCtoServer);
				if (result == null) result = casePortComposant(portRPCtoServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SERVER_TO_RPC: {
				PortComposantFourni portServerToRPC = (PortComposantFourni)theEObject;
				T result = casePortServerToRPC(portServerToRPC);
				if (result == null) result = casePortComposantFourni(portServerToRPC);
				if (result == null) result = casePortComposant(portServerToRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_CLIENTTO_RPC: {
				Attachment attachmentClienttoRPC = (Attachment)theEObject;
				T result = caseAttachmentClienttoRPC(attachmentClienttoRPC);
				if (result == null) result = caseAttachment(attachmentClienttoRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.RPC_CONNECTOR_CLIENT_SERVER: {
				Connecteur rpcConnectorClientServer = (Connecteur)theEObject;
				T result = caseRPCConnectorClientServer(rpcConnectorClientServer);
				if (result == null) result = caseConnecteur(rpcConnectorClientServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_RP_CTO_SERVER: {
				Attachment attachmentRPCtoServer = (Attachment)theEObject;
				T result = caseAttachmentRPCtoServer(attachmentRPCtoServer);
				if (result == null) result = caseAttachment(attachmentRPCtoServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_SERVER_TO_RPC: {
				Attachment attachmentServerToRPC = (Attachment)theEObject;
				T result = caseAttachmentServerToRPC(attachmentServerToRPC);
				if (result == null) result = caseAttachment(attachmentServerToRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.RPC_CONNECTOR_SERVER_CLIENT: {
				Connecteur rpcConnectorServerClient = (Connecteur)theEObject;
				T result = caseRPCConnectorServerClient(rpcConnectorServerClient);
				if (result == null) result = caseConnecteur(rpcConnectorServerClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_RPC_TO_CLIENT: {
				Attachment attachmentRPCToClient = (Attachment)theEObject;
				T result = caseAttachmentRPCToClient(attachmentRPCToClient);
				if (result == null) result = caseAttachment(attachmentRPCToClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SQ_LTO_CM: {
				PortComposantRequis portSQLtoCM = (PortComposantRequis)theEObject;
				T result = casePortSQLtoCM(portSQLtoCM);
				if (result == null) result = casePortComposantRequis(portSQLtoCM);
				if (result == null) result = casePortComposant(portSQLtoCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CMTO_CR: {
				PortComposantFourni portCMtoCR = (PortComposantFourni)theEObject;
				T result = casePortCMtoCR(portCMtoCR);
				if (result == null) result = casePortComposantFourni(portCMtoCR);
				if (result == null) result = casePortComposant(portCMtoCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CRTO_SM: {
				PortComposantRequis portCRtoSM = (PortComposantRequis)theEObject;
				T result = casePortCRtoSM(portCRtoSM);
				if (result == null) result = casePortComposantRequis(portCRtoSM);
				if (result == null) result = casePortComposant(portCRtoSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SMTO_CR: {
				PortComposantFourni portSMtoCR = (PortComposantFourni)theEObject;
				T result = casePortSMtoCR(portSMtoCR);
				if (result == null) result = casePortComposantFourni(portSMtoCR);
				if (result == null) result = casePortComposant(portSMtoCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SQTO_DB: {
				PortComposantRequis portSQtoDB = (PortComposantRequis)theEObject;
				T result = casePortSQtoDB(portSQtoDB);
				if (result == null) result = casePortComposantRequis(portSQtoDB);
				if (result == null) result = casePortComposant(portSQtoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CRTO_CM: {
				PortComposantRequis portCRtoCM = (PortComposantRequis)theEObject;
				T result = casePortCRtoCM(portCRtoCM);
				if (result == null) result = casePortComposantRequis(portCRtoCM);
				if (result == null) result = casePortComposant(portCRtoCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CMTO_SQL: {
				PortComposantFourni portCMtoSQL = (PortComposantFourni)theEObject;
				T result = casePortCMtoSQL(portCMtoSQL);
				if (result == null) result = casePortComposantFourni(portCMtoSQL);
				if (result == null) result = casePortComposant(portCMtoSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_DBTO_SQ: {
				PortComposantFourni portDBtoSQ = (PortComposantFourni)theEObject;
				T result = casePortDBtoSQ(portDBtoSQ);
				if (result == null) result = casePortComposantFourni(portDBtoSQ);
				if (result == null) result = casePortComposant(portDBtoSQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_DBTO_SQL: {
				PortComposantFourni portDBtoSQL = (PortComposantFourni)theEObject;
				T result = casePortDBtoSQL(portDBtoSQL);
				if (result == null) result = casePortComposantFourni(portDBtoSQL);
				if (result == null) result = casePortComposant(portDBtoSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SQ_LTO_DB: {
				PortComposantRequis portSQLtoDB = (PortComposantRequis)theEObject;
				T result = casePortSQLtoDB(portSQLtoDB);
				if (result == null) result = casePortComposantRequis(portSQLtoDB);
				if (result == null) result = casePortComposant(portSQLtoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.SQL_QUERY_CONNECTOR_OUT: {
				Connecteur sqlQueryConnectorOut = (Connecteur)theEObject;
				T result = caseSQLQueryConnectorOut(sqlQueryConnectorOut);
				if (result == null) result = caseConnecteur(sqlQueryConnectorOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_IN: {
				Connecteur clearanceRequestConnectorIn = (Connecteur)theEObject;
				T result = caseClearanceRequestConnectorIn(clearanceRequestConnectorIn);
				if (result == null) result = caseConnecteur(clearanceRequestConnectorIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.SECURITY_QUERY_CONNECTOR_IN: {
				Connecteur securityQueryConnectorIn = (Connecteur)theEObject;
				T result = caseSecurityQueryConnectorIn(securityQueryConnectorIn);
				if (result == null) result = caseConnecteur(securityQueryConnectorIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_SQ_LTO_DB: {
				Attachment attachmentSQLtoDB = (Attachment)theEObject;
				T result = caseAttachmentSQLtoDB(attachmentSQLtoDB);
				if (result == null) result = caseAttachment(attachmentSQLtoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_DBTO_SQL: {
				Attachment attachmentDBtoSQL = (Attachment)theEObject;
				T result = caseAttachmentDBtoSQL(attachmentDBtoSQL);
				if (result == null) result = caseAttachment(attachmentDBtoSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_SQ_LTO_CM: {
				Attachment attachmentSQLtoCM = (Attachment)theEObject;
				T result = caseAttachmentSQLtoCM(attachmentSQLtoCM);
				if (result == null) result = caseAttachment(attachmentSQLtoCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_CMTO_SQL: {
				Attachment attachmentCMtoSQL = (Attachment)theEObject;
				T result = caseAttachmentCMtoSQL(attachmentCMtoSQL);
				if (result == null) result = caseAttachment(attachmentCMtoSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_DBTO_SQ: {
				Attachment attachmentDBtoSQ = (Attachment)theEObject;
				T result = caseAttachmentDBtoSQ(attachmentDBtoSQ);
				if (result == null) result = caseAttachment(attachmentDBtoSQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_SQTO_DB: {
				Attachment attachmentSQtoDB = (Attachment)theEObject;
				T result = caseAttachmentSQtoDB(attachmentSQtoDB);
				if (result == null) result = caseAttachment(attachmentSQtoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_SQTO_SM: {
				Attachment attachmentSQtoSM = (Attachment)theEObject;
				T result = caseAttachmentSQtoSM(attachmentSQtoSM);
				if (result == null) result = caseAttachment(attachmentSQtoSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_SMTO_SQ: {
				Attachment attachmentSMtoSQ = (Attachment)theEObject;
				T result = caseAttachmentSMtoSQ(attachmentSMtoSQ);
				if (result == null) result = caseAttachment(attachmentSMtoSQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_CRTO_CM: {
				Attachment attachmentCRtoCM = (Attachment)theEObject;
				T result = caseAttachmentCRtoCM(attachmentCRtoCM);
				if (result == null) result = caseAttachment(attachmentCRtoCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_CMTO_CR: {
				Attachment attachmentCMtoCR = (Attachment)theEObject;
				T result = caseAttachmentCMtoCR(attachmentCMtoCR);
				if (result == null) result = caseAttachment(attachmentCMtoCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_SMTO_CR: {
				Attachment attachmentSMtoCR = (Attachment)theEObject;
				T result = caseAttachmentSMtoCR(attachmentSMtoCR);
				if (result == null) result = caseAttachment(attachmentSMtoCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ATTACHMENT_CRTO_SM: {
				Attachment attachmentCRtoSM = (Attachment)theEObject;
				T result = caseAttachmentCRtoSM(attachmentCRtoSM);
				if (result == null) result = caseAttachment(attachmentCRtoSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.SQL_QUERY_CONNECTOR_IN: {
				Connecteur sqlQueryConnectorIn = (Connecteur)theEObject;
				T result = caseSQLQueryConnectorIn(sqlQueryConnectorIn);
				if (result == null) result = caseConnecteur(sqlQueryConnectorIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.SECURITY_QUERY_CONNECTOR_OUT: {
				Connecteur securityQueryConnectorOut = (Connecteur)theEObject;
				T result = caseSecurityQueryConnectorOut(securityQueryConnectorOut);
				if (result == null) result = caseConnecteur(securityQueryConnectorOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.CLEARANCE_REQUEST_CONNECTOR_OUT: {
				Connecteur clearanceRequestConnectorOut = (Connecteur)theEObject;
				T result = caseClearanceRequestConnectorOut(clearanceRequestConnectorOut);
				if (result == null) result = caseConnecteur(clearanceRequestConnectorOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SQTO_SM: {
				PortComposantRequis portSQtoSM = (PortComposantRequis)theEObject;
				T result = casePortSQtoSM(portSQtoSM);
				if (result == null) result = casePortComposantRequis(portSQtoSM);
				if (result == null) result = casePortComposant(portSQtoSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SMTO_SQ: {
				PortComposantFourni portSMtoSQ = (PortComposantFourni)theEObject;
				T result = casePortSMtoSQ(portSMtoSQ);
				if (result == null) result = casePortComposantFourni(portSMtoSQ);
				if (result == null) result = casePortComposant(portSMtoSQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_SERVER_TO_BINDING: {
				PortConfigurationRequis portServerToBinding = (PortConfigurationRequis)theEObject;
				T result = casePortServerToBinding(portServerToBinding);
				if (result == null) result = casePortConfigurationRequis(portServerToBinding);
				if (result == null) result = casePortConfiguration(portServerToBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_BINDING_TO_SERVER: {
				PortConfigurationFourni portBindingToServer = (PortConfigurationFourni)theEObject;
				T result = casePortBindingToServer(portBindingToServer);
				if (result == null) result = casePortConfigurationFourni(portBindingToServer);
				if (result == null) result = casePortConfiguration(portBindingToServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_BINDING_TO_CM: {
				PortComposantRequis portBindingToCM = (PortComposantRequis)theEObject;
				T result = casePortBindingToCM(portBindingToCM);
				if (result == null) result = casePortComposantRequis(portBindingToCM);
				if (result == null) result = casePortComposant(portBindingToCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CMTO_BINDING: {
				PortComposantFourni portCMtoBinding = (PortComposantFourni)theEObject;
				T result = casePortCMtoBinding(portCMtoBinding);
				if (result == null) result = casePortComposantFourni(portCMtoBinding);
				if (result == null) result = casePortComposant(portCMtoBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.BINDING_SERVER_TO_CM: {
				Binding bindingServerToCM = (Binding)theEObject;
				T result = caseBindingServerToCM(bindingServerToCM);
				if (result == null) result = caseBinding(bindingServerToCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.BINDING_CMTO_SERVER: {
				Binding bindingCMtoServer = (Binding)theEObject;
				T result = caseBindingCMtoServer(bindingCMtoServer);
				if (result == null) result = caseBinding(bindingCMtoServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_RP_CFROM_CLIENT: {
				RoleRequis roleRPCfromClient = (RoleRequis)theEObject;
				T result = caseRoleRPCfromClient(roleRPCfromClient);
				if (result == null) result = caseRoleRequis(roleRPCfromClient);
				if (result == null) result = caseRole(roleRPCfromClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_RP_CTO_CLIENT: {
				RoleFourni roleRPCtoClient = (RoleFourni)theEObject;
				T result = caseRoleRPCtoClient(roleRPCtoClient);
				if (result == null) result = caseRoleFourni(roleRPCtoClient);
				if (result == null) result = caseRole(roleRPCtoClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_RP_CTO_SERVER: {
				RoleFourni roleRPCtoServer = (RoleFourni)theEObject;
				T result = caseRoleRPCtoServer(roleRPCtoServer);
				if (result == null) result = caseRoleFourni(roleRPCtoServer);
				if (result == null) result = caseRole(roleRPCtoServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_RP_CFROM_SERVER: {
				RoleRequis roleRPCfromServer = (RoleRequis)theEObject;
				T result = caseRoleRPCfromServer(roleRPCfromServer);
				if (result == null) result = caseRoleRequis(roleRPCfromServer);
				if (result == null) result = caseRole(roleRPCfromServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQ_LTO_DB: {
				RoleFourni roleSQLtoDB = (RoleFourni)theEObject;
				T result = caseRoleSQLtoDB(roleSQLtoDB);
				if (result == null) result = caseRoleFourni(roleSQLtoDB);
				if (result == null) result = caseRole(roleSQLtoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQ_LFROM_DB: {
				RoleRequis roleSQLfromDB = (RoleRequis)theEObject;
				T result = caseRoleSQLfromDB(roleSQLfromDB);
				if (result == null) result = caseRoleRequis(roleSQLfromDB);
				if (result == null) result = caseRole(roleSQLfromDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQ_LTO_CM: {
				RoleFourni roleSQLtoCM = (RoleFourni)theEObject;
				T result = caseRoleSQLtoCM(roleSQLtoCM);
				if (result == null) result = caseRoleFourni(roleSQLtoCM);
				if (result == null) result = caseRole(roleSQLtoCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQ_LFROM_CM: {
				RoleRequis roleSQLfromCM = (RoleRequis)theEObject;
				T result = caseRoleSQLfromCM(roleSQLfromCM);
				if (result == null) result = caseRoleRequis(roleSQLfromCM);
				if (result == null) result = caseRole(roleSQLfromCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQFROM_DB: {
				RoleFourni roleSQfromDB = (RoleFourni)theEObject;
				T result = caseRoleSQfromDB(roleSQfromDB);
				if (result == null) result = caseRoleFourni(roleSQfromDB);
				if (result == null) result = caseRole(roleSQfromDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQTO_DB: {
				RoleRequis roleSQtoDB = (RoleRequis)theEObject;
				T result = caseRoleSQtoDB(roleSQtoDB);
				if (result == null) result = caseRoleRequis(roleSQtoDB);
				if (result == null) result = caseRole(roleSQtoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQTO_SM: {
				RoleRequis roleSQtoSM = (RoleRequis)theEObject;
				T result = caseRoleSQtoSM(roleSQtoSM);
				if (result == null) result = caseRoleRequis(roleSQtoSM);
				if (result == null) result = caseRole(roleSQtoSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_SQFROM_SM: {
				RoleFourni roleSQfromSM = (RoleFourni)theEObject;
				T result = caseRoleSQfromSM(roleSQfromSM);
				if (result == null) result = caseRoleFourni(roleSQfromSM);
				if (result == null) result = caseRole(roleSQfromSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_CRTO_CM: {
				RoleRequis roleCRtoCM = (RoleRequis)theEObject;
				T result = caseRoleCRtoCM(roleCRtoCM);
				if (result == null) result = caseRoleRequis(roleCRtoCM);
				if (result == null) result = caseRole(roleCRtoCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_CRFROM_SM: {
				RoleFourni roleCRfromSM = (RoleFourni)theEObject;
				T result = caseRoleCRfromSM(roleCRfromSM);
				if (result == null) result = caseRoleFourni(roleCRfromSM);
				if (result == null) result = caseRole(roleCRfromSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_CRTO_SM: {
				RoleRequis roleCRtoSM = (RoleRequis)theEObject;
				T result = caseRoleCRtoSM(roleCRtoSM);
				if (result == null) result = caseRoleRequis(roleCRtoSM);
				if (result == null) result = caseRole(roleCRtoSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.ROLE_CRFROM_CM: {
				RoleFourni roleCRfromCM = (RoleFourni)theEObject;
				T result = caseRoleCRfromCM(roleCRfromCM);
				if (result == null) result = caseRoleFourni(roleCRfromCM);
				if (result == null) result = caseRole(roleCRfromCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.CONFIGURATION_CLIENT_SERVER: {
				aSA.Configuration configurationClientServer = (aSA.Configuration)theEObject;
				T result = caseConfigurationClientServer(configurationClientServer);
				if (result == null) result = caseConfiguration(configurationClientServer);
				if (result == null) result = caseComposant(configurationClientServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_BINDING_TO_CONFIG_CLIENT_SERVER: {
				PortConfigurationRequis portBindingToConfigClientServer = (PortConfigurationRequis)theEObject;
				T result = casePortBindingToConfigClientServer(portBindingToConfigClientServer);
				if (result == null) result = casePortConfigurationRequis(portBindingToConfigClientServer);
				if (result == null) result = casePortConfiguration(portBindingToConfigClientServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CONFIG_CLIENT_SERVER_TO_BINDING: {
				PortConfigurationFourni portConfigClientServerToBinding = (PortConfigurationFourni)theEObject;
				T result = casePortConfigClientServerToBinding(portConfigClientServerToBinding);
				if (result == null) result = casePortConfigurationFourni(portConfigClientServerToBinding);
				if (result == null) result = casePortConfiguration(portConfigClientServerToBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_CLIENT_TO_BINDING: {
				PortComposantFourni portClientToBinding = (PortComposantFourni)theEObject;
				T result = casePortClientToBinding(portClientToBinding);
				if (result == null) result = casePortComposantFourni(portClientToBinding);
				if (result == null) result = casePortComposant(portClientToBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.PORT_BINDING_TO_CLIENT: {
				PortComposantRequis portBindingToClient = (PortComposantRequis)theEObject;
				T result = casePortBindingToClient(portBindingToClient);
				if (result == null) result = casePortComposantRequis(portBindingToClient);
				if (result == null) result = casePortComposant(portBindingToClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER: {
				BindingClientToConfigClientServer bindingClientToConfigClientServer = (BindingClientToConfigClientServer)theEObject;
				T result = caseBindingClientToConfigClientServer(bindingClientToConfigClientServer);
				if (result == null) result = caseBinding(bindingClientToConfigClientServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M1Package.BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT: {
				BindingConfigClientServerToClient bindingConfigClientServerToClient = (BindingConfigClientServerToClient)theEObject;
				T result = caseBindingConfigClientServerToClient(bindingConfigClientServerToClient);
				if (result == null) result = caseBinding(bindingConfigClientServerToClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(ComposantSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionManager(ComposantSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(ComposantSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManager(ComposantSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Clientto RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Clientto RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortClienttoRPC(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port RP Cto Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port RP Cto Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRPCtoClient(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port RP Cto Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port RP Cto Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRPCtoServer(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Server To RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Server To RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortServerToRPC(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Clientto RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Clientto RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentClienttoRPC(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC Connector Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC Connector Client Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPCConnectorClientServer(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment RP Cto Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment RP Cto Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentRPCtoServer(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Server To RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Server To RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentServerToRPC(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC Connector Server Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC Connector Server Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPCConnectorServerClient(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment RPC To Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment RPC To Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentRPCToClient(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port SQ Lto CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port SQ Lto CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSQLtoCM(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port CMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port CMto CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortCMtoCR(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port CRto SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port CRto SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortCRtoSM(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port SMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port SMto CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSMtoCR(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port SQto DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port SQto DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSQtoDB(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port CRto CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port CRto CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortCRtoCM(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port CMto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port CMto SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortCMtoSQL(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port DBto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port DBto SQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDBtoSQ(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port DBto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port DBto SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDBtoSQL(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port SQ Lto DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port SQ Lto DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSQLtoDB(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Query Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Query Connector Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLQueryConnectorOut(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearance Request Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearance Request Connector In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearanceRequestConnectorIn(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Query Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Query Connector In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityQueryConnectorIn(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SQ Lto DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SQ Lto DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentSQLtoDB(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment DBto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment DBto SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentDBtoSQL(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SQ Lto CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SQ Lto CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentSQLtoCM(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CMto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CMto SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentCMtoSQL(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment DBto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment DBto SQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentDBtoSQ(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SQto DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SQto DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentSQtoDB(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SQto SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SQto SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentSQtoSM(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SMto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SMto SQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentSMtoSQ(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CRto CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CRto CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentCRtoCM(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CMto CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentCMtoCR(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SMto CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentSMtoCR(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CRto SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CRto SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentCRtoSM(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Query Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Query Connector In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLQueryConnectorIn(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Query Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Query Connector Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityQueryConnectorOut(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearance Request Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearance Request Connector Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearanceRequestConnectorOut(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port SQto SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port SQto SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSQtoSM(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port SMto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port SMto SQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSMtoSQ(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Server To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Server To Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortServerToBinding(PortConfigurationRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Binding To Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Binding To Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortBindingToServer(PortConfigurationFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Binding To CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Binding To CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortBindingToCM(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port CMto Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port CMto Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortCMtoBinding(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Server To CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Server To CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingServerToCM(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding CMto Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding CMto Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingCMtoServer(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role RP Cfrom Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role RP Cfrom Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRPCfromClient(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role RP Cto Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role RP Cto Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRPCtoClient(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role RP Cto Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role RP Cto Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRPCtoServer(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role RP Cfrom Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role RP Cfrom Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRPCfromServer(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQ Lto DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQ Lto DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQLtoDB(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQ Lfrom DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQ Lfrom DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQLfromDB(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQ Lto CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQ Lto CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQLtoCM(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQ Lfrom CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQ Lfrom CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQLfromCM(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQfrom DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQfrom DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQfromDB(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQto DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQto DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQtoDB(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQto SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQto SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQtoSM(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role SQfrom SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role SQfrom SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSQfromSM(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role CRto CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role CRto CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleCRtoCM(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role CRfrom SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role CRfrom SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleCRfromSM(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role CRto SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role CRto SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleCRtoSM(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role CRfrom CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role CRfrom CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleCRfromCM(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Client Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationClientServer(aSA.Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Binding To Config Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Binding To Config Client Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortBindingToConfigClientServer(PortConfigurationRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Config Client Server To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Config Client Server To Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConfigClientServerToBinding(PortConfigurationFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Client To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Client To Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortClientToBinding(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Binding To Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Binding To Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortBindingToClient(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Client To Config Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Client To Config Client Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingClientToConfigClientServer(BindingClientToConfigClientServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Config Client Server To Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Config Client Server To Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingConfigClientServerToClient(BindingConfigClientServerToClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposantSimple(ComposantSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortComposant(PortComposant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Composant Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Composant Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortComposantFourni(PortComposantFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Composant Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Composant Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortComposantRequis(PortComposantRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteur(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConfiguration(PortConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Configuration Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Configuration Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConfigurationRequis(PortConfigurationRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Configuration Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Configuration Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConfigurationFourni(PortConfigurationFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis(aSA.RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFourni(aSA.RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //M1Switch
