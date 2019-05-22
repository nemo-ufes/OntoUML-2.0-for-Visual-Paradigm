package it.unibz.inf.ontouml.vp.uml;

import com.vp.plugin.model.IAssociationClass;

public class AssociationClassAdapter extends ModelElementAdapter {

	AssociationClassAdapter(IAssociationClass association) {
		super(association);
	}
	
	@Override
	protected IAssociationClass getInstance() {
		return (IAssociationClass) super.getInstance();
	}
	
	public ModelElementAdapter getFrom() {
		return AdapterManager.getApater(getInstance().getFrom());
	}

	public ModelElementAdapter getTo() {
		return AdapterManager.getApater(getInstance().getTo());
	}

}
