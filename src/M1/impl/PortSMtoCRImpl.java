/**
 */
package M1.impl;

import M1.M1Package;

import aSA.Attachment;
import aSA.PortComposantFourni;

import aSA.impl.PortComposantFourniImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port SMto CR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.PortSMtoCRImpl#getAttachmentsmtocr <em>Attachmentsmtocr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortSMtoCRImpl extends PortComposantFourniImpl implements PortComposantFourni {
	/**
	 * The cached value of the '{@link #getAttachmentsmtocr() <em>Attachmentsmtocr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentsmtocr()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentsmtocr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortSMtoCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.PORT_SMTO_CR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentsmtocr() {
		if (attachmentsmtocr != null && ((EObject)attachmentsmtocr).eIsProxy()) {
			InternalEObject oldAttachmentsmtocr = (InternalEObject)attachmentsmtocr;
			attachmentsmtocr = (Attachment)eResolveProxy(oldAttachmentsmtocr);
			if (attachmentsmtocr != oldAttachmentsmtocr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.PORT_SMTO_CR__ATTACHMENTSMTOCR, oldAttachmentsmtocr, attachmentsmtocr));
			}
		}
		return attachmentsmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetAttachmentsmtocr() {
		return attachmentsmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentsmtocr(Attachment newAttachmentsmtocr) {
		Attachment oldAttachmentsmtocr = attachmentsmtocr;
		attachmentsmtocr = newAttachmentsmtocr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.PORT_SMTO_CR__ATTACHMENTSMTOCR, oldAttachmentsmtocr, attachmentsmtocr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.PORT_SMTO_CR__ATTACHMENTSMTOCR:
				if (resolve) return getAttachmentsmtocr();
				return basicGetAttachmentsmtocr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M1Package.PORT_SMTO_CR__ATTACHMENTSMTOCR:
				setAttachmentsmtocr((Attachment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case M1Package.PORT_SMTO_CR__ATTACHMENTSMTOCR:
				setAttachmentsmtocr((Attachment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case M1Package.PORT_SMTO_CR__ATTACHMENTSMTOCR:
				return attachmentsmtocr != null;
		}
		return super.eIsSet(featureID);
	}

} //PortSMtoCRImpl
