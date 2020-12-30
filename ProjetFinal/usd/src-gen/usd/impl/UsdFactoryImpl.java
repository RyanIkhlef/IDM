/**
 */
package usd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import usd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsdFactoryImpl extends EFactoryImpl implements UsdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsdFactory init() {
		try {
			UsdFactory theUsdFactory = (UsdFactory) EPackage.Registry.INSTANCE.getEFactory(UsdPackage.eNS_URI);
			if (theUsdFactory != null) {
				return theUsdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdFactoryImpl() {
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
		case UsdPackage.SITE_ROOT:
			return createSiteRoot();
		case UsdPackage.PAGE:
			return createPage();
		case UsdPackage.PARAGRAPH:
			return createParagraph();
		case UsdPackage.TITLE:
			return createTitle();
		case UsdPackage.IMPORTANT_TEXT:
			return createImportantText();
		case UsdPackage.DIV:
			return createDiv();
		case UsdPackage.SPAN:
			return createSpan();
		case UsdPackage.UNORDERED_LIST:
			return createUnorderedList();
		case UsdPackage.ORDERED_LIST:
			return createOrderedList();
		case UsdPackage.SECTION:
			return createSection();
		case UsdPackage.LINK:
			return createLink();
		case UsdPackage.BUTTON:
			return createButton();
		case UsdPackage.EMPHASIS:
			return createEmphasis();
		case UsdPackage.TEXT:
			return createText();
		case UsdPackage.IMAGE:
			return createImage();
		case UsdPackage.CODE:
			return createCode();
		case UsdPackage.CODE_BLOCK:
			return createCodeBlock();
		case UsdPackage.CODE_LINE:
			return createCodeLine();
		case UsdPackage.BLOCK_QUOTE:
			return createBlockQuote();
		case UsdPackage.LINE:
			return createLine();
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
	public SiteRoot createSiteRoot() {
		SiteRootImpl siteRoot = new SiteRootImpl();
		return siteRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
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
	public ImportantText createImportantText() {
		ImportantTextImpl importantText = new ImportantTextImpl();
		return importantText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span createSpan() {
		SpanImpl span = new SpanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnorderedList createUnorderedList() {
		UnorderedListImpl unorderedList = new UnorderedListImpl();
		return unorderedList;
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
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
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
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
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
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsdPackage getUsdPackage() {
		return (UsdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsdPackage getPackage() {
		return UsdPackage.eINSTANCE;
	}

} //UsdFactoryImpl
