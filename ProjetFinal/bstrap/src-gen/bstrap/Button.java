/**
 */
package bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bstrap.Button#getTarget <em>Target</em>}</li>
 *   <li>{@link bstrap.Button#getSize <em>Size</em>}</li>
 *   <li>{@link bstrap.Button#isIsOutline <em>Is Outline</em>}</li>
 *   <li>{@link bstrap.Button#isIsEnable <em>Is Enable</em>}</li>
 *   <li>{@link bstrap.Button#isIsSpinner <em>Is Spinner</em>}</li>
 *   <li>{@link bstrap.Button#isIsBlockButton <em>Is Block Button</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends TextElement {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Link)
	 * @see bstrap.BstrapPackage#getButton_Target()
	 * @model containment="true"
	 * @generated
	 */
	Link getTarget();

	/**
	 * Sets the value of the '{@link bstrap.Button#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Link value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see bstrap.BstrapPackage#getButton_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link bstrap.Button#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Is Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Outline</em>' attribute.
	 * @see #setIsOutline(boolean)
	 * @see bstrap.BstrapPackage#getButton_IsOutline()
	 * @model
	 * @generated
	 */
	boolean isIsOutline();

	/**
	 * Sets the value of the '{@link bstrap.Button#isIsOutline <em>Is Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Outline</em>' attribute.
	 * @see #isIsOutline()
	 * @generated
	 */
	void setIsOutline(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Enable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enable</em>' attribute.
	 * @see #setIsEnable(boolean)
	 * @see bstrap.BstrapPackage#getButton_IsEnable()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsEnable();

	/**
	 * Sets the value of the '{@link bstrap.Button#isIsEnable <em>Is Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enable</em>' attribute.
	 * @see #isIsEnable()
	 * @generated
	 */
	void setIsEnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Spinner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Spinner</em>' attribute.
	 * @see #setIsSpinner(boolean)
	 * @see bstrap.BstrapPackage#getButton_IsSpinner()
	 * @model
	 * @generated
	 */
	boolean isIsSpinner();

	/**
	 * Sets the value of the '{@link bstrap.Button#isIsSpinner <em>Is Spinner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Spinner</em>' attribute.
	 * @see #isIsSpinner()
	 * @generated
	 */
	void setIsSpinner(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Block Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Block Button</em>' attribute.
	 * @see #setIsBlockButton(boolean)
	 * @see bstrap.BstrapPackage#getButton_IsBlockButton()
	 * @model
	 * @generated
	 */
	boolean isIsBlockButton();

	/**
	 * Sets the value of the '{@link bstrap.Button#isIsBlockButton <em>Is Block Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Block Button</em>' attribute.
	 * @see #isIsBlockButton()
	 * @generated
	 */
	void setIsBlockButton(boolean value);

} // Button
