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
	
	public ClassAdapter getSuperclass() {
		ModelElementAdapter superclass = ModelAccess.getAdapter('_'+getInstance().getFrom().getId());
		if(superclass!=null && superclass instanceof ClassAdapter) {
			return (ClassAdapter) superclass;
		}
		return null;
	}
	
	public ClassAdapter getSubclass() {
		ModelElementAdapter subclass = ModelAccess.getAdapter('_'+getInstance().getTo().getId());
		if(subclass!=null && subclass instanceof ClassAdapter) {
			return (ClassAdapter) subclass;
		}
		return null;
	}
	
	public GeneralizationSetAdapter getGeneralizationSet() {
		return (GeneralizationSetAdapter) ModelAccess.getAdapter('_'+getInstance().getGeneralizationSet().getId());
	}

}
