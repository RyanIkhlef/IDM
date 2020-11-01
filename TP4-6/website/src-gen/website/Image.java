/**
 */
package website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.Image#getImageLink <em>Image Link</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getImage()
 * @model
 * @generated
 */
public interface Image extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Image Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Link</em>' containment reference.
	 * @see #setImageLink(Link)
	 * @see website.WebsitePackage#getImage_ImageLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getImageLink();

	/**
	 * Sets the value of the '{@link website.Image#getImageLink <em>Image Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Link</em>' containment reference.
	 * @see #getImageLink()
	 * @generated
	 */
	void setImageLink(Link value);

} // Image
