/**
 */
package aSA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Glue#getTO <em>TO</em>}</li>
 *   <li>{@link aSA.Glue#getFROM <em>FROM</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getGlue()
 * @model
 * @generated
 */
public interface Glue extends EObject {
	/**
	 * Returns the value of the '<em><b>TO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TO</em>' reference.
	 * @see #setTO(RoleFourni)
	 * @see aSA.ASAPackage#getGlue_TO()
	 * @model
	 * @generated
	 */
	RoleFourni getTO();

	/**
	 * Sets the value of the '{@link aSA.Glue#getTO <em>TO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TO</em>' reference.
	 * @see #getTO()
	 * @generated
	 */
	void setTO(RoleFourni value);

	/**
	 * Returns the value of the '<em><b>FROM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FROM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FROM</em>' reference.
	 * @see #setFROM(RoleRequis)
	 * @see aSA.ASAPackage#getGlue_FROM()
	 * @model
	 * @generated
	 */
	RoleRequis getFROM();

	/**
	 * Sets the value of the '{@link aSA.Glue#getFROM <em>FROM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FROM</em>' reference.
	 * @see #getFROM()
	 * @generated
	 */
	void setFROM(RoleRequis value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RoleRequis glueFunction(RoleFourni roleFourni);

} // Glue
