/**
 */
package website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.Button#getTargetLink <em>Target Link</em>}</li>
 *   <li>{@link website.Button#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getButton()
 * @model
 * @generated
 */
public interface Button extends HTMLElement {
	/**
	 * Returns the value of the '<em><b>Target Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Link</em>' containment reference.
	 * @see #setTargetLink(Link)
	 * @see website.WebsitePackage#getButton_TargetLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getTargetLink();

	/**
	 * Sets the value of the '{@link website.Button#getTargetLink <em>Target Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Link</em>' containment reference.
	 * @see #getTargetLink()
	 * @generated
	 */
	void setTargetLink(Link value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see website.WebsitePackage#getButton_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link website.Button#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Button
