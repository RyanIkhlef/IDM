/**
 */
package website;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.Section#getHtmlElements <em>Html Elements</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Html Elements</b></em>' containment reference list.
	 * The list contents are of type {@link website.HTMLElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Elements</em>' containment reference list.
	 * @see website.WebsitePackage#getSection_HtmlElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTMLElement> getHtmlElements();

} // Section
