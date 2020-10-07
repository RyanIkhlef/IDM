/**
 */
package bal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.CommandLine#getArticle <em>Article</em>}</li>
 *   <li>{@link bal.CommandLine#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link bal.CommandLine#getBook <em>Book</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getCommandLine()
 * @model
 * @generated
 */
public interface CommandLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Article</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article</em>' reference.
	 * @see #setArticle(Article)
	 * @see bal.BalPackage#getCommandLine_Article()
	 * @model
	 * @generated
	 */
	Article getArticle();

	/**
	 * Sets the value of the '{@link bal.CommandLine#getArticle <em>Article</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article</em>' reference.
	 * @see #getArticle()
	 * @generated
	 */
	void setArticle(Article value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see bal.BalPackage#getCommandLine_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link bal.CommandLine#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' reference.
	 * @see #setBook(Book)
	 * @see bal.BalPackage#getCommandLine_Book()
	 * @model
	 * @generated
	 */
	Book getBook();

	/**
	 * Sets the value of the '{@link bal.CommandLine#getBook <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(Book value);

} // CommandLine
