/**
 */
package usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.List#getListElement <em>List Element</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getList()
 * @model abstract="true"
 * @generated
 */
public interface List extends Element {
	/**
	 * Returns the value of the '<em><b>List Element</b></em>' containment reference list.
	 * The list contents are of type {@link usd.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Element</em>' containment reference list.
	 * @see usd.UsdPackage#getList_ListElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getListElement();

} // List
