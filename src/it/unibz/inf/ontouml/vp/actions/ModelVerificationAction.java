package it.unibz.inf.ontouml.vp.actions;

import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;

import it.unibz.inf.ontouml.vp.uml.ModelAccess;

public class ModelVerificationAction implements VPActionController {

	@Override
	public void performAction(VPAction arg0) {
		ModelAccess.loadModel();
		generateOntoUMlModel();
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub

	}

}
