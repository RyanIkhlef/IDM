/**
 */
package website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import website.Image;
import website.Link;
import website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link website.impl.ImageImpl#getImageLink <em>Image Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends HTMLElementImpl implements Image {
	/**
	 * The cached value of the '{@link #getImageLink() <em>Image Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageLink()
	 * @generated
	 * @ordered
	 */
	protected Link imageLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getImageLink() {
		return imageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageLink(Link newImageLink, NotificationChain msgs) {
		Link oldImageLink = imageLink;
		imageLink = newImageLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WebsitePackage.IMAGE__IMAGE_LINK, oldImageLink, newImageLink);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageLink(Link newImageLink) {
		if (newImageLink != imageLink) {
			NotificationChain msgs = null;
			if (imageLink != null)
				msgs = ((InternalEObject) imageLink).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WebsitePackage.IMAGE__IMAGE_LINK, null, msgs);
			if (newImageLink != null)
				msgs = ((InternalEObject) newImageLink).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WebsitePackage.IMAGE__IMAGE_LINK, null, msgs);
			msgs = basicSetImageLink(newImageLink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE__IMAGE_LINK, newImageLink,
					newImageLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebsitePackage.IMAGE__IMAGE_LINK:
			return basicSetImageLink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebsitePackage.IMAGE__IMAGE_LINK:
			return getImageLink();
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
		case WebsitePackage.IMAGE__IMAGE_LINK:
			setImageLink((Link) newValue);
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
		case WebsitePackage.IMAGE__IMAGE_LINK:
			setImageLink((Link) null);
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
		case WebsitePackage.IMAGE__IMAGE_LINK:
			return imageLink != null;
		}
		return super.eIsSet(featureID);
	}

} //ImageImpl
