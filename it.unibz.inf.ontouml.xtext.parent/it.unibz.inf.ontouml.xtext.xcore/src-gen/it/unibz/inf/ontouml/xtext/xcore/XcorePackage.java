/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unibz.inf.ontouml.xtext.xcore.XcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='it.unibz.inf.ontouml.xtext.xcore/src-gen' basePackage='it.unibz.inf.ontouml.xtext'"
 * @generated
 */
public interface XcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.unibz.it/ontouml/xtext/xcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcorePackage eINSTANCE = it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get All Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ALL_ELEMENTS = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___GET_CONTAINER_MODEL = 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.PackageImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALIAS = MODEL_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_CONTAINER_MODEL = MODEL_ELEMENT___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get All Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_ALL_CONTENTS = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl <em>Onto UML Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getOntoUMLClass()
	 * @generated
	 */
	int ONTO_UML_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS__ALIAS = MODEL_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Onto UML Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_CONTAINER_MODEL = MODEL_ELEMENT___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_SUPER_CLASSES = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Ultimate Sortal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_ULTIMATE_SORTAL = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Sortal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_SORTAL = MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Non Sortal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_NON_SORTAL = MODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_RIGID = MODEL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Semi Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_SEMI_RIGID = MODEL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Anti Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_ANTI_RIGID = MODEL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Onto UML Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 7;


	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ALIAS = MODEL_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SUPERCLASS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SUBCLASS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_CONTAINER_MODEL = MODEL_ELEMENT___GET_CONTAINER_MODEL;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__ALIAS = MODEL_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_DISJOINT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_COMPLETE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__GENERALIZATIONS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GET_CONTAINER_MODEL = MODEL_ELEMENT___GET_CONTAINER_MODEL;

	/**
	 * The number of operations of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.EndurantType <em>Endurant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getEndurantType()
	 * @generated
	 */
	int ENDURANT_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.inf.ontouml.xtext.xcore.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Model#getAllElements() <em>Get All Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Elements</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Model#getAllElements()
	 * @generated
	 */
	EOperation getModel__GetAllElements();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement#getAlias()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Alias();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getContainerModel() <em>Get Container Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container Model</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement#getContainerModel()
	 * @generated
	 */
	EOperation getModelElement__GetContainerModel();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.inf.ontouml.xtext.xcore.Package#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Package#getContents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Contents();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Package#getAllContents() <em>Get All Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Contents</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Package#getAllContents()
	 * @generated
	 */
	EOperation getPackage__GetAllContents();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass <em>Onto UML Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onto UML Class</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass
	 * @generated
	 */
	EClass getOntoUMLClass();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>type</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type()
	 * @see #getOntoUMLClass()
	 * @generated
	 */
	EAttribute getOntoUMLClass__type();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getSuperClasses() <em>Get Super Classes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super Classes</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getSuperClasses()
	 * @generated
	 */
	EOperation getOntoUMLClass__GetSuperClasses();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isUltimateSortal() <em>Is Ultimate Sortal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ultimate Sortal</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isUltimateSortal()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsUltimateSortal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSortal() <em>Is Sortal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sortal</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSortal()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsSortal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isNonSortal() <em>Is Non Sortal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Non Sortal</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isNonSortal()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsNonSortal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isRigid() <em>Is Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Rigid</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isRigid()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsRigid();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSemiRigid() <em>Is Semi Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Semi Rigid</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSemiRigid()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsSemiRigid();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isAntiRigid() <em>Is Anti Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Anti Rigid</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isAntiRigid()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsAntiRigid();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization#getSuperclass()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Superclass();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subclass</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization#getSubclass()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Subclass();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsComplete <em>Is Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsComplete()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsComplete();

	/**
	 * Returns the meta object for the reference list '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalizations</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getGeneralizations()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Generalizations();

	/**
	 * Returns the meta object for enum '{@link it.unibz.inf.ontouml.xtext.xcore.EndurantType <em>Endurant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endurant Type</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @generated
	 */
	EEnum getEndurantType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XcoreFactory getXcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Get All Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ALL_ELEMENTS = eINSTANCE.getModel__GetAllElements();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ALIAS = eINSTANCE.getModelElement_Alias();

		/**
		 * The meta object literal for the '<em><b>Get Container Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___GET_CONTAINER_MODEL = eINSTANCE.getModelElement__GetContainerModel();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.PackageImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTENTS = eINSTANCE.getPackage_Contents();

		/**
		 * The meta object literal for the '<em><b>Get All Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___GET_ALL_CONTENTS = eINSTANCE.getPackage__GetAllContents();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl <em>Onto UML Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getOntoUMLClass()
		 * @generated
		 */
		EClass ONTO_UML_CLASS = eINSTANCE.getOntoUMLClass();

		/**
		 * The meta object literal for the '<em><b>type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTO_UML_CLASS__TYPE = eINSTANCE.getOntoUMLClass__type();

		/**
		 * The meta object literal for the '<em><b>Get Super Classes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___GET_SUPER_CLASSES = eINSTANCE.getOntoUMLClass__GetSuperClasses();

		/**
		 * The meta object literal for the '<em><b>Is Ultimate Sortal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_ULTIMATE_SORTAL = eINSTANCE.getOntoUMLClass__IsUltimateSortal();

		/**
		 * The meta object literal for the '<em><b>Is Sortal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_SORTAL = eINSTANCE.getOntoUMLClass__IsSortal();

		/**
		 * The meta object literal for the '<em><b>Is Non Sortal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_NON_SORTAL = eINSTANCE.getOntoUMLClass__IsNonSortal();

		/**
		 * The meta object literal for the '<em><b>Is Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_RIGID = eINSTANCE.getOntoUMLClass__IsRigid();

		/**
		 * The meta object literal for the '<em><b>Is Semi Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_SEMI_RIGID = eINSTANCE.getOntoUMLClass__IsSemiRigid();

		/**
		 * The meta object literal for the '<em><b>Is Anti Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_ANTI_RIGID = eINSTANCE.getOntoUMLClass__IsAntiRigid();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SUPERCLASS = eINSTANCE.getGeneralization_Superclass();

		/**
		 * The meta object literal for the '<em><b>Subclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SUBCLASS = eINSTANCE.getGeneralization_Subclass();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_DISJOINT = eINSTANCE.getGeneralizationSet_IsDisjoint();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_COMPLETE = eINSTANCE.getGeneralizationSet_IsComplete();

		/**
		 * The meta object literal for the '<em><b>Generalizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__GENERALIZATIONS = eINSTANCE.getGeneralizationSet_Generalizations();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.EndurantType <em>Endurant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getEndurantType()
		 * @generated
		 */
		EEnum ENDURANT_TYPE = eINSTANCE.getEndurantType();

	}

} //XcorePackage
