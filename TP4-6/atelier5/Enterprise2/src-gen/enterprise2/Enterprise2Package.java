/**
 */
package enterprise2;

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
 * @see enterprise2.Enterprise2Factory
 * @model kind="package"
 * @generated
 */
public interface Enterprise2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enterprise2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/enterprise2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enterprise2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Enterprise2Package eINSTANCE = enterprise2.impl.Enterprise2PackageImpl.init();

	/**
	 * The meta object id for the '{@link enterprise2.impl.EnterpriseImpl <em>Enterprise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise2.impl.EnterpriseImpl
	 * @see enterprise2.impl.Enterprise2PackageImpl#getEnterprise()
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
	 * The feature id for the '<em><b>Computers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE__COMPUTERS = 2;

	/**
	 * The number of structural features of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enterprise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enterprise2.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise2.impl.RoomImpl
	 * @see enterprise2.impl.Enterprise2PackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Stage Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__STAGE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enterprise2.impl.DesktopRoomImpl <em>Desktop Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise2.impl.DesktopRoomImpl
	 * @see enterprise2.impl.Enterprise2PackageImpl#getDesktopRoom()
	 * @generated
	 */
	int DESKTOP_ROOM = 2;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM__ROOM_NUMBER = ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Stage Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM__STAGE_NUMBER = ROOM__STAGE_NUMBER;

	/**
	 * The feature id for the '<em><b>Occupiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM__OCCUPIERS = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Computers Available</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM__COMPUTERS_AVAILABLE = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Desktop Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Desktop Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link enterprise2.impl.MeetingRoomImpl <em>Meeting Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise2.impl.MeetingRoomImpl
	 * @see enterprise2.impl.Enterprise2PackageImpl#getMeetingRoom()
	 * @generated
	 */
	int MEETING_ROOM = 3;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ROOM__ROOM_NUMBER = ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Stage Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ROOM__STAGE_NUMBER = ROOM__STAGE_NUMBER;

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
	 * The meta object id for the '{@link enterprise2.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise2.impl.EmployeImpl
	 * @see enterprise2.impl.Enterprise2PackageImpl#getEmploye()
	 * @generated
	 */
	int EMPLOYE = 4;

	/**
	 * The feature id for the '<em><b>Desktops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DESKTOPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__SURNAME = 2;

	/**
	 * The feature id for the '<em><b>Accessible Computers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ACCESSIBLE_COMPUTERS = 3;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enterprise2.impl.TechnicalRoomImpl <em>Technical Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise2.impl.TechnicalRoomImpl
	 * @see enterprise2.impl.Enterprise2PackageImpl#getTechnicalRoom()
	 * @generated
	 */
	int TECHNICAL_ROOM = 5;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ROOM__ROOM_NUMBER = ROOM__ROOM_NUMBER;

	/**
	 * The feature id for the '<em><b>Stage Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ROOM__STAGE_NUMBER = ROOM__STAGE_NUMBER;

	/**
	 * The number of structural features of the '<em>Technical Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Technical Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link enterprise2.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enterprise2.impl.ComputerImpl
	 * @see enterprise2.impl.Enterprise2PackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__USERS = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__ROOM = 2;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link enterprise2.Enterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise</em>'.
	 * @see enterprise2.Enterprise
	 * @generated
	 */
	EClass getEnterprise();

	/**
	 * Returns the meta object for the containment reference list '{@link enterprise2.Enterprise#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see enterprise2.Enterprise#getRooms()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link enterprise2.Enterprise#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employes</em>'.
	 * @see enterprise2.Enterprise#getEmployes()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Employes();

	/**
	 * Returns the meta object for the containment reference list '{@link enterprise2.Enterprise#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computers</em>'.
	 * @see enterprise2.Enterprise#getComputers()
	 * @see #getEnterprise()
	 * @generated
	 */
	EReference getEnterprise_Computers();

	/**
	 * Returns the meta object for class '{@link enterprise2.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see enterprise2.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link enterprise2.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see enterprise2.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link enterprise2.Room#getStageNumber <em>Stage Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage Number</em>'.
	 * @see enterprise2.Room#getStageNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_StageNumber();

	/**
	 * Returns the meta object for class '{@link enterprise2.DesktopRoom <em>Desktop Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desktop Room</em>'.
	 * @see enterprise2.DesktopRoom
	 * @generated
	 */
	EClass getDesktopRoom();

	/**
	 * Returns the meta object for the reference list '{@link enterprise2.DesktopRoom#getOccupiers <em>Occupiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupiers</em>'.
	 * @see enterprise2.DesktopRoom#getOccupiers()
	 * @see #getDesktopRoom()
	 * @generated
	 */
	EReference getDesktopRoom_Occupiers();

	/**
	 * Returns the meta object for the reference list '{@link enterprise2.DesktopRoom#getComputersAvailable <em>Computers Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computers Available</em>'.
	 * @see enterprise2.DesktopRoom#getComputersAvailable()
	 * @see #getDesktopRoom()
	 * @generated
	 */
	EReference getDesktopRoom_ComputersAvailable();

	/**
	 * Returns the meta object for class '{@link enterprise2.MeetingRoom <em>Meeting Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting Room</em>'.
	 * @see enterprise2.MeetingRoom
	 * @generated
	 */
	EClass getMeetingRoom();

	/**
	 * Returns the meta object for class '{@link enterprise2.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see enterprise2.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for the reference list '{@link enterprise2.Employe#getDesktops <em>Desktops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Desktops</em>'.
	 * @see enterprise2.Employe#getDesktops()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Desktops();

	/**
	 * Returns the meta object for the attribute '{@link enterprise2.Employe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enterprise2.Employe#getName()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Name();

	/**
	 * Returns the meta object for the attribute '{@link enterprise2.Employe#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see enterprise2.Employe#getSurname()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Surname();

	/**
	 * Returns the meta object for the reference list '{@link enterprise2.Employe#getAccessibleComputers <em>Accessible Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible Computers</em>'.
	 * @see enterprise2.Employe#getAccessibleComputers()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_AccessibleComputers();

	/**
	 * Returns the meta object for class '{@link enterprise2.TechnicalRoom <em>Technical Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical Room</em>'.
	 * @see enterprise2.TechnicalRoom
	 * @generated
	 */
	EClass getTechnicalRoom();

	/**
	 * Returns the meta object for class '{@link enterprise2.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see enterprise2.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the attribute '{@link enterprise2.Computer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enterprise2.Computer#getName()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_Name();

	/**
	 * Returns the meta object for the reference list '{@link enterprise2.Computer#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see enterprise2.Computer#getUsers()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Users();

	/**
	 * Returns the meta object for the reference '{@link enterprise2.Computer#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see enterprise2.Computer#getRoom()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Room();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Enterprise2Factory getEnterprise2Factory();

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
		 * The meta object literal for the '{@link enterprise2.impl.EnterpriseImpl <em>Enterprise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise2.impl.EnterpriseImpl
		 * @see enterprise2.impl.Enterprise2PackageImpl#getEnterprise()
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
		 * The meta object literal for the '<em><b>Computers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE__COMPUTERS = eINSTANCE.getEnterprise_Computers();

		/**
		 * The meta object literal for the '{@link enterprise2.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise2.impl.RoomImpl
		 * @see enterprise2.impl.Enterprise2PackageImpl#getRoom()
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
		 * The meta object literal for the '<em><b>Stage Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__STAGE_NUMBER = eINSTANCE.getRoom_StageNumber();

		/**
		 * The meta object literal for the '{@link enterprise2.impl.DesktopRoomImpl <em>Desktop Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise2.impl.DesktopRoomImpl
		 * @see enterprise2.impl.Enterprise2PackageImpl#getDesktopRoom()
		 * @generated
		 */
		EClass DESKTOP_ROOM = eINSTANCE.getDesktopRoom();

		/**
		 * The meta object literal for the '<em><b>Occupiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESKTOP_ROOM__OCCUPIERS = eINSTANCE.getDesktopRoom_Occupiers();

		/**
		 * The meta object literal for the '<em><b>Computers Available</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESKTOP_ROOM__COMPUTERS_AVAILABLE = eINSTANCE.getDesktopRoom_ComputersAvailable();

		/**
		 * The meta object literal for the '{@link enterprise2.impl.MeetingRoomImpl <em>Meeting Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise2.impl.MeetingRoomImpl
		 * @see enterprise2.impl.Enterprise2PackageImpl#getMeetingRoom()
		 * @generated
		 */
		EClass MEETING_ROOM = eINSTANCE.getMeetingRoom();

		/**
		 * The meta object literal for the '{@link enterprise2.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise2.impl.EmployeImpl
		 * @see enterprise2.impl.Enterprise2PackageImpl#getEmploye()
		 * @generated
		 */
		EClass EMPLOYE = eINSTANCE.getEmploye();

		/**
		 * The meta object literal for the '<em><b>Desktops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__DESKTOPS = eINSTANCE.getEmploye_Desktops();

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
		 * The meta object literal for the '<em><b>Accessible Computers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__ACCESSIBLE_COMPUTERS = eINSTANCE.getEmploye_AccessibleComputers();

		/**
		 * The meta object literal for the '{@link enterprise2.impl.TechnicalRoomImpl <em>Technical Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise2.impl.TechnicalRoomImpl
		 * @see enterprise2.impl.Enterprise2PackageImpl#getTechnicalRoom()
		 * @generated
		 */
		EClass TECHNICAL_ROOM = eINSTANCE.getTechnicalRoom();

		/**
		 * The meta object literal for the '{@link enterprise2.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enterprise2.impl.ComputerImpl
		 * @see enterprise2.impl.Enterprise2PackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__NAME = eINSTANCE.getComputer_Name();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__USERS = eINSTANCE.getComputer_Users();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__ROOM = eINSTANCE.getComputer_Room();

	}

} //Enterprise2Package
