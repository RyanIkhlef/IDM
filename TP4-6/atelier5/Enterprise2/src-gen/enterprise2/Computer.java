/**
 */
package enterprise2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.Computer#getName <em>Name</em>}</li>
 *   <li>{@link enterprise2.Computer#getUsers <em>Users</em>}</li>
 *   <li>{@link enterprise2.Computer#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see enterprise2.Enterprise2Package#getComputer()
 * @model
 * @generated
 */
public interface Computer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enterprise2.Enterprise2Package#getComputer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enterprise2.Computer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link enterprise2.Employe}.
	 * It is bidirectional and its opposite is '{@link enterprise2.Employe#getAccessibleComputers <em>Accessible Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see enterprise2.Enterprise2Package#getComputer_Users()
	 * @see enterprise2.Employe#getAccessibleComputers
	 * @model opposite="AccessibleComputers"
	 * @generated
	 */
	EList<Employe> getUsers();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link enterprise2.DesktopRoom#getComputersAvailable <em>Computers Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(DesktopRoom)
	 * @see enterprise2.Enterprise2Package#getComputer_Room()
	 * @see enterprise2.DesktopRoom#getComputersAvailable
	 * @model opposite="computersAvailable"
	 * @generated
	 */
	DesktopRoom getRoom();

	/**
	 * Sets the value of the '{@link enterprise2.Computer#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(DesktopRoom value);

} // Computer
