/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.TextElement#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTextElement()
 * @model abstract="true"
 * @generated
 */
public interface TextElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTextElement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link idm.simplemarkdown.mm.simplemarkdown.TextElement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextElement
