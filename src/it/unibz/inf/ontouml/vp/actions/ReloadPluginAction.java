package it.unibz.inf.ontouml.vp.actions;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;

import it.unibz.inf.ontouml.vp.OntoUMLPluginForVP;

public class ReloadPluginAction implements VPActionController {

	@Override
	public void performAction(VPAction arg0) {
		ApplicationManager.instance().reloadPluginClasses(OntoUMLPluginForVP.PLUGIN_ID);
		System.out.println("Plugin reloaded.");
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
	}

}
