package it.unibz.inf.ontouml.vp.utils;

import java.util.HashSet;
import java.util.Set;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.IProject;
import com.vp.plugin.model.IStereotype;
import com.vp.plugin.model.factory.IModelElementFactory;

public class StereotypeUtils {
	
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

	public static void setUpOntoUMLStereotypes() {
		final Set<String> missing_str_names = getAllOntoUMLStereotypeNames();
		missing_str_names.removeAll(getAllStereotypeNames());
		for(String missing_str_name : missing_str_names) {
			System.out.println("Generating stereotype «"+missing_str_name+"».");
			final IStereotype s = IModelElementFactory.instance().createStereotype();
			s.setName(missing_str_name);
			s.setBaseType(IModelElementFactory.MODEL_TYPE_CLASS);
		}
	}

	public static Set<IStereotype> getAllStereotypes() {
		final IProject p = ApplicationManager.instance().getProjectManager().getProject();
		final Set<IStereotype> strs = new HashSet<IStereotype>();
		for (IModelElement str : p.toAllLevelModelElementArray(IModelElementFactory.MODEL_TYPE_STEREOTYPE)) {
			strs.add((IStereotype) str);
		}
		return strs;
	}
	
	public static Set<String> getAllStereotypeNames() {
		final Set<String> str_names = new HashSet<String>();
		for (IStereotype str : getAllStereotypes()) {
			str_names.add(str.getName());
		}
		return str_names;
	}
	
	public static IStereotype getStereotype(String name, String baseType) {
		for (IStereotype str : getAllStereotypes())
			if (str.getName().equals(name) && str.getBaseType().equals(baseType))
				return str;
		return null;
	}
	
	public static Set<String> getAllOntoUMLStereotypeNames() {
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

}
