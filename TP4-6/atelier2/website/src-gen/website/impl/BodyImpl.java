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
 *   <li>{@link website.impl.BodyImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link website.impl.BodyImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link website.impl.BodyImpl#getImages <em>Images</em>}</li>
 *   <li>{@link website.impl.BodyImpl#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyImpl extends MinimalEObjectImpl.Container implements Body {
	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraphs;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> buttons;

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
	public EList<Paragraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, WebsitePackage.BODY__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, WebsitePackage.BODY__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, WebsitePackage.BODY__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButtons() {
		if (buttons == null) {
			buttons = new EObjectContainmentEList<Button>(Button.class, this, WebsitePackage.BODY__BUTTONS);
		}
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebsitePackage.BODY__PARAGRAPHS:
			return ((InternalEList<?>) getParagraphs()).basicRemove(otherEnd, msgs);
		case WebsitePackage.BODY__SECTIONS:
			return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
		case WebsitePackage.BODY__IMAGES:
			return ((InternalEList<?>) getImages()).basicRemove(otherEnd, msgs);
		case WebsitePackage.BODY__BUTTONS:
			return ((InternalEList<?>) getButtons()).basicRemove(otherEnd, msgs);
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
		case WebsitePackage.BODY__PARAGRAPHS:
			return getParagraphs();
		case WebsitePackage.BODY__SECTIONS:
			return getSections();
		case WebsitePackage.BODY__IMAGES:
			return getImages();
		case WebsitePackage.BODY__BUTTONS:
			return getButtons();
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
		case WebsitePackage.BODY__PARAGRAPHS:
			getParagraphs().clear();
			getParagraphs().addAll((Collection<? extends Paragraph>) newValue);
			return;
		case WebsitePackage.BODY__SECTIONS:
			getSections().clear();
			getSections().addAll((Collection<? extends Section>) newValue);
			return;
		case WebsitePackage.BODY__IMAGES:
			getImages().clear();
			getImages().addAll((Collection<? extends Image>) newValue);
			return;
		case WebsitePackage.BODY__BUTTONS:
			getButtons().clear();
			getButtons().addAll((Collection<? extends Button>) newValue);
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
		case WebsitePackage.BODY__PARAGRAPHS:
			getParagraphs().clear();
			return;
		case WebsitePackage.BODY__SECTIONS:
			getSections().clear();
			return;
		case WebsitePackage.BODY__IMAGES:
			getImages().clear();
			return;
		case WebsitePackage.BODY__BUTTONS:
			getButtons().clear();
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
		case WebsitePackage.BODY__PARAGRAPHS:
			return paragraphs != null && !paragraphs.isEmpty();
		case WebsitePackage.BODY__SECTIONS:
			return sections != null && !sections.isEmpty();
		case WebsitePackage.BODY__IMAGES:
			return images != null && !images.isEmpty();
		case WebsitePackage.BODY__BUTTONS:
			return buttons != null && !buttons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyImpl
