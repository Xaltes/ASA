/**
 */
package aSA.util;

import aSA.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aSA.ASAPackage
 * @generated
 */
public class ASAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ASAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ASAPackage.eINSTANCE;
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
	protected ASASwitch<Adapter> modelSwitch =
		new ASASwitch<Adapter>() {
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter caseInterfaceComposant(InterfaceComposant object) {
				return createInterfaceComposantAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceRequis(ServiceRequis object) {
				return createServiceRequisAdapter();
			}
			@Override
			public Adapter caseServiceFourni(ServiceFourni object) {
				return createServiceFourniAdapter();
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
			public Adapter casePortComposant(PortComposant object) {
				return createPortComposantAdapter();
			}
			@Override
			public Adapter casePropriete(Propriete object) {
				return createProprieteAdapter();
			}
			@Override
			public Adapter caseContrainteTechnique(ContrainteTechnique object) {
				return createContrainteTechniqueAdapter();
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
			public Adapter caseInterfaceConfiguration(InterfaceConfiguration object) {
				return createInterfaceConfigurationAdapter();
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
			public Adapter caseConnecteur(Connecteur object) {
				return createConnecteurAdapter();
			}
			@Override
			public Adapter caseInterfaceConnecteur(InterfaceConnecteur object) {
				return createInterfaceConnecteurAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleRequis(RoleRequis object) {
				return createRoleRequisAdapter();
			}
			@Override
			public Adapter caseRoleFourni(RoleFourni object) {
				return createRoleFourniAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link aSA.InterfaceComposant <em>Interface Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.InterfaceComposant
	 * @generated
	 */
	public Adapter createInterfaceComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.ServiceRequis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ServiceRequis
	 * @generated
	 */
	public Adapter createServiceRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.ServiceFourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ServiceFourni
	 * @generated
	 */
	public Adapter createServiceFourniAdapter() {
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
	 * Creates a new adapter for an object of class '{@link aSA.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Propriete
	 * @generated
	 */
	public Adapter createProprieteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.ContrainteTechnique <em>Contrainte Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.ContrainteTechnique
	 * @generated
	 */
	public Adapter createContrainteTechniqueAdapter() {
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
	 * Creates a new adapter for an object of class '{@link aSA.InterfaceConfiguration <em>Interface Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.InterfaceConfiguration
	 * @generated
	 */
	public Adapter createInterfaceConfigurationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link aSA.InterfaceConnecteur <em>Interface Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.InterfaceConnecteur
	 * @generated
	 */
	public Adapter createInterfaceConnecteurAdapter() {
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
	 * Creates a new adapter for an object of class '{@link aSA.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
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

} //ASAAdapterFactory
