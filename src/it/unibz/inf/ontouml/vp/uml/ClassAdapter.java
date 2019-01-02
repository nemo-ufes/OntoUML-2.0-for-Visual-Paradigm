package it.unibz.inf.ontouml.vp.uml;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.vp.plugin.model.IClass;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.factory.IModelElementFactory;

import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;
import it.unibz.inf.ontouml.xtext.xcore.EndurantType;

public class ClassAdapter extends ModelElementAdapter {

	ClassAdapter(IClass adaptee) {
		super(adaptee);
	}
	
	@Override
	protected IClass getInstance() {
		return (IClass) super.getInstance();
	}
	
	public Set<GeneralizationAdapter> getGeneralizationsToSubclasses() {
		Set<GeneralizationAdapter> sub_gens = new HashSet<GeneralizationAdapter>();
		@SuppressWarnings("unchecked")
		Iterator<IModelElement> iter = getInstance().fromRelationshipIterator();
		while(iter.hasNext()) {
			IModelElement e = iter.next();
			if(e.getModelType()==IModelElementFactory.MODEL_TYPE_GENERALIZATION) {
				GeneralizationAdapter g = (GeneralizationAdapter) AdapterManager.getApater(e);
				sub_gens.add(g);
//				ModelElementAdapter adap = ModelAccess.getAdapter(('_'+e.getId()).replace(".", ""));
//				if(adap!=null && adap instanceof GeneralizationAdapter) {
//					sub_gens.add((GeneralizationAdapter) adap);
//				}
			}
		}
		return sub_gens;
	}
	
	public Set<GeneralizationAdapter> getGeneralizationsToSuperclasses() {
		Set<GeneralizationAdapter> super_gens = new HashSet<GeneralizationAdapter>();
		@SuppressWarnings("unchecked")
		Iterator<IModelElement> iter = getInstance().toRelationshipIterator();
		while(iter.hasNext()) {
			IModelElement e = iter.next();
			if(e.getModelType()==IModelElementFactory.MODEL_TYPE_GENERALIZATION) {
				GeneralizationAdapter g = (GeneralizationAdapter) AdapterManager.getApater(e);
				super_gens.add(g);
//				ModelElementAdapter adap = ModelAccess.getAdapter(('_'+e.getId()).replace(".", ""));
//				if(adap!=null && adap instanceof GeneralizationAdapter) {
//					super_gens.add((GeneralizationAdapter) adap);
//				}
			}
		}
		return super_gens;
	}

	public EndurantType getOntoUMLType() {
		List<String> strs = Arrays.asList(getInstance().toStereotypeArray());
		if(strs.contains(StereotypeUtils.STR_CATEGORY))
			return EndurantType.CATEGORY;
		if(strs.contains(StereotypeUtils.STR_MIXIN))
			return EndurantType.MIXIN;
		if(strs.contains(StereotypeUtils.STR_ROLE_MIXIN))
			return EndurantType.ROLE_MIXIN;
		if(strs.contains(StereotypeUtils.STR_PHASE_MIXIN))
			return EndurantType.PHASE_MIXIN;
		if(strs.contains(StereotypeUtils.STR_KIND))
			return EndurantType.KIND;
		if(strs.contains(StereotypeUtils.STR_MODE_KIND))
			return EndurantType.MODE_KIND;
		if(strs.contains(StereotypeUtils.STR_QUALITY_KIND))
			return EndurantType.QUALITY_KIND;
		if(strs.contains(StereotypeUtils.STR_RELATOR_KIND))
			return EndurantType.RELATOR_KIND;
		if(strs.contains(StereotypeUtils.STR_SUBKIND))
			return EndurantType.SUBKIND;
		if(strs.contains(StereotypeUtils.STR_ROLE))
			return EndurantType.ROLE;
		if(strs.contains(StereotypeUtils.STR_PHASE))
			return EndurantType.PHASE;
		
		return EndurantType.NONE;
	}
	
}
