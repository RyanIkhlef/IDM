/**
 */
package bal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.payment#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getpayment()
 * @model
 * @generated
 */
public interface payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see bal.BalPackage#getpayment_Command()
	 * @model
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link bal.payment#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // payment
