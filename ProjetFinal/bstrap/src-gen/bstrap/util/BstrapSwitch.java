/**
 */
package bstrap.util;

import bstrap.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bstrap.BstrapPackage
 * @generated
 */
public class BstrapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BstrapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BstrapSwitch() {
		if (modelPackage == null) {
			modelPackage = BstrapPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BstrapPackage.SITE_ROOT: {
			SiteRoot siteRoot = (SiteRoot) theEObject;
			T result = caseSiteRoot(siteRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BUTTON: {
			Button button = (Button) theEObject;
			T result = caseButton(button);
			if (result == null)
				result = caseTextElement(button);
			if (result == null)
				result = caseElement(button);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BUTTON_GROUP: {
			ButtonGroup buttonGroup = (ButtonGroup) theEObject;
			T result = caseButtonGroup(buttonGroup);
			if (result == null)
				result = caseElement(buttonGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.NAVBAR: {
			Navbar navbar = (Navbar) theEObject;
			T result = caseNavbar(navbar);
			if (result == null)
				result = caseTextElement(navbar);
			if (result == null)
				result = caseElement(navbar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LINK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = caseTextElement(link);
			if (result == null)
				result = caseElement(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = caseElement(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEXT_ELEMENT: {
			TextElement textElement = (TextElement) theEObject;
			T result = caseTextElement(textElement);
			if (result == null)
				result = caseElement(textElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TITLE: {
			Title title = (Title) theEObject;
			T result = caseTitle(title);
			if (result == null)
				result = caseElement(title);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PARAGRAPH: {
			Paragraph paragraph = (Paragraph) theEObject;
			T result = caseParagraph(paragraph);
			if (result == null)
				result = caseElement(paragraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEXT: {
			Text text = (Text) theEObject;
			T result = caseText(text);
			if (result == null)
				result = caseTextElement(text);
			if (result == null)
				result = caseElement(text);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PRIMARY_BUTTON: {
			PrimaryButton primaryButton = (PrimaryButton) theEObject;
			T result = casePrimaryButton(primaryButton);
			if (result == null)
				result = caseButton(primaryButton);
			if (result == null)
				result = caseTextElement(primaryButton);
			if (result == null)
				result = caseElement(primaryButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.SECONDARY_BUTTON: {
			SecondaryButton secondaryButton = (SecondaryButton) theEObject;
			T result = caseSecondaryButton(secondaryButton);
			if (result == null)
				result = caseButton(secondaryButton);
			if (result == null)
				result = caseTextElement(secondaryButton);
			if (result == null)
				result = caseElement(secondaryButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.SUCCESS_BUTTON: {
			SuccessButton successButton = (SuccessButton) theEObject;
			T result = caseSuccessButton(successButton);
			if (result == null)
				result = caseButton(successButton);
			if (result == null)
				result = caseTextElement(successButton);
			if (result == null)
				result = caseElement(successButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.INFO_BUTTON: {
			InfoButton infoButton = (InfoButton) theEObject;
			T result = caseInfoButton(infoButton);
			if (result == null)
				result = caseButton(infoButton);
			if (result == null)
				result = caseTextElement(infoButton);
			if (result == null)
				result = caseElement(infoButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.WARNING_BUTTON: {
			WarningButton warningButton = (WarningButton) theEObject;
			T result = caseWarningButton(warningButton);
			if (result == null)
				result = caseButton(warningButton);
			if (result == null)
				result = caseTextElement(warningButton);
			if (result == null)
				result = caseElement(warningButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DARK_BUTTON: {
			DarkButton darkButton = (DarkButton) theEObject;
			T result = caseDarkButton(darkButton);
			if (result == null)
				result = caseButton(darkButton);
			if (result == null)
				result = caseTextElement(darkButton);
			if (result == null)
				result = caseElement(darkButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LIGHT_BUTTON: {
			LightButton lightButton = (LightButton) theEObject;
			T result = caseLightButton(lightButton);
			if (result == null)
				result = caseButton(lightButton);
			if (result == null)
				result = caseTextElement(lightButton);
			if (result == null)
				result = caseElement(lightButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LINK_BUTTON: {
			LinkButton linkButton = (LinkButton) theEObject;
			T result = caseLinkButton(linkButton);
			if (result == null)
				result = caseButton(linkButton);
			if (result == null)
				result = caseTextElement(linkButton);
			if (result == null)
				result = caseElement(linkButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DANGER_BUTTON: {
			DangerButton dangerButton = (DangerButton) theEObject;
			T result = caseDangerButton(dangerButton);
			if (result == null)
				result = caseButton(dangerButton);
			if (result == null)
				result = caseTextElement(dangerButton);
			if (result == null)
				result = caseElement(dangerButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CODE_LINE: {
			CodeLine codeLine = (CodeLine) theEObject;
			T result = caseCodeLine(codeLine);
			if (result == null)
				result = caseTextElement(codeLine);
			if (result == null)
				result = caseElement(codeLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CODE_BLOCK: {
			CodeBlock codeBlock = (CodeBlock) theEObject;
			T result = caseCodeBlock(codeBlock);
			if (result == null)
				result = caseElement(codeBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BOLD_TEXT: {
			BoldText boldText = (BoldText) theEObject;
			T result = caseBoldText(boldText);
			if (result == null)
				result = caseText(boldText);
			if (result == null)
				result = caseTextElement(boldText);
			if (result == null)
				result = caseElement(boldText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ITALIC_TEXT: {
			ItalicText italicText = (ItalicText) theEObject;
			T result = caseItalicText(italicText);
			if (result == null)
				result = caseText(italicText);
			if (result == null)
				result = caseTextElement(italicText);
			if (result == null)
				result = caseElement(italicText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.UNORDERED_LIST: {
			UnorderedList unorderedList = (UnorderedList) theEObject;
			T result = caseUnorderedList(unorderedList);
			if (result == null)
				result = caseList(unorderedList);
			if (result == null)
				result = caseElement(unorderedList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ORDERED_LIST: {
			OrderedList orderedList = (OrderedList) theEObject;
			T result = caseOrderedList(orderedList);
			if (result == null)
				result = caseList(orderedList);
			if (result == null)
				result = caseElement(orderedList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LIST: {
			List list = (List) theEObject;
			T result = caseList(list);
			if (result == null)
				result = caseElement(list);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BLOCK_QUOTE: {
			BlockQuote blockQuote = (BlockQuote) theEObject;
			T result = caseBlockQuote(blockQuote);
			if (result == null)
				result = caseElement(blockQuote);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LINE: {
			Line line = (Line) theEObject;
			T result = caseLine(line);
			if (result == null)
				result = caseElement(line);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CODE: {
			Code code = (Code) theEObject;
			T result = caseCode(code);
			if (result == null)
				result = caseTextElement(code);
			if (result == null)
				result = caseElement(code);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteRoot(SiteRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonGroup(ButtonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbar(Navbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElement(TextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryButton(PrimaryButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryButton(SecondaryButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessButton(SuccessButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoButton(InfoButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warning Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warning Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarningButton(WarningButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dark Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dark Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDarkButton(DarkButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightButton(LightButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkButton(LinkButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Danger Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Danger Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDangerButton(DangerButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLine(CodeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlock(CodeBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bold Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bold Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoldText(BoldText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicText(ItalicText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedList(UnorderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedList(OrderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Quote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Quote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockQuote(BlockQuote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BstrapSwitch
