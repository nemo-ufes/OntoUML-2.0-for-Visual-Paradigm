package it.unibz.inf.ontouml.xtext.tests

import com.google.inject.Inject
import it.unibz.inf.ontouml.xtext.validation.OntoUMLValidator
import it.unibz.inf.ontouml.xtext.xcore.Model
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.emf.ecore.resource.Resource

@RunWith(XtextRunner)
@InjectWith(OntoUMLInjectorProvider)
class OntoUMLValidationTest {
	
	@Inject extension ParseHelper<Model> parseHelper
	@Inject extension ValidationTestHelper
//	@Inject extension ModelUtils
	
	@Test
	def void ultimateSortalSpecializationTest() {
		val m = '''
		Model {
			kind Class C1 supers... {G1_1} subs... {G1_1},
			subkind Class C2 supers... {G2_3, G2_4},
			modeKind Class C3 subs... {G2_3},
			relatorKind Class C4 subs... {G2_4},
			subkind Class C5,
			qualityKind Class C6,
			
			Generalization G1_1 superclass C1 subclass C1,
			Generalization G2_3 superclass C3 subclass C2,
			Generalization G2_4 superclass C4 subclass C2
		}
		'''.parse
		
		m.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.MISSING_IDENTITY_SUPPLIER)
		m.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.ULTIMATE_SORTAL_SPECIALIZATION)
		m.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.MULTIPLE_IDENTITY_SUPPLIERS)
	}
	
	@Test
	def void nonSortalSpecializationToSortalTest() {
		val m = '''
		Model {
«««			kind Class C1 supers... {G1_1} subs... {G1_1},
			roleMixin Class C2 supers... {G2_3, G2_4},
			role Class C3 subs... {G2_3},
			category Class C4 subs... {G2_4},
«««			subkind Class C5,
«««			qualityKind Class C6,
			
«««			Generalization G1_1 superclass C1 subclass C1,
			Generalization G2_3 superclass C3 subclass C2,
			Generalization G2_4 superclass C4 subclass C2
		}
		'''.parse
		
		m.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL)
	}
	
	@Test
	def void nonAntiRigidSpecializationToAntiRigidTest() {
		val m = '''
		Model {
			kind Class C2 supers... {G2_3},
			roleMixin Class C3 subs... {G2_3},
			mixin Class C4 supers... {G4_5},
			roleMixin Class C5 subs... {G4_5},
			Generalization G2_3 superclass C3 subclass C2,
			Generalization G4_5 superclass C5 subclass C4
		}
		'''.parse
		
		m.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.RIGID_SPECIALIZATION_TO_ANTI_RIGID)
		m.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.SEMI_RIGID_SPECIALIZATION_TO_ANTI_RIGID)
	}
	
	@Test
	def void phaseInPartitionTest() {
		val m = '''
		Model {
			phase Class C1 supers... {G1_3},
			phase Class C2 supers... {G2_3},
			kind Class C3 supers... {G1_3,G2_3},
			Generalization G1_3 superclass C3 subclass C1,
			Generalization G2_3 superclass C3 subclass C2,
			disjoint complete GeneralizationSet gs generalizations {G1_3,G2_3}
		}
		'''.parse
		m.assertNoError(OntoUMLValidator.PHASE_MISSING_PARTITION)
		
		val m2 = '''
			Model {
				phase Class C1 supers... {G1_3},
«««				phase Class C2 supers... {G2_3},
«««				kind Class C3 supers... {G1_3,G2_3},
«««				Generalization G1_3 superclass C3 subclass C1,
«««				Generalization G2_3 superclass C3 subclass C2,
«««				disjoint complete GeneralizationSet gs generalizations G1_3,G2_3
			}
			'''.parse
		m2.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.PHASE_MISSING_PARTITION)
	}
	
}
//
//class OntoUMLParsingTest {
//	@Test
//	def void loadModel() {
//		val result = parseHelper.parse('''
//			Model { elements { OntoUMLClass Batata } }
//		''')
//		Assert.assertNotNull(result)
//		val errors = result.eResource.errors
//		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
//	}
//}
