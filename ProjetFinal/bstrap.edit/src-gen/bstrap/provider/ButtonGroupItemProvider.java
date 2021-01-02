/**
 */
package bstrap.provider;

import bstrap.BstrapFactory;
import bstrap.BstrapPackage;
import bstrap.ButtonGroup;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bstrap.ButtonGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ButtonGroupItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonGroupItemProvider(AdapterFactory adapterFactory) {
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

			addSizePropertyDescriptor(object);
			addIsVerticalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ButtonGroup_size_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ButtonGroup_size_feature",
								"_UI_ButtonGroup_type"),
						BstrapPackage.Literals.BUTTON_GROUP__SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Vertical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsVerticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ButtonGroup_isVertical_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ButtonGroup_isVertical_feature",
								"_UI_ButtonGroup_type"),
						BstrapPackage.Literals.BUTTON_GROUP__IS_VERTICAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS);
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
	 * This returns ButtonGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ButtonGroup"));
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
		String label = ((ButtonGroup) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_ButtonGroup_type")
				: getString("_UI_ButtonGroup_type") + " " + label;
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

		switch (notification.getFeatureID(ButtonGroup.class)) {
		case BstrapPackage.BUTTON_GROUP__SIZE:
		case BstrapPackage.BUTTON_GROUP__IS_VERTICAL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BstrapPackage.BUTTON_GROUP__BUTTONS:
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

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createPrimaryButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createSecondaryButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createSuccessButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createInfoButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createWarningButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createDarkButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createLightButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createLinkButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.BUTTON_GROUP__BUTTONS,
				BstrapFactory.eINSTANCE.createDangerButton()));
	}

}
