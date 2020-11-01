/**
 */
package enterprise.impl;

import enterprise.DesktopRoom;
import enterprise.Employe;
import enterprise.EnterprisePackage;

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
 *   <li>{@link enterprise.impl.DesktopRoomImpl#getOccupier <em>Occupier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesktopRoomImpl extends RoomImpl implements DesktopRoom {
	/**
	 * The cached value of the '{@link #getOccupier() <em>Occupier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupier()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> occupier;

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
		return EnterprisePackage.Literals.DESKTOP_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getOccupier() {
		if (occupier == null) {
			occupier = new EObjectWithInverseResolvingEList<Employe>(Employe.class, this,
					EnterprisePackage.DESKTOP_ROOM__OCCUPIER, EnterprisePackage.EMPLOYE__DESKTOP);
		}
		return occupier;
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
		case EnterprisePackage.DESKTOP_ROOM__OCCUPIER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOccupier()).basicAdd(otherEnd, msgs);
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
		case EnterprisePackage.DESKTOP_ROOM__OCCUPIER:
			return ((InternalEList<?>) getOccupier()).basicRemove(otherEnd, msgs);
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
		case EnterprisePackage.DESKTOP_ROOM__OCCUPIER:
			return getOccupier();
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
		case EnterprisePackage.DESKTOP_ROOM__OCCUPIER:
			getOccupier().clear();
			getOccupier().addAll((Collection<? extends Employe>) newValue);
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
		case EnterprisePackage.DESKTOP_ROOM__OCCUPIER:
			getOccupier().clear();
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
		case EnterprisePackage.DESKTOP_ROOM__OCCUPIER:
			return occupier != null && !occupier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DesktopRoomImpl
