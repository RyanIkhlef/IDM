/**
 */
package bstrap.impl;

import bstrap.BstrapPackage;
import bstrap.Image;
import bstrap.Link;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bstrap.impl.ImageImpl#getLink <em>Link</em>}</li>
 *   <li>{@link bstrap.impl.ImageImpl#getImgSrc <em>Img Src</em>}</li>
 *   <li>{@link bstrap.impl.ImageImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link bstrap.impl.ImageImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends ElementImpl implements Image {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

	/**
	 * The default value of the '{@link #getImgSrc() <em>Img Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImgSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String IMG_SRC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImgSrc() <em>Img Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImgSrc()
	 * @generated
	 * @ordered
	 */
	protected String imgSrc = IMG_SRC_EDEFAULT;
	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected String alt = ALT_EDEFAULT;
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
		return BstrapPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(Link newLink, NotificationChain msgs) {
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BstrapPackage.IMAGE__LINK,
					oldLink, newLink);
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
	@Override
	public void setLink(Link newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject) link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BstrapPackage.IMAGE__LINK,
						null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject) newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BstrapPackage.IMAGE__LINK,
						null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.IMAGE__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImgSrc() {
		return imgSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImgSrc(String newImgSrc) {
		String oldImgSrc = imgSrc;
		imgSrc = newImgSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.IMAGE__IMG_SRC, oldImgSrc, imgSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlt(String newAlt) {
		String oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.IMAGE__ALT, oldAlt, alt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.IMAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.IMAGE__LINK:
			return basicSetLink(null, msgs);
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
		case BstrapPackage.IMAGE__LINK:
			return getLink();
		case BstrapPackage.IMAGE__IMG_SRC:
			return getImgSrc();
		case BstrapPackage.IMAGE__ALT:
			return getAlt();
		case BstrapPackage.IMAGE__TITLE:
			return getTitle();
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
		case BstrapPackage.IMAGE__LINK:
			setLink((Link) newValue);
			return;
		case BstrapPackage.IMAGE__IMG_SRC:
			setImgSrc((String) newValue);
			return;
		case BstrapPackage.IMAGE__ALT:
			setAlt((String) newValue);
			return;
		case BstrapPackage.IMAGE__TITLE:
			setTitle((String) newValue);
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
		case BstrapPackage.IMAGE__LINK:
			setLink((Link) null);
			return;
		case BstrapPackage.IMAGE__IMG_SRC:
			setImgSrc(IMG_SRC_EDEFAULT);
			return;
		case BstrapPackage.IMAGE__ALT:
			setAlt(ALT_EDEFAULT);
			return;
		case BstrapPackage.IMAGE__TITLE:
			setTitle(TITLE_EDEFAULT);
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
		case BstrapPackage.IMAGE__LINK:
			return link != null;
		case BstrapPackage.IMAGE__IMG_SRC:
			return IMG_SRC_EDEFAULT == null ? imgSrc != null : !IMG_SRC_EDEFAULT.equals(imgSrc);
		case BstrapPackage.IMAGE__ALT:
			return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
		case BstrapPackage.IMAGE__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (imgSrc: ");
		result.append(imgSrc);
		result.append(", alt: ");
		result.append(alt);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
