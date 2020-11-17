/**
 */
package website;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link website.HTMLElement#getId <em>Id</em>}</li>
 *   <li>{@link website.HTMLElement#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see website.WebsitePackage#getHTMLElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='idIsRequire idMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot idIsRequire='\n\t\t\tHTMLElement.allInstances()-&gt;select(elem : HTMLElement | elem.id = \'\')-&gt;isEmpty()' idMustBeUnique='\n\t\t\tHTMLElement.allInstances()-&gt;select(elem : HTMLElement | elem &lt;&gt; self and elem.id = self.id)-&gt;isEmpty()'"
 * @generated
 */
public interface HTMLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see website.WebsitePackage#getHTMLElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link website.HTMLElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute list.
	 * @see website.WebsitePackage#getHTMLElement_Class()
	 * @model
	 * @generated
	 */
	EList<String> getClass_();

} // HTMLElement
