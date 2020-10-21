/**
 */
package bal.impl;

import bal.Article;
import bal.BalPackage;
import bal.Book;
import bal.CommandLine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bal.impl.CommandLineImpl#getArticle <em>Article</em>}</li>
 *   <li>{@link bal.impl.CommandLineImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link bal.impl.CommandLineImpl#getBook <em>Book</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandLineImpl extends MinimalEObjectImpl.Container implements CommandLine {
	/**
	 * The cached value of the '{@link #getArticle() <em>Article</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticle()
	 * @generated
	 * @ordered
	 */
	protected Article article;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBook() <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBook()
	 * @generated
	 * @ordered
	 */
	protected Book book;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BalPackage.Literals.COMMAND_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article getArticle() {
		if (article != null && article.eIsProxy()) {
			InternalEObject oldArticle = (InternalEObject) article;
			article = (Article) eResolveProxy(oldArticle);
			if (article != oldArticle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BalPackage.COMMAND_LINE__ARTICLE,
							oldArticle, article));
			}
		}
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article basicGetArticle() {
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArticle(Article newArticle) {
		Article oldArticle = article;
		article = newArticle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BalPackage.COMMAND_LINE__ARTICLE, oldArticle,
					article));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BalPackage.COMMAND_LINE__QUANTITY, oldQuantity,
					quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book getBook() {
		if (book != null && book.eIsProxy()) {
			InternalEObject oldBook = (InternalEObject) book;
			book = (Book) eResolveProxy(oldBook);
			if (book != oldBook) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BalPackage.COMMAND_LINE__BOOK, oldBook,
							book));
			}
		}
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book basicGetBook() {
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBook(Book newBook) {
		Book oldBook = book;
		book = newBook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BalPackage.COMMAND_LINE__BOOK, oldBook, book));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BalPackage.COMMAND_LINE__ARTICLE:
			if (resolve)
				return getArticle();
			return basicGetArticle();
		case BalPackage.COMMAND_LINE__QUANTITY:
			return getQuantity();
		case BalPackage.COMMAND_LINE__BOOK:
			if (resolve)
				return getBook();
			return basicGetBook();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BalPackage.COMMAND_LINE__ARTICLE:
			setArticle((Article) newValue);
			return;
		case BalPackage.COMMAND_LINE__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case BalPackage.COMMAND_LINE__BOOK:
			setBook((Book) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BalPackage.COMMAND_LINE__ARTICLE:
			setArticle((Article) null);
			return;
		case BalPackage.COMMAND_LINE__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case BalPackage.COMMAND_LINE__BOOK:
			setBook((Book) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BalPackage.COMMAND_LINE__ARTICLE:
			return article != null;
		case BalPackage.COMMAND_LINE__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case BalPackage.COMMAND_LINE__BOOK:
			return book != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //CommandLineImpl
