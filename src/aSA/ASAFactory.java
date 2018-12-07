/**
 */
package aSA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aSA.ASAPackage
 * @generated
 */
public interface ASAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASAFactory eINSTANCE = aSA.impl.ASAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant</em>'.
	 * @generated
	 */
	Composant createComposant();

	/**
	 * Returns a new object of class '<em>Interface Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Composant</em>'.
	 * @generated
	 */
	InterfaceComposant createInterfaceComposant();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis</em>'.
	 * @generated
	 */
	ServiceRequis createServiceRequis();

	/**
	 * Returns a new object of class '<em>Service Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni</em>'.
	 * @generated
	 */
	ServiceFourni createServiceFourni();

	/**
	 * Returns a new object of class '<em>Port Composant Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Composant Fourni</em>'.
	 * @generated
	 */
	PortComposantFourni createPortComposantFourni();

	/**
	 * Returns a new object of class '<em>Port Composant Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Composant Requis</em>'.
	 * @generated
	 */
	PortComposantRequis createPortComposantRequis();

	/**
	 * Returns a new object of class '<em>Port Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Composant</em>'.
	 * @generated
	 */
	PortComposant createPortComposant();

	/**
	 * Returns a new object of class '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriete</em>'.
	 * @generated
	 */
	Propriete createPropriete();

	/**
	 * Returns a new object of class '<em>Contrainte Technique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte Technique</em>'.
	 * @generated
	 */
	ContrainteTechnique createContrainteTechnique();

	/**
	 * Returns a new object of class '<em>Composant Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant Simple</em>'.
	 * @generated
	 */
	ComposantSimple createComposantSimple();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Interface Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Configuration</em>'.
	 * @generated
	 */
	InterfaceConfiguration createInterfaceConfiguration();

	/**
	 * Returns a new object of class '<em>Port Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Configuration</em>'.
	 * @generated
	 */
	PortConfiguration createPortConfiguration();

	/**
	 * Returns a new object of class '<em>Port Configuration Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Configuration Requis</em>'.
	 * @generated
	 */
	PortConfigurationRequis createPortConfigurationRequis();

	/**
	 * Returns a new object of class '<em>Port Configuration Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Configuration Fourni</em>'.
	 * @generated
	 */
	PortConfigurationFourni createPortConfigurationFourni();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connecteur</em>'.
	 * @generated
	 */
	Connecteur createConnecteur();

	/**
	 * Returns a new object of class '<em>Interface Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Connecteur</em>'.
	 * @generated
	 */
	InterfaceConnecteur createInterfaceConnecteur();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis</em>'.
	 * @generated
	 */
	RoleRequis createRoleRequis();

	/**
	 * Returns a new object of class '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni</em>'.
	 * @generated
	 */
	RoleFourni createRoleFourni();

	/**
	 * Returns a new object of class '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue</em>'.
	 * @generated
	 */
	Glue createGlue();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ASAPackage getASAPackage();

} //ASAFactory
