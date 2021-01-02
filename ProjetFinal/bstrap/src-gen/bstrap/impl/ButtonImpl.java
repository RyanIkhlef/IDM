/**
 */
package bstrap.impl;

import bstrap.BstrapPackage;
import bstrap.Button;
import bstrap.Link;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bstrap.impl.ButtonImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link bstrap.impl.ButtonImpl#getSize <em>Size</em>}</li>
 *   <li>{@link bstrap.impl.ButtonImpl#isIsOutline <em>Is Outline</em>}</li>
 *   <li>{@link bstrap.impl.ButtonImpl#isIsEnable <em>Is Enable</em>}</li>
 *   <li>{@link bstrap.impl.ButtonImpl#isIsSpinner <em>Is Spinner</em>}</li>
 *   <li>{@link bstrap.impl.ButtonImpl#isIsBlockButton <em>Is Block Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends TextElementImpl implements Button {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Link target;

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
	 * The default value of the '{@link #isIsOutline() <em>Is Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OUTLINE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsOutline() <em>Is Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean isOutline = IS_OUTLINE_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsEnable() <em>Is Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isIsEnable() <em>Is Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnable()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnable = IS_ENABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsSpinner() <em>Is Spinner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSpinner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SPINNER_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsSpinner() <em>Is Spinner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSpinner()
	 * @generated
	 * @ordered
	 */
	protected boolean isSpinner = IS_SPINNER_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsBlockButton() <em>Is Block Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlockButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BLOCK_BUTTON_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsBlockButton() <em>Is Block Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlockButton()
	 * @generated
	 * @ordered
	 */
	protected boolean isBlockButton = IS_BLOCK_BUTTON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Link newTarget, NotificationChain msgs) {
		Link oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON__TARGET,
					oldTarget, newTarget);
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
	@Override
	public void setTarget(Link newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BstrapPackage.BUTTON__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BstrapPackage.BUTTON__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON__TARGET, newTarget, newTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsOutline() {
		return isOutline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOutline(boolean newIsOutline) {
		boolean oldIsOutline = isOutline;
		isOutline = newIsOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON__IS_OUTLINE, oldIsOutline,
					isOutline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsEnable() {
		return isEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEnable(boolean newIsEnable) {
		boolean oldIsEnable = isEnable;
		isEnable = newIsEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON__IS_ENABLE, oldIsEnable,
					isEnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSpinner() {
		return isSpinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSpinner(boolean newIsSpinner) {
		boolean oldIsSpinner = isSpinner;
		isSpinner = newIsSpinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON__IS_SPINNER, oldIsSpinner,
					isSpinner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBlockButton() {
		return isBlockButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBlockButton(boolean newIsBlockButton) {
		boolean oldIsBlockButton = isBlockButton;
		isBlockButton = newIsBlockButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.BUTTON__IS_BLOCK_BUTTON,
					oldIsBlockButton, isBlockButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.BUTTON__TARGET:
			return basicSetTarget(null, msgs);
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
		case BstrapPackage.BUTTON__TARGET:
			return getTarget();
		case BstrapPackage.BUTTON__SIZE:
			return getSize();
		case BstrapPackage.BUTTON__IS_OUTLINE:
			return isIsOutline();
		case BstrapPackage.BUTTON__IS_ENABLE:
			return isIsEnable();
		case BstrapPackage.BUTTON__IS_SPINNER:
			return isIsSpinner();
		case BstrapPackage.BUTTON__IS_BLOCK_BUTTON:
			return isIsBlockButton();
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
		case BstrapPackage.BUTTON__TARGET:
			setTarget((Link) newValue);
			return;
		case BstrapPackage.BUTTON__SIZE:
			setSize((String) newValue);
			return;
		case BstrapPackage.BUTTON__IS_OUTLINE:
			setIsOutline((Boolean) newValue);
			return;
		case BstrapPackage.BUTTON__IS_ENABLE:
			setIsEnable((Boolean) newValue);
			return;
		case BstrapPackage.BUTTON__IS_SPINNER:
			setIsSpinner((Boolean) newValue);
			return;
		case BstrapPackage.BUTTON__IS_BLOCK_BUTTON:
			setIsBlockButton((Boolean) newValue);
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
		case BstrapPackage.BUTTON__TARGET:
			setTarget((Link) null);
			return;
		case BstrapPackage.BUTTON__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case BstrapPackage.BUTTON__IS_OUTLINE:
			setIsOutline(IS_OUTLINE_EDEFAULT);
			return;
		case BstrapPackage.BUTTON__IS_ENABLE:
			setIsEnable(IS_ENABLE_EDEFAULT);
			return;
		case BstrapPackage.BUTTON__IS_SPINNER:
			setIsSpinner(IS_SPINNER_EDEFAULT);
			return;
		case BstrapPackage.BUTTON__IS_BLOCK_BUTTON:
			setIsBlockButton(IS_BLOCK_BUTTON_EDEFAULT);
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
		case BstrapPackage.BUTTON__TARGET:
			return target != null;
		case BstrapPackage.BUTTON__SIZE:
			return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
		case BstrapPackage.BUTTON__IS_OUTLINE:
			return isOutline != IS_OUTLINE_EDEFAULT;
		case BstrapPackage.BUTTON__IS_ENABLE:
			return isEnable != IS_ENABLE_EDEFAULT;
		case BstrapPackage.BUTTON__IS_SPINNER:
			return isSpinner != IS_SPINNER_EDEFAULT;
		case BstrapPackage.BUTTON__IS_BLOCK_BUTTON:
			return isBlockButton != IS_BLOCK_BUTTON_EDEFAULT;
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
		result.append(", isOutline: ");
		result.append(isOutline);
		result.append(", isEnable: ");
		result.append(isEnable);
		result.append(", isSpinner: ");
		result.append(isSpinner);
		result.append(", isBlockButton: ");
		result.append(isBlockButton);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl
