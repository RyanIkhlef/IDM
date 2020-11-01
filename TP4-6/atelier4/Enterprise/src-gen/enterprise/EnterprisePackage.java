/**
 */
package enterprise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see enterprise.EnterpriseFactory
 * @model kind="package"
 * @generated
 */
public interface EnterprisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enterprise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/enterprise";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enterprise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnterprisePackage eINSTANCE = enterprise.impl.EnterprisePackageImpl.init();

	/**
	 * The meta object id for the '{@link enterprise.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise.impl.EnterpriseImpl
	 * @see enterprise.impl.EnterprisePackageImpl#getEnterprise()
	 * @generated
	 */
	int ENTERPRISE = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Employes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__EMPLOYES = 1;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enterprise.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise.impl.EmployeImpl
	 * @see enterprise.impl.EnterprisePackageImpl#getEmploye()
	 * @generated
	 */
	int EMPLOYE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Desktop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DESKTOP = 2;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enterprise.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise.impl.RoomImpl
	 * @see enterprise.impl.EnterprisePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 2;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enterprise.impl.DesktopRoomImpl <em>Desktop Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise.impl.DesktopRoomImpl
	 * @see enterprise.impl.EnterprisePackageImpl#getDesktopRoom()
	 * @generated
	 */
	int DESKTOP_ROOM = 3;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM__ROOM_NUMBER = ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Occupier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM__OCCUPIER = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Desktop Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Desktop Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link enterprise.impl.MeetingRoomImpl <em>Meeting Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise.impl.MeetingRoomImpl
	 * @see enterprise.impl.EnterprisePackageImpl#getMeetingRoom()
	 * @generated
	 */
	int MEETING_ROOM = 4;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ROOM__ROOM_NUMBER = ROOM__ROOM_NUMBER;

	/**
	 * The number of structural features of the '<em>Meeting Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meeting Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link enterprise.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see enterprise.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the containment reference list '{@link enterprise.Enterprise#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see enterprise.Enterprise#getRooms()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link enterprise.Enterprise#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employes</em>'.
	 * @see enterprise.Enterprise#getEmployes()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Employes();

	/**
	 * Returns the meta object for class '{@link enterprise.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see enterprise.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for the attribute '{@link enterprise.Employe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enterprise.Employe#getName()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Name();

	/**
	 * Returns the meta object for the attribute '{@link enterprise.Employe#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see enterprise.Employe#getSurname()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Surname();

	/**
	 * Returns the meta object for the reference '{@link enterprise.Employe#getDesktop <em>Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Desktop</em>'.
	 * @see enterprise.Employe#getDesktop()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Desktop();

	/**
	 * Returns the meta object for class '{@link enterprise.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see enterprise.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link enterprise.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see enterprise.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for class '{@link enterprise.DesktopRoom <em>Desktop Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desktop Room</em>'.
	 * @see enterprise.DesktopRoom
	 * @generated
	 */
	EClass getDesktopRoom();

	/**
	 * Returns the meta object for the reference list '{@link enterprise.DesktopRoom#getOccupier <em>Occupier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupier</em>'.
	 * @see enterprise.DesktopRoom#getOccupier()
	 * @see #getDesktopRoom()
	 * @generated
	 */
	EReference getDesktopRoom_Occupier();

	/**
	 * Returns the meta object for class '{@link enterprise.MeetingRoom <em>Meeting Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting Room</em>'.
	 * @see enterprise.MeetingRoom
	 * @generated
	 */
	EClass getMeetingRoom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnterpriseFactory getEnterpriseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link enterprise.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise.impl.EnterpriseImpl
		 * @see enterprise.impl.EnterprisePackageImpl#getEnterprise()
		 * @generated
		 */
		EClass ENTERPRISE = eINSTANCE.getEnterprise();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__ROOMS = eINSTANCE.getEnterprise_Rooms();

		/**
		 * The meta object literal for the '<em><b>Employes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__EMPLOYES = eINSTANCE.getEnterprise_Employes();

		/**
		 * The meta object literal for the '{@link enterprise.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise.impl.EmployeImpl
		 * @see enterprise.impl.EnterprisePackageImpl#getEmploye()
		 * @generated
		 */
		EClass EMPLOYE = eINSTANCE.getEmploye();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__NAME = eINSTANCE.getEmploye_Name();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__SURNAME = eINSTANCE.getEmploye_Surname();

		/**
		 * The meta object literal for the '<em><b>Desktop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__DESKTOP = eINSTANCE.getEmploye_Desktop();

		/**
		 * The meta object literal for the '{@link enterprise.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise.impl.RoomImpl
		 * @see enterprise.impl.EnterprisePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

		/**
		 * The meta object literal for the '{@link enterprise.impl.DesktopRoomImpl <em>Desktop Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise.impl.DesktopRoomImpl
		 * @see enterprise.impl.EnterprisePackageImpl#getDesktopRoom()
		 * @generated
		 */
		EClass DESKTOP_ROOM = eINSTANCE.getDesktopRoom();

		/**
		 * The meta object literal for the '<em><b>Occupier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESKTOP_ROOM__OCCUPIER = eINSTANCE.getDesktopRoom_Occupier();

		/**
		 * The meta object literal for the '{@link enterprise.impl.MeetingRoomImpl <em>Meeting Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise.impl.MeetingRoomImpl
		 * @see enterprise.impl.EnterprisePackageImpl#getMeetingRoom()
		 * @generated
		 */
		EClass MEETING_ROOM = eINSTANCE.getMeetingRoom();

	}

} //EnterprisePackage
