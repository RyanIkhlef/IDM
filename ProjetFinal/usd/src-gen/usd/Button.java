/**
 */
package usd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.Button#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends TextElement {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Link)
	 * @see usd.UsdPackage#getButton_Link()
	 * @model containment="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link usd.Button#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // Button
