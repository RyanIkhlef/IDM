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

import website.Body;
import website.Button;
import website.Image;
import website.Paragraph;
import website.Section;
import website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link website.impl.BodyImpl#getSection <em>Section</em>}</li>
 *   <li>{@link website.impl.BodyImpl#getImage <em>Image</em>}</li>
 *   <li>{@link website.impl.BodyImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link website.impl.BodyImpl#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyImpl extends MinimalEObjectImpl.Container implements Body {
	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> section;

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
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraph;

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
	protected BodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<Section>(Section.class, this, WebsitePackage.BODY__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<Image>(Image.class, this, WebsitePackage.BODY__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getParagraph() {
		if (paragraph == null) {
			paragraph = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, WebsitePackage.BODY__PARAGRAPH);
		}
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButton() {
		if (button == null) {
			button = new EObjectContainmentEList<Button>(Button.class, this, WebsitePackage.BODY__BUTTON);
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
		case WebsitePackage.BODY__SECTION:
			return ((InternalEList<?>) getSection()).basicRemove(otherEnd, msgs);
		case WebsitePackage.BODY__IMAGE:
			return ((InternalEList<?>) getImage()).basicRemove(otherEnd, msgs);
		case WebsitePackage.BODY__PARAGRAPH:
			return ((InternalEList<?>) getParagraph()).basicRemove(otherEnd, msgs);
		case WebsitePackage.BODY__BUTTON:
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
		case WebsitePackage.BODY__SECTION:
			return getSection();
		case WebsitePackage.BODY__IMAGE:
			return getImage();
		case WebsitePackage.BODY__PARAGRAPH:
			return getParagraph();
		case WebsitePackage.BODY__BUTTON:
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
		case WebsitePackage.BODY__SECTION:
			getSection().clear();
			getSection().addAll((Collection<? extends Section>) newValue);
			return;
		case WebsitePackage.BODY__IMAGE:
			getImage().clear();
			getImage().addAll((Collection<? extends Image>) newValue);
			return;
		case WebsitePackage.BODY__PARAGRAPH:
			getParagraph().clear();
			getParagraph().addAll((Collection<? extends Paragraph>) newValue);
			return;
		case WebsitePackage.BODY__BUTTON:
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
		case WebsitePackage.BODY__SECTION:
			getSection().clear();
			return;
		case WebsitePackage.BODY__IMAGE:
			getImage().clear();
			return;
		case WebsitePackage.BODY__PARAGRAPH:
			getParagraph().clear();
			return;
		case WebsitePackage.BODY__BUTTON:
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
		case WebsitePackage.BODY__SECTION:
			return section != null && !section.isEmpty();
		case WebsitePackage.BODY__IMAGE:
			return image != null && !image.isEmpty();
		case WebsitePackage.BODY__PARAGRAPH:
			return paragraph != null && !paragraph.isEmpty();
		case WebsitePackage.BODY__BUTTON:
			return button != null && !button.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyImpl
