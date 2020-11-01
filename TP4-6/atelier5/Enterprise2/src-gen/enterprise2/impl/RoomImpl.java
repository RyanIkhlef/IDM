/**
 */
package enterprise2.impl;

import enterprise2.Enterprise2Package;
import enterprise2.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link enterprise2.impl.RoomImpl#getStageNumber <em>Stage Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStageNumber() <em>Stage Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int STAGE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStageNumber() <em>Stage Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageNumber()
	 * @generated
	 * @ordered
	 */
	protected int stageNumber = STAGE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Enterprise2Package.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Enterprise2Package.ROOM__ROOM_NUMBER, oldRoomNumber,
					roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStageNumber() {
		return stageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStageNumber(int newStageNumber) {
		int oldStageNumber = stageNumber;
		stageNumber = newStageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Enterprise2Package.ROOM__STAGE_NUMBER, oldStageNumber,
					stageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Enterprise2Package.ROOM__ROOM_NUMBER:
			return getRoomNumber();
		case Enterprise2Package.ROOM__STAGE_NUMBER:
			return getStageNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Enterprise2Package.ROOM__ROOM_NUMBER:
			setRoomNumber((Integer) newValue);
			return;
		case Enterprise2Package.ROOM__STAGE_NUMBER:
			setStageNumber((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Enterprise2Package.ROOM__ROOM_NUMBER:
			setRoomNumber(ROOM_NUMBER_EDEFAULT);
			return;
		case Enterprise2Package.ROOM__STAGE_NUMBER:
			setStageNumber(STAGE_NUMBER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Enterprise2Package.ROOM__ROOM_NUMBER:
			return roomNumber != ROOM_NUMBER_EDEFAULT;
		case Enterprise2Package.ROOM__STAGE_NUMBER:
			return stageNumber != STAGE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", stageNumber: ");
		result.append(stageNumber);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
