/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getGeneralizations <em>Generalizations</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralizationSet_IsDisjoint()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsDisjoint();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Complete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Complete</em>' attribute.
	 * @see #setIsComplete(boolean)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralizationSet_IsComplete()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsComplete();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete</em>' attribute.
	 * @see #isIsComplete()
	 * @generated
	 */
	void setIsComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalizations</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.inf.ontouml.xtext.xcore.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations</em>' reference list.
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralizationSet_Generalizations()
	 * @model
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;head(this.getGeneralizations()).getSuperclass();'"
	 * @generated
	 */
	OntoUMLClass getGeneric();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt; specifics = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt;();\nfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;()\n{\n\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt; it)\n\t{\n\t\tspecifics.add(it.getSubclass());\n\t}\n};\nthis.getGeneralizations().forEach(_function);\nreturn specifics;'"
	 * @generated
	 */
	EList<OntoUMLClass> getSpecifics();

} // GeneralizationSet
