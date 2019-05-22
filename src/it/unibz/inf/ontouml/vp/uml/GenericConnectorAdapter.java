package it.unibz.inf.ontouml.vp.uml;

import com.vp.plugin.model.IGenericConnector;

public class GenericConnectorAdapter extends ModelElementAdapter {

	GenericConnectorAdapter(IGenericConnector association) {
		super(association);
	}
	
	@Override
	protected IGenericConnector getInstance() {
		return (IGenericConnector) super.getInstance();
	}

}
