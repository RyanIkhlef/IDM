/**
 */
package website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.Button#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getButton()
 * @model
 * @generated
 */
public interface Button extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Link)
	 * @see website.WebsitePackage#getButton_Link()
	 * @model containment="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link website.Button#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // Button
