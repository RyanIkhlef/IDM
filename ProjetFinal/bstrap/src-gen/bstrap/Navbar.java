/**
 */
package bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bstrap.Navbar#getLinks <em>Links</em>}</li>
 *   <li>{@link bstrap.Navbar#getImageBrand <em>Image Brand</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getNavbar()
 * @model
 * @generated
 */
public interface Navbar extends TextElement {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link bstrap.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see bstrap.BstrapPackage#getNavbar_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Image Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Brand</em>' containment reference.
	 * @see #setImageBrand(Image)
	 * @see bstrap.BstrapPackage#getNavbar_ImageBrand()
	 * @model containment="true"
	 * @generated
	 */
	Image getImageBrand();

	/**
	 * Sets the value of the '{@link bstrap.Navbar#getImageBrand <em>Image Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Brand</em>' containment reference.
	 * @see #getImageBrand()
	 * @generated
	 */
	void setImageBrand(Image value);

} // Navbar
