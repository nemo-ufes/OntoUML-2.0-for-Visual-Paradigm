/**
 */
package it.unibz.inf.ontouml.xtext.xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSubclass <em>Subclass</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(OntoUMLClass)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralization_Superclass()
	 * @model
	 * @generated
	 */
	OntoUMLClass getSuperclass();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSuperclass <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(OntoUMLClass value);

	/**
	 * Returns the value of the '<em><b>Subclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' reference.
	 * @see #setSubclass(OntoUMLClass)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralization_Subclass()
	 * @model
	 * @generated
	 */
	OntoUMLClass getSubclass();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSubclass <em>Subclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclass</em>' reference.
	 * @see #getSubclass()
	 * @generated
	 */
	void setSubclass(OntoUMLClass value);

} // Generalization
