package it.unibz.inf.ontouml.vp.actions;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.ViewManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.view.IDialogHandler;

import it.unibz.inf.ontouml.vp.view.OntoUMLMenuController;

public class OpenOntoUMLMenuAction implements VPActionController {

	@Override
	public void performAction(VPAction arg0) {
		ViewManager vm =  ApplicationManager.instance().getViewManager();
		IDialogHandler d = new OntoUMLMenuController();
		vm.showDialog(d);
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
		
	}

}
