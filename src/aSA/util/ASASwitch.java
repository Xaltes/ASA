/**
 */
package aSA.util;

import aSA.*;

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
 * @see aSA.ASAPackage
 * @generated
 */
public class ASASwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ASAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASASwitch() {
		if (modelPackage == null) {
			modelPackage = ASAPackage.eINSTANCE;
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
			case ASAPackage.COMPOSANT: {
				Composant composant = (Composant)theEObject;
				T result = caseComposant(composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.INTERFACE_COMPOSANT: {
				InterfaceComposant interfaceComposant = (InterfaceComposant)theEObject;
				T result = caseInterfaceComposant(interfaceComposant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.SERVICE_REQUIS: {
				ServiceRequis serviceRequis = (ServiceRequis)theEObject;
				T result = caseServiceRequis(serviceRequis);
				if (result == null) result = caseService(serviceRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.SERVICE_FOURNI: {
				ServiceFourni serviceFourni = (ServiceFourni)theEObject;
				T result = caseServiceFourni(serviceFourni);
				if (result == null) result = caseService(serviceFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PORT_COMPOSANT_FOURNI: {
				PortComposantFourni portComposantFourni = (PortComposantFourni)theEObject;
				T result = casePortComposantFourni(portComposantFourni);
				if (result == null) result = casePortComposant(portComposantFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PORT_COMPOSANT_REQUIS: {
				PortComposantRequis portComposantRequis = (PortComposantRequis)theEObject;
				T result = casePortComposantRequis(portComposantRequis);
				if (result == null) result = casePortComposant(portComposantRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PORT_COMPOSANT: {
				PortComposant portComposant = (PortComposant)theEObject;
				T result = casePortComposant(portComposant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PROPRIETE: {
				Propriete propriete = (Propriete)theEObject;
				T result = casePropriete(propriete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONTRAINTE_TECHNIQUE: {
				ContrainteTechnique contrainteTechnique = (ContrainteTechnique)theEObject;
				T result = caseContrainteTechnique(contrainteTechnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.COMPOSANT_SIMPLE: {
				ComposantSimple composantSimple = (ComposantSimple)theEObject;
				T result = caseComposantSimple(composantSimple);
				if (result == null) result = caseComposant(composantSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseComposant(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.INTERFACE_CONFIGURATION: {
				InterfaceConfiguration interfaceConfiguration = (InterfaceConfiguration)theEObject;
				T result = caseInterfaceConfiguration(interfaceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PORT_CONFIGURATION: {
				PortConfiguration portConfiguration = (PortConfiguration)theEObject;
				T result = casePortConfiguration(portConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PORT_CONFIGURATION_REQUIS: {
				PortConfigurationRequis portConfigurationRequis = (PortConfigurationRequis)theEObject;
				T result = casePortConfigurationRequis(portConfigurationRequis);
				if (result == null) result = casePortConfiguration(portConfigurationRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.PORT_CONFIGURATION_FOURNI: {
				PortConfigurationFourni portConfigurationFourni = (PortConfigurationFourni)theEObject;
				T result = casePortConfigurationFourni(portConfigurationFourni);
				if (result == null) result = casePortConfiguration(portConfigurationFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.CONNECTEUR: {
				Connecteur connecteur = (Connecteur)theEObject;
				T result = caseConnecteur(connecteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.INTERFACE_CONNECTEUR: {
				InterfaceConnecteur interfaceConnecteur = (InterfaceConnecteur)theEObject;
				T result = caseInterfaceConnecteur(interfaceConnecteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.ROLE_REQUIS: {
				RoleRequis roleRequis = (RoleRequis)theEObject;
				T result = caseRoleRequis(roleRequis);
				if (result == null) result = caseRole(roleRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.ROLE_FOURNI: {
				RoleFourni roleFourni = (RoleFourni)theEObject;
				T result = caseRoleFourni(roleFourni);
				if (result == null) result = caseRole(roleFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.GLUE: {
				Glue glue = (Glue)theEObject;
				T result = caseGlue(glue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASAPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Interface Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceComposant(InterfaceComposant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequis(ServiceRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFourni(ServiceFourni object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propriete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropriete(Propriete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainteTechnique(ContrainteTechnique object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Interface Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConfiguration(InterfaceConfiguration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnecteur(InterfaceConnecteur object) {
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
	public T caseRoleRequis(RoleRequis object) {
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
	public T caseRoleFourni(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
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

} //ASASwitch
