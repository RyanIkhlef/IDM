/**
 */
package bstrap.impl;

import bstrap.*;

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
public class BstrapFactoryImpl extends EFactoryImpl implements BstrapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BstrapFactory init() {
		try {
			BstrapFactory theBstrapFactory = (BstrapFactory) EPackage.Registry.INSTANCE
					.getEFactory(BstrapPackage.eNS_URI);
			if (theBstrapFactory != null) {
				return theBstrapFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BstrapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BstrapFactoryImpl() {
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
		case BstrapPackage.SITE_ROOT:
			return createSiteRoot();
		case BstrapPackage.PAGE:
			return createPage();
		case BstrapPackage.BUTTON:
			return createButton();
		case BstrapPackage.BUTTON_GROUP:
			return createButtonGroup();
		case BstrapPackage.NAVBAR:
			return createNavbar();
		case BstrapPackage.LINK:
			return createLink();
		case BstrapPackage.IMAGE:
			return createImage();
		case BstrapPackage.TITLE:
			return createTitle();
		case BstrapPackage.PARAGRAPH:
			return createParagraph();
		case BstrapPackage.TEXT:
			return createText();
		case BstrapPackage.PRIMARY_BUTTON:
			return createPrimaryButton();
		case BstrapPackage.SECONDARY_BUTTON:
			return createSecondaryButton();
		case BstrapPackage.SUCCESS_BUTTON:
			return createSuccessButton();
		case BstrapPackage.INFO_BUTTON:
			return createInfoButton();
		case BstrapPackage.WARNING_BUTTON:
			return createWarningButton();
		case BstrapPackage.DARK_BUTTON:
			return createDarkButton();
		case BstrapPackage.LIGHT_BUTTON:
			return createLightButton();
		case BstrapPackage.LINK_BUTTON:
			return createLinkButton();
		case BstrapPackage.DANGER_BUTTON:
			return createDangerButton();
		case BstrapPackage.CODE_LINE:
			return createCodeLine();
		case BstrapPackage.CODE_BLOCK:
			return createCodeBlock();
		case BstrapPackage.BOLD_TEXT:
			return createBoldText();
		case BstrapPackage.ITALIC_TEXT:
			return createItalicText();
		case BstrapPackage.UNORDERED_LIST:
			return createUnorderedList();
		case BstrapPackage.ORDERED_LIST:
			return createOrderedList();
		case BstrapPackage.BLOCK_QUOTE:
			return createBlockQuote();
		case BstrapPackage.LINE:
			return createLine();
		case BstrapPackage.CODE:
			return createCode();
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
	public ButtonGroup createButtonGroup() {
		ButtonGroupImpl buttonGroup = new ButtonGroupImpl();
		return buttonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navbar createNavbar() {
		NavbarImpl navbar = new NavbarImpl();
		return navbar;
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
	public PrimaryButton createPrimaryButton() {
		PrimaryButtonImpl primaryButton = new PrimaryButtonImpl();
		return primaryButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondaryButton createSecondaryButton() {
		SecondaryButtonImpl secondaryButton = new SecondaryButtonImpl();
		return secondaryButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessButton createSuccessButton() {
		SuccessButtonImpl successButton = new SuccessButtonImpl();
		return successButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfoButton createInfoButton() {
		InfoButtonImpl infoButton = new InfoButtonImpl();
		return infoButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WarningButton createWarningButton() {
		WarningButtonImpl warningButton = new WarningButtonImpl();
		return warningButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DarkButton createDarkButton() {
		DarkButtonImpl darkButton = new DarkButtonImpl();
		return darkButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightButton createLightButton() {
		LightButtonImpl lightButton = new LightButtonImpl();
		return lightButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkButton createLinkButton() {
		LinkButtonImpl linkButton = new LinkButtonImpl();
		return linkButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DangerButton createDangerButton() {
		DangerButtonImpl dangerButton = new DangerButtonImpl();
		return dangerButton;
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
	public BoldText createBoldText() {
		BoldTextImpl boldText = new BoldTextImpl();
		return boldText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItalicText createItalicText() {
		ItalicTextImpl italicText = new ItalicTextImpl();
		return italicText;
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
	public BstrapPackage getBstrapPackage() {
		return (BstrapPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BstrapPackage getPackage() {
		return BstrapPackage.eINSTANCE;
	}

} //BstrapFactoryImpl
