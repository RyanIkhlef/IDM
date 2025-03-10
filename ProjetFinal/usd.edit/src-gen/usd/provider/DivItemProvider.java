/**
 */
package usd.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import usd.Div;
import usd.UsdFactory;
import usd.UsdPackage;

/**
 * This is the item provider adapter for a {@link usd.Div} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DivItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(UsdPackage.Literals.DIV__DIV_CONTENTS);
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
	 * This returns Div.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Div"));
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
		String label = ((Div) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Div_type")
				: getString("_UI_Div_type") + " " + label;
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

		switch (notification.getFeatureID(Div.class)) {
		case UsdPackage.DIV__DIV_CONTENTS:
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

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createParagraph()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createTitle()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS,
				UsdFactory.eINSTANCE.createImportantText()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createDiv()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createSpan()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS,
				UsdFactory.eINSTANCE.createUnorderedList()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createOrderedList()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createSection()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createLink()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createEmphasis()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createText()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createImage()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createCode()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createCodeBlock()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createCodeLine()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createBlockQuote()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.DIV__DIV_CONTENTS, UsdFactory.eINSTANCE.createLine()));
	}

}
