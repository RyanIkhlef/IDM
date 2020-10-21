/**
 */
package enterprise2.impl;

import enterprise2.Computer;
import enterprise2.DesktopRoom;
import enterprise2.Employe;
import enterprise2.Enterprise2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.impl.ComputerImpl#getName <em>Name</em>}</li>
 *   <li>{@link enterprise2.impl.ComputerImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link enterprise2.impl.ComputerImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerImpl extends MinimalEObjectImpl.Container implements Computer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> users;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected DesktopRoom room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Enterprise2Package.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Enterprise2Package.COMPUTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getUsers() {
		if (users == null) {
			users = new EObjectWithInverseResolvingEList.ManyInverse<Employe>(Employe.class, this,
					Enterprise2Package.COMPUTER__USERS, Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopRoom getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject) room;
			room = (DesktopRoom) eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Enterprise2Package.COMPUTER__ROOM,
							oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopRoom basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(DesktopRoom newRoom, NotificationChain msgs) {
		DesktopRoom oldRoom = room;
		room = newRoom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Enterprise2Package.COMPUTER__ROOM, oldRoom, newRoom);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(DesktopRoom newRoom) {
		if (newRoom != room) {
			NotificationChain msgs = null;
			if (room != null)
				msgs = ((InternalEObject) room).eInverseRemove(this,
						Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE, DesktopRoom.class, msgs);
			if (newRoom != null)
				msgs = ((InternalEObject) newRoom).eInverseAdd(this,
						Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE, DesktopRoom.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Enterprise2Package.COMPUTER__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Enterprise2Package.COMPUTER__USERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsers()).basicAdd(otherEnd, msgs);
		case Enterprise2Package.COMPUTER__ROOM:
			if (room != null)
				msgs = ((InternalEObject) room).eInverseRemove(this,
						Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE, DesktopRoom.class, msgs);
			return basicSetRoom((DesktopRoom) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Enterprise2Package.COMPUTER__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
		case Enterprise2Package.COMPUTER__ROOM:
			return basicSetRoom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Enterprise2Package.COMPUTER__NAME:
			return getName();
		case Enterprise2Package.COMPUTER__USERS:
			return getUsers();
		case Enterprise2Package.COMPUTER__ROOM:
			if (resolve)
				return getRoom();
			return basicGetRoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Enterprise2Package.COMPUTER__NAME:
			setName((String) newValue);
			return;
		case Enterprise2Package.COMPUTER__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends Employe>) newValue);
			return;
		case Enterprise2Package.COMPUTER__ROOM:
			setRoom((DesktopRoom) newValue);
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
		case Enterprise2Package.COMPUTER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Enterprise2Package.COMPUTER__USERS:
			getUsers().clear();
			return;
		case Enterprise2Package.COMPUTER__ROOM:
			setRoom((DesktopRoom) null);
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
		case Enterprise2Package.COMPUTER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Enterprise2Package.COMPUTER__USERS:
			return users != null && !users.isEmpty();
		case Enterprise2Package.COMPUTER__ROOM:
			return room != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComputerImpl
