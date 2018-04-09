/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.function.Consumer;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, XcorePackage.MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getAllElements() {
		BasicEList<ModelElement> _xblockexpression = null; {
			final BasicEList<ModelElement> list = new BasicEList<ModelElement>();
			final Consumer<ModelElement> _function = new Consumer<ModelElement>() {
				public void accept(final ModelElement it) {
					list.add(it);
					if ((it instanceof it.unibz.inf.ontouml.xtext.xcore.Package)) {
						list.addAll(((it.unibz.inf.ontouml.xtext.xcore.Package)it).getAllContents());
					}
				}
			};
			this.getElements().forEach(_function);
			_xblockexpression = list;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case XcorePackage.MODEL__ELEMENTS:
				return getElements();
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
			case XcorePackage.MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ModelElement>)newValue);
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
			case XcorePackage.MODEL__ELEMENTS:
				getElements().clear();
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
			case XcorePackage.MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case XcorePackage.MODEL___GET_ALL_ELEMENTS:
				return getAllElements();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModelImpl
