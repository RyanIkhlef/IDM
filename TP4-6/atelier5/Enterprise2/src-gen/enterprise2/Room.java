/**
 */
package enterprise2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link enterprise2.Room#getStageNumber <em>Stage Number</em>}</li>
 * </ul>
 *
 * @see enterprise2.Enterprise2Package#getRoom()
 * @model abstract="true"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see enterprise2.Enterprise2Package#getRoom_RoomNumber()
	 * @model
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link enterprise2.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Stage Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage Number</em>' attribute.
	 * @see #setStageNumber(int)
	 * @see enterprise2.Enterprise2Package#getRoom_StageNumber()
	 * @model
	 * @generated
	 */
	int getStageNumber();

	/**
	 * Sets the value of the '{@link enterprise2.Room#getStageNumber <em>Stage Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage Number</em>' attribute.
	 * @see #getStageNumber()
	 * @generated
	 */
	void setStageNumber(int value);

} // Room
