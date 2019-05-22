package it.unibz.inf.ontouml.vp.uml;

import com.vp.plugin.model.IAssociation;
import com.vp.plugin.model.IClass;
import com.vp.plugin.model.IGeneralization;
import com.vp.plugin.model.IGeneralizationSet;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.factory.IModelElementFactory;

import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.XcoreFactory;

public class AdapterManager {

	public static ModelElementAdapter getApater(IModelElement adaptee) {
		switch (adaptee.getModelType()) {
		case IModelElementFactory.MODEL_TYPE_CLASS:
			return new ClassAdapter((IClass) adaptee);
		case IModelElementFactory.MODEL_TYPE_ASSOCIATION:
			return new AssociationAdapter((IAssociation) adaptee);
		case IModelElementFactory.MODEL_TYPE_GENERALIZATION:
			return new GeneralizationAdapter((IGeneralization) adaptee);
		case IModelElementFactory.MODEL_TYPE_GENERALIZATION_SET:
			return new GeneralizationSetAdapter((IGeneralizationSet) adaptee);
		default:
			return null;
		}
	}
	
	public static void registerToOntoUML(Model model, ModelElementAdapter me) {
		switch (me.getModelType()) {
			case IModelElementFactory.MODEL_TYPE_CLASS:
				registerClass(model,(ClassAdapter) me);
				return ; 
			case IModelElementFactory.MODEL_TYPE_GENERALIZATION:
				registerGeneralization(model,(GeneralizationAdapter) me);
				return ; 
			case IModelElementFactory.MODEL_TYPE_GENERALIZATION_SET:
				registerGeneralizationSet(model,(GeneralizationSetAdapter) me);
				return ; 
			default:
				return ; 
		}
	}
	
	public static void updateToOntoUML(Model model, ModelElementAdapter me) {
		switch (me.getModelType()) {
			case IModelElementFactory.MODEL_TYPE_CLASS:
				updateClass(model,(ClassAdapter) me);
				return ; 
			case IModelElementFactory.MODEL_TYPE_GENERALIZATION:
				updateGeneralization(model,(GeneralizationAdapter) me);
				return ; 
			case IModelElementFactory.MODEL_TYPE_GENERALIZATION_SET:
				updateGeneralizationSet(model,(GeneralizationSetAdapter) me);
				return ; 
			default:
				return ; 
		}
	}
	
	private static void registerClass(Model model, ClassAdapter uml_class) {
		OntoUMLClass onto_class = XcoreFactory.eINSTANCE.createOntoUMLClass();
		onto_class.set_type(uml_class.getOntoUMLType());
		onto_class.setName(uml_class.getPrefixedId());
		if(uml_class.getName()!=null)	onto_class.setAlias(uml_class.getName());
		
		model.getElements().add(onto_class);
	}
	
	private static void registerGeneralization(Model model, GeneralizationAdapter uml_gen) {
		Generalization onto_gen = XcoreFactory.eINSTANCE.createGeneralization();
		onto_gen.setName(uml_gen.getPrefixedId());
		if(uml_gen.getName()!=null)	onto_gen.setAlias(uml_gen.getName());
		
		model.getElements().add(onto_gen);
	}
	
	private static void registerGeneralizationSet(Model model, GeneralizationSetAdapter uml_gen_set) {
		GeneralizationSet onto_gen_set = XcoreFactory.eINSTANCE.createGeneralizationSet();
		onto_gen_set.setName(uml_gen_set.getPrefixedId());
		if(uml_gen_set.getName()!=null)	onto_gen_set.setAlias(uml_gen_set.getName());
		onto_gen_set.setIsComplete(uml_gen_set.isComplete());
		onto_gen_set.setIsDisjoint(uml_gen_set.isDisjoint());
		
		model.getElements().add(onto_gen_set);
	}
	
	private static void updateClass(Model model, ClassAdapter uml_class) {
		OntoUMLClass onto_class = (OntoUMLClass) model.getElementByName(uml_class.getPrefixedId());
//		List<Generalization> subs = onto_class.getGeneralizationsToSubclasses();
//		for (GeneralizationAdapter gen : uml_class.getGeneralizationsToSubclasses()) {
//			onto_class.getGeneralizationsToSubclasses().add((Generalization) model.getElementByName(gen.getPrefixedId()));
//		}
//		List<Generalization> supers = onto_class.getGeneralizationsToSuperclasses();
//		for (GeneralizationAdapter gen : uml_class.getGeneralizationsToSuperclasses()) {
//			onto_class.getGeneralizationsToSuperclasses().add((Generalization) model.getElementByName(gen.getPrefixedId()));
//		}
		System.out.println(onto_class);
//		System.out.println(onto_class.getGeneralizationsToSubclasses());
//		System.out.println(onto_class.getGeneralizationsToSuperclasses());
	}

	private static void updateGeneralization(Model model, GeneralizationAdapter uml_gen) {
		Generalization onto_gen = (Generalization) model.getElementByName(uml_gen.getPrefixedId());
//		onto_gen.setSuperclass((OntoUMLClass) model.getElementByName(uml_gen.getSuperclass().getPrefixedId()));
//		onto_gen.setSubclass((OntoUMLClass) model.getElementByName(uml_gen.getSubclass().getPrefixedId()));
		System.out.println(onto_gen);
//		System.out.println(onto_gen.getSuperclass());
//		System.out.println(onto_gen.getSubclass());
	}

	private static void updateGeneralizationSet(Model model, GeneralizationSetAdapter uml_gen_set) {
		GeneralizationSet onto_gen_set = (GeneralizationSet) model.getElementByName(uml_gen_set.getPrefixedId());
		for(GeneralizationAdapter uml_gen : uml_gen_set.getGeneralizations()) {
			onto_gen_set.getGeneralizations().add((Generalization) model.getElementByName(uml_gen.getPrefixedId()));
		}
		System.out.println(onto_gen_set);
		System.out.println(onto_gen_set.getGeneralizations());
	}
	
}
