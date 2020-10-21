/**
 */
package bal.provider;

import bal.util.BalAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BalItemProviderAdapterFactory extends BalAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.BAL} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BALItemProvider balItemProvider;

	/**
	 * This creates an adapter for a {@link bal.BAL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBALAdapter() {
		if (balItemProvider == null) {
			balItemProvider = new BALItemProvider(this);
		}

		return balItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Library} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryItemProvider libraryItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryAdapter() {
		if (libraryItemProvider == null) {
			libraryItemProvider = new LibraryItemProvider(this);
		}

		return libraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Book} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookItemProvider bookItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Book}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBookAdapter() {
		if (bookItemProvider == null) {
			bookItemProvider = new BookItemProvider(this);
		}

		return bookItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Level} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelItemProvider levelItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLevelAdapter() {
		if (levelItemProvider == null) {
			levelItemProvider = new LevelItemProvider(this);
		}

		return levelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.ClassLevel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassLevelItemProvider classLevelItemProvider;

	/**
	 * This creates an adapter for a {@link bal.ClassLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassLevelAdapter() {
		if (classLevelItemProvider == null) {
			classLevelItemProvider = new ClassLevelItemProvider(this);
		}

		return classLevelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Subject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectItemProvider subjectItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubjectAdapter() {
		if (subjectItemProvider == null) {
			subjectItemProvider = new SubjectItemProvider(this);
		}

		return subjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Parent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentItemProvider parentItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Parent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParentAdapter() {
		if (parentItemProvider == null) {
			parentItemProvider = new ParentItemProvider(this);
		}

		return parentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Student} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentItemProvider studentItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudentAdapter() {
		if (studentItemProvider == null) {
			studentItemProvider = new StudentItemProvider(this);
		}

		return studentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Members} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembersItemProvider membersItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Members}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMembersAdapter() {
		if (membersItemProvider == null) {
			membersItemProvider = new MembersItemProvider(this);
		}

		return membersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.CommandLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineItemProvider commandLineItemProvider;

	/**
	 * This creates an adapter for a {@link bal.CommandLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandLineAdapter() {
		if (commandLineItemProvider == null) {
			commandLineItemProvider = new CommandLineItemProvider(this);
		}

		return commandLineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Article} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleItemProvider articleItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArticleAdapter() {
		if (articleItemProvider == null) {
			articleItemProvider = new ArticleItemProvider(this);
		}

		return articleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bal.Payment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentItemProvider paymentItemProvider;

	/**
	 * This creates an adapter for a {@link bal.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaymentAdapter() {
		if (paymentItemProvider == null) {
			paymentItemProvider = new PaymentItemProvider(this);
		}

		return paymentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (balItemProvider != null)
			balItemProvider.dispose();
		if (libraryItemProvider != null)
			libraryItemProvider.dispose();
		if (bookItemProvider != null)
			bookItemProvider.dispose();
		if (levelItemProvider != null)
			levelItemProvider.dispose();
		if (classLevelItemProvider != null)
			classLevelItemProvider.dispose();
		if (subjectItemProvider != null)
			subjectItemProvider.dispose();
		if (parentItemProvider != null)
			parentItemProvider.dispose();
		if (studentItemProvider != null)
			studentItemProvider.dispose();
		if (membersItemProvider != null)
			membersItemProvider.dispose();
		if (commandItemProvider != null)
			commandItemProvider.dispose();
		if (commandLineItemProvider != null)
			commandLineItemProvider.dispose();
		if (articleItemProvider != null)
			articleItemProvider.dispose();
		if (paymentItemProvider != null)
			paymentItemProvider.dispose();
	}

}
