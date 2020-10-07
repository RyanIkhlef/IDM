/**
 */
package bal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bal.ClassLevel#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link bal.ClassLevel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bal.BalPackage#getClassLevel()
 * @model
 * @generated
 */
public interface ClassLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' containment reference list.
	 * The list contents are of type {@link bal.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjects</em>' containment reference list.
	 * @see bal.BalPackage#getClassLevel_Subjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subject> getSubjects();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bal.BalPackage#getClassLevel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bal.ClassLevel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ClassLevel
