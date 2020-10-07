/**
 */
package website;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see website.WebsiteFactory
 * @model kind="package"
 * @generated
 */
public interface WebsitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "website";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/website";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "website";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsitePackage eINSTANCE = website.impl.WebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link website.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.SiteImpl
	 * @see website.impl.WebsitePackageImpl#getSite()
	 * @generated
	 */
	int SITE = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__BODY = 0;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link website.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.BodyImpl
	 * @see website.impl.WebsitePackageImpl#getBody()
	 * @generated
	 */
	int BODY = 1;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__SECTION = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__BUTTON = 3;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link website.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.ParagraphImpl
	 * @see website.impl.WebsitePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link website.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.ImageImpl
	 * @see website.impl.WebsitePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link website.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.SectionImpl
	 * @see website.impl.WebsitePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 4;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARAGRAPH = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BUTTON = 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link website.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.ButtonImpl
	 * @see website.impl.WebsitePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LINK = 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link website.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.LinkImpl
	 * @see website.impl.WebsitePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link website.impl.ExternalLinkImpl <em>External Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.ExternalLinkImpl
	 * @see website.impl.WebsitePackageImpl#getExternalLink()
	 * @generated
	 */
	int EXTERNAL_LINK = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__URL = LINK__URL;

	/**
	 * The number of structural features of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link website.impl.InternalLinkImpl <em>Internal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see website.impl.InternalLinkImpl
	 * @see website.impl.WebsitePackageImpl#getInternalLink()
	 * @generated
	 */
	int INTERNAL_LINK = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__URL = LINK__URL;

	/**
	 * The number of structural features of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link website.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see website.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Site#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see website.Site#getBody()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Body();

	/**
	 * Returns the meta object for class '{@link website.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see website.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Body#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see website.Body#getSection()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Section();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Body#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see website.Body#getImage()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Body#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraph</em>'.
	 * @see website.Body#getParagraph()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Paragraph();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Body#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Button</em>'.
	 * @see website.Body#getButton()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Button();

	/**
	 * Returns the meta object for class '{@link website.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see website.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link website.Paragraph#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see website.Paragraph#getContent()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Content();

	/**
	 * Returns the meta object for class '{@link website.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see website.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link website.Image#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see website.Image#getUrl()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Url();

	/**
	 * Returns the meta object for class '{@link website.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see website.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Section#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraph</em>'.
	 * @see website.Section#getParagraph()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Paragraph();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Section#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see website.Section#getImage()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Section#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Button</em>'.
	 * @see website.Section#getButton()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Button();

	/**
	 * Returns the meta object for class '{@link website.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see website.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference list '{@link website.Button#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see website.Button#getLink()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Link();

	/**
	 * Returns the meta object for class '{@link website.ExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link</em>'.
	 * @see website.ExternalLink
	 * @generated
	 */
	EClass getExternalLink();

	/**
	 * Returns the meta object for class '{@link website.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link</em>'.
	 * @see website.InternalLink
	 * @generated
	 */
	EClass getInternalLink();

	/**
	 * Returns the meta object for class '{@link website.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see website.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link website.Link#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see website.Link#getUrl()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebsiteFactory getWebsiteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link website.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.SiteImpl
		 * @see website.impl.WebsitePackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__BODY = eINSTANCE.getSite_Body();

		/**
		 * The meta object literal for the '{@link website.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.BodyImpl
		 * @see website.impl.WebsitePackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__SECTION = eINSTANCE.getBody_Section();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__IMAGE = eINSTANCE.getBody_Image();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__PARAGRAPH = eINSTANCE.getBody_Paragraph();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__BUTTON = eINSTANCE.getBody_Button();

		/**
		 * The meta object literal for the '{@link website.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.ParagraphImpl
		 * @see website.impl.WebsitePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__CONTENT = eINSTANCE.getParagraph_Content();

		/**
		 * The meta object literal for the '{@link website.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.ImageImpl
		 * @see website.impl.WebsitePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

		/**
		 * The meta object literal for the '{@link website.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.SectionImpl
		 * @see website.impl.WebsitePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARAGRAPH = eINSTANCE.getSection_Paragraph();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__IMAGE = eINSTANCE.getSection_Image();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__BUTTON = eINSTANCE.getSection_Button();

		/**
		 * The meta object literal for the '{@link website.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.ButtonImpl
		 * @see website.impl.WebsitePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__LINK = eINSTANCE.getButton_Link();

		/**
		 * The meta object literal for the '{@link website.impl.ExternalLinkImpl <em>External Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.ExternalLinkImpl
		 * @see website.impl.WebsitePackageImpl#getExternalLink()
		 * @generated
		 */
		EClass EXTERNAL_LINK = eINSTANCE.getExternalLink();

		/**
		 * The meta object literal for the '{@link website.impl.InternalLinkImpl <em>Internal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.InternalLinkImpl
		 * @see website.impl.WebsitePackageImpl#getInternalLink()
		 * @generated
		 */
		EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

		/**
		 * The meta object literal for the '{@link website.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see website.impl.LinkImpl
		 * @see website.impl.WebsitePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__URL = eINSTANCE.getLink_Url();

	}

} //WebsitePackage
