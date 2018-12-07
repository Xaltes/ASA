/**
 */
package aSA.impl;

import aSA.*;

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
public class ASAFactoryImpl extends EFactoryImpl implements ASAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ASAFactory init() {
		try {
			ASAFactory theASAFactory = (ASAFactory)EPackage.Registry.INSTANCE.getEFactory(ASAPackage.eNS_URI);
			if (theASAFactory != null) {
				return theASAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ASAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASAFactoryImpl() {
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
			case ASAPackage.COMPOSANT: return createComposant();
			case ASAPackage.INTERFACE_COMPOSANT: return createInterfaceComposant();
			case ASAPackage.SERVICE: return createService();
			case ASAPackage.SERVICE_REQUIS: return createServiceRequis();
			case ASAPackage.SERVICE_FOURNI: return createServiceFourni();
			case ASAPackage.PORT_COMPOSANT_FOURNI: return createPortComposantFourni();
			case ASAPackage.PORT_COMPOSANT_REQUIS: return createPortComposantRequis();
			case ASAPackage.PORT_COMPOSANT: return createPortComposant();
			case ASAPackage.PROPRIETE: return createPropriete();
			case ASAPackage.CONTRAINTE_TECHNIQUE: return createContrainteTechnique();
			case ASAPackage.COMPOSANT_SIMPLE: return createComposantSimple();
			case ASAPackage.CONFIGURATION: return createConfiguration();
			case ASAPackage.INTERFACE_CONFIGURATION: return createInterfaceConfiguration();
			case ASAPackage.PORT_CONFIGURATION: return createPortConfiguration();
			case ASAPackage.PORT_CONFIGURATION_REQUIS: return createPortConfigurationRequis();
			case ASAPackage.PORT_CONFIGURATION_FOURNI: return createPortConfigurationFourni();
			case ASAPackage.BINDING: return createBinding();
			case ASAPackage.CONNECTEUR: return createConnecteur();
			case ASAPackage.INTERFACE_CONNECTEUR: return createInterfaceConnecteur();
			case ASAPackage.ROLE: return createRole();
			case ASAPackage.ROLE_REQUIS: return createRoleRequis();
			case ASAPackage.ROLE_FOURNI: return createRoleFourni();
			case ASAPackage.GLUE: return createGlue();
			case ASAPackage.ATTACHMENT: return createAttachment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceComposant createInterfaceComposant() {
		InterfaceComposantImpl interfaceComposant = new InterfaceComposantImpl();
		return interfaceComposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequis createServiceRequis() {
		ServiceRequisImpl serviceRequis = new ServiceRequisImpl();
		return serviceRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourni createServiceFourni() {
		ServiceFourniImpl serviceFourni = new ServiceFourniImpl();
		return serviceFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantFourni createPortComposantFourni() {
		PortComposantFourniImpl portComposantFourni = new PortComposantFourniImpl();
		return portComposantFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposantRequis createPortComposantRequis() {
		PortComposantRequisImpl portComposantRequis = new PortComposantRequisImpl();
		return portComposantRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComposant createPortComposant() {
		PortComposantImpl portComposant = new PortComposantImpl();
		return portComposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propriete createPropriete() {
		ProprieteImpl propriete = new ProprieteImpl();
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrainteTechnique createContrainteTechnique() {
		ContrainteTechniqueImpl contrainteTechnique = new ContrainteTechniqueImpl();
		return contrainteTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantSimple createComposantSimple() {
		ComposantSimpleImpl composantSimple = new ComposantSimpleImpl();
		return composantSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConfiguration createInterfaceConfiguration() {
		InterfaceConfigurationImpl interfaceConfiguration = new InterfaceConfigurationImpl();
		return interfaceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfiguration createPortConfiguration() {
		PortConfigurationImpl portConfiguration = new PortConfigurationImpl();
		return portConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationRequis createPortConfigurationRequis() {
		PortConfigurationRequisImpl portConfigurationRequis = new PortConfigurationRequisImpl();
		return portConfigurationRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigurationFourni createPortConfigurationFourni() {
		PortConfigurationFourniImpl portConfigurationFourni = new PortConfigurationFourniImpl();
		return portConfigurationFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createConnecteur() {
		ConnecteurImpl connecteur = new ConnecteurImpl();
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnecteur createInterfaceConnecteur() {
		InterfaceConnecteurImpl interfaceConnecteur = new InterfaceConnecteurImpl();
		return interfaceConnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleRequis() {
		RoleRequisImpl roleRequis = new RoleRequisImpl();
		return roleRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleFourni() {
		RoleFourniImpl roleFourni = new RoleFourniImpl();
		return roleFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASAPackage getASAPackage() {
		return (ASAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ASAPackage getPackage() {
		return ASAPackage.eINSTANCE;
	}

} //ASAFactoryImpl
