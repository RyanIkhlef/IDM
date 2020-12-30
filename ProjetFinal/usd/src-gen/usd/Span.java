/**
 */
package usd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.Span#getSpanContent <em>Span Content</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getSpan()
 * @model
 * @generated
 */
public interface Span extends TextElement {
	/**
	 * Returns the value of the '<em><b>Span Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span Content</em>' containment reference.
	 * @see #setSpanContent(Element)
	 * @see usd.UsdPackage#getSpan_SpanContent()
	 * @model containment="true"
	 * @generated
	 */
	Element getSpanContent();

	/**
	 * Sets the value of the '{@link usd.Span#getSpanContent <em>Span Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span Content</em>' containment reference.
	 * @see #getSpanContent()
	 * @generated
	 */
	void setSpanContent(Element value);

} // Span
