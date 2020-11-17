/**
 */
package website.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import website.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see website.WebsitePackage
 * @generated
 */
public class WebsiteValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebsiteValidator INSTANCE = new WebsiteValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "website";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return WebsitePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case WebsitePackage.SITE:
			return validateSite((Site) value, diagnostics, context);
		case WebsitePackage.BODY:
			return validateBody((Body) value, diagnostics, context);
		case WebsitePackage.PARAGRAPH:
			return validateParagraph((Paragraph) value, diagnostics, context);
		case WebsitePackage.SECTION:
			return validateSection((Section) value, diagnostics, context);
		case WebsitePackage.BUTTON:
			return validateButton((Button) value, diagnostics, context);
		case WebsitePackage.IMAGE:
			return validateImage((Image) value, diagnostics, context);
		case WebsitePackage.LINK:
			return validateLink((Link) value, diagnostics, context);
		case WebsitePackage.HTML_ELEMENT:
			return validateHTMLElement((HTMLElement) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSite(Site site, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(site, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBody(Body body, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(body, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraph(Paragraph paragraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paragraph, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idIsRequire(paragraph, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idMustBeUnique(paragraph, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(section, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idIsRequire(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idMustBeUnique(section, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(button, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idIsRequire(button, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idMustBeUnique(button, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(image, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idIsRequire(image, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idMustBeUnique(image, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(link, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idIsRequire(link, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idMustBeUnique(link, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTMLElement(HTMLElement htmlElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(htmlElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idIsRequire(htmlElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateHTMLElement_idMustBeUnique(htmlElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the idIsRequire constraint of '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTML_ELEMENT__ID_IS_REQUIRE__EEXPRESSION = "\n"
			+ "\t\t\tHTMLElement.allInstances()->select(elem : HTMLElement | elem.id = '')->isEmpty()";

	/**
	 * Validates the idIsRequire constraint of '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTMLElement_idIsRequire(HTMLElement htmlElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(WebsitePackage.Literals.HTML_ELEMENT, htmlElement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "idIsRequire",
				HTML_ELEMENT__ID_IS_REQUIRE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the idMustBeUnique constraint of '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTML_ELEMENT__ID_MUST_BE_UNIQUE__EEXPRESSION = "\n"
			+ "\t\t\tHTMLElement.allInstances()->select(elem : HTMLElement | elem <> self and elem.id = self.id)->isEmpty()";

	/**
	 * Validates the idMustBeUnique constraint of '<em>HTML Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTMLElement_idMustBeUnique(HTMLElement htmlElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(WebsitePackage.Literals.HTML_ELEMENT, htmlElement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "idMustBeUnique",
				HTML_ELEMENT__ID_MUST_BE_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WebsiteValidator
