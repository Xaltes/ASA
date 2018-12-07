/**
 */
package M1.impl;

import M1.M1Factory;
import M1.M1Package;

import aSA.ASAPackage;
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

import aSA.impl.ASAPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M1PackageImpl extends EPackageImpl implements M1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portClienttoRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRPCtoClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRPCtoServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portServerToRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentClienttoRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcConnectorClientServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentRPCtoServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentServerToRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcConnectorServerClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentRPCToClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSQLtoCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portCMtoCREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portCRtoSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSMtoCREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSQtoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portCRtoCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portCMtoSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDBtoSQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDBtoSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSQLtoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlQueryConnectorOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearanceRequestConnectorInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityQueryConnectorInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentSQLtoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentDBtoSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentSQLtoCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentCMtoSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentDBtoSQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentSQtoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentSQtoSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentSMtoSQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentCRtoCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentCMtoCREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentSMtoCREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentCRtoSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlQueryConnectorInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityQueryConnectorOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearanceRequestConnectorOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSQtoSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSMtoSQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portServerToBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portBindingToServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portBindingToCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portCMtoBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingServerToCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingCMtoServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRPCfromClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRPCtoClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRPCtoServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRPCfromServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQLtoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQLfromDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQLtoCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQLfromCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQfromDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQtoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQtoSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSQfromSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleCRtoCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleCRfromSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleCRtoSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleCRfromCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationClientServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portBindingToConfigClientServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConfigClientServerToBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portClientToBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portBindingToClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingClientToConfigClientServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingConfigClientServerToClientEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see M1.M1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private M1PackageImpl() {
		super(eNS_URI, M1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link M1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static M1Package init() {
		if (isInited) return (M1Package)EPackage.Registry.INSTANCE.getEPackage(M1Package.eNS_URI);

		// Obtain or create and register package
		M1PackageImpl theM1Package = (M1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof M1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new M1PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ASAPackageImpl theASAPackage = (ASAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ASAPackage.eNS_URI) instanceof ASAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ASAPackage.eNS_URI) : ASAPackage.eINSTANCE);

		// Create package meta-data objects
		theM1Package.createPackageContents();
		theASAPackage.createPackageContents();

		// Initialize created meta-data
		theM1Package.initializePackageContents();
		theASAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theM1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(M1Package.eNS_URI, theM1Package);
		return theM1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Id() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Pseudo() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Portrpctoclient() {
		return (EReference)clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Portclienttorpc() {
		return (EReference)clientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Portclienttobinding() {
		return (EReference)clientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Portbindingtoclient() {
		return (EReference)clientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerConfiguration() {
		return serverConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Bindingcmtoserver() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Bindingservertocm() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Portservertorpc() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Portrpctoserver() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Portservertobinding() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Portbindingtoserver() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentsqltocm() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentcmtosql() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentsqltodb() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentdbtosql() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentdbtosq() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentsqtodb() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentsqtosm() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentsmtosq() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentcrtocm() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentcmtocr() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentsmtocr() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerConfiguration_Attachmentcrtosm() {
		return (EReference)serverConfigurationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portcmtocr() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portsqltocm() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portcmtosql() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portbindingtocm() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portcmtobinding() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Portdbtosql() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Portsqltodb() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Portdbtosq() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Portsqtodb() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityManager() {
		return securityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Portsmtocr() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Portsmtosq() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Portsqtosm() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortClienttoRPC() {
		return portClienttoRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRPCtoClient() {
		return portRPCtoClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRPCtoServer() {
		return portRPCtoServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortServerToRPC() {
		return portServerToRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentClienttoRPC() {
		return attachmentClienttoRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentClienttoRPC_Portclienttorpc() {
		return (EReference)attachmentClienttoRPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentClienttoRPC_Rolerpcfromclient() {
		return (EReference)attachmentClienttoRPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPCConnectorClientServer() {
		return rpcConnectorClientServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPCConnectorClientServer_Rolerpctoserver() {
		return (EReference)rpcConnectorClientServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPCConnectorClientServer_Rolerpcfromclient() {
		return (EReference)rpcConnectorClientServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentRPCtoServer() {
		return attachmentRPCtoServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentRPCtoServer_Portrpctoserver() {
		return (EReference)attachmentRPCtoServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentRPCtoServer_Rolerpctoserver() {
		return (EReference)attachmentRPCtoServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentServerToRPC() {
		return attachmentServerToRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentServerToRPC_Portservertorpc() {
		return (EReference)attachmentServerToRPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentServerToRPC_Rolerpcfromserver() {
		return (EReference)attachmentServerToRPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPCConnectorServerClient() {
		return rpcConnectorServerClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPCConnectorServerClient_Rolerpctoclient() {
		return (EReference)rpcConnectorServerClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPCConnectorServerClient_Rolerpcfromserver() {
		return (EReference)rpcConnectorServerClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentRPCToClient() {
		return attachmentRPCToClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentRPCToClient_Portrpctoclient() {
		return (EReference)attachmentRPCToClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentRPCToClient_Rolerpctoclient() {
		return (EReference)attachmentRPCToClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSQLtoCM() {
		return portSQLtoCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortCMtoCR() {
		return portCMtoCREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortCMtoCR_Attachmentcmtocr() {
		return (EReference)portCMtoCREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortCRtoSM() {
		return portCRtoSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortCRtoSM_Securitymanager() {
		return (EReference)portCRtoSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSMtoCR() {
		return portSMtoCREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortSMtoCR_Attachmentsmtocr() {
		return (EReference)portSMtoCREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSQtoDB() {
		return portSQtoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortCRtoCM() {
		return portCRtoCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortCRtoCM_Connectionmanager() {
		return (EReference)portCRtoCMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortCMtoSQL() {
		return portCMtoSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDBtoSQ() {
		return portDBtoSQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDBtoSQL() {
		return portDBtoSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSQLtoDB() {
		return portSQLtoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLQueryConnectorOut() {
		return sqlQueryConnectorOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLQueryConnectorOut_Rolesqlfromdb() {
		return (EReference)sqlQueryConnectorOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLQueryConnectorOut_Rolesqltocm() {
		return (EReference)sqlQueryConnectorOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearanceRequestConnectorIn() {
		return clearanceRequestConnectorInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearanceRequestConnectorIn_Rolecrfromcm() {
		return (EReference)clearanceRequestConnectorInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearanceRequestConnectorIn_Rolecrtosm() {
		return (EReference)clearanceRequestConnectorInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityQueryConnectorIn() {
		return securityQueryConnectorInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityQueryConnectorIn_Rolesqtodb() {
		return (EReference)securityQueryConnectorInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityQueryConnectorIn_Rolesqfromsm() {
		return (EReference)securityQueryConnectorInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentSQLtoDB() {
		return attachmentSQLtoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQLtoDB_Portsqltodb() {
		return (EReference)attachmentSQLtoDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQLtoDB_Rolesqltodb() {
		return (EReference)attachmentSQLtoDBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentDBtoSQL() {
		return attachmentDBtoSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentDBtoSQL_Portdbtosql() {
		return (EReference)attachmentDBtoSQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentDBtoSQL_Rolesqlfromdb() {
		return (EReference)attachmentDBtoSQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentSQLtoCM() {
		return attachmentSQLtoCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQLtoCM_Portsqltocm() {
		return (EReference)attachmentSQLtoCMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQLtoCM_Rolesqltocm() {
		return (EReference)attachmentSQLtoCMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentCMtoSQL() {
		return attachmentCMtoSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentCMtoSQL_Portcmtosql() {
		return (EReference)attachmentCMtoSQLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentCMtoSQL_Rolesqlfromcm() {
		return (EReference)attachmentCMtoSQLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentDBtoSQ() {
		return attachmentDBtoSQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentDBtoSQ_Portdbtosq() {
		return (EReference)attachmentDBtoSQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentDBtoSQ_Rolesqfromdb() {
		return (EReference)attachmentDBtoSQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentSQtoDB() {
		return attachmentSQtoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQtoDB_Portsqtodb() {
		return (EReference)attachmentSQtoDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQtoDB_Rolesqtodb() {
		return (EReference)attachmentSQtoDBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentSQtoSM() {
		return attachmentSQtoSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQtoSM_Portsqtosm() {
		return (EReference)attachmentSQtoSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSQtoSM_Rolesqtosm() {
		return (EReference)attachmentSQtoSMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentSMtoSQ() {
		return attachmentSMtoSQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSMtoSQ_Portsmtosq() {
		return (EReference)attachmentSMtoSQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSMtoSQ_Rolesqfromsm() {
		return (EReference)attachmentSMtoSQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentCRtoCM() {
		return attachmentCRtoCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentCRtoCM_Portcrtocm() {
		return (EReference)attachmentCRtoCMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentCRtoCM_Rolecrtocm() {
		return (EReference)attachmentCRtoCMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentCMtoCR() {
		return attachmentCMtoCREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentCMtoCR_Rolecrfromcm() {
		return (EReference)attachmentCMtoCREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentSMtoCR() {
		return attachmentSMtoCREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentSMtoCR_Rolecrfromsm() {
		return (EReference)attachmentSMtoCREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentCRtoSM() {
		return attachmentCRtoSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentCRtoSM_Portcrtosm() {
		return (EReference)attachmentCRtoSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentCRtoSM_Rolecrtosm() {
		return (EReference)attachmentCRtoSMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLQueryConnectorIn() {
		return sqlQueryConnectorInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLQueryConnectorIn_Rolesqltodb() {
		return (EReference)sqlQueryConnectorInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLQueryConnectorIn_Rolesqlfromcm() {
		return (EReference)sqlQueryConnectorInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityQueryConnectorOut() {
		return securityQueryConnectorOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityQueryConnectorOut_Rolesqfromdb() {
		return (EReference)securityQueryConnectorOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityQueryConnectorOut_Rolesqtosm() {
		return (EReference)securityQueryConnectorOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearanceRequestConnectorOut() {
		return clearanceRequestConnectorOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearanceRequestConnectorOut_Rolecrtocm() {
		return (EReference)clearanceRequestConnectorOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearanceRequestConnectorOut_Rolecrfromsm() {
		return (EReference)clearanceRequestConnectorOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSQtoSM() {
		return portSQtoSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSMtoSQ() {
		return portSMtoSQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortServerToBinding() {
		return portServerToBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortBindingToServer() {
		return portBindingToServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortBindingToCM() {
		return portBindingToCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortCMtoBinding() {
		return portCMtoBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingServerToCM() {
		return bindingServerToCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingServerToCM_Portbindingtocm() {
		return (EReference)bindingServerToCMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingServerToCM_Portservertobinding() {
		return (EReference)bindingServerToCMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingCMtoServer() {
		return bindingCMtoServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingCMtoServer_Portbindingtoserver() {
		return (EReference)bindingCMtoServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingCMtoServer_Portcmtobinding() {
		return (EReference)bindingCMtoServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRPCfromClient() {
		return roleRPCfromClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRPCtoClient() {
		return roleRPCtoClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRPCtoServer() {
		return roleRPCtoServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRPCfromServer() {
		return roleRPCfromServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQLtoDB() {
		return roleSQLtoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQLfromDB() {
		return roleSQLfromDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQLtoCM() {
		return roleSQLtoCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQLfromCM() {
		return roleSQLfromCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQfromDB() {
		return roleSQfromDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQtoDB() {
		return roleSQtoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQtoSM() {
		return roleSQtoSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSQfromSM() {
		return roleSQfromSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleCRtoCM() {
		return roleCRtoCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleCRfromSM() {
		return roleCRfromSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleCRtoSM() {
		return roleCRtoSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleCRfromCM() {
		return roleCRfromCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationClientServer() {
		return configurationClientServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Portbindingtoconfigclientserver() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Portconfigclientservertobinding() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Bindingclienttoconfigclientserver() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Bindingconfigclientservertoclient() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Attachmentrpctoclient() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Attachmentservertorpc() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Attachmentclienttorpc() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServer_Attachmentrpctoserver() {
		return (EReference)configurationClientServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortBindingToConfigClientServer() {
		return portBindingToConfigClientServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConfigClientServerToBinding() {
		return portConfigClientServerToBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortClientToBinding() {
		return portClientToBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortBindingToClient() {
		return portBindingToClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingClientToConfigClientServer() {
		return bindingClientToConfigClientServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingClientToConfigClientServer_Portbindingtoconfigclientserver() {
		return (EReference)bindingClientToConfigClientServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingClientToConfigClientServer_Portclienttobinding() {
		return (EReference)bindingClientToConfigClientServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingConfigClientServerToClient() {
		return bindingConfigClientServerToClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingConfigClientServerToClient_Portbindingtoclient() {
		return (EReference)bindingConfigClientServerToClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingConfigClientServerToClient_Portconfigclientservertobinding() {
		return (EReference)bindingConfigClientServerToClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1Factory getM1Factory() {
		return (M1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clientEClass = createEClass(CLIENT);
		createEAttribute(clientEClass, CLIENT__ID);
		createEAttribute(clientEClass, CLIENT__PSEUDO);
		createEReference(clientEClass, CLIENT__PORTRPCTOCLIENT);
		createEReference(clientEClass, CLIENT__PORTCLIENTTORPC);
		createEReference(clientEClass, CLIENT__PORTCLIENTTOBINDING);
		createEReference(clientEClass, CLIENT__PORTBINDINGTOCLIENT);

		serverConfigurationEClass = createEClass(SERVER_CONFIGURATION);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__BINDINGCMTOSERVER);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__BINDINGSERVERTOCM);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__PORTSERVERTORPC);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__PORTRPCTOSERVER);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__PORTSERVERTOBINDING);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__PORTBINDINGTOSERVER);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTSQLTOCM);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTCMTOSQL);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTSQLTODB);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTDBTOSQL);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTDBTOSQ);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTSQTODB);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTSQTOSM);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTSMTOSQ);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTCRTOCM);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTCMTOCR);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTSMTOCR);
		createEReference(serverConfigurationEClass, SERVER_CONFIGURATION__ATTACHMENTCRTOSM);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTCMTOCR);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTSQLTOCM);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTCMTOSQL);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTBINDINGTOCM);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTCMTOBINDING);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__PORTDBTOSQL);
		createEReference(databaseEClass, DATABASE__PORTSQLTODB);
		createEReference(databaseEClass, DATABASE__PORTDBTOSQ);
		createEReference(databaseEClass, DATABASE__PORTSQTODB);

		securityManagerEClass = createEClass(SECURITY_MANAGER);
		createEReference(securityManagerEClass, SECURITY_MANAGER__PORTSMTOCR);
		createEReference(securityManagerEClass, SECURITY_MANAGER__PORTSMTOSQ);
		createEReference(securityManagerEClass, SECURITY_MANAGER__PORTSQTOSM);

		portClienttoRPCEClass = createEClass(PORT_CLIENTTO_RPC);

		portRPCtoClientEClass = createEClass(PORT_RP_CTO_CLIENT);

		portRPCtoServerEClass = createEClass(PORT_RP_CTO_SERVER);

		portServerToRPCEClass = createEClass(PORT_SERVER_TO_RPC);

		attachmentClienttoRPCEClass = createEClass(ATTACHMENT_CLIENTTO_RPC);
		createEReference(attachmentClienttoRPCEClass, ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC);
		createEReference(attachmentClienttoRPCEClass, ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT);

		rpcConnectorClientServerEClass = createEClass(RPC_CONNECTOR_CLIENT_SERVER);
		createEReference(rpcConnectorClientServerEClass, RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER);
		createEReference(rpcConnectorClientServerEClass, RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT);

		attachmentRPCtoServerEClass = createEClass(ATTACHMENT_RP_CTO_SERVER);
		createEReference(attachmentRPCtoServerEClass, ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER);
		createEReference(attachmentRPCtoServerEClass, ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER);

		attachmentServerToRPCEClass = createEClass(ATTACHMENT_SERVER_TO_RPC);
		createEReference(attachmentServerToRPCEClass, ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC);
		createEReference(attachmentServerToRPCEClass, ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER);

		rpcConnectorServerClientEClass = createEClass(RPC_CONNECTOR_SERVER_CLIENT);
		createEReference(rpcConnectorServerClientEClass, RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT);
		createEReference(rpcConnectorServerClientEClass, RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER);

		attachmentRPCToClientEClass = createEClass(ATTACHMENT_RPC_TO_CLIENT);
		createEReference(attachmentRPCToClientEClass, ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT);
		createEReference(attachmentRPCToClientEClass, ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT);

		portSQLtoCMEClass = createEClass(PORT_SQ_LTO_CM);

		portCMtoCREClass = createEClass(PORT_CMTO_CR);
		createEReference(portCMtoCREClass, PORT_CMTO_CR__ATTACHMENTCMTOCR);

		portCRtoSMEClass = createEClass(PORT_CRTO_SM);
		createEReference(portCRtoSMEClass, PORT_CRTO_SM__SECURITYMANAGER);

		portSMtoCREClass = createEClass(PORT_SMTO_CR);
		createEReference(portSMtoCREClass, PORT_SMTO_CR__ATTACHMENTSMTOCR);

		portSQtoDBEClass = createEClass(PORT_SQTO_DB);

		portCRtoCMEClass = createEClass(PORT_CRTO_CM);
		createEReference(portCRtoCMEClass, PORT_CRTO_CM__CONNECTIONMANAGER);

		portCMtoSQLEClass = createEClass(PORT_CMTO_SQL);

		portDBtoSQEClass = createEClass(PORT_DBTO_SQ);

		portDBtoSQLEClass = createEClass(PORT_DBTO_SQL);

		portSQLtoDBEClass = createEClass(PORT_SQ_LTO_DB);

		sqlQueryConnectorOutEClass = createEClass(SQL_QUERY_CONNECTOR_OUT);
		createEReference(sqlQueryConnectorOutEClass, SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB);
		createEReference(sqlQueryConnectorOutEClass, SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM);

		clearanceRequestConnectorInEClass = createEClass(CLEARANCE_REQUEST_CONNECTOR_IN);
		createEReference(clearanceRequestConnectorInEClass, CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM);
		createEReference(clearanceRequestConnectorInEClass, CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM);

		securityQueryConnectorInEClass = createEClass(SECURITY_QUERY_CONNECTOR_IN);
		createEReference(securityQueryConnectorInEClass, SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB);
		createEReference(securityQueryConnectorInEClass, SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM);

		attachmentSQLtoDBEClass = createEClass(ATTACHMENT_SQ_LTO_DB);
		createEReference(attachmentSQLtoDBEClass, ATTACHMENT_SQ_LTO_DB__PORTSQLTODB);
		createEReference(attachmentSQLtoDBEClass, ATTACHMENT_SQ_LTO_DB__ROLESQLTODB);

		attachmentDBtoSQLEClass = createEClass(ATTACHMENT_DBTO_SQL);
		createEReference(attachmentDBtoSQLEClass, ATTACHMENT_DBTO_SQL__PORTDBTOSQL);
		createEReference(attachmentDBtoSQLEClass, ATTACHMENT_DBTO_SQL__ROLESQLFROMDB);

		attachmentSQLtoCMEClass = createEClass(ATTACHMENT_SQ_LTO_CM);
		createEReference(attachmentSQLtoCMEClass, ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM);
		createEReference(attachmentSQLtoCMEClass, ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM);

		attachmentCMtoSQLEClass = createEClass(ATTACHMENT_CMTO_SQL);
		createEReference(attachmentCMtoSQLEClass, ATTACHMENT_CMTO_SQL__PORTCMTOSQL);
		createEReference(attachmentCMtoSQLEClass, ATTACHMENT_CMTO_SQL__ROLESQLFROMCM);

		attachmentDBtoSQEClass = createEClass(ATTACHMENT_DBTO_SQ);
		createEReference(attachmentDBtoSQEClass, ATTACHMENT_DBTO_SQ__PORTDBTOSQ);
		createEReference(attachmentDBtoSQEClass, ATTACHMENT_DBTO_SQ__ROLESQFROMDB);

		attachmentSQtoDBEClass = createEClass(ATTACHMENT_SQTO_DB);
		createEReference(attachmentSQtoDBEClass, ATTACHMENT_SQTO_DB__PORTSQTODB);
		createEReference(attachmentSQtoDBEClass, ATTACHMENT_SQTO_DB__ROLESQTODB);

		attachmentSQtoSMEClass = createEClass(ATTACHMENT_SQTO_SM);
		createEReference(attachmentSQtoSMEClass, ATTACHMENT_SQTO_SM__PORTSQTOSM);
		createEReference(attachmentSQtoSMEClass, ATTACHMENT_SQTO_SM__ROLESQTOSM);

		attachmentSMtoSQEClass = createEClass(ATTACHMENT_SMTO_SQ);
		createEReference(attachmentSMtoSQEClass, ATTACHMENT_SMTO_SQ__PORTSMTOSQ);
		createEReference(attachmentSMtoSQEClass, ATTACHMENT_SMTO_SQ__ROLESQFROMSM);

		attachmentCRtoCMEClass = createEClass(ATTACHMENT_CRTO_CM);
		createEReference(attachmentCRtoCMEClass, ATTACHMENT_CRTO_CM__PORTCRTOCM);
		createEReference(attachmentCRtoCMEClass, ATTACHMENT_CRTO_CM__ROLECRTOCM);

		attachmentCMtoCREClass = createEClass(ATTACHMENT_CMTO_CR);
		createEReference(attachmentCMtoCREClass, ATTACHMENT_CMTO_CR__ROLECRFROMCM);

		attachmentSMtoCREClass = createEClass(ATTACHMENT_SMTO_CR);
		createEReference(attachmentSMtoCREClass, ATTACHMENT_SMTO_CR__ROLECRFROMSM);

		attachmentCRtoSMEClass = createEClass(ATTACHMENT_CRTO_SM);
		createEReference(attachmentCRtoSMEClass, ATTACHMENT_CRTO_SM__PORTCRTOSM);
		createEReference(attachmentCRtoSMEClass, ATTACHMENT_CRTO_SM__ROLECRTOSM);

		sqlQueryConnectorInEClass = createEClass(SQL_QUERY_CONNECTOR_IN);
		createEReference(sqlQueryConnectorInEClass, SQL_QUERY_CONNECTOR_IN__ROLESQLTODB);
		createEReference(sqlQueryConnectorInEClass, SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM);

		securityQueryConnectorOutEClass = createEClass(SECURITY_QUERY_CONNECTOR_OUT);
		createEReference(securityQueryConnectorOutEClass, SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB);
		createEReference(securityQueryConnectorOutEClass, SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM);

		clearanceRequestConnectorOutEClass = createEClass(CLEARANCE_REQUEST_CONNECTOR_OUT);
		createEReference(clearanceRequestConnectorOutEClass, CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM);
		createEReference(clearanceRequestConnectorOutEClass, CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM);

		portSQtoSMEClass = createEClass(PORT_SQTO_SM);

		portSMtoSQEClass = createEClass(PORT_SMTO_SQ);

		portServerToBindingEClass = createEClass(PORT_SERVER_TO_BINDING);

		portBindingToServerEClass = createEClass(PORT_BINDING_TO_SERVER);

		portBindingToCMEClass = createEClass(PORT_BINDING_TO_CM);

		portCMtoBindingEClass = createEClass(PORT_CMTO_BINDING);

		bindingServerToCMEClass = createEClass(BINDING_SERVER_TO_CM);
		createEReference(bindingServerToCMEClass, BINDING_SERVER_TO_CM__PORTBINDINGTOCM);
		createEReference(bindingServerToCMEClass, BINDING_SERVER_TO_CM__PORTSERVERTOBINDING);

		bindingCMtoServerEClass = createEClass(BINDING_CMTO_SERVER);
		createEReference(bindingCMtoServerEClass, BINDING_CMTO_SERVER__PORTBINDINGTOSERVER);
		createEReference(bindingCMtoServerEClass, BINDING_CMTO_SERVER__PORTCMTOBINDING);

		roleRPCfromClientEClass = createEClass(ROLE_RP_CFROM_CLIENT);

		roleRPCtoClientEClass = createEClass(ROLE_RP_CTO_CLIENT);

		roleRPCtoServerEClass = createEClass(ROLE_RP_CTO_SERVER);

		roleRPCfromServerEClass = createEClass(ROLE_RP_CFROM_SERVER);

		roleSQLtoDBEClass = createEClass(ROLE_SQ_LTO_DB);

		roleSQLfromDBEClass = createEClass(ROLE_SQ_LFROM_DB);

		roleSQLtoCMEClass = createEClass(ROLE_SQ_LTO_CM);

		roleSQLfromCMEClass = createEClass(ROLE_SQ_LFROM_CM);

		roleSQfromDBEClass = createEClass(ROLE_SQFROM_DB);

		roleSQtoDBEClass = createEClass(ROLE_SQTO_DB);

		roleSQtoSMEClass = createEClass(ROLE_SQTO_SM);

		roleSQfromSMEClass = createEClass(ROLE_SQFROM_SM);

		roleCRtoCMEClass = createEClass(ROLE_CRTO_CM);

		roleCRfromSMEClass = createEClass(ROLE_CRFROM_SM);

		roleCRtoSMEClass = createEClass(ROLE_CRTO_SM);

		roleCRfromCMEClass = createEClass(ROLE_CRFROM_CM);

		configurationClientServerEClass = createEClass(CONFIGURATION_CLIENT_SERVER);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC);
		createEReference(configurationClientServerEClass, CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER);

		portBindingToConfigClientServerEClass = createEClass(PORT_BINDING_TO_CONFIG_CLIENT_SERVER);

		portConfigClientServerToBindingEClass = createEClass(PORT_CONFIG_CLIENT_SERVER_TO_BINDING);

		portClientToBindingEClass = createEClass(PORT_CLIENT_TO_BINDING);

		portBindingToClientEClass = createEClass(PORT_BINDING_TO_CLIENT);

		bindingClientToConfigClientServerEClass = createEClass(BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER);
		createEReference(bindingClientToConfigClientServerEClass, BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER);
		createEReference(bindingClientToConfigClientServerEClass, BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING);

		bindingConfigClientServerToClientEClass = createEClass(BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT);
		createEReference(bindingConfigClientServerToClientEClass, BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT);
		createEReference(bindingConfigClientServerToClientEClass, BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ASAPackage theASAPackage = (ASAPackage)EPackage.Registry.INSTANCE.getEPackage(ASAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientEClass.getESuperTypes().add(theASAPackage.getComposantSimple());
		serverConfigurationEClass.getESuperTypes().add(theASAPackage.getConfiguration());
		connectionManagerEClass.getESuperTypes().add(theASAPackage.getComposantSimple());
		databaseEClass.getESuperTypes().add(theASAPackage.getComposantSimple());
		securityManagerEClass.getESuperTypes().add(theASAPackage.getComposantSimple());
		portClienttoRPCEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portRPCtoClientEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portRPCtoServerEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portServerToRPCEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		attachmentClienttoRPCEClass.getESuperTypes().add(theASAPackage.getAttachment());
		rpcConnectorClientServerEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		attachmentRPCtoServerEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentServerToRPCEClass.getESuperTypes().add(theASAPackage.getAttachment());
		rpcConnectorServerClientEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		attachmentRPCToClientEClass.getESuperTypes().add(theASAPackage.getAttachment());
		portSQLtoCMEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portCMtoCREClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portCRtoSMEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portSMtoCREClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portSQtoDBEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portCRtoCMEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portCMtoSQLEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portDBtoSQEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portDBtoSQLEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portSQLtoDBEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		sqlQueryConnectorOutEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		clearanceRequestConnectorInEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		securityQueryConnectorInEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		attachmentSQLtoDBEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentDBtoSQLEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentSQLtoCMEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentCMtoSQLEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentDBtoSQEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentSQtoDBEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentSQtoSMEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentSMtoSQEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentCRtoCMEClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentCMtoCREClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentSMtoCREClass.getESuperTypes().add(theASAPackage.getAttachment());
		attachmentCRtoSMEClass.getESuperTypes().add(theASAPackage.getAttachment());
		sqlQueryConnectorInEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		securityQueryConnectorOutEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		clearanceRequestConnectorOutEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		portSQtoSMEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portSMtoSQEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portServerToBindingEClass.getESuperTypes().add(theASAPackage.getPortConfigurationRequis());
		portBindingToServerEClass.getESuperTypes().add(theASAPackage.getPortConfigurationFourni());
		portBindingToCMEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		portCMtoBindingEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		bindingServerToCMEClass.getESuperTypes().add(theASAPackage.getBinding());
		bindingCMtoServerEClass.getESuperTypes().add(theASAPackage.getBinding());
		roleRPCfromClientEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleRPCtoClientEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		roleRPCtoServerEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		roleRPCfromServerEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleSQLtoDBEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		roleSQLfromDBEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleSQLtoCMEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		roleSQLfromCMEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleSQfromDBEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		roleSQtoDBEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleSQtoSMEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleSQfromSMEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		roleCRtoCMEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleCRfromSMEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		roleCRtoSMEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		roleCRfromCMEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		configurationClientServerEClass.getESuperTypes().add(theASAPackage.getConfiguration());
		portBindingToConfigClientServerEClass.getESuperTypes().add(theASAPackage.getPortConfigurationRequis());
		portConfigClientServerToBindingEClass.getESuperTypes().add(theASAPackage.getPortConfigurationFourni());
		portClientToBindingEClass.getESuperTypes().add(theASAPackage.getPortComposantFourni());
		portBindingToClientEClass.getESuperTypes().add(theASAPackage.getPortComposantRequis());
		bindingClientToConfigClientServerEClass.getESuperTypes().add(theASAPackage.getBinding());
		bindingConfigClientServerToClientEClass.getESuperTypes().add(theASAPackage.getBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientEClass, ComposantSimple.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClient_Id(), ecorePackage.getEString(), "id", null, 0, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Pseudo(), ecorePackage.getEString(), "pseudo", null, 0, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Portrpctoclient(), this.getPortRPCtoClient(), null, "portrpctoclient", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Portclienttorpc(), this.getPortClienttoRPC(), null, "portclienttorpc", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Portclienttobinding(), this.getPortClientToBinding(), null, "portclienttobinding", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Portbindingtoclient(), this.getPortBindingToClient(), null, "portbindingtoclient", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverConfigurationEClass, Configuration.class, "ServerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerConfiguration_Bindingcmtoserver(), this.getBindingCMtoServer(), null, "bindingcmtoserver", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Bindingservertocm(), this.getBindingServerToCM(), null, "bindingservertocm", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Portservertorpc(), this.getPortServerToRPC(), null, "portservertorpc", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Portrpctoserver(), this.getPortRPCtoServer(), null, "portrpctoserver", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Portservertobinding(), this.getPortServerToBinding(), null, "portservertobinding", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Portbindingtoserver(), this.getPortBindingToServer(), null, "portbindingtoserver", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentsqltocm(), this.getAttachmentSQLtoCM(), null, "attachmentsqltocm", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentcmtosql(), this.getAttachmentCMtoSQL(), null, "attachmentcmtosql", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentsqltodb(), this.getAttachmentSQLtoDB(), null, "attachmentsqltodb", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentdbtosql(), this.getAttachmentDBtoSQL(), null, "attachmentdbtosql", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentdbtosq(), this.getAttachmentDBtoSQ(), null, "attachmentdbtosq", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentsqtodb(), this.getAttachmentSQtoDB(), null, "attachmentsqtodb", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentsqtosm(), this.getAttachmentSQtoSM(), null, "attachmentsqtosm", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentsmtosq(), this.getAttachmentSMtoSQ(), null, "attachmentsmtosq", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentcrtocm(), this.getAttachmentCRtoCM(), null, "attachmentcrtocm", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentcmtocr(), this.getAttachmentCMtoCR(), null, "attachmentcmtocr", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentsmtocr(), this.getAttachmentSMtoCR(), null, "attachmentsmtocr", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerConfiguration_Attachmentcrtosm(), this.getAttachmentCRtoSM(), null, "attachmentcrtosm", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionManagerEClass, ComposantSimple.class, "ConnectionManager", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionManager_Portcmtocr(), this.getPortCMtoCR(), null, "portcmtocr", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Portsqltocm(), this.getPortSQLtoCM(), null, "portsqltocm", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Portcmtosql(), this.getPortCMtoSQL(), null, "portcmtosql", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Portbindingtocm(), this.getPortBindingToCM(), null, "portbindingtocm", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Portcmtobinding(), this.getPortCMtoBinding(), null, "portcmtobinding", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, ComposantSimple.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Portdbtosql(), this.getPortDBtoSQL(), null, "portdbtosql", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Portsqltodb(), this.getPortSQLtoDB(), null, "portsqltodb", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Portdbtosq(), this.getPortDBtoSQ(), null, "portdbtosq", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Portsqtodb(), this.getPortSQtoDB(), null, "portsqtodb", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityManagerEClass, ComposantSimple.class, "SecurityManager", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityManager_Portsmtocr(), this.getPortSMtoCR(), null, "portsmtocr", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Portsmtosq(), this.getPortSMtoSQ(), null, "portsmtosq", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Portsqtosm(), this.getPortSQtoSM(), null, "portsqtosm", null, 1, 1, ComposantSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portClienttoRPCEClass, PortComposantFourni.class, "PortClienttoRPC", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRPCtoClientEClass, PortComposantRequis.class, "PortRPCtoClient", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRPCtoServerEClass, PortComposantRequis.class, "PortRPCtoServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portServerToRPCEClass, PortComposantFourni.class, "PortServerToRPC", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachmentClienttoRPCEClass, Attachment.class, "AttachmentClienttoRPC", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentClienttoRPC_Portclienttorpc(), this.getPortClienttoRPC(), null, "portclienttorpc", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentClienttoRPC_Rolerpcfromclient(), this.getRoleRPCfromClient(), null, "rolerpcfromclient", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcConnectorClientServerEClass, Connecteur.class, "RPCConnectorClientServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPCConnectorClientServer_Rolerpctoserver(), this.getRoleRPCtoServer(), null, "rolerpctoserver", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPCConnectorClientServer_Rolerpcfromclient(), this.getRoleRPCfromClient(), null, "rolerpcfromclient", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentRPCtoServerEClass, Attachment.class, "AttachmentRPCtoServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentRPCtoServer_Portrpctoserver(), this.getPortRPCtoServer(), null, "portrpctoserver", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentRPCtoServer_Rolerpctoserver(), this.getRoleRPCtoServer(), null, "rolerpctoserver", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentServerToRPCEClass, Attachment.class, "AttachmentServerToRPC", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentServerToRPC_Portservertorpc(), this.getPortServerToRPC(), null, "portservertorpc", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentServerToRPC_Rolerpcfromserver(), this.getRoleRPCfromServer(), null, "rolerpcfromserver", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcConnectorServerClientEClass, Connecteur.class, "RPCConnectorServerClient", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPCConnectorServerClient_Rolerpctoclient(), this.getRoleRPCtoClient(), null, "rolerpctoclient", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPCConnectorServerClient_Rolerpcfromserver(), this.getRoleRPCfromServer(), null, "rolerpcfromserver", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentRPCToClientEClass, Attachment.class, "AttachmentRPCToClient", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentRPCToClient_Portrpctoclient(), this.getPortRPCtoClient(), null, "portrpctoclient", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentRPCToClient_Rolerpctoclient(), this.getRoleRPCtoClient(), null, "rolerpctoclient", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portSQLtoCMEClass, PortComposantRequis.class, "PortSQLtoCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portCMtoCREClass, PortComposantFourni.class, "PortCMtoCR", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortCMtoCR_Attachmentcmtocr(), this.getAttachmentCMtoCR(), null, "attachmentcmtocr", null, 1, 1, PortComposantFourni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portCRtoSMEClass, PortComposantRequis.class, "PortCRtoSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortCRtoSM_Securitymanager(), this.getSecurityManager(), null, "securitymanager", null, 1, 1, PortComposantRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portSMtoCREClass, PortComposantFourni.class, "PortSMtoCR", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortSMtoCR_Attachmentsmtocr(), this.getAttachmentSMtoCR(), null, "attachmentsmtocr", null, 1, 1, PortComposantFourni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portSQtoDBEClass, PortComposantRequis.class, "PortSQtoDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portCRtoCMEClass, PortComposantRequis.class, "PortCRtoCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortCRtoCM_Connectionmanager(), this.getConnectionManager(), null, "connectionmanager", null, 1, 1, PortComposantRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portCMtoSQLEClass, PortComposantFourni.class, "PortCMtoSQL", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portDBtoSQEClass, PortComposantFourni.class, "PortDBtoSQ", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portDBtoSQLEClass, PortComposantFourni.class, "PortDBtoSQL", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portSQLtoDBEClass, PortComposantRequis.class, "PortSQLtoDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlQueryConnectorOutEClass, Connecteur.class, "SQLQueryConnectorOut", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQLQueryConnectorOut_Rolesqlfromdb(), this.getRoleSQLfromDB(), null, "rolesqlfromdb", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLQueryConnectorOut_Rolesqltocm(), this.getRoleSQLtoCM(), null, "rolesqltocm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearanceRequestConnectorInEClass, Connecteur.class, "ClearanceRequestConnectorIn", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearanceRequestConnectorIn_Rolecrfromcm(), this.getRoleCRfromCM(), null, "rolecrfromcm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClearanceRequestConnectorIn_Rolecrtosm(), this.getRoleCRtoSM(), null, "rolecrtosm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityQueryConnectorInEClass, Connecteur.class, "SecurityQueryConnectorIn", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityQueryConnectorIn_Rolesqtodb(), this.getRoleSQtoDB(), null, "rolesqtodb", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityQueryConnectorIn_Rolesqfromsm(), this.getRoleSQfromSM(), null, "rolesqfromsm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentSQLtoDBEClass, Attachment.class, "AttachmentSQLtoDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentSQLtoDB_Portsqltodb(), this.getPortSQLtoDB(), null, "portsqltodb", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentSQLtoDB_Rolesqltodb(), this.getRoleSQLtoDB(), null, "rolesqltodb", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentDBtoSQLEClass, Attachment.class, "AttachmentDBtoSQL", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentDBtoSQL_Portdbtosql(), this.getPortDBtoSQL(), null, "portdbtosql", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentDBtoSQL_Rolesqlfromdb(), this.getRoleSQLfromDB(), null, "rolesqlfromdb", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentSQLtoCMEClass, Attachment.class, "AttachmentSQLtoCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentSQLtoCM_Portsqltocm(), this.getPortSQLtoCM(), null, "portsqltocm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentSQLtoCM_Rolesqltocm(), this.getRoleSQLtoCM(), null, "rolesqltocm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentCMtoSQLEClass, Attachment.class, "AttachmentCMtoSQL", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentCMtoSQL_Portcmtosql(), this.getPortCMtoSQL(), null, "portcmtosql", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentCMtoSQL_Rolesqlfromcm(), this.getRoleSQLfromCM(), null, "rolesqlfromcm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentDBtoSQEClass, Attachment.class, "AttachmentDBtoSQ", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentDBtoSQ_Portdbtosq(), this.getPortDBtoSQ(), null, "portdbtosq", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentDBtoSQ_Rolesqfromdb(), this.getRoleSQfromDB(), null, "rolesqfromdb", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentSQtoDBEClass, Attachment.class, "AttachmentSQtoDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentSQtoDB_Portsqtodb(), this.getPortSQtoDB(), null, "portsqtodb", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentSQtoDB_Rolesqtodb(), this.getRoleSQtoDB(), null, "rolesqtodb", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentSQtoSMEClass, Attachment.class, "AttachmentSQtoSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentSQtoSM_Portsqtosm(), this.getPortSQtoSM(), null, "portsqtosm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentSQtoSM_Rolesqtosm(), this.getRoleSQtoSM(), null, "rolesqtosm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentSMtoSQEClass, Attachment.class, "AttachmentSMtoSQ", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentSMtoSQ_Portsmtosq(), this.getPortSMtoSQ(), null, "portsmtosq", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentSMtoSQ_Rolesqfromsm(), this.getRoleSQfromSM(), null, "rolesqfromsm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentCRtoCMEClass, Attachment.class, "AttachmentCRtoCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentCRtoCM_Portcrtocm(), this.getPortCRtoCM(), null, "portcrtocm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentCRtoCM_Rolecrtocm(), this.getRoleCRtoCM(), null, "rolecrtocm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentCMtoCREClass, Attachment.class, "AttachmentCMtoCR", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentCMtoCR_Rolecrfromcm(), this.getRoleCRfromCM(), null, "rolecrfromcm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentSMtoCREClass, Attachment.class, "AttachmentSMtoCR", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentSMtoCR_Rolecrfromsm(), this.getRoleCRfromSM(), null, "rolecrfromsm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentCRtoSMEClass, Attachment.class, "AttachmentCRtoSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentCRtoSM_Portcrtosm(), this.getPortCRtoSM(), null, "portcrtosm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentCRtoSM_Rolecrtosm(), this.getRoleCRtoSM(), null, "rolecrtosm", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlQueryConnectorInEClass, Connecteur.class, "SQLQueryConnectorIn", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQLQueryConnectorIn_Rolesqltodb(), this.getRoleSQLtoDB(), null, "rolesqltodb", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLQueryConnectorIn_Rolesqlfromcm(), this.getRoleSQLfromCM(), null, "rolesqlfromcm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityQueryConnectorOutEClass, Connecteur.class, "SecurityQueryConnectorOut", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityQueryConnectorOut_Rolesqfromdb(), this.getRoleSQfromDB(), null, "rolesqfromdb", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityQueryConnectorOut_Rolesqtosm(), this.getRoleSQtoSM(), null, "rolesqtosm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearanceRequestConnectorOutEClass, Connecteur.class, "ClearanceRequestConnectorOut", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearanceRequestConnectorOut_Rolecrtocm(), this.getRoleCRtoCM(), null, "rolecrtocm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClearanceRequestConnectorOut_Rolecrfromsm(), this.getRoleCRfromSM(), null, "rolecrfromsm", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portSQtoSMEClass, PortComposantRequis.class, "PortSQtoSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portSMtoSQEClass, PortComposantFourni.class, "PortSMtoSQ", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portServerToBindingEClass, PortConfigurationRequis.class, "PortServerToBinding", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portBindingToServerEClass, PortConfigurationFourni.class, "PortBindingToServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portBindingToCMEClass, PortComposantRequis.class, "PortBindingToCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portCMtoBindingEClass, PortComposantFourni.class, "PortCMtoBinding", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingServerToCMEClass, Binding.class, "BindingServerToCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingServerToCM_Portbindingtocm(), this.getPortBindingToCM(), null, "portbindingtocm", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServerToCM_Portservertobinding(), this.getPortServerToBinding(), null, "portservertobinding", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingCMtoServerEClass, Binding.class, "BindingCMtoServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingCMtoServer_Portbindingtoserver(), this.getPortBindingToServer(), null, "portbindingtoserver", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingCMtoServer_Portcmtobinding(), this.getPortCMtoBinding(), null, "portcmtobinding", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleRPCfromClientEClass, RoleRequis.class, "RoleRPCfromClient", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRPCtoClientEClass, RoleFourni.class, "RoleRPCtoClient", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRPCtoServerEClass, RoleFourni.class, "RoleRPCtoServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRPCfromServerEClass, RoleRequis.class, "RoleRPCfromServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQLtoDBEClass, RoleFourni.class, "RoleSQLtoDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQLfromDBEClass, RoleRequis.class, "RoleSQLfromDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQLtoCMEClass, RoleFourni.class, "RoleSQLtoCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQLfromCMEClass, RoleRequis.class, "RoleSQLfromCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQfromDBEClass, RoleFourni.class, "RoleSQfromDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQtoDBEClass, RoleRequis.class, "RoleSQtoDB", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQtoSMEClass, RoleRequis.class, "RoleSQtoSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleSQfromSMEClass, RoleFourni.class, "RoleSQfromSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleCRtoCMEClass, RoleRequis.class, "RoleCRtoCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleCRfromSMEClass, RoleFourni.class, "RoleCRfromSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleCRtoSMEClass, RoleRequis.class, "RoleCRtoSM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleCRfromCMEClass, RoleFourni.class, "RoleCRfromCM", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationClientServerEClass, Configuration.class, "ConfigurationClientServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationClientServer_Portbindingtoconfigclientserver(), this.getPortBindingToConfigClientServer(), null, "portbindingtoconfigclientserver", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServer_Portconfigclientservertobinding(), this.getPortConfigClientServerToBinding(), null, "portconfigclientservertobinding", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServer_Bindingclienttoconfigclientserver(), this.getBindingClientToConfigClientServer(), null, "bindingclienttoconfigclientserver", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServer_Bindingconfigclientservertoclient(), this.getBindingConfigClientServerToClient(), null, "bindingconfigclientservertoclient", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServer_Attachmentrpctoclient(), this.getAttachmentRPCToClient(), null, "attachmentrpctoclient", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServer_Attachmentservertorpc(), this.getAttachmentServerToRPC(), null, "attachmentservertorpc", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServer_Attachmentclienttorpc(), this.getAttachmentClienttoRPC(), null, "attachmentclienttorpc", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServer_Attachmentrpctoserver(), this.getAttachmentRPCtoServer(), null, "attachmentrpctoserver", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portBindingToConfigClientServerEClass, PortConfigurationRequis.class, "PortBindingToConfigClientServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portConfigClientServerToBindingEClass, PortConfigurationFourni.class, "PortConfigClientServerToBinding", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portClientToBindingEClass, PortComposantFourni.class, "PortClientToBinding", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(portBindingToClientEClass, PortComposantRequis.class, "PortBindingToClient", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingClientToConfigClientServerEClass, Binding.class, "BindingClientToConfigClientServer", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingClientToConfigClientServer_Portbindingtoconfigclientserver(), this.getPortBindingToConfigClientServer(), null, "portbindingtoconfigclientserver", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingClientToConfigClientServer_Portclienttobinding(), this.getPortClientToBinding(), null, "portclienttobinding", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingConfigClientServerToClientEClass, Binding.class, "BindingConfigClientServerToClient", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingConfigClientServerToClient_Portbindingtoclient(), this.getPortBindingToClient(), null, "portbindingtoclient", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingConfigClientServerToClient_Portconfigclientservertobinding(), this.getPortConfigClientServerToBinding(), null, "portconfigclientservertobinding", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //M1PackageImpl
