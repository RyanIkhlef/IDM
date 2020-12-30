/**
 */
package usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.BlockQuote#getQuotes <em>Quotes</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getBlockQuote()
 * @model
 * @generated
 */
public interface BlockQuote extends Element {
	/**
	 * Returns the value of the '<em><b>Quotes</b></em>' containment reference list.
	 * The list contents are of type {@link usd.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quotes</em>' containment reference list.
	 * @see usd.UsdPackage#getBlockQuote_Quotes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getQuotes();

} // BlockQuote
