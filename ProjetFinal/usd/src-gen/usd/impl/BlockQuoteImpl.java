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

import usd.BlockQuote;
import usd.Element;
import usd.UsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usd.impl.BlockQuoteImpl#getQuotes <em>Quotes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockQuoteImpl extends ElementImpl implements BlockQuote {
	/**
	 * The cached value of the '{@link #getQuotes() <em>Quotes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> quotes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockQuoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsdPackage.Literals.BLOCK_QUOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getQuotes() {
		if (quotes == null) {
			quotes = new EObjectContainmentEList<Element>(Element.class, this, UsdPackage.BLOCK_QUOTE__QUOTES);
		}
		return quotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdPackage.BLOCK_QUOTE__QUOTES:
			return ((InternalEList<?>) getQuotes()).basicRemove(otherEnd, msgs);
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
		case UsdPackage.BLOCK_QUOTE__QUOTES:
			return getQuotes();
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
		case UsdPackage.BLOCK_QUOTE__QUOTES:
			getQuotes().clear();
			getQuotes().addAll((Collection<? extends Element>) newValue);
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
		case UsdPackage.BLOCK_QUOTE__QUOTES:
			getQuotes().clear();
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
		case UsdPackage.BLOCK_QUOTE__QUOTES:
			return quotes != null && !quotes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockQuoteImpl
