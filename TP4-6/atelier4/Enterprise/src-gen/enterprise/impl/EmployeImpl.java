/**
 */
package enterprise.impl;

import enterprise.DesktopRoom;
import enterprise.Employe;
import enterprise.EnterprisePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enterprise.impl.EmployeImpl#getName <em>Name</em>}</li>
 *   <li>{@link enterprise.impl.EmployeImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link enterprise.impl.EmployeImpl#getDesktop <em>Desktop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeImpl extends MinimalEObjectImpl.Container implements Employe {
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
	 * The cached value of the '{@link #getDesktop() <em>Desktop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesktop()
	 * @generated
	 * @ordered
	 */
	protected DesktopRoom desktop;

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
		return EnterprisePackage.Literals.EMPLOYE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.EMPLOYE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.EMPLOYE__SURNAME, oldSurname,
					surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopRoom getDesktop() {
		if (desktop != null && desktop.eIsProxy()) {
			InternalEObject oldDesktop = (InternalEObject) desktop;
			desktop = (DesktopRoom) eResolveProxy(oldDesktop);
			if (desktop != oldDesktop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnterprisePackage.EMPLOYE__DESKTOP,
							oldDesktop, desktop));
			}
		}
		return desktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopRoom basicGetDesktop() {
		return desktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesktop(DesktopRoom newDesktop, NotificationChain msgs) {
		DesktopRoom oldDesktop = desktop;
		desktop = newDesktop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EnterprisePackage.EMPLOYE__DESKTOP, oldDesktop, newDesktop);
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
	public void setDesktop(DesktopRoom newDesktop) {
		if (newDesktop != desktop) {
			NotificationChain msgs = null;
			if (desktop != null)
				msgs = ((InternalEObject) desktop).eInverseRemove(this, EnterprisePackage.DESKTOP_ROOM__OCCUPIER,
						DesktopRoom.class, msgs);
			if (newDesktop != null)
				msgs = ((InternalEObject) newDesktop).eInverseAdd(this, EnterprisePackage.DESKTOP_ROOM__OCCUPIER,
						DesktopRoom.class, msgs);
			msgs = basicSetDesktop(newDesktop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnterprisePackage.EMPLOYE__DESKTOP, newDesktop,
					newDesktop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnterprisePackage.EMPLOYE__DESKTOP:
			if (desktop != null)
				msgs = ((InternalEObject) desktop).eInverseRemove(this, EnterprisePackage.DESKTOP_ROOM__OCCUPIER,
						DesktopRoom.class, msgs);
			return basicSetDesktop((DesktopRoom) otherEnd, msgs);
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
		case EnterprisePackage.EMPLOYE__DESKTOP:
			return basicSetDesktop(null, msgs);
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
		case EnterprisePackage.EMPLOYE__NAME:
			return getName();
		case EnterprisePackage.EMPLOYE__SURNAME:
			return getSurname();
		case EnterprisePackage.EMPLOYE__DESKTOP:
			if (resolve)
				return getDesktop();
			return basicGetDesktop();
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
		case EnterprisePackage.EMPLOYE__NAME:
			setName((String) newValue);
			return;
		case EnterprisePackage.EMPLOYE__SURNAME:
			setSurname((String) newValue);
			return;
		case EnterprisePackage.EMPLOYE__DESKTOP:
			setDesktop((DesktopRoom) newValue);
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
		case EnterprisePackage.EMPLOYE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EnterprisePackage.EMPLOYE__SURNAME:
			setSurname(SURNAME_EDEFAULT);
			return;
		case EnterprisePackage.EMPLOYE__DESKTOP:
			setDesktop((DesktopRoom) null);
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
		case EnterprisePackage.EMPLOYE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EnterprisePackage.EMPLOYE__SURNAME:
			return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
		case EnterprisePackage.EMPLOYE__DESKTOP:
			return desktop != null;
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
