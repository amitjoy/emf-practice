/**
 */
package production;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link production.Category#getName <em>Name</em>}</li>
 *   <li>{@link production.Category#getArticles <em>Articles</em>}</li>
 * </ul>
 * </p>
 *
 * @see production.ProductionPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link production.ContentGenre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see production.ContentGenre
	 * @see #setName(ContentGenre)
	 * @see production.ProductionPackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	ContentGenre getName();

	/**
	 * Sets the value of the '{@link production.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see production.ContentGenre
	 * @see #getName()
	 * @generated
	 */
	void setName(ContentGenre value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link production.Article}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see production.ProductionPackage#getCategory_Articles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticles();

} // Category
