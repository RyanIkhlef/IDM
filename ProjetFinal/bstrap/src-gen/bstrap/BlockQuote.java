/**
 */
package bstrap;

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
 *   <li>{@link bstrap.BlockQuote#getQuotes <em>Quotes</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getBlockQuote()
 * @model
 * @generated
 */
public interface BlockQuote extends Element {
	/**
	 * Returns the value of the '<em><b>Quotes</b></em>' containment reference list.
	 * The list contents are of type {@link bstrap.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quotes</em>' containment reference list.
	 * @see bstrap.BstrapPackage#getBlockQuote_Quotes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getQuotes();

} // BlockQuote
