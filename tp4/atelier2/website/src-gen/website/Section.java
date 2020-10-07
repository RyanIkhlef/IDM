/**
 */
package website;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.Section#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link website.Section#getImage <em>Image</em>}</li>
 *   <li>{@link website.Section#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' containment reference list.
	 * The list contents are of type {@link website.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' containment reference list.
	 * @see website.WebsitePackage#getSection_Paragraph()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraph();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link website.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see website.WebsitePackage#getSection_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImage();

	/**
	 * Returns the value of the '<em><b>Button</b></em>' containment reference list.
	 * The list contents are of type {@link website.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' containment reference list.
	 * @see website.WebsitePackage#getSection_Button()
	 * @model containment="true"
	 * @generated
	 */
	EList<Button> getButton();

} // Section
