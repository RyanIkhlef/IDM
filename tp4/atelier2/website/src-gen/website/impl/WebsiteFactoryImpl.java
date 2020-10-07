/**
 */
package website.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import website.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsiteFactoryImpl extends EFactoryImpl implements WebsiteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebsiteFactory init() {
		try {
			WebsiteFactory theWebsiteFactory = (WebsiteFactory) EPackage.Registry.INSTANCE
					.getEFactory(WebsitePackage.eNS_URI);
			if (theWebsiteFactory != null) {
				return theWebsiteFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebsiteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WebsitePackage.SITE:
			return createSite();
		case WebsitePackage.BODY:
			return createBody();
		case WebsitePackage.PARAGRAPH:
			return createParagraph();
		case WebsitePackage.IMAGE:
			return createImage();
		case WebsitePackage.SECTION:
			return createSection();
		case WebsitePackage.BUTTON:
			return createButton();
		case WebsitePackage.EXTERNAL_LINK:
			return createExternalLink();
		case WebsitePackage.INTERNAL_LINK:
			return createInternalLink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLink createExternalLink() {
		ExternalLinkImpl externalLink = new ExternalLinkImpl();
		return externalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink createInternalLink() {
		InternalLinkImpl internalLink = new InternalLinkImpl();
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsitePackage getWebsitePackage() {
		return (WebsitePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebsitePackage getPackage() {
		return WebsitePackage.eINSTANCE;
	}

} //WebsiteFactoryImpl
