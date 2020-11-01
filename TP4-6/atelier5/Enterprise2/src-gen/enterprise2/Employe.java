/**
 */
package enterprise2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.Employe#getDesktops <em>Desktops</em>}</li>
 *   <li>{@link enterprise2.Employe#getName <em>Name</em>}</li>
 *   <li>{@link enterprise2.Employe#getSurname <em>Surname</em>}</li>
 *   <li>{@link enterprise2.Employe#getAccessibleComputers <em>Accessible Computers</em>}</li>
 * </ul>
 *
 * @see enterprise2.Enterprise2Package#getEmploye()
 * @model
 * @generated
 */
public interface Employe extends EObject {
	/**
	 * Returns the value of the '<em><b>Desktops</b></em>' reference list.
	 * The list contents are of type {@link enterprise2.DesktopRoom}.
	 * It is bidirectional and its opposite is '{@link enterprise2.DesktopRoom#getOccupiers <em>Occupiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desktops</em>' reference list.
	 * @see enterprise2.Enterprise2Package#getEmploye_Desktops()
	 * @see enterprise2.DesktopRoom#getOccupiers
	 * @model opposite="occupiers"
	 * @generated
	 */
	EList<DesktopRoom> getDesktops();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enterprise2.Enterprise2Package#getEmploye_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enterprise2.Employe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see enterprise2.Enterprise2Package#getEmploye_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link enterprise2.Employe#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Accessible Computers</b></em>' reference list.
	 * The list contents are of type {@link enterprise2.Computer}.
	 * It is bidirectional and its opposite is '{@link enterprise2.Computer#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Computers</em>' reference list.
	 * @see enterprise2.Enterprise2Package#getEmploye_AccessibleComputers()
	 * @see enterprise2.Computer#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<Computer> getAccessibleComputers();

} // Employe
