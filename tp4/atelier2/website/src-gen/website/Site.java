/**
 */
package website;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.Site#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link website.Body}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see website.WebsitePackage#getSite_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Body> getBody();

} // Site
