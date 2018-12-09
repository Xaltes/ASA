/**
 */
package M1;

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

import org.eclipse.emf.ecore.EFactory;

import M1.impl.PortBindingToCMImpl;
import M1.impl.PortCMtoBindingImpl;
import M1.impl.PortCMtoCRImpl;
import M1.impl.PortCMtoSQLImpl;
import M1.impl.PortCRtoCMImpl;
import M1.impl.PortCRtoSMImpl;
import M1.impl.PortDBtoSQImpl;
import M1.impl.PortDBtoSQLImpl;
import M1.impl.PortSMtoCRImpl;
import M1.impl.PortSMtoSQImpl;
import M1.impl.PortSQLtoCMImpl;
import M1.impl.PortSQLtoDBImpl;
import M1.impl.PortSQtoDBImpl;
import M1.impl.PortSQtoSMImpl;
import M1.impl.RoleCRfromCMImpl;
import M1.impl.RoleCRfromSMImpl;
import M1.impl.RoleCRtoCMImpl;
import M1.impl.RoleCRtoSMImpl;
import M1.impl.RoleSQLfromDBImpl;
import M1.impl.RoleSQLtoDBImpl;
import M1.impl.RoleSQfromDBImpl;
import M1.impl.RoleSQfromSMImpl;
import M1.impl.RoleSQtoDBImpl;
import M1.impl.RoleSQtoSMImpl;

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
	ComposantSimple createClient(String n, String p, int v);

	/**
	 * Returns a new object of class '<em>Server Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Configuration</em>'.
	 * @generated
	 */
	Configuration createServerConfiguration(Binding b1, Binding b2, ArrayList<PortComposantFourni> p1, ArrayList<PortComposantRequis> p2, PortConfigurationRequis p3, PortConfigurationFourni p4, 
			Attachment a1, Attachment a2, Attachment a3, Attachment a4, Attachment a5, Attachment a6, Attachment a7, Attachment a8, Attachment a9, Attachment a10, Attachment a11, Attachment a12);

	/**
	 * Returns a new object of class '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Manager</em>'.
	 * @generated
	 */
	ComposantSimple createConnectionManager(PortSQLtoCMImpl p1, 
			PortCMtoSQLImpl p2, 
			PortBindingToCMImpl p3,
			PortCMtoBindingImpl p4,
			PortCRtoCMImpl p5,
			PortCMtoCRImpl p6);

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	ComposantSimple createDatabase(PortComposantFourni p1, PortComposantRequis p2, PortComposantFourni p3, PortComposantRequis p4);

	/**
	 * Returns a new object of class '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Manager</em>'.
	 * @generated
	 */
	ComposantSimple createSecurityManager(PortComposantFourni p1, PortComposantRequis p2, PortComposantRequis p3, PortComposantFourni p4);

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
	Attachment createAttachmentClienttoRPC(PortComposantFourni p, RoleRequis r);

	/**
	 * Returns a new object of class '<em>RPC Connector Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC Connector Client Server</em>'.
	 * @generated
	 */
	Connecteur createRPCConnectorClientServer(RoleRequis r1, RoleFourni r2);

	/**
	 * Returns a new object of class '<em>Attachment RP Cto Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment RP Cto Server</em>'.
	 * @generated
	 */
	Attachment createAttachmentRPCtoServer(PortComposantRequis p, RoleFourni r);

	/**
	 * Returns a new object of class '<em>Attachment Server To RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Server To RPC</em>'.
	 * @generated
	 */
	Attachment createAttachmentServerToRPC(PortComposantFourni p, RoleRequis r);

	/**
	 * Returns a new object of class '<em>RPC Connector Server Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC Connector Server Client</em>'.
	 * @generated
	 */
	Connecteur createRPCConnectorServerClient(RoleRequis r1, RoleFourni r2);

	/**
	 * Returns a new object of class '<em>Attachment RPC To Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment RPC To Client</em>'.
	 * @generated
	 */
	Attachment createAttachmentRPCToClient(PortComposantRequis p, RoleFourni r);

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
	Connecteur createSQLQueryConnectorOut(RoleRequis r1, RoleFourni r2);

	/**
	 * Returns a new object of class '<em>Clearance Request Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearance Request Connector In</em>'.
	 * @generated
	 */
	Connecteur createClearanceRequestConnectorIn(RoleFourni r1, RoleRequis r2);

	/**
	 * Returns a new object of class '<em>Security Query Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Query Connector In</em>'.
	 * @generated
	 */
	Connecteur createSecurityQueryConnectorIn(RoleRequis r1, RoleFourni r2);

	/**
	 * Returns a new object of class '<em>Attachment SQ Lto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQ Lto DB</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQLtoDB(PortSQLtoDBImpl portsqltodb2, RoleSQLtoDBImpl rolesqltodb2);

	/**
	 * Returns a new object of class '<em>Attachment DBto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment DBto SQL</em>'.
	 * @generated
	 */
	Attachment createAttachmentDBtoSQL(PortDBtoSQLImpl p, RoleSQLfromDBImpl r);

	/**
	 * Returns a new object of class '<em>Attachment SQ Lto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQ Lto CM</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQLtoCM(PortComposantRequis p, RoleFourni r);

	/**
	 * Returns a new object of class '<em>Attachment CMto SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CMto SQL</em>'.
	 * @generated
	 */
	Attachment createAttachmentCMtoSQL(PortComposantFourni p, RoleRequis r);

	/**
	 * Returns a new object of class '<em>Attachment DBto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment DBto SQ</em>'.
	 * @generated
	 */
	Attachment createAttachmentDBtoSQ(PortDBtoSQImpl portdbtosq2, RoleSQfromDBImpl rolesqfromdb2);

	/**
	 * Returns a new object of class '<em>Attachment SQto DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQto DB</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQtoDB(PortSQtoDBImpl portsqtodb2, RoleSQtoDBImpl rolesqtodb2);

	/**
	 * Returns a new object of class '<em>Attachment SQto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SQto SM</em>'.
	 * @generated
	 */
	Attachment createAttachmentSQtoSM(PortSQtoSMImpl portsqtosm2, RoleSQtoSMImpl rolesqtosm2);

	/**
	 * Returns a new object of class '<em>Attachment SMto SQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SMto SQ</em>'.
	 * @generated
	 */
	Attachment createAttachmentSMtoSQ(PortSMtoSQImpl portsmtosq2, RoleSQfromSMImpl rolesqfromsm2);

	/**
	 * Returns a new object of class '<em>Attachment CRto CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CRto CM</em>'.
	 * @generated
	 */
	Attachment createAttachmentCRtoCM(PortCRtoCMImpl portcrtocm2, RoleCRtoCMImpl rolecrtocm2);

	/**
	 * Returns a new object of class '<em>Attachment CMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CMto CR</em>'.
	 * @generated
	 */
	Attachment createAttachmentCMtoCR(PortCMtoCRImpl portcmtocr2, RoleCRfromCMImpl rolecrfromcm2);

	/**
	 * Returns a new object of class '<em>Attachment SMto CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SMto CR</em>'.
	 * @generated
	 */
	Attachment createAttachmentSMtoCR(PortSMtoCRImpl portsmtocr2, RoleCRfromSMImpl rolecrfromsm2);

	/**
	 * Returns a new object of class '<em>Attachment CRto SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CRto SM</em>'.
	 * @generated
	 */
	Attachment createAttachmentCRtoSM(PortCRtoSMImpl portcrtosm2, RoleCRtoSMImpl rolecrtosm2);

	/**
	 * Returns a new object of class '<em>SQL Query Connector In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQL Query Connector In</em>'.
	 * @generated
	 */
	Connecteur createSQLQueryConnectorIn(RoleFourni r1, RoleRequis r2);

	/**
	 * Returns a new object of class '<em>Security Query Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Query Connector Out</em>'.
	 * @generated
	 */
	Connecteur createSecurityQueryConnectorOut(RoleFourni r1, RoleRequis r2);

	/**
	 * Returns a new object of class '<em>Clearance Request Connector Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearance Request Connector Out</em>'.
	 * @generated
	 */
	Connecteur createClearanceRequestConnectorOut(RoleRequis r1, RoleFourni r2);

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
	Binding createBindingServerToCM(PortComposantRequis p1, PortConfigurationRequis p2);

	/**
	 * Returns a new object of class '<em>Binding CMto Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding CMto Server</em>'.
	 * @generated
	 */
	Binding createBindingCMtoServer(PortComposantFourni p1, PortConfigurationFourni p2);

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
	Configuration createConfigurationClientServer(ArrayList<PortConfigurationFourni> p1, ArrayList<PortConfigurationRequis> p2, ArrayList<Binding> b1, ArrayList<Binding> b2, ArrayList<Attachment> a1, ArrayList<Attachment> a2, ArrayList<Attachment> a3, ArrayList<Attachment> a4);

	/**
	 * Returns a new object of class '<em>Port Binding To Config Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Binding To Config Client Server</em>'.
	 * @generated
	 */
	PortConfigurationFourni createPortBindingToConfigClientServer();

	/**
	 * Returns a new object of class '<em>Port Config Client Server To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Config Client Server To Binding</em>'.
	 * @generated
	 */
	PortConfigurationRequis createPortConfigClientServerToBinding();

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
	Binding createBindingClientToConfigClientServer(PortConfigurationFourni p1, PortComposantFourni p2);

	/**
	 * Returns a new object of class '<em>Binding Config Client Server To Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Config Client Server To Client</em>'.
	 * @generated
	 */
	Binding createBindingConfigClientServerToClient(PortComposantRequis p1, PortConfigurationRequis p2);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	M1Package getM1Package();

} //M1Factory
