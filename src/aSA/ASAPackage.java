/**
 */
package aSA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see aSA.ASAFactory
 * @model kind="package"
 * @generated
 */
public interface ASAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aSA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/aSA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aSA";

	/**
	 * The singleton instance of the 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASAPackage eINSTANCE = aSA.impl.ASAPackageImpl.init();

	/**
	 * The meta object id for the '{@link aSA.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ComposantImpl
	 * @see aSA.impl.ASAPackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 0;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__INTERFACECOMPOSANT = 0;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PROPRIETE = 1;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__CONTRAINTETECHNIQUE = 2;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.InterfaceComposantImpl <em>Interface Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.InterfaceComposantImpl
	 * @see aSA.impl.ASAPackageImpl#getInterfaceComposant()
	 * @generated
	 */
	int INTERFACE_COMPOSANT = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT__PORT = 1;

	/**
	 * The number of structural features of the '<em>Interface Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ServiceImpl
	 * @see aSA.impl.ASAPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ServiceRequisImpl <em>Service Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ServiceRequisImpl
	 * @see aSA.impl.ASAPackageImpl#getServiceRequis()
	 * @generated
	 */
	int SERVICE_REQUIS = 3;

	/**
	 * The number of structural features of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ServiceFourniImpl <em>Service Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ServiceFourniImpl
	 * @see aSA.impl.ASAPackageImpl#getServiceFourni()
	 * @generated
	 */
	int SERVICE_FOURNI = 4;

	/**
	 * The number of structural features of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortComposantImpl <em>Port Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortComposantImpl
	 * @see aSA.impl.ASAPackageImpl#getPortComposant()
	 * @generated
	 */
	int PORT_COMPOSANT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT__ID = 0;

	/**
	 * The number of structural features of the '<em>Port Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortComposantFourniImpl <em>Port Composant Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortComposantFourniImpl
	 * @see aSA.impl.ASAPackageImpl#getPortComposantFourni()
	 * @generated
	 */
	int PORT_COMPOSANT_FOURNI = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_FOURNI__ID = PORT_COMPOSANT__ID;

	/**
	 * The number of structural features of the '<em>Port Composant Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_FOURNI_FEATURE_COUNT = PORT_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Composant Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_FOURNI_OPERATION_COUNT = PORT_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortComposantRequisImpl <em>Port Composant Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortComposantRequisImpl
	 * @see aSA.impl.ASAPackageImpl#getPortComposantRequis()
	 * @generated
	 */
	int PORT_COMPOSANT_REQUIS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_REQUIS__ID = PORT_COMPOSANT__ID;

	/**
	 * The number of structural features of the '<em>Port Composant Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_REQUIS_FEATURE_COUNT = PORT_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Composant Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPOSANT_REQUIS_OPERATION_COUNT = PORT_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ProprieteImpl <em>Propriete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ProprieteImpl
	 * @see aSA.impl.ASAPackageImpl#getPropriete()
	 * @generated
	 */
	int PROPRIETE = 8;

	/**
	 * The feature id for the '<em><b>Fonctionnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__FONCTIONNELLE = 0;

	/**
	 * The feature id for the '<em><b>Configurable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__CONFIGURABLE = 1;

	/**
	 * The number of structural features of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ContrainteTechniqueImpl <em>Contrainte Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ContrainteTechniqueImpl
	 * @see aSA.impl.ASAPackageImpl#getContrainteTechnique()
	 * @generated
	 */
	int CONTRAINTE_TECHNIQUE = 9;

	/**
	 * The number of structural features of the '<em>Contrainte Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TECHNIQUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contrainte Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_TECHNIQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ComposantSimpleImpl <em>Composant Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ComposantSimpleImpl
	 * @see aSA.impl.ASAPackageImpl#getComposantSimple()
	 * @generated
	 */
	int COMPOSANT_SIMPLE = 10;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SIMPLE__INTERFACECOMPOSANT = COMPOSANT__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SIMPLE__PROPRIETE = COMPOSANT__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SIMPLE__CONTRAINTETECHNIQUE = COMPOSANT__CONTRAINTETECHNIQUE;

	/**
	 * The number of structural features of the '<em>Composant Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SIMPLE_FEATURE_COUNT = COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composant Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SIMPLE_OPERATION_COUNT = COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ConfigurationImpl
	 * @see aSA.impl.ASAPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Interfacecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACECOMPOSANT = COMPOSANT__INTERFACECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROPRIETE = COMPOSANT__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintetechnique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONTRAINTETECHNIQUE = COMPOSANT__CONTRAINTETECHNIQUE;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPOSANT = COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaceconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACECONFIGURATION = COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ATTACHMENT = COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BINDING = COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.InterfaceConfigurationImpl <em>Interface Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.InterfaceConfigurationImpl
	 * @see aSA.impl.ASAPackageImpl#getInterfaceConfiguration()
	 * @generated
	 */
	int INTERFACE_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIGURATION__PORTCONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Interface Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortConfigurationImpl <em>Port Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortConfigurationImpl
	 * @see aSA.impl.ASAPackageImpl#getPortConfiguration()
	 * @generated
	 */
	int PORT_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortConfigurationRequisImpl <em>Port Configuration Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortConfigurationRequisImpl
	 * @see aSA.impl.ASAPackageImpl#getPortConfigurationRequis()
	 * @generated
	 */
	int PORT_CONFIGURATION_REQUIS = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_REQUIS__ID = PORT_CONFIGURATION__ID;

	/**
	 * The number of structural features of the '<em>Port Configuration Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_REQUIS_FEATURE_COUNT = PORT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Configuration Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_REQUIS_OPERATION_COUNT = PORT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortConfigurationFourniImpl <em>Port Configuration Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortConfigurationFourniImpl
	 * @see aSA.impl.ASAPackageImpl#getPortConfigurationFourni()
	 * @generated
	 */
	int PORT_CONFIGURATION_FOURNI = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_FOURNI__ID = PORT_CONFIGURATION__ID;

	/**
	 * The number of structural features of the '<em>Port Configuration Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_FOURNI_FEATURE_COUNT = PORT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Configuration Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_FOURNI_OPERATION_COUNT = PORT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.BindingImpl
	 * @see aSA.impl.ASAPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 16;

	/**
	 * The feature id for the '<em><b>Portcomposant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORTCOMPOSANT = 0;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORTCONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI = 0;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI = 1;

	/**
	 * The operation id for the '<em>Binding Config Conponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS = 2;

	/**
	 * The operation id for the '<em>Binding Component Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS = 3;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link aSA.impl.ConnecteurImpl <em>Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ConnecteurImpl
	 * @see aSA.impl.ASAPackageImpl#getConnecteur()
	 * @generated
	 */
	int CONNECTEUR = 17;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__INTERFACECONNECTEUR = 0;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__GLUE = 1;

	/**
	 * The number of structural features of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.InterfaceConnecteurImpl <em>Interface Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.InterfaceConnecteurImpl
	 * @see aSA.impl.ASAPackageImpl#getInterfaceConnecteur()
	 * @generated
	 */
	int INTERFACE_CONNECTEUR = 18;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Interface Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.RoleImpl
	 * @see aSA.impl.ASAPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.RoleRequisImpl <em>Role Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.RoleRequisImpl
	 * @see aSA.impl.ASAPackageImpl#getRoleRequis()
	 * @generated
	 */
	int ROLE_REQUIS = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__ID = ROLE__ID;

	/**
	 * The number of structural features of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.RoleFourniImpl <em>Role Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.RoleFourniImpl
	 * @see aSA.impl.ASAPackageImpl#getRoleFourni()
	 * @generated
	 */
	int ROLE_FOURNI = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__ID = ROLE__ID;

	/**
	 * The number of structural features of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.GlueImpl
	 * @see aSA.impl.ASAPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 22;

	/**
	 * The feature id for the '<em><b>TO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__TO = 0;

	/**
	 * The feature id for the '<em><b>FROM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__FROM = 1;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Glue Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE___GLUE_FUNCTION__ROLEFOURNI = 0;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link aSA.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.AttachmentImpl
	 * @see aSA.impl.ASAPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 23;

	/**
	 * The feature id for the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FROM_2 = 0;

	/**
	 * The feature id for the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__TO_1 = 1;

	/**
	 * The feature id for the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FROM_1 = 2;

	/**
	 * The feature id for the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__TO_2 = 3;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Attach Port To Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = 0;

	/**
	 * The operation id for the '<em>Attach Role To Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI = 1;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link aSA.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see aSA.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Composant#getInterfacecomposant <em>Interfacecomposant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacecomposant</em>'.
	 * @see aSA.Composant#getInterfacecomposant()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Interfacecomposant();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Composant#getPropriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propriete</em>'.
	 * @see aSA.Composant#getPropriete()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Propriete();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Composant#getContraintetechnique <em>Contraintetechnique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contraintetechnique</em>'.
	 * @see aSA.Composant#getContraintetechnique()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Contraintetechnique();

	/**
	 * Returns the meta object for class '{@link aSA.InterfaceComposant <em>Interface Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Composant</em>'.
	 * @see aSA.InterfaceComposant
	 * @generated
	 */
	EClass getInterfaceComposant();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.InterfaceComposant#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see aSA.InterfaceComposant#getService()
	 * @see #getInterfaceComposant()
	 * @generated
	 */
	EReference getInterfaceComposant_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.InterfaceComposant#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see aSA.InterfaceComposant#getPort()
	 * @see #getInterfaceComposant()
	 * @generated
	 */
	EReference getInterfaceComposant_Port();

	/**
	 * Returns the meta object for class '{@link aSA.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see aSA.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link aSA.ServiceRequis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis</em>'.
	 * @see aSA.ServiceRequis
	 * @generated
	 */
	EClass getServiceRequis();

	/**
	 * Returns the meta object for class '{@link aSA.ServiceFourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni</em>'.
	 * @see aSA.ServiceFourni
	 * @generated
	 */
	EClass getServiceFourni();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantFourni <em>Port Composant Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Composant Fourni</em>'.
	 * @see aSA.PortComposantFourni
	 * @generated
	 */
	EClass getPortComposantFourni();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposantRequis <em>Port Composant Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Composant Requis</em>'.
	 * @see aSA.PortComposantRequis
	 * @generated
	 */
	EClass getPortComposantRequis();

	/**
	 * Returns the meta object for class '{@link aSA.PortComposant <em>Port Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Composant</em>'.
	 * @see aSA.PortComposant
	 * @generated
	 */
	EClass getPortComposant();

	/**
	 * Returns the meta object for the attribute '{@link aSA.PortComposant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aSA.PortComposant#getId()
	 * @see #getPortComposant()
	 * @generated
	 */
	EAttribute getPortComposant_Id();

	/**
	 * Returns the meta object for class '{@link aSA.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete</em>'.
	 * @see aSA.Propriete
	 * @generated
	 */
	EClass getPropriete();

	/**
	 * Returns the meta object for the attribute '{@link aSA.Propriete#isFonctionnelle <em>Fonctionnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fonctionnelle</em>'.
	 * @see aSA.Propriete#isFonctionnelle()
	 * @see #getPropriete()
	 * @generated
	 */
	EAttribute getPropriete_Fonctionnelle();

	/**
	 * Returns the meta object for the attribute '{@link aSA.Propriete#isConfigurable <em>Configurable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configurable</em>'.
	 * @see aSA.Propriete#isConfigurable()
	 * @see #getPropriete()
	 * @generated
	 */
	EAttribute getPropriete_Configurable();

	/**
	 * Returns the meta object for class '{@link aSA.ContrainteTechnique <em>Contrainte Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte Technique</em>'.
	 * @see aSA.ContrainteTechnique
	 * @generated
	 */
	EClass getContrainteTechnique();

	/**
	 * Returns the meta object for class '{@link aSA.ComposantSimple <em>Composant Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant Simple</em>'.
	 * @see aSA.ComposantSimple
	 * @generated
	 */
	EClass getComposantSimple();

	/**
	 * Returns the meta object for class '{@link aSA.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see aSA.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composant</em>'.
	 * @see aSA.Configuration#getComposant()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Composant();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getInterfaceconfiguration <em>Interfaceconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaceconfiguration</em>'.
	 * @see aSA.Configuration#getInterfaceconfiguration()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Interfaceconfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachment</em>'.
	 * @see aSA.Configuration#getAttachment()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Attachment();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see aSA.Configuration#getBinding()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Binding();

	/**
	 * Returns the meta object for class '{@link aSA.InterfaceConfiguration <em>Interface Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Configuration</em>'.
	 * @see aSA.InterfaceConfiguration
	 * @generated
	 */
	EClass getInterfaceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.InterfaceConfiguration#getPortconfiguration <em>Portconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portconfiguration</em>'.
	 * @see aSA.InterfaceConfiguration#getPortconfiguration()
	 * @see #getInterfaceConfiguration()
	 * @generated
	 */
	EReference getInterfaceConfiguration_Portconfiguration();

	/**
	 * Returns the meta object for class '{@link aSA.PortConfiguration <em>Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Configuration</em>'.
	 * @see aSA.PortConfiguration
	 * @generated
	 */
	EClass getPortConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link aSA.PortConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aSA.PortConfiguration#getId()
	 * @see #getPortConfiguration()
	 * @generated
	 */
	EAttribute getPortConfiguration_Id();

	/**
	 * Returns the meta object for class '{@link aSA.PortConfigurationRequis <em>Port Configuration Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Configuration Requis</em>'.
	 * @see aSA.PortConfigurationRequis
	 * @generated
	 */
	EClass getPortConfigurationRequis();

	/**
	 * Returns the meta object for class '{@link aSA.PortConfigurationFourni <em>Port Configuration Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Configuration Fourni</em>'.
	 * @see aSA.PortConfigurationFourni
	 * @generated
	 */
	EClass getPortConfigurationFourni();

	/**
	 * Returns the meta object for class '{@link aSA.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see aSA.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortcomposant <em>Portcomposant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portcomposant</em>'.
	 * @see aSA.Binding#getPortcomposant()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Portcomposant();

	/**
	 * Returns the meta object for the reference '{@link aSA.Binding#getPortconfiguration <em>Portconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portconfiguration</em>'.
	 * @see aSA.Binding#getPortconfiguration()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Portconfiguration();

	/**
	 * Returns the meta object for the '{@link aSA.Binding#bindingConfigConponent(aSA.PortConfigurationFourni) <em>Binding Config Conponent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Binding Config Conponent</em>' operation.
	 * @see aSA.Binding#bindingConfigConponent(aSA.PortConfigurationFourni)
	 * @generated
	 */
	EOperation getBinding__BindingConfigConponent__PortConfigurationFourni();

	/**
	 * Returns the meta object for the '{@link aSA.Binding#bindingComponentConfig(aSA.PortComposantFourni) <em>Binding Component Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Binding Component Config</em>' operation.
	 * @see aSA.Binding#bindingComponentConfig(aSA.PortComposantFourni)
	 * @generated
	 */
	EOperation getBinding__BindingComponentConfig__PortComposantFourni();

	/**
	 * Returns the meta object for the '{@link aSA.Binding#bindingConfigConponent(aSA.PortConfigurationRequis) <em>Binding Config Conponent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Binding Config Conponent</em>' operation.
	 * @see aSA.Binding#bindingConfigConponent(aSA.PortConfigurationRequis)
	 * @generated
	 */
	EOperation getBinding__BindingConfigConponent__PortConfigurationRequis();

	/**
	 * Returns the meta object for the '{@link aSA.Binding#bindingComponentConfig(aSA.PortComposantRequis) <em>Binding Component Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Binding Component Config</em>' operation.
	 * @see aSA.Binding#bindingComponentConfig(aSA.PortComposantRequis)
	 * @generated
	 */
	EOperation getBinding__BindingComponentConfig__PortComposantRequis();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur</em>'.
	 * @see aSA.Connecteur
	 * @generated
	 */
	EClass getConnecteur();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Connecteur#getInterfaceconnecteur <em>Interfaceconnecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceconnecteur</em>'.
	 * @see aSA.Connecteur#getInterfaceconnecteur()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Interfaceconnecteur();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Connecteur#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glue</em>'.
	 * @see aSA.Connecteur#getGlue()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Glue();

	/**
	 * Returns the meta object for class '{@link aSA.InterfaceConnecteur <em>Interface Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connecteur</em>'.
	 * @see aSA.InterfaceConnecteur
	 * @generated
	 */
	EClass getInterfaceConnecteur();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.InterfaceConnecteur#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see aSA.InterfaceConnecteur#getRole()
	 * @see #getInterfaceConnecteur()
	 * @generated
	 */
	EReference getInterfaceConnecteur_Role();

	/**
	 * Returns the meta object for class '{@link aSA.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see aSA.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link aSA.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see aSA.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis</em>'.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	EClass getRoleRequis();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni</em>'.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	EClass getRoleFourni();

	/**
	 * Returns the meta object for class '{@link aSA.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see aSA.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for the reference '{@link aSA.Glue#getTO <em>TO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TO</em>'.
	 * @see aSA.Glue#getTO()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_TO();

	/**
	 * Returns the meta object for the reference '{@link aSA.Glue#getFROM <em>FROM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FROM</em>'.
	 * @see aSA.Glue#getFROM()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_FROM();

	/**
	 * Returns the meta object for the '{@link aSA.Glue#glueFunction(aSA.RoleFourni) <em>Glue Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Glue Function</em>' operation.
	 * @see aSA.Glue#glueFunction(aSA.RoleFourni)
	 * @generated
	 */
	EOperation getGlue__GlueFunction__RoleFourni();

	/**
	 * Returns the meta object for class '{@link aSA.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see aSA.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getFROM_2 <em>FROM 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FROM 2</em>'.
	 * @see aSA.Attachment#getFROM_2()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_FROM_2();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getTO_1 <em>TO 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TO 1</em>'.
	 * @see aSA.Attachment#getTO_1()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_TO_1();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getFROM_1 <em>FROM 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FROM 1</em>'.
	 * @see aSA.Attachment#getFROM_1()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_FROM_1();

	/**
	 * Returns the meta object for the reference '{@link aSA.Attachment#getTO_2 <em>TO 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TO 2</em>'.
	 * @see aSA.Attachment#getTO_2()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_TO_2();

	/**
	 * Returns the meta object for the '{@link aSA.Attachment#attachPortToRole(aSA.PortComposantFourni) <em>Attach Port To Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attach Port To Role</em>' operation.
	 * @see aSA.Attachment#attachPortToRole(aSA.PortComposantFourni)
	 * @generated
	 */
	EOperation getAttachment__AttachPortToRole__PortComposantFourni();

	/**
	 * Returns the meta object for the '{@link aSA.Attachment#attachRoleToPort(aSA.RoleFourni) <em>Attach Role To Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attach Role To Port</em>' operation.
	 * @see aSA.Attachment#attachRoleToPort(aSA.RoleFourni)
	 * @generated
	 */
	EOperation getAttachment__AttachRoleToPort__RoleFourni();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ASAFactory getASAFactory();

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
		 * The meta object literal for the '{@link aSA.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ComposantImpl
		 * @see aSA.impl.ASAPackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Interfacecomposant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__INTERFACECOMPOSANT = eINSTANCE.getComposant_Interfacecomposant();

		/**
		 * The meta object literal for the '<em><b>Propriete</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__PROPRIETE = eINSTANCE.getComposant_Propriete();

		/**
		 * The meta object literal for the '<em><b>Contraintetechnique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__CONTRAINTETECHNIQUE = eINSTANCE.getComposant_Contraintetechnique();

		/**
		 * The meta object literal for the '{@link aSA.impl.InterfaceComposantImpl <em>Interface Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.InterfaceComposantImpl
		 * @see aSA.impl.ASAPackageImpl#getInterfaceComposant()
		 * @generated
		 */
		EClass INTERFACE_COMPOSANT = eINSTANCE.getInterfaceComposant();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPOSANT__SERVICE = eINSTANCE.getInterfaceComposant_Service();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPOSANT__PORT = eINSTANCE.getInterfaceComposant_Port();

		/**
		 * The meta object literal for the '{@link aSA.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ServiceImpl
		 * @see aSA.impl.ASAPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link aSA.impl.ServiceRequisImpl <em>Service Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ServiceRequisImpl
		 * @see aSA.impl.ASAPackageImpl#getServiceRequis()
		 * @generated
		 */
		EClass SERVICE_REQUIS = eINSTANCE.getServiceRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.ServiceFourniImpl <em>Service Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ServiceFourniImpl
		 * @see aSA.impl.ASAPackageImpl#getServiceFourni()
		 * @generated
		 */
		EClass SERVICE_FOURNI = eINSTANCE.getServiceFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortComposantFourniImpl <em>Port Composant Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortComposantFourniImpl
		 * @see aSA.impl.ASAPackageImpl#getPortComposantFourni()
		 * @generated
		 */
		EClass PORT_COMPOSANT_FOURNI = eINSTANCE.getPortComposantFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortComposantRequisImpl <em>Port Composant Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortComposantRequisImpl
		 * @see aSA.impl.ASAPackageImpl#getPortComposantRequis()
		 * @generated
		 */
		EClass PORT_COMPOSANT_REQUIS = eINSTANCE.getPortComposantRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortComposantImpl <em>Port Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortComposantImpl
		 * @see aSA.impl.ASAPackageImpl#getPortComposant()
		 * @generated
		 */
		EClass PORT_COMPOSANT = eINSTANCE.getPortComposant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPOSANT__ID = eINSTANCE.getPortComposant_Id();

		/**
		 * The meta object literal for the '{@link aSA.impl.ProprieteImpl <em>Propriete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ProprieteImpl
		 * @see aSA.impl.ASAPackageImpl#getPropriete()
		 * @generated
		 */
		EClass PROPRIETE = eINSTANCE.getPropriete();

		/**
		 * The meta object literal for the '<em><b>Fonctionnelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETE__FONCTIONNELLE = eINSTANCE.getPropriete_Fonctionnelle();

		/**
		 * The meta object literal for the '<em><b>Configurable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETE__CONFIGURABLE = eINSTANCE.getPropriete_Configurable();

		/**
		 * The meta object literal for the '{@link aSA.impl.ContrainteTechniqueImpl <em>Contrainte Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ContrainteTechniqueImpl
		 * @see aSA.impl.ASAPackageImpl#getContrainteTechnique()
		 * @generated
		 */
		EClass CONTRAINTE_TECHNIQUE = eINSTANCE.getContrainteTechnique();

		/**
		 * The meta object literal for the '{@link aSA.impl.ComposantSimpleImpl <em>Composant Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ComposantSimpleImpl
		 * @see aSA.impl.ASAPackageImpl#getComposantSimple()
		 * @generated
		 */
		EClass COMPOSANT_SIMPLE = eINSTANCE.getComposantSimple();

		/**
		 * The meta object literal for the '{@link aSA.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ConfigurationImpl
		 * @see aSA.impl.ASAPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPOSANT = eINSTANCE.getConfiguration_Composant();

		/**
		 * The meta object literal for the '<em><b>Interfaceconfiguration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INTERFACECONFIGURATION = eINSTANCE.getConfiguration_Interfaceconfiguration();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ATTACHMENT = eINSTANCE.getConfiguration_Attachment();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BINDING = eINSTANCE.getConfiguration_Binding();

		/**
		 * The meta object literal for the '{@link aSA.impl.InterfaceConfigurationImpl <em>Interface Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.InterfaceConfigurationImpl
		 * @see aSA.impl.ASAPackageImpl#getInterfaceConfiguration()
		 * @generated
		 */
		EClass INTERFACE_CONFIGURATION = eINSTANCE.getInterfaceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Portconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONFIGURATION__PORTCONFIGURATION = eINSTANCE.getInterfaceConfiguration_Portconfiguration();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortConfigurationImpl <em>Port Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortConfigurationImpl
		 * @see aSA.impl.ASAPackageImpl#getPortConfiguration()
		 * @generated
		 */
		EClass PORT_CONFIGURATION = eINSTANCE.getPortConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONFIGURATION__ID = eINSTANCE.getPortConfiguration_Id();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortConfigurationRequisImpl <em>Port Configuration Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortConfigurationRequisImpl
		 * @see aSA.impl.ASAPackageImpl#getPortConfigurationRequis()
		 * @generated
		 */
		EClass PORT_CONFIGURATION_REQUIS = eINSTANCE.getPortConfigurationRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortConfigurationFourniImpl <em>Port Configuration Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortConfigurationFourniImpl
		 * @see aSA.impl.ASAPackageImpl#getPortConfigurationFourni()
		 * @generated
		 */
		EClass PORT_CONFIGURATION_FOURNI = eINSTANCE.getPortConfigurationFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.BindingImpl
		 * @see aSA.impl.ASAPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Portcomposant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORTCOMPOSANT = eINSTANCE.getBinding_Portcomposant();

		/**
		 * The meta object literal for the '<em><b>Portconfiguration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORTCONFIGURATION = eINSTANCE.getBinding_Portconfiguration();

		/**
		 * The meta object literal for the '<em><b>Binding Config Conponent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI = eINSTANCE.getBinding__BindingConfigConponent__PortConfigurationFourni();

		/**
		 * The meta object literal for the '<em><b>Binding Component Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI = eINSTANCE.getBinding__BindingComponentConfig__PortComposantFourni();

		/**
		 * The meta object literal for the '<em><b>Binding Config Conponent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS = eINSTANCE.getBinding__BindingConfigConponent__PortConfigurationRequis();

		/**
		 * The meta object literal for the '<em><b>Binding Component Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS = eINSTANCE.getBinding__BindingComponentConfig__PortComposantRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.ConnecteurImpl <em>Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ConnecteurImpl
		 * @see aSA.impl.ASAPackageImpl#getConnecteur()
		 * @generated
		 */
		EClass CONNECTEUR = eINSTANCE.getConnecteur();

		/**
		 * The meta object literal for the '<em><b>Interfaceconnecteur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__INTERFACECONNECTEUR = eINSTANCE.getConnecteur_Interfaceconnecteur();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__GLUE = eINSTANCE.getConnecteur_Glue();

		/**
		 * The meta object literal for the '{@link aSA.impl.InterfaceConnecteurImpl <em>Interface Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.InterfaceConnecteurImpl
		 * @see aSA.impl.ASAPackageImpl#getInterfaceConnecteur()
		 * @generated
		 */
		EClass INTERFACE_CONNECTEUR = eINSTANCE.getInterfaceConnecteur();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTEUR__ROLE = eINSTANCE.getInterfaceConnecteur_Role();

		/**
		 * The meta object literal for the '{@link aSA.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.RoleImpl
		 * @see aSA.impl.ASAPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID = eINSTANCE.getRole_Id();

		/**
		 * The meta object literal for the '{@link aSA.impl.RoleRequisImpl <em>Role Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.RoleRequisImpl
		 * @see aSA.impl.ASAPackageImpl#getRoleRequis()
		 * @generated
		 */
		EClass ROLE_REQUIS = eINSTANCE.getRoleRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.RoleFourniImpl <em>Role Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.RoleFourniImpl
		 * @see aSA.impl.ASAPackageImpl#getRoleFourni()
		 * @generated
		 */
		EClass ROLE_FOURNI = eINSTANCE.getRoleFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.GlueImpl
		 * @see aSA.impl.ASAPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>TO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__TO = eINSTANCE.getGlue_TO();

		/**
		 * The meta object literal for the '<em><b>FROM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__FROM = eINSTANCE.getGlue_FROM();

		/**
		 * The meta object literal for the '<em><b>Glue Function</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GLUE___GLUE_FUNCTION__ROLEFOURNI = eINSTANCE.getGlue__GlueFunction__RoleFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.AttachmentImpl
		 * @see aSA.impl.ASAPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>FROM 2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__FROM_2 = eINSTANCE.getAttachment_FROM_2();

		/**
		 * The meta object literal for the '<em><b>TO 1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__TO_1 = eINSTANCE.getAttachment_TO_1();

		/**
		 * The meta object literal for the '<em><b>FROM 1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__FROM_1 = eINSTANCE.getAttachment_FROM_1();

		/**
		 * The meta object literal for the '<em><b>TO 2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__TO_2 = eINSTANCE.getAttachment_TO_2();

		/**
		 * The meta object literal for the '<em><b>Attach Port To Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI = eINSTANCE.getAttachment__AttachPortToRole__PortComposantFourni();

		/**
		 * The meta object literal for the '<em><b>Attach Role To Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI = eINSTANCE.getAttachment__AttachRoleToPort__RoleFourni();

	}

} //ASAPackage
