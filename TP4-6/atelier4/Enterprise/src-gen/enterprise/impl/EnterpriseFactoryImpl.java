/**
 */
package enterprise.impl;

import enterprise.*;

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
public class EnterpriseFactoryImpl extends EFactoryImpl implements EnterpriseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnterpriseFactory init() {
		try {
			EnterpriseFactory theEnterpriseFactory = (EnterpriseFactory) EPackage.Registry.INSTANCE
					.getEFactory(EnterprisePackage.eNS_URI);
			if (theEnterpriseFactory != null) {
				return theEnterpriseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnterpriseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseFactoryImpl() {
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
		case EnterprisePackage.ENTERPRISE:
			return createEnterprise();
		case EnterprisePackage.EMPLOYE:
			return createEmploye();
		case EnterprisePackage.DESKTOP_ROOM:
			return createDesktopRoom();
		case EnterprisePackage.MEETING_ROOM:
			return createMeetingRoom();
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
	public Employe createEmploye() {
		EmployeImpl employe = new EmployeImpl();
		return employe;
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
	public EnterprisePackage getEnterprisePackage() {
		return (EnterprisePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnterprisePackage getPackage() {
		return EnterprisePackage.eINSTANCE;
	}

} //EnterpriseFactoryImpl
