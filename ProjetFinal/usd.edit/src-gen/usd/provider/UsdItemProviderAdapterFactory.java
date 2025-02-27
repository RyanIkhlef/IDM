/**
 */
package usd.provider;

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

import usd.util.UsdAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UsdItemProviderAdapterFactory extends UsdAdapterFactory
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
	public UsdItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.SiteRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteRootItemProvider siteRootItemProvider;

	/**
	 * This creates an adapter for a {@link usd.SiteRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSiteRootAdapter() {
		if (siteRootItemProvider == null) {
			siteRootItemProvider = new SiteRootItemProvider(this);
		}

		return siteRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Page} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageItemProvider pageItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageAdapter() {
		if (pageItemProvider == null) {
			pageItemProvider = new PageItemProvider(this);
		}

		return pageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Paragraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphItemProvider paragraphItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParagraphAdapter() {
		if (paragraphItemProvider == null) {
			paragraphItemProvider = new ParagraphItemProvider(this);
		}

		return paragraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Title} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleItemProvider titleItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Title}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTitleAdapter() {
		if (titleItemProvider == null) {
			titleItemProvider = new TitleItemProvider(this);
		}

		return titleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.ImportantText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportantTextItemProvider importantTextItemProvider;

	/**
	 * This creates an adapter for a {@link usd.ImportantText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportantTextAdapter() {
		if (importantTextItemProvider == null) {
			importantTextItemProvider = new ImportantTextItemProvider(this);
		}

		return importantTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Div} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivItemProvider divItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Div}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivAdapter() {
		if (divItemProvider == null) {
			divItemProvider = new DivItemProvider(this);
		}

		return divItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Span} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanItemProvider spanItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Span}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpanAdapter() {
		if (spanItemProvider == null) {
			spanItemProvider = new SpanItemProvider(this);
		}

		return spanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.UnorderedList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnorderedListItemProvider unorderedListItemProvider;

	/**
	 * This creates an adapter for a {@link usd.UnorderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnorderedListAdapter() {
		if (unorderedListItemProvider == null) {
			unorderedListItemProvider = new UnorderedListItemProvider(this);
		}

		return unorderedListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.OrderedList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedListItemProvider orderedListItemProvider;

	/**
	 * This creates an adapter for a {@link usd.OrderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderedListAdapter() {
		if (orderedListItemProvider == null) {
			orderedListItemProvider = new OrderedListItemProvider(this);
		}

		return orderedListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Section} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionItemProvider sectionItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionAdapter() {
		if (sectionItemProvider == null) {
			sectionItemProvider = new SectionItemProvider(this);
		}

		return sectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Emphasis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmphasisItemProvider emphasisItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Emphasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmphasisAdapter() {
		if (emphasisItemProvider == null) {
			emphasisItemProvider = new EmphasisItemProvider(this);
		}

		return emphasisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Code} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeItemProvider codeItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeAdapter() {
		if (codeItemProvider == null) {
			codeItemProvider = new CodeItemProvider(this);
		}

		return codeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.CodeBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockItemProvider codeBlockItemProvider;

	/**
	 * This creates an adapter for a {@link usd.CodeBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeBlockAdapter() {
		if (codeBlockItemProvider == null) {
			codeBlockItemProvider = new CodeBlockItemProvider(this);
		}

		return codeBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.CodeLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeLineItemProvider codeLineItemProvider;

	/**
	 * This creates an adapter for a {@link usd.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeLineAdapter() {
		if (codeLineItemProvider == null) {
			codeLineItemProvider = new CodeLineItemProvider(this);
		}

		return codeLineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.BlockQuote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockQuoteItemProvider blockQuoteItemProvider;

	/**
	 * This creates an adapter for a {@link usd.BlockQuote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockQuoteAdapter() {
		if (blockQuoteItemProvider == null) {
			blockQuoteItemProvider = new BlockQuoteItemProvider(this);
		}

		return blockQuoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link usd.Line} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineItemProvider lineItemProvider;

	/**
	 * This creates an adapter for a {@link usd.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineAdapter() {
		if (lineItemProvider == null) {
			lineItemProvider = new LineItemProvider(this);
		}

		return lineItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void dispose() {
		if (siteRootItemProvider != null)
			siteRootItemProvider.dispose();
		if (pageItemProvider != null)
			pageItemProvider.dispose();
		if (paragraphItemProvider != null)
			paragraphItemProvider.dispose();
		if (titleItemProvider != null)
			titleItemProvider.dispose();
		if (importantTextItemProvider != null)
			importantTextItemProvider.dispose();
		if (divItemProvider != null)
			divItemProvider.dispose();
		if (spanItemProvider != null)
			spanItemProvider.dispose();
		if (unorderedListItemProvider != null)
			unorderedListItemProvider.dispose();
		if (orderedListItemProvider != null)
			orderedListItemProvider.dispose();
		if (sectionItemProvider != null)
			sectionItemProvider.dispose();
		if (linkItemProvider != null)
			linkItemProvider.dispose();
		if (buttonItemProvider != null)
			buttonItemProvider.dispose();
		if (emphasisItemProvider != null)
			emphasisItemProvider.dispose();
		if (textItemProvider != null)
			textItemProvider.dispose();
		if (imageItemProvider != null)
			imageItemProvider.dispose();
		if (codeItemProvider != null)
			codeItemProvider.dispose();
		if (codeBlockItemProvider != null)
			codeBlockItemProvider.dispose();
		if (codeLineItemProvider != null)
			codeLineItemProvider.dispose();
		if (blockQuoteItemProvider != null)
			blockQuoteItemProvider.dispose();
		if (lineItemProvider != null)
			lineItemProvider.dispose();
	}

}
