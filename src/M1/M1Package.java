/**
 */
package M1;

import aSA.ASAPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see M1.M1Factory
 * @model kind="package"
 * @generated
 */
public interface M1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "M1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/M1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "M1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M1Package eINSTANCE = M1.impl.M1PackageImpl.init();

	/**
	 * The meta object id for the '{@link M1.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.ClientImpl
	 * @see M1.impl.M1PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACECOMPOSANT = ASAPackage.COMPOSANT_SIMPLE__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PROPRIETE = ASAPackage.COMPOSANT_SIMPLE__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONTRAINTETECHNIQUE = ASAPackage.COMPOSANT_SIMPLE__CONTRAINTETECHNIQUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ID = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PSEUDO = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portrpctoclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PORTRPCTOCLIENT = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portclienttorpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PORTCLIENTTORPC = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portclienttobinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PORTCLIENTTOBINDING = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Portbindingtoclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PORTBINDINGTOCLIENT = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = ASAPackage.COMPOSANT_SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.ServerConfigurationImpl <em>Server Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.ServerConfigurationImpl
	 * @see M1.impl.M1PackageImpl#getServerConfiguration()
	 * @generated
	 */
	int SERVER_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__INTERFACECOMPOSANT = ASAPackage.CONFIGURATION__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__PROPRIETE = ASAPackage.CONFIGURATION__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__CONTRAINTETECHNIQUE = ASAPackage.CONFIGURATION__CONTRAINTETECHNIQUE;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__COMPOSANT = ASAPackage.CONFIGURATION__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Interfaceconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__INTERFACECONFIGURATION = ASAPackage.CONFIGURATION__INTERFACECONFIGURATION;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENT = ASAPackage.CONFIGURATION__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__BINDING = ASAPackage.CONFIGURATION__BINDING;

	/**
	 * The feature id for the '<em><b>Bindingcmtoserver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__BINDINGCMTOSERVER = ASAPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindingservertocm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__BINDINGSERVERTOCM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portservertorpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__PORTSERVERTORPC = ASAPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portrpctoserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__PORTRPCTOSERVER = ASAPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portservertobinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__PORTSERVERTOBINDING = ASAPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Portbindingtoserver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__PORTBINDINGTOSERVER = ASAPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attachmentsqltocm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTSQLTOCM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attachmentcmtosql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTCMTOSQL = ASAPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attachmentsqltodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTSQLTODB = ASAPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attachmentdbtosql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTDBTOSQL = ASAPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attachmentdbtosq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTDBTOSQ = ASAPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attachmentsqtodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTSQTODB = ASAPackage.CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Attachmentsqtosm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTSQTOSM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Attachmentsmtosq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTSMTOSQ = ASAPackage.CONFIGURATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Attachmentcrtocm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTCRTOCM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Attachmentcmtocr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTCMTOCR = ASAPackage.CONFIGURATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Attachmentsmtocr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTSMTOCR = ASAPackage.CONFIGURATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Attachmentcrtosm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION__ATTACHMENTCRTOSM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Server Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION_FEATURE_COUNT = ASAPackage.CONFIGURATION_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Server Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONFIGURATION_OPERATION_COUNT = ASAPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.ConnectionManagerImpl
	 * @see M1.impl.M1PackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACECOMPOSANT = ASAPackage.COMPOSANT_SIMPLE__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PROPRIETE = ASAPackage.COMPOSANT_SIMPLE__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONTRAINTETECHNIQUE = ASAPackage.COMPOSANT_SIMPLE__CONTRAINTETECHNIQUE;

	/**
	 * The feature id for the '<em><b>Portcmtocr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTCMTOCR = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portsqltocm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTSQLTOCM = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portcmtosql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTCMTOSQL = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portbindingtocm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTBINDINGTOCM = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portcmtobinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTCMTOBINDING = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATION_COUNT = ASAPackage.COMPOSANT_SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.DatabaseImpl
	 * @see M1.impl.M1PackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__INTERFACECOMPOSANT = ASAPackage.COMPOSANT_SIMPLE__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PROPRIETE = ASAPackage.COMPOSANT_SIMPLE__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CONTRAINTETECHNIQUE = ASAPackage.COMPOSANT_SIMPLE__CONTRAINTETECHNIQUE;

	/**
	 * The feature id for the '<em><b>Portdbtosql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORTDBTOSQL = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portsqltodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORTSQLTODB = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portdbtosq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORTDBTOSQ = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portsqtodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORTSQTODB = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = ASAPackage.COMPOSANT_SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.SecurityManagerImpl
	 * @see M1.impl.M1PackageImpl#getSecurityManager()
	 * @generated
	 */
	int SECURITY_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACECOMPOSANT = ASAPackage.COMPOSANT_SIMPLE__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__PROPRIETE = ASAPackage.COMPOSANT_SIMPLE__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__CONTRAINTETECHNIQUE = ASAPackage.COMPOSANT_SIMPLE__CONTRAINTETECHNIQUE;

	/**
	 * The feature id for the '<em><b>Portsmtocr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__PORTSMTOCR = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portsmtosq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__PORTSMTOSQ = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portsqtosm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__PORTSQTOSM = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_FEATURE_COUNT = ASAPackage.COMPOSANT_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_OPERATION_COUNT = ASAPackage.COMPOSANT_SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortClienttoRPCImpl <em>Port Clientto RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortClienttoRPCImpl
	 * @see M1.impl.M1PackageImpl#getPortClienttoRPC()
	 * @generated
	 */
	int PORT_CLIENTTO_RPC = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CLIENTTO_RPC__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port Clientto RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CLIENTTO_RPC_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Clientto RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CLIENTTO_RPC_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortRPCtoClientImpl <em>Port RP Cto Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortRPCtoClientImpl
	 * @see M1.impl.M1PackageImpl#getPortRPCtoClient()
	 * @generated
	 */
	int PORT_RP_CTO_CLIENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RP_CTO_CLIENT__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port RP Cto Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RP_CTO_CLIENT_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port RP Cto Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RP_CTO_CLIENT_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortRPCtoServerImpl <em>Port RP Cto Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortRPCtoServerImpl
	 * @see M1.impl.M1PackageImpl#getPortRPCtoServer()
	 * @generated
	 */
	int PORT_RP_CTO_SERVER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RP_CTO_SERVER__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port RP Cto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RP_CTO_SERVER_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port RP Cto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RP_CTO_SERVER_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortServerToRPCImpl <em>Port Server To RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortServerToRPCImpl
	 * @see M1.impl.M1PackageImpl#getPortServerToRPC()
	 * @generated
	 */
	int PORT_SERVER_TO_RPC = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVER_TO_RPC__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port Server To RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVER_TO_RPC_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Server To RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVER_TO_RPC_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentClienttoRPCImpl <em>Attachment Clientto RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentClienttoRPCImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentClienttoRPC()
	 * @generated
	 */
	int ATTACHMENT_CLIENTTO_RPC = 9;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portclienttorpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerpcfromclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Clientto RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment Clientto RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENTTO_RPC_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RPCConnectorClientServerImpl <em>RPC Connector Client Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RPCConnectorClientServerImpl
	 * @see M1.impl.M1PackageImpl#getRPCConnectorClientServer()
	 * @generated
	 */
	int RPC_CONNECTOR_CLIENT_SERVER = 10;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_CLIENT_SERVER__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_CLIENT_SERVER__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolerpctoserver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerpcfromclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPC Connector Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_CLIENT_SERVER_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPC Connector Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_CLIENT_SERVER_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentRPCtoServerImpl <em>Attachment RP Cto Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentRPCtoServerImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentRPCtoServer()
	 * @generated
	 */
	int ATTACHMENT_RP_CTO_SERVER = 11;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portrpctoserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerpctoserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment RP Cto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment RP Cto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RP_CTO_SERVER_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentServerToRPCImpl <em>Attachment Server To RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentServerToRPCImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentServerToRPC()
	 * @generated
	 */
	int ATTACHMENT_SERVER_TO_RPC = 12;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portservertorpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerpcfromserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Server To RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment Server To RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_TO_RPC_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RPCConnectorServerClientImpl <em>RPC Connector Server Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RPCConnectorServerClientImpl
	 * @see M1.impl.M1PackageImpl#getRPCConnectorServerClient()
	 * @generated
	 */
	int RPC_CONNECTOR_SERVER_CLIENT = 13;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_SERVER_CLIENT__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_SERVER_CLIENT__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolerpctoclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerpcfromserver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPC Connector Server Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_SERVER_CLIENT_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPC Connector Server Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_CONNECTOR_SERVER_CLIENT_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentRPCToClientImpl <em>Attachment RPC To Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentRPCToClientImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentRPCToClient()
	 * @generated
	 */
	int ATTACHMENT_RPC_TO_CLIENT = 14;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portrpctoclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerpctoclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment RPC To Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment RPC To Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_TO_CLIENT_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortSQLtoCMImpl <em>Port SQ Lto CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortSQLtoCMImpl
	 * @see M1.impl.M1PackageImpl#getPortSQLtoCM()
	 * @generated
	 */
	int PORT_SQ_LTO_CM = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQ_LTO_CM__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port SQ Lto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQ_LTO_CM_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port SQ Lto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQ_LTO_CM_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortCMtoCRImpl <em>Port CMto CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortCMtoCRImpl
	 * @see M1.impl.M1PackageImpl#getPortCMtoCR()
	 * @generated
	 */
	int PORT_CMTO_CR = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_CR__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The feature id for the '<em><b>Attachmentcmtocr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_CR__ATTACHMENTCMTOCR = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port CMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_CR_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port CMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_CR_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortCRtoSMImpl <em>Port CRto SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortCRtoSMImpl
	 * @see M1.impl.M1PackageImpl#getPortCRtoSM()
	 * @generated
	 */
	int PORT_CRTO_SM = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_SM__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The feature id for the '<em><b>Securitymanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_SM__SECURITYMANAGER = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port CRto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_SM_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port CRto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_SM_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortSMtoCRImpl <em>Port SMto CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortSMtoCRImpl
	 * @see M1.impl.M1PackageImpl#getPortSMtoCR()
	 * @generated
	 */
	int PORT_SMTO_CR = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SMTO_CR__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The feature id for the '<em><b>Attachmentsmtocr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SMTO_CR__ATTACHMENTSMTOCR = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port SMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SMTO_CR_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port SMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SMTO_CR_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortSQtoDBImpl <em>Port SQto DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortSQtoDBImpl
	 * @see M1.impl.M1PackageImpl#getPortSQtoDB()
	 * @generated
	 */
	int PORT_SQTO_DB = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQTO_DB__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port SQto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQTO_DB_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port SQto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQTO_DB_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortCRtoCMImpl <em>Port CRto CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortCRtoCMImpl
	 * @see M1.impl.M1PackageImpl#getPortCRtoCM()
	 * @generated
	 */
	int PORT_CRTO_CM = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_CM__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The feature id for the '<em><b>Connectionmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_CM__CONNECTIONMANAGER = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port CRto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_CM_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port CRto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CRTO_CM_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortCMtoSQLImpl <em>Port CMto SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortCMtoSQLImpl
	 * @see M1.impl.M1PackageImpl#getPortCMtoSQL()
	 * @generated
	 */
	int PORT_CMTO_SQL = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_SQL__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port CMto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_SQL_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port CMto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_SQL_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortDBtoSQImpl <em>Port DBto SQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortDBtoSQImpl
	 * @see M1.impl.M1PackageImpl#getPortDBtoSQ()
	 * @generated
	 */
	int PORT_DBTO_SQ = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DBTO_SQ__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port DBto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DBTO_SQ_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port DBto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DBTO_SQ_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortDBtoSQLImpl <em>Port DBto SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortDBtoSQLImpl
	 * @see M1.impl.M1PackageImpl#getPortDBtoSQL()
	 * @generated
	 */
	int PORT_DBTO_SQL = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DBTO_SQL__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port DBto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DBTO_SQL_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port DBto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DBTO_SQL_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortSQLtoDBImpl <em>Port SQ Lto DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortSQLtoDBImpl
	 * @see M1.impl.M1PackageImpl#getPortSQLtoDB()
	 * @generated
	 */
	int PORT_SQ_LTO_DB = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQ_LTO_DB__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port SQ Lto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQ_LTO_DB_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port SQ Lto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQ_LTO_DB_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.SQLQueryConnectorOutImpl <em>SQL Query Connector Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.SQLQueryConnectorOutImpl
	 * @see M1.impl.M1PackageImpl#getSQLQueryConnectorOut()
	 * @generated
	 */
	int SQL_QUERY_CONNECTOR_OUT = 25;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_OUT__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_OUT__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolesqlfromdb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqltocm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SQL Query Connector Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_OUT_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SQL Query Connector Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_OUT_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.ClearanceRequestConnectorInImpl <em>Clearance Request Connector In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.ClearanceRequestConnectorInImpl
	 * @see M1.impl.M1PackageImpl#getClearanceRequestConnectorIn()
	 * @generated
	 */
	int CLEARANCE_REQUEST_CONNECTOR_IN = 26;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_IN__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_IN__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolecrfromcm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolecrtosm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clearance Request Connector In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_IN_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clearance Request Connector In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_IN_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.SecurityQueryConnectorInImpl <em>Security Query Connector In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.SecurityQueryConnectorInImpl
	 * @see M1.impl.M1PackageImpl#getSecurityQueryConnectorIn()
	 * @generated
	 */
	int SECURITY_QUERY_CONNECTOR_IN = 27;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_IN__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_IN__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolesqtodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqfromsm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Query Connector In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_IN_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Query Connector In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_IN_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentSQLtoDBImpl <em>Attachment SQ Lto DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentSQLtoDBImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentSQLtoDB()
	 * @generated
	 */
	int ATTACHMENT_SQ_LTO_DB = 28;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portsqltodb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB__PORTSQLTODB = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqltodb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB__ROLESQLTODB = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment SQ Lto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment SQ Lto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_DB_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentDBtoSQLImpl <em>Attachment DBto SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentDBtoSQLImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentDBtoSQL()
	 * @generated
	 */
	int ATTACHMENT_DBTO_SQL = 29;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portdbtosql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL__PORTDBTOSQL = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqlfromdb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL__ROLESQLFROMDB = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment DBto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment DBto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQL_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentSQLtoCMImpl <em>Attachment SQ Lto CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentSQLtoCMImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentSQLtoCM()
	 * @generated
	 */
	int ATTACHMENT_SQ_LTO_CM = 30;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portsqltocm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqltocm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment SQ Lto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment SQ Lto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQ_LTO_CM_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentCMtoSQLImpl <em>Attachment CMto SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentCMtoSQLImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentCMtoSQL()
	 * @generated
	 */
	int ATTACHMENT_CMTO_SQL = 31;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portcmtosql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL__PORTCMTOSQL = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqlfromcm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL__ROLESQLFROMCM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment CMto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment CMto SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_SQL_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentDBtoSQImpl <em>Attachment DBto SQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentDBtoSQImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentDBtoSQ()
	 * @generated
	 */
	int ATTACHMENT_DBTO_SQ = 32;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portdbtosq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ__PORTDBTOSQ = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqfromdb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ__ROLESQFROMDB = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment DBto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment DBto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DBTO_SQ_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentSQtoDBImpl <em>Attachment SQto DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentSQtoDBImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentSQtoDB()
	 * @generated
	 */
	int ATTACHMENT_SQTO_DB = 33;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portsqtodb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB__PORTSQTODB = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqtodb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB__ROLESQTODB = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment SQto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment SQto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_DB_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentSQtoSMImpl <em>Attachment SQto SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentSQtoSMImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentSQtoSM()
	 * @generated
	 */
	int ATTACHMENT_SQTO_SM = 34;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portsqtosm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM__PORTSQTOSM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqtosm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM__ROLESQTOSM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment SQto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment SQto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SQTO_SM_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentSMtoSQImpl <em>Attachment SMto SQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentSMtoSQImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentSMtoSQ()
	 * @generated
	 */
	int ATTACHMENT_SMTO_SQ = 35;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portsmtosq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ__PORTSMTOSQ = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqfromsm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ__ROLESQFROMSM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment SMto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment SMto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_SQ_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentCRtoCMImpl <em>Attachment CRto CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentCRtoCMImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentCRtoCM()
	 * @generated
	 */
	int ATTACHMENT_CRTO_CM = 36;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portcrtocm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM__PORTCRTOCM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolecrtocm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM__ROLECRTOCM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment CRto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment CRto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_CM_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentCMtoCRImpl <em>Attachment CMto CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentCMtoCRImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentCMtoCR()
	 * @generated
	 */
	int ATTACHMENT_CMTO_CR = 37;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Rolecrfromcm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR__ROLECRFROMCM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attachment CMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment CMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CMTO_CR_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentSMtoCRImpl <em>Attachment SMto CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentSMtoCRImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentSMtoCR()
	 * @generated
	 */
	int ATTACHMENT_SMTO_CR = 38;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Rolecrfromsm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR__ROLECRFROMSM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attachment SMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment SMto CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SMTO_CR_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.AttachmentCRtoSMImpl <em>Attachment CRto SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.AttachmentCRtoSMImpl
	 * @see M1.impl.M1PackageImpl#getAttachmentCRtoSM()
	 * @generated
	 */
	int ATTACHMENT_CRTO_SM = 39;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM__FROM_2 = ASAPackage.ATTACHMENT__FROM_2;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM__TO_1 = ASAPackage.ATTACHMENT__TO_1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM__FROM_1 = ASAPackage.ATTACHMENT__FROM_1;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM__TO_2 = ASAPackage.ATTACHMENT__TO_2;

	/**
	 * The feature id for the '<em><b>Portcrtosm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM__PORTCRTOSM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolecrtosm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM__ROLECRTOSM = ASAPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment CRto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM_FEATURE_COUNT = ASAPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = ASAPackage.ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM___ATTACH_ROLE_TO_PORT__ROLEFOURNI = ASAPackage.ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI;

	/**
	 * The number of operations of the '<em>Attachment CRto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CRTO_SM_OPERATION_COUNT = ASAPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.SQLQueryConnectorInImpl <em>SQL Query Connector In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.SQLQueryConnectorInImpl
	 * @see M1.impl.M1PackageImpl#getSQLQueryConnectorIn()
	 * @generated
	 */
	int SQL_QUERY_CONNECTOR_IN = 40;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_IN__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_IN__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolesqltodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_IN__ROLESQLTODB = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqlfromcm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SQL Query Connector In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_IN_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SQL Query Connector In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_CONNECTOR_IN_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.SecurityQueryConnectorOutImpl <em>Security Query Connector Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.SecurityQueryConnectorOutImpl
	 * @see M1.impl.M1PackageImpl#getSecurityQueryConnectorOut()
	 * @generated
	 */
	int SECURITY_QUERY_CONNECTOR_OUT = 41;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_OUT__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_OUT__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolesqfromdb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolesqtosm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Query Connector Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_OUT_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Query Connector Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUERY_CONNECTOR_OUT_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.ClearanceRequestConnectorOutImpl <em>Clearance Request Connector Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.ClearanceRequestConnectorOutImpl
	 * @see M1.impl.M1PackageImpl#getClearanceRequestConnectorOut()
	 * @generated
	 */
	int CLEARANCE_REQUEST_CONNECTOR_OUT = 42;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_OUT__INTERFACECONNECTEUR = ASAPackage.CONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_OUT__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolecrtocm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolecrfromsm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clearance Request Connector Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_OUT_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clearance Request Connector Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_REQUEST_CONNECTOR_OUT_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortSQtoSMImpl <em>Port SQto SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortSQtoSMImpl
	 * @see M1.impl.M1PackageImpl#getPortSQtoSM()
	 * @generated
	 */
	int PORT_SQTO_SM = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQTO_SM__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port SQto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQTO_SM_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port SQto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SQTO_SM_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortSMtoSQImpl <em>Port SMto SQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortSMtoSQImpl
	 * @see M1.impl.M1PackageImpl#getPortSMtoSQ()
	 * @generated
	 */
	int PORT_SMTO_SQ = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SMTO_SQ__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port SMto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SMTO_SQ_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port SMto SQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SMTO_SQ_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortServerToBindingImpl <em>Port Server To Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortServerToBindingImpl
	 * @see M1.impl.M1PackageImpl#getPortServerToBinding()
	 * @generated
	 */
	int PORT_SERVER_TO_BINDING = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVER_TO_BINDING__ID = ASAPackage.PORT_CONFIGURATION_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port Server To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVER_TO_BINDING_FEATURE_COUNT = ASAPackage.PORT_CONFIGURATION_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Server To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVER_TO_BINDING_OPERATION_COUNT = ASAPackage.PORT_CONFIGURATION_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortBindingToServerImpl <em>Port Binding To Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortBindingToServerImpl
	 * @see M1.impl.M1PackageImpl#getPortBindingToServer()
	 * @generated
	 */
	int PORT_BINDING_TO_SERVER = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_SERVER__ID = ASAPackage.PORT_CONFIGURATION_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port Binding To Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_SERVER_FEATURE_COUNT = ASAPackage.PORT_CONFIGURATION_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Binding To Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_SERVER_OPERATION_COUNT = ASAPackage.PORT_CONFIGURATION_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortBindingToCMImpl <em>Port Binding To CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortBindingToCMImpl
	 * @see M1.impl.M1PackageImpl#getPortBindingToCM()
	 * @generated
	 */
	int PORT_BINDING_TO_CM = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CM__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port Binding To CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CM_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Binding To CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CM_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortCMtoBindingImpl <em>Port CMto Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortCMtoBindingImpl
	 * @see M1.impl.M1PackageImpl#getPortCMtoBinding()
	 * @generated
	 */
	int PORT_CMTO_BINDING = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_BINDING__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port CMto Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_BINDING_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port CMto Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CMTO_BINDING_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.BindingServerToCMImpl <em>Binding Server To CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.BindingServerToCMImpl
	 * @see M1.impl.M1PackageImpl#getBindingServerToCM()
	 * @generated
	 */
	int BINDING_SERVER_TO_CM = 49;

	/**
	 * The feature id for the '<em><b>Portcomposant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM__PORTCOMPOSANT = ASAPackage.BINDING__PORTCOMPOSANT;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM__PORTCONFIGURATION = ASAPackage.BINDING__PORTCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Portbindingtocm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM__PORTBINDINGTOCM = ASAPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portservertobinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM__PORTSERVERTOBINDING = ASAPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Server To CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM_FEATURE_COUNT = ASAPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS;

	/**
	 * The number of operations of the '<em>Binding Server To CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_TO_CM_OPERATION_COUNT = ASAPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.BindingCMtoServerImpl <em>Binding CMto Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.BindingCMtoServerImpl
	 * @see M1.impl.M1PackageImpl#getBindingCMtoServer()
	 * @generated
	 */
	int BINDING_CMTO_SERVER = 50;

	/**
	 * The feature id for the '<em><b>Portcomposant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER__PORTCOMPOSANT = ASAPackage.BINDING__PORTCOMPOSANT;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER__PORTCONFIGURATION = ASAPackage.BINDING__PORTCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Portbindingtoserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER__PORTBINDINGTOSERVER = ASAPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portcmtobinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER__PORTCMTOBINDING = ASAPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding CMto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER_FEATURE_COUNT = ASAPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS;

	/**
	 * The number of operations of the '<em>Binding CMto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CMTO_SERVER_OPERATION_COUNT = ASAPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleRPCfromClientImpl <em>Role RP Cfrom Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleRPCfromClientImpl
	 * @see M1.impl.M1PackageImpl#getRoleRPCfromClient()
	 * @generated
	 */
	int ROLE_RP_CFROM_CLIENT = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CFROM_CLIENT__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role RP Cfrom Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CFROM_CLIENT_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role RP Cfrom Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CFROM_CLIENT_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleRPCtoClientImpl <em>Role RP Cto Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleRPCtoClientImpl
	 * @see M1.impl.M1PackageImpl#getRoleRPCtoClient()
	 * @generated
	 */
	int ROLE_RP_CTO_CLIENT = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CTO_CLIENT__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role RP Cto Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CTO_CLIENT_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role RP Cto Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CTO_CLIENT_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleRPCtoServerImpl <em>Role RP Cto Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleRPCtoServerImpl
	 * @see M1.impl.M1PackageImpl#getRoleRPCtoServer()
	 * @generated
	 */
	int ROLE_RP_CTO_SERVER = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CTO_SERVER__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role RP Cto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CTO_SERVER_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role RP Cto Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CTO_SERVER_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleRPCfromServerImpl <em>Role RP Cfrom Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleRPCfromServerImpl
	 * @see M1.impl.M1PackageImpl#getRoleRPCfromServer()
	 * @generated
	 */
	int ROLE_RP_CFROM_SERVER = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CFROM_SERVER__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role RP Cfrom Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CFROM_SERVER_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role RP Cfrom Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_RP_CFROM_SERVER_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQLtoDBImpl <em>Role SQ Lto DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQLtoDBImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQLtoDB()
	 * @generated
	 */
	int ROLE_SQ_LTO_DB = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LTO_DB__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role SQ Lto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LTO_DB_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQ Lto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LTO_DB_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQLfromDBImpl <em>Role SQ Lfrom DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQLfromDBImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQLfromDB()
	 * @generated
	 */
	int ROLE_SQ_LFROM_DB = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LFROM_DB__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role SQ Lfrom DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LFROM_DB_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQ Lfrom DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LFROM_DB_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQLtoCMImpl <em>Role SQ Lto CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQLtoCMImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQLtoCM()
	 * @generated
	 */
	int ROLE_SQ_LTO_CM = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LTO_CM__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role SQ Lto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LTO_CM_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQ Lto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LTO_CM_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQLfromCMImpl <em>Role SQ Lfrom CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQLfromCMImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQLfromCM()
	 * @generated
	 */
	int ROLE_SQ_LFROM_CM = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LFROM_CM__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role SQ Lfrom CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LFROM_CM_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQ Lfrom CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQ_LFROM_CM_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQfromDBImpl <em>Role SQfrom DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQfromDBImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQfromDB()
	 * @generated
	 */
	int ROLE_SQFROM_DB = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQFROM_DB__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role SQfrom DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQFROM_DB_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQfrom DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQFROM_DB_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQtoDBImpl <em>Role SQto DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQtoDBImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQtoDB()
	 * @generated
	 */
	int ROLE_SQTO_DB = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQTO_DB__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role SQto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQTO_DB_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQto DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQTO_DB_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQtoSMImpl <em>Role SQto SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQtoSMImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQtoSM()
	 * @generated
	 */
	int ROLE_SQTO_SM = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQTO_SM__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role SQto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQTO_SM_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQTO_SM_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleSQfromSMImpl <em>Role SQfrom SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleSQfromSMImpl
	 * @see M1.impl.M1PackageImpl#getRoleSQfromSM()
	 * @generated
	 */
	int ROLE_SQFROM_SM = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQFROM_SM__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role SQfrom SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQFROM_SM_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role SQfrom SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_SQFROM_SM_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleCRtoCMImpl <em>Role CRto CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleCRtoCMImpl
	 * @see M1.impl.M1PackageImpl#getRoleCRtoCM()
	 * @generated
	 */
	int ROLE_CRTO_CM = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRTO_CM__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role CRto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRTO_CM_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role CRto CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRTO_CM_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleCRfromSMImpl <em>Role CRfrom SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleCRfromSMImpl
	 * @see M1.impl.M1PackageImpl#getRoleCRfromSM()
	 * @generated
	 */
	int ROLE_CRFROM_SM = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRFROM_SM__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role CRfrom SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRFROM_SM_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role CRfrom SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRFROM_SM_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleCRtoSMImpl <em>Role CRto SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleCRtoSMImpl
	 * @see M1.impl.M1PackageImpl#getRoleCRtoSM()
	 * @generated
	 */
	int ROLE_CRTO_SM = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRTO_SM__ID = ASAPackage.ROLE_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Role CRto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRTO_SM_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role CRto SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRTO_SM_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.RoleCRfromCMImpl <em>Role CRfrom CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.RoleCRfromCMImpl
	 * @see M1.impl.M1PackageImpl#getRoleCRfromCM()
	 * @generated
	 */
	int ROLE_CRFROM_CM = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRFROM_CM__ID = ASAPackage.ROLE_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Role CRfrom CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRFROM_CM_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role CRfrom CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CRFROM_CM_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.ConfigurationClientServerImpl <em>Configuration Client Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.ConfigurationClientServerImpl
	 * @see M1.impl.M1PackageImpl#getConfigurationClientServer()
	 * @generated
	 */
	int CONFIGURATION_CLIENT_SERVER = 67;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__INTERFACECOMPOSANT = ASAPackage.CONFIGURATION__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__PROPRIETE = ASAPackage.CONFIGURATION__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__CONTRAINTETECHNIQUE = ASAPackage.CONFIGURATION__CONTRAINTETECHNIQUE;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__COMPOSANT = ASAPackage.CONFIGURATION__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Interfaceconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__INTERFACECONFIGURATION = ASAPackage.CONFIGURATION__INTERFACECONFIGURATION;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__ATTACHMENT = ASAPackage.CONFIGURATION__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__BINDING = ASAPackage.CONFIGURATION__BINDING;

	/**
	 * The feature id for the '<em><b>Portbindingtoconfigclientserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER = ASAPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portconfigclientservertobinding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING = ASAPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindingclienttoconfigclientserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER = ASAPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindingconfigclientservertoclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT = ASAPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attachmentrpctoclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT = ASAPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attachmentservertorpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC = ASAPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attachmentclienttorpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC = ASAPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attachmentrpctoserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER = ASAPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Configuration Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER_FEATURE_COUNT = ASAPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Configuration Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER_OPERATION_COUNT = ASAPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortBindingToConfigClientServerImpl <em>Port Binding To Config Client Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortBindingToConfigClientServerImpl
	 * @see M1.impl.M1PackageImpl#getPortBindingToConfigClientServer()
	 * @generated
	 */
	int PORT_BINDING_TO_CONFIG_CLIENT_SERVER = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CONFIG_CLIENT_SERVER__ID = ASAPackage.PORT_CONFIGURATION_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port Binding To Config Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CONFIG_CLIENT_SERVER_FEATURE_COUNT = ASAPackage.PORT_CONFIGURATION_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Binding To Config Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CONFIG_CLIENT_SERVER_OPERATION_COUNT = ASAPackage.PORT_CONFIGURATION_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortConfigClientServerToBindingImpl <em>Port Config Client Server To Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortConfigClientServerToBindingImpl
	 * @see M1.impl.M1PackageImpl#getPortConfigClientServerToBinding()
	 * @generated
	 */
	int PORT_CONFIG_CLIENT_SERVER_TO_BINDING = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG_CLIENT_SERVER_TO_BINDING__ID = ASAPackage.PORT_CONFIGURATION_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port Config Client Server To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG_CLIENT_SERVER_TO_BINDING_FEATURE_COUNT = ASAPackage.PORT_CONFIGURATION_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Config Client Server To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG_CLIENT_SERVER_TO_BINDING_OPERATION_COUNT = ASAPackage.PORT_CONFIGURATION_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortClientToBindingImpl <em>Port Client To Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortClientToBindingImpl
	 * @see M1.impl.M1PackageImpl#getPortClientToBinding()
	 * @generated
	 */
	int PORT_CLIENT_TO_BINDING = 70;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CLIENT_TO_BINDING__ID = ASAPackage.PORT_COMPOSANT_FOURNI__ID;

	/**
	 * The number of structural features of the '<em>Port Client To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CLIENT_TO_BINDING_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Client To Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CLIENT_TO_BINDING_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.PortBindingToClientImpl <em>Port Binding To Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.PortBindingToClientImpl
	 * @see M1.impl.M1PackageImpl#getPortBindingToClient()
	 * @generated
	 */
	int PORT_BINDING_TO_CLIENT = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CLIENT__ID = ASAPackage.PORT_COMPOSANT_REQUIS__ID;

	/**
	 * The number of structural features of the '<em>Port Binding To Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CLIENT_FEATURE_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Binding To Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TO_CLIENT_OPERATION_COUNT = ASAPackage.PORT_COMPOSANT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.BindingClientToConfigClientServerImpl <em>Binding Client To Config Client Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.BindingClientToConfigClientServerImpl
	 * @see M1.impl.M1PackageImpl#getBindingClientToConfigClientServer()
	 * @generated
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER = 72;

	/**
	 * The feature id for the '<em><b>Portcomposant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCOMPOSANT = ASAPackage.BINDING__PORTCOMPOSANT;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCONFIGURATION = ASAPackage.BINDING__PORTCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Portbindingtoconfigclientserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER = ASAPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portclienttobinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING = ASAPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Client To Config Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER_FEATURE_COUNT = ASAPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS;

	/**
	 * The number of operations of the '<em>Binding Client To Config Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER_OPERATION_COUNT = ASAPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link M1.impl.BindingConfigClientServerToClientImpl <em>Binding Config Client Server To Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see M1.impl.BindingConfigClientServerToClientImpl
	 * @see M1.impl.M1PackageImpl#getBindingConfigClientServerToClient()
	 * @generated
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT = 73;

	/**
	 * The feature id for the '<em><b>Portcomposant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCOMPOSANT = ASAPackage.BINDING__PORTCOMPOSANT;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGURATION = ASAPackage.BINDING__PORTCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Portbindingtoclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT = ASAPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portconfigclientservertobinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING = ASAPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Config Client Server To Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT_FEATURE_COUNT = ASAPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS = ASAPackage.BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS = ASAPackage.BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS;

	/**
	 * The number of operations of the '<em>Binding Config Client Server To Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT_OPERATION_COUNT = ASAPackage.BINDING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aSA.ComposantSimple <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see aSA.ComposantSimple
	 * @model instanceClass="aSA.ComposantSimple"
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link aSA.ComposantSimple#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aSA.ComposantSimple#getId()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Id();

	/**
	 * Returns the meta object for the attribute '{@link aSA.ComposantSimple#getPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see aSA.ComposantSimple#getPseudo()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Pseudo();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortrpctoclient <em>Portrpctoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portrpctoclient</em>'.
	 * @see aSA.ComposantSimple#getPortrpctoclient()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Portrpctoclient();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortclienttorpc <em>Portclienttorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portclienttorpc</em>'.
	 * @see aSA.ComposantSimple#getPortclienttorpc()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Portclienttorpc();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortclienttobinding <em>Portclienttobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portclienttobinding</em>'.
	 * @see aSA.ComposantSimple#getPortclienttobinding()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Portclienttobinding();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortbindingtoclient <em>Portbindingtoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portbindingtoclient</em>'.
	 * @see aSA.ComposantSimple#getPortbindingtoclient()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Portbindingtoclient();

	/**
	 * Returns the meta object for class '{@link aSA.Configuration <em>Server Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Configuration</em>'.
	 * @see aSA.Configuration
	 * @model instanceClass="aSA.Configuration"
	 * @generated
	 */
	EClass getServerConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getBindingcmtoserver <em>Bindingcmtoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindingcmtoserver</em>'.
	 * @see aSA.Configuration#getBindingcmtoserver()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Bindingcmtoserver();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getBindingservertocm <em>Bindingservertocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindingservertocm</em>'.
	 * @see aSA.Configuration#getBindingservertocm()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Bindingservertocm();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getPortservertorpc <em>Portservertorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portservertorpc</em>'.
	 * @see aSA.Configuration#getPortservertorpc()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Portservertorpc();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getPortrpctoserver <em>Portrpctoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portrpctoserver</em>'.
	 * @see aSA.Configuration#getPortrpctoserver()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Portrpctoserver();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getPortservertobinding <em>Portservertobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portservertobinding</em>'.
	 * @see aSA.Configuration#getPortservertobinding()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Portservertobinding();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getPortbindingtoserver <em>Portbindingtoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portbindingtoserver</em>'.
	 * @see aSA.Configuration#getPortbindingtoserver()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Portbindingtoserver();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentsqltocm <em>Attachmentsqltocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentsqltocm</em>'.
	 * @see aSA.Configuration#getAttachmentsqltocm()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentsqltocm();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentcmtosql <em>Attachmentcmtosql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentcmtosql</em>'.
	 * @see aSA.Configuration#getAttachmentcmtosql()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentcmtosql();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentsqltodb <em>Attachmentsqltodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentsqltodb</em>'.
	 * @see aSA.Configuration#getAttachmentsqltodb()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentsqltodb();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentdbtosql <em>Attachmentdbtosql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentdbtosql</em>'.
	 * @see aSA.Configuration#getAttachmentdbtosql()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentdbtosql();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentdbtosq <em>Attachmentdbtosq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentdbtosq</em>'.
	 * @see aSA.Configuration#getAttachmentdbtosq()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentdbtosq();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentsqtodb <em>Attachmentsqtodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentsqtodb</em>'.
	 * @see aSA.Configuration#getAttachmentsqtodb()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentsqtodb();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentsqtosm <em>Attachmentsqtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentsqtosm</em>'.
	 * @see aSA.Configuration#getAttachmentsqtosm()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentsqtosm();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentsmtosq <em>Attachmentsmtosq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentsmtosq</em>'.
	 * @see aSA.Configuration#getAttachmentsmtosq()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentsmtosq();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentcrtocm <em>Attachmentcrtocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentcrtocm</em>'.
	 * @see aSA.Configuration#getAttachmentcrtocm()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentcrtocm();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentcmtocr <em>Attachmentcmtocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentcmtocr</em>'.
	 * @see aSA.Configuration#getAttachmentcmtocr()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentcmtocr();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentsmtocr <em>Attachmentsmtocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentsmtocr</em>'.
	 * @see aSA.Configuration#getAttachmentsmtocr()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentsmtocr();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getAttachmentcrtosm <em>Attachmentcrtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachmentcrtosm</em>'.
	 * @see aSA.Configuration#getAttachmentcrtosm()
	 * @see #getServerConfiguration()
	 * @generated
	 */
	EReference getServerConfiguration_Attachmentcrtosm();

	/**
	 * Returns the meta object for class '{@link aSA.ComposantSimple <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see aSA.ComposantSimple
	 * @model instanceClass="aSA.ComposantSimple"
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for the reference '{@link aSA.ComposantSimple#getPortcmtocr <em>Portcmtocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portcmtocr</em>'.
	 * @see aSA.ComposantSimple#getPortcmtocr()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portcmtocr();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortsqltocm <em>Portsqltocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsqltocm</em>'.
	 * @see aSA.ComposantSimple#getPortsqltocm()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portsqltocm();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortcmtosql <em>Portcmtosql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portcmtosql</em>'.
	 * @see aSA.ComposantSimple#getPortcmtosql()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portcmtosql();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortbindingtocm <em>Portbindingtocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portbindingtocm</em>'.
	 * @see aSA.ComposantSimple#getPortbindingtocm()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portbindingtocm();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortcmtobinding <em>Portcmtobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portcmtobinding</em>'.
	 * @see aSA.ComposantSimple#getPortcmtobinding()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portcmtobinding();

	/**
	 * Returns the meta object for class '{@link aSA.ComposantSimple <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see aSA.ComposantSimple
	 * @model instanceClass="aSA.ComposantSimple"
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortdbtosql <em>Portdbtosql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portdbtosql</em>'.
	 * @see aSA.ComposantSimple#getPortdbtosql()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Portdbtosql();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortsqltodb <em>Portsqltodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsqltodb</em>'.
	 * @see aSA.ComposantSimple#getPortsqltodb()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Portsqltodb();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortdbtosq <em>Portdbtosq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portdbtosq</em>'.
	 * @see aSA.ComposantSimple#getPortdbtosq()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Portdbtosq();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortsqtodb <em>Portsqtodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsqtodb</em>'.
	 * @see aSA.ComposantSimple#getPortsqtodb()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Portsqtodb();

	/**
	 * Returns the meta object for class '{@link aSA.ComposantSimple <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manager</em>'.
	 * @see aSA.ComposantSimple
	 * @model instanceClass="aSA.ComposantSimple"
	 * @generated
	 */
	EClass getSecurityManager();

	/**
	 * Returns the meta object for the reference '{@link aSA.ComposantSimple#getPortsmtocr <em>Portsmtocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portsmtocr</em>'.
	 * @see aSA.ComposantSimple#getPortsmtocr()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Portsmtocr();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortsmtosq <em>Portsmtosq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsmtosq</em>'.
	 * @see aSA.ComposantSimple#getPortsmtosq()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Portsmtosq();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.ComposantSimple#getPortsqtosm <em>Portsqtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portsqtosm</em>'.
	 * @see aSA.ComposantSimple#getPortsqtosm()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Portsqtosm();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port Clientto RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Clientto RPC</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortClienttoRPC();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port RP Cto Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port RP Cto Client</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortRPCtoClient();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port RP Cto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port RP Cto Server</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortRPCtoServer();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port Server To RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Server To RPC</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortServerToRPC();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment Clientto RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Clientto RPC</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentClienttoRPC();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortclienttorpc <em>Portclienttorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portclienttorpc</em>'.
	 * @see aSA.Attachment#getPortclienttorpc()
	 * @see #getAttachmentClienttoRPC()
	 * @generated
	 */
	EReference getAttachmentClienttoRPC_Portclienttorpc();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolerpcfromclient <em>Rolerpcfromclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerpcfromclient</em>'.
	 * @see aSA.Attachment#getRolerpcfromclient()
	 * @see #getAttachmentClienttoRPC()
	 * @generated
	 */
	EReference getAttachmentClienttoRPC_Rolerpcfromclient();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>RPC Connector Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC Connector Client Server</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getRPCConnectorClientServer();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolerpctoserver <em>Rolerpctoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolerpctoserver</em>'.
	 * @see aSA.Connecteur#getRolerpctoserver()
	 * @see #getRPCConnectorClientServer()
	 * @generated
	 */
	EReference getRPCConnectorClientServer_Rolerpctoserver();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolerpcfromclient <em>Rolerpcfromclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolerpcfromclient</em>'.
	 * @see aSA.Connecteur#getRolerpcfromclient()
	 * @see #getRPCConnectorClientServer()
	 * @generated
	 */
	EReference getRPCConnectorClientServer_Rolerpcfromclient();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment RP Cto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment RP Cto Server</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentRPCtoServer();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortrpctoserver <em>Portrpctoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrpctoserver</em>'.
	 * @see aSA.Attachment#getPortrpctoserver()
	 * @see #getAttachmentRPCtoServer()
	 * @generated
	 */
	EReference getAttachmentRPCtoServer_Portrpctoserver();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolerpctoserver <em>Rolerpctoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerpctoserver</em>'.
	 * @see aSA.Attachment#getRolerpctoserver()
	 * @see #getAttachmentRPCtoServer()
	 * @generated
	 */
	EReference getAttachmentRPCtoServer_Rolerpctoserver();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment Server To RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Server To RPC</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentServerToRPC();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortservertorpc <em>Portservertorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portservertorpc</em>'.
	 * @see aSA.Attachment#getPortservertorpc()
	 * @see #getAttachmentServerToRPC()
	 * @generated
	 */
	EReference getAttachmentServerToRPC_Portservertorpc();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolerpcfromserver <em>Rolerpcfromserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerpcfromserver</em>'.
	 * @see aSA.Attachment#getRolerpcfromserver()
	 * @see #getAttachmentServerToRPC()
	 * @generated
	 */
	EReference getAttachmentServerToRPC_Rolerpcfromserver();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>RPC Connector Server Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC Connector Server Client</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getRPCConnectorServerClient();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolerpctoclient <em>Rolerpctoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolerpctoclient</em>'.
	 * @see aSA.Connecteur#getRolerpctoclient()
	 * @see #getRPCConnectorServerClient()
	 * @generated
	 */
	EReference getRPCConnectorServerClient_Rolerpctoclient();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolerpcfromserver <em>Rolerpcfromserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolerpcfromserver</em>'.
	 * @see aSA.Connecteur#getRolerpcfromserver()
	 * @see #getRPCConnectorServerClient()
	 * @generated
	 */
	EReference getRPCConnectorServerClient_Rolerpcfromserver();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment RPC To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment RPC To Client</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentRPCToClient();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortrpctoclient <em>Portrpctoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrpctoclient</em>'.
	 * @see aSA.Attachment#getPortrpctoclient()
	 * @see #getAttachmentRPCToClient()
	 * @generated
	 */
	EReference getAttachmentRPCToClient_Portrpctoclient();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolerpctoclient <em>Rolerpctoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerpctoclient</em>'.
	 * @see aSA.Attachment#getRolerpctoclient()
	 * @see #getAttachmentRPCToClient()
	 * @generated
	 */
	EReference getAttachmentRPCToClient_Rolerpctoclient();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port SQ Lto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port SQ Lto CM</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortSQLtoCM();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port CMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port CMto CR</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortCMtoCR();

	/**
	 * Returns the meta object for the reference '{@link aSA.PortComposantFourni#getAttachmentcmtocr <em>Attachmentcmtocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachmentcmtocr</em>'.
	 * @see aSA.PortComposantFourni#getAttachmentcmtocr()
	 * @see #getPortCMtoCR()
	 * @generated
	 */
	EReference getPortCMtoCR_Attachmentcmtocr();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port CRto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port CRto SM</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortCRtoSM();

	/**
	 * Returns the meta object for the reference '{@link aSA.PortComposantRequis#getSecuritymanager <em>Securitymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securitymanager</em>'.
	 * @see aSA.PortComposantRequis#getSecuritymanager()
	 * @see #getPortCRtoSM()
	 * @generated
	 */
	EReference getPortCRtoSM_Securitymanager();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port SMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port SMto CR</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortSMtoCR();

	/**
	 * Returns the meta object for the reference '{@link aSA.PortComposantFourni#getAttachmentsmtocr <em>Attachmentsmtocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachmentsmtocr</em>'.
	 * @see aSA.PortComposantFourni#getAttachmentsmtocr()
	 * @see #getPortSMtoCR()
	 * @generated
	 */
	EReference getPortSMtoCR_Attachmentsmtocr();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port SQto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port SQto DB</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortSQtoDB();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port CRto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port CRto CM</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortCRtoCM();

	/**
	 * Returns the meta object for the reference '{@link aSA.PortComposantRequis#getConnectionmanager <em>Connectionmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectionmanager</em>'.
	 * @see aSA.PortComposantRequis#getConnectionmanager()
	 * @see #getPortCRtoCM()
	 * @generated
	 */
	EReference getPortCRtoCM_Connectionmanager();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port CMto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port CMto SQL</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortCMtoSQL();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port DBto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port DBto SQ</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortDBtoSQ();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port DBto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port DBto SQL</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortDBtoSQL();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port SQ Lto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port SQ Lto DB</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortSQLtoDB();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>SQL Query Connector Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Query Connector Out</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getSQLQueryConnectorOut();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqlfromdb <em>Rolesqlfromdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqlfromdb</em>'.
	 * @see aSA.Connecteur#getRolesqlfromdb()
	 * @see #getSQLQueryConnectorOut()
	 * @generated
	 */
	EReference getSQLQueryConnectorOut_Rolesqlfromdb();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqltocm <em>Rolesqltocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqltocm</em>'.
	 * @see aSA.Connecteur#getRolesqltocm()
	 * @see #getSQLQueryConnectorOut()
	 * @generated
	 */
	EReference getSQLQueryConnectorOut_Rolesqltocm();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>Clearance Request Connector In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearance Request Connector In</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getClearanceRequestConnectorIn();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolecrfromcm <em>Rolecrfromcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolecrfromcm</em>'.
	 * @see aSA.Connecteur#getRolecrfromcm()
	 * @see #getClearanceRequestConnectorIn()
	 * @generated
	 */
	EReference getClearanceRequestConnectorIn_Rolecrfromcm();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolecrtosm <em>Rolecrtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolecrtosm</em>'.
	 * @see aSA.Connecteur#getRolecrtosm()
	 * @see #getClearanceRequestConnectorIn()
	 * @generated
	 */
	EReference getClearanceRequestConnectorIn_Rolecrtosm();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>Security Query Connector In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Query Connector In</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getSecurityQueryConnectorIn();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqtodb <em>Rolesqtodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqtodb</em>'.
	 * @see aSA.Connecteur#getRolesqtodb()
	 * @see #getSecurityQueryConnectorIn()
	 * @generated
	 */
	EReference getSecurityQueryConnectorIn_Rolesqtodb();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqfromsm <em>Rolesqfromsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqfromsm</em>'.
	 * @see aSA.Connecteur#getRolesqfromsm()
	 * @see #getSecurityQueryConnectorIn()
	 * @generated
	 */
	EReference getSecurityQueryConnectorIn_Rolesqfromsm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment SQ Lto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SQ Lto DB</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentSQLtoDB();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortsqltodb <em>Portsqltodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portsqltodb</em>'.
	 * @see aSA.Attachment#getPortsqltodb()
	 * @see #getAttachmentSQLtoDB()
	 * @generated
	 */
	EReference getAttachmentSQLtoDB_Portsqltodb();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqltodb <em>Rolesqltodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqltodb</em>'.
	 * @see aSA.Attachment#getRolesqltodb()
	 * @see #getAttachmentSQLtoDB()
	 * @generated
	 */
	EReference getAttachmentSQLtoDB_Rolesqltodb();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment DBto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment DBto SQL</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentDBtoSQL();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortdbtosql <em>Portdbtosql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portdbtosql</em>'.
	 * @see aSA.Attachment#getPortdbtosql()
	 * @see #getAttachmentDBtoSQL()
	 * @generated
	 */
	EReference getAttachmentDBtoSQL_Portdbtosql();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqlfromdb <em>Rolesqlfromdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqlfromdb</em>'.
	 * @see aSA.Attachment#getRolesqlfromdb()
	 * @see #getAttachmentDBtoSQL()
	 * @generated
	 */
	EReference getAttachmentDBtoSQL_Rolesqlfromdb();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment SQ Lto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SQ Lto CM</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentSQLtoCM();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortsqltocm <em>Portsqltocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portsqltocm</em>'.
	 * @see aSA.Attachment#getPortsqltocm()
	 * @see #getAttachmentSQLtoCM()
	 * @generated
	 */
	EReference getAttachmentSQLtoCM_Portsqltocm();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqltocm <em>Rolesqltocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqltocm</em>'.
	 * @see aSA.Attachment#getRolesqltocm()
	 * @see #getAttachmentSQLtoCM()
	 * @generated
	 */
	EReference getAttachmentSQLtoCM_Rolesqltocm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment CMto SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CMto SQL</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentCMtoSQL();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortcmtosql <em>Portcmtosql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portcmtosql</em>'.
	 * @see aSA.Attachment#getPortcmtosql()
	 * @see #getAttachmentCMtoSQL()
	 * @generated
	 */
	EReference getAttachmentCMtoSQL_Portcmtosql();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqlfromcm <em>Rolesqlfromcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqlfromcm</em>'.
	 * @see aSA.Attachment#getRolesqlfromcm()
	 * @see #getAttachmentCMtoSQL()
	 * @generated
	 */
	EReference getAttachmentCMtoSQL_Rolesqlfromcm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment DBto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment DBto SQ</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentDBtoSQ();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortdbtosq <em>Portdbtosq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portdbtosq</em>'.
	 * @see aSA.Attachment#getPortdbtosq()
	 * @see #getAttachmentDBtoSQ()
	 * @generated
	 */
	EReference getAttachmentDBtoSQ_Portdbtosq();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqfromdb <em>Rolesqfromdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqfromdb</em>'.
	 * @see aSA.Attachment#getRolesqfromdb()
	 * @see #getAttachmentDBtoSQ()
	 * @generated
	 */
	EReference getAttachmentDBtoSQ_Rolesqfromdb();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment SQto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SQto DB</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentSQtoDB();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortsqtodb <em>Portsqtodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portsqtodb</em>'.
	 * @see aSA.Attachment#getPortsqtodb()
	 * @see #getAttachmentSQtoDB()
	 * @generated
	 */
	EReference getAttachmentSQtoDB_Portsqtodb();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqtodb <em>Rolesqtodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqtodb</em>'.
	 * @see aSA.Attachment#getRolesqtodb()
	 * @see #getAttachmentSQtoDB()
	 * @generated
	 */
	EReference getAttachmentSQtoDB_Rolesqtodb();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment SQto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SQto SM</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentSQtoSM();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortsqtosm <em>Portsqtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portsqtosm</em>'.
	 * @see aSA.Attachment#getPortsqtosm()
	 * @see #getAttachmentSQtoSM()
	 * @generated
	 */
	EReference getAttachmentSQtoSM_Portsqtosm();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqtosm <em>Rolesqtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqtosm</em>'.
	 * @see aSA.Attachment#getRolesqtosm()
	 * @see #getAttachmentSQtoSM()
	 * @generated
	 */
	EReference getAttachmentSQtoSM_Rolesqtosm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment SMto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SMto SQ</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentSMtoSQ();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortsmtosq <em>Portsmtosq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portsmtosq</em>'.
	 * @see aSA.Attachment#getPortsmtosq()
	 * @see #getAttachmentSMtoSQ()
	 * @generated
	 */
	EReference getAttachmentSMtoSQ_Portsmtosq();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolesqfromsm <em>Rolesqfromsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolesqfromsm</em>'.
	 * @see aSA.Attachment#getRolesqfromsm()
	 * @see #getAttachmentSMtoSQ()
	 * @generated
	 */
	EReference getAttachmentSMtoSQ_Rolesqfromsm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment CRto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CRto CM</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentCRtoCM();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortcrtocm <em>Portcrtocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portcrtocm</em>'.
	 * @see aSA.Attachment#getPortcrtocm()
	 * @see #getAttachmentCRtoCM()
	 * @generated
	 */
	EReference getAttachmentCRtoCM_Portcrtocm();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolecrtocm <em>Rolecrtocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolecrtocm</em>'.
	 * @see aSA.Attachment#getRolecrtocm()
	 * @see #getAttachmentCRtoCM()
	 * @generated
	 */
	EReference getAttachmentCRtoCM_Rolecrtocm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment CMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CMto CR</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentCMtoCR();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolecrfromcm <em>Rolecrfromcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolecrfromcm</em>'.
	 * @see aSA.Attachment#getRolecrfromcm()
	 * @see #getAttachmentCMtoCR()
	 * @generated
	 */
	EReference getAttachmentCMtoCR_Rolecrfromcm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment SMto CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SMto CR</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentSMtoCR();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolecrfromsm <em>Rolecrfromsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolecrfromsm</em>'.
	 * @see aSA.Attachment#getRolecrfromsm()
	 * @see #getAttachmentSMtoCR()
	 * @generated
	 */
	EReference getAttachmentSMtoCR_Rolecrfromsm();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment CRto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CRto SM</em>'.
	 * @see aSA.Attachment
	 * @model instanceClass="aSA.Attachment"
	 * @generated
	 */
	EClass getAttachmentCRtoSM();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getPortcrtosm <em>Portcrtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portcrtosm</em>'.
	 * @see aSA.Attachment#getPortcrtosm()
	 * @see #getAttachmentCRtoSM()
	 * @generated
	 */
	EReference getAttachmentCRtoSM_Portcrtosm();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getRolecrtosm <em>Rolecrtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolecrtosm</em>'.
	 * @see aSA.Attachment#getRolecrtosm()
	 * @see #getAttachmentCRtoSM()
	 * @generated
	 */
	EReference getAttachmentCRtoSM_Rolecrtosm();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>SQL Query Connector In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Query Connector In</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getSQLQueryConnectorIn();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqltodb <em>Rolesqltodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqltodb</em>'.
	 * @see aSA.Connecteur#getRolesqltodb()
	 * @see #getSQLQueryConnectorIn()
	 * @generated
	 */
	EReference getSQLQueryConnectorIn_Rolesqltodb();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqlfromcm <em>Rolesqlfromcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqlfromcm</em>'.
	 * @see aSA.Connecteur#getRolesqlfromcm()
	 * @see #getSQLQueryConnectorIn()
	 * @generated
	 */
	EReference getSQLQueryConnectorIn_Rolesqlfromcm();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>Security Query Connector Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Query Connector Out</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getSecurityQueryConnectorOut();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqfromdb <em>Rolesqfromdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqfromdb</em>'.
	 * @see aSA.Connecteur#getRolesqfromdb()
	 * @see #getSecurityQueryConnectorOut()
	 * @generated
	 */
	EReference getSecurityQueryConnectorOut_Rolesqfromdb();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolesqtosm <em>Rolesqtosm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolesqtosm</em>'.
	 * @see aSA.Connecteur#getRolesqtosm()
	 * @see #getSecurityQueryConnectorOut()
	 * @generated
	 */
	EReference getSecurityQueryConnectorOut_Rolesqtosm();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>Clearance Request Connector Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearance Request Connector Out</em>'.
	 * @see aSA.Connecteur
	 * @model instanceClass="aSA.Connecteur"
	 * @generated
	 */
	EClass getClearanceRequestConnectorOut();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolecrtocm <em>Rolecrtocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolecrtocm</em>'.
	 * @see aSA.Connecteur#getRolecrtocm()
	 * @see #getClearanceRequestConnectorOut()
	 * @generated
	 */
	EReference getClearanceRequestConnectorOut_Rolecrtocm();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getRolecrfromsm <em>Rolecrfromsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolecrfromsm</em>'.
	 * @see aSA.Connecteur#getRolecrfromsm()
	 * @see #getClearanceRequestConnectorOut()
	 * @generated
	 */
	EReference getClearanceRequestConnectorOut_Rolecrfromsm();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port SQto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port SQto SM</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortSQtoSM();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port SMto SQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port SMto SQ</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortSMtoSQ();

	/**
	 * Returns the meta object for class '{@link aSA.PortConfigurationRequis <em>Port Server To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Server To Binding</em>'.
	 * @see aSA.PortConfigurationRequis
	 * @model instanceClass="aSA.PortConfigurationRequis"
	 * @generated
	 */
	EClass getPortServerToBinding();

	/**
	 * Returns the meta object for class '{@link aSA.PortConfigurationFourni <em>Port Binding To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Binding To Server</em>'.
	 * @see aSA.PortConfigurationFourni
	 * @model instanceClass="aSA.PortConfigurationFourni"
	 * @generated
	 */
	EClass getPortBindingToServer();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port Binding To CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Binding To CM</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortBindingToCM();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port CMto Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port CMto Binding</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortCMtoBinding();

	/**
	 * Returns the meta object for class '{@link aSA.Binding <em>Binding Server To CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Server To CM</em>'.
	 * @see aSA.Binding
	 * @model instanceClass="aSA.Binding"
	 * @generated
	 */
	EClass getBindingServerToCM();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortbindingtocm <em>Portbindingtocm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portbindingtocm</em>'.
	 * @see aSA.Binding#getPortbindingtocm()
	 * @see #getBindingServerToCM()
	 * @generated
	 */
	EReference getBindingServerToCM_Portbindingtocm();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortservertobinding <em>Portservertobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portservertobinding</em>'.
	 * @see aSA.Binding#getPortservertobinding()
	 * @see #getBindingServerToCM()
	 * @generated
	 */
	EReference getBindingServerToCM_Portservertobinding();

	/**
	 * Returns the meta object for class '{@link aSA.Binding <em>Binding CMto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding CMto Server</em>'.
	 * @see aSA.Binding
	 * @model instanceClass="aSA.Binding"
	 * @generated
	 */
	EClass getBindingCMtoServer();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortbindingtoserver <em>Portbindingtoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portbindingtoserver</em>'.
	 * @see aSA.Binding#getPortbindingtoserver()
	 * @see #getBindingCMtoServer()
	 * @generated
	 */
	EReference getBindingCMtoServer_Portbindingtoserver();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortcmtobinding <em>Portcmtobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portcmtobinding</em>'.
	 * @see aSA.Binding#getPortcmtobinding()
	 * @see #getBindingCMtoServer()
	 * @generated
	 */
	EReference getBindingCMtoServer_Portcmtobinding();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role RP Cfrom Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role RP Cfrom Client</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleRPCfromClient();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role RP Cto Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role RP Cto Client</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleRPCtoClient();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role RP Cto Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role RP Cto Server</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleRPCtoServer();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role RP Cfrom Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role RP Cfrom Server</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleRPCfromServer();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role SQ Lto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQ Lto DB</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleSQLtoDB();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role SQ Lfrom DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQ Lfrom DB</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleSQLfromDB();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role SQ Lto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQ Lto CM</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleSQLtoCM();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role SQ Lfrom CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQ Lfrom CM</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleSQLfromCM();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role SQfrom DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQfrom DB</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleSQfromDB();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role SQto DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQto DB</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleSQtoDB();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role SQto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQto SM</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleSQtoSM();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role SQfrom SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role SQfrom SM</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleSQfromSM();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role CRto CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role CRto CM</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleCRtoCM();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role CRfrom SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role CRfrom SM</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleCRfromSM();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role CRto SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role CRto SM</em>'.
	 * @see aSA.RoleRequis
	 * @model instanceClass="aSA.RoleRequis"
	 * @generated
	 */
	EClass getRoleCRtoSM();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role CRfrom CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role CRfrom CM</em>'.
	 * @see aSA.RoleFourni
	 * @model instanceClass="aSA.RoleFourni"
	 * @generated
	 */
	EClass getRoleCRfromCM();

	/**
	 * Returns the meta object for class '{@link aSA.Configuration <em>Configuration Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Client Server</em>'.
	 * @see aSA.Configuration
	 * @model instanceClass="aSA.Configuration"
	 * @generated
	 */
	EClass getConfigurationClientServer();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getPortbindingtoconfigclientserver <em>Portbindingtoconfigclientserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portbindingtoconfigclientserver</em>'.
	 * @see aSA.Configuration#getPortbindingtoconfigclientserver()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Portbindingtoconfigclientserver();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getPortconfigclientservertobinding <em>Portconfigclientservertobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portconfigclientservertobinding</em>'.
	 * @see aSA.Configuration#getPortconfigclientservertobinding()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Portconfigclientservertobinding();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getBindingclienttoconfigclientserver <em>Bindingclienttoconfigclientserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindingclienttoconfigclientserver</em>'.
	 * @see aSA.Configuration#getBindingclienttoconfigclientserver()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Bindingclienttoconfigclientserver();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getBindingconfigclientservertoclient <em>Bindingconfigclientservertoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindingconfigclientservertoclient</em>'.
	 * @see aSA.Configuration#getBindingconfigclientservertoclient()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Bindingconfigclientservertoclient();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getAttachmentrpctoclient <em>Attachmentrpctoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachmentrpctoclient</em>'.
	 * @see aSA.Configuration#getAttachmentrpctoclient()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Attachmentrpctoclient();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getAttachmentservertorpc <em>Attachmentservertorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachmentservertorpc</em>'.
	 * @see aSA.Configuration#getAttachmentservertorpc()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Attachmentservertorpc();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getAttachmentclienttorpc <em>Attachmentclienttorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachmentclienttorpc</em>'.
	 * @see aSA.Configuration#getAttachmentclienttorpc()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Attachmentclienttorpc();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getAttachmentrpctoserver <em>Attachmentrpctoserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachmentrpctoserver</em>'.
	 * @see aSA.Configuration#getAttachmentrpctoserver()
	 * @see #getConfigurationClientServer()
	 * @generated
	 */
	EReference getConfigurationClientServer_Attachmentrpctoserver();

	/**
	 * Returns the meta object for class '{@link aSA.PortConfigurationRequis <em>Port Binding To Config Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Binding To Config Client Server</em>'.
	 * @see aSA.PortConfigurationRequis
	 * @model instanceClass="aSA.PortConfigurationRequis"
	 * @generated
	 */
	EClass getPortBindingToConfigClientServer();

	/**
	 * Returns the meta object for class '{@link aSA.PortConfigurationFourni <em>Port Config Client Server To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Config Client Server To Binding</em>'.
	 * @see aSA.PortConfigurationFourni
	 * @model instanceClass="aSA.PortConfigurationFourni"
	 * @generated
	 */
	EClass getPortConfigClientServerToBinding();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port Client To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Client To Binding</em>'.
	 * @see aSA.PortComposantFourni
	 * @model instanceClass="aSA.PortComposantFourni"
	 * @generated
	 */
	EClass getPortClientToBinding();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port Binding To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Binding To Client</em>'.
	 * @see aSA.PortComposantRequis
	 * @model instanceClass="aSA.PortComposantRequis"
	 * @generated
	 */
	EClass getPortBindingToClient();

	/**
	 * Returns the meta object for class '{@link aSA.Binding <em>Binding Client To Config Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Client To Config Client Server</em>'.
	 * @see aSA.Binding
	 * @model instanceClass="aSA.Binding"
	 * @generated
	 */
	EClass getBindingClientToConfigClientServer();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortbindingtoconfigclientserver <em>Portbindingtoconfigclientserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portbindingtoconfigclientserver</em>'.
	 * @see aSA.Binding#getPortbindingtoconfigclientserver()
	 * @see #getBindingClientToConfigClientServer()
	 * @generated
	 */
	EReference getBindingClientToConfigClientServer_Portbindingtoconfigclientserver();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortclienttobinding <em>Portclienttobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portclienttobinding</em>'.
	 * @see aSA.Binding#getPortclienttobinding()
	 * @see #getBindingClientToConfigClientServer()
	 * @generated
	 */
	EReference getBindingClientToConfigClientServer_Portclienttobinding();

	/**
	 * Returns the meta object for class '{@link aSA.Binding <em>Binding Config Client Server To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Config Client Server To Client</em>'.
	 * @see aSA.Binding
	 * @model instanceClass="aSA.Binding"
	 * @generated
	 */
	EClass getBindingConfigClientServerToClient();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortbindingtoclient <em>Portbindingtoclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portbindingtoclient</em>'.
	 * @see aSA.Binding#getPortbindingtoclient()
	 * @see #getBindingConfigClientServerToClient()
	 * @generated
	 */
	EReference getBindingConfigClientServerToClient_Portbindingtoclient();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortconfigclientservertobinding <em>Portconfigclientservertobinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portconfigclientservertobinding</em>'.
	 * @see aSA.Binding#getPortconfigclientservertobinding()
	 * @see #getBindingConfigClientServerToClient()
	 * @generated
	 */
	EReference getBindingConfigClientServerToClient_Portconfigclientservertobinding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	M1Factory getM1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link M1.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.ClientImpl
		 * @see M1.impl.M1PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__ID = eINSTANCE.getClient_Id();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__PSEUDO = eINSTANCE.getClient_Pseudo();

		/**
		 * The meta object literal for the '<em><b>Portrpctoclient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PORTRPCTOCLIENT = eINSTANCE.getClient_Portrpctoclient();

		/**
		 * The meta object literal for the '<em><b>Portclienttorpc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PORTCLIENTTORPC = eINSTANCE.getClient_Portclienttorpc();

		/**
		 * The meta object literal for the '<em><b>Portclienttobinding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PORTCLIENTTOBINDING = eINSTANCE.getClient_Portclienttobinding();

		/**
		 * The meta object literal for the '<em><b>Portbindingtoclient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PORTBINDINGTOCLIENT = eINSTANCE.getClient_Portbindingtoclient();

		/**
		 * The meta object literal for the '{@link M1.impl.ServerConfigurationImpl <em>Server Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.ServerConfigurationImpl
		 * @see M1.impl.M1PackageImpl#getServerConfiguration()
		 * @generated
		 */
		EClass SERVER_CONFIGURATION = eINSTANCE.getServerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Bindingcmtoserver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__BINDINGCMTOSERVER = eINSTANCE.getServerConfiguration_Bindingcmtoserver();

		/**
		 * The meta object literal for the '<em><b>Bindingservertocm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__BINDINGSERVERTOCM = eINSTANCE.getServerConfiguration_Bindingservertocm();

		/**
		 * The meta object literal for the '<em><b>Portservertorpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__PORTSERVERTORPC = eINSTANCE.getServerConfiguration_Portservertorpc();

		/**
		 * The meta object literal for the '<em><b>Portrpctoserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__PORTRPCTOSERVER = eINSTANCE.getServerConfiguration_Portrpctoserver();

		/**
		 * The meta object literal for the '<em><b>Portservertobinding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__PORTSERVERTOBINDING = eINSTANCE.getServerConfiguration_Portservertobinding();

		/**
		 * The meta object literal for the '<em><b>Portbindingtoserver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__PORTBINDINGTOSERVER = eINSTANCE.getServerConfiguration_Portbindingtoserver();

		/**
		 * The meta object literal for the '<em><b>Attachmentsqltocm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTSQLTOCM = eINSTANCE.getServerConfiguration_Attachmentsqltocm();

		/**
		 * The meta object literal for the '<em><b>Attachmentcmtosql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTCMTOSQL = eINSTANCE.getServerConfiguration_Attachmentcmtosql();

		/**
		 * The meta object literal for the '<em><b>Attachmentsqltodb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTSQLTODB = eINSTANCE.getServerConfiguration_Attachmentsqltodb();

		/**
		 * The meta object literal for the '<em><b>Attachmentdbtosql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTDBTOSQL = eINSTANCE.getServerConfiguration_Attachmentdbtosql();

		/**
		 * The meta object literal for the '<em><b>Attachmentdbtosq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTDBTOSQ = eINSTANCE.getServerConfiguration_Attachmentdbtosq();

		/**
		 * The meta object literal for the '<em><b>Attachmentsqtodb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTSQTODB = eINSTANCE.getServerConfiguration_Attachmentsqtodb();

		/**
		 * The meta object literal for the '<em><b>Attachmentsqtosm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTSQTOSM = eINSTANCE.getServerConfiguration_Attachmentsqtosm();

		/**
		 * The meta object literal for the '<em><b>Attachmentsmtosq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTSMTOSQ = eINSTANCE.getServerConfiguration_Attachmentsmtosq();

		/**
		 * The meta object literal for the '<em><b>Attachmentcrtocm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTCRTOCM = eINSTANCE.getServerConfiguration_Attachmentcrtocm();

		/**
		 * The meta object literal for the '<em><b>Attachmentcmtocr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTCMTOCR = eINSTANCE.getServerConfiguration_Attachmentcmtocr();

		/**
		 * The meta object literal for the '<em><b>Attachmentsmtocr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTSMTOCR = eINSTANCE.getServerConfiguration_Attachmentsmtocr();

		/**
		 * The meta object literal for the '<em><b>Attachmentcrtosm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONFIGURATION__ATTACHMENTCRTOSM = eINSTANCE.getServerConfiguration_Attachmentcrtosm();

		/**
		 * The meta object literal for the '{@link M1.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.ConnectionManagerImpl
		 * @see M1.impl.M1PackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '<em><b>Portcmtocr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTCMTOCR = eINSTANCE.getConnectionManager_Portcmtocr();

		/**
		 * The meta object literal for the '<em><b>Portsqltocm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTSQLTOCM = eINSTANCE.getConnectionManager_Portsqltocm();

		/**
		 * The meta object literal for the '<em><b>Portcmtosql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTCMTOSQL = eINSTANCE.getConnectionManager_Portcmtosql();

		/**
		 * The meta object literal for the '<em><b>Portbindingtocm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTBINDINGTOCM = eINSTANCE.getConnectionManager_Portbindingtocm();

		/**
		 * The meta object literal for the '<em><b>Portcmtobinding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTCMTOBINDING = eINSTANCE.getConnectionManager_Portcmtobinding();

		/**
		 * The meta object literal for the '{@link M1.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.DatabaseImpl
		 * @see M1.impl.M1PackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Portdbtosql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__PORTDBTOSQL = eINSTANCE.getDatabase_Portdbtosql();

		/**
		 * The meta object literal for the '<em><b>Portsqltodb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__PORTSQLTODB = eINSTANCE.getDatabase_Portsqltodb();

		/**
		 * The meta object literal for the '<em><b>Portdbtosq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__PORTDBTOSQ = eINSTANCE.getDatabase_Portdbtosq();

		/**
		 * The meta object literal for the '<em><b>Portsqtodb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__PORTSQTODB = eINSTANCE.getDatabase_Portsqtodb();

		/**
		 * The meta object literal for the '{@link M1.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.SecurityManagerImpl
		 * @see M1.impl.M1PackageImpl#getSecurityManager()
		 * @generated
		 */
		EClass SECURITY_MANAGER = eINSTANCE.getSecurityManager();

		/**
		 * The meta object literal for the '<em><b>Portsmtocr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__PORTSMTOCR = eINSTANCE.getSecurityManager_Portsmtocr();

		/**
		 * The meta object literal for the '<em><b>Portsmtosq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__PORTSMTOSQ = eINSTANCE.getSecurityManager_Portsmtosq();

		/**
		 * The meta object literal for the '<em><b>Portsqtosm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__PORTSQTOSM = eINSTANCE.getSecurityManager_Portsqtosm();

		/**
		 * The meta object literal for the '{@link M1.impl.PortClienttoRPCImpl <em>Port Clientto RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortClienttoRPCImpl
		 * @see M1.impl.M1PackageImpl#getPortClienttoRPC()
		 * @generated
		 */
		EClass PORT_CLIENTTO_RPC = eINSTANCE.getPortClienttoRPC();

		/**
		 * The meta object literal for the '{@link M1.impl.PortRPCtoClientImpl <em>Port RP Cto Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortRPCtoClientImpl
		 * @see M1.impl.M1PackageImpl#getPortRPCtoClient()
		 * @generated
		 */
		EClass PORT_RP_CTO_CLIENT = eINSTANCE.getPortRPCtoClient();

		/**
		 * The meta object literal for the '{@link M1.impl.PortRPCtoServerImpl <em>Port RP Cto Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortRPCtoServerImpl
		 * @see M1.impl.M1PackageImpl#getPortRPCtoServer()
		 * @generated
		 */
		EClass PORT_RP_CTO_SERVER = eINSTANCE.getPortRPCtoServer();

		/**
		 * The meta object literal for the '{@link M1.impl.PortServerToRPCImpl <em>Port Server To RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortServerToRPCImpl
		 * @see M1.impl.M1PackageImpl#getPortServerToRPC()
		 * @generated
		 */
		EClass PORT_SERVER_TO_RPC = eINSTANCE.getPortServerToRPC();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentClienttoRPCImpl <em>Attachment Clientto RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentClienttoRPCImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentClienttoRPC()
		 * @generated
		 */
		EClass ATTACHMENT_CLIENTTO_RPC = eINSTANCE.getAttachmentClienttoRPC();

		/**
		 * The meta object literal for the '<em><b>Portclienttorpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CLIENTTO_RPC__PORTCLIENTTORPC = eINSTANCE.getAttachmentClienttoRPC_Portclienttorpc();

		/**
		 * The meta object literal for the '<em><b>Rolerpcfromclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CLIENTTO_RPC__ROLERPCFROMCLIENT = eINSTANCE.getAttachmentClienttoRPC_Rolerpcfromclient();

		/**
		 * The meta object literal for the '{@link M1.impl.RPCConnectorClientServerImpl <em>RPC Connector Client Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RPCConnectorClientServerImpl
		 * @see M1.impl.M1PackageImpl#getRPCConnectorClientServer()
		 * @generated
		 */
		EClass RPC_CONNECTOR_CLIENT_SERVER = eINSTANCE.getRPCConnectorClientServer();

		/**
		 * The meta object literal for the '<em><b>Rolerpctoserver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_CONNECTOR_CLIENT_SERVER__ROLERPCTOSERVER = eINSTANCE.getRPCConnectorClientServer_Rolerpctoserver();

		/**
		 * The meta object literal for the '<em><b>Rolerpcfromclient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_CONNECTOR_CLIENT_SERVER__ROLERPCFROMCLIENT = eINSTANCE.getRPCConnectorClientServer_Rolerpcfromclient();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentRPCtoServerImpl <em>Attachment RP Cto Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentRPCtoServerImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentRPCtoServer()
		 * @generated
		 */
		EClass ATTACHMENT_RP_CTO_SERVER = eINSTANCE.getAttachmentRPCtoServer();

		/**
		 * The meta object literal for the '<em><b>Portrpctoserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RP_CTO_SERVER__PORTRPCTOSERVER = eINSTANCE.getAttachmentRPCtoServer_Portrpctoserver();

		/**
		 * The meta object literal for the '<em><b>Rolerpctoserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RP_CTO_SERVER__ROLERPCTOSERVER = eINSTANCE.getAttachmentRPCtoServer_Rolerpctoserver();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentServerToRPCImpl <em>Attachment Server To RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentServerToRPCImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentServerToRPC()
		 * @generated
		 */
		EClass ATTACHMENT_SERVER_TO_RPC = eINSTANCE.getAttachmentServerToRPC();

		/**
		 * The meta object literal for the '<em><b>Portservertorpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SERVER_TO_RPC__PORTSERVERTORPC = eINSTANCE.getAttachmentServerToRPC_Portservertorpc();

		/**
		 * The meta object literal for the '<em><b>Rolerpcfromserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SERVER_TO_RPC__ROLERPCFROMSERVER = eINSTANCE.getAttachmentServerToRPC_Rolerpcfromserver();

		/**
		 * The meta object literal for the '{@link M1.impl.RPCConnectorServerClientImpl <em>RPC Connector Server Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RPCConnectorServerClientImpl
		 * @see M1.impl.M1PackageImpl#getRPCConnectorServerClient()
		 * @generated
		 */
		EClass RPC_CONNECTOR_SERVER_CLIENT = eINSTANCE.getRPCConnectorServerClient();

		/**
		 * The meta object literal for the '<em><b>Rolerpctoclient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_CONNECTOR_SERVER_CLIENT__ROLERPCTOCLIENT = eINSTANCE.getRPCConnectorServerClient_Rolerpctoclient();

		/**
		 * The meta object literal for the '<em><b>Rolerpcfromserver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_CONNECTOR_SERVER_CLIENT__ROLERPCFROMSERVER = eINSTANCE.getRPCConnectorServerClient_Rolerpcfromserver();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentRPCToClientImpl <em>Attachment RPC To Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentRPCToClientImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentRPCToClient()
		 * @generated
		 */
		EClass ATTACHMENT_RPC_TO_CLIENT = eINSTANCE.getAttachmentRPCToClient();

		/**
		 * The meta object literal for the '<em><b>Portrpctoclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RPC_TO_CLIENT__PORTRPCTOCLIENT = eINSTANCE.getAttachmentRPCToClient_Portrpctoclient();

		/**
		 * The meta object literal for the '<em><b>Rolerpctoclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RPC_TO_CLIENT__ROLERPCTOCLIENT = eINSTANCE.getAttachmentRPCToClient_Rolerpctoclient();

		/**
		 * The meta object literal for the '{@link M1.impl.PortSQLtoCMImpl <em>Port SQ Lto CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortSQLtoCMImpl
		 * @see M1.impl.M1PackageImpl#getPortSQLtoCM()
		 * @generated
		 */
		EClass PORT_SQ_LTO_CM = eINSTANCE.getPortSQLtoCM();

		/**
		 * The meta object literal for the '{@link M1.impl.PortCMtoCRImpl <em>Port CMto CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortCMtoCRImpl
		 * @see M1.impl.M1PackageImpl#getPortCMtoCR()
		 * @generated
		 */
		EClass PORT_CMTO_CR = eINSTANCE.getPortCMtoCR();

		/**
		 * The meta object literal for the '<em><b>Attachmentcmtocr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CMTO_CR__ATTACHMENTCMTOCR = eINSTANCE.getPortCMtoCR_Attachmentcmtocr();

		/**
		 * The meta object literal for the '{@link M1.impl.PortCRtoSMImpl <em>Port CRto SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortCRtoSMImpl
		 * @see M1.impl.M1PackageImpl#getPortCRtoSM()
		 * @generated
		 */
		EClass PORT_CRTO_SM = eINSTANCE.getPortCRtoSM();

		/**
		 * The meta object literal for the '<em><b>Securitymanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CRTO_SM__SECURITYMANAGER = eINSTANCE.getPortCRtoSM_Securitymanager();

		/**
		 * The meta object literal for the '{@link M1.impl.PortSMtoCRImpl <em>Port SMto CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortSMtoCRImpl
		 * @see M1.impl.M1PackageImpl#getPortSMtoCR()
		 * @generated
		 */
		EClass PORT_SMTO_CR = eINSTANCE.getPortSMtoCR();

		/**
		 * The meta object literal for the '<em><b>Attachmentsmtocr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SMTO_CR__ATTACHMENTSMTOCR = eINSTANCE.getPortSMtoCR_Attachmentsmtocr();

		/**
		 * The meta object literal for the '{@link M1.impl.PortSQtoDBImpl <em>Port SQto DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortSQtoDBImpl
		 * @see M1.impl.M1PackageImpl#getPortSQtoDB()
		 * @generated
		 */
		EClass PORT_SQTO_DB = eINSTANCE.getPortSQtoDB();

		/**
		 * The meta object literal for the '{@link M1.impl.PortCRtoCMImpl <em>Port CRto CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortCRtoCMImpl
		 * @see M1.impl.M1PackageImpl#getPortCRtoCM()
		 * @generated
		 */
		EClass PORT_CRTO_CM = eINSTANCE.getPortCRtoCM();

		/**
		 * The meta object literal for the '<em><b>Connectionmanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CRTO_CM__CONNECTIONMANAGER = eINSTANCE.getPortCRtoCM_Connectionmanager();

		/**
		 * The meta object literal for the '{@link M1.impl.PortCMtoSQLImpl <em>Port CMto SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortCMtoSQLImpl
		 * @see M1.impl.M1PackageImpl#getPortCMtoSQL()
		 * @generated
		 */
		EClass PORT_CMTO_SQL = eINSTANCE.getPortCMtoSQL();

		/**
		 * The meta object literal for the '{@link M1.impl.PortDBtoSQImpl <em>Port DBto SQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortDBtoSQImpl
		 * @see M1.impl.M1PackageImpl#getPortDBtoSQ()
		 * @generated
		 */
		EClass PORT_DBTO_SQ = eINSTANCE.getPortDBtoSQ();

		/**
		 * The meta object literal for the '{@link M1.impl.PortDBtoSQLImpl <em>Port DBto SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortDBtoSQLImpl
		 * @see M1.impl.M1PackageImpl#getPortDBtoSQL()
		 * @generated
		 */
		EClass PORT_DBTO_SQL = eINSTANCE.getPortDBtoSQL();

		/**
		 * The meta object literal for the '{@link M1.impl.PortSQLtoDBImpl <em>Port SQ Lto DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortSQLtoDBImpl
		 * @see M1.impl.M1PackageImpl#getPortSQLtoDB()
		 * @generated
		 */
		EClass PORT_SQ_LTO_DB = eINSTANCE.getPortSQLtoDB();

		/**
		 * The meta object literal for the '{@link M1.impl.SQLQueryConnectorOutImpl <em>SQL Query Connector Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.SQLQueryConnectorOutImpl
		 * @see M1.impl.M1PackageImpl#getSQLQueryConnectorOut()
		 * @generated
		 */
		EClass SQL_QUERY_CONNECTOR_OUT = eINSTANCE.getSQLQueryConnectorOut();

		/**
		 * The meta object literal for the '<em><b>Rolesqlfromdb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_QUERY_CONNECTOR_OUT__ROLESQLFROMDB = eINSTANCE.getSQLQueryConnectorOut_Rolesqlfromdb();

		/**
		 * The meta object literal for the '<em><b>Rolesqltocm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_QUERY_CONNECTOR_OUT__ROLESQLTOCM = eINSTANCE.getSQLQueryConnectorOut_Rolesqltocm();

		/**
		 * The meta object literal for the '{@link M1.impl.ClearanceRequestConnectorInImpl <em>Clearance Request Connector In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.ClearanceRequestConnectorInImpl
		 * @see M1.impl.M1PackageImpl#getClearanceRequestConnectorIn()
		 * @generated
		 */
		EClass CLEARANCE_REQUEST_CONNECTOR_IN = eINSTANCE.getClearanceRequestConnectorIn();

		/**
		 * The meta object literal for the '<em><b>Rolecrfromcm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRFROMCM = eINSTANCE.getClearanceRequestConnectorIn_Rolecrfromcm();

		/**
		 * The meta object literal for the '<em><b>Rolecrtosm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_REQUEST_CONNECTOR_IN__ROLECRTOSM = eINSTANCE.getClearanceRequestConnectorIn_Rolecrtosm();

		/**
		 * The meta object literal for the '{@link M1.impl.SecurityQueryConnectorInImpl <em>Security Query Connector In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.SecurityQueryConnectorInImpl
		 * @see M1.impl.M1PackageImpl#getSecurityQueryConnectorIn()
		 * @generated
		 */
		EClass SECURITY_QUERY_CONNECTOR_IN = eINSTANCE.getSecurityQueryConnectorIn();

		/**
		 * The meta object literal for the '<em><b>Rolesqtodb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_QUERY_CONNECTOR_IN__ROLESQTODB = eINSTANCE.getSecurityQueryConnectorIn_Rolesqtodb();

		/**
		 * The meta object literal for the '<em><b>Rolesqfromsm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_QUERY_CONNECTOR_IN__ROLESQFROMSM = eINSTANCE.getSecurityQueryConnectorIn_Rolesqfromsm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentSQLtoDBImpl <em>Attachment SQ Lto DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentSQLtoDBImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentSQLtoDB()
		 * @generated
		 */
		EClass ATTACHMENT_SQ_LTO_DB = eINSTANCE.getAttachmentSQLtoDB();

		/**
		 * The meta object literal for the '<em><b>Portsqltodb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQ_LTO_DB__PORTSQLTODB = eINSTANCE.getAttachmentSQLtoDB_Portsqltodb();

		/**
		 * The meta object literal for the '<em><b>Rolesqltodb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQ_LTO_DB__ROLESQLTODB = eINSTANCE.getAttachmentSQLtoDB_Rolesqltodb();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentDBtoSQLImpl <em>Attachment DBto SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentDBtoSQLImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentDBtoSQL()
		 * @generated
		 */
		EClass ATTACHMENT_DBTO_SQL = eINSTANCE.getAttachmentDBtoSQL();

		/**
		 * The meta object literal for the '<em><b>Portdbtosql</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DBTO_SQL__PORTDBTOSQL = eINSTANCE.getAttachmentDBtoSQL_Portdbtosql();

		/**
		 * The meta object literal for the '<em><b>Rolesqlfromdb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DBTO_SQL__ROLESQLFROMDB = eINSTANCE.getAttachmentDBtoSQL_Rolesqlfromdb();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentSQLtoCMImpl <em>Attachment SQ Lto CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentSQLtoCMImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentSQLtoCM()
		 * @generated
		 */
		EClass ATTACHMENT_SQ_LTO_CM = eINSTANCE.getAttachmentSQLtoCM();

		/**
		 * The meta object literal for the '<em><b>Portsqltocm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQ_LTO_CM__PORTSQLTOCM = eINSTANCE.getAttachmentSQLtoCM_Portsqltocm();

		/**
		 * The meta object literal for the '<em><b>Rolesqltocm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQ_LTO_CM__ROLESQLTOCM = eINSTANCE.getAttachmentSQLtoCM_Rolesqltocm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentCMtoSQLImpl <em>Attachment CMto SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentCMtoSQLImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentCMtoSQL()
		 * @generated
		 */
		EClass ATTACHMENT_CMTO_SQL = eINSTANCE.getAttachmentCMtoSQL();

		/**
		 * The meta object literal for the '<em><b>Portcmtosql</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CMTO_SQL__PORTCMTOSQL = eINSTANCE.getAttachmentCMtoSQL_Portcmtosql();

		/**
		 * The meta object literal for the '<em><b>Rolesqlfromcm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CMTO_SQL__ROLESQLFROMCM = eINSTANCE.getAttachmentCMtoSQL_Rolesqlfromcm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentDBtoSQImpl <em>Attachment DBto SQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentDBtoSQImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentDBtoSQ()
		 * @generated
		 */
		EClass ATTACHMENT_DBTO_SQ = eINSTANCE.getAttachmentDBtoSQ();

		/**
		 * The meta object literal for the '<em><b>Portdbtosq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DBTO_SQ__PORTDBTOSQ = eINSTANCE.getAttachmentDBtoSQ_Portdbtosq();

		/**
		 * The meta object literal for the '<em><b>Rolesqfromdb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DBTO_SQ__ROLESQFROMDB = eINSTANCE.getAttachmentDBtoSQ_Rolesqfromdb();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentSQtoDBImpl <em>Attachment SQto DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentSQtoDBImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentSQtoDB()
		 * @generated
		 */
		EClass ATTACHMENT_SQTO_DB = eINSTANCE.getAttachmentSQtoDB();

		/**
		 * The meta object literal for the '<em><b>Portsqtodb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQTO_DB__PORTSQTODB = eINSTANCE.getAttachmentSQtoDB_Portsqtodb();

		/**
		 * The meta object literal for the '<em><b>Rolesqtodb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQTO_DB__ROLESQTODB = eINSTANCE.getAttachmentSQtoDB_Rolesqtodb();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentSQtoSMImpl <em>Attachment SQto SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentSQtoSMImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentSQtoSM()
		 * @generated
		 */
		EClass ATTACHMENT_SQTO_SM = eINSTANCE.getAttachmentSQtoSM();

		/**
		 * The meta object literal for the '<em><b>Portsqtosm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQTO_SM__PORTSQTOSM = eINSTANCE.getAttachmentSQtoSM_Portsqtosm();

		/**
		 * The meta object literal for the '<em><b>Rolesqtosm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SQTO_SM__ROLESQTOSM = eINSTANCE.getAttachmentSQtoSM_Rolesqtosm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentSMtoSQImpl <em>Attachment SMto SQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentSMtoSQImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentSMtoSQ()
		 * @generated
		 */
		EClass ATTACHMENT_SMTO_SQ = eINSTANCE.getAttachmentSMtoSQ();

		/**
		 * The meta object literal for the '<em><b>Portsmtosq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SMTO_SQ__PORTSMTOSQ = eINSTANCE.getAttachmentSMtoSQ_Portsmtosq();

		/**
		 * The meta object literal for the '<em><b>Rolesqfromsm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SMTO_SQ__ROLESQFROMSM = eINSTANCE.getAttachmentSMtoSQ_Rolesqfromsm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentCRtoCMImpl <em>Attachment CRto CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentCRtoCMImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentCRtoCM()
		 * @generated
		 */
		EClass ATTACHMENT_CRTO_CM = eINSTANCE.getAttachmentCRtoCM();

		/**
		 * The meta object literal for the '<em><b>Portcrtocm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CRTO_CM__PORTCRTOCM = eINSTANCE.getAttachmentCRtoCM_Portcrtocm();

		/**
		 * The meta object literal for the '<em><b>Rolecrtocm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CRTO_CM__ROLECRTOCM = eINSTANCE.getAttachmentCRtoCM_Rolecrtocm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentCMtoCRImpl <em>Attachment CMto CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentCMtoCRImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentCMtoCR()
		 * @generated
		 */
		EClass ATTACHMENT_CMTO_CR = eINSTANCE.getAttachmentCMtoCR();

		/**
		 * The meta object literal for the '<em><b>Rolecrfromcm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CMTO_CR__ROLECRFROMCM = eINSTANCE.getAttachmentCMtoCR_Rolecrfromcm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentSMtoCRImpl <em>Attachment SMto CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentSMtoCRImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentSMtoCR()
		 * @generated
		 */
		EClass ATTACHMENT_SMTO_CR = eINSTANCE.getAttachmentSMtoCR();

		/**
		 * The meta object literal for the '<em><b>Rolecrfromsm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SMTO_CR__ROLECRFROMSM = eINSTANCE.getAttachmentSMtoCR_Rolecrfromsm();

		/**
		 * The meta object literal for the '{@link M1.impl.AttachmentCRtoSMImpl <em>Attachment CRto SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.AttachmentCRtoSMImpl
		 * @see M1.impl.M1PackageImpl#getAttachmentCRtoSM()
		 * @generated
		 */
		EClass ATTACHMENT_CRTO_SM = eINSTANCE.getAttachmentCRtoSM();

		/**
		 * The meta object literal for the '<em><b>Portcrtosm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CRTO_SM__PORTCRTOSM = eINSTANCE.getAttachmentCRtoSM_Portcrtosm();

		/**
		 * The meta object literal for the '<em><b>Rolecrtosm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CRTO_SM__ROLECRTOSM = eINSTANCE.getAttachmentCRtoSM_Rolecrtosm();

		/**
		 * The meta object literal for the '{@link M1.impl.SQLQueryConnectorInImpl <em>SQL Query Connector In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.SQLQueryConnectorInImpl
		 * @see M1.impl.M1PackageImpl#getSQLQueryConnectorIn()
		 * @generated
		 */
		EClass SQL_QUERY_CONNECTOR_IN = eINSTANCE.getSQLQueryConnectorIn();

		/**
		 * The meta object literal for the '<em><b>Rolesqltodb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_QUERY_CONNECTOR_IN__ROLESQLTODB = eINSTANCE.getSQLQueryConnectorIn_Rolesqltodb();

		/**
		 * The meta object literal for the '<em><b>Rolesqlfromcm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_QUERY_CONNECTOR_IN__ROLESQLFROMCM = eINSTANCE.getSQLQueryConnectorIn_Rolesqlfromcm();

		/**
		 * The meta object literal for the '{@link M1.impl.SecurityQueryConnectorOutImpl <em>Security Query Connector Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.SecurityQueryConnectorOutImpl
		 * @see M1.impl.M1PackageImpl#getSecurityQueryConnectorOut()
		 * @generated
		 */
		EClass SECURITY_QUERY_CONNECTOR_OUT = eINSTANCE.getSecurityQueryConnectorOut();

		/**
		 * The meta object literal for the '<em><b>Rolesqfromdb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_QUERY_CONNECTOR_OUT__ROLESQFROMDB = eINSTANCE.getSecurityQueryConnectorOut_Rolesqfromdb();

		/**
		 * The meta object literal for the '<em><b>Rolesqtosm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_QUERY_CONNECTOR_OUT__ROLESQTOSM = eINSTANCE.getSecurityQueryConnectorOut_Rolesqtosm();

		/**
		 * The meta object literal for the '{@link M1.impl.ClearanceRequestConnectorOutImpl <em>Clearance Request Connector Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.ClearanceRequestConnectorOutImpl
		 * @see M1.impl.M1PackageImpl#getClearanceRequestConnectorOut()
		 * @generated
		 */
		EClass CLEARANCE_REQUEST_CONNECTOR_OUT = eINSTANCE.getClearanceRequestConnectorOut();

		/**
		 * The meta object literal for the '<em><b>Rolecrtocm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRTOCM = eINSTANCE.getClearanceRequestConnectorOut_Rolecrtocm();

		/**
		 * The meta object literal for the '<em><b>Rolecrfromsm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE_REQUEST_CONNECTOR_OUT__ROLECRFROMSM = eINSTANCE.getClearanceRequestConnectorOut_Rolecrfromsm();

		/**
		 * The meta object literal for the '{@link M1.impl.PortSQtoSMImpl <em>Port SQto SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortSQtoSMImpl
		 * @see M1.impl.M1PackageImpl#getPortSQtoSM()
		 * @generated
		 */
		EClass PORT_SQTO_SM = eINSTANCE.getPortSQtoSM();

		/**
		 * The meta object literal for the '{@link M1.impl.PortSMtoSQImpl <em>Port SMto SQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortSMtoSQImpl
		 * @see M1.impl.M1PackageImpl#getPortSMtoSQ()
		 * @generated
		 */
		EClass PORT_SMTO_SQ = eINSTANCE.getPortSMtoSQ();

		/**
		 * The meta object literal for the '{@link M1.impl.PortServerToBindingImpl <em>Port Server To Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortServerToBindingImpl
		 * @see M1.impl.M1PackageImpl#getPortServerToBinding()
		 * @generated
		 */
		EClass PORT_SERVER_TO_BINDING = eINSTANCE.getPortServerToBinding();

		/**
		 * The meta object literal for the '{@link M1.impl.PortBindingToServerImpl <em>Port Binding To Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortBindingToServerImpl
		 * @see M1.impl.M1PackageImpl#getPortBindingToServer()
		 * @generated
		 */
		EClass PORT_BINDING_TO_SERVER = eINSTANCE.getPortBindingToServer();

		/**
		 * The meta object literal for the '{@link M1.impl.PortBindingToCMImpl <em>Port Binding To CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortBindingToCMImpl
		 * @see M1.impl.M1PackageImpl#getPortBindingToCM()
		 * @generated
		 */
		EClass PORT_BINDING_TO_CM = eINSTANCE.getPortBindingToCM();

		/**
		 * The meta object literal for the '{@link M1.impl.PortCMtoBindingImpl <em>Port CMto Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortCMtoBindingImpl
		 * @see M1.impl.M1PackageImpl#getPortCMtoBinding()
		 * @generated
		 */
		EClass PORT_CMTO_BINDING = eINSTANCE.getPortCMtoBinding();

		/**
		 * The meta object literal for the '{@link M1.impl.BindingServerToCMImpl <em>Binding Server To CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.BindingServerToCMImpl
		 * @see M1.impl.M1PackageImpl#getBindingServerToCM()
		 * @generated
		 */
		EClass BINDING_SERVER_TO_CM = eINSTANCE.getBindingServerToCM();

		/**
		 * The meta object literal for the '<em><b>Portbindingtocm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVER_TO_CM__PORTBINDINGTOCM = eINSTANCE.getBindingServerToCM_Portbindingtocm();

		/**
		 * The meta object literal for the '<em><b>Portservertobinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVER_TO_CM__PORTSERVERTOBINDING = eINSTANCE.getBindingServerToCM_Portservertobinding();

		/**
		 * The meta object literal for the '{@link M1.impl.BindingCMtoServerImpl <em>Binding CMto Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.BindingCMtoServerImpl
		 * @see M1.impl.M1PackageImpl#getBindingCMtoServer()
		 * @generated
		 */
		EClass BINDING_CMTO_SERVER = eINSTANCE.getBindingCMtoServer();

		/**
		 * The meta object literal for the '<em><b>Portbindingtoserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CMTO_SERVER__PORTBINDINGTOSERVER = eINSTANCE.getBindingCMtoServer_Portbindingtoserver();

		/**
		 * The meta object literal for the '<em><b>Portcmtobinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CMTO_SERVER__PORTCMTOBINDING = eINSTANCE.getBindingCMtoServer_Portcmtobinding();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleRPCfromClientImpl <em>Role RP Cfrom Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleRPCfromClientImpl
		 * @see M1.impl.M1PackageImpl#getRoleRPCfromClient()
		 * @generated
		 */
		EClass ROLE_RP_CFROM_CLIENT = eINSTANCE.getRoleRPCfromClient();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleRPCtoClientImpl <em>Role RP Cto Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleRPCtoClientImpl
		 * @see M1.impl.M1PackageImpl#getRoleRPCtoClient()
		 * @generated
		 */
		EClass ROLE_RP_CTO_CLIENT = eINSTANCE.getRoleRPCtoClient();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleRPCtoServerImpl <em>Role RP Cto Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleRPCtoServerImpl
		 * @see M1.impl.M1PackageImpl#getRoleRPCtoServer()
		 * @generated
		 */
		EClass ROLE_RP_CTO_SERVER = eINSTANCE.getRoleRPCtoServer();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleRPCfromServerImpl <em>Role RP Cfrom Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleRPCfromServerImpl
		 * @see M1.impl.M1PackageImpl#getRoleRPCfromServer()
		 * @generated
		 */
		EClass ROLE_RP_CFROM_SERVER = eINSTANCE.getRoleRPCfromServer();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQLtoDBImpl <em>Role SQ Lto DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQLtoDBImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQLtoDB()
		 * @generated
		 */
		EClass ROLE_SQ_LTO_DB = eINSTANCE.getRoleSQLtoDB();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQLfromDBImpl <em>Role SQ Lfrom DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQLfromDBImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQLfromDB()
		 * @generated
		 */
		EClass ROLE_SQ_LFROM_DB = eINSTANCE.getRoleSQLfromDB();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQLtoCMImpl <em>Role SQ Lto CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQLtoCMImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQLtoCM()
		 * @generated
		 */
		EClass ROLE_SQ_LTO_CM = eINSTANCE.getRoleSQLtoCM();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQLfromCMImpl <em>Role SQ Lfrom CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQLfromCMImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQLfromCM()
		 * @generated
		 */
		EClass ROLE_SQ_LFROM_CM = eINSTANCE.getRoleSQLfromCM();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQfromDBImpl <em>Role SQfrom DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQfromDBImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQfromDB()
		 * @generated
		 */
		EClass ROLE_SQFROM_DB = eINSTANCE.getRoleSQfromDB();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQtoDBImpl <em>Role SQto DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQtoDBImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQtoDB()
		 * @generated
		 */
		EClass ROLE_SQTO_DB = eINSTANCE.getRoleSQtoDB();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQtoSMImpl <em>Role SQto SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQtoSMImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQtoSM()
		 * @generated
		 */
		EClass ROLE_SQTO_SM = eINSTANCE.getRoleSQtoSM();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleSQfromSMImpl <em>Role SQfrom SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleSQfromSMImpl
		 * @see M1.impl.M1PackageImpl#getRoleSQfromSM()
		 * @generated
		 */
		EClass ROLE_SQFROM_SM = eINSTANCE.getRoleSQfromSM();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleCRtoCMImpl <em>Role CRto CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleCRtoCMImpl
		 * @see M1.impl.M1PackageImpl#getRoleCRtoCM()
		 * @generated
		 */
		EClass ROLE_CRTO_CM = eINSTANCE.getRoleCRtoCM();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleCRfromSMImpl <em>Role CRfrom SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleCRfromSMImpl
		 * @see M1.impl.M1PackageImpl#getRoleCRfromSM()
		 * @generated
		 */
		EClass ROLE_CRFROM_SM = eINSTANCE.getRoleCRfromSM();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleCRtoSMImpl <em>Role CRto SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleCRtoSMImpl
		 * @see M1.impl.M1PackageImpl#getRoleCRtoSM()
		 * @generated
		 */
		EClass ROLE_CRTO_SM = eINSTANCE.getRoleCRtoSM();

		/**
		 * The meta object literal for the '{@link M1.impl.RoleCRfromCMImpl <em>Role CRfrom CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.RoleCRfromCMImpl
		 * @see M1.impl.M1PackageImpl#getRoleCRfromCM()
		 * @generated
		 */
		EClass ROLE_CRFROM_CM = eINSTANCE.getRoleCRfromCM();

		/**
		 * The meta object literal for the '{@link M1.impl.ConfigurationClientServerImpl <em>Configuration Client Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.ConfigurationClientServerImpl
		 * @see M1.impl.M1PackageImpl#getConfigurationClientServer()
		 * @generated
		 */
		EClass CONFIGURATION_CLIENT_SERVER = eINSTANCE.getConfigurationClientServer();

		/**
		 * The meta object literal for the '<em><b>Portbindingtoconfigclientserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER = eINSTANCE.getConfigurationClientServer_Portbindingtoconfigclientserver();

		/**
		 * The meta object literal for the '<em><b>Portconfigclientservertobinding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__PORTCONFIGCLIENTSERVERTOBINDING = eINSTANCE.getConfigurationClientServer_Portconfigclientservertobinding();

		/**
		 * The meta object literal for the '<em><b>Bindingclienttoconfigclientserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__BINDINGCLIENTTOCONFIGCLIENTSERVER = eINSTANCE.getConfigurationClientServer_Bindingclienttoconfigclientserver();

		/**
		 * The meta object literal for the '<em><b>Bindingconfigclientservertoclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__BINDINGCONFIGCLIENTSERVERTOCLIENT = eINSTANCE.getConfigurationClientServer_Bindingconfigclientservertoclient();

		/**
		 * The meta object literal for the '<em><b>Attachmentrpctoclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOCLIENT = eINSTANCE.getConfigurationClientServer_Attachmentrpctoclient();

		/**
		 * The meta object literal for the '<em><b>Attachmentservertorpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__ATTACHMENTSERVERTORPC = eINSTANCE.getConfigurationClientServer_Attachmentservertorpc();

		/**
		 * The meta object literal for the '<em><b>Attachmentclienttorpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__ATTACHMENTCLIENTTORPC = eINSTANCE.getConfigurationClientServer_Attachmentclienttorpc();

		/**
		 * The meta object literal for the '<em><b>Attachmentrpctoserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVER__ATTACHMENTRPCTOSERVER = eINSTANCE.getConfigurationClientServer_Attachmentrpctoserver();

		/**
		 * The meta object literal for the '{@link M1.impl.PortBindingToConfigClientServerImpl <em>Port Binding To Config Client Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortBindingToConfigClientServerImpl
		 * @see M1.impl.M1PackageImpl#getPortBindingToConfigClientServer()
		 * @generated
		 */
		EClass PORT_BINDING_TO_CONFIG_CLIENT_SERVER = eINSTANCE.getPortBindingToConfigClientServer();

		/**
		 * The meta object literal for the '{@link M1.impl.PortConfigClientServerToBindingImpl <em>Port Config Client Server To Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortConfigClientServerToBindingImpl
		 * @see M1.impl.M1PackageImpl#getPortConfigClientServerToBinding()
		 * @generated
		 */
		EClass PORT_CONFIG_CLIENT_SERVER_TO_BINDING = eINSTANCE.getPortConfigClientServerToBinding();

		/**
		 * The meta object literal for the '{@link M1.impl.PortClientToBindingImpl <em>Port Client To Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortClientToBindingImpl
		 * @see M1.impl.M1PackageImpl#getPortClientToBinding()
		 * @generated
		 */
		EClass PORT_CLIENT_TO_BINDING = eINSTANCE.getPortClientToBinding();

		/**
		 * The meta object literal for the '{@link M1.impl.PortBindingToClientImpl <em>Port Binding To Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.PortBindingToClientImpl
		 * @see M1.impl.M1PackageImpl#getPortBindingToClient()
		 * @generated
		 */
		EClass PORT_BINDING_TO_CLIENT = eINSTANCE.getPortBindingToClient();

		/**
		 * The meta object literal for the '{@link M1.impl.BindingClientToConfigClientServerImpl <em>Binding Client To Config Client Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.BindingClientToConfigClientServerImpl
		 * @see M1.impl.M1PackageImpl#getBindingClientToConfigClientServer()
		 * @generated
		 */
		EClass BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER = eINSTANCE.getBindingClientToConfigClientServer();

		/**
		 * The meta object literal for the '<em><b>Portbindingtoconfigclientserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTBINDINGTOCONFIGCLIENTSERVER = eINSTANCE.getBindingClientToConfigClientServer_Portbindingtoconfigclientserver();

		/**
		 * The meta object literal for the '<em><b>Portclienttobinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CLIENT_TO_CONFIG_CLIENT_SERVER__PORTCLIENTTOBINDING = eINSTANCE.getBindingClientToConfigClientServer_Portclienttobinding();

		/**
		 * The meta object literal for the '{@link M1.impl.BindingConfigClientServerToClientImpl <em>Binding Config Client Server To Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see M1.impl.BindingConfigClientServerToClientImpl
		 * @see M1.impl.M1PackageImpl#getBindingConfigClientServerToClient()
		 * @generated
		 */
		EClass BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT = eINSTANCE.getBindingConfigClientServerToClient();

		/**
		 * The meta object literal for the '<em><b>Portbindingtoclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTBINDINGTOCLIENT = eINSTANCE.getBindingConfigClientServerToClient_Portbindingtoclient();

		/**
		 * The meta object literal for the '<em><b>Portconfigclientservertobinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CONFIG_CLIENT_SERVER_TO_CLIENT__PORTCONFIGCLIENTSERVERTOBINDING = eINSTANCE.getBindingConfigClientServerToClient_Portconfigclientservertobinding();

	}

} //M1Package
