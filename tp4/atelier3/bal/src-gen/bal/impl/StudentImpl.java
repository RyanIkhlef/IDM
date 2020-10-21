/**
 */
package bal.impl;

import bal.BalPackage;
import bal.Command;
import bal.Parent;
import bal.Payment;
import bal.Student;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bal.impl.StudentImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link bal.impl.StudentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link bal.impl.StudentImpl#getPayments <em>Payments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> command;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Parent> parent;

	/**
	 * The cached value of the '{@link #getPayments() <em>Payments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BalPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommand() {
		if (command == null) {
			command = new EObjectResolvingEList<Command>(Command.class, this, BalPackage.STUDENT__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parent> getParent() {
		if (parent == null) {
			parent = new EObjectContainmentEList<Parent>(Parent.class, this, BalPackage.STUDENT__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payment> getPayments() {
		if (payments == null) {
			payments = new EObjectResolvingEList<Payment>(Payment.class, this, BalPackage.STUDENT__PAYMENTS);
		}
		return payments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BalPackage.STUDENT__PARENT:
			return ((InternalEList<?>) getParent()).basicRemove(otherEnd, msgs);
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
		case BalPackage.STUDENT__COMMAND:
			return getCommand();
		case BalPackage.STUDENT__PARENT:
			return getParent();
		case BalPackage.STUDENT__PAYMENTS:
			return getPayments();
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
		case BalPackage.STUDENT__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends Command>) newValue);
			return;
		case BalPackage.STUDENT__PARENT:
			getParent().clear();
			getParent().addAll((Collection<? extends Parent>) newValue);
			return;
		case BalPackage.STUDENT__PAYMENTS:
			getPayments().clear();
			getPayments().addAll((Collection<? extends Payment>) newValue);
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
		case BalPackage.STUDENT__COMMAND:
			getCommand().clear();
			return;
		case BalPackage.STUDENT__PARENT:
			getParent().clear();
			return;
		case BalPackage.STUDENT__PAYMENTS:
			getPayments().clear();
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
		case BalPackage.STUDENT__COMMAND:
			return command != null && !command.isEmpty();
		case BalPackage.STUDENT__PARENT:
			return parent != null && !parent.isEmpty();
		case BalPackage.STUDENT__PAYMENTS:
			return payments != null && !payments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudentImpl
