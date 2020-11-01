/**
 */
package enterprise2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desktop Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.DesktopRoom#getOccupiers <em>Occupiers</em>}</li>
 *   <li>{@link enterprise2.DesktopRoom#getComputersAvailable <em>Computers Available</em>}</li>
 * </ul>
 *
 * @see enterprise2.Enterprise2Package#getDesktopRoom()
 * @model
 * @generated
 */
public interface DesktopRoom extends Room {
	/**
	 * Returns the value of the '<em><b>Occupiers</b></em>' reference list.
	 * The list contents are of type {@link enterprise2.Employe}.
	 * It is bidirectional and its opposite is '{@link enterprise2.Employe#getDesktops <em>Desktops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupiers</em>' reference list.
	 * @see enterprise2.Enterprise2Package#getDesktopRoom_Occupiers()
	 * @see enterprise2.Employe#getDesktops
	 * @model opposite="desktops"
	 * @generated
	 */
	EList<Employe> getOccupiers();

	/**
	 * Returns the value of the '<em><b>Computers Available</b></em>' reference list.
	 * The list contents are of type {@link enterprise2.Computer}.
	 * It is bidirectional and its opposite is '{@link enterprise2.Computer#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computers Available</em>' reference list.
	 * @see enterprise2.Enterprise2Package#getDesktopRoom_ComputersAvailable()
	 * @see enterprise2.Computer#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Computer> getComputersAvailable();

} // DesktopRoom
