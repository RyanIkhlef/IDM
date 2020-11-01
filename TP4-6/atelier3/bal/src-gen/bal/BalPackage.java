/**
 */
package bal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bal.BalFactory
 * @model kind="package"
 * @generated
 */
public interface BalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BalPackage eINSTANCE = bal.impl.BalPackageImpl.init();

	/**
	 * The meta object id for the '{@link bal.impl.BALImpl <em>BAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.BALImpl
	 * @see bal.impl.BalPackageImpl#getBAL()
	 * @generated
	 */
	int BAL = 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL__USERS = 2;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL__LEVELS = 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL__COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL__ARTICLES = 5;

	/**
	 * The number of structural features of the '<em>BAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>BAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.LibraryImpl
	 * @see bal.impl.BalPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BOOKS = 0;

	/**
	 * The feature id for the '<em><b>Borrowed Books</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BORROWED_BOOKS = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.ArticleImpl
	 * @see bal.impl.BalPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 12;

	/**
	 * The meta object id for the '{@link bal.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.BookImpl
	 * @see bal.impl.BalPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.LevelImpl
	 * @see bal.impl.BalPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Classlevels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__CLASSLEVELS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.ClassLevelImpl <em>Class Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.ClassLevelImpl
	 * @see bal.impl.BalPackageImpl#getClassLevel()
	 * @generated
	 */
	int CLASS_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Subjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL__SUBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Class Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.SubjectImpl
	 * @see bal.impl.BalPackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Books</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__BOOKS = 1;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.UserImpl
	 * @see bal.impl.BalPackageImpl#getUser()
	 * @generated
	 */
	int USER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SURNAME = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.ParentImpl
	 * @see bal.impl.BalPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__SURNAME = USER__SURNAME;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bal.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.StudentImpl
	 * @see bal.impl.BalPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SURNAME = USER__SURNAME;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COMMAND = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PARENT = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PAYMENTS = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bal.impl.MembersImpl <em>Members</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.MembersImpl
	 * @see bal.impl.BalPackageImpl#getMembers()
	 * @generated
	 */
	int MEMBERS = 9;

	/**
	 * The feature id for the '<em><b>Students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS__STUDENTS = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Members</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.CommandImpl
	 * @see bal.impl.BalPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 10;

	/**
	 * The feature id for the '<em><b>Commandlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMANDLINES = 0;

	/**
	 * The feature id for the '<em><b>Is Delivred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__IS_DELIVRED = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.CommandLineImpl <em>Command Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.CommandLineImpl
	 * @see bal.impl.BalPackageImpl#getCommandLine()
	 * @generated
	 */
	int COMMAND_LINE = 11;

	/**
	 * The feature id for the '<em><b>Article</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__ARTICLE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE__BOOK = 2;

	/**
	 * The number of structural features of the '<em>Command Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Command Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bal.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bal.impl.PaymentImpl
	 * @see bal.impl.BalPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 13;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link bal.BAL <em>BAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAL</em>'.
	 * @see bal.BAL
	 * @generated
	 */
	EClass getBAL();

	/**
	 * Returns the meta object for the containment reference '{@link bal.BAL#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see bal.BAL#getLibrary()
	 * @see #getBAL()
	 * @generated
	 */
	EReference getBAL_Library();

	/**
	 * Returns the meta object for the containment reference '{@link bal.BAL#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Members</em>'.
	 * @see bal.BAL#getMembers()
	 * @see #getBAL()
	 * @generated
	 */
	EReference getBAL_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.BAL#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see bal.BAL#getUsers()
	 * @see #getBAL()
	 * @generated
	 */
	EReference getBAL_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.BAL#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see bal.BAL#getLevels()
	 * @see #getBAL()
	 * @generated
	 */
	EReference getBAL_Levels();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.BAL#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see bal.BAL#getCommand()
	 * @see #getBAL()
	 * @generated
	 */
	EReference getBAL_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.BAL#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see bal.BAL#getArticles()
	 * @see #getBAL()
	 * @generated
	 */
	EReference getBAL_Articles();

	/**
	 * Returns the meta object for class '{@link bal.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see bal.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see bal.Library#getBooks()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Books();

	/**
	 * Returns the meta object for the attribute '{@link bal.Library#getBorrowedBooks <em>Borrowed Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borrowed Books</em>'.
	 * @see bal.Library#getBorrowedBooks()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_BorrowedBooks();

	/**
	 * Returns the meta object for class '{@link bal.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see bal.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link bal.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see bal.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the meta object for the attribute '{@link bal.Book#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see bal.Book#getQuantity()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Quantity();

	/**
	 * Returns the meta object for class '{@link bal.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see bal.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.Level#getClasslevels <em>Classlevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classlevels</em>'.
	 * @see bal.Level#getClasslevels()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Classlevels();

	/**
	 * Returns the meta object for the attribute '{@link bal.Level#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bal.Level#getName()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Name();

	/**
	 * Returns the meta object for class '{@link bal.ClassLevel <em>Class Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Level</em>'.
	 * @see bal.ClassLevel
	 * @generated
	 */
	EClass getClassLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.ClassLevel#getSubjects <em>Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subjects</em>'.
	 * @see bal.ClassLevel#getSubjects()
	 * @see #getClassLevel()
	 * @generated
	 */
	EReference getClassLevel_Subjects();

	/**
	 * Returns the meta object for the attribute '{@link bal.ClassLevel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bal.ClassLevel#getName()
	 * @see #getClassLevel()
	 * @generated
	 */
	EAttribute getClassLevel_Name();

	/**
	 * Returns the meta object for class '{@link bal.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see bal.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the attribute '{@link bal.Subject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bal.Subject#getName()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Name();

	/**
	 * Returns the meta object for the reference list '{@link bal.Subject#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books</em>'.
	 * @see bal.Subject#getBooks()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_Books();

	/**
	 * Returns the meta object for class '{@link bal.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see bal.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link bal.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bal.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link bal.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see bal.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for class '{@link bal.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see bal.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for class '{@link bal.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see bal.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the reference list '{@link bal.Student#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Command</em>'.
	 * @see bal.Student#getCommand()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.Student#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent</em>'.
	 * @see bal.Student#getParent()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Parent();

	/**
	 * Returns the meta object for the reference list '{@link bal.Student#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payments</em>'.
	 * @see bal.Student#getPayments()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Payments();

	/**
	 * Returns the meta object for class '{@link bal.Members <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Members</em>'.
	 * @see bal.Members
	 * @generated
	 */
	EClass getMembers();

	/**
	 * Returns the meta object for the reference list '{@link bal.Members#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students</em>'.
	 * @see bal.Members#getStudents()
	 * @see #getMembers()
	 * @generated
	 */
	EReference getMembers_Students();

	/**
	 * Returns the meta object for the reference list '{@link bal.Members#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see bal.Members#getCommands()
	 * @see #getMembers()
	 * @generated
	 */
	EReference getMembers_Commands();

	/**
	 * Returns the meta object for class '{@link bal.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see bal.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link bal.Command#getCommandlines <em>Commandlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commandlines</em>'.
	 * @see bal.Command#getCommandlines()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Commandlines();

	/**
	 * Returns the meta object for the attribute '{@link bal.Command#isIsDelivred <em>Is Delivred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Delivred</em>'.
	 * @see bal.Command#isIsDelivred()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_IsDelivred();

	/**
	 * Returns the meta object for class '{@link bal.CommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line</em>'.
	 * @see bal.CommandLine
	 * @generated
	 */
	EClass getCommandLine();

	/**
	 * Returns the meta object for the reference '{@link bal.CommandLine#getArticle <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Article</em>'.
	 * @see bal.CommandLine#getArticle()
	 * @see #getCommandLine()
	 * @generated
	 */
	EReference getCommandLine_Article();

	/**
	 * Returns the meta object for the attribute '{@link bal.CommandLine#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see bal.CommandLine#getQuantity()
	 * @see #getCommandLine()
	 * @generated
	 */
	EAttribute getCommandLine_Quantity();

	/**
	 * Returns the meta object for the reference '{@link bal.CommandLine#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Book</em>'.
	 * @see bal.CommandLine#getBook()
	 * @see #getCommandLine()
	 * @generated
	 */
	EReference getCommandLine_Book();

	/**
	 * Returns the meta object for class '{@link bal.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see bal.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link bal.Article#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bal.Article#getName()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Name();

	/**
	 * Returns the meta object for the attribute '{@link bal.Article#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see bal.Article#getQuantity()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Quantity();

	/**
	 * Returns the meta object for class '{@link bal.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see bal.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the reference '{@link bal.Payment#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see bal.Payment#getCommand()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Command();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BalFactory getBalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bal.impl.BALImpl <em>BAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.BALImpl
		 * @see bal.impl.BalPackageImpl#getBAL()
		 * @generated
		 */
		EClass BAL = eINSTANCE.getBAL();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAL__LIBRARY = eINSTANCE.getBAL_Library();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAL__MEMBERS = eINSTANCE.getBAL_Members();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAL__USERS = eINSTANCE.getBAL_Users();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAL__LEVELS = eINSTANCE.getBAL_Levels();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAL__COMMAND = eINSTANCE.getBAL_Command();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAL__ARTICLES = eINSTANCE.getBAL_Articles();

		/**
		 * The meta object literal for the '{@link bal.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.LibraryImpl
		 * @see bal.impl.BalPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__BOOKS = eINSTANCE.getLibrary_Books();

		/**
		 * The meta object literal for the '<em><b>Borrowed Books</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__BORROWED_BOOKS = eINSTANCE.getLibrary_BorrowedBooks();

		/**
		 * The meta object literal for the '{@link bal.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.BookImpl
		 * @see bal.impl.BalPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__QUANTITY = eINSTANCE.getBook_Quantity();

		/**
		 * The meta object literal for the '{@link bal.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.LevelImpl
		 * @see bal.impl.BalPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Classlevels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__CLASSLEVELS = eINSTANCE.getLevel_Classlevels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__NAME = eINSTANCE.getLevel_Name();

		/**
		 * The meta object literal for the '{@link bal.impl.ClassLevelImpl <em>Class Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.ClassLevelImpl
		 * @see bal.impl.BalPackageImpl#getClassLevel()
		 * @generated
		 */
		EClass CLASS_LEVEL = eINSTANCE.getClassLevel();

		/**
		 * The meta object literal for the '<em><b>Subjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LEVEL__SUBJECTS = eINSTANCE.getClassLevel_Subjects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LEVEL__NAME = eINSTANCE.getClassLevel_Name();

		/**
		 * The meta object literal for the '{@link bal.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.SubjectImpl
		 * @see bal.impl.BalPackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__NAME = eINSTANCE.getSubject_Name();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__BOOKS = eINSTANCE.getSubject_Books();

		/**
		 * The meta object literal for the '{@link bal.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.UserImpl
		 * @see bal.impl.BalPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SURNAME = eINSTANCE.getUser_Surname();

		/**
		 * The meta object literal for the '{@link bal.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.ParentImpl
		 * @see bal.impl.BalPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '{@link bal.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.StudentImpl
		 * @see bal.impl.BalPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__COMMAND = eINSTANCE.getStudent_Command();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__PARENT = eINSTANCE.getStudent_Parent();

		/**
		 * The meta object literal for the '<em><b>Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__PAYMENTS = eINSTANCE.getStudent_Payments();

		/**
		 * The meta object literal for the '{@link bal.impl.MembersImpl <em>Members</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.MembersImpl
		 * @see bal.impl.BalPackageImpl#getMembers()
		 * @generated
		 */
		EClass MEMBERS = eINSTANCE.getMembers();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERS__STUDENTS = eINSTANCE.getMembers_Students();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERS__COMMANDS = eINSTANCE.getMembers_Commands();

		/**
		 * The meta object literal for the '{@link bal.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.CommandImpl
		 * @see bal.impl.BalPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Commandlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__COMMANDLINES = eINSTANCE.getCommand_Commandlines();

		/**
		 * The meta object literal for the '<em><b>Is Delivred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__IS_DELIVRED = eINSTANCE.getCommand_IsDelivred();

		/**
		 * The meta object literal for the '{@link bal.impl.CommandLineImpl <em>Command Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.CommandLineImpl
		 * @see bal.impl.BalPackageImpl#getCommandLine()
		 * @generated
		 */
		EClass COMMAND_LINE = eINSTANCE.getCommandLine();

		/**
		 * The meta object literal for the '<em><b>Article</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE__ARTICLE = eINSTANCE.getCommandLine_Article();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE__QUANTITY = eINSTANCE.getCommandLine_Quantity();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE__BOOK = eINSTANCE.getCommandLine_Book();

		/**
		 * The meta object literal for the '{@link bal.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.ArticleImpl
		 * @see bal.impl.BalPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__NAME = eINSTANCE.getArticle_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__QUANTITY = eINSTANCE.getArticle_Quantity();

		/**
		 * The meta object literal for the '{@link bal.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bal.impl.PaymentImpl
		 * @see bal.impl.BalPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__COMMAND = eINSTANCE.getPayment_Command();

	}

} //BalPackage
