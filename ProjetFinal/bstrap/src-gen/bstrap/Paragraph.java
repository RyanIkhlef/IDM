/**
 */
package bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bstrap.Paragraph#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends Element {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link bstrap.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see bstrap.BstrapPackage#getParagraph_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getContents();

} // Paragraph
