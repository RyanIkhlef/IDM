/**
 */
package bal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.BAL#getLibrary <em>Library</em>}</li>
 *   <li>{@link bal.BAL#getMembers <em>Members</em>}</li>
 *   <li>{@link bal.BAL#getUsers <em>Users</em>}</li>
 *   <li>{@link bal.BAL#getLevels <em>Levels</em>}</li>
 *   <li>{@link bal.BAL#getCommand <em>Command</em>}</li>
 *   <li>{@link bal.BAL#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getBAL()
 * @model
 * @generated
 */
public interface BAL extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(Library)
	 * @see bal.BalPackage#getBAL_Library()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link bal.BAL#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference.
	 * @see #setMembers(Members)
	 * @see bal.BalPackage#getBAL_Members()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Members getMembers();

	/**
	 * Sets the value of the '{@link bal.BAL#getMembers <em>Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Members</em>' containment reference.
	 * @see #getMembers()
	 * @generated
	 */
	void setMembers(Members value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link bal.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see bal.BalPackage#getBAL_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link bal.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see bal.BalPackage#getBAL_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level> getLevels();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link bal.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see bal.BalPackage#getBAL_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link bal.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see bal.BalPackage#getBAL_Articles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticles();

} // BAL
