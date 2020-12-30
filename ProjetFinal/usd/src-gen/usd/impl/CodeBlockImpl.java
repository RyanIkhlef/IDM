/**
 */
package usd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import usd.CodeBlock;
import usd.CodeLine;
import usd.UsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usd.impl.CodeBlockImpl#getCodelines <em>Codelines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeBlockImpl extends ElementImpl implements CodeBlock {
	/**
	 * The cached value of the '{@link #getCodelines() <em>Codelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodelines()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> codelines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsdPackage.Literals.CODE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeLine> getCodelines() {
		if (codelines == null) {
			codelines = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, UsdPackage.CODE_BLOCK__CODELINES);
		}
		return codelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdPackage.CODE_BLOCK__CODELINES:
			return ((InternalEList<?>) getCodelines()).basicRemove(otherEnd, msgs);
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
		case UsdPackage.CODE_BLOCK__CODELINES:
			return getCodelines();
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
		case UsdPackage.CODE_BLOCK__CODELINES:
			getCodelines().clear();
			getCodelines().addAll((Collection<? extends CodeLine>) newValue);
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
		case UsdPackage.CODE_BLOCK__CODELINES:
			getCodelines().clear();
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
		case UsdPackage.CODE_BLOCK__CODELINES:
			return codelines != null && !codelines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeBlockImpl
