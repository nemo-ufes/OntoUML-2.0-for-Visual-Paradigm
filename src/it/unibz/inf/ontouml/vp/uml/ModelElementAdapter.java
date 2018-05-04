package it.unibz.inf.ontouml.vp.uml;

import com.vp.plugin.model.IModelElement;

abstract public class ModelElementAdapter {

	private IModelElement instance;
	
	protected ModelElementAdapter(IModelElement adaptee) {
		instance = adaptee;
	}
	
	protected IModelElement getInstance() {
		return instance;
	}
	
	public String getId() {
		return getInstance().getId();
	}
	
	public String getPrefixedId() {
		return ('_'+getInstance().getId()).replace(".", "");
	}
	
	public String getName() {
		return getInstance().getName();
	}
	
	public String getModelType() {
		return getInstance().getModelType();
	}
	
}
