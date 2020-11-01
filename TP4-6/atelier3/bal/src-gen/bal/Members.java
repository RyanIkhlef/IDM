/**
 */
package bal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Members</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.Members#getStudents <em>Students</em>}</li>
 *   <li>{@link bal.Members#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getMembers()
 * @model
 * @generated
 */
public interface Members extends EObject {
	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.
	 * The list contents are of type {@link bal.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see bal.BalPackage#getMembers_Students()
	 * @model
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link bal.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see bal.BalPackage#getMembers_Commands()
	 * @model
	 * @generated
	 */
	EList<Command> getCommands();

} // Members
