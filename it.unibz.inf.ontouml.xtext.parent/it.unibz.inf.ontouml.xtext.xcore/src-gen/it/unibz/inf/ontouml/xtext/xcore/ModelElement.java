/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getModelElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * The default value is <code>"unnamed"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getModelElement_Alias()
	 * @model default="unnamed" unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer = this.eContainer();\nif ((_eContainer instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.Package%&gt;))\n{\n\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer_1 = this.eContainer();\n\treturn ((&lt;%it.unibz.inf.ontouml.xtext.xcore.Package%&gt;) _eContainer_1).getContainerModel();\n}\n&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer_2 = this.eContainer();\nreturn ((&lt;%it.unibz.inf.ontouml.xtext.xcore.Model%&gt;) _eContainer_2);'"
	 * @generated
	 */
	Model getContainerModel();
} // ModelElement
