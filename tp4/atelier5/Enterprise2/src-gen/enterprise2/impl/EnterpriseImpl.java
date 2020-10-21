/**
 */
package enterprise2.impl;

import enterprise2.Computer;
import enterprise2.Employe;
import enterprise2.Enterprise;
import enterprise2.Enterprise2Package;
import enterprise2.Room;

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
 *   <li>{@link enterprise2.impl.EnterpriseImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link enterprise2.impl.EnterpriseImpl#getEmployes <em>Employes</em>}</li>
 *   <li>{@link enterprise2.impl.EnterpriseImpl#getComputers <em>Computers</em>}</li>
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
	 * The cached value of the '{@link #getComputers() <em>Computers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputers()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> computers;

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
		return Enterprise2Package.Literals.ENTERPRISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, Enterprise2Package.ENTERPRISE__ROOMS);
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
					Enterprise2Package.ENTERPRISE__EMPLOYES);
		}
		return employes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getComputers() {
		if (computers == null) {
			computers = new EObjectContainmentEList<Computer>(Computer.class, this,
					Enterprise2Package.ENTERPRISE__COMPUTERS);
		}
		return computers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Enterprise2Package.ENTERPRISE__ROOMS:
			return ((InternalEList<?>) getRooms()).basicRemove(otherEnd, msgs);
		case Enterprise2Package.ENTERPRISE__EMPLOYES:
			return ((InternalEList<?>) getEmployes()).basicRemove(otherEnd, msgs);
		case Enterprise2Package.ENTERPRISE__COMPUTERS:
			return ((InternalEList<?>) getComputers()).basicRemove(otherEnd, msgs);
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
		case Enterprise2Package.ENTERPRISE__ROOMS:
			return getRooms();
		case Enterprise2Package.ENTERPRISE__EMPLOYES:
			return getEmployes();
		case Enterprise2Package.ENTERPRISE__COMPUTERS:
			return getComputers();
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
		case Enterprise2Package.ENTERPRISE__ROOMS:
			getRooms().clear();
			getRooms().addAll((Collection<? extends Room>) newValue);
			return;
		case Enterprise2Package.ENTERPRISE__EMPLOYES:
			getEmployes().clear();
			getEmployes().addAll((Collection<? extends Employe>) newValue);
			return;
		case Enterprise2Package.ENTERPRISE__COMPUTERS:
			getComputers().clear();
			getComputers().addAll((Collection<? extends Computer>) newValue);
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
		case Enterprise2Package.ENTERPRISE__ROOMS:
			getRooms().clear();
			return;
		case Enterprise2Package.ENTERPRISE__EMPLOYES:
			getEmployes().clear();
			return;
		case Enterprise2Package.ENTERPRISE__COMPUTERS:
			getComputers().clear();
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
		case Enterprise2Package.ENTERPRISE__ROOMS:
			return rooms != null && !rooms.isEmpty();
		case Enterprise2Package.ENTERPRISE__EMPLOYES:
			return employes != null && !employes.isEmpty();
		case Enterprise2Package.ENTERPRISE__COMPUTERS:
			return computers != null && !computers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseImpl
