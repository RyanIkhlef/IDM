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

import usd.Span;
import usd.UsdFactory;
import usd.UsdPackage;

/**
 * This is the item provider adapter for a {@link usd.Span} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpanItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(UsdPackage.Literals.SPAN__SPAN_CONTENT);
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
	 * This returns Span.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Span"));
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
		String label = ((Span) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Span_type")
				: getString("_UI_Span_type") + " " + label;
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

		switch (notification.getFeatureID(Span.class)) {
		case UsdPackage.SPAN__SPAN_CONTENT:
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
				createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createParagraph()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createTitle()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT,
				UsdFactory.eINSTANCE.createImportantText()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createDiv()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createSpan()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT,
				UsdFactory.eINSTANCE.createUnorderedList()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createOrderedList()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createSection()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createLink()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createEmphasis()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createText()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createImage()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createCode()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createCodeBlock()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createCodeLine()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createBlockQuote()));

		newChildDescriptors
				.add(createChildParameter(UsdPackage.Literals.SPAN__SPAN_CONTENT, UsdFactory.eINSTANCE.createLine()));
	}

}
