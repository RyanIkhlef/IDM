/**
 */
package usd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import usd.Element;
import usd.Span;
import usd.UsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usd.impl.SpanImpl#getSpanContent <em>Span Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanImpl extends TextElementImpl implements Span {
	/**
	 * The cached value of the '{@link #getSpanContent() <em>Span Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanContent()
	 * @generated
	 * @ordered
	 */
	protected Element spanContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsdPackage.Literals.SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getSpanContent() {
		return spanContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpanContent(Element newSpanContent, NotificationChain msgs) {
		Element oldSpanContent = spanContent;
		spanContent = newSpanContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UsdPackage.SPAN__SPAN_CONTENT, oldSpanContent, newSpanContent);
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
	public void setSpanContent(Element newSpanContent) {
		if (newSpanContent != spanContent) {
			NotificationChain msgs = null;
			if (spanContent != null)
				msgs = ((InternalEObject) spanContent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UsdPackage.SPAN__SPAN_CONTENT, null, msgs);
			if (newSpanContent != null)
				msgs = ((InternalEObject) newSpanContent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UsdPackage.SPAN__SPAN_CONTENT, null, msgs);
			msgs = basicSetSpanContent(newSpanContent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsdPackage.SPAN__SPAN_CONTENT, newSpanContent,
					newSpanContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdPackage.SPAN__SPAN_CONTENT:
			return basicSetSpanContent(null, msgs);
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
		case UsdPackage.SPAN__SPAN_CONTENT:
			return getSpanContent();
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
		case UsdPackage.SPAN__SPAN_CONTENT:
			setSpanContent((Element) newValue);
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
		case UsdPackage.SPAN__SPAN_CONTENT:
			setSpanContent((Element) null);
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
		case UsdPackage.SPAN__SPAN_CONTENT:
			return spanContent != null;
		}
		return super.eIsSet(featureID);
	}

} //SpanImpl
