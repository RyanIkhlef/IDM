/**
 */
package usd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.CodeLine#getTextContent <em>Text Content</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getCodeLine()
 * @model
 * @generated
 */
public interface CodeLine extends Element {
	/**
	 * Returns the value of the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Content</em>' attribute.
	 * @see #setTextContent(String)
	 * @see usd.UsdPackage#getCodeLine_TextContent()
	 * @model
	 * @generated
	 */
	String getTextContent();

	/**
	 * Sets the value of the '{@link usd.CodeLine#getTextContent <em>Text Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Content</em>' attribute.
	 * @see #getTextContent()
	 * @generated
	 */
	void setTextContent(String value);

} // CodeLine
