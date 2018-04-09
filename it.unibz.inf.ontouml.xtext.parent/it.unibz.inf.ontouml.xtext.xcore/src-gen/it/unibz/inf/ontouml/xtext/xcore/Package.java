/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Package#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibz.inf.ontouml.xtext.xcore.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getPackage_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt; list = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt;();\n\tfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt;()\n\t{\n\t\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt; it)\n\t\t{\n\t\t\tlist.add(it);\n\t\t\tif ((it instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.Package%&gt;))\n\t\t\t{\n\t\t\t\tlist.addAll(((&lt;%it.unibz.inf.ontouml.xtext.xcore.Package%&gt;)it).getAllContents());\n\t\t\t}\n\t\t}\n\t};\n\tthis.getContents().forEach(_function);\n\t_xblockexpression = list;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<ModelElement> getAllContents();

} // Package
