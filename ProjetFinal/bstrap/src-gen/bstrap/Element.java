/**
 */
package bstrap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bstrap.Element#getId <em>Id</em>}</li>
 *   <li>{@link bstrap.Element#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see bstrap.BstrapPackage#getElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link bstrap.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' attribute.
	 * @see #setClasses(String)
	 * @see bstrap.BstrapPackage#getElement_Classes()
	 * @model
	 * @generated
	 */
	String getClasses();

	/**
	 * Sets the value of the '{@link bstrap.Element#getClasses <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' attribute.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(String value);

} // Element
