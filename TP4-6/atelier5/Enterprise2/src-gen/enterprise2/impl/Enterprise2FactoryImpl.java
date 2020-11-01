/**
 */
package enterprise2.impl;

import enterprise2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Enterprise2FactoryImpl extends EFactoryImpl implements Enterprise2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enterprise2Factory init() {
		try {
			Enterprise2Factory theEnterprise2Factory = (Enterprise2Factory) EPackage.Registry.INSTANCE
					.getEFactory(Enterprise2Package.eNS_URI);
			if (theEnterprise2Factory != null) {
				return theEnterprise2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Enterprise2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enterprise2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Enterprise2Package.ENTERPRISE:
			return createEnterprise();
		case Enterprise2Package.DESKTOP_ROOM:
			return createDesktopRoom();
		case Enterprise2Package.MEETING_ROOM:
			return createMeetingRoom();
		case Enterprise2Package.EMPLOYE:
			return createEmploye();
		case Enterprise2Package.TECHNICAL_ROOM:
			return createTechnicalRoom();
		case Enterprise2Package.COMPUTER:
			return createComputer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enterprise createEnterprise() {
		EnterpriseImpl enterprise = new EnterpriseImpl();
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopRoom createDesktopRoom() {
		DesktopRoomImpl desktopRoom = new DesktopRoomImpl();
		return desktopRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetingRoom createMeetingRoom() {
		MeetingRoomImpl meetingRoom = new MeetingRoomImpl();
		return meetingRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employe createEmploye() {
		EmployeImpl employe = new EmployeImpl();
		return employe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalRoom createTechnicalRoom() {
		TechnicalRoomImpl technicalRoom = new TechnicalRoomImpl();
		return technicalRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer createComputer() {
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enterprise2Package getEnterprise2Package() {
		return (Enterprise2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Enterprise2Package getPackage() {
		return Enterprise2Package.eINSTANCE;
	}

} //Enterprise2FactoryImpl
