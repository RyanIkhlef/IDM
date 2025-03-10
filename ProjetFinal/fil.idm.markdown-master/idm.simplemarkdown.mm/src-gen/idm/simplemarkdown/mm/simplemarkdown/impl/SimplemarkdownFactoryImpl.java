/**
 */
package idm.simplemarkdown.mm.simplemarkdown.impl;

import idm.simplemarkdown.mm.simplemarkdown.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplemarkdownFactoryImpl extends EFactoryImpl implements SimplemarkdownFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplemarkdownFactory init() {
		try {
			SimplemarkdownFactory theSimplemarkdownFactory = (SimplemarkdownFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimplemarkdownPackage.eNS_URI);
			if (theSimplemarkdownFactory != null) {
				return theSimplemarkdownFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplemarkdownFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemarkdownFactoryImpl() {
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
		case SimplemarkdownPackage.DOCUMENT:
			return createDocument();
		case SimplemarkdownPackage.PARAGRAPH:
			return createParagraph();
		case SimplemarkdownPackage.TITLE:
			return createTitle();
		case SimplemarkdownPackage.TEXT:
			return createText();
		case SimplemarkdownPackage.STRONG_EMPHASIS:
			return createStrongEmphasis();
		case SimplemarkdownPackage.CODE:
			return createCode();
		case SimplemarkdownPackage.BULLET_LIST:
			return createBulletList();
		case SimplemarkdownPackage.BULLET_LIST_ITEM:
			return createBulletListItem();
		case SimplemarkdownPackage.LINK:
			return createLink();
		case SimplemarkdownPackage.FOLDER:
			return createFolder();
		case SimplemarkdownPackage.ORDERED_LIST:
			return createOrderedList();
		case SimplemarkdownPackage.ORDERED_LIST_ITEM:
			return createOrderedListItem();
		case SimplemarkdownPackage.BLOCK_QUOTE:
			return createBlockQuote();
		case SimplemarkdownPackage.IMAGE:
			return createImage();
		case SimplemarkdownPackage.EMPHASIS:
			return createEmphasis();
		case SimplemarkdownPackage.CODE_BLOCK:
			return createCodeBlock();
		case SimplemarkdownPackage.HORIZONTAL_LINE:
			return createHorizontalLine();
		case SimplemarkdownPackage.CODE_LINE:
			return createCodeLine();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongEmphasis createStrongEmphasis() {
		StrongEmphasisImpl strongEmphasis = new StrongEmphasisImpl();
		return strongEmphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BulletList createBulletList() {
		BulletListImpl bulletList = new BulletListImpl();
		return bulletList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BulletListItem createBulletListItem() {
		BulletListItemImpl bulletListItem = new BulletListItemImpl();
		return bulletListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedList createOrderedList() {
		OrderedListImpl orderedList = new OrderedListImpl();
		return orderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedListItem createOrderedListItem() {
		OrderedListItemImpl orderedListItem = new OrderedListItemImpl();
		return orderedListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockQuote createBlockQuote() {
		BlockQuoteImpl blockQuote = new BlockQuoteImpl();
		return blockQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emphasis createEmphasis() {
		EmphasisImpl emphasis = new EmphasisImpl();
		return emphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HorizontalLine createHorizontalLine() {
		HorizontalLineImpl horizontalLine = new HorizontalLineImpl();
		return horizontalLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLine createCodeLine() {
		CodeLineImpl codeLine = new CodeLineImpl();
		return codeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplemarkdownPackage getSimplemarkdownPackage() {
		return (SimplemarkdownPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplemarkdownPackage getPackage() {
		return SimplemarkdownPackage.eINSTANCE;
	}

} //SimplemarkdownFactoryImpl
