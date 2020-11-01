/**
 */
package bal.impl;

import bal.Article;
import bal.BAL;
import bal.BalPackage;
import bal.Command;
import bal.Level;
import bal.Library;
import bal.Members;
import bal.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BAL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bal.impl.BALImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link bal.impl.BALImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link bal.impl.BALImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link bal.impl.BALImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link bal.impl.BALImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link bal.impl.BALImpl#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BALImpl extends MinimalEObjectImpl.Container implements BAL {
	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected Library library;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected Members members;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> levels;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> command;

	/**
	 * The cached value of the '{@link #getArticles() <em>Articles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticles()
	 * @generated
	 * @ordered
	 */
	protected EList<Article> articles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BALImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BalPackage.Literals.BAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(Library newLibrary, NotificationChain msgs) {
		Library oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BalPackage.BAL__LIBRARY,
					oldLibrary, newLibrary);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(Library newLibrary) {
		if (newLibrary != library) {
			NotificationChain msgs = null;
			if (library != null)
				msgs = ((InternalEObject) library).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BalPackage.BAL__LIBRARY, null, msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject) newLibrary).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BalPackage.BAL__LIBRARY, null, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BalPackage.BAL__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Members getMembers() {
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembers(Members newMembers, NotificationChain msgs) {
		Members oldMembers = members;
		members = newMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BalPackage.BAL__MEMBERS,
					oldMembers, newMembers);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembers(Members newMembers) {
		if (newMembers != members) {
			NotificationChain msgs = null;
			if (members != null)
				msgs = ((InternalEObject) members).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BalPackage.BAL__MEMBERS, null, msgs);
			if (newMembers != null)
				msgs = ((InternalEObject) newMembers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BalPackage.BAL__MEMBERS, null, msgs);
			msgs = basicSetMembers(newMembers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BalPackage.BAL__MEMBERS, newMembers, newMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, BalPackage.BAL__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Level> getLevels() {
		if (levels == null) {
			levels = new EObjectContainmentEList<Level>(Level.class, this, BalPackage.BAL__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Command>(Command.class, this, BalPackage.BAL__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Article> getArticles() {
		if (articles == null) {
			articles = new EObjectContainmentEList<Article>(Article.class, this, BalPackage.BAL__ARTICLES);
		}
		return articles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BalPackage.BAL__LIBRARY:
			return basicSetLibrary(null, msgs);
		case BalPackage.BAL__MEMBERS:
			return basicSetMembers(null, msgs);
		case BalPackage.BAL__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
		case BalPackage.BAL__LEVELS:
			return ((InternalEList<?>) getLevels()).basicRemove(otherEnd, msgs);
		case BalPackage.BAL__COMMAND:
			return ((InternalEList<?>) getCommand()).basicRemove(otherEnd, msgs);
		case BalPackage.BAL__ARTICLES:
			return ((InternalEList<?>) getArticles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BalPackage.BAL__LIBRARY:
			return getLibrary();
		case BalPackage.BAL__MEMBERS:
			return getMembers();
		case BalPackage.BAL__USERS:
			return getUsers();
		case BalPackage.BAL__LEVELS:
			return getLevels();
		case BalPackage.BAL__COMMAND:
			return getCommand();
		case BalPackage.BAL__ARTICLES:
			return getArticles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BalPackage.BAL__LIBRARY:
			setLibrary((Library) newValue);
			return;
		case BalPackage.BAL__MEMBERS:
			setMembers((Members) newValue);
			return;
		case BalPackage.BAL__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
			return;
		case BalPackage.BAL__LEVELS:
			getLevels().clear();
			getLevels().addAll((Collection<? extends Level>) newValue);
			return;
		case BalPackage.BAL__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends Command>) newValue);
			return;
		case BalPackage.BAL__ARTICLES:
			getArticles().clear();
			getArticles().addAll((Collection<? extends Article>) newValue);
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
		case BalPackage.BAL__LIBRARY:
			setLibrary((Library) null);
			return;
		case BalPackage.BAL__MEMBERS:
			setMembers((Members) null);
			return;
		case BalPackage.BAL__USERS:
			getUsers().clear();
			return;
		case BalPackage.BAL__LEVELS:
			getLevels().clear();
			return;
		case BalPackage.BAL__COMMAND:
			getCommand().clear();
			return;
		case BalPackage.BAL__ARTICLES:
			getArticles().clear();
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
		case BalPackage.BAL__LIBRARY:
			return library != null;
		case BalPackage.BAL__MEMBERS:
			return members != null;
		case BalPackage.BAL__USERS:
			return users != null && !users.isEmpty();
		case BalPackage.BAL__LEVELS:
			return levels != null && !levels.isEmpty();
		case BalPackage.BAL__COMMAND:
			return command != null && !command.isEmpty();
		case BalPackage.BAL__ARTICLES:
			return articles != null && !articles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BALImpl
