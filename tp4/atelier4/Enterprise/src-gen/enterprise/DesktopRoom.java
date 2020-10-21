/**
 */
package enterprise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desktop Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link enterprise.DesktopRoom#getOccupier <em>Occupier</em>}</li>
 * </ul>
 *
 * @see enterprise.EnterprisePackage#getDesktopRoom()
 * @model
 * @generated
 */
public interface DesktopRoom extends Room {
	/**
	 * Returns the value of the '<em><b>Occupier</b></em>' reference list.
	 * The list contents are of type {@link enterprise.Employe}.
	 * It is bidirectional and its opposite is '{@link enterprise.Employe#getDesktop <em>Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupier</em>' reference list.
	 * @see enterprise.EnterprisePackage#getDesktopRoom_Occupier()
	 * @see enterprise.Employe#getDesktop
	 * @model opposite="desktop"
	 * @generated
	 */
	EList<Employe> getOccupier();

} // DesktopRoom
