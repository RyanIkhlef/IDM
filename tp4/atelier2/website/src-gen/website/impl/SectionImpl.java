/**
 */
package website.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import website.Button;
import website.Image;
import website.Paragraph;
import website.Section;
import website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link website.impl.SectionImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link website.impl.SectionImpl#getImage <em>Image</em>}</li>
 *   <li>{@link website.impl.SectionImpl#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
	/**
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraph;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> image;

	/**
	 * The cached value of the '{@link #getButton() <em>Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> button;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getParagraph() {
		if (paragraph == null) {
			paragraph = new EObjectContainmentEList<Paragraph>(Paragraph.class, this,
					WebsitePackage.SECTION__PARAGRAPH);
		}
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<Image>(Image.class, this, WebsitePackage.SECTION__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButton() {
		if (button == null) {
			button = new EObjectContainmentEList<Button>(Button.class, this, WebsitePackage.SECTION__BUTTON);
		}
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebsitePackage.SECTION__PARAGRAPH:
			return ((InternalEList<?>) getParagraph()).basicRemove(otherEnd, msgs);
		case WebsitePackage.SECTION__IMAGE:
			return ((InternalEList<?>) getImage()).basicRemove(otherEnd, msgs);
		case WebsitePackage.SECTION__BUTTON:
			return ((InternalEList<?>) getButton()).basicRemove(otherEnd, msgs);
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
		case WebsitePackage.SECTION__PARAGRAPH:
			return getParagraph();
		case WebsitePackage.SECTION__IMAGE:
			return getImage();
		case WebsitePackage.SECTION__BUTTON:
			return getButton();
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
		case WebsitePackage.SECTION__PARAGRAPH:
			getParagraph().clear();
			getParagraph().addAll((Collection<? extends Paragraph>) newValue);
			return;
		case WebsitePackage.SECTION__IMAGE:
			getImage().clear();
			getImage().addAll((Collection<? extends Image>) newValue);
			return;
		case WebsitePackage.SECTION__BUTTON:
			getButton().clear();
			getButton().addAll((Collection<? extends Button>) newValue);
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
		case WebsitePackage.SECTION__PARAGRAPH:
			getParagraph().clear();
			return;
		case WebsitePackage.SECTION__IMAGE:
			getImage().clear();
			return;
		case WebsitePackage.SECTION__BUTTON:
			getButton().clear();
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
		case WebsitePackage.SECTION__PARAGRAPH:
			return paragraph != null && !paragraph.isEmpty();
		case WebsitePackage.SECTION__IMAGE:
			return image != null && !image.isEmpty();
		case WebsitePackage.SECTION__BUTTON:
			return button != null && !button.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
