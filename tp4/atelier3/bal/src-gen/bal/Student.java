/**
 */
package bal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.Student#getCommand <em>Command</em>}</li>
 *   <li>{@link bal.Student#getParent <em>Parent</em>}</li>
 *   <li>{@link bal.Student#getPayments <em>Payments</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference list.
	 * The list contents are of type {@link bal.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference list.
	 * @see bal.BalPackage#getStudent_Command()
	 * @model
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link bal.Parent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see bal.BalPackage#getStudent_Parent()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Parent> getParent();

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' reference list.
	 * The list contents are of type {@link bal.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' reference list.
	 * @see bal.BalPackage#getStudent_Payments()
	 * @model
	 * @generated
	 */
	EList<Payment> getPayments();

} // Student
