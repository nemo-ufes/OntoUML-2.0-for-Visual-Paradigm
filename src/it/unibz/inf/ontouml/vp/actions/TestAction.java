package it.unibz.inf.ontouml.vp.actions;

import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.model.IStereotype;
import com.vp.plugin.model.factory.IModelElementFactory;

import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;

public class TestAction implements VPActionController {

	@Override
	public void performAction(VPAction arg0) {
//		createStereotype();
		deleteStereotype();
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub

	}

	private static void createStereotype() {
		final String str_name = "testStereotype";
		if(StereotypeUtils.getAllStereotypeNames().contains(str_name)) {
			System.out.println("Stereotype «"+str_name+"» already present.");
		}
		else {
			System.out.println("Stereotype «"+str_name+"» does not exist. Generating it...");
			final IStereotype s = IModelElementFactory.instance().createStereotype();
			s.setName("testStereotype");
			s.setBaseType(IModelElementFactory.MODEL_TYPE_CLASS);
			System.out.println("Stereotype generated.");
		}
	}
	
	private static void deleteStereotype() {
		final String str_name = "testStereotype";
		if(StereotypeUtils.getAllStereotypeNames().contains(str_name)) {
			System.out.println("Stereotype «"+str_name+"» present. Deleting it...");
			StereotypeUtils.getStereotype(str_name, IModelElementFactory.MODEL_TYPE_CLASS).delete();
			System.out.println("Stereotype deleted.");
		}
		else {
			System.out.println("Stereotype «"+str_name+"» does not exist.");
		}
	}
	
}
