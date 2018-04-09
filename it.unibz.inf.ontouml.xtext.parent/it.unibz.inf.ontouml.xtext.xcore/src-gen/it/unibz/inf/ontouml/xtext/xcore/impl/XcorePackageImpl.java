/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.EndurantType;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.XcoreFactory;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcorePackageImpl extends EPackageImpl implements XcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontoUMLClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endurantTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XcorePackageImpl() {
		super(eNS_URI, XcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XcorePackage init() {
		if (isInited) return (XcorePackage)EPackage.Registry.INSTANCE.getEPackage(XcorePackage.eNS_URI);

		// Obtain or create and register package
		XcorePackageImpl theXcorePackage = (XcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XcorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXcorePackage.createPackageContents();

		// Initialize created meta-data
		theXcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XcorePackage.eNS_URI, theXcorePackage);
		return theXcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetAllElements() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Alias() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelElement__GetContainerModel() {
		return modelElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Contents() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetAllContents() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntoUMLClass() {
		return ontoUMLClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntoUMLClass__type() {
		return (EAttribute)ontoUMLClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__GetSuperClasses() {
		return ontoUMLClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsUltimateSortal() {
		return ontoUMLClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsSortal() {
		return ontoUMLClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsNonSortal() {
		return ontoUMLClassEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsRigid() {
		return ontoUMLClassEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsSemiRigid() {
		return ontoUMLClassEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsAntiRigid() {
		return ontoUMLClassEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Superclass() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Subclass() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsComplete() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalizations() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndurantType() {
		return endurantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreFactory getXcoreFactory() {
		return (XcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ELEMENTS);
		createEOperation(modelEClass, MODEL___GET_ALL_ELEMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ALIAS);
		createEOperation(modelElementEClass, MODEL_ELEMENT___GET_CONTAINER_MODEL);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__CONTENTS);
		createEOperation(packageEClass, PACKAGE___GET_ALL_CONTENTS);

		ontoUMLClassEClass = createEClass(ONTO_UML_CLASS);
		createEAttribute(ontoUMLClassEClass, ONTO_UML_CLASS__TYPE);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___GET_SUPER_CLASSES);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_ULTIMATE_SORTAL);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_SORTAL);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_NON_SORTAL);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_RIGID);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_SEMI_RIGID);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_ANTI_RIGID);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__SUPERCLASS);
		createEReference(generalizationEClass, GENERALIZATION__SUBCLASS);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COMPLETE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATIONS);

		// Create enums
		endurantTypeEEnum = createEEnum(ENDURANT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageEClass.getESuperTypes().add(this.getModelElement());
		ontoUMLClassEClass.getESuperTypes().add(this.getModelElement());
		generalizationEClass.getESuperTypes().add(this.getModelElement());
		generalizationSetEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getModel__GetAllElements(), null, "getAllElements", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getModelElement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Alias(), theEcorePackage.getEString(), "alias", "unnamed", 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModelElement__GetContainerModel(), this.getModel(), "getContainerModel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(packageEClass, it.unibz.inf.ontouml.xtext.xcore.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Contents(), this.getModelElement(), null, "contents", null, 0, -1, it.unibz.inf.ontouml.xtext.xcore.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPackage__GetAllContents(), null, "getAllContents", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEEList());
		g2 = createEGenericType(this.getModelElement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(ontoUMLClassEClass, OntoUMLClass.class, "OntoUMLClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntoUMLClass__type(), this.getEndurantType(), "_type", null, 0, 1, OntoUMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOntoUMLClass__GetSuperClasses(), null, "getSuperClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEEList());
		g2 = createEGenericType(this.getOntoUMLClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getOntoUMLClass__IsUltimateSortal(), theEcorePackage.getEBoolean(), "isUltimateSortal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsSortal(), theEcorePackage.getEBoolean(), "isSortal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsNonSortal(), theEcorePackage.getEBoolean(), "isNonSortal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsRigid(), theEcorePackage.getEBoolean(), "isRigid", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsSemiRigid(), theEcorePackage.getEBoolean(), "isSemiRigid", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsAntiRigid(), theEcorePackage.getEBoolean(), "isAntiRigid", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Superclass(), this.getOntoUMLClass(), null, "superclass", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Subclass(), this.getOntoUMLClass(), null, "subclass", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_IsDisjoint(), theEcorePackage.getEBoolean(), "isDisjoint", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsComplete(), theEcorePackage.getEBoolean(), "isComplete", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_Generalizations(), this.getGeneralization(), null, "generalizations", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(endurantTypeEEnum, EndurantType.class, "EndurantType");
		addEEnumLiteral(endurantTypeEEnum, EndurantType.NONE);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.RELATOR_KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.MODE_KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.QUALITY_KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.SUBKIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.ROLE);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.PHASE);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.CATEGORY);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.MIXIN);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.ROLE_MIXIN);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.PHASE_MIXIN);

		// Create resource
		createResource(eNS_URI);
	}

} //XcorePackageImpl
