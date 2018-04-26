package it.unibz.inf.ontouml.xtext.tests;

import com.google.inject.Inject;
import it.unibz.inf.ontouml.xtext.tests.OntoUMLInjectorProvider;
import it.unibz.inf.ontouml.xtext.validation.OntoUMLValidator;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OntoUMLInjectorProvider.class)
@SuppressWarnings("all")
public class OntoUMLValidationTest {
  @Inject
  @Extension
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void ultimateSortalSpecializationTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Model {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("kind Class C1 supers... {G1_1} subs... {G1_1},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("subkind Class C2 supers... {G2_3, G2_4},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("modeKind Class C3 subs... {G2_3},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("relatorKind Class C4 subs... {G2_4},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("subkind Class C5,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("qualityKind Class C6,");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G1_1 superclass C1 subclass C1,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G2_3 superclass C3 subclass C2,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G2_4 superclass C4 subclass C2");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model m = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertError(m, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.MISSING_IDENTITY_SUPPLIER);
      this._validationTestHelper.assertError(m, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.ULTIMATE_SORTAL_SPECIALIZATION);
      this._validationTestHelper.assertError(m, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.MULTIPLE_IDENTITY_SUPPLIERS);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void nonSortalSpecializationToSortalTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Model {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("roleMixin Class C2 supers... {G2_3, G2_4},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("role Class C3 subs... {G2_3},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("category Class C4 subs... {G2_4},");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G2_3 superclass C3 subclass C2,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G2_4 superclass C4 subclass C2");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model m = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertError(m, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void nonAntiRigidSpecializationToAntiRigidTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Model {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("kind Class C2 supers... {G2_3},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("roleMixin Class C3 subs... {G2_3},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("mixin Class C4 supers... {G4_5},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("roleMixin Class C5 subs... {G4_5},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G2_3 superclass C3 subclass C2,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G4_5 superclass C5 subclass C4");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model m = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertError(m, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.RIGID_SPECIALIZATION_TO_ANTI_RIGID);
      this._validationTestHelper.assertError(m, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.SEMI_RIGID_SPECIALIZATION_TO_ANTI_RIGID);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void phaseInPartitionTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Model {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("phase Class C1 supers... {G1_3},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("phase Class C2 supers... {G2_3},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("kind Class C3 supers... {G1_3,G2_3},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G1_3 superclass C3 subclass C1,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Generalization G2_3 superclass C3 subclass C2,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("disjoint complete GeneralizationSet gs generalizations {G1_3,G2_3}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model m = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(m, OntoUMLValidator.PHASE_MISSING_PARTITION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Model {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("phase Class C1 supers... {G1_3},");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.PHASE_MISSING_PARTITION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
