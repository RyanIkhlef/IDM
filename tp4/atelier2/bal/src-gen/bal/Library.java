/**
 */
package bal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link bal.Library#getBorrowedBooks <em>Borrowed Books</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link bal.Book}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see bal.BalPackage#getLibrary_Books()
	 * @model containment="true"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Borrowed Books</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowed Books</em>' attribute.
	 * @see #setBorrowedBooks(EList)
	 * @see bal.BalPackage#getLibrary_BorrowedBooks()
	 * @model many="false"
	 * @generated
	 */
	EList getBorrowedBooks();

	/**
	 * Sets the value of the '{@link bal.Library#getBorrowedBooks <em>Borrowed Books</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borrowed Books</em>' attribute.
	 * @see #getBorrowedBooks()
	 * @generated
	 */
	void setBorrowedBooks(EList value);

} // Library
