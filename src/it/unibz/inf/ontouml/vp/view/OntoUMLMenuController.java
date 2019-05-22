package it.unibz.inf.ontouml.vp.view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.vp.plugin.view.IDialog;
import com.vp.plugin.view.IDialogHandler;

import it.unibz.inf.ontouml.vp.OntoUMLPluginConfigurations;
import it.unibz.inf.ontouml.vp.OntoUMLPluginForVP;

public class OntoUMLMenuController implements IDialogHandler {
	
	//private OntoUMLPluginConfigurations configs;
	private OntoUMLMenuView view;

	public OntoUMLMenuController() {
		//configs = OntoUMLPluginForVP.getProjectConfigurations();
		view = new OntoUMLMenuView(OntoUMLPluginConfigurations.getInstance().isPluginEnabled(), new SaveConfigurationsAction());
	}
	
	@Override
	public boolean canClosed() {
		return true;
	}

	@Override
	public Component getComponent() {
		return view;
	}

	@Override
	public void prepare(IDialog arg0) {
		arg0.setSize(new Dimension(300, 300));
	}

	@Override
	public void shown() {
		// TODO Auto-generated method stub
	}
	
	private class SaveConfigurationsAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			OntoUMLPluginConfigurations.getInstance().setPluginEnabled(view.isPluginEnabled());
			OntoUMLPluginConfigurations.getInstance().saveConfigurations();
		}	
	}

}
