/**
 */
package bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bstrap.CodeBlock#getCodelines <em>Codelines</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends Element {
	/**
	 * Returns the value of the '<em><b>Codelines</b></em>' containment reference list.
	 * The list contents are of type {@link bstrap.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codelines</em>' containment reference list.
	 * @see bstrap.BstrapPackage#getCodeBlock_Codelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getCodelines();

} // CodeBlock
