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
 * An implementation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enterprise2.impl.EmployeImpl#getDesktops <em>Desktops</em>}</li>
 *   <li>{@link enterprise2.impl.EmployeImpl#getName <em>Name</em>}</li>
 *   <li>{@link enterprise2.impl.EmployeImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link enterprise2.impl.EmployeImpl#getAccessibleComputers <em>Accessible Computers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeImpl extends MinimalEObjectImpl.Container implements Employe {
	/**
	 * The cached value of the '{@link #getDesktops() <em>Desktops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesktops()
	 * @generated
	 * @ordered
	 */
	protected EList<DesktopRoom> desktops;

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
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessibleComputers() <em>Accessible Computers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibleComputers()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> accessibleComputers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Enterprise2Package.Literals.EMPLOYE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesktopRoom> getDesktops() {
		if (desktops == null) {
			desktops = new EObjectWithInverseResolvingEList.ManyInverse<DesktopRoom>(DesktopRoom.class, this,
					Enterprise2Package.EMPLOYE__DESKTOPS, Enterprise2Package.DESKTOP_ROOM__OCCUPIERS);
		}
		return desktops;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Enterprise2Package.EMPLOYE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Enterprise2Package.EMPLOYE__SURNAME, oldSurname,
					surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getAccessibleComputers() {
		if (accessibleComputers == null) {
			accessibleComputers = new EObjectWithInverseResolvingEList.ManyInverse<Computer>(Computer.class, this,
					Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS, Enterprise2Package.COMPUTER__USERS);
		}
		return accessibleComputers;
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
		case Enterprise2Package.EMPLOYE__DESKTOPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDesktops()).basicAdd(otherEnd, msgs);
		case Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAccessibleComputers()).basicAdd(otherEnd,
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
		case Enterprise2Package.EMPLOYE__DESKTOPS:
			return ((InternalEList<?>) getDesktops()).basicRemove(otherEnd, msgs);
		case Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS:
			return ((InternalEList<?>) getAccessibleComputers()).basicRemove(otherEnd, msgs);
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
		case Enterprise2Package.EMPLOYE__DESKTOPS:
			return getDesktops();
		case Enterprise2Package.EMPLOYE__NAME:
			return getName();
		case Enterprise2Package.EMPLOYE__SURNAME:
			return getSurname();
		case Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS:
			return getAccessibleComputers();
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
		case Enterprise2Package.EMPLOYE__DESKTOPS:
			getDesktops().clear();
			getDesktops().addAll((Collection<? extends DesktopRoom>) newValue);
			return;
		case Enterprise2Package.EMPLOYE__NAME:
			setName((String) newValue);
			return;
		case Enterprise2Package.EMPLOYE__SURNAME:
			setSurname((String) newValue);
			return;
		case Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS:
			getAccessibleComputers().clear();
			getAccessibleComputers().addAll((Collection<? extends Computer>) newValue);
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
		case Enterprise2Package.EMPLOYE__DESKTOPS:
			getDesktops().clear();
			return;
		case Enterprise2Package.EMPLOYE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Enterprise2Package.EMPLOYE__SURNAME:
			setSurname(SURNAME_EDEFAULT);
			return;
		case Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS:
			getAccessibleComputers().clear();
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
		case Enterprise2Package.EMPLOYE__DESKTOPS:
			return desktops != null && !desktops.isEmpty();
		case Enterprise2Package.EMPLOYE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Enterprise2Package.EMPLOYE__SURNAME:
			return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
		case Enterprise2Package.EMPLOYE__ACCESSIBLE_COMPUTERS:
			return accessibleComputers != null && !accessibleComputers.isEmpty();
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
		result.append(", surname: ");
		result.append(surname);
		result.append(')');
		return result.toString();
	}

} //EmployeImpl
