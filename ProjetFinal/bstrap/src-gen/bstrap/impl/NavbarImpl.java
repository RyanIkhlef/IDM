/**
 */
package bstrap.impl;

import bstrap.BstrapPackage;
import bstrap.Image;
import bstrap.Link;
import bstrap.Navbar;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navbar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bstrap.impl.NavbarImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link bstrap.impl.NavbarImpl#getImageBrand <em>Image Brand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavbarImpl extends TextElementImpl implements Navbar {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getImageBrand() <em>Image Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageBrand()
	 * @generated
	 * @ordered
	 */
	protected Image imageBrand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavbarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.NAVBAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, BstrapPackage.NAVBAR__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image getImageBrand() {
		return imageBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageBrand(Image newImageBrand, NotificationChain msgs) {
		Image oldImageBrand = imageBrand;
		imageBrand = newImageBrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BstrapPackage.NAVBAR__IMAGE_BRAND, oldImageBrand, newImageBrand);
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
	public void setImageBrand(Image newImageBrand) {
		if (newImageBrand != imageBrand) {
			NotificationChain msgs = null;
			if (imageBrand != null)
				msgs = ((InternalEObject) imageBrand).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BstrapPackage.NAVBAR__IMAGE_BRAND, null, msgs);
			if (newImageBrand != null)
				msgs = ((InternalEObject) newImageBrand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BstrapPackage.NAVBAR__IMAGE_BRAND, null, msgs);
			msgs = basicSetImageBrand(newImageBrand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.NAVBAR__IMAGE_BRAND, newImageBrand,
					newImageBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.NAVBAR__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case BstrapPackage.NAVBAR__IMAGE_BRAND:
			return basicSetImageBrand(null, msgs);
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
		case BstrapPackage.NAVBAR__LINKS:
			return getLinks();
		case BstrapPackage.NAVBAR__IMAGE_BRAND:
			return getImageBrand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BstrapPackage.NAVBAR__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case BstrapPackage.NAVBAR__IMAGE_BRAND:
			setImageBrand((Image) newValue);
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
		case BstrapPackage.NAVBAR__LINKS:
			getLinks().clear();
			return;
		case BstrapPackage.NAVBAR__IMAGE_BRAND:
			setImageBrand((Image) null);
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
		case BstrapPackage.NAVBAR__LINKS:
			return links != null && !links.isEmpty();
		case BstrapPackage.NAVBAR__IMAGE_BRAND:
			return imageBrand != null;
		}
		return super.eIsSet(featureID);
	}

} //NavbarImpl
