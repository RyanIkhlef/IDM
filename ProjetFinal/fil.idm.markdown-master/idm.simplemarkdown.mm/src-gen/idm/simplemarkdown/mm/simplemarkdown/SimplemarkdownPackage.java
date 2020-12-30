/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

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
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownFactory
 * @model kind="package"
 * @generated
 */
public interface SimplemarkdownPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplemarkdown";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simplemarkdown";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplemarkdown";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplemarkdownPackage eINSTANCE = idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl.init();

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement <em>List Item Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItemElement
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItemElement()
	 * @generated
	 */
	int LIST_ITEM_ELEMENT = 21;

	/**
	 * The number of structural features of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ELEMENTS = LIST_ITEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = LIST_ITEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = LIST_ITEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl <em>Text Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextContainer()
	 * @generated
	 */
	int TEXT_CONTAINER = 22;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__ELEMENTS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ELEMENTS = TEXT_CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LEVEL = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = TEXT_ELEMENT__TEXT;

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
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl <em>Strong Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getStrongEmphasis()
	 * @generated
	 */
	int STRONG_EMPHASIS = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS__TEXT = TEXT_ELEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Strong Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strong Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TEXT = TEXT_ELEMENT__TEXT;

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
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getList()
	 * @generated
	 */
	int LIST = 12;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl <em>Bullet List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletList()
	 * @generated
	 */
	int BULLET_LIST = 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST__ITEMS = LIST__ITEMS;

	/**
	 * The number of structural features of the '<em>Bullet List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bullet List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl <em>Bullet List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletListItem()
	 * @generated
	 */
	int BULLET_LIST_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM__ELEMENTS = LIST_ITEM__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Bullet List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bullet List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_LIST_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkTextElementImpl <em>Link Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkTextElementImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLinkTextElement()
	 * @generated
	 */
	int LINK_TEXT_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TEXT_ELEMENT__TEXT = TEXT_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TEXT_ELEMENT__TEXT_ELEMENTS = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TEXT_ELEMENT__URL = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TEXT_ELEMENT__TITLE = TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TEXT_ELEMENT_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Link Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TEXT_ELEMENT_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = LINK_TEXT_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT_ELEMENTS = LINK_TEXT_ELEMENT__TEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = LINK_TEXT_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = LINK_TEXT_ELEMENT__TITLE;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = LINK_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = LINK_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DOCUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 14;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ITEMS = LIST__ITEMS;

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
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedListItem()
	 * @generated
	 */
	int ORDERED_LIST_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM__ELEMENTS = LIST_ITEM__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ordered List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM_FEATURE_COUNT = LIST_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_ITEM_OPERATION_COUNT = LIST_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlockQuote()
	 * @generated
	 */
	int BLOCK_QUOTE = 16;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__CONTENTS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 17;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT = LINK_TEXT_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT_ELEMENTS = LINK_TEXT_ELEMENT__TEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = LINK_TEXT_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = LINK_TEXT_ELEMENT__TITLE;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = LINK_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = LINK_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl <em>Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getEmphasis()
	 * @generated
	 */
	int EMPHASIS = 18;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__TEXT = TEXT_ELEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 19;

	/**
	 * The feature id for the '<em><b>Codelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODELINES = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getHorizontalLine()
	 * @generated
	 */
	int HORIZONTAL_LINE = 20;

	/**
	 * The number of structural features of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl <em>Code Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl
	 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeLine()
	 * @generated
	 */
	int CODE_LINE = 24;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.Document#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Document#getContents()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Contents();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Title#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Title#getLevel()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Level();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis <em>Strong Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Emphasis</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis
	 * @generated
	 */
	EClass getStrongEmphasis();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.BulletList <em>Bullet List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bullet List</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BulletList
	 * @generated
	 */
	EClass getBulletList();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.BulletListItem <em>Bullet List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bullet List Item</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BulletListItem
	 * @generated
	 */
	EClass getBulletListItem();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.Folder#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Folder#getDocuments()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Documents();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.List#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.List#getItems()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Items();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.ListItem#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItem#getElements()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_Elements();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.OrderedListItem <em>Ordered List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List Item</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.OrderedListItem
	 * @generated
	 */
	EClass getOrderedListItem();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Quote</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BlockQuote
	 * @generated
	 */
	EClass getBlockQuote();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.BlockQuote#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.BlockQuote#getContents()
	 * @see #getBlockQuote()
	 * @generated
	 */
	EReference getBlockQuote_Contents();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.Emphasis
	 * @generated
	 */
	EClass getEmphasis();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.CodeBlock#getCodelines <em>Codelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codelines</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeBlock#getCodelines()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Codelines();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Line</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.HorizontalLine
	 * @generated
	 */
	EClass getHorizontalLine();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Element</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.ListItemElement
	 * @generated
	 */
	EClass getListItemElement();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Container</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextContainer
	 * @generated
	 */
	EClass getTextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.TextContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.TextContainer#getElements()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Elements();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.LinkTextElement <em>Link Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Text Element</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.LinkTextElement
	 * @generated
	 */
	EClass getLinkTextElement();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simplemarkdown.mm.simplemarkdown.LinkTextElement#getTextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Elements</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.LinkTextElement#getTextElements()
	 * @see #getLinkTextElement()
	 * @generated
	 */
	EReference getLinkTextElement_TextElements();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.LinkTextElement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.LinkTextElement#getUrl()
	 * @see #getLinkTextElement()
	 * @generated
	 */
	EAttribute getLinkTextElement_Url();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.LinkTextElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.LinkTextElement#getTitle()
	 * @see #getLinkTextElement()
	 * @generated
	 */
	EAttribute getLinkTextElement_Title();

	/**
	 * Returns the meta object for class '{@link idm.simplemarkdown.mm.simplemarkdown.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Line</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeLine
	 * @generated
	 */
	EClass getCodeLine();

	/**
	 * Returns the meta object for the attribute '{@link idm.simplemarkdown.mm.simplemarkdown.CodeLine#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simplemarkdown.mm.simplemarkdown.CodeLine#getText()
	 * @see #getCodeLine()
	 * @generated
	 */
	EAttribute getCodeLine_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplemarkdownFactory getSimplemarkdownFactory();

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
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.DocumentImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CONTENTS = eINSTANCE.getDocument_Contents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ParagraphImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TitleImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTitle()
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
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl <em>Strong Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.StrongEmphasisImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getStrongEmphasis()
		 * @generated
		 */
		EClass STRONG_EMPHASIS = eINSTANCE.getStrongEmphasis();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextElementImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT = eINSTANCE.getTextElement_Text();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl <em>Bullet List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletList()
		 * @generated
		 */
		EClass BULLET_LIST = eINSTANCE.getBulletList();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl <em>Bullet List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BulletListItemImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBulletListItem()
		 * @generated
		 */
		EClass BULLET_LIST_ITEM = eINSTANCE.getBulletListItem();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.FolderImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__DOCUMENTS = eINSTANCE.getFolder_Documents();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITEMS = eINSTANCE.getList_Items();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ListItemImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__ELEMENTS = eINSTANCE.getListItem_Elements();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.OrderedListItemImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getOrderedListItem()
		 * @generated
		 */
		EClass ORDERED_LIST_ITEM = eINSTANCE.getOrderedListItem();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.BlockQuoteImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getBlockQuote()
		 * @generated
		 */
		EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_QUOTE__CONTENTS = eINSTANCE.getBlockQuote_Contents();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.ImageImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl <em>Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.EmphasisImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getEmphasis()
		 * @generated
		 */
		EClass EMPHASIS = eINSTANCE.getEmphasis();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeBlockImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeBlock()
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
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.HorizontalLineImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getHorizontalLine()
		 * @generated
		 */
		EClass HORIZONTAL_LINE = eINSTANCE.getHorizontalLine();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.ListItemElement <em>List Item Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.ListItemElement
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getListItemElement()
		 * @generated
		 */
		EClass LIST_ITEM_ELEMENT = eINSTANCE.getListItemElement();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl <em>Text Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.TextContainerImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getTextContainer()
		 * @generated
		 */
		EClass TEXT_CONTAINER = eINSTANCE.getTextContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__ELEMENTS = eINSTANCE.getTextContainer_Elements();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.LinkTextElementImpl <em>Link Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.LinkTextElementImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getLinkTextElement()
		 * @generated
		 */
		EClass LINK_TEXT_ELEMENT = eINSTANCE.getLinkTextElement();

		/**
		 * The meta object literal for the '<em><b>Text Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TEXT_ELEMENT__TEXT_ELEMENTS = eINSTANCE.getLinkTextElement_TextElements();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TEXT_ELEMENT__URL = eINSTANCE.getLinkTextElement_Url();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TEXT_ELEMENT__TITLE = eINSTANCE.getLinkTextElement_Title();

		/**
		 * The meta object literal for the '{@link idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl <em>Code Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.CodeLineImpl
		 * @see idm.simplemarkdown.mm.simplemarkdown.impl.SimplemarkdownPackageImpl#getCodeLine()
		 * @generated
		 */
		EClass CODE_LINE = eINSTANCE.getCodeLine();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LINE__TEXT = eINSTANCE.getCodeLine_Text();

	}

} //SimplemarkdownPackage
