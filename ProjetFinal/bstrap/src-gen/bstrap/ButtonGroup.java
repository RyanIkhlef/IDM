/**
 */
package bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bstrap.ButtonGroup#getButtons <em>Buttons</em>}</li>
 *   <li>{@link bstrap.ButtonGroup#getSize <em>Size</em>}</li>
 *   <li>{@link bstrap.ButtonGroup#isIsVertical <em>Is Vertical</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getButtonGroup()
 * @model
 * @generated
 */
public interface ButtonGroup extends Element {
	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link bstrap.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' containment reference list.
	 * @see bstrap.BstrapPackage#getButtonGroup_Buttons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Button> getButtons();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see bstrap.BstrapPackage#getButtonGroup_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link bstrap.ButtonGroup#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Is Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Vertical</em>' attribute.
	 * @see #setIsVertical(boolean)
	 * @see bstrap.BstrapPackage#getButtonGroup_IsVertical()
	 * @model
	 * @generated
	 */
	boolean isIsVertical();

	/**
	 * Sets the value of the '{@link bstrap.ButtonGroup#isIsVertical <em>Is Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Vertical</em>' attribute.
	 * @see #isIsVertical()
	 * @generated
	 */
	void setIsVertical(boolean value);

} // ButtonGroup
