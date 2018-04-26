/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Onto UML Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type <em>type</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getGeneralizationsToSuperclasses <em>Generalizations To Superclasses</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getGeneralizationsToSubclasses <em>Generalizations To Subclasses</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getOntoUMLClass()
 * @model
 * @generated
 */
public interface OntoUMLClass extends ModelElement {
	/**
	 * Returns the value of the '<em><b>type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link it.unibz.inf.ontouml.xtext.xcore.EndurantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>type</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @see #set_type(EndurantType)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getOntoUMLClass__type()
	 * @model default="none" unique="false"
	 * @generated
	 */
	EndurantType get_type();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>type</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @see #get_type()
	 * @generated
	 */
	void set_type(EndurantType value);

	/**
	 * Returns the value of the '<em><b>Generalizations To Superclasses</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.inf.ontouml.xtext.xcore.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizations To Superclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations To Superclasses</em>' reference list.
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getOntoUMLClass_GeneralizationsToSuperclasses()
	 * @model
	 * @generated
	 */
	EList<Generalization> getGeneralizationsToSuperclasses();

	/**
	 * Returns the value of the '<em><b>Generalizations To Subclasses</b></em>' reference list.
	 * The list contents are of type {@link it.unibz.inf.ontouml.xtext.xcore.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizations To Subclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizations To Subclasses</em>' reference list.
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getOntoUMLClass_GeneralizationsToSubclasses()
	 * @model
	 * @generated
	 */
	EList<Generalization> getGeneralizationsToSubclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%>> supers = new <%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%>>();\n\tfinal <%java.util.function.Consumer%><<%it.unibz.inf.ontouml.xtext.xcore.Generalization%>> _function = new <%java.util.function.Consumer%><<%it.unibz.inf.ontouml.xtext.xcore.Generalization%>>()\n\t{\n\t\tpublic void accept(final <%it.unibz.inf.ontouml.xtext.xcore.Generalization%> it)\n\t\t{\n\t\t\tsupers.add(it.getSuperclass());\n\t\t}\n\t};\n\tthis.getGeneralizationsToSuperclasses().forEach(_function);\n\t_xblockexpression = supers;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<OntoUMLClass> getSuperclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%>> subs = new <%org.eclipse.emf.common.util.BasicEList%><<%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%>>();\n\tfinal <%java.util.function.Consumer%><<%it.unibz.inf.ontouml.xtext.xcore.Generalization%>> _function = new <%java.util.function.Consumer%><<%it.unibz.inf.ontouml.xtext.xcore.Generalization%>>()\n\t{\n\t\tpublic void accept(final <%it.unibz.inf.ontouml.xtext.xcore.Generalization%> it)\n\t\t{\n\t\t\tsubs.add(it.getSuperclass());\n\t\t}\n\t};\n\tthis.getGeneralizationsToSubclasses().forEach(_function);\n\t_xblockexpression = subs;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<OntoUMLClass> getSubclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((<%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.KIND) || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.RELATOR_KIND)) || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.MODE_KIND)) || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.QUALITY_KIND));'"
	 * @generated
	 */
	boolean isUltimateSortal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((this.isUltimateSortal() || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.SUBKIND)) || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.ROLE)) || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.PHASE));'"
	 * @generated
	 */
	boolean isSortal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((!this.isSortal()) && (!<%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.NONE)));'"
	 * @generated
	 */
	boolean isNonSortal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((!this.isSemiRigid()) && (!this.isSemiRigid())) && (!<%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.NONE)));'"
	 * @generated
	 */
	boolean isRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%it.unibz.inf.ontouml.xtext.xcore.EndurantType%> __type = this.get_type();\nreturn <%com.google.common.base.Objects%>.equal(__type, <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.MIXIN);'"
	 * @generated
	 */
	boolean isSemiRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.ROLE) || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.PHASE)) || <%com.google.common.base.Objects%>.equal(this.get_type(), <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.ROLE_MIXIN));'"
	 * @generated
	 */
	boolean isAntiRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%it.unibz.inf.ontouml.xtext.xcore.EndurantType%> __type = this.get_type();\nreturn <%com.google.common.base.Objects%>.equal(__type, <%it.unibz.inf.ontouml.xtext.xcore.EndurantType%>.PHASE);'"
	 * @generated
	 */
	boolean isPhase();

} // OntoUMLClass
