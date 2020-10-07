/**
 */
package bal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.Command#getCommandlines <em>Commandlines</em>}</li>
 *   <li>{@link bal.Command#isIsDelivred <em>Is Delivred</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Commandlines</b></em>' containment reference list.
	 * The list contents are of type {@link bal.CommandLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commandlines</em>' containment reference list.
	 * @see bal.BalPackage#getCommand_Commandlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandLine> getCommandlines();

	/**
	 * Returns the value of the '<em><b>Is Delivred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Delivred</em>' attribute.
	 * @see #setIsDelivred(boolean)
	 * @see bal.BalPackage#getCommand_IsDelivred()
	 * @model
	 * @generated
	 */
	boolean isIsDelivred();

	/**
	 * Sets the value of the '{@link bal.Command#isIsDelivred <em>Is Delivred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Delivred</em>' attribute.
	 * @see #isIsDelivred()
	 * @generated
	 */
	void setIsDelivred(boolean value);

} // Command
