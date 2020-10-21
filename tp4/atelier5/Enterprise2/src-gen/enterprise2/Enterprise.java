/**
 */
package enterprise2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.Enterprise#getRooms <em>Rooms</em>}</li>
 *   <li>{@link enterprise2.Enterprise#getEmployes <em>Employes</em>}</li>
 *   <li>{@link enterprise2.Enterprise#getComputers <em>Computers</em>}</li>
 * </ul>
 *
 * @see enterprise2.Enterprise2Package#getEnterprise()
 * @model
 * @generated
 */
public interface Enterprise extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link enterprise2.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see enterprise2.Enterprise2Package#getEnterprise_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Employes</b></em>' containment reference list.
	 * The list contents are of type {@link enterprise2.Employe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes</em>' containment reference list.
	 * @see enterprise2.Enterprise2Package#getEnterprise_Employes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employe> getEmployes();

	/**
	 * Returns the value of the '<em><b>Computers</b></em>' containment reference list.
	 * The list contents are of type {@link enterprise2.Computer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computers</em>' containment reference list.
	 * @see enterprise2.Enterprise2Package#getEnterprise_Computers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Computer> getComputers();

} // Enterprise
