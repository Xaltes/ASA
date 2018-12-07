/**
 */
package aSA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Attachment#getFROM_2 <em>FROM 2</em>}</li>
 *   <li>{@link aSA.Attachment#getTO_1 <em>TO 1</em>}</li>
 *   <li>{@link aSA.Attachment#getFROM_1 <em>FROM 1</em>}</li>
 *   <li>{@link aSA.Attachment#getTO_2 <em>TO 2</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends EObject {
	/**
	 * Returns the value of the '<em><b>FROM 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FROM 2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FROM 2</em>' reference.
	 * @see #setFROM_2(RoleFourni)
	 * @see aSA.ASAPackage#getAttachment_FROM_2()
	 * @model
	 * @generated
	 */
	RoleFourni getFROM_2();

	/**
	 * Sets the value of the '{@link aSA.Attachment#getFROM_2 <em>FROM 2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FROM 2</em>' reference.
	 * @see #getFROM_2()
	 * @generated
	 */
	void setFROM_2(RoleFourni value);

	/**
	 * Returns the value of the '<em><b>TO 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TO 1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TO 1</em>' reference.
	 * @see #setTO_1(RoleRequis)
	 * @see aSA.ASAPackage#getAttachment_TO_1()
	 * @model
	 * @generated
	 */
	RoleRequis getTO_1();

	/**
	 * Sets the value of the '{@link aSA.Attachment#getTO_1 <em>TO 1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TO 1</em>' reference.
	 * @see #getTO_1()
	 * @generated
	 */
	void setTO_1(RoleRequis value);

	/**
	 * Returns the value of the '<em><b>FROM 1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FROM 1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FROM 1</em>' reference.
	 * @see #setFROM_1(PortComposantFourni)
	 * @see aSA.ASAPackage#getAttachment_FROM_1()
	 * @model
	 * @generated
	 */
	PortComposantFourni getFROM_1();

	/**
	 * Sets the value of the '{@link aSA.Attachment#getFROM_1 <em>FROM 1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FROM 1</em>' reference.
	 * @see #getFROM_1()
	 * @generated
	 */
	void setFROM_1(PortComposantFourni value);

	/**
	 * Returns the value of the '<em><b>TO 2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TO 2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TO 2</em>' reference.
	 * @see #setTO_2(PortComposantRequis)
	 * @see aSA.ASAPackage#getAttachment_TO_2()
	 * @model
	 * @generated
	 */
	PortComposantRequis getTO_2();

	/**
	 * Sets the value of the '{@link aSA.Attachment#getTO_2 <em>TO 2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TO 2</em>' reference.
	 * @see #getTO_2()
	 * @generated
	 */
	void setTO_2(PortComposantRequis value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RoleRequis attachPortToRole(PortComposantFourni port);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PortComposantRequis attachRoleToPort(RoleFourni role);

} // Attachment
