/**
 */
package enterprise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise.Enterprise#getRooms <em>Rooms</em>}</li>
 *   <li>{@link enterprise.Enterprise#getEmployes <em>Employes</em>}</li>
 * </ul>
 *
 * @see enterprise.EnterprisePackage#getEnterprise()
 * @model
 * @generated
 */
public interface Enterprise extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link enterprise.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see enterprise.EnterprisePackage#getEnterprise_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Employes</b></em>' containment reference list.
	 * The list contents are of type {@link enterprise.Employe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes</em>' containment reference list.
	 * @see enterprise.EnterprisePackage#getEnterprise_Employes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employe> getEmployes();

} // Enterprise
