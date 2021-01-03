/**
 */
package bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bstrap.Image#getLink <em>Link</em>}</li>
 *   <li>{@link bstrap.Image#getImgSrc <em>Img Src</em>}</li>
 *   <li>{@link bstrap.Image#getAlt <em>Alt</em>}</li>
 *   <li>{@link bstrap.Image#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends Element {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Link)
	 * @see bstrap.BstrapPackage#getImage_Link()
	 * @model containment="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link bstrap.Image#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * Returns the value of the '<em><b>Img Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img Src</em>' attribute.
	 * @see #setImgSrc(String)
	 * @see bstrap.BstrapPackage#getImage_ImgSrc()
	 * @model
	 * @generated
	 */
	String getImgSrc();

	/**
	 * Sets the value of the '{@link bstrap.Image#getImgSrc <em>Img Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img Src</em>' attribute.
	 * @see #getImgSrc()
	 * @generated
	 */
	void setImgSrc(String value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see bstrap.BstrapPackage#getImage_Alt()
	 * @model
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link bstrap.Image#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see bstrap.BstrapPackage#getImage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link bstrap.Image#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Image
