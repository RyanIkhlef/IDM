/**
 */
package enterprise2.impl;

import enterprise2.Computer;
import enterprise2.DesktopRoom;
import enterprise2.Employe;
import enterprise2.Enterprise2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desktop Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.impl.DesktopRoomImpl#getOccupiers <em>Occupiers</em>}</li>
 *   <li>{@link enterprise2.impl.DesktopRoomImpl#getComputersAvailable <em>Computers Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesktopRoomImpl extends RoomImpl implements DesktopRoom {
	/**
	 * The cached value of the '{@link #getOccupiers() <em>Occupiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> occupiers;

	/**
	 * The cached value of the '{@link #getComputersAvailable() <em>Computers Available</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputersAvailable()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> computersAvailable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesktopRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Enterprise2Package.Literals.DESKTOP_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getOccupiers() {
		if (occupiers == null) {
			occupiers = new EObjectWithInverseResolvingEList.ManyInverse<Employe>(Employe.class, this,
					Enterprise2Package.DESKTOP_ROOM__OCCUPIERS, Enterprise2Package.EMPLOYE__DESKTOPS);
		}
		return occupiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getComputersAvailable() {
		if (computersAvailable == null) {
			computersAvailable = new EObjectWithInverseResolvingEList<Computer>(Computer.class, this,
					Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE, Enterprise2Package.COMPUTER__ROOM);
		}
		return computersAvailable;
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
		case Enterprise2Package.DESKTOP_ROOM__OCCUPIERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOccupiers()).basicAdd(otherEnd, msgs);
		case Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComputersAvailable()).basicAdd(otherEnd,
					msgs);
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
		case Enterprise2Package.DESKTOP_ROOM__OCCUPIERS:
			return ((InternalEList<?>) getOccupiers()).basicRemove(otherEnd, msgs);
		case Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE:
			return ((InternalEList<?>) getComputersAvailable()).basicRemove(otherEnd, msgs);
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
		case Enterprise2Package.DESKTOP_ROOM__OCCUPIERS:
			return getOccupiers();
		case Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE:
			return getComputersAvailable();
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
		case Enterprise2Package.DESKTOP_ROOM__OCCUPIERS:
			getOccupiers().clear();
			getOccupiers().addAll((Collection<? extends Employe>) newValue);
			return;
		case Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE:
			getComputersAvailable().clear();
			getComputersAvailable().addAll((Collection<? extends Computer>) newValue);
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
		case Enterprise2Package.DESKTOP_ROOM__OCCUPIERS:
			getOccupiers().clear();
			return;
		case Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE:
			getComputersAvailable().clear();
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
		case Enterprise2Package.DESKTOP_ROOM__OCCUPIERS:
			return occupiers != null && !occupiers.isEmpty();
		case Enterprise2Package.DESKTOP_ROOM__COMPUTERS_AVAILABLE:
			return computersAvailable != null && !computersAvailable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DesktopRoomImpl
