/**
 */
package bstrap;

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
 *   <li>{@link bstrap.List#getListElements <em>List Elements</em>}</li>
 * </ul>
 *
 * @see bstrap.BstrapPackage#getList()
 * @model abstract="true"
 * @generated
 */
public interface List extends Element {
	/**
	 * Returns the value of the '<em><b>List Elements</b></em>' containment reference list.
	 * The list contents are of type {@link bstrap.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elements</em>' containment reference list.
	 * @see bstrap.BstrapPackage#getList_ListElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getListElements();

} // List
