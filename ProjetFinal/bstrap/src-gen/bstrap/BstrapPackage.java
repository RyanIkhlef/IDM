/**
 */
package bstrap;

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
 * @see bstrap.BstrapFactory
 * @model kind="package"
 * @generated
 */
public interface BstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bstrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bstrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BstrapPackage eINSTANCE = bstrap.impl.BstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link bstrap.impl.SiteRootImpl <em>Site Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.SiteRootImpl
	 * @see bstrap.impl.BstrapPackageImpl#getSiteRoot()
	 * @generated
	 */
	int SITE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ROOT__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ROOT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Site Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.PageImpl
	 * @see bstrap.impl.BstrapPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.ElementImpl
	 * @see bstrap.impl.BstrapPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.TextElementImpl
	 * @see bstrap.impl.BstrapPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT_CONTENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.ButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 3;

	/**
	 * The meta object id for the '{@link bstrap.impl.ButtonGroupImpl <em>Button Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.ButtonGroupImpl
	 * @see bstrap.impl.BstrapPackageImpl#getButtonGroup()
	 * @generated
	 */
	int BUTTON_GROUP = 4;

	/**
	 * The meta object id for the '{@link bstrap.impl.NavbarImpl <em>Navbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.NavbarImpl
	 * @see bstrap.impl.BstrapPackageImpl#getNavbar()
	 * @generated
	 */
	int NAVBAR = 5;

	/**
	 * The meta object id for the '{@link bstrap.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.LinkImpl
	 * @see bstrap.impl.BstrapPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 6;

	/**
	 * The meta object id for the '{@link bstrap.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.ImageImpl
	 * @see bstrap.impl.BstrapPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;

	/**
	 * The meta object id for the '{@link bstrap.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.TextImpl
	 * @see bstrap.impl.BstrapPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = TEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLASSES = TEXT_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT_CONTENT = TEXT_ELEMENT__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TARGET = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SIZE = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IS_OUTLINE = TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IS_ENABLE = TEXT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IS_SPINNER = TEXT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IS_BLOCK_BUTTON = TEXT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__BUTTONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__SIZE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP__IS_VERTICAL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__ID = TEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__CLASSES = TEXT_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__TEXT_CONTENT = TEXT_ELEMENT__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__LINKS = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR__IMAGE_BRAND = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = TEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CLASSES = TEXT_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT_CONTENT = TEXT_ELEMENT__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LINK = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Img Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMG_SRC = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.TitleImpl
	 * @see bstrap.impl.BstrapPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LEVEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__CONTENTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.ParagraphImpl
	 * @see bstrap.impl.BstrapPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = TEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CLASSES = TEXT_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_CONTENT = TEXT_ELEMENT__TEXT_CONTENT;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.PrimaryButtonImpl <em>Primary Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.PrimaryButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getPrimaryButton()
	 * @generated
	 */
	int PRIMARY_BUTTON = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Primary Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.SecondaryButtonImpl <em>Secondary Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.SecondaryButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getSecondaryButton()
	 * @generated
	 */
	int SECONDARY_BUTTON = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Secondary Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Secondary Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.SuccessButtonImpl <em>Success Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.SuccessButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getSuccessButton()
	 * @generated
	 */
	int SUCCESS_BUTTON = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Success Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Success Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.InfoButtonImpl <em>Info Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.InfoButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getInfoButton()
	 * @generated
	 */
	int INFO_BUTTON = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Info Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Info Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.WarningButtonImpl <em>Warning Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.WarningButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getWarningButton()
	 * @generated
	 */
	int WARNING_BUTTON = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Warning Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Warning Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.DarkButtonImpl <em>Dark Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.DarkButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getDarkButton()
	 * @generated
	 */
	int DARK_BUTTON = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Dark Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dark Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.LightButtonImpl <em>Light Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.LightButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getLightButton()
	 * @generated
	 */
	int LIGHT_BUTTON = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Light Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.LinkButtonImpl <em>Link Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.LinkButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getLinkButton()
	 * @generated
	 */
	int LINK_BUTTON = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Link Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.DangerButtonImpl <em>Danger Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.DangerButtonImpl
	 * @see bstrap.impl.BstrapPackageImpl#getDangerButton()
	 * @generated
	 */
	int DANGER_BUTTON = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__ID = BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__CLASSES = BUTTON__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__TEXT_CONTENT = BUTTON__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__TARGET = BUTTON__TARGET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__SIZE = BUTTON__SIZE;

	/**
	 * The feature id for the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__IS_OUTLINE = BUTTON__IS_OUTLINE;

	/**
	 * The feature id for the '<em><b>Is Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__IS_ENABLE = BUTTON__IS_ENABLE;

	/**
	 * The feature id for the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__IS_SPINNER = BUTTON__IS_SPINNER;

	/**
	 * The feature id for the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON__IS_BLOCK_BUTTON = BUTTON__IS_BLOCK_BUTTON;

	/**
	 * The number of structural features of the '<em>Danger Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Danger Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGER_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.CodeLineImpl <em>Code Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.CodeLineImpl
	 * @see bstrap.impl.BstrapPackageImpl#getCodeLine()
	 * @generated
	 */
	int CODE_LINE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__ID = TEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__CLASSES = TEXT_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__TEXT_CONTENT = TEXT_ELEMENT__TEXT_CONTENT;

	/**
	 * The number of structural features of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.CodeBlockImpl
	 * @see bstrap.impl.BstrapPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Codelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODELINES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.BoldTextImpl <em>Bold Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.BoldTextImpl
	 * @see bstrap.impl.BstrapPackageImpl#getBoldText()
	 * @generated
	 */
	int BOLD_TEXT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT__ID = TEXT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT__CLASSES = TEXT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT__TEXT_CONTENT = TEXT__TEXT_CONTENT;

	/**
	 * The number of structural features of the '<em>Bold Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bold Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.ItalicTextImpl <em>Italic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.ItalicTextImpl
	 * @see bstrap.impl.BstrapPackageImpl#getItalicText()
	 * @generated
	 */
	int ITALIC_TEXT = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT__ID = TEXT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT__CLASSES = TEXT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT__TEXT_CONTENT = TEXT__TEXT_CONTENT;

	/**
	 * The number of structural features of the '<em>Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.ListImpl
	 * @see bstrap.impl.BstrapPackageImpl#getList()
	 * @generated
	 */
	int LIST = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LIST_ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.UnorderedListImpl <em>Unordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.UnorderedListImpl
	 * @see bstrap.impl.BstrapPackageImpl#getUnorderedList()
	 * @generated
	 */
	int UNORDERED_LIST = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__ID = LIST__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__CLASSES = LIST__CLASSES;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__LIST_ELEMENTS = LIST__LIST_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.OrderedListImpl
	 * @see bstrap.impl.BstrapPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ID = LIST__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__CLASSES = LIST__CLASSES;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__LIST_ELEMENTS = LIST__LIST_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.BlockQuoteImpl
	 * @see bstrap.impl.BstrapPackageImpl#getBlockQuote()
	 * @generated
	 */
	int BLOCK_QUOTE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Quotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__QUOTES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.LineImpl
	 * @see bstrap.impl.BstrapPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CLASSES = ELEMENT__CLASSES;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bstrap.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bstrap.impl.CodeImpl
	 * @see bstrap.impl.BstrapPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = TEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CLASSES = TEXT_ELEMENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TEXT_CONTENT = TEXT_ELEMENT__TEXT_CONTENT;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link bstrap.SiteRoot <em>Site Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Root</em>'.
	 * @see bstrap.SiteRoot
	 * @generated
	 */
	EClass getSiteRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.SiteRoot#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see bstrap.SiteRoot#getPages()
	 * @see #getSiteRoot()
	 * @generated
	 */
	EReference getSiteRoot_Pages();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.SiteRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bstrap.SiteRoot#getName()
	 * @see #getSiteRoot()
	 * @generated
	 */
	EAttribute getSiteRoot_Name();

	/**
	 * Returns the meta object for class '{@link bstrap.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see bstrap.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bstrap.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.Page#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see bstrap.Page#getElements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Elements();

	/**
	 * Returns the meta object for class '{@link bstrap.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see bstrap.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see bstrap.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Element#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classes</em>'.
	 * @see bstrap.Element#getClasses()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Classes();

	/**
	 * Returns the meta object for class '{@link bstrap.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see bstrap.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference '{@link bstrap.Button#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see bstrap.Button#getTarget()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Target();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Button#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see bstrap.Button#getSize()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Size();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Button#isIsOutline <em>Is Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Outline</em>'.
	 * @see bstrap.Button#isIsOutline()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_IsOutline();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Button#isIsEnable <em>Is Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enable</em>'.
	 * @see bstrap.Button#isIsEnable()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_IsEnable();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Button#isIsSpinner <em>Is Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spinner</em>'.
	 * @see bstrap.Button#isIsSpinner()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_IsSpinner();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Button#isIsBlockButton <em>Is Block Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Block Button</em>'.
	 * @see bstrap.Button#isIsBlockButton()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_IsBlockButton();

	/**
	 * Returns the meta object for class '{@link bstrap.ButtonGroup <em>Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Group</em>'.
	 * @see bstrap.ButtonGroup
	 * @generated
	 */
	EClass getButtonGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.ButtonGroup#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttons</em>'.
	 * @see bstrap.ButtonGroup#getButtons()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EReference getButtonGroup_Buttons();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.ButtonGroup#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see bstrap.ButtonGroup#getSize()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EAttribute getButtonGroup_Size();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.ButtonGroup#isIsVertical <em>Is Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Vertical</em>'.
	 * @see bstrap.ButtonGroup#isIsVertical()
	 * @see #getButtonGroup()
	 * @generated
	 */
	EAttribute getButtonGroup_IsVertical();

	/**
	 * Returns the meta object for class '{@link bstrap.Navbar <em>Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar</em>'.
	 * @see bstrap.Navbar
	 * @generated
	 */
	EClass getNavbar();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.Navbar#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see bstrap.Navbar#getLinks()
	 * @see #getNavbar()
	 * @generated
	 */
	EReference getNavbar_Links();

	/**
	 * Returns the meta object for the containment reference '{@link bstrap.Navbar#getImageBrand <em>Image Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Brand</em>'.
	 * @see bstrap.Navbar#getImageBrand()
	 * @see #getNavbar()
	 * @generated
	 */
	EReference getNavbar_ImageBrand();

	/**
	 * Returns the meta object for class '{@link bstrap.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see bstrap.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Link#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see bstrap.Link#getUrl()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Link#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see bstrap.Link#getTitle()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Title();

	/**
	 * Returns the meta object for class '{@link bstrap.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see bstrap.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the containment reference '{@link bstrap.Image#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see bstrap.Image#getLink()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Link();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Image#getImgSrc <em>Img Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Img Src</em>'.
	 * @see bstrap.Image#getImgSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_ImgSrc();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Image#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see bstrap.Image#getAlt()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alt();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Image#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see bstrap.Image#getTitle()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Title();

	/**
	 * Returns the meta object for class '{@link bstrap.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see bstrap.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.TextElement#getTextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Content</em>'.
	 * @see bstrap.TextElement#getTextContent()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_TextContent();

	/**
	 * Returns the meta object for class '{@link bstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see bstrap.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link bstrap.PrimaryButton <em>Primary Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Button</em>'.
	 * @see bstrap.PrimaryButton
	 * @generated
	 */
	EClass getPrimaryButton();

	/**
	 * Returns the meta object for class '{@link bstrap.SecondaryButton <em>Secondary Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Button</em>'.
	 * @see bstrap.SecondaryButton
	 * @generated
	 */
	EClass getSecondaryButton();

	/**
	 * Returns the meta object for class '{@link bstrap.SuccessButton <em>Success Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Button</em>'.
	 * @see bstrap.SuccessButton
	 * @generated
	 */
	EClass getSuccessButton();

	/**
	 * Returns the meta object for class '{@link bstrap.InfoButton <em>Info Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Button</em>'.
	 * @see bstrap.InfoButton
	 * @generated
	 */
	EClass getInfoButton();

	/**
	 * Returns the meta object for class '{@link bstrap.WarningButton <em>Warning Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning Button</em>'.
	 * @see bstrap.WarningButton
	 * @generated
	 */
	EClass getWarningButton();

	/**
	 * Returns the meta object for class '{@link bstrap.DarkButton <em>Dark Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dark Button</em>'.
	 * @see bstrap.DarkButton
	 * @generated
	 */
	EClass getDarkButton();

	/**
	 * Returns the meta object for class '{@link bstrap.LightButton <em>Light Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Button</em>'.
	 * @see bstrap.LightButton
	 * @generated
	 */
	EClass getLightButton();

	/**
	 * Returns the meta object for class '{@link bstrap.LinkButton <em>Link Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Button</em>'.
	 * @see bstrap.LinkButton
	 * @generated
	 */
	EClass getLinkButton();

	/**
	 * Returns the meta object for class '{@link bstrap.DangerButton <em>Danger Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Danger Button</em>'.
	 * @see bstrap.DangerButton
	 * @generated
	 */
	EClass getDangerButton();

	/**
	 * Returns the meta object for class '{@link bstrap.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Line</em>'.
	 * @see bstrap.CodeLine
	 * @generated
	 */
	EClass getCodeLine();

	/**
	 * Returns the meta object for class '{@link bstrap.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see bstrap.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.CodeBlock#getCodelines <em>Codelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codelines</em>'.
	 * @see bstrap.CodeBlock#getCodelines()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Codelines();

	/**
	 * Returns the meta object for class '{@link bstrap.BoldText <em>Bold Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold Text</em>'.
	 * @see bstrap.BoldText
	 * @generated
	 */
	EClass getBoldText();

	/**
	 * Returns the meta object for class '{@link bstrap.ItalicText <em>Italic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Text</em>'.
	 * @see bstrap.ItalicText
	 * @generated
	 */
	EClass getItalicText();

	/**
	 * Returns the meta object for class '{@link bstrap.UnorderedList <em>Unordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered List</em>'.
	 * @see bstrap.UnorderedList
	 * @generated
	 */
	EClass getUnorderedList();

	/**
	 * Returns the meta object for class '{@link bstrap.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see bstrap.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for class '{@link bstrap.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see bstrap.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.List#getListElements <em>List Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Elements</em>'.
	 * @see bstrap.List#getListElements()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ListElements();

	/**
	 * Returns the meta object for class '{@link bstrap.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Quote</em>'.
	 * @see bstrap.BlockQuote
	 * @generated
	 */
	EClass getBlockQuote();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.BlockQuote#getQuotes <em>Quotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quotes</em>'.
	 * @see bstrap.BlockQuote#getQuotes()
	 * @see #getBlockQuote()
	 * @generated
	 */
	EReference getBlockQuote_Quotes();

	/**
	 * Returns the meta object for class '{@link bstrap.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see bstrap.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for class '{@link bstrap.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see bstrap.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link bstrap.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see bstrap.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link bstrap.Title#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see bstrap.Title#getLevel()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.Title#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see bstrap.Title#getContents()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Contents();

	/**
	 * Returns the meta object for class '{@link bstrap.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see bstrap.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link bstrap.Paragraph#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see bstrap.Paragraph#getContents()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Contents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BstrapFactory getBstrapFactory();

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
		 * The meta object literal for the '{@link bstrap.impl.SiteRootImpl <em>Site Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.SiteRootImpl
		 * @see bstrap.impl.BstrapPackageImpl#getSiteRoot()
		 * @generated
		 */
		EClass SITE_ROOT = eINSTANCE.getSiteRoot();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_ROOT__PAGES = eINSTANCE.getSiteRoot_Pages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_ROOT__NAME = eINSTANCE.getSiteRoot_Name();

		/**
		 * The meta object literal for the '{@link bstrap.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.PageImpl
		 * @see bstrap.impl.BstrapPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ELEMENTS = eINSTANCE.getPage_Elements();

		/**
		 * The meta object literal for the '{@link bstrap.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.ElementImpl
		 * @see bstrap.impl.BstrapPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASSES = eINSTANCE.getElement_Classes();

		/**
		 * The meta object literal for the '{@link bstrap.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.ButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__TARGET = eINSTANCE.getButton_Target();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__SIZE = eINSTANCE.getButton_Size();

		/**
		 * The meta object literal for the '<em><b>Is Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IS_OUTLINE = eINSTANCE.getButton_IsOutline();

		/**
		 * The meta object literal for the '<em><b>Is Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IS_ENABLE = eINSTANCE.getButton_IsEnable();

		/**
		 * The meta object literal for the '<em><b>Is Spinner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IS_SPINNER = eINSTANCE.getButton_IsSpinner();

		/**
		 * The meta object literal for the '<em><b>Is Block Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IS_BLOCK_BUTTON = eINSTANCE.getButton_IsBlockButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.ButtonGroupImpl <em>Button Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.ButtonGroupImpl
		 * @see bstrap.impl.BstrapPackageImpl#getButtonGroup()
		 * @generated
		 */
		EClass BUTTON_GROUP = eINSTANCE.getButtonGroup();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_GROUP__BUTTONS = eINSTANCE.getButtonGroup_Buttons();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_GROUP__SIZE = eINSTANCE.getButtonGroup_Size();

		/**
		 * The meta object literal for the '<em><b>Is Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_GROUP__IS_VERTICAL = eINSTANCE.getButtonGroup_IsVertical();

		/**
		 * The meta object literal for the '{@link bstrap.impl.NavbarImpl <em>Navbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.NavbarImpl
		 * @see bstrap.impl.BstrapPackageImpl#getNavbar()
		 * @generated
		 */
		EClass NAVBAR = eINSTANCE.getNavbar();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVBAR__LINKS = eINSTANCE.getNavbar_Links();

		/**
		 * The meta object literal for the '<em><b>Image Brand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVBAR__IMAGE_BRAND = eINSTANCE.getNavbar_ImageBrand();

		/**
		 * The meta object literal for the '{@link bstrap.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.LinkImpl
		 * @see bstrap.impl.BstrapPackageImpl#getLink()
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

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TITLE = eINSTANCE.getLink_Title();

		/**
		 * The meta object literal for the '{@link bstrap.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.ImageImpl
		 * @see bstrap.impl.BstrapPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__LINK = eINSTANCE.getImage_Link();

		/**
		 * The meta object literal for the '<em><b>Img Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__IMG_SRC = eINSTANCE.getImage_ImgSrc();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALT = eINSTANCE.getImage_Alt();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TITLE = eINSTANCE.getImage_Title();

		/**
		 * The meta object literal for the '{@link bstrap.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.TextElementImpl
		 * @see bstrap.impl.BstrapPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Text Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT_CONTENT = eINSTANCE.getTextElement_TextContent();

		/**
		 * The meta object literal for the '{@link bstrap.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.TextImpl
		 * @see bstrap.impl.BstrapPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link bstrap.impl.PrimaryButtonImpl <em>Primary Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.PrimaryButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getPrimaryButton()
		 * @generated
		 */
		EClass PRIMARY_BUTTON = eINSTANCE.getPrimaryButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.SecondaryButtonImpl <em>Secondary Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.SecondaryButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getSecondaryButton()
		 * @generated
		 */
		EClass SECONDARY_BUTTON = eINSTANCE.getSecondaryButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.SuccessButtonImpl <em>Success Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.SuccessButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getSuccessButton()
		 * @generated
		 */
		EClass SUCCESS_BUTTON = eINSTANCE.getSuccessButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.InfoButtonImpl <em>Info Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.InfoButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getInfoButton()
		 * @generated
		 */
		EClass INFO_BUTTON = eINSTANCE.getInfoButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.WarningButtonImpl <em>Warning Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.WarningButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getWarningButton()
		 * @generated
		 */
		EClass WARNING_BUTTON = eINSTANCE.getWarningButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.DarkButtonImpl <em>Dark Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.DarkButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getDarkButton()
		 * @generated
		 */
		EClass DARK_BUTTON = eINSTANCE.getDarkButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.LightButtonImpl <em>Light Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.LightButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getLightButton()
		 * @generated
		 */
		EClass LIGHT_BUTTON = eINSTANCE.getLightButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.LinkButtonImpl <em>Link Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.LinkButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getLinkButton()
		 * @generated
		 */
		EClass LINK_BUTTON = eINSTANCE.getLinkButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.DangerButtonImpl <em>Danger Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.DangerButtonImpl
		 * @see bstrap.impl.BstrapPackageImpl#getDangerButton()
		 * @generated
		 */
		EClass DANGER_BUTTON = eINSTANCE.getDangerButton();

		/**
		 * The meta object literal for the '{@link bstrap.impl.CodeLineImpl <em>Code Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.CodeLineImpl
		 * @see bstrap.impl.BstrapPackageImpl#getCodeLine()
		 * @generated
		 */
		EClass CODE_LINE = eINSTANCE.getCodeLine();

		/**
		 * The meta object literal for the '{@link bstrap.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.CodeBlockImpl
		 * @see bstrap.impl.BstrapPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Codelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__CODELINES = eINSTANCE.getCodeBlock_Codelines();

		/**
		 * The meta object literal for the '{@link bstrap.impl.BoldTextImpl <em>Bold Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.BoldTextImpl
		 * @see bstrap.impl.BstrapPackageImpl#getBoldText()
		 * @generated
		 */
		EClass BOLD_TEXT = eINSTANCE.getBoldText();

		/**
		 * The meta object literal for the '{@link bstrap.impl.ItalicTextImpl <em>Italic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.ItalicTextImpl
		 * @see bstrap.impl.BstrapPackageImpl#getItalicText()
		 * @generated
		 */
		EClass ITALIC_TEXT = eINSTANCE.getItalicText();

		/**
		 * The meta object literal for the '{@link bstrap.impl.UnorderedListImpl <em>Unordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.UnorderedListImpl
		 * @see bstrap.impl.BstrapPackageImpl#getUnorderedList()
		 * @generated
		 */
		EClass UNORDERED_LIST = eINSTANCE.getUnorderedList();

		/**
		 * The meta object literal for the '{@link bstrap.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.OrderedListImpl
		 * @see bstrap.impl.BstrapPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '{@link bstrap.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.ListImpl
		 * @see bstrap.impl.BstrapPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>List Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__LIST_ELEMENTS = eINSTANCE.getList_ListElements();

		/**
		 * The meta object literal for the '{@link bstrap.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.BlockQuoteImpl
		 * @see bstrap.impl.BstrapPackageImpl#getBlockQuote()
		 * @generated
		 */
		EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

		/**
		 * The meta object literal for the '<em><b>Quotes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_QUOTE__QUOTES = eINSTANCE.getBlockQuote_Quotes();

		/**
		 * The meta object literal for the '{@link bstrap.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.LineImpl
		 * @see bstrap.impl.BstrapPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '{@link bstrap.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.CodeImpl
		 * @see bstrap.impl.BstrapPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link bstrap.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.TitleImpl
		 * @see bstrap.impl.BstrapPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__LEVEL = eINSTANCE.getTitle_Level();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__CONTENTS = eINSTANCE.getTitle_Contents();

		/**
		 * The meta object literal for the '{@link bstrap.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bstrap.impl.ParagraphImpl
		 * @see bstrap.impl.BstrapPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__CONTENTS = eINSTANCE.getParagraph_Contents();

	}

} //BstrapPackage
