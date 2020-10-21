/**
 */
package enterprise.impl;

import enterprise.Employe;
import enterprise.Enterprise;
import enterprise.EnterprisePackage;
import enterprise.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enterprise.impl.EnterpriseImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link enterprise.impl.EnterpriseImpl#getEmployes <em>Employes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseImpl extends MinimalEObjectImpl.Container implements Enterprise {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getEmployes() <em>Employes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployes()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> employes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnterprisePackage.Literals.ENTERPRISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, EnterprisePackage.ENTERPRISE__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getEmployes() {
		if (employes == null) {
			employes = new EObjectContainmentEList<Employe>(Employe.class, this,
					EnterprisePackage.ENTERPRISE__EMPLOYES);
		}
		return employes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnterprisePackage.ENTERPRISE__ROOMS:
			return ((InternalEList<?>) getRooms()).basicRemove(otherEnd, msgs);
		case EnterprisePackage.ENTERPRISE__EMPLOYES:
			return ((InternalEList<?>) getEmployes()).basicRemove(otherEnd, msgs);
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
		case EnterprisePackage.ENTERPRISE__ROOMS:
			return getRooms();
		case EnterprisePackage.ENTERPRISE__EMPLOYES:
			return getEmployes();
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
		case EnterprisePackage.ENTERPRISE__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case EnterprisePackage.ENTERPRISE__EMPLOYES:
			getEmployes().clear();
			getEmployes().addAll((Collection<? extends Employe>) newValue);
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
		case EnterprisePackage.ENTERPRISE__ROOMS:
			getRooms().clear();
			return;
		case EnterprisePackage.ENTERPRISE__EMPLOYES:
			getEmployes().clear();
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
		case EnterprisePackage.ENTERPRISE__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case EnterprisePackage.ENTERPRISE__EMPLOYES:
			return employes != null && !employes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseImpl
