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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see M1.M1Package
 * @generated
 */
public class M1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static M1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = M1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M1Switch<Adapter> modelSwitch =
		new M1Switch<Adapter>() {
			@Override
			public Adapter caseClient(ComposantSimple object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseServerConfiguration(Configuration object) {
				return createServerConfigurationAdapter();
			}
			@Override
			public Adapter caseConnectionManager(ComposantSimple object) {
				return createConnectionManagerAdapter();
			}
			@Override
			public Adapter caseDatabase(ComposantSimple object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseSecurityManager(ComposantSimple object) {
				return createSecurityManagerAdapter();
			}
			@Override
			public Adapter casePortClienttoRPC(PortComposantFourni object) {
				return createPortClienttoRPCAdapter();
			}
			@Override
			public Adapter casePortRPCtoClient(PortComposantRequis object) {
				return createPortRPCtoClientAdapter();
			}
			@Override
			public Adapter casePortRPCtoServer(PortComposantRequis object) {
				return createPortRPCtoServerAdapter();
			}
			@Override
			public Adapter casePortServerToRPC(PortComposantFourni object) {
				return createPortServerToRPCAdapter();
			}
			@Override
			public Adapter caseAttachmentClienttoRPC(Attachment object) {
				return createAttachmentClienttoRPCAdapter();
			}
			@Override
			public Adapter caseRPCConnectorClientServer(Connecteur object) {
				return createRPCConnectorClientServerAdapter();
			}
			@Override
			public Adapter caseAttachmentRPCtoServer(Attachment object) {
				return createAttachmentRPCtoServerAdapter();
			}
			@Override
			public Adapter caseAttachmentServerToRPC(Attachment object) {
				return createAttachmentServerToRPCAdapter();
			}
			@Override
			public Adapter caseRPCConnectorServerClient(Connecteur object) {
				return createRPCConnectorServerClientAdapter();
			}
			@Override
			public Adapter caseAttachmentRPCToClient(Attachment object) {
				return createAttachmentRPCToClientAdapter();
			}
			@Override
			public Adapter casePortSQLtoCM(PortComposantRequis object) {
				return createPortSQLtoCMAdapter();
			}
			@Override
			public Adapter casePortCMtoCR(PortComposantFourni object) {
				return createPortCMtoCRAdapter();
			}
			@Override
			public Adapter casePortCRtoSM(PortComposantRequis object) {
				return createPortCRtoSMAdapter();
			}
			@Override
			public Adapter casePortSMtoCR(PortComposantFourni object) {
				return createPortSMtoCRAdapter();
			}
			@Override
			public Adapter casePortSQtoDB(PortComposantRequis object) {
				return createPortSQtoDBAdapter();
			}
			@Override
			public Adapter casePortCRtoCM(PortComposantRequis object) {
				return createPortCRtoCMAdapter();
			}
			@Override
			public Adapter casePortCMtoSQL(PortComposantFourni object) {
				return createPortCMtoSQLAdapter();
			}
			@Override
			public Adapter casePortDBtoSQ(PortComposantFourni object) {
				return createPortDBtoSQAdapter();
			}
			@Override
			public Adapter casePortDBtoSQL(PortComposantFourni object) {
				return createPortDBtoSQLAdapter();
			}
			@Override
			public Adapter casePortSQLtoDB(PortComposantRequis object) {
				return createPortSQLtoDBAdapter();
			}
			@Override
			public Adapter caseSQLQueryConnectorOut(Connecteur object) {
				return createSQLQueryConnectorOutAdapter();
			}
			@Override
			public Adapter caseClearanceRequestConnectorIn(Connecteur object) {
				return createClearanceRequestConnectorInAdapter();
			}
			@Override
			public Adapter caseSecurityQueryConnectorIn(Connecteur object) {
				return createSecurityQueryConnectorInAdapter();
			}
			@Override
			public Adapter caseAttachmentSQLtoDB(Attachment object) {
				return createAttachmentSQLtoDBAdapter();
			}
			@Override
			public Adapter caseAttachmentDBtoSQL(Attachment object) {
				return createAttachmentDBtoSQLAdapter();
			}
			@Override
			public Adapter caseAttachmentSQLtoCM(Attachment object) {
				return createAttachmentSQLtoCMAdapter();
			}
			@Override
			public Adapter caseAttachmentCMtoSQL(Attachment object) {
				return createAttachmentCMtoSQLAdapter();
			}
			@Override
			public Adapter caseAttachmentDBtoSQ(Attachment object) {
				return createAttachmentDBtoSQAdapter();
			}
			@Override
			public Adapter caseAttachmentSQtoDB(Attachment object) {
				return createAttachmentSQtoDBAdapter();
			}
			@Override
			public Adapter caseAttachmentSQtoSM(Attachment object) {
				return createAttachmentSQtoSMAdapter();
			}
			@Override
			public Adapter caseAttachmentSMtoSQ(Attachment object) {
				return createAttachmentSMtoSQAdapter();
			}
			@Override
			public Adapter caseAttachmentCRtoCM(Attachment object) {
				return createAttachmentCRtoCMAdapter();
			}
			@Override
			public Adapter caseAttachmentCMtoCR(Attachment object) {
				return createAttachmentCMtoCRAdapter();
			}
			@Override
			public Adapter caseAttachmentSMtoCR(Attachment object) {
				return createAttachmentSMtoCRAdapter();
			}
			@Override
			public Adapter caseAttachmentCRtoSM(Attachment object) {
				return createAttachmentCRtoSMAdapter();
			}
			@Override
			public Adapter caseSQLQueryConnectorIn(Connecteur object) {
				return createSQLQueryConnectorInAdapter();
			}
			@Override
			public Adapter caseSecurityQueryConnectorOut(Connecteur object) {
				return createSecurityQueryConnectorOutAdapter();
			}
			@Override
			public Adapter caseClearanceRequestConnectorOut(Connecteur object) {
				return createClearanceRequestConnectorOutAdapter();
			}
			@Override
			public Adapter casePortSQtoSM(PortComposantRequis object) {
				return createPortSQtoSMAdapter();
			}
			@Override
			public Adapter casePortSMtoSQ(PortComposantFourni object) {
				return createPortSMtoSQAdapter();
			}
			@Override
			public Adapter casePortServerToBinding(PortConfigurationRequis object) {
				return createPortServerToBindingAdapter();
			}
			@Override
			public Adapter casePortBindingToServer(PortConfigurationFourni object) {
				return createPortBindingToServerAdapter();
			}
			@Override
			public Adapter casePortBindingToCM(PortComposantRequis object) {
				return createPortBindingToCMAdapter();
			}
			@Override
			public Adapter casePortCMtoBinding(PortComposantFourni object) {
				return createPortCMtoBindingAdapter();
			}
			@Override
			public Adapter caseBindingServerToCM(Binding object) {
				return createBindingServerToCMAdapter();
			}
			@Override
			public Adapter caseBindingCMtoServer(Binding object) {
				return createBindingCMtoServerAdapter();
			}
			@Override
			public Adapter caseRoleRPCfromClient(RoleRequis object) {
				return createRoleRPCfromClientAdapter();
			}
			@Override
			public Adapter caseRoleRPCtoClient(RoleFourni object) {
				return createRoleRPCtoClientAdapter();
			}
			@Override
			public Adapter caseRoleRPCtoServer(RoleFourni object) {
				return createRoleRPCtoServerAdapter();
			}
			@Override
			public Adapter caseRoleRPCfromServer(RoleRequis object) {
				return createRoleRPCfromServerAdapter();
			}
			@Override
			public Adapter caseRoleSQLtoDB(RoleFourni object) {
				return createRoleSQLtoDBAdapter();
			}
			@Override
			public Adapter caseRoleSQLfromDB(RoleRequis object) {
				return createRoleSQLfromDBAdapter();
			}
			@Override
			public Adapter caseRoleSQLtoCM(RoleFourni object) {
				return createRoleSQLtoCMAdapter();
			}
			@Override
			public Adapter caseRoleSQLfromCM(RoleRequis object) {
				return createRoleSQLfromCMAdapter();
			}
			@Override
			public Adapter caseRoleSQfromDB(RoleFourni object) {
				return createRoleSQfromDBAdapter();
			}
			@Override
			public Adapter caseRoleSQtoDB(RoleRequis object) {
				return createRoleSQtoDBAdapter();
			}
			@Override
			public Adapter caseRoleSQtoSM(RoleRequis object) {
				return createRoleSQtoSMAdapter();
			}
			@Override
			public Adapter caseRoleSQfromSM(RoleFourni object) {
				return createRoleSQfromSMAdapter();
			}
			@Override
			public Adapter caseRoleCRtoCM(RoleRequis object) {
				return createRoleCRtoCMAdapter();
			}
			@Override
			public Adapter caseRoleCRfromSM(RoleFourni object) {
				return createRoleCRfromSMAdapter();
			}
			@Override
			public Adapter caseRoleCRtoSM(RoleRequis object) {
				return createRoleCRtoSMAdapter();
			}
			@Override
			public Adapter caseRoleCRfromCM(RoleFourni object) {
				return createRoleCRfromCMAdapter();
			}
			@Override
			public Adapter caseConfigurationClientServer(aSA.Configuration object) {
				return createConfigurationClientServerAdapter();
			}
			@Override
			public Adapter casePortBindingToConfigClientServer(PortConfigurationRequis object) {
				return createPortBindingToConfigClientServerAdapter();
			}
			@Override
			public Adapter casePortConfigClientServerToBinding(PortConfigurationFourni object) {
				return createPortConfigClientServerToBindingAdapter();
			}
			@Override
			public Adapter casePortClientToBinding(PortComposantFourni object) {
				return createPortClientToBindingAdapter();
			}
			@Override
			public Adapter casePortBindingToClient(PortComposantRequis object) {
				return createPortBindingToClientAdapter();
			}
			@Override
			public Adapter caseBindingClientToConfigClientServer(BindingClientToConfigClientServer object) {
				return createBindingClientToConfigClientServerAdapter();
			}
			@Override
			public Adapter caseBindingConfigClientServerToClient(BindingConfigClientServerToClient object) {
				return createBindingConfigClientServerToClientAdapter();
			}
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter caseComposantSimple(ComposantSimple object) {
				return createComposantSimpleAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter casePortComposant(PortComposant object) {
				return createPortComposantAdapter();
			}
			@Override
			public Adapter casePortComposantFourni(PortComposantFourni object) {
				return createPortComposantFourniAdapter();
			}
			@Override
			public Adapter casePortComposantRequis(PortComposantRequis object) {
				return createPortComposantRequisAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseConnecteur(Connecteur object) {
				return createConnecteurAdapter();
			}
			@Override
			public Adapter casePortConfiguration(PortConfiguration object) {
				return createPortConfigurationAdapter();
			}
			@Override
			public Adapter casePortConfigurationRequis(PortConfigurationRequis object) {
				return createPortConfigurationRequisAdapter();
			}
			@Override
			public Adapter casePortConfigurationFourni(PortConfigurationFourni object) {
				return createPortConfigurationFourniAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleRequis(aSA.RoleRequis object) {
				return createRoleRequisAdapter();
			}
			@Override
			public Adapter caseRoleFourni(aSA.RoleFourni object) {
				return createRoleFourniAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aSA.ComposantSimple <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ComposantSimple
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Configuration <em>Server Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Configuration
	 * @generated
	 */
	public Adapter createServerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.ComposantSimple <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ComposantSimple
	 * @generated
	 */
	public Adapter createConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.ComposantSimple <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ComposantSimple
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.ComposantSimple <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ComposantSimple
	 * @generated
	 */
	public Adapter createSecurityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port Clientto RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortClienttoRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port RP Cto Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortRPCtoClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port RP Cto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortRPCtoServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port Server To RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortServerToRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment Clientto RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentClienttoRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>RPC Connector Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createRPCConnectorClientServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment RP Cto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentRPCtoServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment Server To RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentServerToRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>RPC Connector Server Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createRPCConnectorServerClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment RPC To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentRPCToClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port SQ Lto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortSQLtoCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port CMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortCMtoCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port CRto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortCRtoSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port SMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortSMtoCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port SQto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortSQtoDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port CRto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortCRtoCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port CMto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortCMtoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port DBto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortDBtoSQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port DBto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortDBtoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port SQ Lto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortSQLtoDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>SQL Query Connector Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createSQLQueryConnectorOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>Clearance Request Connector In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createClearanceRequestConnectorInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>Security Query Connector In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createSecurityQueryConnectorInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment SQ Lto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentSQLtoDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment DBto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentDBtoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment SQ Lto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentSQLtoCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment CMto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentCMtoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment DBto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentDBtoSQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment SQto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentSQtoDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment SQto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentSQtoSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment SMto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentSMtoSQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment CRto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentCRtoCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment CMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentCMtoCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment SMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentSMtoCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment CRto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentCRtoSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>SQL Query Connector In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createSQLQueryConnectorInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>Security Query Connector Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createSecurityQueryConnectorOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>Clearance Request Connector Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createClearanceRequestConnectorOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port SQto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortSQtoSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port SMto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortSMtoSQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortConfigurationRequis <em>Port Server To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortConfigurationRequis
	 * @generated
	 */
	public Adapter createPortServerToBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortConfigurationFourni <em>Port Binding To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortConfigurationFourni
	 * @generated
	 */
	public Adapter createPortBindingToServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port Binding To CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortBindingToCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port CMto Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortCMtoBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Binding <em>Binding Server To CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Binding
	 * @generated
	 */
	public Adapter createBindingServerToCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Binding <em>Binding CMto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Binding
	 * @generated
	 */
	public Adapter createBindingCMtoServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role RP Cfrom Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleRPCfromClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role RP Cto Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleRPCtoClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role RP Cto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleRPCtoServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role RP Cfrom Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleRPCfromServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role SQ Lto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleSQLtoDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role SQ Lfrom DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleSQLfromDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role SQ Lto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleSQLtoCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role SQ Lfrom CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleSQLfromCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role SQfrom DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleSQfromDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role SQto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleSQtoDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role SQto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleSQtoSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role SQfrom SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleSQfromSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role CRto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleCRtoCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role CRfrom SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleCRfromSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role CRto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleCRtoSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role CRfrom CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleCRfromCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Configuration <em>Configuration Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Configuration
	 * @generated
	 */
	public Adapter createConfigurationClientServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortConfigurationRequis <em>Port Binding To Config Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortConfigurationRequis
	 * @generated
	 */
	public Adapter createPortBindingToConfigClientServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortConfigurationFourni <em>Port Config Client Server To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortConfigurationFourni
	 * @generated
	 */
	public Adapter createPortConfigClientServerToBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port Client To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortClientToBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port Binding To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortBindingToClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link M1.BindingClientToConfigClientServer <em>Binding Client To Config Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see M1.BindingClientToConfigClientServer
	 * @generated
	 */
	public Adapter createBindingClientToConfigClientServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link M1.BindingConfigClientServerToClient <em>Binding Config Client Server To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see M1.BindingConfigClientServerToClient
	 * @generated
	 */
	public Adapter createBindingConfigClientServerToClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Composant
	 * @generated
	 */
	public Adapter createComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.ComposantSimple <em>Composant Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ComposantSimple
	 * @generated
	 */
	public Adapter createComposantSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposant <em>Port Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposant
	 * @generated
	 */
	public Adapter createPortComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantFourni <em>Port Composant Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	public Adapter createPortComposantFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortComposantRequis <em>Port Composant Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	public Adapter createPortComposantRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortConfiguration <em>Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortConfiguration
	 * @generated
	 */
	public Adapter createPortConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortConfigurationRequis <em>Port Configuration Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortConfigurationRequis
	 * @generated
	 */
	public Adapter createPortConfigurationRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortConfigurationFourni <em>Port Configuration Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortConfigurationFourni
	 * @generated
	 */
	public Adapter createPortConfigurationFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //M1AdapterFactory
