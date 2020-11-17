/**
 */
package website;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.Body#getHtmlElements <em>Html Elements</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>Html Elements</b></em>' containment reference list.
	 * The list contents are of type {@link website.HTMLElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Elements</em>' containment reference list.
	 * @see website.WebsitePackage#getBody_HtmlElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTMLElement> getHtmlElements();

} // Body
