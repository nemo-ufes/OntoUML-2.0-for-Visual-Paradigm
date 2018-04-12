package it.unibz.inf.ontouml.vp.uml;

import java.util.HashMap;
import java.util.Iterator;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.factory.IModelElementFactory;

public class ModelAccess {
	
	private static HashMap<String, ModelElementAdapter> vpModel = null;
	
	public static ModelElementAdapter getAdapter(String id) {
		if(isModelAlive())	return vpModel.get(id);
		return null;
	}
	
	public static void loadModel() {
		clearModel();
		String[] m_types = {IModelElementFactory.MODEL_TYPE_CLASS, IModelElementFactory.MODEL_TYPE_GENERALIZATION, IModelElementFactory.MODEL_TYPE_GENERALIZATION_SET};
		Iterator<IModelElement> iter = ApplicationManager.instance().getProjectManager().getProject().allLevelModelElementIterator(m_types);
		while(iter.hasNext()) {
			ModelElementAdapter e = AdapterManager.getApater(iter.next());
			vpModel.put(e.getId(), e);
		}
	}

	private static void clearModel() {
		if(isModelAlive())	vpModel.clear();
		else					vpModel = new HashMap<String, ModelElementAdapter>();
	}

	private static boolean isModelAlive() {
		return vpModel!=null;
	}
	
	

}
