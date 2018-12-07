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
 * An implementation of the model object '<em><b>Port CMto CR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link M1.impl.PortCMtoCRImpl#getAttachmentcmtocr <em>Attachmentcmtocr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortCMtoCRImpl extends PortComposantFourniImpl implements PortComposantFourni {
	/**
	 * The cached value of the '{@link #getAttachmentcmtocr() <em>Attachmentcmtocr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentcmtocr()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachmentcmtocr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortCMtoCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M1Package.Literals.PORT_CMTO_CR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachmentcmtocr() {
		if (attachmentcmtocr != null && ((EObject)attachmentcmtocr).eIsProxy()) {
			InternalEObject oldAttachmentcmtocr = (InternalEObject)attachmentcmtocr;
			attachmentcmtocr = (Attachment)eResolveProxy(oldAttachmentcmtocr);
			if (attachmentcmtocr != oldAttachmentcmtocr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M1Package.PORT_CMTO_CR__ATTACHMENTCMTOCR, oldAttachmentcmtocr, attachmentcmtocr));
			}
		}
		return attachmentcmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetAttachmentcmtocr() {
		return attachmentcmtocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentcmtocr(Attachment newAttachmentcmtocr) {
		Attachment oldAttachmentcmtocr = attachmentcmtocr;
		attachmentcmtocr = newAttachmentcmtocr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M1Package.PORT_CMTO_CR__ATTACHMENTCMTOCR, oldAttachmentcmtocr, attachmentcmtocr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M1Package.PORT_CMTO_CR__ATTACHMENTCMTOCR:
				if (resolve) return getAttachmentcmtocr();
				return basicGetAttachmentcmtocr();
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
			case M1Package.PORT_CMTO_CR__ATTACHMENTCMTOCR:
				setAttachmentcmtocr((Attachment)newValue);
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
			case M1Package.PORT_CMTO_CR__ATTACHMENTCMTOCR:
				setAttachmentcmtocr((Attachment)null);
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
			case M1Package.PORT_CMTO_CR__ATTACHMENTCMTOCR:
				return attachmentcmtocr != null;
		}
		return super.eIsSet(featureID);
	}

} //PortCMtoCRImpl
