/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl#getSubclass <em>Subclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends ModelElementImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected OntoUMLClass superclass;

	/**
	 * The cached value of the '{@link #getSubclass() <em>Subclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclass()
	 * @generated
	 * @ordered
	 */
	protected OntoUMLClass subclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (OntoUMLClass)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.GENERALIZATION__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclass(OntoUMLClass newSuperclass) {
		OntoUMLClass oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.GENERALIZATION__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass getSubclass() {
		if (subclass != null && subclass.eIsProxy()) {
			InternalEObject oldSubclass = (InternalEObject)subclass;
			subclass = (OntoUMLClass)eResolveProxy(oldSubclass);
			if (subclass != oldSubclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.GENERALIZATION__SUBCLASS, oldSubclass, subclass));
			}
		}
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass basicGetSubclass() {
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubclass(OntoUMLClass newSubclass) {
		OntoUMLClass oldSubclass = subclass;
		subclass = newSubclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.GENERALIZATION__SUBCLASS, oldSubclass, subclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getGeneralizationSets() {
		final BasicEList<GeneralizationSet> gen_sets = new BasicEList<GeneralizationSet>();
		EObject _eContainer = this.eContainer();
		final Consumer<ModelElement> _function = new Consumer<ModelElement>() {
			public void accept(final ModelElement it) {
				if ((it instanceof GeneralizationSet)) {
					boolean _contains = ((GeneralizationSet)it).getGeneralizations().contains(GeneralizationImpl.this);
					if (_contains) {
						gen_sets.add(((GeneralizationSet)it));
					}
				}
			}
		};
		((Model) _eContainer).getElements().forEach(_function);
		return gen_sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.GENERALIZATION__SUPERCLASS:
				if (resolve) return getSuperclass();
				return basicGetSuperclass();
			case XcorePackage.GENERALIZATION__SUBCLASS:
				if (resolve) return getSubclass();
				return basicGetSubclass();
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
			case XcorePackage.GENERALIZATION__SUPERCLASS:
				setSuperclass((OntoUMLClass)newValue);
				return;
			case XcorePackage.GENERALIZATION__SUBCLASS:
				setSubclass((OntoUMLClass)newValue);
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
			case XcorePackage.GENERALIZATION__SUPERCLASS:
				setSuperclass((OntoUMLClass)null);
				return;
			case XcorePackage.GENERALIZATION__SUBCLASS:
				setSubclass((OntoUMLClass)null);
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
			case XcorePackage.GENERALIZATION__SUPERCLASS:
				return superclass != null;
			case XcorePackage.GENERALIZATION__SUBCLASS:
				return subclass != null;
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
			case XcorePackage.GENERALIZATION___GET_GENERALIZATION_SETS:
				return getGeneralizationSets();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneralizationImpl
