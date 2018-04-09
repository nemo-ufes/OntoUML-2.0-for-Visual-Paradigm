package it.unibz.inf.ontouml.vp;

import com.vp.plugin.VPPlugin;
import com.vp.plugin.VPPluginInfo;

import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;

public class OntoUMLPluginForVP implements VPPlugin {

	public static final String PLUGIN_ID = "it.unibz.inf.ontouml.vp";

	@Override
	public void loaded(VPPluginInfo arg0) {
		System.out.println("Loading OntoUML Plugin for VP...");
		StereotypeUtils.setUpOntoUMLStereotypes();
		System.out.println("OntoUML Plugin for VP loaded.");
	}

	@Override
	public void unloaded() {
		// TODO Auto-generated method stub

	}

}
