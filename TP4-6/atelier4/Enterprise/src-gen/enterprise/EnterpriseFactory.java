/**
 */
package enterprise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see enterprise.EnterprisePackage
 * @generated
 */
public interface EnterpriseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnterpriseFactory eINSTANCE = enterprise.impl.EnterpriseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enterprise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enterprise</em>'.
	 * @generated
	 */
	Enterprise createEnterprise();

	/**
	 * Returns a new object of class '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employe</em>'.
	 * @generated
	 */
	Employe createEmploye();

	/**
	 * Returns a new object of class '<em>Desktop Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desktop Room</em>'.
	 * @generated
	 */
	DesktopRoom createDesktopRoom();

	/**
	 * Returns a new object of class '<em>Meeting Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meeting Room</em>'.
	 * @generated
	 */
	MeetingRoom createMeetingRoom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnterprisePackage getEnterprisePackage();

} //EnterpriseFactory
