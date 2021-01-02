/**
 */
package bstrap.impl;

import bstrap.BstrapPackage;
import bstrap.Button;
import bstrap.ButtonGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bstrap.impl.ButtonGroupImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link bstrap.impl.ButtonGroupImpl#getSize <em>Size</em>}</li>
 *   <li>{@link bstrap.impl.ButtonGroupImpl#isIsVertical <em>Is Vertical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonGroupImpl extends ElementImpl implements ButtonGroup {
	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> buttons;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsVertical() <em>Is Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VERTICAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsVertical() <em>Is Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean isVertical = IS_VERTICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.BUTTON_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButtons() {
		if (buttons == null) {
			buttons = new EObjectContainmentEList<Button>(Button.class, this, BstrapPackage.BUTTON_GROUP__BUTTONS);
		}
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON_GROUP__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVertical() {
		return isVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVertical(boolean newIsVertical) {
		boolean oldIsVertical = isVertical;
		isVertical = newIsVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON_GROUP__IS_VERTICAL,
					oldIsVertical, isVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.BUTTON_GROUP__BUTTONS:
			return ((InternalEList<?>) getButtons()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.BUTTON_GROUP__BUTTONS:
			return getButtons();
		case BstrapPackage.BUTTON_GROUP__SIZE:
			return getSize();
		case BstrapPackage.BUTTON_GROUP__IS_VERTICAL:
			return isIsVertical();
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
		case BstrapPackage.BUTTON_GROUP__BUTTONS:
			getButtons().clear();
			getButtons().addAll((Collection<? extends Button>) newValue);
			return;
		case BstrapPackage.BUTTON_GROUP__SIZE:
			setSize((String) newValue);
			return;
		case BstrapPackage.BUTTON_GROUP__IS_VERTICAL:
			setIsVertical((Boolean) newValue);
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
		case BstrapPackage.BUTTON_GROUP__BUTTONS:
			getButtons().clear();
			return;
		case BstrapPackage.BUTTON_GROUP__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case BstrapPackage.BUTTON_GROUP__IS_VERTICAL:
			setIsVertical(IS_VERTICAL_EDEFAULT);
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
		case BstrapPackage.BUTTON_GROUP__BUTTONS:
			return buttons != null && !buttons.isEmpty();
		case BstrapPackage.BUTTON_GROUP__SIZE:
			return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
		case BstrapPackage.BUTTON_GROUP__IS_VERTICAL:
			return isVertical != IS_VERTICAL_EDEFAULT;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", isVertical: ");
		result.append(isVertical);
		result.append(')');
		return result.toString();
	}

} //ButtonGroupImpl
