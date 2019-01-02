package it.unibz.inf.ontouml.vp;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.VPPlugin;
import com.vp.plugin.VPPluginInfo;
import com.vp.plugin.model.IProject;

import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;

public class OntoUMLPluginForVP implements VPPlugin {

	public static final String PLUGIN_ID = "it.unibz.inf.ontouml.vp";
	public static final String PLUGIN_NAME = "OntoUML Plugin";

	@Override
	public void loaded(VPPluginInfo arg0) {
		System.out.println("Loading OntoUML Plugin for VP...");
		//StereotypeUtils.setUpOntoUMLStereotypes();
		
		ProjectValidationListenner projectListener = new ProjectValidationListenner();
		IProject project = ApplicationManager.instance().getProjectManager().getProject();
		project.addProjectListener(projectListener);
		
		System.out.println("OntoUML Plugin for VP loaded.");
	}

	@Override
	public void unloaded() {
		// TODO Auto-generated method stub

	}

}
