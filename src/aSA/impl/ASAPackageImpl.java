/**
 */
package aSA.impl;

import M1.M1Package;

import M1.impl.M1PackageImpl;

import aSA.ASAFactory;
import aSA.ASAPackage;
import aSA.Attachment;
import aSA.Binding;
import aSA.Composant;
import aSA.ComposantSimple;
import aSA.Configuration;
import aSA.Connecteur;
import aSA.ContrainteTechnique;
import aSA.Glue;
import aSA.InterfaceComposant;
import aSA.InterfaceConfiguration;
import aSA.InterfaceConnecteur;
import aSA.PortComposant;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.PortConfiguration;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;
import aSA.Propriete;
import aSA.Role;
import aSA.RoleFourni;
import aSA.RoleRequis;
import aSA.Service;
import aSA.ServiceFourni;
import aSA.ServiceRequis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASAPackageImpl extends EPackageImpl implements ASAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portComposantFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portComposantRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprieteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConfigurationRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConfigurationFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnecteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

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
	 * @see aSA.ASAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ASAPackageImpl() {
		super(eNS_URI, ASAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ASAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ASAPackage init() {
		if (isInited) return (ASAPackage)EPackage.Registry.INSTANCE.getEPackage(ASAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredASAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ASAPackageImpl theASAPackage = registeredASAPackage instanceof ASAPackageImpl ? (ASAPackageImpl)registeredASAPackage : new ASAPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(M1Package.eNS_URI);
		M1PackageImpl theM1Package = (M1PackageImpl)(registeredPackage instanceof M1PackageImpl ? registeredPackage : M1Package.eINSTANCE);

		// Create package meta-data objects
		theASAPackage.createPackageContents();
		theM1Package.createPackageContents();

		// Initialize created meta-data
		theASAPackage.initializePackageContents();
		theM1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theASAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ASAPackage.eNS_URI, theASAPackage);
		return theASAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposant() {
		return composantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Interfacecomposant() {
		return (EReference)composantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Propriete() {
		return (EReference)composantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Contraintetechnique() {
		return (EReference)composantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceComposant() {
		return interfaceComposantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComposant_Service() {
		return (EReference)interfaceComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComposant_Port() {
		return (EReference)interfaceComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRequis() {
		return serviceRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFourni() {
		return serviceFourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortComposantFourni() {
		return portComposantFourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortComposantRequis() {
		return portComposantRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortComposant() {
		return portComposantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortComposant_Id() {
		return (EAttribute)portComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropriete() {
		return proprieteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropriete_Fonctionnelle() {
		return (EAttribute)proprieteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropriete_Configurable() {
		return (EAttribute)proprieteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrainteTechnique() {
		return contrainteTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposantSimple() {
		return composantSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Composant() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Interfaceconfiguration() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Attachment() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Binding() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConfiguration() {
		return interfaceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConfiguration_Portconfiguration() {
		return (EReference)interfaceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConfiguration() {
		return portConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortConfiguration_Id() {
		return (EAttribute)portConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConfigurationRequis() {
		return portConfigurationRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConfigurationFourni() {
		return portConfigurationFourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Portcomposant() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Portconfiguration() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBinding__BindingConfigConponent__PortConfigurationFourni() {
		return bindingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBinding__BindingComponentConfig__PortComposantFourni() {
		return bindingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBinding__BindingConfigConponent__PortConfigurationRequis() {
		return bindingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBinding__BindingComponentConfig__PortComposantRequis() {
		return bindingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnecteur() {
		return connecteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteur_Interfaceconnecteur() {
		return (EReference)connecteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteur_Glue() {
		return (EReference)connecteurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnecteur() {
		return interfaceConnecteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnecteur_Role() {
		return (EReference)interfaceConnecteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Id() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequis() {
		return roleRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFourni() {
		return roleFourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlue() {
		return glueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_TO() {
		return (EReference)glueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_FROM() {
		return (EReference)glueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlue__GlueFunction__RoleFourni() {
		return glueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_FROM_2() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_TO_1() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_FROM_1() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_TO_2() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttachment__AttachPortToRole__PortComposantFourni() {
		return attachmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttachment__AttachRoleToPort__RoleFourni() {
		return attachmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASAFactory getASAFactory() {
		return (ASAFactory)getEFactoryInstance();
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
		composantEClass = createEClass(COMPOSANT);
		createEReference(composantEClass, COMPOSANT__INTERFACECOMPOSANT);
		createEReference(composantEClass, COMPOSANT__PROPRIETE);
		createEReference(composantEClass, COMPOSANT__CONTRAINTETECHNIQUE);

		interfaceComposantEClass = createEClass(INTERFACE_COMPOSANT);
		createEReference(interfaceComposantEClass, INTERFACE_COMPOSANT__SERVICE);
		createEReference(interfaceComposantEClass, INTERFACE_COMPOSANT__PORT);

		serviceEClass = createEClass(SERVICE);

		serviceRequisEClass = createEClass(SERVICE_REQUIS);

		serviceFourniEClass = createEClass(SERVICE_FOURNI);

		portComposantFourniEClass = createEClass(PORT_COMPOSANT_FOURNI);

		portComposantRequisEClass = createEClass(PORT_COMPOSANT_REQUIS);

		portComposantEClass = createEClass(PORT_COMPOSANT);
		createEAttribute(portComposantEClass, PORT_COMPOSANT__ID);

		proprieteEClass = createEClass(PROPRIETE);
		createEAttribute(proprieteEClass, PROPRIETE__FONCTIONNELLE);
		createEAttribute(proprieteEClass, PROPRIETE__CONFIGURABLE);

		contrainteTechniqueEClass = createEClass(CONTRAINTE_TECHNIQUE);

		composantSimpleEClass = createEClass(COMPOSANT_SIMPLE);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__COMPOSANT);
		createEReference(configurationEClass, CONFIGURATION__INTERFACECONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__ATTACHMENT);
		createEReference(configurationEClass, CONFIGURATION__BINDING);

		interfaceConfigurationEClass = createEClass(INTERFACE_CONFIGURATION);
		createEReference(interfaceConfigurationEClass, INTERFACE_CONFIGURATION__PORTCONFIGURATION);

		portConfigurationEClass = createEClass(PORT_CONFIGURATION);
		createEAttribute(portConfigurationEClass, PORT_CONFIGURATION__ID);

		portConfigurationRequisEClass = createEClass(PORT_CONFIGURATION_REQUIS);

		portConfigurationFourniEClass = createEClass(PORT_CONFIGURATION_FOURNI);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__PORTCOMPOSANT);
		createEReference(bindingEClass, BINDING__PORTCONFIGURATION);
		createEOperation(bindingEClass, BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONFOURNI);
		createEOperation(bindingEClass, BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTFOURNI);
		createEOperation(bindingEClass, BINDING___BINDING_CONFIG_CONPONENT__PORTCONFIGURATIONREQUIS);
		createEOperation(bindingEClass, BINDING___BINDING_COMPONENT_CONFIG__PORTCOMPOSANTREQUIS);

		connecteurEClass = createEClass(CONNECTEUR);
		createEReference(connecteurEClass, CONNECTEUR__INTERFACECONNECTEUR);
		createEReference(connecteurEClass, CONNECTEUR__GLUE);

		interfaceConnecteurEClass = createEClass(INTERFACE_CONNECTEUR);
		createEReference(interfaceConnecteurEClass, INTERFACE_CONNECTEUR__ROLE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__ID);

		roleRequisEClass = createEClass(ROLE_REQUIS);

		roleFourniEClass = createEClass(ROLE_FOURNI);

		glueEClass = createEClass(GLUE);
		createEReference(glueEClass, GLUE__TO);
		createEReference(glueEClass, GLUE__FROM);
		createEOperation(glueEClass, GLUE___GLUE_FUNCTION__ROLEFOURNI);

		attachmentEClass = createEClass(ATTACHMENT);
		createEReference(attachmentEClass, ATTACHMENT__FROM_2);
		createEReference(attachmentEClass, ATTACHMENT__TO_1);
		createEReference(attachmentEClass, ATTACHMENT__FROM_1);
		createEReference(attachmentEClass, ATTACHMENT__TO_2);
		createEOperation(attachmentEClass, ATTACHMENT___ATTACH_PORT_TO_ROLE__PORTCOMPOSANTFOURNI);
		createEOperation(attachmentEClass, ATTACHMENT___ATTACH_ROLE_TO_PORT__ROLEFOURNI);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceRequisEClass.getESuperTypes().add(this.getService());
		serviceFourniEClass.getESuperTypes().add(this.getService());
		portComposantFourniEClass.getESuperTypes().add(this.getPortComposant());
		portComposantRequisEClass.getESuperTypes().add(this.getPortComposant());
		composantSimpleEClass.getESuperTypes().add(this.getComposant());
		configurationEClass.getESuperTypes().add(this.getComposant());
		portConfigurationRequisEClass.getESuperTypes().add(this.getPortConfiguration());
		portConfigurationFourniEClass.getESuperTypes().add(this.getPortConfiguration());
		roleRequisEClass.getESuperTypes().add(this.getRole());
		roleFourniEClass.getESuperTypes().add(this.getRole());

		// Initialize classes, features, and operations; add parameters
		initEClass(composantEClass, Composant.class, "Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposant_Interfacecomposant(), this.getInterfaceComposant(), null, "interfacecomposant", null, 2, 2, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Propriete(), this.getPropriete(), null, "propriete", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Contraintetechnique(), this.getContrainteTechnique(), null, "contraintetechnique", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceComposantEClass, InterfaceComposant.class, "InterfaceComposant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceComposant_Service(), this.getService(), null, "service", null, 0, -1, InterfaceComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceComposant_Port(), this.getPortComposant(), null, "port", null, 0, -1, InterfaceComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceRequisEClass, ServiceRequis.class, "ServiceRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceFourniEClass, ServiceFourni.class, "ServiceFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portComposantFourniEClass, PortComposantFourni.class, "PortComposantFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portComposantRequisEClass, PortComposantRequis.class, "PortComposantRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portComposantEClass, PortComposant.class, "PortComposant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortComposant_Id(), ecorePackage.getEString(), "id", null, 0, 1, PortComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proprieteEClass, Propriete.class, "Propriete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropriete_Fonctionnelle(), ecorePackage.getEBoolean(), "fonctionnelle", null, 0, 1, Propriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropriete_Configurable(), ecorePackage.getEBoolean(), "configurable", null, 0, 1, Propriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contrainteTechniqueEClass, ContrainteTechnique.class, "ContrainteTechnique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composantSimpleEClass, ComposantSimple.class, "ComposantSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Composant(), this.getComposant(), null, "composant", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Interfaceconfiguration(), this.getInterfaceConfiguration(), null, "interfaceconfiguration", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Attachment(), this.getAttachment(), null, "attachment", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Binding(), this.getBinding(), null, "binding", null, 2, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceConfigurationEClass, InterfaceConfiguration.class, "InterfaceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConfiguration_Portconfiguration(), this.getPortConfiguration(), null, "portconfiguration", null, 0, -1, InterfaceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portConfigurationEClass, PortConfiguration.class, "PortConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortConfiguration_Id(), ecorePackage.getEString(), "id", null, 0, 1, PortConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portConfigurationRequisEClass, PortConfigurationRequis.class, "PortConfigurationRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portConfigurationFourniEClass, PortConfigurationFourni.class, "PortConfigurationFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Portcomposant(), this.getPortComposant(), null, "portcomposant", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_Portconfiguration(), this.getPortConfiguration(), null, "portconfiguration", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBinding__BindingConfigConponent__PortConfigurationFourni(), this.getPortComposantFourni(), "bindingConfigConponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPortConfigurationFourni(), "portConfigFourni", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBinding__BindingComponentConfig__PortComposantFourni(), this.getPortConfigurationFourni(), "bindingComponentConfig", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPortComposantFourni(), "portCompoFourni", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBinding__BindingConfigConponent__PortConfigurationRequis(), this.getPortComposantRequis(), "bindingConfigConponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPortConfigurationRequis(), "portConfigRequis", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBinding__BindingComponentConfig__PortComposantRequis(), this.getPortConfigurationRequis(), "bindingComponentConfig", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPortComposantRequis(), "portCompoRequis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connecteurEClass, Connecteur.class, "Connecteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnecteur_Interfaceconnecteur(), this.getInterfaceConnecteur(), null, "interfaceconnecteur", null, 2, 2, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteur_Glue(), this.getGlue(), null, "glue", null, 1, 1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceConnecteurEClass, InterfaceConnecteur.class, "InterfaceConnecteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnecteur_Role(), this.getRole(), null, "role", null, 0, -1, InterfaceConnecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Id(), ecorePackage.getEString(), "id", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleRequisEClass, RoleRequis.class, "RoleRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFourniEClass, RoleFourni.class, "RoleFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glueEClass, Glue.class, "Glue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlue_TO(), this.getRoleFourni(), null, "TO", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlue_FROM(), this.getRoleRequis(), null, "FROM", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGlue__GlueFunction__RoleFourni(), this.getRoleRequis(), "glueFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoleFourni(), "roleFourni", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_FROM_2(), this.getRoleFourni(), null, "FROM_2", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_TO_1(), this.getRoleRequis(), null, "TO_1", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_FROM_1(), this.getPortComposantFourni(), null, "FROM_1", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_TO_2(), this.getPortComposantRequis(), null, "TO_2", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAttachment__AttachPortToRole__PortComposantFourni(), this.getRoleRequis(), "attachPortToRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPortComposantFourni(), "port", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttachment__AttachRoleToPort__RoleFourni(), this.getPortComposantRequis(), "attachRoleToPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoleFourni(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ASAPackageImpl
