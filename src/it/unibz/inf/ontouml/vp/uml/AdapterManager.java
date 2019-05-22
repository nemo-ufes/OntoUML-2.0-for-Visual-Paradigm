package it.unibz.inf.ontouml.vp.uml;

import com.vp.plugin.model.IAssociation;
import com.vp.plugin.model.IAssociationClass;
import com.vp.plugin.model.IClass;
import com.vp.plugin.model.IGeneralization;
import com.vp.plugin.model.IGeneralizationSet;
import com.vp.plugin.model.IGenericConnector;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.factory.IModelElementFactory;

public class AdapterManager {

	public static ModelElementAdapter getApater(IModelElement adaptee) {
		switch (adaptee.getModelType()) {
		case IModelElementFactory.MODEL_TYPE_CLASS:
			return new ClassAdapter((IClass) adaptee);
		case IModelElementFactory.MODEL_TYPE_ASSOCIATION:
			return new AssociationAdapter((IAssociation) adaptee);
		case IModelElementFactory.MODEL_TYPE_ASSOCIATION_CLASS:
			return new AssociationClassAdapter((IAssociationClass) adaptee);
//		case IModelElementFactory.MODEL_TYPE_GENERIC_CONNECTOR:
//			return new GenericConnectorAdapter((IGenericConnector) adaptee);
		case IModelElementFactory.MODEL_TYPE_GENERALIZATION:
			return new GeneralizationAdapter((IGeneralization) adaptee);
		case IModelElementFactory.MODEL_TYPE_GENERALIZATION_SET:
			return new GeneralizationSetAdapter((IGeneralizationSet) adaptee);
		default:
			return null;
		}
	}
	
}
