/**
 */
package enterprise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise.Employe#getName <em>Name</em>}</li>
 *   <li>{@link enterprise.Employe#getSurname <em>Surname</em>}</li>
 *   <li>{@link enterprise.Employe#getDesktop <em>Desktop</em>}</li>
 * </ul>
 *
 * @see enterprise.EnterprisePackage#getEmploye()
 * @model
 * @generated
 */
public interface Employe extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see enterprise.EnterprisePackage#getEmploye_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enterprise.Employe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see enterprise.EnterprisePackage#getEmploye_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link enterprise.Employe#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Desktop</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link enterprise.DesktopRoom#getOccupier <em>Occupier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desktop</em>' reference.
	 * @see #setDesktop(DesktopRoom)
	 * @see enterprise.EnterprisePackage#getEmploye_Desktop()
	 * @see enterprise.DesktopRoom#getOccupier
	 * @model opposite="occupier"
	 * @generated
	 */
	DesktopRoom getDesktop();

	/**
	 * Sets the value of the '{@link enterprise.Employe#getDesktop <em>Desktop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desktop</em>' reference.
	 * @see #getDesktop()
	 * @generated
	 */
	void setDesktop(DesktopRoom value);

} // Employe
