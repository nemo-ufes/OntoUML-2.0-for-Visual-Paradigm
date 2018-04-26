/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%>> gen_sets = new <%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%>>();\n<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\nfinal <%java.util.function.Consumer%><<%it.unibz.inf.ontouml.xtext.xcore.ModelElement%>> _function = new <%java.util.function.Consumer%><<%it.unibz.inf.ontouml.xtext.xcore.ModelElement%>>()\n{\n\tpublic void accept(final <%it.unibz.inf.ontouml.xtext.xcore.ModelElement%> it)\n\t{\n\t\tif ((it instanceof <%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%>))\n\t\t{\n\t\t\tboolean _contains = ((<%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%>)it).getGeneralizations().contains(<%this%>);\n\t\t\tif (_contains)\n\t\t\t{\n\t\t\t\tgen_sets.add(((<%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%>)it));\n\t\t\t}\n\t\t}\n\t}\n};\n((<%it.unibz.inf.ontouml.xtext.xcore.Model%>) _eContainer).getElements().forEach(_function);\nreturn gen_sets;'"
	 * @generated
	 */
	EList<GeneralizationSet> getGeneralizationSets();

} // Generalization
