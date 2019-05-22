package it.unibz.inf.ontouml.vp.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import com.vp.plugin.view.IDialog;

@SuppressWarnings("serial")
public class OntoUMLMenuView extends JPanel {
	
	private JCheckBox chkBoxPluginEnabled = new JCheckBox("Enable OntoUML Plug-in features.",false);
	private JButton btnSave = new JButton("Save");

	
	public boolean isPluginEnabled() {
		return chkBoxPluginEnabled.isSelected();
	}

	public void setPluginEnabled(boolean isOntoUMLPluginEnabled) {
		chkBoxPluginEnabled.setSelected(isOntoUMLPluginEnabled);
	}
	
	public void addSaveAction(ActionListener listener) {
		btnSave.addActionListener(listener);
	}


	OntoUMLMenuView(boolean isOntoUMLPluginEnabled, ActionListener saveListener) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{234, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		GridBagConstraints gbc_isOntoUMLPluginEnabled = new GridBagConstraints();
		gbc_isOntoUMLPluginEnabled.insets = new Insets(0, 0, 5, 0);
		gbc_isOntoUMLPluginEnabled.fill = GridBagConstraints.HORIZONTAL;
		gbc_isOntoUMLPluginEnabled.gridx = 0;
		gbc_isOntoUMLPluginEnabled.gridy = 0;
		setPluginEnabled(isOntoUMLPluginEnabled);
		add(chkBoxPluginEnabled, gbc_isOntoUMLPluginEnabled);
		
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.insets = new Insets(0, 0, 5, 0);
		gbc_btnSave.gridx = 0;
		gbc_btnSave.gridy = 1;
		addSaveAction(saveListener);
		add(btnSave, gbc_btnSave);
	}

	
}
