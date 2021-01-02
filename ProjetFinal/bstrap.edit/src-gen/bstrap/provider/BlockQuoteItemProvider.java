/**
 */
package bstrap.provider;

import bstrap.BlockQuote;
import bstrap.BstrapFactory;
import bstrap.BstrapPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bstrap.BlockQuote} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockQuoteItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockQuoteItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BlockQuote.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BlockQuote"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BlockQuote) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_BlockQuote_type")
				: getString("_UI_BlockQuote_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BlockQuote.class)) {
		case BstrapPackage.BLOCK_QUOTE__QUOTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createButtonGroup()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createNavbar()));

		newChildDescriptors.add(
				createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES, BstrapFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createTitle()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add(
				createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES, BstrapFactory.eINSTANCE.createText()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createPrimaryButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createSecondaryButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createSuccessButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createInfoButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createWarningButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createDarkButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createLightButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createLinkButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createDangerButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createCodeLine()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createCodeBlock()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createBoldText()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createItalicText()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createUnorderedList()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createOrderedList()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES,
				BstrapFactory.eINSTANCE.createBlockQuote()));

		newChildDescriptors.add(
				createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES, BstrapFactory.eINSTANCE.createLine()));

		newChildDescriptors.add(
				createChildParameter(BstrapPackage.Literals.BLOCK_QUOTE__QUOTES, BstrapFactory.eINSTANCE.createCode()));
	}

}
