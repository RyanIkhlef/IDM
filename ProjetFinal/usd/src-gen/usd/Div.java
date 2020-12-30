/**
 */
package usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.Div#getDivContents <em>Div Contents</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getDiv()
 * @model
 * @generated
 */
public interface Div extends Element {
	/**
	 * Returns the value of the '<em><b>Div Contents</b></em>' containment reference list.
	 * The list contents are of type {@link usd.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div Contents</em>' containment reference list.
	 * @see usd.UsdPackage#getDiv_DivContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getDivContents();

} // Div
