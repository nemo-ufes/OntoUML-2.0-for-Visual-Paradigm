/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl#getGeneralizations <em>Generalizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationSetImpl extends ModelElementImpl implements GeneralizationSet {
	/**
	 * The default value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISJOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisjoint = IS_DISJOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplete = IS_COMPLETE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.GENERALIZATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisjoint() {
		return isDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(boolean newIsDisjoint) {
		boolean oldIsDisjoint = isDisjoint;
		isDisjoint = newIsDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint, isDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComplete() {
		return isComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplete(boolean newIsComplete) {
		boolean oldIsComplete = isComplete;
		isComplete = newIsComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.GENERALIZATION_SET__IS_COMPLETE, oldIsComplete, isComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectResolvingEList<Generalization>(Generalization.class, this, XcorePackage.GENERALIZATION_SET__GENERALIZATIONS);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass getGeneric() {
		return IterableExtensions.<Generalization>head(this.getGeneralizations()).getSuperclass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntoUMLClass> getSpecifics() {
		final BasicEList<OntoUMLClass> specifics = new BasicEList<OntoUMLClass>();
		final Consumer<Generalization> _function = new Consumer<Generalization>() {
			public void accept(final Generalization it) {
				specifics.add(it.getSubclass());
			}
		};
		this.getGeneralizations().forEach(_function);
		return specifics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.GENERALIZATION_SET__IS_DISJOINT:
				return isIsDisjoint();
			case XcorePackage.GENERALIZATION_SET__IS_COMPLETE:
				return isIsComplete();
			case XcorePackage.GENERALIZATION_SET__GENERALIZATIONS:
				return getGeneralizations();
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
			case XcorePackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint((Boolean)newValue);
				return;
			case XcorePackage.GENERALIZATION_SET__IS_COMPLETE:
				setIsComplete((Boolean)newValue);
				return;
			case XcorePackage.GENERALIZATION_SET__GENERALIZATIONS:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection<? extends Generalization>)newValue);
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
			case XcorePackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case XcorePackage.GENERALIZATION_SET__IS_COMPLETE:
				setIsComplete(IS_COMPLETE_EDEFAULT);
				return;
			case XcorePackage.GENERALIZATION_SET__GENERALIZATIONS:
				getGeneralizations().clear();
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
			case XcorePackage.GENERALIZATION_SET__IS_DISJOINT:
				return isDisjoint != IS_DISJOINT_EDEFAULT;
			case XcorePackage.GENERALIZATION_SET__IS_COMPLETE:
				return isComplete != IS_COMPLETE_EDEFAULT;
			case XcorePackage.GENERALIZATION_SET__GENERALIZATIONS:
				return generalizations != null && !generalizations.isEmpty();
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
			case XcorePackage.GENERALIZATION_SET___GET_GENERIC:
				return getGeneric();
			case XcorePackage.GENERALIZATION_SET___GET_SPECIFICS:
				return getSpecifics();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDisjoint: ");
		result.append(isDisjoint);
		result.append(", isComplete: ");
		result.append(isComplete);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl
