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
import website.Link;
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
 *   <li>{@link website.impl.SectionImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link website.impl.SectionImpl#getImages <em>Images</em>}</li>
 *   <li>{@link website.impl.SectionImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link website.impl.SectionImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link website.impl.SectionImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
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
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

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
	public EList<Paragraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this,
					WebsitePackage.SECTION__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, WebsitePackage.SECTION__IMAGES);
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
			buttons = new EObjectContainmentEList<Button>(Button.class, this, WebsitePackage.SECTION__BUTTONS);
		}
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, WebsitePackage.SECTION__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, WebsitePackage.SECTION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebsitePackage.SECTION__PARAGRAPHS:
			return ((InternalEList<?>) getParagraphs()).basicRemove(otherEnd, msgs);
		case WebsitePackage.SECTION__IMAGES:
			return ((InternalEList<?>) getImages()).basicRemove(otherEnd, msgs);
		case WebsitePackage.SECTION__BUTTONS:
			return ((InternalEList<?>) getButtons()).basicRemove(otherEnd, msgs);
		case WebsitePackage.SECTION__SECTIONS:
			return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
		case WebsitePackage.SECTION__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
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
		case WebsitePackage.SECTION__PARAGRAPHS:
			return getParagraphs();
		case WebsitePackage.SECTION__IMAGES:
			return getImages();
		case WebsitePackage.SECTION__BUTTONS:
			return getButtons();
		case WebsitePackage.SECTION__SECTIONS:
			return getSections();
		case WebsitePackage.SECTION__LINKS:
			return getLinks();
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
		case WebsitePackage.SECTION__PARAGRAPHS:
			getParagraphs().clear();
			getParagraphs().addAll((Collection<? extends Paragraph>) newValue);
			return;
		case WebsitePackage.SECTION__IMAGES:
			getImages().clear();
			getImages().addAll((Collection<? extends Image>) newValue);
			return;
		case WebsitePackage.SECTION__BUTTONS:
			getButtons().clear();
			getButtons().addAll((Collection<? extends Button>) newValue);
			return;
		case WebsitePackage.SECTION__SECTIONS:
			getSections().clear();
			getSections().addAll((Collection<? extends Section>) newValue);
			return;
		case WebsitePackage.SECTION__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
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
		case WebsitePackage.SECTION__PARAGRAPHS:
			getParagraphs().clear();
			return;
		case WebsitePackage.SECTION__IMAGES:
			getImages().clear();
			return;
		case WebsitePackage.SECTION__BUTTONS:
			getButtons().clear();
			return;
		case WebsitePackage.SECTION__SECTIONS:
			getSections().clear();
			return;
		case WebsitePackage.SECTION__LINKS:
			getLinks().clear();
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
		case WebsitePackage.SECTION__PARAGRAPHS:
			return paragraphs != null && !paragraphs.isEmpty();
		case WebsitePackage.SECTION__IMAGES:
			return images != null && !images.isEmpty();
		case WebsitePackage.SECTION__BUTTONS:
			return buttons != null && !buttons.isEmpty();
		case WebsitePackage.SECTION__SECTIONS:
			return sections != null && !sections.isEmpty();
		case WebsitePackage.SECTION__LINKS:
			return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
