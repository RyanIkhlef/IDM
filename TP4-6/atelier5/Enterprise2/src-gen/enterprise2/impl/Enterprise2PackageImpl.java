/**
 */
package enterprise2.impl;

import enterprise2.Computer;
import enterprise2.DesktopRoom;
import enterprise2.Employe;
import enterprise2.Enterprise;
import enterprise2.Enterprise2Factory;
import enterprise2.Enterprise2Package;
import enterprise2.MeetingRoom;
import enterprise2.Room;
import enterprise2.TechnicalRoom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Enterprise2PackageImpl extends EPackageImpl implements Enterprise2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desktopRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetingRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see enterprise2.Enterprise2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Enterprise2PackageImpl() {
		super(eNS_URI, Enterprise2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Enterprise2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Enterprise2Package init() {
		if (isInited)
			return (Enterprise2Package) EPackage.Registry.INSTANCE.getEPackage(Enterprise2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEnterprise2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Enterprise2PackageImpl theEnterprise2Package = registeredEnterprise2Package instanceof Enterprise2PackageImpl
				? (Enterprise2PackageImpl) registeredEnterprise2Package
				: new Enterprise2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEnterprise2Package.createPackageContents();

		// Initialize created meta-data
		theEnterprise2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnterprise2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Enterprise2Package.eNS_URI, theEnterprise2Package);
		return theEnterprise2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterprise() {
		return enterpriseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterprise_Rooms() {
		return (EReference) enterpriseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterprise_Employes() {
		return (EReference) enterpriseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterprise_Computers() {
		return (EReference) enterpriseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNumber() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_StageNumber() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesktopRoom() {
		return desktopRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesktopRoom_Occupiers() {
		return (EReference) desktopRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesktopRoom_ComputersAvailable() {
		return (EReference) desktopRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeetingRoom() {
		return meetingRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmploye() {
		return employeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_Desktops() {
		return (EReference) employeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_Name() {
		return (EAttribute) employeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_Surname() {
		return (EAttribute) employeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_AccessibleComputers() {
		return (EReference) employeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnicalRoom() {
		return technicalRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputer() {
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_Name() {
		return (EAttribute) computerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Users() {
		return (EReference) computerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Room() {
		return (EReference) computerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enterprise2Factory getEnterprise2Factory() {
		return (Enterprise2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		enterpriseEClass = createEClass(ENTERPRISE);
		createEReference(enterpriseEClass, ENTERPRISE__ROOMS);
		createEReference(enterpriseEClass, ENTERPRISE__EMPLOYES);
		createEReference(enterpriseEClass, ENTERPRISE__COMPUTERS);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEAttribute(roomEClass, ROOM__STAGE_NUMBER);

		desktopRoomEClass = createEClass(DESKTOP_ROOM);
		createEReference(desktopRoomEClass, DESKTOP_ROOM__OCCUPIERS);
		createEReference(desktopRoomEClass, DESKTOP_ROOM__COMPUTERS_AVAILABLE);

		meetingRoomEClass = createEClass(MEETING_ROOM);

		employeEClass = createEClass(EMPLOYE);
		createEReference(employeEClass, EMPLOYE__DESKTOPS);
		createEAttribute(employeEClass, EMPLOYE__NAME);
		createEAttribute(employeEClass, EMPLOYE__SURNAME);
		createEReference(employeEClass, EMPLOYE__ACCESSIBLE_COMPUTERS);

		technicalRoomEClass = createEClass(TECHNICAL_ROOM);

		computerEClass = createEClass(COMPUTER);
		createEAttribute(computerEClass, COMPUTER__NAME);
		createEReference(computerEClass, COMPUTER__USERS);
		createEReference(computerEClass, COMPUTER__ROOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		desktopRoomEClass.getESuperTypes().add(this.getRoom());
		meetingRoomEClass.getESuperTypes().add(this.getRoom());
		technicalRoomEClass.getESuperTypes().add(this.getRoom());

		// Initialize classes, features, and operations; add parameters
		initEClass(enterpriseEClass, Enterprise.class, "Enterprise", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterprise_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, Enterprise.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterprise_Employes(), this.getEmploye(), null, "employes", null, 0, -1, Enterprise.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterprise_Computers(), this.getComputer(), null, "computers", null, 0, -1, Enterprise.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 0, 1, Room.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_StageNumber(), ecorePackage.getEInt(), "stageNumber", null, 0, 1, Room.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(desktopRoomEClass, DesktopRoom.class, "DesktopRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesktopRoom_Occupiers(), this.getEmploye(), this.getEmploye_Desktops(), "occupiers", null, 0,
				-1, DesktopRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesktopRoom_ComputersAvailable(), this.getComputer(), this.getComputer_Room(),
				"computersAvailable", null, 0, -1, DesktopRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meetingRoomEClass, MeetingRoom.class, "MeetingRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(employeEClass, Employe.class, "Employe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmploye_Desktops(), this.getDesktopRoom(), this.getDesktopRoom_Occupiers(), "desktops", null,
				0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_Name(), ecorePackage.getEString(), "name", null, 0, 1, Employe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_Surname(), ecorePackage.getEString(), "surname", null, 0, 1, Employe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_AccessibleComputers(), this.getComputer(), this.getComputer_Users(),
				"AccessibleComputers", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technicalRoomEClass, TechnicalRoom.class, "TechnicalRoom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Computer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Users(), this.getEmploye(), this.getEmploye_AccessibleComputers(), "users", null, 0,
				-1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Room(), this.getDesktopRoom(), this.getDesktopRoom_ComputersAvailable(), "room",
				null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Enterprise2PackageImpl
