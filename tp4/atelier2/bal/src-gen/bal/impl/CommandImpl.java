/**
 */
package bal.impl;

import bal.BalPackage;
import bal.Command;
import bal.CommandLine;

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
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bal.impl.CommandImpl#getCommandlines <em>Commandlines</em>}</li>
 *   <li>{@link bal.impl.CommandImpl#isIsDelivred <em>Is Delivred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command {
	/**
	 * The cached value of the '{@link #getCommandlines() <em>Commandlines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandlines()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandLine> commandlines;

	/**
	 * The default value of the '{@link #isIsDelivred() <em>Is Delivred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDelivred()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DELIVRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDelivred() <em>Is Delivred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDelivred()
	 * @generated
	 * @ordered
	 */
	protected boolean isDelivred = IS_DELIVRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BalPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandLine> getCommandlines() {
		if (commandlines == null) {
			commandlines = new EObjectContainmentEList<CommandLine>(CommandLine.class, this,
					BalPackage.COMMAND__COMMANDLINES);
		}
		return commandlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDelivred() {
		return isDelivred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDelivred(boolean newIsDelivred) {
		boolean oldIsDelivred = isDelivred;
		isDelivred = newIsDelivred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BalPackage.COMMAND__IS_DELIVRED, oldIsDelivred,
					isDelivred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BalPackage.COMMAND__COMMANDLINES:
			return ((InternalEList<?>) getCommandlines()).basicRemove(otherEnd, msgs);
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
		case BalPackage.COMMAND__COMMANDLINES:
			return getCommandlines();
		case BalPackage.COMMAND__IS_DELIVRED:
			return isIsDelivred();
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
		case BalPackage.COMMAND__COMMANDLINES:
			getCommandlines().clear();
			getCommandlines().addAll((Collection<? extends CommandLine>) newValue);
			return;
		case BalPackage.COMMAND__IS_DELIVRED:
			setIsDelivred((Boolean) newValue);
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
		case BalPackage.COMMAND__COMMANDLINES:
			getCommandlines().clear();
			return;
		case BalPackage.COMMAND__IS_DELIVRED:
			setIsDelivred(IS_DELIVRED_EDEFAULT);
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
		case BalPackage.COMMAND__COMMANDLINES:
			return commandlines != null && !commandlines.isEmpty();
		case BalPackage.COMMAND__IS_DELIVRED:
			return isDelivred != IS_DELIVRED_EDEFAULT;
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
		result.append(" (isDelivred: ");
		result.append(isDelivred);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
