package it.unibz.inf.ontouml.vp.utils;

import java.util.HashSet;
import java.util.Set;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.ProjectManager;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.IProject;
import com.vp.plugin.model.IStereotype;
import com.vp.plugin.model.factory.IModelElementFactory;

public class StereotypeUtils {
	
	/* TODO Verify existence of OntoUML stereotypes within the workspace scope and fire a warning */
	
	/* OntoUML Class Stereotypes for Endurant Types */
	public static final String STR_KIND = "kind";
	public static final String STR_RELATOR_KIND = "relatorKind";
	public static final String STR_MODE_KIND = "modeKind";
	public static final String STR_QUALITY_KIND = "qualityKind";
	
	public static final String STR_SUBKIND = "subkind";
	public static final String STR_ROLE = "role";
	public static final String STR_PHASE = "phase";
	
	public static final String STR_CATEGORY = "category";
	public static final String STR_MIXIN = "mixin";
	public static final String STR_ROLE_MIXIN = "roleMixin";
	public static final String STR_PHASE_MIXIN = "phaseMixin";
	
	/* OntoUML Association Stereotypes for Relation Types */
	public static final String STR_DESCRIPTIVE = "descriptive";
	public static final String STR_NON_DESCRIPTIVE = "non-descriptive";
	public static final String STR_INVOLVEMENT = "involvement";
	public static final String STR_INHERENCE = "inherence";
	public static final String STR_DEPENDENCE = "dependence";
	

	public static void setUpOntoUMLStereotypes() {
		System.out.println("Checking stereotypes...");
		
		final Set<String> class_stereotypes = getOntoUMLClassStereotypeNames();
		
		class_stereotypes.removeAll(getInstalledClassStereotypeNames());
		for(String missing_str_name : class_stereotypes) {
			System.out.println("Generating stereotype «"+missing_str_name+"».");
			final IStereotype s = IModelElementFactory.instance().createStereotype();
			s.setName(missing_str_name);
			s.setBaseType(IModelElementFactory.MODEL_TYPE_CLASS);
		}
		
		final Set<String> association_stereotypes = getOntoUMLAssociationStereotypeNames();
		
		association_stereotypes.removeAll(getInstalledAssociationStereotypeNames());
		for(String missing_str_name : association_stereotypes) {
			System.out.println("Generating stereotype «"+missing_str_name+"».");
			final IStereotype s = IModelElementFactory.instance().createStereotype();
			s.setName(missing_str_name);
			s.setBaseType(IModelElementFactory.MODEL_TYPE_ASSOCIATION);
		}
		
		System.out.println("All OntoUML stereotypes are available.");
	}

	public static Set<IStereotype> getInstalledClassStereotypes() {
		final Set<IStereotype> class_strs = new HashSet<IStereotype>();
		final ProjectManager pm =ApplicationManager.instance().getProjectManager(); 
		final IProject p = pm.getProject();
		final IModelElement[] all_strs = pm.getSelectableStereotypesForModelType(IModelElementFactory.MODEL_TYPE_CLASS,
				p, true);

		for (IModelElement str : all_strs) {
			class_strs.add((IStereotype) str);
		}
		
		return class_strs;
	}
	
	public static Set<IStereotype> getInstalledAssociationStereotypes() {
		final Set<IStereotype> association_strs = new HashSet<IStereotype>();
		final ProjectManager pm =ApplicationManager.instance().getProjectManager(); 
		final IProject p = pm.getProject();
		final IModelElement[] all_strs = pm.getSelectableStereotypesForModelType(IModelElementFactory.MODEL_TYPE_ASSOCIATION,
				p, true);
		
		for (IModelElement str : all_strs) {
			association_strs.add((IStereotype) str);
		}
		
		return association_strs;
	}
	
	public static Set<String> getInstalledClassStereotypeNames() {
		final Set<String> installed_strs = new HashSet<String>();
	
		for (IStereotype class_str : getInstalledClassStereotypes()) {
			installed_strs.add(class_str.getName());
		}
		
		return installed_strs;
	}
	
	public static Set<String> getInstalledAssociationStereotypeNames() {
		final Set<String> installed_strs = new HashSet<String>();
	
		for (IStereotype association_str : getInstalledAssociationStereotypes()) {
			installed_strs.add(association_str.getName());
		}
		
		return installed_strs;
	}
	
	public static IStereotype getStereotype(String name, String baseType) {
		for (IStereotype str : getInstalledClassStereotypes())
			if (str.getName().equals(name) && str.getBaseType().equals(baseType))
				return str;
		return null;
	}
	
	public static Set<String> getOntoUMLClassStereotypeNames() {
		final Set<String> str_names = new HashSet<String>();
		
		str_names.add(STR_KIND);
		str_names.add(STR_RELATOR_KIND);
		str_names.add(STR_MODE_KIND);
		str_names.add(STR_QUALITY_KIND);
		str_names.add(STR_SUBKIND);
		str_names.add(STR_ROLE);
		str_names.add(STR_PHASE);
		str_names.add(STR_CATEGORY);
		str_names.add(STR_MIXIN);
		str_names.add(STR_ROLE_MIXIN);
		str_names.add(STR_PHASE_MIXIN);
		
		return str_names;
	}
	
	public static Set<String> getOntoUMLAssociationStereotypeNames() {
		final Set<String> str_names = new HashSet<String>();
		
		str_names.add(STR_DESCRIPTIVE);
		str_names.add(STR_NON_DESCRIPTIVE);
		str_names.add(STR_INVOLVEMENT);
		str_names.add(STR_INHERENCE);
		str_names.add(STR_DEPENDENCE);
		
		return str_names;
	}

}
