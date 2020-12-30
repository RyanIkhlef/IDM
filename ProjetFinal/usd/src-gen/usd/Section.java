/**
 */
package usd;

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
 *   <li>{@link usd.Section#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends Element {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link usd.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see usd.UsdPackage#getSection_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getContents();

} // Section
