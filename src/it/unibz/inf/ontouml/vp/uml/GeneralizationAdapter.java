package it.unibz.inf.ontouml.vp.uml;

import com.vp.plugin.model.IGeneralization;

public class GeneralizationAdapter extends ModelElementAdapter {

	protected GeneralizationAdapter(IGeneralization adaptee) {
		super(adaptee);
	}

	@Override
	protected IGeneralization getInstance() {
		return (IGeneralization) super.getInstance();
	}
	
	public ModelElementAdapter getGeneric() {
		ModelElementAdapter generic = AdapterManager.getApater(getInstance().getFrom());
		return generic;
//		ModelElementAdapter superclass = ModelAccess.getAdapter(('_'+getInstance().getFrom().getId()).replace(".", ""));
//		if(superclass!=null && superclass instanceof ClassAdapter) {
//			return (ClassAdapter) superclass;
//		}
//		return null;
	}
	
	public ModelElementAdapter getSpecific() {
		ModelElementAdapter specific = AdapterManager.getApater(getInstance().getTo());
		return specific;
//		ModelElementAdapter subclass = ModelAccess.getAdapter(('_'+getInstance().getTo().getId()).replace(".", ""));
//		if(subclass!=null && subclass instanceof ClassAdapter) {
//			return (ClassAdapter) subclass;
//		}
//		return null;
	}
	
	public GeneralizationSetAdapter getGeneralizationSet() {
		return (GeneralizationSetAdapter) AdapterManager.getApater(getInstance().getGeneralizationSet());
//		return (GeneralizationSetAdapter) ModelAccess.getAdapter(('_'+getInstance().getGeneralizationSet().getId()).replace(".", ""));
	}

}
